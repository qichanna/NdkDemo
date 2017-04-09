package home.liqi.ndkdemo;

/**
 * Created by liqi on 2017/4/8.
 */

public class NativeMethods {
    public static native String printInfo();
//    public static native String[] getStrings(int count, String sample);
    static {
        System.loadLibrary("jniMethods");   //defaultConfig.ndk.moduleName
    }
}
