package kn;

/* JADX INFO: loaded from: classes4.dex */
final class a implements g {
    a() {
    }

    private static char b(char c15, char c16) {
        if (j.f(c15) && j.f(c16)) {
            return (char) (((c15 - '0') * 10) + (c16 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c15 + c16);
    }

    @Override // kn.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f111469f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f111469f), hVar.d().charAt(hVar.f111469f + 1)));
            hVar.f111469f += 2;
            return;
        }
        char c15 = hVar.c();
        int iN = j.n(hVar.d(), hVar.f111469f, c());
        if (iN == c()) {
            if (!j.g(c15)) {
                hVar.r((char) (c15 + 1));
                hVar.f111469f++;
                return;
            } else {
                hVar.r((char) 235);
                hVar.r((char) (c15 - 127));
                hVar.f111469f++;
                return;
            }
        }
        if (iN == 1) {
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (iN == 2) {
            hVar.r((char) 239);
            hVar.o(2);
            return;
        }
        if (iN == 3) {
            hVar.r((char) 238);
            hVar.o(3);
            return;
        }
        if (iN == 4) {
            hVar.r((char) 240);
            hVar.o(4);
        } else if (iN == 5) {
            hVar.r((char) 231);
            hVar.o(5);
        } else {
            throw new IllegalStateException("Illegal mode: " + iN);
        }
    }

    public int c() {
        return 0;
    }
}
