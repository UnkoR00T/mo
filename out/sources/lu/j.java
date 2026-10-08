package lu;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "Llu/a;", "onBufferOverflow", "Lkotlin/Function1;", "Loq/i0;", "onUndeliveredElement", "Llu/g;", "a", "(ILlu/a;Ler/l;)Llu/g;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final <E> g<E> a(int i15, a aVar, er.l<? super E, i0> lVar) {
        if (i15 == -2) {
            return aVar == a.SUSPEND ? new e(g.INSTANCE.a(), lVar) : new s(1, aVar, lVar);
        }
        if (i15 == -1) {
            if (aVar == a.SUSPEND) {
                return new s(1, a.DROP_OLDEST, lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i15 == 0) {
            return aVar == a.SUSPEND ? new e(0, lVar) : new s(1, aVar, lVar);
        }
        if (i15 != Integer.MAX_VALUE) {
            return aVar == a.SUSPEND ? new e(i15, lVar) : new s(i15, aVar, lVar);
        }
        return new e(Integer.MAX_VALUE, lVar);
    }

    public static /* synthetic */ g b(int i15, a aVar, er.l lVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 0;
        }
        if ((i16 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i16 & 4) != 0) {
            lVar = null;
        }
        return a(i15, aVar, lVar);
    }
}
