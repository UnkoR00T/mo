package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static void a(long j15, w7.c0 c0Var, s0[] s0VarArr) {
        while (true) {
            if (c0Var.a() <= 1) {
                return;
            }
            int iC = c(c0Var);
            int iC2 = c(c0Var);
            int iG = c0Var.g() + iC2;
            if (iC2 == -1 || iC2 > c0Var.a()) {
                w7.t.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = c0Var.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iQ = c0Var.Q();
                int iY = c0Var.Y();
                int iZ = iY == 49 ? c0Var.z() : 0;
                int iQ2 = c0Var.Q();
                if (iY == 47) {
                    c0Var.g0(1);
                }
                boolean z15 = iQ == 181 && (iY == 49 || iY == 47) && iQ2 == 3;
                if (iY == 49) {
                    z15 &= iZ == 1195456820;
                }
                if (z15) {
                    b(j15, c0Var, s0VarArr);
                }
            }
            c0Var.f0(iG);
        }
    }

    public static void b(long j15, w7.c0 c0Var, s0[] s0VarArr) {
        int iQ = c0Var.Q();
        if ((iQ & 64) != 0) {
            c0Var.g0(1);
            int i15 = (iQ & 31) * 3;
            int iG = c0Var.g();
            for (s0 s0Var : s0VarArr) {
                c0Var.f0(iG);
                s0Var.a(c0Var, i15);
                zj.p.w(j15 != -9223372036854775807L);
                s0Var.c(j15, 1, i15, 0, null);
            }
        }
    }

    private static int c(w7.c0 c0Var) {
        int i15 = 0;
        while (c0Var.a() != 0) {
            int iQ = c0Var.Q();
            i15 += iQ;
            if (iQ != 255) {
                return i15;
            }
        }
        return -1;
    }
}
