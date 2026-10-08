package j6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.sentry.android.core.c2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, v0> f99704a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f99705b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f99706c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f99707d = {r5.e.f171805b, r5.e.f171806c, r5.e.f171817n, r5.e.f171828y, r5.e.B, r5.e.C, r5.e.D, r5.e.E, r5.e.F, r5.e.G, r5.e.f171807d, r5.e.f171808e, r5.e.f171809f, r5.e.f171810g, r5.e.f171811h, r5.e.f171812i, r5.e.f171813j, r5.e.f171814k, r5.e.f171815l, r5.e.f171816m, r5.e.f171818o, r5.e.f171819p, r5.e.f171820q, r5.e.f171821r, r5.e.f171822s, r5.e.f171823t, r5.e.f171824u, r5.e.f171825v, r5.e.f171826w, r5.e.f171827x, r5.e.f171829z, r5.e.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a0 f99708e = new a0() { // from class: j6.k0
        @Override // j6.a0
        public final d a(d dVar) {
            return l0.a(dVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f99709f = new e();

    class a extends f<Boolean> {
        a(int i15, Class cls, int i16) {
            super(i15, cls, i16);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i15, Class cls, int i16, int i17) {
            super(i15, cls, i16, i17);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i15, Class cls, int i16, int i17) {
            super(i15, cls, i16, i17);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i15, Class cls, int i16) {
            super(i15, cls, i16);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // j6.l0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f99710a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z15 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z15) {
                l0.P(key, z15 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z15));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f99710a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f99710a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f99710a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f99711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f99712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f99713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f99714d;

        f(int i15, Class<T> cls, int i16) {
            this(i15, cls, 0, i16);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f99713c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t15);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t15 = (T) view.getTag(this.f99711a);
            if (this.f99712b.isInstance(t15)) {
                return t15;
            }
            return null;
        }

        void f(View view, T t15) {
            if (b()) {
                d(view, t15);
            } else if (g(e(view), t15)) {
                l0.k(view);
                view.setTag(this.f99711a, t15);
                l0.P(view, this.f99714d);
            }
        }

        abstract boolean g(T t15, T t16);

        f(int i15, Class<T> cls, int i16, int i17) {
            this.f99711a = i15;
            this.f99712b = cls;
            this.f99714d = i16;
            this.f99713c = i17;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return q0.f99736b ? q0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            f1 f99715a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f99716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f99717c;

            a(View view, y yVar) {
                this.f99716b = view;
                this.f99717c = yVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                f1 f1VarZ = f1.z(windowInsets, view);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 < 30) {
                    h.a(windowInsets, this.f99716b);
                    if (f1VarZ.equals(this.f99715a)) {
                        return this.f99717c.b(view, f1VarZ).x();
                    }
                }
                this.f99715a = f1VarZ;
                f1 f1VarB = this.f99717c.b(view, f1VarZ);
                if (i15 >= 30) {
                    return f1VarB.x();
                }
                l0.e0(view);
                return f1VarB.x();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(r5.e.U);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static f1 b(View view, f1 f1Var, Rect rect) {
            WindowInsets windowInsetsX = f1Var.x();
            if (windowInsetsX != null) {
                return f1.z(view.computeSystemWindowInsets(windowInsetsX, rect), view);
            }
            rect.setEmpty();
            return f1Var;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static String e(View view) {
            return view.getTransitionName();
        }

        static float f(View view) {
            return view.getTranslationZ();
        }

        static float g(View view) {
            return view.getZ();
        }

        static void h(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void i(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void j(View view, float f15) {
            view.setElevation(f15);
        }

        static void k(View view, y yVar) {
            a aVar = yVar != null ? new a(view, yVar) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(r5.e.M, aVar);
            }
            if (view.getTag(r5.e.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(r5.e.U));
            }
        }

        static void l(View view, String str) {
            view.setTransitionName(str);
        }

        static void m(View view, float f15) {
            view.setTranslationZ(f15);
        }

        static void n(View view, float f15) {
            view.setZ(f15);
        }

        static void o(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static f1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            f1 f1VarY = f1.y(rootWindowInsets);
            f1VarY.u(f1VarY);
            f1VarY.d(view.getRootView());
            return f1VarY;
        }

        static void b(View view, int i15, int i16) {
            view.setScrollIndicators(i15, i16);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i15) {
            view.setImportantForAutofill(i15);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z15) {
            view.setAccessibilityHeading(z15);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z15) {
            view.setScreenReaderFocusable(z15);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i15, int i16) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i15, i16);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static i1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return i1.d(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static j6.d b(View view, j6.d dVar) {
            ContentInfo contentInfoF = dVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? dVar : j6.d.g(contentInfoPerformReceiveContent);
        }
    }

    public interface p {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f99718d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f99719a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f99720b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f99721c = null;

        q() {
        }

        static q a(View view) {
            q qVar = (q) view.getTag(r5.e.S);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(r5.e.S, qVar2);
            return qVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f99719a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f99720b == null) {
                this.f99720b = new SparseArray<>();
            }
            return this.f99720b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(r5.e.T);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f99719a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f99718d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f99719a == null) {
                        this.f99719a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f99718d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f99719a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f99719a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f99721c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f99721c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumWidth();
    }

    public static String[] B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(r5.e.O);
    }

    public static f1 C(View view) {
        return i.a(view);
    }

    public static CharSequence D(View view) {
        return y0().e(view);
    }

    public static String E(View view) {
        return h.e(view);
    }

    public static float F(View view) {
        return h.f(view);
    }

    @Deprecated
    public static i1 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return z0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int H(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static boolean J(View view) {
        return m(view) != null;
    }

    @Deprecated
    public static boolean K(View view) {
        return view.hasTransientState();
    }

    public static boolean L(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean M(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean N(View view) {
        return view.isLaidOut();
    }

    public static boolean O(View view) {
        Boolean boolE = g0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    static void P(View view, int i15) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z15 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z15) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z15 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i15);
                if (z15) {
                    accessibilityEventObtain.getText().add(o(view));
                    o0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i15 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i15);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i15);
                } catch (AbstractMethodError e15) {
                    c2.f("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e15);
                }
            }
        }
    }

    public static void Q(View view, int i15) {
        view.offsetLeftAndRight(i15);
    }

    public static void R(View view, int i15) {
        view.offsetTopAndBottom(i15);
    }

    public static f1 S(View view, f1 f1Var) {
        WindowInsets windowInsetsX = f1Var.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsX);
            if (!windowInsetsB.equals(windowInsetsX)) {
                return f1.z(windowInsetsB, view);
            }
        }
        return f1Var;
    }

    @Deprecated
    public static void T(View view, k6.p pVar) {
        view.onInitializeAccessibilityNodeInfo(pVar.e1());
    }

    private static f<CharSequence> U() {
        return new b(r5.e.K, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static boolean V(View view, int i15, Bundle bundle) {
        return view.performAccessibilityAction(i15, bundle);
    }

    public static boolean W(View view, int i15) {
        int iA = j6.l.a(i15);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    public static j6.d X(View view, j6.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(dVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        z zVar = (z) view.getTag(r5.e.N);
        if (zVar == null) {
            return u(view).a(dVar);
        }
        j6.d dVarA = zVar.a(view, dVar);
        if (dVarA == null) {
            return null;
        }
        return u(view).a(dVarA);
    }

    @Deprecated
    public static void Y(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void Z(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static /* synthetic */ j6.d a(j6.d dVar) {
        return dVar;
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void a0(View view, Runnable runnable, long j15) {
        view.postOnAnimationDelayed(runnable, j15);
    }

    private static f<Boolean> b() {
        return new d(r5.e.J, Boolean.class, 28);
    }

    public static void b0(View view, int i15) {
        c0(i15, view);
        P(view, 0);
    }

    public static int c(View view, CharSequence charSequence, k6.s sVar) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new k6.p.a(iQ, charSequence, sVar));
        }
        return iQ;
    }

    private static void c0(int i15, View view) {
        List<k6.p.a> listP = p(view);
        for (int i16 = 0; i16 < listP.size(); i16++) {
            if (listP.get(i16).b() == i15) {
                listP.remove(i16);
                return;
            }
        }
    }

    private static void d(View view, k6.p.a aVar) {
        k(view);
        c0(aVar.b(), view);
        p(view).add(aVar);
        P(view, 0);
    }

    public static void d0(View view, k6.p.a aVar, CharSequence charSequence, k6.s sVar) {
        if (sVar == null && charSequence == null) {
            b0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, sVar));
        }
    }

    public static void e(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        o6.b.b((View) view.getParent(), viewGroup);
    }

    public static void e0(View view) {
        g.c(view);
    }

    @Deprecated
    public static v0 f(View view) {
        if (f99704a == null) {
            f99704a = new WeakHashMap<>();
        }
        v0 v0Var = f99704a.get(view);
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0(view);
        f99704a.put(view, v0Var2);
        return v0Var2;
    }

    public static void f0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i15, int i16) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i15, i16);
        }
    }

    public static f1 g(View view, f1 f1Var, Rect rect) {
        return h.b(view, f1Var, rect);
    }

    private static f<Boolean> g0() {
        return new a(r5.e.P, Boolean.class, 28);
    }

    public static f1 h(View view, f1 f1Var) {
        int i15 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsX = f1Var.x();
        if (windowInsetsX != null) {
            WindowInsets windowInsetsA = i15 >= 30 ? n.a(view, windowInsetsX) : g.a(view, windowInsetsX);
            if (!windowInsetsA.equals(windowInsetsX)) {
                return f1.z(windowInsetsA, view);
            }
        }
        return f1Var;
    }

    public static void h0(View view, j6.a aVar) {
        if (aVar == null && (m(view) instanceof j6.a.C2337a)) {
            aVar = new j6.a();
        }
        o0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    public static void i0(View view, boolean z15) {
        b().f(view, Boolean.valueOf(z15));
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    public static void j0(View view, CharSequence charSequence) {
        U().f(view, charSequence);
        if (charSequence != null) {
            f99709f.a(view);
        } else {
            f99709f.d(view);
        }
    }

    static void k(View view) {
        j6.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new j6.a();
        }
        h0(view, aVarL);
    }

    public static void k0(View view, ColorStateList colorStateList) {
        h.h(view, colorStateList);
    }

    public static j6.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof j6.a.C2337a ? ((j6.a.C2337a) accessibilityDelegateM).f99580a : new j6.a(accessibilityDelegateM);
    }

    public static void l0(View view, PorterDuff.Mode mode) {
        h.i(view, mode);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, float f15) {
        h.j(view, f15);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f99706c) {
            return null;
        }
        if (f99705b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f99705b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f99706c = true;
                return null;
            }
        }
        try {
            Object obj = f99705b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f99706c = true;
            return null;
        }
    }

    @Deprecated
    public static void n0(View view, int i15) {
        view.setImportantForAccessibility(i15);
    }

    public static CharSequence o(View view) {
        return U().e(view);
    }

    private static void o0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private static List<k6.p.a> p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(r5.e.H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(r5.e.H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, int i15) {
        k.b(view, i15);
    }

    private static int q(View view, CharSequence charSequence) {
        List<k6.p.a> listP = p(view);
        for (int i15 = 0; i15 < listP.size(); i15++) {
            if (TextUtils.equals(charSequence, listP.get(i15).c())) {
                return listP.get(i15).b();
            }
        }
        int i16 = -1;
        int i17 = 0;
        while (true) {
            int[] iArr = f99707d;
            if (i17 >= iArr.length || i16 != -1) {
                break;
            }
            int i18 = iArr[i17];
            boolean z15 = true;
            for (int i19 = 0; i19 < listP.size(); i19++) {
                z15 &= listP.get(i19).b() != i18;
            }
            if (z15) {
                i16 = i18;
            }
            i17++;
        }
        return i16;
    }

    public static void q0(View view, y yVar) {
        h.k(view, yVar);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, c0 c0Var) {
        j.a(view, (PointerIcon) (c0Var != null ? c0Var.a() : null));
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, boolean z15) {
        g0().f(view, Boolean.valueOf(z15));
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, int i15, int i16) {
        i.b(view, i15, i16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static a0 u(View view) {
        return view instanceof a0 ? (a0) view : f99708e;
    }

    public static void u0(View view, String str) {
        h.l(view, str);
    }

    @Deprecated
    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static void v0(View view, float f15) {
        h.m(view, f15);
    }

    @Deprecated
    public static int w(View view) {
        return view.getImportantForAccessibility();
    }

    public static void w0(View view, a1.b bVar) {
        a1.e(view, bVar);
    }

    @SuppressLint({"InlinedApi"})
    public static int x(View view) {
        return k.a(view);
    }

    public static void x0(View view, float f15) {
        h.n(view, f15);
    }

    @Deprecated
    public static int y(View view) {
        return view.getLayoutDirection();
    }

    private static f<CharSequence> y0() {
        return new c(r5.e.Q, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static int z(View view) {
        return view.getMinimumHeight();
    }

    public static void z0(View view) {
        h.o(view);
    }
}
