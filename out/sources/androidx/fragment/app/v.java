package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J%\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0018J\u001d\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0013J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Landroidx/fragment/app/v;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37058j, "", "recursive", "Loq/i0;", "o", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "p", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "Landroidx/fragment/app/o;", "f", "onlyRecursive", "g", "(Landroidx/fragment/app/o;Z)V", "b", "Landroid/os/Bundle;", "savedInstanceState", "h", "(Landroidx/fragment/app/o;Landroid/os/Bundle;Z)V", "c", "a", "Landroid/view/View;", "v", "m", "(Landroidx/fragment/app/o;Landroid/view/View;Landroid/os/Bundle;Z)V", "k", "i", "l", "outState", "j", "n", "d", "e", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/v$a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<a> lifecycleCallbacks = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/v$a;", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "a", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FragmentManager.FragmentLifecycleCallbacks callback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean recursive;

        public a(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z15) {
            this.callback = fragmentLifecycleCallbacks;
            this.recursive = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public v(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public final void a(o f15, Bundle savedInstanceState, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().a(f15, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().a(this.fragmentManager, f15, savedInstanceState);
            }
        }
    }

    public final void b(o f15, boolean onlyRecursive) {
        Context context = this.fragmentManager.y0().getContext();
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().b(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().b(this.fragmentManager, f15, context);
            }
        }
    }

    public final void c(o f15, Bundle savedInstanceState, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().c(f15, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().c(this.fragmentManager, f15, savedInstanceState);
            }
        }
    }

    public final void d(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().d(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().d(this.fragmentManager, f15);
            }
        }
    }

    public final void e(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().e(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().e(this.fragmentManager, f15);
            }
        }
    }

    public final void f(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().f(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().f(this.fragmentManager, f15);
            }
        }
    }

    public final void g(o f15, boolean onlyRecursive) {
        Context context = this.fragmentManager.y0().getContext();
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().g(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().g(this.fragmentManager, f15, context);
            }
        }
    }

    public final void h(o f15, Bundle savedInstanceState, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().h(f15, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().h(this.fragmentManager, f15, savedInstanceState);
            }
        }
    }

    public final void i(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().i(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().i(this.fragmentManager, f15);
            }
        }
    }

    public final void j(o f15, Bundle outState, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().j(f15, outState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().j(this.fragmentManager, f15, outState);
            }
        }
    }

    public final void k(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().k(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().k(this.fragmentManager, f15);
            }
        }
    }

    public final void l(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().l(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().l(this.fragmentManager, f15);
            }
        }
    }

    public final void m(o f15, View v15, Bundle savedInstanceState, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().m(f15, v15, savedInstanceState, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().m(this.fragmentManager, f15, v15, savedInstanceState);
            }
        }
    }

    public final void n(o f15, boolean onlyRecursive) {
        o oVarB0 = this.fragmentManager.B0();
        if (oVarB0 != null) {
            oVarB0.N().A0().n(f15, true);
        }
        for (a aVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || aVar.getRecursive()) {
                aVar.getCallback().n(this.fragmentManager, f15);
            }
        }
    }

    public final void o(FragmentManager.FragmentLifecycleCallbacks cb5, boolean recursive) {
        this.lifecycleCallbacks.add(new a(cb5, recursive));
    }

    public final void p(FragmentManager.FragmentLifecycleCallbacks cb5) {
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (this.lifecycleCallbacks.get(i15).getCallback() == cb5) {
                        this.lifecycleCallbacks.remove(i15);
                        break;
                    }
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
