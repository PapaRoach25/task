package task;

public class MyTask {
    public static void doubleArray(int i){
        int d = 1;
        int temp = i*i;

        for (int j = 0; j < i ; j++) {
            for (int k = 0; k < i ; k++) {
                System.out.printf("%2d ", (temp - i * d) + 1);
                temp++;
            }
                temp = i*i;
                d++;
                System.out.println();
            }
    }
    public static void main(String[] args) {
        doubleArray(4);
    }
}
