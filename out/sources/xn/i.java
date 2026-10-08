package xn;

import java.io.Serializable;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f219907b = new i("sig");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f219908c = new i("enc");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f219909a;

    public i(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key use identifier must not be null");
        }
        this.f219909a = str;
    }

    public static i a(X509Certificate x509Certificate) {
        if (x509Certificate.getKeyUsage() == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (x509Certificate.getKeyUsage()[0] || x509Certificate.getKeyUsage()[1]) {
            hashSet.add(f219907b);
        }
        if (x509Certificate.getKeyUsage()[0] && x509Certificate.getKeyUsage()[2]) {
            hashSet.add(f219908c);
        }
        if (x509Certificate.getKeyUsage()[0] && x509Certificate.getKeyUsage()[4]) {
            hashSet.add(f219908c);
        }
        if (x509Certificate.getKeyUsage()[2] || x509Certificate.getKeyUsage()[3] || x509Certificate.getKeyUsage()[4]) {
            hashSet.add(f219908c);
        }
        if (x509Certificate.getKeyUsage()[5] || x509Certificate.getKeyUsage()[6]) {
            hashSet.add(f219907b);
        }
        if (hashSet.size() == 1) {
            return (i) hashSet.iterator().next();
        }
        return null;
    }

    public static i c(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        i iVar = f219907b;
        if (str.equals(iVar.b())) {
            return iVar;
        }
        i iVar2 = f219908c;
        if (str.equals(iVar2.b())) {
            return iVar2;
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("JWK use value must not be empty or blank", 0);
        }
        return new i(str);
    }

    public String b() {
        return this.f219909a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Objects.equals(this.f219909a, ((i) obj).f219909a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f219909a);
    }

    public String toString() {
        return b();
    }
}
