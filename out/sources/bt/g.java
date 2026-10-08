package bt;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f21413b = new g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, i.f<?, ?>> f21414a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f21415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21416b;

        a(Object obj, int i15) {
            this.f21415a = obj;
            this.f21416b = i15;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21415a == aVar.f21415a && this.f21416b == aVar.f21416b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f21415a) * 65535) + this.f21416b;
        }
    }

    g() {
        this.f21414a = new HashMap();
    }

    public static g c() {
        return f21413b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f<?, ?> fVar) {
        this.f21414a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends q> i.f<ContainingType, ?> b(ContainingType containingtype, int i15) {
        return (i.f) this.f21414a.get(new a(containingtype, i15));
    }

    private g(boolean z15) {
        this.f21414a = Collections.EMPTY_MAP;
    }
}
