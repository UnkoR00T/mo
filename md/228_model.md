# Paczka 228 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `xi/a.java (część 2/2)`

## xi/a.java (część 2/2)

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
    public void setButtonDrawable(int i15) {
        setButtonDrawable(y.b(getContext(), i15));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f218939n = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i15) {
        setButtonIconDrawable(y.b(getContext(), i15));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f218942r == colorStateList) {
            return;
        }
        this.f218942r = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f218943s == mode) {
            return;
        }
        this.f218943s = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f218941q == colorStateList) {
            return;
        }
        this.f218941q = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z15) {
        this.f218935j = z15;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z15) {
        setCheckedState(z15 ? 1 : 0);
    }

    public void setCheckedState(int i15) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f218944t != i15) {
            this.f218944t = i15;
            super.setChecked(i15 == 1);
            refreshDrawableState();
            f();
            if (this.f218946w) {
                return;
            }
            this.f218946w = true;
            LinkedHashSet<b> linkedHashSet = this.f218932f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f218944t);
                }
            }
            if (this.f218944t != 2 && (onCheckedChangeListener = this.f218948y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f218946w = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f218937l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i15) {
        setErrorAccessibilityLabel(i15 != 0 ? getResources().getText(i15) : null);
    }

    public void setErrorShown(boolean z15) {
        if (this.f218936k == z15) {
            return;
        }
        this.f218936k = z15;
        refreshDrawableState();
        Iterator<c> it = this.f218931e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f218936k);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f218948y = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f218947x = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z15) {
        this.f218934h = z15;
        if (z15) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i15) {
        int i16 = B;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f218931e = new LinkedHashSet<>();
        this.f218932f = new LinkedHashSet<>();
        this.f218949z = androidx.vectordrawable.graphics.drawable.c.a(getContext(), e.f173986g);
        this.A = new C5849a();
        Context context2 = getContext();
        this.f218938m = androidx.core.widget.c.a(this);
        this.f218941q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        z0 z0VarJ = n.j(context2, attributeSet, l.U2, i15, i16, new int[0]);
        this.f218939n = z0VarJ.g(l.X2);
        if (this.f218938m != null && n.g(context2) && c(z0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f218938m = y.b(context2, e.f173985f);
            this.f218940p = true;
            if (this.f218939n == null) {
                this.f218939n = y.b(context2, e.f173987h);
            }
        }
        this.f218942r = ij.c.b(context2, z0VarJ, l.Y2);
        this.f218943s = q.h(z0VarJ.k(l.Z2, -1), PorterDuff.Mode.SRC_IN);
        this.f218934h = z0VarJ.a(l.f174129e3, false);
        this.f218935j = z0VarJ.a(l.f174097a3, true);
        this.f218936k = z0VarJ.a(l.f174121d3, false);
        this.f218937l = z0VarJ.p(l.f174113c3);
        if (z0VarJ.s(l.f174105b3)) {
            setCheckedState(z0VarJ.k(l.f174105b3, 0));
        }
        z0VarJ.x();
        e();
    }

    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f218938m = drawable;
        this.f218940p = false;
        e();
    }
}
```
