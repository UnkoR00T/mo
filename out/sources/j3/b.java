package j3;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import c5.t;
import er.l;
import fr.k;
import n3.f0;
import n3.h1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lj3/b;", "Landroid/view/View$DragShadowBuilder;", "Lc5/d;", "density", "Lm3/k;", "decorationSize", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "drawDragDecoration", "<init>", "(Lc5/d;JLer/l;Lfr/k;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "Lc5/d;", "b", "J", "c", "Ler/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long decorationSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<p3.f, i0> drawDragDecoration;

    public /* synthetic */ b(c5.d dVar, long j15, l lVar, k kVar) {
        this(dVar, j15, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        p3.a aVar = new p3.a();
        c5.d dVar = this.density;
        long j15 = this.decorationSize;
        t tVar = t.Ltr;
        h1 h1VarB = f0.b(canvas);
        l<p3.f, i0> lVar = this.drawDragDecoration;
        p3.a.DrawParams drawParams = aVar.getDrawParams();
        c5.d density = drawParams.getDensity();
        t layoutDirection = drawParams.getLayoutDirection();
        h1 canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        p3.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(tVar);
        drawParams2.i(h1VarB);
        drawParams2.l(j15);
        h1VarB.q();
        lVar.b(aVar);
        h1VarB.j();
        p3.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection);
        drawParams3.i(canvas2);
        drawParams3.l(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        c5.d dVar = this.density;
        outShadowSize.set(dVar.X0(dVar.d2(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), dVar.X0(dVar.d2(Float.intBitsToFloat((int) (this.decorationSize & BodyPartID.bodyIdMax)))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(c5.d dVar, long j15, l<? super p3.f, i0> lVar) {
        this.density = dVar;
        this.decorationSize = j15;
        this.drawDragDecoration = lVar;
    }
}
