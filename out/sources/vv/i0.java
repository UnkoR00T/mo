package vv;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0010¢\u0006\u0004\b%\u0010&J/\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0003H\u0010¢\u0006\u0004\b2\u0010\u001fJ\u001a\u00104\u001a\u00020)2\b\u0010'\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lvv/i0;", "Lvv/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "e0", "()Lvv/h;", "", "b", "()Ljava/lang/String;", "t", "W", "algorithm", "g", "(Ljava/lang/String;)Lvv/h;", "", "beginIndex", "endIndex", "T", "(II)Lvv/h;", "pos", "", "B", "(I)B", "r", "()I", "X", "()[B", "Lvv/e;", "buffer", "offset", "byteCount", "Loq/i0;", "a0", "(Lvv/e;II)V", "other", "otherOffset", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(ILvv/h;II)Z", "I", "(I[BII)Z", "fromIndex", "w", "([BI)I", "F", "A", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "f", "[[B", "d0", "()[[B", "[I", "c0", "()[I", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final transient byte[][] segments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final transient int[] directory;

    public i0(byte[][] bArr, int[] iArr) {
        super(h.f208378e.getData());
        this.segments = bArr;
        this.directory = iArr;
    }

    private final h e0() {
        return new h(X());
    }

    @Override // vv.h
    public byte[] A() {
        return X();
    }

    @Override // vv.h
    public byte B(int pos) {
        b.b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iB = wv.g.b(this, pos);
        return getSegments()[iB][(pos - (iB == 0 ? 0 : getDirectory()[iB - 1])) + getDirectory()[getSegments().length + iB]];
    }

    @Override // vv.h
    public int F(byte[] other, int fromIndex) {
        return e0().F(other, fromIndex);
    }

    @Override // vv.h
    public boolean H(int offset, h other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > Q() - byteCount) {
            return false;
        }
        int i15 = byteCount + offset;
        int iB = wv.g.b(this, offset);
        while (offset < i15) {
            int i16 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i17 = getDirectory()[iB] - i16;
            int i18 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i15, i17 + i16) - offset;
            if (!other.I(otherOffset, getSegments()[iB], i18 + (offset - i16), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // vv.h
    public boolean I(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > Q() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i15 = byteCount + offset;
        int iB = wv.g.b(this, offset);
        while (offset < i15) {
            int i16 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i17 = getDirectory()[iB] - i16;
            int i18 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i15, i17 + i16) - offset;
            if (!b.a(getSegments()[iB], i18 + (offset - i16), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // vv.h
    public h T(int beginIndex, int endIndex) {
        int iD = b.d(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (iD > Q()) {
            throw new IllegalArgumentException(("endIndex=" + iD + " > length(" + Q() + ')').toString());
        }
        int i15 = iD - beginIndex;
        if (i15 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iD + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && iD == Q()) {
            return this;
        }
        if (beginIndex == iD) {
            return h.f208378e;
        }
        int iB = wv.g.b(this, beginIndex);
        int iB2 = wv.g.b(this, iD - 1);
        byte[][] bArr = (byte[][]) pq.n.v(getSegments(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i16 = iB;
            int i17 = 0;
            while (true) {
                iArr[i17] = Math.min(getDirectory()[i16] - beginIndex, i15);
                int i18 = i17 + 1;
                iArr[i17 + bArr.length] = getDirectory()[getSegments().length + i16];
                if (i16 == iB2) {
                    break;
                }
                i16++;
                i17 = i18;
            }
        }
        int i19 = iB != 0 ? getDirectory()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (beginIndex - i19);
        return new i0(bArr, iArr);
    }

    @Override // vv.h
    public h W() {
        return e0().W();
    }

    @Override // vv.h
    public byte[] X() {
        byte[] bArr = new byte[Q()];
        int length = getSegments().length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < length) {
            int i18 = getDirectory()[length + i15];
            int i19 = getDirectory()[i15];
            int i25 = i19 - i16;
            pq.n.i(getSegments()[i15], bArr, i17, i18, i18 + i25);
            i17 += i25;
            i15++;
            i16 = i19;
        }
        return bArr;
    }

    @Override // vv.h
    public void a0(e buffer, int offset, int byteCount) {
        int i15 = offset + byteCount;
        int iB = wv.g.b(this, offset);
        while (offset < i15) {
            int i16 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i17 = getDirectory()[iB] - i16;
            int i18 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i15, i17 + i16) - offset;
            int i19 = i18 + (offset - i16);
            g0 g0Var = new g0(getSegments()[iB], i19, i19 + iMin, true, false);
            g0 g0Var2 = buffer.head;
            if (g0Var2 == null) {
                g0Var.prev = g0Var;
                g0Var.next = g0Var;
                buffer.head = g0Var;
            } else {
                g0Var2.prev.c(g0Var);
            }
            offset += iMin;
            iB++;
        }
        buffer.i1(buffer.getSize() + ((long) byteCount));
    }

    @Override // vv.h
    public String b() {
        return e0().b();
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // vv.h
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.Q() == Q() && H(0, hVar, 0, Q())) {
                return true;
            }
        }
        return false;
    }

    @Override // vv.h
    public h g(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int i17 = getDirectory()[length + i15];
            int i18 = getDirectory()[i15];
            messageDigest.update(getSegments()[i15], i17, i18 - i16);
            i15++;
            i16 = i18;
        }
        return new h(messageDigest.digest());
    }

    @Override // vv.h
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i15 = 0;
        int i16 = 1;
        int i17 = 0;
        while (i15 < length) {
            int i18 = getDirectory()[length + i15];
            int i19 = getDirectory()[i15];
            byte[] bArr = getSegments()[i15];
            int i25 = (i19 - i17) + i18;
            while (i18 < i25) {
                i16 = (i16 * 31) + bArr[i18];
                i18++;
            }
            i15++;
            i17 = i19;
        }
        J(i16);
        return i16;
    }

    @Override // vv.h
    public int r() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // vv.h
    public String t() {
        return e0().t();
    }

    @Override // vv.h
    public String toString() {
        return e0().toString();
    }

    @Override // vv.h
    public int w(byte[] other, int fromIndex) {
        return e0().w(other, fromIndex);
    }
}
