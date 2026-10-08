package w0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0018\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J#\u0010\u001a\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J/\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lw0/a1;", "Lg4/j;", "Lg4/q;", "Lg4/g;", "pointerInputNode", "Lw0/d;", "overscrollEffect", "Lw0/m0;", "edgeEffectWrapper", "Ld1/d3;", "glowDrawPadding", "<init>", "(Lg4/g;Lw0/d;Lw0/m0;Ld1/d3;)V", "Lp3/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "canvas", "", "u3", "(Lp3/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "w3", "right", "v3", "bottom", "t3", "", "rotationDegrees", "Lm3/e;", "offset", "edgeEffect", "x3", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lp3/c;", "Loq/i0;", "y", "(Lp3/c;)V", "v", "Lw0/d;", "w", "Lw0/m0;", "x", "Ld1/d3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a1 extends g4.j implements g4.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final d overscrollEffect;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final m0 edgeEffectWrapper;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final d1.d3 glowDrawPadding;

    public a1(g4.g gVar, d dVar, m0 m0Var, d1.d3 d3Var) {
        this.overscrollEffect = dVar;
        this.edgeEffectWrapper = m0Var;
        this.glowDrawPadding = d3Var;
        n3(gVar);
    }

    private final boolean t3(p3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fL2 = fVar.l2(this.glowDrawPadding.getBottom());
        float f15 = -Float.intBitsToFloat((int) (fVar.a() >> 32));
        float f16 = (-Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax))) + fL2;
        return x3(180.0f, m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax)), edgeEffect, canvas);
    }

    private final boolean u3(p3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float f15 = -Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
        float fL2 = fVar.l2(this.glowDrawPadding.c(fVar.getLayoutDirection()));
        return x3(270.0f, m3.e.e((((long) Float.floatToRawIntBits(f15)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(fL2)))), edgeEffect, canvas);
    }

    private final boolean v3(p3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return x3(90.0f, m3.e.e((((long) Float.floatToRawIntBits((-hr.a.d(Float.intBitsToFloat((int) (fVar.a() >> 32)))) + fVar.l2(this.glowDrawPadding.b(fVar.getLayoutDirection())))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean w3(p3.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fL2 = fVar.l2(this.glowDrawPadding.getTop());
        return x3(0.0f, m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fL2)) & BodyPartID.bodyIdMax)), edgeEffect, canvas);
    }

    private final boolean x3(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        this.overscrollEffect.p(cVar.a());
        if (m3.k.k(cVar.a())) {
            cVar.H2();
            return;
        }
        cVar.H2();
        this.overscrollEffect.i().getValue();
        Canvas canvasD = n3.f0.d(cVar.getDrawContext().f());
        m0 m0Var = this.edgeEffectWrapper;
        boolean zU3 = m0Var.s() ? u3(cVar, m0Var.i(), canvasD) : false;
        if (m0Var.z()) {
            zU3 = w3(cVar, m0Var.m(), canvasD) || zU3;
        }
        if (m0Var.v()) {
            zU3 = v3(cVar, m0Var.k(), canvasD) || zU3;
        }
        if (m0Var.p()) {
            zU3 = t3(cVar, m0Var.g(), canvasD) || zU3;
        }
        if (zU3) {
            this.overscrollEffect.j();
        }
    }
}
