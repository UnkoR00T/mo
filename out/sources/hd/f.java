package hd;

import android.graphics.Path;
import android.graphics.PointF;
import fd.a0;
import fd.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements m, id.a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f83594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.a<?, PointF> f83595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final id.a<?, PointF> f83596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final od.b f83597f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f83599h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83592a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f83598g = new b();

    public f(a0 a0Var, pd.b bVar, od.b bVar2) {
        this.f83593b = bVar2.b();
        this.f83594c = a0Var;
        id.a<PointF, PointF> aVarL = bVar2.d().l();
        this.f83595d = aVarL;
        id.a<PointF, PointF> aVarL2 = bVar2.c().l();
        this.f83596e = aVarL2;
        this.f83597f = bVar2;
        bVar.j(aVarL);
        bVar.j(aVarL2);
        aVarL.a(this);
        aVarL2.a(this);
    }

    private void h() {
        this.f83599h = false;
        this.f83594c.invalidateSelf();
    }

    @Override // hd.m
    public Path W() {
        if (this.f83599h) {
            return this.f83592a;
        }
        this.f83592a.reset();
        if (this.f83597f.e()) {
            this.f83599h = true;
            return this.f83592a;
        }
        PointF pointFH = this.f83595d.h();
        float f15 = pointFH.x / 2.0f;
        float f16 = pointFH.y / 2.0f;
        float f17 = f15 * 0.55228f;
        float f18 = 0.55228f * f16;
        this.f83592a.reset();
        if (this.f83597f.f()) {
            float f19 = -f16;
            this.f83592a.moveTo(0.0f, f19);
            float f25 = 0.0f - f17;
            float f26 = -f15;
            float f27 = 0.0f - f18;
            this.f83592a.cubicTo(f25, f19, f26, f27, f26, 0.0f);
            float f28 = f18 + 0.0f;
            this.f83592a.cubicTo(f26, f28, f25, f16, 0.0f, f16);
            float f29 = f17 + 0.0f;
            this.f83592a.cubicTo(f29, f16, f15, f28, f15, 0.0f);
            this.f83592a.cubicTo(f15, f27, f29, f19, 0.0f, f19);
        } else {
            float f35 = -f16;
            this.f83592a.moveTo(0.0f, f35);
            float f36 = f17 + 0.0f;
            float f37 = 0.0f - f18;
            this.f83592a.cubicTo(f36, f35, f15, f37, f15, 0.0f);
            float f38 = f18 + 0.0f;
            this.f83592a.cubicTo(f15, f38, f36, f16, 0.0f, f16);
            float f39 = 0.0f - f17;
            float f45 = -f15;
            this.f83592a.cubicTo(f39, f16, f45, f38, f45, 0.0f);
            this.f83592a.cubicTo(f45, f37, f39, f35, 0.0f, f35);
        }
        PointF pointFH2 = this.f83596e.h();
        this.f83592a.offset(pointFH2.x, pointFH2.y);
        this.f83592a.close();
        this.f83598g.b(this.f83592a);
        this.f83599h = true;
        return this.f83592a;
    }

    @Override // id.a.b
    public void a() {
        h();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            c cVar = list.get(i15);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == od.t.a.SIMULTANEOUSLY) {
                    this.f83598g.a(uVar);
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
        if (t15 == g0.f61254k) {
            this.f83595d.o(cVar);
        } else if (t15 == g0.f61257n) {
            this.f83596e.o(cVar);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83593b;
    }
}
