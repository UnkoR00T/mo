package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.o0;
import p007NuL.p;
import p007NuL.s;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f8540y = s.f416m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f8542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f8543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8547h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final o0 f8548j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PopupWindow.OnDismissListener f8551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f8552n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f8553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j.a f8554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ViewTreeObserver f8555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8557t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8558v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8560x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f8549k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f8550l = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8559w = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.b() || l.this.f8548j.B()) {
                return;
            }
            View view = l.this.f8553p;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f8548j.a();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f8555r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f8555r = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f8555r.removeGlobalOnLayoutListener(lVar.f8549k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i15, int i16, boolean z15) {
        this.f8541b = context;
        this.f8542c = eVar;
        this.f8544e = z15;
        this.f8543d = new d(eVar, LayoutInflater.from(context), z15, f8540y);
        this.f8546g = i15;
        this.f8547h = i16;
        Resources resources = context.getResources();
        this.f8545f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p.f346d));
        this.f8552n = view;
        this.f8548j = new o0(context, null, i15, i16);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f8556s || (view = this.f8552n) == null) {
            return false;
        }
        this.f8553p = view;
        this.f8548j.K(this);
        this.f8548j.L(this);
        this.f8548j.J(true);
        View view2 = this.f8553p;
        boolean z15 = this.f8555r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f8555r = viewTreeObserver;
        if (z15) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f8549k);
        }
        view2.addOnAttachStateChangeListener(this.f8550l);
        this.f8548j.D(view2);
        this.f8548j.G(this.f8559w);
        if (!this.f8557t) {
            this.f8558v = h.n(this.f8543d, null, this.f8541b, this.f8545f);
            this.f8557t = true;
        }
        this.f8548j.F(this.f8558v);
        this.f8548j.I(2);
        this.f8548j.H(m());
        this.f8548j.a();
        ListView listViewP = this.f8548j.p();
        listViewP.setOnKeyListener(this);
        if (this.f8560x && this.f8542c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f8541b).inflate(s.f415l, (ViewGroup) listViewP, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f8542c.x());
            }
            frameLayout.setEnabled(false);
            listViewP.addHeaderView(frameLayout, null, false);
        }
        this.f8548j.n(this.f8543d);
        this.f8548j.a();
        return true;
    }

    @Override // p011Prn.f2
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p011Prn.f2
    public boolean b() {
        return !this.f8556s && this.f8548j.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z15) {
        if (eVar != this.f8542c) {
            return;
        }
        dismiss();
        j.a aVar = this.f8554q;
        if (aVar != null) {
            aVar.c(eVar, z15);
        }
    }

    @Override // p011Prn.f2
    public void dismiss() {
        if (b()) {
            this.f8548j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f8554q = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f8541b, mVar, this.f8553p, this.f8544e, this.f8546g, this.f8547h);
            iVar.j(this.f8554q);
            iVar.g(h.x(mVar));
            iVar.i(this.f8551m);
            this.f8551m = null;
            this.f8542c.e(false);
            int iD = this.f8548j.d();
            int iM = this.f8548j.m();
            if ((Gravity.getAbsoluteGravity(this.f8559w, this.f8552n.getLayoutDirection()) & 7) == 5) {
                iD += this.f8552n.getWidth();
            }
            if (iVar.n(iD, iM)) {
                j.a aVar = this.f8554q;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z15) {
        this.f8557t = false;
        d dVar = this.f8543d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(View view) {
        this.f8552n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f8556s = true;
        this.f8542c.close();
        ViewTreeObserver viewTreeObserver = this.f8555r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8555r = this.f8553p.getViewTreeObserver();
            }
            this.f8555r.removeGlobalOnLayoutListener(this.f8549k);
            this.f8555r = null;
        }
        this.f8553p.removeOnAttachStateChangeListener(this.f8550l);
        PopupWindow.OnDismissListener onDismissListener = this.f8551m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        return this.f8548j.p();
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z15) {
        this.f8543d.d(z15);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i15) {
        this.f8559w = i15;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i15) {
        this.f8548j.f(i15);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f8551m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z15) {
        this.f8560x = z15;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i15) {
        this.f8548j.j(i15);
    }
}
