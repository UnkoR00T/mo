package dp;

import io.sentry.android.core.c2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f43655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43656b = 0;

    public e(g gVar) {
        this.f43655a = gVar;
    }

    @Override // java.io.InputStream
    public int available() {
        b();
        long length = this.f43655a.length() - this.f43655a.getPosition();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    void b() {
        this.f43655a.seek(this.f43656b);
    }

    @Override // java.io.InputStream
    public int read() {
        b();
        if (this.f43655a.k0()) {
            return -1;
        }
        int i15 = this.f43655a.read();
        if (i15 != -1) {
            this.f43656b++;
            return i15;
        }
        c2.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f43656b + ", actual position: " + this.f43655a.getPosition());
        return i15;
    }

    @Override // java.io.InputStream
    public long skip(long j15) {
        b();
        this.f43655a.seek(this.f43656b + j15);
        this.f43656b += j15;
        return j15;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) {
        b();
        if (this.f43655a.k0()) {
            return -1;
        }
        int i17 = this.f43655a.read(bArr, i15, i16);
        if (i17 != -1) {
            this.f43656b += (long) i17;
            return i17;
        }
        c2.e("PdfBox-Android", "read() returns -1, assumed position: " + this.f43656b + ", actual position: " + this.f43655a.getPosition());
        return i17;
    }
}
