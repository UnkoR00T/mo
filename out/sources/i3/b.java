package i3;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.o2;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.p016lifecycle.DefaultLifecycleObserver;
import c5.v;
import er.l;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import n4.AccessibilityAction;
import n4.b0;
import n4.c0;
import n4.h0;
import n4.p;
import n4.w;
import n4.y;
import n4.z;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import r0.j0;
import r0.q;
import r0.r;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0003[aWB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u001d\u0010\"\u001a\u0004\u0018\u00010!*\u00020\r2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\n*\u00020\r2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010\fJ\u001f\u00100\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\fJ\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\fJ\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\nH\u0080@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\nH\u0000¢\u0006\u0004\bD\u0010\fJ\u000f\u00109\u001a\u00020\nH\u0000¢\u0006\u0004\b9\u0010\fJ\u000f\u0010E\u001a\u00020\nH\u0000¢\u0006\u0004\bE\u0010\fJ\u000f\u0010F\u001a\u00020\nH\u0000¢\u0006\u0004\bF\u0010\fJ\u000f\u0010G\u001a\u00020\nH\u0000¢\u0006\u0004\bG\u0010\fJ/\u0010O\u001a\u00020\n2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0001¢\u0006\u0004\bO\u0010PJ'\u0010U\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00002\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0RH\u0001¢\u0006\u0004\bU\u0010VR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR*\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010h\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010qR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\n0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010zR)\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\b|\u0010~\"\u0004\b\u007f\u0010\u0017R\u0018\u0010\u0082\u0001\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010nR \u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010tR\u0017\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010\u008c\u0001R \u0010\u0090\u0001\u001a\u0004\u0018\u00010y8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\f\u001a\u0006\b\u0081\u0001\u0010\u008e\u0001R\u0017\u0010\u0092\u0001\u001a\u00020s8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, d2 = {"Li3/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Li3/j;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Ler/a;)V", "Loq/i0;", "B", "()V", "Ln4/w;", "newNode", "Landroidx/compose/ui/platform/o2;", "oldNode", "A", "(Ln4/w;Landroidx/compose/ui/platform/o2;)V", "Lr0/q;", "Ln4/y;", "newSemanticsNodes", "g", "(Lr0/q;)V", "", "id", "", "newText", "C", "(ILjava/lang/String;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "r", "index", "Lj4/e;", "E", "(Ln4/w;I)Lj4/e;", "Lkotlin/Function2;", "action", "j", "(Ln4/w;Ler/p;)V", "virtualId", "viewStructure", "e", "(ILj4/e;)V", "f", "(I)V", "q", "node", "F", "(ILn4/w;)V", "G", "(Ln4/w;)V", "I", ip.a.f96138c, "o", "h", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/q;", "owner", "onStart", "(Landroidx/lifecycle/q;)V", "onStop", "d", "(Ltq/e;)Ljava/lang/Object;", "w", "y", "u", "s", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "t", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "z", "(Li3/b;Landroid/util/LongSparseArray;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "n", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Ler/a;", "getOnContentCaptureSession", "()Ler/a;", "setOnContentCaptureSession", "(Ler/a;)V", "c", "Li3/j;", "getContentCaptureSession$ui", "()Li3/j;", "setContentCaptureSession$ui", "(Li3/j;)V", "getContentCaptureSession$ui$annotations", "contentCaptureSession", "", "Li3/g;", "Ljava/util/List;", "bufferedEvents", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Li3/b$b;", "Li3/b$b;", "translateStatus", "", "Z", "currentSemanticsNodesInvalidated", "Llu/g;", "Llu/g;", "boundsUpdateChannel", "Landroid/os/Handler;", "Landroid/os/Handler;", "legacyMainHandler", "k", "Lr0/q;", "()Lr0/q;", "setCurrentSemanticsNodes$ui", "currentSemanticsNodes", "l", "currentSemanticsNodesSnapshotTimestampMillis", "Lr0/j0;", "m", "Lr0/j0;", "previousSemanticsNodes", "Landroidx/compose/ui/platform/o2;", "previousSemanticsRoot", "p", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "()Landroid/os/Handler;", "getHandler$ui$annotations", "handler", "()Z", "isEnabled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f88892s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.a<? extends j> onContentCaptureSession;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private j contentCaptureSession;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long currentSemanticsNodesSnapshotTimestampMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private o2 previousSemanticsRoot;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EnumC2090b translateStatus = EnumC2090b.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final lu.g<i0> boundsUpdateChannel = lu.j.b(1, null, null, 6, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private q<y> currentSemanticsNodes = r.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private j0<o2> previousSemanticsNodes = r.c();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: i3.a
        @Override // java.lang.Runnable
        public final void run() {
            b.i(this.f88890a);
        }
    };

    /* JADX INFO: renamed from: i3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li3/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum EnumC2090b {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f88911d = wq.b.a(b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Li3/b$c;", "", "<init>", "()V", "Li3/b;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "Loq/i0;", "b", "(Li3/b;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(Li3/b;[J[ILjava/util/function/Consumer;)V", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f88912a = new c();

        private c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void b(b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            y yVarB;
            w wVarB;
            AccessibilityAction accessibilityAction;
            l lVar;
            int size = response.size();
            for (int i15 = 0; i15 < size; i15++) {
                long jKeyAt = response.keyAt(i15);
                ViewTranslationResponse viewTranslationResponseA = i3.e.a(response.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (yVarB = contentCaptureManager.k().b((int) jKeyAt)) != null && (wVarB = yVarB.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) n4.q.a(wVarB.getUnmergedConfig(), p.f131279a.B())) != null && (lVar = (l) accessibilityAction.a()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar, LongSparseArray longSparseArray) {
            f88912a.b(bVar, longSparseArray);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x006d  */
        /* JADX WARN: Multi-variable type inference failed */
        public final void c(b contentCaptureManager, long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
            w wVarB;
            String strE;
            for (long j15 : virtualIds) {
                y yVarB = contentCaptureManager.k().b((int) j15);
                if (yVarB != null && (wVarB = yVarB.getSemanticsNode()) != null) {
                    i3.d.a();
                    ViewTranslationRequest.Builder builderA = i3.c.a(contentCaptureManager.getView().getAutofillId(), wVarB.getId());
                    List list = (List) n4.q.a(wVarB.getUnmergedConfig(), c0.f131174a.L());
                    if (list != null && (strE = e5.b.e(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        builderA.setValue("android:text", TranslationRequestValue.forText(new q4.e(strE, null, 2, 0 == true ? 1 : 0)));
                        requestsCollector.accept(builderA.build());
                    }
                }
            }
        }

        public final void d(final b contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: i3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c.e(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88913a;

        static {
            int[] iArr = new int[i3.h.values().length];
            try {
                iArr[i3.h.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.h.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88913a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f88914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f88915e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f88917g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f88915e = obj;
            this.f88917g |= PKIFailureInfo.systemUnavail;
            return b.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/w;", "it", "", "c", "(Ln4/w;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements l<w, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f88918b = new f();

        f() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(w wVar) {
            return Boolean.valueOf(z.a(wVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Ln4/w;", "child", "Loq/i0;", "c", "(ILn4/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.p<Integer, w, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o2 f88919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o2 o2Var, b bVar) {
            super(2);
            this.f88919b = o2Var;
            this.f88920c = bVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(Integer num, w wVar) {
            c(num.intValue(), wVar);
            return i0.f148189a;
        }

        public final void c(int i15, w wVar) {
            if (this.f88919b.getChildren().a(wVar.getId())) {
                return;
            }
            this.f88920c.F(i15, wVar);
            this.f88920c.r();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "i", "Ln4/w;", "child", "Loq/i0;", "c", "(ILn4/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends fr.w implements er.p<Integer, w, i0> {
        h() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(Integer num, w wVar) {
            c(num.intValue(), wVar);
            return i0.f148189a;
        }

        public final void c(int i15, w wVar) {
            b.this.F(i15, wVar);
        }
    }

    public b(AndroidComposeView androidComposeView, er.a<? extends j> aVar) {
        this.view = androidComposeView;
        this.onContentCaptureSession = aVar;
        this.previousSemanticsRoot = new o2(androidComposeView.getSemanticsOwner().d(), r.b());
    }

    private final void A(w newNode, o2 oldNode) {
        j(newNode, new g(oldNode, this));
        List<w> listV = newNode.v();
        int size = listV.size();
        for (int i15 = 0; i15 < size; i15++) {
            w wVar = listV.get(i15);
            if (k().a(wVar.getId()) && this.previousSemanticsNodes.a(wVar.getId())) {
                o2 o2VarB = this.previousSemanticsNodes.b(wVar.getId());
                if (o2VarB == null) {
                    d4.a.d("node not present in pruned tree before this change");
                    throw new oq.g();
                }
                A(wVar, o2VarB);
            }
        }
    }

    private final void B() {
        j0<o2> j0Var = this.previousSemanticsNodes;
        int[] iArr = j0Var.keys;
        long[] jArr = j0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = iArr[(i15 << 3) + i17];
                        if (!k().a(i18)) {
                            f(i18);
                            r();
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final void C(int id5, String newText) {
        j jVar;
        if (Build.VERSION.SDK_INT >= 29 && (jVar = this.contentCaptureSession) != null) {
            AutofillId autofillIdD = jVar.d(id5);
            if (autofillIdD != null) {
                jVar.e(autofillIdD, newText);
            } else {
                d4.a.d("Invalid content capture ID");
                throw new oq.g();
            }
        }
    }

    private final void D() {
        AccessibilityAction accessibilityAction;
        l lVar;
        q<y> qVarK = k();
        Object[] objArr = qVarK.values;
        long[] jArr = qVarK.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        SemanticsConfiguration semanticsConfigurationZ = ((y) objArr[(i15 << 3) + i17]).getSemanticsNode().getUnmergedConfig();
                        if (t.c(n4.q.a(semanticsConfigurationZ, c0.f131174a.x()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfigurationZ, p.f131279a.C())) != null && (lVar = (l) accessibilityAction.a()) != null) {
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final j4.e E(w wVar, int i15) {
        j4.a aVarA;
        AutofillId autofillIdA;
        String strE;
        j jVar = this.contentCaptureSession;
        if (jVar == null || Build.VERSION.SDK_INT < 29 || (aVarA = j4.d.a(this.view)) == null) {
            return null;
        }
        w wVarT = wVar.t();
        if (wVarT != null) {
            autofillIdA = jVar.d(wVarT.getId());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = aVarA.a();
        }
        j4.e eVarA = jVar.a(autofillIdA, wVar.getId());
        if (eVarA == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationZ = wVar.getUnmergedConfig();
        c0 c0Var = c0.f131174a;
        if (semanticsConfigurationZ.g(c0Var.D())) {
            return null;
        }
        Bundle bundleA = eVarA.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            bundleA.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i15);
        }
        String str = (String) n4.q.a(semanticsConfigurationZ, c0Var.K());
        if (str != null) {
            eVarA.e(wVar.getId(), null, null, str);
        }
        if (((Boolean) n4.q.a(semanticsConfigurationZ, c0Var.y())) != null) {
            eVarA.b("android.widget.ViewGroup");
        }
        List list = (List) n4.q.a(semanticsConfigurationZ, c0Var.L());
        if (list != null) {
            eVarA.b("android.widget.TextView");
            eVarA.f(e5.b.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        q4.e eVar = (q4.e) n4.q.a(semanticsConfigurationZ, c0Var.g());
        if (eVar != null) {
            eVarA.b("android.widget.EditText");
            eVarA.f(eVar);
        }
        List list2 = (List) n4.q.a(semanticsConfigurationZ, c0Var.d());
        if (list2 != null) {
            eVarA.c(e5.b.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        n4.l lVar = (n4.l) n4.q.a(semanticsConfigurationZ, c0Var.F());
        if (lVar != null && (strE = p2.e(lVar.getValue())) != null) {
            eVarA.b(strE);
        }
        TextLayoutResult t3VarC = p2.c(semanticsConfigurationZ);
        if (t3VarC != null) {
            TextLayoutInput s3VarL = t3VarC.getLayoutInput();
            eVarA.g(v.h(s3VarL.getStyle().n()) * s3VarL.getDensity().getDensity() * s3VarL.getDensity().getFontScale(), 0, 0, 0);
        }
        m3.g gVarJ = wVar.j();
        eVarA.d((int) gVarJ.getLeft(), (int) gVarJ.getTop(), 0, 0, (int) (gVarJ.getRight() - gVarJ.getLeft()), (int) (gVarJ.getBottom() - gVarJ.getTop()));
        return eVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int index, w node) {
        if (p()) {
            I(node);
            e(node.getId(), E(node, index));
            j(node, new h());
        }
    }

    private final void G(w node) {
        if (p()) {
            f(node.getId());
            List<w> listV = node.v();
            int size = listV.size();
            for (int i15 = 0; i15 < size; i15++) {
                G(listV.get(i15));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    private final void H() {
        this.previousSemanticsNodes.g();
        q<y> qVarK = k();
        int[] iArr = qVarK.keys;
        Object[] objArr = qVarK.values;
        long[] jArr = qVarK.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            this.previousSemanticsNodes.r(iArr[i18], new o2(((y) objArr[i18]).getSemanticsNode(), k()));
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        this.previousSemanticsRoot = new o2(this.view.getSemanticsOwner().d(), k());
    }

    private final void I(w node) {
        AccessibilityAction accessibilityAction;
        l lVar;
        l lVar2;
        SemanticsConfiguration semanticsConfigurationZ = node.getUnmergedConfig();
        Boolean bool = (Boolean) n4.q.a(semanticsConfigurationZ, c0.f131174a.x());
        if (this.translateStatus == EnumC2090b.SHOW_ORIGINAL && t.c(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) n4.q.a(semanticsConfigurationZ, p.f131279a.C());
            if (accessibilityAction2 == null || (lVar2 = (l) accessibilityAction2.a()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != EnumC2090b.SHOW_TRANSLATED || !t.c(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfigurationZ, p.f131279a.C())) == null || (lVar = (l) accessibilityAction.a()) == null) {
            return;
        }
    }

    private final void e(int virtualId, j4.e viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, i3.h.VIEW_APPEAR, viewStructure));
    }

    private final void f(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, i3.h.VIEW_DISAPPEAR, null));
    }

    private final void g(q<y> newSemanticsNodes) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j15;
        char c15;
        long j16;
        int i15;
        w wVar;
        int i16;
        w wVar2;
        long j17;
        int i17;
        long[] jArr3;
        q<y> qVar = newSemanticsNodes;
        int[] iArr3 = qVar.keys;
        long[] jArr4 = qVar.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j18 = jArr4[i18];
            char c16 = 7;
            long j19 = -9187201950435737472L;
            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8;
                int i25 = 8 - ((~(i18 - length)) >>> 31);
                int i26 = 0;
                while (i26 < i25) {
                    if ((j18 & 255) < 128) {
                        int i27 = iArr3[(i18 << 3) + i26];
                        c15 = c16;
                        o2 o2VarB = this.previousSemanticsNodes.b(i27);
                        y yVarB = qVar.b(i27);
                        w wVarB = yVarB != null ? yVarB.getSemanticsNode() : null;
                        if (wVarB == null) {
                            d4.a.d("no value for specified key");
                            throw new oq.g();
                        }
                        if (o2VarB == null) {
                            t0<h0<?>, Object> t0VarQ = wVarB.getUnmergedConfig().q();
                            j16 = j19;
                            Object[] objArr = t0VarQ.keys;
                            long[] jArr5 = t0VarQ.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i28 = 0;
                                int i29 = i19;
                                while (true) {
                                    long j25 = jArr5[i28];
                                    iArr2 = iArr3;
                                    if ((((~j25) << c15) & j25 & j16) != j16) {
                                        int i35 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j25 & 255) < 128) {
                                                i17 = i36;
                                                h0 h0Var = (h0) objArr[(i28 << 3) + i36];
                                                c0 c0Var = c0.f131174a;
                                                jArr3 = jArr4;
                                                if (t.c(h0Var, c0Var.L())) {
                                                    List list = (List) n4.q.a(wVarB.getUnmergedConfig(), c0Var.L());
                                                    C(wVarB.getId(), String.valueOf(list != null ? (q4.e) pq.v.n0(list) : null));
                                                }
                                            } else {
                                                i17 = i36;
                                                jArr3 = jArr4;
                                            }
                                            j25 >>= i29;
                                            i36 = i17 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i35 != i29) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i28 == length2) {
                                        break;
                                    }
                                    i28++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i29 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j16 = j19;
                            t0<h0<?>, Object> t0VarQ2 = wVarB.getUnmergedConfig().q();
                            Object[] objArr2 = t0VarQ2.keys;
                            long[] jArr6 = t0VarQ2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j26 = jArr6[i37];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j26) << c15) & j26 & j16) != j16) {
                                        int i38 = 8 - ((~(i37 - length3)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j26 & 255) < 128) {
                                                i16 = i39;
                                                h0 h0Var2 = (h0) objArr3[(i37 << 3) + i39];
                                                c0 c0Var2 = c0.f131174a;
                                                wVar2 = wVarB;
                                                if (t.c(h0Var2, c0Var2.L())) {
                                                    List list2 = (List) n4.q.a(o2VarB.getUnmergedConfig(), c0Var2.L());
                                                    q4.e eVar = list2 != null ? (q4.e) pq.v.n0(list2) : null;
                                                    j17 = j18;
                                                    List list3 = (List) n4.q.a(wVar2.getUnmergedConfig(), c0Var2.L());
                                                    q4.e eVar2 = list3 != null ? (q4.e) pq.v.n0(list3) : null;
                                                    if (!t.c(eVar, eVar2)) {
                                                        C(wVar2.getId(), String.valueOf(eVar2));
                                                    }
                                                }
                                                j26 >>= 8;
                                                i39 = i16 + 1;
                                                wVarB = wVar2;
                                                j18 = j17;
                                            } else {
                                                i16 = i39;
                                                wVar2 = wVarB;
                                            }
                                            j17 = j18;
                                            j26 >>= 8;
                                            i39 = i16 + 1;
                                            wVarB = wVar2;
                                            j18 = j17;
                                        }
                                        wVar = wVarB;
                                        j15 = j18;
                                        if (i38 != 8) {
                                            break;
                                        }
                                    } else {
                                        wVar = wVarB;
                                        j15 = j18;
                                    }
                                    if (i37 == length3) {
                                        break;
                                    }
                                    i37++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    wVarB = wVar;
                                    j18 = j15;
                                }
                            }
                            i15 = 8;
                        }
                        j15 = j18;
                        i15 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j15 = j18;
                        c15 = c16;
                        j16 = j19;
                        i15 = i19;
                    }
                    j18 = j15 >> i15;
                    i26++;
                    qVar = newSemanticsNodes;
                    i19 = i15;
                    c16 = c15;
                    j19 = j16;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i25 != i19) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i18 == length) {
                return;
            }
            i18++;
            qVar = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void h() {
        AccessibilityAction accessibilityAction;
        er.a aVar;
        q<y> qVarK = k();
        Object[] objArr = qVarK.values;
        long[] jArr = qVarK.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        SemanticsConfiguration semanticsConfigurationZ = ((y) objArr[(i15 << 3) + i17]).getSemanticsNode().getUnmergedConfig();
                        if (n4.q.a(semanticsConfigurationZ, c0.f131174a.x()) != null && (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfigurationZ, p.f131279a.a())) != null && (aVar = (er.a) accessibilityAction.a()) != null) {
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(b bVar) {
        if (bVar.p()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                Owner.f(bVar.view, false, 1, null);
                bVar.B();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    bVar.A(bVar.view.getSemanticsOwner().d(), bVar.previousSemanticsRoot);
                    i0 i0Var = i0.f148189a;
                    Trace.endSection();
                    bVar.g(bVar.k());
                    bVar.H();
                    bVar.checkingForSemanticsChanges = false;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        }
    }

    private final void j(w wVar, er.p<? super Integer, ? super w, i0> pVar) {
        List<w> listV = wVar.v();
        int size = listV.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            w wVar2 = listV.get(i16);
            if (k().a(wVar2.getId())) {
                pVar.B(Integer.valueOf(i15), wVar2);
                i15++;
            }
        }
    }

    private final void o() {
        AccessibilityAction accessibilityAction;
        l lVar;
        q<y> qVarK = k();
        Object[] objArr = qVarK.values;
        long[] jArr = qVarK.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        SemanticsConfiguration semanticsConfigurationZ = ((y) objArr[(i15 << 3) + i17]).getSemanticsNode().getUnmergedConfig();
                        if (t.c(n4.q.a(semanticsConfigurationZ, c0.f131174a.x()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfigurationZ, p.f131279a.C())) != null && (lVar = (l) accessibilityAction.a()) != null) {
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final void q() {
        j jVar = this.contentCaptureSession;
        if (jVar == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ContentCaptureEvent gVar = list.get(i15);
            int i16 = d.f88913a[gVar.getType().ordinal()];
            if (i16 == 1) {
                j4.e eVarB = gVar.getStructureCompat();
                if (eVarB != null) {
                    jVar.c(eVarB.h());
                }
            } else {
                if (i16 != 2) {
                    throw new oq.p();
                }
                AutofillId autofillIdD = jVar.d(gVar.getId());
                if (autofillIdD != null) {
                    jVar.b(autofillIdD);
                }
            }
        }
        jVar.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.boundsUpdateChannel.d(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (ju.z0.b(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(tq.e<? super oq.i0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof i3.b.e
            if (r0 == 0) goto L13
            r0 = r9
            i3.b$e r0 = (i3.b.e) r0
            int r1 = r0.f88917g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88917g = r1
            goto L18
        L13:
            i3.b$e r0 = new i3.b$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f88915e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f88917g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f88914d
            lu.i r2 = (lu.i) r2
            oq.u.b(r9)
        L2f:
            r9 = r2
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f88914d
            lu.i r2 = (lu.i) r2
            oq.u.b(r9)
            goto L58
        L41:
            oq.u.b(r9)
            lu.g<oq.i0> r9 = r8.boundsUpdateChannel
            lu.i r9 = r9.iterator()
        L4a:
            r0.f88914d = r9
            r0.f88917g = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L55
            goto L89
        L55:
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r2.next()
            boolean r9 = r8.p()
            if (r9 == 0) goto L6c
            r8.q()
        L6c:
            android.os.Handler r9 = r8.l()
            boolean r5 = r8.checkingForSemanticsChanges
            if (r5 != 0) goto L7d
            if (r9 == 0) goto L7d
            r8.checkingForSemanticsChanges = r4
            java.lang.Runnable r5 = r8.contentCaptureChangeChecker
            r9.post(r5)
        L7d:
            long r5 = r8.SendRecurringContentCaptureEventsIntervalMillis
            r0.f88914d = r2
            r0.f88917g = r3
            java.lang.Object r9 = ju.z0.b(r5, r0)
            if (r9 != r1) goto L2f
        L89:
            return r1
        L8a:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.d(tq.e):java.lang.Object");
    }

    public final q<y> k() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = b0.a(this.view.getSemanticsOwner(), -1, f.f88918b);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler l() {
        return f3.d.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.p016lifecycle.q owner) {
        this.contentCaptureSession = this.onContentCaptureSession.a();
        F(-1, this.view.getSemanticsOwner().d());
        q();
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.p016lifecycle.q owner) {
        G(this.view.getSemanticsOwner().d());
        q();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v15) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v15) {
        l().removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final boolean p() {
        return i.INSTANCE.a() && this.contentCaptureSession != null;
    }

    public final void s() {
        this.translateStatus = EnumC2090b.SHOW_ORIGINAL;
        h();
    }

    public final void t(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        c.f88912a.c(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void u() {
        this.translateStatus = EnumC2090b.SHOW_ORIGINAL;
        o();
    }

    public final void v() {
        this.currentSemanticsNodesInvalidated = true;
        if (p()) {
            r();
        }
    }

    public final void w() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handlerL = l();
        if (!p() || this.checkingForSemanticsChanges || handlerL == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handlerL.post(this.contentCaptureChangeChecker);
    }

    public final void y() {
        this.translateStatus = EnumC2090b.SHOW_TRANSLATED;
        D();
    }

    public final void z(b contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        c.f88912a.d(contentCaptureManager, response);
    }
}
