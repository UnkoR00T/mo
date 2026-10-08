package ua3;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lua3/h;", "viewModel", "Loq/i0;", "k", "(Lua3/h;Lm2/r;I)V", "Lua3/h$a;", "data", "f", "(Lua3/h$a;Lm2/r;I)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final void f(final h.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-663971061);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-663971061, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.emergencycontact.Content (EmergencyContactScreen.kt:33)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(661741182, true, new er.q() { // from class: ua3.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.g(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final h.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(661741182, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.emergencycontact.Content.<anonymous> (EmergencyContactScreen.kt:37)");
            }
            f3.m mVarL = a3.l(qa3.b.b(f3.m.INSTANCE), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ua3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.h(data, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarP, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(h.Data data, q0 q0Var) {
        List<h.Data.Section> listB = data.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            final h.Data.Section section = listB.get(i15);
            q0.c(q0Var, null, null, y2.m.b(-1965802003, true, new er.q() { // from class: ua3.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.i(section, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            m30.m.h(q0Var, section.getCards());
            if (i15 != v.p(data.b())) {
                q0.c(q0Var, null, null, b.f196821a.b(), 3, null);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(h.Data.Section section, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1965802003, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.emergencycontact.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EmergencyContactScreen.kt:51)");
            }
            Label header = section.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(h.Data data, int i15, p076m2.r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-868260855);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-868260855, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.emergencycontact.EmergencyContactScreen (EmergencyContactScreen.kt:25)");
            }
            f(l(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ua3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data l(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h hVar, int i15, p076m2.r rVar, int i16) {
        k(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
