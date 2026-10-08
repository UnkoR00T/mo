package cp;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class b extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f37154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f37155e;

    b(InputStream inputStream) {
        super(inputStream);
        this.f37151a = 0;
        this.f37152b = 0;
        this.f37153c = false;
        this.f37154d = new byte[5];
        this.f37155e = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37154d = null;
        this.f37153c = true;
        this.f37155e = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i15) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte b15;
        if (this.f37151a >= this.f37152b) {
            if (this.f37153c) {
                return -1;
            }
            this.f37151a = 0;
            while (true) {
                byte b16 = (byte) ((FilterInputStream) this).in.read();
                if (b16 == -1) {
                    this.f37153c = true;
                    return -1;
                }
                byte b17 = b16;
                if (b17 != 10 && b17 != 13 && b17 != 32) {
                    if (b17 == 126) {
                        this.f37153c = true;
                        this.f37155e = null;
                        this.f37154d = null;
                        this.f37152b = 0;
                        return -1;
                    }
                    if (b17 == 122) {
                        byte[] bArr = this.f37155e;
                        bArr[3] = 0;
                        bArr[2] = 0;
                        bArr[1] = 0;
                        bArr[0] = 0;
                        this.f37152b = 4;
                    } else {
                        this.f37154d[0] = b17;
                        int i15 = 1;
                        while (i15 < 5) {
                            while (true) {
                                byte b18 = (byte) ((FilterInputStream) this).in.read();
                                if (b18 == -1) {
                                    this.f37153c = true;
                                    return -1;
                                }
                                b15 = b18;
                                if (b15 == 10 || b15 == 13 || b15 == 32) {
                                }
                            }
                            byte[] bArr2 = this.f37154d;
                            bArr2[i15] = b15;
                            if (b15 == 126) {
                                bArr2[i15] = 117;
                                break;
                            }
                            i15++;
                        }
                        int i16 = i15 - 1;
                        this.f37152b = i16;
                        if (i16 == 0) {
                            this.f37153c = true;
                            this.f37154d = null;
                            this.f37155e = null;
                            return -1;
                        }
                        if (i15 < 5) {
                            for (int i17 = i15 + 1; i17 < 5; i17++) {
                                this.f37154d[i17] = 117;
                            }
                            this.f37153c = true;
                        }
                        long j15 = 0;
                        for (int i18 = 0; i18 < 5; i18++) {
                            byte b19 = (byte) (this.f37154d[i18] - 33);
                            if (b19 < 0 || b19 > 93) {
                                this.f37152b = 0;
                                this.f37153c = true;
                                this.f37154d = null;
                                this.f37155e = null;
                                throw new IOException("Invalid data in Ascii85 stream");
                            }
                            j15 = (j15 * 85) + ((long) b19);
                        }
                        for (int i19 = 3; i19 >= 0; i19--) {
                            this.f37155e[i19] = (byte) (255 & j15);
                            j15 >>>= 8;
                        }
                    }
                }
            }
        }
        byte[] bArr3 = this.f37155e;
        int i25 = this.f37151a;
        this.f37151a = i25 + 1;
        return bArr3[i25] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("Reset is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j15) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        if (this.f37153c && this.f37151a >= this.f37152b) {
            return -1;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f37151a;
            if (i18 < this.f37152b) {
                byte[] bArr2 = this.f37155e;
                this.f37151a = i18 + 1;
                bArr[i17 + i15] = bArr2[i18];
            } else {
                int i19 = read();
                if (i19 == -1) {
                    return i17;
                }
                bArr[i17 + i15] = (byte) i19;
            }
        }
        return i16;
    }
}
