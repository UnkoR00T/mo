package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.z0;
import p007NuL.r;
import p007NuL.s;
import p007NuL.v;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f8393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f8394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f8395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f8396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f8397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f8398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f8399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f8400h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f8401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f8402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f8404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8405n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f8406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LayoutInflater f8408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8409s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.F);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i15) {
        LinearLayout linearLayout = this.f8401j;
        if (linearLayout != null) {
            linearLayout.addView(view, i15);
        } else {
            addView(view, i15);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(s.f411h, (ViewGroup) this, false);
        this.f8397e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(s.f412i, (ViewGroup) this, false);
        this.f8394b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(s.f414k, (ViewGroup) this, false);
        this.f8395c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f8408r == null) {
            this.f8408r = LayoutInflater.from(getContext());
        }
        return this.f8408r;
    }

    private void setSubMenuArrowVisible(boolean z15) {
        ImageView imageView = this.f8399g;
        if (imageView != null) {
            imageView.setVisibility(z15 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8400h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8400h.getLayoutParams();
        rect.top += this.f8400h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i15) {
        this.f8393a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f8393a;
    }

    public void h(boolean z15, char c15) {
        int i15 = (z15 && this.f8393a.A()) ? 0 : 8;
        if (i15 == 0) {
            this.f8398f.setText(this.f8393a.h());
        }
        if (this.f8398f.getVisibility() != i15) {
            this.f8398f.setVisibility(i15);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f8402k);
        TextView textView = (TextView) findViewById(r.C);
        this.f8396d = textView;
        int i15 = this.f8403l;
        if (i15 != -1) {
            textView.setTextAppearance(this.f8404m, i15);
        }
        this.f8398f = (TextView) findViewById(r.f400w);
        ImageView imageView = (ImageView) findViewById(r.f403z);
        this.f8399g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8406p);
        }
        this.f8400h = (ImageView) findViewById(r.f395r);
        this.f8401j = (LinearLayout) findViewById(r.f389l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        if (this.f8394b != null && this.f8405n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8394b.getLayoutParams();
            int i17 = layoutParams.height;
            if (i17 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i17;
            }
        }
        super.onMeasure(i15, i16);
    }

    public void setCheckable(boolean z15) {
        CompoundButton compoundButton;
        View view;
        if (!z15 && this.f8395c == null && this.f8397e == null) {
            return;
        }
        if (this.f8393a.m()) {
            if (this.f8395c == null) {
                g();
            }
            compoundButton = this.f8395c;
            view = this.f8397e;
        } else {
            if (this.f8397e == null) {
                e();
            }
            compoundButton = this.f8397e;
            view = this.f8395c;
        }
        if (z15) {
            compoundButton.setChecked(this.f8393a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f8397e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f8395c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z15) {
        CompoundButton compoundButton;
        if (this.f8393a.m()) {
            if (this.f8395c == null) {
                g();
            }
            compoundButton = this.f8395c;
        } else {
            if (this.f8397e == null) {
                e();
            }
            compoundButton = this.f8397e;
        }
        compoundButton.setChecked(z15);
    }

    public void setForceShowIcon(boolean z15) {
        this.f8409s = z15;
        this.f8405n = z15;
    }

    public void setGroupDividerEnabled(boolean z15) {
        ImageView imageView = this.f8400h;
        if (imageView != null) {
            imageView.setVisibility((this.f8407q || !z15) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z15 = this.f8393a.z() || this.f8409s;
        if (z15 || this.f8405n) {
            ImageView imageView = this.f8394b;
            if (imageView == null && drawable == null && !this.f8405n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f8405n) {
                this.f8394b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f8394b;
            if (!z15) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f8394b.getVisibility() != 0) {
                this.f8394b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f8396d.getVisibility() != 8) {
                this.f8396d.setVisibility(8);
            }
        } else {
            this.f8396d.setText(charSequence);
            if (this.f8396d.getVisibility() != 0) {
                this.f8396d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet);
        z0 z0VarV = z0.v(getContext(), attributeSet, v.T1, i15, 0);
        this.f8402k = z0VarV.g(v.V1);
        this.f8403l = z0VarV.n(v.U1, -1);
        this.f8405n = z0VarV.a(v.W1, false);
        this.f8404m = context;
        this.f8406p = z0VarV.g(v.X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p007NuL.m.C, 0);
        this.f8407q = typedArrayObtainStyledAttributes.hasValue(0);
        z0VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
