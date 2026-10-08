package hd;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import fd.g0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import r0.a0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e, id.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f83612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f83613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pd.b f83614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0<LinearGradient> f83615d = new a0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0<RadialGradient> f83616e = new a0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f83617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f83618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f83619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<m> f83620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final od.g f83621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final id.a<od.d, od.d> f83622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final id.a<Integer, Integer> f83623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final id.a<PointF, PointF> f83624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final id.a<PointF, PointF> f83625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private id.a<ColorFilter, ColorFilter> f83626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private id.t f83627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final fd.a0 f83628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f83629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private id.a<Float, Float> f83630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f83631t;

    public h(fd.a0 a0Var, fd.f fVar, pd.b bVar, od.e eVar) {
        Path path = new Path();
        this.f83617f = path;
        this.f83618g = new gd.a(1);
        this.f83619h = new RectF();
        this.f83620i = new ArrayList();
        this.f83631t = 0.0f;
        this.f83614c = bVar;
        this.f83612a = eVar.f();
        this.f83613b = eVar.i();
        this.f83628q = a0Var;
        this.f83621j = eVar.e();
        path.setFillType(eVar.c());
        this.f83629r = (int) (fVar.d() / 32.0f);
        id.a<od.d, od.d> aVarL = eVar.d().l();
        this.f83622k = aVarL;
        aVarL.a(this);
        bVar.j(aVarL);
        id.a<Integer, Integer> aVarL2 = eVar.g().l();
        this.f83623l = aVarL2;
        aVarL2.a(this);
        bVar.j(aVarL2);
        id.a<PointF, PointF> aVarL3 = eVar.h().l();
        this.f83624m = aVarL3;
        aVarL3.a(this);
        bVar.j(aVarL3);
        id.a<PointF, PointF> aVarL4 = eVar.b().l();
        this.f83625n = aVarL4;
        aVarL4.a(this);
        bVar.j(aVarL4);
        if (bVar.x() != null) {
            id.d dVarL = bVar.x().a().l();
            this.f83630s = dVarL;
            dVarL.a(this);
            bVar.j(this.f83630s);
        }
    }

    private int[] h(int[] iArr) {
        id.t tVar = this.f83627p;
        if (tVar != null) {
            Integer[] numArr = (Integer[]) tVar.h();
            int i15 = 0;
            if (iArr.length == numArr.length) {
                while (i15 < iArr.length) {
                    iArr[i15] = numArr[i15].intValue();
                    i15++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i15 < numArr.length) {
                    iArr[i15] = numArr[i15].intValue();
                    i15++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.f83624m.f() * this.f83629r);
        int iRound2 = Math.round(this.f83625n.f() * this.f83629r);
        int iRound3 = Math.round(this.f83622k.f() * this.f83629r);
        int i15 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i15 = i15 * 31 * iRound2;
        }
        return iRound3 != 0 ? i15 * 31 * iRound3 : i15;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j15 = j();
        LinearGradient linearGradientG = this.f83615d.g(j15);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f83624m.h();
        PointF pointFH2 = this.f83625n.h();
        od.d dVarH = this.f83622k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f83615d.m(j15, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j15 = j();
        RadialGradient radialGradientG = this.f83616e.g(j15);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f83624m.h();
        PointF pointFH2 = this.f83625n.h();
        od.d dVarH = this.f83622k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        float f15 = pointFH.x;
        float f16 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f15, pointFH2.y - f16);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f15, f16, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f83616e.m(j15, radialGradient);
        return radialGradient;
    }

    @Override // id.a.b
    public void a() {
        this.f83628q.invalidateSelf();
    }

    @Override // hd.c
    public void b(List<c> list, List<c> list2) {
        for (int i15 = 0; i15 < list2.size(); i15++) {
            c cVar = list2.get(i15);
            if (cVar instanceof m) {
                this.f83620i.add((m) cVar);
            }
        }
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        td.j.k(eVar, i15, list, eVar2, this);
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (this.f83613b) {
            return;
        }
        if (fd.e.h()) {
            fd.e.b("GradientFillContent#draw");
        }
        this.f83617f.reset();
        for (int i16 = 0; i16 < this.f83620i.size(); i16++) {
            this.f83617f.addPath(this.f83620i.get(i16).W(), matrix);
        }
        this.f83617f.computeBounds(this.f83619h, false);
        Shader shaderK = this.f83621j == od.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f83618g.setShader(shaderK);
        id.a<ColorFilter, ColorFilter> aVar = this.f83626o;
        if (aVar != null) {
            this.f83618g.setColorFilter(aVar.h());
        }
        id.a<Float, Float> aVar2 = this.f83630s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f83618g.setMaskFilter(null);
            } else if (fFloatValue != this.f83631t) {
                this.f83618g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f83631t = fFloatValue;
        }
        float fIntValue = this.f83623l.h().intValue() / 100.0f;
        this.f83618g.setAlpha(td.j.c((int) (i15 * fIntValue), 0, GF2Field.MASK));
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f83618g);
        }
        canvas.drawPath(this.f83617f, this.f83618g);
        if (fd.e.h()) {
            fd.e.c("GradientFillContent#draw");
        }
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        this.f83617f.reset();
        for (int i15 = 0; i15 < this.f83620i.size(); i15++) {
            this.f83617f.addPath(this.f83620i.get(i15).W(), matrix);
        }
        this.f83617f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        if (t15 == g0.f61247d) {
            this.f83623l.o(cVar);
            return;
        }
        if (t15 == g0.N) {
            id.a<ColorFilter, ColorFilter> aVar = this.f83626o;
            if (aVar != null) {
                this.f83614c.H(aVar);
            }
            if (cVar == null) {
                this.f83626o = null;
                return;
            }
            id.t tVar = new id.t(cVar);
            this.f83626o = tVar;
            tVar.a(this);
            this.f83614c.j(this.f83626o);
            return;
        }
        if (t15 != g0.O) {
            if (t15 == g0.f61253j) {
                id.a<Float, Float> aVar2 = this.f83630s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                id.t tVar2 = new id.t(cVar);
                this.f83630s = tVar2;
                tVar2.a(this);
                this.f83614c.j(this.f83630s);
                return;
            }
            return;
        }
        id.t tVar3 = this.f83627p;
        if (tVar3 != null) {
            this.f83614c.H(tVar3);
        }
        if (cVar == null) {
            this.f83627p = null;
            return;
        }
        this.f83615d.b();
        this.f83616e.b();
        id.t tVar4 = new id.t(cVar);
        this.f83627p = tVar4;
        tVar4.a(this);
        this.f83614c.j(this.f83627p);
    }

    @Override // hd.c
    public String getName() {
        return this.f83612a;
    }
}
