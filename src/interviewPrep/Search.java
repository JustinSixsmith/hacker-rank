package interviewPrep;

import java.util.*;

public class Search {

    public static void whatFlavors(List<Integer> cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cost.size(); i++) {
            int complement = money - cost.get(i);

            // If the complement (money left after buying current flavor) exists in the map,
            // then we've found our two flavors.
            if (map.containsKey(complement)) {
                // Ensure smaller index is printed first
                System.out.println(map.get(complement) + 1 + " " + (i + 1));
                return;
            }

            // If the complement doesn't exist in the map, add the current cost and its index.
            map.put(cost.get(i), i);
        }
    }

    public static int pairs(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;

        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }

    public static long triplets(int[] a, int[] b, int[] c) {
        a = Arrays.stream(a).distinct().sorted().toArray();
        b = Arrays.stream(b).distinct().sorted().toArray();
        c = Arrays.stream(c).distinct().sorted().toArray();

        long result = 0;
        long aIndex = 0, cIndex = 0;

        for (int value : b) {
            while (aIndex < a.length && a[(int) aIndex] <= value) {
                aIndex++;
            }
            while (cIndex < c.length && c[(int) cIndex] <= value) {
                cIndex++;
            }
            result += aIndex * cIndex;
        }

        return result;
    }

    public static long minTime(long[] machines, long goal) {
        // Sort machines to find minimum and maximum time machines
        Arrays.sort(machines);

        // Establish bounds for binary search
        long low = machines[0]; // minimum time possible
        long high = machines[machines.length - 1] * goal; // maximum time possible

        // Apply binary search on the time
        while (low < high) {
            long mid = (low + high) / 2;
            long itemsProduced = getItemsProduced(machines, mid);

            if (itemsProduced < goal) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static long getItemsProduced(long[] machines, long days) {
        long total = 0;
        for (long machine : machines) {
            total += days / machine;
        }
        return total;
    }

    import java.util.*;

    public static long maximumSum(List<Long> a, long m) {
        TreeSet<Long> prefix = new TreeSet<>();
        long currentSum = 0;
        long result = 0;

        for (int i = 0; i < a.size(); i++) {
            currentSum = (currentSum + a.get(i)) % m;
            result = Math.max(result, currentSum); // consider the prefix sum itself

            Long higher = prefix.ceiling(currentSum + 1);
            if (higher != null) {
                result = Math.max(result, (currentSum - higher + m) % m);
            }

            prefix.add(currentSum);
        }

        return result;
    }

    public static long minimumPasses(long m, long w, long p, long n) {
        long candies = 0;
        long passes = 0;
        long minPasses = Long.MAX_VALUE;
        long spent = 0;

        while (spent + candies < n) {
            // Increment the passes counter and make candies
            passes++;
            candies += m * w;

            // Update the minimum passes if we can reach the target now
            long curPasses = passes + (n - (spent + candies)) / (m * w);
            if (candies + spent >= n) {
                curPasses = Math.min(curPasses, passes);
            }
            minPasses = Math.min(minPasses, curPasses);

            if (candies + spent >= n) {
                break;
            }

            // Decide whether to buy a new machine or a new worker or both
            long numNewWorkersOrMachines = candies / p;
            if (numNewWorkersOrMachines == 0) {
                // Skip to the next iteration if we can't afford a new machine or worker
                continue;
            }

            // Subtract the spent candies
            candies -= p * numNewWorkersOrMachines;

            // Make the decision to optimize the future production of candies
            long total = m + w;
            long newTotal = total + numNewWorkersOrMachines;
            long half = newTotal / 2;
            if (m > w) {
                w = Math.max(m, half);
                m = newTotal - w;
            } else {
                m = Math.max(w, half);
                w = newTotal - m;
            }
        }
        return minPasses;
    }


}
