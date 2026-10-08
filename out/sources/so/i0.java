package so;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
abstract class i0 implements Closeable {
    i0() {
    }

    public int C() {
        int i15 = read();
        return i15 <= 127 ? i15 : i15 - 256;
    }

    public abstract short E();

    public String H(int i15) {
        return I(i15, uo.b.f199525a);
    }

    public String I(int i15, Charset charset) {
        return new String(p(i15), charset);
    }

    public String J() {
        return new String(p(4), uo.b.f199528d);
    }

    public int K() throws EOFException {
        int i15 = read();
        if (i15 != -1) {
            return i15;
        }
        throw new EOFException("premature EOF");
    }

    public int[] L(int i15) {
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr[i16] = read();
        }
        return iArr;
    }

    public long M() throws EOFException {
        long j15 = read();
        long j16 = read();
        long j17 = read();
        long j18 = read();
        if (j18 >= 0) {
            return (j15 << 24) + (j16 << 16) + (j17 << 8) + j18;
        }
        throw new EOFException();
    }

    public abstract int N();

    public int[] O(int i15) {
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr[i16] = N();
        }
        return iArr;
    }

    public abstract long b();

    public abstract InputStream h();

    public abstract long m();

    public byte[] p(int i15) throws IOException {
        byte[] bArr = new byte[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = read(bArr, i16, i15 - i16);
            if (i17 == -1) {
                break;
            }
            i16 += i17;
        }
        if (i16 == i15) {
            return bArr;
        }
        throw new IOException("Unexpected end of TTF stream reached");
    }

    public float r() {
        return E() + (N() / 65536.0f);
    }

    public abstract int read();

    public abstract int read(byte[] bArr, int i15, int i16);

    public abstract void seek(long j15);

    public Calendar u() {
        long jY = y();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis(calendar.getTimeInMillis() + (jY * 1000));
        return calendar;
    }

    public abstract long y();
}
