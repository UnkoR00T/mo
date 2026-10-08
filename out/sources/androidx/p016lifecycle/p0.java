package androidx.p016lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import dr.a;
import java.lang.reflect.Constructor;
import mr.c;
import p071kotlin.Metadata;
import p7.CreationExtras;
import ua.g;
import ua.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/lifecycle/p0;", "Landroidx/lifecycle/w0$e;", "Landroidx/lifecycle/w0$c;", "<init>", "()V", "Landroid/app/Application;", "application", "Lua/j;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lua/j;Landroid/os/Bundle;)V", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "modelClass", "Lp7/a;", "extras", "c", "(Lmr/c;Lp7/a;)Landroidx/lifecycle/t0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;Lp7/a;)Landroidx/lifecycle/t0;", "", "key", "e", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/t0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "viewModel", "Loq/i0;", "d", "(Landroidx/lifecycle/t0;)V", "Landroid/app/Application;", "Landroidx/lifecycle/w0$c;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/j;", "lifecycle", "Lua/g;", "f", "Lua/g;", "savedStateRegistry", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 extends w0.e implements w0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Application application;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w0.c factory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j lifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private g savedStateRegistry;

    public p0() {
        this.factory = new w0.a();
    }

    @Override // androidx.lifecycle.w0.c
    public <T extends t0> T a(Class<T> modelClass, CreationExtras extras) {
        String str = (String) extras.a(w0.f12841c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(l0.f12795a) == null || extras.a(l0.f12796b) == null) {
            if (this.lifecycle != null) {
                return (T) e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(w0.a.f12845h);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? q0.c(modelClass, q0.f12812b) : q0.c(modelClass, q0.f12811a);
        if (constructorC == null) {
            return (T) this.factory.a(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) q0.d(modelClass, constructorC, l0.a(extras)) : (T) q0.d(modelClass, constructorC, application, l0.a(extras));
    }

    @Override // androidx.lifecycle.w0.c
    public <T extends t0> T b(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.w0.c
    public <T extends t0> T c(c<T> modelClass, CreationExtras extras) {
        return (T) a(a.b(modelClass), extras);
    }

    @Override // androidx.lifecycle.w0.e
    public void d(t0 viewModel) {
        j jVar = this.lifecycle;
        if (jVar != null) {
            i.a(viewModel, this.savedStateRegistry, jVar);
        }
    }

    public final <T extends t0> T e(String key, Class<T> modelClass) {
        Application application;
        j jVar = this.lifecycle;
        if (jVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? q0.c(modelClass, q0.f12812b) : q0.c(modelClass, q0.f12811a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.b(modelClass) : (T) w0.d.INSTANCE.a().b(modelClass);
        }
        k0 k0VarB = i.b(this.savedStateRegistry, jVar, key, this.defaultArgs);
        T t15 = (!zIsAssignableFrom || (application = this.application) == null) ? (T) q0.d(modelClass, constructorC, k0VarB.getHandle()) : (T) q0.d(modelClass, constructorC, application, k0VarB.getHandle());
        t15.V8("androidx.lifecycle.savedstate.vm.tag", k0VarB);
        return t15;
    }

    @SuppressLint({"LambdaLast"})
    public p0(Application application, j jVar, Bundle bundle) {
        w0.a aVar;
        this.savedStateRegistry = jVar.k();
        this.lifecycle = jVar.getLifecycleRegistry();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = w0.a.INSTANCE.a(application);
        } else {
            aVar = new w0.a();
        }
        this.factory = aVar;
    }
}
