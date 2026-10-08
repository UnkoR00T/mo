package kn;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class b implements g {
    b() {
    }

    private static char c(char c15, int i15) {
        int i16 = c15 + ((i15 * 149) % GF2Field.MASK) + 1;
        return i16 <= 255 ? (char) i16 : (char) (i16 - 256);
    }

    @Override // kn.g
    public void a(h hVar) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append((char) 0);
        while (hVar.i()) {
            sb5.append(hVar.c());
            hVar.f111469f++;
            if (j.n(hVar.d(), hVar.f111469f, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb5.length() - 1;
        int iA = hVar.a() + length + 1;
        hVar.q(iA);
        boolean z15 = hVar.g().a() - iA > 0;
        if (hVar.i() || z15) {
            if (length <= 249) {
                sb5.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: " + length);
                }
                sb5.setCharAt(0, (char) ((length / 250) + 249));
                sb5.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb5.length();
        for (int i15 = 0; i15 < length2; i15++) {
            hVar.r(c(sb5.charAt(i15), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
