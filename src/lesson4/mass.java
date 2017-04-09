package lesson4;

/**
 * Created by Администратор on 26.03.2017.
 */
//public class mass {
//    public static void main(String[] args) {
//        int SIZE = 10;
//        String[][] graph = new String[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                graph[i][j] = "(i=" + i + ", j=" + j + ")";
//            }
//        }
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(graph[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
//        int[] a = {13, 3, 5, 1, 8, 0, 1};
//
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < a.length; i++) {
//            int min = a[i];
//            int imin = i;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] > min) {
//                    min = a[j];
//                    imin = j;
//                }
//            }
//            if (i != imin) {
//                int temp = a[i];
//                a[i] = a[imin];
//                a[imin] = temp;
//            }
//        }
//        for (
//                int i = 0;
//                i < a.length; i++)
//
//        {
//            System.out.print(a[i] + " ");
//        }
//    }for (int i = a.length - 1; i >= 2; i--) {
//        boolean sorted = true;
//        for (int j = 0; j < i; j++) {
//            if (a[j] > a[j + 1]) { int temp = a[j]; a[j] = a[j + 1];
//            a[j + 1] = temp;
//            sorted = false; } }
//        }if (sorted) { break; } }
//        System.out.println("\nРезультат после сортировки методом пузырька");
//for (int i = 0; i < a.length; i++) { System.out.print(a[i] + " "); }
//    }
//}