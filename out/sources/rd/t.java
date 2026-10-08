package rd;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import r0.m1;

/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static m1<WeakReference<Interpolator>> f173223b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Interpolator f173222a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static sd.c.a f173224c = sd.c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static sd.c.a f173225d = sd.c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i15) {
        WeakReference<Interpolator> weakReferenceI;
        synchronized (t.class) {
            weakReferenceI = g().i(i15);
        }
        return weakReferenceI;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = td.j.b(pointF.x, -1.0f, 1.0f);
        pointF.y = td.j.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = td.j.b(pointF2.x, -1.0f, 1.0f);
        float fB = td.j.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i15 = td.m.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = fd.e.e() ? null : a(i15);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = l6.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e15) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e15.getMessage()) ? l6.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!fd.e.e()) {
            try {
                h(i15, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    static <T> ud.a<T> c(sd.c cVar, fd.f fVar, float f15, n0<T> n0Var, boolean z15, boolean z16) {
        if (z15 && z16) {
            return e(fVar, cVar, f15, n0Var);
        }
        return z15 ? d(fVar, cVar, f15, n0Var) : f(cVar, f15, n0Var);
    }

    private static <T> ud.a<T> d(fd.f fVar, sd.c cVar, float f15, n0<T> n0Var) {
        Interpolator interpolatorB;
        T t15;
        cVar.Y();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z15 = false;
        PointF pointFE4 = null;
        while (cVar.p()) {
            switch (cVar.E(f173224c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA2 = n0Var.a(cVar, f15);
                    break;
                case 2:
                    tA = n0Var.a(cVar, f15);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z15 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f15);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f15);
                    break;
                default:
                    cVar.G0();
                    break;
            }
        }
        cVar.h0();
        if (z15) {
            interpolatorB = f173222a;
            t15 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f173222a : b(pointFE, pointFE4);
            t15 = tA;
        }
        ud.a<T> aVar = new ud.a<>(fVar, tA2, t15, interpolatorB, fNextDouble, null);
        aVar.f197589o = pointFE2;
        aVar.f197590p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    private static <T> ud.a<T> e(fd.f fVar, sd.c cVar, float f15, n0<T> n0Var) {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t15;
        Interpolator interpolator;
        PointF pointF;
        ud.a<T> aVar;
        PointF pointF2;
        boolean z15;
        float f16;
        cVar.Y();
        boolean z16 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fNextDouble = 0.0f;
        T tA2 = null;
        while (cVar.p()) {
            switch (cVar.E(f173224c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA = n0Var.a(cVar, f15);
                    break;
                case 2:
                    tA2 = n0Var.a(cVar, f15);
                    break;
                case 3:
                    boolean z17 = z16;
                    if (cVar.y() == sd.c.b.BEGIN_OBJECT) {
                        cVar.Y();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (cVar.p()) {
                            int iE = cVar.E(f173225d);
                            if (iE == 0) {
                                pointF2 = pointF5;
                                sd.c.b bVarY = cVar.y();
                                sd.c.b bVar = sd.c.b.NUMBER;
                                if (bVarY == bVar) {
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    cVar.h();
                                    fNextDouble2 = (float) cVar.nextDouble();
                                    fNextDouble4 = cVar.y() == bVar ? (float) cVar.nextDouble() : fNextDouble2;
                                    cVar.m();
                                }
                            } else if (iE != 1) {
                                cVar.G0();
                            } else {
                                sd.c.b bVarY2 = cVar.y();
                                sd.c.b bVar2 = sd.c.b.NUMBER;
                                if (bVarY2 == bVar2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.h();
                                    fNextDouble3 = (float) cVar.nextDouble();
                                    fNextDouble5 = cVar.y() == bVar2 ? (float) cVar.nextDouble() : fNextDouble3;
                                    cVar.m();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        cVar.h0();
                    } else {
                        pointFE = s.e(cVar, f15);
                    }
                    z16 = z17;
                    break;
                case 4:
                    if (cVar.y() != sd.c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f15);
                    } else {
                        cVar.Y();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        while (cVar.p()) {
                            int iE2 = cVar.E(f173225d);
                            if (iE2 != 0) {
                                z15 = z16;
                                if (iE2 != 1) {
                                    cVar.G0();
                                } else {
                                    sd.c.b bVarY3 = cVar.y();
                                    sd.c.b bVar3 = sd.c.b.NUMBER;
                                    if (bVarY3 == bVar3) {
                                        fNextDouble7 = (float) cVar.nextDouble();
                                        f18 = fNextDouble7;
                                    } else {
                                        cVar.h();
                                        PointF pointF7 = pointFE3;
                                        float fNextDouble8 = (float) cVar.nextDouble();
                                        fNextDouble7 = cVar.y() == bVar3 ? (float) cVar.nextDouble() : fNextDouble8;
                                        cVar.m();
                                        pointFE3 = pointF7;
                                        f18 = fNextDouble8;
                                    }
                                }
                            } else {
                                z15 = z16;
                                PointF pointF8 = pointFE3;
                                sd.c.b bVarY4 = cVar.y();
                                sd.c.b bVar4 = sd.c.b.NUMBER;
                                if (bVarY4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                    f17 = fNextDouble6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.h();
                                    float fNextDouble9 = (float) cVar.nextDouble();
                                    if (cVar.y() == bVar4) {
                                        f16 = fNextDouble9;
                                        fNextDouble6 = (float) cVar.nextDouble();
                                    } else {
                                        f16 = fNextDouble9;
                                        fNextDouble6 = f16;
                                    }
                                    cVar.m();
                                    f17 = f16;
                                }
                            }
                            z16 = z15;
                        }
                        PointF pointF9 = new PointF(f17, f18);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        cVar.h0();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z16 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f15);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f15);
                    break;
                default:
                    cVar.G0();
                    break;
            }
        }
        boolean z18 = z16;
        PointF pointF11 = pointF5;
        cVar.h0();
        if (z18) {
            interpolator = f173222a;
            t15 = tA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f173222a;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    t15 = tA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new ud.a<>(fVar, tA, t15, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFE4;
                    aVar = new ud.a<>(fVar, tA, t15, interpolatorB2, interpolatorB3, fNextDouble, null);
                }
                aVar.f197589o = pointFE3;
                aVar.f197590p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            t15 = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new ud.a<>(fVar, tA, t15, interpolator, fNextDouble, null);
        } else {
            pointF = pointFE4;
            aVar = new ud.a<>(fVar, tA, t15, interpolator, fNextDouble, null);
        }
        aVar.f197589o = pointFE3;
        aVar.f197590p = pointF;
        return aVar;
    }

    private static <T> ud.a<T> f(sd.c cVar, float f15, n0<T> n0Var) {
        return new ud.a<>(n0Var.a(cVar, f15));
    }

    private static m1<WeakReference<Interpolator>> g() {
        if (f173223b == null) {
            f173223b = new m1<>();
        }
        return f173223b;
    }

    private static void h(int i15, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f173223b.n(i15, weakReference);
        }
    }
}
