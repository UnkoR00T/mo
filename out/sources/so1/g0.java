package so1;

import java.security.KeyPair;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lso1/g0;", "Lgz/b;", "Lso1/g0$a;", "Lso1/g0$b;", "La14/j;", "passwordKeyUseCase", "La14/k;", "generateRsaKeyPairUseCase", "Lpy/b;", "aesKeyGenerator", "Lpy/k;", "keyStoreRsaKeyGenerator", "Lpy/i;", "keyStoreAesKeyGenerator", "<init>", "(La14/j;La14/k;Lpy/b;Lpy/k;Lpy/i;)V", "params", "d", "(Lso1/g0$a;Ltq/e;)Ljava/lang/Object;", "a", "La14/j;", "b", "La14/k;", "c", "Lpy/b;", "Lpy/k;", "e", "Lpy/i;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements gz.b<a, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a14.j passwordKeyUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.k generateRsaKeyPairUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final py.k keyStoreRsaKeyGenerator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final py.i keyStoreAesKeyGenerator;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lso1/g0$a;", "Lgz/b$a;", "a", "c", "b", "Lso1/g0$a$a;", "Lso1/g0$a$b;", "Lso1/g0$a$c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends gz.b.a {

        /* JADX INFO: renamed from: so1.g0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lso1/g0$a$a;", "Lso1/g0$a;", "", "alias", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AndroidKeyStoreKeyPairParams implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String alias;

            public AndroidKeyStoreKeyPairParams(String str) {
                this.alias = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAlias() {
                return this.alias;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AndroidKeyStoreKeyPairParams) && fr.t.c(this.alias, ((AndroidKeyStoreKeyPairParams) other).alias);
            }

            public int hashCode() {
                return this.alias.hashCode();
            }

            public String toString() {
                return "AndroidKeyStoreKeyPairParams(alias=" + this.alias + ')';
            }
        }

        /* JADX INFO: renamed from: so1.g0$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lso1/g0$a$b;", "Lso1/g0$a;", "", "alias", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AndroidKeyStoreSecretKeyParams implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String alias;

            public AndroidKeyStoreSecretKeyParams(String str) {
                this.alias = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAlias() {
                return this.alias;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AndroidKeyStoreSecretKeyParams) && fr.t.c(this.alias, ((AndroidKeyStoreSecretKeyParams) other).alias);
            }

            public int hashCode() {
                return this.alias.hashCode();
            }

            public String toString() {
                return "AndroidKeyStoreSecretKeyParams(alias=" + this.alias + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lso1/g0$a$c;", "Lso1/g0$a;", "", "seed", "<init>", "([B)V", "a", "[B", "getSeed", "()[B", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] seed;

            public c(byte[] bArr) {
                this.seed = bArr;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lso1/g0$b;", "", "b", "c", "a", "Lso1/g0$b$a;", "Lso1/g0$b$b;", "Lso1/g0$b$c;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: so1.g0$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso1/g0$b$a;", "Lso1/g0$b;", "Ldx/b;", "domainError", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            public Error(dx.b bVar) {
                this.domainError = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final dx.b getDomainError() {
                return this.domainError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.domainError, ((Error) other).domainError);
            }

            public int hashCode() {
                return this.domainError.hashCode();
            }

            public String toString() {
                return "Error(domainError=" + this.domainError + ')';
            }
        }

        /* JADX INFO: renamed from: so1.g0$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso1/g0$b$b;", "Lso1/g0$b;", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Ljava/security/KeyPair;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class KeyPairResult implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final KeyPair keyPair;

            public KeyPairResult(KeyPair keyPair) {
                this.keyPair = keyPair;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final KeyPair getKeyPair() {
                return this.keyPair;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KeyPairResult) && fr.t.c(this.keyPair, ((KeyPairResult) other).keyPair);
            }

            public int hashCode() {
                return this.keyPair.hashCode();
            }

            public String toString() {
                return "KeyPairResult(keyPair=" + this.keyPair + ')';
            }
        }

        /* JADX INFO: renamed from: so1.g0$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso1/g0$b$c;", "Lso1/g0$b;", "Ljavax/crypto/SecretKey;", "secretKey", "<init>", "(Ljavax/crypto/SecretKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljavax/crypto/SecretKey;", "()Ljavax/crypto/SecretKey;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SecretKeyResult implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SecretKey secretKey;

            public SecretKeyResult(SecretKey secretKey) {
                this.secretKey = secretKey;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SecretKey getSecretKey() {
                return this.secretKey;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SecretKeyResult) && fr.t.c(this.secretKey, ((SecretKeyResult) other).secretKey);
            }

            public int hashCode() {
                return this.secretKey.hashCode();
            }

            public String toString() {
                return "SecretKeyResult(secretKey=" + this.secretKey + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f183086e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f183088g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183086e = obj;
            this.f183088g |= PKIFailureInfo.systemUnavail;
            return g0.this.d(null, this);
        }
    }

    public g0(a14.j jVar, a14.k kVar, py.b bVar, py.k kVar2, py.i iVar) {
        this.passwordKeyUseCase = jVar;
        this.generateRsaKeyPairUseCase = kVar;
        this.aesKeyGenerator = bVar;
        this.keyStoreRsaKeyGenerator = kVar2;
        this.keyStoreAesKeyGenerator = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if (r2 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r2 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        if (r2 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ae, code lost:
    
        if (r2 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0205, code lost:
    
        if (r2 == r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        if (r2 == r4) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(so1.g0.a r20, tq.e<? super so1.g0.b> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so1.g0.d(so1.g0$a, tq.e):java.lang.Object");
    }
}
