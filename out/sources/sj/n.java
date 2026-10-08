package sj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f181977a = new HashSet(Arrays.asList("app_update", "review"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f181978b = new HashSet(Arrays.asList("native", "unity"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f181979c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f181980d = new p("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        try {
            map = f181979c;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (Map) map.get("app_update");
    }
}
