package wv;

import java.io.EOFException;
import java.io.IOException;
import p071kotlin.Metadata;
import vv.k0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lwv/i;", "Lvv/n;", "Lvv/k0;", "delegate", "", "size", "", "truncate", "<init>", "(Lvv/k0;JZ)V", "Lvv/e;", "newSize", "Loq/i0;", "h", "(Lvv/e;J)V", "sink", "byteCount", "k3", "(Lvv/e;J)J", "b", "J", "c", "Z", "d", "bytesReceived", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends vv.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean truncate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long bytesReceived;

    public i(k0 k0Var, long j15, boolean z15) {
        super(k0Var);
        this.size = j15;
        this.truncate = z15;
    }

    private final void h(vv.e eVar, long j15) throws EOFException {
        vv.e eVar2 = new vv.e();
        eVar2.U1(eVar);
        eVar.O3(eVar2, j15);
        eVar2.b();
    }

    @Override // vv.n, vv.k0
    public long k3(vv.e sink, long byteCount) throws IOException {
        long j15 = this.bytesReceived;
        long j16 = this.size;
        if (j15 > j16) {
            byteCount = 0;
        } else if (this.truncate) {
            long j17 = j16 - j15;
            if (j17 == 0) {
                return -1L;
            }
            byteCount = Math.min(byteCount, j17);
        }
        long jK3 = super.k3(sink, byteCount);
        if (jK3 != -1) {
            this.bytesReceived += jK3;
        }
        long j18 = this.bytesReceived;
        long j19 = this.size;
        if ((j18 >= j19 || jK3 != -1) && j18 <= j19) {
            return jK3;
        }
        if (jK3 > 0 && j18 > j19) {
            h(sink, sink.getSize() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}
