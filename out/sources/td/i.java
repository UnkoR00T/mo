package td;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f189601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f189602b;

    public void a(float f15) {
        float f16 = this.f189601a + f15;
        this.f189601a = f16;
        int i15 = this.f189602b + 1;
        this.f189602b = i15;
        if (i15 == Integer.MAX_VALUE) {
            this.f189601a = f16 / 2.0f;
            this.f189602b = i15 / 2;
        }
    }
}
