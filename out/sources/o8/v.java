package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f143207a;
    }

    private static boolean a(w7.c0 c0Var, y yVar, int i15, long j15) {
        int iK = k(c0Var, i15);
        long j16 = yVar.f143241j;
        return iK != -1 && (((j16 > 0L ? 1 : (j16 == 0L ? 0 : -1)) == 0 || ((j15 + ((long) iK)) > j16 ? 1 : ((j15 + ((long) iK)) == j16 ? 0 : -1)) >= 0) || iK >= yVar.f143232a) && iK <= yVar.f143233b;
    }

    private static boolean b(w7.c0 c0Var, int i15) {
        return c0Var.Q() == w7.o0.x(c0Var.f(), i15, c0Var.g() - 1, 0);
    }

    private static boolean c(w7.c0 c0Var, y yVar, boolean z15, a aVar) {
        try {
            long jZ = c0Var.Z();
            if (!z15) {
                jZ *= (long) yVar.f143233b;
            }
            long j15 = yVar.f143241j;
            if (j15 != 0 && jZ > j15) {
                return false;
            }
            aVar.f143207a = jZ;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(w7.c0 c0Var, y yVar, int i15, a aVar) {
        int iG = c0Var.g();
        long jS = c0Var.S();
        long j15 = jS >>> 16;
        if (j15 != i15) {
            return false;
        }
        return g((int) ((jS >> 4) & 15), yVar) && f((int) ((jS >> 1) & 7), yVar) && !(((jS & 1) > 1L ? 1 : ((jS & 1) == 1L ? 0 : -1)) == 0) && c(c0Var, yVar, ((j15 & 1) > 1L ? 1 : ((j15 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(c0Var, yVar, (int) ((jS >> 12) & 15), aVar.f143207a) && e(c0Var, yVar, (int) ((jS >> 8) & 15)) && b(c0Var, iG) && h(c0Var);
    }

    private static boolean e(w7.c0 c0Var, y yVar, int i15) {
        int i16 = yVar.f143236e;
        if (i15 == 0) {
            return true;
        }
        if (i15 <= 11) {
            return i15 == yVar.f143237f;
        }
        if (i15 == 12) {
            return c0Var.Q() * 1000 == i16;
        }
        if (i15 <= 14) {
            int iY = c0Var.Y();
            if (i15 == 14) {
                iY *= 10;
            }
            if (iY == i16) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i15, y yVar) {
        return i15 == 0 || i15 == yVar.f143240i;
    }

    private static boolean g(int i15, y yVar) {
        if (i15 <= 7) {
            return i15 == yVar.f143238g - 1;
        }
        return i15 <= 10 && yVar.f143238g == 2;
    }

    private static boolean h(w7.c0 c0Var) {
        if (c0Var.a() == 0) {
            return true;
        }
        int iQ = c0Var.q();
        if ((iQ & 128) != 0) {
            return false;
        }
        int i15 = (iQ & 126) >> 1;
        if ((i15 < 2 || i15 > 7) && (i15 < 13 || i15 > 31)) {
            return true;
        }
        w7.t.f("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i15);
        return false;
    }

    public static boolean i(q qVar, y yVar, int i15, a aVar) {
        long j15 = qVar.j();
        w7.c0 c0Var = new w7.c0(17);
        qVar.p(c0Var.f(), 0, 2);
        if (c0Var.l() != i15) {
            qVar.g();
            qVar.k((int) (j15 - qVar.getPosition()));
            return false;
        }
        c0Var.e0(s.d(qVar, c0Var.f(), 2, 15) + 2);
        qVar.g();
        qVar.k((int) (j15 - qVar.getPosition()));
        return d(c0Var, yVar, i15, aVar);
    }

    public static long j(q qVar, y yVar) throws t7.x {
        qVar.g();
        qVar.k(1);
        byte[] bArr = new byte[1];
        qVar.p(bArr, 0, 1);
        boolean z15 = (bArr[0] & 1) == 1;
        qVar.k(2);
        int i15 = z15 ? 7 : 6;
        w7.c0 c0Var = new w7.c0(i15);
        c0Var.e0(s.d(qVar, c0Var.f(), 0, i15));
        qVar.g();
        a aVar = new a();
        if (c(c0Var, yVar, z15, aVar)) {
            return aVar.f143207a;
        }
        throw t7.x.a(null, null);
    }

    public static int k(w7.c0 c0Var, int i15) {
        switch (i15) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i15 - 2);
            case 6:
                return c0Var.Q() + 1;
            case 7:
                return c0Var.Y() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i15 - 8);
            default:
                return -1;
        }
    }
}
