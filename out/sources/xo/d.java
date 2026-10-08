package xo;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class d extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    OutputStream f220180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    e f220181l = new e();

    public d(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream == null!");
        }
        this.f220180k = outputStream;
    }

    @Override // xo.a
    public void b(long j15) throws IOException {
        long jE = e();
        super.b(j15);
        long jE2 = e();
        this.f220181l.f(this.f220180k, (int) (jE2 - jE), jE);
        this.f220181l.c(jE2);
        this.f220180k.flush();
    }

    @Override // xo.a
    public void close() throws IOException {
        long jO = o();
        i(jO);
        b(jO);
        super.close();
        this.f220181l.b();
    }

    public long o() {
        return this.f220181l.h();
    }

    @Override // xo.a
    public int read() {
        this.f220170d = 0;
        int iD = this.f220181l.d(this.f220168b);
        if (iD >= 0) {
            this.f220168b++;
        }
        return iD;
    }

    @Override // xo.b, java.io.DataOutput
    public void write(int i15) throws IOException {
        l();
        this.f220181l.i(i15, this.f220168b);
        this.f220168b++;
    }

    @Override // xo.a
    public int read(byte[] bArr, int i15, int i16) {
        this.f220170d = 0;
        int iE = this.f220181l.e(bArr, i15, i16, this.f220168b);
        if (iE > 0) {
            this.f220168b += (long) iE;
        }
        return iE;
    }

    @Override // xo.b, java.io.DataOutput
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        l();
        this.f220181l.j(bArr, i15, i16, this.f220168b);
        this.f220168b += (long) i16;
    }
}
