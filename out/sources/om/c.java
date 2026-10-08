package om;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f146740a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f146741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kl.b f146742b;

        public <RemoteT extends b> a(Class<RemoteT> cls, kl.b<Object> bVar) {
            this.f146741a = cls;
            this.f146742b = bVar;
        }

        final kl.b a() {
            return this.f146742b;
        }

        final Class b() {
            return this.f146741a;
        }
    }

    public c(Set<a> set) {
        for (a aVar : set) {
            this.f146740a.put(aVar.b(), aVar.a());
        }
    }
}
