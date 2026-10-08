package kn;

/* JADX INFO: loaded from: classes4.dex */
class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb5, StringBuilder sb6, int i15) {
        int length = sb5.length();
        sb5.delete(length - i15, length);
        hVar.f111469f--;
        int iC = c(hVar.c(), sb6);
        hVar.k();
        return iC;
    }

    private static String e(CharSequence charSequence) {
        int iCharAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    static void h(h hVar, StringBuilder sb5) {
        hVar.s(e(sb5));
        sb5.delete(0, 3);
    }

    @Override // kn.g
    public void a(h hVar) {
        StringBuilder sb5 = new StringBuilder();
        while (hVar.i()) {
            char c15 = hVar.c();
            hVar.f111469f++;
            int iC = c(c15, sb5);
            int iA = hVar.a() + ((sb5.length() / 3) * 2);
            hVar.q(iA);
            int iA2 = hVar.g().a() - iA;
            if (!hVar.i()) {
                StringBuilder sb6 = new StringBuilder();
                if (sb5.length() % 3 == 2 && iA2 != 2) {
                    iC = b(hVar, sb5, sb6, iC);
                }
                while (sb5.length() % 3 == 1 && (iC > 3 || iA2 != 1)) {
                    iC = b(hVar, sb5, sb6, iC);
                }
                break;
            }
            if (sb5.length() % 3 == 0 && j.n(hVar.d(), hVar.f111469f, f()) != f()) {
                hVar.o(0);
                break;
            }
        }
        g(hVar, sb5);
    }

    int c(char c15, StringBuilder sb5) {
        if (c15 == ' ') {
            sb5.append((char) 3);
            return 1;
        }
        if (c15 >= '0' && c15 <= '9') {
            sb5.append((char) (c15 - ','));
            return 1;
        }
        if (c15 >= 'A' && c15 <= 'Z') {
            sb5.append((char) (c15 - '3'));
            return 1;
        }
        if (c15 < ' ') {
            sb5.append((char) 0);
            sb5.append(c15);
            return 2;
        }
        if (c15 <= '/') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - '!'));
            return 2;
        }
        if (c15 <= '@') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - '+'));
            return 2;
        }
        if (c15 <= '_') {
            sb5.append((char) 1);
            sb5.append((char) (c15 - 'E'));
            return 2;
        }
        if (c15 > 127) {
            sb5.append("\u0001\u001e");
            return c((char) (c15 - 128), sb5) + 2;
        }
        sb5.append((char) 2);
        sb5.append((char) (c15 - '`'));
        return 2;
    }

    void d(h hVar) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = hVar.f111469f;
        int length = 0;
        int iC = 0;
        while (hVar.i()) {
            char c15 = hVar.c();
            hVar.f111469f++;
            iC = c(c15, sb5);
            if (sb5.length() % 3 == 0) {
                i15 = hVar.f111469f;
                length = sb5.length();
            }
        }
        if (length != sb5.length()) {
            int iA = hVar.a() + ((sb5.length() / 3) * 2) + 1;
            hVar.q(iA);
            int iA2 = hVar.g().a() - iA;
            int length2 = sb5.length() % 3;
            if ((length2 == 2 && iA2 != 2) || (length2 == 1 && (iC > 3 || iA2 != 1))) {
                sb5.setLength(length);
                hVar.f111469f = i15;
            }
        }
        if (sb5.length() > 0) {
            hVar.r((char) 230);
        }
        g(hVar, sb5);
    }

    public int f() {
        return 1;
    }

    void g(h hVar, StringBuilder sb5) {
        int length = (sb5.length() / 3) * 2;
        int length2 = sb5.length() % 3;
        int iA = hVar.a() + length;
        hVar.q(iA);
        int iA2 = hVar.g().a() - iA;
        if (length2 == 2) {
            sb5.append((char) 0);
            while (sb5.length() >= 3) {
                h(hVar, sb5);
            }
            if (hVar.i()) {
                hVar.r((char) 254);
            }
        } else if (iA2 == 1 && length2 == 1) {
            while (sb5.length() >= 3) {
                h(hVar, sb5);
            }
            if (hVar.i()) {
                hVar.r((char) 254);
            }
            hVar.f111469f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb5.length() >= 3) {
                h(hVar, sb5);
            }
            if (iA2 > 0 || hVar.i()) {
                hVar.r((char) 254);
            }
        }
        hVar.o(0);
    }
}
