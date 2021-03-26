public class Matika {
    private static final boolean[] mapa = {
            true, false, true, true, true, true, true, true, true, false, false, false, true, true, true, false, true, true, true, false, true, false, true, false, false, false, false, false, false, true, true, false, false, false, false, false, true, false, true, true, false, true, true, false, true, true, false, false, true, true, true, false, true, true, true, true, true, true, true, true, true, true, false, false, true, true, true, false, false, true, true, true, false, false, false, true, true, false, true, false, false, false, true, false, false, false, false, true, false, false, false, true, false, true, true, false, false, false, false, false, false, false, false, true, false, false, true, false, true, false, true, true, true, false, true, true, false, true, true, true, false, true, true, true, false, false, true, true, true, true, false, true, true, true, false, true, true, false, true, true, true, false, true, false, true, false, false, false, false, true, true, false, false, false, true, true, true, false, false, true, true, true, false, false, true, true, false, false, true, false, false, false, false, false, true, true, true, false, true, true, true, false, false, false, false, false, true, false, false, false, true, false, false, true, true, false, false, false, true, false, true, true, true, true, true, false, true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false, false, true, false, true, true, true, true, true, true, false, false, false, false, false, false, false, true, false, false, true, false, true, true, false, true, false, false, false, false, true, true, true, false, false, false, false, false, false, true, false, true, false, true, true, true, false, true, false, true, true, true, true, false, false, true, false, true, true, true, true, false, false, true, true, true, true, false, true, true, false, true, false, true, false, true, false, true, true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, true, false, true, false, false, true, false, true, true, false, true, false, true, false, false, true, true, true, true, false, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, false, true, false, false, true, false, true, true, false, true, true, false, true, false, true, false, true, false, true, false, true, false, true, true, true, false, false, false, false, false, true, true, true, false, true, false, false, true, true, true, true, false, false, false, true, false, true, true, true, false, true, false, false, false, false, true, true, true, false, false, true, false, true, false, true, false, false, false, false, true, true, true, true, true, true, false, false, false, false, false, true, true, false, false, true, true, false, true, false, true, true, false, true, false, true, false, true, true, false, true, true, false, false, true, false, false, true, true, true, true, false, true, false, true, true, false, false, true, true, true, false, false, false, true, true, false, true, false, false, true, true, false, true, true, false, false, true, false, false, true, false, true, false, false, false, false, true, true, false, true, true, false, true, true, false, false, true, false, false, true, false, true, true, false, false, true, true, false, false, true, false, true, true, true, true, false, true, false, false, true, false, false, true, false, false, false, true, false, true, true, true, true, false, true, true, true, false, false, true, true, true, false, false, false, true, true, true, false, true, true, false, true, true, false, false, true, true, false, true, false, true, false, false, true, false, false, true, true, true, false, true, true, true, false, false, false, true, false, true, false, true, true, false, false, true, true, false, false, true, false, true, false, false, true, false, false, false, false, false, false, false, false, true, true, true, false, true, false, true, false, true, false, true, true, true, false, true, false, true, true, true, false, true, true, true, true, false, true, true, true, true, false, false, false, true, false, true, true, false, false, true, false, true, false, false, false, true, false, false, true, true, false, false, false, false, true, false, true, false, false, true, true, false, false, true, false, false, true, true, false, true, false, true, true, false, false, true, true, false, true, true, true, false, false, true, true, false, true, true, true, false, true, true, false, true, true, false, false, true, false, true, false, false, true, true, true, true, false, false, true, false, true, true, false, true, false, false, false, false, true, false, false, true, false, false, true, true, false, true, false, true, false, true, true, false, false, true, false, false, true, false, false, true, false, true, true, false, false, true, true, false, true, true, false, false, false, true, false, false, false, true, false, false, false, false, true, true, false, false, true, true, true, true, false, false, true, true, true, true, false, false, true, false, true, true, false, true, false, true, true, true, false, true, true, true, true, false, false, true, true, false, true, false, false, false, false, true, false, false, false, false, true, false, true, false, false, true, true, true, false, false, false, true, false, false, false, true, true, true, false, false, true, true, true, true, false, false, false, true, true, true, true, false, true, false, false, false, false, false, false, false, true, true, true, false, false, true, false, false, false, true, true, false, false, true, true, true, true, true, false, false, true, false, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true
    };

    public static float[] vertici() {
        float[] returned = new float[2883]; //2883
        float x;
        float y = 1;
        int count = 0;
        for (int i = 0; i < 31; i++) {
            x = -1;
            for (int j = 0; j < 31; j++) {
                returned[count] = x;
                returned[count + 1] = y;
                returned[count + 2] = 0;
                count += 3;
                x = x + 2 / 30f;
            }
            y = y - 2 / 30f;
        }
        return returned;
    }

    public static int[] indici() {
        int xx = -1;
        int yy = 30;
        int pos = -1;
        int mappos = 0;
        int[] returned = new int[5400];
        for (int j = 0; j < 29; j++) {
            yy++;
            xx++;
            for (int i = 0; i < 30; i++) {
                if (mapa[mappos]) {

                    returned[++pos] = xx;
                    returned[++pos] = ++xx;
                    returned[++pos] = yy;

                    returned[++pos] = yy;
                    returned[++pos] = xx;
                    returned[++pos] = ++yy;
                } else {
                    xx++;
                    yy++;
                }
                mappos++;
            }

        }
        xx++;
        yy++;
        for (int i = 0; i < 30; i++) {
            if (mapa[mappos]) {
                returned[++pos] = yy;
                returned[++pos] = xx;
                returned[++pos] = ++yy;

                returned[++pos] = xx;
                returned[++pos] = ++xx;
                returned[++pos] = yy;


            } else {
                xx++;
                yy++;
            }
            mappos++;
        }
        return returned;
    }
}
