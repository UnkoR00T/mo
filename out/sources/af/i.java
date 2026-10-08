package af;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    public static abstract class a {
        public final a a(String str, int i15) {
            e().put(str, String.valueOf(i15));
            return this;
        }

        public final a b(String str, long j15) {
            e().put(str, String.valueOf(j15));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract i d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j15);

        public abstract a j(Integer num);

        public abstract a k(String str);

        public abstract a l(long j15);
    }

    public static a a() {
        return new b.C0125b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    protected abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public abstract Integer j();

    public abstract String k();

    public abstract long l();

    public a m() {
        return new b.C0125b().k(k()).g(d()).j(j()).h(e()).i(f()).l(l()).f(new HashMap(c()));
    }
}
