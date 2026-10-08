package androidx.fragment.app;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y extends t0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w0.c f12683j = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12687e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, o> f12684b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, y> f12685c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, x0> f12686d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12688f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12689g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12690h = false;

    class a implements w0.c {
        a() {
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T b(Class<T> cls) {
            return new y(true);
        }
    }

    y(boolean z15) {
        this.f12687e = z15;
    }

    private void c9(String str, boolean z15) {
        y yVar = this.f12685c.get(str);
        if (yVar != null) {
            if (z15) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(yVar.f12685c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yVar.b9((String) it.next(), true);
                }
            }
            yVar.Y8();
            this.f12685c.remove(str);
        }
        x0 x0Var = this.f12686d.get(str);
        if (x0Var != null) {
            x0Var.a();
            this.f12686d.remove(str);
        }
    }

    static y f9(x0 x0Var) {
        return (y) new w0(x0Var, f12683j).a(y.class);
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        if (FragmentManager.L0(3)) {
            toString();
        }
        this.f12688f = true;
    }

    void Z8(o oVar) {
        if (this.f12690h) {
            FragmentManager.L0(2);
        } else {
            if (this.f12684b.containsKey(oVar.f12594f)) {
                return;
            }
            this.f12684b.put(oVar.f12594f, oVar);
            if (FragmentManager.L0(2)) {
                oVar.toString();
            }
        }
    }

    void a9(o oVar, boolean z15) {
        if (FragmentManager.L0(3)) {
            Objects.toString(oVar);
        }
        c9(oVar.f12594f, z15);
    }

    void b9(String str, boolean z15) {
        FragmentManager.L0(3);
        c9(str, z15);
    }

    o d9(String str) {
        return this.f12684b.get(str);
    }

    y e9(o oVar) {
        y yVar = this.f12685c.get(oVar.f12594f);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this.f12687e);
        this.f12685c.put(oVar.f12594f, yVar2);
        return yVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f12684b.equals(yVar.f12684b) && this.f12685c.equals(yVar.f12685c) && this.f12686d.equals(yVar.f12686d)) {
                return true;
            }
        }
        return false;
    }

    Collection<o> g9() {
        return new ArrayList(this.f12684b.values());
    }

    x0 h9(o oVar) {
        x0 x0Var = this.f12686d.get(oVar.f12594f);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        this.f12686d.put(oVar.f12594f, x0Var2);
        return x0Var2;
    }

    public int hashCode() {
        return (((this.f12684b.hashCode() * 31) + this.f12685c.hashCode()) * 31) + this.f12686d.hashCode();
    }

    boolean i9() {
        return this.f12688f;
    }

    void j9(o oVar) {
        if (this.f12690h) {
            FragmentManager.L0(2);
        } else {
            if (this.f12684b.remove(oVar.f12594f) == null || !FragmentManager.L0(2)) {
                return;
            }
            oVar.toString();
        }
    }

    void k9(boolean z15) {
        this.f12690h = z15;
    }

    boolean l9(o oVar) {
        if (this.f12684b.containsKey(oVar.f12594f)) {
            return this.f12687e ? this.f12688f : !this.f12689g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("FragmentManagerViewModel{");
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append("} Fragments (");
        Iterator<o> it = this.f12684b.values().iterator();
        while (it.hasNext()) {
            sb5.append(it.next());
            if (it.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append(") Child Non Config (");
        Iterator<String> it4 = this.f12685c.keySet().iterator();
        while (it4.hasNext()) {
            sb5.append(it4.next());
            if (it4.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append(") ViewModelStores (");
        Iterator<String> it5 = this.f12686d.keySet().iterator();
        while (it5.hasNext()) {
            sb5.append(it5.next());
            if (it5.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append(')');
        return sb5.toString();
    }
}
