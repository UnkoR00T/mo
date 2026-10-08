package bp;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final h f20955b = h.f20678g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final h f20956c = h.f20679h;

    public static k A3(String str) throws IOException {
        if (str.length() != 1) {
            if (N3(str)) {
                return new f(str);
            }
            try {
                return str.charAt(0) == '+' ? h.g4(Long.parseLong(str.substring(1))) : h.g4(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                if (((str.startsWith("+") || str.startsWith("-")) ? str.substring(1) : str).matches("[0-9]*")) {
                    return str.startsWith("-") ? h.f20683m : h.f20682l;
                }
                throw new IOException("Not a number: " + str);
            }
        }
        char cCharAt = str.charAt(0);
        if ('0' <= cCharAt && cCharAt <= '9') {
            return h.g4(((long) cCharAt) - 48);
        }
        if (cCharAt == '-' || cCharAt == '.') {
            return h.f20678g;
        }
        throw new IOException("Not a number: " + str);
    }

    private static boolean N3(String str) {
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == '.' || cCharAt == 'e') {
                return true;
            }
        }
        return false;
    }

    public abstract int J3();

    public abstract long X3();

    public abstract float i3();
}
