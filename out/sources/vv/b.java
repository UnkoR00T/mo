package vv;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\n*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\n*\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\nH\u0000¢\u0006\u0004\b \u0010!\"\u001a\u0010&\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"", "size", "offset", "byteCount", "Loq/i0;", "b", "(JJJ)V", "", "h", "(S)S", "", "f", "(I)I", "g", "(J)J", "", "a", "aOffset", "bOffset", "", "([BI[BII)Z", "", "", "i", "(B)Ljava/lang/String;", "j", "(I)Ljava/lang/String;", "Lvv/h;", "position", "d", "(Lvv/h;I)I", "sizeParam", "e", "([BI)I", "Lvv/e$a;", "Lvv/e$a;", "getDEFAULT__new_UnsafeCursor", "()Lvv/e$a;", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e.a f208324a = new e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f208325b = -1234567890;

    public static final boolean a(byte[] bArr, int i15, byte[] bArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            if (bArr[i18 + i15] != bArr2[i18 + i16]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j15, long j16, long j17) {
        if ((j16 | j17) < 0 || j16 > j15 || j15 - j16 < j17) {
            throw new ArrayIndexOutOfBoundsException("size=" + j15 + " offset=" + j16 + " byteCount=" + j17);
        }
    }

    public static final int c() {
        return f208325b;
    }

    public static final int d(h hVar, int i15) {
        return i15 == f208325b ? hVar.Q() : i15;
    }

    public static final int e(byte[] bArr, int i15) {
        return i15 == f208325b ? bArr.length : i15;
    }

    public static final int f(int i15) {
        return ((i15 & GF2Field.MASK) << 24) | (((-16777216) & i15) >>> 24) | ((16711680 & i15) >>> 8) | ((65280 & i15) << 8);
    }

    public static final long g(long j15) {
        return ((j15 & 255) << 56) | (((-72057594037927936L) & j15) >>> 56) | ((71776119061217280L & j15) >>> 40) | ((280375465082880L & j15) >>> 24) | ((1095216660480L & j15) >>> 8) | ((4278190080L & j15) << 8) | ((16711680 & j15) << 24) | ((65280 & j15) << 40);
    }

    public static final short h(short s15) {
        return (short) (((s15 & 255) << 8) | ((65280 & s15) >>> 8));
    }

    public static final String i(byte b15) {
        return fu.r.y(new char[]{wv.b.d()[(b15 >> 4) & 15], wv.b.d()[b15 & 15]});
    }

    public static final String j(int i15) {
        if (i15 == 0) {
            return com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
        }
        int i16 = 0;
        char[] cArr = {wv.b.d()[(i15 >> 28) & 15], wv.b.d()[(i15 >> 24) & 15], wv.b.d()[(i15 >> 20) & 15], wv.b.d()[(i15 >> 16) & 15], wv.b.d()[(i15 >> 12) & 15], wv.b.d()[(i15 >> 8) & 15], wv.b.d()[(i15 >> 4) & 15], wv.b.d()[i15 & 15]};
        while (i16 < 8 && cArr[i16] == '0') {
            i16++;
        }
        return fu.r.z(cArr, i16, 8);
    }
}
