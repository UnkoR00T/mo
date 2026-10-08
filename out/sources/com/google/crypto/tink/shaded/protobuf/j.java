package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class j implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f36103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36106d = 0;

    private j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f36103a = iVar2;
        iVar2.f36077d = this;
    }

    public static j P(i iVar) {
        j jVar = iVar.f36077d;
        return jVar != null ? jVar : new j(iVar);
    }

    private <T> void Q(T t15, g1<T> g1Var, p pVar) {
        int i15 = this.f36105c;
        this.f36105c = t1.c(t1.a(this.f36104b), 4);
        try {
            g1Var.i(t15, this, pVar);
            if (this.f36104b != this.f36105c) {
                throw b0.h();
            }
            this.f36105c = i15;
        } catch (Throwable th4) {
            this.f36105c = i15;
            throw th4;
        }
    }

    private <T> void R(T t15, g1<T> g1Var, p pVar) throws b0 {
        int iC = this.f36103a.C();
        i iVar = this.f36103a;
        if (iVar.f36074a >= iVar.f36075b) {
            throw b0.i();
        }
        int iL = iVar.l(iC);
        this.f36103a.f36074a++;
        g1Var.i(t15, this, pVar);
        this.f36103a.a(0);
        i iVar2 = this.f36103a;
        iVar2.f36074a--;
        iVar2.k(iL);
    }

    private <T> T S(g1<T> g1Var, p pVar) {
        T tD = g1Var.d();
        Q(tD, g1Var, pVar);
        g1Var.e(tD);
        return tD;
    }

    private <T> T T(g1<T> g1Var, p pVar) throws b0 {
        T tD = g1Var.d();
        R(tD, g1Var, pVar);
        g1Var.e(tD);
        return tD;
    }

    private void V(int i15) throws b0 {
        if (this.f36103a.d() != i15) {
            throw b0.n();
        }
    }

    private void W(int i15) throws b0.a {
        if (t1.b(this.f36104b) != i15) {
            throw b0.e();
        }
    }

    private void X(int i15) throws b0 {
        if ((i15 & 3) != 0) {
            throw b0.h();
        }
    }

    private void Y(int i15) throws b0 {
        if ((i15 & 7) != 0) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void A(List<String> list) throws b0.a {
        U(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void B(List<Float> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof w)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 2) {
                int iC = this.f36103a.C();
                X(iC);
                int iD = this.f36103a.d() + iC;
                do {
                    list.add(Float.valueOf(this.f36103a.s()));
                } while (this.f36103a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b0.e();
            }
            do {
                list.add(Float.valueOf(this.f36103a.s()));
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB = this.f36103a.B();
                }
            } while (iB == this.f36104b);
            this.f36106d = iB;
            return;
        }
        w wVar = (w) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 2) {
            int iC2 = this.f36103a.C();
            X(iC2);
            int iD2 = this.f36103a.d() + iC2;
            do {
                wVar.h(this.f36103a.s());
            } while (this.f36103a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b0.e();
        }
        do {
            wVar.h(this.f36103a.s());
            if (this.f36103a.e()) {
                return;
            } else {
                iB2 = this.f36103a.B();
            }
        } while (iB2 == this.f36104b);
        this.f36106d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean C() {
        int i15;
        if (this.f36103a.e() || (i15 = this.f36104b) == this.f36105c) {
            return false;
        }
        return this.f36103a.E(i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int D() throws b0.a {
        W(5);
        return this.f36103a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void E(List<h> list) throws b0.a {
        int iB;
        if (t1.b(this.f36104b) != 2) {
            throw b0.e();
        }
        do {
            list.add(n());
            if (this.f36103a.e()) {
                return;
            } else {
                iB = this.f36103a.B();
            }
        } while (iB == this.f36104b);
        this.f36106d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void F(List<Double> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof m)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.f36103a.o()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iC = this.f36103a.C();
            Y(iC);
            int iD = this.f36103a.d() + iC;
            do {
                list.add(Double.valueOf(this.f36103a.o()));
            } while (this.f36103a.d() < iD);
            return;
        }
        m mVar = (m) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 1) {
            do {
                mVar.h(this.f36103a.o());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iC2 = this.f36103a.C();
        Y(iC2);
        int iD2 = this.f36103a.d() + iC2;
        do {
            mVar.h(this.f36103a.o());
        } while (this.f36103a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long G() throws b0.a {
        W(0);
        return this.f36103a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String H() throws b0.a {
        W(2);
        return this.f36103a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void I(T t15, g1<T> g1Var, p pVar) throws b0.a {
        W(3);
        Q(t15, g1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> T J(Class<T> cls, p pVar) throws b0.a {
        W(3);
        return (T) S(c1.a().c(cls), pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <K, V> void K(Map<K, V> map, k0.a<K, V> aVar, p pVar) throws b0.a {
        W(2);
        this.f36103a.l(this.f36103a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void L(T t15, g1<T> g1Var, p pVar) throws b0 {
        W(2);
        R(t15, g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void M(List<T> list, g1<T> g1Var, p pVar) throws b0.a {
        int iB;
        if (t1.b(this.f36104b) != 2) {
            throw b0.e();
        }
        int i15 = this.f36104b;
        do {
            list.add(T(g1Var, pVar));
            if (this.f36103a.e() || this.f36106d != 0) {
                return;
            } else {
                iB = this.f36103a.B();
            }
        } while (iB == i15);
        this.f36106d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> T N(Class<T> cls, p pVar) throws b0.a {
        W(2);
        return (T) T(c1.a().c(cls), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> void O(List<T> list, g1<T> g1Var, p pVar) throws b0.a {
        int iB;
        if (t1.b(this.f36104b) != 3) {
            throw b0.e();
        }
        int i15 = this.f36104b;
        do {
            list.add(S(g1Var, pVar));
            if (this.f36103a.e() || this.f36106d != 0) {
                return;
            } else {
                iB = this.f36103a.B();
            }
        } while (iB == i15);
        this.f36106d = iB;
    }

    public void U(List<String> list, boolean z15) throws b0.a {
        int iB;
        int iB2;
        if (t1.b(this.f36104b) != 2) {
            throw b0.e();
        }
        if (!(list instanceof g0) || z15) {
            do {
                list.add(z15 ? H() : y());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB = this.f36103a.B();
                }
            } while (iB == this.f36104b);
            this.f36106d = iB;
            return;
        }
        g0 g0Var = (g0) list;
        do {
            g0Var.F3(n());
            if (this.f36103a.e()) {
                return;
            } else {
                iB2 = this.f36103a.B();
            }
        } while (iB2 == this.f36104b);
        this.f36106d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long a() throws b0.a {
        W(1);
        return this.f36103a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void b(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 2) {
                int iC = this.f36103a.C();
                X(iC);
                int iD = this.f36103a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f36103a.v()));
                } while (this.f36103a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f36103a.v()));
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB = this.f36103a.B();
                }
            } while (iB == this.f36104b);
            this.f36106d = iB;
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 2) {
            int iC2 = this.f36103a.C();
            X(iC2);
            int iD2 = this.f36103a.d() + iC2;
            do {
                zVar.h(this.f36103a.v());
            } while (this.f36103a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b0.e();
        }
        do {
            zVar.h(this.f36103a.v());
            if (this.f36103a.e()) {
                return;
            } else {
                iB2 = this.f36103a.B();
            }
        } while (iB2 == this.f36104b);
        this.f36106d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(List<Long> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof i0)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f36103a.y()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Long.valueOf(this.f36103a.y()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        i0 i0Var = (i0) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                i0Var.i(this.f36103a.y());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            i0Var.i(this.f36103a.y());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean d() throws b0.a {
        W(0);
        return this.f36103a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long e() throws b0.a {
        W(1);
        return this.f36103a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void f(List<Long> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof i0)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f36103a.D()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Long.valueOf(this.f36103a.D()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        i0 i0Var = (i0) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                i0Var.i(this.f36103a.D());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            i0Var.i(this.f36103a.D());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int g() throws b0.a {
        W(0);
        return this.f36103a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int getTag() {
        return this.f36104b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void h(List<Long> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof i0)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f36103a.u()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Long.valueOf(this.f36103a.u()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        i0 i0Var = (i0) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                i0Var.i(this.f36103a.u());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            i0Var.i(this.f36103a.u());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void i(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36103a.p()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Integer.valueOf(this.f36103a.p()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                zVar.h(this.f36103a.p());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            zVar.h(this.f36103a.p());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int j() throws b0.a {
        W(0);
        return this.f36103a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int k() throws b0.a {
        W(0);
        return this.f36103a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void l(List<Boolean> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof f)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f36103a.m()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Boolean.valueOf(this.f36103a.m()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        f fVar = (f) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                fVar.i(this.f36103a.m());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            fVar.i(this.f36103a.m());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void m(List<String> list) throws b0.a {
        U(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public h n() throws b0.a {
        W(2);
        return this.f36103a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int o() throws b0.a {
        W(0);
        return this.f36103a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void p(List<Long> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof i0)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f36103a.r()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iC = this.f36103a.C();
            Y(iC);
            int iD = this.f36103a.d() + iC;
            do {
                list.add(Long.valueOf(this.f36103a.r()));
            } while (this.f36103a.d() < iD);
            return;
        }
        i0 i0Var = (i0) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 1) {
            do {
                i0Var.i(this.f36103a.r());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iC2 = this.f36103a.C();
        Y(iC2);
        int iD2 = this.f36103a.d() + iC2;
        do {
            i0Var.i(this.f36103a.r());
        } while (this.f36103a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void q(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36103a.x()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Integer.valueOf(this.f36103a.x()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                zVar.h(this.f36103a.x());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            zVar.h(this.f36103a.x());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long r() throws b0.a {
        W(0);
        return this.f36103a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public double readDouble() throws b0.a {
        W(1);
        return this.f36103a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public float readFloat() throws b0.a {
        W(5);
        return this.f36103a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void s(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36103a.C()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Integer.valueOf(this.f36103a.C()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                zVar.h(this.f36103a.C());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            zVar.h(this.f36103a.C());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int t() throws b0.a {
        W(5);
        return this.f36103a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void u(List<Long> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof i0)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f36103a.w()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iC = this.f36103a.C();
            Y(iC);
            int iD = this.f36103a.d() + iC;
            do {
                list.add(Long.valueOf(this.f36103a.w()));
            } while (this.f36103a.d() < iD);
            return;
        }
        i0 i0Var = (i0) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 1) {
            do {
                i0Var.i(this.f36103a.w());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iC2 = this.f36103a.C();
        Y(iC2);
        int iD2 = this.f36103a.d() + iC2;
        do {
            i0Var.i(this.f36103a.w());
        } while (this.f36103a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void v(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f36103a.t()));
                    if (this.f36103a.e()) {
                        return;
                    } else {
                        iB = this.f36103a.B();
                    }
                } while (iB == this.f36104b);
                this.f36106d = iB;
                return;
            }
            if (iB3 != 2) {
                throw b0.e();
            }
            int iD = this.f36103a.d() + this.f36103a.C();
            do {
                list.add(Integer.valueOf(this.f36103a.t()));
            } while (this.f36103a.d() < iD);
            V(iD);
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 0) {
            do {
                zVar.h(this.f36103a.t());
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB2 = this.f36103a.B();
                }
            } while (iB2 == this.f36104b);
            this.f36106d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw b0.e();
        }
        int iD2 = this.f36103a.d() + this.f36103a.C();
        do {
            zVar.h(this.f36103a.t());
        } while (this.f36103a.d() < iD2);
        V(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void w(List<Integer> list) throws b0 {
        int iB;
        int iB2;
        if (!(list instanceof z)) {
            int iB3 = t1.b(this.f36104b);
            if (iB3 == 2) {
                int iC = this.f36103a.C();
                X(iC);
                int iD = this.f36103a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f36103a.q()));
                } while (this.f36103a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f36103a.q()));
                if (this.f36103a.e()) {
                    return;
                } else {
                    iB = this.f36103a.B();
                }
            } while (iB == this.f36104b);
            this.f36106d = iB;
            return;
        }
        z zVar = (z) list;
        int iB4 = t1.b(this.f36104b);
        if (iB4 == 2) {
            int iC2 = this.f36103a.C();
            X(iC2);
            int iD2 = this.f36103a.d() + iC2;
            do {
                zVar.h(this.f36103a.q());
            } while (this.f36103a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw b0.e();
        }
        do {
            zVar.h(this.f36103a.q());
            if (this.f36103a.e()) {
                return;
            } else {
                iB2 = this.f36103a.B();
            }
        } while (iB2 == this.f36104b);
        this.f36106d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long x() throws b0.a {
        W(0);
        return this.f36103a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String y() throws b0.a {
        W(2);
        return this.f36103a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int z() {
        int i15 = this.f36106d;
        if (i15 != 0) {
            this.f36104b = i15;
            this.f36106d = 0;
        } else {
            this.f36104b = this.f36103a.B();
        }
        int i16 = this.f36104b;
        if (i16 == 0 || i16 == this.f36105c) {
            return Integer.MAX_VALUE;
        }
        return t1.a(i16);
    }
}
