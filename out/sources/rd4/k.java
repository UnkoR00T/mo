package rd4;

import android.os.Bundle;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p094oo1.Function1;
import p094oo1.c8;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lrd4/k;", "Lj00/b;", "Lgx/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "x0", "(Landroid/os/Bundle;)V", "C0", "S1", "(Lm2/r;I)V", "Lgx/b;", "event", "", "j5", "(Lgx/b;)Z", "Lrh2/a;", "L0", "Lrh2/a;", "e2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "Lgx/d;", "M0", "Lgx/d;", "f2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "N0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends o implements gx.c {
    public static final int O0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b2(final k kVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1499995324, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.DeveloperFeatureFragment.GetContent.<anonymous> (DeveloperFeatureFragment.kt:39)");
            }
            boolean zG = rVar.G(kVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: rd4.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.c2(this.f173281a, (c8) obj);
                    }
                };
                rVar.v(objE);
            }
            Function1.l3((er.l) objE, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(k kVar, c8 c8Var) {
        if (!(c8Var instanceof c8.a)) {
            throw new p();
        }
        kVar.e2().c("TAG_FRAGMENT_FEATURE");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(k kVar, int i15, r rVar, int i16) {
        kVar.S1(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // androidx.fragment.app.o
    public void C0() {
        f2().a(this);
        super.C0();
    }

    @Override // j00.b
    public void S1(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-567848856);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-567848856, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.DeveloperFeatureFragment.GetContent (DeveloperFeatureFragment.kt:37)");
            }
            mc4.d.d(false, y2.m.d(1499995324, true, new er.p() { // from class: rd4.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.b2(this.f173278a, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: rd4.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.d2(this.f173279a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final rh2.a e2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d f2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // gx.c
    public boolean j5(gx.b event) {
        return event instanceof jo1.a.C2477a;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        f2().b(this);
    }
}
