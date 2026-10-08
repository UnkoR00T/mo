package id;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class c implements id.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.b f90968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a.b f90969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final id.a<Integer, Integer> f90970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f90971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f90972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f90973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f90974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f90975h;

    class a extends ud.c<Float> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ud.c f90976d;

        a(ud.c cVar) {
            this.f90976d = cVar;
        }

        @Override // ud.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(ud.b<Float> bVar) {
            Float f15 = (Float) this.f90976d.a(bVar);
            if (f15 == null) {
                return null;
            }
            return Float.valueOf(f15.floatValue() * 2.55f);
        }
    }

    public c(id.a.b bVar, pd.b bVar2, rd.j jVar) {
        this.f90969b = bVar;
        this.f90968a = bVar2;
        id.a<Integer, Integer> aVarL = jVar.a().l();
        this.f90970c = aVarL;
        aVarL.a(this);
        bVar2.j(aVarL);
        d dVarL = jVar.d().l();
        this.f90971d = dVarL;
        dVarL.a(this);
        bVar2.j(dVarL);
        d dVarL2 = jVar.b().l();
        this.f90972e = dVarL2;
        dVarL2.a(this);
        bVar2.j(dVarL2);
        d dVarL3 = jVar.c().l();
        this.f90973f = dVarL3;
        dVarL3.a(this);
        bVar2.j(dVarL3);
        d dVarL4 = jVar.e().l();
        this.f90974g = dVarL4;
        dVarL4.a(this);
        bVar2.j(dVarL4);
    }

    @Override // id.a.b
    public void a() {
        this.f90969b.a();
    }

    public td.b b(Matrix matrix, int i15) {
        float fR = this.f90972e.r() * 0.017453292f;
        float fFloatValue = this.f90973f.h().floatValue();
        double d15 = fR;
        float fSin = ((float) Math.sin(d15)) * fFloatValue;
        float fCos = ((float) Math.cos(d15 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f90974g.h().floatValue();
        int iIntValue = this.f90970c.h().intValue();
        td.b bVar = new td.b(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f90971d.h().floatValue() * i15) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        bVar.k(matrix);
        if (this.f90975h == null) {
            this.f90975h = new Matrix();
        }
        this.f90968a.f156931x.i().invert(this.f90975h);
        bVar.k(this.f90975h);
        return bVar;
    }

    public void c(ud.c<Integer> cVar) {
        this.f90970c.o(cVar);
    }

    public void d(ud.c<Float> cVar) {
        this.f90972e.o(cVar);
    }

    public void e(ud.c<Float> cVar) {
        this.f90973f.o(cVar);
    }

    public void f(ud.c<Float> cVar) {
        if (cVar == null) {
            this.f90971d.o(null);
        } else {
            this.f90971d.o(new a(cVar));
        }
    }

    public void g(ud.c<Float> cVar) {
        this.f90974g.o(cVar);
    }
}
