package xo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputStream f220178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f220179k = new e();

    public c(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("stream == null!");
        }
        this.f220178j = inputStream;
    }

    @Override // xo.a
    public void b(long j15) {
        super.b(j15);
        this.f220179k.c(e());
    }

    @Override // xo.a
    public void close() throws IOException {
        super.close();
        this.f220179k.b();
    }

    @Override // xo.a
    public int read() {
        this.f220170d = 0;
        if (this.f220168b >= this.f220179k.h()) {
            int iH = (int) ((this.f220168b - this.f220179k.h()) + 1);
            if (this.f220179k.a(this.f220178j, iH) < iH) {
                return -1;
            }
        }
        int iD = this.f220179k.d(this.f220168b);
        if (iD >= 0) {
            this.f220168b++;
        }
        return iD;
    }

    @Override // xo.a
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        this.f220170d = 0;
        if (this.f220168b >= this.f220179k.h()) {
            this.f220179k.a(this.f220178j, (int) ((this.f220168b - this.f220179k.h()) + ((long) i16)));
        }
        int iE = this.f220179k.e(bArr, i15, i16, this.f220168b);
        if (iE > 0) {
            this.f220168b += (long) iE;
        }
        return iE;
    }
}
