package p136y9;

import android.annotation.SuppressLint;
import fr.k;
import fr.t;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00040\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ly9/t1;", "", "<init>", "()V", "Ly9/s1;", "T", "Ljava/lang/Class;", "navigatorClass", "d", "(Ljava/lang/Class;)Ly9/s1;", "", "name", "e", "(Ljava/lang/String;)Ly9/s1;", "Ly9/y0;", "navigator", "c", "(Ly9/s1;)Ly9/s1;", "b", "(Ljava/lang/String;Ly9/s1;)Ly9/s1;", "", "a", "Ljava/util/Map;", "_navigators", "", "f", "()Ljava/util/Map;", "navigators", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, String> f225494c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, s1<? extends y0>> _navigators = new LinkedHashMap();

    /* JADX INFO: renamed from: y9.t1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly9/t1$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Ly9/s1;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a(Class<? extends s1<?>> navigatorClass) {
            String str = (String) t1.f225494c.get(navigatorClass);
            if (str != null) {
                return str;
            }
            s1.b bVar = (s1.b) navigatorClass.getAnnotation(s1.b.class);
            String strValue = bVar != null ? bVar.value() : null;
            if (b(strValue)) {
                t1.f225494c.put(navigatorClass, strValue);
                return strValue;
            }
            throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
        }

        public final boolean b(String name) {
            return name != null && name.length() > 0;
        }

        private Companion() {
        }
    }

    public s1<? extends y0> b(String name, s1<? extends y0> navigator) {
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        s1<? extends y0> s1Var = this._navigators.get(name);
        if (t.c(s1Var, navigator)) {
            return navigator;
        }
        boolean z15 = false;
        if (s1Var != null && s1Var.getIsAttached()) {
            z15 = true;
        }
        if (z15) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + s1Var).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s1<? extends y0> c(s1<? extends y0> navigator) {
        return b(INSTANCE.a(navigator.getClass()), navigator);
    }

    public final <T extends s1<?>> T d(Class<T> navigatorClass) {
        return (T) e(INSTANCE.a(navigatorClass));
    }

    public <T extends s1<?>> T e(String name) {
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        s1<? extends y0> s1Var = this._navigators.get(name);
        if (s1Var != null) {
            return s1Var;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map<String, s1<? extends y0>> f() {
        return v0.u(this._navigators);
    }
}
