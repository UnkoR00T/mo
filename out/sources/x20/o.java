package x20;

/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f216568d = new o(0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f216569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f216570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f216571c;

    public o(float f15, float f16, float f17) {
        this.f216569a = f15;
        this.f216570b = f16;
        this.f216571c = f17;
    }

    public static o b(o... oVarArr) {
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (o oVar : oVarArr) {
            f15 += oVar.f216569a;
            f17 += oVar.f216570b;
            f16 += oVar.f216571c;
        }
        return new o(f15, f17, f16);
    }

    public float[] a() {
        return new float[]{this.f216569a, this.f216570b, this.f216571c};
    }
}
