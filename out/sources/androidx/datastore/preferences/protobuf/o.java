package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile o f12052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final o f12053c = new o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, x.e<?, ?>> f12054a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f12055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12056b;

        a(Object obj, int i15) {
            this.f12055a = obj;
            this.f12056b = i15;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12055a == aVar.f12055a && this.f12056b == aVar.f12056b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12055a) * 65535) + this.f12056b;
        }
    }

    o() {
        this.f12054a = new HashMap();
    }

    public static o b() {
        o oVarA;
        if (c1.f11932d) {
            return f12053c;
        }
        o oVar = f12052b;
        if (oVar != null) {
            return oVar;
        }
        synchronized (o.class) {
            try {
                oVarA = f12052b;
                if (oVarA == null) {
                    oVarA = n.a();
                    f12052b = oVarA;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return oVarA;
    }

    public <ContainingType extends r0> x.e<ContainingType, ?> a(ContainingType containingtype, int i15) {
        return (x.e) this.f12054a.get(new a(containingtype, i15));
    }

    o(boolean z15) {
        this.f12054a = Collections.EMPTY_MAP;
    }
}
