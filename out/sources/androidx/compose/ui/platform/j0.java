package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001\u001cB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Lju/l0;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "Q2", "()Ljava/lang/Runnable;", "Loq/i0;", "d3", "()V", "", "frameTimeNanos", "R2", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "e3", "(Landroid/view/Choreographer$FrameCallback;)V", "i3", "Ltq/i;", "context", "block", "F1", "(Ltq/i;Ljava/lang/Runnable;)V", "c", "Landroid/view/Choreographer;", "N2", "()Landroid/view/Choreographer;", "d", "Landroid/os/Handler;", "", "e", "Ljava/lang/Object;", "lock", "Lpq/m;", "f", "Lpq/m;", "toRunTrampolined", "", "g", "Ljava/util/List;", "toRunOnFrame", "h", "spareToRunOnFrame", "", "j", "Z", "scheduledTrampolineDispatch", "k", "scheduledFrameDispatch", "androidx/compose/ui/platform/j0$d", "l", "Landroidx/compose/ui/platform/j0$d;", "dispatchCallback", "Lm2/l2;", "m", "Lm2/l2;", "P2", "()Lm2/l2;", "frameClock", "n", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends ju.l0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f10625p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final oq.k<tq.i> f10626q = oq.l.a(a.f10638b);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadLocal<tq.i> f10627r = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pq.m<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d dispatchCallback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p076m2.l2 frameClock;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltq/i;", "c", "()Ltq/i;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<tq.i> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10638b = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Landroid/view/Choreographer;"}, k = 3, mv = {2, 1, 0})
        static final class C0227a extends vq.k implements er.p<ju.p0, tq.e<? super Choreographer>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f10639e;

            C0227a(tq.e<? super C0227a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f10639e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return Choreographer.getInstance();
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super Choreographer> eVar) {
                return ((C0227a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C0227a(eVar);
            }
        }

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final tq.i a() {
            j0 j0Var = new j0(k0.b() ? Choreographer.getInstance() : (Choreographer) ju.i.e(ju.g1.c(), new C0227a(null)), e6.g.a(Looper.getMainLooper()), null);
            return j0Var.n0(j0Var.getFrameClock());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/j0$b", "Ljava/lang/ThreadLocal;", "Ltq/i;", "a", "()Ltq/i;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends ThreadLocal<tq.i> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public tq.i initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            j0 j0Var = new j0(choreographer, e6.g.a(looperMyLooper), null);
            return j0Var.n0(j0Var.getFrameClock());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/j0$c;", "", "<init>", "()V", "Ltq/i;", "Main$delegate", "Loq/k;", "b", "()Ltq/i;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final tq.i a() {
            if (k0.b()) {
                return b();
            }
            tq.i iVar = (tq.i) j0.f10627r.get();
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final tq.i b() {
            return (tq.i) j0.f10626q.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/j0$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Loq/i0;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            j0.this.handler.removeCallbacks(this);
            j0.this.d3();
            j0.this.R2(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.d3();
            Object obj = j0.this.lock;
            j0 j0Var = j0.this;
            synchronized (obj) {
                try {
                    if (j0Var.toRunOnFrame.isEmpty()) {
                        j0Var.getChoreographer().removeFrameCallback(this);
                        j0Var.scheduledFrameDispatch = false;
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ j0(Choreographer choreographer, Handler handler, fr.k kVar) {
        this(choreographer, handler);
    }

    private final Runnable Q2() {
        Runnable runnableA;
        synchronized (this.lock) {
            runnableA = this.toRunTrampolined.A();
        }
        return runnableA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    list.get(i15).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3() {
        boolean z15;
        do {
            Runnable runnableQ2 = Q2();
            while (runnableQ2 != null) {
                runnableQ2.run();
                runnableQ2 = Q2();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z15 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z15 = true;
                }
            }
        } while (z15);
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: N2, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* JADX INFO: renamed from: P2, reason: from getter */
    public final p076m2.l2 getFrameClock() {
        return this.frameClock;
    }

    public final void e3(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void i3(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    private j0(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new pq.m<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new d();
        this.frameClock = new l0(choreographer, this);
    }
}
