package l9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends z7.g implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f117242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f117243f;

    @Override // l9.k
    public int b(long j15) {
        return ((k) zj.p.q(this.f117242e)).b(j15 - this.f117243f);
    }

    @Override // l9.k
    public List<v7.a> e(long j15) {
        return ((k) zj.p.q(this.f117242e)).e(j15 - this.f117243f);
    }

    @Override // l9.k
    public long g(int i15) {
        return ((k) zj.p.q(this.f117242e)).g(i15) + this.f117243f;
    }

    @Override // l9.k
    public int j() {
        return ((k) zj.p.q(this.f117242e)).j();
    }

    @Override // z7.g, z7.a
    public void l() {
        super.l();
        this.f117242e = null;
    }

    public void x(long j15, k kVar, long j16) {
        this.f233236b = j15;
        this.f117242e = kVar;
        if (j16 != Long.MAX_VALUE) {
            j15 = j16;
        }
        this.f117243f = j15;
    }
}
