package q4;

import androidx.compose.ui.graphics.Color;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq4/x3;", "", "<init>", "()V", "Ln3/h1;", "canvas", "Lq4/t3;", "textLayoutResult", "Loq/i0;", "a", "(Ln3/h1;Lq4/t3;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3 f164647a = new x3();

    private x3() {
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    public final void a(n3.h1 canvas, TextLayoutResult textLayoutResult) throws Throwable {
        n3.h1 h1Var;
        Throwable th4;
        n3.h1 h1Var2;
        float alpha;
        boolean z15 = textLayoutResult.i() && !b5.v.g(textLayoutResult.getLayoutInput().getOverflow(), b5.v.INSTANCE.e());
        if (z15) {
            float size = (int) (textLayoutResult.getSize() >> 32);
            m3.g gVarC = m3.h.c(m3.e.INSTANCE.c(), m3.k.d((((long) Float.floatToRawIntBits((int) (textLayoutResult.getSize() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(size)) << 32)));
            canvas.q();
            h1Var = null;
            n3.h1.w(canvas, gVarC, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        b5.k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = b5.k.INSTANCE.c();
        }
        b5.k kVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        p3.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = p3.j.f152592b;
        }
        p3.g gVar = drawStyle;
        try {
            androidx.compose.ui.graphics.c cVarF = spanStyle.f();
            try {
                if (cVarF != null) {
                    if (spanStyle.getTextForegroundStyle() != b5.p.b.f16647b) {
                        try {
                            alpha = spanStyle.getTextForegroundStyle().getAlpha();
                        } catch (Throwable th5) {
                            th4 = th5;
                            h1Var = canvas;
                            if (z15) {
                                throw th4;
                            }
                            h1Var.j();
                            throw th4;
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    h1Var2 = canvas;
                    q.N(textLayoutResult.getMultiParagraph(), h1Var2, cVarF, alpha, shadow2, kVar, gVar, 0, 64, null);
                } else {
                    h1Var2 = canvas;
                    textLayoutResult.getMultiParagraph().K(h1Var2, (32 & 2) != 0 ? Color.INSTANCE.h() : spanStyle.getTextForegroundStyle() != b5.p.b.f16647b ? spanStyle.getTextForegroundStyle().getValue() : Color.INSTANCE.a(), (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? gVar : null, (32 & 32) != 0 ? p3.f.INSTANCE.a() : 0);
                }
                if (z15) {
                    h1Var2.j();
                }
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
                if (z15) {
                    throw th4;
                }
                h1Var.j();
                throw th4;
            }
        } catch (Throwable th7) {
            th = th7;
            h1Var = canvas;
        }
    }
}
