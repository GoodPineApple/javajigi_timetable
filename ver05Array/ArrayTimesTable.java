package timesTable.ver05Array;

/**
 * Created by taemi on 2017-06-28.
 */
public class ArrayTimesTable {
    public static void main(String[] args) {
        for (int j = 2; j <10 ; j++) {
            int[] times = new int[9];
            for(int i=0; i<times.length; i++){
                times[i] = j * (i+1);
            }
            for (int i = 0; i <times.length ; i++) {
                System.out.println(times[i]);
            }
        }

    }
}
