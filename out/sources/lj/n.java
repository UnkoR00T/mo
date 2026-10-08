package lj;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f118570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f118571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f118572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f118573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f118574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f118575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<f> f118576g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<g> f118577h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f118578i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f118579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f118580d;

        a(List list, Matrix matrix) {
            this.f118579c = list;
            this.f118580d = matrix;
        }

        @Override // lj.n.g
        public void a(Matrix matrix, kj.a aVar, int i15, Canvas canvas) {
            Iterator it = this.f118579c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f118580d, aVar, i15, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f118582c;

        public b(d dVar) {
            this.f118582c = dVar;
        }

        @Override // lj.n.g
        public void a(Matrix matrix, kj.a aVar, int i15, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f118582c.k(), this.f118582c.o(), this.f118582c.l(), this.f118582c.j()), i15, this.f118582c.m(), this.f118582c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f118583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f118584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f118585e;

        public c(e eVar, float f15, float f16) {
            this.f118583c = eVar;
            this.f118584d = f15;
            this.f118585e = f16;
        }

        @Override // lj.n.g
        public void a(Matrix matrix, kj.a aVar, int i15, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f118583c.f118594c - this.f118585e, this.f118583c.f118593b - this.f118584d), 0.0f);
            this.f118597a.set(matrix);
            this.f118597a.preTranslate(this.f118584d, this.f118585e);
            this.f118597a.preRotate(c());
            aVar.b(canvas, this.f118597a, rectF, i15);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f118583c.f118594c - this.f118585e) / (this.f118583c.f118593b - this.f118584d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f118586h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f118587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f118588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f118589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f118590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f118591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f118592g;

        public d(float f15, float f16, float f17, float f18) {
            q(f15);
            u(f16);
            r(f17);
            p(f18);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f118590e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f118587b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f118589d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f118591f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f118592g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f118588c;
        }

        private void p(float f15) {
            this.f118590e = f15;
        }

        private void q(float f15) {
            this.f118587b = f15;
        }

        private void r(float f15) {
            this.f118589d = f15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f15) {
            this.f118591f = f15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f15) {
            this.f118592g = f15;
        }

        private void u(float f15) {
            this.f118588c = f15;
        }

        @Override // lj.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f118595a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f118586h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f118593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f118594c;

        @Override // lj.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f118595a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f118593b, this.f118594c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f118595a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f118596b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f118597a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, kj.a aVar, int i15, Canvas canvas);

        public final void b(kj.a aVar, int i15, Canvas canvas) {
            a(f118596b, aVar, i15, canvas);
        }
    }

    public n() {
        n(0.0f, 0.0f);
    }

    private void b(float f15) {
        if (g() == f15) {
            return;
        }
        float fG = ((f15 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f118577h.add(new b(dVar));
        p(f15);
    }

    private void c(g gVar, float f15, float f16) {
        b(f15);
        this.f118577h.add(gVar);
        p(f16);
    }

    private float g() {
        return this.f118574e;
    }

    private float h() {
        return this.f118575f;
    }

    private void p(float f15) {
        this.f118574e = f15;
    }

    private void q(float f15) {
        this.f118575f = f15;
    }

    private void r(float f15) {
        this.f118572c = f15;
    }

    private void s(float f15) {
        this.f118573d = f15;
    }

    private void t(float f15) {
        this.f118570a = f15;
    }

    private void u(float f15) {
        this.f118571b = f15;
    }

    public void a(float f15, float f16, float f17, float f18, float f19, float f25) {
        d dVar = new d(f15, f16, f17, f18);
        dVar.s(f19);
        dVar.t(f25);
        this.f118576g.add(dVar);
        b bVar = new b(dVar);
        float f26 = f19 + f25;
        boolean z15 = f25 < 0.0f;
        if (z15) {
            f19 = (f19 + 180.0f) % 360.0f;
        }
        c(bVar, f19, z15 ? (180.0f + f26) % 360.0f : f26);
        double d15 = f26;
        r(((f15 + f17) * 0.5f) + (((f17 - f15) / 2.0f) * ((float) Math.cos(Math.toRadians(d15)))));
        s(((f16 + f18) * 0.5f) + (((f18 - f16) / 2.0f) * ((float) Math.sin(Math.toRadians(d15)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f118576g.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f118576g.get(i15).a(matrix, path);
        }
    }

    boolean e() {
        return this.f118578i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f118577h), new Matrix(matrix));
    }

    float i() {
        return this.f118572c;
    }

    float j() {
        return this.f118573d;
    }

    float k() {
        return this.f118570a;
    }

    float l() {
        return this.f118571b;
    }

    public void m(float f15, float f16) {
        e eVar = new e();
        eVar.f118593b = f15;
        eVar.f118594c = f16;
        this.f118576g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f15);
        s(f16);
    }

    public void n(float f15, float f16) {
        o(f15, f16, 270.0f, 0.0f);
    }

    public void o(float f15, float f16, float f17, float f18) {
        t(f15);
        u(f16);
        r(f15);
        s(f16);
        p(f17);
        q((f17 + f18) % 360.0f);
        this.f118576g.clear();
        this.f118577h.clear();
        this.f118578i = false;
    }
}
