package pd;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import fd.a0;
import fd.g0;
import id.t;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b {
    private final RectF E;
    private final Paint F;
    private final float[] G;
    private final Path H;
    private final e I;
    private id.a<ColorFilter, ColorFilter> J;
    private id.a<Integer, Integer> K;

    h(a0 a0Var, e eVar) {
        super(a0Var, eVar);
        this.E = new RectF();
        gd.a aVar = new gd.a();
        this.F = aVar;
        this.G = new float[8];
        this.H = new Path();
        this.I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // pd.b, hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        super.f(rectF, matrix, z15);
        this.E.set(0.0f, 0.0f, this.I.r(), this.I.q());
        this.f156922o.mapRect(this.E);
        rectF.set(this.E);
    }

    @Override // pd.b, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
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
        if (t15 == g0.f61244a) {
            if (cVar != null) {
                this.K = new t(cVar);
            } else {
                this.K = null;
                this.F.setColor(this.I.p());
            }
        }
    }

    @Override // pd.b
    public void u(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        int iAlpha = Color.alpha(this.I.p());
        if (iAlpha == 0) {
            return;
        }
        id.a<Integer, Integer> aVar = this.K;
        Integer numH = aVar == null ? null : aVar.h();
        if (numH != null) {
            this.F.setColor(numH.intValue());
        } else {
            this.F.setColor(this.I.p());
        }
        int iIntValue = (int) ((i15 / 255.0f) * (((iAlpha / 255.0f) * (this.f156931x.k() == null ? 100 : this.f156931x.k().h().intValue())) / 100.0f) * 255.0f);
        this.F.setAlpha(iIntValue);
        if (bVar != null) {
            bVar.a(this.F);
        } else {
            this.F.clearShadowLayer();
        }
        id.a<ColorFilter, ColorFilter> aVar2 = this.J;
        if (aVar2 != null) {
            this.F.setColorFilter(aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.I.r();
            float[] fArr2 = this.G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.I.r();
            this.G[5] = this.I.q();
            float[] fArr3 = this.G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.I.q();
            matrix.mapPoints(this.G);
            this.H.reset();
            Path path = this.H;
            float[] fArr4 = this.G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.H;
            float[] fArr5 = this.G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.H;
            float[] fArr6 = this.G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.H;
            float[] fArr7 = this.G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.H;
            float[] fArr8 = this.G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.H.close();
            canvas.drawPath(this.H, this.F);
        }
    }
}
