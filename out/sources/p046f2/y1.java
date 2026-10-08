package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import l2.c0;
import n3.o1;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u00020\u000e*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lf2/y1;", "", "<init>", "()V", "Lc5/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Lf2/z1;", "c", "(FFFFFFLm2/r;II)Lf2/z1;", "Lf2/x1;", "a", "(Lm2/r;I)Lf2/x1;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLm2/r;II)Lf2/x1;", "Ln3/y2;", "e", "(Lm2/r;I)Ln3/y2;", "shape", "Lf2/e2;", "d", "(Lf2/e2;)Lf2/x1;", "defaultCardColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f58315a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58316b = 0;

    private y1() {
    }

    public final x1 a(r rVar, int i15) {
        if (t.k()) {
            t.o(-1876034303, i15, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        x1 x1VarD = d(d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return x1VarD;
    }

    public final x1 b(long j15, long j16, long j17, long j18, r rVar, int i15, int i16) {
        long j19;
        long jM9copywmQWz5c$default;
        long jH = (i16 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jE = (i16 & 2) != 0 ? g2.e(jH, rVar, i15 & 14) : j16;
        long jH2 = (i16 & 4) != 0 ? Color.INSTANCE.h() : j17;
        if ((i16 & 8) != 0) {
            long j25 = jE;
            jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(j25, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j19 = j25;
        } else {
            j19 = jE;
            jM9copywmQWz5c$default = j18;
        }
        if (t.k()) {
            t.o(-1589582123, i15, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        x1 x1VarC = d(d.f9816a.a(rVar, 6)).c(jH, j19, jH2, jM9copywmQWz5c$default);
        if (t.k()) {
            t.n();
        }
        return x1VarC;
    }

    public final z1 c(float f15, float f16, float f17, float f18, float f19, float f25, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f15 = c0.f114342a.b();
        }
        if ((i16 & 2) != 0) {
            f16 = c0.f114342a.j();
        }
        if ((i16 & 4) != 0) {
            f17 = c0.f114342a.h();
        }
        if ((i16 & 8) != 0) {
            f18 = c0.f114342a.i();
        }
        if ((i16 & 16) != 0) {
            f19 = c0.f114342a.g();
        }
        float f26 = f19;
        if ((i16 & 32) != 0) {
            f25 = c0.f114342a.e();
        }
        if (t.k()) {
            t.o(-574898487, i15, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        float f27 = f25;
        float f28 = f17;
        float f29 = f15;
        z1 z1Var = new z1(f29, f16, f28, f18, f26, f27, null);
        if (t.k()) {
            t.n();
        }
        return z1Var;
    }

    public final x1 d(ColorScheme colorScheme) {
        x1 defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        c0 c0Var = c0.f114342a;
        x1 x1Var = new x1(g2.h(colorScheme, c0Var.a()), g2.d(colorScheme, g2.h(colorScheme, c0Var.a())), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, c0Var.d()), c0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, c0Var.a())), Color.m9copywmQWz5c$default(g2.d(colorScheme, g2.h(colorScheme, c0Var.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.m0(x1Var);
        return x1Var;
    }

    public final y2 e(r rVar, int i15) {
        if (t.k()) {
            t.o(1266660211, i15, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        y2 y2VarH = ui.h(c0.f114342a.c(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }
}
