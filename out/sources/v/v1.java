package v;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    public static void a(List<u1> list) {
        Iterator<u1> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void b(List<u1> list) throws u1.a {
        if (list.isEmpty()) {
            return;
        }
        int i15 = 0;
        do {
            try {
                list.get(i15).l();
                i15++;
            } catch (u1.a e15) {
                for (int i16 = i15 - 1; i16 >= 0; i16--) {
                    list.get(i16).e();
                }
                throw e15;
            }
        } while (i15 < list.size());
    }
}
