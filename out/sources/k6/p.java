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
