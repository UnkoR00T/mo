# Paczka 154 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `k6/p.java (część 3/4)`

## k6/p.java (część 3/4)

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

    public void B0(CharSequence charSequence) {
        this.f108658a.setHintText(charSequence);
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f108658a) : this.f108658a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void C0(boolean z15) {
        this.f108658a.setImportantForAccessibility(z15);
    }

    public CharSequence D() {
        if (!H()) {
            return this.f108658a.getText();
        }
        List<Integer> listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f108658a.getText(), 0, this.f108658a.getText().length()));
        for (int i15 = 0; i15 < listF.size(); i15++) {
            spannableString.setSpan(new k6.a(listF4.get(i15).intValue(), this, x().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listF.get(i15).intValue(), listF2.get(i15).intValue(), listF3.get(i15).intValue());
        }
        return spannableString;
    }

    public void D0(View view) {
        this.f108658a.setLabelFor(view);
    }

    public CharSequence E() {
        return Build.VERSION.SDK_INT >= 28 ? this.f108658a.getTooltipText() : this.f108658a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void E0(int i15) {
        this.f108658a.setLiveRegion(i15);
    }

    public String F() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f108658a) : this.f108658a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void F0(boolean z15) {
        this.f108658a.setLongClickable(z15);
    }

    public String G() {
        return this.f108658a.getViewIdResourceName();
    }

    public void G0(int i15) {
        this.f108658a.setMaxTextLength(i15);
    }

    public void H0(int i15) {
        this.f108658a.setMovementGranularities(i15);
    }

    public boolean I() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f108658a) : j(64);
    }

    public void I0(CharSequence charSequence) {
        this.f108658a.setPackageName(charSequence);
    }

    public boolean J() {
        return this.f108658a.isCheckable();
    }

    public void J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f108658a.setPaneTitle(charSequence);
        } else {
            this.f108658a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    public boolean K() {
        return this.f108658a.isChecked();
    }

    public void K0(View view) {
        this.f108659b = -1;
        this.f108658a.setParent(view);
    }

    public boolean L() {
        return this.f108658a.isClickable();
    }

    public void L0(View view, int i15) {
        this.f108659b = i15;
        this.f108658a.setParent(view, i15);
    }

    public boolean M() {
        return this.f108658a.isContextClickable();
    }

    public void M0(boolean z15) {
        this.f108658a.setPassword(z15);
    }

    public boolean N() {
        return this.f108658a.isEnabled();
    }

    public void N0(h hVar) {
        this.f108658a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f108689a);
    }

    public boolean O() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f108658a) : this.f108658a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void O0(CharSequence charSequence) {
        this.f108658a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean P() {
        return this.f108658a.isFocusable();
    }

    public void P0(boolean z15) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f108658a.setScreenReaderFocusable(z15);
        } else {
            j0(1, z15);
        }
    }

    public boolean Q() {
        return this.f108658a.isFocused();
    }

    public void Q0(boolean z15) {
        this.f108658a.setScrollable(z15);
    }

    public boolean R() {
        return j(67108864);
    }

    public void R0(boolean z15) {
        this.f108658a.setSelected(z15);
    }

    public boolean S() {
        return this.f108658a.isImportantForAccessibility();
    }

    public void S0(boolean z15) {
        this.f108658a.setShowingHintText(z15);
    }

    public boolean T() {
        return this.f108658a.isLongClickable();
    }

    public void T0(View view, int i15) {
        this.f108660c = i15;
        this.f108658a.setSource(view, i15);
    }

    public boolean U() {
        return this.f108658a.isPassword();
    }

    public void U0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f108658a, charSequence);
        } else {
            this.f108658a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean V() {
        return this.f108658a.isScrollable();
    }

    public void V0(CharSequence charSequence) {
        this.f108658a.setText(charSequence);
    }

    public boolean W() {
        return this.f108658a.isSelected();
    }

    public void W0(boolean z15) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f108658a.setTextEntryKey(z15);
        } else {
            j0(8, z15);
        }
    }

    public boolean X() {
        return this.f108658a.isShowingHintText();
    }

    public void X0(int i15, int i16) {
        this.f108658a.setTextSelection(i15, i16);
    }

    public boolean Y() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f108658a) : j(8388608);
    }

    public void Y0(View view) {
        this.f108658a.setTraversalAfter(view);
    }

    public boolean Z() {
        return this.f108658a.isVisibleToUser();
    }

    public void Z0(View view, int i15) {
        this.f108658a.setTraversalAfter(view, i15);
    }

    public void a(int i15) {
        this.f108658a.addAction(i15);
    }

    public void a1(View view) {
        this.f108658a.setTraversalBefore(view);
    }

    public void b(a aVar) {
        this.f108658a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f108683a);
    }

    public void b1(View view, int i15) {
        this.f108658a.setTraversalBefore(view, i15);
    }

    public void c(View view) {
        this.f108658a.addChild(view);
    }

    public void c1(String str) {
        this.f108658a.setViewIdResourceName(str);
    }

    public void d(View view, int i15) {
        this.f108658a.addChild(view, i15);
    }

    public boolean d0(int i15, Bundle bundle) {
        return this.f108658a.performAction(i15, bundle);
    }

    public void d1(boolean z15) {
        this.f108658a.setVisibleToUser(z15);
    }

    public void e(CharSequence charSequence, View view) {
    }

    @Deprecated
    public void e0() {
    }

    public AccessibilityNodeInfo e1() {
        return this.f108658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f108658a;
        if (accessibilityNodeInfo == null) {
            if (pVar.f108658a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pVar.f108658a)) {
            return false;
        }
        return this.f108660c == pVar.f108660c && this.f108659b == pVar.f108659b;
    }

    public boolean f0(a aVar) {
        return this.f108658a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f108683a);
    }

    public List<a> g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f108658a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new a(actionList.get(i15)));
        }
        return arrayList;
    }

    public void g0(boolean z15) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.e(this.f108658a, z15);
        } else {
            j0(64, z15);
        }
    }

    public void h0(boolean z15) {
        this.f108658a.setAccessibilityFocused(z15);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f108658a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f108658a.getActions();
    }

    public void i0(List<String> list) {
        this.f108658a.setAvailableExtraData(list);
    }

    @Deprecated
    public void k(Rect rect) {
        this.f108658a.getBoundsInParent(rect);
    }

    @Deprecated
    public void k0(Rect rect) {
        this.f108658a.setBoundsInParent(rect);
    }

    public void l(Rect rect) {
        this.f108658a.getBoundsInScreen(rect);
    }

    public void l0(Rect rect) {
        this.f108658a.setBoundsInScreen(rect);
    }

    public void m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f108658a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f108658a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void m0(boolean z15) {
        this.f108658a.setCheckable(z15);
    }

    public int n() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f108658a) : this.f108658a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f108658a.isChecked() ? 1 : 0);
    }

    @Deprecated
    public void n0(boolean z15) {
        this.f108658a.setChecked(z15);
    }

    public void o0(CharSequence charSequence) {
        this.f108658a.setClassName(charSequence);
    }

    public int p() {
        return this.f108658a.getChildCount();
    }

    public void p0(boolean z15) {
        this.f108658a.setClickable(z15);
    }

    public CharSequence q() {
        return this.f108658a.getClassName();
    }

    public void q0(Object obj) {
        this.f108658a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f108687a);
    }

    public void r0(Object obj) {
        this.f108658a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f108688a);
    }

```
