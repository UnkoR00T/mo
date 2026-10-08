package u;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.d2;
import v.e2;
import v.j3;
import v.o1;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f193361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final e0.b f193362g = new e0.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f193363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v.n1 f193364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f193365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0 f193366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y.c f193367e;

    public e0(d2 d2Var, Size size, CameraCharacteristics cameraCharacteristics, o.k kVar, boolean z15, l0 l0Var) {
        y.w.b();
        this.f193363a = d2Var;
        this.f193364b = v.n1.a.i(d2Var).h();
        y yVar = new y();
        this.f193365c = yVar;
        Executor executorN0 = d2Var.n0(z.a.c());
        Objects.requireNonNull(executorN0);
        w0 w0Var = new w0(executorN0, cameraCharacteristics, kVar != null ? new g0.y(kVar) : null);
        this.f193366d = w0Var;
        ArrayList arrayList = new ArrayList();
        if (d2Var.Y() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        y.c cVarN = y.c.n(size, d2Var.r(), arrayList, z15, d2Var.m0(), l0Var);
        this.f193367e = cVarN;
        w0Var.s(yVar.s(cVarN));
    }

    private n b(int i15, v.m1 m1Var, n1 n1Var, c1 c1Var) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(m1Var.hashCode());
        List<o1> listA = m1Var.a();
        Objects.requireNonNull(listA);
        for (o1 o1Var : listA) {
            v.n1.a aVar = new v.n1.a();
            aVar.r(this.f193364b.j());
            aVar.e(this.f193364b.f());
            aVar.a(n1Var.q());
            aVar.f(this.f193367e.l());
            if (this.f193367e.e().size() > 1 && this.f193367e.j() != null) {
                aVar.f(this.f193367e.j());
            }
            boolean zL = l();
            if (zL) {
                u1 u1VarG = this.f193367e.g();
                Objects.requireNonNull(u1VarG);
                aVar.f(u1VarG);
            }
            aVar.p(zL);
            if (f0.b.j(this.f193367e.d()) || f0.b.k(this.f193367e.d())) {
                if (f193362g.a()) {
                    aVar.d(v.n1.f202707i, Integer.valueOf(n1Var.n()));
                }
                aVar.d(v.n1.f202708j, Integer.valueOf(g(n1Var)));
            }
            aVar.e(o1Var.a().f());
            aVar.g(strValueOf, Integer.valueOf(o1Var.getId()));
            aVar.n(i15);
            aVar.c(this.f193367e.a());
            if (this.f193367e.e().size() > 1 && this.f193367e.i() != null) {
                aVar.c(this.f193367e.i());
            }
            arrayList.add(aVar.h());
        }
        return new n(arrayList, c1Var);
    }

    private v.m1 c() {
        v.m1 m1VarI0 = this.f193363a.i0(o.g0.b());
        Objects.requireNonNull(m1VarI0);
        return m1VarI0;
    }

    private x0 d(int i15, v.m1 m1Var, n1 n1Var, c1 c1Var, com.google.common.util.concurrent.q<Void> qVar) {
        return new x0(m1Var, n1Var, c1Var, qVar, i15);
    }

    private int i() {
        Integer num = (Integer) this.f193363a.f(d2.V, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f193363a.f(e2.f202557n, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    private boolean l() {
        return this.f193367e.g() != null;
    }

    public void a() {
        y.w.b();
        this.f193365c.n();
        this.f193366d.o();
    }

    public i6.d<n, x0> e(n1 n1Var, c1 c1Var, com.google.common.util.concurrent.q<Void> qVar) {
        y.w.b();
        v.m1 m1VarC = c();
        int i15 = f193361f;
        f193361f = i15 + 1;
        return new i6.d<>(b(i15, m1VarC, n1Var, c1Var), d(i15, m1VarC, n1Var, c1Var, qVar));
    }

    public j3.b f(Size size) {
        j3.b bVarP = j3.b.p(this.f193363a, size);
        bVarP.h(this.f193367e.l());
        if (this.f193367e.e().size() > 1 && this.f193367e.j() != null) {
            bVarP.h(this.f193367e.j());
        }
        if (this.f193367e.g() != null) {
            bVarP.v(this.f193367e.g());
        }
        return bVarP;
    }

    int g(n1 n1Var) {
        boolean z15 = n1Var.l() != null;
        boolean zH = y.x.h(n1Var.i(), this.f193367e.k());
        if (z15 && zH) {
            return n1Var.h() == 0 ? 100 : 95;
        }
        return n1Var.k();
    }

    public int h() {
        y.w.b();
        return this.f193365c.i();
    }

    void j(d1.a aVar) {
        y.w.b();
        this.f193367e.b().accept(aVar);
    }

    public void k(androidx.camera.core.e.a aVar) {
        y.w.b();
        this.f193365c.r(aVar);
    }

    void m(x0 x0Var) {
        y.w.b();
        this.f193367e.h().accept(x0Var);
    }
}
