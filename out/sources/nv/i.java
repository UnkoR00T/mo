package nv;

import fv.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import oq.i0;
import p071kotlin.Metadata;
import vv.j0;
import vv.k0;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 T2\u00020\u0001:\u0004.*0\u001eB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R*\u0010=\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010/R*\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010/R*\u0010C\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00060MR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010V\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010]\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b\\\u0010ZR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010^\u001a\u0004\bJ\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bN\u0010b\"\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006j"}, d2 = {"Lnv/i;", "", "", "id", "Lnv/f;", "connection", "", "outFinished", "inFinished", "Lfv/u;", "headers", "<init>", "(ILnv/f;ZZLfv/u;)V", "Lnv/b;", "errorCode", "Ljava/io/IOException;", "errorException", "e", "(Lnv/b;Ljava/io/IOException;)Z", "C", "()Lfv/u;", "Lvv/l0;", "v", "()Lvv/l0;", "E", "Lvv/j0;", "n", "()Lvv/j0;", "rstStatusCode", "Loq/i0;", "d", "(Lnv/b;Ljava/io/IOException;)V", "f", "(Lnv/b;)V", "Lvv/g;", "source", "length", "w", "(Lvv/g;I)V", "x", "(Lfv/u;Z)V", "y", "b", "()V", "", "delta", "a", "(J)V", "c", ip.a.f96138c, "I", "j", "()I", "Lnv/f;", "g", "()Lnv/f;", "<set-?>", "J", "l", "()J", "A", "readBytesTotal", "k", "z", "readBytesAcknowledged", "r", "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "h", "Z", "hasResponseHeaders", "Lnv/i$c;", "i", "Lnv/i$c;", "p", "()Lnv/i$c;", "Lnv/i$b;", "Lnv/i$b;", "o", "()Lnv/i$b;", "sink", "Lnv/i$d;", "Lnv/i$d;", "m", "()Lnv/i$d;", "readTimeout", "s", "writeTimeout", "Lnv/b;", "()Lnv/b;", "setErrorCode$okhttp", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f connection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<u> headersQueue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasResponseHeaders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c source;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b sink;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d readTimeout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d writeTimeout;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private nv.b errorCode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private IOException errorException;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\tR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\t¨\u0006)"}, d2 = {"Lnv/i$b;", "Lvv/j0;", "", "finished", "<init>", "(Lnv/i;Z)V", "outFinishedOnLastFrame", "Loq/i0;", "b", "(Z)V", "Lvv/e;", "source", "", "byteCount", "O3", "(Lvv/e;J)V", "flush", "()V", "Lvv/l0;", "R", "()Lvv/l0;", "close", "a", "Z", "m", "()Z", "setFinished", "Lvv/e;", "sendBuffer", "Lfv/u;", "c", "Lfv/u;", "getTrailers", "()Lfv/u;", "setTrailers", "(Lfv/u;)V", "trailers", "d", "h", "setClosed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final vv.e sendBuffer = new vv.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private u trailers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public b(boolean z15) {
            this.finished = z15;
        }

        private final void b(boolean outFinishedOnLastFrame) throws IOException {
            long jMin;
            boolean z15;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.getWriteTimeout().s();
                    while (iVar.getWriteBytesTotal() >= iVar.getWriteBytesMaximum() && !this.finished && !this.closed && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (Throwable th4) {
                            iVar.getWriteTimeout().C();
                            throw th4;
                        }
                    }
                    iVar.getWriteTimeout().C();
                    iVar.c();
                    jMin = Math.min(iVar.getWriteBytesMaximum() - iVar.getWriteBytesTotal(), this.sendBuffer.getSize());
                    iVar.B(iVar.getWriteBytesTotal() + jMin);
                    z15 = outFinishedOnLastFrame && jMin == this.sendBuffer.getSize();
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            i.this.getWriteTimeout().s();
            try {
                i.this.getConnection().t2(i.this.getId(), z15, this.sendBuffer, jMin);
            } finally {
                i.this.getWriteTimeout().C();
            }
        }

        @Override // vv.j0
        public void O3(vv.e source, long byteCount) throws IOException {
            i iVar = i.this;
            if (!gv.d.f77110h || !Thread.holdsLock(iVar)) {
                this.sendBuffer.O3(source, byteCount);
                while (this.sendBuffer.getSize() >= 16384) {
                    b(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }

        @Override // vv.j0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return i.this.getWriteTimeout();
        }

        @Override // vv.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (gv.d.f77110h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                if (this.closed) {
                    return;
                }
                boolean z15 = iVar2.h() == null;
                i0 i0Var = i0.f148189a;
                if (!i.this.getSink().finished) {
                    boolean z16 = this.sendBuffer.getSize() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.getSize() > 0) {
                            b(false);
                        }
                        i.this.getConnection().v2(i.this.getId(), z15, gv.d.O(this.trailers));
                    } else if (z16) {
                        while (this.sendBuffer.getSize() > 0) {
                            b(true);
                        }
                    } else if (z15) {
                        i.this.getConnection().t2(i.this.getId(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.closed = true;
                    i0 i0Var2 = i0.f148189a;
                }
                i.this.getConnection().flush();
                i.this.b();
            }
        }

        @Override // vv.j0, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (gv.d.f77110h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                iVar2.c();
                i0 i0Var = i0.f148189a;
            }
            while (this.sendBuffer.getSize() > 0) {
                b(false);
                i.this.getConnection().flush();
            }
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b3\u0010!¨\u00065"}, d2 = {"Lnv/i$c;", "Lvv/k0;", "", "maxByteCount", "", "finished", "<init>", "(Lnv/i;JZ)V", "read", "Loq/i0;", "u", "(J)V", "Lvv/e;", "sink", "byteCount", "k3", "(Lvv/e;J)J", "Lvv/g;", "source", "m", "(Lvv/g;J)V", "Lvv/l0;", "R", "()Lvv/l0;", "close", "()V", "a", "J", "b", "Z", "h", "()Z", "p", "(Z)V", "c", "Lvv/e;", "getReceiveBuffer", "()Lvv/e;", "receiveBuffer", "d", "getReadBuffer", "readBuffer", "Lfv/u;", "e", "Lfv/u;", "getTrailers", "()Lfv/u;", "r", "(Lfv/u;)V", "trailers", "f", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long maxByteCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean finished;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final vv.e receiveBuffer = new vv.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final vv.e readBuffer = new vv.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private u trailers;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public c(long j15, boolean z15) {
            this.maxByteCount = j15;
            this.finished = z15;
        }

        private final void u(long read) {
            i iVar = i.this;
            if (!gv.d.f77110h || !Thread.holdsLock(iVar)) {
                i.this.getConnection().j2(read);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        @Override // vv.k0
        /* JADX INFO: renamed from: R */
        public l0 getTimeout() {
            return i.this.getReadTimeout();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            i iVar = i.this;
            synchronized (iVar) {
                this.closed = true;
                size = this.readBuffer.getSize();
                this.readBuffer.b();
                iVar.notifyAll();
                i0 i0Var = i0.f148189a;
            }
            if (size > 0) {
                u(size);
            }
            i.this.b();
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @Override // vv.k0
        public long k3(vv.e sink, long byteCount) throws IOException {
            IOException errorException;
            boolean z15;
            long jK3;
            long j15 = 0;
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.getReadTimeout().s();
                    try {
                        if (iVar.h() == null || this.finished) {
                            errorException = null;
                        } else {
                            errorException = iVar.getErrorException();
                            if (errorException == null) {
                                errorException = new n(iVar.h());
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        z15 = false;
                        if (this.readBuffer.getSize() > j15) {
                            vv.e eVar = this.readBuffer;
                            jK3 = eVar.k3(sink, Math.min(byteCount, eVar.getSize()));
                            iVar.A(iVar.getReadBytesTotal() + jK3);
                            long readBytesTotal = iVar.getReadBytesTotal() - iVar.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= iVar.getConnection().getOkHttpSettings().c() / 2) {
                                iVar.getConnection().N2(iVar.getId(), readBytesTotal);
                                iVar.z(iVar.getReadBytesTotal());
                            }
                        } else {
                            if (!this.finished && errorException == null) {
                                iVar.D();
                                z15 = true;
                            }
                            jK3 = -1;
                        }
                        iVar.getReadTimeout().C();
                        i0 i0Var = i0.f148189a;
                    } catch (Throwable th4) {
                        iVar.getReadTimeout().C();
                        throw th4;
                    }
                }
                if (!z15) {
                    if (jK3 != -1) {
                        return jK3;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    throw errorException;
                }
                j15 = 0;
            }
        }

        public final void m(vv.g source, long byteCount) throws EOFException {
            boolean z15;
            boolean z16;
            i iVar = i.this;
            if (gv.d.f77110h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j15 = byteCount;
            while (j15 > 0) {
                synchronized (i.this) {
                    z15 = this.finished;
                    z16 = this.readBuffer.getSize() + j15 > this.maxByteCount;
                    i0 i0Var = i0.f148189a;
                }
                if (z16) {
                    source.skip(j15);
                    i.this.f(nv.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z15) {
                    source.skip(j15);
                    return;
                }
                long jK3 = source.k3(this.receiveBuffer, j15);
                if (jK3 == -1) {
                    throw new EOFException();
                }
                j15 -= jK3;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.closed) {
                            this.receiveBuffer.b();
                        } else {
                            boolean z17 = this.readBuffer.getSize() == 0;
                            this.readBuffer.U1(this.receiveBuffer);
                            if (z17) {
                                iVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            u(byteCount);
        }

        public final void p(boolean z15) {
            this.finished = z15;
        }

        public final void r(u uVar) {
            this.trailers = uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lnv/i$d;", "Lvv/c;", "<init>", "(Lnv/i;)V", "Loq/i0;", "B", "()V", "Ljava/io/IOException;", "cause", "v", "(Ljava/io/IOException;)Ljava/io/IOException;", "C", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d extends vv.c {
        public d() {
        }

        @Override // vv.c
        protected void B() {
            i.this.f(nv.b.CANCEL);
            i.this.getConnection().P1();
        }

        public final void C() throws IOException {
            if (t()) {
                throw v(null);
            }
        }

        @Override // vv.c
        protected IOException v(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }
    }

    public i(int i15, f fVar, boolean z15, boolean z16, u uVar) {
        this.id = i15;
        this.connection = fVar;
        this.writeBytesMaximum = fVar.getPeerSettings().c();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new c(fVar.getOkHttpSettings().c(), z16);
        this.sink = new b(z15);
        this.readTimeout = new d();
        this.writeTimeout = new d();
        if (uVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(uVar);
        }
    }

    private final boolean e(nv.b errorCode, IOException errorException) {
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            i0 i0Var = i0.f148189a;
            this.connection.K1(this.id);
            return true;
        }
    }

    public final void A(long j15) {
        this.readBytesTotal = j15;
    }

    public final void B(long j15) {
        this.writeBytesTotal = j15;
    }

    public final synchronized u C() {
        this.readTimeout.s();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                D();
            } catch (Throwable th4) {
                this.readTimeout.C();
                throw th4;
            }
        }
        this.readTimeout.C();
        if (this.headersQueue.isEmpty()) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            throw new n(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final l0 E() {
        return this.writeTimeout;
    }

    public final void a(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z15;
        boolean zU;
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z15 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
                zU = u();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            d(nv.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.connection.K1(this.id);
        }
    }

    public final void c() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException == null) {
                throw new n(this.errorCode);
            }
        }
    }

    public final void d(nv.b rstStatusCode, IOException errorException) {
        if (e(rstStatusCode, errorException)) {
            this.connection.A2(this.id, rstStatusCode);
        }
    }

    public final void f(nv.b errorCode) {
        if (e(errorCode, null)) {
            this.connection.I2(this.id, errorCode);
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getConnection() {
        return this.connection;
    }

    public final synchronized nv.b h() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d getReadTimeout() {
        return this.readTimeout;
    }

    public final j0 n() {
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return this.sink;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final b getSink() {
        return this.sink;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final d getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean t() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() || this.source.getClosed()) {
                if ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final l0 v() {
        return this.readTimeout;
    }

    public final void w(vv.g source, int length) {
        if (!gv.d.f77110h || !Thread.holdsLock(this)) {
            this.source.m(source, length);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(u headers, boolean inFinished) {
        boolean zU;
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && inFinished) {
                    this.source.r(headers);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add(headers);
                }
                if (inFinished) {
                    this.source.p(true);
                }
                zU = u();
                notifyAll();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (zU) {
            return;
        }
        this.connection.K1(this.id);
    }

    public final synchronized void y(nv.b errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void z(long j15) {
        this.readBytesAcknowledged = j15;
    }
}
