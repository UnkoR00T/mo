package q4;

import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lp3/f;", "Lq4/t3;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", "color", "Lm3/e;", "topLeft", "", "alpha", "Ln3/w2;", "shadow", "Lb5/k;", "textDecoration", "Lp3/g;", "drawStyle", "Ln3/a1;", "blendMode", "Loq/i0;", "b", "(Lp3/f;Lq4/t3;JJFLn3/w2;Lb5/k;Lp3/g;I)V", "Lp3/h;", "a", "(Lp3/h;Lq4/t3;)V", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y3 {
    private static final void a(p3.h hVar, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.i() || b5.v.g(textLayoutResult.getLayoutInput().getOverflow(), b5.v.INSTANCE.e())) {
            return;
        }
        p3.h.g(hVar, 0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & BodyPartID.bodyIdMax), 0, 16, null);
    }

    public static final void b(p3.f fVar, TextLayoutResult textLayoutResult, long j15, long j16, float f15, Shadow shadow, b5.k kVar, p3.g gVar, int i15) {
        Shadow shadowZ = shadow == null ? textLayoutResult.getLayoutInput().getStyle().z() : shadow;
        b5.k kVarC = kVar == null ? textLayoutResult.getLayoutInput().getStyle().C() : kVar;
        p3.g gVarK = gVar == null ? textLayoutResult.getLayoutInput().getStyle().k() : gVar;
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            p3.h transform = drawContext.getTransform();
            transform.d(Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j16)));
            a(transform, textLayoutResult);
            androidx.compose.ui.graphics.c cVarI = textLayoutResult.getLayoutInput().getStyle().i();
            if (cVarI == null || j15 != 16) {
                q multiParagraph = textLayoutResult.getMultiParagraph();
                n3.h1 h1VarF = fVar.getDrawContext().f();
                if (j15 == 16) {
                    j15 = textLayoutResult.getLayoutInput().getStyle().j();
                }
                multiParagraph.K(h1VarF, b5.m.c(j15, f15), shadowZ, kVarC, gVarK, i15);
            } else {
                textLayoutResult.getMultiParagraph().M(fVar.getDrawContext().f(), cVarI, !Float.isNaN(f15) ? f15 : textLayoutResult.getLayoutInput().getStyle().f(), shadowZ, kVarC, gVarK, i15);
            }
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }
}
