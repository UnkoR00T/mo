package vv;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0016\u0018\u0000 R2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001DB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\"\u0010!J'\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0010¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020,2\u0006\u00101\u001a\u00020\u0000¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020,2\u0006\u00104\u001a\u00020\u0000¢\u0006\u0004\b5\u00103J!\u00107\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00002\b\b\u0002\u00106\u001a\u00020\u0013H\u0007¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u0013H\u0017¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00002\b\b\u0002\u00106\u001a\u00020\u0013H\u0007¢\u0006\u0004\b;\u00108J!\u0010<\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u0013H\u0017¢\u0006\u0004\b<\u0010:J\u001a\u0010>\u001a\u00020,2\b\u0010*\u001a\u0004\u0018\u00010=H\u0096\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0013H\u0016¢\u0006\u0004\b@\u0010\u001fJ\u0018\u0010A\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010!R\"\u0010@\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010IR$\u0010O\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bP\u0010\u001f¨\u0006S"}, d2 = {"Lvv/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "Y", "()Ljava/lang/String;", "b", "N", "()Lvv/h;", "O", "algorithm", "g", "(Ljava/lang/String;)Lvv/h;", "t", "W", "", "beginIndex", "endIndex", "T", "(II)Lvv/h;", "pos", "", "B", "(I)B", "index", "n", "r", "()I", "X", "()[B", "A", "Lvv/e;", "buffer", "offset", "byteCount", "Loq/i0;", "a0", "(Lvv/e;II)V", "other", "otherOffset", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(ILvv/h;II)Z", "I", "(I[BII)Z", "prefix", "R", "(Lvv/h;)Z", "suffix", "k", "fromIndex", "v", "(Lvv/h;I)I", "w", "([BI)I", ip.a.f96138c, "F", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "e", "(Lvv/h;)I", "toString", "a", "[B", "o", "p", "J", "(I)V", "c", "Ljava/lang/String;", "s", "K", "(Ljava/lang/String;)V", "utf8", "Q", "size", "d", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class h implements Serializable, Comparable<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f208378e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private transient int hashCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private transient String utf8;

    /* JADX INFO: renamed from: vv.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\b*\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0013\u0010\u0013\u001a\u00020\b*\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvv/h$a;", "", "<init>", "()V", "", "", "offset", "byteCount", "Lvv/h;", "e", "([BII)Lvv/h;", "", "d", "(Ljava/lang/String;)Lvv/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lvv/h;", "a", "b", "", "serialVersionUID", "J", "EMPTY", "Lvv/h;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ h f(Companion companion, byte[] bArr, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i15 = 0;
            }
            if ((i17 & 2) != 0) {
                i16 = b.c();
            }
            return companion.e(bArr, i15, i16);
        }

        public final h a(String str) {
            byte[] bArrA = a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = i15 * 2;
                bArr[i15] = (byte) ((wv.c.b(str.charAt(i16)) << 4) + wv.c.b(str.charAt(i16 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            return new h(str.getBytes(charset));
        }

        public final h d(String str) {
            h hVar = new h(o0.a(str));
            hVar.K(str);
            return hVar;
        }

        public final h e(byte[] bArr, int i15, int i16) {
            int iE = b.e(bArr, i16);
            b.b(bArr.length, i15, iE);
            return new h(pq.n.t(bArr, i15, iE + i15));
        }

        private Companion() {
        }
    }

    public h(byte[] bArr) {
        this.data = bArr;
    }

    public static /* synthetic */ int G(h hVar, h hVar2, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i16 & 2) != 0) {
            i15 = b.c();
        }
        return hVar.D(hVar2, i15);
    }

    public static /* synthetic */ h U(h hVar, int i15, int i16, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = b.c();
        }
        return hVar.T(i15, i16);
    }

    public static final h j(String str) {
        return INSTANCE.d(str);
    }

    public static /* synthetic */ int y(h hVar, h hVar2, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        return hVar.v(hVar2, i15);
    }

    public byte[] A() {
        return getData();
    }

    public byte B(int pos) {
        return getData()[pos];
    }

    public final int D(h other, int fromIndex) {
        return F(other.A(), fromIndex);
    }

    public int F(byte[] other, int fromIndex) {
        for (int iMin = Math.min(b.d(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
            if (b.a(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean H(int offset, h other, int otherOffset, int byteCount) {
        return other.I(otherOffset, getData(), offset, byteCount);
    }

    public boolean I(int offset, byte[] other, int otherOffset, int byteCount) {
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && b.a(getData(), offset, other, otherOffset, byteCount);
    }

    public final void J(int i15) {
        this.hashCode = i15;
    }

    public final void K(String str) {
        this.utf8 = str;
    }

    public final h N() {
        return g("SHA-1");
    }

    public final h O() {
        return g(XMSSKeyParameters.SHA_256);
    }

    public final int Q() {
        return r();
    }

    public final boolean R(h prefix) {
        return H(0, prefix, 0, prefix.Q());
    }

    public h T(int beginIndex, int endIndex) {
        int iD = b.d(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iD <= getData().length) {
            if (iD - beginIndex >= 0) {
                return (beginIndex == 0 && iD == getData().length) ? this : new h(pq.n.t(getData(), beginIndex, iD));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    public h W() {
        for (int i15 = 0; i15 < getData().length; i15++) {
            byte b15 = getData()[i15];
            if (b15 >= 65 && b15 <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                bArrCopyOf[i15] = (byte) (b15 + 32);
                for (int i16 = i15 + 1; i16 < bArrCopyOf.length; i16++) {
                    byte b16 = bArrCopyOf[i16];
                    if (b16 >= 65 && b16 <= 90) {
                        bArrCopyOf[i16] = (byte) (b16 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] X() {
        byte[] data = getData();
        return Arrays.copyOf(data, data.length);
    }

    public String Y() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strC = o0.c(A());
        K(strC);
        return strC;
    }

    public void a0(e buffer, int offset, int byteCount) {
        wv.b.c(this, buffer, offset, byteCount);
    }

    public String b() {
        return a.c(getData(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        int iQ = Q();
        int iQ2 = other.Q();
        int iMin = Math.min(iQ, iQ2);
        for (int i15 = 0; i15 < iMin; i15++) {
            int iN = n(i15) & 255;
            int iN2 = other.n(i15) & 255;
            if (iN != iN2) {
                return iN < iN2 ? -1 : 1;
            }
        }
        if (iQ == iQ2) {
            return 0;
        }
        return iQ < iQ2 ? -1 : 1;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.Q() == getData().length && hVar.I(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public h g(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, Q());
        return new h(messageDigest.digest());
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        J(iHashCode);
        return iHashCode;
    }

    public final boolean k(h suffix) {
        return H(Q() - suffix.Q(), suffix, 0, suffix.Q());
    }

    public final byte n(int index) {
        return B(index);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int r() {
        return getData().length;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public String t() {
        char[] cArr = new char[getData().length * 2];
        int i15 = 0;
        for (byte b15 : getData()) {
            int i16 = i15 + 1;
            cArr[i15] = wv.b.d()[(b15 >> 4) & 15];
            i15 += 2;
            cArr[i16] = wv.b.d()[b15 & 15];
        }
        return fu.r.y(cArr);
    }

    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iB = wv.b.b(getData(), 64);
        if (iB != -1) {
            String strY = Y();
            String strP = fu.r.P(fu.r.P(fu.r.P(strY.substring(0, iB), "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strY.length()) {
                return "[text=" + strP + ']';
            }
            return "[size=" + getData().length + " text=" + strP + "…]";
        }
        if (getData().length <= 64) {
            return "[hex=" + t() + ']';
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[size=");
        sb5.append(getData().length);
        sb5.append(" hex=");
        int iD = b.d(this, 64);
        if (iD <= getData().length) {
            if (iD < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb5.append((iD == getData().length ? this : new h(pq.n.t(getData(), 0, iD))).t());
            sb5.append("…]");
            return sb5.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    public final int v(h other, int fromIndex) {
        return w(other.A(), fromIndex);
    }

    public int w(byte[] other, int fromIndex) {
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }
}
