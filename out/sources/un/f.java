package un;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    private static String a(Collection collection) {
        StringBuilder sb5 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i15 = 0; i15 < array.length; i15++) {
            if (i15 != 0) {
                if (i15 < array.length - 1) {
                    sb5.append(", ");
                } else if (i15 == array.length - 1) {
                    sb5.append(" or ");
                }
            }
            sb5.append(array[i15].toString());
        }
        return sb5.toString();
    }

    public static String b(xn.a aVar, Collection<xn.a> collection) {
        return "Unsupported elliptic curve " + aVar + ", must be " + a(collection);
    }

    public static String c(sn.f fVar, Collection<sn.f> collection) {
        return "Unsupported JWE encryption method " + fVar + ", must be " + a(collection);
    }

    public static String d(sn.k kVar, Collection<sn.k> collection) {
        return "Unsupported JWE algorithm " + kVar + ", must be " + a(collection);
    }
}
