package xg;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public static void a(boolean z15) {
        if (!z15) {
            throw new IllegalStateException();
        }
    }

    public static int b(int i15, int i16, String str) {
        String strA;
        if (i15 >= 0 && i15 < i16) {
            return i15;
        }
        if (i15 < 0) {
            strA = u.a("%s (%s) must not be negative", "index", Integer.valueOf(i15));
        } else {
            if (i16 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 15);
                sb5.append("negative size: ");
                sb5.append(i16);
                throw new IllegalArgumentException(sb5.toString());
            }
            strA = u.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i15), Integer.valueOf(i16));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int c(int i15, int i16, String str) {
        if (i15 < 0 || i15 > i16) {
            throw new IndexOutOfBoundsException(e(i15, i16, "index"));
        }
        return i15;
    }

    public static void d(int i15, int i16, int i17) {
        String strE;
        if (i15 < 0 || i16 < i15 || i16 > i17) {
            if (i15 < 0 || i15 > i17) {
                strE = e(i15, i17, "start index");
            } else {
                strE = (i16 < 0 || i16 > i17) ? e(i16, i17, "end index") : u.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i16), Integer.valueOf(i15));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    private static String e(int i15, int i16, String str) {
        if (i15 < 0) {
            return u.a("%s (%s) must not be negative", str, Integer.valueOf(i15));
        }
        if (i16 >= 0) {
            return u.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i15), Integer.valueOf(i16));
        }
        StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 15);
        sb5.append("negative size: ");
        sb5.append(i16);
        throw new IllegalArgumentException(sb5.toString());
    }
}
