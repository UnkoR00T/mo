package o;

import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import v.d3;
import v.t2;
import v.u2;
import v.x3;
import v.z2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements b0.r<d0> {
    static final v.p1.a<v.l0.b> S = v.p1.a.a("camerax.core.appConfig.cameraFactoryProvider", v.l0.b.class);
    static final v.p1.a<v.k0.a> T = v.p1.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", v.k0.a.class);
    static final v.p1.a<x3.c> U = v.p1.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", x3.c.class);
    static final v.p1.a<Executor> V = v.p1.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    static final v.p1.a<Handler> W = v.p1.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    static final v.p1.a<Integer> X = v.p1.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    static final v.p1.a<s> Y = v.p1.a.a("camerax.core.appConfig.availableCamerasLimiter", s.class);
    static final v.p1.a<Long> Z = v.p1.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    static final v.p1.a<o1> f139947a0 = v.p1.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", o1.class);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final v.p1.a<d3> f139948b0 = v.p1.a.a("camerax.core.appConfig.quirksSettings", d3.class);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final v.p1.a<Boolean> f139949c0 = v.p1.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    private final z2 R;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u2 f139950a;

        public a() {
            this(u2.l0());
        }

        public e0 a() {
            return new e0(z2.k0(this.f139950a));
        }

        public t2 b() {
            return this.f139950a;
        }

        public a c(v.l0.b bVar) {
            b().m(e0.S, bVar);
            return this;
        }

        public a d(v.k0.a aVar) {
            b().m(e0.T, aVar);
            return this;
        }

        public a e(boolean z15) {
            b().m(e0.f139949c0, Boolean.valueOf(z15));
            return this;
        }

        public a f(Class<d0> cls) {
            b().m(b0.r.f15616c, cls);
            if (b().f(b0.r.f15615b, null) == null) {
                g(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a g(String str) {
            b().m(b0.r.f15615b, str);
            return this;
        }

        public a h(x3.c cVar) {
            b().m(e0.U, cVar);
            return this;
        }

        private a(u2 u2Var) {
            this.f139950a = u2Var;
            Class cls = (Class) u2Var.f(b0.r.f15616c, null);
            if (cls == null || cls.equals(d0.class)) {
                f(d0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        e0 getCameraXConfig();
    }

    e0(z2 z2Var) {
        this.R = z2Var;
    }

    @Override // v.h3
    /* JADX INFO: renamed from: a */
    public v.p1 getConfig() {
        return this.R;
    }

    public s i0(s sVar) {
        return (s) this.R.f(Y, sVar);
    }

    public Executor j0(Executor executor) {
        return (Executor) this.R.f(V, executor);
    }

    public v.l0.b k0(v.l0.b bVar) {
        return (v.l0.b) this.R.f(S, bVar);
    }

    public long l0() {
        return ((Long) this.R.f(Z, -1L)).longValue();
    }

    public o1 m0() {
        o1 o1Var = (o1) this.R.f(f139947a0, o1.f140088b);
        Objects.requireNonNull(o1Var);
        return o1Var;
    }

    public v.k0.a n0(v.k0.a aVar) {
        return (v.k0.a) this.R.f(T, aVar);
    }

    public d3 o0() {
        return (d3) this.R.f(f139948b0, null);
    }

    public Handler p0(Handler handler) {
        return (Handler) this.R.f(W, handler);
    }

    public x3.c q0(x3.c cVar) {
        return (x3.c) this.R.f(U, cVar);
    }

    public boolean r0() {
        return ((Boolean) this.R.f(f139949c0, Boolean.TRUE)).booleanValue();
    }
}
