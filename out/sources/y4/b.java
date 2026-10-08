package y4;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.SolidColor;
import java.util.List;
import n3.Shadow;
import n3.h1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import q4.ParagraphInfo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lq4/q;", "Ln3/h1;", "canvas", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "Ln3/w2;", "shadow", "Lb5/k;", "decoration", "Lp3/g;", "drawStyle", "Ln3/a1;", "blendMode", "Loq/i0;", "a", "(Lq4/q;Ln3/h1;Landroidx/compose/ui/graphics/c;FLn3/w2;Lb5/k;Lp3/g;I)V", "b", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void a(q4.q qVar, h1 h1Var, androidx.compose.ui.graphics.c cVar, float f15, Shadow shadow, b5.k kVar, p3.g gVar, int i15) {
        h1Var.q();
        if (qVar.C().size() <= 1 || (cVar instanceof SolidColor)) {
            b(qVar, h1Var, cVar, f15, shadow, kVar, gVar, i15);
        } else {
            if (!(cVar instanceof androidx.compose.ui.graphics.h)) {
                throw new oq.p();
            }
            List<ParagraphInfo> listC = qVar.C();
            int size = listC.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i16 = 0; i16 < size; i16++) {
                ParagraphInfo paragraphInfo = listC.get(i16);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().l());
            }
            Shader shaderC = ((androidx.compose.ui.graphics.h) cVar).c(m3.k.d((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & BodyPartID.bodyIdMax)));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            List<ParagraphInfo> listC2 = qVar.C();
            int size2 = listC2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                ParagraphInfo paragraphInfo2 = listC2.get(i17);
                paragraphInfo2.getParagraph().A(h1Var, androidx.compose.ui.graphics.d.a(shaderC), f15, shadow, kVar, gVar, i15);
                h1Var.d(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderC.setLocalMatrix(matrix);
            }
        }
        h1Var.j();
    }

    private static final void b(q4.q qVar, h1 h1Var, androidx.compose.ui.graphics.c cVar, float f15, Shadow shadow, b5.k kVar, p3.g gVar, int i15) {
        List<ParagraphInfo> listC = qVar.C();
        int size = listC.size();
        for (int i16 = 0; i16 < size; i16++) {
            ParagraphInfo paragraphInfo = listC.get(i16);
            paragraphInfo.getParagraph().A(h1Var, cVar, f15, shadow, kVar, gVar, i15);
            h1Var.d(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
