package vv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.bouncycastle.crypto.hpke.HPKE;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0007R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lvv/p;", "Lvv/k0;", "source", "<init>", "(Lvv/k0;)V", "Loq/i0;", "h", "()V", "m", "Lvv/e;", "buffer", "", "offset", "byteCount", "p", "(Lvv/e;JJ)V", "", "name", "", "expected", "actual", "b", "(Ljava/lang/String;II)V", "sink", "k3", "(Lvv/e;J)J", "Lvv/l0;", "R", "()Lvv/l0;", "close", "", "a", "B", "section", "Lvv/f0;", "Lvv/f0;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "c", "Ljava/util/zip/Inflater;", "inflater", "Lvv/q;", "d", "Lvv/q;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private byte section;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final buffer source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q inflaterSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CRC32 crc;

    public p(k0 k0Var) {
        buffer f0Var = new buffer(k0Var);
        this.source = f0Var;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new q((g) f0Var, inflater);
        this.crc = new CRC32();
    }

    private final void b(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        throw new IOException(name + ": actual 0x" + fu.r.E0(b.j(actual), 8, '0') + " != expected 0x" + fu.r.E0(b.j(expected), 8, '0'));
    }

    private final void h() throws IOException {
        this.source.g2(10L);
        byte bI = this.source.bufferField.I(3L);
        boolean z15 = ((bI >> 1) & 1) == 1;
        if (z15) {
            p(this.source.bufferField, 0L, 10L);
        }
        b("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bI >> 2) & 1) == 1) {
            this.source.g2(2L);
            if (z15) {
                p(this.source.bufferField, 0L, 2L);
            }
            long jW1 = this.source.bufferField.W1() & HPKE.aead_EXPORT_ONLY;
            this.source.g2(jW1);
            if (z15) {
                p(this.source.bufferField, 0L, jW1);
            }
            this.source.skip(jW1);
        }
        if (((bI >> 3) & 1) == 1) {
            long jB = this.source.b((byte) 0);
            if (jB == -1) {
                throw new EOFException();
            }
            if (z15) {
                p(this.source.bufferField, 0L, jB + 1);
            }
            this.source.skip(jB + 1);
        }
        if (((bI >> 4) & 1) == 1) {
            long jB2 = this.source.b((byte) 0);
            if (jB2 == -1) {
                throw new EOFException();
            }
            if (z15) {
                p(this.source.bufferField, 0L, jB2 + 1);
            }
            this.source.skip(jB2 + 1);
        }
        if (z15) {
            b("FHCRC", this.source.W1(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private final void m() throws IOException {
        b("CRC", this.source.B3(), (int) this.crc.getValue());
        b("ISIZE", this.source.B3(), (int) this.inflater.getBytesWritten());
    }

    private final void p(e buffer, long offset, long byteCount) {
        g0 g0Var = buffer.head;
        while (true) {
            int i15 = g0Var.limit;
            int i16 = g0Var.pos;
            if (offset < i15 - i16) {
                break;
            }
            offset -= (long) (i15 - i16);
            g0Var = g0Var.next;
        }
        while (byteCount > 0) {
            int i17 = (int) (((long) g0Var.pos) + offset);
            int iMin = (int) Math.min(g0Var.limit - i17, byteCount);
            this.crc.update(g0Var.data, i17, iMin);
            byteCount -= (long) iMin;
            g0Var = g0Var.next;
            offset = 0;
        }
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R */
    public l0 getTimeout() {
        return this.source.getTimeout();
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) throws IOException {
        p pVar;
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            h();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long jK3 = this.inflaterSource.k3(sink, byteCount);
            if (jK3 != -1) {
                p(sink, size, jK3);
                return jK3;
            }
            pVar = this;
            pVar.section = (byte) 2;
        } else {
            pVar = this;
        }
        if (pVar.section == 2) {
            m();
            pVar.section = (byte) 3;
            if (!pVar.source.K2()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
