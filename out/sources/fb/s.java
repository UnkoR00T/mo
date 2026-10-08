package fb;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f60673a = new fb.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<r0.a<ViewGroup, ArrayList<k>>>> f60674b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f60675c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f60676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f60677b;

        /* JADX INFO: renamed from: fb.s$a$a, reason: collision with other inner class name */
        class C1371a extends r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r0.a f60678a;

            C1371a(r0.a aVar) {
                this.f60678a = aVar;
            }

            @Override // fb.r, fb.k.h
            public void k(k kVar) {
                ((ArrayList) this.f60678a.get(a.this.f60677b)).remove(kVar);
                kVar.n0(this);
            }
        }

        a(k kVar, ViewGroup viewGroup) {
            this.f60676a = kVar;
            this.f60677b = viewGroup;
        }

        private void a() {
            this.f60677b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f60677b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!s.f60675c.remove(this.f60677b)) {
                return true;
            }
            r0.a<ViewGroup, ArrayList<k>> aVarC = s.c();
            ArrayList<k> arrayList = aVarC.get(this.f60677b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarC.put(this.f60677b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f60676a);
            this.f60676a.e(new C1371a(aVarC));
            this.f60676a.q(this.f60677b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).p0(this.f60677b);
                }
            }
            this.f60676a.l0(this.f60677b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            s.f60675c.remove(this.f60677b);
            ArrayList<k> arrayList = s.c().get(this.f60677b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<k> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().p0(this.f60677b);
                }
            }
            this.f60676a.s(true);
        }
    }

    public static void a(ViewGroup viewGroup, k kVar) {
        if (f60675c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f60675c.add(viewGroup);
        if (kVar == null) {
            kVar = f60673a;
        }
        k kVarClone = kVar.clone();
        e(viewGroup, kVarClone);
        j.c(viewGroup, null);
        d(viewGroup, kVarClone);
    }

    public static u b(ViewGroup viewGroup, k kVar) {
        if (f60675c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!kVar.X()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f60675c.add(viewGroup);
        k kVarClone = kVar.clone();
        v vVar = new v();
        vVar.D0(kVarClone);
        e(viewGroup, vVar);
        j.c(viewGroup, null);
        d(viewGroup, vVar);
        viewGroup.invalidate();
        return vVar.x();
    }

    static r0.a<ViewGroup, ArrayList<k>> c() {
        r0.a<ViewGroup, ArrayList<k>> aVar;
        WeakReference<r0.a<ViewGroup, ArrayList<k>>> weakReference = f60674b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        r0.a<ViewGroup, ArrayList<k>> aVar2 = new r0.a<>();
        f60674b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void d(ViewGroup viewGroup, k kVar) {
        if (kVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(kVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, k kVar) {
        ArrayList<k> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<k> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().k0(viewGroup);
            }
        }
        if (kVar != null) {
            kVar.q(viewGroup, true);
        }
        j jVarB = j.b(viewGroup);
        if (jVarB != null) {
            jVarB.a();
        }
    }
}
