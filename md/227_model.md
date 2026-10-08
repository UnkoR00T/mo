# Paczka 227 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `xi/a.java (część 1/2)`

## xi/a.java (część 1/2)

```java
package xi;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p007NuL.m;
import p082nUL.y;
import ri.e;
import ri.f;
import ri.j;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class a extends g {
    private static final int B = k.f174087u;
    private static final int[] C = {ri.b.Q};
    private static final int[] D;
    private static final int[][] E;

    @SuppressLint({"DiscouragedApi"})
    private static final int F;
    private final androidx.vectordrawable.graphics.drawable.b A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<c> f218931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashSet<b> f218932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f218933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f218934h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f218935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f218936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f218937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f218938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f218939n;

    /* JADX INFO: renamed from: p, reason: collision with root package na
    public interface b {
        void a(a aVar, int i15);
    }

    public interface c {
        void a(a aVar, boolean z15);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C5850a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f218951a;

        /* JADX INFO: renamed from: xi.a$d$a, reason: collision with other inner class name */
        class C5850a implements Parcelable.Creator<d> {
            C5850a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i15) {
                return new d[i15];
            }
        }

        /* synthetic */ d(Parcel parcel, C5849a c5849a) {
            this(parcel);
        }

        private String a() {
            int i15 = this.f218951a;
            if (i15 != 1) {
                return i15 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeValue(Integer.valueOf(this.f218951a));
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f218951a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i15 = ri.b.P;
        D = new int[]{i15};
        E = new int[][]{new int[]{R.attr.state_enabled, i15}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        F = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f325r);
    }

    private boolean c(z0 z0Var) {
        return z0Var.n(l.V2, 0) == F && z0Var.n(l.W2, 0) == 0;
    }

    private void e() {
        this.f218938m = com.google.android.material.drawable.c.c(this.f218938m, this.f218941q, androidx.core.widget.c.c(this));
        this.f218939n = com.google.android.material.drawable.c.c(this.f218939n, this.f218942r, this.f218943s);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.c.a(this.f218938m, this.f218939n));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f218947x != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f218940p) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f218949z;
            if (cVar2 != null) {
                cVar2.f(this.A);
                this.f218949z.b(this.A);
            }
            Drawable drawable = this.f218938m;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f218949z) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(f.f173992b, f.S, cVar, false);
            ((AnimatedStateListDrawable) this.f218938m).addTransition(f.f173998h, f.S, this.f218949z, false);
        }
    }

    private String getButtonStateDescription() {
        int i15 = this.f218944t;
        if (i15 == 1) {
            return getResources().getString(j.f174051k);
        }
        return i15 == 0 ? getResources().getString(j.f174053m) : getResources().getString(j.f174052l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f218933g == null) {
            int[][] iArr = E;
            int[] iArr2 = new int[iArr.length];
            int iD = bj.a.d(this, m.f329v);
            int iD2 = bj.a.d(this, m.f332y);
            int iD3 = bj.a.d(this, ri.b.f173912g);
            int iD4 = bj.a.d(this, ri.b.f173909d);
            iArr2[0] = bj.a.j(iD3, iD2, 1.0f);
            iArr2[1] = bj.a.j(iD3, iD, 1.0f);
            iArr2[2] = bj.a.j(iD3, iD4, 0.54f);
            iArr2[3] = bj.a.j(iD3, iD4, 0.38f);
            iArr2[4] = bj.a.j(iD3, iD4, 0.38f);
            this.f218933g = new ColorStateList(iArr, iArr2);
        }
        return this.f218933g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f218941q;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f218938m;
        if (drawable != null && (colorStateList2 = this.f218941q) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f218939n;
        if (drawable2 == null || (colorStateList = this.f218942r) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public boolean d() {
        return this.f218936k;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f218938m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f218939n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f218942r;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f218943s;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f218941q;
    }

    public int getCheckedState() {
        return this.f218944t;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f218937l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f218944t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f218934h && this.f218941q == null && this.f218942r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        this.f218945v = com.google.android.material.drawable.c.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f218935j || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (q.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f218937l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f218951a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f218951a = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
```
