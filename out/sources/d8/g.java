package d8;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b8.e2;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
class g implements m {
    private a0.d A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t7.l.b> f40203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f40204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f40206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f40210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w7.m<t.a> f40211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k8.j f40212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e2 f40213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j0 f40214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f40215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f40216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f40217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f40218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f40220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private HandlerThread f40221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f40222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private z7.b f40223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private m.a f40224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f40225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f40226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a0.a f40227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private h0.b f40228z;

    public interface a {
        void a(Exception exc, boolean z15);

        void b();

        void c(g gVar);
    }

    public interface b {
        void a(g gVar, int i15);

        void b(g gVar, int i15);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40229a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, k0 k0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f40232b) {
                return false;
            }
            int i15 = dVar.f40235e + 1;
            dVar.f40235e = i15;
            if (i15 > g.this.f40212j.b(3)) {
                return false;
            }
            h8.x xVar = new h8.x(dVar.f40231a, k0Var.f40295a, k0Var.f40296b, k0Var.f40297c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f40233c, k0Var.f40298d);
            long jA = g.this.f40212j.a(new k8.j.a(xVar, new h8.a0(3), k0Var.getCause() instanceof IOException ? (IOException) k0Var.getCause() : new f(k0Var.getCause()), dVar.f40235e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (g.this.f40218p) {
                try {
                    if (g.this.f40228z != null) {
                        g.this.f40228z.c(xVar);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            synchronized (this) {
                try {
                    if (this.f40229a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        void b(int i15, Object obj, boolean z15) {
            obtainMessage(i15, new d(h8.x.b(), z15, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f40229a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i15 = message.what;
                if (i15 == 1) {
                    objB = g.this.f40214l.b(g.this.f40215m, (a0.d) dVar.f40234d);
                } else {
                    if (i15 != 2) {
                        throw new RuntimeException();
                    }
                    j0.b bVarA = g.this.f40214l.a(g.this.f40215m, (a0.a) dVar.f40234d);
                    synchronized (g.this.f40218p) {
                        try {
                            if (g.this.f40228z != null && bVarA.f40291b != null) {
                                g.this.f40228z.c(bVarA.f40291b.a(dVar.f40231a, SystemClock.elapsedRealtime() - dVar.f40233c));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    objB = bVarA;
                }
            } catch (k0 e15) {
                boolean zA = a(message, e15);
                objB = e15;
                if (zA) {
                    return;
                }
            } catch (Exception e16) {
                w7.t.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e16);
                objB = e16;
            }
            g.this.f40212j.c(dVar.f40231a);
            synchronized (this) {
                try {
                    if (!this.f40229a) {
                        g.this.f40217o.obtainMessage(message.what, Pair.create(dVar.f40234d, objB)).sendToTarget();
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f40234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40235e;

        public d(long j15, boolean z15, long j16, Object obj) {
            this.f40231a = j15;
            this.f40232b = z15;
            this.f40233c = j16;
            this.f40234d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i15 = message.what;
            if (i15 == 1) {
                g.this.G(obj, obj2);
            } else {
                if (i15 != 2) {
                    return;
                }
                g.this.A(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th4) {
            super(th4);
        }
    }

    public g(UUID uuid, a0 a0Var, a aVar, b bVar, List<t7.l.b> list, int i15, boolean z15, boolean z16, byte[] bArr, HashMap<String, String> map, j0 j0Var, Looper looper, k8.j jVar, e2 e2Var) {
        if (i15 == 1 || i15 == 3) {
            zj.p.q(bArr);
        }
        this.f40215m = uuid;
        this.f40205c = aVar;
        this.f40206d = bVar;
        this.f40204b = a0Var;
        this.f40207e = i15;
        this.f40208f = z15;
        this.f40209g = z16;
        if (bArr != null) {
            this.f40226x = bArr;
            this.f40203a = null;
        } else {
            this.f40203a = Collections.unmodifiableList((List) zj.p.q(list));
        }
        this.f40210h = map;
        this.f40214l = j0Var;
        this.f40211i = new w7.m<>();
        this.f40212j = jVar;
        this.f40213k = e2Var;
        this.f40219q = 2;
        this.f40216n = looper;
        this.f40217o = new e(looper);
        this.f40218p = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Object obj, Object obj2) {
        final h0 h0VarD;
        if (obj == this.f40227y && y()) {
            this.f40227y = null;
            synchronized (this.f40218p) {
                h0VarD = ((h0.b) zj.p.q(this.f40228z)).d();
                this.f40228z = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                B((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((j0.b) obj2).f40290a;
                if (this.f40207e == 3) {
                    this.f40204b.m((byte[]) o0.h(this.f40226x), bArr);
                    u(new w7.l() { // from class: d8.c
                        @Override // w7.l
                        public final void accept(Object obj3) {
                            ((t.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrM = this.f40204b.m(this.f40225w, bArr);
                int i15 = this.f40207e;
                if ((i15 == 2 || (i15 == 0 && this.f40226x != null)) && bArrM != null && bArrM.length != 0) {
                    this.f40226x = bArrM;
                }
                this.f40219q = 4;
                u(new w7.l() { // from class: d8.d
                    @Override // w7.l
                    public final void accept(Object obj3) {
                        ((t.a) obj3).h(h0VarD);
                    }
                });
            } catch (Exception e15) {
                e = e15;
                B(e, true);
            } catch (NoSuchMethodError e16) {
                e = e16;
                B(e, true);
            }
        }
    }

    private void B(Throwable th4, boolean z15) {
        if ((th4 instanceof NotProvisionedException) || x.d(th4)) {
            this.f40205c.c(this);
        } else {
            z(th4, z15 ? 1 : 2);
        }
    }

    private void C() {
        if (this.f40207e == 0 && this.f40219q == 4) {
            o0.h(this.f40225w);
            v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(Object obj, Object obj2) {
        if (obj == this.A) {
            if (this.f40219q == 2 || y()) {
                this.A = null;
                if (obj2 instanceof Exception) {
                    this.f40205c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f40204b.f(((j0.b) obj2).f40290a);
                    this.f40205c.b();
                } catch (Exception e15) {
                    this.f40205c.a(e15, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private boolean H() {
        if (y()) {
            return true;
        }
        try {
            byte[] bArrD = this.f40204b.d();
            this.f40225w = bArrD;
            this.f40204b.h(bArrD, this.f40213k);
            this.f40223u = this.f40204b.i(this.f40225w);
            final int i15 = 3;
            this.f40219q = 3;
            u(new w7.l() { // from class: d8.b
                @Override // w7.l
                public final void accept(Object obj) {
                    ((t.a) obj).k(i15);
                }
            });
            zj.p.q(this.f40225w);
            return true;
        } catch (NotProvisionedException unused) {
            this.f40205c.c(this);
            return false;
        } catch (Exception e15) {
            e = e15;
            if (x.d(e)) {
                this.f40205c.c(this);
                return false;
            }
            z(e, 1);
            return false;
        } catch (NoSuchMethodError e16) {
            e = e16;
            if (x.d(e)) {
                this.f40205c.c(this);
                return false;
            }
            z(e, 1);
            return false;
        }
    }

    private void I(byte[] bArr, int i15, boolean z15) {
        try {
            synchronized (this.f40218p) {
                try {
                    h0.b bVar = new h0.b();
                    this.f40228z = bVar;
                    List<t7.l.b> list = this.f40203a;
                    if (list != null) {
                        bVar.e(list);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            this.f40227y = this.f40204b.n(bArr, this.f40203a, i15, this.f40210h);
            ((c) o0.h(this.f40222t)).b(2, zj.p.q(this.f40227y), z15);
        } catch (Exception | NoSuchMethodError e15) {
            B(e15, true);
        }
    }

    private boolean K() {
        try {
            this.f40204b.e(this.f40225w, this.f40226x);
            return true;
        } catch (Exception | NoSuchMethodError e15) {
            z(e15, 1);
            return false;
        }
    }

    private void L() {
        if (Thread.currentThread() != this.f40216n.getThread()) {
            w7.t.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f40216n.getThread().getName(), new IllegalStateException());
        }
    }

    private void u(w7.l<t.a> lVar) {
        Iterator<t.a> it = this.f40211i.y2().iterator();
        while (it.hasNext()) {
            lVar.accept(it.next());
        }
    }

    private void v(boolean z15) {
        if (this.f40209g) {
            return;
        }
        byte[] bArr = (byte[]) o0.h(this.f40225w);
        int i15 = this.f40207e;
        if (i15 != 0 && i15 != 1) {
            if (i15 == 2) {
                if (this.f40226x == null || K()) {
                    I(bArr, 2, z15);
                    return;
                }
                return;
            }
            if (i15 != 3) {
                return;
            }
            zj.p.q(this.f40226x);
            zj.p.q(this.f40225w);
            I(this.f40226x, 3, z15);
            return;
        }
        if (this.f40226x == null) {
            I(bArr, 1, z15);
            return;
        }
        if (this.f40219q == 4 || K()) {
            long jW = w();
            if (this.f40207e != 0 || jW > 60) {
                if (jW <= 0) {
                    z(new i0(), 2);
                    return;
                } else {
                    this.f40219q = 4;
                    u(new w7.l() { // from class: d8.f
                        @Override // w7.l
                        public final void accept(Object obj) {
                            ((t.a) obj).j();
                        }
                    });
                    return;
                }
            }
            w7.t.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jW);
            I(bArr, 2, z15);
        }
    }

    private long w() {
        if (!t7.f.f188173e.equals(this.f40215m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) zj.p.q(m0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean y() {
        int i15 = this.f40219q;
        return i15 == 3 || i15 == 4;
    }

    private void z(final Throwable th4, int i15) {
        this.f40224v = new m.a(th4, x.b(th4, i15));
        w7.t.d("DefaultDrmSession", "DRM session error", th4);
        if (th4 instanceof Exception) {
            u(new w7.l() { // from class: d8.e
                @Override // w7.l
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th4);
                }
            });
        } else {
            if (!(th4 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th4);
            }
            if (!x.e(th4) && !x.d(th4)) {
                throw ((Error) th4);
            }
        }
        if (this.f40219q != 4) {
            this.f40219q = 1;
        }
    }

    void D(int i15) {
        if (i15 != 2) {
            return;
        }
        C();
    }

    void E() {
        if (H()) {
            v(true);
        }
    }

    void F(Exception exc, boolean z15) {
        z(exc, z15 ? 1 : 3);
    }

    void J() {
        this.A = this.f40204b.c();
        ((c) o0.h(this.f40222t)).b(1, zj.p.q(this.A), true);
    }

    @Override // d8.m
    public final UUID a() {
        L();
        return this.f40215m;
    }

    @Override // d8.m
    public boolean b() {
        L();
        return this.f40208f;
    }

    @Override // d8.m
    public final m.a c() {
        L();
        if (this.f40219q == 1) {
            return this.f40224v;
        }
        return null;
    }

    @Override // d8.m
    public final z7.b d() {
        L();
        return this.f40223u;
    }

    @Override // d8.m
    public void e(t.a aVar) {
        L();
        if (this.f40220r < 0) {
            w7.t.c("DefaultDrmSession", "Session reference count less than zero: " + this.f40220r);
            this.f40220r = 0;
        }
        if (aVar != null) {
            this.f40211i.e(aVar);
        }
        int i15 = this.f40220r + 1;
        this.f40220r = i15;
        if (i15 == 1) {
            zj.p.w(this.f40219q == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f40221s = handlerThread;
            handlerThread.start();
            this.f40222t = new c(this.f40221s.getLooper());
            if (H()) {
                v(true);
            }
        } else if (aVar != null && y() && this.f40211i.l3(aVar) == 1) {
            aVar.k(this.f40219q);
        }
        this.f40206d.a(this, this.f40220r);
    }

    @Override // d8.m
    public void f(t.a aVar) {
        L();
        int i15 = this.f40220r;
        if (i15 <= 0) {
            w7.t.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i16 = i15 - 1;
        this.f40220r = i16;
        if (i16 == 0) {
            this.f40219q = 0;
            ((e) o0.h(this.f40217o)).removeCallbacksAndMessages(null);
            ((c) o0.h(this.f40222t)).c();
            this.f40222t = null;
            ((HandlerThread) o0.h(this.f40221s)).quit();
            this.f40221s = null;
            this.f40223u = null;
            this.f40224v = null;
            this.f40227y = null;
            synchronized (this.f40218p) {
                this.f40228z = null;
            }
            this.A = null;
            byte[] bArr = this.f40225w;
            if (bArr != null) {
                this.f40204b.l(bArr);
                this.f40225w = null;
            }
        }
        if (aVar != null) {
            this.f40211i.f(aVar);
            if (this.f40211i.l3(aVar) == 0) {
                aVar.m();
            }
        }
        this.f40206d.b(this, this.f40220r);
    }

    @Override // d8.m
    public final int getState() {
        L();
        return this.f40219q;
    }

    @Override // d8.m
    public Map<String, String> h() {
        L();
        byte[] bArr = this.f40225w;
        if (bArr == null) {
            return null;
        }
        return this.f40204b.a(bArr);
    }

    @Override // d8.m
    public boolean i(String str) {
        L();
        return this.f40204b.k((byte[]) zj.p.q(this.f40225w), str);
    }

    public boolean x(byte[] bArr) {
        L();
        return Arrays.equals(this.f40225w, bArr);
    }
}
