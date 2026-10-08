package p036e4;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import c3.SnapshotStateList;
import c3.l;
import fr.t;
import j6.a1;
import j6.f1;
import j6.j;
import j6.l0;
import j6.y;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.m5;
import p076m2.x5;
import p076m2.y2;
import r0.q;
import r0.q0;
import r0.t0;
import x5.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0017J\u001f\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R#\u0010;\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\t058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0B8\u0006¢\u0006\f\n\u0004\b9\u0010E\u001a\u0004\b=\u0010FR\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\b7\u0010K¨\u0006M"}, d2 = {"Le4/u;", "Lj6/a1$b;", "Ljava/lang/Runnable;", "Lj6/y;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Le4/c3;", "insetsValue", "Lj6/a1;", "animation", "Loq/i0;", "l", "(Le4/c3;Lj6/a1;)V", "k", "(Le4/c3;)V", "Lj6/f1;", "insets", "m", "(Lj6/f1;)V", "d", "(Lj6/a1;)V", "Lj6/a1$a;", "bounds", "f", "(Lj6/a1;Lj6/a1$a;)Lj6/a1$a;", "", "runningAnimations", "e", "(Lj6/f1;Ljava/util/List;)Lj6/f1;", "c", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lj6/f1;)Lj6/f1;", "run", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/compose/ui/platform/AndroidComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "Z", "prepared", "", "I", "runningAnimationMask", "Lj6/f1;", "savedInsets", "Lr0/f1;", "", "g", "Lr0/f1;", "j", "()Lr0/f1;", "insetsValues", "Lm2/y2;", "h", "Lm2/y2;", "i", "()Lm2/y2;", "generation", "Lr0/q0;", "Lm2/a3;", "Landroid/graphics/Rect;", "Lr0/q0;", "()Lr0/q0;", "displayCutouts", "Lc3/f0;", "Le4/c2;", "Lc3/f0;", "()Lc3/f0;", "displayCutoutRulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u extends a1.b implements Runnable, y, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView composeView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int runningAnimationMask;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private f1 savedInsets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r0.f1<Object, c3> insetsValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y2 generation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q0<a3<Rect>> displayCutouts;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<c2> displayCutoutRulers;

    public u(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        t0 t0Var = new t0(9);
        z2.Companion companion = z2.INSTANCE;
        t0Var.x(companion.a(), new c3("caption bar"));
        t0Var.x(companion.b(), new c3("display cutout"));
        t0Var.x(companion.c(), new c3("ime"));
        t0Var.x(companion.d(), new c3("mandatory system gestures"));
        t0Var.x(companion.e(), new c3("navigation bars"));
        t0Var.x(companion.f(), new c3("status bars"));
        t0Var.x(companion.g(), new c3("system gestures"));
        t0Var.x(companion.h(), new c3("tappable element"));
        t0Var.x(companion.i(), new c3("waterfall"));
        this.insetsValues = t0Var;
        this.generation = m5.a(0);
        this.displayCutouts = new q0<>(4);
        this.displayCutoutRulers = x5.f();
    }

    private final void k(c3 insetsValue) {
        insetsValue.i(false);
        insetsValue.n(v2.a());
        insetsValue.o(v2.a());
    }

    private final void l(c3 insetsValue, a1 animation) {
        insetsValue.l(animation.c());
        insetsValue.h(animation.a());
        insetsValue.k(animation.b());
    }

    private final void m(f1 insets) {
        char c15;
        char c16;
        boolean z15;
        char c17;
        boolean z16;
        boolean z17;
        long jA;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        char c18;
        Object[] objArr2;
        q qVar = b3.f47206a;
        int[] iArr2 = qVar.keys;
        Object[] objArr3 = qVar.values;
        long[] jArr2 = qVar.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i15 = 0;
            z16 = false;
            z17 = false;
            char c19 = 16;
            c15 = ' ';
            while (true) {
                long j15 = jArr2[i15];
                c16 = '0';
                z15 = true;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j15 & 255) < 128) {
                            int i19 = (i15 << 3) + i18;
                            c18 = c19;
                            int i25 = iArr2[i19];
                            z2 z2Var = (z2) objArr3[i19];
                            h hVarF = insets.f(i25);
                            long jA2 = u2.a((((long) hVarF.f216813a) << 48) | (((long) hVarF.f216814b) << 32) | (((long) hVarF.f216815c) << c18) | ((long) hVarF.f216816d));
                            c3 c3VarE = this.insetsValues.e(z2Var);
                            if (!u2.b(jA2, c3VarE.getCurrent())) {
                                c3VarE.j(jA2);
                                z16 = true;
                                if (!u2.b(jA2, v2.b())) {
                                    z17 = true;
                                }
                            }
                            if (i25 != f1.p.d()) {
                                h hVarG = insets.g(i25);
                                objArr2 = objArr3;
                                long jA3 = u2.a((((long) hVarG.f216814b) << 32) | (((long) hVarG.f216813a) << 48) | (((long) hVarG.f216815c) << c18) | ((long) hVarG.f216816d));
                                if (!u2.b(c3VarE.getMaximum(), jA3)) {
                                    c3VarE.m(jA3);
                                    z16 = true;
                                    if (!u2.b(jA3, v2.b())) {
                                        z17 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            c3VarE.p(insets.q(i25));
                        } else {
                            c18 = c19;
                            objArr2 = objArr3;
                        }
                        j15 >>= i16;
                        i18++;
                        objArr3 = objArr2;
                        i16 = i16;
                        c19 = c18;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    int i26 = i16;
                    c17 = c19;
                    objArr = objArr3;
                    if (i17 != i26) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c17 = c19;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                objArr3 = objArr;
                c19 = c17;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c15 = ' ';
            c16 = '0';
            z15 = true;
            c17 = 16;
            z16 = false;
            z17 = false;
        }
        j jVarE = insets.e();
        if (jVarE == null) {
            jA = v2.b();
        } else {
            h hVarG2 = jVarE.g();
            jA = u2.a((((long) hVarG2.f216813a) << c16) | (((long) hVarG2.f216814b) << c15) | (((long) hVarG2.f216815c) << c17) | ((long) hVarG2.f216816d));
        }
        c3 c3VarE2 = this.insetsValues.e(z2.INSTANCE.i());
        c3VarE2.p(!u2.b(jA, v2.b()));
        if (!u2.b(c3VarE2.getCurrent(), jA)) {
            c3VarE2.j(jA);
            c3VarE2.m(jA);
            z16 = z15;
            if (!u2.b(jA, v2.b())) {
                z17 = z16;
            }
        }
        if (jVarE != null) {
            List<Rect> listA = jVarE.a();
            if (listA.size() < this.displayCutouts.get_size()) {
                this.displayCutouts.C(listA.size(), this.displayCutouts.get_size());
                this.displayCutoutRulers.n(listA.size(), this.displayCutoutRulers.size());
                z16 = z15;
            } else {
                int size = listA.size() - this.displayCutouts.get_size();
                int i27 = 0;
                while (i27 < size) {
                    q0<a3<Rect>> q0Var = this.displayCutouts;
                    q0Var.n(c6.e(listA.get(q0Var.get_size()), null, 2, null));
                    this.displayCutoutRulers.add(e2.a("display cutout rect " + this.displayCutouts.get_size()));
                    i27++;
                    z16 = z15;
                }
            }
            List<Rect> list = listA;
            int size2 = list.size();
            for (int i28 = 0; i28 < size2; i28++) {
                Rect rect = listA.get(i28);
                a3<Rect> a3VarD = this.displayCutouts.d(i28);
                if (!t.c(a3VarD.getValue(), rect)) {
                    a3VarD.setValue(rect);
                    z16 = z15;
                }
            }
            if (!list.isEmpty()) {
                z17 = z15;
            }
        } else if (this.displayCutouts.get_size() > 0) {
            this.displayCutouts.u();
            this.displayCutoutRulers.clear();
            z16 = z15;
        }
        if ((z17 || this.generation.d() != 0) && z16) {
            y2 y2Var = this.generation;
            y2Var.g(y2Var.d() + 1);
            l.INSTANCE.m();
        }
    }

    @Override // j6.y
    public f1 b(View view, f1 insets) {
        if (this.prepared) {
            this.savedInsets = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else if (this.runningAnimationMask == 0) {
            m(insets);
        }
        return insets;
    }

    @Override // j6.a1.b
    public void c(a1 animation) {
        this.prepared = false;
        int iD = animation.d();
        this.runningAnimationMask &= ~iD;
        this.savedInsets = null;
        z2 z2Var = (z2) b3.f47206a.b(iD);
        if (z2Var != null) {
            c3 c3VarE = this.insetsValues.e(z2Var);
            c3VarE.l(0.0f);
            c3VarE.h(1.0f);
            c3VarE.k(0L);
            c3VarE.l(0.0f);
            k(c3VarE);
            y2 y2Var = this.generation;
            y2Var.g(y2Var.d() + 1);
            l.INSTANCE.m();
        }
        super.c(animation);
    }

    @Override // j6.a1.b
    public void d(a1 animation) {
        this.prepared = true;
        super.d(animation);
    }

    @Override // j6.a1.b
    public f1 e(f1 insets, List<a1> runningAnimations) {
        int size = runningAnimations.size();
        for (int i15 = 0; i15 < size; i15++) {
            a1 a1Var = runningAnimations.get(i15);
            z2 z2Var = (z2) b3.f47206a.b(a1Var.d());
            if (z2Var != null) {
                c3 c3VarE = this.insetsValues.e(z2Var);
                if (c3VarE.g()) {
                    l(c3VarE, a1Var);
                }
            }
        }
        m(insets);
        return insets;
    }

    @Override // j6.a1.b
    public a1.a f(a1 animation, a1.a bounds) {
        f1 f1Var = this.savedInsets;
        this.prepared = false;
        this.savedInsets = null;
        if (animation.b() > 0 && f1Var != null) {
            int iD = animation.d();
            this.runningAnimationMask |= iD;
            z2 z2Var = (z2) b3.f47206a.b(iD);
            if (z2Var != null) {
                c3 c3VarE = this.insetsValues.e(z2Var);
                h hVarF = f1Var.f(iD);
                long jA = u2.a(((long) hVarF.f216816d) | (((long) hVarF.f216813a) << 48) | (((long) hVarF.f216814b) << 32) | (((long) hVarF.f216815c) << 16));
                long current = c3VarE.getCurrent();
                if (!u2.b(jA, current)) {
                    c3VarE.n(current);
                    c3VarE.o(jA);
                    c3VarE.i(true);
                    l(c3VarE, animation);
                    y2 y2Var = this.generation;
                    y2Var.g(y2Var.d() + 1);
                    l.INSTANCE.m();
                }
            }
        }
        return super.f(animation, bounds);
    }

    public final SnapshotStateList<c2> g() {
        return this.displayCutoutRulers;
    }

    public final q0<a3<Rect>> h() {
        return this.displayCutouts;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final y2 getGeneration() {
        return this.generation;
    }

    public final r0.f1<Object, c3> j() {
        return this.insetsValues;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        l0.q0(view, this);
        l0.w0(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        l0.q0(view, null);
        l0.w0(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            f1 f1Var = this.savedInsets;
            if (f1Var != null) {
                m(f1Var);
                this.savedInsets = null;
            }
        }
    }
}
