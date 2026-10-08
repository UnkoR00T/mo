package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0019\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001b\u001a'\u0010 \u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"", "widthVal", "heightVal", "Loq/i0;", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lc5/b;", "h", "(IIII)J", "c", "(I)I", "a", "otherConstraints", "e", "(JJ)J", "Lc5/r;", "d", "width", "g", "(JI)I", "height", "f", "horizontal", "vertical", "i", "(JII)J", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final long a(int i15, int i16, int i17, int i18) {
        if (!((i17 >= 0) & (i16 >= i15) & (i18 >= i17) & (i15 >= 0))) {
            m.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i15, i16, i17, i18);
    }

    public static /* synthetic */ long b(int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = 0;
        }
        if ((i19 & 2) != 0) {
            i16 = Integer.MAX_VALUE;
        }
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = Integer.MAX_VALUE;
        }
        return a(i15, i16, i17, i18);
    }

    public static final int c(int i15) {
        if (i15 < 8191) {
            return 13;
        }
        if (i15 < 32767) {
            return 15;
        }
        if (i15 < 65535) {
            return 16;
        }
        if (i15 < 262143) {
            return 18;
        }
        return GF2Field.MASK;
    }

    public static final long d(long j15, long j16) {
        int i15 = (int) (j16 >> 32);
        int iN = b.n(j15);
        int iL = b.l(j15);
        if (i15 < iN) {
            i15 = iN;
        }
        if (i15 <= iL) {
            iL = i15;
        }
        int i16 = (int) (j16 & BodyPartID.bodyIdMax);
        int iM = b.m(j15);
        int iK = b.k(j15);
        if (i16 < iM) {
            i16 = iM;
        }
        if (i16 <= iK) {
            iK = i16;
        }
        return r.c((((long) iL) << 32) | (((long) iK) & BodyPartID.bodyIdMax));
    }

    public static final long e(long j15, long j16) {
        int iN = b.n(j15);
        int iL = b.l(j15);
        int iM = b.m(j15);
        int iK = b.k(j15);
        int iN2 = b.n(j16);
        if (iN2 < iN) {
            iN2 = iN;
        }
        if (iN2 > iL) {
            iN2 = iL;
        }
        int iL2 = b.l(j16);
        if (iL2 >= iN) {
            iN = iL2;
        }
        if (iN <= iL) {
            iL = iN;
        }
        int iM2 = b.m(j16);
        if (iM2 < iM) {
            iM2 = iM;
        }
        if (iM2 > iK) {
            iM2 = iK;
        }
        int iK2 = b.k(j16);
        if (iK2 >= iM) {
            iM = iK2;
        }
        if (iM <= iK) {
            iK = iM;
        }
        return a(iN2, iL, iM2, iK);
    }

    public static final int f(long j15, int i15) {
        int iM = b.m(j15);
        int iK = b.k(j15);
        if (i15 < iM) {
            i15 = iM;
        }
        return i15 > iK ? iK : i15;
    }

    public static final int g(long j15, int i15) {
        int iN = b.n(j15);
        int iL = b.l(j15);
        if (i15 < iN) {
            i15 = iN;
        }
        return i15 > iL ? iL : i15;
    }

    public static final long h(int i15, int i16, int i17, int i18) {
        int i19 = i18 == Integer.MAX_VALUE ? i17 : i18;
        int iC = c(i19);
        int i25 = i16 == Integer.MAX_VALUE ? i15 : i16;
        int iC2 = c(i25);
        if (iC + iC2 > 31) {
            k(i25, i19);
        }
        int i26 = i16 + 1;
        int i27 = i18 + 1;
        int i28 = iC2 - 13;
        return b.b((((long) (i26 & (~(i26 >> 31)))) << 33) | ((long) ((i28 >> 1) + (i28 & 1))) | (((long) i15) << 2) | (((long) i17) << (iC2 + 2)) | (((long) (i27 & (~(i27 >> 31)))) << (iC2 + 33)));
    }

    public static final long i(long j15, int i15, int i16) {
        int iN = b.n(j15) + i15;
        if (iN < 0) {
            iN = 0;
        }
        int iL = b.l(j15);
        if (iL != Integer.MAX_VALUE && (iL = iL + i15) < 0) {
            iL = 0;
        }
        int iM = b.m(j15) + i16;
        if (iM < 0) {
            iM = 0;
        }
        int iK = b.k(j15);
        return a(iN, iL, iM, (iK == Integer.MAX_VALUE || (iK = iK + i16) >= 0) ? iK : 0);
    }

    public static /* synthetic */ long j(long j15, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        return i(j15, i15, i16);
    }

    public static final void k(int i15, int i16) {
        throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i16 + " in Constraints");
    }

    public static final Void l(int i15) {
        throw new IllegalArgumentException("Can't represent a size of " + i15 + " in Constraints");
    }
}
