package v;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t3 f202852b = new t3(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map<String, Object> f202853a;

    protected t3(Map<String, Object> map) {
        this.f202853a = map;
    }

    public static t3 a(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new t3(arrayMap);
    }

    public static t3 b() {
        return f202852b;
    }

    public static t3 c(t3 t3Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : t3Var.e()) {
            arrayMap.put(str, t3Var.d(str));
        }
        return new t3(arrayMap);
    }

    public Object d(String str) {
        return this.f202853a.get(str);
    }

    public Set<String> e() {
        return this.f202853a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
