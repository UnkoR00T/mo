package v8;

import o8.q;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    public static boolean a(q qVar, boolean z15) {
        int i15;
        c0 c0Var = new c0(16);
        boolean z16 = true;
        while (true) {
            c0Var.b0(8);
            if (!qVar.e(c0Var.f(), 0, 8, true)) {
                return false;
            }
            long jS = c0Var.S();
            int iZ = c0Var.z();
            if (jS != 1) {
                i15 = 8;
            } else {
                if (!qVar.e(c0Var.f(), 8, 8, true)) {
                    return false;
                }
                jS = c0Var.X();
                i15 = 16;
            }
            long j15 = i15;
            if (jS < j15) {
                return false;
            }
            int i16 = (int) (jS - j15);
            if (z16) {
                if (iZ != 1718909296 || i16 < 8) {
                    return false;
                }
                c0Var.b0(4);
                qVar.p(c0Var.f(), 0, 4);
                if (c0Var.z() != 1751476579) {
                    return false;
                }
                if (!z15) {
                    return true;
                }
                qVar.k(i16 - 4);
                z16 = false;
            } else {
                if (iZ == 1836086884) {
                    return true;
                }
                if (i16 != 0) {
                    qVar.k(i16);
                }
            }
        }
    }
}
