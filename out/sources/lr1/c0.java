package lr1;

import iy.f0;
import java.security.KeyStore;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%'#BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001a0\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001a0\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001a0\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010 \u001a\u00020\u0002H\u0096B¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010/¨\u00060"}, d2 = {"Llr1/c0;", "", "Llr1/c0$b;", "Llr1/c0$c;", "Liy/t;", "keyStoreProvider", "Liy/u;", "keyguardManager", "Liy/c;", "bytesConverter", "Liy/g;", "cipherAes", "Lpy/i;", "aesKeyGenerator", "Lax/e;", "biometricManager", "Lmx/c;", "labelProvider", "<init>", "(Liy/t;Liy/u;Liy/c;Liy/g;Lpy/i;Lax/e;Lmx/c;)V", "Ljavax/crypto/SecretKey;", "secretKey", "", "dataBytes", "Ldx/i;", "Ldx/b;", "Loq/r;", "h", "(Ljavax/crypto/SecretKey;[BLtq/e;)Ljava/lang/Object;", "i", "g", "([BLjavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "params", "j", "(Llr1/c0$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/t;", "b", "Liy/u;", "c", "Liy/c;", "d", "Liy/g;", "e", "Lpy/i;", "f", "Lax/e;", "Lmx/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements gz.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f119746h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f119747i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.u keyguardManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.i aesKeyGenerator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ax.e biometricManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llr1/c0$a;", "", "<init>", "()V", "", "SALT_BYTES_LENGTH", "I", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: lr1.c0$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Llr1/c0$b;", "Lgz/b$a;", "Liy/b0;", "data", "", "keyAlias", "", "keyTimeout", "", "useBiometric", "skipCreation", "<init>", "(Liy/b0;Ljava/lang/String;IZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "c", "I", "d", "Z", "f", "()Z", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f119755f = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String keyAlias;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int keyTimeout;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean useBiometric;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipCreation;

        public Params(iy.b0 b0Var, String str, int i15, boolean z15, boolean z16) {
            this.data = b0Var;
            this.keyAlias = str;
            this.keyTimeout = i15;
            this.useBiometric = z15;
            this.skipCreation = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKeyAlias() {
            return this.keyAlias;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getKeyTimeout() {
            return this.keyTimeout;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getSkipCreation() {
            return this.skipCreation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.data, params.data) && fr.t.c(this.keyAlias, params.keyAlias) && this.keyTimeout == params.keyTimeout && this.useBiometric == params.useBiometric && this.skipCreation == params.skipCreation;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getUseBiometric() {
            return this.useBiometric;
        }

        public int hashCode() {
            return (((((((this.data.hashCode() * 31) + this.keyAlias.hashCode()) * 31) + Integer.hashCode(this.keyTimeout)) * 31) + Boolean.hashCode(this.useBiometric)) * 31) + Boolean.hashCode(this.skipCreation);
        }

        public String toString() {
            return "Params(data=" + this.data + ", keyAlias=" + this.keyAlias + ", keyTimeout=" + this.keyTimeout + ", useBiometric=" + this.useBiometric + ", skipCreation=" + this.skipCreation + ')';
        }
    }

    /* JADX INFO: renamed from: lr1.c0$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Llr1/c0$c;", "", "Liy/a0;", "encryptedData", "decryptedData", "<init>", "(Liy/a0;Liy/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "b", "()Liy/a0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f119761c = iy.a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.a0 encryptedData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.a0 decryptedData;

        public Result(iy.a0 a0Var, iy.a0 a0Var2) {
            this.encryptedData = a0Var;
            this.decryptedData = a0Var2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.a0 getDecryptedData() {
            return this.decryptedData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.a0 getEncryptedData() {
            return this.encryptedData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.encryptedData, result.encryptedData) && fr.t.c(this.decryptedData, result.decryptedData);
        }

        public int hashCode() {
            return (this.encryptedData.hashCode() * 31) + this.decryptedData.hashCode();
        }

        public String toString() {
            return "Result(encryptedData=" + this.encryptedData + ", decryptedData=" + this.decryptedData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f119768h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f119769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f119770k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f119771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f119772m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119773n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f119774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f119775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f119776r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f119778t;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119776r = obj;
            this.f119778t |= PKIFailureInfo.systemUnavail;
            return c0.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119783h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119784j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f119785k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f119787m;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119785k = obj;
            this.f119787m |= PKIFailureInfo.systemUnavail;
            return c0.this.h(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119791g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119792h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119793j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f119794k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f119795l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119797n;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119795l = obj;
            this.f119797n |= PKIFailureInfo.systemUnavail;
            return c0.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119800f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119801g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f119802h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f119803j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f119804k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f119805l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f119806m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119807n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f119808p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f119809q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f119810r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f119812t;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119810r = obj;
            this.f119812t |= PKIFailureInfo.systemUnavail;
            return c0.this.j(null, this);
        }
    }

    public c0(iy.t tVar, iy.u uVar, iy.c cVar, iy.g gVar, py.i iVar, ax.e eVar, mx.c cVar2) {
        this.keyStoreProvider = tVar;
        this.keyguardManager = uVar;
        this.bytesConverter = cVar;
        this.cipherAes = gVar;
        this.aesKeyGenerator = iVar;
        this.biometricManager = eVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final Object g(byte[] bArr, SecretKey secretKey, tq.e<? super dx.i<? extends dx.b, oq.r<byte[], byte[]>>> eVar) throws Throwable {
        d dVar;
        ?? r15;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        byte[] bArr2;
        Object obj;
        dx.j<dx.b> jVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        byte[] bArr3;
        ex.b bVar3;
        ex.b bVar4;
        int i25;
        SecretKey secretKey2 = secretKey;
        if (!(eVar instanceof d) || (r15 = (i25 = (dVar = (d) eVar).f119778t) & PKIFailureInfo.systemUnavail) == 0) {
            dVar = new d(eVar);
        } else {
            dVar.f119778t = i25 - PKIFailureInfo.systemUnavail;
        }
        Object objD = dVar.f119776r;
        Object objE = uq.b.e();
        int i26 = dVar.f119778t;
        try {
            try {
                try {
                    try {
                        if (i26 == 0) {
                            oq.u.b(objD);
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            aVar = new ex.a();
                            iy.g gVar = this.cipherAes;
                            iy.h.a.b bVar5 = new iy.h.a.b(0, new iy.r.a(0, 1, null), 17, 1, null);
                            dVar.f119764d = vq.j.a(bArr);
                            dVar.f119765e = secretKey2;
                            dVar.f119766f = jVarA;
                            dVar.f119767g = vq.j.a(aVar);
                            dVar.f119768h = aVar;
                            dVar.f119769j = aVar;
                            dVar.f119771l = 0;
                            dVar.f119772m = 0;
                            dVar.f119773n = 0;
                            dVar.f119774p = 0;
                            dVar.f119775q = 0;
                            dVar.f119778t = 1;
                            bArr2 = bArr;
                            Object objF = gVar.f(bArr2, secretKey2, bVar5, dVar);
                            if (objF != objE) {
                                obj = objF;
                                jVar = jVarA;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar = aVar;
                                bVar2 = bVar;
                            }
                            return objE;
                        }
                        if (i26 == 1) {
                            int i27 = dVar.f119775q;
                            int i28 = dVar.f119774p;
                            i17 = dVar.f119773n;
                            i18 = dVar.f119772m;
                            i19 = dVar.f119771l;
                            ex.b bVar6 = (ex.b) dVar.f119769j;
                            ex.b bVar7 = (ex.b) dVar.f119768h;
                            bVar2 = (ex.b) dVar.f119767g;
                            dx.j<dx.b> jVar2 = (dx.j) dVar.f119766f;
                            SecretKey secretKey3 = (SecretKey) dVar.f119765e;
                            byte[] bArr4 = (byte[]) dVar.f119764d;
                            try {
                                oq.u.b(objD);
                                i15 = i27;
                                secretKey2 = secretKey3;
                                i16 = i28;
                                obj = objD;
                                jVar = jVar2;
                                bArr2 = bArr4;
                                bVar = bVar6;
                                aVar = bVar7;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar2;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
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
                            if (i26 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bArr3 = (byte[]) dVar.f119770k;
                            bVar3 = (ex.b) dVar.f119769j;
                            bVar4 = (ex.b) dVar.f119768h;
                            oq.u.b(objD);
                        }
                        byte[] bArr5 = (byte[]) bVar3.a((dx.i) objD);
                        px.f.f163100a.b("decrypted: " + bArr5, px.c.a(bVar4));
                        return new dx.i.Right(new oq.r(bArr3, bArr5));
                        byte[] bArr6 = (byte[]) bVar.a((dx.i) obj);
                        px.f fVar2 = px.f.f163100a;
                        StringBuilder sb5 = new StringBuilder();
                        byte[] bArr7 = bArr2;
                        sb5.append("encrypted: ");
                        sb5.append(bArr6);
                        fVar2.b(sb5.toString(), px.c.a(aVar));
                        iy.g gVar2 = this.cipherAes;
                        iy.h.a.b bVar8 = new iy.h.a.b(0, new iy.r.a(0, 1, null), 17, 1, null);
                        dVar.f119764d = vq.j.a(bArr7);
                        dVar.f119765e = vq.j.a(secretKey2);
                        dVar.f119766f = jVar;
                        dVar.f119767g = vq.j.a(bVar2);
                        dVar.f119768h = aVar;
                        dVar.f119769j = aVar;
                        dVar.f119770k = bArr6;
                        dVar.f119771l = i19;
                        dVar.f119772m = i18;
                        dVar.f119773n = i17;
                        dVar.f119774p = i16;
                        dVar.f119775q = i15;
                        dVar.f119778t = 2;
                        objD = gVar2.d(bArr6, secretKey2, bVar8, dVar);
                        if (objD != objE) {
                            bArr3 = bArr6;
                            bVar3 = aVar;
                            bVar4 = bVar3;
                            byte[] bArr8 = (byte[]) bVar3.a((dx.i) objD);
                            px.f.f163100a.b("decrypted: " + bArr8, px.c.a(bVar4));
                            return new dx.i.Right(new oq.r(bArr3, bArr8));
                        }
                        return objE;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
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
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (r3 == r4) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(javax.crypto.SecretKey r18, byte[] r19, tq.e<? super dx.i<? extends dx.b, oq.r<byte[], byte[]>>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.c0.h(javax.crypto.SecretKey, byte[], tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        if (r15 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(javax.crypto.SecretKey r13, byte[] r14, tq.e<? super dx.i<? extends dx.b, oq.r<byte[], byte[]>>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.c0.i(javax.crypto.SecretKey, byte[], tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0182 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:56:0x01f9, B:57:0x0201, B:59:0x0220, B:62:0x022e, B:25:0x007e, B:51:0x01b9, B:45:0x0130, B:47:0x0182, B:52:0x01c2, B:37:0x00b7, B:39:0x00c3), top: B:78:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c2 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:56:0x01f9, B:57:0x0201, B:59:0x0220, B:62:0x022e, B:25:0x007e, B:51:0x01b9, B:45:0x0130, B:47:0x0182, B:52:0x01c2, B:37:0x00b7, B:39:0x00c3), top: B:78:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [lr1.c0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object j(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        g gVar;
        Object objB;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b aVar;
        ex.b bVar;
        dx.j<dx.b> jVar;
        Params params2;
        ex.b bVar2;
        ex.b bVar3;
        oq.r rVar;
        int i25;
        dx.j<dx.b> jVarA;
        int i26;
        byte[] bArrB;
        SecretKey secretKey;
        ex.b bVar4;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i27 = gVar.f119812t;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f119812t = i27 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objI = gVar.f119810r;
        Object objE = uq.b.e();
        ?? r15 = gVar.f119812t;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(objI);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    i17 = 0;
                    if (params.getSkipCreation()) {
                        i26 = 0;
                        i16 = 0;
                        i25 = 0;
                        params2 = params;
                        bVar = aVar;
                        i18 = 0;
                        bArrB = iy.c.b(this.bytesConverter, params2.getData().getData(), null, 2, null);
                        secretKey = (SecretKey) ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params2.getKeyAlias(), null);
                        px.f fVar = px.f.f163100a;
                        StringBuilder sb5 = new StringBuilder();
                        bVar4 = bVar;
                        sb5.append("secretKey: ");
                        sb5.append(secretKey);
                        fVar.b(sb5.toString(), px.c.a(aVar));
                        if (params2.getUseBiometric()) {
                            gVar.f119798d = vq.j.a(params2);
                            gVar.f119799e = jVarA;
                            gVar.f119800f = vq.j.a(bVar4);
                            gVar.f119801g = vq.j.a(aVar);
                            gVar.f119802h = vq.j.a(bArrB);
                            gVar.f119803j = vq.j.a(secretKey);
                            gVar.f119804k = aVar;
                            gVar.f119805l = i17;
                            gVar.f119806m = i18;
                            gVar.f119807n = i26;
                            gVar.f119808p = i16;
                            gVar.f119809q = i25;
                            gVar.f119812t = 2;
                            objI = h(secretKey, bArrB, gVar);
                            if (objI == objE) {
                                bVar2 = aVar;
                                rVar = (oq.r) bVar2.a((dx.i) objI);
                                return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                            }
                        } else {
                            gVar.f119798d = vq.j.a(params2);
                            gVar.f119799e = jVarA;
                            gVar.f119800f = vq.j.a(bVar4);
                            gVar.f119801g = vq.j.a(aVar);
                            gVar.f119802h = vq.j.a(bArrB);
                            gVar.f119803j = vq.j.a(secretKey);
                            gVar.f119804k = aVar;
                            gVar.f119805l = i17;
                            gVar.f119806m = i18;
                            gVar.f119807n = i26;
                            gVar.f119808p = i16;
                            gVar.f119809q = i25;
                            gVar.f119812t = 3;
                            objI = i(secretKey, bArrB, gVar);
                            if (objI != objE) {
                                bVar3 = aVar;
                                rVar = (oq.r) bVar3.a((dx.i) objI);
                                return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                            }
                        }
                    } else {
                        py.i iVar = this.aesKeyGenerator;
                        KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec(params.getKeyAlias(), new iy.h.a.b(0, new iy.r.a(0, 1, null), 0, 1, null), params.getKeyTimeout(), py.g.DEVICE_CREDENTIAL, pq.v.e(py.h.ENCRYPT_AND_DECRYPT), py.o.PREFERRED, false, null, 192, null);
                        gVar.f119798d = params;
                        gVar.f119799e = jVarA;
                        gVar.f119800f = vq.j.a(aVar);
                        gVar.f119801g = aVar;
                        gVar.f119805l = 0;
                        gVar.f119806m = 0;
                        gVar.f119807n = 0;
                        gVar.f119808p = 0;
                        gVar.f119809q = 0;
                        gVar.f119812t = 1;
                        if (iVar.a(keyStoreKeySpec, gVar) != objE) {
                            jVar = jVarA;
                            i15 = 0;
                            i16 = 0;
                            i19 = 0;
                            params2 = params;
                            bVar = aVar;
                            i18 = 0;
                        }
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            bVar2 = (ex.b) gVar.f119804k;
                            oq.u.b(objI);
                            rVar = (oq.r) bVar2.a((dx.i) objI);
                            return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar3 = (ex.b) gVar.f119804k;
                        oq.u.b(objI);
                        rVar = (oq.r) bVar3.a((dx.i) objI);
                        return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                    }
                    i15 = gVar.f119809q;
                    i16 = gVar.f119808p;
                    i17 = gVar.f119807n;
                    i18 = gVar.f119806m;
                    i19 = gVar.f119805l;
                    aVar = (ex.b) gVar.f119801g;
                    bVar = (ex.b) gVar.f119800f;
                    jVar = (dx.j) gVar.f119799e;
                    params2 = (Params) gVar.f119798d;
                    try {
                        oq.u.b(objI);
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
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
                } catch (CancellationException e18) {
                    throw e18;
                }
                i26 = i17;
                i17 = i19;
                i25 = i15;
                jVarA = jVar;
                bArrB = iy.c.b(this.bytesConverter, params2.getData().getData(), null, 2, null);
                secretKey = (SecretKey) ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params2.getKeyAlias(), null);
                px.f fVar3 = px.f.f163100a;
                StringBuilder sb6 = new StringBuilder();
                bVar4 = bVar;
                sb6.append("secretKey: ");
                sb6.append(secretKey);
                fVar3.b(sb6.toString(), px.c.a(aVar));
                if (params2.getUseBiometric()) {
                    gVar.f119798d = vq.j.a(params2);
                    gVar.f119799e = jVarA;
                    gVar.f119800f = vq.j.a(bVar4);
                    gVar.f119801g = vq.j.a(aVar);
                    gVar.f119802h = vq.j.a(bArrB);
                    gVar.f119803j = vq.j.a(secretKey);
                    gVar.f119804k = aVar;
                    gVar.f119805l = i17;
                    gVar.f119806m = i18;
                    gVar.f119807n = i26;
                    gVar.f119808p = i16;
                    gVar.f119809q = i25;
                    gVar.f119812t = 2;
                    objI = h(secretKey, bArrB, gVar);
                    if (objI == objE) {
                        bVar2 = aVar;
                        rVar = (oq.r) bVar2.a((dx.i) objI);
                        return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                    }
                } else {
                    gVar.f119798d = vq.j.a(params2);
                    gVar.f119799e = jVarA;
                    gVar.f119800f = vq.j.a(bVar4);
                    gVar.f119801g = vq.j.a(aVar);
                    gVar.f119802h = vq.j.a(bArrB);
                    gVar.f119803j = vq.j.a(secretKey);
                    gVar.f119804k = aVar;
                    gVar.f119805l = i17;
                    gVar.f119806m = i18;
                    gVar.f119807n = i26;
                    gVar.f119808p = i16;
                    gVar.f119809q = i25;
                    gVar.f119812t = 3;
                    objI = i(secretKey, bArrB, gVar);
                    if (objI != objE) {
                        bVar3 = aVar;
                        rVar = (oq.r) bVar3.a((dx.i) objI);
                        return new dx.i.Right(new Result(iy.c0.f((byte[]) rVar.a()), iy.c0.f((byte[]) rVar.b())));
                    }
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
}
