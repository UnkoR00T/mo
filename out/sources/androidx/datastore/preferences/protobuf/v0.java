package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v0<T> implements g1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f12200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1<?, ?> f12201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p<?> f12203d;

    private v0(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        this.f12201b = n1Var;
        this.f12202c = pVar.e(r0Var);
        this.f12203d = pVar;
        this.f12200a = r0Var;
    }

    private <UT, UB> int j(n1<UT, UB> n1Var, T t15) {
        return n1Var.i(n1Var.g(t15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends t.b<ET>> void k(n1<UT, UB> n1Var, p<ET> pVar, T t15, f1 f1Var, o oVar) throws Throwable {
        n1<UT, UB> n1Var2;
        UB ubF = n1Var.f(t15);
        Object objD = pVar.d(t15);
        while (f1Var.z() != Integer.MAX_VALUE) {
            try {
                n1Var2 = n1Var;
                p<ET> pVar2 = pVar;
                f1 f1Var2 = f1Var;
                o oVar2 = oVar;
                try {
                    if (!m(f1Var2, oVar2, pVar2, objD, n1Var2, ubF)) {
                        n1Var2.o(t15, ubF);
                        return;
                    }
                    f1Var = f1Var2;
                    oVar = oVar2;
                    pVar = pVar2;
                    n1Var = n1Var2;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    n1Var2.o(t15, ubF);
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                n1Var2 = n1Var;
            }
        }
        n1Var.o(t15, ubF);
    }

    static <T> v0<T> l(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        return new v0<>(n1Var, pVar, r0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends t.b<ET>> boolean m(f1 f1Var, o oVar, p<ET> pVar, t<ET> tVar, n1<UT, UB> n1Var, UB ub5) throws a0 {
        int tag = f1Var.getTag();
        int iG = 0;
        if (tag != s1.f12093a) {
            if (s1.b(tag) != 2) {
                return f1Var.C();
            }
            Object objB = pVar.b(oVar, this.f12200a, s1.a(tag));
            if (objB == null) {
                return n1Var.m(ub5, f1Var, 0);
            }
            pVar.h(f1Var, objB, oVar, tVar);
            return true;
        }
        Object objB2 = null;
        g gVarN = null;
        while (f1Var.z() != Integer.MAX_VALUE) {
            int tag2 = f1Var.getTag();
            if (tag2 == s1.f12095c) {
                iG = f1Var.g();
                objB2 = pVar.b(oVar, this.f12200a, iG);
            } else if (tag2 == s1.f12096d) {
                if (objB2 != null) {
                    pVar.h(f1Var, objB2, oVar, tVar);
                } else {
                    gVarN = f1Var.n();
                }
            } else if (!f1Var.C()) {
                break;
            }
        }
        if (f1Var.getTag() != s1.f12094b) {
            throw a0.b();
        }
        if (gVarN != null) {
            if (objB2 != null) {
                pVar.i(gVarN, objB2, oVar, tVar);
            } else {
                n1Var.d(ub5, iG, gVarN);
            }
        }
        return true;
    }

    private <UT, UB> void n(n1<UT, UB> n1Var, T t15, t1 t1Var) {
        n1Var.s(n1Var.g(t15), t1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void a(T t15, T t16) {
        i1.G(this.f12201b, t15, t16);
        if (this.f12202c) {
            i1.E(this.f12203d, t15, t16);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int b(T t15) {
        int iHashCode = this.f12201b.g(t15).hashCode();
        return this.f12202c ? (iHashCode * 53) + this.f12203d.c(t15).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public boolean c(T t15, T t16) {
        if (!this.f12201b.g(t15).equals(this.f12201b.g(t16))) {
            return false;
        }
        if (this.f12202c) {
            return this.f12203d.c(t15).equals(this.f12203d.c(t16));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public T d() {
        r0 r0Var = this.f12200a;
        return r0Var instanceof x ? (T) ((x) r0Var).N() : (T) r0Var.g().E();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void e(T t15) {
        this.f12201b.j(t15);
        this.f12203d.f(t15);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean f(T t15) {
        return this.f12203d.c(t15).p();
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public int g(T t15) {
        int iJ = j(this.f12201b, t15);
        return this.f12202c ? iJ + this.f12203d.c(t15).j() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void h(T t15, f1 f1Var, o oVar) throws Throwable {
        k(this.f12201b, this.f12203d, t15, f1Var, oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public void i(T t15, t1 t1Var) {
        Iterator itT = this.f12203d.c(t15).t();
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            t.b bVar = (t.b) entry.getKey();
            if (bVar.L() != s1.c.MESSAGE || bVar.C() || bVar.M()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof c0.b) {
                t1Var.b(bVar.h(), ((c0.b) entry).a().e());
            } else {
                t1Var.b(bVar.h(), entry.getValue());
            }
        }
        n(this.f12201b, t15, t1Var);
    }
}
