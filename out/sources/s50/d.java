package s50;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ls50/a;", "data", "Loq/i0;", "b", "(Ls50/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "d", "()F", "SWITCH_MINIMUM_HEIGHT", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f178003a = c5.h.n(48);

    public static final void b(final a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1247561020);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1247561020, i16, -1, "pl.gov.coi.common.ui.ds.switchcomponent.Switch (Switch.kt:20)");
            }
            if (aVar instanceof a.C4550a) {
                rVarH.X(-610261925);
                l.h((a.C4550a) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof a.c) {
                rVarH.X(-610260001);
                z.d((a.c) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof a.b)) {
                    rVarH.X(-610263215);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-610257887);
                v.j((a.b) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s50.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.c(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(a aVar, int i15, p076m2.r rVar, int i16) {
        b(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final float d() {
        return f178003a;
    }
}
