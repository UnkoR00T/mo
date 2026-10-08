package kh;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static int a(int i15) {
        boolean z15 = true;
        if (i15 != 100 && i15 != 102 && i15 != 104) {
            if (i15 == 105) {
                i15 = 105;
            } else {
                z15 = false;
            }
        }
        jg.s.c(z15, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i15));
        return i15;
    }

    public static String b(int i15) {
        if (i15 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i15 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i15 == 104) {
            return "LOW_POWER";
        }
        if (i15 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
