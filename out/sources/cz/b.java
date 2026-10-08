package cz;

import fr.t;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0018J \u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\fJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001a\u0010\fJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH¦@¢\u0006\u0004\b\u001c\u0010\u0019J\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH¦@¢\u0006\u0004\b\u001e\u0010\u0019¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcz/b;", "", "Lcz/b$a;", "key", "", "default", "h", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "value", "c", "", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "g", "l", "(Ljava/lang/String;Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "", "f", "(Ljava/lang/String;JLtq/e;)Ljava/lang/Object;", "m", "k", "a", "(Ltq/e;)Ljava/lang/Object;", "d", "", "i", "", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcz/b$a;", "", "", "key", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "d", "(Ljava/lang/String;)I", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        private /* synthetic */ a(String str) {
            this.key = str;
        }

        public static final /* synthetic */ a a(String str) {
            return new a(str);
        }

        public static String b(String str) {
            return str;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof a) && t.c(str, ((a) obj).getKey());
        }

        public static int d(String str) {
            return str.hashCode();
        }

        public static String e(String str) {
            return "ItemKey(key=" + str + ")";
        }

        public boolean equals(Object obj) {
            return c(this.key, obj);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ String getKey() {
            return this.key;
        }

        public int hashCode() {
            return d(this.key);
        }

        public String toString() {
            return e(this.key);
        }
    }

    Object a(e<? super Boolean> eVar);

    Object b(e<? super Map<a, ? extends Object>> eVar);

    Object c(String str, boolean z15, e<? super Boolean> eVar);

    Object d(String str, e<? super Boolean> eVar);

    Object e(String str, String str2, e<? super Boolean> eVar);

    Object f(String str, long j15, e<? super Long> eVar);

    Object g(String str, e<? super Set<String>> eVar);

    Object h(String str, boolean z15, e<? super Boolean> eVar);

    Object i(e<? super List<a>> eVar);

    Object j(String str, e<? super String> eVar);

    Object k(String str, e<? super Boolean> eVar);

    Object l(String str, Set<String> set, e<? super Boolean> eVar);

    Object m(String str, long j15, e<? super Boolean> eVar);
}
