package v;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class c extends z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f202510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l3 f202511d;

    public c(j0 j0Var, l3 l3Var) {
        super(j0Var);
        this.f202510c = j0Var;
        this.f202511d = l3Var;
    }

    @Override // v.z1, o.j
    public com.google.common.util.concurrent.q<Void> f(float f15) {
        Range<Float> rangeG;
        if (!y.u.a(this.f202511d, 0)) {
            return a0.f.f(new IllegalStateException("Zoom is not supported"));
        }
        l3 l3Var = this.f202511d;
        if (l3Var == null || (rangeG = l3Var.g()) == null || (f15 >= ((Float) rangeG.getLower()).floatValue() && f15 <= ((Float) rangeG.getUpper()).floatValue())) {
            return this.f202510c.f(f15);
        }
        return a0.f.f(new IllegalArgumentException("Requested zoomRatio " + f15 + " is not within valid range [" + rangeG.getLower() + " , " + rangeG.getUpper() + "]"));
    }
}
