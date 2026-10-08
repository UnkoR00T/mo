package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f143185b;

    public q0(q qVar, long j15) {
        super(qVar);
        zj.p.d(qVar.getPosition() >= j15);
        this.f143185b = j15;
    }

    @Override // o8.z, o8.q
    public long a() {
        return super.a() - this.f143185b;
    }

    @Override // o8.z, o8.q
    public long getPosition() {
        return super.getPosition() - this.f143185b;
    }

    @Override // o8.z, o8.q
    public long j() {
        return super.j() - this.f143185b;
    }
}
