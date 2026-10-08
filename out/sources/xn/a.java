package xn;

import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f219830d = new a("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f219831e = new a("secp256k1", "secp256k1", "1.3.132.0.10");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final a f219832f = new a("P-256K", "secp256k1", "1.3.132.0.10");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f219833g = new a("P-384", "secp384r1", "1.3.132.0.34");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f219834h = new a("P-521", "secp521r1", "1.3.132.0.35");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f219835j = new a(EdDSAParameterSpec.Ed25519, EdDSAParameterSpec.Ed25519, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f219836k = new a(EdDSAParameterSpec.Ed448, EdDSAParameterSpec.Ed448, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f219837l = new a(XDHParameterSpec.X25519, XDHParameterSpec.X25519, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f219838m = new a(XDHParameterSpec.X448, XDHParameterSpec.X448, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f219839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f219840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f219841c;

    public a(String str) {
        this(str, null, null);
    }

    public static a a(ECParameterSpec eCParameterSpec) {
        return c.b(eCParameterSpec);
    }

    public static a b(String str) {
        a aVar = f219830d;
        if (aVar.d().equals(str)) {
            return aVar;
        }
        a aVar2 = f219831e;
        if (aVar2.d().equals(str)) {
            return aVar2;
        }
        a aVar3 = f219833g;
        if (aVar3.d().equals(str)) {
            return aVar3;
        }
        a aVar4 = f219834h;
        if (aVar4.d().equals(str)) {
            return aVar4;
        }
        return null;
    }

    public static a e(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        a aVar = f219830d;
        if (str.equals(aVar.c())) {
            return aVar;
        }
        a aVar2 = f219832f;
        if (str.equals(aVar2.c())) {
            return aVar2;
        }
        a aVar3 = f219831e;
        if (str.equals(aVar3.c())) {
            return aVar3;
        }
        a aVar4 = f219833g;
        if (str.equals(aVar4.c())) {
            return aVar4;
        }
        a aVar5 = f219834h;
        if (str.equals(aVar5.c())) {
            return aVar5;
        }
        a aVar6 = f219835j;
        if (str.equals(aVar6.c())) {
            return aVar6;
        }
        a aVar7 = f219836k;
        if (str.equals(aVar7.c())) {
            return aVar7;
        }
        a aVar8 = f219837l;
        if (str.equals(aVar8.c())) {
            return aVar8;
        }
        a aVar9 = f219838m;
        return str.equals(aVar9.c()) ? aVar9 : new a(str);
    }

    public String c() {
        return this.f219839a;
    }

    public String d() {
        return this.f219841c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public ECParameterSpec f() {
        return c.a(this);
    }

    public int hashCode() {
        return Objects.hash(c());
    }

    public String toString() {
        return c();
    }

    public a(String str, String str2, String str3) {
        Objects.requireNonNull(str);
        this.f219839a = str;
        this.f219840b = str2;
        this.f219841c = str3;
    }
}
