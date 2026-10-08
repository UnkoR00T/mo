package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f8573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f8574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f8575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f8576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f8577n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f8578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f8579q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f8580r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8581s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8582t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8584w;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f8585a;

        a(androidx.appcompat.view.b bVar) {
            this.f8585a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f8585a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f8578p == null) {
            LayoutInflater.from(getContext()).inflate(p007NuL.s.f404a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8578p = linearLayout;
            this.f8579q = (TextView) linearLayout.findViewById(p007NuL.r.f382e);
            this.f8580r = (TextView) this.f8578p.findViewById(p007NuL.r.f381d);
            if (this.f8581s != 0) {
                this.f8579q.setTextAppearance(getContext(), this.f8581s);
            }
            if (this.f8582t != 0) {
                this.f8580r.setTextAppearance(getContext(), this.f8582t);
            }
        }
        this.f8579q.setText(this.f8573j);
        this.f8580r.setText(this.f8574k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f8573j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f8574k);
        this.f8580r.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f8578p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f8578p.getParent() == null) {
            addView(this.f8578p);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ j6.v0 f(int i15, long j15) {
        return super.f(i15, j15);
    }

    public void g() {
        if (this.f8575l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f8574k;
    }

    public CharSequence getTitle() {
        return this.f8573j;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f8575l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f8584w, (ViewGroup) this, false);
            this.f8575l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f8575l);
        }
        View viewFindViewById = this.f8575l.findViewById(p007NuL.r.f386i);
        this.f8576m = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f8733d;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f8733d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f8733d, this.f8731b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f8733d.o(this);
        this.f8732c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8732c, layoutParams);
    }

    public boolean j() {
        return this.f8583v;
    }

    public void k() {
        removeAllViews();
        this.f8577n = null;
        this.f8732c = null;
        this.f8733d = null;
        View view = this.f8576m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f8733d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f8733d;
        if (cVar != null) {
            cVar.B();
            this.f8733d.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        boolean zB = g1.b(this);
        int paddingRight = zB ? (i17 - i15) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i18 - i16) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8575l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8575l.getLayoutParams();
            int i19 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i25 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i19, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f8575l, iD, paddingTop, paddingTop2, zB), i25, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f8578p;
        if (linearLayout != null && this.f8577n == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f8578p, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f8577n;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i17 - i15) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8732c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        if (View.MeasureSpec.getMode(i15) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i16) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i15);
        int size2 = this.f8734e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i16);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, PKIFailureInfo.systemUnavail);
        View view = this.f8575l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8575l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8732c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f8732c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f8578p;
        if (linearLayout != null && this.f8577n == null) {
            if (this.f8583v) {
                this.f8578p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f8578p.getMeasuredWidth();
                boolean z15 = measuredWidth <= paddingLeft;
                if (z15) {
                    paddingLeft -= measuredWidth;
                }
                this.f8578p.setVisibility(z15 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f8577n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = i17 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i17 >= 0) {
                paddingLeft = Math.min(i17, paddingLeft);
            }
            int i19 = layoutParams.height;
            int i25 = i19 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i19 >= 0) {
                iMin = Math.min(i19, iMin);
            }
            this.f8577n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i18), View.MeasureSpec.makeMeasureSpec(iMin, i25));
        }
        if (this.f8734e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i26 = 0;
        for (int i27 = 0; i27 < childCount; i27++) {
            int measuredHeight = getChildAt(i27).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i26) {
                i26 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i26);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i15) {
        this.f8734e = i15;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8577n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8577n = view;
        if (view != null && (linearLayout = this.f8578p) != null) {
            removeView(linearLayout);
            this.f8578p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8574k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8573j = charSequence;
        i();
        j6.l0.j0(this, charSequence);
    }

    public void setTitleOptional(boolean z15) {
        if (z15 != this.f8583v) {
            requestLayout();
        }
        this.f8583v = z15;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i15) {
        super.setVisibility(i15);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f317j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        z0 z0VarV = z0.v(context, attributeSet, p007NuL.v.f552y, i15, 0);
        setBackground(z0VarV.g(p007NuL.v.f556z));
        this.f8581s = z0VarV.n(p007NuL.v.D, 0);
        this.f8582t = z0VarV.n(p007NuL.v.C, 0);
        this.f8734e = z0VarV.m(p007NuL.v.B, 0);
        this.f8584w = z0VarV.n(p007NuL.v.A, p007NuL.s.f407d);
        z0VarV.x();
    }
}
