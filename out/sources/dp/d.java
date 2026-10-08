package dp;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class d implements c, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<byte[]> f43648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f43649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f43650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f43652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43654h;

    public d() {
        this(1024);
    }

    private int H(byte[] bArr, int i15, int i16) {
        int iMin = (int) Math.min(i16, this.f43652f - this.f43650d);
        int i17 = this.f43647a;
        int i18 = this.f43651e;
        int i19 = i17 - i18;
        if (i19 == 0) {
            return 0;
        }
        if (iMin >= i19) {
            System.arraycopy(this.f43649c, i18, bArr, i15, i19);
            this.f43651e += i19;
            this.f43650d += (long) i19;
            return i19;
        }
        System.arraycopy(this.f43649c, i18, bArr, i15, iMin);
        this.f43651e += iMin;
        this.f43650d += (long) iMin;
        return iMin;
    }

    private void b() throws IOException {
        if (this.f43649c == null) {
            throw new IOException("RandomAccessBuffer already closed");
        }
    }

    private void p() throws IOException {
        if (this.f43654h > this.f43653g) {
            y();
            return;
        }
        byte[] bArr = new byte[this.f43647a];
        this.f43649c = bArr;
        this.f43648b.add(bArr);
        this.f43651e = 0;
        this.f43654h++;
        this.f43653g++;
    }

    private void y() throws IOException {
        int i15 = this.f43653g;
        if (i15 == this.f43654h) {
            throw new IOException("No more chunks available, end of buffer reached");
        }
        this.f43651e = 0;
        List<byte[]> list = this.f43648b;
        int i16 = i15 + 1;
        this.f43653g = i16;
        this.f43649c = list.get(i16);
    }

    public int available() {
        return (int) Math.min(length() - getPosition(), 2147483647L);
    }

    @Override // dp.g
    public void b3(int i15) throws IOException {
        b();
        seek(getPosition() - ((long) i15));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43649c = null;
        this.f43648b.clear();
        this.f43650d = 0L;
        this.f43651e = 0;
        this.f43652f = 0L;
        this.f43653g = 0;
    }

    @Override // dp.g
    public long getPosition() throws IOException {
        b();
        return this.f43650d;
    }

    @Override // dp.g
    public boolean isClosed() {
        return this.f43649c == null;
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
        b();
        return this.f43650d >= this.f43652f;
    }

    @Override // dp.g
    public long length() throws IOException {
        b();
        return this.f43652f;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public d clone() {
        d dVar = new d(this.f43647a);
        dVar.f43648b = new ArrayList(this.f43648b.size());
        for (byte[] bArr : this.f43648b) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            dVar.f43648b.add(bArr2);
        }
        if (this.f43649c != null) {
            List<byte[]> list = dVar.f43648b;
            dVar.f43649c = list.get(list.size() - 1);
        } else {
            dVar.f43649c = null;
        }
        dVar.f43650d = this.f43650d;
        dVar.f43651e = this.f43651e;
        dVar.f43652f = this.f43652f;
        dVar.f43653g = this.f43653g;
        dVar.f43654h = this.f43654h;
        return dVar;
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
        b();
        if (this.f43650d >= this.f43652f) {
            return -1;
        }
        if (this.f43651e >= this.f43647a) {
            int i15 = this.f43653g;
            if (i15 >= this.f43654h) {
                return -1;
            }
            List<byte[]> list = this.f43648b;
            int i16 = i15 + 1;
            this.f43653g = i16;
            this.f43649c = list.get(i16);
            this.f43651e = 0;
        }
        this.f43650d++;
        byte[] bArr = this.f43649c;
        int i17 = this.f43651e;
        this.f43651e = i17 + 1;
        return bArr[i17] & 255;
    }

    @Override // dp.g
    public void seek(long j15) throws IOException {
        b();
        if (j15 < 0) {
            throw new IOException("Invalid position " + j15);
        }
        this.f43650d = j15;
        if (j15 >= this.f43652f) {
            int i15 = this.f43654h;
            this.f43653g = i15;
            this.f43649c = this.f43648b.get(i15);
            this.f43651e = (int) (this.f43652f % ((long) this.f43647a));
            return;
        }
        int i16 = this.f43647a;
        int i17 = (int) (j15 / ((long) i16));
        this.f43653g = i17;
        this.f43651e = (int) (j15 % ((long) i16));
        this.f43649c = this.f43648b.get(i17);
    }

    @Override // dp.h
    public void write(int i15) throws IOException {
        b();
        int i16 = this.f43651e;
        int i17 = this.f43647a;
        if (i16 >= i17) {
            if (this.f43650d + ((long) i17) >= 2147483647L) {
                throw new IOException("RandomAccessBuffer overflow");
            }
            p();
        }
        byte[] bArr = this.f43649c;
        int i18 = this.f43651e;
        int i19 = i18 + 1;
        this.f43651e = i19;
        bArr[i18] = (byte) i15;
        long j15 = this.f43650d + 1;
        this.f43650d = j15;
        if (j15 > this.f43652f) {
            this.f43652f = j15;
        }
        int i25 = this.f43647a;
        if (i19 >= i25) {
            if (j15 + ((long) i25) >= 2147483647L) {
                throw new IOException("RandomAccessBuffer overflow");
            }
            p();
        }
    }

    private d(int i15) {
        this.f43647a = 1024;
        this.f43648b = null;
        ArrayList arrayList = new ArrayList();
        this.f43648b = arrayList;
        this.f43647a = i15;
        byte[] bArr = new byte[i15];
        this.f43649c = bArr;
        arrayList.add(bArr);
        this.f43650d = 0L;
        this.f43651e = 0;
        this.f43652f = 0L;
        this.f43653g = 0;
        this.f43654h = 0;
    }

    @Override // dp.g
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        b();
        if (this.f43650d >= this.f43652f) {
            return -1;
        }
        int iH = H(bArr, i15, i16);
        while (iH < i16 && available() > 0) {
            iH += H(bArr, i15 + iH, i16 - iH);
            if (this.f43651e == this.f43647a) {
                y();
            }
        }
        return iH;
    }

    @Override // dp.h
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public d(byte[] bArr) {
        this.f43647a = 1024;
        this.f43648b = null;
        ArrayList arrayList = new ArrayList(1);
        this.f43648b = arrayList;
        this.f43647a = bArr.length;
        this.f43649c = bArr;
        arrayList.add(bArr);
        this.f43650d = 0L;
        this.f43651e = 0;
        this.f43652f = this.f43647a;
        this.f43653g = 0;
        this.f43654h = 0;
    }

    @Override // dp.h
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        b();
        long j15 = i16;
        long j16 = this.f43650d + j15;
        int i17 = this.f43647a;
        int i18 = this.f43651e;
        int i19 = i17 - i18;
        if (i16 < i19) {
            System.arraycopy(bArr, i15, this.f43649c, i18, i16);
            this.f43651e += i16;
        } else if (j16 <= 2147483647L) {
            System.arraycopy(bArr, i15, this.f43649c, i18, i19);
            int i25 = i15 + i19;
            long j17 = i16 - i19;
            int i26 = ((int) j17) / this.f43647a;
            for (int i27 = 0; i27 < i26; i27++) {
                p();
                System.arraycopy(bArr, i25, this.f43649c, this.f43651e, this.f43647a);
                i25 += this.f43647a;
            }
            long j18 = j17 - (((long) i26) * ((long) this.f43647a));
            if (j18 >= 0) {
                p();
                if (j18 > 0) {
                    System.arraycopy(bArr, i25, this.f43649c, this.f43651e, (int) j18);
                }
                this.f43651e = (int) j18;
            }
        } else {
            throw new IOException("RandomAccessBuffer overflow");
        }
        long j19 = this.f43650d + j15;
        this.f43650d = j19;
        if (j19 > this.f43652f) {
            this.f43652f = j19;
        }
    }

    @Override // dp.g
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public d(InputStream inputStream) throws IOException {
        this();
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (true) {
            int i15 = inputStream.read(bArr);
            if (i15 > -1) {
                write(bArr, 0, i15);
            } else {
                seek(0L);
                return;
            }
        }
    }
}
