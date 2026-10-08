package cn;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.y;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class h {
    static String a(List list) {
        Iterator it = list.iterator();
        float fE = 0.0f;
        String strG = "und";
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (fE < yVar.E()) {
                fE = yVar.E();
                strG = yVar.G();
            }
        }
        return strG;
    }
}
