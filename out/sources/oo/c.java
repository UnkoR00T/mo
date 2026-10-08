package oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class c extends r {
    public c(byte[] bArr) {
        super(bArr);
    }

    public int n() {
        return l();
    }

    public int o() {
        return k();
    }

    public int p() throws IOException {
        int iK = k();
        if (iK >= 1 && iK <= 4) {
            return iK;
        }
        throw new IOException("Illegal (< 1 or > 4) offSize value " + iK + " in CFF font at position " + (a() - 1));
    }

    public int q(int i15) {
        int iK = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iK = (iK << 8) | k();
        }
        return iK;
    }

    public int r() {
        return l();
    }
}
