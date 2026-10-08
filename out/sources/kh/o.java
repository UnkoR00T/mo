package kh;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static int a(int i15) {
        boolean z15 = true;
        if (i15 != 0 && i15 != 1) {
            if (i15 == 2) {
                i15 = 2;
            } else {
                z15 = false;
            }
        }
        jg.s.c(z15, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i15));
        return i15;
    }

    public static String b(int i15) {
        if (i15 == 0) {
            return "THROTTLE_BACKGROUND";
        }
        if (i15 == 1) {
            return "THROTTLE_ALWAYS";
        }
        if (i15 == 2) {
            return "THROTTLE_NEVER";
        }
        throw new IllegalArgumentException();
    }
}
