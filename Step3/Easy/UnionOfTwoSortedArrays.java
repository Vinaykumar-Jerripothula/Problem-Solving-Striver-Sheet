import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static void union(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> al = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }
                i++;
            } else {
                if (al.size() == 0 || 
                al.get(al.size() - 1) != arr2[j]) {
                    al.add(arr2[j]);
                }
                j++;

            }
        }
        while (j < n2) {
            if (al.size() == 0 || al.get(al.size()-1) != arr2[j]) {
                al.add(arr2[j]);
            }
            j++;
        }
        while (i < n1) {
            if (al.size() == 0 || al.get(al.size() - 1) != arr1[i]) {
                al.add(arr1[i]);
            }
            i++;
        }

        System.out.print("Union  : ");
        for(int k : al) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        union(arr1, arr2);

    }
}
