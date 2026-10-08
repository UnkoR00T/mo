package id;

import android.graphics.Matrix;
import android.graphics.PointF;
import fd.g0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f91010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f91011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f91012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f91013e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a<PointF, PointF> f91020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a<?, PointF> f91021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a<ud.d, ud.d> f91022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a<Float, Float> f91023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a<Integer, Integer> f91024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f91025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d f91026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f91027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f91028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f91029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private a<?, Float> f91030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a<?, Float> f91031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f91032x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f91009a = new Matrix();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f91014f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f91015g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f91016h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f91017i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f91018j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f91019k = true;

    public s(nd.n nVar) {
        this.f91020l = nVar.c() == null ? null : nVar.c().l();
        this.f91021m = nVar.f() == null ? null : nVar.f().l();
        this.f91022n = nVar.k() == null ? null : nVar.k().l();
        this.f91023o = nVar.g() == null ? null : nVar.g().l();
        this.f91025q = nVar.l() == null ? null : nVar.l().l();
        this.f91032x = nVar.o();
        this.f91027s = nVar.h() == null ? null : nVar.h().l();
        this.f91028t = nVar.i() == null ? null : nVar.i().l();
        this.f91029u = nVar.j() == null ? null : nVar.j().l();
        if (this.f91025q != null) {
            this.f91010b = new Matrix();
            this.f91011c = new Matrix();
            this.f91012d = new Matrix();
            this.f91013e = new float[9];
        } else {
            this.f91010b = null;
            this.f91011c = null;
            this.f91012d = null;
            this.f91013e = null;
        }
        this.f91026r = nVar.m() == null ? null : nVar.m().l();
        if (nVar.e() != null) {
            this.f91024p = nVar.e().l();
        }
        if (nVar.n() != null) {
            this.f91030v = nVar.n().l();
        } else {
            this.f91030v = null;
        }
        if (nVar.d() != null) {
            this.f91031w = nVar.d().l();
        } else {
            this.f91031w = null;
        }
    }

    private void g() {
        for (int i15 = 0; i15 < 9; i15++) {
            this.f91013e[i15] = 0.0f;
        }
    }

    public void d(pd.b bVar) {
        bVar.j(this.f91024p);
        bVar.j(this.f91030v);
        bVar.j(this.f91031w);
        bVar.j(this.f91020l);
        bVar.j(this.f91021m);
        bVar.j(this.f91022n);
        bVar.j(this.f91023o);
        bVar.j(this.f91025q);
        bVar.j(this.f91026r);
        bVar.j(this.f91027s);
        bVar.j(this.f91028t);
        bVar.j(this.f91029u);
    }

    public void e(a.b bVar) {
        a<Integer, Integer> aVar = this.f91024p;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f91030v;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f91031w;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f91020l;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f91021m;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<ud.d, ud.d> aVar6 = this.f91022n;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f91023o;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f91025q;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f91026r;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
        d dVar3 = this.f91027s;
        if (dVar3 != null) {
            dVar3.a(bVar);
            this.f91027s.a(new a.b() { // from class: id.p
                @Override // id.a.b
                public final void a() {
                    this.f91006a.f91019k = true;
                }
            });
        }
        d dVar4 = this.f91028t;
        if (dVar4 != null) {
            dVar4.a(bVar);
            this.f91028t.a(new a.b() { // from class: id.q
                @Override // id.a.b
                public final void a() {
                    this.f91007a.f91019k = true;
                }
            });
        }
        d dVar5 = this.f91029u;
        if (dVar5 != null) {
            dVar5.a(bVar);
            this.f91029u.a(new a.b() { // from class: id.r
                @Override // id.a.b
                public final void a() {
                    this.f91008a.f91019k = true;
                }
            });
        }
    }

    public <T> boolean f(T t15, ud.c<T> cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t15 == g0.f61249f) {
            a<PointF, PointF> aVar = this.f91020l;
            if (aVar == null) {
                this.f91020l = new t(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (t15 == g0.f61250g) {
            a<?, PointF> aVar2 = this.f91021m;
            if (aVar2 == null) {
                this.f91021m = new t(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (t15 == g0.f61251h) {
            a<?, PointF> aVar3 = this.f91021m;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (t15 == g0.f61252i) {
            a<?, PointF> aVar4 = this.f91021m;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (t15 == g0.f61258o) {
            a<ud.d, ud.d> aVar5 = this.f91022n;
            if (aVar5 == null) {
                this.f91022n = new t(cVar, new ud.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (t15 == g0.f61259p) {
            a<Float, Float> aVar6 = this.f91023o;
            if (aVar6 == null) {
                this.f91023o = new t(cVar, fValueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (t15 == g0.f61246c) {
            a<Integer, Integer> aVar7 = this.f91024p;
            if (aVar7 == null) {
                this.f91024p = new t(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (t15 == g0.F) {
            a<?, Float> aVar8 = this.f91030v;
            if (aVar8 == null) {
                this.f91030v = new t(cVar, fValueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (t15 == g0.G) {
            a<?, Float> aVar9 = this.f91031w;
            if (aVar9 == null) {
                this.f91031w = new t(cVar, fValueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (t15 == g0.f61263t) {
            if (this.f91025q == null) {
                this.f91025q = new d(Collections.singletonList(new ud.a(fValueOf2)));
            }
            this.f91025q.o(cVar);
            return true;
        }
        if (t15 == g0.f61264u) {
            if (this.f91026r == null) {
                this.f91026r = new d(Collections.singletonList(new ud.a(fValueOf2)));
            }
            this.f91026r.o(cVar);
            return true;
        }
        if (t15 == g0.f61260q) {
            if (this.f91027s == null) {
                this.f91027s = new d(Collections.singletonList(new ud.a(fValueOf2)));
            }
            this.f91027s.o(cVar);
            return true;
        }
        if (t15 == g0.f61261r) {
            if (this.f91028t == null) {
                this.f91028t = new d(Collections.singletonList(new ud.a(fValueOf2)));
            }
            this.f91028t.o(cVar);
            return true;
        }
        if (t15 != g0.f61262s) {
            return false;
        }
        if (this.f91029u == null) {
            this.f91029u = new d(Collections.singletonList(new ud.a(fValueOf2)));
        }
        this.f91029u.o(cVar);
        return true;
    }

    public a<?, Float> h() {
        return this.f91031w;
    }

    public Matrix i() {
        d dVar;
        d dVar2;
        PointF pointFH;
        ud.d dVarH;
        PointF pointFH2;
        this.f91009a.reset();
        d dVar3 = this.f91027s;
        if ((dVar3 != null && dVar3.r() != 0.0f) || (((dVar = this.f91028t) != null && dVar.r() != 0.0f) || ((dVar2 = this.f91029u) != null && dVar2.r() != 0.0f))) {
            d dVar4 = this.f91027s;
            float fR = dVar4 != null ? dVar4.r() : 0.0f;
            d dVar5 = this.f91028t;
            float fR2 = dVar5 != null ? dVar5.r() : 0.0f;
            d dVar6 = this.f91029u;
            float fR3 = dVar6 != null ? dVar6.r() : 0.0f;
            if (this.f91019k || fR != this.f91014f || fR2 != this.f91015g || fR3 != this.f91016h) {
                this.f91014f = fR;
                this.f91015g = fR2;
                this.f91016h = fR3;
                if (fR != 0.0f) {
                    this.f91017i = (float) Math.cos(Math.toRadians(fR));
                } else {
                    this.f91017i = 1.0f;
                }
                if (fR2 != 0.0f) {
                    this.f91018j = (float) Math.cos(Math.toRadians(fR2));
                } else {
                    this.f91018j = 1.0f;
                }
                this.f91019k = false;
            }
            a<PointF, PointF> aVar = this.f91020l;
            PointF pointFH3 = aVar == null ? null : aVar.h();
            a<?, PointF> aVar2 = this.f91021m;
            PointF pointFH4 = aVar2 == null ? null : aVar2.h();
            a<ud.d, ud.d> aVar3 = this.f91022n;
            ud.d dVarH2 = aVar3 != null ? aVar3.h() : null;
            td.l.b(this.f91009a, pointFH3, pointFH4, dVarH2 != null ? dVarH2.b() : 1.0f, dVarH2 != null ? dVarH2.c() : 1.0f, fR, fR2, fR3, this.f91017i, this.f91018j);
            return this.f91009a;
        }
        a<?, PointF> aVar4 = this.f91021m;
        if (aVar4 != null && (pointFH2 = aVar4.h()) != null) {
            float f15 = pointFH2.x;
            if (f15 != 0.0f || pointFH2.y != 0.0f) {
                this.f91009a.preTranslate(f15, pointFH2.y);
            }
        }
        if (!this.f91032x) {
            a<Float, Float> aVar5 = this.f91023o;
            if (aVar5 != null) {
                float fFloatValue = aVar5 instanceof t ? aVar5.h().floatValue() : ((d) aVar5).r();
                if (fFloatValue != 0.0f) {
                    this.f91009a.preRotate(fFloatValue);
                }
            }
        } else if (aVar4 != null) {
            float f16 = aVar4.f();
            PointF pointFH5 = aVar4.h();
            float f17 = pointFH5.x;
            float f18 = pointFH5.y;
            aVar4.n(1.0E-4f + f16);
            PointF pointFH6 = aVar4.h();
            aVar4.n(f16);
            this.f91009a.preRotate((float) Math.toDegrees(Math.atan2(pointFH6.y - f18, pointFH6.x - f17)));
        }
        d dVar7 = this.f91025q;
        if (dVar7 != null) {
            d dVar8 = this.f91026r;
            float fCos = dVar8 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar8.r()) + 90.0f));
            d dVar9 = this.f91026r;
            float fSin = dVar9 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar9.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar7.r()));
            g();
            float[] fArr = this.f91013e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f19 = -fSin;
            fArr[3] = f19;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f91010b.setValues(fArr);
            g();
            float[] fArr2 = this.f91013e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f91011c.setValues(fArr2);
            g();
            float[] fArr3 = this.f91013e;
            fArr3[0] = fCos;
            fArr3[1] = f19;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f91012d.setValues(fArr3);
            this.f91011c.preConcat(this.f91010b);
            this.f91012d.preConcat(this.f91011c);
            this.f91009a.preConcat(this.f91012d);
        }
        a<ud.d, ud.d> aVar6 = this.f91022n;
        if (aVar6 != null && (dVarH = aVar6.h()) != null && (dVarH.b() != 1.0f || dVarH.c() != 1.0f)) {
            this.f91009a.preScale(dVarH.b(), dVarH.c());
        }
        a<PointF, PointF> aVar7 = this.f91020l;
        if (aVar7 != null && (pointFH = aVar7.h()) != null) {
            float f25 = pointFH.x;
            if (f25 != 0.0f || pointFH.y != 0.0f) {
                this.f91009a.preTranslate(-f25, -pointFH.y);
            }
        }
        return this.f91009a;
    }

    public Matrix j(float f15) {
        a<?, PointF> aVar = this.f91021m;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<ud.d, ud.d> aVar2 = this.f91022n;
        ud.d dVarH = aVar2 == null ? null : aVar2.h();
        a<PointF, PointF> aVar3 = this.f91020l;
        PointF pointFH2 = aVar3 != null ? aVar3.h() : null;
        this.f91009a.reset();
        if (pointFH != null) {
            this.f91009a.preTranslate(pointFH.x * f15, pointFH.y * f15);
        }
        d dVar = this.f91027s;
        float fR = dVar != null ? dVar.r() * f15 : 0.0f;
        d dVar2 = this.f91028t;
        float fR2 = dVar2 != null ? dVar2.r() * f15 : 0.0f;
        d dVar3 = this.f91029u;
        float fR3 = dVar3 != null ? dVar3.r() * f15 : 0.0f;
        if (fR == 0.0f && fR2 == 0.0f && fR3 == 0.0f) {
            a<Float, Float> aVar4 = this.f91023o;
            if (aVar4 != null) {
                this.f91009a.preRotate(aVar4.h().floatValue() * f15, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
            }
        } else {
            float fCos = fR != 0.0f ? (float) Math.cos(Math.toRadians(fR)) : 1.0f;
            float fCos2 = fR2 != 0.0f ? (float) Math.cos(Math.toRadians(fR2)) : 1.0f;
            if (fR3 != 0.0f) {
                this.f91009a.preRotate(fR3, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
            }
            td.l.a(this.f91009a, fR, fR2, 0.0f, fCos, fCos2);
        }
        if (dVarH != null) {
            double d15 = f15;
            this.f91009a.preScale((float) Math.pow(dVarH.b(), d15), (float) Math.pow(dVarH.c(), d15));
        }
        return this.f91009a;
    }

    public a<?, Integer> k() {
        return this.f91024p;
    }

    public a<?, Float> l() {
        return this.f91030v;
    }

    public void m(float f15) {
        a<Integer, Integer> aVar = this.f91024p;
        if (aVar != null) {
            aVar.n(f15);
        }
        a<?, Float> aVar2 = this.f91030v;
        if (aVar2 != null) {
            aVar2.n(f15);
        }
        a<?, Float> aVar3 = this.f91031w;
        if (aVar3 != null) {
            aVar3.n(f15);
        }
        a<PointF, PointF> aVar4 = this.f91020l;
        if (aVar4 != null) {
            aVar4.n(f15);
        }
        a<?, PointF> aVar5 = this.f91021m;
        if (aVar5 != null) {
            aVar5.n(f15);
        }
        a<ud.d, ud.d> aVar6 = this.f91022n;
        if (aVar6 != null) {
            aVar6.n(f15);
        }
        a<Float, Float> aVar7 = this.f91023o;
        if (aVar7 != null) {
            aVar7.n(f15);
        }
        d dVar = this.f91025q;
        if (dVar != null) {
            dVar.n(f15);
        }
        d dVar2 = this.f91026r;
        if (dVar2 != null) {
            dVar2.n(f15);
        }
        d dVar3 = this.f91027s;
        if (dVar3 != null) {
            dVar3.n(f15);
        }
        d dVar4 = this.f91028t;
        if (dVar4 != null) {
            dVar4.n(f15);
        }
        d dVar5 = this.f91029u;
        if (dVar5 != null) {
            dVar5.n(f15);
        }
    }
}
