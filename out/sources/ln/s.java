package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends q {
    @Override // ln.n
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(r.c(str));
            } catch (en.d e15) {
                throw new IllegalArgumentException(e15);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
            }
            try {
                if (!p.a(r.c(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (en.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        n.c(str);
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i15 = r.f118902g[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iB = n.b(zArr, 0, p.f118896a, true);
        for (int i16 = 1; i16 <= 6; i16++) {
            int iDigit2 = Character.digit(str.charAt(i16), 10);
            if (((i15 >> (6 - i16)) & 1) == 1) {
                iDigit2 += 10;
            }
            iB += n.b(zArr, iB, p.f118900e[iDigit2], false);
        }
        n.b(zArr, iB, p.f118898c, false);
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.UPC_E);
    }
}
