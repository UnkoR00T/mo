package g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o.e1;
import o.h2;
import o.v1;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r0 f69136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final v.n0 f69137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f69138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f69139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69140e;

    class a implements a0.c<v1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f69141a;

        a(n0 n0Var) {
            this.f69141a = n0Var;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            if (this.f69141a.t() == 2 && (th4 instanceof CancellationException)) {
                e1.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            e1.p("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.a(this.f69141a.t()), th4);
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(v1 v1Var) {
            i6.i.g(v1Var);
            v0.this.f69136a.c(v1Var);
        }
    }

    public static abstract class b {
        public static b c(n0 n0Var, List<i0.f> list) {
            return new g0.c(n0Var, list);
        }

        public abstract List<i0.f> a();

        public abstract n0 b();
    }

    public static class c extends HashMap<i0.f, n0> {
    }

    @SuppressLint({"LambdaLast"})
    public v0(v.n0 n0Var, r0 r0Var, String str) {
        this.f69137b = n0Var;
        this.f69136a = r0Var;
        this.f69140e = str;
    }

    public static /* synthetic */ void b(Map map, h2.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((i0.f) entry.getKey()).c();
            if (((i0.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((n0) entry.getValue()).z(y.x.v(iB), -1);
        }
    }

    public static /* synthetic */ void c(v0 v0Var) {
        c cVar = v0Var.f69138c;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(n0 n0Var, Map.Entry<i0.f, n0> entry) {
        n0 value = entry.getValue();
        e1.a("SurfaceProcessorNode", "     -> outputEdge = " + value);
        a0.f.b(value.j(entry.getKey().b(), v1.a.f(n0Var.s().f(), entry.getKey().a(), n0Var.u() ? this.f69137b : null, entry.getKey().c(), entry.getKey().g()), null), new a(value), z.a.d());
    }

    private void g(final n0 n0Var, Map<i0.f, n0> map) {
        for (final Map.Entry<i0.f, n0> entry : map.entrySet()) {
            d(n0Var, entry);
            entry.getValue().e(new Runnable() { // from class: g0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69116a.d(n0Var, entry);
                }
            });
        }
    }

    private void h(n0 n0Var) {
        this.f69136a.a(n0Var.k(this.f69137b));
    }

    private n0 k(n0 n0Var, i0.f fVar) {
        Rect rectQ;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        Matrix matrixE = y.x.e(new RectF(rectA), y.x.s(fVar.d()), iC, zG);
        matrix.postConcat(matrixE);
        i6.i.a(y.x.j(y.x.f(rectA, iC), fVar.d()));
        if (fVar.k()) {
            i6.i.b(fVar.a().contains(n0Var.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), n0Var.n()));
            rectQ = new Rect();
            RectF rectF = new RectF(n0Var.n());
            matrixE.mapRect(rectF);
            rectF.round(rectQ);
        } else {
            rectQ = y.x.q(fVar.d());
        }
        Rect rect = rectQ;
        return new n0(fVar.e(), fVar.b(), n0Var.s().i().f(fVar.d()).a(), matrix, false, rect, n0Var.q() - iC, -1, n0Var.w() != zG);
    }

    public r0 e() {
        return this.f69136a;
    }

    public void f() {
        this.f69136a.b();
        y.w.e(new Runnable() { // from class: g0.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.c(this.f69133a);
            }
        });
    }

    void i(n0 n0Var, final Map<i0.f, n0> map) {
        n0Var.f(new i6.a() { // from class: g0.t0
            @Override // i6.a
            public final void accept(Object obj) {
                v0.b(map, (h2.h) obj);
            }
        });
    }

    public c j(b bVar) {
        y.w.b();
        e1.a("SurfaceProcessorNode", (this.f69140e == null ? "" : "[" + this.f69140e + "] ") + "SurfaceProcessorNode Transform (Processor=" + this.f69136a + "\n   inputEdge = " + bVar.b());
        Iterator<i0.f> it = bVar.a().iterator();
        while (it.hasNext()) {
            e1.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f69139d = bVar;
        this.f69138c = new c();
        n0 n0VarB = bVar.b();
        for (i0.f fVar : bVar.a()) {
            this.f69138c.put(fVar, k(n0VarB, fVar));
        }
        h(n0VarB);
        g(n0VarB, this.f69138c);
        i(n0VarB, this.f69138c);
        return this.f69138c;
    }
}
