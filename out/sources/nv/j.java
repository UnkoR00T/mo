package nv;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001AB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0010J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b,\u0010\u0014J%\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u0010\u000eJ-\u0010;\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010\u0010J+\u0010?\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0014\u0010F\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u001eR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010CR\u0017\u0010P\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lnv/j;", "Ljava/io/Closeable;", "Lvv/f;", "sink", "", "client", "<init>", "(Lvv/f;Z)V", "", "streamId", "", "byteCount", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(IJ)V", "h", "()V", "Lnv/m;", "peerSettings", "b", "(Lnv/m;)V", "promisedStreamId", "", "Lnv/c;", "requestHeaders", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(IILjava/util/List;)V", "flush", "Lnv/b;", "errorCode", "I", "(ILnv/b;)V", "C", "()I", "outFinished", "Lvv/e;", "source", "m", "(ZILvv/e;I)V", "flags", "buffer", "p", "(IILvv/e;I)V", "settings", "J", "ack", "payload1", "payload2", "E", "(ZII)V", "lastGoodStreamId", "", "debugData", "u", "(ILnv/b;[B)V", "windowSizeIncrement", "K", "length", "type", "r", "(IIII)V", "close", "headerBlock", "y", "(ZILjava/util/List;)V", "a", "Lvv/f;", "Z", "c", "Lvv/e;", "hpackBuffer", "d", "maxFrameSize", "e", "closed", "Lnv/d$b;", "f", "Lnv/d$b;", "getHpackWriter", "()Lnv/d$b;", "hpackWriter", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f139068h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vv.f sink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vv.e hpackBuffer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int maxFrameSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d.b hpackWriter;

    public j(vv.f fVar, boolean z15) {
        this.sink = fVar;
        this.client = z15;
        vv.e eVar = new vv.e();
        this.hpackBuffer = eVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new d.b(0, false, eVar, 3, null);
    }

    private final void L(int streamId, long byteCount) {
        while (byteCount > 0) {
            long jMin = Math.min(this.maxFrameSize, byteCount);
            byteCount -= jMin;
            r(streamId, (int) jMin, 9, byteCount == 0 ? 4 : 0);
            this.sink.O3(this.hpackBuffer, jMin);
        }
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final synchronized void E(boolean ack, int payload1, int payload2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        r(0, 8, 6, ack ? 1 : 0);
        this.sink.writeInt(payload1);
        this.sink.writeInt(payload2);
        this.sink.flush();
    }

    public final synchronized void H(int streamId, int promisedStreamId, List<c> requestHeaders) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(requestHeaders);
        long size = this.hpackBuffer.getSize();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j15 = iMin;
        r(streamId, iMin + 4, 5, size == j15 ? 4 : 0);
        this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
        this.sink.O3(this.hpackBuffer, j15);
        if (size > j15) {
            L(streamId, size - j15);
        }
    }

    public final synchronized void I(int streamId, b errorCode) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        r(streamId, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void J(m settings) {
        int i15;
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            int i16 = 0;
            r(0, settings.i() * 6, 4, 0);
            while (i16 < 10) {
                if (settings.f(i16)) {
                    if (i16 != 4) {
                        i15 = i16 != 7 ? i16 : 4;
                    } else {
                        i15 = 3;
                    }
                    this.sink.writeShort(i15);
                    this.sink.writeInt(settings.a(i16));
                }
                i16++;
            }
            this.sink.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void K(int streamId, long windowSizeIncrement) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (windowSizeIncrement == 0 || windowSizeIncrement > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
        }
        r(streamId, 4, 8, 0);
        this.sink.writeInt((int) windowSizeIncrement);
        this.sink.flush();
    }

    public final synchronized void b(m peerSettings) {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.e(this.maxFrameSize);
            if (peerSettings.b() != -1) {
                this.hpackWriter.e(peerSettings.b());
            }
            r(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final synchronized void h() {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger = f139068h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(gv.d.t(">> CONNECTION " + e.CONNECTION_PREFACE.t(), new Object[0]));
                }
                this.sink.M0(e.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void m(boolean outFinished, int streamId, vv.e source, int byteCount) {
        if (this.closed) {
            throw new IOException("closed");
        }
        p(streamId, outFinished ? 1 : 0, source, byteCount);
    }

    public final void p(int streamId, int flags, vv.e buffer, int byteCount) {
        r(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            this.sink.O3(buffer, byteCount);
        }
    }

    public final void r(int streamId, int length, int type, int flags) {
        int i15;
        int i16;
        int i17;
        int i18;
        Logger logger = f139068h;
        if (logger.isLoggable(Level.FINE)) {
            i15 = streamId;
            i16 = length;
            i17 = type;
            i18 = flags;
            logger.fine(e.f138943a.c(false, i15, i16, i17, i18));
        } else {
            i15 = streamId;
            i16 = length;
            i17 = type;
            i18 = flags;
        }
        if (i16 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i16).toString());
        }
        if ((Integer.MIN_VALUE & i15) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i15).toString());
        }
        gv.d.Z(this.sink, i16);
        this.sink.writeByte(i17 & GF2Field.MASK);
        this.sink.writeByte(i18 & GF2Field.MASK);
        this.sink.writeInt(Integer.MAX_VALUE & i15);
    }

    public final synchronized void u(int lastGoodStreamId, b errorCode, byte[] debugData) {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            r(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(lastGoodStreamId);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized void y(boolean outFinished, int streamId, List<c> headerBlock) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.g(headerBlock);
        long size = this.hpackBuffer.getSize();
        long jMin = Math.min(this.maxFrameSize, size);
        int i15 = size == jMin ? 4 : 0;
        if (outFinished) {
            i15 |= 1;
        }
        r(streamId, (int) jMin, 1, i15);
        this.sink.O3(this.hpackBuffer, jMin);
        if (size > jMin) {
            L(streamId, size - jMin);
        }
    }
}
