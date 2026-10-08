package q8;

import ak.h2;
import ak.n0;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<a> f165284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f165285b;

    private f(int i15, n0<a> n0Var) {
        this.f165285b = i15;
        this.f165284a = n0Var;
    }

    private static a a(int i15, int i16, c0 c0Var) {
        switch (i15) {
            case 1718776947:
                return g.d(i16, c0Var);
            case 1751742049:
                return c.b(c0Var);
            case 1752331379:
                return d.c(c0Var);
            case 1852994675:
                return h.a(c0Var);
            default:
                return null;
        }
    }

    public static f c(int i15, c0 c0Var) {
        n0.a aVar = new n0.a();
        int iJ = c0Var.j();
        int iB = -2;
        while (c0Var.a() > 8) {
            int iD = c0Var.D();
            int iG = c0Var.g() + c0Var.D();
            c0Var.e0(iG);
            a aVarC = iD == 1414744396 ? c(c0Var.D(), c0Var) : a(iD, iB, c0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            c0Var.f0(iG);
            c0Var.e0(iJ);
        }
        return new f(i15, aVar.k());
    }

    public <T extends a> T b(Class<T> cls) {
        h2<a> it = this.f165284a.iterator();
        while (it.hasNext()) {
            T t15 = (T) it.next();
            if (t15.getClass() == cls) {
                return t15;
            }
        }
        return null;
    }

    @Override // q8.a
    public int getType() {
        return this.f165285b;
    }
}
