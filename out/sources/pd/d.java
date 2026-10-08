package pd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import fd.a0;
import fd.d0;
import fd.g0;
import id.t;
import td.k;
import td.m;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {
    private final Paint E;
    private final Rect F;
    private final Rect G;
    private final RectF H;
    private final d0 I;
    private id.a<ColorFilter, ColorFilter> J;
    private id.a<Bitmap, Bitmap> K;
    private id.c L;
    private k M;
    private k.b N;

    d(a0 a0Var, e eVar) {
        super(a0Var, eVar);
        this.E = new gd.a(3);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.I = a0Var.E(eVar.n());
        if (z() != null) {
            this.L = new id.c(this, this, z());
        }
    }

    private Bitmap P() {
        Bitmap bitmapH;
        id.a<Bitmap, Bitmap> aVar = this.K;
        if (aVar != null && (bitmapH = aVar.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapY = this.f156923p.y(this.f156924q.n());
        if (bitmapY != null) {
            return bitmapY;
        }
        d0 d0Var = this.I;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    @Override // pd.b, hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        Bitmap bitmapP;
        super.f(rectF, matrix, z15);
        if (this.I != null) {
            float fE = m.e();
            if (this.f156923p.F() || (bitmapP = P()) == null) {
                rectF.set(0.0f, 0.0f, this.I.f() * fE, this.I.d() * fE);
            } else {
                rectF.set(0.0f, 0.0f, bitmapP.getWidth() * fE, bitmapP.getHeight() * fE);
            }
            this.f156922o.mapRect(rectF);
        }
    }

    @Override // pd.b, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        id.c cVar2;
        id.c cVar3;
        id.c cVar4;
        id.c cVar5;
        id.c cVar6;
        super.g(t15, cVar);
        if (t15 == g0.N) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new t(cVar);
                return;
            }
        }
        if (t15 == g0.Q) {
            if (cVar == null) {
                this.K = null;
                return;
            } else {
                this.K = new t(cVar);
                return;
            }
        }
        if (t15 == g0.f61248e && (cVar6 = this.L) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t15 == g0.J && (cVar5 = this.L) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t15 == g0.K && (cVar4 = this.L) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t15 == g0.L && (cVar3 = this.L) != null) {
            cVar3.e(cVar);
        } else {
            if (t15 != g0.M || (cVar2 = this.L) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // pd.b
    public void u(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        Bitmap bitmapP = P();
        if (bitmapP == null || bitmapP.isRecycled() || this.I == null) {
            return;
        }
        float fE = m.e();
        this.E.setAlpha(i15);
        id.a<ColorFilter, ColorFilter> aVar = this.J;
        if (aVar != null) {
            this.E.setColorFilter(aVar.h());
        }
        id.c cVar = this.L;
        if (cVar != null) {
            bVar = cVar.b(matrix, i15);
        }
        this.F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
        if (this.f156923p.F()) {
            this.G.set(0, 0, (int) (this.I.f() * fE), (int) (this.I.d() * fE));
        } else {
            this.G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
        }
        boolean z15 = bVar != null;
        if (z15) {
            if (this.M == null) {
                this.M = new k();
            }
            if (this.N == null) {
                this.N = new k.b();
            }
            this.N.f();
            bVar.d(i15, this.N);
            RectF rectF = this.H;
            Rect rect = this.G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.H);
            canvas = this.M.j(canvas, this.H, this.N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapP, this.F, this.G, this.E);
        if (z15) {
            this.M.e();
            if (this.M.f()) {
                return;
            }
        }
        canvas.restore();
    }
}
