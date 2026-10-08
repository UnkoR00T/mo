package b3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e0\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010'\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lb3/w;", "Lb3/r;", "Lua/j;", "base", "<init>", "(Lb3/r;)V", "Landroidx/lifecycle/s;", "j", "()Landroidx/lifecycle/s;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Lua/i;", "i", "(Landroid/os/Bundle;)Lua/i;", "", "key", "", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Lb3/r$a;", "c", "(Ljava/lang/String;Ler/a;)Lb3/r$a;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "", "e", "()Ljava/util/Map;", "Landroidx/lifecycle/s;", "_lifecycle", "Lua/i;", "_controller", "h", "()Lua/i;", "controller", "a", "lifecycle", "Lua/g;", "k", "()Lua/g;", "savedStateRegistry", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements r, ua.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ r f16340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.s _lifecycle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ua.i _controller;

    public w(r rVar) {
        this.f16340a = rVar;
        Object objF = f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null) {
            i(bundle);
        }
        c("androidx.savedstate.SavedStateRegistry", new er.a() { // from class: b3.v
            @Override // er.a
            public final Object a() {
                return w.g(this.f16339a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(w wVar) {
        oq.r[] rVarArr;
        ua.i iVar = wVar._controller;
        if (iVar == null) {
            return null;
        }
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new oq.r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
        }
        Bundle bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        iVar.e(bundleA);
        if (ua.c.v(ua.c.a(bundleA))) {
            return null;
        }
        return bundleA;
    }

    private final ua.i h() {
        return i(null);
    }

    private final ua.i i(Bundle savedState) {
        ua.i iVar = this._controller;
        if (iVar != null) {
            return iVar;
        }
        ua.i iVarB = ua.i.INSTANCE.b(this);
        this._controller = iVarB;
        iVarB.d(savedState);
        return iVarB;
    }

    private final androidx.p016lifecycle.s j() {
        androidx.p016lifecycle.s sVar = this._lifecycle;
        if (sVar != null) {
            return sVar;
        }
        androidx.p016lifecycle.s sVarA = androidx.p016lifecycle.s.INSTANCE.a(this);
        this._lifecycle = sVarA;
        return sVarA;
    }

    @Override // b3.r
    public boolean b(Object value) {
        return this.f16340a.b(value);
    }

    @Override // b3.r
    public r.a c(String key, er.a<? extends Object> valueProvider) {
        return this.f16340a.c(key, valueProvider);
    }

    @Override // b3.r
    public Map<String, List<Object>> e() {
        return this.f16340a.e();
    }

    @Override // b3.r
    public Object f(String key) {
        return this.f16340a.f(key);
    }

    @Override // ua.j
    public ua.g k() {
        return h().getSavedStateRegistry();
    }

    @Override // androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.s getLifecycleRegistry() {
        return j();
    }
}
