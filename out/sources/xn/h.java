package xn;

import java.io.Serializable;
import sn.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f219901c = new h("EC", a0.RECOMMENDED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f219902d = new h("RSA", a0.REQUIRED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f219903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f219904f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f219905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f219906b;

    static {
        a0 a0Var = a0.OPTIONAL;
        f219903e = new h("oct", a0Var);
        f219904f = new h("OKP", a0Var);
    }

    public h(String str, a0 a0Var) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.f219905a = str;
        this.f219906b = a0Var;
    }

    public static h b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        h hVar = f219901c;
        if (str.equals(hVar.a())) {
            return hVar;
        }
        h hVar2 = f219902d;
        if (str.equals(hVar2.a())) {
            return hVar2;
        }
        h hVar3 = f219903e;
        if (str.equals(hVar3.a())) {
            return hVar3;
        }
        h hVar4 = f219904f;
        return str.equals(hVar4.a()) ? hVar4 : new h(str, null);
    }

    public String a() {
        return this.f219905a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f219905a.hashCode();
    }

    public String toString() {
        return this.f219905a;
    }
}
