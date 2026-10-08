package so1;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f!B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lso1/f0;", "", "Lso1/f0$a;", "Lso1/f0$b;", "Lpy/l;", "keyStoreWrappedKeyStorage", "Liy/i;", "cipherRsa", "Ly00/c0;", "parser", "Liy/t;", "keyStoreProvider", "<init>", "(Lpy/l;Liy/i;Ly00/c0;Liy/t;)V", "Lso1/f0$a$a;", "params", "Ldx/i;", "Ldx/b;", "e", "(Lso1/f0$a$a;)Ldx/i;", "Lso1/f0$a$b;", "f", "(Lso1/f0$a$b;Ltq/e;)Ljava/lang/Object;", "Ljava/security/Key;", "key", "", "keyAlias", "h", "(Ljava/security/Key;Ljava/lang/String;)Ldx/i;", "g", "(Lso1/f0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/l;", "b", "Liy/i;", "c", "Ly00/c0;", "d", "Liy/t;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.l keyStoreWrappedKeyStorage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.i cipherRsa;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y00.c0 parser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.t keyStoreProvider;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lso1/f0$a;", "Lgz/b$a;", "a", "b", "Lso1/f0$a$a;", "Lso1/f0$a$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends gz.b.a {

        /* JADX INFO: renamed from: so1.f0$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lso1/f0$a$a;", "Lso1/f0$a;", "", "keyAlias", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Key implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String keyAlias;

            public Key(String str) {
                this.keyAlias = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getKeyAlias() {
                return this.keyAlias;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Key) && fr.t.c(this.keyAlias, ((Key) other).keyAlias);
            }

            public int hashCode() {
                return this.keyAlias.hashCode();
            }

            public String toString() {
                return "Key(keyAlias=" + this.keyAlias + ')';
            }
        }

        /* JADX INFO: renamed from: so1.f0$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lso1/f0$a$b;", "Lso1/f0$a;", "", "wrappedKeyAlias", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WrappedKey implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String wrappedKeyAlias;

            public WrappedKey(String str) {
                this.wrappedKeyAlias = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getWrappedKeyAlias() {
                return this.wrappedKeyAlias;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WrappedKey) && fr.t.c(this.wrappedKeyAlias, ((WrappedKey) other).wrappedKeyAlias);
            }

            public int hashCode() {
                return this.wrappedKeyAlias.hashCode();
            }

            public String toString() {
                return "WrappedKey(wrappedKeyAlias=" + this.wrappedKeyAlias + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lso1/f0$b;", "", "a", "b", "Lso1/f0$b$a;", "Lso1/f0$b$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: so1.f0$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso1/f0$b$a;", "Lso1/f0$b;", "Ljavax/crypto/SecretKey;", "key", "<init>", "(Ljavax/crypto/SecretKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljavax/crypto/SecretKey;", "()Ljavax/crypto/SecretKey;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Key implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SecretKey key;

            public Key(SecretKey secretKey) {
                this.key = secretKey;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SecretKey getKey() {
                return this.key;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Key) && fr.t.c(this.key, ((Key) other).key);
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            public String toString() {
                return "Key(key=" + this.key + ')';
            }
        }

        /* JADX INFO: renamed from: so1.f0$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lso1/f0$b$b;", "Lso1/f0$b;", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Ljava/security/KeyPair;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class KeyPair implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final java.security.KeyPair keyPair;

            public KeyPair(java.security.KeyPair keyPair) {
                this.keyPair = keyPair;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final java.security.KeyPair getKeyPair() {
                return this.keyPair;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KeyPair) && fr.t.c(this.keyPair, ((KeyPair) other).keyPair);
            }

            public int hashCode() {
                return this.keyPair.hashCode();
            }

            public String toString() {
                return "KeyPair(keyPair=" + this.keyPair + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f183062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f183063h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f183064j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f183065k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f183066l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f183067m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f183068n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f183069p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f183070q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f183072s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183070q = obj;
            this.f183072s |= PKIFailureInfo.systemUnavail;
            return f0.this.f(null, this);
        }
    }

    public f0(py.l lVar, iy.i iVar, y00.c0 c0Var, iy.t tVar) {
        this.keyStoreWrappedKeyStorage = lVar;
        this.cipherRsa = iVar;
        this.parser = c0Var;
        this.keyStoreProvider = tVar;
    }

    private final dx.i<dx.b, b> e(a.Key params) {
        Object objB;
        y00.c0 c0Var = this.parser;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    return new dx.i.Right((b) aVar.a(h(((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, iy.f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(params.getKeyAlias(), null), params.getKeyAlias())));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object f(a.WrappedKey wrappedKey, tq.e<? super dx.i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.b bVar;
        a.WrappedKey wrappedKey2;
        ex.b bVar2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f183072s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f183072s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f183070q;
        Object objE = uq.b.e();
        ?? r15 = cVar.f183072s;
        try {
            try {
                if (r15 == 0) {
                    oq.u.b(obj);
                    y00.c0 c0Var = this.parser;
                    ex.a aVar = new ex.a();
                    ry.p pVar = (ry.p) aVar.a(this.keyStoreWrappedKeyStorage.a(wrappedKey.getWrappedKeyAlias()));
                    PrivateKey privateKey = (PrivateKey) ((KeyStore) aVar.a(iy.t.a(this.keyStoreProvider, iy.f0.ANDROID_KEY_STORE, null, null, 6, null))).getKey(pVar.getWrappingKeyAlias(), null);
                    iy.i iVar = this.cipherRsa;
                    byte[] derEncoded = pVar.getDerEncoded();
                    iy.h.c algorithm = pVar.getAlgorithm();
                    cVar.f183059d = wrappedKey;
                    cVar.f183060e = c0Var;
                    cVar.f183061f = vq.j.a(aVar);
                    cVar.f183062g = aVar;
                    cVar.f183063h = vq.j.a(pVar);
                    cVar.f183064j = vq.j.a(privateKey);
                    cVar.f183065k = aVar;
                    cVar.f183066l = 0;
                    cVar.f183067m = 0;
                    cVar.f183068n = 0;
                    cVar.f183069p = 0;
                    cVar.f183072s = 1;
                    Object objB2 = iVar.b(derEncoded, privateKey, algorithm, cVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    bVar = aVar;
                    obj = objB2;
                    wrappedKey2 = wrappedKey;
                    bVar2 = bVar;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) cVar.f183065k;
                    bVar = (ex.b) cVar.f183062g;
                    wrappedKey2 = (a.WrappedKey) cVar.f183059d;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                return new dx.i.Right((b) bVar.a(h((Key) bVar2.a((dx.i) obj), wrappedKey2.getWrappedKeyAlias())));
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                dx.i iVarA = r15.a(e16);
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
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, b> h(Key key, String keyAlias) {
        Object objB;
        y00.c0 c0Var = this.parser;
        try {
            try {
                try {
                    return new dx.i.Right(key instanceof PrivateKey ? new b.KeyPair(new KeyPair(((KeyStore) new ex.a().a(iy.t.a(this.keyStoreProvider, iy.f0.ANDROID_KEY_STORE, null, null, 6, null))).getCertificate(keyAlias).getPublicKey(), (PrivateKey) key)) : new b.Key((SecretKey) key));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
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
    }

    public Object g(a aVar, tq.e<? super dx.i<? extends dx.b, ? extends b>> eVar) {
        if (aVar instanceof a.Key) {
            return e((a.Key) aVar);
        }
        if (aVar instanceof a.WrappedKey) {
            return f((a.WrappedKey) aVar, eVar);
        }
        throw new oq.p();
    }
}
