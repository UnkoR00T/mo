package h8;

import a8.b2;
import a8.f3;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements b0, b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.b f81826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8.b f81828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c0 f81829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b0 f81830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b0.a f81831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f81832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f81833h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f81834j = -9223372036854775807L;

    public interface a {
        void a(c0.b bVar, IOException iOException);

        void b(c0.b bVar);
    }

    public y(c0.b bVar, k8.b bVar2, long j15) {
        this.f81826a = bVar;
        this.f81828c = bVar2;
        this.f81827b = j15;
    }

    private long o(long j15) {
        long j16 = this.f81834j;
        return j16 != -9223372036854775807L ? j16 : j15;
    }

    @Override // h8.b0, h8.a1
    public long a() {
        return ((b0) w7.o0.h(this.f81830e)).a();
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        b0 b0Var = this.f81830e;
        return b0Var != null && b0Var.b();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        b0 b0Var = this.f81830e;
        return b0Var != null && b0Var.c(b2Var);
    }

    @Override // h8.b0, h8.a1
    public long d() {
        return ((b0) w7.o0.h(this.f81830e)).d();
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
        ((b0) w7.o0.h(this.f81830e)).e(j15);
    }

    @Override // h8.b0.a
    public void f(b0 b0Var) {
        ((b0.a) w7.o0.h(this.f81831f)).f(this);
        a aVar = this.f81832g;
        if (aVar != null) {
            aVar.b(this.f81826a);
        }
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        return ((b0) w7.o0.h(this.f81830e)).h(j15, f3Var);
    }

    @Override // h8.b0
    public long i(long j15) {
        return ((b0) w7.o0.h(this.f81830e)).i(j15);
    }

    public void j(c0.b bVar) {
        long jO = o(this.f81827b);
        b0 b0VarE = ((c0) zj.p.q(this.f81829d)).e(bVar, this.f81828c, jO);
        this.f81830e = b0VarE;
        if (this.f81831f != null) {
            b0VarE.p(this, jO);
        }
    }

    @Override // h8.b0
    public long k() {
        return ((b0) w7.o0.h(this.f81830e)).k();
    }

    public long l() {
        return this.f81834j;
    }

    public long m() {
        return this.f81827b;
    }

    @Override // h8.b0
    public long n(long j15) {
        b0 b0Var = this.f81830e;
        if (b0Var != null) {
            return b0Var.n(j15);
        }
        return Long.MIN_VALUE;
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        this.f81831f = aVar;
        b0 b0Var = this.f81830e;
        if (b0Var != null) {
            b0Var.p(this, o(this.f81827b));
        }
    }

    @Override // h8.b0
    public void q() throws IOException {
        try {
            b0 b0Var = this.f81830e;
            if (b0Var != null) {
                b0Var.q();
                return;
            }
            c0 c0Var = this.f81829d;
            if (c0Var != null) {
                c0Var.j();
            }
        } catch (IOException e15) {
            a aVar = this.f81832g;
            if (aVar == null) {
                throw e15;
            }
            if (this.f81833h) {
                return;
            }
            this.f81833h = true;
            aVar.a(this.f81826a, e15);
        }
    }

    @Override // h8.a1.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void g(b0 b0Var) {
        ((b0.a) w7.o0.h(this.f81831f)).g(this);
    }

    public void s(long j15) {
        this.f81834j = j15;
    }

    @Override // h8.b0
    public j1 t() {
        return ((b0) w7.o0.h(this.f81830e)).t();
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        long j16 = this.f81834j;
        long j17 = (j16 == -9223372036854775807L || j15 != this.f81827b) ? j15 : j16;
        this.f81834j = -9223372036854775807L;
        return ((b0) w7.o0.h(this.f81830e)).u(rVarArr, zArr, z0VarArr, zArr2, j17);
    }

    public void v() {
        if (this.f81830e != null) {
            ((c0) zj.p.q(this.f81829d)).p(this.f81830e);
        }
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
        ((b0) w7.o0.h(this.f81830e)).w(j15, z15);
    }

    public void x(c0 c0Var) {
        zj.p.w(this.f81829d == null);
        this.f81829d = c0Var;
    }
}
