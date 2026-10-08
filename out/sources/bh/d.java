package bh;

/* JADX INFO: loaded from: classes3.dex */
final class d extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f19419c;

    d(f fVar, int i15) {
        super(fVar.size(), i15);
        this.f19419c = fVar;
    }

    @Override // bh.z0
    protected final Object a(int i15) {
        return this.f19419c.get(i15);
    }
}
