package ve;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class i extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f206292a;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f206292a = PKIFailureInfo.systemUnavail;
    }

    private long b(long j15) {
        int i15 = this.f206292a;
        if (i15 == 0) {
            return -1L;
        }
        return (i15 == Integer.MIN_VALUE || j15 <= ((long) i15)) ? j15 : i15;
    }

    private void h(long j15) {
        int i15 = this.f206292a;
        if (i15 == Integer.MIN_VALUE || j15 == -1) {
            return;
        }
        this.f206292a = (int) (((long) i15) - j15);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i15 = this.f206292a;
        return i15 == Integer.MIN_VALUE ? super.available() : Math.min(i15, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i15) {
        super.mark(i15);
        this.f206292a = i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int i15 = super.read();
        h(1L);
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f206292a = PKIFailureInfo.systemUnavail;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j15) throws IOException {
        long jB = b(j15);
        if (jB == -1) {
            return 0L;
        }
        long jSkip = super.skip(jB);
        h(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int iB = (int) b(i16);
        if (iB == -1) {
            return -1;
        }
        int i17 = super.read(bArr, i15, iB);
        h(i17);
        return i17;
    }
}
