package ln;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends q {
    @Override // ln.n
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (en.d e15) {
                throw new IllegalArgumentException(e15);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
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
        boolean[] zArr = new boolean[67];
        int iB = n.b(zArr, 0, p.f118896a, true);
        for (int i15 = 0; i15 <= 3; i15++) {
            iB += n.b(zArr, iB, p.f118899d[Character.digit(str.charAt(i15), 10)], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f118897b, false);
        for (int i16 = 4; i16 <= 7; i16++) {
            iB2 += n.b(zArr, iB2, p.f118899d[Character.digit(str.charAt(i16), 10)], true);
        }
        n.b(zArr, iB2, p.f118896a, true);
        return zArr;
    }

    @Override // ln.n
    protected Collection<en.a> g() {
        return Collections.singleton(en.a.EAN_8);
    }
}
