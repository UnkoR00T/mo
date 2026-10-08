package e;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import p071kotlin.Metadata;
import v.j3;
import v.n3;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u000278B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, d2 = {"Le/l1;", "Lo/j2;", "Le/b0;", "cameraProperties", "Le/l1$b;", "config", "Le/z0;", "displayInfoManager", "<init>", "(Le/b0;Le/l1$b;Le/z0;)V", "Landroid/util/Size;", "resolution", "Lv/j3$b;", "m0", "(Landroid/util/Size;)Lv/j3$b;", "Lv/u1;", "k0", "(Landroid/util/Size;)Lv/u1;", "", "applyDefaultConfig", "Lv/x3;", "factory", "o0", "(ZLv/x3;)Le/l1$b;", "Lv/p1;", "Le/l1$a;", "p0", "(Lv/p1;)Le/l1$a;", "Lv/n3;", "primaryStreamSpec", "secondaryStreamSpec", "V", "(Lv/n3;Lv/n3;)Lv/n3;", "Loq/i0;", "W", "()V", "q0", "v", "Le/b0;", "w", "Le/z0;", "x", "Landroid/util/Size;", "meteringSurfaceSize", "", "y", "Ljava/lang/Object;", "deferrableSurfaceLock", "Lv/j3$c;", "z", "Lv/j3$c;", "closeableErrorListener", "A", "Lv/u1;", "deferrableSurface", "b", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 extends o.j2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private v.u1 deferrableSurface;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z0 displayInfoManager;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Size meteringSurfaceSize;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Object deferrableSurfaceLock;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private j3.c closeableErrorListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Le/l1$a;", "Lv/w3$b;", "Le/l1;", "Le/l1$b;", "Le/b0;", "cameraProperties", "Le/z0;", "displayInfoManager", "<init>", "(Le/b0;Le/z0;)V", "Lv/u2;", "c", "()Lv/u2;", "e", "()Le/l1$b;", "b", "()Le/l1;", "a", "Le/b0;", "Le/z0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements w3.b<l1, b, a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 cameraProperties;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z0 displayInfoManager;

        public a(b0 b0Var, z0 z0Var) {
            this.cameraProperties = b0Var;
            this.displayInfoManager = z0Var;
        }

        public l1 b() {
            return new l1(this.cameraProperties, d(), this.displayInfoManager);
        }

        @Override // o.j0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v.u2 a() {
            return v.u2.l0();
        }

        @Override // v.w3.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b d() {
            return new b();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Le/l1$b;", "Lv/w3;", "Le/l1;", "Lv/e2;", "<init>", "()V", "Lv/x3$b;", "W", "()Lv/x3$b;", "Lv/u2;", "i0", "()Lv/u2;", "", "r", "()I", "R", "Lv/u2;", "config", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w3<l1>, v.e2 {

        /* JADX INFO: renamed from: R, reason: from kotlin metadata */
        private final v.u2 config;

        public b() {
            v.u2 u2VarL0 = v.u2.l0();
            u2VarL0.m(w3.C, PRN.q.c.f750a);
            u2VarL0.m(b0.r.f15615b, "MeteringRepeating");
            u2VarL0.m(w3.L, x3.b.METERING_REPEATING);
            this.config = u2VarL0;
        }

        @Override // v.w3
        public x3.b W() {
            return x3.b.METERING_REPEATING;
        }

        @Override // v.h3
        /* JADX INFO: renamed from: i0, reason: from getter */
        public v.u2 getConfig() {
            return this.config;
        }

        @Override // v.e2
        public int r() {
            return 34;
        }
    }

    public l1(b0 b0Var, b bVar, z0 z0Var) {
        super(bVar);
        this.cameraProperties = b0Var;
        this.displayInfoManager = z0Var;
        this.meteringSurfaceSize = m1.c(b0Var, z0Var);
        this.deferrableSurfaceLock = new Object();
    }

    private final v.u1 k0(Size resolution) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(resolution.getWidth(), resolution.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v.u1 u1Var = this.deferrableSurface;
        if (u1Var != null) {
            u1Var.d();
        }
        v.h2 h2Var = new v.h2(surface, resolution, p());
        this.deferrableSurface = h2Var;
        h2Var.k().b(new Runnable() { // from class: e.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.l0(surface, surfaceTexture);
            }
        }, z.a.a());
        return h2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    private final j3.b m0(final Size resolution) {
        v.u1 u1VarK0;
        synchronized (this.deferrableSurfaceLock) {
            u1VarK0 = k0(resolution);
        }
        j3.c cVar = this.closeableErrorListener;
        if (cVar != null) {
            cVar.b();
        }
        j3.c cVar2 = new j3.c(new j3.d() { // from class: e.j1
            @Override // v.j3.d
            public final void a(j3 j3Var, j3.g gVar) {
                l1.n0(this.f46045a, resolution, j3Var, gVar);
            }
        });
        this.closeableErrorListener = cVar2;
        j3.b bVarP = j3.b.p(new b(), resolution);
        bVarP.y(1);
        bVarP.l(u1VarK0);
        bVarP.r(cVar2);
        return bVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(l1 l1Var, Size size, j3 j3Var, j3.g gVar) {
        l1Var.f0(pq.v.e(l1Var.m0(size).o()));
        l1Var.M();
    }

    @Override // o.j2
    protected n3 V(n3 primaryStreamSpec, n3 secondaryStreamSpec) {
        f0(pq.v.e(m0(this.meteringSurfaceSize).o()));
        return primaryStreamSpec.i().f(this.meteringSurfaceSize).a();
    }

    @Override // o.j2
    public void W() {
        j3.c cVar = this.closeableErrorListener;
        if (cVar != null) {
            cVar.b();
        }
        this.closeableErrorListener = null;
        synchronized (this.deferrableSurfaceLock) {
            try {
                v.u1 u1Var = this.deferrableSurface;
                if (u1Var != null) {
                    u1Var.d();
                }
                this.deferrableSurface = null;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b m(boolean applyDefaultConfig, x3 factory) {
        return new a(this.cameraProperties, this.displayInfoManager).d();
    }

    @Override // o.j2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a D(v.p1 config) {
        return new a(this.cameraProperties, this.displayInfoManager);
    }

    public final void q0() {
        g0(n3.a(m1.f46165a).a(), null);
    }
}
