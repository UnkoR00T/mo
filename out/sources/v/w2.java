package v;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w2 extends t3 {
    private w2(Map<String, Object> map) {
        super(map);
    }

    public static w2 g() {
        return new w2(new ArrayMap());
    }

    public void f(t3 t3Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f202853a;
        if (map2 == null || (map = t3Var.f202853a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void h(String str, Object obj) {
        this.f202853a.put(str, obj);
    }
}
