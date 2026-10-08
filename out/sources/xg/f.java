package xg;

/* JADX INFO: loaded from: classes3.dex */
final class f extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f218450c;

    f(i iVar, int i15) {
        super(iVar.size(), i15);
        this.f218450c = iVar;
    }

    @Override // xg.w
    protected final Object a(int i15) {
        return this.f218450c.get(i15);
    }
}
