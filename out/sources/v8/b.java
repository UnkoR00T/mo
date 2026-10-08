package v8;

import o8.k0;
import o8.n0;
import o8.p;
import o8.q;
import o8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f204416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f204417b;

    public b(int i15) {
        boolean z15 = (i15 & 1) != 0;
        this.f204417b = z15;
        if (z15) {
            this.f204416a = new n0(-1, -1, "image/heif");
        } else {
            this.f204416a = new a();
        }
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f204416a.a(j15, j16);
    }

    @Override // o8.p
    public void b() {
        this.f204416a.b();
    }

    @Override // o8.p
    public boolean c(q qVar) {
        return this.f204417b ? c.a(qVar, false) : this.f204416a.c(qVar);
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f204416a.d(rVar);
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        return this.f204416a.g(qVar, k0Var);
    }
}
