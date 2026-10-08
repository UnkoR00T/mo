package cp;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f37158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f37159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f37162g;

    c(OutputStream outputStream) {
        super(outputStream);
        this.f37156a = 72;
        this.f37160e = 72;
        this.f37157b = 0;
        this.f37158c = new byte[4];
        this.f37159d = new byte[5];
        this.f37161f = true;
        this.f37162g = '~';
    }

    private void b() {
        byte[] bArr = this.f37158c;
        long j15 = ((long) ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8))) & BodyPartID.bodyIdMax;
        if (j15 == 0) {
            byte[] bArr2 = this.f37159d;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        long j16 = j15 / 52200625;
        byte[] bArr3 = this.f37159d;
        bArr3[0] = (byte) (j16 + 33);
        long j17 = j15 - (j16 * 52200625);
        long j18 = j17 / 614125;
        bArr3[1] = (byte) (j18 + 33);
        long j19 = j17 - (j18 * 614125);
        long j25 = j19 / 7225;
        bArr3[2] = (byte) (j25 + 33);
        long j26 = j19 - (j25 * 7225);
        bArr3[3] = (byte) ((j26 / 85) + 33);
        bArr3[4] = (byte) ((j26 % 85) + 33);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            super.close();
        } finally {
            this.f37159d = null;
            this.f37158c = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.f37161f) {
            return;
        }
        int i15 = this.f37157b;
        if (i15 > 0) {
            while (i15 < 4) {
                this.f37158c[i15] = 0;
                i15++;
            }
            b();
            if (this.f37159d[0] == 122) {
                for (int i16 = 0; i16 < 5; i16++) {
                    this.f37159d[i16] = 33;
                }
            }
            for (int i17 = 0; i17 < this.f37157b + 1; i17++) {
                ((FilterOutputStream) this).out.write(this.f37159d[i17]);
                int i18 = this.f37156a - 1;
                this.f37156a = i18;
                if (i18 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f37156a = this.f37160e;
                }
            }
        }
        int i19 = this.f37156a - 1;
        this.f37156a = i19;
        if (i19 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.f37162g);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.f37157b = 0;
        this.f37156a = this.f37160e;
        this.f37161f = true;
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        byte b15;
        this.f37161f = false;
        byte[] bArr = this.f37158c;
        int i16 = this.f37157b;
        int i17 = i16 + 1;
        this.f37157b = i17;
        bArr[i16] = (byte) i15;
        if (i17 < 4) {
            return;
        }
        b();
        for (int i18 = 0; i18 < 5 && (b15 = this.f37159d[i18]) != 0; i18++) {
            ((FilterOutputStream) this).out.write(b15);
            int i19 = this.f37156a - 1;
            this.f37156a = i19;
            if (i19 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.f37156a = this.f37160e;
            }
        }
        this.f37157b = 0;
    }
}
