package dp;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f43671b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f43674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f43675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43676g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43672c = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43677h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f43678j = new int[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f43679k = 0;

    j(i iVar) throws IOException {
        iVar.b();
        this.f43671b = iVar;
        this.f43670a = iVar.u();
        b();
    }

    private void b() throws IOException {
        int i15 = this.f43679k;
        int i16 = i15 + 1;
        int[] iArr = this.f43678j;
        if (i16 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length == Integer.MAX_VALUE) {
                    throw new IOException("Maximum buffer size reached.");
                }
                length = Integer.MAX_VALUE;
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            this.f43678j = iArr2;
        }
        int iR = this.f43671b.r();
        int[] iArr3 = this.f43678j;
        int i17 = this.f43679k;
        iArr3[i17] = iR;
        this.f43673d = i17;
        int i18 = this.f43670a;
        this.f43674e = ((long) i17) * ((long) i18);
        this.f43679k = i17 + 1;
        this.f43675f = new byte[i18];
        this.f43676g = 0;
    }

    private void h() throws IOException {
        i iVar = this.f43671b;
        if (iVar == null) {
            throw new IOException("Buffer already closed");
        }
        iVar.b();
    }

    private boolean m(boolean z15) throws IOException {
        if (this.f43676g >= this.f43670a) {
            if (this.f43677h) {
                this.f43671b.E(this.f43678j[this.f43673d], this.f43675f);
                this.f43677h = false;
            }
            int i15 = this.f43673d;
            if (i15 + 1 < this.f43679k) {
                i iVar = this.f43671b;
                int[] iArr = this.f43678j;
                int i16 = i15 + 1;
                this.f43673d = i16;
                this.f43675f = iVar.C(iArr[i16]);
                this.f43674e = ((long) this.f43673d) * ((long) this.f43670a);
                this.f43676g = 0;
            } else {
                if (!z15) {
                    return false;
                }
                b();
            }
        }
        return true;
    }

    @Override // dp.g
    public void b3(int i15) throws IOException {
        seek((this.f43674e + ((long) this.f43676g)) - ((long) i15));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        i iVar = this.f43671b;
        if (iVar != null) {
            iVar.y(this.f43678j, 0, this.f43679k);
            this.f43671b = null;
            this.f43678j = null;
            this.f43675f = null;
            this.f43674e = 0L;
            this.f43673d = -1;
            this.f43676g = 0;
            this.f43672c = 0L;
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f43671b != null) {
                yo.a.b();
            }
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // dp.g
    public long getPosition() throws IOException {
        h();
        return this.f43674e + ((long) this.f43676g);
    }

    @Override // dp.g
    public boolean isClosed() {
        return this.f43671b == null;
    }

    @Override // dp.g
    public byte[] j0(int i15) throws IOException {
        byte[] bArr = new byte[i15];
        int i16 = 0;
        do {
            int i17 = read(bArr, i16, i15 - i16);
            if (i17 < 0) {
                throw new EOFException();
            }
            i16 += i17;
        } while (i16 < i15);
        return bArr;
    }

    @Override // dp.g
    public boolean k0() throws IOException {
        h();
        return this.f43674e + ((long) this.f43676g) >= this.f43672c;
    }

    @Override // dp.g
    public long length() {
        return this.f43672c;
    }

    @Override // dp.g
    public int peek() throws IOException {
        int i15 = read();
        if (i15 != -1) {
            b3(1);
        }
        return i15;
    }

    @Override // dp.g
    public int read() throws IOException {
        h();
        if (this.f43674e + ((long) this.f43676g) >= this.f43672c) {
            return -1;
        }
        if (!m(false)) {
            throw new IOException("Unexpectedly no bytes available for read in buffer.");
        }
        byte[] bArr = this.f43675f;
        int i15 = this.f43676g;
        this.f43676g = i15 + 1;
        return bArr[i15] & 255;
    }

    @Override // dp.g
    public void seek(long j15) throws IOException {
        h();
        if (j15 > this.f43672c) {
            throw new EOFException();
        }
        if (j15 < 0) {
            throw new IOException("Negative seek offset: " + j15);
        }
        long j16 = this.f43674e;
        if (j15 >= j16 && j15 <= ((long) this.f43670a) + j16) {
            this.f43676g = (int) (j15 - j16);
            return;
        }
        if (this.f43677h) {
            this.f43671b.E(this.f43678j[this.f43673d], this.f43675f);
            this.f43677h = false;
        }
        int i15 = this.f43670a;
        int i16 = (int) (j15 / ((long) i15));
        if (j15 % ((long) i15) == 0 && j15 == this.f43672c) {
            i16--;
        }
        this.f43675f = this.f43671b.C(this.f43678j[i16]);
        this.f43673d = i16;
        long j17 = ((long) i16) * ((long) this.f43670a);
        this.f43674e = j17;
        this.f43676g = (int) (j15 - j17);
    }

    @Override // dp.h
    public void write(int i15) throws IOException {
        h();
        m(true);
        byte[] bArr = this.f43675f;
        int i16 = this.f43676g;
        int i17 = i16 + 1;
        this.f43676g = i17;
        bArr[i16] = (byte) i15;
        this.f43677h = true;
        long j15 = this.f43674e;
        if (((long) i17) + j15 > this.f43672c) {
            this.f43672c = j15 + ((long) i17);
        }
    }

    @Override // dp.g
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // dp.g
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        h();
        long j15 = this.f43674e;
        int i17 = this.f43676g;
        long j16 = ((long) i17) + j15;
        long j17 = this.f43672c;
        if (j16 >= j17) {
            return -1;
        }
        int iMin = (int) Math.min(i16, j17 - (j15 + ((long) i17)));
        int i18 = 0;
        while (iMin > 0) {
            if (m(false)) {
                int iMin2 = Math.min(iMin, this.f43670a - this.f43676g);
                System.arraycopy(this.f43675f, this.f43676g, bArr, i15, iMin2);
                this.f43676g += iMin2;
                i18 += iMin2;
                i15 += iMin2;
                iMin -= iMin2;
            } else {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
        }
        return i18;
    }

    @Override // dp.h
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // dp.h
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        h();
        while (i16 > 0) {
            m(true);
            int iMin = Math.min(i16, this.f43670a - this.f43676g);
            System.arraycopy(bArr, i15, this.f43675f, this.f43676g, iMin);
            this.f43676g += iMin;
            this.f43677h = true;
            i15 += iMin;
            i16 -= iMin;
        }
        long j15 = this.f43674e;
        int i17 = this.f43676g;
        if (((long) i17) + j15 > this.f43672c) {
            this.f43672c = j15 + ((long) i17);
        }
    }
}
