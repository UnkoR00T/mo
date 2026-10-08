package ew0;

import fw0.DictionaryDto;
import fw0.DictionaryResponse;
import iw0.BEDictionary;
import iw0.BEDictionaryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfw0/u;", "Liw0/a;", "a", "(Lfw0/u;)Liw0/a;", "Lfw0/v;", "Liw0/b;", "b", "(Lfw0/v;)Liw0/b;", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final BEDictionary a(DictionaryDto dictionaryDto) {
        return new BEDictionary(dictionaryDto.getCode(), dictionaryDto.getDescription());
    }

    public static final BEDictionaryResponse b(DictionaryResponse dictionaryResponse) {
        List<DictionaryDto> listA = dictionaryResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((DictionaryDto) it.next()));
        }
        return new BEDictionaryResponse(arrayList);
    }
}
