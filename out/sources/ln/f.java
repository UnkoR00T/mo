package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends n {
    private static void i(int i15, int[] iArr) {
        for (int i16 = 0; i16 < 9; i16++) {
            int i17 = 1;
            if (((1 << (8 - i16)) & i15) != 0) {
                i17 = 2;
            }
            iArr[i16] = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    private static String j(String str) {
        int length = str.length();
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt == 0) {
                sb5.append("%U");
            } else if (cCharAt == ' ') {
                sb5.append(cCharAt);
            } else if (cCharAt == '@') {
                sb5.append("%V");
            } else if (cCharAt == '`') {
                sb5.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb5.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb5.append('$');
                sb5.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb5.append('%');
                sb5.append((char) (cCharAt + '&'));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb5.append('/');
                sb5.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb5.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb5.append('%');
                sb5.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb5.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb5.append('%');
                sb5.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb5.append('+');
                sb5.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i15) + "'");
                }
                sb5.append('%');
                sb5.append((char) (cCharAt - '+'));
            }
        }
        return sb5.toString();
    }

    @Override // ln.n
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        for (int i15 = 0; i15 < length; i15++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i15)) < 0) {
                str = j(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        i(148, iArr);
        int iB = n.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iB2 = iB + n.b(zArr, iB, iArr2, false);
        for (int i16 = 0; i16 < length; i16++) {
            i(e.f118886a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i16))], iArr);
            int iB3 = iB2 + n.b(zArr, iB2, iArr, true);
            iB2 = iB3 + n.b(zArr, iB3, iArr2, false);
        }
        i(148, iArr);
        n.b(zArr, iB2, iArr, true);
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.CODE_39);
    }
}
