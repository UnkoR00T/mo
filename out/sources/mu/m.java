package mu;

import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Lmu/g;", "", "capacity", "Llu/a;", "onBufferOverflow", "a", "(Lmu/g;ILlu/a;)Lmu/g;", "d", "(Lmu/g;)Lmu/g;", "Ltq/i;", "context", "e", "(Lmu/g;Ltq/i;)Lmu/g;", "Loq/i0;", "c", "(Ltq/i;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class m {
    public static final <T> g<T> a(g<? extends T> gVar, int i15, lu.a aVar) {
        if (i15 < 0 && i15 != -2 && i15 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i15).toString());
        }
        if (i15 == -1 && aVar != lu.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i15 == -1) {
            aVar = lu.a.DROP_OLDEST;
            i15 = 0;
        }
        int i16 = i15;
        lu.a aVar2 = aVar;
        if (gVar instanceof p086nu.r) {
            return nu.r.a.a((p086nu.r) gVar, null, i16, aVar2, 1, null);
        }
        return new p086nu.i(gVar, null, i16, aVar2, 2, null);
    }

    public static /* synthetic */ g b(g gVar, int i15, lu.a aVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = -2;
        }
        if ((i16 & 2) != 0) {
            aVar = lu.a.SUSPEND;
        }
        return i.c(gVar, i15, aVar);
    }

    private static final void c(tq.i iVar) {
        if (iVar.m(d2.INSTANCE) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final <T> g<T> d(g<? extends T> gVar) {
        return b(gVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> e(g<? extends T> gVar, tq.i iVar) {
        c(iVar);
        if (fr.t.c(iVar, tq.j.f191408a)) {
            return gVar;
        }
        if (gVar instanceof p086nu.r) {
            return nu.r.a.a((p086nu.r) gVar, iVar, 0, null, 6, null);
        }
        return new p086nu.i(gVar, iVar, 0, null, 12, null);
    }
}
