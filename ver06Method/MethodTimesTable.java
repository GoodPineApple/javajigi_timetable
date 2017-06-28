package timesTable.ver06Method;

/**
 * Created by taemi on 2017-06-28.
 */
public class MethodTimesTable {

    public static int[] genArray(int num){
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = num * (i+1);
        }
        return array;
    }

    public static void print(int[] times){
        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }
    }

    public static void main(String[] args) {
        for(int i=2; i<9; i++){
            print(genArray((i)));
        }
    }

}
