package ch;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 {
    static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
