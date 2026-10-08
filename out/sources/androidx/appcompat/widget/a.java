package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0188a f8730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f8731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f8732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f8733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f8734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected j6.v0 f8735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8737h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0188a implements j6.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8738a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8739b;

        protected C0188a() {
        }

        @Override // j6.w0
        public void a(View view) {
            this.f8738a = true;
        }

        @Override // j6.w0
        public void b(View view) {
            if (this.f8738a) {
                return;
            }
            a aVar = a.this;
            aVar.f8735f = null;
            a.super.setVisibility(this.f8739b);
        }

        @Override // j6.w0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f8738a = false;
        }

        public C0188a d(j6.v0 v0Var, int i15) {
            a.this.f8735f = v0Var;
            this.f8739b = i15;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i15, int i16, boolean z15) {
        return z15 ? i15 - i16 : i15 + i16;
    }

    protected int c(View view, int i15, int i16, int i17) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i15, PKIFailureInfo.systemUnavail), i16);
        return Math.max(0, (i15 - view.getMeasuredWidth()) - i17);
    }

    protected int e(View view, int i15, int i16, int i17, boolean z15) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i18 = i16 + ((i17 - measuredHeight) / 2);
        if (z15) {
            view.layout(i15 - measuredWidth, i18, i15, measuredHeight + i18);
        } else {
            view.layout(i15, i18, i15 + measuredWidth, measuredHeight + i18);
        }
        return z15 ? -measuredWidth : measuredWidth;
    }

    public j6.v0 f(int i15, long j15) {
        j6.v0 v0Var = this.f8735f;
        if (v0Var != null) {
            v0Var.c();
        }
        if (i15 != 0) {
            j6.v0 v0VarB = j6.l0.f(this).b(0.0f);
            v0VarB.e(j15);
            v0VarB.g(this.f8730a.d(v0VarB, i15));
            return v0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        j6.v0 v0VarB2 = j6.l0.f(this).b(1.0f);
        v0VarB2.e(j15);
        v0VarB2.g(this.f8730a.d(v0VarB2, i15));
        return v0VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f8735f != null ? this.f8730a.f8739b : getVisibility();
    }

    public int getContentHeight() {
        return this.f8734e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p007NuL.v.f437a, p007NuL.m.f310c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p007NuL.v.f482j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f8733d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8737h = false;
        }
        if (!this.f8737h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8737h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8737h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8736g = false;
        }
        if (!this.f8736g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8736g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8736g = false;
        }
        return true;
    }

    public void setContentHeight(int i15) {
        this.f8734e = i15;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        if (i15 != getVisibility()) {
            j6.v0 v0Var = this.f8735f;
            if (v0Var != null) {
                v0Var.c();
            }
            super.setVisibility(i15);
        }
    }

    a(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f8730a = new C0188a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p007NuL.m.f308a, typedValue, true) || typedValue.resourceId == 0) {
            this.f8731b = context;
        } else {
            this.f8731b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
