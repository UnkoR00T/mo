package ud;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f197601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f197602b;

    public d(float f15, float f16) {
        this.f197601a = f15;
        this.f197602b = f16;
    }

    public boolean a(float f15, float f16) {
        return this.f197601a == f15 && this.f197602b == f16;
    }

    public float b() {
        return this.f197601a;
    }

    public float c() {
        return this.f197602b;
    }

    public void d(float f15, float f16) {
        this.f197601a = f15;
        this.f197602b = f16;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
