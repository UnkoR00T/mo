package dp;

import io.sentry.android.core.c2;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.BitSet;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f43659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f43660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RandomAccessFile f43661d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BitSet f43663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[][] f43664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f43665h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f43666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f43667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f43668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f43669m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43658a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f43662e = 0;

    public i(b bVar) throws IOException {
        BitSet bitSet = new BitSet();
        this.f43663f = bitSet;
        this.f43669m = false;
        boolean z15 = !bVar.h() || bVar.d();
        this.f43668l = z15;
        boolean z16 = z15 && bVar.i();
        this.f43667k = z16;
        File fileC = z16 ? bVar.c() : null;
        this.f43659b = fileC;
        if (fileC != null && !fileC.isDirectory()) {
            throw new IOException("Scratch file directory does not exist: " + fileC);
        }
        int iMin = Integer.MAX_VALUE;
        this.f43666j = bVar.e() ? (int) Math.min(2147483647L, bVar.b() / 4096) : Integer.MAX_VALUE;
        if (!bVar.h()) {
            iMin = 0;
        } else if (bVar.d()) {
            iMin = (int) Math.min(2147483647L, bVar.a() / 4096);
        }
        this.f43665h = iMin;
        this.f43664g = new byte[z15 ? iMin : 100000][];
        bitSet.set(0, this.f43664g.length);
    }

    private void m() {
        synchronized (this.f43658a) {
            try {
                b();
                if (this.f43662e >= this.f43666j) {
                    return;
                }
                if (this.f43667k) {
                    if (this.f43661d == null) {
                        this.f43660c = File.createTempFile("PDFBox", ".tmp", this.f43659b);
                        try {
                            this.f43661d = new RandomAccessFile(this.f43660c, "rw");
                        } catch (IOException e15) {
                            if (!this.f43660c.delete()) {
                                c2.g("PdfBox-Android", "Error deleting scratch file: " + this.f43660c.getAbsolutePath());
                            }
                            throw e15;
                        }
                    }
                    long length = this.f43661d.length();
                    long j15 = (((long) this.f43662e) - ((long) this.f43665h)) * 4096;
                    if (j15 != length) {
                        throw new IOException("Expected scratch file size of " + j15 + " but found " + length + " in file " + this.f43660c);
                    }
                    if (this.f43662e + 16 > this.f43662e) {
                        if (yo.a.b()) {
                            Objects.toString(this.f43660c);
                            this.f43661d.length();
                            this.f43660c.length();
                        }
                        long j16 = 65536 + length;
                        this.f43661d.setLength(j16);
                        if (yo.a.b()) {
                            this.f43661d.length();
                            this.f43660c.length();
                        }
                        if (j16 != this.f43661d.length()) {
                            long filePointer = this.f43661d.getFilePointer();
                            this.f43661d.seek(length + 65535);
                            this.f43661d.write(0);
                            this.f43661d.seek(filePointer);
                            this.f43661d.length();
                            this.f43660c.length();
                        }
                        this.f43663f.set(this.f43662e, this.f43662e + 16);
                    }
                } else if (!this.f43668l) {
                    int length2 = this.f43664g.length;
                    int iMin = (int) Math.min(((long) length2) * 2, 2147483647L);
                    if (iMin > length2) {
                        byte[][] bArr = new byte[iMin][];
                        System.arraycopy(this.f43664g, 0, bArr, 0, length2);
                        this.f43664g = bArr;
                        this.f43663f.set(length2, iMin);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static i p() {
        try {
            return new i(b.f());
        } catch (IOException e15) {
            c2.e("PdfBox-Android", "Unexpected exception occurred creating main memory scratch file instance: " + e15.getMessage());
            return null;
        }
    }

    byte[] C(int i15) throws IOException {
        byte[] bArr;
        if (i15 < 0 || i15 >= this.f43662e) {
            b();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Page index out of range: ");
            sb5.append(i15);
            sb5.append(". Max value: ");
            sb5.append(this.f43662e - 1);
            throw new IOException(sb5.toString());
        }
        if (i15 < this.f43665h) {
            byte[] bArr2 = this.f43664g[i15];
            if (bArr2 != null) {
                return bArr2;
            }
            b();
            throw new IOException("Requested page with index " + i15 + " was not written before.");
        }
        synchronized (this.f43658a) {
            try {
                RandomAccessFile randomAccessFile = this.f43661d;
                if (randomAccessFile == null) {
                    b();
                    throw new IOException("Missing scratch file to read page with index " + i15 + " from.");
                }
                bArr = new byte[PKIFailureInfo.certConfirmed];
                randomAccessFile.seek((((long) i15) - ((long) this.f43665h)) * 4096);
                this.f43661d.readFully(bArr);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bArr;
    }

    void E(int i15, byte[] bArr) {
        if (i15 < 0 || i15 >= this.f43662e) {
            b();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Page index out of range: ");
            sb5.append(i15);
            sb5.append(". Max value: ");
            sb5.append(this.f43662e - 1);
            throw new IOException(sb5.toString());
        }
        if (bArr.length != 4096) {
            throw new IOException("Wrong page size to write: " + bArr.length + ". Expected: " + PKIFailureInfo.certConfirmed);
        }
        if (i15 >= this.f43665h) {
            synchronized (this.f43658a) {
                b();
                this.f43661d.seek((((long) i15) - ((long) this.f43665h)) * 4096);
                this.f43661d.write(bArr);
            }
            return;
        }
        if (this.f43668l) {
            this.f43664g[i15] = bArr;
        } else {
            synchronized (this.f43658a) {
                this.f43664g[i15] = bArr;
            }
        }
        b();
    }

    void b() {
        if (this.f43669m) {
            throw new IOException("Scratch file already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f43658a) {
            try {
                if (this.f43669m) {
                    return;
                }
                this.f43669m = true;
                RandomAccessFile randomAccessFile = this.f43661d;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e15) {
                        e = e15;
                    }
                }
                e = null;
                File file = this.f43660c;
                if (file != null && !file.delete() && this.f43660c.exists() && e == null) {
                    e = new IOException("Error deleting scratch file: " + this.f43660c.getAbsolutePath());
                }
                synchronized (this.f43663f) {
                    this.f43663f.clear();
                    this.f43662e = 0;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public c h() {
        return new j(this);
    }

    int r() {
        int iNextSetBit;
        synchronized (this.f43663f) {
            try {
                iNextSetBit = this.f43663f.nextSetBit(0);
                if (iNextSetBit < 0) {
                    m();
                    iNextSetBit = this.f43663f.nextSetBit(0);
                    if (iNextSetBit < 0) {
                        throw new IOException("Maximum allowed scratch file memory exceeded.");
                    }
                }
                this.f43663f.clear(iNextSetBit);
                if (iNextSetBit >= this.f43662e) {
                    this.f43662e = iNextSetBit + 1;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return iNextSetBit;
    }

    int u() {
        return PKIFailureInfo.certConfirmed;
    }

    void y(int[] iArr, int i15, int i16) {
        synchronized (this.f43663f) {
            while (i15 < i16) {
                try {
                    int i17 = iArr[i15];
                    if (i17 >= 0 && i17 < this.f43662e && !this.f43663f.get(i17)) {
                        this.f43663f.set(i17);
                        if (i17 < this.f43665h) {
                            this.f43664g[i17] = null;
                        }
                    }
                    i15++;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
