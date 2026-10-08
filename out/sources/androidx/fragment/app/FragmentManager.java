package androidx.fragment.app;

import CON.BackEventCompat;
import CON.q0;
import CON.s0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.p016lifecycle.x0;
import androidx.p016lifecycle.y0;
import io.sentry.android.core.c2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s5.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentManager {
    private static boolean U = false;
    static boolean V = true;
    androidx.fragment.app.o A;
    private p006NUl.e<Intent> F;
    private p006NUl.e<p006NUl.j> G;
    private p006NUl.e<String[]> H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList<androidx.fragment.app.a> O;
    private ArrayList<Boolean> P;
    private ArrayList<androidx.fragment.app.o> Q;
    private y R;
    private f7.c.C1343c S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12343b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<androidx.fragment.app.o> f12346e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q0 f12348g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t<?> f12365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e7.g f12366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.o f12367z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<n> f12342a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f12344c = new b0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f12345d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f12347f = new u(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.fragment.app.a f12349h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f12350i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CON.m0 f12351j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f12352k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, androidx.fragment.app.c> f12353l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f12354m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Object> f12355n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<m> f12356o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v f12357p = new v(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<e7.n> f12358q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i6.a<Configuration> f12359r = new i6.a() { // from class: e7.h
        @Override // i6.a
        public final void accept(Object obj) {
            FragmentManager.f(this.f47908a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i6.a<Integer> f12360s = new i6.a() { // from class: e7.i
        @Override // i6.a
        public final void accept(Object obj) {
            FragmentManager.a(this.f47909a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final i6.a<s5.i> f12361t = new i6.a() { // from class: e7.j
        @Override // i6.a
        public final void accept(Object obj) {
            FragmentManager.e(this.f47910a, (s5.i) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final i6.a<s5.t> f12362u = new i6.a() { // from class: e7.k
        @Override // i6.a
        public final void accept(Object obj) {
            FragmentManager.d(this.f47911a, (t) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final j6.r f12363v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f12364w = -1;
    private s B = null;
    private s C = new d();
    private l0 D = null;
    private l0 E = new e();
    ArrayDeque<l> I = new ArrayDeque<>();
    private Runnable T = new f();

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void a(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Context context) {
        }

        public void c(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Bundle bundle) {
        }

        public void d(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public void e(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public void f(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public void g(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Context context) {
        }

        public void h(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Bundle bundle) {
        }

        public void i(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public void j(FragmentManager fragmentManager, androidx.fragment.app.o oVar, Bundle bundle) {
        }

        public void k(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public void l(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }

        public abstract void m(FragmentManager fragmentManager, androidx.fragment.app.o oVar, View view, Bundle bundle);

        public void n(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
        }
    }

    class a implements p006NUl.d<Map<String, Boolean>> {
        a() {
        }

        @Override // p006NUl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                iArr[i15] = ((Boolean) arrayList.get(i15)).booleanValue() ? 0 : -1;
            }
            l lVarPollFirst = FragmentManager.this.I.pollFirst();
            if (lVarPollFirst == null) {
                c2.g("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVarPollFirst.f12378a;
            int i16 = lVarPollFirst.f12379b;
            androidx.fragment.app.o oVarI = FragmentManager.this.f12344c.i(str);
            if (oVarI != null) {
                oVarI.R0(i16, strArr, iArr);
                return;
            }
            c2.g("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends CON.m0 {
        b(boolean z15) {
            super(z15);
        }

        @Override // CON.m0
        public void c() {
            if (FragmentManager.L0(3)) {
                boolean z15 = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.p();
            }
        }

        @Override // CON.m0
        public void d() {
            if (FragmentManager.L0(3)) {
                boolean z15 = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager.this.H0();
        }

        @Override // CON.m0
        public void e(BackEventCompat backEventCompat) {
            if (FragmentManager.L0(2)) {
                boolean z15 = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f12349h != null) {
                Iterator<k0> it = fragmentManager.v(new ArrayList<>(Collections.singletonList(FragmentManager.this.f12349h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(backEventCompat);
                }
                Iterator<m> it4 = FragmentManager.this.f12356o.iterator();
                while (it4.hasNext()) {
                    it4.next().b(backEventCompat);
                }
            }
        }

        @Override // CON.m0
        public void f(BackEventCompat backEventCompat) {
            if (FragmentManager.L0(3)) {
                boolean z15 = FragmentManager.V;
                Objects.toString(FragmentManager.this);
            }
            if (FragmentManager.V) {
                FragmentManager.this.Y();
                FragmentManager.this.f1();
            }
        }
    }

    class c implements j6.r {
        c() {
        }

        @Override // j6.r
        public void a(Menu menu) {
            FragmentManager.this.L(menu);
        }

        @Override // j6.r
        public void b(Menu menu) {
            FragmentManager.this.P(menu);
        }

        @Override // j6.r
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.K(menuItem);
        }

        @Override // j6.r
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.D(menu, menuInflater);
        }
    }

    class d extends s {
        d() {
        }

        @Override // androidx.fragment.app.s
        public androidx.fragment.app.o a(ClassLoader classLoader, String str) {
            return FragmentManager.this.y0().d(FragmentManager.this.y0().getContext(), str, null);
        }
    }

    class e implements l0 {
        e() {
        }

        @Override // androidx.fragment.app.l0
        public k0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.e(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    class g implements e7.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.o f12374a;

        g(androidx.fragment.app.o oVar) {
            this.f12374a = oVar;
        }

        @Override // e7.n
        public void b(FragmentManager fragmentManager, androidx.fragment.app.o oVar) {
            this.f12374a.v0(oVar);
        }
    }

    class h implements p006NUl.d<p006NUl.c> {
        h() {
        }

        @Override // p006NUl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p006NUl.c cVar) {
            l lVarPollLast = FragmentManager.this.I.pollLast();
            if (lVarPollLast == null) {
                c2.g("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVarPollLast.f12378a;
            int i15 = lVarPollLast.f12379b;
            androidx.fragment.app.o oVarI = FragmentManager.this.f12344c.i(str);
            if (oVarI != null) {
                oVarI.s0(i15, cVar.getResultCode(), cVar.getData());
                return;
            }
            c2.g("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements p006NUl.d<p006NUl.c> {
        i() {
        }

        @Override // p006NUl.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p006NUl.c cVar) {
            l lVarPollFirst = FragmentManager.this.I.pollFirst();
            if (lVarPollFirst == null) {
                c2.g("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVarPollFirst.f12378a;
            int i15 = lVarPollFirst.f12379b;
            androidx.fragment.app.o oVarI = FragmentManager.this.f12344c.i(str);
            if (oVarI != null) {
                oVarI.s0(i15, cVar.getResultCode(), cVar.getData());
                return;
            }
            c2.g("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public interface j {
        String getName();
    }

    static class k extends p087nuL.b0<p006NUl.j, p006NUl.c> {
        k() {
        }

        @Override // p087nuL.b0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, p006NUl.j jVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = jVar.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                fillInIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    jVar = new NUl.j.a(jVar.getIntentSender()).b(null).c(jVar.getFlagsValues(), jVar.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
            if (FragmentManager.L0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // p087nuL.b0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p006NUl.c c(int i15, Intent intent) {
            return new p006NUl.c(i15, intent);
        }
    }

    public interface m {
        default void a(androidx.fragment.app.o oVar, boolean z15) {
        }

        default void b(BackEventCompat backEventCompat) {
        }

        default void c(androidx.fragment.app.o oVar, boolean z15) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class o implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f12380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f12381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f12382c;

        o(String str, int i15, int i16) {
            this.f12380a = str;
            this.f12381b = i15;
            this.f12382c = i16;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.o oVar = FragmentManager.this.A;
            if (oVar == null || this.f12381b >= 0 || this.f12380a != null || !oVar.y().a1()) {
                return FragmentManager.this.d1(arrayList, arrayList2, this.f12380a, this.f12381b, this.f12382c);
            }
            return false;
        }
    }

    class p implements n {
        p() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zE1 = FragmentManager.this.e1(arrayList, arrayList2);
            if (!FragmentManager.this.f12356o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.o0(it.next()));
                }
                for (m mVar : FragmentManager.this.f12356o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        mVar.c((androidx.fragment.app.o) it4.next(), zBooleanValue);
                    }
                }
            }
            return zE1;
        }
    }

    static androidx.fragment.app.o F0(View view) {
        Object tag = view.getTag(d7.b.f40108a);
        if (tag instanceof androidx.fragment.app.o) {
            return (androidx.fragment.app.o) tag;
        }
        return null;
    }

    public static boolean L0(int i15) {
        return U || Log.isLoggable("FragmentManager", i15);
    }

    private void M(androidx.fragment.app.o oVar) {
        if (oVar == null || !oVar.equals(g0(oVar.f12594f))) {
            return;
        }
        oVar.q1();
    }

    private boolean M0(androidx.fragment.app.o oVar) {
        return (oVar.K && oVar.L) || oVar.A.q();
    }

    private boolean N0() {
        androidx.fragment.app.o oVar = this.f12367z;
        if (oVar == null) {
            return true;
        }
        return oVar.i0() && this.f12367z.N().N0();
    }

    private void T(int i15) {
        try {
            this.f12343b = true;
            this.f12344c.d(i15);
            U0(i15, false);
            Iterator<k0> it = u().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.f12343b = false;
            b0(true);
        } catch (Throwable th4) {
            this.f12343b = false;
            throw th4;
        }
    }

    private void W() {
        if (this.N) {
            this.N = false;
            w1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        Iterator<k0> it = u().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.N0() && num.intValue() == 80) {
            fragmentManager.G(false);
        }
    }

    private void a0(boolean z15) {
        if (this.f12343b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f12365x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f12365x.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z15) {
            r();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator<m> it = fragmentManager.f12356o.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    private boolean c1(String str, int i15, int i16) {
        b0(false);
        a0(true);
        androidx.fragment.app.o oVar = this.A;
        if (oVar != null && i15 < 0 && str == null && oVar.y().a1()) {
            return true;
        }
        boolean zD1 = d1(this.O, this.P, str, i15, i16);
        if (zD1) {
            this.f12343b = true;
            try {
                j1(this.O, this.P);
                s();
            } catch (Throwable th4) {
                s();
                throw th4;
            }
        }
        z1();
        W();
        this.f12344c.b();
        return zD1;
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, s5.t tVar) {
        if (fragmentManager.N0()) {
            fragmentManager.O(tVar.getIsInPictureInPictureMode(), false);
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i15, int i16) {
        while (i15 < i16) {
            androidx.fragment.app.a aVar = arrayList.get(i15);
            if (arrayList2.get(i15).booleanValue()) {
                aVar.w(-1);
                aVar.C();
            } else {
                aVar.w(1);
                aVar.B();
            }
            i15++;
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, s5.i iVar) {
        if (fragmentManager.N0()) {
            fragmentManager.H(iVar.getIsInMultiWindowMode(), false);
        }
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i15, int i16) {
        boolean z15 = arrayList.get(i15).f12434r;
        ArrayList<androidx.fragment.app.o> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f12344c.o());
        androidx.fragment.app.o oVarC0 = C0();
        boolean z16 = false;
        for (int i17 = i15; i17 < i16; i17++) {
            androidx.fragment.app.a aVar = arrayList.get(i17);
            oVarC0 = !arrayList2.get(i17).booleanValue() ? aVar.D(this.Q, oVarC0) : aVar.F(this.Q, oVarC0);
            z16 = z16 || aVar.f12425i;
        }
        this.Q.clear();
        if (!z15 && this.f12364w >= 1) {
            for (int i18 = i15; i18 < i16; i18++) {
                Iterator<c0.a> it = arrayList.get(i18).f12419c.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.o oVar = it.next().f12437b;
                    if (oVar != null && oVar.f12619y != null) {
                        this.f12344c.r(w(oVar));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i15, i16);
        boolean zBooleanValue = arrayList2.get(i16 - 1).booleanValue();
        if (z16 && !this.f12356o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                linkedHashSet.addAll(o0(it4.next()));
            }
            if (this.f12349h == null) {
                for (m mVar : this.f12356o) {
                    Iterator it5 = linkedHashSet.iterator();
                    while (it5.hasNext()) {
                        mVar.c((androidx.fragment.app.o) it5.next(), zBooleanValue);
                    }
                }
                for (m mVar2 : this.f12356o) {
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        mVar2.a((androidx.fragment.app.o) it6.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i19 = i15; i19 < i16; i19++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i19);
            if (zBooleanValue) {
                for (int size = aVar2.f12419c.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.o oVar2 = aVar2.f12419c.get(size).f12437b;
                    if (oVar2 != null) {
                        w(oVar2).m();
                    }
                }
            } else {
                Iterator<c0.a> it7 = aVar2.f12419c.iterator();
                while (it7.hasNext()) {
                    androidx.fragment.app.o oVar3 = it7.next().f12437b;
                    if (oVar3 != null) {
                        w(oVar3).m();
                    }
                }
            }
        }
        U0(this.f12364w, true);
        for (k0 k0Var : v(arrayList, i15, i16)) {
            k0Var.D(zBooleanValue);
            k0Var.z();
            k0Var.n();
        }
        while (i15 < i16) {
            androidx.fragment.app.a aVar3 = arrayList.get(i15);
            if (arrayList2.get(i15).booleanValue() && aVar3.f12387v >= 0) {
                aVar3.f12387v = -1;
            }
            aVar3.E();
            i15++;
        }
        if (z16) {
            k1();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.N0()) {
            fragmentManager.A(configuration, false);
        }
    }

    private int h0(String str, int i15, boolean z15) {
        if (this.f12345d.isEmpty()) {
            return -1;
        }
        if (str == null && i15 < 0) {
            if (z15) {
                return 0;
            }
            return this.f12345d.size() - 1;
        }
        int size = this.f12345d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f12345d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i15 >= 0 && i15 == aVar.f12387v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z15) {
            if (size == this.f12345d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f12345d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i15 < 0 || i15 != aVar2.f12387v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private void j1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            if (!arrayList.get(i15).f12434r) {
                if (i16 != i15) {
                    e0(arrayList, arrayList2, i16, i15);
                }
                i16 = i15 + 1;
                if (arrayList2.get(i15).booleanValue()) {
                    while (i16 < size && arrayList2.get(i16).booleanValue() && !arrayList.get(i16).f12434r) {
                        i16++;
                    }
                }
                e0(arrayList, arrayList2, i15, i16);
                i15 = i16 - 1;
            }
            i15++;
        }
        if (i16 != size) {
            e0(arrayList, arrayList2, i16, size);
        }
    }

    private void k1() {
        for (int i15 = 0; i15 < this.f12356o.size(); i15++) {
            this.f12356o.get(i15).onBackStackChanged();
        }
    }

    public static FragmentManager l0(View view) {
        androidx.fragment.app.p pVar;
        androidx.fragment.app.o oVarM0 = m0(view);
        if (oVarM0 != null) {
            if (oVarM0.i0()) {
                return oVarM0.y();
            }
            throw new IllegalStateException("The Fragment " + oVarM0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                pVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.p) {
                pVar = (androidx.fragment.app.p) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (pVar != null) {
            return pVar.w0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static androidx.fragment.app.o m0(View view) {
        while (view != null) {
            androidx.fragment.app.o oVarF0 = F0(view);
            if (oVarF0 != null) {
                return oVarF0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static int m1(int i15) {
        if (i15 == 4097) {
            return 8194;
        }
        if (i15 == 8194) {
            return 4097;
        }
        if (i15 == 8197) {
            return 4100;
        }
        if (i15 != 4099) {
            return i15 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private void n0() {
        Iterator<k0> it = u().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f12342a) {
            if (this.f12342a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f12342a.size();
                boolean zA = false;
                for (int i15 = 0; i15 < size; i15++) {
                    zA |= this.f12342a.get(i15).a(arrayList, arrayList2);
                }
                this.f12342a.clear();
                this.f12365x.getHandler().removeCallbacks(this.T);
                return zA;
            } catch (Throwable th4) {
                this.f12342a.clear();
                this.f12365x.getHandler().removeCallbacks(this.T);
                throw th4;
            }
        }
    }

    private void r() {
        if (S0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void s() {
        this.f12343b = false;
        this.P.clear();
        this.O.clear();
    }

    private y s0(androidx.fragment.app.o oVar) {
        return this.R.e9(oVar);
    }

    private void t() {
        boolean zI9;
        t<?> tVar = this.f12365x;
        if (tVar instanceof y0) {
            zI9 = this.f12344c.p().i9();
        } else {
            zI9 = tVar.getContext() instanceof Activity ? !((Activity) this.f12365x.getContext()).isChangingConfigurations() : true;
        }
        if (zI9) {
            Iterator<androidx.fragment.app.c> it = this.f12353l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it4 = it.next().f12415a.iterator();
                while (it4.hasNext()) {
                    this.f12344c.p().b9(it4.next(), false);
                }
            }
        }
    }

    private Set<k0> u() {
        HashSet hashSet = new HashSet();
        Iterator<a0> it = this.f12344c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().P;
            if (viewGroup != null) {
                hashSet.add(k0.v(viewGroup, D0()));
            }
        }
        return hashSet;
    }

    private void u1(androidx.fragment.app.o oVar) {
        ViewGroup viewGroupV0 = v0(oVar);
        if (viewGroupV0 == null || oVar.A() + oVar.D() + oVar.P() + oVar.Q() <= 0) {
            return;
        }
        if (viewGroupV0.getTag(d7.b.f40110c) == null) {
            viewGroupV0.setTag(d7.b.f40110c, oVar);
        }
        ((androidx.fragment.app.o) viewGroupV0.getTag(d7.b.f40110c)).K1(oVar.O());
    }

    private ViewGroup v0(androidx.fragment.app.o oVar) {
        ViewGroup viewGroup = oVar.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.D > 0 && this.f12366y.g()) {
            View viewE = this.f12366y.e(oVar.D);
            if (viewE instanceof ViewGroup) {
                return (ViewGroup) viewE;
            }
        }
        return null;
    }

    private void w1() {
        Iterator<a0> it = this.f12344c.k().iterator();
        while (it.hasNext()) {
            X0(it.next());
        }
    }

    private void x1(RuntimeException runtimeException) {
        c2.e("FragmentManager", runtimeException.getMessage());
        c2.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
        t<?> tVar = this.f12365x;
        if (tVar != null) {
            try {
                tVar.s("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e15) {
                c2.f("FragmentManager", "Failed dumping state", e15);
                throw runtimeException;
            }
        }
        try {
            X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e16) {
            c2.f("FragmentManager", "Failed dumping state", e16);
            throw runtimeException;
        }
    }

    private void z1() {
        synchronized (this.f12342a) {
            try {
                if (!this.f12342a.isEmpty()) {
                    this.f12351j.i(true);
                    if (L0(3)) {
                        toString();
                    }
                } else {
                    boolean z15 = r0() > 0 && Q0(this.f12367z);
                    if (L0(3)) {
                        toString();
                    }
                    this.f12351j.i(z15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void A(Configuration configuration, boolean z15) {
        if (z15 && (this.f12365x instanceof u5.b)) {
            x1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.a1(configuration);
                if (z15) {
                    oVar.A.A(configuration, true);
                }
            }
        }
    }

    v A0() {
        return this.f12357p;
    }

    boolean B(MenuItem menuItem) {
        if (this.f12364w < 1) {
            return false;
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null && oVar.b1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    androidx.fragment.app.o B0() {
        return this.f12367z;
    }

    void C() {
        this.K = false;
        this.L = false;
        this.R.k9(false);
        T(1);
    }

    public androidx.fragment.app.o C0() {
        return this.A;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f12364w < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.o> arrayList = null;
        boolean z15 = false;
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null && P0(oVar) && oVar.d1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(oVar);
                z15 = true;
            }
        }
        if (this.f12346e != null) {
            for (int i15 = 0; i15 < this.f12346e.size(); i15++) {
                androidx.fragment.app.o oVar2 = this.f12346e.get(i15);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.D0();
                }
            }
        }
        this.f12346e = arrayList;
        return z15;
    }

    l0 D0() {
        l0 l0Var = this.D;
        if (l0Var != null) {
            return l0Var;
        }
        androidx.fragment.app.o oVar = this.f12367z;
        return oVar != null ? oVar.f12619y.D0() : this.E;
    }

    void E() {
        this.M = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.f12365x;
        if (obj instanceof u5.c) {
            ((u5.c) obj).j(this.f12360s);
        }
        Object obj2 = this.f12365x;
        if (obj2 instanceof u5.b) {
            ((u5.b) obj2).u(this.f12359r);
        }
        Object obj3 = this.f12365x;
        if (obj3 instanceof s5.p) {
            ((s5.p) obj3).t(this.f12361t);
        }
        Object obj4 = this.f12365x;
        if (obj4 instanceof s5.q) {
            ((s5.q) obj4).m(this.f12362u);
        }
        Object obj5 = this.f12365x;
        if ((obj5 instanceof j6.o) && this.f12367z == null) {
            ((j6.o) obj5).y(this.f12363v);
        }
        this.f12365x = null;
        this.f12366y = null;
        this.f12367z = null;
        if (this.f12348g != null) {
            this.f12351j.h();
            this.f12348g = null;
        }
        p006NUl.e<Intent> eVar = this.F;
        if (eVar != null) {
            eVar.c();
            this.G.c();
            this.H.c();
        }
    }

    public f7.c.C1343c E0() {
        return this.S;
    }

    void F() {
        T(1);
    }

    void G(boolean z15) {
        if (z15 && (this.f12365x instanceof u5.c)) {
            x1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.j1();
                if (z15) {
                    oVar.A.G(true);
                }
            }
        }
    }

    x0 G0(androidx.fragment.app.o oVar) {
        return this.R.h9(oVar);
    }

    void H(boolean z15, boolean z16) {
        if (z16 && (this.f12365x instanceof s5.p)) {
            x1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.k1(z15);
                if (z16) {
                    oVar.A.H(z15, true);
                }
            }
        }
    }

    void H0() {
        this.f12350i = true;
        b0(true);
        this.f12350i = false;
        if (!V || this.f12349h == null) {
            if (this.f12351j.getIsEnabled()) {
                L0(3);
                a1();
                return;
            } else {
                L0(3);
                this.f12348g.j();
                return;
            }
        }
        if (!this.f12356o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o0(this.f12349h));
            for (m mVar : this.f12356o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    mVar.a((androidx.fragment.app.o) it.next(), true);
                }
            }
        }
        Iterator<c0.a> it4 = this.f12349h.f12419c.iterator();
        while (it4.hasNext()) {
            androidx.fragment.app.o oVar = it4.next().f12437b;
            if (oVar != null) {
                oVar.f12603p = false;
            }
        }
        Iterator<k0> it5 = v(new ArrayList<>(Collections.singletonList(this.f12349h)), 0, 1).iterator();
        while (it5.hasNext()) {
            it5.next().f();
        }
        Iterator<c0.a> it6 = this.f12349h.f12419c.iterator();
        while (it6.hasNext()) {
            androidx.fragment.app.o oVar2 = it6.next().f12437b;
            if (oVar2 != null && oVar2.P == null) {
                w(oVar2).m();
            }
        }
        this.f12349h = null;
        z1();
        if (L0(3)) {
            this.f12351j.getIsEnabled();
            toString();
        }
    }

    void I(androidx.fragment.app.o oVar) {
        Iterator<e7.n> it = this.f12358q.iterator();
        while (it.hasNext()) {
            it.next().b(this, oVar);
        }
    }

    void I0(androidx.fragment.app.o oVar) {
        if (L0(2)) {
            Objects.toString(oVar);
        }
        if (oVar.F) {
            return;
        }
        oVar.F = true;
        oVar.f12605q0 = true ^ oVar.f12605q0;
        u1(oVar);
    }

    void J() {
        for (androidx.fragment.app.o oVar : this.f12344c.l()) {
            if (oVar != null) {
                oVar.H0(oVar.j0());
                oVar.A.J();
            }
        }
    }

    void J0(androidx.fragment.app.o oVar) {
        if (oVar.f12601m && M0(oVar)) {
            this.J = true;
        }
    }

    boolean K(MenuItem menuItem) {
        if (this.f12364w < 1) {
            return false;
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null && oVar.l1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean K0() {
        return this.M;
    }

    void L(Menu menu) {
        if (this.f12364w < 1) {
            return;
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.m1(menu);
            }
        }
    }

    void N() {
        T(5);
    }

    void O(boolean z15, boolean z16) {
        if (z16 && (this.f12365x instanceof s5.q)) {
            x1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.o1(z15);
                if (z16) {
                    oVar.A.O(z15, true);
                }
            }
        }
    }

    boolean O0(androidx.fragment.app.o oVar) {
        if (oVar == null) {
            return false;
        }
        return oVar.j0();
    }

    boolean P(Menu menu) {
        boolean z15 = false;
        if (this.f12364w < 1) {
            return false;
        }
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null && P0(oVar) && oVar.p1(menu)) {
                z15 = true;
            }
        }
        return z15;
    }

    boolean P0(androidx.fragment.app.o oVar) {
        if (oVar == null) {
            return true;
        }
        return oVar.l0();
    }

    void Q() {
        z1();
        M(this.A);
    }

    boolean Q0(androidx.fragment.app.o oVar) {
        if (oVar == null) {
            return true;
        }
        FragmentManager fragmentManager = oVar.f12619y;
        return oVar.equals(fragmentManager.C0()) && Q0(fragmentManager.f12367z);
    }

    void R() {
        this.K = false;
        this.L = false;
        this.R.k9(false);
        T(7);
    }

    boolean R0(int i15) {
        return this.f12364w >= i15;
    }

    void S() {
        this.K = false;
        this.L = false;
        this.R.k9(false);
        T(5);
    }

    public boolean S0() {
        return this.K || this.L;
    }

    void T0(androidx.fragment.app.o oVar, Intent intent, int i15, Bundle bundle) {
        if (this.F == null) {
            this.f12365x.x(oVar, intent, i15, bundle);
            return;
        }
        this.I.addLast(new l(oVar.f12594f, i15));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.a(intent);
    }

    void U() {
        this.L = true;
        this.R.k9(true);
        T(4);
    }

    void U0(int i15, boolean z15) {
        t<?> tVar;
        if (this.f12365x == null && i15 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z15 || i15 != this.f12364w) {
            this.f12364w = i15;
            this.f12344c.t();
            w1();
            if (this.J && (tVar = this.f12365x) != null && this.f12364w == 7) {
                tVar.z();
                this.J = false;
            }
        }
    }

    void V() {
        T(2);
    }

    void V0() {
        if (this.f12365x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.k9(false);
        for (androidx.fragment.app.o oVar : this.f12344c.o()) {
            if (oVar != null) {
                oVar.q0();
            }
        }
    }

    public final void W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (a0 a0Var : this.f12344c.k()) {
            androidx.fragment.app.o oVarK = a0Var.k();
            if (oVarK.D == fragmentContainerView.getId() && (view = oVarK.R) != null && view.getParent() == null) {
                oVarK.P = fragmentContainerView;
                a0Var.b();
                a0Var.m();
            }
        }
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f12344c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<androidx.fragment.app.o> arrayList = this.f12346e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i15 = 0; i15 < size; i15++) {
                androidx.fragment.app.o oVar = this.f12346e.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(oVar.toString());
            }
        }
        int size2 = this.f12345d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i16 = 0; i16 < size2; i16++) {
                androidx.fragment.app.a aVar = this.f12345d.get(i16);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i16);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.z(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f12352k.get());
        synchronized (this.f12342a) {
            try {
                int size3 = this.f12342a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i17 = 0; i17 < size3; i17++) {
                        n nVar = this.f12342a.get(i17);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i17);
                        printWriter.print(": ");
                        printWriter.println(nVar);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f12365x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f12366y);
        if (this.f12367z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f12367z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f12364w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    void X0(a0 a0Var) {
        androidx.fragment.app.o oVarK = a0Var.k();
        if (oVarK.T) {
            if (this.f12343b) {
                this.N = true;
            } else {
                oVarK.T = false;
                a0Var.m();
            }
        }
    }

    void Y0(int i15, int i16, boolean z15) {
        if (i15 >= 0) {
            Z(new o(null, i15, i16), z15);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i15);
    }

    void Z(n nVar, boolean z15) {
        if (!z15) {
            if (this.f12365x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f12342a) {
            try {
                if (this.f12365x == null) {
                    if (!z15) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f12342a.add(nVar);
                    p1();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void Z0(String str, int i15) {
        Z(new o(str, -1, i15), false);
    }

    public boolean a1() {
        return c1(null, -1, 0);
    }

    boolean b0(boolean z15) {
        androidx.fragment.app.a aVar;
        a0(z15);
        boolean z16 = false;
        if (!this.f12350i && (aVar = this.f12349h) != null) {
            aVar.f12386u = false;
            aVar.x();
            if (L0(3)) {
                Objects.toString(this.f12349h);
                Objects.toString(this.f12342a);
            }
            this.f12349h.y(false, false);
            this.f12342a.add(0, this.f12349h);
            Iterator<c0.a> it = this.f12349h.f12419c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.o oVar = it.next().f12437b;
                if (oVar != null) {
                    oVar.f12603p = false;
                }
            }
            this.f12349h = null;
        }
        while (p0(this.O, this.P)) {
            z16 = true;
            this.f12343b = true;
            try {
                j1(this.O, this.P);
                s();
            } catch (Throwable th4) {
                s();
                throw th4;
            }
        }
        z1();
        W();
        this.f12344c.b();
        return z16;
    }

    public boolean b1(int i15, int i16) {
        if (i15 >= 0) {
            return c1(null, i15, i16);
        }
        throw new IllegalArgumentException("Bad id: " + i15);
    }

    void c0(n nVar, boolean z15) {
        if (z15 && (this.f12365x == null || this.M)) {
            return;
        }
        a0(z15);
        androidx.fragment.app.a aVar = this.f12349h;
        boolean z16 = false;
        if (aVar != null) {
            aVar.f12386u = false;
            aVar.x();
            if (L0(3)) {
                Objects.toString(this.f12349h);
                Objects.toString(nVar);
            }
            this.f12349h.y(false, false);
            boolean zA = this.f12349h.a(this.O, this.P);
            Iterator<c0.a> it = this.f12349h.f12419c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.o oVar = it.next().f12437b;
                if (oVar != null) {
                    oVar.f12603p = false;
                }
            }
            this.f12349h = null;
            z16 = zA;
        }
        boolean zA2 = nVar.a(this.O, this.P);
        if (z16 || zA2) {
            this.f12343b = true;
            try {
                j1(this.O, this.P);
                s();
            } catch (Throwable th4) {
                s();
                throw th4;
            }
        }
        z1();
        W();
        this.f12344c.b();
    }

    boolean d1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i15, int i16) {
        int iH0 = h0(str, i15, (i16 & 1) != 0);
        if (iH0 < 0) {
            return false;
        }
        for (int size = this.f12345d.size() - 1; size >= iH0; size--) {
            arrayList.add(this.f12345d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    boolean e1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (L0(2)) {
            Objects.toString(this.f12342a);
        }
        if (this.f12345d.isEmpty()) {
            return false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f12345d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f12349h = aVar;
        Iterator<c0.a> it = aVar.f12419c.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.o oVar = it.next().f12437b;
            if (oVar != null) {
                oVar.f12603p = true;
            }
        }
        return d1(arrayList, arrayList2, null, -1, 0);
    }

    public boolean f0() {
        boolean zB0 = b0(true);
        n0();
        return zB0;
    }

    void f1() {
        Z(new p(), false);
    }

    androidx.fragment.app.o g0(String str) {
        return this.f12344c.f(str);
    }

    public void g1(Bundle bundle, String str, androidx.fragment.app.o oVar) {
        if (oVar.f12619y != this) {
            x1(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, oVar.f12594f);
    }

    public void h1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z15) {
        this.f12357p.o(fragmentLifecycleCallbacks, z15);
    }

    void i(androidx.fragment.app.a aVar) {
        this.f12345d.add(aVar);
    }

    public androidx.fragment.app.o i0(int i15) {
        return this.f12344c.g(i15);
    }

    void i1(androidx.fragment.app.o oVar) {
        if (L0(2)) {
            Objects.toString(oVar);
            int i15 = oVar.f12617x;
        }
        boolean zK0 = oVar.k0();
        if (oVar.G && zK0) {
            return;
        }
        this.f12344c.u(oVar);
        if (M0(oVar)) {
            this.J = true;
        }
        oVar.f12602n = true;
        u1(oVar);
    }

    a0 j(androidx.fragment.app.o oVar) {
        String str = oVar.f12611t0;
        if (str != null) {
            f7.c.f(oVar, str);
        }
        if (L0(2)) {
            oVar.toString();
        }
        a0 a0VarW = w(oVar);
        oVar.f12619y = this;
        this.f12344c.r(a0VarW);
        if (!oVar.G) {
            this.f12344c.a(oVar);
            oVar.f12602n = false;
            if (oVar.R == null) {
                oVar.f12605q0 = false;
            }
            if (M0(oVar)) {
                this.J = true;
            }
        }
        return a0VarW;
    }

    public androidx.fragment.app.o j0(String str) {
        return this.f12344c.h(str);
    }

    public void k(e7.n nVar) {
        this.f12358q.add(nVar);
    }

    androidx.fragment.app.o k0(String str) {
        return this.f12344c.i(str);
    }

    int l() {
        return this.f12352k.getAndIncrement();
    }

    void l1(Parcelable parcelable) {
        a0 a0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f12365x.getContext().getClassLoader());
                this.f12354m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f12365x.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f12344c.x(map);
        x xVar = (x) bundle3.getParcelable("state");
        if (xVar == null) {
            return;
        }
        this.f12344c.v();
        Iterator<String> it = xVar.f12675a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f12344c.B(it.next(), null);
            if (bundleB != null) {
                androidx.fragment.app.o oVarD9 = this.R.d9(((z) bundleB.getParcelable("state")).f12692b);
                if (oVarD9 != null) {
                    if (L0(2)) {
                        oVarD9.toString();
                    }
                    a0Var = new a0(this.f12357p, this.f12344c, oVarD9, bundleB);
                } else {
                    a0Var = new a0(this.f12357p, this.f12344c, this.f12365x.getContext().getClassLoader(), w0(), bundleB);
                }
                androidx.fragment.app.o oVarK = a0Var.k();
                oVarK.f12590b = bundleB;
                oVarK.f12619y = this;
                if (L0(2)) {
                    oVarK.toString();
                }
                a0Var.o(this.f12365x.getContext().getClassLoader());
                this.f12344c.r(a0Var);
                a0Var.t(this.f12364w);
            }
        }
        for (androidx.fragment.app.o oVar : this.R.g9()) {
            if (!this.f12344c.c(oVar.f12594f)) {
                if (L0(2)) {
                    oVar.toString();
                    Objects.toString(xVar.f12675a);
                }
                this.R.j9(oVar);
                oVar.f12619y = this;
                a0 a0Var2 = new a0(this.f12357p, this.f12344c, oVar);
                a0Var2.t(1);
                a0Var2.m();
                oVar.f12602n = true;
                a0Var2.m();
            }
        }
        this.f12344c.w(xVar.f12676b);
        if (xVar.f12677c != null) {
            this.f12345d = new ArrayList<>(xVar.f12677c.length);
            int i15 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = xVar.f12677c;
                if (i15 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = bVarArr[i15].b(this);
                if (L0(2)) {
                    int i16 = aVarB.f12387v;
                    aVarB.toString();
                    PrintWriter printWriter = new PrintWriter(new h0("FragmentManager"));
                    aVarB.A("  ", printWriter, false);
                    printWriter.close();
                }
                this.f12345d.add(aVarB);
                i15++;
            }
        } else {
            this.f12345d = new ArrayList<>();
        }
        this.f12352k.set(xVar.f12678d);
        String str3 = xVar.f12679e;
        if (str3 != null) {
            androidx.fragment.app.o oVarG0 = g0(str3);
            this.A = oVarG0;
            M(oVarG0);
        }
        ArrayList<String> arrayList = xVar.f12680f;
        if (arrayList != null) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                this.f12353l.put(arrayList.get(i17), xVar.f12681g.get(i17));
            }
        }
        this.I = new ArrayDeque<>(xVar.f12682h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void m(t<?> tVar, e7.g gVar, androidx.fragment.app.o oVar) {
        String str;
        androidx.p016lifecycle.q qVar;
        if (this.f12365x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f12365x = tVar;
        this.f12366y = gVar;
        this.f12367z = oVar;
        if (oVar != null) {
            k(new g(oVar));
        } else if (tVar instanceof e7.n) {
            k((e7.n) tVar);
        }
        if (this.f12367z != null) {
            z1();
        }
        if (tVar instanceof s0) {
            s0 s0Var = (s0) tVar;
            q0 q0VarO = s0Var.o();
            this.f12348g = q0VarO;
            if (oVar != null) {
                qVar = s0Var;
                qVar = oVar;
            }
            qVar = s0Var;
            q0VarO.f(qVar, this.f12351j);
        }
        if (oVar != null) {
            this.R = oVar.f12619y.s0(oVar);
        } else if (tVar instanceof y0) {
            this.R = y.f9(((y0) tVar).h());
        } else {
            this.R = new y(false);
        }
        this.R.k9(S0());
        this.f12344c.A(this.R);
        Object obj = this.f12365x;
        if ((obj instanceof ua.j) && oVar == null) {
            ua.g gVarK = ((ua.j) obj).k();
            gVarK.c("android:support:fragments", new ua.g.b() { // from class: e7.l
                @Override // ua.g.b
                public final Bundle a() {
                    return this.f47912a.n1();
                }
            });
            Bundle bundleA = gVarK.a("android:support:fragments");
            if (bundleA != null) {
                l1(bundleA);
            }
        }
        Object obj2 = this.f12365x;
        if (obj2 instanceof p006NUl.i) {
            p006NUl.h activityResultRegistry = ((p006NUl.i) obj2).getActivityResultRegistry();
            if (oVar != null) {
                str = oVar.f12594f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = activityResultRegistry.o(str2 + "StartActivityForResult", new p087nuL.h0(), new h());
            this.G = activityResultRegistry.o(str2 + "StartIntentSenderForResult", new k(), new i());
            this.H = activityResultRegistry.o(str2 + "RequestPermissions", new p087nuL.g0(), new a());
        }
        Object obj3 = this.f12365x;
        if (obj3 instanceof u5.b) {
            ((u5.b) obj3).i(this.f12359r);
        }
        Object obj4 = this.f12365x;
        if (obj4 instanceof u5.c) {
            ((u5.c) obj4).A(this.f12360s);
        }
        Object obj5 = this.f12365x;
        if (obj5 instanceof s5.p) {
            ((s5.p) obj5).q(this.f12361t);
        }
        Object obj6 = this.f12365x;
        if (obj6 instanceof s5.q) {
            ((s5.q) obj6).c(this.f12362u);
        }
        Object obj7 = this.f12365x;
        if ((obj7 instanceof j6.o) && oVar == null) {
            ((j6.o) obj7).B(this.f12363v);
        }
    }

    void n(androidx.fragment.app.o oVar) {
        if (L0(2)) {
            Objects.toString(oVar);
        }
        if (oVar.G) {
            oVar.G = false;
            if (oVar.f12601m) {
                return;
            }
            this.f12344c.a(oVar);
            if (L0(2)) {
                oVar.toString();
            }
            if (M0(oVar)) {
                this.J = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle n1() {
        androidx.fragment.app.b[] bVarArr;
        Bundle bundle = new Bundle();
        n0();
        Y();
        b0(true);
        this.K = true;
        this.R.k9(true);
        ArrayList<String> arrayListY = this.f12344c.y();
        HashMap<String, Bundle> mapM = this.f12344c.m();
        if (mapM.isEmpty()) {
            L0(2);
            return bundle;
        }
        ArrayList<String> arrayListZ = this.f12344c.z();
        int size = this.f12345d.size();
        if (size > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i15 = 0; i15 < size; i15++) {
                bVarArr[i15] = new androidx.fragment.app.b(this.f12345d.get(i15));
                if (L0(2)) {
                    Objects.toString(this.f12345d.get(i15));
                }
            }
        } else {
            bVarArr = null;
        }
        x xVar = new x();
        xVar.f12675a = arrayListY;
        xVar.f12676b = arrayListZ;
        xVar.f12677c = bVarArr;
        xVar.f12678d = this.f12352k.get();
        androidx.fragment.app.o oVar = this.A;
        if (oVar != null) {
            xVar.f12679e = oVar.f12594f;
        }
        xVar.f12680f.addAll(this.f12353l.keySet());
        xVar.f12681g.addAll(this.f12353l.values());
        xVar.f12682h = new ArrayList<>(this.I);
        bundle.putParcelable("state", xVar);
        for (String str : this.f12354m.keySet()) {
            bundle.putBundle("result_" + str, this.f12354m.get(str));
        }
        for (String str2 : mapM.keySet()) {
            bundle.putBundle("fragment_" + str2, mapM.get(str2));
        }
        return bundle;
    }

    public c0 o() {
        return new androidx.fragment.app.a(this);
    }

    Set<androidx.fragment.app.o> o0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 < aVar.f12419c.size(); i15++) {
            androidx.fragment.app.o oVar = aVar.f12419c.get(i15).f12437b;
            if (oVar != null && aVar.f12425i) {
                hashSet.add(oVar);
            }
        }
        return hashSet;
    }

    public androidx.fragment.app.o.j o1(androidx.fragment.app.o oVar) {
        a0 a0VarN = this.f12344c.n(oVar.f12594f);
        if (a0VarN == null || !a0VarN.k().equals(oVar)) {
            x1(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
        }
        return a0VarN.q();
    }

    void p() {
        if (L0(3)) {
            Objects.toString(this.f12349h);
        }
        androidx.fragment.app.a aVar = this.f12349h;
        if (aVar != null) {
            aVar.f12386u = false;
            aVar.x();
            this.f12349h.r(true, new Runnable() { // from class: e7.m
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.f47913a);
                }
            });
            this.f12349h.h();
            this.f12350i = true;
            f0();
            this.f12350i = false;
            this.f12349h = null;
        }
    }

    void p1() {
        synchronized (this.f12342a) {
            try {
                if (this.f12342a.size() == 1) {
                    this.f12365x.getHandler().removeCallbacks(this.T);
                    this.f12365x.getHandler().post(this.T);
                    z1();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    boolean q() {
        boolean zM0 = false;
        for (androidx.fragment.app.o oVar : this.f12344c.l()) {
            if (oVar != null) {
                zM0 = M0(oVar);
            }
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    public j q0(int i15) {
        if (i15 != this.f12345d.size()) {
            return this.f12345d.get(i15);
        }
        androidx.fragment.app.a aVar = this.f12349h;
        if (aVar != null) {
            return aVar;
        }
        throw new IndexOutOfBoundsException();
    }

    void q1(androidx.fragment.app.o oVar, boolean z15) {
        ViewGroup viewGroupV0 = v0(oVar);
        if (viewGroupV0 == null || !(viewGroupV0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupV0).setDrawDisappearingViewsLast(!z15);
    }

    public int r0() {
        return this.f12345d.size() + (this.f12349h != null ? 1 : 0);
    }

    public void r1(s sVar) {
        this.B = sVar;
    }

    void s1(androidx.fragment.app.o oVar, androidx.lifecycle.j.b bVar) {
        if (oVar.equals(g0(oVar.f12594f)) && (oVar.f12621z == null || oVar.f12619y == this)) {
            oVar.f12612u0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    e7.g t0() {
        return this.f12366y;
    }

    void t1(androidx.fragment.app.o oVar) {
        if (oVar == null || (oVar.equals(g0(oVar.f12594f)) && (oVar.f12621z == null || oVar.f12619y == this))) {
            androidx.fragment.app.o oVar2 = this.A;
            this.A = oVar;
            M(oVar2);
            M(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(128);
        sb5.append("FragmentManager{");
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append(" in ");
        androidx.fragment.app.o oVar = this.f12367z;
        if (oVar != null) {
            sb5.append(oVar.getClass().getSimpleName());
            sb5.append("{");
            sb5.append(Integer.toHexString(System.identityHashCode(this.f12367z)));
            sb5.append("}");
        } else {
            t<?> tVar = this.f12365x;
            if (tVar != null) {
                sb5.append(tVar.getClass().getSimpleName());
                sb5.append("{");
                sb5.append(Integer.toHexString(System.identityHashCode(this.f12365x)));
                sb5.append("}");
            } else {
                sb5.append("null");
            }
        }
        sb5.append("}}");
        return sb5.toString();
    }

    public androidx.fragment.app.o u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        androidx.fragment.app.o oVarG0 = g0(string);
        if (oVarG0 == null) {
            x1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return oVarG0;
    }

    Set<k0> v(ArrayList<androidx.fragment.app.a> arrayList, int i15, int i16) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i15 < i16) {
            Iterator<c0.a> it = arrayList.get(i15).f12419c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.o oVar = it.next().f12437b;
                if (oVar != null && (viewGroup = oVar.P) != null) {
                    hashSet.add(k0.u(viewGroup, this));
                }
            }
            i15++;
        }
        return hashSet;
    }

    void v1(androidx.fragment.app.o oVar) {
        if (L0(2)) {
            Objects.toString(oVar);
        }
        if (oVar.F) {
            oVar.F = false;
            oVar.f12605q0 = !oVar.f12605q0;
        }
    }

    a0 w(androidx.fragment.app.o oVar) {
        a0 a0VarN = this.f12344c.n(oVar.f12594f);
        if (a0VarN != null) {
            return a0VarN;
        }
        a0 a0Var = new a0(this.f12357p, this.f12344c, oVar);
        a0Var.o(this.f12365x.getContext().getClassLoader());
        a0Var.t(this.f12364w);
        return a0Var;
    }

    public s w0() {
        s sVar = this.B;
        if (sVar != null) {
            return sVar;
        }
        androidx.fragment.app.o oVar = this.f12367z;
        return oVar != null ? oVar.f12619y.w0() : this.C;
    }

    void x(androidx.fragment.app.o oVar) {
        if (L0(2)) {
            Objects.toString(oVar);
        }
        if (oVar.G) {
            return;
        }
        oVar.G = true;
        if (oVar.f12601m) {
            if (L0(2)) {
                oVar.toString();
            }
            this.f12344c.u(oVar);
            if (M0(oVar)) {
                this.J = true;
            }
            u1(oVar);
        }
    }

    public List<androidx.fragment.app.o> x0() {
        return this.f12344c.o();
    }

    void y() {
        this.K = false;
        this.L = false;
        this.R.k9(false);
        T(4);
    }

    public t<?> y0() {
        return this.f12365x;
    }

    public void y1(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f12357p.p(fragmentLifecycleCallbacks);
    }

    void z() {
        this.K = false;
        this.L = false;
        this.R.k9(false);
        T(0);
    }

    LayoutInflater.Factory2 z0() {
        return this.f12347f;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f12378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12379b;

        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i15) {
                return new l[i15];
            }
        }

        l(String str, int i15) {
            this.f12378a = str;
            this.f12379b = i15;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeString(this.f12378a);
            parcel.writeInt(this.f12379b);
        }

        l(Parcel parcel) {
            this.f12378a = parcel.readString();
            this.f12379b = parcel.readInt();
        }
    }
}
