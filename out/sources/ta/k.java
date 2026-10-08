package ta;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "K", "V", "Lr0/a;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "Loq/i0;", "fetchBlock", "a", "(Lr0/a;ZLer/l;)V", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
final /* synthetic */ class k {
    public static final <K, V> void a(r0.a<K, V> aVar, boolean z15, er.l<? super r0.a<K, V>, i0> lVar) {
        r0.a aVar2 = new r0.a(999);
        int size = aVar.getSize();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            if (z15) {
                aVar2.put(aVar.f(i15), aVar.k(i15));
            } else {
                aVar2.put(aVar.f(i15), null);
            }
            i15++;
            i16++;
            if (i16 == 999) {
                lVar.b(aVar2);
                if (!z15) {
                    aVar.putAll(aVar2);
                }
                aVar2.clear();
                i16 = 0;
            }
        }
        if (i16 > 0) {
            lVar.b(aVar2);
            if (z15) {
                return;
            }
            aVar.putAll(aVar2);
        }
    }
}
