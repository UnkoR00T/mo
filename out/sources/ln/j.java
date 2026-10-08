package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends q {
    @Override // ln.n
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (en.d e15) {
                throw new IllegalArgumentException(e15);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (en.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        n.c(str);
        int i15 = i.f118890f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = n.b(zArr, 0, p.f118896a, true);
        for (int i16 = 1; i16 <= 6; i16++) {
            int iDigit = Character.digit(str.charAt(i16), 10);
            if (((i15 >> (6 - i16)) & 1) == 1) {
                iDigit += 10;
            }
            iB += n.b(zArr, iB, p.f118900e[iDigit], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f118897b, false);
        for (int i17 = 7; i17 <= 12; i17++) {
            iB2 += n.b(zArr, iB2, p.f118899d[Character.digit(str.charAt(i17), 10)], true);
        }
        n.b(zArr, iB2, p.f118896a, true);
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.EAN_13);
    }
}
