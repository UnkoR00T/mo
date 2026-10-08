package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Interpolator f9027k = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f9028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f9029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    l0 f9030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f9031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f9033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f9034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9035h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9036j;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9037a;

        a(View view) {
            this.f9037a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.smoothScrollTo(this.f9037a.getLeft() - ((s0.this.getWidth() - this.f9037a.getWidth()) / 2), 0);
            s0.this.f9028a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return s0.this.f9030c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i15) {
            return ((d) s0.this.f9030c.getChildAt(i15)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i15) {
            return i15;
        }

        @Override // android.widget.Adapter
        public View getView(int i15, View view, ViewGroup viewGroup) {
            if (view == null) {
                return s0.this.c((androidx.appcompat.app.a.c) getItem(i15), true);
            }
            ((d) view).a((androidx.appcompat.app.a.c) getItem(i15));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = s0.this.f9030c.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = s0.this.f9030c.getChildAt(i15);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f9041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.app.a.c f9042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f9043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f9044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f9045e;

        public d(Context context, androidx.appcompat.app.a.c cVar, boolean z15) {
            super(context, null, p007NuL.m.f311d);
            int[] iArr = {R.attr.background};
            this.f9041a = iArr;
            this.f9042b = cVar;
            z0 z0VarV = z0.v(context, null, iArr, p007NuL.m.f311d, 0);
            if (z0VarV.s(0)) {
                setBackgroundDrawable(z0VarV.g(0));
            }
            z0VarV.x();
            if (z15) {
                setGravity(8388627);
            }
            c();
        }

        public void a(androidx.appcompat.app.a.c cVar) {
            this.f9042b = cVar;
            c();
        }

        public androidx.appcompat.app.a.c b() {
            return this.f9042b;
        }

        public void c() {
            androidx.appcompat.app.a.c cVar = this.f9042b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f9045e = viewB;
                TextView textView = this.f9043c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9044d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9044d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f9045e;
            if (view != null) {
                removeView(view);
                this.f9045e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f9044d == null) {
                    r rVar = new r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f9044d = rVar;
                }
                this.f9044d.setImageDrawable(drawableC);
                this.f9044d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f9044d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f9044d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f9043c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f9043c.setText((CharSequence) null);
                }
            } else {
                if (this.f9043c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, p007NuL.m.f312e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f9043c = appCompatTextView;
                }
                this.f9043c.setText(charSequenceD);
                this.f9043c.setVisibility(0);
            }
            ImageView imageView3 = this.f9044d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            e1.a(this, zIsEmpty ? cVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i15, int i16) {
            super.onMeasure(i15, i16);
            if (s0.this.f9033f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i17 = s0.this.f9033f;
                if (measuredWidth > i17) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), i16);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z15) {
            boolean z16 = isSelected() != z15;
            super.setSelected(z15);
            if (z16 && z15) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        a0 a0Var = new a0(getContext(), null, p007NuL.m.f315h);
        a0Var.setLayoutParams(new l0.a(-2, -1));
        a0Var.setOnItemSelectedListener(this);
        return a0Var;
    }

    private boolean d() {
        Spinner spinner = this.f9031d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f9031d == null) {
            this.f9031d = b();
        }
        removeView(this.f9030c);
        addView(this.f9031d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f9031d.getAdapter() == null) {
            this.f9031d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f9028a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f9028a = null;
        }
        this.f9031d.setSelection(this.f9036j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f9031d);
        addView(this.f9030c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f9031d.getSelectedItemPosition());
        return false;
    }

    public void a(int i15) {
        View childAt = this.f9030c.getChildAt(i15);
        Runnable runnable = this.f9028a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f9028a = aVar;
        post(aVar);
    }

    d c(androidx.appcompat.app.a.c cVar, boolean z15) {
        d dVar = new d(getContext(), cVar, z15);
        if (z15) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f9035h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f9029b == null) {
            this.f9029b = new c();
        }
        dVar.setOnClickListener(this.f9029b);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f9028a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f9034g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f9028a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i15, long j15) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i15, int i16) {
        int mode = View.MeasureSpec.getMode(i15);
        boolean z15 = mode == 1073741824;
        setFillViewport(z15);
        int childCount = this.f9030c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f9033f = -1;
        } else {
            if (childCount > 2) {
                this.f9033f = (int) (View.MeasureSpec.getSize(i15) * 0.4f);
            } else {
                this.f9033f = View.MeasureSpec.getSize(i15) / 2;
            }
            this.f9033f = Math.min(this.f9033f, this.f9034g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f9035h, 1073741824);
        if (z15 || !this.f9032e) {
            f();
        } else {
            this.f9030c.measure(0, iMakeMeasureSpec);
            if (this.f9030c.getMeasuredWidth() > View.MeasureSpec.getSize(i15)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i15, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z15 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f9036j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z15) {
        this.f9032e = z15;
    }

    public void setContentHeight(int i15) {
        this.f9035h = i15;
        requestLayout();
    }

    public void setTabSelected(int i15) {
        this.f9036j = i15;
        int childCount = this.f9030c.getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = this.f9030c.getChildAt(i16);
            boolean z15 = i16 == i15;
            childAt.setSelected(z15);
            if (z15) {
                a(i15);
            }
            i16++;
        }
        Spinner spinner = this.f9031d;
        if (spinner == null || i15 < 0) {
            return;
        }
        spinner.setSelection(i15);
    }
}
