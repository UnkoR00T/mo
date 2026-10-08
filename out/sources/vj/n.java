package vj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f207116a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f207116a = new HashMap();
        new wj.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f207116a;
        map.put("java", 20002);
        return map;
    }
}
