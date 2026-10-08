package n3;

import android.graphics.Matrix;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln3/g2;", "Landroid/graphics/Matrix;", "matrix", "Loq/i0;", "b", "([FLandroid/graphics/Matrix;)V", "a", "(Landroid/graphics/Matrix;[F)V", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m0 {
    public static final void a(Matrix matrix, float[] fArr) {
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = fArr[3];
        float f19 = fArr[4];
        float f25 = fArr[5];
        float f26 = fArr[6];
        float f27 = fArr[7];
        float f28 = fArr[8];
        float f29 = fArr[12];
        float f35 = fArr[13];
        float f36 = fArr[15];
        fArr[0] = f15;
        fArr[1] = f19;
        fArr[2] = f29;
        fArr[3] = f16;
        fArr[4] = f25;
        fArr[5] = f35;
        fArr[6] = f18;
        fArr[7] = f27;
        fArr[8] = f36;
        matrix.setValues(fArr);
        fArr[0] = f15;
        fArr[1] = f16;
        fArr[2] = f17;
        fArr[3] = f18;
        fArr[4] = f19;
        fArr[5] = f25;
        fArr[6] = f26;
        fArr[7] = f27;
        fArr[8] = f28;
    }

    public static final void b(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = fArr[3];
        float f19 = fArr[4];
        float f25 = fArr[5];
        float f26 = fArr[6];
        float f27 = fArr[7];
        float f28 = fArr[8];
        fArr[0] = f15;
        fArr[1] = f18;
        fArr[2] = 0.0f;
        fArr[3] = f26;
        fArr[4] = f16;
        fArr[5] = f19;
        fArr[6] = 0.0f;
        fArr[7] = f27;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f17;
        fArr[13] = f25;
        fArr[14] = 0.0f;
        fArr[15] = f28;
    }
}
