package x0;

import c5.r;
import er.l;
import fr.m0;
import fr.p0;
import fr.t;
import lr.m;
import m3.i;
import m3.k;
import n3.a1;
import n3.i2;
import n3.m1;
import n3.m2;
import n3.q2;
import n3.u0;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.Stroke;
import p3.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JM\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lx0/f;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/c;", "brush", "Lkotlin/Function0;", "Lq3/c;", "graphicsLayerProvider", "Ln3/i2$a;", "outline", "Lkotlin/Function1;", "Lp3/f;", "Loq/i0;", "f", "(Landroidx/compose/ui/graphics/c;Ler/a;Ln3/i2$a;)Ler/l;", "Ln3/m2;", "p", "()Ln3/m2;", "Ln3/i2$c;", "k", "(Landroidx/compose/ui/graphics/c;Ln3/i2$c;)Ler/l;", "Ln3/i2$b;", "i", "(Landroidx/compose/ui/graphics/c;Ln3/i2$b;)Ler/l;", "drawScope", "", "width", "Ln3/i2;", "Lm3/e;", "offset", "n", "(Lp3/f;Ler/a;Landroidx/compose/ui/graphics/c;Ler/a;Ln3/i2;J)V", "a", "Ln3/m2;", "borderPath", "b", "Ler/a;", "borderWidth", "c", "Landroidx/compose/ui/graphics/c;", "lastBrush", "d", "Ln3/i2;", "lastOutline", "e", "Ler/l;", "drawBorder", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m2 borderPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.a<Float> borderWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c lastBrush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i2 lastOutline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l<? super p3.f, i0> drawBorder;

    private final l<p3.f, i0> f(final androidx.compose.ui.graphics.c brush, final er.a<q3.c> graphicsLayerProvider, final i2.a outline) {
        final m3.g bounds = outline.getPath().getBounds();
        final float fJ = bounds.j();
        final m2 m2VarP = p();
        m2VarP.reset();
        m2.r(m2VarP, bounds, null, 2, null);
        m2VarP.e(m2VarP, outline.getPath(), q2.INSTANCE.a());
        final long jC = r.c((((long) ((int) Math.ceil(bounds.getBottom() - bounds.getTop()))) & BodyPartID.bodyIdMax) | (((long) ((int) Math.ceil(bounds.getRight() - bounds.getLeft()))) << 32));
        return new l() { // from class: x0.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.g(this.f216143a, fJ, outline, brush, graphicsLayerProvider, bounds, jC, m2VarP, (p3.f) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, float f15, final i2.a aVar, final androidx.compose.ui.graphics.c cVar, er.a aVar2, final m3.g gVar, long j15, final m2 m2Var, p3.f fVar2) {
        final float fD = m.d(fVar.borderWidth.a().floatValue(), 0.0f);
        if (2 * fD > f15) {
            p3.f.M0(fVar2, aVar.getPath(), cVar, 0.0f, null, null, 0, 60, null);
        } else {
            q3.c cVar2 = (q3.c) aVar2.a();
            cVar2.Q(q3.b.INSTANCE.c());
            float left = gVar.getLeft();
            float top = gVar.getTop();
            fVar2.getDrawContext().getTransform().d(left, top);
            try {
                fVar2.U1(cVar2, j15, new l() { // from class: x0.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h(gVar, aVar, cVar, fD, m2Var, (p3.f) obj);
                    }
                });
                q3.e.a(fVar2, cVar2);
            } finally {
                fVar2.getDrawContext().getTransform().d(-left, -top);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(m3.g gVar, i2.a aVar, androidx.compose.ui.graphics.c cVar, float f15, m2 m2Var, p3.f fVar) {
        float f16 = -gVar.getLeft();
        float f17 = -gVar.getTop();
        fVar.getDrawContext().getTransform().d(f16, f17);
        try {
            p3.f.M0(fVar, aVar.getPath(), cVar, 0.0f, new Stroke(f15 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            float f18 = 1;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.a() >> 32)) + f18) / Float.intBitsToFloat((int) (fVar.a() >> 32));
            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)) + f18) / Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax));
            long jY2 = fVar.y2();
            p3.d drawContext = fVar.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().h(fIntBitsToFloat, fIntBitsToFloat2, jY2);
                p3.f.M0(fVar, m2Var, cVar, 0.0f, null, null, a1.INSTANCE.a(), 28, null);
                drawContext.f().j();
                drawContext.g(jA);
                fVar.getDrawContext().getTransform().d(-f16, -f17);
                return i0.f148189a;
            } catch (Throwable th4) {
                drawContext.f().j();
                drawContext.g(jA);
                throw th4;
            }
        } catch (Throwable th5) {
            fVar.getDrawContext().getTransform().d(-f16, -f17);
            throw th5;
        }
    }

    private final l<p3.f, i0> i(final androidx.compose.ui.graphics.c brush, i2.b outline) {
        final m3.g gVarB = outline.b();
        return new l() { // from class: x0.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.j(this.f216140a, gVarB, brush, (p3.f) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f fVar, m3.g gVar, androidx.compose.ui.graphics.c cVar, p3.f fVar2) {
        long jE;
        long jD;
        float fD = m.d(fVar.borderWidth.a().floatValue(), 0.0f);
        float f15 = 2;
        boolean z15 = fD * f15 > gVar.j();
        if (z15) {
            jE = gVar.n();
        } else {
            float f16 = fD / f15;
            jE = m3.e.e((((long) Float.floatToRawIntBits(gVar.getTop() + f16)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(gVar.getLeft() + f16)) << 32));
        }
        long j15 = jE;
        if (z15) {
            jD = gVar.l();
        } else {
            jD = k.d((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits((gVar.getBottom() - gVar.getTop()) - fD))) | (((long) Float.floatToRawIntBits((gVar.getRight() - gVar.getLeft()) - fD)) << 32));
        }
        p3.f.F1(fVar2, cVar, j15, jD, 0.0f, z15 ? j.f152592b : new Stroke(fD, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
        return i0.f148189a;
    }

    private final l<p3.f, i0> k(final androidx.compose.ui.graphics.c brush, i2.c outline) {
        final i roundRect = outline.getRoundRect();
        if (m3.j.h(roundRect)) {
            return new l() { // from class: x0.a
                @Override // er.l
                public final Object b(Object obj) {
                    return f.l(this.f216131a, roundRect, brush, (p3.f) obj);
                }
            };
        }
        final m2 m2VarP = p();
        final m0 m0Var = new m0();
        m0Var.f66406a = Float.NaN;
        final p0 p0Var = new p0();
        return new l() { // from class: x0.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.m(this.f216134a, roundRect, m0Var, p0Var, m2VarP, brush, (p3.f) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f fVar, i iVar, androidx.compose.ui.graphics.c cVar, p3.f fVar2) {
        float fD = m.d(fVar.borderWidth.a().floatValue(), 0.0f);
        float f15 = 2;
        float f16 = fD / f15;
        boolean z15 = f15 * fD > m3.j.g(iVar);
        long topLeftCornerRadius = iVar.getTopLeftCornerRadius();
        Stroke stroke = new Stroke(fD, 0.0f, 0, 0, null, 30, null);
        if (z15) {
            p3.f.c1(fVar2, cVar, m3.e.e((((long) Float.floatToRawIntBits(iVar.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(iVar.getLeft())) << 32)), k.d((((long) Float.floatToRawIntBits(iVar.f())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(iVar.l())) << 32)), topLeftCornerRadius, 0.0f, null, null, 0, 240, null);
        } else if (Float.intBitsToFloat((int) (topLeftCornerRadius >> 32)) < f16) {
            float left = iVar.getLeft() + fD;
            float top = iVar.getTop() + fD;
            float right = iVar.getRight() - fD;
            float bottom = iVar.getBottom() - fD;
            int iA = m1.INSTANCE.a();
            p3.d drawContext = fVar2.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().c(left, top, right, bottom, iA);
                p3.f.c1(fVar2, cVar, m3.e.e((((long) Float.floatToRawIntBits(iVar.getLeft())) << 32) | (((long) Float.floatToRawIntBits(iVar.getTop())) & BodyPartID.bodyIdMax)), k.d((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(iVar.f()))) | (((long) Float.floatToRawIntBits(iVar.l())) << 32)), topLeftCornerRadius, 0.0f, null, null, 0, 240, null);
            } finally {
                drawContext.f().j();
                drawContext.g(jA);
            }
        } else {
            p3.f.c1(fVar2, cVar, m3.e.e((((long) Float.floatToRawIntBits(iVar.getLeft() + f16)) << 32) | (((long) Float.floatToRawIntBits(iVar.getTop() + f16)) & BodyPartID.bodyIdMax)), k.d((((long) Float.floatToRawIntBits(iVar.f() - fD)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(iVar.l() - fD)) << 32)), g.e(topLeftCornerRadius, f16), 0.0f, stroke, null, 0, 208, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, n3.m2] */
    public static final i0 m(f fVar, i iVar, m0 m0Var, p0 p0Var, m2 m2Var, androidx.compose.ui.graphics.c cVar, p3.f fVar2) {
        float fD = m.d(fVar.borderWidth.a().floatValue(), 0.0f);
        boolean z15 = ((float) 2) * fD > m3.j.g(iVar);
        if (m0Var.f66406a != fD) {
            p0Var.f66410a = g.d(m2Var, iVar, fD, z15);
            m0Var.f66406a = fD;
        }
        p3.f.M0(fVar2, (m2) p0Var.f66410a, cVar, 0.0f, null, null, 0, 60, null);
        return i0.f148189a;
    }

    private final m2 p() {
        m2 m2Var = this.borderPath;
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2VarA = u0.a();
        this.borderPath = m2VarA;
        return m2VarA;
    }

    public final void n(p3.f drawScope, er.a<Float> width, androidx.compose.ui.graphics.c brush, er.a<q3.c> graphicsLayerProvider, i2 outline, long offset) {
        l<p3.f, i0> lVarI;
        this.borderWidth = width;
        if (!t.c(brush, this.lastBrush) || !t.c(outline, this.lastOutline) || this.drawBorder == null) {
            this.lastBrush = brush;
            this.lastOutline = outline;
            if (outline instanceof i2.a) {
                lVarI = f(brush, graphicsLayerProvider, (i2.a) outline);
            } else if (outline instanceof i2.c) {
                lVarI = k(brush, (i2.c) outline);
            } else {
                if (!(outline instanceof i2.b)) {
                    throw new p();
                }
                lVarI = i(brush, (i2.b) outline);
            }
            this.drawBorder = lVarI;
        }
        if (m3.e.j(offset, m3.e.INSTANCE.c())) {
            this.drawBorder.b(drawScope);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offset >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset));
        drawScope.getDrawContext().getTransform().d(fIntBitsToFloat, fIntBitsToFloat2);
        try {
            this.drawBorder.b(drawScope);
        } finally {
            drawScope.getDrawContext().getTransform().d(-fIntBitsToFloat, -fIntBitsToFloat2);
        }
    }
}
