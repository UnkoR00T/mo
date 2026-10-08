package t3;

import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.platform.g1;
import n3.n1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020#*\u00020#2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lt3/d;", "image", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "g", "(Lt3/d;Lm2/r;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lc5/d;", "Lc5/h;", "defaultWidth", "defaultHeight", "Lm3/k;", "e", "(Lc5/d;FF)J", "defaultSize", "", "viewportWidth", "viewportHeight", "f", "(JFF)J", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Ln3/a1;", "tintBlendMode", "Ln3/n1;", "b", "(JI)Ln3/n1;", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "a", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Ln3/n1;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "density", "imageVector", "Lt3/c;", "root", "d", "(Lc5/d;Lt3/d;Lt3/c;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lt3/n;", "currentGroup", "c", "(Lt3/c;Lt3/n;)Lt3/c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final VectorPainter a(VectorPainter vectorPainter, long j15, long j16, String str, n1 n1Var, boolean z15) {
        vectorPainter.w(j15);
        vectorPainter.s(z15);
        vectorPainter.u(n1Var);
        vectorPainter.x(j16);
        vectorPainter.v(str);
        return vectorPainter;
    }

    private static final n1 b(long j15, int i15) {
        if (j15 != 16) {
            return n1.INSTANCE.a(j15, i15);
        }
        return null;
    }

    public static final c c(c cVar, n nVar) {
        int iQ = nVar.q();
        for (int i15 = 0; i15 < iQ; i15++) {
            p pVarF = nVar.f(i15);
            if (pVarF instanceof r) {
                g gVar = new g();
                r rVar = (r) pVarF;
                gVar.l(rVar.h());
                gVar.m(rVar.getPathFillType());
                gVar.k(rVar.getName());
                gVar.i(rVar.getFill());
                gVar.j(rVar.getFillAlpha());
                gVar.n(rVar.getStroke());
                gVar.o(rVar.getStrokeAlpha());
                gVar.s(rVar.getStrokeLineWidth());
                gVar.p(rVar.getStrokeLineCap());
                gVar.q(rVar.getStrokeLineJoin());
                gVar.r(rVar.getStrokeLineMiter());
                gVar.v(rVar.getTrimPathStart());
                gVar.t(rVar.getTrimPathEnd());
                gVar.u(rVar.getTrimPathOffset());
                cVar.i(i15, gVar);
            } else if (pVarF instanceof n) {
                c cVar2 = new c();
                n nVar2 = (n) pVarF;
                cVar2.p(nVar2.getName());
                cVar2.s(nVar2.getRotation());
                cVar2.t(nVar2.getScaleX());
                cVar2.u(nVar2.getScaleY());
                cVar2.v(nVar2.getTranslationX());
                cVar2.w(nVar2.getTranslationY());
                cVar2.q(nVar2.getPivotX());
                cVar2.r(nVar2.getPivotY());
                cVar2.o(nVar2.g());
                c(cVar2, nVar2);
                cVar.i(i15, cVar2);
            }
        }
        return cVar;
    }

    public static final VectorPainter d(c5.d dVar, d dVar2, c cVar) {
        long jE = e(dVar, dVar2.getDefaultWidth(), dVar2.getDefaultHeight());
        return a(new VectorPainter(cVar), jE, f(jE, dVar2.getViewportWidth(), dVar2.getViewportHeight()), dVar2.getName(), b(dVar2.getTintColor(), dVar2.getTintBlendMode()), dVar2.getAutoMirror());
    }

    private static final long e(c5.d dVar, float f15, float f16) {
        float fL2 = dVar.l2(f15);
        float fL3 = dVar.l2(f16);
        return m3.k.d((((long) Float.floatToRawIntBits(fL2)) << 32) | (((long) Float.floatToRawIntBits(fL3)) & BodyPartID.bodyIdMax));
    }

    private static final long f(long j15, float f15, float f16) {
        if (Float.isNaN(f15)) {
            f15 = Float.intBitsToFloat((int) (j15 >> 32));
        }
        if (Float.isNaN(f16)) {
            f16 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        }
        return m3.k.d((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
    }

    public static final VectorPainter g(d dVar, p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(1413834416, i15, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        c5.d dVar2 = (c5.d) rVar.N(g1.f());
        float genId = dVar.getGenId();
        boolean zD = rVar.d((((long) Float.floatToRawIntBits(dVar2.getDensity())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(genId) << 32));
        Object objE = rVar.E();
        if (zD || objE == p076m2.r.INSTANCE.a()) {
            c cVar = new c();
            c(cVar, dVar.getRoot());
            i0 i0Var = i0.f148189a;
            objE = d(dVar2, dVar, cVar);
            rVar.v(objE);
        }
        VectorPainter vectorPainter = (VectorPainter) objE;
        if (t.k()) {
            t.n();
        }
        return vectorPainter;
    }
}
