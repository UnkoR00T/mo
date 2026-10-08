package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements j6.o {
    private CharSequence A;
    private CharSequence B;
    private ColorStateList C;
    private ColorStateList D;
    private boolean E;
    private boolean F;
    private final ArrayList<View> G;
    private final ArrayList<View> H;
    private final int[] I;
    final j6.p K;
    private ArrayList<MenuItem> L;
    private final ActionMenuView.e O;
    private d1 P;
    private androidx.appcompat.widget.c R;
    private f T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f8686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f8687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f8688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f8689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f8690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f8691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f8692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f8693h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f8694h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    View f8695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f8696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8699n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f8700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8701q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f8702q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8703r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f8704r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8705s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private OnBackInvokedCallback f8706s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8707t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private OnBackInvokedDispatcher f8708t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f8709u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8710v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final Runnable f8711v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private r0 f8712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f8713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f8714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8715z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.K.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    class c implements androidx.appcompat.view.menu.e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f8702q0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f8686a.H()) {
                Toolbar.this.K.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f8702q0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.c1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f8720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f8721b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f8693h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f8693h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f8693h);
            }
            Toolbar.this.f8695j = gVar.getActionView();
            this.f8721b = gVar;
            ViewParent parent2 = Toolbar.this.f8695j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f8695j);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f8161a = (toolbar4.f8700p & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f8723b = 2;
                toolbar4.f8695j.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f8695j);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f8695j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void g(boolean z15) {
            if (this.f8721b != null) {
                androidx.appcompat.view.menu.e eVar = this.f8720a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (this.f8720a.getItem(i15) == this.f8721b) {
                            return;
                        }
                    }
                }
                i(this.f8720a, this.f8721b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f8695j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f8695j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f8693h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f8695j = null;
            toolbar3.a();
            this.f8721b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f8720a;
            if (eVar2 != null && (gVar = this.f8721b) != null) {
                eVar2.f(gVar);
            }
            this.f8720a = eVar;
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.P);
    }

    private boolean A(View view) {
        return view.getParent() == this || this.H.contains(view);
    }

    private int E(View view, int i15, int[] iArr, int i16) {
        g gVar = (g) view.getLayoutParams();
        int i17 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i15 + Math.max(0, i17);
        iArr[0] = Math.max(0, -i17);
        int iQ = q(view, i16);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i15, int[] iArr, int i16) {
        g gVar = (g) view.getLayoutParams();
        int i17 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i15 - Math.max(0, i17);
        iArr[1] = Math.max(0, -i17);
        int iQ = q(view, i16);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i15, int i16, int i17, int i18, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i19 = marginLayoutParams.leftMargin - iArr[0];
        int i25 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i19) + Math.max(0, i25);
        iArr[0] = Math.max(0, -i19);
        iArr[1] = Math.max(0, -i25);
        view.measure(ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight() + iMax + i16, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i17, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i18, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i15, int i16, int i17, int i18, int i19) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i16, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i18, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i19 >= 0) {
            if (mode != 0) {
                i19 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i19);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.K.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f8711v0);
        post(this.f8711v0);
    }

    private boolean P() {
        if (!this.f8704r0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i15) {
        boolean z15 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = j6.k.b(i15, getLayoutDirection());
        list.clear();
        if (!z15) {
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f8723b == 0 && Q(childAt) && p(gVar.f8161a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i17 = childCount - 1; i17 >= 0; i17--) {
            View childAt2 = getChildAt(i17);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f8723b == 0 && Q(childAt2) && p(gVar2.f8161a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z15) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f8723b = 1;
        if (!z15 || this.f8695j == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.H.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i15 = 0; i15 < menu.size(); i15++) {
            arrayList.add(menu.getItem(i15));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f8712w == null) {
            this.f8712w = new r0();
        }
    }

    private void i() {
        if (this.f8690e == null) {
            this.f8690e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f8686a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f8686a.getMenu();
            if (this.T == null) {
                this.T = new f();
            }
            this.f8686a.setExpandedActionViewsExclusive(true);
            eVar.c(this.T, this.f8696k);
            S();
        }
    }

    private void k() {
        if (this.f8686a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f8686a = actionMenuView;
            actionMenuView.setPopupTheme(this.f8697l);
            this.f8686a.setOnMenuItemClickListener(this.O);
            this.f8686a.M(this.f8694h0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f8161a = (this.f8700p & 112) | 8388613;
            this.f8686a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f8686a, false);
        }
    }

    private void l() {
        if (this.f8689d == null) {
            this.f8689d = new p(getContext(), null, p007NuL.m.O);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f8161a = (this.f8700p & 112) | 8388611;
            this.f8689d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i15) {
        int layoutDirection = getLayoutDirection();
        int iB = j6.k.b(i15, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i15) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i16 = i15 > 0 ? (measuredHeight - i15) / 2 : 0;
        int iR = r(gVar.f8161a);
        if (iR == 48) {
            return getPaddingTop() - i16;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i16;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i17 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i17) {
            iMax = i17;
        } else {
            int i18 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i19 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i18 < i19) {
                iMax = Math.max(0, iMax - (i19 - i18));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i15) {
        int i16 = i15 & 112;
        return (i16 == 16 || i16 == 48 || i16 == 80) ? i16 : this.f8715z & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int size = list.size();
        int i17 = 0;
        int measuredWidth = 0;
        while (i17 < size) {
            View view = list.get(i17);
            g gVar = (g) view.getLayoutParams();
            int i18 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i15;
            int i19 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i16;
            int iMax = Math.max(0, i18);
            int iMax2 = Math.max(0, i19);
            int iMax3 = Math.max(0, -i18);
            int iMax4 = Math.max(0, -i19);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i17++;
            i16 = iMax4;
            i15 = iMax3;
        }
        return measuredWidth;
    }

    @Override // j6.o
    public void B(j6.r rVar) {
        this.K.a(rVar);
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f8686a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f8686a;
        return actionMenuView != null && actionMenuView.H();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f8723b != 2 && childAt != this.f8686a) {
                removeViewAt(childCount);
                this.H.add(childAt);
            }
        }
    }

    public void L(int i15, int i16) {
        h();
        this.f8712w.g(i15, i16);
    }

    public void M(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f8686a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f8686a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.P(this.R);
            eVarL.P(this.T);
        }
        if (this.T == null) {
            this.T = new f();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f8696k);
            eVar.c(this.T, this.f8696k);
        } else {
            cVar.j(this.f8696k, null);
            this.T.j(this.f8696k, null);
            cVar.g(true);
            this.T.g(true);
        }
        this.f8686a.setPopupTheme(this.f8697l);
        this.f8686a.setPresenter(cVar);
        this.R = cVar;
        S();
    }

    public void N(Context context, int i15) {
        this.f8699n = i15;
        TextView textView = this.f8688c;
        if (textView != null) {
            textView.setTextAppearance(context, i15);
        }
    }

    public void O(Context context, int i15) {
        this.f8698m = i15;
        TextView textView = this.f8687b;
        if (textView != null) {
            textView.setTextAppearance(context, i15);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f8686a;
        return actionMenuView != null && actionMenuView.N();
    }

    void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z15 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f8709u0;
            if (z15 && this.f8708t0 == null) {
                if (this.f8706s0 == null) {
                    this.f8706s0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8765a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f8706s0);
                this.f8708t0 = onBackInvokedDispatcherA;
                return;
            }
            if (z15 || (onBackInvokedDispatcher = this.f8708t0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f8706s0);
            this.f8708t0 = null;
        }
    }

    void a() {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            addView(this.H.get(size));
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f8686a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.T;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f8721b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f8686a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f8693h == null) {
            p pVar = new p(getContext(), null, p007NuL.m.O);
            this.f8693h = pVar;
            pVar.setImageDrawable(this.f8691f);
            this.f8693h.setContentDescription(this.f8692g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f8161a = (this.f8700p & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f8723b = 2;
            this.f8693h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f8693h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f8693h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f8693h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.f8712w;
        if (r0Var != null) {
            return r0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i15 = this.f8714y;
        return i15 != Integer.MIN_VALUE ? i15 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.f8712w;
        if (r0Var != null) {
            return r0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.f8712w;
        if (r0Var != null) {
            return r0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.f8712w;
        if (r0Var != null) {
            return r0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i15 = this.f8713x;
        return i15 != Integer.MIN_VALUE ? i15 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f8686a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8714y, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8713x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f8690e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f8690e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f8686a.getMenu();
    }

    View getNavButtonView() {
        return this.f8689d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f8689d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f8689d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.R;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f8686a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f8696k;
    }

    public int getPopupTheme() {
        return this.f8697l;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    final TextView getSubtitleTextView() {
        return this.f8688c;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public int getTitleMarginBottom() {
        return this.f8710v;
    }

    public int getTitleMarginEnd() {
        return this.f8705s;
    }

    public int getTitleMarginStart() {
        return this.f8703r;
    }

    public int getTitleMarginTop() {
        return this.f8707t;
    }

    final TextView getTitleTextView() {
        return this.f8687b;
    }

    public g0 getWrapper() {
        if (this.P == null) {
            this.P = new d1(this, true);
        }
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0185a) {
            return new g((androidx.appcompat.app.a.C0185a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8711v0);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i19;
        boolean z16;
        int i25;
        int i26;
        int paddingTop;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int iMax2;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int size;
        int iE2;
        int i49;
        int size2;
        int i55;
        int i56;
        int i57;
        int size3;
        boolean z17 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i58 = width - paddingRight;
        int[] iArr = this.I;
        iArr[1] = 0;
        iArr[0] = 0;
        int iZ = j6.l0.z(this);
        int iMin2 = iZ >= 0 ? Math.min(iZ, i18 - i16) : 0;
        if (Q(this.f8689d)) {
            if (z17) {
                iF = F(this.f8689d, i58, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(this.f8689d, paddingLeft, iArr, iMin2);
            }
            if (Q(this.f8693h)) {
                if (z17) {
                    iF = F(this.f8693h, iF, iArr, iMin2);
                } else {
                    iE = E(this.f8693h, iE, iArr, iMin2);
                }
            }
            if (Q(this.f8686a)) {
                if (z17) {
                    iE = E(this.f8686a, iE, iArr, iMin2);
                } else {
                    iF = F(this.f8686a, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = Math.max(0, currentContentInsetRight - (i58 - iF));
            iMax = Math.max(iE, currentContentInsetLeft);
            iMin = Math.min(iF, i58 - currentContentInsetRight);
            if (Q(this.f8695j)) {
                if (z17) {
                    iMin = F(this.f8695j, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f8695j, iMax, iArr, iMin2);
                }
            }
            if (Q(this.f8690e)) {
                if (z17) {
                    iMin = F(this.f8690e, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f8690e, iMax, iArr, iMin2);
                }
            }
            zQ = Q(this.f8687b);
            zQ2 = Q(this.f8688c);
            if (zQ) {
                g gVar3 = (g) this.f8687b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f8687b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                g gVar4 = (g) this.f8688c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f8688c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zQ || zQ2) {
                if (zQ) {
                    textView = this.f8687b;
                } else {
                    textView = this.f8688c;
                }
                if (zQ2) {
                    textView2 = this.f8688c;
                } else {
                    textView2 = this.f8687b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i19 = measuredHeight;
                z16 = (!zQ && this.f8687b.getMeasuredWidth() > 0) || (zQ2 && this.f8688c.getMeasuredWidth() > 0);
                i25 = this.f8715z & 112;
                i26 = iMax;
                if (i25 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8707t;
                } else if (i25 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i19) / 2;
                    i39 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i45 = this.f8707t;
                    if (iMax2 < i39 + i45) {
                        iMax2 = i39 + i45;
                    } else {
                        i46 = (((height - paddingBottom) - i19) - iMax2) - paddingTop2;
                        i47 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i48 = this.f8710v;
                        if (i46 < i47 + i48) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i48) - i46));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8710v) - i19;
                }
                if (z17) {
                    if (z16) {
                        i36 = this.f8703r;
                    } else {
                        i36 = 0;
                    }
                    int i59 = i36 - iArr[1];
                    iMin -= Math.max(0, i59);
                    iArr[1] = Math.max(0, -i59);
                    if (zQ) {
                        g gVar5 = (g) this.f8687b.getLayoutParams();
                        int measuredWidth = iMin - this.f8687b.getMeasuredWidth();
                        int measuredHeight2 = this.f8687b.getMeasuredHeight() + paddingTop;
                        this.f8687b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i37 = measuredWidth - this.f8705s;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i37 = iMin;
                    }
                    if (zQ2) {
                        int i65 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                        this.f8688c.layout(iMin - this.f8688c.getMeasuredWidth(), i65, iMin, this.f8688c.getMeasuredHeight() + i65);
                        i38 = iMin - this.f8705s;
                    } else {
                        i38 = iMin;
                    }
                    if (z16) {
                        iMin = Math.min(i37, i38);
                    }
                    iMax = i26;
                    i28 = 0;
                } else {
                    if (z16) {
                        i27 = this.f8703r;
                    } else {
                        i27 = 0;
                    }
                    i28 = 0;
                    int i66 = i27 - iArr[0];
                    iMax = i26 + Math.max(0, i66);
                    iArr[0] = Math.max(0, -i66);
                    if (zQ) {
                        g gVar6 = (g) this.f8687b.getLayoutParams();
                        int measuredWidth2 = this.f8687b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f8687b.getMeasuredHeight() + paddingTop;
                        this.f8687b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i29 = measuredWidth2 + this.f8705s;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i29 = iMax;
                    }
                    if (zQ2) {
                        int i67 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f8688c.getMeasuredWidth() + iMax;
                        this.f8688c.layout(iMax, i67, measuredWidth3, this.f8688c.getMeasuredHeight() + i67);
                        i35 = measuredWidth3 + this.f8705s;
                    } else {
                        i35 = iMax;
                    }
                    if (z16) {
                        iMax = Math.max(i29, i35);
                    }
                }
            } else {
                i28 = 0;
            }
            b(this.G, 3);
            size = this.G.size();
            iE2 = iMax;
            for (i49 = i28; i49 < size; i49++) {
                iE2 = E(this.G.get(i49), iE2, iArr, iMin2);
            }
            b(this.G, 5);
            size2 = this.G.size();
            for (i55 = i28; i55 < size2; i55++) {
                iMin = F(this.G.get(i55), iMin, iArr, iMin2);
            }
            b(this.G, 1);
            int iU = u(this.G, iArr);
            i56 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU / 2);
            i57 = iU + i56;
            if (i56 >= iE2) {
                if (i57 > iMin) {
                    iE2 = i56 - (i57 - iMin);
                } else {
                    iE2 = i56;
                }
            }
            size3 = this.G.size();
            while (i28 < size3) {
                iE2 = E(this.G.get(i28), iE2, iArr, iMin2);
                i28++;
            }
            this.G.clear();
        }
        iE = paddingLeft;
        iF = i58;
        if (Q(this.f8693h)) {
            if (z17) {
                iF = F(this.f8693h, iF, iArr, iMin2);
            } else {
                iE = E(this.f8693h, iE, iArr, iMin2);
            }
        }
        if (Q(this.f8686a)) {
            if (z17) {
                iE = E(this.f8686a, iE, iArr, iMin2);
            } else {
                iF = F(this.f8686a, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i58 - iF));
        iMax = Math.max(iE, currentContentInsetLeft2);
        iMin = Math.min(iF, i58 - currentContentInsetRight2);
        if (Q(this.f8695j)) {
            if (z17) {
                iMin = F(this.f8695j, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f8695j, iMax, iArr, iMin2);
            }
        }
        if (Q(this.f8690e)) {
            if (z17) {
                iMin = F(this.f8690e, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f8690e, iMax, iArr, iMin2);
            }
        }
        zQ = Q(this.f8687b);
        zQ2 = Q(this.f8688c);
        if (zQ) {
            g gVar7 = (g) this.f8687b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f8687b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            g gVar8 = (g) this.f8688c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f8688c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zQ) {
            if (zQ) {
                textView = this.f8687b;
            } else {
                textView = this.f8688c;
            }
            if (zQ2) {
                textView2 = this.f8688c;
            } else {
                textView2 = this.f8687b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i19 = measuredHeight;
            if (zQ) {
            }
            i25 = this.f8715z & 112;
            i26 = iMax;
            if (i25 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8707t;
            } else if (i25 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i19) / 2;
                i39 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i45 = this.f8707t;
                if (iMax2 < i39 + i45) {
                    iMax2 = i39 + i45;
                } else {
                    i46 = (((height - paddingBottom) - i19) - iMax2) - paddingTop2;
                    i47 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i48 = this.f8710v;
                    if (i46 < i47 + i48) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i48) - i46));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8710v) - i19;
            }
            if (z17) {
                if (z16) {
                    i36 = this.f8703r;
                } else {
                    i36 = 0;
                }
                int i510 = i36 - iArr[1];
                iMin -= Math.max(0, i510);
                iArr[1] = Math.max(0, -i510);
                if (zQ) {
                    g gVar9 = (g) this.f8687b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f8687b.getMeasuredWidth();
                    int measuredHeight4 = this.f8687b.getMeasuredHeight() + paddingTop;
                    this.f8687b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i37 = measuredWidth4 - this.f8705s;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i37 = iMin;
                }
                if (zQ2) {
                    int i68 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                    this.f8688c.layout(iMin - this.f8688c.getMeasuredWidth(), i68, iMin, this.f8688c.getMeasuredHeight() + i68);
                    i38 = iMin - this.f8705s;
                } else {
                    i38 = iMin;
                }
                if (z16) {
                    iMin = Math.min(i37, i38);
                }
                iMax = i26;
                i28 = 0;
            } else {
                if (z16) {
                    i27 = this.f8703r;
                } else {
                    i27 = 0;
                }
                i28 = 0;
                int i69 = i27 - iArr[0];
                iMax = i26 + Math.max(0, i69);
                iArr[0] = Math.max(0, -i69);
                if (zQ) {
                    g gVar10 = (g) this.f8687b.getLayoutParams();
                    int measuredWidth5 = this.f8687b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f8687b.getMeasuredHeight() + paddingTop;
                    this.f8687b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i29 = measuredWidth5 + this.f8705s;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i29 = iMax;
                }
                if (zQ2) {
                    int i610 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f8688c.getMeasuredWidth() + iMax;
                    this.f8688c.layout(iMax, i610, measuredWidth6, this.f8688c.getMeasuredHeight() + i610);
                    i35 = measuredWidth6 + this.f8705s;
                } else {
                    i35 = iMax;
                }
                if (z16) {
                    iMax = Math.max(i29, i35);
                }
            }
        } else {
            if (zQ) {
                textView = this.f8687b;
            } else {
                textView = this.f8688c;
            }
            if (zQ2) {
                textView2 = this.f8688c;
            } else {
                textView2 = this.f8687b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i19 = measuredHeight;
            if (zQ) {
            }
            i25 = this.f8715z & 112;
            i26 = iMax;
            if (i25 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f8707t;
            } else if (i25 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i19) / 2;
                i39 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i45 = this.f8707t;
                if (iMax2 < i39 + i45) {
                    iMax2 = i39 + i45;
                } else {
                    i46 = (((height - paddingBottom) - i19) - iMax2) - paddingTop2;
                    i47 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i48 = this.f8710v;
                    if (i46 < i47 + i48) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i48) - i46));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f8710v) - i19;
            }
            if (z17) {
                if (z16) {
                    i36 = this.f8703r;
                } else {
                    i36 = 0;
                }
                int i511 = i36 - iArr[1];
                iMin -= Math.max(0, i511);
                iArr[1] = Math.max(0, -i511);
                if (zQ) {
                    g gVar11 = (g) this.f8687b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f8687b.getMeasuredWidth();
                    int measuredHeight6 = this.f8687b.getMeasuredHeight() + paddingTop;
                    this.f8687b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i37 = measuredWidth7 - this.f8705s;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i37 = iMin;
                }
                if (zQ2) {
                    int i611 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                    this.f8688c.layout(iMin - this.f8688c.getMeasuredWidth(), i611, iMin, this.f8688c.getMeasuredHeight() + i611);
                    i38 = iMin - this.f8705s;
                } else {
                    i38 = iMin;
                }
                if (z16) {
                    iMin = Math.min(i37, i38);
                }
                iMax = i26;
                i28 = 0;
            } else {
                if (z16) {
                    i27 = this.f8703r;
                } else {
                    i27 = 0;
                }
                i28 = 0;
                int i612 = i27 - iArr[0];
                iMax = i26 + Math.max(0, i612);
                iArr[0] = Math.max(0, -i612);
                if (zQ) {
                    g gVar12 = (g) this.f8687b.getLayoutParams();
                    int measuredWidth8 = this.f8687b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f8687b.getMeasuredHeight() + paddingTop;
                    this.f8687b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i29 = measuredWidth8 + this.f8705s;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i29 = iMax;
                }
                if (zQ2) {
                    int i613 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f8688c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f8688c.getMeasuredWidth() + iMax;
                    this.f8688c.layout(iMax, i613, measuredWidth9, this.f8688c.getMeasuredHeight() + i613);
                    i35 = measuredWidth9 + this.f8705s;
                } else {
                    i35 = iMax;
                }
                if (z16) {
                    iMax = Math.max(i29, i35);
                }
            }
        }
        b(this.G, 3);
        size = this.G.size();
        iE2 = iMax;
        while (i49 < size) {
            iE2 = E(this.G.get(i49), iE2, iArr, iMin2);
        }
        b(this.G, 5);
        size2 = this.G.size();
        while (i55 < size2) {
            iMin = F(this.G.get(i55), iMin, iArr, iMin2);
        }
        b(this.G, 1);
        int iU2 = u(this.G, iArr);
        i56 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU2 / 2);
        i57 = iU2 + i56;
        if (i56 >= iE2) {
            if (i57 > iMin) {
                iE2 = i56 - (i57 - iMin);
            } else {
                iE2 = i56;
            }
        }
        size3 = this.G.size();
        while (i28 < size3) {
            iE2 = E(this.G.get(i28), iE2, iArr, iMin2);
            i28++;
        }
        this.G.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.I;
        boolean zB = g1.b(this);
        int i17 = !zB ? 1 : 0;
        if (Q(this.f8689d)) {
            H(this.f8689d, i15, 0, i16, 0, this.f8701q);
            measuredWidth = this.f8689d.getMeasuredWidth() + s(this.f8689d);
            iMax = Math.max(0, this.f8689d.getMeasuredHeight() + t(this.f8689d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8689d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f8693h)) {
            H(this.f8693h, i15, 0, i16, 0, this.f8701q);
            measuredWidth = this.f8693h.getMeasuredWidth() + s(this.f8693h);
            iMax = Math.max(iMax, this.f8693h.getMeasuredHeight() + t(this.f8693h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8693h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f8686a)) {
            H(this.f8686a, i15, iMax3, i16, 0, this.f8701q);
            measuredWidth2 = this.f8686a.getMeasuredWidth() + s(this.f8686a);
            iMax = Math.max(iMax, this.f8686a.getMeasuredHeight() + t(this.f8686a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8686a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i17] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f8695j)) {
            iArr = iArr2;
            iMax4 += G(this.f8695j, i15, iMax4, i16, 0, iArr);
            iMax = Math.max(iMax, this.f8695j.getMeasuredHeight() + t(this.f8695j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8695j.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (Q(this.f8690e)) {
            iMax4 += G(this.f8690e, i15, iMax4, i16, 0, iArr);
            iMax = Math.max(iMax, this.f8690e.getMeasuredHeight() + t(this.f8690e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8690e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((g) childAt.getLayoutParams()).f8723b == 0 && Q(childAt)) {
                iMax4 += G(childAt, i15, iMax4, i16, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i19 = iMax4;
        int i25 = this.f8707t + this.f8710v;
        int i26 = this.f8703r + this.f8705s;
        if (Q(this.f8687b)) {
            G(this.f8687b, i15, i19 + i26, i16, i25, iArr);
            int measuredWidth3 = this.f8687b.getMeasuredWidth() + s(this.f8687b);
            int measuredHeight2 = this.f8687b.getMeasuredHeight() + t(this.f8687b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8687b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (Q(this.f8688c)) {
            iMax2 = Math.max(iMax2, G(this.f8688c, i15, i19 + i26, i16, i25 + measuredHeight, iArr));
            measuredHeight += this.f8688c.getMeasuredHeight() + t(this.f8688c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f8688c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i19 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i15, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i16, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f8686a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i15 = iVar.f8724c;
        if (i15 != 0 && this.T != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i15)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f8725d) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i15) {
        super.onRtlPropertiesChanged(i15);
        h();
        this.f8712w.f(i15 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.T;
        if (fVar != null && (gVar = fVar.f8721b) != null) {
            iVar.f8724c = gVar.getItemId();
        }
        iVar.f8725d = D();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z15) {
        if (this.f8709u0 != z15) {
            this.f8709u0 = z15;
            S();
        }
    }

    public void setCollapseContentDescription(int i15) {
        setCollapseContentDescription(i15 != 0 ? getContext().getText(i15) : null);
    }

    public void setCollapseIcon(int i15) {
        setCollapseIcon(p082nUL.y.b(getContext(), i15));
    }

    public void setCollapsible(boolean z15) {
        this.f8704r0 = z15;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i15) {
        if (i15 < 0) {
            i15 = PKIFailureInfo.systemUnavail;
        }
        if (i15 != this.f8714y) {
            this.f8714y = i15;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i15) {
        if (i15 < 0) {
            i15 = PKIFailureInfo.systemUnavail;
        }
        if (i15 != this.f8713x) {
            this.f8713x = i15;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i15) {
        setLogo(p082nUL.y.b(getContext(), i15));
    }

    public void setLogoDescription(int i15) {
        setLogoDescription(getContext().getText(i15));
    }

    public void setNavigationContentDescription(int i15) {
        setNavigationContentDescription(i15 != 0 ? getContext().getText(i15) : null);
    }

    public void setNavigationIcon(int i15) {
        setNavigationIcon(p082nUL.y.b(getContext(), i15));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f8689d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f8686a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i15) {
        if (this.f8697l != i15) {
            this.f8697l = i15;
            if (i15 == 0) {
                this.f8696k = getContext();
            } else {
                this.f8696k = new ContextThemeWrapper(getContext(), i15);
            }
        }
    }

    public void setSubtitle(int i15) {
        setSubtitle(getContext().getText(i15));
    }

    public void setSubtitleTextColor(int i15) {
        setSubtitleTextColor(ColorStateList.valueOf(i15));
    }

    public void setTitle(int i15) {
        setTitle(getContext().getText(i15));
    }

    public void setTitleMarginBottom(int i15) {
        this.f8710v = i15;
        requestLayout();
    }

    public void setTitleMarginEnd(int i15) {
        this.f8705s = i15;
        requestLayout();
    }

    public void setTitleMarginStart(int i15) {
        this.f8703r = i15;
        requestLayout();
    }

    public void setTitleMarginTop(int i15) {
        this.f8707t = i15;
        requestLayout();
    }

    public void setTitleTextColor(int i15) {
        setTitleTextColor(ColorStateList.valueOf(i15));
    }

    public boolean v() {
        f fVar = this.T;
        return (fVar == null || fVar.f8721b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f8686a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i15) {
        getMenuInflater().inflate(i15, getMenu());
    }

    @Override // j6.o
    public void y(j6.r rVar) {
        this.K.f(rVar);
    }

    public void z() {
        Iterator<MenuItem> it = this.L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        I();
    }

    public static class g extends androidx.appcompat.app.a.C0185a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8723b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8723b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i15, int i16) {
            super(i15, i16);
            this.f8723b = 0;
            this.f8161a = 8388627;
        }

        public g(g gVar) {
            super((androidx.appcompat.app.a.C0185a) gVar);
            this.f8723b = 0;
            this.f8723b = gVar.f8723b;
        }

        public g(androidx.appcompat.app.a.C0185a c0185a) {
            super(c0185a);
            this.f8723b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8723b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8723b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f8715z = 8388627;
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        this.I = new int[2];
        this.K = new j6.p(new Runnable() { // from class: androidx.appcompat.widget.b1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8769a.z();
            }
        });
        this.L = new ArrayList<>();
        this.O = new a();
        this.f8711v0 = new b();
        z0 z0VarV = z0.v(getContext(), attributeSet, p007NuL.v.E2, i15, 0);
        j6.l0.f0(this, context, p007NuL.v.E2, attributeSet, z0VarV.r(), i15, 0);
        this.f8698m = z0VarV.n(p007NuL.v.f471g3, 0);
        this.f8699n = z0VarV.n(p007NuL.v.X2, 0);
        this.f8715z = z0VarV.l(p007NuL.v.F2, this.f8715z);
        this.f8700p = z0VarV.l(p007NuL.v.G2, 48);
        int iE = z0VarV.e(p007NuL.v.f441a3, 0);
        iE = z0VarV.s(p007NuL.v.f466f3) ? z0VarV.e(p007NuL.v.f466f3, iE) : iE;
        this.f8710v = iE;
        this.f8707t = iE;
        this.f8705s = iE;
        this.f8703r = iE;
        int iE2 = z0VarV.e(p007NuL.v.f456d3, -1);
        if (iE2 >= 0) {
            this.f8703r = iE2;
        }
        int iE3 = z0VarV.e(p007NuL.v.f451c3, -1);
        if (iE3 >= 0) {
            this.f8705s = iE3;
        }
        int iE4 = z0VarV.e(p007NuL.v.f461e3, -1);
        if (iE4 >= 0) {
            this.f8707t = iE4;
        }
        int iE5 = z0VarV.e(p007NuL.v.f446b3, -1);
        if (iE5 >= 0) {
            this.f8710v = iE5;
        }
        this.f8701q = z0VarV.f(p007NuL.v.R2, -1);
        int iE6 = z0VarV.e(p007NuL.v.N2, PKIFailureInfo.systemUnavail);
        int iE7 = z0VarV.e(p007NuL.v.J2, PKIFailureInfo.systemUnavail);
        int iF = z0VarV.f(p007NuL.v.L2, 0);
        int iF2 = z0VarV.f(p007NuL.v.M2, 0);
        h();
        this.f8712w.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f8712w.g(iE6, iE7);
        }
        this.f8713x = z0VarV.e(p007NuL.v.O2, PKIFailureInfo.systemUnavail);
        this.f8714y = z0VarV.e(p007NuL.v.K2, PKIFailureInfo.systemUnavail);
        this.f8691f = z0VarV.g(p007NuL.v.I2);
        this.f8692g = z0VarV.p(p007NuL.v.H2);
        CharSequence charSequenceP = z0VarV.p(p007NuL.v.Z2);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = z0VarV.p(p007NuL.v.W2);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f8696k = getContext();
        setPopupTheme(z0VarV.n(p007NuL.v.V2, 0));
        Drawable drawableG = z0VarV.g(p007NuL.v.U2);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = z0VarV.p(p007NuL.v.T2);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = z0VarV.g(p007NuL.v.P2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = z0VarV.p(p007NuL.v.Q2);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (z0VarV.s(p007NuL.v.f476h3)) {
            setTitleTextColor(z0VarV.c(p007NuL.v.f476h3));
        }
        if (z0VarV.s(p007NuL.v.Y2)) {
            setSubtitleTextColor(z0VarV.c(p007NuL.v.Y2));
        }
        if (z0VarV.s(p007NuL.v.S2)) {
            x(z0VarV.n(p007NuL.v.S2, 0));
        }
        z0VarV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f8693h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f8693h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f8693h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f8691f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f8690e)) {
                c(this.f8690e, true);
            }
        } else {
            ImageView imageView = this.f8690e;
            if (imageView != null && A(imageView)) {
                removeView(this.f8690e);
                this.H.remove(this.f8690e);
            }
        }
        ImageView imageView2 = this.f8690e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f8690e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f8689d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f8689d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.f8689d)) {
                c(this.f8689d, true);
            }
        } else {
            ImageButton imageButton = this.f8689d;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f8689d);
                this.H.remove(this.f8689d);
            }
        }
        ImageButton imageButton2 = this.f8689d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8688c;
            if (textView != null && A(textView)) {
                removeView(this.f8688c);
                this.H.remove(this.f8688c);
            }
        } else {
            if (this.f8688c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f8688c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f8688c.setEllipsize(TextUtils.TruncateAt.END);
                int i15 = this.f8699n;
                if (i15 != 0) {
                    this.f8688c.setTextAppearance(context, i15);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f8688c.setTextColor(colorStateList);
                }
            }
            if (!A(this.f8688c)) {
                c(this.f8688c, true);
            }
        }
        TextView textView2 = this.f8688c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f8688c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8687b;
            if (textView != null && A(textView)) {
                removeView(this.f8687b);
                this.H.remove(this.f8687b);
            }
        } else {
            if (this.f8687b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f8687b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f8687b.setEllipsize(TextUtils.TruncateAt.END);
                int i15 = this.f8698m;
                if (i15 != 0) {
                    this.f8687b.setTextAppearance(context, i15);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.f8687b.setTextColor(colorStateList);
                }
            }
            if (!A(this.f8687b)) {
                c(this.f8687b, true);
            }
        }
        TextView textView2 = this.f8687b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        TextView textView = this.f8687b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends r6.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8725d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i15) {
                return new i[i15];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8724c = parcel.readInt();
            this.f8725d = parcel.readInt() != 0;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f8724c);
            parcel.writeInt(this.f8725d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
