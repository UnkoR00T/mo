package kn;

/* JADX INFO: loaded from: classes4.dex */
final class o extends c {
    o() {
    }

    @Override // kn.c, kn.g
    public void a(h hVar) {
        StringBuilder sb5 = new StringBuilder();
        while (hVar.i()) {
            char c15 = hVar.c();
            hVar.f111469f++;
            c(c15, sb5);
            if (sb5.length() % 3 == 0) {
                c.h(hVar, sb5);
                if (j.n(hVar.d(), hVar.f111469f, f()) != f()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        g(hVar, sb5);
    }

    @Override // kn.c
    int c(char c15, StringBuilder sb5) {
        if (c15 == '\r') {
            sb5.append((char) 0);
        } else if (c15 == ' ') {
            sb5.append((char) 3);
        } else if (c15 == '*') {
            sb5.append((char) 1);
        } else if (c15 == '>') {
            sb5.append((char) 2);
        } else if (c15 >= '0' && c15 <= '9') {
            sb5.append((char) (c15 - ','));
        } else if (c15 < 'A' || c15 > 'Z') {
            j.e(c15);
        } else {
            sb5.append((char) (c15 - '3'));
        }
        return 1;
    }

    @Override // kn.c
    public int f() {
        return 3;
    }

    @Override // kn.c
    void g(h hVar, StringBuilder sb5) {
        hVar.p();
        int iA = hVar.g().a() - hVar.a();
        hVar.f111469f -= sb5.length();
        if (hVar.f() > 1 || iA > 1 || hVar.f() != iA) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
