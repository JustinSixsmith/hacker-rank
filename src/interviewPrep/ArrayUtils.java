package interviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayUtils {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;
        boolean chaotic = false;

        // Iterate through the queue from the back
        for (int i = q.size() - 1; i >= 0; i--) {
            int currentPerson = q.get(i);
            int originalPosition = i + 1;

            // Check if the person has moved more than two positions forward
            if (currentPerson - originalPosition > 2) {
                chaotic = true;
                break;
            }

            // Count the number of bribes for the current person
            for (int j = Math.max(0, currentPerson - 2); j < i; j++) {
                if (q.get(j) > currentPerson) {
                    totalBribes++;
                }
            }
        }

        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }
    }


//    public static void minimumBribes(List<Integer> q) {
//
//        // Create map that holds number of bribes for each number
//        Map<Integer, Integer> bribes = new HashMap<>();
//        for (Integer num : q) {
//            bribes.put(num, 0);
//        }
//
//        // Iterate through queue and find number where value > next index value
//        for (int i = 0; i < q.size() - 1; i++) {
//            if (q.get(i) > q.get(i + 1))
//                swap(q, i, i + 1, bribes);
//        }
//
//        int totalBribes = 0;
//        for (var bribe : bribes.values()) {
//            if (bribe > 2)
//                System.out.println("Too chaotic");
//            totalBribes += bribe;
//        }
//
//        System.out.println(totalBribes);
//    }
//
//    private static void swap(List<Integer> q, int pos1, int pos2, Map<Integer, Integer> bribes) {
//        int temp = q.get(pos1);
//        q.set(pos1, q.get(pos2));
//        q.set(pos2, temp);
//        bribes.putIfAbsent(pos1, 0);
//        bribes.putIfAbsent(pos2, 0);
//        bribes.replace(pos1, bribes.get(pos1) + 1);
//        if (bribes.get(pos2) > 0)
//            bribes.replace(pos2, bribes.get(pos2) - 1);
//    }

    public static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                swaps++;
            } else {
                i++;
            }
        }
        return swaps;
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        int[] operations = new int[n];

        for (var query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            operations[a - 1] += k;
            if (b < operations.length)
                operations[b] -= k;
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < operations.length; i++) {
            sum += operations[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static double getHitProbability(int R, int C, int[][] G) {
        int cells = R * C;

        int sum = 0;
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                sum += G[i][j];

        return (double) sum / cells;
    }


    public static long maxAdditionalDiners(long N, long K, long M, long[] S) {
        Arrays.sort(S);

        long newDiners = 0;
        long spaceNeeded = K + 1;

        // Check seats to the left
        long leftSeats = S[0] - 1;
        newDiners += leftSeats / spaceNeeded;

        // Check seats to the right
        long rightSeats = N - S[(int) (M - 1)];
        newDiners += rightSeats / spaceNeeded;

        // Find open seating between existing diners
        long firstDiner = 2 * K + 1;
        for (int i = 0; i < M - 1; i++) {
            long seatsBetween = (S[i + 1] - S[i]) - 1;
            if (seatsBetween >= firstDiner) {
                newDiners++;
                seatsBetween -= firstDiner;
                if (seatsBetween >= spaceNeeded)
                    newDiners += seatsBetween / spaceNeeded;
            }
        }

        return newDiners;
    }


    public static int getArtisticPhotographCount(int N, String C, int X, int Y) {
        // Write your code here
        int count = 0;

        for (int actor = 1; actor < N - 1; actor++) {
            if (C.charAt(actor) != 'A')
                continue;


            for (int photographer = actor - 1; photographer >= Math.max(0, actor - Y); photographer--) {
                if (C.charAt(photographer) == 'P') {
                    for (int backdrop = actor + 1; backdrop <= Math.min(N - 1, actor + Y); backdrop++) {
                        if (C.charAt(backdrop) == 'B') {
                            int photographerToActor = actor - photographer;
                            int actorToBackdrop = backdrop - actor;

                            if (photographerToActor >= X && photographerToActor <= Y &&
                                    actorToBackdrop >= X && actorToBackdrop <= Y) {
                                count++;
                            }
                        }
                    }
                } else if (C.charAt(photographer) == 'B') {
                    for (int backdrop = actor + 1; backdrop <= Math.min(N - 1, actor + Y); backdrop++) {
                        if (C.charAt(backdrop) == 'P') {
                            int photographerToActor = actor - photographer;
                            int actorToBackdrop = backdrop - actor;

                            if (photographerToActor >= X && photographerToActor <= Y &&
                                    actorToBackdrop >= X && actorToBackdrop <= Y) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}


