package f7;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import fr.t;
import io.sentry.android.core.c2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00031\u0007%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00062\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001f2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lf7/c;", "", "<init>", "()V", "Landroidx/fragment/app/o;", "fragment", "Lf7/c$c;", "b", "(Landroidx/fragment/app/o;)Lf7/c$c;", "", "previousFragmentId", "Loq/i0;", "f", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/o;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "j", "(Landroidx/fragment/app/o;Landroidx/fragment/app/o;I)V", "h", "(Landroidx/fragment/app/o;)V", "i", "Lf7/g;", "violation", "e", "(Lf7/g;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "", "l", "(Lf7/c$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(Lf7/c$c;Lf7/g;)V", "Ljava/lang/Runnable;", "runnable", "k", "(Landroidx/fragment/app/o;Ljava/lang/Runnable;)V", "Lf7/c$c;", "getDefaultPolicy", "()Lf7/c$c;", "setDefaultPolicy", "(Lf7/c$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f59703a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static C1343c defaultPolicy = C1343c.f59716d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lf7/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lf7/c$b;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
    }

    /* JADX INFO: renamed from: f7.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf7/c$c;", "", "", "Lf7/c$a;", "flags", "Lf7/c$b;", "listener", "", "", "", "Ljava/lang/Class;", "Lf7/g;", "allowedViolations", "<init>", "(Ljava/util/Set;Lf7/c$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "Lf7/c$b;", "()Lf7/c$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1343c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1343c f59716d = new C1343c(e1.e(), null, v0.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<a> flags;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Set<Class<? extends g>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public C1343c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends g>>> map) {
            this.flags = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends g>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<a> a() {
            return this.flags;
        }

        public final b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends g>>> c() {
            return this.mAllowedViolations;
        }
    }

    private c() {
    }

    private final C1343c b(o fragment) {
        while (fragment != null) {
            if (fragment.i0()) {
                FragmentManager fragmentManagerN = fragment.N();
                if (fragmentManagerN.E0() != null) {
                    return fragmentManagerN.E0();
                }
            }
            fragment = fragment.M();
        }
        return defaultPolicy;
    }

    private final void c(C1343c policy, final g violation) {
        o oVarA = violation.getFragment();
        final String name = oVarA.getClass().getName();
        policy.a().contains(a.PENALTY_LOG);
        policy.b();
        if (policy.a().contains(a.PENALTY_DEATH)) {
            k(oVarA, new Runnable() { // from class: f7.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, g gVar) {
        c2.f("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, gVar);
        throw gVar;
    }

    private final void e(g violation) {
        if (FragmentManager.L0(3)) {
            violation.getFragment().getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(o fragment, String previousFragmentId) {
        f7.a aVar = new f7.a(fragment, previousFragmentId);
        c cVar = f59703a;
        cVar.e(aVar);
        C1343c c1343cB = cVar.b(fragment);
        if (c1343cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(c1343cB, fragment.getClass(), aVar.getClass())) {
            cVar.c(c1343cB, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(o fragment, ViewGroup container) {
        d dVar = new d(fragment, container);
        c cVar = f59703a;
        cVar.e(dVar);
        C1343c c1343cB = cVar.b(fragment);
        if (c1343cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(c1343cB, fragment.getClass(), dVar.getClass())) {
            cVar.c(c1343cB, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(o fragment) {
        e eVar = new e(fragment);
        c cVar = f59703a;
        cVar.e(eVar);
        C1343c c1343cB = cVar.b(fragment);
        if (c1343cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(c1343cB, fragment.getClass(), eVar.getClass())) {
            cVar.c(c1343cB, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(o fragment, ViewGroup container) {
        h hVar = new h(fragment, container);
        c cVar = f59703a;
        cVar.e(hVar);
        C1343c c1343cB = cVar.b(fragment);
        if (c1343cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(c1343cB, fragment.getClass(), hVar.getClass())) {
            cVar.c(c1343cB, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(o fragment, o expectedParentFragment, int containerId) {
        i iVar = new i(fragment, expectedParentFragment, containerId);
        c cVar = f59703a;
        cVar.e(iVar);
        C1343c c1343cB = cVar.b(fragment);
        if (c1343cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.l(c1343cB, fragment.getClass(), iVar.getClass())) {
            cVar.c(c1343cB, iVar);
        }
    }

    private final void k(o fragment, Runnable runnable) {
        if (!fragment.i0()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.N().y0().getHandler();
        if (t.c(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final boolean l(C1343c policy, Class<? extends o> fragmentClass, Class<? extends g> violationClass) {
        Set<Class<? extends g>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (t.c(violationClass.getSuperclass(), g.class) || !v.c0(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }
}
