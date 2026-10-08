package r2;

import e3.ComposeStackTraceFrame;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0012\u001a\u00060\u0000j\u0002`\u000e*\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0000j\u0002`\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u00002\n\u0010\u0015\u001a\u00060\u0000j\u0002`\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\u00020\u00192\n\u0010\u001a\u001a\u00060\u0000j\u0002`\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#*\f\b\u0000\u0010%\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010&\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010'\"\u00020\u00002\u00020\u0000¨\u0006("}, d2 = {"", "capacity", "", "i", "(I)[I", "offset", "Loq/i0;", "h", "([II)V", "", "", "j", "(I)[Ljava/lang/Object;", "key", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "parent", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "g", "([IIII)I", "Landroidx/compose/runtime/composer/linkbuffer/SlotAddress;", "address", "size", "k", "(II)I", "Lr2/q;", "group", "child", "Le3/b;", "traceBuilder", "", "Le3/d;", "f", "(Lr2/q;ILjava/lang/Object;Le3/b;)Ljava/util/List;", "a", "Ljava/lang/Object;", "Unallocated", "GroupAddress", "SlotAddress", "SlotRange", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f170802a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"r2/p$a", "", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "Unallocated";
        }
    }

    public static final List<ComposeStackTraceFrame> f(q qVar, int i15, Object obj, e3.b bVar) {
        int[] iArrN = qVar.n();
        int i16 = i15;
        while (i16 > 0) {
            int i17 = qVar.n()[i16 + 4];
            bVar.f(qVar.n()[i16], (i17 & 16777216) == 16777216 ? qVar.p()[(qVar.n()[i16 + 5] >> 4) + Integer.bitCount(i17 & 8388608)] : null, qVar.F(i16), obj);
            obj = qVar.d(i16);
            i16 = iArrN[i16 + 2];
        }
        if (!(i16 != 0)) {
            p076m2.t.b("Traversing parent of group not in the slot table: " + i15);
        }
        return bVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int[] iArr, int i15, int i16, int i17) {
        if (iArr == null || iArr.length < 6) {
            return -1;
        }
        int i18 = iArr[3];
        if (i18 >= iArr.length) {
            i18 = iArr[1];
            if (i18 < 0) {
                return -1;
            }
            iArr[1] = iArr[i18 + 1];
        } else {
            iArr[3] = i18 + 6;
        }
        iArr[i18] = i15;
        iArr[i18 + 2] = i16;
        iArr[i18 + 1] = -1;
        iArr[i18 + 3] = -1;
        iArr[i18 + 4] = i17;
        iArr[i18 + 5] = -1;
        return i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int[] iArr, int i15) {
        if (iArr == null) {
            return;
        }
        iArr[1] = -1;
        iArr[3] = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] i(int i15) {
        int[] iArr = new int[i15];
        iArr[1] = -1;
        h(iArr, 6);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(int i15) {
        Object[] objArr = new Object[i15];
        pq.n.E(objArr, f170802a, 0, 0, 6, null);
        return objArr;
    }

    public static final int k(int i15, int i16) {
        return (i15 << 4) | (i16 <= 15 ? i16 - 1 : 15);
    }
}
