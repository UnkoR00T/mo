package hd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import fd.a0;
import fd.g0;

/* JADX INFO: loaded from: classes3.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final pd.b f83700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f83701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f83702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final id.a<Integer, Integer> f83703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private id.a<ColorFilter, ColorFilter> f83704u;

    public t(a0 a0Var, pd.b bVar, od.s sVar) {
        super(a0Var, bVar, sVar.b().e(), sVar.e().e(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f83700q = bVar;
        this.f83701r = sVar.h();
        this.f83702s = sVar.k();
        id.a<Integer, Integer> aVarL = sVar.c().l();
        this.f83703t = aVarL;
        aVarL.a(this);
        bVar.j(aVarL);
    }

    @Override // hd.a, hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (this.f83702s) {
            return;
        }
        this.f83569i.setColor(((id.b) this.f83703t).r());
        id.a<ColorFilter, ColorFilter> aVar = this.f83704u;
        if (aVar != null) {
            this.f83569i.setColorFilter(aVar.h());
        }
        super.d(canvas, matrix, i15, bVar);
    }

    @Override // hd.a, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        super.g(t15, cVar);
        if (t15 == g0.f61245b) {
            this.f83703t.o(cVar);
            return;
        }
        if (t15 == g0.N) {
            id.a<ColorFilter, ColorFilter> aVar = this.f83704u;
            if (aVar != null) {
                this.f83700q.H(aVar);
            }
            if (cVar == null) {
                this.f83704u = null;
                return;
            }
            id.t tVar = new id.t(cVar);
            this.f83704u = tVar;
            tVar.a(this);
            this.f83700q.j(this.f83703t);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83701r;
    }
}
