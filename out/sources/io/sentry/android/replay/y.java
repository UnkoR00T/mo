package io.sentry.android.replay;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.b7;
import io.sentry.g1;
import io.sentry.q7;
import io.sentry.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0002#\u0014B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R0\u00104\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0100j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f01`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lio/sentry/android/replay/y;", "Lio/sentry/android/replay/f;", "Lio/sentry/android/replay/d;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/t;", "screenshotRecorderCallback", "Lio/sentry/android/replay/w;", "windowCallback", "Lio/sentry/android/replay/util/i;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/t;Lio/sentry/android/replay/w;Lio/sentry/android/replay/util/i;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroid/view/View;", "root", "", "added", "Loq/i0;", "b", "(Landroid/view/View;Z)V", "r", "(Landroid/view/View;)V", "start", "()V", "Lio/sentry/android/replay/u;", "config", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lio/sentry/android/replay/u;)V", "s", "g", "reset", "stop", "close", "a", "Lio/sentry/q7;", "Lio/sentry/android/replay/t;", "c", "Lio/sentry/android/replay/w;", "d", "Lio/sentry/android/replay/util/i;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "rootViews", "Landroid/graphics/Point;", "h", "Landroid/graphics/Point;", "lastKnownWindowSize", "Lio/sentry/util/a;", "j", "Lio/sentry/util/a;", "rootViewsLock", "k", "capturerLock", "Lio/sentry/android/replay/y$a;", "l", "Lio/sentry/android/replay/y$a;", "capturer", "m", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class y implements f, io.sentry.android.replay.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94601n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t screenshotRecorderCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w windowCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.i mainLooperHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService replayExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isRecording = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<WeakReference<View>> rootViews = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Point lastKnownWindowSize = new Point();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a rootViewsLock = new io.sentry.util.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a capturerLock = new io.sentry.util.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private volatile a capturer;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f¨\u0006!"}, d2 = {"Lio/sentry/android/replay/y$a;", "Ljava/lang/Runnable;", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/util/i;", "mainLooperHandler", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/util/i;)V", "Loq/i0;", "c", "()V", "b", "f", "run", "a", "Lio/sentry/q7;", "Lio/sentry/android/replay/util/i;", "Lio/sentry/android/replay/s;", "Lio/sentry/android/replay/s;", "()Lio/sentry/android/replay/s;", "e", "(Lio/sentry/android/replay/s;)V", "recorder", "Lio/sentry/android/replay/u;", "d", "Lio/sentry/android/replay/u;", "getConfig", "()Lio/sentry/android/replay/u;", "(Lio/sentry/android/replay/u;)V", "config", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q7 options;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final io.sentry.android.replay.util.i mainLooperHandler;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private s recorder;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private ScreenshotRecorderConfig config;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AtomicBoolean isRecording = new AtomicBoolean(true);

        public a(q7 q7Var, io.sentry.android.replay.util.i iVar) {
            this.options = q7Var;
            this.mainLooperHandler = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s getRecorder() {
            return this.recorder;
        }

        public final void b() {
            s sVar = this.recorder;
            if (sVar != null) {
                sVar.u();
            }
            this.isRecording.getAndSet(false);
        }

        public final void c() {
            if (this.options.getSessionReplay().o()) {
                this.options.getLogger().c(b7.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            s sVar = this.recorder;
            if (sVar != null) {
                sVar.v();
            }
            this.isRecording.getAndSet(true);
            this.mainLooperHandler.d(this);
            if (this.mainLooperHandler.b(this)) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void d(ScreenshotRecorderConfig screenshotRecorderConfig) {
            this.config = screenshotRecorderConfig;
        }

        public final void e(s sVar) {
            this.recorder = sVar;
        }

        public final void f() {
            s sVar = this.recorder;
            if (sVar != null) {
                sVar.m();
            }
            this.recorder = null;
            this.isRecording.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.isRecording.get()) {
                if (this.options.getSessionReplay().o()) {
                    this.options.getLogger().c(b7.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.options.getSessionReplay().o()) {
                    this.options.getLogger().c(b7.DEBUG, "Capturing a frame.", new Object[0]);
                }
                s sVar = this.recorder;
                if (sVar != null) {
                    sVar.i();
                }
            } catch (Throwable th4) {
                this.options.getLogger().b(b7.ERROR, "Failed to capture a frame", th4);
            }
            if (this.options.getSessionReplay().o()) {
                v0 logger = this.options.getLogger();
                b7 b7Var = b7.DEBUG;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Posting the capture runnable again, frame rate is ");
                ScreenshotRecorderConfig screenshotRecorderConfig = this.config;
                sb5.append(screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1);
                sb5.append(" fps.");
                logger.c(b7Var, sb5.toString(), new Object[0]);
            }
            io.sentry.android.replay.util.i iVar = this.mainLooperHandler;
            ScreenshotRecorderConfig screenshotRecorderConfig2 = this.config;
            if (iVar.c(this, 1000 / ((long) (screenshotRecorderConfig2 != null ? screenshotRecorderConfig2.getFrameRate() : 1)))) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/sentry/android/replay/y$c", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f94619b;

        c(View view) {
            this.f94619b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) pq.v.z0(y.this.rootViews);
            if (!fr.t.c(this.f94619b, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.o.i(this.f94619b, this);
                return true;
            }
            if (io.sentry.android.replay.util.o.e(this.f94619b)) {
                io.sentry.android.replay.util.o.i(this.f94619b, this);
                if (this.f94619b.getWidth() != y.this.lastKnownWindowSize.x && this.f94619b.getHeight() != y.this.lastKnownWindowSize.y) {
                    y.this.lastKnownWindowSize.set(this.f94619b.getWidth(), this.f94619b.getHeight());
                    y.this.windowCallback.p(this.f94619b.getWidth(), this.f94619b.getHeight());
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "it", "", "c", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends fr.w implements er.l<WeakReference<View>, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f94620b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(1);
            this.f94620b = view;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(WeakReference<View> weakReference) {
            return Boolean.valueOf(fr.t.c(weakReference.get(), this.f94620b));
        }
    }

    public y(q7 q7Var, t tVar, w wVar, io.sentry.android.replay.util.i iVar, ScheduledExecutorService scheduledExecutorService) {
        this.options = q7Var;
        this.screenshotRecorderCallback = tVar;
        this.windowCallback = wVar;
        this.mainLooperHandler = iVar;
        this.replayExecutor = scheduledExecutorService;
    }

    @Override // io.sentry.android.replay.f
    public void P(ScreenshotRecorderConfig config) throws Exception {
        a aVar;
        s recorder;
        if (this.isRecording.get()) {
            if (this.capturer == null) {
                g1 g1VarA = this.capturerLock.a();
                try {
                    if (this.capturer == null) {
                        this.capturer = new a(this.options, this.mainLooperHandler);
                    }
                    i0 i0Var = i0.f148189a;
                    cr.a.a(g1VarA, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        cr.a.a(g1VarA, th4);
                        throw th5;
                    }
                }
            }
            a aVar2 = this.capturer;
            if (aVar2 != null) {
                aVar2.d(config);
            }
            a aVar3 = this.capturer;
            if (aVar3 != null) {
                aVar3.e(new s(config, this.options, this.mainLooperHandler, this.replayExecutor, this.screenshotRecorderCallback));
            }
            WeakReference weakReference = (WeakReference) pq.v.z0(this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.capturer) != null && (recorder = aVar.getRecorder()) != null) {
                recorder.h(view);
            }
            this.mainLooperHandler.d(this.capturer);
            if (this.mainLooperHandler.c(this.capturer, 100L)) {
                return;
            }
            this.options.getLogger().c(b7.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.d
    public void b(View root, boolean added) throws Exception {
        s recorder;
        s recorder2;
        s recorder3;
        g1 g1VarA = this.rootViewsLock.a();
        try {
            if (added) {
                this.rootViews.add(new WeakReference<>(root));
                a aVar = this.capturer;
                if (aVar != null && (recorder3 = aVar.getRecorder()) != null) {
                    recorder3.h(root);
                }
                r(root);
            } else {
                a aVar2 = this.capturer;
                if (aVar2 != null && (recorder2 = aVar2.getRecorder()) != null) {
                    recorder2.w(root);
                }
                pq.v.J(this.rootViews, new d(root));
                WeakReference weakReference = (WeakReference) pq.v.z0(this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !fr.t.c(root, view)) {
                    a aVar3 = this.capturer;
                    if (aVar3 != null && (recorder = aVar3.getRecorder()) != null) {
                        recorder.h(view);
                    }
                    r(view);
                }
            }
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        reset();
        this.mainLooperHandler.d(this.capturer);
        stop();
    }

    @Override // io.sentry.android.replay.f
    public void g() {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void r(View root) {
        if (!io.sentry.android.replay.util.o.e(root)) {
            io.sentry.android.replay.util.o.b(root, new c(root));
            return;
        }
        if (root.getWidth() != this.lastKnownWindowSize.x) {
            int height = root.getHeight();
            Point point = this.lastKnownWindowSize;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.windowCallback.p(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.f
    public void reset() throws Exception {
        s recorder;
        this.lastKnownWindowSize.set(0, 0);
        g1 g1VarA = this.rootViewsLock.a();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a aVar = this.capturer;
                if (aVar != null && (recorder = aVar.getRecorder()) != null) {
                    recorder.w((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }

    @Override // io.sentry.android.replay.f
    public void s() {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // io.sentry.android.replay.f
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.f
    public void stop() throws Exception {
        a aVar = this.capturer;
        if (aVar != null) {
            aVar.f();
        }
        g1 g1VarA = this.capturerLock.a();
        try {
            this.capturer = null;
            i0 i0Var = i0.f148189a;
            cr.a.a(g1VarA, null);
            this.isRecording.set(false);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(g1VarA, th4);
                throw th5;
            }
        }
    }
}
