package androidx.compose.ui.window;

import CON.m0;
import CON.r0;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.j3;
import androidx.p016lifecycle.C6451z0;
import j6.z0;
import java.util.UUID;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010)R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Landroidx/compose/ui/window/m;", "LCON/w;", "Landroidx/compose/ui/platform/j3;", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Landroidx/compose/ui/window/l;", "properties", "Landroid/view/View;", "composeView", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Ler/a;Landroidx/compose/ui/window/l;Landroid/view/View;Lc5/t;Lc5/d;Ljava/util/UUID;)V", "q", "(Landroidx/compose/ui/window/l;)V", "v", "(Lc5/t;)V", "Landroidx/compose/ui/window/v;", "securePolicy", "w", "(Landroidx/compose/ui/window/v;)V", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "Lm2/v;", "parentComposition", "children", "u", "(Lm2/v;Ler/p;)V", "x", "(Ler/a;Landroidx/compose/ui/window/l;Lc5/t;)V", "t", "()V", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "e", "Ler/a;", "f", "Landroidx/compose/ui/window/l;", "g", "Landroid/view/View;", "Landroidx/compose/ui/window/k;", "h", "Landroidx/compose/ui/window/k;", "dialogLayout", "Lc5/h;", "j", "F", "maxSupportedElevation", "k", "Z", "isPressOutside", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends CON.w implements j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onDismissRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private l properties;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k dialogLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isPressOutside;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/m$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Loq/i0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LCON/m0;", "Loq/i0;", "c", "(LCON/m0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<m0, i0> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(m0 m0Var) {
            c(m0Var);
            return i0.f148189a;
        }

        public final void c(m0 m0Var) {
            if (m.this.properties.getDismissOnBackPress()) {
                m.this.onDismissRequest.a();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11122a;

        static {
            int[] iArr = new int[c5.t.values().length];
            try {
                iArr[c5.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c5.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11122a = iArr;
        }
    }

    public m(er.a<i0> aVar, l lVar, View view, c5.t tVar, c5.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), lVar.getDecorFitsSystemWindows() ? f3.r.f58809a : f3.r.f58810b), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = lVar;
        this.composeView = view;
        float fN = c5.h.n(8);
        this.maxSupportedElevation = fN;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        q(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        z0.b(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        if (!this.properties.getDecorFitsSystemWindows()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 28) {
                e.f11088a.a(attributes);
            }
            if (i15 >= 30) {
                f fVar = f.f11089a;
                fVar.b(attributes, 0);
                fVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        k kVar = new k(getContext(), window);
        setTitle(this.properties.getWindowTitle());
        kVar.setTag(f3.p.J, "Dialog:" + uuid);
        kVar.setClipChildren(false);
        kVar.setElevation(dVar.l2(fN));
        kVar.setOutlineProvider(new a());
        this.dialogLayout = kVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m(viewGroup);
        }
        setContentView(kVar);
        C6451z0.b(kVar, C6451z0.a(view));
        androidx.p016lifecycle.View.b(kVar, androidx.p016lifecycle.View.a(view));
        ua.n.b(kVar, ua.n.a(view));
        x(this.onDismissRequest, this.properties, tVar);
        r0.b(o(), this, false, new b(), 2, null);
    }

    private static final void m(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof k) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = viewGroup.getChildAt(i15);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m(viewGroup2);
            }
        }
    }

    private final void q(l properties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = properties.getWindowType();
            IBinder windowToken = properties.getWindowToken();
            if (windowToken != null) {
                attributes.token = windowToken;
            }
            window.setAttributes(attributes);
        }
    }

    private final void v(c5.t layoutDirection) {
        k kVar = this.dialogLayout;
        int i15 = c.f11122a[layoutDirection.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            throw new oq.p();
        }
        kVar.setLayoutDirection(i16);
    }

    private final void w(v securePolicy) {
        getWindow().setFlags(w.a(securePolicy, androidx.compose.ui.window.b.j(this.composeView)) ? 8192 : -8193, PKIFailureInfo.certRevoked);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (!this.properties.getDismissOnBackPress() || !event.isTracking() || event.isCanceled() || keyCode != 111) {
            return super.onKeyUp(keyCode, event);
        }
        this.onDismissRequest.a();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.t(event)) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.isPressOutside = false;
                return zOnTouchEvent;
            }
        } else {
            int actionMasked2 = event.getActionMasked();
            if (actionMasked2 == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.isPressOutside = false;
                    return zOnTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.a();
                this.isPressOutside = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    public final void t() {
        this.dialogLayout.h();
    }

    public final void u(p076m2.v parentComposition, er.p<? super p076m2.r, ? super Integer, i0> children) {
        this.dialogLayout.u(parentComposition, children);
    }

    public final void x(er.a<i0> onDismissRequest, l properties, c5.t layoutDirection) {
        int i15;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        w(properties.getSecurePolicy());
        v(layoutDirection);
        boolean decorFitsSystemWindows = properties.getDecorFitsSystemWindows();
        this.dialogLayout.v(properties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(properties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            if (decorFitsSystemWindows) {
                i15 = 0;
            } else {
                i15 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window.setSoftInputMode(i15);
        }
    }
}
