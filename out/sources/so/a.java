package so;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class a extends RandomAccessFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f182595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f182596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f182597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f182598d;

    public a(File file, String str, int i15) {
        super(file, str);
        this.f182596b = 0;
        this.f182597c = 0;
        this.f182598d = 0L;
        this.f182595a = new byte[i15];
    }

    private int b() throws IOException {
        int i15 = super.read(this.f182595a);
        if (i15 >= 0) {
            this.f182598d += (long) i15;
            this.f182596b = i15;
            this.f182597c = 0;
        }
        return i15;
    }

    private void h() {
        this.f182596b = 0;
        this.f182597c = 0;
        this.f182598d = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() {
        return (this.f182598d - ((long) this.f182596b)) + ((long) this.f182597c);
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        if ((this.f182597c >= this.f182596b && b() < 0) || this.f182596b == 0) {
            return -1;
        }
        byte[] bArr = this.f182595a;
        int i15 = this.f182597c;
        this.f182597c = i15 + 1;
        return (bArr[i15] + HPKE.mode_base) & GF2Field.MASK;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j15) throws IOException {
        int i15;
        int i16 = (int) (this.f182598d - j15);
        if (i16 >= 0 && i16 <= (i15 = this.f182596b)) {
            this.f182597c = i15 - i16;
        } else {
            super.seek(j15);
            h();
        }
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i15, int i16) {
        int i17 = 0;
        while (true) {
            int i18 = this.f182596b;
            int i19 = this.f182597c;
            int i25 = i18 - i19;
            if (i16 <= i25) {
                System.arraycopy(this.f182595a, i19, bArr, i15, i16);
                this.f182597c += i16;
                return i17 + i16;
            }
            System.arraycopy(this.f182595a, i19, bArr, i15, i25);
            i17 += i25;
            this.f182597c += i25;
            if (b() <= 0) {
                if (i17 == 0) {
                    return -1;
                }
                return i17;
            }
            i15 += i25;
            i16 -= i25;
        }
    }
}
