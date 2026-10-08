package cd4;

import iw0.BEDictionary;
import iw0.BEDictionaryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk3.Dictionary;
import kk3.DictionaryResponse;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Liw0/a;", "Lkk3/a;", "b", "(Liw0/a;)Lkk3/a;", "Liw0/b;", "Lkk3/c;", "c", "(Liw0/b;)Lkk3/c;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final Dictionary b(BEDictionary bEDictionary) {
        return new Dictionary(kk3.b.b(bEDictionary.getCode()), bEDictionary.getDescription(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DictionaryResponse c(BEDictionaryResponse bEDictionaryResponse) {
        List<BEDictionary> listA = bEDictionaryResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((BEDictionary) it.next()));
        }
        return new DictionaryResponse(arrayList);
    }
}
