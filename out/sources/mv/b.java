package mv;

import fu.r;
import fv.b0;
import fv.d0;
import fv.u;
import fv.v;
import fv.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import lv.d;
import lv.i;
import lv.k;
import p071kotlin.Metadata;
import vv.j0;
import vv.k0;
import vv.l0;
import vv.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u0007#-0@'+:B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010&J\u001d\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010CR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010JR\u0018\u0010N\u001a\u000207*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u000207*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lmv/b;", "Llv/d;", "Lfv/z;", "client", "Lkv/f;", "connection", "Lvv/g;", "source", "Lvv/f;", "sink", "<init>", "(Lfv/z;Lkv/f;Lvv/g;Lvv/f;)V", "Lvv/j0;", "u", "()Lvv/j0;", "x", "", "length", "Lvv/k0;", "w", "(J)Lvv/k0;", "Lfv/v;", "url", "v", "(Lfv/v;)Lvv/k0;", "y", "()Lvv/k0;", "Lvv/o;", "timeout", "Loq/i0;", "r", "(Lvv/o;)V", "Lfv/b0;", "request", "contentLength", "a", "(Lfv/b0;J)Lvv/j0;", "cancel", "()V", "e", "(Lfv/b0;)V", "Lfv/d0;", "response", "f", "(Lfv/d0;)J", "b", "(Lfv/d0;)Lvv/k0;", "h", "c", "Lfv/u;", "headers", "", "requestLine", "A", "(Lfv/u;Ljava/lang/String;)V", "", "expectContinue", "Lfv/d0$a;", "g", "(Z)Lfv/d0$a;", "z", "(Lfv/d0;)V", "Lfv/z;", "Lkv/f;", "d", "()Lkv/f;", "Lvv/g;", "Lvv/f;", "", "I", "state", "Lmv/a;", "Lmv/a;", "headersReader", "Lfv/u;", "trailers", "t", "(Lfv/d0;)Z", "isChunked", "s", "(Lfv/b0;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z client;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kv.f connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vv.g source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final vv.f sink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mv.a headersReader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private u trailers;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmv/b$a;", "Lvv/k0;", "<init>", "(Lmv/b;)V", "Lvv/l0;", "R", "()Lvv/l0;", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "h", "()V", "Lvv/o;", "a", "Lvv/o;", "getTimeout", "()Lvv/o;", "timeout", "", "b", "Z", "()Z", "m", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private abstract class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o timeout;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a() {
            this.timeout = new o(b.this.source.getTimeout());
        }

        @Override // vv.k0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return this.timeout;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        public final void h() {
            if (b.this.state == 6) {
                return;
            }
            if (b.this.state == 5) {
                b.this.r(this.timeout);
                b.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.state);
            }
        }

        @Override // vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            try {
                return b.this.source.k3(sink, byteCount);
            } catch (IOException e15) {
                b.this.getConnection().z();
                h();
                throw e15;
            }
        }

        protected final void m(boolean z15) {
            this.closed = z15;
        }
    }

    /* JADX INFO: renamed from: mv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmv/b$b;", "Lvv/j0;", "<init>", "(Lmv/b;)V", "Lvv/l0;", "R", "()Lvv/l0;", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "Lvv/o;", "a", "Lvv/o;", "timeout", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class C3190b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o timeout;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public C3190b() {
            this.timeout = new o(b.this.sink.getTimeout());
        }

        @Override // vv.j0
        public void O3(vv.e source, long byteCount) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            b.this.sink.r3(byteCount);
            b.this.sink.k1("\r\n");
            b.this.sink.O3(source, byteCount);
            b.this.sink.k1("\r\n");
        }

        @Override // vv.j0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return this.timeout;
        }

        @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.sink.k1("0\r\n\r\n");
            b.this.r(this.timeout);
            b.this.state = 3;
        }

        @Override // vv.j0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmv/b$c;", "Lmv/b$a;", "Lmv/b;", "Lfv/v;", "url", "<init>", "(Lmv/b;Lfv/v;)V", "Loq/i0;", "p", "()V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "close", "d", "Lfv/v;", "e", "J", "bytesRemainingInChunk", "", "f", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final v url;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        public c(v vVar) {
            super();
            this.url = vVar;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void p() throws ProtocolException {
            if (this.bytesRemainingInChunk != -1) {
                b.this.source.N1();
            }
            try {
                this.bytesRemainingInChunk = b.this.source.d4();
                String string = r.u1(b.this.source.N1()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !r.V(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    b bVar = b.this;
                    bVar.trailers = bVar.headersReader.a();
                    lv.e.f(b.this.client.getCookieJar(), this.url, b.this.trailers);
                    h();
                }
            } catch (NumberFormatException e15) {
                throw new ProtocolException(e15.getMessage());
            }
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !gv.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.getConnection().z();
                h();
            }
            m(true);
        }

        @Override // mv.b.a, vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j15 = this.bytesRemainingInChunk;
            if (j15 == 0 || j15 == -1) {
                p();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long jK3 = super.k3(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (jK3 != -1) {
                this.bytesRemainingInChunk -= jK3;
                return jK3;
            }
            b.this.getConnection().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            h();
            throw protocolException;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmv/b$e;", "Lmv/b$a;", "Lmv/b;", "", "bytesRemaining", "<init>", "(Lmv/b;J)V", "Lvv/e;", "sink", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "close", "()V", "d", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        public e(long j15) {
            super();
            this.bytesRemaining = j15;
            if (j15 == 0) {
                h();
            }
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !gv.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.getConnection().z();
                h();
            }
            m(true);
        }

        @Override // mv.b.a, vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j15 = this.bytesRemaining;
            if (j15 == 0) {
                return -1L;
            }
            long jK3 = super.k3(sink, Math.min(j15, byteCount));
            if (jK3 == -1) {
                b.this.getConnection().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h();
                throw protocolException;
            }
            long j16 = this.bytesRemaining - jK3;
            this.bytesRemaining = j16;
            if (j16 == 0) {
                h();
            }
            return jK3;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmv/b$f;", "Lvv/j0;", "<init>", "(Lmv/b;)V", "Lvv/l0;", "R", "()Lvv/l0;", "Lvv/e;", "source", "", "byteCount", "Loq/i0;", "O3", "(Lvv/e;J)V", "flush", "()V", "close", "Lvv/o;", "a", "Lvv/o;", "timeout", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class f implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o timeout;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public f() {
            this.timeout = new o(b.this.sink.getTimeout());
        }

        @Override // vv.j0
        public void O3(vv.e source, long byteCount) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            gv.d.l(source.getSize(), 0L, byteCount);
            b.this.sink.O3(source, byteCount);
        }

        @Override // vv.j0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return this.timeout;
        }

        @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.r(this.timeout);
            b.this.state = 3;
        }

        @Override // vv.j0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmv/b$g;", "Lmv/b$a;", "Lmv/b;", "<init>", "(Lmv/b;)V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Loq/i0;", "close", "()V", "", "d", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        public g() {
            super();
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                h();
            }
            m(true);
        }

        @Override // mv.b.a, vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long jK3 = super.k3(sink, byteCount);
            if (jK3 != -1) {
                return jK3;
            }
            this.inputExhausted = true;
            h();
            return -1L;
        }
    }

    public b(z zVar, kv.f fVar, vv.g gVar, vv.f fVar2) {
        this.client = zVar;
        this.connection = fVar;
        this.source = gVar;
        this.sink = fVar2;
        this.headersReader = new mv.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(o timeout) {
        l0 delegate = timeout.getDelegate();
        timeout.j(l0.f208410e);
        delegate.a();
        delegate.b();
    }

    private final boolean s(b0 b0Var) {
        return r.G("chunked", b0Var.d("Transfer-Encoding"), true);
    }

    private final boolean t(d0 d0Var) {
        return r.G("chunked", d0.E(d0Var, "Transfer-Encoding", null, 2, null), true);
    }

    private final j0 u() {
        if (this.state == 1) {
            this.state = 2;
            return new C3190b();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final k0 v(v url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final k0 w(long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final j0 x() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final k0 y() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final void A(u headers, String requestLine) {
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.k1(requestLine).k1("\r\n");
        int size = headers.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.sink.k1(headers.f(i15)).k1(": ").k1(headers.k(i15)).k1("\r\n");
        }
        this.sink.k1("\r\n");
        this.state = 1;
    }

    @Override // lv.d
    public j0 a(b0 request, long contentLength) throws ProtocolException {
        if (request.getBody() != null && request.getBody().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (contentLength != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // lv.d
    public k0 b(d0 response) {
        if (!lv.e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.getRequest().getUrl());
        }
        long jV = gv.d.v(response);
        return jV != -1 ? w(jV) : y();
    }

    @Override // lv.d
    public void c() {
        this.sink.flush();
    }

    @Override // lv.d
    public void cancel() {
        getConnection().e();
    }

    @Override // lv.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public kv.f getConnection() {
        return this.connection;
    }

    @Override // lv.d
    public void e(b0 request) {
        A(request.getHeaders(), i.f120567a.a(request, getConnection().getRoute().getProxy().type()));
    }

    @Override // lv.d
    public long f(d0 response) {
        if (!lv.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return gv.d.v(response);
    }

    @Override // lv.d
    public d0.a g(boolean expectContinue) throws IOException {
        int i15 = this.state;
        if (i15 != 1 && i15 != 2 && i15 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            k kVarA = k.INSTANCE.a(this.headersReader.b());
            d0.a aVarK = new d0.a().p(kVarA.protocol).g(kVarA.code).m(kVarA.message).k(this.headersReader.a());
            if (expectContinue && kVarA.code == 100) {
                return null;
            }
            int i16 = kVarA.code;
            if (i16 == 100) {
                this.state = 3;
                return aVarK;
            }
            if (102 > i16 || i16 >= 200) {
                this.state = 4;
                return aVarK;
            }
            this.state = 3;
            return aVarK;
        } catch (EOFException e15) {
            throw new IOException("unexpected end of stream on " + getConnection().getRoute().getAddress().getUrl().p(), e15);
        }
    }

    @Override // lv.d
    public void h() {
        this.sink.flush();
    }

    public final void z(d0 response) {
        long jV = gv.d.v(response);
        if (jV == -1) {
            return;
        }
        k0 k0VarW = w(jV);
        gv.d.L(k0VarW, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        k0VarW.close();
    }
}
