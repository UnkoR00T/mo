package ch;

/* JADX INFO: loaded from: classes3.dex */
final class bl extends dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25804d;

    bl(float f15, float f16, float f17, float f18, float f19) {
        this.f25801a = f15;
        this.f25802b = f16;
        this.f25803c = f17;
        this.f25804d = f18;
    }

    @Override // ch.dl
    final float a() {
        return 0.0f;
    }

    @Override // ch.dl
    final float b() {
        return this.f25803c;
    }

    @Override // ch.dl
    final float c() {
        return this.f25801a;
    }

    @Override // ch.dl
    final float d() {
        return this.f25804d;
    }

    @Override // ch.dl
    final float e() {
        return this.f25802b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dl) {
            dl dlVar = (dl) obj;
            if (Float.floatToIntBits(this.f25801a) == Float.floatToIntBits(dlVar.c()) && Float.floatToIntBits(this.f25802b) == Float.floatToIntBits(dlVar.e()) && Float.floatToIntBits(this.f25803c) == Float.floatToIntBits(dlVar.b()) && Float.floatToIntBits(this.f25804d) == Float.floatToIntBits(dlVar.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                dlVar.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f25801a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f25802b)) * 1000003) ^ Float.floatToIntBits(this.f25803c)) * 1000003) ^ Float.floatToIntBits(this.f25804d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f25801a + ", yMin=" + this.f25802b + ", xMax=" + this.f25803c + ", yMax=" + this.f25804d + ", confidenceScore=0.0}";
    }
}
