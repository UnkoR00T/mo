package p046f2;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.n3;
import c5.d;
import c5.h;
import c5.i;
import l2.p0;
import n3.y2;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u001eR\u0011\u0010#\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020 8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\"¨\u0006%"}, d2 = {"Lf2/rq;", "", "<init>", "()V", "Lf2/pq;", "positioning", "Lc5/h;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/window/t;", "e", "(IFLm2/r;II)Landroidx/compose/ui/window/t;", "Lc5/k;", "b", "J", "getCaretSize-MYxV2XQ", "()J", "caretSize", "c", "F", "d", "()F", "plainTooltipMaxWidth", "getRichTooltipMaxWidth-D9Ej5fM", "richTooltipMaxWidth", "Lf2/ab;", "Lf2/ab;", "getDefaultCaretShape$material3", "()Lf2/ab;", "DefaultCaretShape", "Ln3/y2;", "(Lm2/r;I)Ln3/y2;", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Color;", "a", "(Lm2/r;I)J", "plainTooltipContainerColor", "plainTooltipContentColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rq f57659a = new rq();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long caretSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float plainTooltipMaxWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float richTooltipMaxWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final ab DefaultCaretShape;

    static {
        long jA = i.a(h.n(16), h.n(8));
        caretSize = jA;
        plainTooltipMaxWidth = h.n(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        richTooltipMaxWidth = h.n(320);
        DefaultCaretShape = new ab(jA, null);
    }

    private rq() {
    }

    public final long a(r rVar, int i15) {
        if (t.k()) {
            t.o(102696215, i15, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:491)");
        }
        long jI = g2.i(p0.f115149a.a(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    public final y2 b(r rVar, int i15) {
        if (t.k()) {
            t.o(49570325, i15, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:487)");
        }
        y2 y2VarH = ui.h(p0.f115149a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final long c(r rVar, int i15) {
        if (t.k()) {
            t.o(-1982928937, i15, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:495)");
        }
        long jI = g2.i(p0.f115149a.c(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    public final float d() {
        return plainTooltipMaxWidth;
    }

    public final androidx.compose.ui.window.t e(int i15, float f15, r rVar, int i16, int i17) {
        if ((i17 & 2) != 0) {
            f15 = hr.I();
        }
        if (t.k()) {
            t.o(-573803578, i16, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:714)");
        }
        int iX0 = ((d) rVar.N(g1.f())).X0(f15);
        long jA = ((n3) rVar.N(g1.v())).a();
        boolean zC = rVar.c(iX0) | ((((i16 & 14) ^ 6) > 4 && rVar.c(i15)) || (i16 & 6) == 4) | rVar.d(jA);
        Object objE = rVar.E();
        if (zC || objE == r.INSTANCE.a()) {
            ir irVar = new ir(i15, iX0, jA, null);
            rVar.v(irVar);
            objE = irVar;
        }
        ir irVar2 = (ir) objE;
        if (t.k()) {
            t.n();
        }
        return irVar2;
    }
}
