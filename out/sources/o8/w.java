package o8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f143225a;

        public a(y yVar) {
            this.f143225a = yVar;
        }
    }

    public static boolean a(q qVar) {
        w7.c0 c0Var = new w7.c0(4);
        qVar.p(c0Var.f(), 0, 4);
        return c0Var.S() == 1716281667;
    }

    public static int b(q qVar) throws t7.x {
        qVar.g();
        w7.c0 c0Var = new w7.c0(2);
        qVar.p(c0Var.f(), 0, 2);
        int iY = c0Var.Y();
        if ((iY >> 2) == 16382) {
            qVar.g();
            return iY;
        }
        qVar.g();
        throw t7.x.a("First frame does not start with sync code.", null);
    }

    public static t7.v c(q qVar, boolean z15) throws Throwable {
        t7.v vVarA = new g0().a(qVar, z15 ? null : c9.h.f24596b, 0);
        if (vVarA == null || vVarA.j() == 0) {
            return null;
        }
        return vVarA;
    }

    public static t7.v d(q qVar, boolean z15) throws Throwable {
        qVar.g();
        long j15 = qVar.j();
        t7.v vVarC = c(qVar, z15);
        qVar.n((int) (qVar.j() - j15));
        return vVarC;
    }

    public static boolean e(q qVar, a aVar) {
        qVar.g();
        w7.b0 b0Var = new w7.b0(new byte[4]);
        qVar.p(b0Var.f210609a, 0, 4);
        boolean zG = b0Var.g();
        int iH = b0Var.h(7);
        int iH2 = b0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f143225a = h(qVar);
            return zG;
        }
        y yVar = aVar.f143225a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f143225a = yVar.b(f(qVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f143225a = yVar.c(j(qVar, iH2));
            return zG;
        }
        if (iH != 6) {
            qVar.n(iH2);
            return zG;
        }
        w7.c0 c0Var = new w7.c0(iH2);
        qVar.readFully(c0Var.f(), 0, iH2);
        c0Var.g0(4);
        aVar.f143225a = yVar.a(ak.n0.E(a9.a.d(c0Var)));
        return zG;
    }

    private static y.a f(q qVar, int i15) {
        w7.c0 c0Var = new w7.c0(i15);
        qVar.readFully(c0Var.f(), 0, i15);
        return g(c0Var);
    }

    public static y.a g(w7.c0 c0Var) {
        c0Var.g0(1);
        int iT = c0Var.T();
        long jG = ((long) c0Var.g()) + ((long) iT);
        int i15 = iT / 18;
        long[] jArrCopyOf = new long[i15];
        long[] jArrCopyOf2 = new long[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            long J = c0Var.J();
            if (J == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                break;
            }
            jArrCopyOf[i16] = J;
            jArrCopyOf2[i16] = c0Var.J();
            c0Var.g0(2);
        }
        c0Var.g0((int) (jG - ((long) c0Var.g())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y h(q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(q qVar) throws t7.x {
        w7.c0 c0Var = new w7.c0(4);
        qVar.readFully(c0Var.f(), 0, 4);
        if (c0Var.S() != 1716281667) {
            throw t7.x.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(q qVar, int i15) {
        w7.c0 c0Var = new w7.c0(i15);
        qVar.readFully(c0Var.f(), 0, i15);
        c0Var.g0(4);
        return Arrays.asList(v0.k(c0Var, false, false).f143209b);
    }
}
