package m1;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import n3.d3;
import n3.e3;
import n3.f2;
import n3.o1;
import n3.t2;
import n3.y2;
import oq.i0;
import p071kotlin.Metadata;
import s3.Shadow;
import u0.q1;
import u4.FontWeight;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b\u001a/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\b\u001a-\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\b\u001a/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\b\u001a7\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010'\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010*\"\u0014\u0010-\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010,\"\u001a\u00102\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lm1/d;", "a", "b", "", "t", "result", "Loq/i0;", "m", "(Lm1/d;Lm1/d;FLm1/d;)V", "k", "j", "", "n", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "", "Ls3/g;", "i", "([Ls3/g;[Ls3/g;F)[Ls3/g;", "l", "o", "p", "", "flags", "g", "(Lm1/d;Lm1/d;FILm1/d;)V", "Landroidx/compose/ui/graphics/c;", "leftBrush", "Landroidx/compose/ui/graphics/Color;", "leftColor", "rightBrush", "rightColor", "h", "(Landroidx/compose/ui/graphics/c;JLandroidx/compose/ui/graphics/c;JF)Landroidx/compose/ui/graphics/c;", "Ln3/y2;", "f", "(Ln3/y2;Ln3/y2;F)Ln3/y2;", "hash", "key", "q", "(II)I", "r", "Lu0/q1;", "Lu0/q1;", "DefaultSpringSpec", "Lm1/d;", "EmptyResolvedStyle", "c", "Loq/i0;", "getTextDefaultsResolvedStyle", "()Loq/i0;", "TextDefaultsResolvedStyle", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q1<Float> f122384a = u0.m.j(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f122385b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f122386c;

    static {
        v.a(new d(), new g() { // from class: m1.e
            @Override // m1.g
            public final void a(u uVar) {
                f.b(uVar);
            }
        });
        f122386c = i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(u uVar) {
        uVar.l0(c5.w.g(14));
        uVar.p0(c5.w.g(0));
        uVar.P1(Color.INSTANCE.a());
        uVar.f1(FontWeight.INSTANCE.d());
        uVar.T1(u4.y.INSTANCE.b());
        uVar.b0(u4.z.INSTANCE.a());
        uVar.q0(u4.l.INSTANCE.a());
        uVar.v0(b5.a.INSTANCE.a());
        uVar.x0(b5.k.INSTANCE.c());
    }

    private static final y2 f(y2 y2Var, y2 y2Var2, float f15) {
        Object objA = f2.INSTANCE.a(y2Var, y2Var2, f15);
        y2 y2Var3 = objA instanceof y2 ? (y2) objA : null;
        return y2Var3 == null ? t2.a() : y2Var3;
    }

    public static final void g(d dVar, d dVar2, float f15, int i15, d dVar3) {
        int i16 = dVar.flags | dVar2.flags;
        dVar3.flags = i16;
        int i17 = i15 & i16;
        if ((i17 & 8) != 0) {
            m(dVar, dVar2, f15, dVar3);
        }
        if ((i17 & 1) != 0) {
            k(dVar, dVar2, f15, dVar3);
        }
        if ((i17 & 2) != 0) {
            j(dVar, dVar2, f15, dVar3);
        }
        if ((i17 & 4) != 0) {
            l(dVar, dVar2, f15, dVar3);
        }
        if ((i17 & 64) != 0) {
            o(dVar, dVar2, f15, dVar3);
        }
        if ((i17 & 32) != 0) {
            p(dVar, dVar2, f15, dVar3);
        }
    }

    private static final androidx.compose.ui.graphics.c h(androidx.compose.ui.graphics.c cVar, long j15, androidx.compose.ui.graphics.c cVar2, long j16, float f15) {
        if (cVar == null && cVar2 == null) {
            return null;
        }
        if (cVar == null) {
            cVar = new SolidColor(j15, null);
        } else if (cVar2 == null) {
            cVar2 = new SolidColor(j16, null);
        }
        Object objA = f2.INSTANCE.a(cVar, cVar2, f15);
        if (objA instanceof androidx.compose.ui.graphics.c) {
            return (androidx.compose.ui.graphics.c) objA;
        }
        return null;
    }

    public static final Shadow[] i(Shadow[] shadowArr, Shadow[] shadowArr2, float f15) {
        int iMax = Math.max(shadowArr.length, shadowArr2.length);
        Shadow[] shadowArr3 = new Shadow[iMax];
        for (int i15 = 0; i15 < iMax; i15++) {
            shadowArr3[i15] = null;
        }
        for (int i16 = 0; i16 < iMax; i16++) {
            shadowArr3[i16] = s3.i.a((Shadow) pq.n.y0(shadowArr, i16), (Shadow) pq.n.y0(shadowArr2, i16), f15);
        }
        return shadowArr3;
    }

    public static final void j(d dVar, d dVar2, float f15, d dVar3) {
        dVar3.E2(e5.c.b(dVar.getBorderWidth(), dVar2.getBorderWidth(), f15));
        dVar3.D2(o1.h(dVar.getBorderColor(), dVar2.getBorderColor(), f15));
        dVar3.C2(h(dVar.getBorderBrush(), dVar.getBorderColor(), dVar2.getBorderBrush(), dVar2.getBorderColor(), f15));
        dVar3.v2(o1.h(dVar.getBackgroundColor(), dVar2.getBackgroundColor(), f15));
        dVar3.t2(h(dVar.getBackgroundBrush(), dVar.getBackgroundColor(), dVar2.getBackgroundBrush(), dVar2.getBackgroundColor(), f15));
        androidx.compose.ui.graphics.c foregroundBrush = dVar.getForegroundBrush();
        Color.Companion companion = Color.INSTANCE;
        dVar3.V2(h(foregroundBrush, companion.h(), dVar2.getForegroundBrush(), companion.h(), f15));
        dVar3.Y2(n(dVar.getInnerShadow(), dVar2.getInnerShadow(), f15));
        dVar3.O2(n(dVar.getDropShadow(), dVar2.getDropShadow(), f15));
    }

    public static final void k(d dVar, d dVar2, float f15, d dVar3) {
        dVar3.M2(e5.c.b(dVar.getContentPaddingStart(), dVar2.getContentPaddingStart(), f15));
        dVar3.L2(e5.c.b(dVar.getContentPaddingEnd(), dVar2.getContentPaddingEnd(), f15));
        dVar3.N2(e5.c.b(dVar.getContentPaddingTop(), dVar2.getContentPaddingTop(), f15));
        dVar3.K2(e5.c.b(dVar.getContentPaddingBottom(), dVar2.getContentPaddingBottom(), f15));
    }

    public static final void l(d dVar, d dVar2, float f15, d dVar3) {
        dVar3.r2(e5.c.b(dVar.getAlpha(), dVar2.getAlpha(), f15));
        dVar3.l3(e5.c.b(dVar.getScaleX(), dVar2.getScaleX(), f15));
        dVar3.m3(e5.c.b(dVar.getScaleY(), dVar2.getScaleY(), f15));
        dVar3.s3(e5.c.b(dVar.getTranslationX(), dVar2.getTranslationX(), f15));
        dVar3.t3(e5.c.b(dVar.getTranslationY(), dVar2.getTranslationY(), f15));
        dVar3.i3(e5.c.b(dVar.getRotationX(), dVar2.getRotationX(), f15));
        dVar3.j3(e5.c.b(dVar.getRotationY(), dVar2.getRotationY(), f15));
        dVar3.k3(e5.c.b(dVar.getRotationZ(), dVar2.getRotationZ(), f15));
        dVar3.r3(e3.a(e5.c.b(d3.f(dVar.getTransformOrigin()), d3.f(dVar2.getTransformOrigin()), f15), e5.c.b(d3.g(dVar.getTransformOrigin()), d3.g(dVar2.getTransformOrigin()), f15)));
        dVar3.w3(e5.c.b(dVar.getZIndex(), dVar2.getZIndex(), f15));
        dVar3.n3(f(dVar.getShape(), dVar2.getShape(), f15));
        dVar3.G2(f15 < 0.5f ? dVar.getClip() : dVar2.getClip());
    }

    public static final void m(d dVar, d dVar2, float f15, d dVar3) {
        float externalPaddingStart = dVar.getExternalPaddingStart();
        float externalPaddingStart2 = dVar2.getExternalPaddingStart();
        boolean zIsNaN = Float.isNaN(externalPaddingStart);
        boolean zIsNaN2 = Float.isNaN(externalPaddingStart2);
        float f16 = 1 - f15;
        float f17 = (f16 * externalPaddingStart) + (f15 * externalPaddingStart2);
        if (zIsNaN) {
            externalPaddingStart = externalPaddingStart2;
        } else if (!zIsNaN2) {
            externalPaddingStart = f17;
        }
        dVar3.R2(externalPaddingStart);
        float externalPaddingEnd = dVar.getExternalPaddingEnd();
        float externalPaddingEnd2 = dVar2.getExternalPaddingEnd();
        boolean zIsNaN3 = Float.isNaN(externalPaddingEnd);
        boolean zIsNaN4 = Float.isNaN(externalPaddingEnd2);
        float f18 = (f16 * externalPaddingEnd) + (f15 * externalPaddingEnd2);
        if (zIsNaN3) {
            externalPaddingEnd = externalPaddingEnd2;
        } else if (!zIsNaN4) {
            externalPaddingEnd = f18;
        }
        dVar3.Q2(externalPaddingEnd);
        float externalPaddingTop = dVar.getExternalPaddingTop();
        float externalPaddingTop2 = dVar2.getExternalPaddingTop();
        boolean zIsNaN5 = Float.isNaN(externalPaddingTop);
        boolean zIsNaN6 = Float.isNaN(externalPaddingTop2);
        float f19 = (f16 * externalPaddingTop) + (f15 * externalPaddingTop2);
        if (zIsNaN5) {
            externalPaddingTop = externalPaddingTop2;
        } else if (!zIsNaN6) {
            externalPaddingTop = f19;
        }
        dVar3.S2(externalPaddingTop);
        float externalPaddingBottom = dVar.getExternalPaddingBottom();
        float externalPaddingBottom2 = dVar2.getExternalPaddingBottom();
        boolean zIsNaN7 = Float.isNaN(externalPaddingBottom);
        boolean zIsNaN8 = Float.isNaN(externalPaddingBottom2);
        float f25 = (f16 * externalPaddingBottom) + (f15 * externalPaddingBottom2);
        if (zIsNaN7) {
            externalPaddingBottom = externalPaddingBottom2;
        } else if (!zIsNaN8) {
            externalPaddingBottom = f25;
        }
        dVar3.P2(externalPaddingBottom);
        float left = dVar.getLeft();
        float left2 = dVar2.getLeft();
        boolean zIsNaN9 = Float.isNaN(left);
        boolean zIsNaN10 = Float.isNaN(left2);
        float f26 = (f16 * left) + (f15 * left2);
        if (zIsNaN9) {
            left = left2;
        } else if (!zIsNaN10) {
            left = f26;
        }
        dVar3.Z2(left);
        float top = dVar.getTop();
        float top2 = dVar2.getTop();
        boolean zIsNaN11 = Float.isNaN(top);
        boolean zIsNaN12 = Float.isNaN(top2);
        float f27 = (f16 * top) + (f15 * top2);
        if (zIsNaN11) {
            top = top2;
        } else if (!zIsNaN12) {
            top = f27;
        }
        dVar3.q3(top);
        float right = dVar.getRight();
        float right2 = dVar2.getRight();
        boolean zIsNaN13 = Float.isNaN(right);
        boolean zIsNaN14 = Float.isNaN(right2);
        float f28 = (f16 * right) + (f15 * right2);
        if (zIsNaN13) {
            right = right2;
        } else if (!zIsNaN14) {
            right = f28;
        }
        dVar3.h3(right);
        float bottom = dVar.getBottom();
        float bottom2 = dVar2.getBottom();
        boolean zIsNaN15 = Float.isNaN(bottom);
        boolean zIsNaN16 = Float.isNaN(bottom2);
        float f29 = (f16 * bottom) + (f15 * bottom2);
        if (zIsNaN15) {
            bottom = bottom2;
        } else if (!zIsNaN16) {
            bottom = f29;
        }
        dVar3.F2(bottom);
        float width = dVar.getWidth();
        float width2 = dVar2.getWidth();
        boolean zIsNaN17 = Float.isNaN(width);
        boolean zIsNaN18 = Float.isNaN(width2);
        float f35 = (f16 * width) + (f15 * width2);
        if (zIsNaN17) {
            width = width2;
        } else if (!zIsNaN18) {
            width = f35;
        }
        dVar3.u3(width);
        float height = dVar.getHeight();
        float height2 = dVar2.getHeight();
        boolean zIsNaN19 = Float.isNaN(height);
        boolean zIsNaN20 = Float.isNaN(height2);
        float f36 = (f16 * height) + (f15 * height2);
        if (zIsNaN19) {
            height = height2;
        } else if (!zIsNaN20) {
            height = f36;
        }
        dVar3.W2(height);
        float widthFraction = dVar.getWidthFraction();
        float widthFraction2 = dVar2.getWidthFraction();
        boolean zIsNaN21 = Float.isNaN(widthFraction);
        boolean zIsNaN22 = Float.isNaN(widthFraction2);
        float f37 = (f16 * widthFraction) + (f15 * widthFraction2);
        if (zIsNaN21) {
            widthFraction = widthFraction2;
        } else if (!zIsNaN22) {
            widthFraction = f37;
        }
        dVar3.v3(widthFraction);
        float heightFraction = dVar.getHeightFraction();
        float heightFraction2 = dVar2.getHeightFraction();
        boolean zIsNaN23 = Float.isNaN(heightFraction);
        boolean zIsNaN24 = Float.isNaN(heightFraction2);
        float f38 = (f16 * heightFraction) + (f15 * heightFraction2);
        if (zIsNaN23) {
            heightFraction = heightFraction2;
        } else if (!zIsNaN24) {
            heightFraction = f38;
        }
        dVar3.X2(heightFraction);
        float minWidth = dVar.getMinWidth();
        float minWidth2 = dVar2.getMinWidth();
        boolean zIsNaN25 = Float.isNaN(minWidth);
        boolean zIsNaN26 = Float.isNaN(minWidth2);
        float f39 = (f16 * minWidth) + (f15 * minWidth2);
        if (zIsNaN25) {
            minWidth = minWidth2;
        } else if (!zIsNaN26) {
            minWidth = f39;
        }
        dVar3.g3(minWidth);
        float maxWidth = dVar.getMaxWidth();
        float maxWidth2 = dVar2.getMaxWidth();
        boolean zIsNaN27 = Float.isNaN(maxWidth);
        boolean zIsNaN28 = Float.isNaN(maxWidth2);
        float f45 = (f16 * maxWidth) + (f15 * maxWidth2);
        if (zIsNaN27) {
            maxWidth = maxWidth2;
        } else if (!zIsNaN28) {
            maxWidth = f45;
        }
        dVar3.e3(maxWidth);
        float minHeight = dVar.getMinHeight();
        float minHeight2 = dVar2.getMinHeight();
        boolean zIsNaN29 = Float.isNaN(minHeight);
        boolean zIsNaN30 = Float.isNaN(minHeight2);
        float f46 = (f16 * minHeight) + (f15 * minHeight2);
        if (zIsNaN29) {
            minHeight = minHeight2;
        } else if (!zIsNaN30) {
            minHeight = f46;
        }
        dVar3.f3(minHeight);
        float maxHeight = dVar.getMaxHeight();
        float maxHeight2 = dVar2.getMaxHeight();
        boolean zIsNaN31 = Float.isNaN(maxHeight);
        boolean zIsNaN32 = Float.isNaN(maxHeight2);
        float f47 = (f16 * maxHeight) + (f15 * maxHeight2);
        if (zIsNaN31) {
            maxHeight = maxHeight2;
        } else if (!zIsNaN32) {
            maxHeight = f47;
        }
        dVar3.d3(maxHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object n(Object obj, Object obj2, float f15) {
        Shadow[] shadowArr;
        Shadow[] shadowArr2;
        Shadow[] shadowArr3;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z15 = obj instanceof Object[];
        boolean z16 = obj2 instanceof Object[];
        if (!z15 && !z16) {
            return s3.i.a(obj instanceof Shadow ? (Shadow) obj : null, obj2 instanceof Shadow ? (Shadow) obj2 : null, f15);
        }
        if (z15) {
            shadowArr3 = (Shadow[]) obj;
        } else {
            shadowArr = new Shadow[]{obj};
        }
        if (z16) {
            shadowArr = shadowArr3;
            shadowArr2 = (Shadow[]) obj2;
        } else {
            shadowArr = shadowArr3;
            shadowArr2 = new Shadow[]{obj2};
        }
        return i(shadowArr, shadowArr2, f15);
    }

    public static final void o(d dVar, d dVar2, float f15, d dVar3) {
        dVar3.J2(o1.h(dVar.getContentColor(), dVar2.getContentColor(), f15));
        dVar3.I2(h(dVar.getContentBrush(), dVar.getContentColor(), dVar2.getContentBrush(), dVar2.getContentColor(), f15));
    }

    public static final void p(d dVar, d dVar2, float f15, d dVar3) {
        if (!(c5.v.f(dVar.getFontSize()) == 0)) {
            if (!(c5.v.f(dVar2.getFontSize()) == 0)) {
                dVar3.U2(c5.w.h(dVar.getFontSize(), dVar2.getFontSize(), f15));
            }
        }
        if (!(c5.v.f(dVar.getLineHeight()) == 0)) {
            if (!(c5.v.f(dVar2.getLineHeight()) == 0)) {
                dVar3.c3(c5.w.h(dVar.getLineHeight(), dVar2.getLineHeight(), f15));
            }
        }
        if (!(c5.v.f(dVar.getLetterSpacing()) == 0)) {
            if (!(c5.v.f(dVar2.getLetterSpacing()) == 0)) {
                dVar3.a3(c5.w.h(dVar.getLetterSpacing(), dVar2.getLetterSpacing(), f15));
            }
        }
        dVar3.T2(f15 < 0.5f ? dVar.getFontFamily() : dVar2.getFontFamily());
        dVar3.p3(f15 < 0.5f ? dVar.getTextIndent() : dVar2.getTextIndent());
        dVar3.z2(f15 < 0.5f ? dVar.getBaselineShift() : dVar2.getBaselineShift());
        dVar3.b3(f15 < 0.5f ? dVar.getLineBreak() : dVar2.getLineBreak());
        dVar3.o3(f15 < 0.5f ? dVar.getTextEnums() : dVar2.getTextEnums());
        int textEnums = (dVar.getTextEnums() & 134086656) >> 17;
        int textEnums2 = (dVar2.getTextEnums() & 134086656) >> 17;
        if (textEnums <= 0 || textEnums2 <= 0) {
            return;
        }
        dVar3.o3(((((e5.c.c(textEnums, textEnums2, f15) / 100) * 100) << 17) & 134086656) | (dVar3.getTextEnums() & (-134086657)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(int i15, int i16) {
        return Integer.rotateLeft(i15, 3) ^ i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int i15, int i16) {
        return Integer.rotateRight(i15 ^ i16, 3);
    }
}
