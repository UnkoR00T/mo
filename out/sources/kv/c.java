package kv;

import fr.t;
import fv.b0;
import fv.d0;
import fv.e0;
import fv.r;
import java.io.IOException;
import java.net.ProtocolException;
import p071kotlin.Metadata;
import vv.j0;
import vv.k0;
import vv.m;
import vv.n;
import vv.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00020)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u001bJ\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u001bJ\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u001bJ9\u00100\u001a\u00028\u0000\"\n\b\u0000\u0010+*\u0004\u0018\u00010\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010<R$\u0010A\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R$\u0010C\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bB\u0010@R\u001a\u0010H\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010@¨\u0006K"}, d2 = {"Lkv/c;", "", "Lkv/e;", "call", "Lfv/r;", "eventListener", "Lkv/d;", "finder", "Llv/d;", "codec", "<init>", "(Lkv/e;Lfv/r;Lkv/d;Llv/d;)V", "Ljava/io/IOException;", "e", "Loq/i0;", "t", "(Ljava/io/IOException;)V", "Lfv/b0;", "request", "u", "(Lfv/b0;)V", "", "duplex", "Lvv/j0;", "c", "(Lfv/b0;Z)Lvv/j0;", "f", "()V", "s", "expectContinue", "Lfv/d0$a;", "q", "(Z)Lfv/d0$a;", "Lfv/d0;", "response", "r", "(Lfv/d0;)V", "Lfv/e0;", "p", "(Lfv/d0;)Lfv/e0;", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "Lkv/e;", "g", "()Lkv/e;", "Lfv/r;", "i", "()Lfv/r;", "Lkv/d;", "j", "()Lkv/d;", "Llv/d;", "<set-?>", "Z", "m", "()Z", "isDuplex", "k", "hasFailure", "Lkv/f;", "Lkv/f;", "h", "()Lkv/f;", "connection", "l", "isCoalescedConnection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d finder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lv.d codec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDuplex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasFailure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f connection;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001e"}, d2 = {"Lkv/c$a;", "Lvv/m;", "Lvv/j0;", "delegate", "", "contentLength", "<init>", "(Lkv/c;Lvv/j0;J)V", "Ljava/io/IOException;", "E", "e", "b", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lvv/e;", "source", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "J", "", "c", "Z", "completed", "d", "bytesReceived", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a(j0 j0Var, long j15) {
            super(j0Var);
            this.contentLength = j15;
        }

        private final <E extends IOException> E b(E e15) {
            if (this.completed) {
                return e15;
            }
            this.completed = true;
            return (E) c.this.a(this.bytesReceived, false, true, e15);
        }

        @Override // vv.m, vv.j0
        public void O3(vv.e source, long byteCount) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j15 = this.contentLength;
            if (j15 == -1 || this.bytesReceived + byteCount <= j15) {
                try {
                    super.O3(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e15) {
                    throw b(e15);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }

        @Override // vv.m, vv.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j15 = this.contentLength;
            if (j15 != -1 && this.bytesReceived != j15) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e15) {
                throw b(e15);
            }
        }

        @Override // vv.m, vv.j0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e15) {
                throw b(e15);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lkv/c$b;", "Lvv/n;", "Lvv/k0;", "delegate", "", "contentLength", "<init>", "(Lkv/c;Lvv/k0;J)V", "Lvv/e;", "sink", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "close", "()V", "Ljava/io/IOException;", "E", "e", "h", "(Ljava/io/IOException;)Ljava/io/IOException;", "b", "J", "c", "bytesReceived", "", "d", "Z", "invokeStartEvent", "completed", "f", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long contentLength;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long bytesReceived;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean invokeStartEvent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean completed;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public b(k0 k0Var, long j15) {
            super(k0Var);
            this.contentLength = j15;
            this.invokeStartEvent = true;
            if (j15 == 0) {
                h(null);
            }
        }

        @Override // vv.n, vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                h(null);
            } catch (IOException e15) {
                throw h(e15);
            }
        }

        public final <E extends IOException> E h(E e15) {
            if (this.completed) {
                return e15;
            }
            this.completed = true;
            if (e15 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                c.this.getEventListener().v(c.this.getCall());
            }
            return (E) c.this.a(this.bytesReceived, true, false, e15);
        }

        @Override // vv.n, vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long jK3 = getDelegate().k3(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    c.this.getEventListener().v(c.this.getCall());
                }
                if (jK3 == -1) {
                    h(null);
                    return -1L;
                }
                long j15 = this.bytesReceived + jK3;
                long j16 = this.contentLength;
                if (j16 != -1 && j15 > j16) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j15);
                }
                this.bytesReceived = j15;
                if (j15 == j16) {
                    h(null);
                }
                return jK3;
            } catch (IOException e15) {
                throw h(e15);
            }
        }
    }

    public c(e eVar, r rVar, d dVar, lv.d dVar2) {
        this.call = eVar;
        this.eventListener = rVar;
        this.finder = dVar;
        this.codec = dVar2;
        this.connection = dVar2.getConnection();
    }

    private final void t(IOException e15) {
        this.hasFailure = true;
        this.finder.h(e15);
        this.codec.getConnection().H(this.call, e15);
    }

    public final <E extends IOException> E a(long bytesRead, boolean responseDone, boolean requestDone, E e15) {
        if (e15 != null) {
            t(e15);
        }
        if (requestDone) {
            if (e15 != null) {
                this.eventListener.r(this.call, e15);
            } else {
                this.eventListener.p(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e15 != null) {
                this.eventListener.w(this.call, e15);
            } else {
                this.eventListener.u(this.call, bytesRead);
            }
        }
        return (E) this.call.y(this, requestDone, responseDone, e15);
    }

    public final void b() {
        this.codec.cancel();
    }

    public final j0 c(b0 request, boolean duplex) {
        this.isDuplex = duplex;
        long jA = request.getBody().a();
        this.eventListener.q(this.call);
        return new a(this.codec.a(request, jA), jA);
    }

    public final void d() {
        this.codec.cancel();
        this.call.y(this, true, true, null);
    }

    public final void e() throws IOException {
        try {
            this.codec.c();
        } catch (IOException e15) {
            this.eventListener.r(this.call, e15);
            t(e15);
            throw e15;
        }
    }

    public final void f() throws IOException {
        try {
            this.codec.h();
        } catch (IOException e15) {
            this.eventListener.r(this.call, e15);
            t(e15);
            throw e15;
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final r getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean l() {
        return !t.c(this.finder.getAddress().getUrl().getHost(), this.connection.getRoute().getAddress().getUrl().getHost());
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void n() {
        this.codec.getConnection().z();
    }

    public final void o() {
        this.call.y(this, true, false, null);
    }

    public final e0 p(d0 response) throws IOException {
        try {
            String strE = d0.E(response, "Content-Type", null, 2, null);
            long jF = this.codec.f(response);
            return new lv.h(strE, jF, v.c(new b(this.codec.b(response), jF)));
        } catch (IOException e15) {
            this.eventListener.w(this.call, e15);
            t(e15);
            throw e15;
        }
    }

    public final d0.a q(boolean expectContinue) throws IOException {
        try {
            d0.a aVarG = this.codec.g(expectContinue);
            if (aVarG == null) {
                return aVarG;
            }
            aVarG.l(this);
            return aVarG;
        } catch (IOException e15) {
            this.eventListener.w(this.call, e15);
            t(e15);
            throw e15;
        }
    }

    public final void r(d0 response) {
        this.eventListener.x(this.call, response);
    }

    public final void s() {
        this.eventListener.y(this.call);
    }

    public final void u(b0 request) throws IOException {
        try {
            this.eventListener.t(this.call);
            this.codec.e(request);
            this.eventListener.s(this.call, request);
        } catch (IOException e15) {
            this.eventListener.r(this.call, e15);
            t(e15);
            throw e15;
        }
    }
}
