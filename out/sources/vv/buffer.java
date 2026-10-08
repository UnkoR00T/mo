package vv;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vv.f0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020.2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020.2\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00100J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u001eH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001eH\u0016¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010AJ\u0017\u0010C\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010\u0013J\u0017\u0010D\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0016H\u0016¢\u0006\u0004\bD\u0010EJ'\u0010H\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0019H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010NJ'\u0010O\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\n2\u0006\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0019H\u0016¢\u0006\u0004\bR\u0010LJ\u001f\u0010S\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010NJ\u000f\u0010T\u001a\u00020\u0001H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000eH\u0016¢\u0006\u0004\bY\u0010\u0010J\u000f\u0010Z\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020.H\u0016¢\u0006\u0004\b_\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010bR\u0016\u0010f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bh\u0010[\u001a\u0004\bg\u0010\b¨\u0006j"}, d2 = {"Lvv/f0;", "Lvv/g;", "Lvv/k0;", "source", "<init>", "(Lvv/k0;)V", "Lvv/e;", "y0", "()Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "", "K2", "()Z", "Loq/i0;", "g2", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lvv/h;", "r2", "(J)Lvv/h;", "Lvv/z;", "options", "", "c1", "(Lvv/z;)I", "", "F2", "()[B", "R1", "(J)[B", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "h2", "(Lvv/e;J)V", "Lvv/j0;", "A0", "(Lvv/j0;)J", "", "n2", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "n3", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "N1", "()Ljava/lang/String;", "limit", "U0", "", "readShort", "()S", "W1", "readInt", "()I", "B3", "Y1", "()J", "d4", "skip", "b", "(B)J", "fromIndex", "toIndex", "h", "(BJJ)J", "bytes", "P0", "(Lvv/h;)J", "m", "(Lvv/h;J)J", "p", "(Lvv/h;JJ)J", "targetBytes", "v0", "r", "peek", "()Lvv/g;", "Ljava/io/InputStream;", "f4", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lvv/l0;", "R", "()Lvv/l0;", "toString", "a", "Lvv/k0;", "Lvv/e;", "bufferField", "c", "Z", "closed", "v", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buffer implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final k0 source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e bufferField = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(k0 k0Var) {
        this.source = k0Var;
    }

    @Override // vv.g
    public long A0(j0 sink) {
        long j15 = 0;
        while (this.source.k3(this.bufferField, 8192L) != -1) {
            long jP = this.bufferField.p();
            if (jP > 0) {
                j15 += jP;
                sink.O3(this.bufferField, jP);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j15;
        }
        long size = j15 + this.bufferField.getSize();
        e eVar = this.bufferField;
        sink.O3(eVar, eVar.getSize());
        return size;
    }

    @Override // vv.g
    public int B3() {
        g2(4L);
        return this.bufferField.B3();
    }

    @Override // vv.g
    public byte[] F2() {
        this.bufferField.U1(this.source);
        return this.bufferField.F2();
    }

    @Override // vv.g
    public boolean K2() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.K2() && this.source.k3(this.bufferField, 8192L) == -1;
    }

    @Override // vv.g
    public String N1() {
        return U0(Long.MAX_VALUE);
    }

    @Override // vv.g
    public long P0(h bytes) {
        return m(bytes, 0L);
    }

    @Override // vv.k0
    /* JADX INFO: renamed from: R */
    public l0 getTimeout() {
        return this.source.getTimeout();
    }

    @Override // vv.g
    public byte[] R1(long byteCount) {
        g2(byteCount);
        return this.bufferField.R1(byteCount);
    }

    @Override // vv.g
    public String U0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j15 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jH = h((byte) 10, 0L, j15);
        if (jH != -1) {
            return wv.a.g(this.bufferField, jH);
        }
        if (j15 < Long.MAX_VALUE && request(j15) && this.bufferField.I(j15 - 1) == 13 && request(j15 + 1) && this.bufferField.I(j15) == 10) {
            return wv.a.g(this.bufferField, j15);
        }
        e eVar = new e();
        e eVar2 = this.bufferField;
        eVar2.H(eVar, 0L, Math.min(32, eVar2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + eVar.d0().t() + (char) 8230);
    }

    @Override // vv.g
    public short W1() {
        g2(2L);
        return this.bufferField.W1();
    }

    @Override // vv.g
    public long Y1() {
        g2(8L);
        return this.bufferField.Y1();
    }

    public long b(byte b15) {
        return h(b15, 0L, Long.MAX_VALUE);
    }

    @Override // vv.g
    public int c1(z options) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iH = wv.a.h(this.bufferField, options, true);
            if (iH != -2) {
                if (iH == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iH].Q());
                return iH;
            }
        } while (this.source.k3(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.b();
    }

    @Override // vv.g
    public long d4() {
        g2(1L);
        int i15 = 0;
        while (true) {
            int i16 = i15 + 1;
            if (!request(i16)) {
                break;
            }
            byte bI = this.bufferField.I(i15);
            if ((bI < 48 || bI > 57) && ((bI < 97 || bI > 102) && (bI < 65 || bI > 70))) {
                if (i15 != 0) {
                    break;
                }
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toString(bI, fu.a.a(16)));
            }
            i15 = i16;
        }
        return this.bufferField.d4();
    }

    @Override // vv.g
    public InputStream f4() {
        return new a();
    }

    @Override // vv.g
    public void g2(long byteCount) {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    public long h(byte b15, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b16 = b15;
            long j15 = toIndex;
            long J = this.bufferField.J(b16, jMax, j15);
            if (J != -1) {
                return J;
            }
            long size = this.bufferField.getSize();
            if (size >= j15 || this.source.k3(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b15 = b16;
            toIndex = j15;
        }
        return -1L;
    }

    @Override // vv.g
    public void h2(e sink, long byteCount) throws EOFException {
        try {
            g2(byteCount);
            this.bufferField.h2(sink, byteCount);
        } catch (EOFException e15) {
            sink.U1(this.bufferField);
            throw e15;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // vv.k0
    public long k3(e sink, long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.k3(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.k3(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    public long m(h bytes, long fromIndex) {
        return p(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // vv.g
    public String n2(long byteCount) {
        g2(byteCount);
        return this.bufferField.n2(byteCount);
    }

    @Override // vv.g
    public String n3(Charset charset) {
        this.bufferField.U1(this.source);
        return this.bufferField.n3(charset);
    }

    public long p(h bytes, long fromIndex, long toIndex) {
        return wv.f.b(this, bytes, 0, 0, fromIndex, toIndex, 6, null);
    }

    @Override // vv.g
    public g peek() {
        return v.c(new c0(this));
    }

    public long r(h targetBytes, long fromIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jO = this.bufferField.O(targetBytes, fromIndex);
            if (jO != -1) {
                return jO;
            }
            long size = this.bufferField.getSize();
            if (this.source.k3(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // vv.g
    public h r2(long byteCount) {
        g2(byteCount);
        return this.bufferField.r2(byteCount);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        if (this.bufferField.getSize() == 0 && this.source.k3(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // vv.g
    public byte readByte() {
        g2(1L);
        return this.bufferField.readByte();
    }

    @Override // vv.g
    public int readInt() {
        g2(4L);
        return this.bufferField.readInt();
    }

    @Override // vv.g
    public short readShort() {
        g2(2L);
        return this.bufferField.readShort();
    }

    @Override // vv.g
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.k3(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // vv.g
    public void skip(long byteCount) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.k3(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // vv.g, vv.f
    /* JADX INFO: renamed from: v, reason: from getter */
    public e getBufferField() {
        return this.bufferField;
    }

    @Override // vv.g
    public long v0(h targetBytes) {
        return r(targetBytes, 0L);
    }

    @Override // vv.g
    public e y0() {
        return this.bufferField;
    }

    /* JADX INFO: renamed from: vv.f0$a */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"vv/f0$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "Loq/i0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            buffer.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.k3(bufferVar2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) throws IOException {
            if (buffer.this.closed) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.k3(bufferVar.bufferField, 8192L) == -1) {
                        return size;
                    }
                }
                size += buffer.this.bufferField.getSize();
                e.R2(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            if (!buffer.this.closed) {
                b.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.k3(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }
}
