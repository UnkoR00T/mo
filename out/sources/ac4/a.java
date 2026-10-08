package ac4;

import ju.g1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J>\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H¦B¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lac4/a;", "", "RESULT", "Ltq/i;", "dispatcher", "Lkotlin/Function1;", "Ltq/e;", "block", "b", "(Ltq/i;Ler/l;Ltq/e;)Ljava/lang/Object;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object a(a aVar, tq.i iVar, er.l lVar, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i15 & 1) != 0) {
            iVar = g1.a();
        }
        return aVar.b(iVar, lVar, eVar);
    }

    <RESULT> Object b(tq.i iVar, er.l<? super tq.e<? super RESULT>, ? extends Object> lVar, tq.e<? super RESULT> eVar);
}
