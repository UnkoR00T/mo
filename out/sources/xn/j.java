package xn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Map<i, Set<f>> f219910a;

    static {
        HashMap map = new HashMap();
        map.put(i.f219907b, new HashSet(Arrays.asList(f.SIGN, f.VERIFY)));
        map.put(i.f219908c, new HashSet(Arrays.asList(f.ENCRYPT, f.DECRYPT, f.WRAP_KEY, f.UNWRAP_KEY)));
        f219910a = Collections.unmodifiableMap(map);
    }

    static boolean a(i iVar, Set<f> set) {
        if (iVar != null && set != null) {
            Map<i, Set<f>> map = f219910a;
            if (map.containsKey(iVar) && !map.get(iVar).containsAll(set)) {
                return false;
            }
        }
        return true;
    }
}
