package ie;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class y extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f91960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f91961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f91962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f91963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f91964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ce.b f91965f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public y(InputStream inputStream, ce.b bVar) {
        this(inputStream, bVar, PKIFailureInfo.notAuthorized);
    }

    private int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i15 = this.f91963d;
        if (i15 != -1) {
            int i16 = this.f91964e - i15;
            int i17 = this.f91962c;
            if (i16 < i17) {
                if (i15 == 0 && i17 > bArr.length && this.f91961b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i17) {
                        i17 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f91965f.c(i17, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f91960a = bArr2;
                    this.f91965f.put(bArr);
                    bArr = bArr2;
                } else if (i15 > 0) {
                    System.arraycopy(bArr, i15, bArr, 0, bArr.length - i15);
                }
                int i18 = this.f91964e - this.f91963d;
                this.f91964e = i18;
                this.f91963d = 0;
                this.f91961b = 0;
                int i19 = inputStream.read(bArr, i18, bArr.length - i18);
                int i25 = this.f91964e;
                if (i19 > 0) {
                    i25 += i19;
                }
                this.f91961b = i25;
                return i19;
            }
        }
        int i26 = inputStream.read(bArr);
        if (i26 > 0) {
            this.f91963d = -1;
            this.f91964e = 0;
            this.f91961b = i26;
        }
        return i26;
    }

    private static IOException p() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f91960a == null || inputStream == null) {
            throw p();
        }
        return (this.f91961b - this.f91964e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f91960a != null) {
            this.f91965f.put(this.f91960a);
            this.f91960a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void h() {
        this.f91962c = this.f91960a.length;
    }

    public synchronized void m() {
        if (this.f91960a != null) {
            this.f91965f.put(this.f91960a);
            this.f91960a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i15) {
        this.f91962c = Math.max(this.f91962c, i15);
        this.f91963d = this.f91964e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f91960a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw p();
        }
        if (this.f91964e >= this.f91961b && b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f91960a && (bArr = this.f91960a) == null) {
            throw p();
        }
        int i15 = this.f91961b;
        int i16 = this.f91964e;
        if (i15 - i16 <= 0) {
            return -1;
        }
        this.f91964e = i16 + 1;
        return bArr[i16] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f91960a == null) {
            throw new IOException("Stream is closed");
        }
        int i15 = this.f91963d;
        if (-1 == i15) {
            throw new a("Mark has been invalidated, pos: " + this.f91964e + " markLimit: " + this.f91962c);
        }
        this.f91964e = i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j15) {
        if (j15 < 1) {
            return 0L;
        }
        byte[] bArr = this.f91960a;
        if (bArr == null) {
            throw p();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw p();
        }
        int i15 = this.f91961b;
        int i16 = this.f91964e;
        if (i15 - i16 >= j15) {
            this.f91964e = (int) (((long) i16) + j15);
            return j15;
        }
        long j16 = ((long) i15) - ((long) i16);
        this.f91964e = i15;
        if (this.f91963d == -1 || j15 > this.f91962c) {
            long jSkip = inputStream.skip(j15 - j16);
            if (jSkip > 0) {
                this.f91963d = -1;
            }
            return j16 + jSkip;
        }
        if (b(inputStream, bArr) == -1) {
            return j16;
        }
        int i17 = this.f91961b;
        int i18 = this.f91964e;
        if (i17 - i18 >= j15 - j16) {
            this.f91964e = (int) ((((long) i18) + j15) - j16);
            return j15;
        }
        long j17 = (j16 + ((long) i17)) - ((long) i18);
        this.f91964e = i17;
        return j17;
    }

    y(InputStream inputStream, ce.b bVar, int i15) {
        super(inputStream);
        this.f91963d = -1;
        this.f91965f = bVar;
        this.f91960a = (byte[]) bVar.c(i15, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i15, int i16) {
        int i17;
        int i18;
        byte[] bArr2 = this.f91960a;
        if (bArr2 == null) {
            throw p();
        }
        if (i16 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i19 = this.f91964e;
            int i25 = this.f91961b;
            if (i19 < i25) {
                int i26 = i25 - i19 >= i16 ? i16 : i25 - i19;
                System.arraycopy(bArr2, i19, bArr, i15, i26);
                this.f91964e += i26;
                if (i26 == i16 || inputStream.available() == 0) {
                    return i26;
                }
                i15 += i26;
                i17 = i16 - i26;
            } else {
                i17 = i16;
            }
            while (true) {
                if (this.f91963d == -1 && i17 >= bArr2.length) {
                    i18 = inputStream.read(bArr, i15, i17);
                    if (i18 == -1) {
                        return i17 != i16 ? i16 - i17 : -1;
                    }
                } else {
                    if (b(inputStream, bArr2) == -1) {
                        return i17 != i16 ? i16 - i17 : -1;
                    }
                    if (bArr2 != this.f91960a && (bArr2 = this.f91960a) == null) {
                        throw p();
                    }
                    int i27 = this.f91961b;
                    int i28 = this.f91964e;
                    i18 = i27 - i28 >= i17 ? i17 : i27 - i28;
                    System.arraycopy(bArr2, i28, bArr, i15, i18);
                    this.f91964e += i18;
                }
                i17 -= i18;
                if (i17 == 0) {
                    return i16;
                }
                if (inputStream.available() == 0) {
                    return i16 - i17;
                }
                i15 += i18;
            }
        } else {
            throw p();
        }
    }
}
