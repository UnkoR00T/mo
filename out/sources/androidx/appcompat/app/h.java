package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.z0;
import io.sentry.android.core.c2;
import j6.f1;
import j6.l0;
import j6.v0;
import j6.x0;
import j6.y;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParser;
import p007NuL.u;
import p007NuL.v;
import r0.l1;

/* JADX INFO: loaded from: classes.dex */
class h extends androidx.appcompat.app.f implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {
    private static final l1<String, Integer> J0 = new l1<>();
    private static final boolean K0 = false;
    private static final int[] L0 = {R.attr.windowBackground};
    private static final boolean M0 = !"robolectric".equals(Build.FINGERPRINT);
    Runnable A;
    int A0;
    v0 B;
    private final Runnable B0;
    private boolean C;
    private boolean C0;
    private boolean D;
    private Rect D0;
    ViewGroup E;
    private Rect E0;
    private TextView F;
    private androidx.appcompat.app.n F0;
    private View G;
    private androidx.appcompat.app.o G0;
    private boolean H;
    private OnBackInvokedDispatcher H0;
    private boolean I;
    private OnBackInvokedCallback I0;
    boolean K;
    boolean L;
    boolean O;
    boolean P;
    boolean R;
    private boolean T;
    private q[] X;
    private q Y;
    private boolean Z;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f8183h0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Object f8184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Context f8185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Window f8186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f8187n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final androidx.appcompat.app.d f8188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.appcompat.app.a f8189q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f8190q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    MenuInflater f8191r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    boolean f8192r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f8193s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Configuration f8194s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private f0 f8195t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f8196t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f8197u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f8198v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f8199v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private r f8200w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f8201w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.b f8202x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private n f8203x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ActionBarContextView f8204y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private n f8205y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    PopupWindow f8206z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    boolean f8207z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.A0 & 1) != 0) {
                hVar.h0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.A0 & PKIFailureInfo.certConfirmed) != 0) {
                hVar2.h0(108);
            }
            h hVar3 = h.this;
            hVar3.f8207z0 = false;
            hVar3.A0 = 0;
        }
    }

    class b implements y {
        b() {
        }

        @Override // j6.y
        public f1 b(View view, f1 f1Var) {
            int iL = f1Var.l();
            int iE1 = h.this.e1(f1Var, null);
            if (iL != iE1) {
                f1Var = f1Var.r(f1Var.j(), iE1, f1Var.k(), f1Var.i());
            }
            return l0.S(view, f1Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.f0();
        }
    }

    class d implements Runnable {

        class a extends x0 {
            a() {
            }

            @Override // j6.w0
            public void b(View view) {
                h.this.f8204y.setAlpha(1.0f);
                h.this.B.g(null);
                h.this.B = null;
            }

            @Override // j6.x0, j6.w0
            public void c(View view) {
                h.this.f8204y.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f8206z.showAtLocation(hVar.f8204y, 55, 0, 0);
            h.this.i0();
            if (!h.this.T0()) {
                h.this.f8204y.setAlpha(1.0f);
                h.this.f8204y.setVisibility(0);
            } else {
                h.this.f8204y.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.B = l0.f(hVar2.f8204y).b(1.0f);
                h.this.B.g(new a());
            }
        }
    }

    class e extends x0 {
        e() {
        }

        @Override // j6.w0
        public void b(View view) {
            h.this.f8204y.setAlpha(1.0f);
            h.this.B.g(null);
            h.this.B = null;
        }

        @Override // j6.x0, j6.w0
        public void c(View view) {
            h.this.f8204y.setVisibility(0);
            if (h.this.f8204y.getParent() instanceof View) {
                l0.e0((View) h.this.f8204y.getParent());
            }
        }
    }

    private final class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
            h.this.Y(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackU0 = h.this.u0();
            if (callbackU0 == null) {
                return true;
            }
            callbackU0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class g implements androidx.appcompat.view.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private androidx.appcompat.view.b.a f8215a;

        class a extends x0 {
            a() {
            }

            @Override // j6.w0
            public void b(View view) {
                h.this.f8204y.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f8206z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f8204y.getParent() instanceof View) {
                    l0.e0((View) h.this.f8204y.getParent());
                }
                h.this.f8204y.k();
                h.this.B.g(null);
                h hVar2 = h.this;
                hVar2.B = null;
                l0.e0(hVar2.E);
            }
        }

        public g(androidx.appcompat.view.b.a aVar) {
            this.f8215a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f8215a.a(bVar);
            h hVar = h.this;
            if (hVar.f8206z != null) {
                hVar.f8186m.getDecorView().removeCallbacks(h.this.A);
            }
            h hVar2 = h.this;
            if (hVar2.f8204y != null) {
                hVar2.i0();
                h hVar3 = h.this;
                hVar3.B = l0.f(hVar3.f8204y).b(0.0f);
                h.this.B.g(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f8188p;
            if (dVar != null) {
                dVar.s(hVar4.f8202x);
            }
            h hVar5 = h.this;
            hVar5.f8202x = null;
            l0.e0(hVar5.E);
            h.this.c1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f8215a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f8215a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            l0.e0(h.this.E);
            return this.f8215a.d(bVar, menu);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    static class C0186h {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class i {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static e6.h b(Configuration configuration) {
            return e6.h.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(e6.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.h()));
        }

        static void d(Configuration configuration, e6.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.h()));
        }
    }

    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i15 = configuration.colorMode & 3;
            int i16 = configuration2.colorMode;
            if (i15 != (i16 & 3)) {
                configuration3.colorMode |= i16 & 3;
            }
            int i17 = configuration.colorMode & 12;
            int i18 = configuration2.colorMode;
            if (i17 != (i18 & 12)) {
                configuration3.colorMode |= i18 & 12;
            }
        }
    }

    static class k {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.k
                public final void onBackInvoked() {
                    hVar.C0();
                }
            };
            androidx.appcompat.app.j.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.j.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.i.a(obj2));
        }
    }

    class l extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8220d;

        l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f8219c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f8219c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f8218b = true;
                callback.onContentChanged();
            } finally {
                this.f8218b = false;
            }
        }

        public void d(Window.Callback callback, int i15, Menu menu) {
            try {
                this.f8220d = true;
                callback.onPanelClosed(i15, menu);
            } finally {
                this.f8220d = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f8219c) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        final ActionMode e(ActionMode.Callback callback) {
            androidx.appcompat.view.f.a aVar = new androidx.appcompat.view.f.a(h.this.f8185l, callback);
            androidx.appcompat.view.b bVarW0 = h.this.W0(aVar);
            if (bVarW0 != null) {
                return aVar.e(bVarW0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f8218b) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i15, Menu menu) {
            if (i15 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i15, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i15) {
            return super.onCreatePanelView(i15);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i15, Menu menu) {
            super.onMenuOpened(i15, menu);
            h.this.I0(i15);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i15, Menu menu) {
            if (this.f8220d) {
                a().onPanelClosed(i15, menu);
            } else {
                super.onPanelClosed(i15, menu);
                h.this.J0(i15);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i15, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i15 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i15, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i15) {
            androidx.appcompat.view.menu.e eVar;
            q qVarS0 = h.this.s0(0, true);
            if (qVarS0 == null || (eVar = qVarS0.f8239j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i15);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i15);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i15) {
            return (h.this.A0() && i15 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i15);
        }
    }

    private class m extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f8222c;

        m(Context context) {
            super();
            this.f8222c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.n
        public int c() {
            return C0186h.a(this.f8222c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.n
        public void d() {
            h.this.f();
        }
    }

    abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f8224a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        n() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f8224a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f8185l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f8224a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f8224a == null) {
                this.f8224a = new a();
            }
            h.this.f8185l.registerReceiver(this.f8224a, intentFilterB);
        }
    }

    private class o extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.r f8227c;

        o(androidx.appcompat.app.r rVar) {
            super();
            this.f8227c = rVar;
        }

        @Override // androidx.appcompat.app.h.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.n
        public int c() {
            return this.f8227c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.n
        public void d() {
            h.this.f();
        }
    }

    private class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        private boolean b(int i15, int i16) {
            return i15 < -5 || i16 < -5 || i15 > getWidth() + 5 || i16 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.a0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i15) {
            setBackgroundDrawable(p082nUL.y.b(getContext(), i15));
        }
    }

    protected static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f8236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f8237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f8238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f8239j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f8240k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f8241l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f8242m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f8243n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f8244o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f8245p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f8246q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f8247r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f8248s;

        q(int i15) {
            this.f8230a = i15;
        }

        androidx.appcompat.view.menu.k a(androidx.appcompat.view.menu.j.a aVar) {
            if (this.f8239j == null) {
                return null;
            }
            if (this.f8240k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f8241l, p007NuL.s.f413j);
                this.f8240k = cVar;
                cVar.e(aVar);
                this.f8239j.b(this.f8240k);
            }
            return this.f8240k.b(this.f8236g);
        }

        public boolean b() {
            if (this.f8237h == null) {
                return false;
            }
            return this.f8238i != null || this.f8240k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f8239j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f8240k);
            }
            this.f8239j = eVar;
            if (eVar == null || (cVar = this.f8240k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(p007NuL.m.f308a, typedValue, true);
            int i15 = typedValue.resourceId;
            if (i15 != 0) {
                themeNewTheme.applyStyle(i15, true);
            }
            themeNewTheme.resolveAttribute(p007NuL.m.H, typedValue, true);
            int i16 = typedValue.resourceId;
            if (i16 != 0) {
                themeNewTheme.applyStyle(i16, true);
            } else {
                themeNewTheme.applyStyle(u.f433b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f8241l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(v.f553y0);
            this.f8231b = typedArrayObtainStyledAttributes.getResourceId(v.B0, 0);
            this.f8235f = typedArrayObtainStyledAttributes.getResourceId(v.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class r implements androidx.appcompat.view.menu.j.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z15) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z16 = eVarD != eVar;
            h hVar = h.this;
            if (z16) {
                eVar = eVarD;
            }
            q qVarL0 = hVar.l0(eVar);
            if (qVarL0 != null) {
                if (!z16) {
                    h.this.b0(qVarL0, z15);
                } else {
                    h.this.X(qVarL0.f8230a, qVarL0, eVarD);
                    h.this.b0(qVarL0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackU0;
            if (eVar != eVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.K || (callbackU0 = hVar.u0()) == null || h.this.f8192r0) {
                return true;
            }
            callbackU0.onMenuOpened(108, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean E0(int i15, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarS0 = s0(i15, true);
        if (qVarS0.f8244o) {
            return false;
        }
        return O0(qVarS0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean H0(int i15, KeyEvent keyEvent) {
        boolean zO0;
        f0 f0Var;
        if (this.f8202x != null) {
            return false;
        }
        boolean zB = true;
        q qVarS0 = s0(i15, true);
        if (i15 != 0 || (f0Var = this.f8195t) == null || !f0Var.a() || ViewConfiguration.get(this.f8185l).hasPermanentMenuKey()) {
            boolean z15 = qVarS0.f8244o;
            if (z15 || qVarS0.f8243n) {
                b0(qVarS0, true);
                zB = z15;
            } else if (qVarS0.f8242m) {
                if (qVarS0.f8247r) {
                    qVarS0.f8242m = false;
                    zO0 = O0(qVarS0, keyEvent);
                } else {
                    zO0 = true;
                }
                if (zO0) {
                    L0(qVarS0, keyEvent);
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
        } else if (this.f8195t.f()) {
            zB = this.f8195t.b();
        } else if (this.f8192r0 || !O0(qVarS0, keyEvent)) {
            zB = false;
        } else {
            zB = this.f8195t.d();
        }
        if (zB) {
            AudioManager audioManager = (AudioManager) this.f8185l.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zB;
            }
            c2.g("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zB;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    private void L0(q qVar, KeyEvent keyEvent) {
        int i15;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f8244o || this.f8192r0) {
            return;
        }
        if (qVar.f8230a == 0 && (this.f8185l.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !callbackU0.onMenuOpened(qVar.f8230a, qVar.f8239j)) {
            b0(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8185l.getSystemService("window");
        if (windowManager != null && O0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f8236g;
            if (viewGroup != null && !qVar.f8246q) {
                View view = qVar.f8238i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i15 = -1;
                }
                qVar.f8243n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i15, -2, qVar.f8233d, qVar.f8234e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f8232c;
                layoutParams2.windowAnimations = qVar.f8235f;
                windowManager.addView(qVar.f8236g, layoutParams2);
                qVar.f8244o = true;
                if (qVar.f8230a == 0) {
                    c1();
                }
            }
            if (viewGroup == null) {
                if (!x0(qVar) || qVar.f8236g == null) {
                    return;
                }
            } else if (qVar.f8246q && viewGroup.getChildCount() > 0) {
                qVar.f8236g.removeAllViews();
            }
            if (!w0(qVar) || !qVar.b()) {
                qVar.f8246q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f8237h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f8236g.setBackgroundResource(qVar.f8231b);
            ViewParent parent = qVar.f8237h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f8237h);
            }
            qVar.f8236g.addView(qVar.f8237h, layoutParams3);
            if (!qVar.f8237h.hasFocus()) {
                qVar.f8237h.requestFocus();
            }
            i15 = -2;
            qVar.f8243n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i15, -2, qVar.f8233d, qVar.f8234e, 1002, 8519680, -3);
            layoutParams4.gravity = qVar.f8232c;
            layoutParams4.windowAnimations = qVar.f8235f;
            windowManager.addView(qVar.f8236g, layoutParams4);
            qVar.f8244o = true;
            if (qVar.f8230a == 0) {
                c1();
            }
        }
    }

    private boolean N0(q qVar, int i15, KeyEvent keyEvent, int i16) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f8242m || O0(qVar, keyEvent)) && (eVar = qVar.f8239j) != null) {
            zPerformShortcut = eVar.performShortcut(i15, keyEvent, i16);
        }
        if (zPerformShortcut && (i16 & 1) == 0 && this.f8195t == null) {
            b0(qVar, true);
        }
        return zPerformShortcut;
    }

    private boolean O0(q qVar, KeyEvent keyEvent) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        if (this.f8192r0) {
            return false;
        }
        if (qVar.f8242m) {
            return true;
        }
        q qVar2 = this.Y;
        if (qVar2 != null && qVar2 != qVar) {
            b0(qVar2, false);
        }
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null) {
            qVar.f8238i = callbackU0.onCreatePanelView(qVar.f8230a);
        }
        int i15 = qVar.f8230a;
        boolean z15 = i15 == 0 || i15 == 108;
        if (z15 && (f0Var3 = this.f8195t) != null) {
            f0Var3.g();
        }
        if (qVar.f8238i == null) {
            if (z15) {
                M0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f8239j;
            if (eVar == null || qVar.f8247r) {
                if (eVar == null && (!y0(qVar) || qVar.f8239j == null)) {
                    return false;
                }
                if (z15 && this.f8195t != null) {
                    if (this.f8198v == null) {
                        this.f8198v = new f();
                    }
                    this.f8195t.e(qVar.f8239j, this.f8198v);
                }
                qVar.f8239j.e0();
                if (!callbackU0.onCreatePanelMenu(qVar.f8230a, qVar.f8239j)) {
                    qVar.c(null);
                    if (z15 && (f0Var = this.f8195t) != null) {
                        f0Var.e(null, this.f8198v);
                    }
                    return false;
                }
                qVar.f8247r = false;
            }
            qVar.f8239j.e0();
            Bundle bundle = qVar.f8248s;
            if (bundle != null) {
                qVar.f8239j.Q(bundle);
                qVar.f8248s = null;
            }
            if (!callbackU0.onPreparePanel(0, qVar.f8238i, qVar.f8239j)) {
                if (z15 && (f0Var2 = this.f8195t) != null) {
                    f0Var2.e(null, this.f8198v);
                }
                qVar.f8239j.d0();
                return false;
            }
            boolean z16 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f8245p = z16;
            qVar.f8239j.setQwertyMode(z16);
            qVar.f8239j.d0();
        }
        qVar.f8242m = true;
        qVar.f8243n = false;
        this.Y = qVar;
        return true;
    }

    private void P0(boolean z15) {
        f0 f0Var = this.f8195t;
        if (f0Var == null || !f0Var.a() || (ViewConfiguration.get(this.f8185l).hasPermanentMenuKey() && !this.f8195t.h())) {
            q qVarS0 = s0(0, true);
            qVarS0.f8246q = true;
            b0(qVarS0, false);
            L0(qVarS0, null);
            return;
        }
        Window.Callback callbackU0 = u0();
        if (this.f8195t.f() && z15) {
            this.f8195t.b();
            if (this.f8192r0) {
                return;
            }
            callbackU0.onPanelClosed(108, s0(0, true).f8239j);
            return;
        }
        if (callbackU0 == null || this.f8192r0) {
            return;
        }
        if (this.f8207z0 && (this.A0 & 1) != 0) {
            this.f8186m.getDecorView().removeCallbacks(this.B0);
            this.B0.run();
        }
        q qVarS1 = s0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarS1.f8239j;
        if (eVar == null || qVarS1.f8247r || !callbackU0.onPreparePanel(0, qVarS1.f8238i, eVar)) {
            return;
        }
        callbackU0.onMenuOpened(108, qVarS1.f8239j);
        this.f8195t.d();
    }

    private int Q0(int i15) {
        if (i15 == 8) {
            return 108;
        }
        if (i15 == 9) {
            return 109;
        }
        return i15;
    }

    private boolean R(boolean z15) {
        return S(z15, true);
    }

    private boolean S(boolean z15, boolean z16) {
        if (this.f8192r0) {
            return false;
        }
        int iW = W();
        int iB0 = B0(this.f8185l, iW);
        e6.h hVarV = Build.VERSION.SDK_INT < 33 ? V(this.f8185l) : null;
        if (!z16 && hVarV != null) {
            hVarV = r0(this.f8185l.getResources().getConfiguration());
        }
        boolean zB1 = b1(iB0, hVarV, z15);
        if (iW == 0) {
            q0(this.f8185l).e();
        } else {
            n nVar = this.f8203x0;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iW == 3) {
            p0(this.f8185l).e();
            return zB1;
        }
        n nVar2 = this.f8205y0;
        if (nVar2 != null) {
            nVar2.a();
        }
        return zB1;
    }

    private void T() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.E.findViewById(R.id.content);
        View decorView = this.f8186m.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f8185l.obtainStyledAttributes(v.f553y0);
        typedArrayObtainStyledAttributes.getValue(v.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(v.L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(v.I0)) {
            typedArrayObtainStyledAttributes.getValue(v.I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(v.J0)) {
            typedArrayObtainStyledAttributes.getValue(v.J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(v.G0)) {
            typedArrayObtainStyledAttributes.getValue(v.G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(v.H0)) {
            typedArrayObtainStyledAttributes.getValue(v.H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void U(Window window) {
        if (this.f8186m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f8187n = lVar;
        window.setCallback(lVar);
        z0 z0VarU = z0.u(this.f8185l, null, L0);
        Drawable drawableH = z0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        z0VarU.x();
        this.f8186m = window;
        if (Build.VERSION.SDK_INT < 33 || this.H0 != null) {
            return;
        }
        M(null);
    }

    private boolean U0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f8186m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int W() {
        int i15 = this.f8196t0;
        return i15 != -100 ? i15 : androidx.appcompat.app.f.o();
    }

    private void Y0() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void Z() {
        n nVar = this.f8203x0;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f8205y0;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    private androidx.appcompat.app.c Z0() {
        for (Context baseContext = this.f8185l; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f8184k;
        if (activity instanceof androidx.p016lifecycle.q) {
            if (((androidx.p016lifecycle.q) activity).getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f8190q0 || this.f8192r0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private boolean b1(int i15, e6.h hVar, boolean z15) {
        boolean z16;
        Configuration configurationC0 = c0(this.f8185l, i15, hVar, null, false);
        int iO0 = o0(this.f8185l);
        Configuration configuration = this.f8194s0;
        if (configuration == null) {
            configuration = this.f8185l.getResources().getConfiguration();
        }
        int i16 = configuration.uiMode & 48;
        int i17 = configurationC0.uiMode & 48;
        e6.h hVarR0 = r0(configuration);
        e6.h hVarR1 = hVar == null ? null : r0(configurationC0);
        int i18 = i16 != i17 ? 512 : 0;
        if (hVarR1 != null && !hVarR0.equals(hVarR1)) {
            i18 |= 8196;
        }
        boolean z17 = true;
        if (((~iO0) & i18) != 0 && z15 && this.f8183h0 && (M0 || this.f8190q0)) {
            Object obj = this.f8184k;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z16 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i18 & PKIFailureInfo.certRevoked) != 0) {
                    ((Activity) this.f8184k).getWindow().getDecorView().setLayoutDirection(configurationC0.getLayoutDirection());
                }
                s5.b.t((Activity) this.f8184k);
                z16 = true;
            }
        } else {
            z16 = false;
        }
        if (z16 || i18 == 0) {
            z17 = z16;
        } else {
            d1(i17, hVarR1, (i18 & iO0) == i18, null);
        }
        if (z17) {
            Object obj2 = this.f8184k;
            if (obj2 instanceof androidx.appcompat.app.c) {
                if ((i18 & 512) != 0) {
                    ((androidx.appcompat.app.c) obj2).I0(i15);
                }
                if ((i18 & 4) != 0) {
                    ((androidx.appcompat.app.c) this.f8184k).H0(hVar);
                }
            }
        }
        if (hVarR1 != null) {
            S0(r0(this.f8185l.getResources().getConfiguration()));
        }
        return z17;
    }

    private Configuration c0(Context context, int i15, e6.h hVar, Configuration configuration, boolean z15) {
        int i16;
        if (i15 == 1) {
            i16 = 16;
        } else if (i15 != 2) {
            i16 = z15 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i16 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i16 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            R0(configuration2, hVar);
        }
        return configuration2;
    }

    private ViewGroup d0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f8185l.obtainStyledAttributes(v.f553y0);
        if (!typedArrayObtainStyledAttributes.hasValue(v.D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(v.M0, false)) {
            H(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(v.D0, false)) {
            H(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(v.E0, false)) {
            H(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(v.F0, false)) {
            H(10);
        }
        this.P = typedArrayObtainStyledAttributes.getBoolean(v.f557z0, false);
        typedArrayObtainStyledAttributes.recycle();
        k0();
        this.f8186m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8185l);
        if (this.R) {
            viewGroup = this.O ? (ViewGroup) layoutInflaterFrom.inflate(p007NuL.s.f418o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p007NuL.s.f417n, (ViewGroup) null);
        } else if (this.P) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p007NuL.s.f409f, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            this.f8185l.getTheme().resolveAttribute(p007NuL.m.f313f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f8185l, typedValue.resourceId) : this.f8185l).inflate(p007NuL.s.f419p, (ViewGroup) null);
            f0 f0Var = (f0) viewGroup.findViewById(p007NuL.r.f393p);
            this.f8195t = f0Var;
            f0Var.setWindowCallback(u0());
            if (this.L) {
                this.f8195t.i(109);
            }
            if (this.H) {
                this.f8195t.i(2);
            }
            if (this.I) {
                this.f8195t.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.P + ", windowActionModeOverlay: " + this.O + ", windowNoTitle: " + this.R + " }");
        }
        l0.q0(viewGroup, new b());
        if (this.f8195t == null) {
            this.F = (TextView) viewGroup.findViewById(p007NuL.r.C);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(p007NuL.r.f379b);
        ViewGroup viewGroup2 = (ViewGroup) this.f8186m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f8186m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void d1(int i15, e6.h hVar, boolean z15, Configuration configuration) {
        Resources resources = this.f8185l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            R0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i16 = this.f8197u0;
        if (i16 != 0) {
            this.f8185l.setTheme(i16);
            this.f8185l.getTheme().applyStyle(this.f8197u0, true);
        }
        if (z15 && (this.f8184k instanceof Activity)) {
            a1(configuration2);
        }
    }

    private void f1(View view) {
        view.setBackgroundColor((l0.H(view) & PKIFailureInfo.certRevoked) != 0 ? u5.a.d(this.f8185l, p007NuL.o.f336b) : u5.a.d(this.f8185l, p007NuL.o.f335a));
    }

    private void j0() {
        if (this.D) {
            return;
        }
        this.E = d0();
        CharSequence charSequenceT0 = t0();
        if (!TextUtils.isEmpty(charSequenceT0)) {
            f0 f0Var = this.f8195t;
            if (f0Var != null) {
                f0Var.setWindowTitle(charSequenceT0);
            } else if (M0() != null) {
                M0().x(charSequenceT0);
            } else {
                TextView textView = this.F;
                if (textView != null) {
                    textView.setText(charSequenceT0);
                }
            }
        }
        T();
        K0(this.E);
        this.D = true;
        q qVarS0 = s0(0, false);
        if (this.f8192r0) {
            return;
        }
        if (qVarS0 == null || qVarS0.f8239j == null) {
            z0(108);
        }
    }

    private void k0() {
        if (this.f8186m == null) {
            Object obj = this.f8184k;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.f8186m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration m0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f15 = configuration.fontScale;
            float f16 = configuration2.fontScale;
            if (f15 != f16) {
                configuration3.fontScale = f16;
            }
            int i15 = configuration.mcc;
            int i16 = configuration2.mcc;
            if (i15 != i16) {
                configuration3.mcc = i16;
            }
            int i17 = configuration.mnc;
            int i18 = configuration2.mnc;
            if (i17 != i18) {
                configuration3.mnc = i18;
            }
            i.a(configuration, configuration2, configuration3);
            int i19 = configuration.touchscreen;
            int i25 = configuration2.touchscreen;
            if (i19 != i25) {
                configuration3.touchscreen = i25;
            }
            int i26 = configuration.keyboard;
            int i27 = configuration2.keyboard;
            if (i26 != i27) {
                configuration3.keyboard = i27;
            }
            int i28 = configuration.keyboardHidden;
            int i29 = configuration2.keyboardHidden;
            if (i28 != i29) {
                configuration3.keyboardHidden = i29;
            }
            int i35 = configuration.navigation;
            int i36 = configuration2.navigation;
            if (i35 != i36) {
                configuration3.navigation = i36;
            }
            int i37 = configuration.navigationHidden;
            int i38 = configuration2.navigationHidden;
            if (i37 != i38) {
                configuration3.navigationHidden = i38;
            }
            int i39 = configuration.orientation;
            int i45 = configuration2.orientation;
            if (i39 != i45) {
                configuration3.orientation = i45;
            }
            int i46 = configuration.screenLayout & 15;
            int i47 = configuration2.screenLayout;
            if (i46 != (i47 & 15)) {
                configuration3.screenLayout |= i47 & 15;
            }
            int i48 = configuration.screenLayout & 192;
            int i49 = configuration2.screenLayout;
            if (i48 != (i49 & 192)) {
                configuration3.screenLayout |= i49 & 192;
            }
            int i55 = configuration.screenLayout & 48;
            int i56 = configuration2.screenLayout;
            if (i55 != (i56 & 48)) {
                configuration3.screenLayout |= i56 & 48;
            }
            int i57 = configuration.screenLayout & 768;
            int i58 = configuration2.screenLayout;
            if (i57 != (i58 & 768)) {
                configuration3.screenLayout |= i58 & 768;
            }
            j.a(configuration, configuration2, configuration3);
            int i59 = configuration.uiMode & 15;
            int i65 = configuration2.uiMode;
            if (i59 != (i65 & 15)) {
                configuration3.uiMode |= i65 & 15;
            }
            int i66 = configuration.uiMode & 48;
            int i67 = configuration2.uiMode;
            if (i66 != (i67 & 48)) {
                configuration3.uiMode |= i67 & 48;
            }
            int i68 = configuration.screenWidthDp;
            int i69 = configuration2.screenWidthDp;
            if (i68 != i69) {
                configuration3.screenWidthDp = i69;
            }
            int i75 = configuration.screenHeightDp;
            int i76 = configuration2.screenHeightDp;
            if (i75 != i76) {
                configuration3.screenHeightDp = i76;
            }
            int i77 = configuration.smallestScreenWidthDp;
            int i78 = configuration2.smallestScreenWidthDp;
            if (i77 != i78) {
                configuration3.smallestScreenWidthDp = i78;
            }
            int i79 = configuration.densityDpi;
            int i85 = configuration2.densityDpi;
            if (i79 != i85) {
                configuration3.densityDpi = i85;
            }
        }
        return configuration3;
    }

    private int o0(Context context) {
        if (!this.f8201w0 && (this.f8184k instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f8184k.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f8199v0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f8199v0 = 0;
            }
        }
        this.f8201w0 = true;
        return this.f8199v0;
    }

    private n p0(Context context) {
        if (this.f8205y0 == null) {
            this.f8205y0 = new m(context);
        }
        return this.f8205y0;
    }

    private n q0(Context context) {
        if (this.f8203x0 == null) {
            this.f8203x0 = new o(androidx.appcompat.app.r.a(context));
        }
        return this.f8203x0;
    }

    private void v0() {
        j0();
        if (this.K && this.f8189q == null) {
            Object obj = this.f8184k;
            if (obj instanceof Activity) {
                this.f8189q = new s((Activity) this.f8184k, this.L);
            } else if (obj instanceof Dialog) {
                this.f8189q = new s((Dialog) this.f8184k);
            }
            androidx.appcompat.app.a aVar = this.f8189q;
            if (aVar != null) {
                aVar.r(this.C0);
            }
        }
    }

    private boolean w0(q qVar) {
        View view = qVar.f8238i;
        if (view != null) {
            qVar.f8237h = view;
            return true;
        }
        if (qVar.f8239j == null) {
            return false;
        }
        if (this.f8200w == null) {
            this.f8200w = new r();
        }
        View view2 = (View) qVar.a(this.f8200w);
        qVar.f8237h = view2;
        return view2 != null;
    }

    private boolean x0(q qVar) {
        qVar.d(n0());
        qVar.f8236g = new p(qVar.f8241l);
        qVar.f8232c = 81;
        return true;
    }

    private boolean y0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f8185l;
        int i15 = qVar.f8230a;
        if ((i15 == 0 || i15 == 108) && this.f8195t != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(p007NuL.m.f313f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(p007NuL.m.f314g, typedValue, true);
            } else {
                theme.resolveAttribute(p007NuL.m.f314g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    private void z0(int i15) {
        this.A0 = (1 << i15) | this.A0;
        if (this.f8207z0) {
            return;
        }
        l0.Z(this.f8186m.getDecorView(), this.B0);
        this.f8207z0 = true;
    }

    @Override // androidx.appcompat.app.f
    public void A(Bundle bundle) {
        j0();
    }

    public boolean A0() {
        return this.C;
    }

    @Override // androidx.appcompat.app.f
    public void B() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.v(true);
        }
    }

    int B0(Context context, int i15) {
        if (i15 == -100) {
            return -1;
        }
        if (i15 != -1) {
            if (i15 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return q0(context).c();
            }
            if (i15 != 1 && i15 != 2) {
                if (i15 == 3) {
                    return p0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i15;
    }

    @Override // androidx.appcompat.app.f
    public void C(Bundle bundle) {
    }

    boolean C0() {
        boolean z15 = this.Z;
        this.Z = false;
        q qVarS0 = s0(0, false);
        if (qVarS0 != null && qVarS0.f8244o) {
            if (!z15) {
                b0(qVarS0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f8202x;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarT = t();
        return aVarT != null && aVarT.g();
    }

    @Override // androidx.appcompat.app.f
    public void D() {
        S(true, false);
    }

    boolean D0(int i15, KeyEvent keyEvent) {
        if (i15 == 4) {
            this.Z = (keyEvent.getFlags() & 128) != 0;
        } else if (i15 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void E() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.v(false);
        }
    }

    boolean F0(int i15, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null && aVarT.o(i15, keyEvent)) {
            return true;
        }
        q qVar = this.Y;
        if (qVar != null && N0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.Y;
            if (qVar2 != null) {
                qVar2.f8243n = true;
            }
            return true;
        }
        if (this.Y == null) {
            q qVarS0 = s0(0, true);
            O0(qVarS0, keyEvent);
            boolean zN0 = N0(qVarS0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarS0.f8242m = false;
            if (zN0) {
                return true;
            }
        }
        return false;
    }

    boolean G0(int i15, KeyEvent keyEvent) {
        if (i15 != 4) {
            if (i15 == 82) {
                H0(0, keyEvent);
                return true;
            }
        } else if (C0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean H(int i15) {
        int iQ0 = Q0(i15);
        if (this.R && iQ0 == 108) {
            return false;
        }
        if (this.K && iQ0 == 1) {
            this.K = false;
        }
        if (iQ0 == 1) {
            Y0();
            this.R = true;
            return true;
        }
        if (iQ0 == 2) {
            Y0();
            this.H = true;
            return true;
        }
        if (iQ0 == 5) {
            Y0();
            this.I = true;
            return true;
        }
        if (iQ0 == 10) {
            Y0();
            this.O = true;
            return true;
        }
        if (iQ0 == 108) {
            Y0();
            this.K = true;
            return true;
        }
        if (iQ0 != 109) {
            return this.f8186m.requestFeature(iQ0);
        }
        Y0();
        this.L = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void I(int i15) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8185l).inflate(i15, viewGroup);
        this.f8187n.c(this.f8186m.getCallback());
    }

    void I0(int i15) {
        androidx.appcompat.app.a aVarT;
        if (i15 != 108 || (aVarT = t()) == null) {
            return;
        }
        aVarT.h(true);
    }

    @Override // androidx.appcompat.app.f
    public void J(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8187n.c(this.f8186m.getCallback());
    }

    void J0(int i15) {
        if (i15 == 108) {
            androidx.appcompat.app.a aVarT = t();
            if (aVarT != null) {
                aVarT.h(false);
                return;
            }
            return;
        }
        if (i15 == 0) {
            q qVarS0 = s0(i15, true);
            if (qVarS0.f8244o) {
                b0(qVarS0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8187n.c(this.f8186m.getCallback());
    }

    void K0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.M(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.H0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.I0) != null) {
            k.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.I0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f8184k;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.H0 = onBackInvokedDispatcher;
            } else {
                this.H0 = k.a((Activity) this.f8184k);
            }
        } else {
            this.H0 = onBackInvokedDispatcher;
        }
        c1();
    }

    final androidx.appcompat.app.a M0() {
        return this.f8189q;
    }

    @Override // androidx.appcompat.app.f
    public void N(int i15) {
        this.f8197u0 = i15;
    }

    @Override // androidx.appcompat.app.f
    public final void O(CharSequence charSequence) {
        this.f8193s = charSequence;
        f0 f0Var = this.f8195t;
        if (f0Var != null) {
            f0Var.setWindowTitle(charSequence);
            return;
        }
        if (M0() != null) {
            M0().x(charSequence);
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void R0(Configuration configuration, e6.h hVar) {
        i.d(configuration, hVar);
    }

    void S0(e6.h hVar) {
        i.c(hVar);
    }

    final boolean T0() {
        ViewGroup viewGroup;
        return this.D && (viewGroup = this.E) != null && viewGroup.isLaidOut();
    }

    e6.h V(Context context) {
        e6.h hVarS;
        if (Build.VERSION.SDK_INT >= 33 || (hVarS = androidx.appcompat.app.f.s()) == null) {
            return null;
        }
        e6.h hVarR0 = r0(context.getApplicationContext().getResources().getConfiguration());
        e6.h hVarB = androidx.appcompat.app.p.b(hVarS, hVarR0);
        return hVarB.f() ? hVarR0 : hVarB;
    }

    boolean V0() {
        if (this.H0 == null) {
            return false;
        }
        q qVarS0 = s0(0, false);
        return (qVarS0 != null && qVarS0.f8244o) || this.f8202x != null;
    }

    public androidx.appcompat.view.b W0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f8202x;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            androidx.appcompat.view.b bVarY = aVarT.y(gVar);
            this.f8202x = bVarY;
            if (bVarY != null && (dVar = this.f8188p) != null) {
                dVar.r(bVarY);
            }
        }
        if (this.f8202x == null) {
            this.f8202x = X0(gVar);
        }
        c1();
        return this.f8202x;
    }

    void X(int i15, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i15 >= 0) {
                q[] qVarArr = this.X;
                if (i15 < qVarArr.length) {
                    qVar = qVarArr[i15];
                }
            }
            if (qVar != null) {
                menu = qVar.f8239j;
            }
        }
        if ((qVar == null || qVar.f8244o) && !this.f8192r0) {
            this.f8187n.d(this.f8186m.getCallback(), i15, menu);
        }
    }

    androidx.appcompat.view.b X0(androidx.appcompat.view.b.a aVar) {
        androidx.appcompat.view.b bVarZ;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        i0();
        androidx.appcompat.view.b bVar = this.f8202x;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f8188p;
        if (dVar3 == null || this.f8192r0) {
            bVarZ = null;
        } else {
            try {
                bVarZ = dVar3.z(aVar);
            } catch (AbstractMethodError unused) {
                bVarZ = null;
            }
        }
        if (bVarZ != null) {
            this.f8202x = bVarZ;
        } else {
            if (this.f8204y == null) {
                if (this.P) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f8185l.getTheme();
                    theme.resolveAttribute(p007NuL.m.f313f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f8185l.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f8185l, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f8185l;
                    }
                    this.f8204y = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, p007NuL.m.f316i);
                    this.f8206z = popupWindow;
                    androidx.core.widget.g.b(popupWindow, 2);
                    this.f8206z.setContentView(this.f8204y);
                    this.f8206z.setWidth(-1);
                    dVar.getTheme().resolveAttribute(p007NuL.m.f309b, typedValue, true);
                    this.f8204y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f8206z.setHeight(-2);
                    this.A = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.E.findViewById(p007NuL.r.f385h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(n0()));
                        this.f8204y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f8204y != null) {
                i0();
                this.f8204y.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f8204y.getContext(), this.f8204y, aVar, this.f8206z == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f8204y.h(eVar);
                    this.f8202x = eVar;
                    if (T0()) {
                        this.f8204y.setAlpha(0.0f);
                        v0 v0VarB = l0.f(this.f8204y).b(1.0f);
                        this.B = v0VarB;
                        v0VarB.g(new e());
                    } else {
                        this.f8204y.setAlpha(1.0f);
                        this.f8204y.setVisibility(0);
                        if (this.f8204y.getParent() instanceof View) {
                            l0.e0((View) this.f8204y.getParent());
                        }
                    }
                    if (this.f8206z != null) {
                        this.f8186m.getDecorView().post(this.A);
                    }
                } else {
                    this.f8202x = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f8202x;
        if (bVar2 != null && (dVar2 = this.f8188p) != null) {
            dVar2.r(bVar2);
        }
        c1();
        return this.f8202x;
    }

    void Y(androidx.appcompat.view.menu.e eVar) {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f8195t.l();
        Window.Callback callbackU0 = u0();
        if (callbackU0 != null && !this.f8192r0) {
            callbackU0.onPanelClosed(108, eVar);
        }
        this.T = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q qVarL0;
        Window.Callback callbackU0 = u0();
        if (callbackU0 == null || this.f8192r0 || (qVarL0 = l0(eVar.D())) == null) {
            return false;
        }
        return callbackU0.onMenuItemSelected(qVarL0.f8230a, menuItem);
    }

    void a0(int i15) {
        b0(s0(i15, true), true);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        P0(true);
    }

    void b0(q qVar, boolean z15) {
        ViewGroup viewGroup;
        f0 f0Var;
        if (z15 && qVar.f8230a == 0 && (f0Var = this.f8195t) != null && f0Var.f()) {
            Y(qVar.f8239j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8185l.getSystemService("window");
        if (windowManager != null && qVar.f8244o && (viewGroup = qVar.f8236g) != null) {
            windowManager.removeView(viewGroup);
            if (z15) {
                X(qVar.f8230a, qVar, null);
            }
        }
        qVar.f8242m = false;
        qVar.f8243n = false;
        qVar.f8244o = false;
        qVar.f8237h = null;
        qVar.f8246q = true;
        if (this.Y == qVar) {
            this.Y = null;
        }
        if (qVar.f8230a == 0) {
            c1();
        }
    }

    void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zV0 = V0();
            if (zV0 && this.I0 == null) {
                this.I0 = k.b(this.H0, this);
            } else {
                if (zV0 || (onBackInvokedCallback = this.I0) == null) {
                    return;
                }
                k.c(this.H0, onBackInvokedCallback);
                this.I0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.E.findViewById(R.id.content)).addView(view, layoutParams);
        this.f8187n.c(this.f8186m.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z15;
        if (this.F0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f8185l.obtainStyledAttributes(v.f553y0);
            String string = typedArrayObtainStyledAttributes.getString(v.C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.F0 = new androidx.appcompat.app.n();
            } else {
                try {
                    this.F0 = (androidx.appcompat.app.n) this.f8185l.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.F0 = new androidx.appcompat.app.n();
                }
            }
        }
        boolean z16 = K0;
        boolean zU0 = false;
        if (z16) {
            if (this.G0 == null) {
                this.G0 = new androidx.appcompat.app.o();
            }
            if (this.G0.a(attributeSet)) {
                z15 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zU0 = U0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zU0 = true;
                }
                z15 = zU0;
            }
        } else {
            z15 = zU0;
        }
        return this.F0.r(view, str, context, attributeSet, z15, z16, true, androidx.appcompat.widget.f1.c());
    }

    final int e1(f1 f1Var, Rect rect) {
        int iL;
        boolean z15;
        boolean z16;
        if (f1Var != null) {
            iL = f1Var.l();
        } else {
            iL = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f8204y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z15 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8204y.getLayoutParams();
            boolean z17 = true;
            if (this.f8204y.isShown()) {
                if (this.D0 == null) {
                    this.D0 = new Rect();
                    this.E0 = new Rect();
                }
                Rect rect2 = this.D0;
                Rect rect3 = this.E0;
                if (f1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f1Var.j(), f1Var.l(), f1Var.k(), f1Var.i());
                }
                g1.a(this.E, rect2, rect3);
                int i15 = rect2.top;
                int i16 = rect2.left;
                int i17 = rect2.right;
                f1 f1VarC = l0.C(this.E);
                int iJ = f1VarC == null ? 0 : f1VarC.j();
                int iK = f1VarC == null ? 0 : f1VarC.k();
                if (marginLayoutParams.topMargin == i15 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i17) {
                    z16 = false;
                } else {
                    marginLayoutParams.topMargin = i15;
                    marginLayoutParams.leftMargin = i16;
                    marginLayoutParams.rightMargin = i17;
                    z16 = true;
                }
                if (i15 <= 0 || this.G != null) {
                    View view = this.G;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i18 = marginLayoutParams2.height;
                        int i19 = marginLayoutParams.topMargin;
                        if (i18 != i19 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i19;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.G.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f8185l);
                    this.G = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.E.addView(this.G, -1, layoutParams);
                }
                View view3 = this.G;
                z17 = view3 != null;
                if (z17 && view3.getVisibility() != 0) {
                    f1(this.G);
                }
                if (!this.O && z17) {
                    iL = 0;
                }
                z15 = z17;
                z17 = z16;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z15 = false;
            } else {
                z15 = false;
                z17 = false;
            }
            if (z17) {
                this.f8204y.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.G;
        if (view4 != null) {
            view4.setVisibility(z15 ? 0 : 8);
        }
        return iL;
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return R(true);
    }

    void f0() {
        androidx.appcompat.view.menu.e eVar;
        f0 f0Var = this.f8195t;
        if (f0Var != null) {
            f0Var.l();
        }
        if (this.f8206z != null) {
            this.f8186m.getDecorView().removeCallbacks(this.A);
            if (this.f8206z.isShowing()) {
                try {
                    this.f8206z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f8206z = null;
        }
        i0();
        q qVarS0 = s0(0, false);
        if (qVarS0 == null || (eVar = qVarS0.f8239j) == null) {
            return;
        }
        eVar.close();
    }

    boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f8184k;
        if (((obj instanceof j6.m.a) || (obj instanceof androidx.appcompat.app.m)) && (decorView = this.f8186m.getDecorView()) != null && j6.m.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f8187n.b(this.f8186m.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    void h0(int i15) {
        q qVarS0;
        q qVarS1 = s0(i15, true);
        if (qVarS1.f8239j != null) {
            Bundle bundle = new Bundle();
            qVarS1.f8239j.R(bundle);
            if (bundle.size() > 0) {
                qVarS1.f8248s = bundle;
            }
            qVarS1.f8239j.e0();
            qVarS1.f8239j.clear();
        }
        qVarS1.f8247r = true;
        qVarS1.f8246q = true;
        if ((i15 != 108 && i15 != 0) || this.f8195t == null || (qVarS0 = s0(0, false)) == null) {
            return;
        }
        qVarS0.f8242m = false;
        O0(qVarS0, null);
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        Context context2;
        this.f8183h0 = true;
        int iB0 = B0(context, W());
        if (androidx.appcompat.app.f.w(context)) {
            androidx.appcompat.app.f.Q(context);
        }
        e6.h hVarV = V(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(c0(context2, iB0, hVarV, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(c0(context2, iB0, hVarV, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!M0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationC0 = c0(context2, iB0, hVarV, !configuration2.equals(configuration3) ? m0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, u.f434c);
        dVar.a(configurationC0);
        try {
            if (context2.getTheme() != null) {
                w5.h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void i0() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T l(int i15) {
        j0();
        return (T) this.f8186m.findViewById(i15);
    }

    q l0(Menu menu) {
        q[] qVarArr = this.X;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i15 = 0; i15 < length; i15++) {
            q qVar = qVarArr[i15];
            if (qVar != null && qVar.f8239j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f8185l;
    }

    final Context n0() {
        androidx.appcompat.app.a aVarT = t();
        Context contextJ = aVarT != null ? aVarT.j() : null;
        return contextJ == null ? this.f8185l : contextJ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return e0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public int p() {
        return this.f8196t0;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater r() {
        if (this.f8191r == null) {
            v0();
            androidx.appcompat.app.a aVar = this.f8189q;
            this.f8191r = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f8185l);
        }
        return this.f8191r;
    }

    e6.h r0(Configuration configuration) {
        return i.b(configuration);
    }

    protected q s0(int i15, boolean z15) {
        q[] qVarArr = this.X;
        if (qVarArr == null || qVarArr.length <= i15) {
            q[] qVarArr2 = new q[i15 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.X = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i15];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i15);
        qVarArr[i15] = qVar2;
        return qVar2;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a t() {
        v0();
        return this.f8189q;
    }

    final CharSequence t0() {
        Object obj = this.f8184k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f8193s;
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8185l);
        if (layoutInflaterFrom.getFactory() == null) {
            j6.n.a(layoutInflaterFrom, this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    final Window.Callback u0() {
        return this.f8186m.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        if (M0() == null || t().l()) {
            return;
        }
        z0(0);
    }

    @Override // androidx.appcompat.app.f
    public void x(Configuration configuration) {
        androidx.appcompat.app.a aVarT;
        if (this.K && this.D && (aVarT = t()) != null) {
            aVarT.m(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f8185l);
        this.f8194s0 = new Configuration(this.f8185l.getResources().getConfiguration());
        S(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void y(Bundle bundle) {
        String strC;
        this.f8183h0 = true;
        R(false);
        k0();
        Object obj = this.f8184k;
        if (obj instanceof Activity) {
            try {
                strC = s5.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarM0 = M0();
                if (aVarM0 == null) {
                    this.C0 = true;
                } else {
                    aVarM0.r(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f8194s0 = new Configuration(this.f8185l.getResources().getConfiguration());
        this.f8190q0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    public void z() {
        if (this.f8184k instanceof Activity) {
            androidx.appcompat.app.f.F(this);
        }
        if (this.f8207z0) {
            this.f8186m.getDecorView().removeCallbacks(this.B0);
        }
        this.f8192r0 = true;
        if (this.f8196t0 != -100) {
            Object obj = this.f8184k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                J0.put(this.f8184k.getClass().getName(), Integer.valueOf(this.f8196t0));
            } else {
                J0.remove(this.f8184k.getClass().getName());
            }
        } else {
            J0.remove(this.f8184k.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.f8189q;
        if (aVar != null) {
            aVar.n();
        }
        Z();
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        l1<String, Integer> l1Var;
        Integer num;
        androidx.appcompat.app.c cVarZ0;
        this.B = null;
        this.C = true;
        this.f8196t0 = -100;
        this.B0 = new a();
        this.f8185l = context;
        this.f8188p = dVar;
        this.f8184k = obj;
        if (this.f8196t0 == -100 && (obj instanceof Dialog) && (cVarZ0 = Z0()) != null) {
            this.f8196t0 = cVarZ0.D0().p();
        }
        if (this.f8196t0 == -100 && (num = (l1Var = J0).get(obj.getClass().getName())) != null) {
            this.f8196t0 = num.intValue();
            l1Var.remove(obj.getClass().getName());
        }
        if (window != null) {
            U(window);
        }
        androidx.appcompat.widget.k.h();
    }
}
