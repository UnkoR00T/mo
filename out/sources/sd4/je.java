package sd4;

import p071kotlin.Metadata;
import qy2.NipipCardContainerData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lsd4/je;", "Lj00/b;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Lgx/d;", "L0", "Lgx/d;", "e2", "()Lgx/d;", "setGlobalEventManager", "(Lgx/d;)V", "globalEventManager", "M0", "a", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class je extends r9 {
    public static final int N0 = 8;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public gx.d globalEventManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b2(final je jeVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1401047572, i15, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.MidwifeFeatureFragment.GetContent.<anonymous> (MidwifeFeatureFragment.kt:23)");
            }
            NipipCardContainerData.a aVar = NipipCardContainerData.a.MIDWIFE;
            boolean zG = rVar.G(jeVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sd4.ie
                    @Override // er.l
                    public final Object b(Object obj) {
                        return je.c2(this.f180666a, (ry2.r) obj);
                    }
                };
                rVar.v(objE);
            }
            ry2.q.o(aVar, (er.l) objE, rVar, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c2(je jeVar, ry2.r rVar) {
        if (fr.t.c(rVar, ry2.r.b.f176905a)) {
            jeVar.e2().c(new tg1.a.ToDashboard(false, 1, null));
        } else {
            if (!fr.t.c(rVar, ry2.r.a.f176904a)) {
                throw new oq.p();
            }
            jeVar.e2().c(wn3.m.f214221a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d2(je jeVar, int i15, p076m2.r rVar, int i16) {
        jeVar.S1(rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @Override // j00.b
    public void S1(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(954714048);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(954714048, i16, -1, "pl.gov.mc.fringers.mobywatel.view.fragment.feature.MidwifeFeatureFragment.GetContent (MidwifeFeatureFragment.kt:22)");
            }
            mc4.d.d(false, y2.m.d(1401047572, true, new er.p() { // from class: sd4.ge
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return je.b2(this.f180633a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        p076m2.d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sd4.he
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return je.d2(this.f180648a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final gx.d e2() {
        gx.d dVar = this.globalEventManager;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }
}
