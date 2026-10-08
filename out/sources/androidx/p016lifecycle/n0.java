package androidx.p016lifecycle;

import android.os.Bundle;
import e6.c;
import er.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import oq.k;
import oq.l;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import ua.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/n0;", "Lua/g$b;", "Lua/g;", "savedStateRegistry", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "<init>", "(Lua/g;Landroidx/lifecycle/y0;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "Loq/i0;", "e", "()V", "", "key", "c", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lua/g;", "", "b", "Z", "restored", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/o0;", "d", "Loq/k;", "()Landroidx/lifecycle/o0;", "viewModel", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g savedStateRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean restored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k viewModel;

    public n0(g gVar, final y0 y0Var) {
        this.savedStateRegistry = gVar;
        this.viewModel = l.a(new a() { // from class: androidx.lifecycle.m0
            @Override // er.a
            public final Object a() {
                return n0.f(y0Var);
            }
        });
    }

    private final o0 d() {
        return (o0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 f(y0 y0Var) {
        return l0.e(y0Var);
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
        Bundle bundleA = c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        Bundle bundleA2 = ua.k.a(bundleA);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            ua.k.b(bundleA2, bundle);
        }
        for (Map.Entry<String, i0> entry2 : d().Z8().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleA3 = entry2.getValue().b().a();
            if (!ua.c.v(ua.c.a(bundleA3))) {
                ua.k.n(bundleA2, key, bundleA3);
            }
        }
        this.restored = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        r[] rVarArr;
        e();
        Bundle bundle = this.restoredState;
        if (bundle == null || !ua.c.b(ua.c.a(bundle), key)) {
            return null;
        }
        Bundle bundleQ = ua.c.q(ua.c.a(bundle), key);
        if (bundleQ == null) {
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
            bundleQ = c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
            ua.k.a(bundleQ);
        }
        ua.k.s(ua.k.a(bundle), key);
        if (ua.c.v(ua.c.a(bundle))) {
            this.restoredState = null;
        }
        return bundleQ;
    }

    public final void e() {
        r[] rVarArr;
        if (this.restored) {
            return;
        }
        Bundle bundleA = this.savedStateRegistry.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle bundleA2 = c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        Bundle bundleA3 = ua.k.a(bundleA2);
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            ua.k.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            ua.k.b(bundleA3, bundleA);
        }
        this.restoredState = bundleA2;
        this.restored = true;
        d();
    }
}
