package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public class h extends n {
    private static int i(boolean[] zArr, int i15, int i16) {
        for (int i17 = 0; i17 < 9; i17++) {
            boolean z15 = true;
            int i18 = i15 + i17;
            if (((1 << (8 - i17)) & i16) == 0) {
                z15 = false;
            }
            zArr[i18] = z15;
        }
        return 9;
    }

    private static int j(String str, int i15) {
        int iIndexOf = 0;
        int i16 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i16;
            i16++;
            if (i16 > i15) {
                i16 = 1;
            }
        }
        return iIndexOf % 47;
    }

    static String k(String str) {
        int length = str.length();
        StringBuilder sb5 = new StringBuilder(length * 2);
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == 0) {
                sb5.append("bU");
            } else if (cCharAt <= 26) {
                sb5.append('a');
                sb5.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb5.append('b');
                sb5.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb5.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb5.append('c');
                sb5.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb5.append(cCharAt);
            } else if (cCharAt == ':') {
                sb5.append("cZ");
            } else if (cCharAt <= '?') {
                sb5.append('b');
                sb5.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb5.append("bV");
            } else if (cCharAt <= 'Z') {
                sb5.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb5.append('b');
                sb5.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb5.append("bW");
            } else if (cCharAt <= 'z') {
                sb5.append('d');
                sb5.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb5.append('b');
                sb5.append((char) (cCharAt - '+'));
            }
        }
        return sb5.toString();
    }

    @Override // ln.n
    public boolean[] d(String str) {
        String strK = k(str);
        int length = strK.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
        }
        boolean[] zArr = new boolean[((strK.length() + 4) * 9) + 1];
        int i15 = i(zArr, 0, g.f118889c);
        for (int i16 = 0; i16 < length; i16++) {
            i15 += i(zArr, i15, g.f118888b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strK.charAt(i16))]);
        }
        int iJ = j(strK, 20);
        int[] iArr = g.f118888b;
        int i17 = i15 + i(zArr, i15, iArr[iJ]);
        int i18 = i17 + i(zArr, i17, iArr[j(strK + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iJ), 15)]);
        zArr[i18 + i(zArr, i18, g.f118889c)] = true;
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.CODE_93);
    }
}
