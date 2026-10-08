package androidx.camera.core;

import android.view.Surface;
import java.util.concurrent.Executor;
import v.g2;

/* JADX INFO: loaded from: classes.dex */
public class r implements g2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g2 f9322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Surface f9323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f9324f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9319a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9320b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9321c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e.a f9325g = new e.a() { // from class: o.s1
        @Override // androidx.camera.core.e.a
        public final void b(androidx.camera.core.o oVar) {
            androidx.camera.core.r.h(this.f140128a, oVar);
        }
    };

    public r(g2 g2Var) {
        this.f9322d = g2Var;
        this.f9323e = g2Var.getSurface();
    }

    public static /* synthetic */ void b(r rVar, g2.a aVar, g2 g2Var) {
        rVar.getClass();
        aVar.a(rVar);
    }

    public static /* synthetic */ void h(r rVar, o oVar) {
        e.a aVar;
        synchronized (rVar.f9319a) {
            try {
                int i15 = rVar.f9320b - 1;
                rVar.f9320b = i15;
                if (rVar.f9321c && i15 == 0) {
                    rVar.close();
                }
                aVar = rVar.f9324f;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (aVar != null) {
            aVar.b(oVar);
        }
    }

    private o m(o oVar) {
        if (oVar == null) {
            return null;
        }
        this.f9320b++;
        t tVar = new t(oVar);
        tVar.b(this.f9325g);
        return tVar;
    }

    @Override // v.g2
    public int a() {
        int iA;
        synchronized (this.f9319a) {
            iA = this.f9322d.a();
        }
        return iA;
    }

    @Override // v.g2
    public o c() {
        o oVarM;
        synchronized (this.f9319a) {
            oVarM = m(this.f9322d.c());
        }
        return oVarM;
    }

    @Override // v.g2
    public void close() {
        synchronized (this.f9319a) {
            try {
                Surface surface = this.f9323e;
                if (surface != null) {
                    surface.release();
                }
                this.f9322d.close();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.g2
    public int d() {
        int iD;
        synchronized (this.f9319a) {
            iD = this.f9322d.d();
        }
        return iD;
    }

    @Override // v.g2
    public void e() {
        synchronized (this.f9319a) {
            this.f9322d.e();
        }
    }

    @Override // v.g2
    public void f(final g2.a aVar, Executor executor) {
        synchronized (this.f9319a) {
            this.f9322d.f(new g2.a() { // from class: o.r1
                @Override // v.g2.a
                public final void a(v.g2 g2Var) {
                    androidx.camera.core.r.b(this.f140120a, aVar, g2Var);
                }
            }, executor);
        }
    }

    @Override // v.g2
    public o g() {
        o oVarM;
        synchronized (this.f9319a) {
            oVarM = m(this.f9322d.g());
        }
        return oVarM;
    }

    @Override // v.g2
    public int getHeight() {
        int height;
        synchronized (this.f9319a) {
            height = this.f9322d.getHeight();
        }
        return height;
    }

    @Override // v.g2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f9319a) {
            surface = this.f9322d.getSurface();
        }
        return surface;
    }

    public int i() {
        int iA;
        synchronized (this.f9319a) {
            iA = this.f9322d.a() - this.f9320b;
        }
        return iA;
    }

    public void j() {
        synchronized (this.f9319a) {
            try {
                this.f9321c = true;
                this.f9322d.e();
                if (this.f9320b == 0) {
                    close();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void k(e.a aVar) {
        synchronized (this.f9319a) {
            this.f9324f = aVar;
        }
    }

    @Override // v.g2
    public int l() {
        int iL;
        synchronized (this.f9319a) {
            iL = this.f9322d.l();
        }
        return iL;
    }
}
