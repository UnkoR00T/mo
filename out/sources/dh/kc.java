package dh;

/* JADX INFO: loaded from: classes3.dex */
final class kc extends h6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mc f41990c;

    kc(mc mcVar, int i15) {
        super(mcVar.size(), i15);
        this.f41990c = mcVar;
    }

    @Override // dh.h6
    protected final Object a(int i15) {
        return this.f41990c.get(i15);
    }
}
