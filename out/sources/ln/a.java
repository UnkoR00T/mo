package ln;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char[] f118860a = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f118861b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f118862c = {'A', 'B', 'C', 'D'};

    static boolean a(char[] cArr, char c15) {
        if (cArr != null) {
            for (char c16 : cArr) {
                if (c16 == c15) {
                    return true;
                }
            }
        }
        return false;
    }
}
