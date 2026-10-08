package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import java.util.Set;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c4;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0002\u0089\u0001\b\u0007\u0018\u00002\u00020\u0001BG\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B;\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010AR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b-\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010T\u001a\u0004\b<\u0010UR\u001a\u0010Z\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010X\u001a\u0004\b6\u0010YR \u0010_\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u0010\\\u0012\u0004\b^\u0010\u0014\u001a\u0004\bI\u0010]R \u0010a\u001a\b\u0012\u0004\u0012\u00020`0C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010E\u001a\u0004\bD\u0010GR\u001a\u0010f\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bN\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010n\u001a\u0004\bc\u0010oR\u001a\u0010u\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010r\u001a\u0004\bs\u0010tR\u001a\u0010y\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010w\u001a\u0004\b1\u0010xR$\u0010\u007f\u001a\u00020z2\u0006\u0010{\u001a\u00020z8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u0010|\u001a\u0004\b}\u0010~R(\u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0001@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bs\u0010\u0081\u0001\u001a\u0005\bh\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u008a\u0001¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/platform/e1;", "", "composeViewContext", "Landroid/view/View;", "view", "Lm2/v;", "compositionContext", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lua/j;", "savedStateRegistryOwner", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "", "matchesContext", "<init>", "(Landroidx/compose/ui/platform/e1;Landroid/view/View;Lm2/v;Landroidx/lifecycle/q;Lua/j;Landroidx/lifecycle/y0;Z)V", "(Landroid/view/View;Lm2/v;Landroidx/lifecycle/q;Lua/j;Landroidx/lifecycle/y0;)V", "Loq/i0;", "y", "()V", "z", "w", "c", "Landroid/content/res/Configuration;", "configuration", "x", "(Landroid/content/res/Configuration;)V", "b", "(Landroid/view/View;Lm2/v;Landroidx/lifecycle/q;Lua/j;Landroidx/lifecycle/y0;)Landroidx/compose/ui/platform/e1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Ler/p;Lm2/r;I)V", "Landroid/view/View;", "s", "()Landroid/view/View;", "Lm2/v;", "h", "()Lm2/v;", "Landroidx/lifecycle/q;", "m", "()Landroidx/lifecycle/q;", "d", "Lua/j;", "o", "()Lua/j;", "e", "Landroidx/lifecycle/y0;", "u", "()Landroidx/lifecycle/y0;", "Ll4/b;", "f", "Ll4/b;", "l", "()Ll4/b;", "imageVectorCache", "Ll4/d;", "g", "Ll4/d;", "n", "()Ll4/d;", "resourceIdCache", "Landroid/content/res/Configuration;", "currentConfiguration", "Lm2/a3;", "i", "Lm2/a3;", "getConfiguration$ui", "()Lm2/a3;", "Landroidx/compose/ui/platform/k;", "j", "Landroidx/compose/ui/platform/k;", "()Landroidx/compose/ui/platform/k;", "accessibilityManager", "Landroidx/compose/ui/platform/m0;", "k", "Landroidx/compose/ui/platform/m0;", "r", "()Landroidx/compose/ui/platform/m0;", "uriHandler", "Landroidx/compose/ui/platform/m;", "Landroidx/compose/ui/platform/m;", "()Landroidx/compose/ui/platform/m;", "clipboardManager", "Landroidx/compose/ui/platform/l;", "Landroidx/compose/ui/platform/l;", "()Landroidx/compose/ui/platform/l;", "clipboard", "Lu4/k$b;", "Lu4/k$b;", "()Lu4/k$b;", "getFontLoader$ui$annotations", "fontLoader", "Lu4/l$b;", "fontFamilyResolver", "Lv3/a;", "p", "Lv3/a;", "()Lv3/a;", "hapticFeedback", "Landroidx/compose/ui/platform/n0;", "q", "Landroidx/compose/ui/platform/n0;", "t", "()Landroidx/compose/ui/platform/n0;", "viewConfiguration", "Lg4/e0;", "Lg4/e0;", "()Lg4/e0;", "sharedDrawScope", "Landroidx/compose/ui/platform/a2;", "Landroidx/compose/ui/platform/a2;", "v", "()Landroidx/compose/ui/platform/a2;", "windowInfo", "Ln3/i1;", "Ln3/i1;", "()Ln3/i1;", "canvasHolder", "", "value", "I", "getViewCount$ui", "()I", "viewCount", "Lc5/r;", "J", "()J", "setTestWindowSize-ozmzZPI$ui", "(J)V", "testWindowSize", "Landroidx/compose/ui/platform/i1;", "Ler/a;", "calculateWindowSizeLambda", "androidx/compose/ui/platform/e1$e", "Landroidx/compose/ui/platform/e1$e;", "callback", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.v compositionContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.q lifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ua.j savedStateRegistryOwner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.y0 viewModelStoreOwner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l4.b imageVectorCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l4.d resourceIdCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Configuration currentConfiguration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3<Configuration> configuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k accessibilityManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m0 uriHandler;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m clipboardManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l clipboard;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u4.k.b fontLoader;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3<u4.l.b> fontFamilyResolver;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final v3.a hapticFeedback;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final n0 viewConfiguration;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final g4.e0 sharedDrawScope;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final a2 windowInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final n3.i1 canvasHolder;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int viewCount;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long testWindowSize;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final er.a<i1> calculateWindowSizeLambda;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final e callback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<p076m2.s0, p076m2.r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j1 f10481b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.e1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/e1$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0226a implements p076m2.r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j1 f10482a;

            public C0226a(j1 j1Var) {
                this.f10482a = j1Var;
            }

            @Override // p076m2.r0
            public void j() {
                this.f10482a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j1 j1Var) {
            super(1);
            this.f10481b = j1Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p076m2.r0 b(p076m2.s0 s0Var) {
            return new C0226a(this.f10481b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f10483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1 f10484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10485d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AndroidComposeView f10486b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e1 f10487c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10488d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(AndroidComposeView androidComposeView, e1 e1Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
                super(2);
                this.f10486b = androidComposeView;
                this.f10487c = e1Var;
                this.f10488d = pVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
                c(rVar, num.intValue());
                return oq.i0.f148189a;
            }

            public final void c(p076m2.r rVar, int i15) {
                if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                    rVar.O();
                    return;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1423844166, i15, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous>.<anonymous> (ComposeViewContext.android.kt:439)");
                }
                g1.a(this.f10486b, this.f10487c.getUriHandler(), this.f10488d, rVar, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(AndroidComposeView androidComposeView, e1 e1Var, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
            super(2);
            this.f10483b = androidComposeView;
            this.f10484c = e1Var;
            this.f10485d = pVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1317454175, i15, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals.<anonymous> (ComposeViewContext.android.kt:436)");
            }
            if (f3.h.isMediaQueryIntegrationEnabled) {
                rVar.X(866239106);
                p076m2.d0.c(f3.l.a().d(g3.a.k(this.f10483b.getContext(), this.f10483b.getView(), this.f10483b.getWindowInfo(), rVar, 0)), y2.m.d(-1423844166, true, new a(this.f10483b, this.f10484c, this.f10485d), rVar, 54), rVar, c4.f122821i | 48);
                rVar.R();
            } else {
                rVar.X(866651995);
                g1.a(this.f10483b, this.f10484c.getUriHandler(), this.f10485d, rVar, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f10490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f10491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10492e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AndroidComposeView androidComposeView, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, int i15) {
            super(2);
            this.f10490c = androidComposeView;
            this.f10491d = pVar;
            this.f10492e = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            e1.this.a(this.f10490c, this.f10491d, rVar, g4.a(this.f10492e | 1));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/i1;", "c", "()Landroidx/compose/ui/platform/i1;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.a<i1> {
        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i1 a() {
            return c5.r.e(e1.this.getTestWindowSize(), c5.r.INSTANCE.a()) ? q0.a(e1.this.getView()) : i1.INSTANCE.b(e1.this.getTestWindowSize(), c5.a.a(e1.this.getView().getContext()));
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"androidx/compose/ui/platform/e1$e", "Landroid/content/ComponentCallbacks2;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "Landroid/content/res/Configuration;", "configuration", "Loq/i0;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
        e() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            e1.this.x(configuration);
        }

        @Override // android.content.ComponentCallbacks
        @oq.a
        public void onLowMemory() {
            e1.this.getImageVectorCache().a();
            e1.this.getResourceIdCache().a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            e1.this.getImageVectorCache().a();
            e1.this.getResourceIdCache().a();
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean hasFocus) {
            e1.this.getWindowInfo().f(hasFocus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e1(e1 e1Var, View view, p076m2.v vVar, androidx.p016lifecycle.q qVar, ua.j jVar, androidx.p016lifecycle.y0 y0Var, boolean z15) {
        n3.i1 i1Var;
        g4.e0 e0Var;
        l4.d dVar;
        this.view = view;
        this.compositionContext = vVar;
        this.lifecycleOwner = qVar;
        this.savedStateRegistryOwner = jVar;
        this.viewModelStoreOwner = y0Var;
        this.imageVectorCache = z15 ? e1Var.imageVectorCache : new l4.b();
        this.resourceIdCache = (e1Var == null || (dVar = e1Var.resourceIdCache) == null) ? new l4.d() : dVar;
        Configuration configuration = z15 ? e1Var.currentConfiguration : new Configuration(view.getContext().getResources().getConfiguration());
        this.currentConfiguration = configuration;
        p3.a aVar = null;
        Object[] objArr = 0;
        this.configuration = z15 ? e1Var.configuration : c6.e(new Configuration(configuration), null, 2, null);
        this.accessibilityManager = z15 ? e1Var.accessibilityManager : new k(view.getContext());
        this.uriHandler = z15 ? e1Var.uriHandler : new m0(view.getContext());
        m mVar = z15 ? e1Var.clipboardManager : new m(view.getContext());
        this.clipboardManager = mVar;
        this.clipboard = z15 ? e1Var.clipboard : new l(mVar);
        this.fontLoader = z15 ? e1Var.fontLoader : new g0(view.getContext());
        this.fontFamilyResolver = z15 ? e1Var.fontFamilyResolver : x5.i(u4.r.a(view.getContext()), x5.o());
        this.hapticFeedback = view == (e1Var != null ? e1Var.view : null) ? e1Var.hapticFeedback : new v3.c(view);
        this.viewConfiguration = z15 ? e1Var.viewConfiguration : new n0(ViewConfiguration.get(view.getContext()));
        this.sharedDrawScope = (e1Var == null || (e0Var = e1Var.sharedDrawScope) == null) ? new g4.e0(aVar, 1, objArr == true ? 1 : 0) : e0Var;
        this.windowInfo = new a2();
        this.canvasHolder = (e1Var == null || (i1Var = e1Var.canvasHolder) == null) ? new n3.i1() : i1Var;
        this.testWindowSize = c5.r.INSTANCE.a();
        this.calculateWindowSizeLambda = new d();
        this.callback = new e();
    }

    private final void y() {
        this.view.getContext().registerComponentCallbacks(this.callback);
        x(this.view.getResources().getConfiguration());
        this.windowInfo.f(this.view.hasWindowFocus());
        this.windowInfo.e(this.calculateWindowSizeLambda);
        a2 a2Var = this.windowInfo;
        er.a<i1> aVar = this.calculateWindowSizeLambda;
        p076m2.a3 a3Var = a2Var._containerSize;
        if (a3Var != null) {
            a3Var.setValue(aVar.a());
        }
        this.view.getViewTreeObserver().addOnWindowFocusChangeListener(this.callback);
    }

    private final void z() {
        this.view.getContext().unregisterComponentCallbacks(this.callback);
        this.windowInfo.e(null);
        this.view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.callback);
    }

    public final void a(AndroidComposeView androidComposeView, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(123858079);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(androidComposeView) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(this) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(123858079, i16, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals (ComposeViewContext.android.kt:403)");
            }
            Object tag = androidComposeView.getTag(f3.p.M);
            Set<e3.h> set = null;
            Set<e3.h> set2 = fr.w0.r(tag) ? (Set) tag : null;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(f3.p.M) : null;
                if (fr.w0.r(tag2)) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(rVarH.F());
                rVarH.z();
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = l1.b(androidComposeView, this.savedStateRegistryOwner);
                rVarH.v(objE);
            }
            j1 j1Var = (j1) objE;
            oq.i0 i0Var = oq.i0.f148189a;
            boolean zG = rVarH.G(j1Var);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(j1Var);
                rVarH.v(objE2);
            }
            Function0.a(i0Var, (er.l) objE2, rVarH, 6);
            boolean zBooleanValue = ((Boolean) rVarH.N(g1.q())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean zW = rVarH.W(androidComposeView.getView());
            Object objE3 = rVarH.E();
            if (zW || objE3 == companion.a()) {
                objE3 = new l3(androidComposeView.getView());
                rVarH.v(objE3);
            }
            p076m2.d0.d(new c4[]{m7.n.c().d(this.lifecycleOwner), va.b.c().d(this.savedStateRegistryOwner), AndroidCompositionLocals_androidKt.d().d(this.imageVectorCache), AndroidCompositionLocals_androidKt.e().d(this.resourceIdCache), AndroidCompositionLocals_androidKt.c().d(androidComposeView.getContext()), e3.s.c().d(set), AndroidCompositionLocals_androidKt.b().d(androidComposeView.getConfiguration()), b3.u.g().d(j1Var), AndroidCompositionLocals_androidKt.g().d(androidComposeView.getView()), g1.p().d(Boolean.valueOf(zBooleanValue)), g1.u().d(androidComposeView.getViewConfiguration()), p076m2.n1.c().d((l3) objE3)}, y2.m.d(1317454175, true, new b(androidComposeView, this, pVar), rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new c(androidComposeView, pVar, i15));
        }
    }

    public final e1 b(View view, p076m2.v compositionContext, androidx.p016lifecycle.q lifecycleOwner, ua.j savedStateRegistryOwner, androidx.p016lifecycle.y0 viewModelStoreOwner) {
        return new e1(this, view, compositionContext, lifecycleOwner, savedStateRegistryOwner, viewModelStoreOwner, false, 64, null);
    }

    public final void c() {
        int i15 = this.viewCount - 1;
        this.viewCount = i15;
        if (i15 < 0) {
            io.sentry.android.core.c2.e("ComposeViewContext", "View count has dropped below 0");
            this.viewCount = 0;
        }
        if (this.viewCount == 0) {
            z();
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getAccessibilityManager() {
        return this.accessibilityManager;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n3.i1 getCanvasHolder() {
        return this.canvasHolder;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getClipboard() {
        return this.clipboard;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p076m2.v getCompositionContext() {
        return this.compositionContext;
    }

    public final p076m2.a3<u4.l.b> i() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final u4.k.b getFontLoader() {
        return this.fontLoader;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final v3.a getHapticFeedback() {
        return this.hapticFeedback;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final l4.b getImageVectorCache() {
        return this.imageVectorCache;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.p016lifecycle.q getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final l4.d getResourceIdCache() {
        return this.resourceIdCache;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ua.j getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final g4.e0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getTestWindowSize() {
        return this.testWindowSize;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final m0 getUriHandler() {
        return this.uriHandler;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final n0 getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final androidx.p016lifecycle.y0 getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final a2 getWindowInfo() {
        return this.windowInfo;
    }

    public final void w() {
        int i15 = this.viewCount + 1;
        this.viewCount = i15;
        if (i15 == 1) {
            y();
        }
    }

    public final void x(Configuration configuration) {
        int iUpdateFrom = this.currentConfiguration.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            this.imageVectorCache.c(iUpdateFrom);
            this.configuration.setValue(new Configuration(configuration));
            this.resourceIdCache.a();
            if ((268435456 & iUpdateFrom) != 0) {
                this.fontFamilyResolver.setValue(u4.r.a(this.view.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                a2 a2Var = this.windowInfo;
                er.a<i1> aVar = this.calculateWindowSizeLambda;
                p076m2.a3 a3Var = a2Var._containerSize;
                if (a3Var != null) {
                    a3Var.setValue(aVar.a());
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ e1(e1 e1Var, View view, p076m2.v vVar, androidx.p016lifecycle.q qVar, ua.j jVar, androidx.p016lifecycle.y0 y0Var, boolean z15, int i15, fr.k kVar) {
        View view2;
        if ((i15 & 64) != 0) {
            z15 = fr.t.c((e1Var == null || (view2 = e1Var.view) == null) ? null : view2.getContext(), view.getContext());
        }
        this(e1Var, view, vVar, qVar, jVar, y0Var, z15);
    }

    public e1(View view, p076m2.v vVar, androidx.p016lifecycle.q qVar, ua.j jVar, androidx.p016lifecycle.y0 y0Var) {
        this(f1.c(view), view, vVar, qVar, jVar, y0Var, false, 64, null);
    }
}
