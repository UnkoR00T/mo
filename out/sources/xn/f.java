package xn;

import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public enum f {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f219894a;

    f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key operation identifier must not be null");
        }
        this.f219894a = str;
    }

    public static Set<f> g(List<String> list) throws ParseException {
        f fVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : list) {
            if (str != null) {
                f[] fVarArrValues = values();
                int length = fVarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        fVar = null;
                        break;
                    }
                    fVar = fVarArrValues[i15];
                    if (str.equals(fVar.e())) {
                        break;
                    }
                    i15++;
                }
                if (fVar == null) {
                    throw new ParseException("Invalid JWK operation: " + str, 0);
                }
                linkedHashSet.add(fVar);
            }
        }
        return linkedHashSet;
    }

    public String e() {
        return this.f219894a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return e();
    }
}
