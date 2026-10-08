package eh;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends m1 {
    v0(Iterator it) {
        super(it);
    }

    @Override // eh.m1
    final /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
