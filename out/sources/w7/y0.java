package w7;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f210813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f210814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f210815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f210816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f210817e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f210818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f210819b;

        public a(Context context) {
            this.f210818a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(final AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new Runnable() { // from class: w7.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f210800a.d(atomicBoolean);
                    }
                }, "ExoPlayer:WifiLockManager").start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void d(AtomicBoolean atomicBoolean) {
            WifiManager.WifiLock wifiLock;
            if (atomicBoolean.get() && (wifiLock = this.f210819b) != null) {
                wifiLock.release();
            }
        }

        public void e(boolean z15, boolean z16) {
            if (z15 && this.f210819b == null) {
                if (this.f210818a.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    t.h("WifiLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) this.f210818a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    t.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f210819b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            if (this.f210819b == null) {
                return;
            }
            if (y0.h(z15, z16)) {
                this.f210819b.acquire();
            } else {
                this.f210819b.release();
            }
        }
    }

    public y0(Context context, Looper looper, h hVar) {
        this.f210813a = new a(context.getApplicationContext());
        this.f210814b = hVar.e(looper, null);
        this.f210815c = hVar.e(Looper.getMainLooper(), null);
    }

    public static /* synthetic */ void a(y0 y0Var, AtomicBoolean atomicBoolean, boolean z15, boolean z16) {
        y0Var.getClass();
        atomicBoolean.set(false);
        y0Var.f210813a.e(z15, z16);
    }

    private void e(final boolean z15, final boolean z16) {
        if (h(z15, z16)) {
            this.f210814b.j(new Runnable() { // from class: w7.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f210784a.f210813a.e(z15, z16);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f210815c.k(new Runnable() { // from class: w7.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f210792a.f210813a.c(atomicBoolean);
            }
        }, 1000L);
        this.f210814b.j(new Runnable() { // from class: w7.w0
            @Override // java.lang.Runnable
            public final void run() {
                y0.a(this.f210794a, atomicBoolean, z15, z16);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(boolean z15, boolean z16) {
        return z15 && z16;
    }

    public void f(boolean z15) {
        if (this.f210816d == z15) {
            return;
        }
        this.f210816d = z15;
        e(z15, this.f210817e);
    }

    public void g(boolean z15) {
        if (this.f210817e == z15) {
            return;
        }
        this.f210817e = z15;
        if (this.f210816d) {
            e(true, z15);
        }
    }
}
