package t3;

import java.util.List;
import n3.m2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "Lt3/h;", "Ln3/m2;", "target", "c", "(Ljava/util/List;Ln3/m2;)Ln3/m2;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Loq/i0;", "(Ln3/m2;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Ln3/m2;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f187352a = new float[0];

    private static final void a(m2 m2Var, double d15, double d16, double d17, double d18, double d19, double d25, double d26, double d27, double d28) {
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d28 * d29) / 3.141592653589793d));
        double dCos = Math.cos(d26);
        double dSin = Math.sin(d26);
        double dCos2 = Math.cos(d27);
        double dSin2 = Math.sin(d27);
        double d35 = -d17;
        double d36 = d35 * dCos;
        double d37 = d18 * dSin;
        double d38 = (d36 * dSin2) - (d37 * dCos2);
        double d39 = d35 * dSin;
        double d45 = d18 * dCos;
        double d46 = (dSin2 * d39) + (dCos2 * d45);
        double d47 = d28 / ((double) iCeil);
        double d48 = d46;
        double d49 = d38;
        int i15 = 0;
        double d55 = d19;
        double d56 = d25;
        double d57 = d27;
        while (i15 < iCeil) {
            double d58 = d57 + d47;
            double dSin3 = Math.sin(d58);
            double dCos3 = Math.cos(d58);
            int i16 = i15;
            double d59 = (d15 + ((d17 * dCos) * dCos3)) - (d37 * dSin3);
            double d65 = d29;
            double d66 = d16 + (d17 * dSin * dCos3) + (d45 * dSin3);
            double d67 = (d36 * dSin3) - (d37 * dCos3);
            double d68 = (dSin3 * d39) + (dCos3 * d45);
            double d69 = d58 - d57;
            int i17 = iCeil;
            double dTan = Math.tan(d69 / ((double) 2));
            double dSin4 = (Math.sin(d69) * (Math.sqrt(d65 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            m2Var.t((float) (d55 + (d49 * dSin4)), (float) (d56 + (d48 * dSin4)), (float) (d59 - (dSin4 * d67)), (float) (d66 - (dSin4 * d68)), (float) d59, (float) d66);
            dSin = dSin;
            d47 = d47;
            d55 = d59;
            d56 = d66;
            i15 = i16 + 1;
            d57 = d58;
            d48 = d68;
            iCeil = i17;
            d49 = d67;
            dCos = dCos;
            d29 = d65;
        }
    }

    private static final void b(m2 m2Var, double d15, double d16, double d17, double d18, double d19, double d25, double d26, boolean z15, boolean z16) {
        double d27;
        double d28;
        double d29 = (d26 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d29);
        double dSin = Math.sin(d29);
        double d35 = ((d15 * dCos) + (d16 * dSin)) / d19;
        double d36 = (((-d15) * dSin) + (d16 * dCos)) / d25;
        double d37 = ((d17 * dCos) + (d18 * dSin)) / d19;
        double d38 = (((-d17) * dSin) + (d18 * dCos)) / d25;
        double d39 = d35 - d37;
        double d45 = d36 - d38;
        double d46 = 2;
        double d47 = (d35 + d37) / d46;
        double d48 = (d36 + d38) / d46;
        double d49 = (d39 * d39) + (d45 * d45);
        if (d49 == 0.0d) {
            return;
        }
        double d55 = (1.0d / d49) - 0.25d;
        if (d55 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d49) / 1.99999d);
            b(m2Var, d15, d16, d17, d18, d19 * dSqrt, d25 * dSqrt, d26, z15, z16);
            return;
        }
        double dSqrt2 = Math.sqrt(d55);
        double d56 = d39 * dSqrt2;
        double d57 = dSqrt2 * d45;
        if (z15 == z16) {
            d27 = d47 - d57;
            d28 = d48 + d56;
        } else {
            d27 = d47 + d57;
            d28 = d48 - d56;
        }
        double dAtan2 = Math.atan2(d36 - d28, d35 - d27);
        double dAtan3 = Math.atan2(d38 - d28, d37 - d27) - dAtan2;
        if (z16 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d58 = d27 * d19;
        double d59 = d28 * d25;
        a(m2Var, (d58 * dCos) - (d59 * dSin), (d58 * dSin) + (d59 * dCos), d19, d25, d15, d16, d29, dAtan2, dAtan3);
    }

    public static final m2 c(List<? extends h> list, m2 m2Var) {
        float f15;
        float f16;
        float x15;
        float x16;
        float y15;
        float dy4;
        float f17;
        float f18;
        float dx4;
        float dy5;
        float dy6;
        List<? extends h> list2 = list;
        m2 m2Var2 = m2Var;
        int iQ = m2Var2.q();
        m2Var2.l();
        m2Var2.i(iQ);
        h hVar = list2.isEmpty() ? h.b.f187299c : list2.get(0);
        int size = list2.size();
        float f19 = 0.0f;
        int i15 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x17 = 0.0f;
        float y16 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        while (i15 < size) {
            h hVar2 = list2.get(i15);
            if (hVar2 instanceof h.b) {
                m2Var2.close();
                size = size;
                f19 = f19;
                hVar2 = hVar2;
                arcStartX = f25;
                x17 = arcStartX;
                arcStartY = f26;
            } else {
                if (hVar2 instanceof h.RelativeMoveTo) {
                    h.RelativeMoveTo relativeMoveTo = (h.RelativeMoveTo) hVar2;
                    x17 += relativeMoveTo.getDx();
                    y16 += relativeMoveTo.getDy();
                    m2Var2.c(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f25 = x17;
                    f26 = y16;
                } else if (hVar2 instanceof h.MoveTo) {
                    h.MoveTo moveTo = (h.MoveTo) hVar2;
                    float x18 = moveTo.getX();
                    float y17 = moveTo.getY();
                    m2Var2.s(moveTo.getX(), moveTo.getY());
                    x17 = x18;
                    f25 = x17;
                    y16 = y17;
                    f26 = y16;
                } else {
                    if (hVar2 instanceof h.RelativeLineTo) {
                        h.RelativeLineTo relativeLineTo = (h.RelativeLineTo) hVar2;
                        m2Var2.v(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x17 += relativeLineTo.getDx();
                        dy4 = relativeLineTo.getDy();
                    } else {
                        if (hVar2 instanceof h.LineTo) {
                            h.LineTo lineTo = (h.LineTo) hVar2;
                            m2Var2.x(lineTo.getX(), lineTo.getY());
                            x16 = lineTo.getX();
                            y15 = lineTo.getY();
                        } else if (hVar2 instanceof h.RelativeHorizontalTo) {
                            h.RelativeHorizontalTo relativeHorizontalTo = (h.RelativeHorizontalTo) hVar2;
                            m2Var2.v(relativeHorizontalTo.getDx(), f19);
                            x17 += relativeHorizontalTo.getDx();
                        } else if (hVar2 instanceof h.HorizontalTo) {
                            h.HorizontalTo horizontalTo = (h.HorizontalTo) hVar2;
                            m2Var2.x(horizontalTo.getX(), y16);
                            x17 = horizontalTo.getX();
                        } else if (hVar2 instanceof h.RelativeVerticalTo) {
                            h.RelativeVerticalTo relativeVerticalTo = (h.RelativeVerticalTo) hVar2;
                            m2Var2.v(f19, relativeVerticalTo.getDy());
                            dy4 = relativeVerticalTo.getDy();
                        } else if (hVar2 instanceof h.VerticalTo) {
                            h.VerticalTo verticalTo = (h.VerticalTo) hVar2;
                            m2Var2.x(x17, verticalTo.getY());
                            y16 = verticalTo.getY();
                        } else {
                            if (hVar2 instanceof h.RelativeCurveTo) {
                                h.RelativeCurveTo relativeCurveTo = (h.RelativeCurveTo) hVar2;
                                m2Var2.d(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                dx4 = relativeCurveTo.getDx2() + x17;
                                dy5 = relativeCurveTo.getDy2() + y16;
                                x17 += relativeCurveTo.getDx3();
                                dy6 = relativeCurveTo.getDy3();
                            } else {
                                if (hVar2 instanceof h.CurveTo) {
                                    h.CurveTo curveTo = (h.CurveTo) hVar2;
                                    m2Var.t(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                    float x19 = curveTo.getX2();
                                    float y18 = curveTo.getY2();
                                    float x25 = curveTo.getX3();
                                    float y19 = curveTo.getY3();
                                    x17 = x25;
                                    y16 = y19;
                                    size = size;
                                    f19 = f19;
                                    i15 = i15;
                                    hVar2 = hVar2;
                                    arcStartX = x19;
                                    arcStartY = y18;
                                } else if (hVar2 instanceof h.RelativeReflectiveCurveTo) {
                                    if (hVar.getIsCurve()) {
                                        float f27 = x17 - arcStartX;
                                        f18 = y16 - arcStartY;
                                        f17 = f27;
                                    } else {
                                        f17 = f19;
                                        f18 = f17;
                                    }
                                    h.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (h.RelativeReflectiveCurveTo) hVar2;
                                    m2Var.d(f17, f18, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                    dx4 = relativeReflectiveCurveTo.getDx1() + x17;
                                    dy5 = relativeReflectiveCurveTo.getDy1() + y16;
                                    x17 += relativeReflectiveCurveTo.getDx2();
                                    dy6 = relativeReflectiveCurveTo.getDy2();
                                } else {
                                    if (hVar2 instanceof h.ReflectiveCurveTo) {
                                        if (hVar.getIsCurve()) {
                                            float f28 = 2;
                                            x17 = (x17 * f28) - arcStartX;
                                            y16 = (f28 * y16) - arcStartY;
                                        }
                                        h.ReflectiveCurveTo reflectiveCurveTo = (h.ReflectiveCurveTo) hVar2;
                                        m2Var.t(x17, y16, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                        x15 = reflectiveCurveTo.getX1();
                                        float y25 = reflectiveCurveTo.getY1();
                                        float x26 = reflectiveCurveTo.getX2();
                                        float y26 = reflectiveCurveTo.getY2();
                                        x17 = x26;
                                        y16 = y26;
                                        arcStartY = y25;
                                    } else if (hVar2 instanceof h.RelativeQuadTo) {
                                        h.RelativeQuadTo relativeQuadTo = (h.RelativeQuadTo) hVar2;
                                        m2Var.n(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                        arcStartX = relativeQuadTo.getDx1() + x17;
                                        arcStartY = relativeQuadTo.getDy1() + y16;
                                        x17 += relativeQuadTo.getDx2();
                                        dy4 = relativeQuadTo.getDy2();
                                    } else if (hVar2 instanceof h.QuadTo) {
                                        h.QuadTo quadTo = (h.QuadTo) hVar2;
                                        m2Var.j(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        arcStartX = quadTo.getX1();
                                        arcStartY = quadTo.getY1();
                                        x16 = quadTo.getX2();
                                        y15 = quadTo.getY2();
                                    } else if (hVar2 instanceof h.RelativeReflectiveQuadTo) {
                                        if (hVar.getIsQuad()) {
                                            f15 = x17 - arcStartX;
                                            f16 = y16 - arcStartY;
                                        } else {
                                            f15 = f19;
                                            f16 = f15;
                                        }
                                        h.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (h.RelativeReflectiveQuadTo) hVar2;
                                        m2Var.n(f15, f16, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        x15 = f15 + x17;
                                        float f29 = f16 + y16;
                                        x17 += relativeReflectiveQuadTo.getDx();
                                        y16 += relativeReflectiveQuadTo.getDy();
                                        arcStartY = f29;
                                    } else if (hVar2 instanceof h.ReflectiveQuadTo) {
                                        if (hVar.getIsQuad()) {
                                            float f35 = 2;
                                            x17 = (x17 * f35) - arcStartX;
                                            y16 = (f35 * y16) - arcStartY;
                                        }
                                        h.ReflectiveQuadTo reflectiveQuadTo = (h.ReflectiveQuadTo) hVar2;
                                        m2Var.j(x17, y16, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        float f36 = x17;
                                        x17 = reflectiveQuadTo.getX();
                                        arcStartX = f36;
                                        size = size;
                                        f19 = f19;
                                        i15 = i15;
                                        arcStartY = y16;
                                        hVar2 = hVar2;
                                        y16 = reflectiveQuadTo.getY();
                                    } else if (hVar2 instanceof h.RelativeArcTo) {
                                        h.RelativeArcTo relativeArcTo = (h.RelativeArcTo) hVar2;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + x17;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + y16;
                                        f19 = f19;
                                        hVar2 = hVar2;
                                        size = size;
                                        b(m2Var, x17, y16, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                        arcStartX = arcStartDx;
                                        x17 = arcStartX;
                                        arcStartY = arcStartDy;
                                    } else {
                                        size = size;
                                        f19 = f19;
                                        hVar2 = hVar2;
                                        if (!(hVar2 instanceof h.ArcTo)) {
                                            throw new oq.p();
                                        }
                                        h.ArcTo arcTo = (h.ArcTo) hVar2;
                                        b(m2Var, x17, y16, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                        arcStartX = arcTo.getArcStartX();
                                        x17 = arcStartX;
                                        arcStartY = arcTo.getArcStartY();
                                    }
                                    arcStartX = x15;
                                }
                                i15++;
                                m2Var2 = m2Var;
                                hVar = hVar2;
                                size = size;
                                f19 = f19;
                                list2 = list;
                            }
                            y16 += dy6;
                            arcStartX = dx4;
                            arcStartY = dy5;
                        }
                        y16 = y15;
                        x17 = x16;
                    }
                    y16 += dy4;
                }
                hVar2 = hVar2;
                i15++;
                m2Var2 = m2Var;
                hVar = hVar2;
                size = size;
                f19 = f19;
                list2 = list;
            }
            y16 = arcStartY;
            i15++;
            m2Var2 = m2Var;
            hVar = hVar2;
            size = size;
            f19 = f19;
            list2 = list;
        }
        return m2Var;
    }
}
