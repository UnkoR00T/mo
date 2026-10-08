package d9;

import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40400b;

    public d(float f15, int i15) {
        this.f40399a = f15;
        this.f40400b = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f40399a == dVar.f40399a && this.f40400b == dVar.f40400b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + ek.d.a(this.f40399a)) * 31) + this.f40400b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f40399a + ", svcTemporalLayerCount=" + this.f40400b;
    }
}
