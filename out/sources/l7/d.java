package l7;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f116723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f116724b;

    protected d(float[] fArr) {
        this.f116723a = fArr;
        this.f116724b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f15) {
        if (f15 >= 1.0f) {
            return 1.0f;
        }
        if (f15 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f116723a;
        int iMin = Math.min((int) ((fArr.length - 1) * f15), fArr.length - 2);
        float f16 = this.f116724b;
        float f17 = (f15 - (iMin * f16)) / f16;
        float[] fArr2 = this.f116723a;
        float f18 = fArr2[iMin];
        return f18 + (f17 * (fArr2[iMin + 1] - f18));
    }
}
