package d00;

import er.l;
import p071kotlin.Metadata;
import tq.e;
import wy.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Ld00/a;", "Lwy/c;", "T", "", "id", "", "timeout", "Lkotlin/Function1;", "Ltq/e;", "", "call", "V", "(IJLer/l;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "n", "(I)V", "memory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends c {
    static /* synthetic */ Object p(a aVar, int i15, long j15, l lVar, e eVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cache");
        }
        if ((i16 & 1) != 0) {
            i15 = -1;
        }
        if ((i16 & 2) != 0) {
            j15 = Long.MAX_VALUE;
        }
        return aVar.V(i15, j15, lVar, eVar);
    }

    <T> Object V(int i15, long j15, l<? super e<? super T>, ? extends Object> lVar, e<? super T> eVar);

    void n(int id5);
}
