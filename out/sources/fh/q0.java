package fh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {
    static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
