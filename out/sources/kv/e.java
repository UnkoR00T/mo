package kv;

import fr.t;
import fv.b0;
import fv.d0;
import fv.p;
import fv.r;
import fv.v;
import fv.w;
import fv.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001Y\u0018\u00002\u00020\u0001:\u0002FJB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b*\u0010%J\u001d\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00103J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b\u000f\u00106J;\u0010:\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b<\u0010\u0011J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u0010\fJ\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\"J\u000f\u0010E\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\"R\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010X\u001a\u00020T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010eR(\u00105\u001a\u0004\u0018\u0001042\b\u0010g\u001a\u0004\u0018\u0001048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010NR(\u0010p\u001a\u0004\u0018\u0001012\b\u0010g\u001a\u0004\u0018\u0001018\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010m\u001a\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010NR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010NR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010NR\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010NR\u0018\u00107\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010mR$\u0010x\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bv\u0010k\"\u0004\bw\u00106¨\u0006y"}, d2 = {"Lkv/e;", "Lfv/e;", "Lfv/z;", "client", "Lfv/b0;", "originalRequest", "", "forWebSocket", "<init>", "(Lfv/z;Lfv/b0;Z)V", "Loq/i0;", "i", "()V", "Ljava/io/IOException;", "E", "e", "g", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "I", "Lfv/v;", "url", "Lfv/a;", "l", "(Lfv/v;)Lfv/a;", "", "J", "()Ljava/lang/String;", "j", "()Lkv/e;", "C", "()Lfv/b0;", "cancel", "M", "()Z", "Lfv/d0;", "B", "()Lfv/d0;", "Lfv/f;", "responseCallback", "s1", "(Lfv/f;)V", "w", "request", "newExchangeFinder", "m", "(Lfv/b0;Z)V", "Llv/g;", "chain", "Lkv/c;", "x", "(Llv/g;)Lkv/c;", "Lkv/f;", "connection", "(Lkv/f;)V", "exchange", "requestDone", "responseDone", "y", "(Lkv/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "z", "Ljava/net/Socket;", ip.a.f96138c, "()Ljava/net/Socket;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "closeExchange", "n", "(Z)V", "F", "A", "a", "Lfv/z;", "o", "()Lfv/z;", "b", "Lfv/b0;", "v", "c", "Z", "s", "Lkv/g;", "d", "Lkv/g;", "connectionPool", "Lfv/r;", "Lfv/r;", "q", "()Lfv/r;", "eventListener", "kv/e$c", "f", "Lkv/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "h", "Ljava/lang/Object;", "callStackTrace", "Lkv/d;", "Lkv/d;", "exchangeFinder", "<set-?>", "k", "Lkv/f;", "p", "()Lkv/f;", "timeoutEarlyExit", "Lkv/c;", "t", "()Lkv/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "r", "canceled", "getConnectionToCancel", "G", "connectionToCancel", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements fv.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z client;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 originalRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forWebSocket;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c timeout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean executed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Object callStackTrace;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private d exchangeFinder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private f connection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutEarlyExit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private kv.c interceptorScopedExchange;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean requestBodyOpen;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean responseBodyOpen;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean expectMoreExchanges;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private volatile kv.c exchange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private volatile f connectionToCancel;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkv/e$a;", "Ljava/lang/Runnable;", "Lfv/f;", "responseCallback", "<init>", "(Lkv/e;Lfv/f;)V", "Lkv/e;", "other", "Loq/i0;", "e", "(Lkv/e$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "Lfv/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "d", "()Ljava/lang/String;", "host", "()Lkv/e;", "call", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final fv.f responseCallback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private volatile AtomicInteger callsPerHost = new AtomicInteger(0);

        public a(fv.f fVar) {
            this.responseCallback = fVar;
        }

        public final void a(ExecutorService executorService) {
            p dispatcher = e.this.getClient().getDispatcher();
            if (gv.d.f77110h && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e15) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e15);
                    e.this.z(interruptedIOException);
                    this.responseCallback.d(e.this, interruptedIOException);
                    e.this.getClient().getDispatcher().f(this);
                }
            } catch (Throwable th4) {
                e.this.getClient().getDispatcher().f(this);
                throw th4;
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getF112769c() {
            return e.this;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String d() {
            return e.this.v().getUrl().getHost();
        }

        public final void e(a other) {
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z15;
            Throwable th4;
            IOException e15;
            z client;
            String str = "OkHttp " + e.this.A();
            e eVar = e.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.timeout.s();
                try {
                    try {
                        z15 = true;
                        try {
                            this.responseCallback.a(eVar, eVar.w());
                            client = eVar.getClient();
                        } catch (IOException e16) {
                            e15 = e16;
                            if (z15) {
                                ov.h.INSTANCE.g().j("Callback failure for " + eVar.J(), 4, e15);
                            } else {
                                this.responseCallback.d(eVar, e15);
                            }
                            client = eVar.getClient();
                        } catch (Throwable th5) {
                            th4 = th5;
                            eVar.cancel();
                            if (!z15) {
                                IOException iOException = new IOException("canceled due to " + th4);
                                oq.c.a(iOException, th4);
                                this.responseCallback.d(eVar, iOException);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        eVar.getClient().getDispatcher().f(this);
                        throw th6;
                    }
                } catch (IOException e17) {
                    z15 = false;
                    e15 = e17;
                } catch (Throwable th7) {
                    z15 = false;
                    th4 = th7;
                }
                client.getDispatcher().f(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th8) {
                threadCurrentThread.setName(name);
                throw th8;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lkv/e$b;", "Ljava/lang/ref/WeakReference;", "Lkv/e;", "referent", "", "callStackTrace", "<init>", "(Lkv/e;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends WeakReference<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object callStackTrace;

        public b(e eVar, Object obj) {
            super(eVar);
            this.callStackTrace = obj;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kv/e$c", "Lvv/c;", "Loq/i0;", "B", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends vv.c {
        c() {
        }

        @Override // vv.c
        protected void B() {
            e.this.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z15) {
        this.client = zVar;
        this.originalRequest = b0Var;
        this.forWebSocket = z15;
        this.connectionPool = zVar.getConnectionPool().getDelegate();
        this.eventListener = zVar.getEventListenerFactory().a(this);
        c cVar = new c();
        cVar.g(zVar.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E I(E cause) {
        if (this.timeoutEarlyExit || !this.timeout.t()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getCanceled() ? "canceled " : "");
        sb5.append(this.forWebSocket ? "web socket" : "call");
        sb5.append(" to ");
        sb5.append(A());
        return sb5.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final <E extends IOException> E g(E e15) {
        Socket socketD;
        boolean z15 = gv.d.f77110h;
        if (z15 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.connection;
        if (fVar != null) {
            if (z15 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketD = D();
            }
            if (this.connection == null) {
                if (socketD != null) {
                    gv.d.n(socketD);
                }
                this.eventListener.k(this, fVar);
            } else if (socketD != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e16 = (E) I(e15);
        if (e15 != null) {
            this.eventListener.d(this, e16);
            return e16;
        }
        this.eventListener.c(this);
        return e16;
    }

    private final void i() {
        this.callStackTrace = ov.h.INSTANCE.g().h("response.body().close()");
        this.eventListener.e(this);
    }

    private final fv.a l(v url) {
        SSLSocketFactory sSLSocketFactoryS;
        HostnameVerifier hostnameVerifier;
        fv.g certificatePinner;
        if (url.getIsHttps()) {
            sSLSocketFactoryS = this.client.S();
            hostnameVerifier = this.client.getHostnameVerifier();
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactoryS = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new fv.a(url.getHost(), url.getPort(), this.client.getDns(), this.client.getSocketFactory(), sSLSocketFactoryS, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.J(), this.client.q(), this.client.getProxySelector());
    }

    public final String A() {
        return this.originalRequest.getUrl().p();
    }

    @Override // fv.e
    public d0 B() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.s();
        i();
        try {
            this.client.getDispatcher().b(this);
            return w();
        } finally {
            this.client.getDispatcher().g(this);
        }
    }

    @Override // fv.e
    /* JADX INFO: renamed from: C, reason: from getter */
    public b0 getOriginalRequest() {
        return this.originalRequest;
    }

    public final Socket D() {
        f fVar = this.connection;
        if (gv.d.f77110h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listO = fVar.o();
        Iterator<Reference<e>> it = listO.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (t.c(it.next().get(), this)) {
                break;
            }
            i15++;
        }
        if (i15 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listO.remove(i15);
        this.connection = null;
        if (listO.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.connectionPool.c(fVar)) {
                return fVar.getSocket();
            }
        }
        return null;
    }

    public final boolean F() {
        return this.exchangeFinder.e();
    }

    public final void G(f fVar) {
        this.connectionToCancel = fVar;
    }

    public final void H() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.t();
    }

    @Override // fv.e
    /* JADX INFO: renamed from: M, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // fv.e
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        kv.c cVar = this.exchange;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.connectionToCancel;
        if (fVar != null) {
            fVar.e();
        }
        this.eventListener.f(this);
    }

    public final void e(f connection) {
        if (!gv.d.f77110h || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.o().add(new b(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.client, this.originalRequest, this.forWebSocket);
    }

    public final void m(b0 request, boolean newExchangeFinder) {
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            i0 i0Var = i0.f148189a;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new d(this.connectionPool, l(request.getUrl()), this, this.eventListener);
        }
    }

    public final void n(boolean closeExchange) {
        kv.c cVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            i0 i0Var = i0.f148189a;
        }
        if (closeExchange && (cVar = this.exchange) != null) {
            cVar.d();
        }
        this.interceptorScopedExchange = null;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Override // fv.e
    public void s1(fv.f responseCallback) {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        i();
        this.client.getDispatcher().a(new a(responseCallback));
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final kv.c getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final b0 v() {
        return this.originalRequest;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    public final d0 w() {
        Object next;
        ArrayList arrayList = new ArrayList();
        pq.v.D(arrayList, this.client.D());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((w) next) instanceof io.sentry.okhttp.c));
        if (next == null) {
            arrayList.add(new io.sentry.okhttp.c());
        }
        arrayList.add(new lv.j(this.client));
        arrayList.add(new lv.a(this.client.getCookieJar()));
        this.client.j();
        arrayList.add(new iv.a(null));
        arrayList.add(kv.a.f112716a);
        if (!this.forWebSocket) {
            pq.v.D(arrayList, this.client.G());
        }
        arrayList.add(new lv.b(this.forWebSocket));
        lv.g gVar = new lv.g(this, arrayList, 0, null, this.originalRequest, this.client.getConnectTimeoutMillis(), this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis());
        boolean z15 = false;
        try {
            try {
                d0 d0VarA = gVar.a(this.originalRequest);
                if (getCanceled()) {
                    gv.d.m(d0VarA);
                    throw new IOException("Canceled");
                }
                z(null);
                return d0VarA;
            } catch (IOException e15) {
                z15 = true;
                throw z(e15);
            }
        } catch (Throwable th4) {
            if (!z15) {
                z(null);
            }
            throw th4;
        }
        if (!z15) {
            z(null);
        }
        throw th4;
    }

    public final kv.c x(lv.g chain) throws IOException {
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            i0 i0Var = i0.f148189a;
        }
        d dVar = this.exchangeFinder;
        kv.c cVar = new kv.c(this, this.eventListener, dVar, dVar.a(this.client, chain));
        this.interceptorScopedExchange = cVar;
        this.exchange = cVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x001c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:8:0x000d, B:17:0x001c, B:19:0x0020, B:20:0x0022, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:34:0x003d, B:14:0x0016), top: B:46:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0020 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:8:0x000d, B:17:0x001c, B:19:0x0020, B:20:0x0022, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:34:0x003d, B:14:0x0016), top: B:46:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    public final <E extends IOException> E y(kv.c exchange, boolean requestDone, boolean responseDone, E e15) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (t.c(exchange, this.exchange)) {
            synchronized (this) {
                z15 = false;
                if (requestDone) {
                    try {
                        if (this.requestBodyOpen) {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            z17 = this.requestBodyOpen;
                            if (z17) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (!z17) {
                                z15 = true;
                            }
                            z16 = z15;
                            z15 = z18;
                        } else if (responseDone || !this.responseBodyOpen) {
                            z16 = false;
                        } else {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            z17 = this.requestBodyOpen;
                            if (z17 || this.responseBodyOpen) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            if (!z17 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                                z15 = true;
                            }
                            z16 = z15;
                            z15 = z18;
                        }
                        i0 i0Var = i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } else {
                    if (responseDone) {
                    }
                    z16 = false;
                    i0 i0Var2 = i0.f148189a;
                }
            }
            if (z15) {
                this.exchange = null;
                f fVar = this.connection;
                if (fVar != null) {
                    fVar.t();
                }
            }
            if (z16) {
                return (E) g(e15);
            }
        }
        return e15;
    }

    public final IOException z(IOException e15) {
        boolean z15;
        synchronized (this) {
            try {
                z15 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z15 = true;
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return z15 ? g(e15) : e15;
    }
}
