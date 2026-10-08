package p2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p071kotlin.Metadata;
import p076m2.i5;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0004\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a#\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0004\u001a#\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001aK\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010!\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010#\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0000¢\u0006\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0018\u00101\u001a\u00020\u0001*\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"", "", "address", "v", "([II)I", "", "value", "Loq/i0;", "B", "([IIZ)V", "z", "p", "x", "C", "([III)V", "s", "A", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "t", "([IIIZZZII)V", "Ljava/util/ArrayList;", "Lp2/c;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "q", "(Ljava/util/ArrayList;II)Lp2/c;", "location", "w", "(Ljava/util/ArrayList;II)I", "u", "y", "()V", "Lm2/i5;", "Lp2/l;", "o", "(Lm2/i5;)Lp2/l;", "", "a", "[J", "EmptyLongArray", "Lp2/o;", "r", "(Lp2/o;)I", "nextGroup", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f151716a = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(int[] iArr, int i15, int i16) {
        iArr[(i15 * 5) + 3] = i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(int[] iArr, int i15, boolean z15) {
        int i16 = (i15 * 5) + 1;
        iArr[i16] = ((z15 ? 1 : 0) << 27) | (iArr[i16] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(int[] iArr, int i15, int i16) {
        if (i16 >= 0) {
        }
        int i17 = (i15 * 5) + 1;
        iArr[i17] = i16 | (iArr[i17] & (-67108864));
    }

    public static final l o(i5 i5Var) {
        l lVar = i5Var instanceof l ? (l) i5Var : null;
        if (lVar != null) {
            return lVar;
        }
        t.c("Inconsistent composition");
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int[] iArr, int i15) {
        int i16 = i15 * 5;
        return i16 >= iArr.length ? iArr.length : iArr[i16 + 4] + Integer.bitCount(iArr[i16 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c q(ArrayList<c> arrayList, int i15, int i16) {
        int iW = w(arrayList, i15, i16);
        if (iW >= 0) {
            return arrayList.get(iW);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.l0(slotWriter.getCurrentGroup());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(int[] iArr, int i15) {
        return iArr[(i15 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(int[] iArr, int i15, int i16, boolean z15, boolean z16, boolean z17, int i17, int i18) {
        int i19 = i15 * 5;
        iArr[i19] = i16;
        iArr[i19 + 1] = ((z15 ? 1 : 0) << 30) | ((z16 ? 1 : 0) << 29) | ((z17 ? 1 : 0) << 28);
        iArr[i19 + 2] = i17;
        iArr[i19 + 3] = 0;
        iArr[i19 + 4] = i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(ArrayList<c> arrayList, int i15, int i16) {
        int iW = w(arrayList, i15, i16);
        return iW >= 0 ? iW : -(iW + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(int[] iArr, int i15) {
        int i16 = i15 * 5;
        return iArr[i16 + 4] + Integer.bitCount(iArr[i16 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(ArrayList<c> arrayList, int i15, int i16) {
        int size = arrayList.size() - 1;
        int i17 = 0;
        while (i17 <= size) {
            int i18 = (i17 + size) >>> 1;
            int iB = arrayList.get(i18).getLocation();
            if (iB < 0) {
                iB += i16;
            }
            int iD = fr.t.d(iB, i15);
            if (iD < 0) {
                i17 = i18 + 1;
            } else {
                if (iD <= 0) {
                    return i18;
                }
                size = i18 - 1;
            }
        }
        return -(i17 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(int[] iArr, int i15) {
        int i16 = i15 * 5;
        return iArr[i16 + 4] + Integer.bitCount(iArr[i16 + 1] >> 28);
    }

    public static final void y() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(int[] iArr, int i15, boolean z15) {
        int i16 = (i15 * 5) + 1;
        iArr[i16] = ((z15 ? 1 : 0) << 26) | (iArr[i16] & (-67108865));
    }
}
