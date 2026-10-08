# Paczka 155 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `k6/p.java (część 4/4)`

## k6/p.java (część 4/4)

```java
package k6;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f108658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108659b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f108660c = -1;

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f108658a) : this.f108658a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(CharSequence charSequence) {
        this.f108658a.setContentDescription(charSequence);
    }

    public CharSequence t() {
        return this.f108658a.getContentDescription();
    }

    public void t0(boolean z15) {
        this.f108658a.setContentInvalid(z15);
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        Rect rect = new Rect();
        k(rect);
        sb5.append("; boundsInParent: " + rect);
        l(rect);
        sb5.append("; boundsInScreen: " + rect);
        m(rect);
        sb5.append("; boundsInWindow: " + rect);
        sb5.append("; packageName: ");
        sb5.append(A());
        sb5.append("; className: ");
        sb5.append(q());
        sb5.append("; text: ");
        sb5.append(D());
        sb5.append("; error: ");
        sb5.append(u());
        sb5.append("; maxTextLength: ");
        sb5.append(y());
        sb5.append("; stateDescription: ");
        sb5.append(B());
        sb5.append("; contentDescription: ");
        sb5.append(t());
        sb5.append("; supplementalDescription: ");
        sb5.append(C());
        sb5.append("; tooltipText: ");
        sb5.append(E());
        sb5.append("; viewIdResName: ");
        sb5.append(G());
        sb5.append("; uniqueId: ");
        sb5.append(F());
        sb5.append("; checkable: ");
        sb5.append(J());
        sb5.append("; checked: ");
        sb5.append(o());
        sb5.append("; fieldRequired: ");
        sb5.append(O());
        sb5.append("; focusable: ");
        sb5.append(P());
        sb5.append("; focused: ");
        sb5.append(Q());
        sb5.append("; selected: ");
        sb5.append(W());
        sb5.append("; clickable: ");
        sb5.append(L());
        sb5.append("; longClickable: ");
        sb5.append(T());
        sb5.append("; contextClickable: ");
        sb5.append(M());
        sb5.append("; expandedState: ");
        sb5.append(w(v()));
        sb5.append("; enabled: ");
        sb5.append(N());
        sb5.append("; password: ");
        sb5.append(U());
        sb5.append("; scrollable: " + V());
        sb5.append("; containerTitle: ");
        sb5.append(s());
        sb5.append("; granularScrollingSupported: ");
        sb5.append(R());
        sb5.append("; importantForAccessibility: ");
        sb5.append(S());
        sb5.append("; visible: ");
        sb5.append(Z());
        sb5.append("; isTextSelectable: ");
        sb5.append(Y());
        sb5.append("; accessibilityDataSensitive: ");
        sb5.append(I());
        sb5.append("; [");
        List<a> listG = g();
        for (int i15 = 0; i15 < listG.size(); i15++) {
            a aVar = listG.get(i15);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb5.append(strH);
            if (i15 != listG.size() - 1) {
                sb5.append(", ");
            }
        }
        sb5.append("]");
        return sb5.toString();
    }

    public CharSequence u() {
        return this.f108658a.getError();
    }

    public void u0(int i15) {
        this.f108658a.setDrawingOrder(i15);
    }

    public int v() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f108658a) : this.f108658a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void v0(boolean z15) {
        this.f108658a.setEditable(z15);
    }

    public void w0(boolean z15) {
        this.f108658a.setEnabled(z15);
    }

    public Bundle x() {
        return this.f108658a.getExtras();
    }

    public void x0(CharSequence charSequence) {
        this.f108658a.setError(charSequence);
    }

    public int y() {
        return this.f108658a.getMaxTextLength();
    }

    public void y0(boolean z15) {
        this.f108658a.setFocusable(z15);
    }

    public int z() {
        return this.f108658a.getMovementGranularities();
    }

    public void z0(boolean z15) {
        this.f108658a.setFocused(z15);
    }
}
```
