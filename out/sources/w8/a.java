package w8;

import o8.k0;
import o8.n0;
import o8.p;
import o8.q;
import o8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f210882a;

    public a(int i15) {
        if ((i15 & 1) != 0) {
            this.f210882a = new n0(65496, 2, "image/jpeg");
        } else {
            this.f210882a = new b();
        }
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f210882a.a(j15, j16);
    }

    @Override // o8.p
    public void b() {
        this.f210882a.b();
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return this.f210882a.c(qVar);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f210882a.d(rVar);
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        return this.f210882a.g(qVar, k0Var);
    }
}
