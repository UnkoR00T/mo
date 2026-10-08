package pb3;

import d1.x;
import f3.j;
import f3.m;
import k40.EmptyStateData;
import ob3.v;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lob3/v$a$b$b;", "data", "Loq/i0;", "b", "(Lf3/m;Lob3/v$a$b$b;Lm2/r;II)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void b(final m mVar, final v.a.Initialized.InterfaceC3582b interfaceC3582b, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(-365880532);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(interfaceC3582b) : rVarH.G(interfaceC3582b) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (t.k()) {
                t.o(-365880532, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.components.SearchComponent (SearchComponent.kt:18)");
            }
            if (interfaceC3582b instanceof v.a.Initialized.InterfaceC3582b.Empty) {
                rVarH.X(576133253);
                k40.d.c(s.n(androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null), rVarH, 0), ((v.a.Initialized.InterfaceC3582b.Empty) interfaceC3582b).getData(), rVarH, EmptyStateData.f108236d << 3, 0);
                rVarH.R();
            } else if (interfaceC3582b instanceof v.a.Initialized.InterfaceC3582b.Hints) {
                rVarH.X(576139188);
                m mVarN = s.n(androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null), rVarH, 0);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarN);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                x xVar = x.f39368a;
                m30.m.d(((v.a.Initialized.InterfaceC3582b.Hints) interfaceC3582b).getCards(), null, rVarH, 0, 2);
                rVarH.x();
                rVarH.R();
            } else {
                if (!fr.t.c(interfaceC3582b, v.a.Initialized.InterfaceC3582b.c.f144375a)) {
                    rVarH.X(576131351);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(576145607);
                m mVarN2 = s.n(androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null), rVarH, 0);
                w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.e(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarN2);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarI2, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                x xVar2 = x.f39368a;
                x70.f.g(x70.a.C5796a.f217280c, rVarH, x70.a.C5796a.f217281d);
                rVarH.x();
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: pb3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.c(mVar, interfaceC3582b, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(m mVar, v.a.Initialized.InterfaceC3582b interfaceC3582b, int i15, int i16, r rVar, int i17) {
        b(mVar, interfaceC3582b, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
