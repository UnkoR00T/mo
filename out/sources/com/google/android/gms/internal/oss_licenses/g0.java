package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {
    public static void a(boolean z15) {
        if (!z15) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z15, Object obj) {
        if (!z15) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static int c(int i15, int i16, String str) {
        String strA;
        if (i15 >= 0 && i15 < i16) {
            return i15;
        }
        if (i15 < 0) {
            strA = h0.a("%s (%s) must not be negative", "index", Integer.valueOf(i15));
        } else {
            if (i16 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 15);
                sb5.append("negative size: ");
                sb5.append(i16);
                throw new IllegalArgumentException(sb5.toString());
            }
            strA = h0.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int d(int i15, int i16, String str) {
        if (i15 < 0 || i15 > i16) {
            throw new IndexOutOfBoundsException(f(i15, i16, "index"));
        }
        return i15;
    }

    public static void e(int i15, int i16, int i17) {
        String strF;
        if (i15 < 0 || i16 < i15 || i16 > i17) {
            if (i15 < 0 || i15 > i17) {
                strF = f(i15, i17, "start index");
            } else {
                strF = (i16 < 0 || i16 > i17) ? f(i16, i17, "end index") : h0.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i16), Integer.valueOf(i15));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    private static String f(int i15, int i16, String str) {
        if (i15 < 0) {
            return h0.a("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return h0.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 15);
        sb5.append("negative size: ");
        sb5.append(i16);
        throw new IllegalArgumentException(sb5.toString());
    }
}
