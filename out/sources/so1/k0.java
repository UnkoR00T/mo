package so1;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003!#\u001fBA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001c\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lso1/k0;", "", "Lso1/k0$b;", "Loq/i0;", "Liy/j0;", "x509CertificateGenerator", "Lez/c;", "dateConverter", "Lez/a;", "currentTimeProvider", "Liy/i;", "cipherRsa", "Lpy/k;", "rsaKeyGenerator", "Liy/t;", "keyStoreProvider", "Lpy/l;", "keyStoreWrappedKeyStorage", "<init>", "(Liy/j0;Lez/c;Lez/a;Liy/i;Lpy/k;Liy/t;Lpy/l;)V", "Ljava/security/Key;", "key", "", "keyAlias", "Ldx/i;", "Ldx/b;", "f", "(Ljava/security/Key;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "params", "e", "(Lso1/k0$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/j0;", "b", "Lez/c;", "c", "Lez/a;", "d", "Liy/i;", "Lpy/k;", "Liy/t;", "g", "Lpy/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.j0 x509CertificateGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.i cipherRsa;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.k rsaKeyGenerator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final py.l keyStoreWrappedKeyStorage;

    /* JADX INFO: renamed from: so1.k0$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lso1/k0$a;", "Lso1/k0$b;", "Ljava/security/KeyPair;", "keyPair", "", "alias", "", "wrap", "<init>", "(Ljava/security/KeyPair;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/KeyPair;", "b", "()Ljava/security/KeyPair;", "Ljava/lang/String;", "c", "Z", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Asymmetric implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String alias;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wrap;

        public Asymmetric(KeyPair keyPair, String str, boolean z15) {
            this.keyPair = keyPair;
            this.alias = str;
            this.wrap = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAlias() {
            return this.alias;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getWrap() {
            return this.wrap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Asymmetric)) {
                return false;
            }
            Asymmetric asymmetric = (Asymmetric) other;
            return fr.t.c(this.keyPair, asymmetric.keyPair) && fr.t.c(this.alias, asymmetric.alias) && this.wrap == asymmetric.wrap;
        }

        public int hashCode() {
            return (((this.keyPair.hashCode() * 31) + this.alias.hashCode()) * 31) + Boolean.hashCode(this.wrap);
        }

        public String toString() {
            return "Asymmetric(keyPair=" + this.keyPair + ", alias=" + this.alias + ", wrap=" + this.wrap + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lso1/k0$b;", "Lgz/b$a;", "Lso1/k0$a;", "Lso1/k0$c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends gz.b.a {
    }

    /* JADX INFO: renamed from: so1.k0$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lso1/k0$c;", "Lso1/k0$b;", "Ljavax/crypto/SecretKey;", "secretKey", "", "alias", "", "wrap", "<init>", "(Ljavax/crypto/SecretKey;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljavax/crypto/SecretKey;", "b", "()Ljavax/crypto/SecretKey;", "Ljava/lang/String;", "c", "Z", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Symmetric implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecretKey secretKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String alias;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wrap;

        public Symmetric(SecretKey secretKey, String str, boolean z15) {
            this.secretKey = secretKey;
            this.alias = str;
            this.wrap = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAlias() {
            return this.alias;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SecretKey getSecretKey() {
            return this.secretKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getWrap() {
            return this.wrap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Symmetric)) {
                return false;
            }
            Symmetric symmetric = (Symmetric) other;
            return fr.t.c(this.secretKey, symmetric.secretKey) && fr.t.c(this.alias, symmetric.alias) && this.wrap == symmetric.wrap;
        }

        public int hashCode() {
            return (((this.secretKey.hashCode() * 31) + this.alias.hashCode()) * 31) + Boolean.hashCode(this.wrap);
        }

        public String toString() {
            return "Symmetric(secretKey=" + this.secretKey + ", alias=" + this.alias + ", wrap=" + this.wrap + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f183136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f183137h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f183138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f183139k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f183140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f183141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f183142n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f183143p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f183145r;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183143p = obj;
            this.f183145r |= PKIFailureInfo.systemUnavail;
            return k0.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f183149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f183150h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f183151j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f183152k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f183153l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f183154m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f183155n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f183156p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f183157q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f183158r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f183159s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f183161v;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183159s = obj;
            this.f183161v |= PKIFailureInfo.systemUnavail;
            return k0.this.f(null, null, this);
        }
    }

    public k0(iy.j0 j0Var, ez.c cVar, ez.a aVar, iy.i iVar, py.k kVar, iy.t tVar, py.l lVar) {
        this.x509CertificateGenerator = j0Var;
        this.dateConverter = cVar;
        this.currentTimeProvider = aVar;
        this.cipherRsa = iVar;
        this.rsaKeyGenerator = kVar;
        this.keyStoreProvider = tVar;
        this.keyStoreWrappedKeyStorage = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    public final Object f(Key key, String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        int i15;
        int i16;
        KeyStoreKeySpec keyStoreKeySpec;
        ex.b bVar;
        dx.j<dx.b> jVar;
        String str2;
        Key key2;
        int i17;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        KeyStoreKeySpec keyStoreKeySpec2;
        String str3;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i25 = eVar2.f183161v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f183161v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        e eVar3 = eVar2;
        Object objD = eVar3.f183159s;
        Object objE = uq.b.e();
        ?? r15 = eVar3.f183161v;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objD);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    keyStoreKeySpec = new KeyStoreKeySpec(str + "_wrapping", iy.h.c.C2299c.f97756b, 0, null, pq.v.e(py.h.WRAP_AND_UNWRAP), null, false, null, 236, null);
                    py.k kVar = this.rsaKeyGenerator;
                    key2 = key;
                    eVar3.f183146d = key2;
                    eVar3.f183147e = str;
                    eVar3.f183148f = jVarA;
                    eVar3.f183149g = vq.j.a(aVar);
                    eVar3.f183150h = aVar;
                    eVar3.f183151j = keyStoreKeySpec;
                    eVar3.f183152k = aVar;
                    i17 = 0;
                    eVar3.f183154m = 0;
                    eVar3.f183155n = 0;
                    eVar3.f183156p = 0;
                    eVar3.f183157q = 0;
                    eVar3.f183158r = 0;
                    eVar3.f183161v = 1;
                    objD = kVar.a(keyStoreKeySpec, eVar3);
                    if (objD != objE) {
                        str2 = str;
                        jVar = jVarA;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        bVar = bVar3;
                        i18 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 == 1) {
                        int i26 = eVar3.f183158r;
                        i15 = eVar3.f183157q;
                        i16 = eVar3.f183156p;
                        int i27 = eVar3.f183155n;
                        int i28 = eVar3.f183154m;
                        ex.b bVar4 = (ex.b) eVar3.f183152k;
                        keyStoreKeySpec = (KeyStoreKeySpec) eVar3.f183151j;
                        ex.b bVar5 = (ex.b) eVar3.f183150h;
                        bVar = (ex.b) eVar3.f183149g;
                        jVar = (dx.j) eVar3.f183148f;
                        str2 = (String) eVar3.f183147e;
                        key2 = (Key) eVar3.f183146d;
                        try {
                            oq.u.b(objD);
                            i17 = i26;
                            bVar2 = bVar5;
                            bVar3 = bVar4;
                            i18 = i28;
                            i19 = i27;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            dx.i iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (r15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) eVar3.f183153l;
                        keyStoreKeySpec2 = (KeyStoreKeySpec) eVar3.f183152k;
                        str3 = (String) eVar3.f183147e;
                        oq.u.b(objD);
                    }
                    this.keyStoreWrappedKeyStorage.b(str3, (byte[]) bVar2.a((dx.i) objD), keyStoreKeySpec2);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e18) {
                    throw e18;
                }
                KeyPair keyPair = (KeyPair) bVar3.a((dx.i) objD);
                iy.i iVar = this.cipherRsa;
                iy.h.c cVar = (iy.h.c) keyStoreKeySpec.getAlgorithm();
                PublicKey publicKey = keyPair.getPublic();
                iy.h0 h0Var = iy.h0.ASN1;
                eVar3.f183146d = vq.j.a(key2);
                eVar3.f183147e = str2;
                eVar3.f183148f = jVar;
                eVar3.f183149g = vq.j.a(bVar);
                eVar3.f183150h = vq.j.a(bVar2);
                eVar3.f183151j = vq.j.a(keyPair);
                eVar3.f183152k = keyStoreKeySpec;
                eVar3.f183153l = bVar2;
                eVar3.f183154m = i18;
                eVar3.f183155n = i19;
                eVar3.f183156p = i16;
                eVar3.f183157q = i15;
                eVar3.f183158r = i17;
                eVar3.f183161v = 2;
                objD = iVar.d(key2, publicKey, cVar, h0Var, eVar3);
                if (objD != objE) {
                    keyStoreKeySpec2 = keyStoreKeySpec;
                    str3 = str2;
                    this.keyStoreWrappedKeyStorage.b(str3, (byte[]) bVar2.a((dx.i) objD), keyStoreKeySpec2);
                    return new dx.i.Right(oq.i0.f148189a);
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x020d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0211  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [so1.k0] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v51 */
    public Object e(b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        d dVar;
        ex.c cVar;
        Exception exc;
        ?? r15;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        ex.b aVar;
        Object obj;
        b bVar2;
        ex.b bVar3;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f183145r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f183145r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj2 = dVar.f183143p;
        Object objE = uq.b.e();
        int i16 = dVar.f183145r;
        try {
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            if (bVar instanceof Asymmetric) {
                                if (((Asymmetric) bVar).getWrap()) {
                                    PrivateKey privateKey = ((Asymmetric) bVar).getKeyPair().getPrivate();
                                    String alias = ((Asymmetric) bVar).getAlias();
                                    dVar.f183133d = vq.j.a(bVar);
                                    dVar.f183134e = jVarA;
                                    dVar.f183135f = vq.j.a(aVar);
                                    dVar.f183136g = vq.j.a(aVar);
                                    dVar.f183138j = 0;
                                    dVar.f183139k = 0;
                                    dVar.f183140l = 0;
                                    dVar.f183141m = 0;
                                    dVar.f183142n = 0;
                                    dVar.f183145r = 1;
                                    if (f(privateKey, alias, dVar) == objE) {
                                    }
                                } else {
                                    iy.j0 j0Var = this.x509CertificateGenerator;
                                    iy.f.a aVar2 = new iy.f.a(this.currentTimeProvider, this.dateConverter, ((Asymmetric) bVar).getKeyPair());
                                    dVar.f183133d = bVar;
                                    dVar.f183134e = jVarA;
                                    dVar.f183135f = vq.j.a(aVar);
                                    dVar.f183136g = aVar;
                                    dVar.f183137h = aVar;
                                    dVar.f183138j = 0;
                                    dVar.f183139k = 0;
                                    dVar.f183140l = 0;
                                    dVar.f183141m = 0;
                                    dVar.f183142n = 0;
                                    dVar.f183145r = 2;
                                    Object objA = j0Var.a(aVar2, dVar);
                                    if (objA != objE) {
                                        obj = objA;
                                        bVar2 = bVar;
                                        bVar3 = aVar;
                                        ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, iy.f0.ANDROID_KEY_STORE, null, null, 6, null))).setKeyEntry(((Asymmetric) bVar2).getAlias(), ((Asymmetric) bVar2).getKeyPair().getPrivate(), null, new X509Certificate[]{(X509Certificate) bVar3.a((dx.i) obj)});
                                        oq.i0 i0Var = oq.i0.f148189a;
                                    }
                                }
                                return objE;
                            }
                            if (!(bVar instanceof Symmetric)) {
                                throw new oq.p();
                            }
                            if (((Symmetric) bVar).getWrap()) {
                                SecretKey secretKey = ((Symmetric) bVar).getSecretKey();
                                String alias2 = ((Symmetric) bVar).getAlias();
                                dVar.f183133d = vq.j.a(bVar);
                                dVar.f183134e = jVarA;
                                dVar.f183135f = vq.j.a(aVar);
                                dVar.f183136g = vq.j.a(aVar);
                                dVar.f183138j = 0;
                                dVar.f183139k = 0;
                                dVar.f183140l = 0;
                                dVar.f183141m = 0;
                                dVar.f183142n = 0;
                                dVar.f183145r = 3;
                                Object objF = f(secretKey, alias2, dVar);
                                if (objF != objE) {
                                    obj2 = objF;
                                }
                                return objE;
                            }
                            new dx.i.Left(new dx.b.Generic(new Exception("Symmetric key import is impossible")));
                        } catch (ex.c e15) {
                            cVar = e15;
                            return new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            exc = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else if (i16 == 1) {
                        oq.u.b(obj2);
                    } else if (i16 == 2) {
                        bVar3 = (ex.b) dVar.f183137h;
                        ex.b bVar4 = (ex.b) dVar.f183136g;
                        dx.j<dx.b> jVar = (dx.j) dVar.f183134e;
                        b bVar5 = (b) dVar.f183133d;
                        try {
                            oq.u.b(obj2);
                            obj = obj2;
                            jVarA = jVar;
                            aVar = bVar4;
                            bVar2 = bVar5;
                            ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, iy.f0.ANDROID_KEY_STORE, null, null, 6, null))).setKeyEntry(((Asymmetric) bVar2).getAlias(), ((Asymmetric) bVar2).getKeyPair().getPrivate(), null, new X509Certificate[]{(X509Certificate) bVar3.a((dx.i) obj)});
                            oq.i0 i0Var2 = oq.i0.f148189a;
                        } catch (ex.c e18) {
                            cVar = e18;
                            return new dx.i.Left((dx.b) ex.d.a(cVar));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            exc = e25;
                            r15 = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e26) {
                    exc = e26;
                    r15 = bVar;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            cVar = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
