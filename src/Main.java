public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,8,9,29};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
