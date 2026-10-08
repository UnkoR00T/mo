package j9;

import o8.k0;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.u;
import t7.x;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public class d implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f100355d = new u() { // from class: j9.c
        @Override // o8.u
        public final p[] f() {
            return d.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f100356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f100357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f100358c;

    public static /* synthetic */ p[] h() {
        return new p[]{new d()};
    }

    private static c0 i(c0 c0Var) {
        c0Var.f0(0);
        return c0Var;
    }

    private boolean j(q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f100365b & 2) == 2) {
            int iMin = Math.min(fVar.f100372i, 8);
            c0 c0Var = new c0(iMin);
            qVar.p(c0Var.f(), 0, iMin);
            if (b.p(i(c0Var))) {
                this.f100357b = new b();
            } else if (j.r(i(c0Var))) {
                this.f100357b = new j();
            } else if (h.o(i(c0Var))) {
                this.f100357b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        i iVar = this.f100357b;
        if (iVar != null) {
            iVar.m(j15, j16);
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        try {
            return j(qVar);
        } catch (x unused) {
            return false;
        }
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f100356a = rVar;
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws x {
        zj.p.q(this.f100356a);
        if (this.f100357b == null) {
            if (!j(qVar)) {
                throw x.a("Failed to determine bitstream type", null);
            }
            qVar.g();
        }
        if (!this.f100358c) {
            s0 s0VarV = this.f100356a.v(0, 1);
            this.f100356a.s();
            this.f100357b.d(this.f100356a, s0VarV);
            this.f100358c = true;
        }
        return this.f100357b.g(qVar, k0Var);
    }
}
