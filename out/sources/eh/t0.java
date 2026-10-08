package eh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {
    static void a(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
