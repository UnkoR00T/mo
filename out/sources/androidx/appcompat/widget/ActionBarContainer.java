package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f8564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f8565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f8566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f8567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f8568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f8569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f8570h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f8571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8572k;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p007NuL.v.f437a);
        this.f8567e = typedArrayObtainStyledAttributes.getDrawable(p007NuL.v.f442b);
        this.f8568f = typedArrayObtainStyledAttributes.getDrawable(p007NuL.v.f452d);
        this.f8572k = typedArrayObtainStyledAttributes.getDimensionPixelSize(p007NuL.v.f482j, -1);
        boolean z15 = true;
        if (getId() == p007NuL.r.f402y) {
            this.f8570h = true;
            this.f8569g = typedArrayObtainStyledAttributes.getDrawable(p007NuL.v.f447c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f8570h ? this.f8567e != null || this.f8568f != null : this.f8569g != null) {
            z15 = false;
        }
        setWillNotDraw(z15);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8567e;
        if (drawable != null && drawable.isStateful()) {
            this.f8567e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8568f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8568f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8569g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8569g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f8564b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8567e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8568f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8569g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8565c = findViewById(p007NuL.r.f378a);
        this.f8566d = findViewById(p007NuL.r.f383f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8563a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        Drawable drawable;
        super.onLayout(z15, i15, i16, i17, i18);
        View view = this.f8564b;
        boolean z16 = true;
        boolean z17 = false;
        boolean z18 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i19 = layoutParams.bottomMargin;
            view.layout(i15, measuredHeight2 - i19, i17, measuredHeight - i19);
        }
        if (this.f8570h) {
            Drawable drawable2 = this.f8569g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z16 = z17;
            }
        } else {
            if (this.f8567e != null) {
                if (this.f8565c.getVisibility() == 0) {
                    this.f8567e.setBounds(this.f8565c.getLeft(), this.f8565c.getTop(), this.f8565c.getRight(), this.f8565c.getBottom());
                } else {
                    View view2 = this.f8566d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f8567e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f8567e.setBounds(this.f8566d.getLeft(), this.f8566d.getTop(), this.f8566d.getRight(), this.f8566d.getBottom());
                    }
                }
                z17 = true;
            }
            this.f8571j = z18;
            if (!z18 || (drawable = this.f8568f) == null) {
                z16 = z17;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z16) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i15, int i16) {
        int iA;
        int i17;
        if (this.f8565c == null && View.MeasureSpec.getMode(i16) == Integer.MIN_VALUE && (i17 = this.f8572k) >= 0) {
            i16 = View.MeasureSpec.makeMeasureSpec(Math.min(i17, View.MeasureSpec.getSize(i16)), PKIFailureInfo.systemUnavail);
        }
        super.onMeasure(i15, i16);
        if (this.f8565c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i16);
        View view = this.f8564b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f8565c)) {
            iA = !b(this.f8566d) ? a(this.f8566d) : 0;
        } else {
            iA = a(this.f8565c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f8564b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i16) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8567e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8567e);
        }
        this.f8567e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8565c;
            if (view != null) {
                this.f8567e.setBounds(view.getLeft(), this.f8565c.getTop(), this.f8565c.getRight(), this.f8565c.getBottom());
            }
        }
        boolean z15 = false;
        if (!this.f8570h ? !(this.f8567e != null || this.f8568f != null) : this.f8569g == null) {
            z15 = true;
        }
        setWillNotDraw(z15);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8569g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8569g);
        }
        this.f8569g = drawable;
        boolean z15 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8570h && (drawable2 = this.f8569g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f8570h ? !(this.f8567e != null || this.f8568f != null) : this.f8569g == null) {
            z15 = true;
        }
        setWillNotDraw(z15);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8568f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8568f);
        }
        this.f8568f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8571j && (drawable2 = this.f8568f) != null) {
                drawable2.setBounds(this.f8564b.getLeft(), this.f8564b.getTop(), this.f8564b.getRight(), this.f8564b.getBottom());
            }
        }
        boolean z15 = false;
        if (!this.f8570h ? !(this.f8567e != null || this.f8568f != null) : this.f8569g == null) {
            z15 = true;
        }
        setWillNotDraw(z15);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(s0 s0Var) {
        View view = this.f8564b;
        if (view != null) {
            removeView(view);
        }
        this.f8564b = s0Var;
        if (s0Var != null) {
            addView(s0Var);
            ViewGroup.LayoutParams layoutParams = s0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            s0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z15) {
        this.f8563a = z15;
        setDescendantFocusability(z15 ? 393216 : PKIFailureInfo.transactionIdInUse);
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        super.setVisibility(i15);
        boolean z15 = i15 == 0;
        Drawable drawable = this.f8567e;
        if (drawable != null) {
            drawable.setVisible(z15, false);
        }
        Drawable drawable2 = this.f8568f;
        if (drawable2 != null) {
            drawable2.setVisible(z15, false);
        }
        Drawable drawable3 = this.f8569g;
        if (drawable3 != null) {
            drawable3.setVisible(z15, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f8567e && !this.f8570h) {
            return true;
        }
        if (drawable == this.f8568f && this.f8571j) {
            return true;
        }
        return (drawable == this.f8569g && this.f8570h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i15) {
        if (i15 != 0) {
            return super.startActionModeForChild(view, callback, i15);
        }
        return null;
    }
}
