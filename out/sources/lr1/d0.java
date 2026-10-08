package lr1;

import iy.f0;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002 \"BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+¨\u0006,"}, d2 = {"Llr1/d0;", "", "Llr1/d0$a;", "Llr1/d0$b;", "Liy/t;", "keyStoreProvider", "Liy/u;", "keyguardManager", "Liy/c;", "bytesConverter", "Liy/i;", "cipherRsa", "Lpy/k;", "keyStoreRsaKeyGenerator", "Lax/e;", "biometricManager", "Lmx/c;", "labelProvider", "<init>", "(Liy/t;Liy/u;Liy/c;Liy/i;Lpy/k;Lax/e;Lmx/c;)V", "Ljava/security/PrivateKey;", "privateKey", "", "encryptedData", "Ldx/i;", "Ldx/b;", "f", "(Ljava/security/PrivateKey;[BLtq/e;)Ljava/lang/Object;", "g", "params", "h", "(Llr1/d0$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/t;", "b", "Liy/u;", "c", "Liy/c;", "d", "Liy/i;", "e", "Lpy/k;", "Lax/e;", "Lmx/c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.u keyguardManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.i cipherRsa;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.k keyStoreRsaKeyGenerator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ax.e biometricManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lr1.d0$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Llr1/d0$a;", "Lgz/b$a;", "Liy/b0;", "data", "", "keyAlias", "", "keyTimeout", "", "useBiometric", "skipCreation", "<init>", "(Liy/b0;Ljava/lang/String;IZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "c", "I", "d", "Z", "f", "()Z", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f119821f = iy.b0.f97726c;

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

    /* JADX INFO: renamed from: lr1.d0$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Llr1/d0$b;", "", "Liy/a0;", "encryptedData", "decryptedData", "<init>", "(Liy/a0;Liy/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "b", "()Liy/a0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f119827c = iy.a0.f97720c;

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
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119834h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f119836k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f119838m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119836k = obj;
            this.f119838m |= PKIFailureInfo.systemUnavail;
            return d0.this.f(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f119843h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f119844j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f119845k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f119846l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119848n;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119846l = obj;
            this.f119848n |= PKIFailureInfo.systemUnavail;
            return d0.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f119849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f119850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f119851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f119852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f119853h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f119854j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f119855k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f119856l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f119857m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f119858n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f119859p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f119860q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f119861r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f119862s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f119863t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f119865w;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f119863t = obj;
            this.f119865w |= PKIFailureInfo.systemUnavail;
            return d0.this.h(null, this);
        }
    }

    public d0(iy.t tVar, iy.u uVar, iy.c cVar, iy.i iVar, py.k kVar, ax.e eVar, mx.c cVar2) {
        this.keyStoreProvider = tVar;
        this.keyguardManager = uVar;
        this.bytesConverter = cVar;
        this.cipherRsa = iVar;
        this.keyStoreRsaKeyGenerator = kVar;
        this.biometricManager = eVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
    
        if (r3 == r4) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.security.PrivateKey r18, byte[] r19, tq.e<? super dx.i<? extends dx.b, byte[]>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.d0.f(java.security.PrivateKey, byte[], tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
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
    public final java.lang.Object g(java.security.PrivateKey r13, byte[] r14, tq.e<? super dx.i<? extends dx.b, byte[]>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.d0.g(java.security.PrivateKey, byte[], tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x026f A[Catch: Exception -> 0x00c9, c -> 0x00cd, CancellationException -> 0x00d1, TRY_LEAVE, TryCatch #7 {c -> 0x00cd, CancellationException -> 0x00d1, Exception -> 0x00c9, blocks: (B:29:0x00bb, B:59:0x0206, B:61:0x026f, B:67:0x02b9), top: B:95:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:64:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b9 A[Catch: Exception -> 0x00c9, c -> 0x00cd, CancellationException -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #7 {c -> 0x00cd, CancellationException -> 0x00d1, Exception -> 0x00c9, blocks: (B:29:0x00bb, B:59:0x0206, B:61:0x026f, B:67:0x02b9), top: B:95:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:70:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x032c  */
    /* JADX WARN: Code duplicated, block: B:83:0x033d  */
    /* JADX WARN: Code duplicated, block: B:84:0x034b  */
    /* JADX WARN: Code duplicated, block: B:86:0x034f  */
    /* JADX WARN: Code duplicated, block: B:89:0x035c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [lr1.d0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Object h(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        e eVar2;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        Params params2;
        int i16;
        dx.j<dx.b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        PublicKey publicKey;
        ex.b bVar4;
        dx.j<dx.b> jVar;
        int i28;
        ex.b bVar5;
        byte[] bArr;
        int i29;
        ex.b bVar6;
        byte[] bArr2;
        int i35;
        int i36;
        ex.b bVar7;
        byte[] bArr3;
        byte[] bArr4;
        ex.b bVar8;
        PublicKey publicKey2;
        Params params3;
        PrivateKey privateKey;
        Object objG;
        Object objF;
        ex.b bVar9;
        byte[] bArrB;
        Object objE;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i37 = eVar2.f119865w;
            if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f119865w = i37 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f119863t;
        Object objE2 = uq.b.e();
        int i38 = eVar2.f119865w;
        ?? r15 = 4;
        try {
            try {
                if (i38 == 0) {
                    oq.u.b(objA);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    i15 = 0;
                    if (params.getSkipCreation()) {
                        params2 = params;
                        publicKey = ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getCertificate(params.getKeyAlias()).getPublicKey();
                        i35 = 0;
                        i36 = 0;
                        i27 = 0;
                        bVar7 = aVar;
                        bVar = bVar7;
                        i26 = 0;
                        bVar9 = bVar;
                        bArrB = iy.c.b(this.bytesConverter, params2.getData().getData(), null, 2, null);
                        iy.i iVar = this.cipherRsa;
                        iy.h.c.b bVar10 = iy.h.c.b.f97755b;
                        eVar2.f119849d = params2;
                        eVar2.f119850e = jVarA;
                        eVar2.f119851f = vq.j.a(bVar9);
                        eVar2.f119852g = bVar7;
                        eVar2.f119853h = vq.j.a(bArrB);
                        eVar2.f119854j = bVar7;
                        eVar2.f119855k = vq.j.a(publicKey);
                        eVar2.f119858n = i27;
                        eVar2.f119859p = i26;
                        eVar2.f119860q = i35;
                        eVar2.f119861r = i36;
                        eVar2.f119862s = i15;
                        eVar2.f119865w = 2;
                        objE = iVar.e(bArrB, publicKey, bVar10, eVar2);
                        if (objE != objE2) {
                            i25 = i35;
                            objA = objE;
                            bVar4 = bVar7;
                            bArr = bArrB;
                            jVar = jVarA;
                            i29 = i36;
                            bVar6 = bVar9;
                            i28 = i15;
                            bVar5 = bVar4;
                            bArr4 = (byte[]) bVar4.a((dx.i) objA);
                            px.f fVar = px.f.f163100a;
                            bVar8 = bVar6;
                            StringBuilder sb5 = new StringBuilder();
                            publicKey2 = publicKey;
                            sb5.append("encrypted: ");
                            sb5.append(bArr4);
                            fVar.b(sb5.toString(), px.c.a(bVar5));
                            params3 = params2;
                            privateKey = (PrivateKey) ((KeyStore) bVar5.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params2.getKeyAlias(), null);
                            fVar.b("privateKey: " + privateKey, px.c.a(bVar5));
                            if (params3.getUseBiometric()) {
                                eVar2.f119849d = vq.j.a(params3);
                                eVar2.f119850e = jVar;
                                eVar2.f119851f = vq.j.a(bVar8);
                                eVar2.f119852g = vq.j.a(bVar5);
                                eVar2.f119853h = vq.j.a(bArr);
                                eVar2.f119854j = bVar5;
                                eVar2.f119855k = bArr4;
                                eVar2.f119856l = vq.j.a(privateKey);
                                eVar2.f119857m = vq.j.a(publicKey2);
                                eVar2.f119858n = i27;
                                eVar2.f119859p = i26;
                                eVar2.f119860q = i25;
                                eVar2.f119861r = i29;
                                eVar2.f119862s = i28;
                                eVar2.f119865w = 3;
                                objF = f(privateKey, bArr4, eVar2);
                                if (objF != objE2) {
                                    bArr2 = bArr4;
                                    objA = objF;
                                    bArr3 = (byte[]) bVar5.a((dx.i) objA);
                                    return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                                }
                            } else {
                                eVar2.f119849d = vq.j.a(params3);
                                eVar2.f119850e = jVar;
                                eVar2.f119851f = vq.j.a(bVar8);
                                eVar2.f119852g = vq.j.a(bVar5);
                                eVar2.f119853h = vq.j.a(bArr);
                                eVar2.f119854j = bVar5;
                                eVar2.f119855k = bArr4;
                                eVar2.f119856l = vq.j.a(privateKey);
                                eVar2.f119857m = vq.j.a(publicKey2);
                                eVar2.f119858n = i27;
                                eVar2.f119859p = i26;
                                eVar2.f119860q = i25;
                                eVar2.f119861r = i29;
                                eVar2.f119862s = i28;
                                eVar2.f119865w = 4;
                                objG = g(privateKey, bArr4, eVar2);
                                if (objG != objE2) {
                                    bArr2 = bArr4;
                                    objA = objG;
                                    bArr3 = (byte[]) bVar5.a((dx.i) objA);
                                    return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                                }
                            }
                        }
                    } else {
                        py.k kVar = this.keyStoreRsaKeyGenerator;
                        KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec(params.getKeyAlias(), iy.h.c.b.f97755b, params.getKeyTimeout(), py.g.DEVICE_CREDENTIAL, pq.v.e(py.h.ENCRYPT_AND_DECRYPT), py.o.PREFERRED, false, null, 192, null);
                        eVar2.f119849d = params;
                        eVar2.f119850e = jVarA;
                        eVar2.f119851f = vq.j.a(aVar);
                        eVar2.f119852g = aVar;
                        eVar2.f119853h = aVar;
                        eVar2.f119858n = 0;
                        eVar2.f119859p = 0;
                        eVar2.f119860q = 0;
                        eVar2.f119861r = 0;
                        eVar2.f119862s = 0;
                        eVar2.f119865w = 1;
                        objA = kVar.a(keyStoreKeySpec, eVar2);
                        if (objA != objE2) {
                            i16 = 0;
                            i19 = 0;
                            params2 = params;
                            bVar3 = aVar;
                            bVar2 = bVar3;
                            bVar = bVar2;
                            i18 = 0;
                            i17 = 0;
                        }
                    }
                    return objE2;
                }
                try {
                    if (i38 != 1) {
                        if (i38 != 2) {
                            if (i38 == 3) {
                                bArr2 = (byte[]) eVar2.f119855k;
                                bVar5 = (ex.b) eVar2.f119854j;
                                oq.u.b(objA);
                                bArr3 = (byte[]) bVar5.a((dx.i) objA);
                                return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                            }
                            if (i38 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bArr2 = (byte[]) eVar2.f119855k;
                            bVar5 = (ex.b) eVar2.f119854j;
                            oq.u.b(objA);
                            bArr3 = (byte[]) bVar5.a((dx.i) objA);
                            return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                        }
                        int i39 = eVar2.f119862s;
                        int i45 = eVar2.f119861r;
                        i25 = eVar2.f119860q;
                        i26 = eVar2.f119859p;
                        i27 = eVar2.f119858n;
                        publicKey = (PublicKey) eVar2.f119855k;
                        bVar4 = (ex.b) eVar2.f119854j;
                        byte[] bArr5 = (byte[]) eVar2.f119853h;
                        ex.b bVar11 = (ex.b) eVar2.f119852g;
                        ex.b bVar12 = (ex.b) eVar2.f119851f;
                        jVar = (dx.j) eVar2.f119850e;
                        Params params4 = (Params) eVar2.f119849d;
                        try {
                            oq.u.b(objA);
                            i28 = i39;
                            bVar5 = bVar11;
                            bArr = bArr5;
                            params2 = params4;
                            i29 = i45;
                            bVar6 = bVar12;
                            bArr4 = (byte[]) bVar4.a((dx.i) objA);
                            px.f fVar2 = px.f.f163100a;
                            bVar8 = bVar6;
                            StringBuilder sb6 = new StringBuilder();
                            publicKey2 = publicKey;
                            sb6.append("encrypted: ");
                            sb6.append(bArr4);
                            fVar2.b(sb6.toString(), px.c.a(bVar5));
                            params3 = params2;
                            privateKey = (PrivateKey) ((KeyStore) bVar5.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params2.getKeyAlias(), null);
                            fVar2.b("privateKey: " + privateKey, px.c.a(bVar5));
                            if (params3.getUseBiometric()) {
                                eVar2.f119849d = vq.j.a(params3);
                                eVar2.f119850e = jVar;
                                eVar2.f119851f = vq.j.a(bVar8);
                                eVar2.f119852g = vq.j.a(bVar5);
                                eVar2.f119853h = vq.j.a(bArr);
                                eVar2.f119854j = bVar5;
                                eVar2.f119855k = bArr4;
                                eVar2.f119856l = vq.j.a(privateKey);
                                eVar2.f119857m = vq.j.a(publicKey2);
                                eVar2.f119858n = i27;
                                eVar2.f119859p = i26;
                                eVar2.f119860q = i25;
                                eVar2.f119861r = i29;
                                eVar2.f119862s = i28;
                                eVar2.f119865w = 3;
                                objF = f(privateKey, bArr4, eVar2);
                                if (objF != objE2) {
                                    bArr2 = bArr4;
                                    objA = objF;
                                    bArr3 = (byte[]) bVar5.a((dx.i) objA);
                                    return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                                }
                            } else {
                                eVar2.f119849d = vq.j.a(params3);
                                eVar2.f119850e = jVar;
                                eVar2.f119851f = vq.j.a(bVar8);
                                eVar2.f119852g = vq.j.a(bVar5);
                                eVar2.f119853h = vq.j.a(bArr);
                                eVar2.f119854j = bVar5;
                                eVar2.f119855k = bArr4;
                                eVar2.f119856l = vq.j.a(privateKey);
                                eVar2.f119857m = vq.j.a(publicKey2);
                                eVar2.f119858n = i27;
                                eVar2.f119859p = i26;
                                eVar2.f119860q = i25;
                                eVar2.f119861r = i29;
                                eVar2.f119862s = i28;
                                eVar2.f119865w = 4;
                                objG = g(privateKey, bArr4, eVar2);
                                if (objG != objE2) {
                                    bArr2 = bArr4;
                                    objA = objG;
                                    bArr3 = (byte[]) bVar5.a((dx.i) objA);
                                    return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                                }
                            }
                            return objE2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
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
                    }
                    i15 = eVar2.f119862s;
                    int i46 = eVar2.f119861r;
                    int i47 = eVar2.f119860q;
                    int i48 = eVar2.f119859p;
                    int i49 = eVar2.f119858n;
                    ex.b bVar13 = (ex.b) eVar2.f119853h;
                    ex.b bVar14 = (ex.b) eVar2.f119852g;
                    ex.b bVar15 = (ex.b) eVar2.f119851f;
                    dx.j<dx.b> jVar2 = (dx.j) eVar2.f119850e;
                    params2 = (Params) eVar2.f119849d;
                    try {
                        oq.u.b(objA);
                        i16 = i46;
                        jVarA = jVar2;
                        bVar = bVar15;
                        bVar2 = bVar14;
                        bVar3 = bVar13;
                        i17 = i49;
                        i18 = i48;
                        i19 = i47;
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(r15));
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
                } catch (CancellationException e26) {
                    throw e26;
                }
                PublicKey publicKey3 = ((KeyPair) bVar3.a((dx.i) objA)).getPublic();
                ex.b bVar16 = bVar2;
                publicKey = publicKey3;
                i35 = i19;
                i36 = i16;
                bVar7 = bVar16;
                i27 = i17;
                i26 = i18;
                bVar9 = bVar;
                bArrB = iy.c.b(this.bytesConverter, params2.getData().getData(), null, 2, null);
                iy.i iVar2 = this.cipherRsa;
                iy.h.c.b bVar17 = iy.h.c.b.f97755b;
                eVar2.f119849d = params2;
                eVar2.f119850e = jVarA;
                eVar2.f119851f = vq.j.a(bVar9);
                eVar2.f119852g = bVar7;
                eVar2.f119853h = vq.j.a(bArrB);
                eVar2.f119854j = bVar7;
                eVar2.f119855k = vq.j.a(publicKey);
                eVar2.f119858n = i27;
                eVar2.f119859p = i26;
                eVar2.f119860q = i35;
                eVar2.f119861r = i36;
                eVar2.f119862s = i15;
                eVar2.f119865w = 2;
                objE = iVar2.e(bArrB, publicKey, bVar17, eVar2);
                if (objE != objE2) {
                    i25 = i35;
                    objA = objE;
                    bVar4 = bVar7;
                    bArr = bArrB;
                    jVar = jVarA;
                    i29 = i36;
                    bVar6 = bVar9;
                    i28 = i15;
                    bVar5 = bVar4;
                    bArr4 = (byte[]) bVar4.a((dx.i) objA);
                    px.f fVar5 = px.f.f163100a;
                    bVar8 = bVar6;
                    StringBuilder sb7 = new StringBuilder();
                    publicKey2 = publicKey;
                    sb7.append("encrypted: ");
                    sb7.append(bArr4);
                    fVar5.b(sb7.toString(), px.c.a(bVar5));
                    params3 = params2;
                    privateKey = (PrivateKey) ((KeyStore) bVar5.a(iy.t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params2.getKeyAlias(), null);
                    fVar5.b("privateKey: " + privateKey, px.c.a(bVar5));
                    if (params3.getUseBiometric()) {
                        eVar2.f119849d = vq.j.a(params3);
                        eVar2.f119850e = jVar;
                        eVar2.f119851f = vq.j.a(bVar8);
                        eVar2.f119852g = vq.j.a(bVar5);
                        eVar2.f119853h = vq.j.a(bArr);
                        eVar2.f119854j = bVar5;
                        eVar2.f119855k = bArr4;
                        eVar2.f119856l = vq.j.a(privateKey);
                        eVar2.f119857m = vq.j.a(publicKey2);
                        eVar2.f119858n = i27;
                        eVar2.f119859p = i26;
                        eVar2.f119860q = i25;
                        eVar2.f119861r = i29;
                        eVar2.f119862s = i28;
                        eVar2.f119865w = 3;
                        objF = f(privateKey, bArr4, eVar2);
                        if (objF != objE2) {
                            bArr2 = bArr4;
                            objA = objF;
                            bArr3 = (byte[]) bVar5.a((dx.i) objA);
                            return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                        }
                    } else {
                        eVar2.f119849d = vq.j.a(params3);
                        eVar2.f119850e = jVar;
                        eVar2.f119851f = vq.j.a(bVar8);
                        eVar2.f119852g = vq.j.a(bVar5);
                        eVar2.f119853h = vq.j.a(bArr);
                        eVar2.f119854j = bVar5;
                        eVar2.f119855k = bArr4;
                        eVar2.f119856l = vq.j.a(privateKey);
                        eVar2.f119857m = vq.j.a(publicKey2);
                        eVar2.f119858n = i27;
                        eVar2.f119859p = i26;
                        eVar2.f119860q = i25;
                        eVar2.f119861r = i29;
                        eVar2.f119862s = i28;
                        eVar2.f119865w = 4;
                        objG = g(privateKey, bArr4, eVar2);
                        if (objG != objE2) {
                            bArr2 = bArr4;
                            objA = objG;
                            bArr3 = (byte[]) bVar5.a((dx.i) objA);
                            return new dx.i.Right(new Result(iy.c0.f(bArr2), iy.c0.f(bArr3)));
                        }
                    }
                }
                return objE2;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
