package pr;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0000*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lkotlin/reflect/jvm/internal/impl/km/ClassName;", "Lzs/b;", "b", "(Ljava/lang/String;)Lzs/b;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/ClassLoader;", "name", "Lmr/c;", "a", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Lmr/c;", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j3 {
    public static final mr.c<?> a(ClassLoader classLoader, String str) {
        Class clsO = y3.o(classLoader, b(str), 0, 2, null);
        if (clsO != null) {
            return dr.a.e(clsO);
        }
        return null;
    }

    public static final zs.b b(String str) {
        boolean zV = fu.r.V(str, ".", false, 2, null);
        if (zV) {
            str = str.substring(1);
        }
        return new zs.b(new zs.c(fu.r.O(fu.r.p1(str, '/', ""), '/', '.', false, 4, null)), new zs.c(fu.r.j1(str, '/', null, 2, null)), zV);
    }

    public static final String c(String str) {
        if (!fu.r.V(str, ".", false, 2, null)) {
            return fu.r.j1(fu.r.j1(str, '/', null, 2, null), '.', null, 2, null);
        }
        throw new IllegalArgumentException(("Local class is not supported: " + str).toString());
    }
}
