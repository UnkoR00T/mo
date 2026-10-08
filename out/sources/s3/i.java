package s3;

import n3.f2;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a'\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a+\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls3/g;", "a", "b", "", "t", "(Ls3/g;Ls3/g;F)Ls3/g;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final Shadow a(Shadow shadow, Shadow shadow2, float f15) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow == null) {
            return b(shadow2.i(), shadow2, f15);
        }
        return shadow2 == null ? b(shadow, shadow.i(), f15) : b(shadow, shadow2, f15);
    }

    public static final Shadow b(Shadow shadow, Shadow shadow2, float f15) {
        float fB = c5.i.b(shadow.getRadius(), shadow2.getRadius(), f15);
        float fB2 = c5.i.b(shadow.getSpread(), shadow2.getSpread(), f15);
        long jC = c5.i.c(shadow.getOffset(), shadow2.getOffset(), f15);
        long jH = o1.h(shadow.getColor(), shadow2.getColor(), f15);
        Object objA = f2.INSTANCE.a(shadow.getBrush(), shadow2.getBrush(), f15);
        return new Shadow(fB, fB2, jC, jH, objA instanceof androidx.compose.ui.graphics.c ? (androidx.compose.ui.graphics.c) objA : null, e5.c.b(shadow.getAlpha(), shadow2.getAlpha(), f15), f15 < 0.5f ? shadow.getBlendMode() : shadow2.getBlendMode(), null);
    }
}
