package hd;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import fd.a0;
import fd.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n implements m, id.a.b, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a0 f83654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final od.k.a f83655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f83656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f83657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final id.a<?, Float> f83658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final id.a<?, PointF> f83659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final id.a<?, Float> f83660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final id.a<?, Float> f83661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final id.a<?, Float> f83662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final id.a<?, Float> f83663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final id.a<?, Float> f83664p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f83666r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83649a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f83650b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PathMeasure f83651c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f83652d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f83665q = new b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83667a;

        static {
            int[] iArr = new int[od.k.a.values().length];
            f83667a = iArr;
            try {
                iArr[od.k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83667a[od.k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(a0 a0Var, pd.b bVar, od.k kVar) {
        this.f83654f = a0Var;
        this.f83653e = kVar.d();
        od.k.a aVarJ = kVar.j();
        this.f83655g = aVarJ;
        this.f83656h = kVar.k();
        this.f83657i = kVar.l();
        id.d dVarL = kVar.g().l();
        this.f83658j = dVarL;
        id.a<PointF, PointF> aVarL = kVar.h().l();
        this.f83659k = aVarL;
        id.d dVarL2 = kVar.i().l();
        this.f83660l = dVarL2;
        id.d dVarL3 = kVar.e().l();
        this.f83662n = dVarL3;
        id.d dVarL4 = kVar.f().l();
        this.f83664p = dVarL4;
        od.k.a aVar = od.k.a.STAR;
        if (aVarJ == aVar) {
            this.f83661m = kVar.b().l();
            this.f83663o = kVar.c().l();
        } else {
            this.f83661m = null;
            this.f83663o = null;
        }
        bVar.j(dVarL);
        bVar.j(aVarL);
        bVar.j(dVarL2);
        bVar.j(dVarL3);
        bVar.j(dVarL4);
        if (aVarJ == aVar) {
            bVar.j(this.f83661m);
            bVar.j(this.f83663o);
        }
        dVarL.a(this);
        aVarL.a(this);
        dVarL2.a(this);
        dVarL3.a(this);
        dVarL4.a(this);
        if (aVarJ == aVar) {
            this.f83661m.a(this);
            this.f83663o.a(this);
        }
    }

    private void h() {
        double d15;
        float f15;
        float f16;
        float f17;
        int iFloor = (int) Math.floor(this.f83658j.h().floatValue());
        id.a<?, Float> aVar = this.f83660l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d16 = iFloor;
        float fFloatValue = this.f83664p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f83662n.h().floatValue();
        double d17 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d17);
        float fSin = (float) (Math.sin(radians) * d17);
        this.f83649a.moveTo(fCos, fSin);
        double d18 = (float) (6.283185307179586d / d16);
        double dCeil = Math.ceil(d16);
        double d19 = radians + d18;
        int i15 = 0;
        while (true) {
            double d25 = i15;
            if (d25 >= dCeil) {
                PointF pointFH = this.f83659k.h();
                this.f83649a.offset(pointFH.x, pointFH.y);
                this.f83649a.close();
                return;
            }
            float fCos2 = (float) (d17 * Math.cos(d19));
            float fSin2 = (float) (Math.sin(d19) * d17);
            if (fFloatValue != 0.0f) {
                d15 = dCeil;
                f15 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f18 = fFloatValue2 * f15 * 0.25f;
                float f19 = f18 * fCos3;
                float f25 = f18 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f18;
                float fSin4 = f18 * ((float) Math.sin(dAtan3));
                if (d25 == d15 - 1.0d) {
                    this.f83650b.reset();
                    this.f83650b.moveTo(fCos, fSin);
                    float f26 = fCos - f19;
                    float f27 = fSin - f25;
                    float f28 = fCos2 + fCos4;
                    float f29 = fSin2 + fSin4;
                    f16 = fCos2;
                    f17 = fSin2;
                    this.f83650b.cubicTo(f26, f27, f28, f29, f16, f17);
                    this.f83651c.setPath(this.f83650b, false);
                    PathMeasure pathMeasure = this.f83651c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f83652d, null);
                    Path path = this.f83649a;
                    float[] fArr = this.f83652d;
                    path.cubicTo(f26, f27, f28, f29, fArr[0], fArr[1]);
                } else {
                    f16 = fCos2;
                    f17 = fSin2;
                    this.f83649a.cubicTo(fCos - f19, fSin - f25, f16 + fCos4, f17 + fSin4, f16, f17);
                }
                fCos = f16;
                fSin = f17;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d15 = dCeil;
                f15 = fFloatValue;
                if (d25 != d15 - 1.0d) {
                    this.f83649a.lineTo(fCos, fSin);
                }
                i15++;
                dCeil = d15;
                fFloatValue = f15;
            }
            d19 += d18;
            i15++;
            dCeil = d15;
            fFloatValue = f15;
        }
    }

    private void j() {
        float f15;
        float f16;
        float fCos;
        float fSin;
        float f17;
        double d15;
        float f18;
        float f19;
        float f25;
        float fFloatValue = this.f83658j.h().floatValue();
        id.a<?, Float> aVar = this.f83660l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d16 = fFloatValue;
        float f26 = (float) (6.283185307179586d / d16);
        if (this.f83657i) {
            f26 *= -1.0f;
        }
        float f27 = f26 / 2.0f;
        float f28 = fFloatValue - ((int) fFloatValue);
        if (f28 != 0.0f) {
            radians += (double) ((1.0f - f28) * f27);
        }
        float fFloatValue2 = this.f83662n.h().floatValue();
        float fFloatValue3 = this.f83661m.h().floatValue();
        id.a<?, Float> aVar2 = this.f83663o;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        id.a<?, Float> aVar3 = this.f83664p;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f28 != 0.0f) {
            f18 = ((fFloatValue2 - fFloatValue3) * f28) + fFloatValue3;
            f16 = 0.0f;
            double d17 = f18;
            f15 = 2.0f;
            float fCos2 = (float) (d17 * Math.cos(radians));
            fSin = (float) (d17 * Math.sin(radians));
            this.f83649a.moveTo(fCos2, fSin);
            d15 = radians + ((double) ((f26 * f28) / 2.0f));
            fCos = fCos2;
            f17 = f27;
        } else {
            f15 = 2.0f;
            f16 = 0.0f;
            double d18 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d18);
            fSin = (float) (d18 * Math.sin(radians));
            this.f83649a.moveTo(fCos, fSin);
            f17 = f27;
            d15 = radians + ((double) f17);
            f18 = 0.0f;
        }
        double dCeil = Math.ceil(d16) * 2.0d;
        int i15 = 0;
        boolean z15 = false;
        double d19 = d15;
        float f29 = fSin;
        float f35 = fCos;
        double d25 = d19;
        while (true) {
            double d26 = i15;
            if (d26 >= dCeil) {
                PointF pointFH = this.f83659k.h();
                this.f83649a.offset(pointFH.x, pointFH.y);
                this.f83649a.close();
                return;
            }
            float f36 = z15 ? fFloatValue2 : fFloatValue3;
            float f37 = (f18 == f16 || d26 != dCeil - 2.0d) ? f17 : (f26 * f28) / f15;
            double d27 = (f18 == f16 || d26 != dCeil - 1.0d) ? f36 : f18;
            float fCos3 = (float) (d27 * Math.cos(d25));
            float f38 = f26;
            float fSin2 = (float) (d27 * Math.sin(d25));
            if (fFloatValue4 == f16 && fFloatValue5 == f16) {
                this.f83649a.lineTo(fCos3, fSin2);
                f25 = fCos3;
                f19 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f29, f35) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f39 = f35;
                float f45 = f29;
                f19 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f46 = z15 ? fFloatValue4 : fFloatValue5;
                float f47 = z15 ? fFloatValue5 : fFloatValue4;
                float f48 = (z15 ? fFloatValue3 : fFloatValue2) * f46 * 0.47829f;
                float f49 = fCos4 * f48;
                float f55 = f48 * fSin3;
                float f56 = (z15 ? fFloatValue2 : fFloatValue3) * f47 * 0.47829f;
                float f57 = fCos5 * f56;
                float f58 = f56 * fSin4;
                if (f28 != 0.0f) {
                    if (i15 == 0) {
                        f49 *= f28;
                        f55 *= f28;
                    } else if (d26 == dCeil - 1.0d) {
                        f57 *= f28;
                        f58 *= f28;
                    }
                }
                f25 = fCos3;
                this.f83649a.cubicTo(f39 - f49, f45 - f55, fCos3 + f57, f19 + f58, f25, f19);
            }
            d25 += (double) f37;
            z15 = !z15;
            i15++;
            f17 = f17;
            f35 = f25;
            f29 = f19;
            f26 = f38;
        }
    }

    private void k() {
        this.f83666r = false;
        this.f83654f.invalidateSelf();
    }

    @Override // hd.m
    public Path W() {
        if (this.f83666r) {
            return this.f83649a;
        }
        this.f83649a.reset();
        if (this.f83656h) {
            this.f83666r = true;
            return this.f83649a;
        }
        int i15 = a.f83667a[this.f83655g.ordinal()];
        if (i15 == 1) {
            j();
        } else if (i15 == 2) {
            h();
        }
        this.f83649a.close();
        this.f83665q.b(this.f83649a);
        this.f83666r = true;
        return this.f83649a;
    }

    @Override // id.a.b
    public void a() {
        k();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            c cVar = list.get(i15);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == od.t.a.SIMULTANEOUSLY) {
                    this.f83665q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        id.a<?, Float> aVar;
        id.a<?, Float> aVar2;
        if (t15 == g0.f61269z) {
            this.f83658j.o(cVar);
            return;
        }
        if (t15 == g0.A) {
            this.f83660l.o(cVar);
            return;
        }
        if (t15 == g0.f61257n) {
            this.f83659k.o(cVar);
            return;
        }
        if (t15 == g0.B && (aVar2 = this.f83661m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t15 == g0.C) {
            this.f83662n.o(cVar);
            return;
        }
        if (t15 == g0.D && (aVar = this.f83663o) != null) {
            aVar.o(cVar);
        } else if (t15 == g0.E) {
            this.f83664p.o(cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83653e;
    }
}
