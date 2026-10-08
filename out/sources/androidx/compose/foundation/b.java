package androidx.compose.foundation;

import a4.PointerInputChange;
import android.view.KeyEvent;
import b1.k;
import er.q;
import f3.j;
import f3.m;
import fr.l0;
import g4.q1;
import n4.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p143z0.i2;
import w0.j1;
import w0.n1;
import w0.r1;
import w0.v0;
import w0.y0;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001aU\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008f\u0001\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010!\u001a\u00020\u0001*\u00020 H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\u0001*\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020\u0001*\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010&\"\u0018\u0010+\u001a\u00020\u0001*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010-\u001a\u00020\u0001*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*\"\u0018\u0010/\u001a\u00020\u0001*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*¨\u00060"}, d2 = {"Lf3/m;", "", "enabled", "", "onClickLabel", "Ln4/l;", "role", "Lb1/l;", "interactionSource", "Lkotlin/Function0;", "Loq/i0;", "onClick", "m", "(Lf3/m;ZLjava/lang/String;Ln4/l;Lb1/l;Ler/a;)Lf3/m;", "Lw0/j1;", "indication", "k", "(Lf3/m;Lb1/l;Lw0/j1;ZLjava/lang/String;Ln4/l;Ler/a;)Lf3/m;", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "o", "(Lf3/m;Lb1/l;Lw0/j1;ZLjava/lang/String;Ln4/l;Ljava/lang/String;Ler/a;Ler/a;ZLer/a;)Lf3/m;", "Lg4/j;", "Lx3/f;", "event", "r", "(Lg4/j;Lx3/f;)Z", "La4/b0;", "q", "(Lg4/j;La4/b0;)Z", "Lg4/q1;", "u", "(Lg4/q1;)Z", "z", "(Lw0/j1;)Ljava/lang/String;", "i", "(Lx3/f;)Z", "j", "Ly3/b;", "y", "(Landroid/view/KeyEvent;)Z", "isPress", "w", "isClick", "x", "isEnter", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements q<m, r, Integer, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f9579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f9582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a f9583e;

        public a(j1 j1Var, boolean z15, String str, l lVar, er.a aVar) {
            this.f9579a = j1Var;
            this.f9580b = z15;
            this.f9581c = str;
            this.f9582d = lVar;
            this.f9583e = aVar;
        }

        public final m c(m mVar, r rVar, int i15) {
            rVar.X(-1525724089);
            if (t.k()) {
                t.o(-1525724089, i15, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = k.a();
                rVar.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            m mVarU = n1.e(m.INSTANCE, lVar, this.f9579a).u(new ClickableElement(lVar, null, false, this.f9580b, this.f9581c, this.f9582d, this.f9583e, null));
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return mVarU;
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ m w(m mVar, r rVar, Integer num) {
            return c(mVar, rVar, num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0196b implements q<m, r, Integer, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f9587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a f9588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a f9590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a f9591h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f9592j;

        public C0196b(j1 j1Var, boolean z15, String str, l lVar, er.a aVar, String str2, er.a aVar2, er.a aVar3, boolean z16) {
            this.f9584a = j1Var;
            this.f9585b = z15;
            this.f9586c = str;
            this.f9587d = lVar;
            this.f9588e = aVar;
            this.f9589f = str2;
            this.f9590g = aVar2;
            this.f9591h = aVar3;
            this.f9592j = z16;
        }

        public final m c(m mVar, r rVar, int i15) {
            rVar.X(-1525724089);
            if (t.k()) {
                t.o(-1525724089, i15, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = k.a();
                rVar.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            m mVarU = n1.e(m.INSTANCE, lVar, this.f9584a).u(new CombinedClickableElement(lVar, null, false, this.f9585b, this.f9586c, this.f9587d, this.f9588e, this.f9589f, this.f9590g, this.f9591h, this.f9592j, null));
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return mVarU;
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ m w(m mVar, r rVar, Integer num) {
            return c(mVar, rVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.getIsConsumed() || !indirectPointerInputChange.getPreviousPressed() || indirectPointerInputChange.getPressed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    public static final m k(m mVar, b1.l lVar, j1 j1Var, boolean z15, String str, l lVar2, er.a<i0> aVar) {
        m mVarC;
        if (j1Var instanceof r1) {
            mVarC = new ClickableElement(lVar, (r1) j1Var, false, z15, str, lVar2, aVar, null);
        } else if (j1Var == null) {
            mVarC = new ClickableElement(lVar, null, false, z15, str, lVar2, aVar, null);
        } else if (lVar != null) {
            mVarC = n1.e(m.INSTANCE, lVar, j1Var).u(new ClickableElement(lVar, null, false, z15, str, lVar2, aVar, null));
        } else {
            mVarC = j.c(m.INSTANCE, null, new a(j1Var, z15, str, lVar2, aVar), 1, null);
        }
        return mVar.u(mVarC);
    }

    public static /* synthetic */ m l(m mVar, b1.l lVar, j1 j1Var, boolean z15, String str, l lVar2, er.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        return k(mVar, lVar, j1Var, z15, (i15 & 8) != 0 ? null : str, (i15 & 16) != 0 ? null : lVar2, aVar);
    }

    public static final m m(m mVar, boolean z15, String str, l lVar, b1.l lVar2, er.a<i0> aVar) {
        return mVar.u(new ClickableElement(lVar2, null, true, z15, str, lVar, aVar, null));
    }

    public static /* synthetic */ m n(m mVar, boolean z15, String str, l lVar, b1.l lVar2, er.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        if ((i15 & 4) != 0) {
            lVar = null;
        }
        return m(mVar, z15, str, lVar, (i15 & 8) != 0 ? null : lVar2, aVar);
    }

    public static final m o(m mVar, b1.l lVar, j1 j1Var, boolean z15, String str, l lVar2, String str2, er.a<i0> aVar, er.a<i0> aVar2, boolean z16, er.a<i0> aVar3) {
        m mVarC;
        if (j1Var instanceof r1) {
            mVarC = new CombinedClickableElement(lVar, (r1) j1Var, false, z15, str, lVar2, aVar3, str2, aVar, aVar2, z16, null);
        } else if (j1Var == null) {
            mVarC = new CombinedClickableElement(lVar, null, false, z15, str, lVar2, aVar3, str2, aVar, aVar2, z16, null);
        } else if (lVar != null) {
            mVarC = n1.e(m.INSTANCE, lVar, j1Var).u(new CombinedClickableElement(lVar, null, false, z15, str, lVar2, aVar3, str2, aVar, aVar2, z16, null));
        } else {
            mVarC = j.c(m.INSTANCE, null, new C0196b(j1Var, z15, str, lVar2, aVar3, str2, aVar, aVar2, z16), 1, null);
        }
        return mVar.u(mVarC);
    }

    public static /* synthetic */ m p(m mVar, b1.l lVar, j1 j1Var, boolean z15, String str, l lVar2, String str2, er.a aVar, er.a aVar2, boolean z16, er.a aVar3, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            str = null;
        }
        if ((i15 & 16) != 0) {
            lVar2 = null;
        }
        if ((i15 & 32) != 0) {
            str2 = null;
        }
        if ((i15 & 64) != 0) {
            aVar = null;
        }
        if ((i15 & 128) != 0) {
            aVar2 = null;
        }
        if ((i15 & 256) != 0) {
            z16 = true;
        }
        return o(mVar, lVar, j1Var, z15, str, lVar2, str2, aVar, aVar2, z16, aVar3);
    }

    public static final boolean q(g4.j jVar, final PointerInputChange pointerInputChange) {
        final l0 l0Var = new l0();
        y0.d(jVar, new er.l() { // from class: w0.c0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.b.t(pointerInputChange, l0Var, (v0) obj));
            }
        });
        return l0Var.f66404a;
    }

    public static final boolean r(g4.j jVar, final IndirectPointerInputChange indirectPointerInputChange) {
        final l0 l0Var = new l0();
        y0.d(jVar, new er.l() { // from class: w0.b0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.b.s(indirectPointerInputChange, l0Var, (v0) obj));
            }
        });
        return l0Var.f66404a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(IndirectPointerInputChange indirectPointerInputChange, l0 l0Var, v0 v0Var) {
        boolean z15 = l0Var.f66404a || v0Var.i0(indirectPointerInputChange);
        l0Var.f66404a = z15;
        return !z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(PointerInputChange pointerInputChange, l0 l0Var, v0 v0Var) {
        boolean z15 = l0Var.f66404a || v0Var.e0(pointerInputChange);
        l0Var.f66404a = z15;
        return !z15;
    }

    public static final boolean u(q1 q1Var) {
        final l0 l0Var = new l0();
        g4.r1.c(q1Var, i2.INSTANCE, new er.l() { // from class: w0.d0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(androidx.compose.foundation.b.v(l0Var, (g4.q1) obj));
            }
        });
        return l0Var.f66404a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(l0 l0Var, q1 q1Var) {
        boolean z15 = l0Var.f66404a || ((i2) q1Var).getEnabled();
        l0Var.f66404a = z15;
        return !z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.b()) && x(keyEvent);
    }

    private static final boolean x(KeyEvent keyEvent) {
        long jA = y3.d.a(keyEvent);
        y3.a.Companion companion = y3.a.INSTANCE;
        return y3.a.R(jA, companion.i()) || y3.a.R(jA, companion.n()) || y3.a.R(jA, companion.z()) || y3.a.R(jA, companion.I());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(KeyEvent keyEvent) {
        return y3.c.e(y3.d.b(keyEvent), y3.c.INSTANCE.a()) && x(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z(j1 j1Var) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + j1Var;
    }
}
