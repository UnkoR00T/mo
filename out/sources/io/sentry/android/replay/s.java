package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.b7;
import io.sentry.q7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0016J\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010IR\u0014\u0010L\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010IR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010N¨\u0006P"}, d2 = {"Lio/sentry/android/replay/s;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lio/sentry/android/replay/u;", "config", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/util/i;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "recorder", "Lio/sentry/android/replay/t;", "screenshotRecorderCallback", "<init>", "(Lio/sentry/android/replay/u;Lio/sentry/q7;Lio/sentry/android/replay/util/i;Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/android/replay/t;)V", "Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "", "n", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)I", "Loq/i0;", "i", "()V", "onDraw", "Landroid/view/View;", "root", "h", "(Landroid/view/View;)V", "w", "u", "v", "m", "a", "Lio/sentry/android/replay/u;", "o", "()Lio/sentry/android/replay/u;", "b", "Lio/sentry/q7;", "q", "()Lio/sentry/q7;", "c", "Lio/sentry/android/replay/util/i;", "d", "Ljava/util/concurrent/ScheduledExecutorService;", "e", "Lio/sentry/android/replay/t;", "Ljava/lang/ref/WeakReference;", "f", "Ljava/lang/ref/WeakReference;", "rootView", "Landroid/graphics/Paint;", "g", "Loq/k;", "p", "()Landroid/graphics/Paint;", "maskingPaint", "s", "()Landroid/graphics/Bitmap;", "singlePixelBitmap", "j", "Landroid/graphics/Bitmap;", "screenshot", "Landroid/graphics/Canvas;", "k", "t", "()Landroid/graphics/Canvas;", "singlePixelBitmapCanvas", "Landroid/graphics/Matrix;", "l", "r", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "contentChanged", "isCapturing", "lastCaptureSuccessful", "Lio/sentry/android/replay/util/d;", "Lio/sentry/android/replay/util/d;", "debugOverlayDrawable", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
@TargetApi(26)
public final class s implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScreenshotRecorderConfig config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.i mainLooperHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService recorder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t screenshotRecorderCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private WeakReference<View> rootView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k maskingPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k singlePixelBitmap;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Bitmap screenshot;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oq.k singlePixelBitmapCanvas;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final oq.k prescaledMatrix;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean contentChanged;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isCapturing;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean lastCaptureSuccessful;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.util.d debugOverlayDrawable;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b;", "node", "", "c", "(Lio/sentry/android/replay/viewhierarchy/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends fr.w implements er.l<io.sentry.android.replay.viewhierarchy.b, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Rect> f94504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Canvas f94505d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Rect> list, Canvas canvas) {
            super(1);
            this.f94504c = list;
            this.f94505d = canvas;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(io.sentry.android.replay.viewhierarchy.b bVar) {
            oq.r rVarA;
            Integer dominantColor;
            if (bVar.getShouldMask() && bVar.getWidth() > 0 && bVar.getHeight() > 0) {
                if (bVar.getVisibleRect() == null) {
                    return Boolean.FALSE;
                }
                if (bVar instanceof io.sentry.android.replay.viewhierarchy.b.c) {
                    List listE = pq.v.e(bVar.getVisibleRect());
                    s sVar = s.this;
                    rVarA = oq.y.a(listE, Integer.valueOf(sVar.n(sVar.screenshot, bVar.getVisibleRect())));
                } else {
                    if (bVar instanceof io.sentry.android.replay.viewhierarchy.b.d) {
                        io.sentry.android.replay.viewhierarchy.b.d dVar = (io.sentry.android.replay.viewhierarchy.b.d) bVar;
                        io.sentry.android.replay.util.n layout = dVar.getLayout();
                        rVarA = oq.y.a(io.sentry.android.replay.util.o.d(dVar.getLayout(), bVar.getVisibleRect(), dVar.getPaddingLeft(), dVar.getPaddingTop()), Integer.valueOf(((layout == null || (dominantColor = layout.g()) == null) && (dominantColor = dVar.getDominantColor()) == null) ? -16777216 : dominantColor.intValue()));
                    } else {
                        rVarA = oq.y.a(pq.v.e(bVar.getVisibleRect()), -16777216);
                    }
                }
                List list = (List) rVarA.a();
                s.this.p().setColor(((Number) rVarA.b()).intValue());
                Canvas canvas = this.f94505d;
                s sVar2 = s.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, sVar2.p());
                }
                if (s.this.getOptions().getReplayController().C()) {
                    this.f94504c.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Paint;", "c", "()Landroid/graphics/Paint;"}, k = 3, mv = {1, 9, 0})
    static final class b extends fr.w implements er.a<Paint> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f94506b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Paint a() {
            return new Paint();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Matrix;", "c", "()Landroid/graphics/Matrix;"}, k = 3, mv = {1, 9, 0})
    static final class c extends fr.w implements er.a<Matrix> {
        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Matrix a() {
            Matrix matrix = new Matrix();
            s sVar = s.this;
            matrix.preScale(sVar.getConfig().getScaleFactorX(), sVar.getConfig().getScaleFactorY());
            return matrix;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 9, 0})
    static final class d extends fr.w implements er.a<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f94508b = new d();

        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap a() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Canvas;", "c", "()Landroid/graphics/Canvas;"}, k = 3, mv = {1, 9, 0})
    static final class e extends fr.w implements er.a<Canvas> {
        e() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Canvas a() {
            return new Canvas(s.this.s());
        }
    }

    public s(ScreenshotRecorderConfig screenshotRecorderConfig, q7 q7Var, io.sentry.android.replay.util.i iVar, ScheduledExecutorService scheduledExecutorService, t tVar) {
        this.config = screenshotRecorderConfig;
        this.options = q7Var;
        this.mainLooperHandler = iVar;
        this.recorder = scheduledExecutorService;
        this.screenshotRecorderCallback = tVar;
        oq.o oVar = oq.o.NONE;
        this.maskingPaint = oq.l.b(oVar, b.f94506b);
        this.singlePixelBitmap = oq.l.b(oVar, d.f94508b);
        this.screenshot = Bitmap.createBitmap(screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getRecordingHeight(), Bitmap.Config.ARGB_8888);
        this.singlePixelBitmapCanvas = oq.l.b(oVar, new e());
        this.prescaledMatrix = oq.l.b(oVar, new c());
        this.contentChanged = new AtomicBoolean(false);
        this.isCapturing = new AtomicBoolean(true);
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.debugOverlayDrawable = new io.sentry.android.replay.util.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final s sVar, final View view, int i15) {
        if (i15 != 0) {
            sVar.options.getLogger().c(b7.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i15));
            sVar.lastCaptureSuccessful.set(false);
        } else if (sVar.contentChanged.get()) {
            sVar.options.getLogger().c(b7.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            sVar.lastCaptureSuccessful.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.INSTANCE.a(view, null, 0, sVar.options);
            io.sentry.android.replay.util.o.k(view, bVarA, sVar.options);
            io.sentry.android.replay.util.g.e(sVar.recorder, sVar.options, "screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.k(this.f94482a, bVarA, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final s sVar, io.sentry.android.replay.viewhierarchy.b bVar, final View view) {
        final ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(sVar.screenshot);
        canvas.setMatrix(sVar.r());
        bVar.h(sVar.new a(arrayList, canvas));
        if (sVar.options.getReplayController().C()) {
            sVar.mainLooperHandler.b(new Runnable() { // from class: io.sentry.android.replay.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.l(this.f94485a, view, arrayList);
                }
            });
        }
        t tVar = sVar.screenshotRecorderCallback;
        if (tVar != null) {
            tVar.r(sVar.screenshot);
        }
        sVar.lastCaptureSuccessful.set(true);
        sVar.contentChanged.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(s sVar, View view, List list) {
        if (sVar.debugOverlayDrawable.getCallback() == null) {
            view.getOverlay().add(sVar.debugOverlayDrawable);
        }
        sVar.debugOverlayDrawable.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        r().mapRect(rectF);
        rectF.round(rect2);
        t().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return s().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint p() {
        return (Paint) this.maskingPaint.getValue();
    }

    private final Matrix r() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap s() {
        return (Bitmap) this.singlePixelBitmap.getValue();
    }

    private final Canvas t() {
        return (Canvas) this.singlePixelBitmapCanvas.getValue();
    }

    public final void h(View root) {
        WeakReference<View> weakReference = this.rootView;
        w(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        io.sentry.android.replay.util.o.a(root, this);
        this.contentChanged.set(true);
    }

    public final void i() {
        if (this.options.getSessionReplay().o()) {
            this.options.getLogger().c(b7.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.isCapturing.get()));
        }
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().o()) {
                this.options.getLogger().c(b7.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.options.getSessionReplay().o()) {
            this.options.getLogger().c(b7.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.contentChanged.get()), Boolean.valueOf(this.lastCaptureSuccessful.get()));
        }
        if (!this.contentChanged.get() && this.lastCaptureSuccessful.get()) {
            t tVar = this.screenshotRecorderCallback;
            if (tVar != null) {
                tVar.r(this.screenshot);
                return;
            }
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().c(b7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        Window windowA = a0.a(view);
        if (windowA == null) {
            this.options.getLogger().c(b7.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            PixelCopy.request(windowA, this.screenshot, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.p
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i15) {
                    s.j(this.f94480a, view, i15);
                }
            }, this.mainLooperHandler.getHandler());
        } catch (Throwable th4) {
            this.options.getLogger().b(b7.WARNING, "Failed to capture replay recording", th4);
            this.lastCaptureSuccessful.set(false);
        }
    }

    public final void m() {
        WeakReference<View> weakReference = this.rootView;
        w(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        if (!this.screenshot.isRecycled()) {
            this.screenshot.recycle();
        }
        this.isCapturing.set(false);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().c(b7.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
            }
        }
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final q7 getOptions() {
        return this.options;
    }

    public final void u() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        w(weakReference != null ? weakReference.get() : null);
    }

    public final void v() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            io.sentry.android.replay.util.o.a(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void w(View root) {
        ViewOverlay overlay;
        if (this.options.getReplayController().C() && root != null && (overlay = root.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (root != null) {
            io.sentry.android.replay.util.o.h(root, this);
        }
    }
}
