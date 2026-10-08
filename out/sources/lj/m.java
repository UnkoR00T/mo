package lj;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f118552a = new n[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f118553b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f118554c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f118555d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f118556e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f118557f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f118558g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f118559h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f118560i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f118561j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f118562k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f118563l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f118564a = new m();
    }

    public interface b {
        void a(n nVar, Matrix matrix, int i15);

        void b(n nVar, Matrix matrix, int i15);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f118565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f118566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f118567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f118568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f118569e;

        c(l lVar, float f15, RectF rectF, b bVar, Path path) {
            this.f118568d = bVar;
            this.f118565a = lVar;
            this.f118569e = f15;
            this.f118567c = rectF;
            this.f118566b = path;
        }
    }

    public m() {
        for (int i15 = 0; i15 < 4; i15++) {
            this.f118552a[i15] = new n();
            this.f118553b[i15] = new Matrix();
            this.f118554c[i15] = new Matrix();
        }
    }

    private float a(int i15) {
        return ((i15 + 1) % 4) * 90;
    }

    private void b(c cVar, int i15) {
        this.f118559h[0] = this.f118552a[i15].k();
        this.f118559h[1] = this.f118552a[i15].l();
        this.f118553b[i15].mapPoints(this.f118559h);
        if (i15 == 0) {
            Path path = cVar.f118566b;
            float[] fArr = this.f118559h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f118566b;
            float[] fArr2 = this.f118559h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f118552a[i15].d(this.f118553b[i15], cVar.f118566b);
        b bVar = cVar.f118568d;
        if (bVar != null) {
            bVar.b(this.f118552a[i15], this.f118553b[i15], i15);
        }
    }

    private void c(c cVar, int i15) {
        int i16 = (i15 + 1) % 4;
        this.f118559h[0] = this.f118552a[i15].i();
        this.f118559h[1] = this.f118552a[i15].j();
        this.f118553b[i15].mapPoints(this.f118559h);
        this.f118560i[0] = this.f118552a[i16].k();
        this.f118560i[1] = this.f118552a[i16].l();
        this.f118553b[i16].mapPoints(this.f118560i);
        float[] fArr = this.f118559h;
        float f15 = fArr[0];
        float[] fArr2 = this.f118560i;
        float fMax = Math.max(((float) Math.hypot(f15 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fJ = j(cVar.f118567c, i15);
        this.f118558g.n(0.0f, 0.0f);
        g gVarK = k(i15, cVar.f118565a);
        gVarK.c(fMax, fJ, cVar.f118569e, this.f118558g);
        this.f118561j.reset();
        this.f118558g.d(this.f118554c[i15], this.f118561j);
        if (this.f118563l && (gVarK.b() || m(this.f118561j, i15) || m(this.f118561j, i16))) {
            Path path = this.f118561j;
            path.op(path, this.f118557f, Path.Op.DIFFERENCE);
            this.f118559h[0] = this.f118558g.k();
            this.f118559h[1] = this.f118558g.l();
            this.f118554c[i15].mapPoints(this.f118559h);
            Path path2 = this.f118556e;
            float[] fArr3 = this.f118559h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f118558g.d(this.f118554c[i15], this.f118556e);
        } else {
            this.f118558g.d(this.f118554c[i15], cVar.f118566b);
        }
        b bVar = cVar.f118568d;
        if (bVar != null) {
            bVar.a(this.f118558g, this.f118554c[i15], i15);
        }
    }

    private void g(int i15, RectF rectF, PointF pointF) {
        if (i15 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i15 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i15 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e i(int i15, l lVar) {
        if (i15 == 1) {
            return lVar.k();
        }
        if (i15 != 2) {
            return i15 != 3 ? lVar.s() : lVar.q();
        }
        return lVar.i();
    }

    private float j(RectF rectF, int i15) {
        float[] fArr = this.f118559h;
        n nVar = this.f118552a[i15];
        fArr[0] = nVar.f118572c;
        fArr[1] = nVar.f118573d;
        this.f118553b[i15].mapPoints(fArr);
        return (i15 == 1 || i15 == 3) ? Math.abs(rectF.centerX() - this.f118559h[0]) : Math.abs(rectF.centerY() - this.f118559h[1]);
    }

    private g k(int i15, l lVar) {
        if (i15 == 1) {
            return lVar.h();
        }
        if (i15 != 2) {
            return i15 != 3 ? lVar.o() : lVar.p();
        }
        return lVar.n();
    }

    public static m l() {
        return a.f118564a;
    }

    private boolean m(Path path, int i15) {
        this.f118562k.reset();
        this.f118552a[i15].d(this.f118553b[i15], this.f118562k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f118562k.computeBounds(rectF, true);
        path.op(this.f118562k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void n(c cVar, int i15, float[] fArr) {
        i(i15, cVar.f118565a).b(this.f118552a[i15], 90.0f, cVar.f118569e, cVar.f118567c, fArr == null ? h(i15, cVar.f118565a) : new lj.c(fArr[i15]));
        float fA = a(i15);
        this.f118553b[i15].reset();
        g(i15, cVar.f118567c, this.f118555d);
        Matrix matrix = this.f118553b[i15];
        PointF pointF = this.f118555d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f118553b[i15].preRotate(fA);
    }

    private void o(int i15) {
        this.f118559h[0] = this.f118552a[i15].i();
        this.f118559h[1] = this.f118552a[i15].j();
        this.f118553b[i15].mapPoints(this.f118559h);
        float fA = a(i15);
        this.f118554c[i15].reset();
        Matrix matrix = this.f118554c[i15];
        float[] fArr = this.f118559h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f118554c[i15].preRotate(fA);
    }

    public void d(l lVar, float f15, RectF rectF, Path path) {
        e(lVar, f15, rectF, null, path);
    }

    public void e(l lVar, float f15, RectF rectF, b bVar, Path path) {
        f(lVar, null, f15, rectF, bVar, path);
    }

    public void f(l lVar, float[] fArr, float f15, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f118556e.rewind();
        this.f118557f.rewind();
        this.f118557f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f15, rectF, bVar, path);
        for (int i15 = 0; i15 < 4; i15++) {
            n(cVar, i15, fArr);
            o(i15);
        }
        for (int i16 = 0; i16 < 4; i16++) {
            b(cVar, i16);
            c(cVar, i16);
        }
        path.close();
        this.f118556e.close();
        if (this.f118556e.isEmpty()) {
            return;
        }
        path.op(this.f118556e, Path.Op.UNION);
    }

    d h(int i15, l lVar) {
        if (i15 == 1) {
            return lVar.l();
        }
        if (i15 != 2) {
            return i15 != 3 ? lVar.t() : lVar.r();
        }
        return lVar.j();
    }
}
