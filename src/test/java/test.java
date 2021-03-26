import java.util.Arrays;

public class test {
    public static void main(String[] Args){
        float[] returned = new float[2883]; //2883
        float x;
        float y = 1-0.0666666666666666666666666666666f;
        int count = 0;
        for (int i = 0; i < 31; i++) {
            x = -1;
            for (int j = 0; j < 31; j++) {
                returned[count++] = x;
                returned[count++] = y;
                returned[count++] = 0;
                x = x + 0.0666666666666666666666666666666f;
            }
            y = y - 0.0666666666666666666666666666666f;
        }
        System.out.println(Arrays.toString(returned));
    }
}
