package vv;

import java.io.RandomAccessFile;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvv/s;", "Lvv/i;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", "C", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "y", "(J[BII)I", "Loq/i0;", "u", "()V", "e", "Ljava/io/RandomAccessFile;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RandomAccessFile randomAccessFile;

    public s(boolean z15, RandomAccessFile randomAccessFile) {
        super(z15);
        this.randomAccessFile = randomAccessFile;
    }

    @Override // vv.i
    protected synchronized long C() {
        return this.randomAccessFile.length();
    }

    @Override // vv.i
    protected synchronized void u() {
        this.randomAccessFile.close();
    }

    @Override // vv.i
    protected synchronized int y(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        this.randomAccessFile.seek(fileOffset);
        int i15 = 0;
        while (i15 < byteCount) {
            int i16 = this.randomAccessFile.read(array, arrayOffset, byteCount - i15);
            if (i16 == -1) {
                if (i15 != 0) {
                    break;
                }
                return -1;
            }
            i15 += i16;
        }
        return i15;
    }
}
