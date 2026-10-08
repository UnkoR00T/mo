package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable, Iterable<byte[]> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f94754n = new byte[PKIFailureInfo.certConfirmed];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f94755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f94756b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f94758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f94759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f94760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f94761g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f94764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f94765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f94766m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f94757c = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f94762h = new byte[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f94763j = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f94767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f94768b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f94769c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f94767a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileM = d.M(this.f94767a);
            try {
                return new d(this.f94767a, randomAccessFileM, this.f94768b, this.f94769c);
            } catch (Throwable th4) {
                randomAccessFileM.close();
                throw th4;
            }
        }

        public a b(int i15) {
            this.f94769c = i15;
            return this;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f94770c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f94771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f94772b;

        b(long j15, int i15) {
            this.f94771a = j15;
            this.f94772b = i15;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f94771a + ", length=" + this.f94772b + "]";
        }
    }

    private final class c implements Iterator<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f94773a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f94774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f94775c;

        c() {
            this.f94774b = d.this.f94760f.f94771a;
            this.f94775c = d.this.f94763j;
        }

        private void a() {
            if (d.this.f94763j != this.f94775c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f94766m) {
                throw new IllegalStateException("closed");
            }
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i15 = this.f94773a;
            d dVar = d.this;
            if (i15 >= dVar.f94759e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarB0 = dVar.b0(this.f94774b);
                    byte[] bArr = new byte[bVarB0.f94772b];
                    long jI2 = d.this.i2(bVarB0.f94771a + 4);
                    this.f94774b = jI2;
                    if (!d.this.F1(jI2, bArr, 0, bVarB0.f94772b)) {
                        this.f94773a = d.this.f94759e;
                        return d.f94754n;
                    }
                    this.f94774b = d.this.i2(bVarB0.f94771a + 4 + ((long) bVarB0.f94772b));
                    this.f94773a++;
                    return bArr;
                } catch (IOException e15) {
                    throw ((Error) d.L(e15));
                }
            } catch (IOException e16) {
                throw ((Error) d.L(e16));
            } catch (OutOfMemoryError unused) {
                d.this.x1();
                this.f94773a = d.this.f94759e;
                return d.f94754n;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f94766m) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f94773a != d.this.f94759e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f94773a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.o1();
                this.f94775c = d.this.f94763j;
                this.f94773a--;
            } catch (IOException e15) {
                throw ((Error) d.L(e15));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z15, int i15) throws IOException {
        this.f94756b = file;
        this.f94755a = randomAccessFile;
        this.f94764k = z15;
        this.f94765l = i15;
        H0();
    }

    private static void A2(byte[] bArr, int i15, long j15) {
        bArr[i15] = (byte) (j15 >> 56);
        bArr[i15 + 1] = (byte) (j15 >> 48);
        bArr[i15 + 2] = (byte) (j15 >> 40);
        bArr[i15 + 3] = (byte) (j15 >> 32);
        bArr[i15 + 4] = (byte) (j15 >> 24);
        bArr[i15 + 5] = (byte) (j15 >> 16);
        bArr[i15 + 6] = (byte) (j15 >> 8);
        bArr[i15 + 7] = (byte) j15;
    }

    private void D1(long j15, long j16) throws IOException {
        long j17 = j15;
        while (j16 > 0) {
            byte[] bArr = f94754n;
            int iMin = (int) Math.min(j16, bArr.length);
            K1(j17, bArr, 0, iMin);
            long j18 = iMin;
            j16 -= j18;
            j17 += j18;
        }
    }

    private void E(long j15) throws IOException {
        long j16;
        long j17;
        long j18 = j15 + 4;
        long jD1 = d1();
        if (jD1 >= j18) {
            return;
        }
        long j19 = this.f94758d;
        do {
            jD1 += j19;
            j19 <<= 1;
        } while (jD1 < j18);
        Q1(j19);
        b bVar = this.f94761g;
        long jI2 = i2(bVar.f94771a + 4 + ((long) bVar.f94772b));
        if (jI2 <= this.f94760f.f94771a) {
            FileChannel channel = this.f94755a.getChannel();
            channel.position(this.f94758d);
            j16 = jI2 - 32;
            if (channel.transferTo(32L, j16, channel) != j16) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j16 = 0;
        }
        long j25 = this.f94761g.f94771a;
        long j26 = this.f94760f.f94771a;
        if (j25 < j26) {
            long j27 = (this.f94758d + j25) - 32;
            t2(j19, this.f94759e, j26, j27);
            this.f94761g = new b(j27, this.f94761g.f94772b);
            j17 = j19;
        } else {
            t2(j19, this.f94759e, j26, j25);
            j17 = j19;
        }
        this.f94758d = j17;
        if (this.f94764k) {
            D1(32L, j16);
        }
    }

    private void H0() throws IOException {
        this.f94755a.seek(0L);
        this.f94755a.readFully(this.f94762h);
        this.f94758d = Y0(this.f94762h, 4);
        this.f94759e = O0(this.f94762h, 12);
        long jY0 = Y0(this.f94762h, 16);
        long jY1 = Y0(this.f94762h, 24);
        if (this.f94758d > this.f94755a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f94758d + ", Actual length: " + this.f94755a.length());
        }
        if (this.f94758d > 32) {
            this.f94760f = b0(jY0);
            this.f94761g = b0(jY1);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f94758d + ") is invalid.");
        }
    }

    private void K1(long j15, byte[] bArr, int i15, int i16) throws IOException {
        long jI2 = i2(j15);
        long j16 = ((long) i16) + jI2;
        long j17 = this.f94758d;
        if (j16 <= j17) {
            this.f94755a.seek(jI2);
            this.f94755a.write(bArr, i15, i16);
            return;
        }
        int i17 = (int) (j17 - jI2);
        this.f94755a.seek(jI2);
        this.f94755a.write(bArr, i15, i17);
        this.f94755a.seek(32L);
        this.f94755a.write(bArr, i15 + i17, i16 - i17);
    }

    static <T extends Throwable> T L(Throwable th4) throws Throwable {
        throw th4;
    }

    static RandomAccessFile M(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileZ = Z(file2);
            try {
                randomAccessFileZ.setLength(4096L);
                randomAccessFileZ.seek(0L);
                randomAccessFileZ.writeInt(-2147483647);
                randomAccessFileZ.writeLong(4096L);
                randomAccessFileZ.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th4) {
                randomAccessFileZ.close();
                throw th4;
            }
        }
        return Z(file);
    }

    private static int O0(byte[] bArr, int i15) {
        return ((bArr[i15] & 255) << 24) + ((bArr[i15 + 1] & 255) << 16) + ((bArr[i15 + 2] & 255) << 8) + (bArr[i15 + 3] & 255);
    }

    private void Q1(long j15) throws IOException {
        this.f94755a.setLength(j15);
        this.f94755a.getChannel().force(true);
    }

    private long S1() {
        if (this.f94759e == 0) {
            return 32L;
        }
        b bVar = this.f94761g;
        long j15 = bVar.f94771a;
        long j16 = this.f94760f.f94771a;
        return j15 >= j16 ? (j15 - j16) + 4 + ((long) bVar.f94772b) + 32 : (((j15 + 4) + ((long) bVar.f94772b)) + this.f94758d) - j16;
    }

    private static long Y0(byte[] bArr, int i15) {
        return ((((long) bArr[i15]) & 255) << 56) + ((((long) bArr[i15 + 1]) & 255) << 48) + ((((long) bArr[i15 + 2]) & 255) << 40) + ((((long) bArr[i15 + 3]) & 255) << 32) + ((((long) bArr[i15 + 4]) & 255) << 24) + ((((long) bArr[i15 + 5]) & 255) << 16) + ((((long) bArr[i15 + 6]) & 255) << 8) + (((long) bArr[i15 + 7]) & 255);
    }

    private static RandomAccessFile Z(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private long d1() {
        return this.f94758d - S1();
    }

    private void t2(long j15, int i15, long j16, long j17) throws IOException {
        this.f94755a.seek(0L);
        v2(this.f94762h, 0, -2147483647);
        A2(this.f94762h, 4, j15);
        v2(this.f94762h, 12, i15);
        A2(this.f94762h, 16, j16);
        A2(this.f94762h, 24, j17);
        this.f94755a.write(this.f94762h, 0, 32);
    }

    private static void v2(byte[] bArr, int i15, int i16) {
        bArr[i15] = (byte) (i16 >> 24);
        bArr[i15 + 1] = (byte) (i16 >> 16);
        bArr[i15 + 2] = (byte) (i16 >> 8);
        bArr[i15 + 3] = (byte) i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1() throws IOException {
        this.f94755a.close();
        this.f94756b.delete();
        this.f94755a = M(this.f94756b);
        H0();
    }

    public void C(byte[] bArr, int i15, int i16) throws IOException {
        long jI2;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i15 | i16) < 0 || i16 > bArr.length - i15) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f94766m) {
            throw new IllegalStateException("closed");
        }
        if (V()) {
            o1();
        }
        E(i16);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jI2 = 32;
        } else {
            b bVar = this.f94761g;
            jI2 = i2(bVar.f94771a + 4 + ((long) bVar.f94772b));
        }
        b bVar2 = new b(jI2, i16);
        v2(this.f94762h, 0, i16);
        K1(bVar2.f94771a, this.f94762h, 0, 4);
        K1(bVar2.f94771a + 4, bArr, i15, i16);
        t2(this.f94758d, this.f94759e + 1, zIsEmpty ? bVar2.f94771a : this.f94760f.f94771a, bVar2.f94771a);
        this.f94761g = bVar2;
        this.f94759e++;
        this.f94763j++;
        if (zIsEmpty) {
            this.f94760f = bVar2;
        }
    }

    boolean F1(long j15, byte[] bArr, int i15, int i16) throws IOException {
        try {
            long jI2 = i2(j15);
            long j16 = ((long) i16) + jI2;
            long j17 = this.f94758d;
            if (j16 <= j17) {
                this.f94755a.seek(jI2);
                this.f94755a.readFully(bArr, i15, i16);
                return true;
            }
            int i17 = (int) (j17 - jI2);
            this.f94755a.seek(jI2);
            this.f94755a.readFully(bArr, i15, i17);
            this.f94755a.seek(32L);
            this.f94755a.readFully(bArr, i15 + i17, i16 - i17);
            return true;
        } catch (EOFException unused) {
            x1();
            return false;
        } catch (IOException e15) {
            throw e15;
        } catch (Throwable unused2) {
            x1();
            return false;
        }
    }

    public boolean V() {
        return this.f94765l != -1 && size() == this.f94765l;
    }

    b b0(long j15) {
        if (j15 != 0 && F1(j15, this.f94762h, 0, 4)) {
            return new b(j15, O0(this.f94762h, 0));
        }
        return b.f94770c;
    }

    public void clear() throws IOException {
        if (this.f94766m) {
            throw new IllegalStateException("closed");
        }
        t2(4096L, 0, 0L, 0L);
        if (this.f94764k) {
            this.f94755a.seek(32L);
            this.f94755a.write(f94754n, 0, 4064);
        }
        this.f94759e = 0;
        b bVar = b.f94770c;
        this.f94760f = bVar;
        this.f94761g = bVar;
        if (this.f94758d > 4096) {
            Q1(4096L);
        }
        this.f94758d = 4096L;
        this.f94763j++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94766m = true;
        this.f94755a.close();
    }

    long i2(long j15) {
        long j16 = this.f94758d;
        return j15 < j16 ? j15 : (j15 + 32) - j16;
    }

    public boolean isEmpty() {
        return this.f94759e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new c();
    }

    public void o1() throws IOException {
        s1(1);
    }

    public void s1(int i15) throws IOException {
        if (i15 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i15 + ") number of elements.");
        }
        if (i15 == 0) {
            return;
        }
        if (i15 == this.f94759e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i15 > this.f94759e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i15 + ") than present in queue (" + this.f94759e + ").");
        }
        b bVar = this.f94760f;
        long j15 = bVar.f94771a;
        int iO0 = bVar.f94772b;
        long j16 = 0;
        int i16 = 0;
        long j17 = j15;
        while (i16 < i15) {
            j16 += (long) (iO0 + 4);
            long jI2 = i2(j17 + 4 + ((long) iO0));
            if (!F1(jI2, this.f94762h, 0, 4)) {
                return;
            }
            iO0 = O0(this.f94762h, 0);
            i16++;
            j17 = jI2;
        }
        t2(this.f94758d, this.f94759e - i15, j17, this.f94761g.f94771a);
        this.f94759e -= i15;
        this.f94763j++;
        this.f94760f = new b(j17, iO0);
        if (this.f94764k) {
            D1(j15, j16);
        }
    }

    public int size() {
        return this.f94759e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f94756b + ", zero=" + this.f94764k + ", length=" + this.f94758d + ", size=" + this.f94759e + ", first=" + this.f94760f + ", last=" + this.f94761g + '}';
    }
}
