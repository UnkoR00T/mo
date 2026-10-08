package hd;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o implements id.a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f83671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f83672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final id.a<?, PointF> f83673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final id.a<?, PointF> f83674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final id.a<?, Float> f83675h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f83678k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83668a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f83669b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f83676i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private id.a<Float, Float> f83677j = null;

    public o(a0 a0Var, pd.b bVar, od.l lVar) {
        this.f83670c = lVar.c();
        this.f83671d = lVar.f();
        this.f83672e = a0Var;
        id.a<PointF, PointF> aVarL = lVar.d().l();
        this.f83673f = aVarL;
        id.a<PointF, PointF> aVarL2 = lVar.e().l();
        this.f83674g = aVarL2;
        id.d dVarL = lVar.b().l();
        this.f83675h = dVarL;
        bVar.j(aVarL);
        bVar.j(aVarL2);
        bVar.j(dVarL);
        aVarL.a(this);
        aVarL2.a(this);
        dVarL.a(this);
    }

    private void h() {
        this.f83678k = false;
        this.f83672e.invalidateSelf();
    }

    @Override // hd.m
    public Path W() {
        id.a<Float, Float> aVar;
        if (this.f83678k) {
            return this.f83668a;
        }
        this.f83668a.reset();
        if (this.f83671d) {
            this.f83678k = true;
            return this.f83668a;
        }
        PointF pointFH = this.f83674g.h();
        float f15 = pointFH.x / 2.0f;
        float f16 = pointFH.y / 2.0f;
        id.a<?, Float> aVar2 = this.f83675h;
        float fR = aVar2 == null ? 0.0f : ((id.d) aVar2).r();
        if (fR == 0.0f && (aVar = this.f83677j) != null) {
            fR = Math.min(aVar.h().floatValue(), Math.min(f15, f16));
        }
        float fMin = Math.min(f15, f16);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f83673f.h();
        this.f83668a.moveTo(pointFH2.x + f15, (pointFH2.y - f16) + fR);
        this.f83668a.lineTo(pointFH2.x + f15, (pointFH2.y + f16) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.f83669b;
            float f17 = pointFH2.x;
            float f18 = fR * 2.0f;
            float f19 = pointFH2.y;
            rectF.set((f17 + f15) - f18, (f19 + f16) - f18, f17 + f15, f19 + f16);
            this.f83668a.arcTo(this.f83669b, 0.0f, 90.0f, false);
        }
        this.f83668a.lineTo((pointFH2.x - f15) + fR, pointFH2.y + f16);
        if (fR > 0.0f) {
            RectF rectF2 = this.f83669b;
            float f25 = pointFH2.x;
            float f26 = pointFH2.y;
            float f27 = fR * 2.0f;
            rectF2.set(f25 - f15, (f26 + f16) - f27, (f25 - f15) + f27, f26 + f16);
            this.f83668a.arcTo(this.f83669b, 90.0f, 90.0f, false);
        }
        this.f83668a.lineTo(pointFH2.x - f15, (pointFH2.y - f16) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.f83669b;
            float f28 = pointFH2.x;
            float f29 = pointFH2.y;
            float f35 = fR * 2.0f;
            rectF3.set(f28 - f15, f29 - f16, (f28 - f15) + f35, (f29 - f16) + f35);
            this.f83668a.arcTo(this.f83669b, 180.0f, 90.0f, false);
        }
        this.f83668a.lineTo((pointFH2.x + f15) - fR, pointFH2.y - f16);
        if (fR > 0.0f) {
            RectF rectF4 = this.f83669b;
            float f36 = pointFH2.x;
            float f37 = fR * 2.0f;
            float f38 = pointFH2.y;
            rectF4.set((f36 + f15) - f37, f38 - f16, f36 + f15, (f38 - f16) + f37);
            this.f83668a.arcTo(this.f83669b, 270.0f, 90.0f, false);
        }
        this.f83668a.close();
        this.f83676i.b(this.f83668a);
        this.f83678k = true;
        return this.f83668a;
    }

    @Override // id.a.b
    public void a() {
        h();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            c cVar = list.get(i15);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == od.t.a.SIMULTANEOUSLY) {
                    this.f83676i.a(uVar);
                    uVar.c(this);
                } else if (cVar instanceof q) {
                    this.f83677j = ((q) cVar).h();
                }
            } else if (cVar instanceof q) {
                this.f83677j = ((q) cVar).h();
            }
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (t15 == g0.f61255l) {
            this.f83674g.o(cVar);
        } else if (t15 == g0.f61257n) {
            this.f83673f.o(cVar);
        } else if (t15 == g0.f61256m) {
            this.f83675h.o(cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83670c;
    }
}
