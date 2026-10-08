package o;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0003\u0015\u000f\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#0\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R$\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lo/p1;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "ignoreCanDetectForTest", "(Landroid/content/Context;Z)V", "", "newRotation", "Loq/i0;", "g", "(I)V", "orientation", "d", "(I)I", "Ljava/util/concurrent/Executor;", "executor", "Lo/p1$c;", "listener", "c", "(Ljava/util/concurrent/Executor;Lo/p1$c;)Z", "e", "(Lo/p1$c;)V", "f", "()V", "a", "Ljava/lang/Object;", "lock", "Landroid/view/OrientationEventListener;", "b", "Landroid/view/OrientationEventListener;", "orientationListener", "", "Lo/p1$d;", "Ljava/util/Map;", "listeners", "I", "rotation", "Z", "value", "isShutdown", "()Z", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f140103g = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OrientationEventListener orientationListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<c, d> listeners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile int rotation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean ignoreCanDetectForTest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"o/p1$a", "Landroid/view/OrientationEventListener;", "", "orientation", "Loq/i0;", "onOrientationChanged", "(I)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p1 f140110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, p1 p1Var) {
            super(context);
            this.f140110a = p1Var;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int orientation) {
            if (orientation == -1) {
                return;
            }
            this.f140110a.g(this.f140110a.d(orientation));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo/p1$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lo/p1$c;", "", "", "rotation", "Loq/i0;", "a", "(I)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void a(int rotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lo/p1$d;", "", "Lo/p1$c;", "listener", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Lo/p1$c;Ljava/util/concurrent/Executor;)V", "", "rotation", "Loq/i0;", "c", "(I)V", "b", "()V", "a", "Lo/p1$c;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c listener;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Executor executor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final AtomicBoolean enabled = new AtomicBoolean(true);

        public d(c cVar, Executor executor) {
            this.listener = cVar;
            this.executor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(d dVar, int i15) {
            if (dVar.enabled.get()) {
                dVar.listener.a(i15);
            }
        }

        public final void b() {
            this.enabled.set(false);
        }

        public final void c(final int rotation) {
            if (this.enabled.get()) {
                try {
                    this.executor.execute(new Runnable() { // from class: o.q1
                        @Override // java.lang.Runnable
                        public final void run() {
                            p1.d.d(this.f140118a, rotation);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    e1.o("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
                }
            }
        }
    }

    public p1(Context context) {
        this(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int orientation) {
        if (this.rotation == -1) {
            if (orientation >= 0 && orientation < 45) {
                return 0;
            }
            if (45 <= orientation && orientation < 135) {
                return 3;
            }
            if (135 > orientation || orientation >= 225) {
                return (225 > orientation || orientation >= 315) ? 0 : 1;
            }
            return 2;
        }
        if ((orientation >= 0 && orientation < 40) || (320 <= orientation && orientation < 360)) {
            return 0;
        }
        if (50 <= orientation && orientation < 130) {
            return 3;
        }
        if (140 <= orientation && orientation < 220) {
            return 2;
        }
        if (230 > orientation || orientation >= 310) {
            return this.rotation;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int newRotation) {
        List listF1;
        if (this.rotation != newRotation) {
            this.rotation = newRotation;
            synchronized (this.lock) {
                listF1 = pq.v.f1(this.listeners.values());
                oq.i0 i0Var = oq.i0.f148189a;
            }
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                ((d) it.next()).c(newRotation);
            }
        }
    }

    public final boolean c(Executor executor, c listener) {
        synchronized (this.lock) {
            if (!this.ignoreCanDetectForTest && !this.orientationListener.canDetectOrientation()) {
                return false;
            }
            d dVar = new d(listener, executor);
            this.listeners.put(listener, dVar);
            if (this.rotation != -1) {
                dVar.c(this.rotation);
            }
            if (this.listeners.size() == 1) {
                this.orientationListener.enable();
            }
            oq.i0 i0Var = oq.i0.f148189a;
            return true;
        }
    }

    public final void e(c listener) {
        synchronized (this.lock) {
            try {
                d dVar = this.listeners.get(listener);
                if (dVar != null) {
                    dVar.b();
                    this.listeners.remove(listener);
                }
                if (this.listeners.isEmpty()) {
                    this.orientationListener.disable();
                    this.rotation = -1;
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void f() {
        synchronized (this.lock) {
            this.orientationListener.disable();
            this.listeners.clear();
            this.isShutdown = true;
            this.rotation = -1;
            oq.i0 i0Var = oq.i0.f148189a;
        }
    }

    public p1(Context context, boolean z15) {
        this.lock = new Object();
        this.listeners = new LinkedHashMap();
        this.rotation = -1;
        this.ignoreCanDetectForTest = z15;
        this.orientationListener = new a(context, this);
    }
}
