package w0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lw0/l3;", "Lg4/j;", "Lg4/q;", "Lg4/g;", "pointerInputNode", "Lw0/d;", "overscrollEffect", "Lw0/m0;", "edgeEffectWrapper", "<init>", "(Lg4/g;Lw0/d;Lw0/m0;)V", "", "A3", "()Z", "z3", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "canvas", "u3", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "w3", "right", "v3", "bottom", "t3", "", "rotationDegrees", "edgeEffect", "x3", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lp3/c;", "Loq/i0;", "y", "(Lp3/c;)V", "v", "Lw0/d;", "w", "Lw0/m0;", "Landroid/graphics/RenderNode;", "x", "Landroid/graphics/RenderNode;", "_renderNode", "y3", "()Landroid/graphics/RenderNode;", "renderNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l3 extends g4.j implements g4.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final d overscrollEffect;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final m0 edgeEffectWrapper;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private RenderNode _renderNode;

    public l3(g4.g gVar, d dVar, m0 m0Var) {
        this.overscrollEffect = dVar;
        this.edgeEffectWrapper = m0Var;
        n3(gVar);
    }

    private final boolean A3() {
        m0 m0Var = this.edgeEffectWrapper;
        return m0Var.z() || m0Var.A() || m0Var.p() || m0Var.q();
    }

    private final boolean t3(EdgeEffect bottom, Canvas canvas) {
        return x3(180.0f, bottom, canvas);
    }

    private final boolean u3(EdgeEffect left, Canvas canvas) {
        return x3(270.0f, left, canvas);
    }

    private final boolean v3(EdgeEffect right, Canvas canvas) {
        return x3(90.0f, right, canvas);
    }

    private final boolean w3(EdgeEffect top, Canvas canvas) {
        return x3(0.0f, top, canvas);
    }

    private final boolean x3(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final RenderNode y3() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = k3.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeA;
        return renderNodeA;
    }

    private final boolean z3() {
        m0 m0Var = this.edgeEffectWrapper;
        return m0Var.s() || m0Var.t() || m0Var.v() || m0Var.w();
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        boolean zU3;
        this.overscrollEffect.p(cVar.a());
        Canvas canvasD = n3.f0.d(cVar.getDrawContext().f());
        this.overscrollEffect.i().getValue();
        if (m3.k.k(cVar.a())) {
            cVar.H2();
            return;
        }
        if (!canvasD.isHardwareAccelerated()) {
            this.edgeEffectWrapper.f();
            cVar.H2();
            return;
        }
        float fL2 = cVar.l2(f0.b());
        m0 m0Var = this.edgeEffectWrapper;
        boolean zA3 = A3();
        boolean zZ3 = z3();
        if (zA3 && zZ3) {
            y3().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight());
        } else if (zA3) {
            y3().setPosition(0, 0, canvasD.getWidth() + (hr.a.d(fL2) * 2), canvasD.getHeight());
        } else {
            if (!zZ3) {
                cVar.H2();
                return;
            }
            y3().setPosition(0, 0, canvasD.getWidth(), canvasD.getHeight() + (hr.a.d(fL2) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = y3().beginRecording();
        if (m0Var.t()) {
            EdgeEffect edgeEffectJ = m0Var.j();
            v3(edgeEffectJ, recordingCanvasBeginRecording);
            edgeEffectJ.finish();
        }
        if (m0Var.s()) {
            EdgeEffect edgeEffectI = m0Var.i();
            zU3 = u3(edgeEffectI, recordingCanvasBeginRecording);
            if (m0Var.u()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.h() & BodyPartID.bodyIdMax));
                k0 k0Var = k0.f208985a;
                k0Var.e(m0Var.j(), k0Var.c(edgeEffectI), 1 - fIntBitsToFloat);
            }
        } else {
            zU3 = false;
        }
        if (m0Var.A()) {
            EdgeEffect edgeEffectN = m0Var.n();
            t3(edgeEffectN, recordingCanvasBeginRecording);
            edgeEffectN.finish();
        }
        if (m0Var.z()) {
            EdgeEffect edgeEffectM = m0Var.m();
            zU3 = w3(edgeEffectM, recordingCanvasBeginRecording) || zU3;
            if (m0Var.B()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                k0 k0Var2 = k0.f208985a;
                k0Var2.e(m0Var.n(), k0Var2.c(edgeEffectM), fIntBitsToFloat2);
            }
        }
        if (m0Var.w()) {
            EdgeEffect edgeEffectL = m0Var.l();
            u3(edgeEffectL, recordingCanvasBeginRecording);
            edgeEffectL.finish();
        }
        if (m0Var.v()) {
            EdgeEffect edgeEffectK = m0Var.k();
            zU3 = v3(edgeEffectK, recordingCanvasBeginRecording) || zU3;
            if (m0Var.x()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.h() & BodyPartID.bodyIdMax));
                k0 k0Var3 = k0.f208985a;
                k0Var3.e(m0Var.l(), k0Var3.c(edgeEffectK), fIntBitsToFloat3);
            }
        }
        if (m0Var.q()) {
            EdgeEffect edgeEffectH = m0Var.h();
            w3(edgeEffectH, recordingCanvasBeginRecording);
            edgeEffectH.finish();
        }
        if (m0Var.p()) {
            EdgeEffect edgeEffectG = m0Var.g();
            boolean z15 = t3(edgeEffectG, recordingCanvasBeginRecording) || zU3;
            if (m0Var.r()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                k0 k0Var4 = k0.f208985a;
                k0Var4.e(m0Var.h(), k0Var4.c(edgeEffectG), 1 - fIntBitsToFloat4);
            }
            zU3 = z15;
        }
        if (zU3) {
            this.overscrollEffect.j();
        }
        float f15 = zZ3 ? 0.0f : fL2;
        if (zA3) {
            fL2 = 0.0f;
        }
        c5.t layoutDirection = cVar.getLayoutDirection();
        n3.h1 h1VarB = n3.f0.b(recordingCanvasBeginRecording);
        long jA = cVar.a();
        c5.d density = cVar.getDrawContext().getDensity();
        c5.t layoutDirection2 = cVar.getDrawContext().getLayoutDirection();
        n3.h1 h1VarF = cVar.getDrawContext().f();
        long jA2 = cVar.getDrawContext().a();
        q3.c graphicsLayer = cVar.getDrawContext().getGraphicsLayer();
        p3.d drawContext = cVar.getDrawContext();
        drawContext.b(cVar);
        drawContext.d(layoutDirection);
        drawContext.e(h1VarB);
        drawContext.g(jA);
        drawContext.i(null);
        h1VarB.q();
        try {
            cVar.getDrawContext().getTransform().d(f15, fL2);
            try {
                cVar.H2();
                float f16 = -f15;
                float f17 = -fL2;
                cVar.getDrawContext().getTransform().d(f16, f17);
                h1VarB.j();
                p3.d drawContext2 = cVar.getDrawContext();
                drawContext2.b(density);
                drawContext2.d(layoutDirection2);
                drawContext2.e(h1VarF);
                drawContext2.g(jA2);
                drawContext2.i(graphicsLayer);
                y3().endRecording();
                int iSave = canvasD.save();
                canvasD.translate(f16, f17);
                canvasD.drawRenderNode(y3());
                canvasD.restoreToCount(iSave);
            } catch (Throwable th4) {
                cVar.getDrawContext().getTransform().d(-f15, -fL2);
                throw th4;
            }
        } catch (Throwable th5) {
            h1VarB.j();
            p3.d drawContext3 = cVar.getDrawContext();
            drawContext3.b(density);
            drawContext3.d(layoutDirection2);
            drawContext3.e(h1VarF);
            drawContext3.g(jA2);
            drawContext3.i(graphicsLayer);
            throw th5;
        }
    }
}
