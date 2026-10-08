# Paczka 152 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `k6/p.java (część 1/4)`

## k6/p.java (część 1/4)

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

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f108661e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f108662f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f108663g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f108664h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f108665i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f108666j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f108667k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f108668l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f108669m = new a(256, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f108670n = new a(512, (CharSequence) null, (Class<? extends s.a>) s.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f108671o = new a(1024, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f108672p = new a(2048, (CharSequence) null, (Class<? extends s.a>) s.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f108673q = new a(PKIFailureInfo.certConfirmed, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f108674r = new a(PKIFailureInfo.certRevoked, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f108675s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f108676t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f108677u = new a(PKIFailureInfo.notAuthorized, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f108678v = new a(PKIFailureInfo.unsupportedVersion, (CharSequence) null, (Class<? extends s.a>) s.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f108679w = new a(PKIFailureInfo.transactionIdInUse, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f108680x = new a(PKIFailureInfo.signerNotTrusted, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f108681y = new a(PKIFailureInfo.badCertTemplate, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f108682z = new a(PKIFailureInfo.badSenderNonce, (CharSequence) null, (Class<? extends s.a>) s.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f108683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f108684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends s.a> f108685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final s f108686d;

        static {
            int i15 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i15 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i15 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i15 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i15 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, s.d.class);
            N = new a(i15 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i15 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i15 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i15 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i15 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i15 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i15 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i15 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i15 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i15, CharSequence charSequence) {
            this(null, i15, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s sVar) {
            return new a(null, this.f108684b, charSequence, sVar, this.f108685c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f108683a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f108683a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f108686d == null) {
                return false;
            }
            Class<? extends s.a> cls = this.f108685c;
            s.a aVar = null;
            if (cls != null) {
                try {
                    s.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e15) {
                        e = e15;
                        aVar = aVarNewInstance;
                        Class<? extends s.a> cls2 = this.f108685c;
                        c2.f("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e16) {
                    e = e16;
                }
            }
            return this.f108686d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f108683a;
            if (obj2 == null) {
                return aVar.f108683a == null;
            }
            return obj2.equals(aVar.f108683a);
        }

        public int hashCode() {
            Object obj = this.f108683a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("AccessibilityActionCompat: ");
            String strH = p.h(this.f108684b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb5.append(strH);
            return sb5.toString();
        }

        public a(int i15, CharSequence charSequence, s sVar) {
            this(null, i15, charSequence, sVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i15, CharSequence charSequence, Class<? extends s.a> cls) {
            this(null, i15, charSequence, null, cls);
        }

        a(Object obj, int i15, CharSequence charSequence, s sVar, Class<? extends s.a> cls) {
            this.f108684b = i15;
            this.f108686d = sVar;
            if (obj == null) {
                this.f108683a = new AccessibilityNodeInfo.AccessibilityAction(i15, charSequence);
            } else {
                this.f108683a = obj;
            }
            this.f108685c = cls;
        }
    }

```
