package hd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e, id.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f83600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f83601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pd.b f83602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f83604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<m> f83605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final id.a<Integer, Integer> f83606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final id.a<Integer, Integer> f83607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private id.a<ColorFilter, ColorFilter> f83608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a0 f83609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private id.a<Float, Float> f83610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f83611l;

    public g(a0 a0Var, pd.b bVar, od.p pVar) {
        Path path = new Path();
        this.f83600a = path;
        this.f83601b = new gd.a(1);
        this.f83605f = new ArrayList();
        this.f83602c = bVar;
        this.f83603d = pVar.d();
        this.f83604e = pVar.f();
        this.f83609j = a0Var;
        if (bVar.x() != null) {
            id.d dVarL = bVar.x().a().l();
            this.f83610k = dVarL;
            dVarL.a(this);
            bVar.j(this.f83610k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f83606g = null;
            this.f83607h = null;
            return;
        }
        path.setFillType(pVar.c());
        id.a<Integer, Integer> aVarL = pVar.b().l();
        this.f83606g = aVarL;
        aVarL.a(this);
        bVar.j(aVarL);
        id.a<Integer, Integer> aVarL2 = pVar.e().l();
        this.f83607h = aVarL2;
        aVarL2.a(this);
        bVar.j(aVarL2);
    }

    @Override // id.a.b
    public void a() {
        this.f83609j.invalidateSelf();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < list2.size(); i15++) {
            c cVar = list2.get(i15);
            if (cVar instanceof m) {
                this.f83605f.add((m) cVar);
            }
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (this.f83604e) {
            return;
        }
        if (fd.e.h()) {
            fd.e.b("FillContent#draw");
        }
        int iR = ((id.b) this.f83606g).r();
        float fIntValue = this.f83607h.h().intValue() / 100.0f;
        this.f83601b.setColor((td.j.c((int) (i15 * fIntValue), 0, GF2Field.MASK) << 24) | (iR & 16777215));
        id.a<ColorFilter, ColorFilter> aVar = this.f83608i;
        if (aVar != null) {
            this.f83601b.setColorFilter(aVar.h());
        }
        id.a<Float, Float> aVar2 = this.f83610k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f83601b.setMaskFilter(null);
            } else if (fFloatValue != this.f83611l) {
                this.f83601b.setMaskFilter(this.f83602c.y(fFloatValue));
            }
            this.f83611l = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f83601b);
        } else {
            this.f83601b.clearShadowLayer();
        }
        this.f83600a.reset();
        for (int i16 = 0; i16 < this.f83605f.size(); i16++) {
            this.f83600a.addPath(this.f83605f.get(i16).W(), matrix);
        }
        canvas.drawPath(this.f83600a, this.f83601b);
        if (fd.e.h()) {
            fd.e.c("FillContent#draw");
        }
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        this.f83600a.reset();
        for (int i15 = 0; i15 < this.f83605f.size(); i15++) {
            this.f83600a.addPath(this.f83605f.get(i15).W(), matrix);
        }
        this.f83600a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (t15 == g0.f61244a) {
            this.f83606g.o(cVar);
            return;
        }
        if (t15 == g0.f61247d) {
            this.f83607h.o(cVar);
            return;
        }
        if (t15 == g0.N) {
            id.a<ColorFilter, ColorFilter> aVar = this.f83608i;
            if (aVar != null) {
                this.f83602c.H(aVar);
            }
            if (cVar == null) {
                this.f83608i = null;
                return;
            }
            id.t tVar = new id.t(cVar);
            this.f83608i = tVar;
            tVar.a(this);
            this.f83602c.j(this.f83608i);
            return;
        }
        if (t15 == g0.f61253j) {
            id.a<Float, Float> aVar2 = this.f83610k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            id.t tVar2 = new id.t(cVar);
            this.f83610k = tVar2;
            tVar2.a(this);
            this.f83602c.j(this.f83610k);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83603d;
    }
}
