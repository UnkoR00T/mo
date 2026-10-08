package xn;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class k extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Set<a> f219911x = Collections.unmodifiableSet(new HashSet(Arrays.asList(a.f219835j, a.f219836k, a.f219837l, a.f219838m)));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f219912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final io.c f219913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final byte[] f219914t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.c f219915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final byte[] f219916w;

    public k(a aVar, io.c cVar, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar2, io.c cVar3, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219904f, iVar, set, bVar, str, uri, cVar2, cVar3, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(aVar, "The curve must not be null");
        if (!f219911x.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        this.f219912r = aVar;
        Objects.requireNonNull(cVar, "The x parameter must not be null");
        this.f219913s = cVar;
        this.f219914t = cVar.a();
        this.f219915v = null;
        this.f219916w = null;
    }

    public static k E(Map<String, Object> map) throws ParseException {
        h hVar = h.f219904f;
        if (!hVar.equals(e.g(map))) {
            throw new ParseException("The key type kty must be " + hVar.a(), 0);
        }
        try {
            a aVarE = a.e(io.k.h(map, "crv"));
            io.c cVarA = io.k.a(map, "x");
            io.c cVarA2 = io.k.a(map, "d");
            try {
                return cVarA2 == null ? new k(aVarE, cVarA, e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), null) : new k(aVarE, cVarA, cVarA2, e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), null);
            } catch (Exception e15) {
                throw new ParseException(e15.getMessage(), 0);
            }
        } catch (IllegalArgumentException e16) {
            throw new ParseException(e16.getMessage(), 0);
        }
    }

    public a C() {
        return this.f219912r;
    }

    public io.c D() {
        return this.f219913s;
    }

    @Override // xn.d
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public k A() {
        return new k(C(), D(), i(), e(), a(), d(), p(), o(), n(), m(), b(), j(), c(), f(), g());
    }

    @Override // xn.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f219912r, kVar.f219912r) && Objects.equals(this.f219913s, kVar.f219913s) && Arrays.equals(this.f219914t, kVar.f219914t) && Objects.equals(this.f219915v, kVar.f219915v) && Arrays.equals(this.f219916w, kVar.f219916w);
    }

    @Override // xn.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f219912r, this.f219913s, this.f219915v) * 31) + Arrays.hashCode(this.f219914t)) * 31) + Arrays.hashCode(this.f219916w);
    }

    @Override // xn.d
    public boolean r() {
        return this.f219915v != null;
    }

    @Override // xn.d
    public Map<String, Object> w() {
        Map<String, Object> mapW = super.w();
        mapW.put("crv", this.f219912r.toString());
        mapW.put("x", this.f219913s.toString());
        io.c cVar = this.f219915v;
        if (cVar != null) {
            mapW.put("d", cVar.toString());
        }
        return mapW;
    }

    public k(a aVar, io.c cVar, io.c cVar2, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar3, io.c cVar4, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219904f, iVar, set, bVar, str, uri, cVar3, cVar4, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(aVar, "The curve must not be null");
        if (f219911x.contains(aVar)) {
            this.f219912r = aVar;
            Objects.requireNonNull(cVar, "The x parameter must not be null");
            this.f219913s = cVar;
            this.f219914t = cVar.a();
            Objects.requireNonNull(cVar2, "The d parameter must not be null");
            this.f219915v = cVar2;
            this.f219916w = cVar2.a();
            return;
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
    }
}
