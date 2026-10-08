package androidx.compose.ui.platform;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ln3/i2;", "outline", "", "x", "y", "Ln3/m2;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Ln3/i2;FFLn3/m2;Ln3/m2;)Z", "Lm3/g;", "rect", "e", "(Lm3/g;FF)Z", "Ln3/i2$c;", "touchPointPath", "opPath", "f", "(Ln3/i2$c;FFLn3/m2;Ln3/m2;)Z", "Lm3/i;", "a", "(Lm3/i;)Z", "Lm3/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(Ln3/m2;FFLn3/m2;Ln3/m2;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q2 {
    private static final boolean a(m3.i iVar) {
        return Float.intBitsToFloat((int) (iVar.getTopLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (iVar.getTopRightCornerRadius() >> 32)) <= iVar.l() && Float.intBitsToFloat((int) (iVar.getBottomLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (iVar.getBottomRightCornerRadius() >> 32)) <= iVar.l() && Float.intBitsToFloat((int) (iVar.getTopLeftCornerRadius() & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (iVar.getBottomLeftCornerRadius() & BodyPartID.bodyIdMax)) <= iVar.f() && Float.intBitsToFloat((int) (iVar.getTopRightCornerRadius() & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (iVar.getBottomRightCornerRadius() & BodyPartID.bodyIdMax)) <= iVar.f();
    }

    public static final boolean b(n3.i2 i2Var, float f15, float f16, n3.m2 m2Var, n3.m2 m2Var2) {
        if (i2Var instanceof n3.i2.b) {
            return e(((n3.i2.b) i2Var).b(), f15, f16);
        }
        if (i2Var instanceof n3.i2.c) {
            return f((n3.i2.c) i2Var, f15, f16, m2Var, m2Var2);
        }
        if (i2Var instanceof n3.i2.a) {
            return d(((n3.i2.a) i2Var).getPath(), f15, f16, m2Var, m2Var2);
        }
        throw new oq.p();
    }

    public static /* synthetic */ boolean c(n3.i2 i2Var, float f15, float f16, n3.m2 m2Var, n3.m2 m2Var2, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            m2Var = null;
        }
        if ((i15 & 16) != 0) {
            m2Var2 = null;
        }
        return b(i2Var, f15, f16, m2Var, m2Var2);
    }

    private static final boolean d(n3.m2 m2Var, float f15, float f16, n3.m2 m2Var2, n3.m2 m2Var3) {
        m3.g gVar = new m3.g(f15 - 0.005f, f16 - 0.005f, f15 + 0.005f, f16 + 0.005f);
        if (m2Var2 == null) {
            m2Var2 = n3.u0.a();
        }
        n3.m2.r(m2Var2, gVar, null, 2, null);
        if (m2Var3 == null) {
            m2Var3 = n3.u0.a();
        }
        m2Var3.e(m2Var, m2Var2, n3.q2.INSTANCE.b());
        boolean zIsEmpty = m2Var3.isEmpty();
        m2Var3.reset();
        m2Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(m3.g gVar, float f15, float f16) {
        return gVar.getLeft() <= f15 && f15 < gVar.getRight() && gVar.getTop() <= f16 && f16 < gVar.getBottom();
    }

    private static final boolean f(n3.i2.c cVar, float f15, float f16, n3.m2 m2Var, n3.m2 m2Var2) {
        m3.i roundRect = cVar.getRoundRect();
        if (f15 < roundRect.getLeft() || f15 >= roundRect.getRight() || f16 < roundRect.getTop() || f16 >= roundRect.getBottom()) {
            return false;
        }
        if (!a(roundRect)) {
            n3.m2 m2VarA = m2Var2 == null ? n3.u0.a() : m2Var2;
            n3.m2.o(m2VarA, roundRect, null, 2, null);
            return d(m2VarA, f15, f16, m2Var, m2Var2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & BodyPartID.bodyIdMax));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & BodyPartID.bodyIdMax));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & BodyPartID.bodyIdMax));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & roundRect.getBottomLeftCornerRadius()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        if (f15 < left && f16 < top) {
            return g(f15, f16, roundRect.getTopLeftCornerRadius(), left, top);
        }
        if (f15 < left2 && f16 > bottom2) {
            return g(f15, f16, roundRect.getBottomLeftCornerRadius(), left2, bottom2);
        }
        if (f15 > right && f16 < top2) {
            return g(f15, f16, roundRect.getTopRightCornerRadius(), right, top2);
        }
        if (f15 <= right2 || f16 <= bottom) {
            return true;
        }
        return g(f15, f16, roundRect.getBottomRightCornerRadius(), right2, bottom);
    }

    private static final boolean g(float f15, float f16, long j15, float f17, float f18) {
        float f19 = f15 - f17;
        float f25 = f16 - f18;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        return ((f19 * f19) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f25 * f25) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
