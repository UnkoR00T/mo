package h0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import g0.r0;
import g0.z0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o.e1;
import o.v1;
import v.n0;
import y.w;
import y.x;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r0 f79177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n0 f79178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final n0 f79179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f79180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f79181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f79182f;

    class a implements a0.c<v1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0.n0 f79183a;

        a(g0.n0 n0Var) {
            this.f79183a = n0Var;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            if (this.f79183a.t() == 2 && (th4 instanceof CancellationException)) {
                e1.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            e1.p("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + z0.a(this.f79183a.t()), th4);
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(v1 v1Var) {
            i6.i.g(v1Var);
            r.this.f79177a.c(v1Var);
        }
    }

    public static abstract class b {
        public static b d(g0.n0 n0Var, g0.n0 n0Var2, List<d> list) {
            return new h0.b(n0Var, n0Var2, list);
        }

        public abstract List<d> a();

        public abstract g0.n0 b();

        public abstract g0.n0 c();
    }

    public static class c extends HashMap<d, g0.n0> {
    }

    @SuppressLint({"LambdaLast"})
    public r(n0 n0Var, n0 n0Var2, r0 r0Var, String str) {
        this.f79178b = n0Var;
        this.f79179c = n0Var2;
        this.f79177a = r0Var;
        this.f79182f = str;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f79180d;
        if (cVar != null) {
            Iterator<g0.n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(n0 n0Var, n0 n0Var2, g0.n0 n0Var3, g0.n0 n0Var4, Map.Entry<d, g0.n0> entry) {
        g0.n0 value = entry.getValue();
        e1.a("DualSurfaceProcessorNode", "     -> outputEdge = " + value);
        Size sizeF = n0Var3.s().f();
        Rect rectA = entry.getKey().a().a();
        if (!n0Var3.u()) {
            n0Var = null;
        }
        v1.a aVarF = v1.a.f(sizeF, rectA, n0Var, entry.getKey().a().c(), entry.getKey().a().g());
        Size sizeF2 = n0Var4.s().f();
        Rect rectA2 = entry.getKey().b().a();
        if (!n0Var4.u()) {
            n0Var2 = null;
        }
        a0.f.b(value.j(entry.getKey().a().b(), aVarF, v1.a.f(sizeF2, rectA2, n0Var2, entry.getKey().b().c(), entry.getKey().b().g())), new a(value), z.a.d());
    }

    private void e(n0 n0Var, n0 n0Var2, g0.n0 n0Var3, g0.n0 n0Var4, Map<d, g0.n0> map) {
        for (final Map.Entry<d, g0.n0> entry : map.entrySet()) {
            final n0 n0Var5 = n0Var;
            final n0 n0Var6 = n0Var2;
            final g0.n0 n0Var7 = n0Var3;
            final g0.n0 n0Var8 = n0Var4;
            c(n0Var5, n0Var6, n0Var7, n0Var8, entry);
            entry.getValue().e(new Runnable() { // from class: h0.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79171a.c(n0Var5, n0Var6, n0Var7, n0Var8, entry);
                }
            });
            n0Var = n0Var5;
            n0Var2 = n0Var6;
            n0Var3 = n0Var7;
            n0Var4 = n0Var8;
        }
    }

    private void f(n0 n0Var, g0.n0 n0Var2, boolean z15) {
        this.f79177a.a(n0Var2.l(n0Var, z15));
    }

    private g0.n0 h(g0.n0 n0Var, i0.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(n0Var.r());
        matrix.postConcat(x.e(new RectF(rectA), x.s(fVar.d()), iC, zG));
        i6.i.a(x.j(x.f(rectA, iC), fVar.d()));
        Rect rectQ = x.q(fVar.d());
        return new g0.n0(fVar.e(), fVar.b(), n0Var.s().i().f(fVar.d()).a(), matrix, false, rectQ, n0Var.q() - iC, -1, n0Var.w() != zG);
    }

    public void d() {
        this.f79177a.b();
        w.e(new Runnable() { // from class: h0.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f79170a);
            }
        });
    }

    public c g(b bVar) {
        w.b();
        e1.a("DualSurfaceProcessorNode", (this.f79182f == null ? "" : "[" + this.f79182f + "] ") + "DualSurfaceProcessorNode Transform Processor = " + this.f79177a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator<d> it = bVar.a().iterator();
        while (it.hasNext()) {
            e1.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.f79181e = bVar;
        this.f79180d = new c();
        g0.n0 n0VarB = this.f79181e.b();
        g0.n0 n0VarC = this.f79181e.c();
        for (d dVar : this.f79181e.a()) {
            this.f79180d.put(dVar, h(n0VarB, dVar.a()));
        }
        f(this.f79178b, n0VarB, true);
        f(this.f79179c, n0VarC, false);
        e(this.f79178b, this.f79179c, n0VarB, n0VarC, this.f79180d);
        return this.f79180d;
    }
}
