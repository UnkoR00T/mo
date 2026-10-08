package qw3;

import android.graphics.RectF;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqw3/g;", "", "<init>", "()V", "Landroid/graphics/RectF;", "rectF", "", "b", "(Landroid/graphics/RectF;)[F", "corners", "c", "([F)[F", "r", "a", "array", "d", "([F)Landroid/graphics/RectF;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f169186a = new g();

    private g() {
    }

    public final float[] a(RectF r15) {
        return new float[]{r15.centerX(), r15.centerY()};
    }

    public final float[] b(RectF rectF) {
        float f15 = rectF.left;
        float f16 = rectF.top;
        float f17 = rectF.right;
        float f18 = rectF.bottom;
        return new float[]{f15, f16, f17, f16, f17, f18, f15, f18};
    }

    public final float[] c(float[] corners) {
        return new float[]{(float) Math.sqrt(Math.pow(corners[0] - corners[2], 2.0d) + Math.pow(corners[1] - corners[3], 2.0d)), (float) Math.sqrt(Math.pow(corners[2] - corners[4], 2.0d) + Math.pow(corners[3] - corners[5], 2.0d))};
    }

    public final RectF d(float[] array) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i15 = 1; i15 < array.length; i15 += 2) {
            float f15 = 10;
            float fD = hr.a.d(array[i15 - 1] * f15) / 10.0f;
            float fD2 = hr.a.d(array[i15] * f15) / 10.0f;
            rectF.left = Math.min(fD, rectF.left);
            rectF.top = Math.min(fD2, rectF.top);
            rectF.right = Math.max(fD, rectF.right);
            rectF.bottom = Math.max(fD2, rectF.bottom);
        }
        rectF.sort();
        return rectF;
    }
}
