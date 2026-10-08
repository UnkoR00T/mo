package fr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    public static class a {
        private a() {
        }
    }

    private t() {
    }

    public static boolean a(float f15, Float f16) {
        return f16 != null && f15 == f16.floatValue();
    }

    public static boolean b(Float f15, float f16) {
        return f15 != null && f15.floatValue() == f16;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int d(int i15, int i16) {
        if (i15 < i16) {
            return -1;
        }
        return i15 == i16 ? 0 : 1;
    }

    public static int e(long j15, long j16) {
        if (j15 < j16) {
            return -1;
        }
        return j15 == j16 ? 0 : 1;
    }

    private static <T extends Throwable> T f(T t15) {
        return (T) g(t15, t.class.getName());
    }

    static <T extends Throwable> T g(T t15, String str) {
        StackTraceElement[] stackTrace = t15.getStackTrace();
        int length = stackTrace.length;
        int i15 = -1;
        for (int i16 = 0; i16 < length; i16++) {
            if (str.equals(stackTrace[i16].getClassName())) {
                i15 = i16;
            }
        }
        t15.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i15 + 1, length));
        return t15;
    }

    public static void h() {
        throw ((oq.h) f(new oq.h()));
    }
}
