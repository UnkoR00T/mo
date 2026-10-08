package vd;

/* JADX INFO: loaded from: classes3.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f206159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f206160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f206161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f206162d;

    public e() {
        this(2500, 1, 1.0f);
    }

    @Override // vd.r
    public int a() {
        return this.f206160b;
    }

    @Override // vd.r
    public void b(u uVar) throws u {
        this.f206160b++;
        int i15 = this.f206159a;
        this.f206159a = i15 + ((int) (i15 * this.f206162d));
        if (!d()) {
            throw uVar;
        }
    }

    @Override // vd.r
    public int c() {
        return this.f206159a;
    }

    protected boolean d() {
        return this.f206160b <= this.f206161c;
    }

    public e(int i15, int i16, float f15) {
        this.f206159a = i15;
        this.f206161c = i16;
        this.f206162d = f15;
    }
}
