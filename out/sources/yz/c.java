package yz;

import android.graphics.Matrix;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/graphics/Matrix;", "", "a", "(Landroid/graphics/Matrix;)F", "b", "media_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final float a(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return -((float) (Math.atan2(fArr[1], fArr[0]) * 57.29577951308232d));
    }

    public static final float b(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        double d15 = 2.0f;
        return (float) Math.sqrt(((float) Math.pow(fArr[0], d15)) + ((float) Math.pow(fArr[3], d15)));
    }
}
