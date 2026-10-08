package u;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f193420a = new e0.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Boolean> f193421b = new HashMap();

    interface a {
        void d(n1 n1Var);
    }

    public static /* synthetic */ void a(n1 n1Var, o.v0 v0Var) {
        n1Var.j();
        if (!(n1Var.l() != null)) {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
        o.t0.g gVarL = n1Var.l();
        Objects.requireNonNull(gVarL);
        gVarL.e(v0Var);
    }

    public static /* synthetic */ void b(n1 n1Var, o.t0.i iVar) {
        o.t0.g gVarL = n1Var.l();
        Objects.requireNonNull(gVarL);
        Objects.requireNonNull(iVar);
        gVarL.d(iVar);
    }

    public static /* synthetic */ void c(n1 n1Var, androidx.camera.core.o oVar) {
        o.t0.f fVarJ = n1Var.j();
        Objects.requireNonNull(fVarJ);
        Objects.requireNonNull(oVar);
        fVarJ.c(oVar);
    }

    public static /* synthetic */ void d(n1 n1Var, Bitmap bitmap) {
        if (n1Var.l() != null) {
            n1Var.l().b(bitmap);
        } else {
            n1Var.j();
        }
    }

    public static /* synthetic */ void e(n1 n1Var, int i15) {
        if (n1Var.l() != null) {
            n1Var.l().a(i15);
        } else {
            n1Var.j();
        }
    }

    public static n1 v(Executor executor, o.t0.f fVar, o.t0.g gVar, o.t0.h hVar, o.t0.h hVar2, Rect rect, Matrix matrix, int i15, int i16, int i17, boolean z15, List<v.s> list) {
        i6.i.b((gVar == null) == (hVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        i6.i.b(!(gVar == null), "One and only one on-disk or in-memory callback should be present.");
        j jVar = new j(executor, fVar, gVar, hVar, hVar2, rect, matrix, i15, i16, i17, z15, list);
        if (z15) {
            jVar.r();
        }
        return jVar;
    }

    void A(final o.t0.i iVar) {
        g().execute(new Runnable() { // from class: u.m1
            @Override // java.lang.Runnable
            public final void run() {
                n1.b(this.f193415a, iVar);
            }
        });
    }

    boolean f() {
        y.w.b();
        int i15 = this.f193420a;
        if (i15 <= 0) {
            return false;
        }
        this.f193420a = i15 - 1;
        return true;
    }

    abstract Executor g();

    abstract int h();

    public abstract Rect i();

    public abstract o.t0.f j();

    public abstract int k();

    public abstract o.t0.g l();

    public abstract o.t0.h m();

    public abstract int n();

    public abstract o.t0.h o();

    abstract Matrix p();

    abstract List<v.s> q();

    void r() {
        Map<Integer, Boolean> map = this.f193421b;
        Boolean bool = Boolean.FALSE;
        map.put(32, bool);
        this.f193421b.put(256, bool);
    }

    boolean s() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.f193421b.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    abstract boolean t();

    void u(int i15, boolean z15) {
        if (this.f193421b.containsKey(Integer.valueOf(i15))) {
            this.f193421b.put(Integer.valueOf(i15), Boolean.valueOf(z15));
        } else {
            o.e1.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    void w(final int i15) {
        g().execute(new Runnable() { // from class: u.k1
            @Override // java.lang.Runnable
            public final void run() {
                n1.e(this.f193410a, i15);
            }
        });
    }

    void x(final o.v0 v0Var) {
        g().execute(new Runnable() { // from class: u.i1
            @Override // java.lang.Runnable
            public final void run() {
                n1.a(this.f193390a, v0Var);
            }
        });
    }

    void y(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: u.j1
            @Override // java.lang.Runnable
            public final void run() {
                n1.d(this.f193406a, bitmap);
            }
        });
    }

    void z(final androidx.camera.core.o oVar) {
        g().execute(new Runnable() { // from class: u.l1
            @Override // java.lang.Runnable
            public final void run() {
                n1.c(this.f193413a, oVar);
            }
        });
    }
}
