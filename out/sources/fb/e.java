package fb;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e extends androidx.fragment.app.f0 {

    class a extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f60580a;

        a(Rect rect) {
            this.f60580a = rect;
        }
    }

    class b implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f60582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f60583b;

        b(View view, ArrayList arrayList) {
            this.f60582a = view;
            this.f60583b = arrayList;
        }

        @Override // fb.k.h
        public void a(k kVar) {
        }

        @Override // fb.k.h
        public void d(k kVar) {
        }

        @Override // fb.k.h
        public void h(k kVar) {
            kVar.n0(this);
            kVar.e(this);
        }

        @Override // fb.k.h
        public void k(k kVar) {
            kVar.n0(this);
            this.f60582a.setVisibility(8);
            int size = this.f60583b.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((View) this.f60583b.get(i15)).setVisibility(0);
            }
        }

        @Override // fb.k.h
        public void l(k kVar) {
        }
    }

    class c extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f60585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f60586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f60587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f60588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f60589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f60590f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f60585a = obj;
            this.f60586b = arrayList;
            this.f60587c = obj2;
            this.f60588d = arrayList2;
            this.f60589e = obj3;
            this.f60590f = arrayList3;
        }

        @Override // fb.r, fb.k.h
        public void h(k kVar) {
            Object obj = this.f60585a;
            if (obj != null) {
                e.this.E(obj, this.f60586b, null);
            }
            Object obj2 = this.f60587c;
            if (obj2 != null) {
                e.this.E(obj2, this.f60588d, null);
            }
            Object obj3 = this.f60589e;
            if (obj3 != null) {
                e.this.E(obj3, this.f60590f, null);
            }
        }

        @Override // fb.r, fb.k.h
        public void k(k kVar) {
            kVar.n0(this);
        }
    }

    class d implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f60592a;

        d(Runnable runnable) {
            this.f60592a = runnable;
        }

        @Override // fb.k.h
        public void a(k kVar) {
        }

        @Override // fb.k.h
        public void d(k kVar) {
        }

        @Override // fb.k.h
        public void h(k kVar) {
        }

        @Override // fb.k.h
        public void k(k kVar) {
            this.f60592a.run();
        }

        @Override // fb.k.h
        public void l(k kVar) {
        }
    }

    /* JADX INFO: renamed from: fb.e$e, reason: collision with other inner class name */
    class C1370e extends k.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f60594a;

        C1370e(Rect rect) {
            this.f60594a = rect;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, k kVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            kVar.cancel();
            runnable2.run();
        }
    }

    private static boolean D(k kVar) {
        return (androidx.fragment.app.f0.l(kVar.O()) && androidx.fragment.app.f0.l(kVar.P()) && androidx.fragment.app.f0.l(kVar.Q())) ? false : true;
    }

    @Override // androidx.fragment.app.f0
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.R().clear();
            vVar.R().addAll(arrayList2);
            E(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.f0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.D0((k) obj);
        return vVar;
    }

    public void E(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        k kVar = (k) obj;
        int i15 = 0;
        if (kVar instanceof v) {
            v vVar = (v) kVar;
            int iG0 = vVar.G0();
            while (i15 < iG0) {
                E(vVar.F0(i15), arrayList, arrayList2);
                i15++;
            }
            return;
        }
        if (D(kVar)) {
            return;
        }
        List<View> listR = kVar.R();
        if (listR.size() == arrayList.size() && listR.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i15 < size) {
                kVar.g(arrayList2.get(i15));
                i15++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                kVar.o0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.f0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((k) obj).g(view);
        }
    }

    @Override // androidx.fragment.app.f0
    public void b(Object obj, ArrayList<View> arrayList) {
        k kVar = (k) obj;
        if (kVar == null) {
            return;
        }
        int i15 = 0;
        if (kVar instanceof v) {
            v vVar = (v) kVar;
            int iG0 = vVar.G0();
            while (i15 < iG0) {
                b(vVar.F0(i15), arrayList);
                i15++;
            }
            return;
        }
        if (D(kVar) || !androidx.fragment.app.f0.l(kVar.R())) {
            return;
        }
        int size = arrayList.size();
        while (i15 < size) {
            kVar.g(arrayList.get(i15));
            i15++;
        }
    }

    @Override // androidx.fragment.app.f0
    public void c(Object obj) {
        ((u) obj).c();
    }

    @Override // androidx.fragment.app.f0
    public void d(Object obj, Runnable runnable) {
        ((u) obj).i(runnable);
    }

    @Override // androidx.fragment.app.f0
    public void e(ViewGroup viewGroup, Object obj) {
        s.a(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.f0
    public boolean g(Object obj) {
        return obj instanceof k;
    }

    @Override // androidx.fragment.app.f0
    public Object h(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.f0
    public Object j(ViewGroup viewGroup, Object obj) {
        return s.b(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.f0
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.f0
    public boolean n(Object obj) {
        boolean zX = ((k) obj).X();
        if (!zX) {
            Objects.toString(obj);
        }
        return zX;
    }

    @Override // androidx.fragment.app.f0
    public Object o(Object obj, Object obj2, Object obj3) {
        k kVarP0 = (k) obj;
        k kVar = (k) obj2;
        k kVar2 = (k) obj3;
        if (kVarP0 != null && kVar != null) {
            kVarP0 = new v().D0(kVarP0).D0(kVar).P0(1);
        } else if (kVarP0 == null) {
            kVarP0 = kVar != null ? kVar : null;
        }
        if (kVar2 == null) {
            return kVarP0;
        }
        v vVar = new v();
        if (kVarP0 != null) {
            vVar.D0(kVarP0);
        }
        vVar.D0(kVar2);
        return vVar;
    }

    @Override // androidx.fragment.app.f0
    public Object p(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.D0((k) obj);
        }
        if (obj2 != null) {
            vVar.D0((k) obj2);
        }
        if (obj3 != null) {
            vVar.D0((k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.f0
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((k) obj).e(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.f0
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((k) obj).e(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.f0
    public void t(Object obj, float f15) {
        u uVar = (u) obj;
        if (uVar.f()) {
            long jB = (long) (f15 * uVar.b());
            if (jB == 0) {
                jB = 1;
            }
            if (jB == uVar.b()) {
                jB = uVar.b() - 1;
            }
            uVar.g(jB);
        }
    }

    @Override // androidx.fragment.app.f0
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((k) obj).u0(new C1370e(rect));
        }
    }

    @Override // androidx.fragment.app.f0
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((k) obj).u0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.f0
    public void w(androidx.fragment.app.o oVar, Object obj, e6.d dVar, Runnable runnable) {
        x(oVar, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.f0
    public void x(androidx.fragment.app.o oVar, Object obj, e6.d dVar, final Runnable runnable, final Runnable runnable2) {
        final k kVar = (k) obj;
        dVar.c(new e6.d.a() { // from class: fb.d
            @Override // e6.d.a
            public final void onCancel() {
                e.C(runnable, kVar, runnable2);
            }
        });
        kVar.e(new d(runnable2));
    }

    @Override // androidx.fragment.app.f0
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        v vVar = (v) obj;
        List<View> listR = vVar.R();
        listR.clear();
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            androidx.fragment.app.f0.f(listR, arrayList.get(i15));
        }
        listR.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }
}
