package vv;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H$¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0013H$¢\u0006\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010-\u001a\u00060'j\u0002`(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lvv/i;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "readWrite", "<init>", "(Z)V", "", "fileOffset", "Lvv/e;", "sink", "byteCount", "E", "(JLvv/e;J)J", "size", "()J", "Lvv/k0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(J)Lvv/k0;", "Loq/i0;", "close", "()V", "", "array", "", "arrayOffset", "y", "(J[BII)I", "C", "u", "a", "Z", "getReadWrite", "()Z", "b", "closed", "c", "I", "openStreamCount", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "d", "Ljava/util/concurrent/locks/ReentrantLock;", "r", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean readWrite;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int openStreamCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock = o0.b();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lvv/i$a;", "Lvv/k0;", "Lvv/i;", "fileHandle", "", "position", "<init>", "(Lvv/i;J)V", "Lvv/e;", "sink", "byteCount", "k3", "(Lvv/e;J)J", "Lvv/l0;", "R", "()Lvv/l0;", "Loq/i0;", "close", "()V", "a", "Lvv/i;", "getFileHandle", "()Lvv/i;", "b", "J", "getPosition", "()J", "setPosition", "(J)V", "", "c", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final i fileHandle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long position;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public a(i iVar, long j15) {
            this.fileHandle = iVar;
            this.position = j15;
        }

        @Override // vv.k0
        public l0 R() {
            return l0.f208410e;
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                this.fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    oq.i0 i0Var = oq.i0.f148189a;
                    lock.unlock();
                    this.fileHandle.u();
                    return;
                }
                lock.unlock();
            } catch (Throwable th4) {
                lock.unlock();
                throw th4;
            }
        }

        @Override // vv.k0
        public long k3(e sink, long byteCount) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long jE = this.fileHandle.E(this.position, sink, byteCount);
            if (jE != -1) {
                this.position += jE;
            }
            return jE;
        }
    }

    public i(boolean z15) {
        this.readWrite = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E(long fileOffset, e sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        long j15 = byteCount + fileOffset;
        long j16 = fileOffset;
        while (j16 < j15) {
            g0 g0VarT1 = sink.T1(1);
            byte[] bArr = g0VarT1.data;
            int i15 = g0VarT1.limit;
            int iY = y(j16, bArr, i15, (int) Math.min(j15 - j16, 8192 - i15));
            if (iY == -1) {
                if (g0VarT1.pos == g0VarT1.limit) {
                    sink.head = g0VarT1.b();
                    h0.b(g0VarT1);
                }
                if (fileOffset != j16) {
                    break;
                }
                return -1L;
            }
            g0VarT1.limit += iY;
            long j17 = iY;
            j16 += j17;
            sink.i1(sink.getSize() + j17);
        }
        return j16 - fileOffset;
    }

    protected abstract long C();

    public final k0 H(long fileOffset) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                reentrantLock.unlock();
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                reentrantLock.unlock();
                return;
            }
            oq.i0 i0Var = oq.i0.f148189a;
            reentrantLock.unlock();
            u();
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            oq.i0 i0Var = oq.i0.f148189a;
            reentrantLock.unlock();
            return C();
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    protected abstract void u();

    protected abstract int y(long fileOffset, byte[] array, int arrayOffset, int byteCount);
}
