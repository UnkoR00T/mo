package xd;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f218022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f218023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f218024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f218025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f218026e;

    class a extends ByteArrayOutputStream {
        a(int i15) {
            super(i15);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i15 = ((ByteArrayOutputStream) this).count;
            if (i15 > 0 && ((ByteArrayOutputStream) this).buf[i15 - 1] == 13) {
                i15--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i15, b.this.f218023b.name());
            } catch (UnsupportedEncodingException e15) {
                throw new AssertionError(e15);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, PKIFailureInfo.certRevoked, charset);
    }

    private void h() throws IOException {
        InputStream inputStream = this.f218022a;
        byte[] bArr = this.f218024c;
        int i15 = inputStream.read(bArr, 0, bArr.length);
        if (i15 == -1) {
            throw new EOFException();
        }
        this.f218025d = 0;
        this.f218026e = i15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f218022a) {
            try {
                if (this.f218024c != null) {
                    this.f218024c = null;
                    this.f218022a.close();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean m() {
        return this.f218026e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String p() {
        int i15;
        byte[] bArr;
        int i16;
        synchronized (this.f218022a) {
            try {
                if (this.f218024c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f218025d >= this.f218026e) {
                    h();
                }
                for (int i17 = this.f218025d; i17 != this.f218026e; i17++) {
                    byte[] bArr2 = this.f218024c;
                    if (bArr2[i17] == 10) {
                        int i18 = this.f218025d;
                        if (i17 != i18) {
                            i16 = i17 - 1;
                            if (bArr2[i16] != 13) {
                                i16 = i17;
                            }
                        } else {
                            i16 = i17;
                        }
                        String str = new String(bArr2, i18, i16 - i18, this.f218023b.name());
                        this.f218025d = i17 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f218026e - this.f218025d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f218024c;
                    int i19 = this.f218025d;
                    aVar.write(bArr3, i19, this.f218026e - i19);
                    this.f218026e = -1;
                    h();
                    i15 = this.f218025d;
                    while (i15 != this.f218026e) {
                        bArr = this.f218024c;
                        if (bArr[i15] == 10) {
                            break loop1;
                        }
                        i15++;
                    }
                }
                int i25 = this.f218025d;
                if (i15 != i25) {
                    aVar.write(bArr, i25, i15 - i25);
                }
                this.f218025d = i15 + 1;
                return aVar.toString();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public b(InputStream inputStream, int i15, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f218028a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f218022a = inputStream;
        this.f218023b = charset;
        this.f218024c = new byte[i15];
    }
}
