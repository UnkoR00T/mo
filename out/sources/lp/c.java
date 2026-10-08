package lp;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, po.b> f119059a = new ConcurrentHashMap();

    public static po.b a(String str) throws Throwable {
        Map<String, po.b> map = f119059a;
        po.b bVar = map.get(str);
        if (bVar != null) {
            return bVar;
        }
        po.b bVarR = new po.c().r(str);
        map.put(bVarR.g(), bVarR);
        return bVarR;
    }

    public static po.b b(InputStream inputStream) {
        if (inputStream != null) {
            return new po.c(true).j(inputStream);
        }
        return null;
    }
}
