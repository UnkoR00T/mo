package u;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import v.g2;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2 f193408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0 f193409b;

    k0(g2 g2Var) {
        this.f193408a = g2Var;
    }

    public static /* synthetic */ void b(k0 k0Var, g2.a aVar, g2 g2Var) {
        k0Var.getClass();
        aVar.a(k0Var);
    }

    private androidx.camera.core.o j(androidx.camera.core.o oVar) {
        if (oVar == null) {
            return null;
        }
        t3 t3VarB = this.f193409b == null ? t3.b() : t3.a(new Pair(this.f193409b.j(), this.f193409b.i().get(0)));
        this.f193409b = null;
        return new androidx.camera.core.s(oVar, new Size(oVar.l(), oVar.getHeight()), new b0.c(new k0.l(t3VarB, oVar.v3().getTimestamp())));
    }

    @Override // v.g2
    public int a() {
        return this.f193408a.a();
    }

    @Override // v.g2
    public androidx.camera.core.o c() {
        return j(this.f193408a.c());
    }

    @Override // v.g2
    public void close() {
        this.f193408a.close();
    }

    @Override // v.g2
    public int d() {
        return this.f193408a.d();
    }

    @Override // v.g2
    public void e() {
        this.f193408a.e();
    }

    @Override // v.g2
    public void f(final g2.a aVar, Executor executor) {
        this.f193408a.f(new g2.a() { // from class: u.j0
            @Override // v.g2.a
            public final void a(g2 g2Var) {
                k0.b(this.f193404a, aVar, g2Var);
            }
        }, executor);
    }

    @Override // v.g2
    public androidx.camera.core.o g() {
        return j(this.f193408a.g());
    }

    @Override // v.g2
    public int getHeight() {
        return this.f193408a.getHeight();
    }

    @Override // v.g2
    public Surface getSurface() {
        return this.f193408a.getSurface();
    }

    void h(x0 x0Var) {
        i6.i.j(this.f193409b == null, "Pending request should be null");
        this.f193409b = x0Var;
    }

    void i() {
        this.f193409b = null;
    }

    @Override // v.g2
    public int l() {
        return this.f193408a.l();
    }
}
