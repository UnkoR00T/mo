package td4;

import android.os.Build;
import android.os.Bundle;
import er.p;
import fr.b0;
import fr.k;
import fr.q0;
import mr.l;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p145z43.Function1;
import p145z43.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R+\u0010-\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Ltd4/f;", "Lj00/b;", "<init>", "()V", "Landroid/os/Bundle;", "Lz43/m;", "h2", "(Landroid/os/Bundle;)Lz43/m;", "savedInstanceState", "Loq/i0;", "x0", "(Landroid/os/Bundle;)V", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "k2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "Ltd4/i;", "M0", "Ltd4/i;", "i2", "()Ltd4/i;", "setEntryPointMapper", "(Ltd4/i;)V", "entryPointMapper", "Lrh2/a;", "N0", "Lrh2/a;", "j2", "()Lrh2/a;", "setFragmentNavigator", "(Lrh2/a;)V", "fragmentNavigator", "<set-?>", "O0", "Lir/e;", "g2", "()Lz43/m;", "l2", "(Lz43/m;)V", "entryPoint", "P0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends a {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public i entryPointMapper;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public rh2.a fragmentNavigator;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final ir.e entryPoint = ir.a.f96711a.a();
    static final /* synthetic */ l<Object>[] Q0 = {q0.f(new b0(f.class, "entryPoint", "getEntryPoint()Lpl/gov/coi/mobywatel/feature/services/presentation/ServicesEntryPointData;", 0))};

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int R0 = 8;

    /* JADX INFO: renamed from: td4.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ltd4/f$a;", "", "<init>", "()V", "Ltd4/j;", "entryPoint", "Ltd4/f;", "a", "(Ltd4/j;)Ltd4/f;", "", "TAG_SERVICE", "Ljava/lang/String;", "KEY_ENTRY_POINT", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final f a(j entryPoint) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_entry_point", entryPoint);
            f fVar = new f();
            fVar.F1(bundle);
            return fVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(final f fVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-368758808, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.services.ServiceFeatureFragment.GetContent.<anonymous> (ServiceFeatureFragment.kt:36)");
            }
            m mVarG2 = fVar.g2();
            boolean zG = rVar.G(fVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: td4.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.d2(this.f189767a, (gx.b) obj);
                    }
                };
                rVar.v(objE);
            }
            er.l lVar = (er.l) objE;
            boolean zG2 = rVar.G(fVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: td4.e
                    @Override // er.a
                    public final Object a() {
                        return f.e2(this.f189768a);
                    }
                };
                rVar.v(objE2);
            }
            Function1.k(lVar, mVarG2, (er.a) objE2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(f fVar, gx.b bVar) {
        fVar.k2().c(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e2(f fVar) {
        fVar.j2().c("TAG_SERVICE");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(f fVar, int i15, r rVar, int i16) {
        fVar.S1(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private final m g2() {
        return (m) this.entryPoint.a(this, Q0[0]);
    }

    private final m h2(Bundle bundle) {
        return i2().b(Build.VERSION.SDK_INT >= 33 ? (j) bundle.getParcelable("key_entry_point", j.class) : (j) bundle.getParcelable("key_entry_point"));
    }

    private final void l2(m mVar) {
        this.entryPoint.b(this, Q0[0], mVar);
    }

    @Override // j00.b
    public void S1(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1137988540);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1137988540, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.services.ServiceFeatureFragment.GetContent (ServiceFeatureFragment.kt:35)");
            }
            mc4.d.d(false, y2.m.d(-368758808, true, new p() { // from class: td4.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.c2(this.f189764a, (r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new p() { // from class: td4.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f2(this.f189765a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final i i2() {
        i iVar = this.entryPointMapper;
        if (iVar != null) {
            return iVar;
        }
        return null;
    }

    public final rh2.a j2() {
        rh2.a aVar = this.fragmentNavigator;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final gx.d k2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.o
    public void x0(Bundle savedInstanceState) {
        super.x0(savedInstanceState);
        Bundle bundleV = v();
        l2(bundleV != null ? h2(bundleV) : null);
    }
}
