package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.k0;
import p007NuL.v;
import p011Prn.f2;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f8378h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f8379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f8380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    e.b f8381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k0 f8382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    b f8383n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8388t;

    private class a extends k0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.k0
        public f2 b() {
            b bVar = ActionMenuItemView.this.f8383n;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0
        protected boolean c() {
            f2 f2VarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f8381l;
            return bVar != null && bVar.b(actionMenuItemView.f8378h) && (f2VarB = b()) != null && f2VarB.b();
        }
    }

    public static abstract class b {
        public abstract f2 a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i15 = configuration.screenWidthDp;
        int i16 = configuration.screenHeightDp;
        if (i15 < 480) {
            return (i15 >= 640 && i16 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void u() {
        boolean z15 = true;
        boolean z16 = !TextUtils.isEmpty(this.f8379j);
        if (this.f8380k != null && (!this.f8378h.B() || (!this.f8384p && !this.f8385q))) {
            z15 = false;
        }
        boolean z17 = z16 & z15;
        setText(z17 ? this.f8379j : null);
        CharSequence contentDescription = this.f8378h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z17 ? null : this.f8378h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f8378h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            e1.a(this, z17 ? null : this.f8378h.getTitle());
        } else {
            e1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f8378h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i15) {
        this.f8378h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f8382m == null) {
            this.f8382m = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f8378h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f8381l;
        if (bVar != null) {
            bVar.b(this.f8378h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8384p = t();
        u();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i15, int i16) {
        int i17;
        boolean zS = s();
        if (zS && (i17 = this.f8387s) >= 0) {
            super.setPadding(i17, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i15, i16);
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f8386r) : this.f8386r;
        if (mode != 1073741824 && this.f8386r > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i16);
        }
        if (zS || this.f8380k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8380k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var;
        if (this.f8378h.hasSubMenu() && (k0Var = this.f8382m) != null && k0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z15) {
    }

    public void setChecked(boolean z15) {
    }

    public void setExpandedFormat(boolean z15) {
        if (this.f8385q != z15) {
            this.f8385q = z15;
            g gVar = this.f8378h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8380k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i15 = this.f8388t;
            if (intrinsicWidth > i15) {
                intrinsicHeight = (int) (intrinsicHeight * (i15 / intrinsicWidth));
                intrinsicWidth = i15;
            }
            if (intrinsicHeight > i15) {
                intrinsicWidth = (int) (intrinsicWidth * (i15 / intrinsicHeight));
            } else {
                i15 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i15);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f8381l = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i15, int i16, int i17, int i18) {
        this.f8387s = i15;
        super.setPadding(i15, i16, i17, i18);
    }

    public void setPopupCallback(b bVar) {
        this.f8383n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8379j = charSequence;
        u();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        Resources resources = context.getResources();
        this.f8384p = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f540v, i15, 0);
        this.f8386r = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.f544w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8388t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8387s = -1;
        setSaveEnabled(false);
    }
}
