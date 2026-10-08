package jr;

import lr.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljr/c;", "Llr/i;", "range", "", "e", "(Ljr/c;Llr/i;)I", "value", "d", "(I)I", "bitCount", "f", "(II)I", "from", "until", "Loq/i0;", "c", "(II)V", "", "b", "(DD)V", "", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class d {
    public static final String a(Object obj, Object obj2) {
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(double d15, double d16) {
        if (d16 <= d15) {
            throw new IllegalArgumentException(a(Double.valueOf(d15), Double.valueOf(d16)).toString());
        }
    }

    public static final void c(int i15, int i16) {
        if (i16 <= i15) {
            throw new IllegalArgumentException(a(Integer.valueOf(i15), Integer.valueOf(i16)).toString());
        }
    }

    public static final int d(int i15) {
        return 31 - Integer.numberOfLeadingZeros(i15);
    }

    public static final int e(c cVar, i iVar) {
        if (!iVar.isEmpty()) {
            if (iVar.getLast() < Integer.MAX_VALUE) {
                return cVar.g(iVar.getFirst(), iVar.getLast() + 1);
            }
            return iVar.getFirst() > Integer.MIN_VALUE ? cVar.g(iVar.getFirst() - 1, iVar.getLast()) + 1 : cVar.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + iVar);
    }

    public static final int f(int i15, int i16) {
        return (i15 >>> (32 - i16)) & ((-i16) >> 31);
    }
}
