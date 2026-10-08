package p046f2;

import androidx.compose.ui.graphics.Color;
import c5.t;
import l2.f0;
import l2.m;
import l2.r0;
import m3.e;
import m3.k;
import n3.a3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.r;
import p3.d;
import p3.f;
import u0.q1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010!\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0012R \u0010$\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0012R \u0010'\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0010\u0012\u0004\b&\u0010\u0003\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b%\u0010.R\u0011\u00100\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010.R\u0011\u00102\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u00103\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010.¨\u00064"}, d2 = {"Lf2/xg;", "", "<init>", "()V", "Lp3/f;", "drawScope", "Lc5/h;", "stopSize", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/a3;", "strokeCap", "Loq/i0;", "a", "(Lp3/f;FJI)V", "b", "F", "g", "()F", "CircularStrokeWidth", "c", "I", "j", "()I", "LinearStrokeCap", "d", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "e", "CircularIndeterminateStrokeCap", "f", "l", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "LinearTrackStopIndicatorSize", "i", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "h", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "Lu0/q1;", "", "Lu0/q1;", "getProgressAnimationSpec", "()Lu0/q1;", "ProgressAnimationSpec", "(Lm2/r;I)J", "linearColor", "circularColor", "k", "linearTrackColor", "circularIndeterminateTrackColor", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xg f58287a = new xg();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float CircularStrokeWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int LinearStrokeCap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int CircularDeterminateStrokeCap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int CircularIndeterminateStrokeCap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float LinearTrackStopIndicatorSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float LinearIndicatorTrackGapSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float CircularIndicatorTrackGapSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final q1<Float> ProgressAnimationSpec;

    static {
        m mVar = m.f114914a;
        CircularStrokeWidth = mVar.c();
        a3.Companion companion = a3.INSTANCE;
        LinearStrokeCap = companion.b();
        CircularDeterminateStrokeCap = companion.b();
        CircularIndeterminateStrokeCap = companion.b();
        f0 f0Var = f0.f114495a;
        LinearTrackStopIndicatorSize = f0Var.b();
        LinearIndicatorTrackGapSize = f0Var.c();
        CircularIndicatorTrackGapSize = mVar.b();
        ProgressAnimationSpec = new q1<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private xg() {
    }

    private static final void b(f fVar, int i15, long j15, float f15, float f16) {
        if (a3.e(i15, a3.INSTANCE.b())) {
            float f17 = f15 / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.a() >> 32)) - f17) - f16;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)) / 2.0f;
            f.x2(fVar, j15, f17, e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))), 0.0f, null, null, 0, 120, null);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (fVar.a() >> 32)) - f15) - f16;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)) - f15) / 2.0f;
        f.c2(fVar, j15, e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & BodyPartID.bodyIdMax)), k.d((((long) Float.floatToRawIntBits(f15)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(f15)))), 0.0f, null, null, 0, 120, null);
    }

    public final void a(f drawScope, float stopSize, long color, int strokeCap) {
        float fMin = Math.min(drawScope.l2(stopSize), Float.intBitsToFloat((int) (drawScope.a() & BodyPartID.bodyIdMax)));
        float fL2 = drawScope.l2(C6457hh.A());
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.a() & BodyPartID.bodyIdMax)) - fMin) / 2;
        float f15 = fIntBitsToFloat > fL2 ? fL2 : fIntBitsToFloat;
        if (drawScope.getLayoutDirection() != t.Rtl) {
            b(drawScope, strokeCap, color, fMin, f15);
            return;
        }
        long jY2 = drawScope.y2();
        d drawContext = drawScope.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().h(-1.0f, 1.0f, jY2);
            b(drawScope, strokeCap, color, fMin, f15);
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    public final long c(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1803349725, i15, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:821)");
        }
        long jI = g2.i(r0.f115221a.a(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jI;
    }

    public final int d() {
        return CircularIndeterminateStrokeCap;
    }

    public final long e(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1947901123, i15, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:842)");
        }
        long jG = Color.INSTANCE.g();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jG;
    }

    public final float f() {
        return CircularIndicatorTrackGapSize;
    }

    public final float g() {
        return CircularStrokeWidth;
    }

    public final long h(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-914312983, i15, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:817)");
        }
        long jI = g2.i(r0.f115221a.a(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jI;
    }

    public final float i() {
        return LinearIndicatorTrackGapSize;
    }

    public final int j() {
        return LinearStrokeCap;
    }

    public final long k(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1677541593, i15, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:825)");
        }
        long jI = g2.i(r0.f115221a.b(), rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jI;
    }

    public final float l() {
        return LinearTrackStopIndicatorSize;
    }
}
