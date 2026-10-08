package androidx.p016lifecycle;

import android.os.Bundle;
import fr.q0;
import p071kotlin.Metadata;
import p7.CreationExtras;
import ua.g;
import ua.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lua/j;", "Landroidx/lifecycle/y0;", "T", "Loq/i0;", "c", "(Lua/j;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/i0;", "b", "(Lua/j;Landroidx/lifecycle/y0;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/i0;", "Lp7/a;", "a", "(Lp7/a;)Landroidx/lifecycle/i0;", "Lp7/a$c;", "Lp7/a$c;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/o0;", "e", "(Landroidx/lifecycle/y0;)Landroidx/lifecycle/o0;", "savedStateHandlesVM", "Landroidx/lifecycle/n0;", "d", "(Lua/j;)Landroidx/lifecycle/n0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreationExtras.c<j> f12795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CreationExtras.c<y0> f12796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CreationExtras.c<Bundle> f12797c;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/l0$a", "Landroidx/lifecycle/w0$c;", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "modelClass", "Lp7/a;", "extras", "c", "(Lmr/c;Lp7/a;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements w0.c {
        a() {
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T c(mr.c<T> modelClass, CreationExtras extras) {
            return new o0();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/l0$b", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements CreationExtras.c<j> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/l0$c", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements CreationExtras.c<y0> {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/l0$d", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements CreationExtras.c<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f12795a = new b();
        f12796b = new c();
        f12797c = new d();
    }

    public static final i0 a(CreationExtras creationExtras) {
        j jVar = (j) creationExtras.a(f12795a);
        if (jVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        y0 y0Var = (y0) creationExtras.a(f12796b);
        if (y0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(f12797c);
        String str = (String) creationExtras.a(w0.f12841c);
        if (str != null) {
            return b(jVar, y0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final i0 b(j jVar, y0 y0Var, String str, Bundle bundle) {
        n0 n0VarD = d(jVar);
        o0 o0VarE = e(y0Var);
        i0 i0Var = o0VarE.Z8().get(str);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0VarA = i0.INSTANCE.a(n0VarD.c(str), bundle);
        o0VarE.Z8().put(str, i0VarA);
        return i0VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends j & y0> void c(T t15) {
        j.b state = t15.getLifecycleRegistry().getState();
        if (state != j.b.INITIALIZED && state != j.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t15.k().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            n0 n0Var = new n0(t15.k(), t15);
            t15.k().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            t15.getLifecycleRegistry().a(new j0(n0Var));
        }
    }

    public static final n0 d(j jVar) {
        g.b bVarB = jVar.k().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        n0 n0Var = bVarB instanceof n0 ? (n0) bVarB : null;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final o0 e(y0 y0Var) {
        return (o0) w0.Companion.d(w0.INSTANCE, y0Var, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", q0.c(o0.class));
    }
}
