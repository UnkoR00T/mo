package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j6.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f13264s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f13265h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f13266i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<j> f13267j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<i> f13268k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.f0>> f13269l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f13270m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f13271n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f13272o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f13273p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f13274q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.f0> f13275r = new ArrayList<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13276a;

        a(ArrayList arrayList) {
            this.f13276a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f13276a) {
                g.this.S(jVar.f13310a, jVar.f13311b, jVar.f13312c, jVar.f13313d, jVar.f13314e);
            }
            this.f13276a.clear();
            g.this.f13270m.remove(this.f13276a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13278a;

        b(ArrayList arrayList) {
            this.f13278a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13278a.iterator();
            while (it.hasNext()) {
                g.this.R((i) it.next());
            }
            this.f13278a.clear();
            g.this.f13271n.remove(this.f13278a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13280a;

        c(ArrayList arrayList) {
            this.f13280a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13280a.iterator();
            while (it.hasNext()) {
                g.this.Q((RecyclerView.f0) it.next());
            }
            this.f13280a.clear();
            g.this.f13269l.remove(this.f13280a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f13282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13284c;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13282a = f0Var;
            this.f13283b = viewPropertyAnimator;
            this.f13284c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13283b.setListener(null);
            this.f13284c.setAlpha(1.0f);
            g.this.G(this.f13282a);
            g.this.f13274q.remove(this.f13282a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.H(this.f13282a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f13286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13288c;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13286a = f0Var;
            this.f13287b = view;
            this.f13288c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13287b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13288c.setListener(null);
            g.this.A(this.f13286a);
            g.this.f13272o.remove(this.f13286a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.B(this.f13286a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f13290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13294e;

        f(RecyclerView.f0 f0Var, int i15, View view, int i16, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13290a = f0Var;
            this.f13291b = i15;
            this.f13292c = view;
            this.f13293d = i16;
            this.f13294e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f13291b != 0) {
                this.f13292c.setTranslationX(0.0f);
            }
            if (this.f13293d != 0) {
                this.f13292c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13294e.setListener(null);
            g.this.E(this.f13290a);
            g.this.f13273p.remove(this.f13290a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.F(this.f13290a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C0278g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13298c;

        C0278g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13296a = iVar;
            this.f13297b = viewPropertyAnimator;
            this.f13298c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13297b.setListener(null);
            this.f13298c.setAlpha(1.0f);
            this.f13298c.setTranslationX(0.0f);
            this.f13298c.setTranslationY(0.0f);
            g.this.C(this.f13296a.f13304a, true);
            g.this.f13275r.remove(this.f13296a.f13304a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f13296a.f13304a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13302c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13300a = iVar;
            this.f13301b = viewPropertyAnimator;
            this.f13302c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13301b.setListener(null);
            this.f13302c.setAlpha(1.0f);
            this.f13302c.setTranslationX(0.0f);
            this.f13302c.setTranslationY(0.0f);
            g.this.C(this.f13300a.f13305b, false);
            g.this.f13275r.remove(this.f13300a.f13305b);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f13300a.f13305b, false);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f13310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13314e;

        j(RecyclerView.f0 f0Var, int i15, int i16, int i17, int i18) {
            this.f13310a = f0Var;
            this.f13311b = i15;
            this.f13312c = i16;
            this.f13313d = i17;
            this.f13314e = i18;
        }
    }

    private void T(RecyclerView.f0 f0Var) {
        View view = f0Var.f13091a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13274q.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, f0Var) && iVar.f13304a == null && iVar.f13305b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f13304a;
        if (f0Var != null) {
            Y(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f13305b;
        if (f0Var2 != null) {
            Y(iVar, f0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.f0 f0Var) {
        boolean z15 = false;
        if (iVar.f13305b == f0Var) {
            iVar.f13305b = null;
        } else {
            if (iVar.f13304a != f0Var) {
                return false;
            }
            iVar.f13304a = null;
            z15 = true;
        }
        f0Var.f13091a.setAlpha(1.0f);
        f0Var.f13091a.setTranslationX(0.0f);
        f0Var.f13091a.setTranslationY(0.0f);
        C(f0Var, z15);
        return true;
    }

    private void Z(RecyclerView.f0 f0Var) {
        if (f13264s == null) {
            f13264s = new ValueAnimator().getInterpolator();
        }
        f0Var.f13091a.animate().setInterpolator(f13264s);
        j(f0Var);
    }

    void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.f13091a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13272o.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f13304a;
        View view = f0Var == null ? null : f0Var.f13091a;
        RecyclerView.f0 f0Var2 = iVar.f13305b;
        View view2 = f0Var2 != null ? f0Var2.f13091a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f13275r.add(iVar.f13304a);
            duration.translationX(iVar.f13308e - iVar.f13306c);
            duration.translationY(iVar.f13309f - iVar.f13307d);
            duration.alpha(0.0f).setListener(new C0278g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f13275r.add(iVar.f13305b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.f0 f0Var, int i15, int i16, int i17, int i18) {
        View view = f0Var.f13091a;
        int i19 = i17 - i15;
        int i25 = i18 - i16;
        if (i19 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i25 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f13273p.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(f0Var, i19, view, i25, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f13091a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.f0 f0Var, List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.f13091a;
        view.animate().cancel();
        int size = this.f13267j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f13267j.get(size).f13310a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f13267j.remove(size);
            }
        }
        W(this.f13268k, f0Var);
        if (this.f13265h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f13266i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f13271n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f13271n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f13271n.remove(size2);
            }
        }
        for (int size3 = this.f13270m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f13270m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f13310a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f13270m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f13269l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f13269l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f13269l.remove(size5);
                }
            }
        }
        this.f13274q.remove(f0Var);
        this.f13272o.remove(f0Var);
        this.f13275r.remove(f0Var);
        this.f13273p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f13267j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f13267j.get(size);
            View view = jVar.f13310a.f13091a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f13310a);
            this.f13267j.remove(size);
        }
        for (int size2 = this.f13265h.size() - 1; size2 >= 0; size2--) {
            G(this.f13265h.get(size2));
            this.f13265h.remove(size2);
        }
        int size3 = this.f13266i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f13266i.get(size3);
            f0Var.f13091a.setAlpha(1.0f);
            A(f0Var);
            this.f13266i.remove(size3);
        }
        for (int size4 = this.f13268k.size() - 1; size4 >= 0; size4--) {
            X(this.f13268k.get(size4));
        }
        this.f13268k.clear();
        if (p()) {
            for (int size5 = this.f13270m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f13270m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f13310a.f13091a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f13310a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f13270m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f13269l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f13269l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.f13091a.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f13269l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f13271n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f13271n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f13271n.remove(arrayList3);
                    }
                }
            }
            U(this.f13274q);
            U(this.f13273p);
            U(this.f13272o);
            U(this.f13275r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f13266i.isEmpty() && this.f13268k.isEmpty() && this.f13267j.isEmpty() && this.f13265h.isEmpty() && this.f13273p.isEmpty() && this.f13274q.isEmpty() && this.f13272o.isEmpty() && this.f13275r.isEmpty() && this.f13270m.isEmpty() && this.f13269l.isEmpty() && this.f13271n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean zIsEmpty = this.f13265h.isEmpty();
        boolean zIsEmpty2 = this.f13267j.isEmpty();
        boolean zIsEmpty3 = this.f13268k.isEmpty();
        boolean zIsEmpty4 = this.f13266i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.f0> it = this.f13265h.iterator();
        while (it.hasNext()) {
            T(it.next());
        }
        this.f13265h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f13267j);
            this.f13270m.add(arrayList);
            this.f13267j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                l0.a0(arrayList.get(0).f13310a.f13091a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f13268k);
            this.f13271n.add(arrayList2);
            this.f13268k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                l0.a0(arrayList2.get(0).f13304a.f13091a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f13266i);
        this.f13269l.add(arrayList3);
        this.f13266i.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            l0.a0(arrayList3.get(0).f13091a, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.f13091a.setAlpha(0.0f);
        this.f13266i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i15, int i16, int i17, int i18) {
        if (f0Var == f0Var2) {
            return y(f0Var, i15, i16, i17, i18);
        }
        float translationX = f0Var.f13091a.getTranslationX();
        float translationY = f0Var.f13091a.getTranslationY();
        float alpha = f0Var.f13091a.getAlpha();
        Z(f0Var);
        int i19 = (int) ((i17 - i15) - translationX);
        int i25 = (int) ((i18 - i16) - translationY);
        f0Var.f13091a.setTranslationX(translationX);
        f0Var.f13091a.setTranslationY(translationY);
        f0Var.f13091a.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.f13091a.setTranslationX(-i19);
            f0Var2.f13091a.setTranslationY(-i25);
            f0Var2.f13091a.setAlpha(0.0f);
        }
        this.f13268k.add(new i(f0Var, f0Var2, i15, i16, i17, i18));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.f0 f0Var, int i15, int i16, int i17, int i18) {
        View view = f0Var.f13091a;
        int translationX = i15 + ((int) view.getTranslationX());
        int translationY = i16 + ((int) f0Var.f13091a.getTranslationY());
        Z(f0Var);
        int i19 = i17 - translationX;
        int i25 = i18 - translationY;
        if (i19 == 0 && i25 == 0) {
            E(f0Var);
            return false;
        }
        if (i19 != 0) {
            view.setTranslationX(-i19);
        }
        if (i25 != 0) {
            view.setTranslationY(-i25);
        }
        this.f13267j.add(new j(f0Var, translationX, translationY, i17, i18));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f13265h.add(f0Var);
        return true;
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f13304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.f0 f13305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13309f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f13304a = f0Var;
            this.f13305b = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f13304a + ", newHolder=" + this.f13305b + ", fromX=" + this.f13306c + ", fromY=" + this.f13307d + ", toX=" + this.f13308e + ", toY=" + this.f13309f + '}';
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i15, int i16, int i17, int i18) {
            this(f0Var, f0Var2);
            this.f13306c = i15;
            this.f13307d = i16;
            this.f13308e = i17;
            this.f13309f = i18;
        }
    }
}
