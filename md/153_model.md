# Paczka 153 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `k6/p.java (część 2/4)`

## k6/p.java (część 2/4)

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

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z15) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z15);
        }
    }

    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f108687a;

        f(Object obj) {
            this.f108687a = obj;
        }

        public static f a(int i15, int i16, boolean z15, int i17) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i15, i16, z15, i17));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f108688a;

        g(Object obj) {
            this.f108688a = obj;
        }

        public static g a(int i15, int i16, int i17, int i18, boolean z15, boolean z16) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i15, i16, i17, i18, z15, z16));
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f108689a;

        h(Object obj) {
            this.f108689a = obj;
        }

        public static h a(int i15, float f15, float f16, float f17) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i15, f15, f16, f17));
        }
    }

    private p(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f108658a = accessibilityNodeInfo;
    }

    private boolean H() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static p a0() {
        return f1(AccessibilityNodeInfo.obtain());
    }

    public static p b0(View view) {
        return f1(AccessibilityNodeInfo.obtain(view));
    }

    public static p c0(p pVar) {
        return f1(AccessibilityNodeInfo.obtain(pVar.f108658a));
    }

    private List<Integer> f(String str) {
        ArrayList<Integer> integerArrayList = this.f108658a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f108658a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static p f1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p(accessibilityNodeInfo);
    }

    static String h(int i15) {
        if (i15 == 1) {
            return "ACTION_FOCUS";
        }
        if (i15 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i15) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case PKIFailureInfo.certConfirmed /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case PKIFailureInfo.certRevoked /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case PKIFailureInfo.notAuthorized /* 65536 */:
                return "ACTION_CUT";
            case PKIFailureInfo.unsupportedVersion /* 131072 */:
                return "ACTION_SET_SELECTION";
            case PKIFailureInfo.transactionIdInUse /* 262144 */:
                return "ACTION_EXPAND";
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return "ACTION_COLLAPSE";
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i15) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i15) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i15) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean j(int i15) {
        Bundle bundleX = x();
        return bundleX != null && (bundleX.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i15) == i15;
    }

    private void j0(int i15, boolean z15) {
        Bundle bundleX = x();
        if (bundleX != null) {
            int i16 = bundleX.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i15);
            if (!z15) {
                i15 = 0;
            }
            bundleX.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i15 | i16);
        }
    }

    private String o() {
        int iN = n();
        if (iN == 1) {
            return "TRUE";
        }
        return iN == 2 ? "PARTIAL" : "FALSE";
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String w(int i15) {
        if (i15 == 0) {
            return "UNDEFINED";
        }
        if (i15 == 1) {
            return "COLLAPSED";
        }
        if (i15 != 2) {
            return i15 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    public CharSequence A() {
        return this.f108658a.getPackageName();
    }

    public void A0(boolean z15) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f108658a.setHeading(z15);
        } else {
            j0(2, z15);
        }
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f108658a) : this.f108658a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

```
