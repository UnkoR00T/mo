package zg0;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    public static /* synthetic */ boolean b(String[] strArr) {
        return strArr.length == 2;
    }

    public static /* synthetic */ String d(String[] strArr) {
        return strArr[1];
    }

    public static /* synthetic */ IllegalArgumentException e() {
        return new IllegalArgumentException("Couldn't extract citizen name from certificate");
    }

    public static String f(X509Certificate x509Certificate) {
        return (String) Arrays.stream(x509Certificate.getSubjectDN().getName().split(",")).filter(new Predicate() { // from class: zg0.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).trim().toUpperCase().startsWith("CN");
            }
        }).findFirst().map(new Function() { // from class: zg0.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((String) obj).split("=");
            }
        }).filter(new Predicate() { // from class: zg0.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i.b((String[]) obj);
            }
        }).map(new Function() { // from class: zg0.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i.d((String[]) obj);
            }
        }).orElseThrow(new Supplier() { // from class: zg0.h
            @Override // java.util.function.Supplier
            public final Object get() {
                return i.e();
            }
        });
    }
}
