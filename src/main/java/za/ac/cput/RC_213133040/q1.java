package za.ac.cput.RC_213133040;

/**
 * Created by student on 2015/02/13.
 */
public class q1 {

    public static float getFloat()
    {
        return 3.14f;
    }

    public static int getInt()
    {
        return 3;
    }

    public static Object getObject()
    {
        String test = "test";
        Object myObject = new Object[]{"2"};
        return myObject;
    }

    public static boolean getTrue()
    {
        return  true;
    }

    public static boolean getFalse()
    {
        return false;
    }

    public static String isNull()
    {
        String str1 = null;
        return str1;
    }

    public static int[] getArray1()
    {
        int[] array1 = {1, 2, 3,};
        return array1;
    }

    public static int[] getArray2()
    {
        int[] array2 = {1, 2, 3};
        return array2;
    }

    public static int getFail()
    {
        return 1;
    }

}
