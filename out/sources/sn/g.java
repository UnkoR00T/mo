package sn;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Object> f182444g = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f182445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f182446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f182447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f182448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f182449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.c f182450f;

    protected g(b bVar, j jVar, String str, Set<String> set, Map<String, Object> map, io.c cVar) {
        this.f182445a = bVar;
        this.f182446b = jVar;
        this.f182447c = str;
        if (set != null) {
            this.f182448d = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.f182448d = null;
        }
        if (map != null) {
            this.f182449e = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.f182449e = f182444g;
        }
        this.f182450f = cVar;
    }

    public static b g(Map<String, Object> map) throws ParseException {
        String strH = io.k.h(map, "alg");
        if (strH == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        b bVar = b.f182422c;
        if (strH.equals(bVar.a())) {
            return bVar;
        }
        return map.containsKey("enc") ? k.c(strH) : q.c(strH);
    }

    public b a() {
        return this.f182445a;
    }

    public String b() {
        return this.f182447c;
    }

    public Set<String> c() {
        return this.f182448d;
    }

    public Object d(String str) {
        return this.f182449e.get(str);
    }

    public Map<String, Object> e() {
        return this.f182449e;
    }

    public j f() {
        return this.f182446b;
    }

    public io.c h() {
        io.c cVar = this.f182450f;
        return cVar == null ? io.c.f(toString()) : cVar;
    }

    public Map<String, Object> i() {
        Map<String, Object> mapL = io.k.l();
        mapL.putAll(this.f182449e);
        b bVar = this.f182445a;
        if (bVar != null) {
            mapL.put("alg", bVar.toString());
        }
        j jVar = this.f182446b;
        if (jVar != null) {
            mapL.put("typ", jVar.toString());
        }
        String str = this.f182447c;
        if (str != null) {
            mapL.put("cty", str);
        }
        Set<String> set = this.f182448d;
        if (set != null && !set.isEmpty()) {
            mapL.put("crit", new ArrayList(this.f182448d));
        }
        return mapL;
    }

    public String toString() {
        return io.k.o(i());
    }
}
