package m8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f124369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f124370e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f124372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f124373c;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w7.n f124374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f124375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f124376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f124377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private l f124378e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i15) throws w7.o.a {
            zj.p.q(this.f124374a);
            this.f124374a.h(i15);
            this.f124378e = new l(this, this.f124374a.g(), i15 != 0);
        }

        private void d() {
            zj.p.q(this.f124374a);
            this.f124374a.i();
        }

        public l a(int i15) {
            boolean z15;
            start();
            this.f124375b = new Handler(getLooper(), this);
            this.f124374a = new w7.n(this.f124375b);
            synchronized (this) {
                z15 = false;
                this.f124375b.obtainMessage(1, i15, 0).sendToTarget();
                while (this.f124378e == null && this.f124377d == null && this.f124376c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z15 = true;
                    }
                }
            }
            if (z15) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f124377d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f124376c;
            if (error == null) {
                return (l) zj.p.q(this.f124378e);
            }
            throw error;
        }

        public void c() {
            zj.p.q(this.f124375b);
            this.f124375b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i15 = message.what;
            try {
                if (i15 != 1) {
                    if (i15 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable th4) {
                        try {
                            w7.t.d("PlaceholderSurface", "Failed to release placeholder surface", th4);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    try {
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (w7.o.a e15) {
                        w7.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e15);
                        this.f124377d = new IllegalStateException(e15);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e16) {
                    w7.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e16);
                    this.f124376c = e16;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e17) {
                    w7.t.d("PlaceholderSurface", "Failed to initialize placeholder surface", e17);
                    this.f124377d = e17;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th5) {
                synchronized (this) {
                    notify();
                    throw th5;
                }
            }
        }
    }

    private static int a(Context context) {
        try {
            if (w7.o.i(context)) {
                return w7.o.j() ? 1 : 2;
            }
            return 0;
        } catch (w7.o.a e15) {
            w7.t.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e15.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f124370e) {
                f124369d = a(context);
                f124370e = true;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f124369d != 0;
    }

    public static l c(Context context, boolean z15) {
        zj.p.w(!z15 || b(context));
        return new b().a(z15 ? f124369d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f124372b) {
            try {
                if (!this.f124373c) {
                    this.f124372b.c();
                    this.f124373c = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private l(b bVar, SurfaceTexture surfaceTexture, boolean z15) {
        super(surfaceTexture);
        this.f124372b = bVar;
        this.f124371a = z15;
    }
}
