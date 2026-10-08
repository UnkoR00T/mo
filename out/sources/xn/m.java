package xn;

import java.io.Serializable;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends d {
    private final List<b> A;
    private final PrivateKey B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final io.c f219918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final io.c f219919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.c f219920t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.c f219921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.c f219922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final io.c f219923x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.c f219924y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.c f219925z;

    public static class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.c f219949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.c f219950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.c f219951c;

        public b(io.c cVar, io.c cVar2, io.c cVar3) {
            Objects.requireNonNull(cVar);
            this.f219949a = cVar;
            Objects.requireNonNull(cVar2);
            this.f219950b = cVar2;
            Objects.requireNonNull(cVar3);
            this.f219951c = cVar3;
        }
    }

    public m(io.c cVar, io.c cVar2, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar3, io.c cVar4, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        this(cVar, cVar2, null, null, null, null, null, null, null, null, iVar, set, bVar, str, uri, cVar3, cVar4, list, date, date2, date3, gVar, keyStore);
    }

    public static m F(X509Certificate x509Certificate) throws sn.h {
        if (!(x509Certificate.getPublicKey() instanceof RSAPublicKey)) {
            throw new sn.h("The public key of the X.509 certificate is not RSA");
        }
        try {
            return new a((RSAPublicKey) x509Certificate.getPublicKey()).d(i.a(x509Certificate)).c(x509Certificate.getSerialNumber().toString(10)).f(Collections.singletonList(io.a.d(x509Certificate.getEncoded()))).g(io.c.h(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(x509Certificate.getEncoded()))).b(x509Certificate.getNotAfter()).e(x509Certificate.getNotBefore()).a();
        } catch (NoSuchAlgorithmException e15) {
            throw new sn.h("Couldn't encode x5t parameter: " + e15.getMessage(), e15);
        } catch (CertificateEncodingException e16) {
            throw new sn.h("Couldn't encode x5c parameter: " + e16.getMessage(), e16);
        }
    }

    public static m G(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> listE;
        if (!h.f219902d.equals(e.g(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        io.c cVarA = io.k.a(map, "n");
        io.c cVarA2 = io.k.a(map, "e");
        io.c cVarA3 = io.k.a(map, "d");
        io.c cVarA4 = io.k.a(map, "p");
        io.c cVarA5 = io.k.a(map, "q");
        io.c cVarA6 = io.k.a(map, "dp");
        io.c cVarA7 = io.k.a(map, "dq");
        io.c cVarA8 = io.k.a(map, "qi");
        if (!map.containsKey("oth") || (listE = io.k.e(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(listE.size());
            for (Object obj : listE) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new b(io.k.a(map2, "r"), io.k.a(map2, "dq"), io.k.a(map2, "t")));
                    } catch (IllegalArgumentException e15) {
                        throw new ParseException(e15.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new m(cVarA, cVarA2, cVarA3, cVarA4, cVarA5, cVarA6, cVarA7, cVarA8, arrayList, null, e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), null);
        } catch (Exception e16) {
            throw new ParseException(e16.getMessage(), 0);
        }
    }

    public io.c C() {
        return this.f219918r;
    }

    public io.c D() {
        return this.f219919s;
    }

    public boolean E(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) k().get(0).getPublicKey();
            if (this.f219919s.b().equals(rSAPublicKey.getPublicExponent())) {
                return this.f219918r.b().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // xn.d
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public m A() {
        return new m(C(), D(), i(), e(), a(), d(), p(), o(), n(), m(), b(), j(), c(), f(), g());
    }

    public RSAPublicKey I() throws sn.h {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(this.f219918r.b(), this.f219919s.b()));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e15) {
            throw new sn.h(e15.getMessage(), e15);
        }
    }

    @Override // xn.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m) || !super.equals(obj)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f219918r, mVar.f219918r) && Objects.equals(this.f219919s, mVar.f219919s) && Objects.equals(this.f219920t, mVar.f219920t) && Objects.equals(this.f219921v, mVar.f219921v) && Objects.equals(this.f219922w, mVar.f219922w) && Objects.equals(this.f219923x, mVar.f219923x) && Objects.equals(this.f219924y, mVar.f219924y) && Objects.equals(this.f219925z, mVar.f219925z) && Objects.equals(this.A, mVar.A) && Objects.equals(this.B, mVar.B);
    }

    @Override // xn.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f219918r, this.f219919s, this.f219920t, this.f219921v, this.f219922w, this.f219923x, this.f219924y, this.f219925z, this.A, this.B);
    }

    @Override // xn.d
    public boolean r() {
        return (this.f219920t == null && this.f219921v == null && this.B == null) ? false : true;
    }

    @Override // xn.d
    public Map<String, Object> w() {
        Map<String, Object> mapW = super.w();
        mapW.put("n", this.f219918r.toString());
        mapW.put("e", this.f219919s.toString());
        io.c cVar = this.f219920t;
        if (cVar != null) {
            mapW.put("d", cVar.toString());
        }
        io.c cVar2 = this.f219921v;
        if (cVar2 != null) {
            mapW.put("p", cVar2.toString());
        }
        io.c cVar3 = this.f219922w;
        if (cVar3 != null) {
            mapW.put("q", cVar3.toString());
        }
        io.c cVar4 = this.f219923x;
        if (cVar4 != null) {
            mapW.put("dp", cVar4.toString());
        }
        io.c cVar5 = this.f219924y;
        if (cVar5 != null) {
            mapW.put("dq", cVar5.toString());
        }
        io.c cVar6 = this.f219925z;
        if (cVar6 != null) {
            mapW.put("qi", cVar6.toString());
        }
        List<b> list = this.A;
        if (list != null && !list.isEmpty()) {
            List<Object> listA = io.j.a();
            for (b bVar : this.A) {
                Map<String, Object> mapL = io.k.l();
                mapL.put("r", bVar.f219949a.toString());
                mapL.put("d", bVar.f219950b.toString());
                mapL.put("t", bVar.f219951c.toString());
                listA.add(mapL);
            }
            mapW.put("oth", listA);
        }
        return mapW;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[ADDED_TO_REGION] */
    public m(io.c cVar, io.c cVar2, io.c cVar3, io.c cVar4, io.c cVar5, io.c cVar6, io.c cVar7, io.c cVar8, List<b> list, PrivateKey privateKey, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar9, io.c cVar10, List<io.a> list2, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        io.c cVar11;
        io.c cVar12;
        super(h.f219902d, iVar, set, bVar, str, uri, cVar9, cVar10, list2, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(cVar, "The modulus value must not be null");
        this.f219918r = cVar;
        Objects.requireNonNull(cVar2, "The public exponent value must not be null");
        this.f219919s = cVar2;
        if (k() != null && !E(k().get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.f219920t = cVar3;
        if (cVar4 != null && cVar5 != null) {
            cVar11 = cVar7;
            if (cVar6 != null) {
                cVar12 = cVar8;
                if (cVar11 != null && cVar12 != null) {
                    this.f219921v = cVar4;
                    this.f219922w = cVar5;
                    this.f219923x = cVar6;
                    this.f219924y = cVar11;
                    this.f219925z = cVar12;
                    if (list != null) {
                        this.A = Collections.unmodifiableList(list);
                    } else {
                        this.A = Collections.EMPTY_LIST;
                    }
                }
                this.B = privateKey;
            }
            if (cVar4 != null && cVar5 == null && cVar6 == null && cVar11 == null && cVar12 == null && list == null) {
                this.f219921v = null;
                this.f219922w = null;
                this.f219923x = null;
                this.f219924y = null;
                this.f219925z = null;
                this.A = Collections.EMPTY_LIST;
            } else {
                if (cVar4 == null || cVar5 != null || cVar6 != null || cVar11 != null || cVar12 != null) {
                    Objects.requireNonNull(cVar4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
                    Objects.requireNonNull(cVar5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
                    Objects.requireNonNull(cVar6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                    Objects.requireNonNull(cVar11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                }
                this.f219921v = null;
                this.f219922w = null;
                this.f219923x = null;
                this.f219924y = null;
                this.f219925z = null;
                this.A = Collections.EMPTY_LIST;
            }
            this.B = privateKey;
        }
        cVar11 = cVar7;
        cVar12 = cVar8;
        if (cVar4 != null) {
            if (cVar4 == null) {
            }
            Objects.requireNonNull(cVar4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
            Objects.requireNonNull(cVar5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
            Objects.requireNonNull(cVar6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
            Objects.requireNonNull(cVar11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
            throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
        }
        if (cVar4 == null) {
        }
        Objects.requireNonNull(cVar4, "Incomplete second private (CRT) representation: The first prime factor must not be null");
        Objects.requireNonNull(cVar5, "Incomplete second private (CRT) representation: The second prime factor must not be null");
        Objects.requireNonNull(cVar6, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
        Objects.requireNonNull(cVar11, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
        throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
        this.B = privateKey;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.c f219926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.c f219927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.c f219928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.c f219929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private io.c f219930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private io.c f219931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private io.c f219932g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private io.c f219933h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<b> f219934i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private PrivateKey f219935j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private i f219936k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Set<f> f219937l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private sn.b f219938m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f219939n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private URI f219940o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Deprecated
        private io.c f219941p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private io.c f219942q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<io.a> f219943r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Date f219944s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Date f219945t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Date f219946u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private g f219947v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private KeyStore f219948w;

        public a(io.c cVar, io.c cVar2) {
            Objects.requireNonNull(cVar);
            this.f219926a = cVar;
            Objects.requireNonNull(cVar2);
            this.f219927b = cVar2;
        }

        public m a() {
            try {
                return new m(this.f219926a, this.f219927b, this.f219928c, this.f219929d, this.f219930e, this.f219931f, this.f219932g, this.f219933h, this.f219934i, this.f219935j, this.f219936k, this.f219937l, this.f219938m, this.f219939n, this.f219940o, this.f219941p, this.f219942q, this.f219943r, this.f219944s, this.f219945t, this.f219946u, this.f219947v, this.f219948w);
            } catch (IllegalArgumentException e15) {
                throw new IllegalStateException(e15.getMessage(), e15);
            }
        }

        public a b(Date date) {
            this.f219944s = date;
            return this;
        }

        public a c(String str) {
            this.f219939n = str;
            return this;
        }

        public a d(i iVar) {
            this.f219936k = iVar;
            return this;
        }

        public a e(Date date) {
            this.f219945t = date;
            return this;
        }

        public a f(List<io.a> list) {
            this.f219943r = list;
            return this;
        }

        public a g(io.c cVar) {
            this.f219942q = cVar;
            return this;
        }

        public a(RSAPublicKey rSAPublicKey) {
            this.f219926a = io.c.g(rSAPublicKey.getModulus());
            this.f219927b = io.c.g(rSAPublicKey.getPublicExponent());
        }
    }
}
