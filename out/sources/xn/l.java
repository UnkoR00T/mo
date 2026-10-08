package xn;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.c f219917r;

    public l(io.c cVar, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar2, io.c cVar3, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219903e, iVar, set, bVar, str, uri, cVar2, cVar3, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(cVar, "The key value must not be null");
        this.f219917r = cVar;
    }

    public static l C(Map<String, Object> map) throws ParseException {
        h hVar = h.f219903e;
        if (hVar.equals(e.g(map))) {
            try {
                return new l(io.k.a(map, "k"), e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), null);
            } catch (Exception e15) {
                throw new ParseException(e15.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + hVar.a(), 0);
    }

    @Override // xn.d
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public l A() {
        return null;
    }

    @Override // xn.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && super.equals(obj)) {
            return Objects.equals(this.f219917r, ((l) obj).f219917r);
        }
        return false;
    }

    @Override // xn.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f219917r);
    }

    @Override // xn.d
    public boolean r() {
        return true;
    }

    @Override // xn.d
    public Map<String, Object> w() {
        Map<String, Object> mapW = super.w();
        mapW.put("k", this.f219917r.toString());
        return mapW;
    }
}
