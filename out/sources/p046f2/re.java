package p046f2;

import CON.w;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.platform.j3;
import androidx.compose.ui.window.v;
import androidx.p016lifecycle.C6451z0;
import c5.d;
import c5.h;
import c5.t;
import fr.k;
import j6.i1;
import j6.z0;
import java.util.UUID;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import ua.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\"R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lf2/re;", "LCON/w;", "Landroidx/compose/ui/platform/j3;", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lf2/ef;", "properties", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroid/view/View;", "composeView", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(Ler/a;Lf2/ef;JLandroid/view/View;Lc5/t;Lc5/d;Ljava/util/UUID;Lfr/k;)V", "p", "(Lc5/t;)V", "Landroidx/compose/ui/window/v;", "securePolicy", "q", "(Landroidx/compose/ui/window/v;)V", "Lm2/v;", "parentComposition", "children", "n", "(Lm2/v;Ler/p;)V", "t", "(Ler/a;Lf2/ef;JLc5/t;)V", "m", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "e", "Ler/a;", "f", "Lf2/ef;", "g", "J", "h", "Landroid/view/View;", "Lf2/qe;", "j", "Lf2/qe;", "dialogLayout", "Lc5/h;", "k", "F", "maxSupportedElevation", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class re extends w implements j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onDismissRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ef properties;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long contentColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final qe dialogLayout;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"f2/re$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Loq/i0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57568a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f57568a = iArr;
        }
    }

    public /* synthetic */ re(er.a aVar, ef efVar, long j15, View view, t tVar, d dVar, UUID uuid, k kVar) {
        this(aVar, efVar, j15, view, tVar, dVar, uuid);
    }

    private final void p(t layoutDirection) {
        qe qeVar = this.dialogLayout;
        int i15 = b.f57568a[layoutDirection.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            throw new p();
        }
        qeVar.setLayoutDirection(i16);
    }

    private final void q(v securePolicy) {
        getWindow().setFlags(h2.v.a(securePolicy, C6458nf.r(this.composeView)) ? 8192 : -8193, PKIFailureInfo.certRevoked);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void m() {
        this.dialogLayout.h();
    }

    public final void n(p076m2.v parentComposition, er.p<? super r, ? super Integer, i0> children) {
        this.dialogLayout.s(parentComposition, children);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent) {
            this.onDismissRequest.a();
        }
        return zOnTouchEvent;
    }

    public final void t(er.a<i0> onDismissRequest, ef properties, long contentColor, t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.contentColor = contentColor;
        q(properties.getSecurePolicy());
        p(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        i1 i1VarA = z0.a(getWindow(), getWindow().getDecorView());
        Boolean isAppearanceLightStatusBars = properties.getIsAppearanceLightStatusBars();
        i1VarA.b(isAppearanceLightStatusBars != null ? isAppearanceLightStatusBars.booleanValue() : C6458nf.q(contentColor));
        Boolean isAppearanceLightNavigationBars = properties.getIsAppearanceLightNavigationBars();
        i1VarA.a(isAppearanceLightNavigationBars != null ? isAppearanceLightNavigationBars.booleanValue() : C6458nf.q(contentColor));
    }

    private re(er.a<i0> aVar, ef efVar, long j15, View view, t tVar, d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), jh.f56474a), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = efVar;
        this.contentColor = j15;
        this.composeView = view;
        float fN = h.n(8);
        this.maxSupportedElevation = fN;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        z0.b(window, false);
        qe qeVar = new qe(getContext(), window);
        qeVar.setTag(f3.p.J, "Dialog:" + uuid);
        qeVar.setClipChildren(false);
        qeVar.setElevation(dVar.l2(fN));
        qeVar.setOutlineProvider(new a());
        this.dialogLayout = qeVar;
        setContentView(qeVar);
        C6451z0.b(qeVar, C6451z0.a(view));
        androidx.p016lifecycle.View.b(qeVar, androidx.p016lifecycle.View.a(view));
        n.b(qeVar, n.a(view));
        t(this.onDismissRequest, this.properties, this.contentColor, tVar);
    }
}
