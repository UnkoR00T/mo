package q00;

import ay.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lq00/e;", "Lay/i;", "<init>", "()V", "", "fieldReference", "jsonValue", "Lcom/google/gson/l;", "h", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/l;", "Lcom/google/gson/o;", "jsonObject", "prefix", "", "f", "(Lcom/google/gson/o;Ljava/lang/String;)Ljava/util/Map;", "targetKey", "e", "(Lcom/google/gson/o;Ljava/lang/String;)Lcom/google/gson/l;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "json", "a", "(Ljava/lang/String;)Ljava/util/Map;", "flattenMap", "d", "(Ljava/util/Map;)Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements i {
    private final l e(o jsonObject, String targetKey) {
        l lVarE;
        if (jsonObject == null) {
            return null;
        }
        for (Map.Entry<String, l> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            l value = entry.getValue();
            if (!value.k()) {
                if (t.c(key, targetKey)) {
                    return value;
                }
                if (value.l() && (lVarE = e(value.f(), targetKey)) != null) {
                    return lVarE;
                }
            }
        }
        return null;
    }

    private final Map<String, String> f(o jsonObject, String prefix) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, l> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            l value = entry.getValue();
            if (prefix.length() != 0) {
                key = prefix + '.' + key;
            }
            if (value.l()) {
                linkedHashMap.putAll(f(value.f(), key));
            } else if (value.k()) {
                linkedHashMap.put(key, "");
            } else {
                linkedHashMap.put(key, value.i());
            }
        }
        return linkedHashMap;
    }

    static /* synthetic */ Map g(e eVar, o oVar, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = "";
        }
        return eVar.f(oVar, str);
    }

    private final l h(String fieldReference, String jsonValue) {
        List listV0;
        String str;
        if (fieldReference == null || (listV0 = r.V0(fieldReference, new String[]{"."}, false, 0, 6, null)) == null || (str = (String) v.x0(listV0)) == null) {
            return null;
        }
        return e(q.d(jsonValue).f(), str);
    }

    @Override // ay.i
    public Map<String, String> a(String json) {
        return g(this, q.d(json).f(), null, 2, null);
    }

    @Override // ay.i
    public String b(String fieldReference, String jsonValue) {
        l lVarH = h(fieldReference, jsonValue);
        if (lVarH != null) {
            return lVarH.i();
        }
        return null;
    }

    @Override // ay.i
    public List<String> c(String fieldReference, String jsonValue) {
        com.google.gson.i iVarE;
        l lVarH = h(fieldReference, jsonValue);
        if (lVarH == null || (iVarE = lVarH.e()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(v.y(iVarE, 10));
        Iterator<l> it = iVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().i());
        }
        return arrayList;
    }

    @Override // ay.i
    public String d(Map<String, String> flattenMap) {
        o oVar = new o();
        for (Map.Entry<String, String> entry : flattenMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            List listV0 = r.V0(key, new String[]{"."}, false, 0, 6, null);
            int size = listV0.size() - 1;
            o oVarU = oVar;
            for (int i15 = 0; i15 < size; i15++) {
                String str = (String) listV0.get(i15);
                if (!oVarU.v(str) || !oVarU.t(str).l()) {
                    oVarU.o(str, new o());
                }
                oVarU = oVarU.u(str);
            }
            String str2 = (String) v.x0(listV0);
            if (value.length() == 0) {
                oVarU.o(str2, n.f36856a);
            } else {
                oVarU.s(str2, value);
            }
        }
        return oVar.toString();
    }
}
