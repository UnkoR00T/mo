package bp;

/* JADX INFO: loaded from: classes4.dex */
public class l extends b implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f20957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20961f = false;

    public l(b bVar) {
        i4(bVar);
    }

    public void A3() {
        this.f20961f = false;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        b bVarX3 = X3();
        return bVarX3 != null ? bVarX3.F1(rVar) : j.f20954c.F1(rVar);
    }

    public void J3() {
        this.f20961f = true;
    }

    public int N3() {
        return this.f20959d;
    }

    @Override // bp.q
    public boolean O0() {
        return this.f20960e;
    }

    public b X3() {
        return this.f20957b;
    }

    public long g4() {
        return this.f20958c;
    }

    public void h4(int i15) {
        this.f20959d = i15;
    }

    public boolean i3() {
        return this.f20961f;
    }

    public final void i4(b bVar) {
        this.f20957b = bVar;
    }

    public void j4(long j15) {
        this.f20958c = j15;
    }

    public String toString() {
        return "COSObject{" + this.f20958c + ", " + this.f20959d + "}";
    }
}
