package y;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f222513a = new float[16];

    private static void a(float[] fArr, float f15, float f16) {
        Matrix.translateM(fArr, 0, -f15, -f16, 0.0f);
    }

    private static void b(float[] fArr, float f15, float f16) {
        Matrix.translateM(fArr, 0, f15, f16, 0.0f);
    }

    public static void c(float[] fArr, float f15, float f16, float f17) {
        b(fArr, f16, f17);
        Matrix.rotateM(fArr, 0, f15, 0.0f, 0.0f, 1.0f);
        a(fArr, f16, f17);
    }

    public static void d(float[] fArr, float f15) {
        b(fArr, 0.0f, f15);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        a(fArr, 0.0f, f15);
    }
}
