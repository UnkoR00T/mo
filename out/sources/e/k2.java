package e;

import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv/t3;", "", "", "", "a", "(Lv/t3;)Ljava/util/Map;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k2 {
    public static final Map<String, Object> a(t3 t3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : t3Var.e()) {
            linkedHashMap.put(str, t3Var.d(str));
        }
        return linkedHashMap;
    }
}
