package fb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j6.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements Cloneable {
    private static final Animator[] T = new Animator[0];
    private static final int[] X = {2, 1, 3, 4};
    private static final fb.g Y = new a();
    private static ThreadLocal<r0.a<Animator, d>> Z = new ThreadLocal<>();
    private e I;
    private r0.a<String, String> K;
    long O;
    g P;
    long R;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList<x> f60643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList<x> f60644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private h[] f60645y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60624a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f60625b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f60626c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f60627d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f60628e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<View> f60629f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f60630g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f60631h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Integer> f60632j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<View> f60633k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Class<?>> f60634l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<String> f60635m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<Integer> f60636n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList<View> f60637p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<Class<?>> f60638q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y f60639r = new y();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f60640s = new y();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    v f60641t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f60642v = X;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f60646z = false;
    ArrayList<Animator> A = new ArrayList<>();
    private Animator[] B = T;
    int C = 0;
    private boolean D = false;
    boolean E = false;
    private k F = null;
    private ArrayList<h> G = null;
    ArrayList<Animator> H = new ArrayList<>();
    private fb.g L = Y;

    class a extends fb.g {
        a() {
        }

        @Override // fb.g
        public Path a(float f15, float f16, float f17, float f18) {
            Path path = new Path();
            path.moveTo(f15, f16);
            path.lineTo(f17, f18);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0.a f60647a;

        b(r0.a aVar) {
            this.f60647a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f60647a.remove(animator);
            k.this.A.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            k.this.A.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k.this.y();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f60650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f60651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        x f60652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f60653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        k f60654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f60655f;

        d(View view, String str, k kVar, WindowId windowId, x xVar, Animator animator) {
            this.f60650a = view;
            this.f60651b = str;
            this.f60652c = xVar;
            this.f60653d = windowId;
            this.f60654e = kVar;
            this.f60655f = animator;
        }
    }

    public static abstract class e {
    }

    private static class f {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j15) {
            ((AnimatorSet) animator).setCurrentPlayTime(j15);
        }
    }

    class g extends r implements u, z6.e.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f60659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f60660e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private z6.i f60662g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f60665j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f60656a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<i6.a<u>> f60657b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<i6.a<u>> f60658c = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f60661f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private i6.a<u>[] f60663h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final z f60664i = new z();

        g() {
        }

        public static /* synthetic */ void n(g gVar, z6.e eVar, boolean z15, float f15, float f16) {
            if (z15) {
                gVar.getClass();
                return;
            }
            if (f15 >= 1.0f) {
                k.this.j0(i.f60668b, false);
                return;
            }
            long jB = gVar.b();
            k kVarF0 = ((v) k.this).F0(0);
            k kVar = kVarF0.F;
            kVarF0.F = null;
            k.this.s0(-1L, gVar.f60656a);
            k.this.s0(jB, -1L);
            gVar.f60656a = jB;
            Runnable runnable = gVar.f60665j;
            if (runnable != null) {
                runnable.run();
            }
            k.this.H.clear();
            if (kVar != null) {
                kVar.j0(i.f60668b, true);
            }
        }

        private void o() {
            ArrayList<i6.a<u>> arrayList = this.f60658c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f60658c.size();
            if (this.f60663h == null) {
                this.f60663h = new i6.a[size];
            }
            i6.a<u>[] aVarArr = (i6.a[]) this.f60658c.toArray(this.f60663h);
            this.f60663h = null;
            for (int i15 = 0; i15 < size; i15++) {
                aVarArr[i15].accept(this);
                aVarArr[i15] = null;
            }
            this.f60663h = aVarArr;
        }

        private void p() {
            if (this.f60662g != null) {
                return;
            }
            this.f60664i.a(AnimationUtils.currentAnimationTimeMillis(), this.f60656a);
            this.f60662g = new z6.i(new z6.g());
            z6.j jVar = new z6.j();
            jVar.f(1.0f);
            jVar.h(200.0f);
            this.f60662g.x(jVar);
            this.f60662g.n(this.f60656a);
            this.f60662g.c(this);
            this.f60662g.o(this.f60664i.b());
            this.f60662g.j(b() + 1);
            this.f60662g.k(-1.0f);
            this.f60662g.l(4.0f);
            this.f60662g.b(new z6.e.q() { // from class: fb.l
                @Override // z6.e.q
                public final void a(z6.e eVar, boolean z15, float f15, float f16) {
                    k.g.n(this.f60672a, eVar, z15, f15, f16);
                }
            });
        }

        @Override // fb.u
        public long b() {
            return k.this.S();
        }

        @Override // fb.u
        public void c() {
            if (this.f60659d) {
                p();
                this.f60662g.t(b() + 1);
            } else {
                this.f60661f = 1;
                this.f60665j = null;
            }
        }

        @Override // fb.u
        public boolean f() {
            return this.f60659d;
        }

        @Override // fb.u
        public void g(long j15) {
            if (this.f60662g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j15 == this.f60656a || !f()) {
                return;
            }
            if (!this.f60660e) {
                if (j15 != 0 || this.f60656a <= 0) {
                    long jB = b();
                    if (j15 == jB && this.f60656a < jB) {
                        j15 = 1 + jB;
                    }
                } else {
                    j15 = -1;
                }
                long j16 = this.f60656a;
                if (j15 != j16) {
                    k.this.s0(j15, j16);
                    this.f60656a = j15;
                }
            }
            o();
            this.f60664i.a(AnimationUtils.currentAnimationTimeMillis(), j15);
        }

        @Override // fb.u
        public void i(Runnable runnable) {
            this.f60665j = runnable;
            if (!this.f60659d) {
                this.f60661f = 2;
            } else {
                p();
                this.f60662g.t(0.0f);
            }
        }

        @Override // fb.r, fb.k.h
        public void l(k kVar) {
            this.f60660e = true;
        }

        @Override // z6.e.r
        public void m(z6.e eVar, float f15, float f16) {
            long jMax = Math.max(-1L, Math.min(b() + 1, Math.round(f15)));
            k.this.s0(jMax, this.f60656a);
            this.f60656a = jMax;
            o();
        }

        void q() {
            long j15 = b() == 0 ? 1L : 0L;
            k.this.s0(j15, this.f60656a);
            this.f60656a = j15;
        }

        public void r() {
            this.f60659d = true;
            ArrayList<i6.a<u>> arrayList = this.f60657b;
            if (arrayList != null) {
                this.f60657b = null;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    arrayList.get(i15).accept(this);
                }
            }
            o();
            int i16 = this.f60661f;
            if (i16 == 1) {
                this.f60661f = 0;
                c();
            } else if (i16 == 2) {
                this.f60661f = 0;
                i(this.f60665j);
            }
        }
    }

    public interface h {
        void a(k kVar);

        void d(k kVar);

        default void e(k kVar, boolean z15) {
            h(kVar);
        }

        void h(k kVar);

        default void j(k kVar, boolean z15) {
            k(kVar);
        }

        void k(k kVar);

        void l(k kVar);
    }

    interface i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f60667a = new i() { // from class: fb.m
            @Override // fb.k.i
            public final void b(k.h hVar, k kVar, boolean z15) {
                hVar.e(kVar, z15);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f60668b = new i() { // from class: fb.n
            @Override // fb.k.i
            public final void b(k.h hVar, k kVar, boolean z15) {
                hVar.j(kVar, z15);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f60669c = new i() { // from class: fb.o
            @Override // fb.k.i
            public final void b(k.h hVar, k kVar, boolean z15) {
                hVar.l(kVar);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f60670d = new i() { // from class: fb.p
            @Override // fb.k.i
            public final void b(k.h hVar, k kVar, boolean z15) {
                hVar.d(kVar);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f60671e = new i() { // from class: fb.q
            @Override // fb.k.i
            public final void b(k.h hVar, k kVar, boolean z15) {
                hVar.a(kVar);
            }
        };

        void b(h hVar, k kVar, boolean z15);
    }

    private static r0.a<Animator, d> K() {
        r0.a<Animator, d> aVar = Z.get();
        if (aVar != null) {
            return aVar;
        }
        r0.a<Animator, d> aVar2 = new r0.a<>();
        Z.set(aVar2);
        return aVar2;
    }

    private static boolean c0(x xVar, x xVar2, String str) {
        Object obj = xVar.f60691a.get(str);
        Object obj2 = xVar2.f60691a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void d0(r0.a<View, x> aVar, r0.a<View, x> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i15 = 0; i15 < size; i15++) {
            View viewValueAt = sparseArray.valueAt(i15);
            if (viewValueAt != null && a0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i15))) != null && a0(view)) {
                x xVar = aVar.get(viewValueAt);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f60643w.add(xVar);
                    this.f60644x.add(xVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void e0(r0.a<View, x> aVar, r0.a<View, x> aVar2) {
        x xVarRemove;
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            View viewF = aVar.f(size);
            if (viewF != null && a0(viewF) && (xVarRemove = aVar2.remove(viewF)) != null && a0(xVarRemove.f60692b)) {
                this.f60643w.add(aVar.h(size));
                this.f60644x.add(xVarRemove);
            }
        }
    }

    private void f0(r0.a<View, x> aVar, r0.a<View, x> aVar2, r0.a0<View> a0Var, r0.a0<View> a0Var2) {
        View viewG;
        int iQ = a0Var.q();
        for (int i15 = 0; i15 < iQ; i15++) {
            View viewS = a0Var.s(i15);
            if (viewS != null && a0(viewS) && (viewG = a0Var2.g(a0Var.l(i15))) != null && a0(viewG)) {
                x xVar = aVar.get(viewS);
                x xVar2 = aVar2.get(viewG);
                if (xVar != null && xVar2 != null) {
                    this.f60643w.add(xVar);
                    this.f60644x.add(xVar2);
                    aVar.remove(viewS);
                    aVar2.remove(viewG);
                }
            }
        }
    }

    private void g0(r0.a<View, x> aVar, r0.a<View, x> aVar2, r0.a<String, View> aVar3, r0.a<String, View> aVar4) {
        View view;
        int size = aVar3.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            View viewK = aVar3.k(i15);
            if (viewK != null && a0(viewK) && (view = aVar4.get(aVar3.f(i15))) != null && a0(view)) {
                x xVar = aVar.get(viewK);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.f60643w.add(xVar);
                    this.f60644x.add(xVar2);
                    aVar.remove(viewK);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void h0(y yVar, y yVar2) {
        r0.a<View, x> aVar = new r0.a<>(yVar.f60694a);
        r0.a<View, x> aVar2 = new r0.a<>(yVar2.f60694a);
        int i15 = 0;
        while (true) {
            int[] iArr = this.f60642v;
            if (i15 >= iArr.length) {
                i(aVar, aVar2);
                return;
            }
            int i16 = iArr[i15];
            if (i16 == 1) {
                e0(aVar, aVar2);
            } else if (i16 == 2) {
                g0(aVar, aVar2, yVar.f60697d, yVar2.f60697d);
            } else if (i16 == 3) {
                d0(aVar, aVar2, yVar.f60695b, yVar2.f60695b);
            } else if (i16 == 4) {
                f0(aVar, aVar2, yVar.f60696c, yVar2.f60696c);
            }
            i15++;
        }
    }

    private void i(r0.a<View, x> aVar, r0.a<View, x> aVar2) {
        for (int i15 = 0; i15 < aVar.getSize(); i15++) {
            x xVarK = aVar.k(i15);
            if (a0(xVarK.f60692b)) {
                this.f60643w.add(xVarK);
                this.f60644x.add(null);
            }
        }
        for (int i16 = 0; i16 < aVar2.getSize(); i16++) {
            x xVarK2 = aVar2.k(i16);
            if (a0(xVarK2.f60692b)) {
                this.f60644x.add(xVarK2);
                this.f60643w.add(null);
            }
        }
    }

    private void i0(k kVar, i iVar, boolean z15) {
        k kVar2 = this.F;
        if (kVar2 != null) {
            kVar2.i0(kVar, iVar, z15);
        }
        ArrayList<h> arrayList = this.G;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.G.size();
        h[] hVarArr = this.f60645y;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f60645y = null;
        h[] hVarArr2 = (h[]) this.G.toArray(hVarArr);
        for (int i15 = 0; i15 < size; i15++) {
            iVar.b(hVarArr2[i15], kVar, z15);
            hVarArr2[i15] = null;
        }
        this.f60645y = hVarArr2;
    }

    private static void j(y yVar, View view, x xVar) {
        yVar.f60694a.put(view, xVar);
        int id5 = view.getId();
        if (id5 >= 0) {
            if (yVar.f60695b.indexOfKey(id5) >= 0) {
                yVar.f60695b.put(id5, null);
            } else {
                yVar.f60695b.put(id5, view);
            }
        }
        String strE = l0.E(view);
        if (strE != null) {
            if (yVar.f60697d.containsKey(strE)) {
                yVar.f60697d.put(strE, null);
            } else {
                yVar.f60697d.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f60696c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.f60696c.m(itemIdAtPosition, view);
                    return;
                }
                View viewG = yVar.f60696c.g(itemIdAtPosition);
                if (viewG != null) {
                    viewG.setHasTransientState(false);
                    yVar.f60696c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    private void n(View view, boolean z15) {
        if (view == null) {
            return;
        }
        int id5 = view.getId();
        ArrayList<Integer> arrayList = this.f60632j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id5))) {
            ArrayList<View> arrayList2 = this.f60633k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f60634l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (this.f60634l.get(i15).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z15) {
                        p(xVar);
                    } else {
                        m(xVar);
                    }
                    xVar.f60693c.add(this);
                    o(xVar);
                    if (z15) {
                        j(this.f60639r, view, xVar);
                    } else {
                        j(this.f60640s, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f60636n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id5))) {
                        ArrayList<View> arrayList5 = this.f60637p;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f60638q;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    if (this.f60638q.get(i16).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                                n(viewGroup.getChildAt(i17), z15);
                            }
                        }
                    }
                }
            }
        }
    }

    private void q0(Animator animator, r0.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            l(animator);
        }
    }

    public e A() {
        return this.I;
    }

    String A0(String str) {
        StringBuilder sb5 = new StringBuilder(str);
        sb5.append(getClass().getSimpleName());
        sb5.append("@");
        sb5.append(Integer.toHexString(hashCode()));
        sb5.append(": ");
        if (this.f60626c != -1) {
            sb5.append("dur(");
            sb5.append(this.f60626c);
            sb5.append(") ");
        }
        if (this.f60625b != -1) {
            sb5.append("dly(");
            sb5.append(this.f60625b);
            sb5.append(") ");
        }
        if (this.f60627d != null) {
            sb5.append("interp(");
            sb5.append(this.f60627d);
            sb5.append(") ");
        }
        if (this.f60628e.size() > 0 || this.f60629f.size() > 0) {
            sb5.append("tgts(");
            if (this.f60628e.size() > 0) {
                for (int i15 = 0; i15 < this.f60628e.size(); i15++) {
                    if (i15 > 0) {
                        sb5.append(", ");
                    }
                    sb5.append(this.f60628e.get(i15));
                }
            }
            if (this.f60629f.size() > 0) {
                for (int i16 = 0; i16 < this.f60629f.size(); i16++) {
                    if (i16 > 0) {
                        sb5.append(", ");
                    }
                    sb5.append(this.f60629f.get(i16));
                }
            }
            sb5.append(")");
        }
        return sb5.toString();
    }

    public TimeInterpolator D() {
        return this.f60627d;
    }

    x F(View view, boolean z15) {
        v vVar = this.f60641t;
        if (vVar != null) {
            return vVar.F(view, z15);
        }
        ArrayList<x> arrayList = z15 ? this.f60643w : this.f60644x;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                i15 = -1;
                break;
            }
            x xVar = arrayList.get(i15);
            if (xVar == null) {
                return null;
            }
            if (xVar.f60692b == view) {
                break;
            }
            i15++;
        }
        if (i15 >= 0) {
            return (z15 ? this.f60644x : this.f60643w).get(i15);
        }
        return null;
    }

    public String G() {
        return this.f60624a;
    }

    public fb.g H() {
        return this.L;
    }

    public t I() {
        return null;
    }

    public final k J() {
        v vVar = this.f60641t;
        return vVar != null ? vVar.J() : this;
    }

    public long N() {
        return this.f60625b;
    }

    public List<Integer> O() {
        return this.f60628e;
    }

    public List<String> P() {
        return this.f60630g;
    }

    public List<Class<?>> Q() {
        return this.f60631h;
    }

    public List<View> R() {
        return this.f60629f;
    }

    final long S() {
        return this.O;
    }

    public String[] T() {
        return null;
    }

    public x U(View view, boolean z15) {
        v vVar = this.f60641t;
        if (vVar != null) {
            return vVar.U(view, z15);
        }
        return (z15 ? this.f60639r : this.f60640s).f60694a.get(view);
    }

    boolean W() {
        return !this.A.isEmpty();
    }

    public boolean X() {
        return false;
    }

    public boolean Y(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrT = T();
            if (strArrT != null) {
                for (String str : strArrT) {
                    if (c0(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = xVar.f60691a.keySet().iterator();
                while (it.hasNext()) {
                    if (c0(xVar, xVar2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean a0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id5 = view.getId();
        ArrayList<Integer> arrayList3 = this.f60632j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id5))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f60633k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f60634l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (this.f60634l.get(i15).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f60635m != null && l0.E(view) != null && this.f60635m.contains(l0.E(view))) {
            return false;
        }
        if ((this.f60628e.size() == 0 && this.f60629f.size() == 0 && (((arrayList = this.f60631h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f60630g) == null || arrayList2.isEmpty()))) || this.f60628e.contains(Integer.valueOf(id5)) || this.f60629f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f60630g;
        if (arrayList6 != null && arrayList6.contains(l0.E(view))) {
            return true;
        }
        if (this.f60631h != null) {
            for (int i16 = 0; i16 < this.f60631h.size(); i16++) {
                if (this.f60631h.get(i16).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void cancel() {
        int size = this.A.size();
        Animator[] animatorArr = (Animator[]) this.A.toArray(this.B);
        this.B = T;
        for (int i15 = size - 1; i15 >= 0; i15--) {
            Animator animator = animatorArr[i15];
            animatorArr[i15] = null;
            animator.cancel();
        }
        this.B = animatorArr;
        j0(i.f60669c, false);
    }

    public k e(h hVar) {
        if (this.G == null) {
            this.G = new ArrayList<>();
        }
        this.G.add(hVar);
        return this;
    }

    public k g(View view) {
        this.f60629f.add(view);
        return this;
    }

    void j0(i iVar, boolean z15) {
        i0(this, iVar, z15);
    }

    public void k0(View view) {
        if (this.E) {
            return;
        }
        int size = this.A.size();
        Animator[] animatorArr = (Animator[]) this.A.toArray(this.B);
        this.B = T;
        for (int i15 = size - 1; i15 >= 0; i15--) {
            Animator animator = animatorArr[i15];
            animatorArr[i15] = null;
            animator.pause();
        }
        this.B = animatorArr;
        j0(i.f60670d, false);
        this.D = true;
    }

    protected void l(Animator animator) {
        if (animator == null) {
            y();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (N() >= 0) {
            animator.setStartDelay(N() + animator.getStartDelay());
        }
        if (D() != null) {
            animator.setInterpolator(D());
        }
        animator.addListener(new c());
        animator.start();
    }

    void l0(ViewGroup viewGroup) {
        d dVar;
        this.f60643w = new ArrayList<>();
        this.f60644x = new ArrayList<>();
        h0(this.f60639r, this.f60640s);
        r0.a<Animator, d> aVarK = K();
        int size = aVarK.getSize();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i15 = size - 1; i15 >= 0; i15--) {
            Animator animatorF = aVarK.f(i15);
            if (animatorF != null && (dVar = aVarK.get(animatorF)) != null && dVar.f60650a != null && windowId.equals(dVar.f60653d)) {
                x xVar = dVar.f60652c;
                View view = dVar.f60650a;
                x xVarU = U(view, true);
                x xVarF = F(view, true);
                if (xVarU == null && xVarF == null) {
                    xVarF = this.f60640s.f60694a.get(view);
                }
                if ((xVarU != null || xVarF != null) && dVar.f60654e.Y(xVar, xVarF)) {
                    k kVar = dVar.f60654e;
                    if (kVar.J().P != null) {
                        animatorF.cancel();
                        kVar.A.remove(animatorF);
                        aVarK.h(i15);
                        if (kVar.A.size() == 0) {
                            arrayList.add(kVar);
                        }
                    } else if (animatorF.isRunning() || animatorF.isStarted()) {
                        animatorF.cancel();
                    } else {
                        aVarK.h(i15);
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            k kVar2 = (k) arrayList.get(i16);
            kVar2.j0(i.f60669c, false);
            if (!kVar2.E) {
                kVar2.E = true;
                kVar2.j0(i.f60668b, false);
            }
        }
        w(viewGroup, this.f60639r, this.f60640s, this.f60643w, this.f60644x);
        if (this.P == null) {
            r0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            m0();
            this.P.q();
            this.P.r();
        }
    }

    public abstract void m(x xVar);

    void m0() {
        r0.a<Animator, d> aVarK = K();
        this.O = 0L;
        for (int i15 = 0; i15 < this.H.size(); i15++) {
            Animator animator = this.H.get(i15);
            d dVar = aVarK.get(animator);
            if (animator != null && dVar != null) {
                if (z() >= 0) {
                    dVar.f60655f.setDuration(z());
                }
                if (N() >= 0) {
                    dVar.f60655f.setStartDelay(N() + dVar.f60655f.getStartDelay());
                }
                if (D() != null) {
                    dVar.f60655f.setInterpolator(D());
                }
                this.A.add(animator);
                this.O = Math.max(this.O, f.a(animator));
            }
        }
        this.H.clear();
    }

    public k n0(h hVar) {
        k kVar;
        ArrayList<h> arrayList = this.G;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (kVar = this.F) != null) {
                kVar.n0(hVar);
            }
            if (this.G.size() == 0) {
                this.G = null;
            }
        }
        return this;
    }

    void o(x xVar) {
    }

    public k o0(View view) {
        this.f60629f.remove(view);
        return this;
    }

    public abstract void p(x xVar);

    public void p0(View view) {
        if (this.D) {
            if (!this.E) {
                int size = this.A.size();
                Animator[] animatorArr = (Animator[]) this.A.toArray(this.B);
                this.B = T;
                for (int i15 = size - 1; i15 >= 0; i15--) {
                    Animator animator = animatorArr[i15];
                    animatorArr[i15] = null;
                    animator.resume();
                }
                this.B = animatorArr;
                j0(i.f60671e, false);
            }
            this.D = false;
        }
    }

    void q(ViewGroup viewGroup, boolean z15) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        r0.a<String, String> aVar;
        s(z15);
        if ((this.f60628e.size() > 0 || this.f60629f.size() > 0) && (((arrayList = this.f60630g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f60631h) == null || arrayList2.isEmpty()))) {
            for (int i15 = 0; i15 < this.f60628e.size(); i15++) {
                View viewFindViewById = viewGroup.findViewById(this.f60628e.get(i15).intValue());
                if (viewFindViewById != null) {
                    x xVar = new x(viewFindViewById);
                    if (z15) {
                        p(xVar);
                    } else {
                        m(xVar);
                    }
                    xVar.f60693c.add(this);
                    o(xVar);
                    if (z15) {
                        j(this.f60639r, viewFindViewById, xVar);
                    } else {
                        j(this.f60640s, viewFindViewById, xVar);
                    }
                }
            }
            for (int i16 = 0; i16 < this.f60629f.size(); i16++) {
                View view = this.f60629f.get(i16);
                x xVar2 = new x(view);
                if (z15) {
                    p(xVar2);
                } else {
                    m(xVar2);
                }
                xVar2.f60693c.add(this);
                o(xVar2);
                if (z15) {
                    j(this.f60639r, view, xVar2);
                } else {
                    j(this.f60640s, view, xVar2);
                }
            }
        } else {
            n(viewGroup, z15);
        }
        if (z15 || (aVar = this.K) == null) {
            return;
        }
        int size = aVar.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i17 = 0; i17 < size; i17++) {
            arrayList3.add(this.f60639r.f60697d.remove(this.K.f(i17)));
        }
        for (int i18 = 0; i18 < size; i18++) {
            View view2 = (View) arrayList3.get(i18);
            if (view2 != null) {
                this.f60639r.f60697d.put(this.K.k(i18), view2);
            }
        }
    }

    protected void r0() {
        z0();
        r0.a<Animator, d> aVarK = K();
        for (Animator animator : this.H) {
            if (aVarK.containsKey(animator)) {
                z0();
                q0(animator, aVarK);
            }
        }
        this.H.clear();
        y();
    }

    void s(boolean z15) {
        if (z15) {
            this.f60639r.f60694a.clear();
            this.f60639r.f60695b.clear();
            this.f60639r.f60696c.b();
        } else {
            this.f60640s.f60694a.clear();
            this.f60640s.f60695b.clear();
            this.f60640s.f60696c.b();
        }
    }

    void s0(long j15, long j16) {
        long jS = S();
        int i15 = 0;
        boolean z15 = j15 < j16;
        if ((j16 < 0 && j15 >= 0) || (j16 > jS && j15 <= jS)) {
            this.E = false;
            j0(i.f60667a, z15);
        }
        int size = this.A.size();
        Animator[] animatorArr = (Animator[]) this.A.toArray(this.B);
        this.B = T;
        while (i15 < size) {
            Animator animator = animatorArr[i15];
            animatorArr[i15] = null;
            f.b(animator, Math.min(Math.max(0L, j15), f.a(animator)));
            i15++;
            jS = jS;
        }
        long j17 = jS;
        this.B = animatorArr;
        if ((j15 <= j17 || j16 > j17) && (j15 >= 0 || j16 < 0)) {
            return;
        }
        if (j15 > j17) {
            this.E = true;
        }
        j0(i.f60668b, z15);
    }

    @Override // 
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            kVar.H = new ArrayList<>();
            kVar.f60639r = new y();
            kVar.f60640s = new y();
            kVar.f60643w = null;
            kVar.f60644x = null;
            kVar.P = null;
            kVar.F = this;
            kVar.G = null;
            return kVar;
        } catch (CloneNotSupportedException e15) {
            throw new RuntimeException(e15);
        }
    }

    public k t0(long j15) {
        this.f60626c = j15;
        return this;
    }

    public String toString() {
        return A0("");
    }

    public void u0(e eVar) {
        this.I = eVar;
    }

    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public k v0(TimeInterpolator timeInterpolator) {
        this.f60627d = timeInterpolator;
        return this;
    }

    void w(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        View view;
        x xVar;
        Animator animator;
        Animator animator2;
        k kVar = this;
        r0.a<Animator, d> aVarK = K();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z15 = kVar.J().P != null;
        for (int i15 = 0; i15 < size; i15++) {
            x xVar2 = arrayList.get(i15);
            x xVar3 = arrayList2.get(i15);
            if (xVar2 != null && !xVar2.f60693c.contains(kVar)) {
                xVar2 = null;
            }
            if (xVar3 != null && !xVar3.f60693c.contains(kVar)) {
                xVar3 = null;
            }
            if ((xVar2 != null || xVar3 != null) && (xVar2 == null || xVar3 == null || kVar.Y(xVar2, xVar3))) {
                Animator animatorV = kVar.v(viewGroup, xVar2, xVar3);
                if (animatorV != null) {
                    if (xVar3 != null) {
                        view = xVar3.f60692b;
                        String[] strArrT = kVar.T();
                        if (strArrT != null && strArrT.length > 0) {
                            xVar = new x(view);
                            x xVar4 = yVar2.f60694a.get(view);
                            if (xVar4 != null) {
                                int i16 = 0;
                                while (i16 < strArrT.length) {
                                    Map<String, Object> map = xVar.f60691a;
                                    String[] strArr = strArrT;
                                    String str = strArr[i16];
                                    map.put(str, xVar4.f60691a.get(str));
                                    i16++;
                                    strArrT = strArr;
                                    animatorV = animatorV;
                                }
                            }
                            Animator animator3 = animatorV;
                            int size2 = aVarK.getSize();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = aVarK.get(aVarK.f(i17));
                                if (dVar.f60652c != null && dVar.f60650a == view && dVar.f60651b.equals(G()) && dVar.f60652c.equals(xVar)) {
                                    animator2 = null;
                                    break;
                                }
                                i17++;
                            }
                        } else {
                            animator2 = animatorV;
                            xVar = null;
                        }
                        animatorV = animator2;
                    } else {
                        view = xVar2.f60692b;
                        xVar = null;
                    }
                    View view2 = view;
                    if (animatorV != null) {
                        Animator animator4 = animatorV;
                        kVar = this;
                        d dVar2 = new d(view2, G(), kVar, viewGroup.getWindowId(), xVar, animator4);
                        if (z15) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator4);
                            animator = animatorSet;
                        } else {
                            animator = animator4;
                        }
                        aVarK.put(animator, dVar2);
                        kVar.H.add(animator);
                    } else {
                        kVar = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i18 = 0; i18 < sparseIntArray.size(); i18++) {
                d dVar3 = aVarK.get(kVar.H.get(sparseIntArray.keyAt(i18)));
                dVar3.f60655f.setStartDelay((((long) sparseIntArray.valueAt(i18)) - Long.MAX_VALUE) + dVar3.f60655f.getStartDelay());
            }
        }
    }

    public void w0(fb.g gVar) {
        if (gVar == null) {
            this.L = Y;
        } else {
            this.L = gVar;
        }
    }

    u x() {
        g gVar = new g();
        this.P = gVar;
        e(gVar);
        return this.P;
    }

    public void x0(t tVar) {
    }

    protected void y() {
        int i15 = this.C - 1;
        this.C = i15;
        if (i15 == 0) {
            j0(i.f60668b, false);
            for (int i16 = 0; i16 < this.f60639r.f60696c.q(); i16++) {
                View viewS = this.f60639r.f60696c.s(i16);
                if (viewS != null) {
                    viewS.setHasTransientState(false);
                }
            }
            for (int i17 = 0; i17 < this.f60640s.f60696c.q(); i17++) {
                View viewS2 = this.f60640s.f60696c.s(i17);
                if (viewS2 != null) {
                    viewS2.setHasTransientState(false);
                }
            }
            this.E = true;
        }
    }

    public k y0(long j15) {
        this.f60625b = j15;
        return this;
    }

    public long z() {
        return this.f60626c;
    }

    protected void z0() {
        if (this.C == 0) {
            j0(i.f60667a, false);
            this.E = false;
        }
        this.C++;
    }
}
