package io.sentry;

import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends io.sentry.protocol.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.protocol.c f95001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.protocol.c f95002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.protocol.c f95003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j4 f95004f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95005a;

        static {
            int[] iArr = new int[j4.values().length];
            f95005a = iArr;
            try {
                iArr[j4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95005a[j4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95005a[j4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, j4 j4Var) {
        this.f95001c = cVar;
        this.f95002d = cVar2;
        this.f95003e = cVar3;
        this.f95004f = j4Var;
    }

    private io.sentry.protocol.c A() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.l(this.f95001c);
        cVar.l(this.f95002d);
        cVar.l(this.f95003e);
        return cVar;
    }

    private io.sentry.protocol.c z() {
        int i15 = a.f95005a[this.f95004f.ordinal()];
        if (i15 == 1) {
            return this.f95003e;
        }
        if (i15 != 2) {
            return i15 != 3 ? this.f95003e : this.f95001c;
        }
        return this.f95002d;
    }

    @Override // io.sentry.protocol.c
    public boolean a(Object obj) {
        return this.f95001c.a(obj) || this.f95002d.a(obj) || this.f95003e.a(obj);
    }

    @Override // io.sentry.protocol.c
    public Set<Map.Entry<String, Object>> b() {
        return A().b();
    }

    @Override // io.sentry.protocol.c
    public Object c(Object obj) {
        Object objC = this.f95003e.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f95002d.c(obj);
        return objC2 != null ? objC2 : this.f95001c.c(obj);
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f95003e.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f95002d.d();
        return aVarD2 != null ? aVarD2 : this.f95001c.d();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.e e() {
        io.sentry.protocol.e eVarE = this.f95003e.e();
        if (eVarE != null) {
            return eVarE;
        }
        io.sentry.protocol.e eVarE2 = this.f95002d.e();
        return eVarE2 != null ? eVarE2 : this.f95001c.e();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.l g() {
        io.sentry.protocol.l lVarG = this.f95003e.g();
        if (lVarG != null) {
            return lVarG;
        }
        io.sentry.protocol.l lVarG2 = this.f95002d.g();
        return lVarG2 != null ? lVarG2 : this.f95001c.g();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.x h() {
        io.sentry.protocol.x xVarH = this.f95003e.h();
        if (xVarH != null) {
            return xVarH;
        }
        io.sentry.protocol.x xVarH2 = this.f95002d.h();
        return xVarH2 != null ? xVarH2 : this.f95001c.h();
    }

    @Override // io.sentry.protocol.c
    public n8 i() {
        n8 n8VarI = this.f95003e.i();
        if (n8VarI != null) {
            return n8VarI;
        }
        n8 n8VarI2 = this.f95002d.i();
        return n8VarI2 != null ? n8VarI2 : this.f95001c.i();
    }

    @Override // io.sentry.protocol.c
    public Enumeration<String> j() {
        return A().j();
    }

    @Override // io.sentry.protocol.c
    public Object k(String str, Object obj) {
        return z().k(str, obj);
    }

    @Override // io.sentry.protocol.c
    public void l(io.sentry.protocol.c cVar) {
        z().l(cVar);
    }

    @Override // io.sentry.protocol.c
    public Object m(Object obj) {
        return z().m(obj);
    }

    @Override // io.sentry.protocol.c
    public void n(io.sentry.protocol.a aVar) {
        z().n(aVar);
    }

    @Override // io.sentry.protocol.c
    public void o(io.sentry.protocol.b bVar) {
        z().o(bVar);
    }

    @Override // io.sentry.protocol.c
    public void p(io.sentry.protocol.e eVar) {
        z().p(eVar);
    }

    @Override // io.sentry.protocol.c
    public void r(io.sentry.protocol.h hVar) {
        z().r(hVar);
    }

    @Override // io.sentry.protocol.c
    public void s(io.sentry.protocol.l lVar) {
        z().s(lVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        A().serialize(l3Var, v0Var);
    }

    @Override // io.sentry.protocol.c
    public void u(io.sentry.protocol.n nVar) {
        z().u(nVar);
    }

    @Override // io.sentry.protocol.c
    public void v(io.sentry.protocol.x xVar) {
        z().v(xVar);
    }

    @Override // io.sentry.protocol.c
    public void w(io.sentry.protocol.d0 d0Var) {
        z().w(d0Var);
    }

    @Override // io.sentry.protocol.c
    public void x(n8 n8Var) {
        z().x(n8Var);
    }
}
