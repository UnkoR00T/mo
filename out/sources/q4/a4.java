package q4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"", "Lq4/z3;", "range", "", "e", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "", "start", "end", "b", "(II)J", "index", "a", "(I)J", "minimumValue", "maximumValue", "c", "(JII)J", "", "d", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a4 {
    public static final long a(int i15) {
        return b(i15, i15);
    }

    public static final long b(int i15, int i16) {
        return z3.c(d(i15, i16));
    }

    public static final long c(long j15, int i15, int i16) {
        int iN = z3.n(j15);
        if (iN < i15) {
            iN = i15;
        }
        if (iN > i16) {
            iN = i16;
        }
        int i17 = z3.i(j15);
        if (i17 >= i15) {
            i15 = i17;
        }
        if (i15 <= i16) {
            i16 = i15;
        }
        return (iN == z3.n(j15) && i16 == z3.i(j15)) ? j15 : b(iN, i16);
    }

    private static final long d(int i15, int i16) {
        if (!(i15 >= 0 && i16 >= 0)) {
            w4.a.a("start and end cannot be negative. [start: " + i15 + ", end: " + i16 + ']');
        }
        return (((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32);
    }

    public static final String e(CharSequence charSequence, long j15) {
        return charSequence.subSequence(z3.l(j15), z3.k(j15)).toString();
    }
}
