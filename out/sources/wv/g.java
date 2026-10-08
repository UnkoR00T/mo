package wv;

import p071kotlin.Metadata;
import vv.i0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "value", "fromIndex", "toIndex", "a", "([IIII)I", "Lvv/i0;", "pos", "b", "(Lvv/i0;I)I", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final int a(int[] iArr, int i15, int i16, int i17) {
        int i18 = i17 - 1;
        while (i16 <= i18) {
            int i19 = (i16 + i18) >>> 1;
            int i25 = iArr[i19];
            if (i25 < i15) {
                i16 = i19 + 1;
            } else {
                if (i25 <= i15) {
                    return i19;
                }
                i18 = i19 - 1;
            }
        }
        return (-i16) - 1;
    }

    public static final int b(i0 i0Var, int i15) {
        int iA = a(i0Var.getDirectory(), i15 + 1, 0, i0Var.getSegments().length);
        return iA >= 0 ? iA : ~iA;
    }
}
