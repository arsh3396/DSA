package Array.june3;

import java.util.*;

public class GeomatricTriplates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 8, 10, 15, 16, 30, 32, 64};
        System.out.println(geomatricPrograssionCount(arr));

        List<List<Integer>> ans = geomatricPrograssionCountReturnList(arr);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static int geomatricPrograssionCount(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if ((int)Math.pow(arr[j], 2) == arr[i] * arr[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    static List<List<Integer>> geomatricPrograssionCountReturnList(int[] arr) {
        int n = arr.length;
        int count = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if ((int)Math.pow(arr[j], 2) == arr[i] * arr[k]) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        ans.add(list);
                    }
                }
            }
        }

        return ans;
    }
}
