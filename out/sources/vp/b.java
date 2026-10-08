package vp;

/* JADX INFO: loaded from: classes4.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lp.r f207794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f207795b = 12.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f207796c = 14.4f;

    b() {
    }

    lp.r a() {
        return this.f207794a;
    }

    float b() {
        return this.f207795b;
    }

    float c() {
        return this.f207796c;
    }

    void d(lp.r rVar) {
        this.f207794a = rVar;
    }

    void e(float f15) {
        this.f207795b = f15;
        this.f207796c = f15 * 1.2f;
    }

    void f(float f15) {
        this.f207796c = f15;
    }
}
