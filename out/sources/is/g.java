package is;

import fr.k;
import fr.q0;
import fr.t;
import gs.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f96865c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gs.f f96866d = new gs.f(q0.c(g.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f96867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<es.e> f96868b = new ArrayList();

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public final List<es.e> a() {
        return this.f96868b;
    }

    public final void b(boolean z15) {
        this.f96867a = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(g.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f96867a == gVar.f96867a && t.c(this.f96868b, gVar.f96868b);
    }

    @Override // gs.e
    public gs.f getType() {
        return f96866d;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f96867a) * 31) + this.f96868b.hashCode();
    }
}
