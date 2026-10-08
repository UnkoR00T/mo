package o;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f139972d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f139973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i6.d<Float, Float> f139974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i6.d<Float, Float> f139975c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f139976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i6.d<Float, Float> f139977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i6.d<Float, Float> f139978c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f139976a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f139977b = i6.d.a(fValueOf2, fValueOf2);
            this.f139978c = i6.d.a(fValueOf, fValueOf);
        }

        public h0 a() {
            return new h0(this.f139976a, this.f139977b, this.f139978c);
        }

        public b b(float f15) {
            this.f139976a = f15;
            return this;
        }

        public b c(float f15, float f16) {
            this.f139977b = i6.d.a(Float.valueOf(f15), Float.valueOf(f16));
            return this;
        }

        public b d(float f15, float f16) {
            this.f139978c = i6.d.a(Float.valueOf(f15), Float.valueOf(f16));
            return this;
        }
    }

    public float a() {
        return this.f139973a;
    }

    public i6.d<Float, Float> b() {
        return this.f139974b;
    }

    public i6.d<Float, Float> c() {
        return this.f139975c;
    }

    private h0(float f15, i6.d<Float, Float> dVar, i6.d<Float, Float> dVar2) {
        this.f139973a = f15;
        this.f139974b = dVar;
        this.f139975c = dVar2;
    }
}
