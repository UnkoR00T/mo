package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.j3;
import androidx.p016lifecycle.C6451z0;
import c3.m0;
import fr.o0;
import java.util.UUID;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0001\u0018\u0000 ¡\u00012\u00020\u00012\u00020\u0002:\u0001-BY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0019J#\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0017¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0014¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0004H\u0014¢\u0006\u0004\b0\u0010\u0019J\u001f\u00104\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0010¢\u0006\u0004\b4\u00105J7\u0010;\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u0002012\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u0002012\u0006\u0010:\u001a\u000201H\u0010¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J5\u0010A\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0004¢\u0006\u0004\bG\u0010\u0019J\u000f\u0010H\u001a\u00020\u0004H\u0001¢\u0006\u0004\bH\u0010\u0019J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0019J\r\u0010J\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010\u0019J\u0019\u0010L\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u000201H\u0016¢\u0006\u0004\bN\u0010OR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010PR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010`R \u0010e\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bJ\u0010b\u0012\u0004\bd\u0010\u0019\u001a\u0004\bc\u0010#R\"\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010p\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010 R/\u0010x\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010q8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR/\u0010D\u001a\u0004\u0018\u00010C2\b\u0010r\u001a\u0004\u0018\u00010C8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010s\u001a\u0004\by\u0010z\"\u0004\b{\u0010FR\u0018\u0010}\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010|R\u001d\u0010\u0081\u0001\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bA\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0089\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u0089\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0091\u0001R<\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010s\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010\u009b\u0001\u001a\u00020\u00122\u0007\u0010\u0098\u0001\u001a\u00020\u00128\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010\\\u001a\u0006\b\u009a\u0001\u0010\u0080\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0089\u0001R\u0017\u0010 \u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/ui/window/n;", "Landroidx/compose/ui/platform/b;", "Landroidx/compose/ui/platform/j3;", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Landroidx/compose/ui/window/u;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lc5/d;", "density", "Landroidx/compose/ui/window/t;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "", "isNested", "Landroidx/compose/ui/window/p;", "popupLayoutHelper", "<init>", "(Ler/a;Landroidx/compose/ui/window/u;Ljava/lang/String;Landroid/view/View;Lc5/d;Landroidx/compose/ui/window/t;Ljava/util/UUID;ZLandroidx/compose/ui/window/p;)V", "t", "()V", "u", "C", "(Landroidx/compose/ui/window/u;)V", "Lc5/t;", "layoutDirection", "y", "(Lc5/t;)V", "Landroid/view/WindowManager$LayoutParams;", "r", "()Landroid/view/WindowManager$LayoutParams;", "Lc5/p;", "getDisplayBounds", "()Lc5/p;", "x", "Lm2/v;", "parent", "content", "w", "(Lm2/v;Ler/p;)V", "c", "(Lm2/r;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "k", "(II)V", "changed", "left", "top", "right", "bottom", "j", "(ZIIII)V", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "z", "(Ler/a;Landroidx/compose/ui/window/u;Ljava/lang/String;Lc5/t;)V", "Le4/b0;", "parentLayoutCoordinates", "B", "(Le4/b0;)V", "v", "A", ip.a.f96138c, "s", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "Ler/a;", "l", "Landroidx/compose/ui/window/u;", "m", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "n", "Landroid/view/View;", "p", "Z", "q", "Landroidx/compose/ui/window/p;", "Landroid/view/WindowManager;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui", "getParams$ui$annotations", "params", "Landroidx/compose/ui/window/t;", "getPositionProvider", "()Landroidx/compose/ui/window/t;", "setPositionProvider", "(Landroidx/compose/ui/window/t;)V", "positionProvider", "Lc5/t;", "getParentLayoutDirection", "()Lc5/t;", "setParentLayoutDirection", "parentLayoutDirection", "Lc5/r;", "<set-?>", "Lm2/a3;", "getPopupContentSize-bOM6tXw", "()Lc5/r;", "setPopupContentSize-fhxjrPA", "(Lc5/r;)V", "popupContentSize", "getParentLayoutCoordinates", "()Le4/b0;", "setParentLayoutCoordinates", "Lc5/p;", "parentBounds", "Lm2/f6;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lc5/h;", "F", "maxSupportedElevation", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "", "[I", "parentLocationOnScreen", "parentLocationInWindow", "Lc3/m0;", "E", "Lc3/m0;", "snapshotStateObserver", "", "Ljava/lang/Object;", "backCallback", "G", "getContent", "()Ler/p;", "setContent", "(Ler/p;)V", "value", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "I", "locationOnScreen", "getSubCompositionView", "()Landroidx/compose/ui/platform/b;", "subCompositionView", "K", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class n extends androidx.compose.ui.platform.b implements j3 {
    private static final c K = new c(null);
    public static final int L = 8;
    private static final er.l<n, i0> O = b.f11137b;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final float maxSupportedElevation;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Rect previousWindowVisibleFrame;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int[] parentLocationOnScreen;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int[] parentLocationInWindow;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final m0 snapshotStateObserver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Object backCallback;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final a3 content;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int[] locationOnScreen;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onDismissRequest;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private u properties;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String testTag;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isNested;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p popupLayoutHelper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t positionProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private c5.t parentLayoutDirection;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a3 popupContentSize;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final a3 parentLayoutCoordinates;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private c5.p parentBounds;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final f6 canCalculatePosition;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/n$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Loq/i0;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/n;", "popupLayout", "Loq/i0;", "c", "(Landroidx/compose/ui/window/n;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<n, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f11137b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n nVar) {
            c(nVar);
            return i0.f148189a;
        }

        public final void c(n nVar) {
            if (nVar.isAttachedToWindow()) {
                nVar.D();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/n$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/n;", "Loq/i0;", "onCommitAffectingPopupPosition", "Ler/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11139c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i15) {
            super(2);
            this.f11139c = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            n.this.c(rVar, g4.a(this.f11139c | 1));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11140a;

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
            f11140a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.a<Boolean> {
        f() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            b0 parentLayoutCoordinates = n.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.c()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || n.this.m28getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "command", "e", "(Ler/a;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<er.a<? extends i0>, i0> {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(er.a aVar) {
            aVar.a();
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(er.a<? extends i0> aVar) {
            e(aVar);
            return i0.f148189a;
        }

        public final void e(final er.a<i0> aVar) {
            Handler handler = n.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.a();
                return;
            }
            Handler handler2 = n.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.g.f(aVar);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class h extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f11143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f11144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c5.p f11145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f11146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f11147f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o0 o0Var, n nVar, c5.p pVar, long j15, long j16) {
            super(0);
            this.f11143b = o0Var;
            this.f11144c = nVar;
            this.f11145d = pVar;
            this.f11146e = j15;
            this.f11147f = j16;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11143b.f66408a = this.f11144c.getPositionProvider().a(this.f11145d, this.f11146e, this.f11144c.getParentLayoutDirection(), this.f11147f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(er.a aVar, u uVar, String str, View view, c5.d dVar, t tVar, UUID uuid, boolean z15, p pVar, int i15, fr.k kVar) {
        p rVar;
        if ((i15 & 256) != 0) {
            int i16 = Build.VERSION.SDK_INT;
            rVar = i16 >= 30 ? new r() : i16 >= 29 ? new q() : new s();
        } else {
            rVar = pVar;
        }
        this(aVar, uVar, str, view, dVar, tVar, uuid, z15, rVar);
    }

    private final void C(u properties) {
        if (fr.t.c(this.properties, properties)) {
            return;
        }
        if (properties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = properties;
        this.params.flags = androidx.compose.ui.window.b.h(properties, androidx.compose.ui.window.b.j(this.composeView));
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    private final er.p<p076m2.r, Integer, i0> getContent() {
        return (er.p) this.content.getValue();
    }

    private final c5.p getDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        if (this.properties.a()) {
            this.popupLayoutHelper.a(this.composeView, rect);
        } else {
            this.popupLayoutHelper.d(this.composeView, rect);
        }
        return androidx.compose.ui.window.b.k(rect);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 getParentLayoutCoordinates() {
        return (b0) this.parentLayoutCoordinates.getValue();
    }

    private final WindowManager.LayoutParams r() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.b.h(this.properties, androidx.compose.ui.window.b.j(this.composeView));
        layoutParams.type = this.properties.getWindowType();
        IBinder windowToken = this.properties.getWindowToken();
        if (windowToken == null) {
            windowToken = this.composeView.getApplicationWindowToken();
        }
        layoutParams.token = windowToken;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(f3.q.f58794e));
        return layoutParams;
    }

    private final void setContent(er.p<? super p076m2.r, ? super Integer, i0> pVar) {
        this.content.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(b0 b0Var) {
        this.parentLayoutCoordinates.setValue(b0Var);
    }

    private final void t() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = androidx.compose.ui.window.h.b(this.onDismissRequest);
        }
        androidx.compose.ui.window.h.d(this, this.backCallback);
    }

    private final void u() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.h.e(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void y(c5.t layoutDirection) {
        int i15 = e.f11140a[layoutDirection.ordinal()];
        int i16 = 1;
        if (i15 == 1) {
            i16 = 0;
        } else if (i15 != 2) {
            throw new oq.p();
        }
        super.setLayoutDirection(i16);
    }

    public final void A() {
        b0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.c()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jB = parentLayoutCoordinates.b();
            long jI = this.isNested ? c0.i(parentLayoutCoordinates) : c0.h(parentLayoutCoordinates);
            c5.p pVarA = c5.q.a(c5.n.d((((long) Math.round(Float.intBitsToFloat((int) (jI >> 32)))) << 32) | (BodyPartID.bodyIdMax & ((long) Math.round(Float.intBitsToFloat((int) (jI & BodyPartID.bodyIdMax)))))), jB);
            if (fr.t.c(pVarA, this.parentBounds)) {
                return;
            }
            this.parentBounds = pVarA;
            D();
        }
    }

    public final void B(b0 parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        A();
    }

    public final void D() {
        c5.r rVarM28getPopupContentSizebOM6tXw;
        c5.p pVar = this.parentBounds;
        if (pVar == null || (rVarM28getPopupContentSizebOM6tXw = m28getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long packedValue = rVarM28getPopupContentSizebOM6tXw.getPackedValue();
        c5.p displayBounds = getDisplayBounds();
        long jC = c5.r.c((((long) displayBounds.k()) << 32) | (((long) displayBounds.f()) & BodyPartID.bodyIdMax));
        o0 o0Var = new o0();
        o0Var.f66408a = c5.n.INSTANCE.b();
        this.snapshotStateObserver.k(this, O, new h(o0Var, this, pVar, jC, packedValue));
        this.params.x = c5.n.i(o0Var.f66408a);
        this.params.y = c5.n.j(o0Var.f66408a);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.c(this, (int) (jC >> 32), (int) (jC & BodyPartID.bodyIdMax));
        }
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.b
    public void c(p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-857613600);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-857613600, i16, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:715)");
            }
            getContent().B(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new d(i15));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() == 4 || event.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(event, this);
                return true;
            }
            if (event.getAction() == 1 && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                er.a<i0> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final c5.t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final c5.r m28getPopupContentSizebOM6tXw() {
        return (c5.r) this.popupContentSize.getValue();
    }

    public final t getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.b
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.j3
    public androidx.compose.ui.platform.b getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.j3
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.b
    public void j(boolean changed, int left, int top, int right, int bottom) {
        View childAt;
        super.j(changed, left, top, right, bottom);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.b(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.ui.platform.b
    public void k(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.k(widthMeasureSpec, heightMeasureSpec);
        } else {
            c5.p displayBounds = getDisplayBounds();
            super.k(View.MeasureSpec.makeMeasureSpec(displayBounds.k(), PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(displayBounds.f(), PKIFailureInfo.systemUnavail));
        }
    }

    @Override // androidx.compose.ui.platform.b, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.q();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.r();
        this.snapshotStateObserver.f();
        u();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            er.a<i0> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.a();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        er.a<i0> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.a();
        }
        return true;
    }

    public final void s() {
        C6451z0.b(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(c5.t tVar) {
        this.parentLayoutDirection = tVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m29setPopupContentSizefhxjrPA(c5.r rVar) {
        this.popupContentSize.setValue(rVar);
    }

    public final void setPositionProvider(t tVar) {
        this.positionProvider = tVar;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void v() {
        if (isAttachedToWindow()) {
            int[] iArr = this.locationOnScreen;
            int i15 = iArr[0];
            int i16 = iArr[1];
            this.composeView.getLocationOnScreen(iArr);
            int[] iArr2 = this.locationOnScreen;
            if (i15 == iArr2[0] && i16 == iArr2[1]) {
                return;
            }
            A();
        }
    }

    public final void w(p076m2.v parent, er.p<? super p076m2.r, ? super Integer, i0> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void x() {
        this.windowManager.addView(this, this.params);
    }

    public final void z(er.a<i0> onDismissRequest, u properties, String testTag, c5.t layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        C(properties);
        y(layoutDirection);
    }

    public n(er.a<i0> aVar, u uVar, String str, View view, c5.d dVar, t tVar, UUID uuid, boolean z15, p pVar) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = aVar;
        this.properties = uVar;
        this.testTag = str;
        this.composeView = view;
        this.isNested = z15;
        this.popupLayoutHelper = pVar;
        this.windowManager = (WindowManager) view.getContext().getSystemService("window");
        this.params = r();
        this.positionProvider = tVar;
        this.parentLayoutDirection = c5.t.Ltr;
        this.popupContentSize = c6.e(null, null, 2, null);
        this.parentLayoutCoordinates = c6.e(null, null, 2, null);
        this.canCalculatePosition = x5.d(new f());
        float fN = c5.h.n(8);
        this.maxSupportedElevation = fN;
        this.previousWindowVisibleFrame = new Rect();
        this.parentLocationOnScreen = new int[2];
        this.parentLocationInWindow = new int[2];
        this.snapshotStateObserver = new m0(new g());
        setId(R.id.content);
        C6451z0.b(this, C6451z0.a(view));
        androidx.p016lifecycle.View.b(this, androidx.p016lifecycle.View.a(view));
        ua.n.b(this, ua.n.a(view));
        setTag(f3.p.J, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.l2(fN));
        setOutlineProvider(new a());
        this.content = c6.e(j.f11095a.a(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
