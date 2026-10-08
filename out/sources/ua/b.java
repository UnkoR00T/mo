package ua;

import android.os.Bundle;
import androidx.p016lifecycle.q;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lua/b;", "Landroidx/lifecycle/n;", "Lua/j;", "owner", "<init>", "(Lua/j;)V", "", "className", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "Lua/j;", "b", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements androidx.p016lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j owner;

    /* JADX INFO: renamed from: ua.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lua/b$b;", "Lua/g$b;", "Lua/g;", "registry", "<init>", "(Lua/g;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", "className", "Loq/i0;", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C5116b implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<String> classes = new LinkedHashSet();

        public C5116b(g gVar) {
            gVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // ua.g.b
        public Bundle a() {
            r[] rVarArr;
            Map mapI = v0.i();
            if (mapI.isEmpty()) {
                rVarArr = new r[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
                }
                rVarArr = (r[]) arrayList.toArray(new r[0]);
            }
            Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
            k.r(k.a(bundleA), "classes_to_restore", v.f1(this.classes));
            return bundleA;
        }

        public final void b(String className) {
            this.classes.add(className);
        }
    }

    public b(j jVar) {
        this.owner = jVar;
    }

    private final void a(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, b.class.getClassLoader()).asSubclass(g.a.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    ((g.a) declaredConstructor.newInstance(null)).a(this.owner);
                } catch (Exception e15) {
                    throw new RuntimeException("Failed to instantiate " + className, e15);
                }
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e16);
            }
        } catch (ClassNotFoundException e17) {
            throw new RuntimeException("Class " + className + " wasn't found", e17);
        }
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, androidx.lifecycle.j.a event) {
        if (event != androidx.lifecycle.j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycleRegistry().d(this);
        Bundle bundleA = this.owner.k().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List<String> listU = c.u(c.a(bundleA), "classes_to_restore");
        if (listU == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listU.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
