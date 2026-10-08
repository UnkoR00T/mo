package kn;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class f implements g {
    f() {
    }

    private static void b(char c15, StringBuilder sb5) {
        if (c15 >= ' ' && c15 <= '?') {
            sb5.append(c15);
        } else if (c15 < '@' || c15 > '^') {
            j.e(c15);
        } else {
            sb5.append((char) (c15 - '@'));
        }
    }

    private static String c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c15 = (char) ((iCharAt >> 16) & GF2Field.MASK);
        char c16 = (char) ((iCharAt >> 8) & GF2Field.MASK);
        char c17 = (char) (iCharAt & GF2Field.MASK);
        StringBuilder sb5 = new StringBuilder(3);
        sb5.append(c15);
        if (length >= 2) {
            sb5.append(c16);
        }
        if (length >= 3) {
            sb5.append(c17);
        }
        return sb5.toString();
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                hVar.o(0);
                return;
            }
            boolean z15 = true;
            if (length == 1) {
                hVar.p();
                int iA = hVar.g().a() - hVar.a();
                int iF = hVar.f();
                if (iF > iA) {
                    hVar.q(hVar.a() + 1);
                    iA = hVar.g().a() - hVar.a();
                }
                if (iF <= iA && iA <= 2) {
                    hVar.o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i15 = length - 1;
            String strC = c(charSequence);
            if (hVar.i() || i15 > 2) {
                z15 = false;
            }
            if (i15 <= 2) {
                hVar.q(hVar.a() + i15);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + strC.length());
                    z15 = false;
                }
            }
            if (z15) {
                hVar.k();
                hVar.f111469f -= i15;
            } else {
                hVar.s(strC);
            }
            hVar.o(0);
        } catch (Throwable th4) {
            hVar.o(0);
            throw th4;
        }
    }

    @Override // kn.g
    public void a(h hVar) {
        StringBuilder sb5 = new StringBuilder();
        while (hVar.i()) {
            b(hVar.c(), sb5);
            hVar.f111469f++;
            if (sb5.length() >= 4) {
                hVar.s(c(sb5));
                sb5.delete(0, 4);
                if (j.n(hVar.d(), hVar.f111469f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb5.append((char) 31);
        e(hVar, sb5);
    }

    public int d() {
        return 4;
    }
}
