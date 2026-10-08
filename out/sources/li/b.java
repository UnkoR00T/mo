package li;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends androidx.recyclerview.widget.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f118309t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f118310u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f118311v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f118312w;

    public b(Resources resources) {
        this.f118312w = resources.getDimensionPixelSize(fi.c.f64036d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final void a0() {
        if (p()) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e0(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    final /* synthetic */ List c0() {
        return this.f118311v;
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void j(RecyclerView.f0 f0Var) throws Throwable {
        try {
            super.j(f0Var);
            if (this.f118309t.remove(f0Var)) {
                e0(f0Var.f13091a);
                A(f0Var);
            }
            a0();
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void k() throws Throwable {
        try {
            List list = this.f118309t;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.f0 f0Var = (RecyclerView.f0) list.get(size);
                e0(f0Var.f13091a);
                A(f0Var);
                list.remove(size);
            }
            List list2 = this.f118311v;
            int size2 = list2.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    super.k();
                    return;
                }
                ((RecyclerView.f0) list2.get(size2)).f13091a.animate().cancel();
            }
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final boolean p() {
        try {
            return (!super.p() && this.f118310u.isEmpty() && this.f118309t.isEmpty() && this.f118311v.isEmpty()) ? false : true;
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.m
    public final void u() throws Throwable {
        try {
            List list = this.f118310u;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                super.w((RecyclerView.f0) it.next());
            }
            list.clear();
            super.u();
            List list2 = this.f118309t;
            if (list2.isEmpty()) {
                return;
            }
            ArrayList<RecyclerView.f0> arrayList = new ArrayList(list2);
            list2.clear();
            for (RecyclerView.f0 f0Var : arrayList) {
                View view = f0Var.f13091a;
                this.f118311v.add(f0Var);
                long jN = n() + (((long) f0Var.o()) * 67);
                view.setTranslationY(-this.f118312w);
                view.setAlpha(0.0f);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.translationY(0.0f).alpha(1.0f).setDuration(133L).setInterpolator(new l7.b()).setStartDelay(jN);
                viewPropertyAnimatorAnimate.setListener(new a(this, view, f0Var, viewPropertyAnimatorAnimate)).start();
            }
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.t
    public final boolean w(RecyclerView.f0 f0Var) throws Throwable {
        try {
            j(f0Var);
            f0Var.f13091a.setAlpha(0.0f);
            if (f0Var instanceof g) {
                if (((g) f0Var).P()) {
                    this.f118309t.add(f0Var);
                    return true;
                }
                this.f118310u.add(f0Var);
                return true;
            }
            if (((l) f0Var).P()) {
                this.f118309t.add(f0Var);
                return true;
            }
            this.f118310u.add(f0Var);
            return true;
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }
}
