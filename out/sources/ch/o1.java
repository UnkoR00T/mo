package ch;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class o1 extends f2 {
    o1(Iterator it) {
        super(it);
    }

    @Override // ch.f2
    final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
