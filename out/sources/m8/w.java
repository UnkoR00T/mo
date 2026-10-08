package m8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Display;
import android.view.Surface;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f124465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f124466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f124467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f124468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Surface f124469f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f124471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f124472i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f124475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f124476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f124477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f124478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f124479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f124480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f124481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f124482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f124483t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f124464a = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f124470g = -1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f124473j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124474k = 0;

    private static final class b {
        public static void a(Surface surface, float f15) {
            try {
                surface.setFrameRate(f15, f15 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e15) {
                w7.t.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e15);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class c implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Choreographer f124484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final DisplayManager f124485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile long f124486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile long f124487d;

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return null;
            }
            try {
                Choreographer choreographer = Choreographer.getInstance();
                return Build.VERSION.SDK_INT >= 33 ? new e(choreographer, displayManager) : new d(choreographer, displayManager);
            } catch (RuntimeException e15) {
                w7.t.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e15);
                return null;
            }
        }

        void c() {
            this.f124485b.registerDisplayListener(this, o0.z());
        }

        void d() {
            this.f124485b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i15) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i15) {
        }

        private c(Choreographer choreographer, DisplayManager displayManager) {
            this.f124484a = choreographer;
            this.f124485b = displayManager;
            this.f124486c = -9223372036854775807L;
            this.f124487d = -9223372036854775807L;
        }
    }

    private static final class d extends c implements Choreographer.FrameCallback {
        private static long e(DisplayManager displayManager) {
            Display display = displayManager.getDisplay(0);
            if (display != null) {
                return (long) (1.0E9d / ((double) display.getRefreshRate()));
            }
            w7.t.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            return -9223372036854775807L;
        }

        @Override // m8.w.c
        void c() {
            super.c();
            this.f124484a.postFrameCallback(this);
            this.f124487d = e(this.f124485b);
        }

        @Override // m8.w.c
        void d() {
            super.d();
            this.f124484a.removeFrameCallback(this);
            this.f124486c = -9223372036854775807L;
            this.f124487d = -9223372036854775807L;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j15) {
            this.f124486c = j15;
            this.f124484a.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i15) {
            if (i15 == 0) {
                this.f124484a.postFrameCallback(this);
                this.f124487d = e(this.f124485b);
            }
        }

        private d(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e extends c implements Choreographer$VsyncCallback {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f124488e;

        @Override // m8.w.c
        void c() {
            super.c();
            this.f124484a.postVsyncCallback(this);
        }

        @Override // m8.w.c
        void d() {
            super.d();
            this.f124488e.removeCallbacksAndMessages(null);
            this.f124484a.removeVsyncCallback(this);
            this.f124486c = -9223372036854775807L;
            this.f124487d = -9223372036854775807L;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i15) {
            if (i15 == 0) {
                this.f124484a.postVsyncCallback(this);
            }
        }

        public void onVsync(Choreographer.FrameData frameData) {
            this.f124486c = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            if (frameTimelines.length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                this.f124487d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
            } else {
                this.f124487d = -9223372036854775807L;
            }
            this.f124488e.postDelayed(new Runnable() { // from class: m8.x
                @Override // java.lang.Runnable
                public final void run() {
                    w.e eVar = this.f124489a;
                    eVar.f124484a.postVsyncCallback(eVar);
                }
            }, 500L);
        }

        private e(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.f124488e = o0.z();
        }
    }

    public w(Context context) {
        this.f124465b = context;
    }

    private static boolean b(long j15, long j16) {
        return Math.abs(j15 - j16) <= 20000000;
    }

    private void c() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f124469f) == null || this.f124474k == Integer.MIN_VALUE || this.f124472i == 0.0f || !surface.isValid()) {
            return;
        }
        this.f124472i = 0.0f;
        b.a(this.f124469f, 0.0f);
    }

    private long d(long j15, long j16, long j17) {
        long j18;
        long j19 = j16 + (((j15 - j16) / j17) * j17);
        if (j15 <= j19) {
            j18 = j19 - j17;
        } else {
            j18 = j19;
            j19 += j17;
        }
        long j25 = j19 - j15;
        long j26 = j15 - j18;
        long jAbs = Math.abs(j25 - j26);
        if (jAbs < j17 / 2) {
            long j27 = j17 / 4;
            if (jAbs < j27) {
                long j28 = this.f124475l;
                if (j28 != 0) {
                    this.f124476m = j28;
                } else {
                    if (j25 < j26) {
                        j27 = -j27;
                    }
                    this.f124476m = j27;
                }
            } else {
                this.f124476m = 0L;
            }
        } else {
            this.f124476m = this.f124475l;
        }
        return j25 + this.f124476m < j26 ? j19 : j18;
    }

    private void l() {
        this.f124477n = 0L;
        this.f124481r = -1L;
        this.f124478o = -1L;
        this.f124475l = 0L;
        this.f124476m = 0L;
    }

    private void n() {
        if (Build.VERSION.SDK_INT < 30 || this.f124469f == null) {
            return;
        }
        float fB = this.f124464a.e() ? this.f124464a.b() : this.f124470g;
        float f15 = this.f124471h;
        if (fB == f15) {
            return;
        }
        if (fB != -1.0f && f15 != -1.0f) {
            if (Math.abs(fB - this.f124471h) < ((!this.f124464a.e() || this.f124464a.d() < 5000000000L) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (fB == -1.0f && this.f124464a.c() < 30) {
            return;
        }
        this.f124471h = fB;
        o(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    private void o(boolean z15) {
        Surface surface;
        float f15;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f124469f) == null || this.f124474k == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f124468e) {
            float f16 = this.f124471h;
            if (f16 != -1.0f) {
                f15 = f16 * this.f124473j;
            } else {
                f15 = 0.0f;
            }
        } else {
            f15 = 0.0f;
        }
        if (z15 || this.f124472i != f15) {
            this.f124472i = f15;
            b.a(this.f124469f, f15);
        }
    }

    public long a(long j15, long j16) {
        long j17;
        float fA;
        float f15;
        if (this.f124481r == -1) {
            j17 = j15;
        } else {
            if (this.f124464a.e()) {
                fA = this.f124464a.a() * (this.f124477n - this.f124481r);
                f15 = this.f124473j;
            } else {
                fA = (j16 - this.f124483t) * 1000;
                f15 = this.f124473j;
            }
            long j18 = this.f124482s + ((long) (fA / f15));
            if (b(j15, j18)) {
                j17 = j18;
            } else {
                l();
                j17 = j15;
            }
        }
        this.f124478o = this.f124477n;
        this.f124479p = j17;
        this.f124480q = j16;
        c cVar = this.f124467d;
        if (cVar != null) {
            long j19 = cVar.f124486c;
            long j25 = this.f124467d.f124487d;
            if (j19 != -9223372036854775807L && j25 != -9223372036854775807L) {
                return d(j17, j19, j25) - ((j25 * 80) / 100);
            }
        }
        return j17;
    }

    public void e(float f15) {
        this.f124470g = f15;
        this.f124464a.g();
        n();
    }

    public void f(long j15) {
        long j16 = this.f124478o;
        if (j16 != -1) {
            this.f124481r = j16;
            this.f124482s = this.f124479p;
            this.f124483t = this.f124480q;
            this.f124475l = this.f124476m;
        }
        this.f124477n++;
        this.f124464a.f(j15 * 1000);
        n();
    }

    public void g(float f15) {
        this.f124473j = f15;
        o(false);
    }

    public void h() {
        l();
    }

    public void i() {
        this.f124468e = true;
        l();
        if (!this.f124466c) {
            this.f124467d = c.b(this.f124465b);
        }
        c cVar = this.f124467d;
        if (cVar != null) {
            cVar.c();
        }
        o(false);
    }

    public void j() {
        this.f124468e = false;
        c cVar = this.f124467d;
        if (cVar != null) {
            cVar.d();
        }
        c();
    }

    public void k(Surface surface) {
        if (this.f124469f == surface) {
            return;
        }
        c();
        this.f124469f = surface;
        o(true);
    }

    public void m(int i15) {
        if (this.f124474k == i15) {
            return;
        }
        this.f124474k = i15;
        o(true);
    }
}
