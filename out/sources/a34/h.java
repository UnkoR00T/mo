package a34;

import java.io.IOException;
import java.io.InputStream;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u000fJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"La34/h;", "Ljava/io/InputStream;", "original", "", "maxSize", "<init>", "(Ljava/io/InputStream;J)V", "", "size", "Loq/i0;", "b", "(I)V", "read", "()I", "", "([B)I", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37062n, "len", "([BII)I", "a", "Ljava/io/InputStream;", "J", "c", "total", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputStream original;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long maxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long total;

    public h(InputStream inputStream, long j15) {
        this.original = inputStream;
        this.maxSize = j15;
    }

    private final void b(int size) throws IOException {
        long j15 = this.total + ((long) size);
        this.total = j15;
        if (j15 <= this.maxSize) {
            return;
        }
        throw new IOException("InputStream exceeded maximum size " + this.maxSize + " bytes");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i15 = this.original.read();
        if (i15 >= 0) {
            b(1);
        }
        return i15;
    }

    @Override // java.io.InputStream
    public int read(byte[] b15) {
        return read(b15, 0, b15.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] b15, int off, int len) throws IOException {
        int i15 = this.original.read(b15, off, len);
        if (i15 >= 0) {
            b(i15);
        }
        return i15;
    }
}
