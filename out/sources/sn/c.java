package sn;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class c extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final URI f182425h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final xn.d f182426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final URI f182427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.c f182428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.c f182429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<io.a> f182430n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f182431p;

    protected c(b bVar, j jVar, String str, Set<String> set, URI uri, xn.d dVar, URI uri2, io.c cVar, io.c cVar2, List<io.a> list, String str2, Map<String, Object> map, io.c cVar3) {
        super(bVar, jVar, str, set, map, cVar3);
        this.f182425h = uri;
        this.f182426j = dVar;
        this.f182427k = uri2;
        this.f182428l = cVar;
        this.f182429m = cVar2;
        if (list != null) {
            this.f182430n = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.f182430n = null;
        }
        this.f182431p = str2;
    }

    static xn.d s(Map<String, Object> map) throws ParseException {
        if (map == null) {
            return null;
        }
        xn.d dVarU = xn.d.u(map);
        if (dVarU.r()) {
            throw new ParseException("Non-public key in jwk header parameter", 0);
        }
        return dVarU;
    }

    @Override // sn.g
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        URI uri = this.f182425h;
        if (uri != null) {
            mapI.put("jku", uri.toString());
        }
        xn.d dVar = this.f182426j;
        if (dVar != null) {
            mapI.put("jwk", dVar.w());
        }
        URI uri2 = this.f182427k;
        if (uri2 != null) {
            mapI.put("x5u", uri2.toString());
        }
        io.c cVar = this.f182428l;
        if (cVar != null) {
            mapI.put("x5t", cVar.toString());
        }
        io.c cVar2 = this.f182429m;
        if (cVar2 != null) {
            mapI.put("x5t#S256", cVar2.toString());
        }
        List<io.a> list = this.f182430n;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f182430n.size());
            Iterator<io.a> it = this.f182430n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            mapI.put("x5c", arrayList);
        }
        String str = this.f182431p;
        if (str != null) {
            mapI.put("kid", str);
        }
        return mapI;
    }

    public xn.d j() {
        return this.f182426j;
    }

    public URI k() {
        return this.f182425h;
    }

    public String m() {
        return this.f182431p;
    }

    public List<io.a> n() {
        return this.f182430n;
    }

    public io.c o() {
        return this.f182429m;
    }

    @Deprecated
    public io.c p() {
        return this.f182428l;
    }

    public URI r() {
        return this.f182427k;
    }
}
