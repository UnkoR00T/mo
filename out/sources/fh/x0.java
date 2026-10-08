package fh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends o1 {
    x0(Iterator it) {
        super(it);
    }

    @Override // fh.o1
    final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
