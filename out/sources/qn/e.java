package qn;

import en.h;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f167426a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f167427b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f167428c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f167429d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(hn.a aVar, pn.a aVar2, pn.c cVar, int i15, b bVar) throws h {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i15, bVar);
        s(cVar, bVar);
        f(aVar, i15, bVar);
    }

    static int b(int i15, int i16) {
        if (i16 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i16);
        int iN2 = i15 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i16 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(pn.c cVar, b bVar) throws h {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws h {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new h();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    static void f(hn.a aVar, int i15, b bVar) throws h {
        boolean zJ;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i16 = 0;
        int i17 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i18 = 0; i18 < 2; i18++) {
                    int i19 = iE - i18;
                    if (o(bVar.b(i19, iD))) {
                        if (i16 < aVar.l()) {
                            zJ = aVar.j(i16);
                            i16++;
                        } else {
                            zJ = false;
                        }
                        if (i15 != -1 && d.f(i15, i19, iD)) {
                            zJ = !zJ;
                        }
                        bVar.g(i19, iD, zJ);
                    }
                }
                iD += i17;
            }
            i17 = -i17;
            iD += i17;
            iE -= 2;
        }
        if (i16 == aVar.l()) {
            return;
        }
        throw new h("Not all bits consumed: " + i16 + '/' + aVar.l());
    }

    private static void g(int i15, int i16, b bVar) throws h {
        for (int i17 = 0; i17 < 8; i17++) {
            int i18 = i15 + i17;
            if (!o(bVar.b(i18, i16))) {
                throw new h();
            }
            bVar.f(i18, i16, 0);
        }
    }

    private static void h(int i15, int i16, b bVar) {
        for (int i17 = 0; i17 < 5; i17++) {
            int[] iArr = f167427b[i17];
            for (int i18 = 0; i18 < 5; i18++) {
                bVar.f(i15 + i18, i16 + i17, iArr[i18]);
            }
        }
    }

    private static void i(int i15, int i16, b bVar) {
        for (int i17 = 0; i17 < 7; i17++) {
            int[] iArr = f167426a[i17];
            for (int i18 = 0; i18 < 7; i18++) {
                bVar.f(i15 + i18, i16 + i17, iArr[i18]);
            }
        }
    }

    private static void j(b bVar) throws h {
        int length = f167426a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i15 = 8;
        while (i15 < bVar.e() - 8) {
            int i16 = i15 + 1;
            int i17 = i16 % 2;
            if (o(bVar.b(i15, 6))) {
                bVar.f(i15, 6, i17);
            }
            if (o(bVar.b(6, i15))) {
                bVar.f(6, i15, i17);
            }
            i15 = i16;
        }
    }

    static void l(pn.a aVar, int i15, b bVar) throws h {
        int iD;
        hn.a aVar2 = new hn.a();
        p(aVar, i15, aVar2);
        for (int i16 = 0; i16 < aVar2.l(); i16++) {
            boolean zJ = aVar2.j((aVar2.l() - 1) - i16);
            int[] iArr = f167429d[i16];
            bVar.g(iArr[0], iArr[1], zJ);
            int iE = 8;
            if (i16 < 8) {
                iD = 8;
                iE = (bVar.e() - i16) - 1;
            } else {
                iD = (bVar.d() - 7) + (i16 - 8);
            }
            bVar.g(iE, iD, zJ);
        }
    }

    private static void m(int i15, int i16, b bVar) throws h {
        for (int i17 = 0; i17 < 7; i17++) {
            int i18 = i16 + i17;
            if (!o(bVar.b(i15, i18))) {
                throw new h();
            }
            bVar.f(i15, i18, 0);
        }
    }

    static int n(int i15) {
        return 32 - Integer.numberOfLeadingZeros(i15);
    }

    private static boolean o(int i15) {
        return i15 == -1;
    }

    static void p(pn.a aVar, int i15, hn.a aVar2) throws h {
        if (!g.b(i15)) {
            throw new h("Invalid mask pattern");
        }
        int iE = (aVar.e() << 3) | i15;
        aVar2.e(iE, 5);
        aVar2.e(b(iE, 1335), 10);
        hn.a aVar3 = new hn.a();
        aVar3.e(21522, 15);
        aVar2.p(aVar3);
        if (aVar2.l() == 15) {
            return;
        }
        throw new h("should not happen but we got: " + aVar2.l());
    }

    static void q(pn.c cVar, hn.a aVar) throws h {
        aVar.e(cVar.f(), 6);
        aVar.e(b(cVar.f(), 7973), 12);
        if (aVar.l() == 18) {
            return;
        }
        throw new h("should not happen but we got: " + aVar.l());
    }

    private static void r(pn.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = f167428c[cVar.f() - 1];
        for (int i15 : iArr) {
            if (i15 >= 0) {
                for (int i16 : iArr) {
                    if (i16 >= 0 && o(bVar.b(i16, i15))) {
                        h(i16 - 2, i15 - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(pn.c cVar, b bVar) throws h {
        if (cVar.f() < 7) {
            return;
        }
        hn.a aVar = new hn.a();
        q(cVar, aVar);
        int i15 = 17;
        for (int i16 = 0; i16 < 6; i16++) {
            for (int i17 = 0; i17 < 3; i17++) {
                boolean zJ = aVar.j(i15);
                i15--;
                bVar.g(i16, (bVar.d() - 11) + i17, zJ);
                bVar.g((bVar.d() - 11) + i17, i16, zJ);
            }
        }
    }
}
