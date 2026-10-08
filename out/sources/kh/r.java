package kh;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public static int a(int i15) {
        boolean z15 = true;
        if (i15 != 0 && i15 != 1) {
            if (i15 == 2) {
                i15 = 2;
            } else {
                z15 = false;
            }
        }
        jg.s.c(z15, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i15));
        return i15;
    }

    public static String b(int i15) {
        if (i15 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i15 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i15 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
