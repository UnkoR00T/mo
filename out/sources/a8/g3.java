package a8;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.h f4462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t7.z f4466e = t7.z.f188660d;

    public g3(w7.h hVar) {
        this.f4462a = hVar;
    }

    public void a(long j15) {
        this.f4464c = j15;
        if (this.f4463b) {
            this.f4465d = this.f4462a.b();
        }
    }

    public void b() {
        if (this.f4463b) {
            return;
        }
        this.f4465d = this.f4462a.b();
        this.f4463b = true;
    }

    public void c() {
        if (this.f4463b) {
            a(m());
            this.f4463b = false;
        }
    }

    @Override // a8.c2
    public t7.z d() {
        return this.f4466e;
    }

    @Override // a8.c2
    public void i(t7.z zVar) {
        if (this.f4463b) {
            a(m());
        }
        this.f4466e = zVar;
    }

    @Override // a8.c2
    public long m() {
        long j15 = this.f4464c;
        if (!this.f4463b) {
            return j15;
        }
        long jB = this.f4462a.b() - this.f4465d;
        t7.z zVar = this.f4466e;
        return j15 + (zVar.f188663a == 1.0f ? w7.o0.J0(jB) : zVar.a(jB));
    }
}
