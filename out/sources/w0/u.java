package w0;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.Stroke;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001b\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R*\u00104\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010\f\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010A\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lw0/u;", "Lg4/j;", "Lg4/i1;", "Lc5/h;", "widthParameter", "Landroidx/compose/ui/graphics/c;", "brushParameter", "Ln3/y2;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/c;Ln3/y2;Lfr/k;)V", "Lk3/e;", "brush", "Ln3/i2$a;", "outline", "", "fillArea", "", "strokeWidth", "Lk3/l;", "y3", "(Lk3/e;Landroidx/compose/ui/graphics/c;Ln3/i2$a;ZF)Lk3/l;", "Ln3/i2$c;", "Lm3/e;", "topLeft", "Lm3/k;", "borderSize", "B3", "(Lk3/e;Landroidx/compose/ui/graphics/c;Ln3/i2$c;JJZF)Lk3/l;", "Ln4/i0;", "Loq/i0;", "E2", "(Ln4/i0;)V", "v", "Z", "R2", "()Z", "shouldAutoInvalidate", "w", "R", "isImportantForBounds", "Lw0/l;", "x", "Lw0/l;", "borderCache", "value", "y", "F", "getWidth-D9Ej5fM", "()F", "G3", "(F)V", "width", "z", "Landroidx/compose/ui/graphics/c;", "getBrush", "()Landroidx/compose/ui/graphics/c;", "F3", "(Landroidx/compose/ui/graphics/c;)V", "A", "Ln3/y2;", "getShape", "()Ln3/y2;", "k0", "(Ln3/y2;)V", "shape", "Lk3/c;", "B", "Lk3/c;", "drawWithCacheModifierNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends g4.j implements g4.i1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private n3.y2 shape;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final k3.c drawWithCacheModifierNode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean isImportantForBounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private BorderCache borderCache;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c brush;

    public /* synthetic */ u(float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var, fr.k kVar) {
        this(f15, cVar, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A3(m3.g gVar, fr.p0 p0Var, long j15, n3.n1 n1Var, p3.c cVar) {
        cVar.H2();
        float left = gVar.getLeft();
        float top = gVar.getTop();
        cVar.getDrawContext().getTransform().d(left, top);
        try {
            p3.f.f0(cVar, (n3.b2) p0Var.f66410a, 0L, j15, 0L, 0L, 0.0f, null, n1Var, 0, 0, 890, null);
            return oq.i0.f148189a;
        } finally {
            cVar.getDrawContext().getTransform().d(-left, -top);
        }
    }

    private final k3.l B3(k3.e eVar, final androidx.compose.ui.graphics.c cVar, n3.i2.c cVar2, final long j15, final long j16, final boolean z15, final float f15) {
        if (m3.j.h(cVar2.getRoundRect())) {
            final long topLeftCornerRadius = cVar2.getRoundRect().getTopLeftCornerRadius();
            final float f16 = f15 / 2;
            final Stroke stroke = new Stroke(f15, 0.0f, 0, 0, null, 30, null);
            return eVar.e(new er.l() { // from class: w0.q
                @Override // er.l
                public final Object b(Object obj) {
                    return u.C3(z15, cVar, topLeftCornerRadius, f16, f15, j15, j16, stroke, (p3.c) obj);
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        final n3.m2 m2VarL = o.l(this.borderCache.g(), cVar2.getRoundRect(), f15, z15);
        return eVar.e(new er.l() { // from class: w0.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.D3(m2VarL, cVar, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C3(boolean z15, androidx.compose.ui.graphics.c cVar, long j15, float f15, float f16, long j16, long j17, Stroke stroke, p3.c cVar2) {
        cVar2.H2();
        if (z15) {
            p3.f.c1(cVar2, cVar, 0L, 0L, j15, 0.0f, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j15 >> 32)) < f15) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.a() >> 32)) - f16;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar2.a() & BodyPartID.bodyIdMax)) - f16;
            int iA = n3.m1.INSTANCE.a();
            p3.d drawContext = cVar2.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().c(f16, f16, fIntBitsToFloat, fIntBitsToFloat2, iA);
                p3.f.c1(cVar2, cVar, 0L, 0L, j15, 0.0f, null, null, 0, 246, null);
            } finally {
                drawContext.f().j();
                drawContext.g(jA);
            }
        } else {
            p3.f.c1(cVar2, cVar, j16, j17, o.q(j15, f15), 0.0f, stroke, null, 0, 208, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D3(n3.m2 m2Var, androidx.compose.ui.graphics.c cVar, p3.c cVar2) {
        cVar2.H2();
        p3.f.M0(cVar2, m2Var, cVar, 0.0f, null, null, 0, 60, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l E3(u uVar, k3.e eVar) {
        if (eVar.l2(uVar.width) < 0.0f || m3.k.h(eVar.a()) <= 0.0f) {
            return o.m(eVar);
        }
        float f15 = 2;
        float fMin = Math.min(c5.h.p(uVar.width, c5.h.INSTANCE.a()) ? 1.0f : (float) Math.ceil(eVar.l2(uVar.width)), (float) Math.ceil(m3.k.h(eVar.a()) / f15));
        float f16 = fMin / f15;
        long jE = m3.e.e((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f16)) << 32));
        long jD = m3.k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.a() & BodyPartID.bodyIdMax)) - fMin)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.a() >> 32)) - fMin)) << 32));
        boolean z15 = f15 * fMin > m3.k.h(eVar.a());
        n3.i2 i2VarA = uVar.shape.a(eVar.a(), eVar.getLayoutDirection(), eVar);
        if (i2VarA instanceof n3.i2.a) {
            return uVar.y3(eVar, uVar.brush, (n3.i2.a) i2VarA, z15, fMin);
        }
        if (i2VarA instanceof n3.i2.c) {
            return uVar.B3(eVar, uVar.brush, (n3.i2.c) i2VarA, jE, jD, z15, fMin);
        }
        if (i2VarA instanceof n3.i2.b) {
            return o.o(eVar, uVar.brush, jE, jD, z15, fMin);
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, n3.b2] */
    private final k3.l y3(k3.e eVar, final androidx.compose.ui.graphics.c cVar, final n3.i2.a aVar, boolean z15, float f15) throws Throwable {
        int iB;
        n3.n1 n1VarB;
        boolean z16;
        m3.g gVar;
        BorderCache borderCache;
        fr.p0 p0Var;
        n3.b2 b2Var;
        n3.h1 h1Var;
        p3.a aVar2;
        p3.a aVar3;
        float f16;
        float f17;
        float f18;
        float f19;
        p3.d drawContext;
        long jA;
        p3.d dVar;
        long j15;
        if (z15) {
            return eVar.e(new er.l() { // from class: w0.s
                @Override // er.l
                public final Object b(Object obj) {
                    return u.z3(aVar, cVar, (p3.c) obj);
                }
            });
        }
        if (cVar instanceof SolidColor) {
            iB = n3.c2.INSTANCE.a();
            n1VarB = n3.n1.Companion.b(n3.n1.INSTANCE, Color.m9copywmQWz5c$default(((SolidColor) cVar).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            iB = n3.c2.INSTANCE.b();
            n1VarB = null;
        }
        int i15 = iB;
        m3.g bounds = aVar.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        n3.m2 m2VarG = this.borderCache.g();
        m2VarG.reset();
        n3.m2.r(m2VarG, bounds, null, 2, null);
        m2VarG.e(m2VarG, aVar.getPath(), n3.q2.INSTANCE.a());
        fr.p0 p0Var2 = new fr.p0();
        final long jC = c5.r.c((((long) ((int) Math.ceil(bounds.getBottom() - bounds.getTop()))) & BodyPartID.bodyIdMax) | (((long) ((int) Math.ceil(bounds.getRight() - bounds.getLeft()))) << 32));
        BorderCache borderCache2 = this.borderCache;
        n3.b2 b2Var2 = borderCache2.imageBitmap;
        n3.h1 h1Var2 = borderCache2.canvas;
        n3.c2 c2VarF = b2Var2 != null ? n3.c2.f(b2Var2.b()) : null;
        if (!(c2VarF == null ? false : n3.c2.i(c2VarF.getValue(), n3.c2.INSTANCE.b()))) {
            z16 = n3.c2.h(i15, b2Var2 != null ? n3.c2.f(b2Var2.b()) : null);
        }
        try {
            try {
                try {
                    try {
                        if (b2Var2 != null && h1Var2 != null) {
                            gVar = bounds;
                            if (Float.intBitsToFloat((int) (eVar.a() >> 32)) <= b2Var2.l() && Float.intBitsToFloat((int) (eVar.a() & BodyPartID.bodyIdMax)) <= b2Var2.getHeight() && z16) {
                                borderCache = borderCache2;
                                p0Var = p0Var2;
                                h1Var = h1Var2;
                                b2Var = b2Var2;
                            }
                            aVar2 = borderCache.canvasDrawScope;
                            if (aVar2 == null) {
                                aVar2 = new p3.a();
                                borderCache.canvasDrawScope = aVar2;
                            }
                            aVar3 = aVar2;
                            long jE = c5.s.e(jC);
                            c5.t layoutDirection = eVar.getLayoutDirection();
                            p3.a.DrawParams drawParams = aVar3.getDrawParams();
                            c5.d density = drawParams.getDensity();
                            c5.t layoutDirection2 = drawParams.getLayoutDirection();
                            n3.h1 canvas = drawParams.getCanvas();
                            long size = drawParams.getSize();
                            p3.a.DrawParams drawParams2 = aVar3.getDrawParams();
                            drawParams2.j(eVar);
                            drawParams2.k(layoutDirection);
                            drawParams2.i(h1Var);
                            drawParams2.l(jE);
                            h1Var.q();
                            long jA2 = Color.INSTANCE.a();
                            n3.a1.Companion companion = n3.a1.INSTANCE;
                            p3.f.c2(aVar3, jA2, 0L, jE, 0.0f, null, null, companion.a(), 58, null);
                            f16 = -gVar.getLeft();
                            f17 = -gVar.getTop();
                            aVar3.getDrawContext().getTransform().d(f16, f17);
                            ?? r15 = b2Var;
                            f19 = f17;
                            n3.h1 h1Var3 = h1Var;
                            final n3.n1 n1Var = n1VarB;
                            f18 = f16;
                            p3.f.M0(aVar3, aVar.getPath(), cVar, 0.0f, new Stroke(f15 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                            float f25 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (aVar3.a() >> 32)) + f25) / Float.intBitsToFloat((int) (aVar3.a() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (aVar3.a() & BodyPartID.bodyIdMax)) + f25) / Float.intBitsToFloat((int) (aVar3.a() & BodyPartID.bodyIdMax));
                            long jY2 = aVar3.y2();
                            drawContext = aVar3.getDrawContext();
                            jA = drawContext.a();
                            drawContext.f().q();
                            drawContext.getTransform().h(fIntBitsToFloat, fIntBitsToFloat2, jY2);
                            final fr.p0 p0Var3 = p0Var;
                            j15 = jA;
                            p3.f.M0(aVar3, m2VarG, cVar, 0.0f, null, null, companion.a(), 28, null);
                            drawContext.f().j();
                            drawContext.g(j15);
                            aVar3.getDrawContext().getTransform().d(-f18, -f19);
                            h1Var3.j();
                            p3.a.DrawParams drawParams3 = aVar3.getDrawParams();
                            drawParams3.j(density);
                            drawParams3.k(layoutDirection2);
                            drawParams3.i(canvas);
                            drawParams3.l(size);
                            r15.a();
                            p0Var3.f66410a = r15;
                            final m3.g gVar2 = gVar;
                            return eVar.e(new er.l() { // from class: w0.t
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return u.A3(gVar2, p0Var3, jC, n1Var, (p3.c) obj);
                                }
                            });
                        }
                        gVar = bounds;
                        p3.f.M0(aVar3, m2VarG, cVar, 0.0f, null, null, companion.a(), 28, null);
                        drawContext.f().j();
                        drawContext.g(j15);
                        aVar3.getDrawContext().getTransform().d(-f18, -f19);
                        h1Var3.j();
                        p3.a.DrawParams drawParams4 = aVar3.getDrawParams();
                        drawParams4.j(density);
                        drawParams4.k(layoutDirection2);
                        drawParams4.i(canvas);
                        drawParams4.l(size);
                        r15.a();
                        p0Var3.f66410a = r15;
                        final m3.g gVar3 = gVar;
                        return eVar.e(new er.l() { // from class: w0.t
                            @Override // er.l
                            public final Object b(Object obj) {
                                return u.A3(gVar3, p0Var3, jC, n1Var, (p3.c) obj);
                            }
                        });
                    } catch (Throwable th4) {
                        th = th4;
                        dVar = drawContext;
                        dVar.f().j();
                        dVar.g(j15);
                        throw th;
                    }
                    drawContext.getTransform().h(fIntBitsToFloat, fIntBitsToFloat2, jY2);
                    final fr.p0 p0Var4 = p0Var;
                    j15 = jA;
                } catch (Throwable th5) {
                    th = th5;
                    dVar = drawContext;
                    j15 = jA;
                }
                p3.f.M0(aVar3, aVar.getPath(), cVar, 0.0f, new Stroke(f15 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f26 = 1;
                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (aVar3.a() >> 32)) + f26) / Float.intBitsToFloat((int) (aVar3.a() >> 32));
                float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (aVar3.a() & BodyPartID.bodyIdMax)) + f26) / Float.intBitsToFloat((int) (aVar3.a() & BodyPartID.bodyIdMax));
                long jY3 = aVar3.y2();
                drawContext = aVar3.getDrawContext();
                jA = drawContext.a();
                drawContext.f().q();
            } catch (Throwable th6) {
                th = th6;
                aVar3.getDrawContext().getTransform().d(-f18, -f19);
                throw th;
            }
            ?? r16 = b2Var;
            f19 = f17;
            n3.h1 h1Var4 = h1Var;
            final n3.n1 n1Var2 = n1VarB;
            f18 = f16;
        } catch (Throwable th7) {
            th = th7;
            f18 = f16;
            f19 = f17;
        }
        borderCache = borderCache2;
        p0Var = p0Var2;
        n3.b2 b2VarB = n3.d2.b((int) (jC >> 32), (int) (jC & BodyPartID.bodyIdMax), i15, false, null, 24, null);
        borderCache.imageBitmap = b2VarB;
        n3.h1 h1VarA = n3.j1.a(b2VarB);
        borderCache.canvas = h1VarA;
        b2Var = b2VarB;
        h1Var = h1VarA;
        aVar2 = borderCache.canvasDrawScope;
        if (aVar2 == null) {
            aVar2 = new p3.a();
            borderCache.canvasDrawScope = aVar2;
        }
        aVar3 = aVar2;
        long jE2 = c5.s.e(jC);
        c5.t layoutDirection3 = eVar.getLayoutDirection();
        p3.a.DrawParams drawParams5 = aVar3.getDrawParams();
        c5.d density2 = drawParams5.getDensity();
        c5.t layoutDirection4 = drawParams5.getLayoutDirection();
        n3.h1 canvas2 = drawParams5.getCanvas();
        long size2 = drawParams5.getSize();
        p3.a.DrawParams drawParams6 = aVar3.getDrawParams();
        drawParams6.j(eVar);
        drawParams6.k(layoutDirection3);
        drawParams6.i(h1Var);
        drawParams6.l(jE2);
        h1Var.q();
        long jA3 = Color.INSTANCE.a();
        n3.a1.Companion companion2 = n3.a1.INSTANCE;
        p3.f.c2(aVar3, jA3, 0L, jE2, 0.0f, null, null, companion2.a(), 58, null);
        f16 = -gVar.getLeft();
        f17 = -gVar.getTop();
        aVar3.getDrawContext().getTransform().d(f16, f17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z3(n3.i2.a aVar, androidx.compose.ui.graphics.c cVar, p3.c cVar2) {
        cVar2.H2();
        p3.f.M0(cVar2, aVar.getPath(), cVar, 0.0f, null, null, 0, 60, null);
        return oq.i0.f148189a;
    }

    @Override // g4.i1
    public void E2(n4.i0 i0Var) {
        n4.f0.v0(i0Var, this.shape);
    }

    public final void F3(androidx.compose.ui.graphics.c cVar) {
        if (fr.t.c(this.brush, cVar)) {
            return;
        }
        this.brush = cVar;
        this.drawWithCacheModifierNode.E1();
    }

    public final void G3(float f15) {
        if (c5.h.p(this.width, f15)) {
            return;
        }
        this.width = f15;
        this.drawWithCacheModifierNode.E1();
    }

    @Override // g4.i1
    /* JADX INFO: renamed from: R, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void k0(n3.y2 y2Var) {
        if (fr.t.c(this.shape, y2Var)) {
            return;
        }
        this.shape = y2Var;
        this.drawWithCacheModifierNode.E1();
        g4.j1.d(this);
    }

    private u(float f15, androidx.compose.ui.graphics.c cVar, n3.y2 y2Var) {
        this.width = f15;
        this.brush = cVar;
        this.shape = y2Var;
        this.drawWithCacheModifierNode = (k3.c) n3(k3.k.a(new er.l() { // from class: w0.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.E3(this.f209029a, (k3.e) obj);
            }
        }));
    }
}
