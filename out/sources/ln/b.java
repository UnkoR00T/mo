package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f118863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f118864c = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f118865d = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f118866e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f118863b = cArr;
        f118866e = cArr[0];
    }

    @Override // ln.n
    public boolean[] d(String str) {
        int i15;
        if (str.length() < 2) {
            StringBuilder sb5 = new StringBuilder();
            char c15 = f118866e;
            sb5.append(c15);
            sb5.append(str);
            sb5.append(c15);
            str = sb5.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f118863b;
            boolean zA = a.a(cArr, upperCase);
            boolean zA2 = a.a(cArr, upperCase2);
            char[] cArr2 = f118864c;
            boolean zA3 = a.a(cArr2, upperCase);
            boolean zA4 = a.a(cArr2, upperCase2);
            if (zA) {
                if (!zA2) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
                StringBuilder sb6 = new StringBuilder();
                char c16 = f118866e;
                sb6.append(c16);
                sb6.append(str);
                sb6.append(c16);
                str = sb6.toString();
            } else if (!zA4) {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            }
        }
        int i16 = 20;
        for (int i17 = 1; i17 < str.length() - 1; i17++) {
            if (Character.isDigit(str.charAt(i17)) || str.charAt(i17) == '-' || str.charAt(i17) == '$') {
                i16 += 9;
            } else {
                if (!a.a(f118865d, str.charAt(i17))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i17) + '\'');
                }
                i16 += 10;
            }
        }
        boolean[] zArr = new boolean[i16 + (str.length() - 1)];
        int i18 = 0;
        for (int i19 = 0; i19 < str.length(); i19++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i19));
            if (i19 == 0 || i19 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i25 = 0;
            while (true) {
                char[] cArr3 = a.f118860a;
                if (i25 >= cArr3.length) {
                    i15 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i25]) {
                    i15 = a.f118861b[i25];
                    break;
                }
                i25++;
            }
            int i26 = 0;
            int i27 = 0;
            boolean z15 = true;
            while (i26 < 7) {
                zArr[i18] = z15;
                i18++;
                if (((i15 >> (6 - i26)) & 1) == 0 || i27 == 1) {
                    z15 = !z15;
                    i26++;
                    i27 = 0;
                } else {
                    i27++;
                }
            }
            if (i19 < str.length() - 1) {
                zArr[i18] = false;
                i18++;
            }
        }
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.CODABAR);
    }
}
