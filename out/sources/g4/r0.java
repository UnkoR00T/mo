package g4;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr0/p0;", "Le4/a;", "a", "", "", "b", "", "c", "(Lr0/p0;Ljava/util/Map;)Z", "Lg4/g;", "Lg4/s0;", "type", "stopType", "Lf3/m$c;", "d", "(Lg4/g;II)Lf3/m$c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(r0.p0<p036e4.a> p0Var, Map<p036e4.a, Integer> map) {
        if (p0Var == null || p0Var.get_size() != map.size()) {
            return false;
        }
        Object[] objArr = p0Var.keys;
        int[] iArr = p0Var.values;
        long[] jArr = p0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        loop0: while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = objArr[i18];
                        int i19 = iArr[i18];
                        Integer num = map.get((p036e4.a) obj);
                        if (num == null || num.intValue() != i19) {
                            break loop0;
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m.c d(g gVar, int i15, int i16) {
        f3.m.c child = gVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i15) == 0) {
            return null;
        }
        while (child != null) {
            int kindSet = child.getKindSet();
            if ((kindSet & i16) != 0) {
                return null;
            }
            if ((kindSet & i15) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
