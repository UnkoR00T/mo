package xn;

import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Set<xn.a> f219842x = Collections.unmodifiableSet(new HashSet(Arrays.asList(xn.a.f219830d, xn.a.f219831e, xn.a.f219833g, xn.a.f219834h)));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final xn.a f219843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final io.c f219844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.c f219845t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final io.c f219846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final PrivateKey f219847w;

    public b(xn.a aVar, io.c cVar, io.c cVar2, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar3, io.c cVar4, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219901c, iVar, set, bVar, str, uri, cVar3, cVar4, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(aVar, "The curve must not be null");
        this.f219843r = aVar;
        Objects.requireNonNull(cVar, "The x coordinate must not be null");
        this.f219844s = cVar;
        Objects.requireNonNull(cVar2, "The y coordinate must not be null");
        this.f219845t = cVar2;
        E(aVar, cVar, cVar2);
        D(k());
        this.f219846v = null;
        this.f219847w = null;
    }

    public static io.c C(int i15, BigInteger bigInteger) {
        byte[] bArrA = io.d.a(bigInteger);
        int i16 = (i15 + 7) / 8;
        if (bArrA.length >= i16) {
            return io.c.h(bArrA);
        }
        byte[] bArr = new byte[i16];
        System.arraycopy(bArrA, 0, bArr, i16 - bArrA.length, bArrA.length);
        return io.c.h(bArr);
    }

    private void D(List<X509Certificate> list) {
        if (list != null && !I(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void E(xn.a aVar, io.c cVar, io.c cVar2) {
        if (!f219842x.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        if (vn.a.a(cVar.b(), cVar2.b(), aVar.f())) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
    }

    public static b J(X509Certificate x509Certificate) throws sn.h {
        if (!(x509Certificate.getPublicKey() instanceof ECPublicKey)) {
            throw new sn.h("The public key of the X.509 certificate is not EC");
        }
        ECPublicKey eCPublicKey = (ECPublicKey) x509Certificate.getPublicKey();
        try {
            String string = new JcaX509CertificateHolder(x509Certificate).getSubjectPublicKeyInfo().getAlgorithm().getParameters().toString();
            xn.a aVarB = xn.a.b(string);
            if (aVarB != null) {
                return new a(aVarB, eCPublicKey).d(i.a(x509Certificate)).c(x509Certificate.getSerialNumber().toString(10)).f(Collections.singletonList(io.a.d(x509Certificate.getEncoded()))).g(io.c.h(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(x509Certificate.getEncoded()))).b(x509Certificate.getNotAfter()).e(x509Certificate.getNotBefore()).a();
            }
            throw new sn.h("Couldn't determine EC JWK curve for OID " + string);
        } catch (NoSuchAlgorithmException e15) {
            throw new sn.h("Couldn't encode x5t parameter: " + e15.getMessage(), e15);
        } catch (CertificateEncodingException e16) {
            throw new sn.h("Couldn't encode x5c parameter: " + e16.getMessage(), e16);
        }
    }

    public static b K(Map<String, Object> map) throws ParseException {
        if (!h.f219901c.equals(e.g(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            xn.a aVarE = xn.a.e(io.k.h(map, "crv"));
            io.c cVarA = io.k.a(map, "x");
            io.c cVarA2 = io.k.a(map, "y");
            io.c cVarA3 = io.k.a(map, "d");
            try {
                return cVarA3 == null ? new b(aVarE, cVarA, cVarA2, e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), null) : new b(aVarE, cVarA, cVarA2, cVarA3, e.h(map), e.e(map), e.a(map), e.d(map), e.m(map), e.l(map), e.k(map), e.j(map), e.b(map), e.i(map), e.c(map), e.f(map), (KeyStore) null);
            } catch (Exception e15) {
                throw new ParseException(e15.getMessage(), 0);
            }
        } catch (IllegalArgumentException e16) {
            throw new ParseException(e16.getMessage(), 0);
        }
    }

    public xn.a F() {
        return this.f219843r;
    }

    public io.c G() {
        return this.f219844s;
    }

    public io.c H() {
        return this.f219845t;
    }

    public boolean I(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) k().get(0).getPublicKey();
            if (G().b().equals(eCPublicKey.getW().getAffineX())) {
                return H().b().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public ECPublicKey L() {
        return M(null);
    }

    public ECPublicKey M(Provider provider) throws sn.h {
        ECParameterSpec eCParameterSpecF = this.f219843r.f();
        if (eCParameterSpecF == null) {
            throw new sn.h("Couldn't get EC parameter spec for curve " + this.f219843r);
        }
        try {
            return (ECPublicKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePublic(new ECPublicKeySpec(new ECPoint(this.f219844s.b(), this.f219845t.b()), eCParameterSpecF));
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new sn.h(e.getMessage(), e);
        } catch (InvalidKeySpecException e16) {
            e = e16;
            throw new sn.h(e.getMessage(), e);
        }
    }

    @Override // xn.d
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public b A() {
        return new b(F(), G(), H(), i(), e(), a(), d(), p(), o(), n(), m(), b(), j(), c(), f(), g());
    }

    @Override // xn.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f219843r, bVar.f219843r) && Objects.equals(this.f219844s, bVar.f219844s) && Objects.equals(this.f219845t, bVar.f219845t) && Objects.equals(this.f219846v, bVar.f219846v) && Objects.equals(this.f219847w, bVar.f219847w);
    }

    @Override // xn.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f219843r, this.f219844s, this.f219845t, this.f219846v, this.f219847w);
    }

    @Override // xn.d
    public boolean r() {
        return (this.f219846v == null && this.f219847w == null) ? false : true;
    }

    @Override // xn.d
    public Map<String, Object> w() {
        Map<String, Object> mapW = super.w();
        mapW.put("crv", this.f219843r.toString());
        mapW.put("x", this.f219844s.toString());
        mapW.put("y", this.f219845t.toString());
        io.c cVar = this.f219846v;
        if (cVar != null) {
            mapW.put("d", cVar.toString());
        }
        return mapW;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final xn.a f219848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.c f219849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.c f219850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.c f219851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PrivateKey f219852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i f219853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Set<f> f219854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private sn.b f219855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f219856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private URI f219857j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        private io.c f219858k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private io.c f219859l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<io.a> f219860m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Date f219861n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Date f219862o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Date f219863p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private g f219864q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private KeyStore f219865r;

        public a(xn.a aVar, io.c cVar, io.c cVar2) {
            Objects.requireNonNull(aVar, "The curve must not be null");
            this.f219848a = aVar;
            Objects.requireNonNull(cVar, "The x coordinate must not be null");
            this.f219849b = cVar;
            Objects.requireNonNull(cVar2, "The y coordinate must not be null");
            this.f219850c = cVar2;
        }

        public b a() {
            try {
                if (this.f219851d == null && this.f219852e == null) {
                    return new b(this.f219848a, this.f219849b, this.f219850c, this.f219853f, this.f219854g, this.f219855h, this.f219856i, this.f219857j, this.f219858k, this.f219859l, this.f219860m, this.f219861n, this.f219862o, this.f219863p, this.f219864q, this.f219865r);
                }
                return this.f219852e != null ? new b(this.f219848a, this.f219849b, this.f219850c, this.f219852e, this.f219853f, this.f219854g, this.f219855h, this.f219856i, this.f219857j, this.f219858k, this.f219859l, this.f219860m, this.f219861n, this.f219862o, this.f219863p, this.f219864q, this.f219865r) : new b(this.f219848a, this.f219849b, this.f219850c, this.f219851d, this.f219853f, this.f219854g, this.f219855h, this.f219856i, this.f219857j, this.f219858k, this.f219859l, this.f219860m, this.f219861n, this.f219862o, this.f219863p, this.f219864q, this.f219865r);
            } catch (IllegalArgumentException e15) {
                throw new IllegalStateException(e15.getMessage(), e15);
            }
        }

        public a b(Date date) {
            this.f219861n = date;
            return this;
        }

        public a c(String str) {
            this.f219856i = str;
            return this;
        }

        public a d(i iVar) {
            this.f219853f = iVar;
            return this;
        }

        public a e(Date date) {
            this.f219862o = date;
            return this;
        }

        public a f(List<io.a> list) {
            this.f219860m = list;
            return this;
        }

        public a g(io.c cVar) {
            this.f219859l = cVar;
            return this;
        }

        public a(xn.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.C(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.C(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(xn.a aVar, io.c cVar, io.c cVar2, io.c cVar3, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar4, io.c cVar5, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219901c, iVar, set, bVar, str, uri, cVar4, cVar5, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(aVar, "The curve must not be null");
        this.f219843r = aVar;
        Objects.requireNonNull(cVar, "The x coordinate must not be null");
        this.f219844s = cVar;
        Objects.requireNonNull(cVar2, "The y coordinate must not be null");
        this.f219845t = cVar2;
        E(aVar, cVar, cVar2);
        D(k());
        Objects.requireNonNull(cVar3, "The d coordinate must not be null");
        this.f219846v = cVar3;
        this.f219847w = null;
    }

    public b(xn.a aVar, io.c cVar, io.c cVar2, PrivateKey privateKey, i iVar, Set<f> set, sn.b bVar, String str, URI uri, io.c cVar3, io.c cVar4, List<io.a> list, Date date, Date date2, Date date3, g gVar, KeyStore keyStore) {
        super(h.f219901c, iVar, set, bVar, str, uri, cVar3, cVar4, list, date, date2, date3, gVar, keyStore);
        Objects.requireNonNull(aVar, "The curve must not be null");
        this.f219843r = aVar;
        Objects.requireNonNull(cVar, "The x coordinate must not be null");
        this.f219844s = cVar;
        Objects.requireNonNull(cVar2, "The y coordinate must not be null");
        this.f219845t = cVar2;
        E(aVar, cVar, cVar2);
        D(k());
        this.f219846v = null;
        this.f219847w = privateKey;
    }
}
