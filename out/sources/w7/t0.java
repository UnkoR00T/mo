package w7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f210775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f210776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f210777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f210778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f210779e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f210780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f210781b;

        public a(Context context) {
            this.f210780a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(final AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new Runnable() { // from class: w7.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f210768a.e(atomicBoolean);
                    }
                }, "ExoPlayer:WakeLockManager").start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void e(AtomicBoolean atomicBoolean) {
            PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.f210781b) != null) {
                wakeLock.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"WakelockTimeout"})
        public synchronized void f(boolean z15, boolean z16) {
            if (z15) {
                if (this.f210781b == null) {
                    if (this.f210780a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        t.h("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.f210780a.getSystemService("power");
                    if (powerManager == null) {
                        t.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f210781b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.f210781b == null) {
                return;
            }
            if (t0.h(z15, z16)) {
                this.f210781b.acquire();
            } else {
                this.f210781b.release();
            }
        }
    }

    public t0(Context context, Looper looper, h hVar) {
        this.f210775a = new a(context.getApplicationContext());
        this.f210776b = hVar.e(looper, null);
        this.f210777c = hVar.e(Looper.getMainLooper(), null);
    }

    public static /* synthetic */ void a(t0 t0Var, AtomicBoolean atomicBoolean, boolean z15, boolean z16) {
        t0Var.getClass();
        atomicBoolean.set(false);
        t0Var.f210775a.f(z15, z16);
    }

    private void e(final boolean z15, final boolean z16) {
        if (h(z15, z16)) {
            this.f210776b.j(new Runnable() { // from class: w7.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f210741a.f210775a.f(z15, z16);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f210777c.k(new Runnable() { // from class: w7.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f210745a.f210775a.d(atomicBoolean);
            }
        }, 1000L);
        this.f210776b.j(new Runnable() { // from class: w7.r0
            @Override // java.lang.Runnable
            public final void run() {
                t0.a(this.f210750a, atomicBoolean, z15, z16);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(boolean z15, boolean z16) {
        return z15 && z16;
    }

    public void f(boolean z15) {
        if (this.f210778d == z15) {
            return;
        }
        this.f210778d = z15;
        e(z15, this.f210779e);
    }

    public void g(boolean z15) {
        if (this.f210779e == z15) {
            return;
        }
        this.f210779e = z15;
        if (this.f210778d) {
            e(true, z15);
        }
    }
}
