package d1;

import android.graphics.Path;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ^2\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R/\u0010:\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010>\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b-\u0010=R\u0017\u0010?\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b4\u0010=R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b'\u0010<\u001a\u0004\b)\u0010=R\u0017\u0010B\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\bA\u00100R\u0017\u0010D\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\bC\u00100R\u0017\u0010F\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\bE\u00100R\u0017\u0010H\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\bG\u00100R\u0017\u0010K\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bI\u0010.\u001a\u0004\bJ\u00100R\u0017\u0010M\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\bL\u00100R\u0017\u0010O\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\bN\u00100R\u001d\u0010V\u001a\u00020P8\u0006¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bT\u0010U\u001a\u0004\b\u001e\u0010SR\u0016\u0010Y\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Ld1/e4;", "", "Lj6/f1;", "insets", "Landroid/view/View;", "view", "<init>", "(Lj6/f1;Landroid/view/View;)V", "Loq/i0;", "p", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", "r", "(Lj6/f1;I)V", "t", "(Lj6/f1;)V", "u", "Ld1/e;", "a", "Ld1/e;", "c", "()Ld1/e;", "captionBar", "e", "displayCutout", "f", "ime", "d", "g", "mandatorySystemGestures", "h", "navigationBars", "l", "statusBars", "m", "systemBars", "n", "systemGestures", "i", "getTappableElement", "tappableElement", "Ld1/z3;", "j", "Ld1/z3;", "o", "()Ld1/z3;", "waterfall", "Ln3/m2;", "<set-?>", "k", "Lm2/a3;", "getCutoutPath", "()Ln3/m2;", "q", "(Ln3/m2;)V", "cutoutPath", "Ld1/c4;", "Ld1/c4;", "()Ld1/c4;", "safeDrawing", "safeGestures", "safeContent", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "s", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "getImeAnimationTarget", "imeAnimationTarget", "getImeAnimationSource", "imeAnimationSource", "", "v", "Z", "()Z", "getConsumes$annotations", "()V", "consumes", "w", "I", "accessCount", "Ld1/s1;", "x", "Ld1/s1;", "insetsListener", "y", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e4 {
    private static boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e captionBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e displayCutout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e ime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e mandatorySystemGestures;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e navigationBars;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e statusBars;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e systemBars;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e systemGestures;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final e tappableElement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final z3 waterfall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 cutoutPath;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c4 safeDrawing;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final c4 safeGestures;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final c4 safeContent;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final z3 captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final z3 navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final z3 statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final z3 systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final z3 tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final z3 imeAnimationTarget;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final z3 imeAnimationSource;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final s1 insetsListener;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f39084z = 8;
    private static final WeakHashMap<View, e4> A = new WeakHashMap<>();

    /* JADX INFO: renamed from: d1.e4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ld1/e4$a;", "", "<init>", "()V", "Lj6/f1;", "windowInsets", "", "type", "", "name", "Ld1/e;", "g", "(Lj6/f1;ILjava/lang/String;)Ld1/e;", "Ld1/z3;", "h", "(Lj6/f1;ILjava/lang/String;)Ld1/z3;", "Ld1/e4;", "d", "(Lm2/r;I)Ld1/e4;", "Landroid/view/View;", "view", "f", "(Landroid/view/View;)Ld1/e4;", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "", "testInsets", "Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: d1.e4$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d1/e4$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0844a implements p076m2.r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e4 f39109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f39110b;

            public C0844a(e4 e4Var, View view) {
                this.f39109a = e4Var;
                this.f39110b = view;
            }

            @Override // p076m2.r0
            public void j() {
                this.f39109a.b(this.f39110b);
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p076m2.r0 e(e4 e4Var, View view, p076m2.s0 s0Var) {
            e4Var.p(view);
            return new C0844a(e4Var, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final e g(j6.f1 windowInsets, int type, String name) {
            e eVar = new e(type, name);
            if (windowInsets != null) {
                eVar.h(windowInsets, type);
            }
            return eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final z3 h(j6.f1 windowInsets, int type, String name) {
            x5.h hVarG;
            if (windowInsets == null || (hVarG = windowInsets.g(type)) == null) {
                hVarG = x5.h.f216812e;
            }
            return v4.a(hVarG, name);
        }

        public final e4 d(p076m2.r rVar, int i15) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1366542614, i15, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            final View view = (View) rVar.N(AndroidCompositionLocals_androidKt.g());
            final e4 e4VarF = f(view);
            boolean zG = rVar.G(e4VarF) | rVar.G(view);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: d1.d4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e4.Companion.e(e4VarF, view, (p076m2.s0) obj);
                    }
                };
                rVar.v(objE);
            }
            Function0.a(e4VarF, (er.l) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return e4VarF;
        }

        public final e4 f(View view) {
            e4 e4Var;
            synchronized (e4.A) {
                try {
                    WeakHashMap weakHashMap = e4.A;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        e4 e4Var2 = new e4(null, view, false ? 1 : 0);
                        weakHashMap.put(view, e4Var2);
                        obj2 = e4Var2;
                    }
                    e4Var = (e4) obj2;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return e4Var;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e4(j6.f1 f1Var, View view, fr.k kVar) {
        this(f1Var, view);
    }

    private final void q(n3.m2 m2Var) {
        this.cutoutPath.setValue(m2Var);
    }

    public static /* synthetic */ void s(e4 e4Var, j6.f1 f1Var, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        e4Var.r(f1Var, i15);
    }

    public final void b(View view) {
        int i15 = this.accessCount - 1;
        this.accessCount = i15;
        if (i15 == 0) {
            j6.l0.q0(view, null);
            j6.l0.w0(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getCaptionBar() {
        return this.captionBar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getDisplayCutout() {
        return this.displayCutout;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getIme() {
        return this.ime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getNavigationBars() {
        return this.navigationBars;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c4 getSafeContent() {
        return this.safeContent;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c4 getSafeDrawing() {
        return this.safeDrawing;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c4 getSafeGestures() {
        return this.safeGestures;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final e getStatusBars() {
        return this.statusBars;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getSystemBars() {
        return this.systemBars;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final e getSystemGestures() {
        return this.systemGestures;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z3 getWaterfall() {
        return this.waterfall;
    }

    public final void p(View view) {
        if (this.accessCount == 0) {
            j6.l0.q0(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            j6.l0.w0(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void r(j6.f1 windowInsets, int types) {
        x5.h hVarG;
        Path pathB;
        if (B) {
            windowInsets = j6.f1.y(windowInsets.x());
        }
        this.captionBar.h(windowInsets, types);
        this.ime.h(windowInsets, types);
        this.displayCutout.h(windowInsets, types);
        this.navigationBars.h(windowInsets, types);
        this.statusBars.h(windowInsets, types);
        this.systemBars.h(windowInsets, types);
        this.systemGestures.h(windowInsets, types);
        this.tappableElement.h(windowInsets, types);
        this.mandatorySystemGestures.h(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.f(v4.e(windowInsets.g(j6.f1.p.b())));
            this.navigationBarsIgnoringVisibility.f(v4.e(windowInsets.g(j6.f1.p.g())));
            this.statusBarsIgnoringVisibility.f(v4.e(windowInsets.g(j6.f1.p.h())));
            this.systemBarsIgnoringVisibility.f(v4.e(windowInsets.g(j6.f1.p.i())));
            this.tappableElementIgnoringVisibility.f(v4.e(windowInsets.g(j6.f1.p.k())));
            j6.j jVarE = windowInsets.e();
            z3 z3Var = this.waterfall;
            if (jVarE == null || (hVarG = jVarE.g()) == null) {
                hVarG = x5.h.f216812e;
            }
            z3Var.f(v4.e(hVarG));
            q((jVarE == null || (pathB = jVarE.b()) == null) ? null : n3.u0.c(pathB));
        }
        c3.l.INSTANCE.m();
    }

    public final void t(j6.f1 windowInsets) {
        this.imeAnimationSource.f(v4.e(windowInsets.f(j6.f1.p.d())));
    }

    public final void u(j6.f1 windowInsets) {
        this.imeAnimationTarget.f(v4.e(windowInsets.f(j6.f1.p.d())));
    }

    private e4(j6.f1 f1Var, View view) {
        j6.j jVarE;
        Path pathB;
        j6.j jVarE2;
        x5.h hVarG;
        Companion companion = INSTANCE;
        e eVarG = companion.g(f1Var, j6.f1.p.b(), "captionBar");
        this.captionBar = eVarG;
        e eVarG2 = companion.g(f1Var, j6.f1.p.c(), "displayCutout");
        this.displayCutout = eVarG2;
        e eVarG3 = companion.g(f1Var, j6.f1.p.d(), "ime");
        this.ime = eVarG3;
        e eVarG4 = companion.g(f1Var, j6.f1.p.f(), "mandatorySystemGestures");
        this.mandatorySystemGestures = eVarG4;
        e eVarG5 = companion.g(f1Var, j6.f1.p.g(), "navigationBars");
        this.navigationBars = eVarG5;
        e eVarG6 = companion.g(f1Var, j6.f1.p.h(), "statusBars");
        this.statusBars = eVarG6;
        e eVarG7 = companion.g(f1Var, j6.f1.p.i(), "systemBars");
        this.systemBars = eVarG7;
        e eVarG8 = companion.g(f1Var, j6.f1.p.j(), "systemGestures");
        this.systemGestures = eVarG8;
        e eVarG9 = companion.g(f1Var, j6.f1.p.k(), "tappableElement");
        this.tappableElement = eVarG9;
        z3 z3VarA = v4.a((f1Var == null || (jVarE2 = f1Var.e()) == null || (hVarG = jVarE2.g()) == null) ? x5.h.f216812e : hVarG, "waterfall");
        this.waterfall = z3VarA;
        this.cutoutPath = c6.e((f1Var == null || (jVarE = f1Var.e()) == null || (pathB = jVarE.b()) == null) ? null : n3.u0.c(pathB), null, 2, null);
        c4 c4VarI = f4.i(f4.i(eVarG7, eVarG3), eVarG2);
        this.safeDrawing = c4VarI;
        c4 c4VarI2 = f4.i(f4.i(f4.i(eVarG9, eVarG4), eVarG8), z3VarA);
        this.safeGestures = c4VarI2;
        this.safeContent = f4.i(c4VarI, c4VarI2);
        this.captionBarIgnoringVisibility = companion.h(f1Var, j6.f1.p.b(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.h(f1Var, j6.f1.p.g(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.h(f1Var, j6.f1.p.h(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.h(f1Var, j6.f1.p.i(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.h(f1Var, j6.f1.p.k(), "tappableElementIgnoringVisibility");
        x5.h hVar = x5.h.f216812e;
        this.imeAnimationTarget = v4.a(hVar, "imeAnimationTarget");
        this.imeAnimationSource = v4.a(hVar, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(f3.p.K) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : false;
        this.insetsListener = new s1(this);
        j6.f1 f1VarC = j6.l0.C(view);
        if (f1VarC != null) {
            eVarG.g(f1VarC.q(j6.f1.p.b()));
            eVarG2.g(f1VarC.q(j6.f1.p.c()));
            eVarG3.g(f1VarC.q(j6.f1.p.d()));
            eVarG4.g(f1VarC.q(j6.f1.p.f()));
            eVarG5.g(f1VarC.q(j6.f1.p.g()));
            eVarG6.g(f1VarC.q(j6.f1.p.h()));
            eVarG7.g(f1VarC.q(j6.f1.p.i()));
            eVarG8.g(f1VarC.q(j6.f1.p.j()));
            eVarG9.g(f1VarC.q(j6.f1.p.k()));
        }
    }
}
