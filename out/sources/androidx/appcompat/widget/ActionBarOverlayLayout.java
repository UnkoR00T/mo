package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements f0, j6.v, j6.w {
    static final int[] K = {p007NuL.m.f309b, R.attr.windowContentOverlay};
    private static final j6.f1 L = new j6.f1.a().d(x5.h.c(0, 1, 0, 1)).a();
    private static final Rect O = new Rect();
    private j6.f1 A;
    private d B;
    private OverScroller C;
    ViewPropertyAnimator D;
    final AnimatorListenerAdapter E;
    private final Runnable F;
    private final Runnable G;
    private final j6.x H;
    private final f I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f8589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f8590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g0 f8591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f8592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8594h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f8596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f8599n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f8600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f8601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f8602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f8603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f8604t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f8605v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f8606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j6.f1 f8607x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j6.f1 f8608y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private j6.f1 f8609z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.f8596k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = null;
            actionBarOverlayLayout.f8596k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.f8590d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.D = actionBarOverlayLayout.f8590d.animate().translationY(-ActionBarOverlayLayout.this.f8590d.getHeight()).setListener(ActionBarOverlayLayout.this.E);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z15);

        void d();

        void e();

        void onWindowVisibilityChanged(int i15);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i15, int i16) {
            super(i15, i16);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8588b = 0;
        this.f8599n = new Rect();
        this.f8600p = new Rect();
        this.f8601q = new Rect();
        this.f8602r = new Rect();
        this.f8603s = new Rect();
        this.f8604t = new Rect();
        this.f8605v = new Rect();
        this.f8606w = new Rect();
        j6.f1 f1Var = j6.f1.f99644b;
        this.f8607x = f1Var;
        this.f8608y = f1Var;
        this.f8609z = f1Var;
        this.A = f1Var;
        this.E = new a();
        this.F = new b();
        this.G = new c();
        w(context);
        this.H = new j6.x(this);
        f fVar = new f(context);
        this.I = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.F.run();
    }

    private boolean C(float f15) {
        this.C.fling(0, 0, 0, (int) f15, 0, 0, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
        return this.C.getFinalY() > this.f8590d.getHeight();
    }

    private void o() {
        v();
        this.G.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean q(View view, Rect rect, boolean z15, boolean z16, boolean z17, boolean z18) {
        boolean z19;
        e eVar = (e) view.getLayoutParams();
        if (z15) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i16 = rect.left;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i16;
                z19 = true;
            } else {
                z19 = false;
            }
        } else {
            z19 = false;
        }
        if (z16) {
            int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i18 = rect.top;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i18;
                z19 = true;
            }
        }
        if (z18) {
            int i19 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i25 = rect.right;
            if (i19 != i25) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i25;
                z19 = true;
            }
        }
        if (z17) {
            int i26 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i27 = rect.bottom;
            if (i26 != i27) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i27;
                return true;
            }
        }
        return z19;
    }

    private boolean r() {
        j6.l0.g(this.I, L, this.f8602r);
        return !this.f8602r.equals(O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g0 u(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(K);
        this.f8587a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f8592f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.G, 600L);
    }

    private void z() {
        v();
        postDelayed(this.F, 600L);
    }

    void A() {
        if (this.f8589c == null) {
            this.f8589c = (ContentFrameLayout) findViewById(p007NuL.r.f379b);
            this.f8590d = (ActionBarContainer) findViewById(p007NuL.r.f380c);
            this.f8591e = u(findViewById(p007NuL.r.f378a));
        }
    }

    @Override // androidx.appcompat.widget.f0
    public boolean a() {
        A();
        return this.f8591e.a();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean b() {
        A();
        return this.f8591e.b();
    }

    @Override // j6.v
    public void c(View view, View view2, int i15, int i16) {
        if (i16 == 0) {
            onNestedScrollAccepted(view, view2, i15);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.f0
    public boolean d() {
        A();
        return this.f8591e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8592f != null) {
            int bottom = this.f8590d.getVisibility() == 0 ? (int) (this.f8590d.getBottom() + this.f8590d.getTranslationY() + 0.5f) : 0;
            this.f8592f.setBounds(0, bottom, getWidth(), this.f8592f.getIntrinsicHeight() + bottom);
            this.f8592f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void e(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        A();
        this.f8591e.e(menu, aVar);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean f() {
        A();
        return this.f8591e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.f0
    public void g() {
        A();
        this.f8591e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8590d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.H.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f8591e.getTitle();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean h() {
        A();
        return this.f8591e.h();
    }

    @Override // androidx.appcompat.widget.f0
    public void i(int i15) {
        A();
        if (i15 == 2) {
            this.f8591e.n();
        } else if (i15 == 5) {
            this.f8591e.v();
        } else {
            if (i15 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // j6.v
    public void j(View view, int i15) {
        if (i15 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // j6.v
    public void k(View view, int i15, int i16, int[] iArr, int i17) {
        if (i17 == 0) {
            onNestedPreScroll(view, i15, i16, iArr);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void l() {
        A();
        this.f8591e.p();
    }

    @Override // j6.w
    public void m(View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        n(view, i15, i16, i17, i18, i19);
    }

    @Override // j6.v
    public void n(View view, int i15, int i16, int i17, int i18, int i19) {
        if (i19 == 0) {
            onNestedScroll(view, i15, i16, i17, i18);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        j6.f1 f1VarZ = j6.f1.z(windowInsets, this);
        boolean zQ = q(this.f8590d, new Rect(f1VarZ.j(), f1VarZ.l(), f1VarZ.k(), f1VarZ.i()), true, true, false, true);
        j6.l0.g(this, f1VarZ, this.f8599n);
        Rect rect = this.f8599n;
        j6.f1 f1VarN = f1VarZ.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f8607x = f1VarN;
        boolean z15 = true;
        if (!this.f8608y.equals(f1VarN)) {
            this.f8608y = this.f8607x;
            zQ = true;
        }
        if (this.f8600p.equals(this.f8599n)) {
            z15 = zQ;
        } else {
            this.f8600p.set(this.f8599n);
        }
        if (z15) {
            requestLayout();
        }
        return f1VarZ.a().c().b().x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        j6.l0.e0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i25 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i26 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i25, i26, measuredWidth + i25, measuredHeight + i26);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f8590d, i15, 0, i16, 0);
        e eVar = (e) this.f8590d.getLayoutParams();
        int iMax = Math.max(0, this.f8590d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f8590d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8590d.getMeasuredState());
        boolean z15 = (j6.l0.H(this) & 256) != 0;
        if (z15) {
            measuredHeight = this.f8587a;
            if (this.f8594h && this.f8590d.getTabContainer() != null) {
                measuredHeight += this.f8587a;
            }
        } else {
            measuredHeight = this.f8590d.getVisibility() != 8 ? this.f8590d.getMeasuredHeight() : 0;
        }
        this.f8601q.set(this.f8599n);
        this.f8609z = this.f8607x;
        if (this.f8593g || z15 || !r()) {
            this.f8609z = new j6.f1.a(this.f8609z).d(x5.h.c(this.f8609z.j(), this.f8609z.l() + measuredHeight, this.f8609z.k(), this.f8609z.i())).a();
        } else {
            Rect rect = this.f8601q;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f8609z = this.f8609z.n(0, measuredHeight, 0, 0);
        }
        q(this.f8589c, this.f8601q, true, true, true, true);
        if (!this.A.equals(this.f8609z)) {
            j6.f1 f1Var = this.f8609z;
            this.A = f1Var;
            j6.l0.h(this.f8589c, f1Var);
        }
        measureChildWithMargins(this.f8589c, i15, 0, i16, 0);
        e eVar2 = (e) this.f8589c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f8589c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f8589c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8589c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i15, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i16, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f15, float f16, boolean z15) {
        if (!this.f8595j || !z15) {
            return false;
        }
        if (C(f16)) {
            o();
        } else {
            B();
        }
        this.f8596k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f15, float f16) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i15, int i16, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i15, int i16, int i17, int i18) {
        int i19 = this.f8597l + i16;
        this.f8597l = i19;
        setActionBarHideOffset(i19);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i15) {
        this.H.b(view, view2, i15);
        this.f8597l = getActionBarHideOffset();
        v();
        d dVar = this.B;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i15) {
        if ((i15 & 2) == 0 || this.f8590d.getVisibility() != 0) {
            return false;
        }
        return this.f8595j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f8595j && !this.f8596k) {
            if (this.f8597l <= this.f8590d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.B;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i15) {
        super.onWindowSystemUiVisibilityChanged(i15);
        A();
        int i16 = this.f8598m ^ i15;
        this.f8598m = i15;
        boolean z15 = (i15 & 4) == 0;
        boolean z16 = (i15 & 256) != 0;
        d dVar = this.B;
        if (dVar != null) {
            dVar.c(!z16);
            if (z15 || !z16) {
                this.B.a();
            } else {
                this.B.d();
            }
        }
        if ((i16 & 256) == 0 || this.B == null) {
            return;
        }
        j6.l0.e0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i15) {
        super.onWindowVisibilityChanged(i15);
        this.f8588b = i15;
        d dVar = this.B;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i15);
        }
    }

    @Override // j6.v
    public boolean p(View view, View view2, int i15, int i16) {
        return i16 == 0 && onStartNestedScroll(view, view2, i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i15) {
        v();
        this.f8590d.setTranslationY(-Math.max(0, Math.min(i15, this.f8590d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.B = dVar;
        if (getWindowToken() != null) {
            this.B.onWindowVisibilityChanged(this.f8588b);
            int i15 = this.f8598m;
            if (i15 != 0) {
                onWindowSystemUiVisibilityChanged(i15);
                j6.l0.e0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z15) {
        this.f8594h = z15;
    }

    public void setHideOnContentScrollEnabled(boolean z15) {
        if (z15 != this.f8595j) {
            this.f8595j = z15;
            if (z15) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i15) {
        A();
        this.f8591e.setIcon(i15);
    }

    public void setLogo(int i15) {
        A();
        this.f8591e.s(i15);
    }

    public void setOverlayMode(boolean z15) {
        this.f8593g = z15;
    }

    public void setShowingForActionMode(boolean z15) {
    }

    public void setUiOptions(int i15) {
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f8591e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f8591e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f8593g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f8591e.setIcon(drawable);
    }
}
