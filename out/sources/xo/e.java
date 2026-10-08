package xo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f220182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f220183b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<byte[]> f220184c = new ArrayList<>();

    private void g(long j15) {
        int size = (((int) (j15 >> 9)) - this.f220184c.size()) + 1;
        for (int i15 = 0; i15 < size; i15++) {
            this.f220184c.add(new byte[512]);
        }
        this.f220182a = j15 + 1;
    }

    public int a(InputStream inputStream, int i15) throws IOException {
        if (i15 <= 0) {
            return 0;
        }
        long j15 = this.f220182a;
        g((((long) i15) + j15) - 1);
        int i16 = (int) (j15 >> 9);
        int i17 = (int) (j15 & 511);
        int i18 = 0;
        while (i15 > 0) {
            byte[] bArr = this.f220184c.get(i16);
            int iMin = Math.min(512 - i17, i15);
            i15 -= iMin;
            i18 += iMin;
            while (iMin > 0) {
                int i19 = inputStream.read(bArr, i17, iMin);
                if (i19 < 0) {
                    this.f220182a -= (long) (i15 - i18);
                    return i18;
                }
                iMin -= i19;
                i17 += i19;
            }
            i16++;
            i17 = 0;
        }
        return i18;
    }

    public void b() {
        this.f220184c.clear();
        this.f220182a = 0L;
    }

    public void c(long j15) {
        int i15 = (int) (j15 >> 9);
        int i16 = this.f220183b;
        if (i15 <= i16) {
            return;
        }
        while (i16 < i15) {
            this.f220184c.set(i16, null);
            i16++;
        }
        this.f220183b = i15;
    }

    public int d(long j15) {
        if (j15 >= this.f220182a) {
            return -1;
        }
        return this.f220184c.get((int) (j15 >> 9))[(int) (j15 & 511)] & 255;
    }

    public int e(byte[] bArr, int i15, int i16, long j15) {
        if (i16 > bArr.length - i15 || i16 < 0 || i15 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i16 == 0) {
            return 0;
        }
        long j16 = this.f220182a;
        if (j15 >= j16) {
            return -1;
        }
        if (((long) i16) + j15 > j16) {
            i16 = (int) (j16 - j15);
        }
        byte[] bArr2 = this.f220184c.get((int) (j15 >> 9));
        int i17 = (int) (j15 & 511);
        int iMin = Math.min(i16, 512 - i17);
        System.arraycopy(bArr2, i17, bArr, i15, iMin);
        return iMin;
    }

    public void f(OutputStream outputStream, int i15, long j15) throws IOException {
        if (((long) i15) + j15 > this.f220182a) {
            throw new IndexOutOfBoundsException("Argument out of cache");
        }
        int i16 = (int) (j15 >> 9);
        int i17 = (int) (j15 & 511);
        if (i16 < this.f220183b) {
            throw new IndexOutOfBoundsException("The requested data are already disposed");
        }
        while (i15 > 0) {
            byte[] bArr = this.f220184c.get(i16);
            int iMin = Math.min(512 - i17, i15);
            outputStream.write(bArr, i17, iMin);
            i16++;
            i15 -= iMin;
            i17 = 0;
        }
    }

    public long h() {
        return this.f220182a;
    }

    public void i(int i15, long j15) {
        if (j15 >= this.f220182a) {
            g(j15);
        }
        this.f220184c.get((int) (j15 >> 9))[(int) (j15 & 511)] = (byte) i15;
    }

    public void j(byte[] bArr, int i15, int i16, long j15) {
        if (i16 > bArr.length - i15 || i16 < 0 || i15 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i16 == 0) {
            return;
        }
        long j16 = (((long) i16) + j15) - 1;
        if (j16 >= this.f220182a) {
            g(j16);
        }
        while (i16 > 0) {
            byte[] bArr2 = this.f220184c.get((int) (j15 >> 9));
            int i17 = (int) (511 & j15);
            int iMin = Math.min(512 - i17, i16);
            System.arraycopy(bArr, i15, bArr2, i17, iMin);
            j15 += (long) iMin;
            i16 -= iMin;
            i15 += iMin;
        }
    }
}
