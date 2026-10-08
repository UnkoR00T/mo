package x9;

import o8.k0;
import o8.n0;
import o8.p;
import o8.q;
import o8.r;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f217436a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f217437b = new n0(-1, -1, "image/webp");

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f217437b.a(j15, j16);
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        this.f217436a.b0(4);
        qVar.p(this.f217436a.f(), 0, 4);
        if (this.f217436a.S() != 1380533830) {
            return false;
        }
        qVar.k(4);
        this.f217436a.b0(4);
        qVar.p(this.f217436a.f(), 0, 4);
        return this.f217436a.S() == 1464156752;
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f217437b.d(rVar);
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        return this.f217437b.g(qVar, k0Var);
    }
}
