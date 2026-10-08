package b0;

/* JADX INFO: loaded from: classes.dex */
final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f15551d;

    a(float f15, float f16, float f17, float f18) {
        this.f15548a = f15;
        this.f15549b = f16;
        this.f15550c = f17;
        this.f15551d = f18;
    }

    @Override // b0.h, o.l2
    /* JADX INFO: renamed from: a */
    public float getMaxZoomRatio() {
        return this.f15549b;
    }

    @Override // b0.h, o.l2
    /* JADX INFO: renamed from: b */
    public float getMinZoomRatio() {
        return this.f15550c;
    }

    @Override // b0.h, o.l2
    /* JADX INFO: renamed from: c */
    public float getZoomRatio() {
        return this.f15548a;
    }

    @Override // b0.h
    public float e() {
        return this.f15551d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f15548a) == Float.floatToIntBits(hVar.getZoomRatio()) && Float.floatToIntBits(this.f15549b) == Float.floatToIntBits(hVar.getMaxZoomRatio()) && Float.floatToIntBits(this.f15550c) == Float.floatToIntBits(hVar.getMinZoomRatio()) && Float.floatToIntBits(this.f15551d) == Float.floatToIntBits(hVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f15548a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f15549b)) * 1000003) ^ Float.floatToIntBits(this.f15550c)) * 1000003) ^ Float.floatToIntBits(this.f15551d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f15548a + ", maxZoomRatio=" + this.f15549b + ", minZoomRatio=" + this.f15550c + ", linearZoom=" + this.f15551d + "}";
    }
}
