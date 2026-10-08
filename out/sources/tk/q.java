package tk;

import nk.t;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    @Deprecated
    public static int a() {
        Integer numA = t.a();
        if (numA != null) {
            return numA.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
