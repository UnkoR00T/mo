package n3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\u0011\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u0015\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001b*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ln3/m2;", "Ln3/i2;", "outline", "Loq/i0;", "a", "(Ln3/m2;Ln3/i2;)V", "Lp3/f;", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Lp3/g;", "style", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "d", "(Lp3/f;Ln3/i2;JFLp3/g;Ln3/n1;I)V", "Landroidx/compose/ui/graphics/c;", "brush", "b", "(Lp3/f;Ln3/i2;Landroidx/compose/ui/graphics/c;FLp3/g;Ln3/n1;I)V", "Lm3/g;", "Lm3/e;", "h", "(Lm3/g;)J", "Lm3/k;", "f", "Lm3/i;", "i", "(Lm3/i;)J", "g", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j2 {
    public static final void a(m2 m2Var, i2 i2Var) {
        if (i2Var instanceof i2.b) {
            m2.r(m2Var, ((i2.b) i2Var).b(), null, 2, null);
        } else if (i2Var instanceof i2.c) {
            m2.o(m2Var, ((i2.c) i2Var).getRoundRect(), null, 2, null);
        } else {
            if (!(i2Var instanceof i2.a)) {
                throw new oq.p();
            }
            m2.g(m2Var, ((i2.a) i2Var).getPath(), 0L, 2, null);
        }
    }

    public static final void b(p3.f fVar, i2 i2Var, androidx.compose.ui.graphics.c cVar, float f15, p3.g gVar, n1 n1Var, int i15) {
        if (i2Var instanceof i2.b) {
            m3.g gVarB = ((i2.b) i2Var).b();
            fVar.m1(cVar, h(gVarB), f(gVarB), f15, gVar, n1Var, i15);
            return;
        }
        if (!(i2Var instanceof i2.c)) {
            if (!(i2Var instanceof i2.a)) {
                throw new oq.p();
            }
            fVar.g1(((i2.a) i2Var).getPath(), cVar, f15, gVar, n1Var, i15);
            return;
        }
        i2.c cVar2 = (i2.c) i2Var;
        m2 roundRectPath = cVar2.getRoundRectPath();
        if (roundRectPath != null) {
            fVar.g1(roundRectPath, cVar, f15, gVar, n1Var, i15);
            return;
        }
        m3.i roundRect = cVar2.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        fVar.S1(cVar, i(roundRect), g(roundRect), m3.a.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f15, gVar, n1Var, i15);
    }

    public static /* synthetic */ void c(p3.f fVar, i2 i2Var, androidx.compose.ui.graphics.c cVar, float f15, p3.g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i16 & 8) != 0) {
            gVar = p3.j.f152592b;
        }
        p3.g gVar2 = gVar;
        if ((i16 & 16) != 0) {
            n1Var = null;
        }
        n1 n1Var2 = n1Var;
        if ((i16 & 32) != 0) {
            i15 = p3.f.INSTANCE.a();
        }
        b(fVar, i2Var, cVar, f16, gVar2, n1Var2, i15);
    }

    public static final void d(p3.f fVar, i2 i2Var, long j15, float f15, p3.g gVar, n1 n1Var, int i15) {
        if (i2Var instanceof i2.b) {
            m3.g gVarB = ((i2.b) i2Var).b();
            fVar.l1(j15, h(gVarB), f(gVarB), f15, gVar, n1Var, i15);
            return;
        }
        if (!(i2Var instanceof i2.c)) {
            if (!(i2Var instanceof i2.a)) {
                throw new oq.p();
            }
            fVar.c0(((i2.a) i2Var).getPath(), j15, f15, gVar, n1Var, i15);
            return;
        }
        i2.c cVar = (i2.c) i2Var;
        m2 roundRectPath = cVar.getRoundRectPath();
        if (roundRectPath != null) {
            fVar.c0(roundRectPath, j15, f15, gVar, n1Var, i15);
            return;
        }
        m3.i roundRect = cVar.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        fVar.D0(j15, i(roundRect), g(roundRect), m3.a.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), gVar, f15, n1Var, i15);
    }

    public static /* synthetic */ void e(p3.f fVar, i2 i2Var, long j15, float f15, p3.g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i16 & 8) != 0) {
            gVar = p3.j.f152592b;
        }
        p3.g gVar2 = gVar;
        if ((i16 & 16) != 0) {
            n1Var = null;
        }
        d(fVar, i2Var, j15, f16, gVar2, n1Var, (i16 & 32) != 0 ? p3.f.INSTANCE.a() : i15);
    }

    private static final long f(m3.g gVar) {
        float right = gVar.getRight() - gVar.getLeft();
        return m3.k.d((((long) Float.floatToRawIntBits(gVar.getBottom() - gVar.getTop())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(right) << 32));
    }

    private static final long g(m3.i iVar) {
        float fL = iVar.l();
        float f15 = iVar.f();
        return m3.k.d((((long) Float.floatToRawIntBits(fL)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
    }

    private static final long h(m3.g gVar) {
        float left = gVar.getLeft();
        float top = gVar.getTop();
        return m3.e.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax));
    }

    private static final long i(m3.i iVar) {
        float left = iVar.getLeft();
        float top = iVar.getTop();
        return m3.e.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax));
    }
}
