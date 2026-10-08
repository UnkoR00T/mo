package wa;

import android.os.Bundle;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import ua.g;
import ua.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00052\u000e\u0010\u0019\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00052\n\u0010\u001c\u001a\u00060\u000bj\u0002`\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010/\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R$\u00102\u001a\u00020*2\u0006\u00100\u001a\u00020*8G@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103R\"\u00106\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b+\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lwa/b;", "", "Lua/j;", "owner", "Lkotlin/Function0;", "Loq/i0;", "onAttach", "<init>", "(Lua/j;Ler/a;)V", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lua/g$b;", "provider", "j", "(Ljava/lang/String;Lua/g$b;)V", "d", "(Ljava/lang/String;)Lua/g$b;", "k", "(Ljava/lang/String;)V", "f", "()V", "savedState", "h", "(Landroid/os/Bundle;)V", "outBundle", "i", "a", "Lua/j;", "b", "Ler/a;", "getOnAttach$savedstate", "()Ler/a;", "Lwa/c;", "Lwa/c;", "lock", "", "Ljava/util/Map;", "keyToProviders", "", "e", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "value", "g", "isRestored", "()Z", "setAllowingSavingState$savedstate", "(Z)V", "isAllowingSavingState", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f211538i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onAttach;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRestored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c lock = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, g.b> keyToProviders = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isAllowingSavingState = true;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwa/b$a;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public b(j jVar, er.a<i0> aVar) {
        this.owner = jVar;
        this.onAttach = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b bVar, q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_START) {
            bVar.isAllowingSavingState = true;
        } else if (aVar == androidx.lifecycle.j.a.ON_STOP) {
            bVar.isAllowingSavingState = false;
        }
    }

    public final Bundle c(String key) {
        if (!this.isRestored) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = ua.c.a(bundle);
        Bundle bundleO = ua.c.b(bundleA, key) ? ua.c.o(bundleA, key) : null;
        ua.k.s(ua.k.a(bundle), key);
        if (ua.c.v(ua.c.a(bundle))) {
            this.restoredState = null;
        }
        return bundleO;
    }

    public final g.b d(String key) {
        g.b bVar;
        synchronized (this.lock) {
            Iterator it = this.keyToProviders.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                g.b bVar2 = (g.b) entry.getValue();
                if (t.c(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsAllowingSavingState() {
        return this.isAllowingSavingState;
    }

    public final void f() {
        if (this.owner.getLifecycleRegistry().getState() != androidx.lifecycle.j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.onAttach.a();
        this.owner.getLifecycleRegistry().a(new n() { // from class: wa.a
            @Override // androidx.p016lifecycle.n
            public final void m(q qVar, androidx.lifecycle.j.a aVar) {
                b.g(this.f211537a, qVar, aVar);
            }
        });
        this.attached = true;
    }

    public final void h(Bundle savedState) {
        if (!this.attached) {
            f();
        }
        if (this.owner.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.getLifecycleRegistry().getState()).toString());
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleO = null;
        if (savedState != null) {
            Bundle bundleA = ua.c.a(savedState);
            if (ua.c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleO = ua.c.o(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.restoredState = bundleO;
        this.isRestored = true;
    }

    public final void i(Bundle outBundle) {
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
        Bundle bundleA2 = ua.k.a(bundleA);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            ua.k.b(bundleA2, bundle);
        }
        synchronized (this.lock) {
            try {
                for (Map.Entry entry2 : this.keyToProviders.entrySet()) {
                    ua.k.n(bundleA2, (String) entry2.getKey(), ((g.b) entry2.getValue()).a());
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (ua.c.v(ua.c.a(bundleA))) {
            return;
        }
        ua.k.n(ua.k.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, g.b provider) {
        synchronized (this.lock) {
            if (this.keyToProviders.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.keyToProviders.put(key, provider);
            i0 i0Var = i0.f148189a;
        }
    }

    public final void k(String key) {
        synchronized (this.lock) {
        }
    }
}
