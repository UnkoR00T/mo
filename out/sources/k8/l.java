package k8;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.l0;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f109099d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f109100e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f109101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f109102g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l8.a f109103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d<? extends e> f109104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f109105c;

    public interface b<T extends e> {
        void g(T t15, long j15, long j16, boolean z15);

        c l(T t15, long j15, long j16, IOException iOException, int i15);

        default void m(T t15, long j15, long j16, int i15) {
        }

        void r(T t15, long j15, long j16);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f109106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f109107b;

        public boolean c() {
            int i15 = this.f109106a;
            return i15 == 0 || i15 == 1;
        }

        private c(int i15, long j15) {
            this.f109106a = i15;
            this.f109107b = j15;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f109108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f109109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f109110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b<T> f109111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f109112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f109113f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f109114g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f109115h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f109116j;

        public d(Looper looper, T t15, b<T> bVar, int i15, long j15) {
            super(looper);
            this.f109109b = t15;
            this.f109111d = bVar;
            this.f109108a = i15;
            this.f109110c = j15;
        }

        private void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) p.q(this.f109111d)).m(this.f109109b, jElapsedRealtime, jElapsedRealtime - this.f109110c, this.f109113f);
            this.f109112e = null;
            l.this.f109103a.execute((Runnable) p.q(l.this.f109104b));
        }

        private void c() {
            l.this.f109104b = null;
        }

        private long d() {
            return Math.min((this.f109113f - 1) * 1000, 5000);
        }

        public void a(boolean z15) {
            this.f109116j = z15;
            this.f109112e = null;
            if (hasMessages(1)) {
                this.f109115h = true;
                removeMessages(1);
                if (!z15) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f109115h = true;
                        this.f109109b.c();
                        Thread thread = this.f109114g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            if (z15) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) p.q(this.f109111d)).g(this.f109109b, jElapsedRealtime, jElapsedRealtime - this.f109110c, true);
                this.f109111d = null;
            }
        }

        public void e(int i15) throws IOException {
            IOException iOException = this.f109112e;
            if (iOException != null && this.f109113f > i15) {
                throw iOException;
            }
        }

        public void f(long j15) {
            p.w(l.this.f109104b == null);
            l.this.f109104b = this;
            if (j15 > 0) {
                sendEmptyMessageDelayed(1, j15);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f109116j) {
                return;
            }
            int i15 = message.what;
            if (i15 == 1) {
                b();
                return;
            }
            if (i15 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j15 = jElapsedRealtime - this.f109110c;
            b bVar = (b) p.q(this.f109111d);
            if (this.f109115h) {
                bVar.g(this.f109109b, jElapsedRealtime, j15, false);
                return;
            }
            int i16 = message.what;
            if (i16 == 2) {
                try {
                    bVar.r(this.f109109b, jElapsedRealtime, j15);
                    return;
                } catch (RuntimeException e15) {
                    t.d("LoadTask", "Unexpected exception handling load completed", e15);
                    l.this.f109105c = new h(e15);
                    return;
                }
            }
            if (i16 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f109112e = iOException;
            int i17 = this.f109113f + 1;
            this.f109113f = i17;
            c cVarL = bVar.l(this.f109109b, jElapsedRealtime, j15, iOException, i17);
            if (cVarL.f109106a == 3) {
                l.this.f109105c = this.f109112e;
            } else if (cVarL.f109106a != 2) {
                if (cVarL.f109106a == 1) {
                    this.f109113f = 1;
                }
                f(cVarL.f109107b != -9223372036854775807L ? cVarL.f109107b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z15;
            try {
                synchronized (this) {
                    z15 = this.f109115h;
                    this.f109114g = Thread.currentThread();
                }
                if (!z15) {
                    l0.a("load:" + this.f109109b.getClass().getSimpleName());
                    try {
                        this.f109109b.b();
                        l0.b();
                    } catch (Throwable th4) {
                        l0.b();
                        throw th4;
                    }
                }
                synchronized (this) {
                    this.f109114g = null;
                    Thread.interrupted();
                }
                if (this.f109116j) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e15) {
                if (this.f109116j) {
                    return;
                }
                obtainMessage(3, e15).sendToTarget();
            } catch (Error e16) {
                if (!this.f109116j) {
                    t.d("LoadTask", "Unexpected error loading stream", e16);
                    obtainMessage(4, e16).sendToTarget();
                }
                throw e16;
            } catch (Exception e17) {
                if (this.f109116j) {
                    return;
                }
                t.d("LoadTask", "Unexpected exception loading stream", e17);
                obtainMessage(3, new h(e17)).sendToTarget();
            } catch (OutOfMemoryError e18) {
                if (this.f109116j) {
                    return;
                }
                t.d("LoadTask", "OutOfMemory error loading stream", e18);
                obtainMessage(3, new h(e18)).sendToTarget();
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void o();
    }

    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f109118a;

        public g(f fVar) {
            this.f109118a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f109118a.o();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th4) {
            String str;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unexpected ");
            sb5.append(th4.getClass().getSimpleName());
            if (th4.getMessage() != null) {
                str = ": " + th4.getMessage();
            } else {
                str = "";
            }
            sb5.append(str);
            super(sb5.toString(), th4);
        }
    }

    static {
        long j15 = -9223372036854775807L;
        f109101f = new c(2, j15);
        f109102g = new c(3, j15);
    }

    public l(String str) {
        this(l8.a.a0(o0.K0("ExoPlayer:Loader:" + str), new w7.l() { // from class: k8.k
            @Override // w7.l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c g(boolean z15, long j15) {
        return new c(z15 ? 1 : 0, j15);
    }

    public void e() {
        ((d) p.q(this.f109104b)).a(false);
    }

    public void f() {
        this.f109105c = null;
    }

    public boolean h() {
        return this.f109105c != null;
    }

    public boolean i() {
        return this.f109104b != null;
    }

    public void j() throws IOException {
        k(PKIFailureInfo.systemUnavail);
    }

    public void k(int i15) throws IOException {
        IOException iOException = this.f109105c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f109104b;
        if (dVar != null) {
            if (i15 == Integer.MIN_VALUE) {
                i15 = dVar.f109108a;
            }
            dVar.e(i15);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f109104b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f109103a.execute(new g(fVar));
        }
        this.f109103a.b();
    }

    public <T extends e> long n(T t15, b<T> bVar, int i15) {
        Looper looper = (Looper) p.q(Looper.myLooper());
        this.f109105c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t15, bVar, i15, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public l(l8.a aVar) {
        this.f109103a = aVar;
    }
}
