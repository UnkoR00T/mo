package i9;

import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    private static int a(int i15, c0 c0Var, int i16) {
        if (i15 == 12) {
            return 240;
        }
        if (i15 == 13) {
            return 120;
        }
        if (i15 == 21 && c0Var.a() >= 8 && c0Var.g() + 8 <= i16) {
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            if (iZ >= 12 && iZ2 == 1936877170) {
                return c0Var.R();
            }
        }
        return -2147483647;
    }

    public static t7.v b(c0 c0Var, int i15) {
        c0Var.g0(12);
        while (c0Var.g() < i15) {
            int iG = c0Var.g();
            int iZ = c0Var.z();
            if (c0Var.z() == 1935766900) {
                if (iZ < 16) {
                    return null;
                }
                c0Var.g0(4);
                int i16 = -1;
                int i17 = 0;
                for (int i18 = 0; i18 < 2; i18++) {
                    int iQ = c0Var.Q();
                    int iQ2 = c0Var.Q();
                    if (iQ == 0) {
                        i16 = iQ2;
                    } else if (iQ == 1) {
                        i17 = iQ2;
                    }
                }
                int iA = a(i16, c0Var, i15);
                if (iA == -2147483647) {
                    return null;
                }
                return new t7.v(new d9.d(iA, i17));
            }
            c0Var.f0(iG + iZ);
        }
        return null;
    }
}
