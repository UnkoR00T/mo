package xn;

import io.n;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f219870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f219871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f> f219872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sn.b f219873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f219874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final URI f219875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private final io.c f219876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.c f219877h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<io.a> f219878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Date f219879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Date f219880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Date f219881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f219882n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<X509Certificate> f219883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final KeyStore f219884q;

    protected d(h hVar, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar, io.c cVar2, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        Objects.requireNonNull(hVar, "The key type \"kty\" parameter must not be null");
        this.f219870a = hVar;
        if (!j.a(iVar, set)) {
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        this.f219871b = iVar;
        this.f219872c = set;
        this.f219873d = bVar;
        this.f219874e = str;
        this.f219875f = uri;
        this.f219876g = cVar;
        this.f219877h = cVar2;
        if (list != null && list.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.f219878j = list;
        try {
            this.f219883p = n.a(list);
            this.f219879k = date;
            this.f219880l = date2;
            this.f219881m = date3;
            this.f219882n = gVar;
            this.f219884q = keyStore;
        } catch (ParseException e15) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e15.getMessage(), e15);
        }
    }

    public static d s(String str) {
        return u(io.k.m(str));
    }

    public static d t(X509Certificate x509Certificate) throws sn.h {
        if (x509Certificate.getPublicKey() instanceof RSAPublicKey) {
            return m.F(x509Certificate);
        }
        if (x509Certificate.getPublicKey() instanceof ECPublicKey) {
            return b.J(x509Certificate);
        }
        throw new sn.h("Unsupported public key algorithm: " + x509Certificate.getPublicKey().getAlgorithm());
    }

    public static d u(Map<String, Object> map) {
        String strH = io.k.h(map, "kty");
        if (strH == null) {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
        h hVarB = h.b(strH);
        if (hVarB == h.f219901c) {
            return b.K(map);
        }
        if (hVarB == h.f219902d) {
            return m.G(map);
        }
        if (hVarB == h.f219903e) {
            return l.C(map);
        }
        if (hVarB == h.f219904f) {
            return k.E(map);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: " + hVarB, 0);
    }

    public abstract d A();

    public m B() {
        return (m) this;
    }

    public sn.b a() {
        return this.f219873d;
    }

    public Date b() {
        return this.f219879k;
    }

    public Date c() {
        return this.f219881m;
    }

    public String d() {
        return this.f219874e;
    }

    public Set<f> e() {
        return this.f219872c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f219870a, dVar.f219870a) && Objects.equals(this.f219871b, dVar.f219871b) && Objects.equals(this.f219872c, dVar.f219872c) && Objects.equals(this.f219873d, dVar.f219873d) && Objects.equals(this.f219874e, dVar.f219874e) && Objects.equals(this.f219875f, dVar.f219875f) && Objects.equals(this.f219876g, dVar.f219876g) && Objects.equals(this.f219877h, dVar.f219877h) && Objects.equals(this.f219878j, dVar.f219878j) && Objects.equals(this.f219879k, dVar.f219879k) && Objects.equals(this.f219880l, dVar.f219880l) && Objects.equals(this.f219881m, dVar.f219881m) && Objects.equals(this.f219882n, dVar.f219882n) && Objects.equals(this.f219884q, dVar.f219884q);
    }

    public g f() {
        return this.f219882n;
    }

    public KeyStore g() {
        return this.f219884q;
    }

    public h h() {
        return this.f219870a;
    }

    public int hashCode() {
        return Objects.hash(this.f219870a, this.f219871b, this.f219872c, this.f219873d, this.f219874e, this.f219875f, this.f219876g, this.f219877h, this.f219878j, this.f219879k, this.f219880l, this.f219881m, this.f219882n, this.f219884q);
    }

    public i i() {
        return this.f219871b;
    }

    public Date j() {
        return this.f219880l;
    }

    public List<X509Certificate> k() {
        List<X509Certificate> list = this.f219883p;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<io.a> m() {
        List<io.a> list = this.f219878j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public io.c n() {
        return this.f219877h;
    }

    @Deprecated
    public io.c o() {
        return this.f219876g;
    }

    public URI p() {
        return this.f219875f;
    }

    public abstract boolean r();

    public String toString() {
        return io.k.o(w());
    }

    public b v() {
        return (b) this;
    }

    public Map<String, Object> w() {
        Map<String, Object> mapL = io.k.l();
        mapL.put("kty", this.f219870a.a());
        i iVar = this.f219871b;
        if (iVar != null) {
            mapL.put("use", iVar.b());
        }
        if (this.f219872c != null) {
            List<Object> listA = io.j.a();
            Iterator<f> it = this.f219872c.iterator();
            while (it.hasNext()) {
                listA.add(it.next().e());
            }
            mapL.put("key_ops", listA);
        }
        sn.b bVar = this.f219873d;
        if (bVar != null) {
            mapL.put("alg", bVar.a());
        }
        String str = this.f219874e;
        if (str != null) {
            mapL.put("kid", str);
        }
        URI uri = this.f219875f;
        if (uri != null) {
            mapL.put("x5u", uri.toString());
        }
        io.c cVar = this.f219876g;
        if (cVar != null) {
            mapL.put("x5t", cVar.toString());
        }
        io.c cVar2 = this.f219877h;
        if (cVar2 != null) {
            mapL.put("x5t#S256", cVar2.toString());
        }
        if (this.f219878j != null) {
            List<Object> listA2 = io.j.a();
            Iterator<io.a> it4 = this.f219878j.iterator();
            while (it4.hasNext()) {
                listA2.add(it4.next().toString());
            }
            mapL.put("x5c", listA2);
        }
        Date date = this.f219879k;
        if (date != null) {
            mapL.put("exp", Long.valueOf(ko.a.b(date)));
        }
        Date date2 = this.f219880l;
        if (date2 != null) {
            mapL.put("nbf", Long.valueOf(ko.a.b(date2)));
        }
        Date date3 = this.f219881m;
        if (date3 != null) {
            mapL.put("iat", Long.valueOf(ko.a.b(date3)));
        }
        g gVar = this.f219882n;
        if (gVar != null) {
            mapL.put("revoked", gVar.d());
        }
        return mapL;
    }

    public l y() {
        return (l) this;
    }
}
