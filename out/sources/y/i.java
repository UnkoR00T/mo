package y;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public final class i extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f222490g = "Exif\u0000\u0000".getBytes(g.f222456e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f222491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f222492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteBuffer f222493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f222494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f222495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f222496f;

    static final class a {
        public static boolean a(short s15) {
            return (s15 < -64 || s15 > -49 || s15 == -60 || s15 == -56 || s15 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, PKIFailureInfo.notAuthorized));
        this.f222492b = new byte[1];
        this.f222493c = ByteBuffer.allocate(4);
        this.f222494d = 0;
        this.f222491a = hVar;
    }

    private int b(int i15, byte[] bArr, int i16, int i17) {
        int iMin = Math.min(i17, i15 - this.f222493c.position());
        this.f222493c.put(bArr, i16, iMin);
        return iMin;
    }

    private void h(b bVar) throws IOException {
        j[][] jVarArr = h.f222470i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f222468g) {
            for (int i15 = 0; i15 < h.f222470i.length; i15++) {
                this.f222491a.d(i15).remove(jVar.f222498b);
            }
        }
        if (!this.f222491a.d(1).isEmpty()) {
            this.f222491a.d(0).put(h.f222468g[1].f222498b, g.f(0L, this.f222491a.e()));
        }
        if (!this.f222491a.d(2).isEmpty()) {
            this.f222491a.d(0).put(h.f222468g[2].f222498b, g.f(0L, this.f222491a.e()));
        }
        if (!this.f222491a.d(3).isEmpty()) {
            this.f222491a.d(1).put(h.f222468g[3].f222498b, g.f(0L, this.f222491a.e()));
        }
        for (int i16 = 0; i16 < h.f222470i.length; i16++) {
            Iterator<Map.Entry<String, g>> it = this.f222491a.d(i16).entrySet().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i17 += iJ;
                }
            }
            iArr2[i16] = iArr2[i16] + i17;
        }
        int size = 8;
        for (int i18 = 0; i18 < h.f222470i.length; i18++) {
            if (!this.f222491a.d(i18).isEmpty()) {
                iArr[i18] = size;
                size += (this.f222491a.d(i18).size() * 12) + 6 + iArr2[i18];
            }
        }
        int i19 = size + 8;
        if (!this.f222491a.d(1).isEmpty()) {
            this.f222491a.d(0).put(h.f222468g[1].f222498b, g.f(iArr[1], this.f222491a.e()));
        }
        if (!this.f222491a.d(2).isEmpty()) {
            this.f222491a.d(0).put(h.f222468g[2].f222498b, g.f(iArr[2], this.f222491a.e()));
        }
        if (!this.f222491a.d(3).isEmpty()) {
            this.f222491a.d(1).put(h.f222468g[3].f222498b, g.f(iArr[3], this.f222491a.e()));
        }
        bVar.u(i19);
        bVar.write(f222490g);
        bVar.p(this.f222491a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.b(this.f222491a.e());
        bVar.u(42);
        bVar.r(8L);
        for (int i25 = 0; i25 < h.f222470i.length; i25++) {
            if (!this.f222491a.d(i25).isEmpty()) {
                bVar.u(this.f222491a.d(i25).size());
                int size2 = iArr[i25] + 2 + (this.f222491a.d(i25).size() * 12) + 4;
                for (Map.Entry<String, g> entry : this.f222491a.d(i25).entrySet()) {
                    int i26 = ((j) i6.i.h(h.b.f222479f.get(i25).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f222497a;
                    g value = entry.getValue();
                    int iJ2 = value.j();
                    bVar.u(i26);
                    bVar.u(value.f222460a);
                    bVar.m(value.f222461b);
                    if (iJ2 > 4) {
                        bVar.r(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(value.f222463d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.h(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.r(0L);
                Iterator<Map.Entry<String, g>> it4 = this.f222491a.d(i25).entrySet().iterator();
                while (it4.hasNext()) {
                    byte[] bArr = it4.next().getValue().f222463d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.b(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        while (true) {
            int i17 = this.f222495e;
            if ((i17 <= 0 && this.f222496f <= 0 && this.f222494d == 2) || i16 <= 0) {
                break;
            }
            if (i17 > 0) {
                int iMin = Math.min(i16, i17);
                i16 -= iMin;
                this.f222495e -= iMin;
                i15 += iMin;
            }
            int i18 = this.f222496f;
            if (i18 > 0) {
                int iMin2 = Math.min(i16, i18);
                ((FilterOutputStream) this).out.write(bArr, i15, iMin2);
                i16 -= iMin2;
                this.f222496f -= iMin2;
                i15 += iMin2;
            }
            if (i16 == 0) {
                return;
            }
            int i19 = this.f222494d;
            if (i19 == 0) {
                int iB = b(2, bArr, i15, i16);
                i15 += iB;
                i16 -= iB;
                if (this.f222493c.position() < 2) {
                    return;
                }
                this.f222493c.rewind();
                if (this.f222493c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f222493c.array(), 0, 2);
                this.f222494d = 1;
                this.f222493c.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.p((short) -31);
                h(bVar);
            } else if (i19 != 1) {
                continue;
            } else {
                int iB2 = b(4, bArr, i15, i16);
                i15 += iB2;
                i16 -= iB2;
                if (this.f222493c.position() == 2 && this.f222493c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f222493c.array(), 0, 2);
                    this.f222493c.rewind();
                }
                if (this.f222493c.position() < 4) {
                    return;
                }
                this.f222493c.rewind();
                short s15 = this.f222493c.getShort();
                if (s15 == -31) {
                    this.f222495e = (this.f222493c.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                    this.f222494d = 2;
                } else if (a.a(s15)) {
                    ((FilterOutputStream) this).out.write(this.f222493c.array(), 0, 4);
                    this.f222494d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f222493c.array(), 0, 4);
                    this.f222496f = (this.f222493c.getShort() & HPKE.aead_EXPORT_ONLY) - 2;
                }
                this.f222493c.rewind();
            }
        }
        if (i16 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i15, i16);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i15) throws IOException {
        byte[] bArr = this.f222492b;
        bArr[0] = (byte) (i15 & GF2Field.MASK);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
