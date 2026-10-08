package iq;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements lq.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f96170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f96171b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f96172c;

    public d(e eVar) {
        this.f96172c = eVar;
    }

    @Override // lq.b
    public Object p() {
        if (this.f96170a == null) {
            synchronized (this.f96171b) {
                try {
                    if (this.f96170a == null) {
                        this.f96170a = this.f96172c.get();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f96170a;
    }
}
