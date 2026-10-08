package a8;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends t7.e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h8.b1 f4216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f4217g;

    public a(boolean z15, h8.b1 b1Var) {
        this.f4217g = z15;
        this.f4216f = b1Var;
        this.f4215e = b1Var.a();
    }

    private int B(int i15, boolean z15) {
        if (z15) {
            return this.f4216f.c(i15);
        }
        if (i15 < this.f4215e - 1) {
            return i15 + 1;
        }
        return -1;
    }

    private int C(int i15, boolean z15) {
        if (z15) {
            return this.f4216f.b(i15);
        }
        if (i15 > 0) {
            return i15 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i15);

    protected abstract t7.e0 D(int i15);

    @Override // t7.e0
    public int a(boolean z15) {
        if (this.f4215e == 0) {
            return -1;
        }
        if (this.f4217g) {
            z15 = false;
        }
        int iG = z15 ? this.f4216f.g() : 0;
        while (D(iG).q()) {
            iG = B(iG, z15);
            if (iG == -1) {
                return -1;
            }
        }
        return A(iG) + D(iG).a(z15);
    }

    @Override // t7.e0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        if (iS == -1 || (iB = D(iS).b(objV)) == -1) {
            return -1;
        }
        return z(iS) + iB;
    }

    @Override // t7.e0
    public int c(boolean z15) {
        int i15 = this.f4215e;
        if (i15 == 0) {
            return -1;
        }
        if (this.f4217g) {
            z15 = false;
        }
        int iD = z15 ? this.f4216f.d() : i15 - 1;
        while (D(iD).q()) {
            iD = C(iD, z15);
            if (iD == -1) {
                return -1;
            }
        }
        return A(iD) + D(iD).c(z15);
    }

    @Override // t7.e0
    public int e(int i15, int i16, boolean z15) {
        if (this.f4217g) {
            if (i16 == 1) {
                i16 = 2;
            }
            z15 = false;
        }
        int iU = u(i15);
        int iA = A(iU);
        int iE = D(iU).e(i15 - iA, i16 != 2 ? i16 : 0, z15);
        if (iE != -1) {
            return iA + iE;
        }
        int iB = B(iU, z15);
        while (iB != -1 && D(iB).q()) {
            iB = B(iB, z15);
        }
        if (iB != -1) {
            return A(iB) + D(iB).a(z15);
        }
        if (i16 == 2) {
            return a(z15);
        }
        return -1;
    }

    @Override // t7.e0
    public final t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
        int iT = t(i15);
        int iA = A(iT);
        D(iT).g(i15 - z(iT), bVar, z15);
        bVar.f188138c += iA;
        if (z15) {
            bVar.f188137b = y(x(iT), zj.p.q(bVar.f188137b));
        }
        return bVar;
    }

    @Override // t7.e0
    public final t7.e0.b h(Object obj, t7.e0.b bVar) {
        Object objW = w(obj);
        Object objV = v(obj);
        int iS = s(objW);
        int iA = A(iS);
        D(iS).h(objV, bVar);
        bVar.f188138c += iA;
        bVar.f188137b = obj;
        return bVar;
    }

    @Override // t7.e0
    public int l(int i15, int i16, boolean z15) {
        if (this.f4217g) {
            if (i16 == 1) {
                i16 = 2;
            }
            z15 = false;
        }
        int iU = u(i15);
        int iA = A(iU);
        int iL = D(iU).l(i15 - iA, i16 != 2 ? i16 : 0, z15);
        if (iL != -1) {
            return iA + iL;
        }
        int iC = C(iU, z15);
        while (iC != -1 && D(iC).q()) {
            iC = C(iC, z15);
        }
        if (iC != -1) {
            return A(iC) + D(iC).c(z15);
        }
        if (i16 == 2) {
            return c(z15);
        }
        return -1;
    }

    @Override // t7.e0
    public final Object m(int i15) {
        int iT = t(i15);
        return y(x(iT), D(iT).m(i15 - z(iT)));
    }

    @Override // t7.e0
    public final t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
        int iU = u(i15);
        int iA = A(iU);
        int iZ = z(iU);
        D(iU).o(i15 - iA, cVar, j15);
        Object objX = x(iU);
        if (!t7.e0.c.f188143q.equals(cVar.f188153a)) {
            objX = y(objX, cVar.f188153a);
        }
        cVar.f188153a = objX;
        cVar.f188166n += iZ;
        cVar.f188167o += iZ;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i15);

    protected abstract int u(int i15);

    protected abstract Object x(int i15);

    protected abstract int z(int i15);
}
