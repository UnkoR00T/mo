package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007NuL.p;
import p007NuL.s;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int E = s.f408e;
    private j.a A;
    ViewTreeObserver B;
    private PopupWindow.OnDismissListener C;
    boolean D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f8425g;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f8433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    View f8434r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8436t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f8439x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8441z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<e> f8426h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List<d> f8427j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f8428k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f8429l = new ViewOnAttachStateChangeListenerC0187b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n0 f8430m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8431n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8432p = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8440y = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8435s = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.b() || b.this.f8427j.size() <= 0 || b.this.f8427j.get(0).f8449a.B()) {
                return;
            }
            View view = b.this.f8434r;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f8427j.iterator();
            while (it.hasNext()) {
                it.next().f8449a.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0187b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0187b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.B = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.B.removeGlobalOnLayoutListener(bVar.f8428k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements n0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f8445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f8446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f8447c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f8445a = dVar;
                this.f8446b = menuItem;
                this.f8447c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f8445a;
                if (dVar != null) {
                    b.this.D = true;
                    dVar.f8450b.e(false);
                    b.this.D = false;
                }
                if (this.f8446b.isEnabled() && this.f8446b.hasSubMenu()) {
                    this.f8447c.M(this.f8446b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.n0
        public void e(e eVar, MenuItem menuItem) {
            b.this.f8425g.removeCallbacksAndMessages(null);
            int size = b.this.f8427j.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (eVar == b.this.f8427j.get(i15).f8450b) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 == -1) {
                return;
            }
            int i16 = i15 + 1;
            b.this.f8425g.postAtTime(new a(i16 < b.this.f8427j.size() ? b.this.f8427j.get(i16) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.n0
        public void o(e eVar, MenuItem menuItem) {
            b.this.f8425g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f8449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f8450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8451c;

        public d(o0 o0Var, e eVar, int i15) {
            this.f8449a = o0Var;
            this.f8450b = eVar;
            this.f8451c = i15;
        }

        public ListView a() {
            return this.f8449a.p();
        }
    }

    public b(Context context, View view, int i15, int i16, boolean z15) {
        this.f8420b = context;
        this.f8433q = view;
        this.f8422d = i15;
        this.f8423e = i16;
        this.f8424f = z15;
        Resources resources = context.getResources();
        this.f8421c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p.f346d));
        this.f8425g = new Handler();
    }

    private int A(e eVar) {
        int size = this.f8427j.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (eVar == this.f8427j.get(i15).f8450b) {
                return i15;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            MenuItem item = eVar.getItem(i15);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f8450b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i15 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i15 >= count) {
                i15 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i15)) {
                break;
            }
            i15++;
        }
        if (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f8433q.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i15) {
        List<d> list = this.f8427j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f8434r.getWindowVisibleDisplayFrame(rect);
        if (this.f8435s == 1) {
            return (iArr[0] + listViewA.getWidth()) + i15 > rect.right ? 0 : 1;
        }
        return iArr[0] - i15 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8420b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f8424f, E);
        if (!b() && this.f8440y) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.x(eVar));
        }
        int iN = h.n(dVar2, null, this.f8420b, this.f8421c);
        o0 o0VarZ = z();
        o0VarZ.n(dVar2);
        o0VarZ.F(iN);
        o0VarZ.G(this.f8432p);
        if (this.f8427j.size() > 0) {
            List<d> list = this.f8427j;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            o0VarZ.V(false);
            o0VarZ.S(null);
            int iE = E(iN);
            boolean z15 = iE == 1;
            this.f8435s = iE;
            o0VarZ.D(viewC);
            if ((this.f8432p & 5) != 5) {
                iN = z15 ? viewC.getWidth() : 0 - iN;
            } else if (!z15) {
                iN = 0 - viewC.getWidth();
            }
            o0VarZ.f(iN);
            o0VarZ.N(true);
            o0VarZ.j(0);
        } else {
            if (this.f8436t) {
                o0VarZ.f(this.f8438w);
            }
            if (this.f8437v) {
                o0VarZ.j(this.f8439x);
            }
            o0VarZ.H(m());
        }
        this.f8427j.add(new d(o0VarZ, eVar, this.f8435s));
        o0VarZ.a();
        ListView listViewP = o0VarZ.p();
        listViewP.setOnKeyListener(this);
        if (dVar == null && this.f8441z && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(s.f415l, (ViewGroup) listViewP, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewP.addHeaderView(frameLayout, null, false);
            o0VarZ.a();
        }
    }

    private o0 z() {
        o0 o0Var = new o0(this.f8420b, null, this.f8422d, this.f8423e);
        o0Var.U(this.f8430m);
        o0Var.L(this);
        o0Var.K(this);
        o0Var.D(this.f8433q);
        o0Var.G(this.f8432p);
        o0Var.J(true);
        o0Var.I(2);
        return o0Var;
    }

    @Override // p011Prn.f2
    public void a() {
        if (b()) {
            return;
        }
        Iterator<e> it = this.f8426h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f8426h.clear();
        View view = this.f8433q;
        this.f8434r = view;
        if (view != null) {
            boolean z15 = this.B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.B = viewTreeObserver;
            if (z15) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8428k);
            }
            this.f8434r.addOnAttachStateChangeListener(this.f8429l);
        }
    }

    @Override // p011Prn.f2
    public boolean b() {
        return this.f8427j.size() > 0 && this.f8427j.get(0).f8449a.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z15) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i15 = iA + 1;
        if (i15 < this.f8427j.size()) {
            this.f8427j.get(i15).f8450b.e(false);
        }
        d dVarRemove = this.f8427j.remove(iA);
        dVarRemove.f8450b.P(this);
        if (this.D) {
            dVarRemove.f8449a.T(null);
            dVarRemove.f8449a.E(0);
        }
        dVarRemove.f8449a.dismiss();
        int size = this.f8427j.size();
        if (size > 0) {
            this.f8435s = this.f8427j.get(size - 1).f8451c;
        } else {
            this.f8435s = D();
        }
        if (size != 0) {
            if (z15) {
                this.f8427j.get(0).f8450b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.A;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.B.removeGlobalOnLayoutListener(this.f8428k);
            }
            this.B = null;
        }
        this.f8434r.removeOnAttachStateChangeListener(this.f8429l);
        this.C.onDismiss();
    }

    @Override // p011Prn.f2
    public void dismiss() {
        int size = this.f8427j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f8427j.toArray(new d[size]);
            for (int i15 = size - 1; i15 >= 0; i15--) {
                d dVar = dVarArr[i15];
                if (dVar.f8449a.b()) {
                    dVar.f8449a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.A = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        for (d dVar : this.f8427j) {
            if (mVar == dVar.f8450b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.A;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z15) {
        Iterator<d> it = this.f8427j.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(e eVar) {
        eVar.c(this, this.f8420b);
        if (b()) {
            F(eVar);
        } else {
            this.f8426h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        if (this.f8433q != view) {
            this.f8433q = view;
            this.f8432p = j6.k.b(this.f8431n, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f8427j.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f8427j.get(i15);
            if (!dVar.f8449a.b()) {
                break;
            } else {
                i15++;
            }
        }
        if (dVar != null) {
            dVar.f8450b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i15, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i15 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p011Prn.f2
    public ListView p() {
        if (this.f8427j.isEmpty()) {
            return null;
        }
        List<d> list = this.f8427j;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z15) {
        this.f8440y = z15;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i15) {
        if (this.f8431n != i15) {
            this.f8431n = i15;
            this.f8432p = j6.k.b(i15, this.f8433q.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i15) {
        this.f8436t = true;
        this.f8438w = i15;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.C = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z15) {
        this.f8441z = z15;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i15) {
        this.f8437v = true;
        this.f8439x = i15;
    }
}
