package si;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public class g implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f181925a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f181926b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f181927c = new Matrix();

    public Matrix a(float f15, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f181925a);
        matrix2.getValues(this.f181926b);
        for (int i15 = 0; i15 < 9; i15++) {
            float[] fArr = this.f181926b;
            float f16 = fArr[i15];
            float f17 = this.f181925a[i15];
            fArr[i15] = f17 + ((f16 - f17) * f15);
        }
        this.f181927c.setValues(this.f181926b);
        return this.f181927c;
    }
}
