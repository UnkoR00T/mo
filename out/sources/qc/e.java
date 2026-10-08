package qc;

import java.nio.ByteBuffer;
import p071kotlin.Metadata;
import vv.k0;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "Lvv/k0;", "a", "(Ljava/nio/ByteBuffer;)Lvv/k0;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"qc/e$a", "Lvv/k0;", "Loq/i0;", "close", "()V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Lvv/l0;", "R", "()Lvv/l0;", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "a", "Ljava/nio/ByteBuffer;", "buffer", "", "b", "I", "len", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ByteBuffer buffer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int len;

        a(ByteBuffer byteBuffer) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            this.buffer = byteBufferSlice;
            this.len = byteBufferSlice.capacity();
        }

        @Override // vv.k0
        /* JADX INFO: renamed from: R */
        public l0 getF208341a() {
            return l0.f208410e;
        }

        @Override // vv.k0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // vv.k0
        public long k3(vv.e sink, long byteCount) {
            if (this.buffer.position() == this.len) {
                return -1L;
            }
            this.buffer.limit(lr.m.j((int) (((long) this.buffer.position()) + byteCount), this.len));
            return sink.write(this.buffer);
        }
    }

    public static final k0 a(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
}
