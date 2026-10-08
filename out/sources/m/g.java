package m;

import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.d2;
import ju.g2;
import ju.g3;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u000b\b\u0001\u0018\u0000 (2\u00020\u0001:\u0002\t\u0018B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006)"}, d2 = {"Lm/g;", "", "Lju/d2;", "cameraPipeJob", "<init>", "(Lju/d2;)V", "Ljava/lang/Runnable;", "shutdownAction", "", "b", "(Ljava/lang/Runnable;)Z", "c", "e", "Loq/i0;", "g", "()V", "h", "()Loq/i0;", "i", "Lm/g$b;", "shutdownType", "d", "(Lm/g$b;Ljava/lang/Runnable;)V", "f", "a", "Lju/d2;", "Ljava/lang/Object;", "cameraLock", "Z", "isCameraShutdown", "", "Ljava/util/List;", "cameraShutdownActions", "scopeLock", "isScopeShutdown", "scopeShutdownActions", "threadLock", "isThreadShutdown", "j", "threadShutdownActions", "k", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d2 cameraPipeJob;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isCameraShutdown;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isScopeShutdown;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isThreadShutdown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object cameraLock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Runnable> cameraShutdownActions = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object scopeLock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Runnable> scopeShutdownActions = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object threadLock = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<Runnable> threadShutdownActions = new ArrayList();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lm/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        CAMERA,
        SCOPE,
        THREAD;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f121821e = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121822a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.SCOPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.THREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f121822a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121823e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f121825e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f121826f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f121826f = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f121825e;
                if (i15 == 0) {
                    u.b(obj);
                    k.k.f107055a.a();
                    d2 d2Var = this.f121826f.cameraPipeJob;
                    this.f121825e = 1;
                    if (g2.g(d2Var, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f121826f, eVar);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f121823e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            a aVar = new a(g.this, null);
            this.f121823e = 1;
            Object objE2 = g3.e(3000L, aVar, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return g.this.new d(eVar);
        }
    }

    public g(d2 d2Var) {
        this.cameraPipeJob = d2Var;
    }

    private final boolean b(Runnable shutdownAction) {
        boolean zAdd;
        synchronized (this.cameraLock) {
            zAdd = this.isCameraShutdown ? false : this.cameraShutdownActions.add(shutdownAction);
        }
        return zAdd;
    }

    private final boolean c(Runnable shutdownAction) {
        boolean zAdd;
        synchronized (this.scopeLock) {
            zAdd = this.isScopeShutdown ? false : this.scopeShutdownActions.add(shutdownAction);
        }
        return zAdd;
    }

    private final boolean e(Runnable shutdownAction) {
        boolean zAdd;
        synchronized (this.threadLock) {
            zAdd = this.isThreadShutdown ? false : this.threadShutdownActions.add(shutdownAction);
        }
        return zAdd;
    }

    private final void g() {
        synchronized (this.cameraLock) {
            try {
                k.k.f107055a.a();
                Iterator<Runnable> it = this.cameraShutdownActions.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final i0 h() {
        i0 i0Var;
        synchronized (this.scopeLock) {
            try {
                k.k.f107055a.a();
                Iterator<Runnable> it = this.scopeShutdownActions.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                i0Var = (i0) ju.j.b(null, new d(null), 1, null);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return i0Var;
    }

    private final void i() {
        synchronized (this.threadLock) {
            try {
                k.k.f107055a.a();
                Iterator<Runnable> it = this.threadShutdownActions.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void d(b shutdownType, Runnable shutdownAction) {
        boolean zB;
        int i15 = c.f121822a[shutdownType.ordinal()];
        if (i15 == 1) {
            zB = b(shutdownAction);
        } else if (i15 == 2) {
            zB = c(shutdownAction);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            zB = e(shutdownAction);
        }
        if (zB) {
            return;
        }
        if (k.k.f107055a.b()) {
            c2.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + shutdownType + " shutdown action immediately...");
        }
        shutdownAction.run();
    }

    public final void f() {
        g();
        h();
        i();
    }
}
