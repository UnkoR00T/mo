package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010#\u001a\u00020 *\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lm3/i;", "a", "(FFFFFF)Lm3/i;", "Lm3/a;", "cornerRadius", "d", "(FFFFJ)Lm3/i;", "Lm3/g;", "rect", "b", "(Lm3/g;FF)Lm3/i;", "e", "(Lm3/g;J)Lm3/i;", "topLeft", "topRight", "bottomRight", "bottomLeft", "c", "(Lm3/g;JJJJ)Lm3/i;", "f", "(Lm3/i;)Lm3/g;", "boundingRect", "g", "(Lm3/i;)F", "minDimension", "", "h", "(Lm3/i;)Z", "isSimple", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final i a(float f15, float f16, float f17, float f18, float f19, float f25) {
        long jB = a.b((((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f25)) & BodyPartID.bodyIdMax));
        return new i(f15, f16, f17, f18, jB, jB, jB, jB, null);
    }

    public static final i b(g gVar, float f15, float f16) {
        return a(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom(), f15, f16);
    }

    public static final i c(g gVar, long j15, long j16, long j17, long j18) {
        return new i(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom(), j15, j16, j17, j18, null);
    }

    public static final i d(float f15, float f16, float f17, float f18, long j15) {
        return a(f15, f16, f17, f18, Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }

    public static final i e(g gVar, long j15) {
        return b(gVar, Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }

    public static final g f(i iVar) {
        return new g(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
    }

    public static final float g(i iVar) {
        return Math.min(Math.abs(iVar.l()), Math.abs(iVar.f()));
    }

    public static final boolean h(i iVar) {
        long topLeftCornerRadius = iVar.getTopLeftCornerRadius();
        return (topLeftCornerRadius >>> 32) == (topLeftCornerRadius & BodyPartID.bodyIdMax) && iVar.getTopLeftCornerRadius() == iVar.getTopRightCornerRadius() && iVar.getTopLeftCornerRadius() == iVar.getBottomRightCornerRadius() && iVar.getTopLeftCornerRadius() == iVar.getBottomLeftCornerRadius();
    }
}
