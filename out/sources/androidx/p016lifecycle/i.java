package androidx.p016lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import p071kotlin.Metadata;
import ua.g;
import ua.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/i;", "", "<init>", "()V", "Lua/g;", "registry", "Landroidx/lifecycle/j;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/k0;", "b", "(Lua/g;Landroidx/lifecycle/j;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/k0;", "Landroidx/lifecycle/t0;", "viewModel", "Loq/i0;", "a", "(Landroidx/lifecycle/t0;Lua/g;Landroidx/lifecycle/j;)V", "c", "(Lua/g;Landroidx/lifecycle/j;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f12770a = new i();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/i$a;", "Lua/g$a;", "<init>", "()V", "Lua/j;", "owner", "Loq/i0;", "a", "(Lua/j;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements g.a {
        @Override // ua.g.a
        public void a(j owner) {
            if (!(owner instanceof y0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            x0 x0VarH = ((y0) owner).h();
            g gVarK = owner.k();
            Iterator<String> it = x0VarH.c().iterator();
            while (it.hasNext()) {
                t0 t0VarB = x0VarH.b(it.next());
                if (t0VarB != null) {
                    i.a(t0VarB, gVarK, owner.getLifecycleRegistry());
                }
            }
            if (x0VarH.c().isEmpty()) {
                return;
            }
            gVarK.d(a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/i$b", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f12771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f12772b;

        b(j jVar, g gVar) {
            this.f12771a = jVar;
            this.f12772b = gVar;
        }

        @Override // androidx.p016lifecycle.n
        public void m(q source, j.a event) {
            if (event == j.a.ON_START) {
                this.f12771a.d(this);
                this.f12772b.d(a.class);
            }
        }
    }

    private i() {
    }

    public static final void a(t0 viewModel, g registry, j lifecycle) {
        k0 k0Var = (k0) viewModel.X8("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.getIsAttached()) {
            return;
        }
        k0Var.b(registry, lifecycle);
        f12770a.c(registry, lifecycle);
    }

    public static final k0 b(g registry, j lifecycle, String key, Bundle defaultArgs) {
        k0 k0Var = new k0(key, i0.INSTANCE.a(registry.a(key), defaultArgs));
        k0Var.b(registry, lifecycle);
        f12770a.c(registry, lifecycle);
        return k0Var;
    }

    private final void c(g registry, j lifecycle) {
        j.b state = lifecycle.getState();
        if (state == j.b.INITIALIZED || state.e(j.b.STARTED)) {
            registry.d(a.class);
        } else {
            lifecycle.a(new b(lifecycle, registry));
        }
    }
}
