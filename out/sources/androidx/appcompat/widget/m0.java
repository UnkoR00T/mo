package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import io.sentry.android.core.c2;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p011Prn.f2;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements f2 {
    private static Method K;
    private static Method L;
    private final h A;
    private final g B;
    private final e C;
    private Runnable D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f8958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i0 f8959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8964h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8969n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f8971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f8972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DataSetObserver f8974t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f8975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f8976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AdapterView.OnItemClickListener f8977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f8978y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final i f8979z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = m0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            m0.this.a();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i15, long j15) {
            i0 i0Var;
            if (i15 == -1 || (i0Var = m0.this.f8959c) == null) {
                return;
            }
            i0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i15, boolean z15) {
            return popupWindow.getMaxAvailableHeight(view, i15, z15);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z15) {
            popupWindow.setIsClippedToScreen(z15);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (m0.this.b()) {
                m0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            m0.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i15, int i16, int i17) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i15) {
            if (i15 != 1 || m0.this.A() || m0.this.I.getContentView() == null) {
                return;
            }
            m0 m0Var = m0.this;
            m0Var.E.removeCallbacks(m0Var.f8979z);
            m0.this.f8979z.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x15 = (int) motionEvent.getX();
            int y15 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = m0.this.I) != null && popupWindow.isShowing() && x15 >= 0 && x15 < m0.this.I.getWidth() && y15 >= 0 && y15 < m0.this.I.getHeight()) {
                m0 m0Var = m0.this;
                m0Var.E.postDelayed(m0Var.f8979z, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            m0 m0Var2 = m0.this;
            m0Var2.E.removeCallbacks(m0Var2.f8979z);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0 i0Var = m0.this.f8959c;
            if (i0Var == null || !i0Var.isAttachedToWindow() || m0.this.f8959c.getCount() <= m0.this.f8959c.getChildCount()) {
                return;
            }
            int childCount = m0.this.f8959c.getChildCount();
            m0 m0Var = m0.this;
            if (childCount <= m0Var.f8971q) {
                m0Var.I.setInputMethodMode(2);
                m0.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public m0(Context context) {
        this(context, null, p007NuL.m.G);
    }

    private void C() {
        View view = this.f8972r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8972r);
            }
        }
    }

    private void O(boolean z15) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.I, z15);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.I, Boolean.valueOf(z15));
            } catch (Exception unused) {
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i15;
        int iMakeMeasureSpec;
        View view;
        int i16;
        if (this.f8959c == null) {
            Context context = this.f8957a;
            this.D = new a();
            i0 i0VarS = s(context, !this.H);
            this.f8959c = i0VarS;
            Drawable drawable = this.f8976w;
            if (drawable != null) {
                i0VarS.setSelector(drawable);
            }
            this.f8959c.setAdapter(this.f8958b);
            this.f8959c.setOnItemClickListener(this.f8977x);
            this.f8959c.setFocusable(true);
            this.f8959c.setFocusableInTouchMode(true);
            this.f8959c.setOnItemSelectedListener(new b());
            this.f8959c.setOnScrollListener(this.B);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8978y;
            if (onItemSelectedListener != null) {
                this.f8959c.setOnItemSelectedListener(onItemSelectedListener);
            }
            i0 i0Var = this.f8959c;
            View view2 = this.f8972r;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i17 = this.f8973s;
                if (i17 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(i0Var, layoutParams);
                } else if (i17 != 1) {
                    c2.e("ListPopupWindow", "Invalid hint position " + this.f8973s);
                } else {
                    linearLayout.addView(i0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i18 = this.f8961e;
                if (i18 >= 0) {
                    i16 = Integer.MIN_VALUE;
                } else {
                    i18 = 0;
                    i16 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, i16), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = i0Var;
            }
            this.I.setContentView(view);
        } else {
            View view3 = this.f8972r;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            int i19 = rect.top;
            i15 = rect.bottom + i19;
            if (!this.f8965j) {
                this.f8963g = -i19;
            }
        } else {
            this.F.setEmpty();
            i15 = 0;
        }
        int iU = u(t(), this.f8963g, this.I.getInputMethodMode() == 2);
        if (this.f8969n || this.f8960d == -1) {
            return iU + i15;
        }
        int i25 = this.f8961e;
        if (i25 == -2) {
            int i26 = this.f8957a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.F;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - (rect2.left + rect2.right), PKIFailureInfo.systemUnavail);
        } else if (i25 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
        } else {
            int i27 = this.f8957a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.F;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f8959c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i15 + this.f8959c.getPaddingTop() + this.f8959c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i15, boolean z15) {
        return c.a(this.I, view, i15, z15);
    }

    public boolean A() {
        return this.I.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.H;
    }

    public void D(View view) {
        this.f8975v = view;
    }

    public void E(int i15) {
        this.I.setAnimationStyle(i15);
    }

    public void F(int i15) {
        Drawable background = this.I.getBackground();
        if (background == null) {
            R(i15);
            return;
        }
        background.getPadding(this.F);
        Rect rect = this.F;
        this.f8961e = rect.left + rect.right + i15;
    }

    public void G(int i15) {
        this.f8968m = i15;
    }

    public void H(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public void I(int i15) {
        this.I.setInputMethodMode(i15);
    }

    public void J(boolean z15) {
        this.H = z15;
        this.I.setFocusable(z15);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f8977x = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f8978y = onItemSelectedListener;
    }

    public void N(boolean z15) {
        this.f8967l = true;
        this.f8966k = z15;
    }

    public void P(int i15) {
        this.f8973s = i15;
    }

    public void Q(int i15) {
        i0 i0Var = this.f8959c;
        if (!b() || i0Var == null) {
            return;
        }
        i0Var.setListSelectionHidden(false);
        i0Var.setSelection(i15);
        if (i0Var.getChoiceMode() != 0) {
            i0Var.setItemChecked(i15, true);
        }
    }

    public void R(int i15) {
        this.f8961e = i15;
    }

    @Override // p011Prn.f2
    public void a() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.g.b(this.I, this.f8964h);
        if (this.I.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f8961e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i15 = this.f8960d;
                if (i15 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.I.setWidth(this.f8961e == -1 ? -1 : 0);
                        this.I.setHeight(0);
                    } else {
                        this.I.setWidth(this.f8961e == -1 ? -1 : 0);
                        this.I.setHeight(-1);
                    }
                } else if (i15 != -2) {
                    iQ = i15;
                }
                this.I.setOutsideTouchable((this.f8970p || this.f8969n) ? false : true);
                this.I.update(t(), this.f8962f, this.f8963g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f8961e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i16 = this.f8960d;
        if (i16 == -1) {
            iQ = -1;
        } else if (i16 != -2) {
            iQ = i16;
        }
        this.I.setWidth(width2);
        this.I.setHeight(iQ);
        O(true);
        this.I.setOutsideTouchable((this.f8970p || this.f8969n) ? false : true);
        this.I.setTouchInterceptor(this.A);
        if (this.f8967l) {
            androidx.core.widget.g.a(this.I, this.f8966k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(this.I, this.G);
                } catch (Exception e15) {
                    c2.f("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e15);
                }
            }
        } else {
            d.a(this.I, this.G);
        }
        androidx.core.widget.g.c(this.I, t(), this.f8962f, this.f8963g, this.f8968m);
        this.f8959c.setSelection(-1);
        if (!this.H || this.f8959c.isInTouchMode()) {
            r();
        }
        if (this.H) {
            return;
        }
        this.E.post(this.C);
    }

    @Override // p011Prn.f2
    public boolean b() {
        return this.I.isShowing();
    }

    public void c(Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f8962f;
    }

    @Override // p011Prn.f2
    public void dismiss() {
        this.I.dismiss();
        C();
        this.I.setContentView(null);
        this.f8959c = null;
        this.E.removeCallbacks(this.f8979z);
    }

    public void f(int i15) {
        this.f8962f = i15;
    }

    public Drawable h() {
        return this.I.getBackground();
    }

    public void j(int i15) {
        this.f8963g = i15;
        this.f8965j = true;
    }

    public int m() {
        if (this.f8965j) {
            return this.f8963g;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f8974t;
        if (dataSetObserver == null) {
            this.f8974t = new f();
        } else {
            ListAdapter listAdapter2 = this.f8958b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8958b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8974t);
        }
        i0 i0Var = this.f8959c;
        if (i0Var != null) {
            i0Var.setAdapter(this.f8958b);
        }
    }

    @Override // p011Prn.f2
    public ListView p() {
        return this.f8959c;
    }

    public void r() {
        i0 i0Var = this.f8959c;
        if (i0Var != null) {
            i0Var.setListSelectionHidden(true);
            i0Var.requestLayout();
        }
    }

    i0 s(Context context, boolean z15) {
        return new i0(context, z15);
    }

    public View t() {
        return this.f8975v;
    }

    public Object v() {
        if (b()) {
            return this.f8959c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.f8959c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.f8959c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.f8959c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f8961e;
    }

    public m0(Context context, AttributeSet attributeSet, int i15) {
        this(context, attributeSet, i15, 0);
    }

    public m0(Context context, AttributeSet attributeSet, int i15, int i16) {
        this.f8960d = -2;
        this.f8961e = -2;
        this.f8964h = 1002;
        this.f8968m = 0;
        this.f8969n = false;
        this.f8970p = false;
        this.f8971q = Integer.MAX_VALUE;
        this.f8973s = 0;
        this.f8979z = new i();
        this.A = new h();
        this.B = new g();
        this.C = new e();
        this.F = new Rect();
        this.f8957a = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p007NuL.v.f494l1, i15, i16);
        this.f8962f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p007NuL.v.f499m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p007NuL.v.f504n1, 0);
        this.f8963g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8965j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i15, i16);
        this.I = tVar;
        tVar.setInputMethodMode(1);
    }
}
