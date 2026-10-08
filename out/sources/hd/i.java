package hd;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import fd.g0;
import r0.a0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    private id.t A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f83632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f83633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a0<LinearGradient> f83634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a0<RadialGradient> f83635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f83636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final od.g f83637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f83638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final id.a<od.d, od.d> f83639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final id.a<PointF, PointF> f83640y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final id.a<PointF, PointF> f83641z;

    public i(fd.a0 a0Var, pd.b bVar, od.f fVar) {
        super(a0Var, bVar, fVar.b().e(), fVar.g().e(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f83634s = new a0<>();
        this.f83635t = new a0<>();
        this.f83636u = new RectF();
        this.f83632q = fVar.j();
        this.f83637v = fVar.f();
        this.f83633r = fVar.n();
        this.f83638w = (int) (a0Var.A().d() / 32.0f);
        id.a<od.d, od.d> aVarL = fVar.e().l();
        this.f83639x = aVarL;
        aVarL.a(this);
        bVar.j(aVarL);
        id.a<PointF, PointF> aVarL2 = fVar.l().l();
        this.f83640y = aVarL2;
        aVarL2.a(this);
        bVar.j(aVarL2);
        id.a<PointF, PointF> aVarL3 = fVar.d().l();
        this.f83641z = aVarL3;
        aVarL3.a(this);
        bVar.j(aVarL3);
    }

    private int[] k(int[] iArr) {
        id.t tVar = this.A;
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

    private int l() {
        int iRound = Math.round(this.f83640y.f() * this.f83638w);
        int iRound2 = Math.round(this.f83641z.f() * this.f83638w);
        int iRound3 = Math.round(this.f83639x.f() * this.f83638w);
        int i15 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i15 = i15 * 31 * iRound2;
        }
        return iRound3 != 0 ? i15 * 31 * iRound3 : i15;
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientG = this.f83634s.g(jL);
        if (linearGradientG != null) {
            return linearGradientG;
        }
        PointF pointFH = this.f83640y.h();
        PointF pointFH2 = this.f83641z.h();
        od.d dVarH = this.f83639x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f83634s.m(jL, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientG = this.f83635t.g(jL);
        if (radialGradientG != null) {
            return radialGradientG;
        }
        PointF pointFH = this.f83640y.h();
        PointF pointFH2 = this.f83641z.h();
        od.d dVarH = this.f83639x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        float f15 = pointFH.x;
        float f16 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f15, f16, (float) Math.hypot(pointFH2.x - f15, pointFH2.y - f16), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f83635t.m(jL, radialGradient);
        return radialGradient;
    }

    @Override // hd.a, hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        if (this.f83633r) {
            return;
        }
        f(this.f83636u, matrix, false);
        this.f83569i.setShader(this.f83637v == od.g.LINEAR ? m() : n());
        super.d(canvas, matrix, i15, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hd.a, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        super.g(t15, cVar);
        if (t15 == g0.O) {
            id.t tVar = this.A;
            if (tVar != null) {
                this.f83566f.H(tVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            id.t tVar2 = new id.t(cVar);
            this.A = tVar2;
            tVar2.a(this);
            this.f83566f.j(this.A);
        }
    }

    @Override // hd.c
    public String getName() {
        return this.f83632q;
    }
}
