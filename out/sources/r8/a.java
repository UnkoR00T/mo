package r8;

import o8.k0;
import o8.n0;
import o8.p;
import o8.q;
import o8.r;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f172323a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f172324b = new n0(-1, -1, "image/avif");

    private boolean h(q qVar, int i15) {
        this.f172323a.b0(4);
        qVar.p(this.f172323a.f(), 0, 4);
        return this.f172323a.S() == ((long) i15);
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f172324b.a(j15, j16);
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        qVar.k(4);
        return h(qVar, 1718909296) && h(qVar, 1635150182);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f172324b.d(rVar);
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        return this.f172324b.g(qVar, k0Var);
    }
}
