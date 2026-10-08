package hd;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements id.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f83565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final pd.b f83566f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f83568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Paint f83569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final id.a<?, Float> f83570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final id.a<?, Integer> f83571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<id.a<?, Float>> f83572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final id.a<?, Float> f83573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private id.a<ColorFilter, ColorFilter> f83574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private id.a<Float, Float> f83575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f83576p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f83561a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f83562b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f83563c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f83564d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f83567g = new ArrayList();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<m> f83577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f83578b;

        private b(u uVar) {
            this.f83577a = new ArrayList();
            this.f83578b = uVar;
        }
    }

    a(a0 a0Var, pd.b bVar, Paint.Cap cap, Paint.Join join, float f15, nd.d dVar, nd.b bVar2, List<nd.b> list, nd.b bVar3) {
        gd.a aVar = new gd.a(1);
        this.f83569i = aVar;
        this.f83576p = 0.0f;
        this.f83565e = a0Var;
        this.f83566f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f15);
        this.f83571k = dVar.l();
        this.f83570j = bVar2.l();
        if (bVar3 == null) {
            this.f83573m = null;
        } else {
            this.f83573m = bVar3.l();
        }
        this.f83572l = new ArrayList(list.size());
        this.f83568h = new float[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            this.f83572l.add(list.get(i15).l());
        }
        bVar.j(this.f83571k);
        bVar.j(this.f83570j);
        for (int i16 = 0; i16 < this.f83572l.size(); i16++) {
            bVar.j(this.f83572l.get(i16));
        }
        id.a<?, Float> aVar2 = this.f83573m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f83571k.a(this);
        this.f83570j.a(this);
        for (int i17 = 0; i17 < list.size(); i17++) {
            this.f83572l.get(i17).a(this);
        }
        id.a<?, Float> aVar3 = this.f83573m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            id.d dVarL = bVar.x().a().l();
            this.f83575o = dVarL;
            dVarL.a(this);
            bVar.j(this.f83575o);
        }
    }

    private void h() {
        if (fd.e.h()) {
            fd.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f83572l.isEmpty()) {
            if (fd.e.h()) {
                fd.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i15 = 0; i15 < this.f83572l.size(); i15++) {
            this.f83568h[i15] = this.f83572l.get(i15).h().floatValue();
            if (i15 % 2 == 0) {
                float[] fArr = this.f83568h;
                if (fArr[i15] < 1.0f) {
                    fArr[i15] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f83568h;
                if (fArr2[i15] < 0.1f) {
                    fArr2[i15] = 0.1f;
                }
            }
        }
        id.a<?, Float> aVar = this.f83573m;
        this.f83569i.setPathEffect(new DashPathEffect(this.f83568h, aVar == null ? 0.0f : aVar.h().floatValue()));
        if (fd.e.h()) {
            fd.e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    private void j(Canvas canvas, b bVar) {
        float f15;
        if (fd.e.h()) {
            fd.e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.f83578b == null) {
            if (fd.e.h()) {
                fd.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f83562b.reset();
        for (int size = bVar.f83577a.size() - 1; size >= 0; size--) {
            this.f83562b.addPath(((m) bVar.f83577a.get(size)).W());
        }
        float fFloatValue = bVar.f83578b.j().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f83578b.g().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f83578b.h().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f83562b, this.f83569i);
            if (fd.e.h()) {
                fd.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f83561a.setPath(this.f83562b, false);
        float length = this.f83561a.getLength();
        while (this.f83561a.nextContour()) {
            length += this.f83561a.getLength();
        }
        float f16 = fFloatValue3 * length;
        float f17 = (fFloatValue * length) + f16;
        float fMin = Math.min((fFloatValue2 * length) + f16, (f17 + length) - 1.0f);
        float f18 = 0.0f;
        for (int size2 = bVar.f83577a.size() - 1; size2 >= 0; size2--) {
            this.f83563c.set(((m) bVar.f83577a.get(size2)).W());
            this.f83561a.setPath(this.f83563c, false);
            float length2 = this.f83561a.getLength();
            if (fMin > length) {
                float f19 = fMin - length;
                if (f19 >= f18 + length2 || f18 >= f19) {
                    f15 = f18 + length2;
                    if (f15 < f17 && f18 <= fMin) {
                        if (f15 > fMin || f17 >= f18) {
                            td.m.a(this.f83563c, f17 < f18 ? 0.0f : (f17 - f18) / length2, fMin > f15 ? 1.0f : (fMin - f18) / length2, 0.0f);
                            canvas.drawPath(this.f83563c, this.f83569i);
                        } else {
                            canvas.drawPath(this.f83563c, this.f83569i);
                        }
                    }
                } else {
                    td.m.a(this.f83563c, f17 > length ? (f17 - length) / length2 : 0.0f, Math.min(f19 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f83563c, this.f83569i);
                }
            } else {
                f15 = f18 + length2;
                if (f15 < f17) {
                }
            }
            f18 += length2;
        }
        if (fd.e.h()) {
            fd.e.c("StrokeContent#applyTrimPath");
        }
    }

    @Override // id.a.b
    public void a() {
        this.f83565e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == od.t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.k() == od.t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f83567g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                } else if (!(cVar2 instanceof m)) {
                    if (bVar == null) {
                        bVar = new b(uVar);
                    }
                    bVar.f83577a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f83577a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f83567g.add(bVar);
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (fd.e.h()) {
            fd.e.b("StrokeContent#draw");
        }
        if (td.m.h(matrix)) {
            if (fd.e.h()) {
                fd.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f83571k.h().intValue() / 100.0f;
        this.f83569i.setAlpha(td.j.c((int) (i15 * fIntValue), 0, GF2Field.MASK));
        this.f83569i.setStrokeWidth(((id.d) this.f83570j).r());
        if (this.f83569i.getStrokeWidth() <= 0.0f) {
            if (fd.e.h()) {
                fd.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        h();
        id.a<ColorFilter, ColorFilter> aVar = this.f83574n;
        if (aVar != null) {
            this.f83569i.setColorFilter(aVar.h());
        }
        id.a<Float, Float> aVar2 = this.f83575o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f83569i.setMaskFilter(null);
            } else if (fFloatValue != this.f83576p) {
                this.f83569i.setMaskFilter(this.f83566f.y(fFloatValue));
            }
            this.f83576p = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f83569i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i16 = 0; i16 < this.f83567g.size(); i16++) {
            b bVar2 = this.f83567g.get(i16);
            if (bVar2.f83578b != null) {
                j(canvas, bVar2);
            } else {
                if (fd.e.h()) {
                    fd.e.b("StrokeContent#buildPath");
                }
                this.f83562b.reset();
                for (int size = bVar2.f83577a.size() - 1; size >= 0; size--) {
                    this.f83562b.addPath(((m) bVar2.f83577a.get(size)).W());
                }
                if (fd.e.h()) {
                    fd.e.c("StrokeContent#buildPath");
                    fd.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f83562b, this.f83569i);
                if (fd.e.h()) {
                    fd.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (fd.e.h()) {
            fd.e.c("StrokeContent#draw");
        }
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        if (fd.e.h()) {
            fd.e.b("StrokeContent#getBounds");
        }
        this.f83562b.reset();
        for (int i15 = 0; i15 < this.f83567g.size(); i15++) {
            b bVar = this.f83567g.get(i15);
            for (int i16 = 0; i16 < bVar.f83577a.size(); i16++) {
                this.f83562b.addPath(((m) bVar.f83577a.get(i16)).W(), matrix);
            }
        }
        this.f83562b.computeBounds(this.f83564d, false);
        float fR = ((id.d) this.f83570j).r();
        RectF rectF2 = this.f83564d;
        float f15 = fR / 2.0f;
        rectF2.set(rectF2.left - f15, rectF2.top - f15, rectF2.right + f15, rectF2.bottom + f15);
        rectF.set(this.f83564d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (fd.e.h()) {
            fd.e.c("StrokeContent#getBounds");
        }
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (t15 == g0.f61247d) {
            this.f83571k.o(cVar);
            return;
        }
        if (t15 == g0.f61265v) {
            this.f83570j.o(cVar);
            return;
        }
        if (t15 == g0.N) {
            id.a<ColorFilter, ColorFilter> aVar = this.f83574n;
            if (aVar != null) {
                this.f83566f.H(aVar);
            }
            if (cVar == null) {
                this.f83574n = null;
                return;
            }
            id.t tVar = new id.t(cVar);
            this.f83574n = tVar;
            tVar.a(this);
            this.f83566f.j(this.f83574n);
            return;
        }
        if (t15 == g0.f61253j) {
            id.a<Float, Float> aVar2 = this.f83575o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            id.t tVar2 = new id.t(cVar);
            this.f83575o = tVar2;
            tVar2.a(this);
            this.f83566f.j(this.f83575o);
        }
    }
}
