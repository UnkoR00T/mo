package p136y9;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import ba.d0;
import fr.k;
import fr.q0;
import fu.k0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Ly9/j0;", "Landroidx/lifecycle/t0;", "Ly9/p1;", "<init>", "()V", "", "backStackEntryId", "Loq/i0;", "Z8", "(Ljava/lang/String;)V", "Y8", "Landroidx/lifecycle/x0;", "z1", "(Ljava/lang/String;)Landroidx/lifecycle/x0;", "toString", "()Ljava/lang/String;", "", "b", "Ljava/util/Map;", "viewModelStores", "c", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 extends t0 implements p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, x0> viewModelStores = new LinkedHashMap();

    /* JADX INFO: renamed from: y9.j0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ly9/j0$a;", "", "<init>", "()V", "Landroidx/lifecycle/x0;", "viewModelStore", "Ly9/j0;", "a", "(Landroidx/lifecycle/x0;)Ly9/j0;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final j0 a(x0 viewModelStore) {
            return (j0) w0.Companion.c(w0.INSTANCE, viewModelStore, l0.f225448a, null, 4, null).c(q0.c(j0.class));
        }

        private Companion() {
        }
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        Iterator<x0> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.viewModelStores.clear();
    }

    public final void Z8(String backStackEntryId) {
        x0 x0VarRemove = this.viewModelStores.remove(backStackEntryId);
        if (x0VarRemove != null) {
            x0VarRemove.a();
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("NavControllerViewModel{");
        sb5.append(k0.b(b0.e(d0.a(this)), 16));
        sb5.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb5.append(it.next());
            if (it.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append(')');
        return sb5.toString();
    }

    @Override // p136y9.p1
    public x0 z1(String backStackEntryId) {
        x0 x0Var = this.viewModelStores.get(backStackEntryId);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        this.viewModelStores.put(backStackEntryId, x0Var2);
        return x0Var2;
    }
}
