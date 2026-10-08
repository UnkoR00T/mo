package n70;

import androidx.compose.ui.window.l;
import d1.a3;
import d1.e0;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import oq.i0;
import p036e4.w0;
import p046f2.C6455g;
import p046f2.gq;
import p046f2.jq;
import p046f2.wo;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln70/a;", "data", "Loq/i0;", "e", "(Ln70/a;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void e(final BaseTimePickerData baseTimePickerData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1332189803);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(baseTimePickerData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1332189803, i16, -1, "pl.gov.coi.common.ui.timepicker.BaseTimePickerDialog (BaseTimePickerDialog.kt:33)");
            }
            final jq jqVarR0 = gq.R0(baseTimePickerData.getInitialHour(), baseTimePickerData.getInitialMinute(), false, rVarH, 0, 4);
            C6455g.g(baseTimePickerData.e(), androidx.compose.foundation.layout.d.C(m.INSTANCE, null, false, 3, null), new l(false, false, false, 3, null), y2.m.d(-1393037343, true, new p() { // from class: n70.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.f(baseTimePickerData, jqVarR0, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 3504, 0);
            rVarH = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n70.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(baseTimePickerData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final BaseTimePickerData baseTimePickerData, final jq jqVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1393037343, i15, -1, "pl.gov.coi.common.ui.timepicker.BaseTimePickerDialog.<anonymous> (BaseTimePickerDialog.kt:46)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            androidx.compose.material3.l.g(null, aVar.e(rVar, i16).getRadius200(), aVar.a(rVar, i16).getSurface().a(), 0L, 0.0f, 0.0f, null, y2.m.d(-1412958298, true, new p() { // from class: n70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(baseTimePickerData, jqVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 12582912, 121);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final BaseTimePickerData baseTimePickerData, final jq jqVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1412958298, i15, -1, "pl.gov.coi.common.ui.timepicker.BaseTimePickerDialog.<anonymous>.<anonymous> (BaseTimePickerDialog.kt:50)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarO = a3.o(companion, aVar.b(rVar, i16).getSpacing250(), aVar.b(rVar, i16).getSpacing300());
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarO);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h.g(null, null, baseTimePickerData.getTitle(), null, null, aVar.a(rVar, i16).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).e(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing250()), rVar, 0);
            wo woVar = wo.f58239a;
            long jC = aVar.a(rVar, i16).getBase().c();
            long jC2 = aVar.a(rVar, i16).getNeutral().c();
            long jG = aVar.a(rVar, i16).getNeutral().g();
            long jI = aVar.a(rVar, i16).getNeutral().i();
            long jG2 = aVar.a(rVar, i16).getNeutral().g();
            long jC3 = aVar.a(rVar, i16).getNeutral().c();
            long jC4 = aVar.a(rVar, i16).getBase().c();
            gq.W(jqVar, null, woVar.b(jG2, jC3, 0L, aVar.a(rVar, i16).getBase().c(), jC4, 0L, aVar.a(rVar, i16).getBase().c(), aVar.a(rVar, i16).getNeutral().c(), aVar.a(rVar, i16).getNeutral().c(), aVar.a(rVar, i16).getNeutral().b(), jC, jG, jC2, jI, rVar, 0, 24576, 36), rVar, 0, 2);
            m mVarC = i0Var.c(companion, companion2.j());
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            m mVarE2 = j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            k30.a.b bVar = k30.a.b.f107765a;
            k30.c.WithText withText = new k30.c.WithText(baseTimePickerData.getCancelButtonLabel(), null, 2, null);
            k30.d.c cVar = k30.d.c.f107775a;
            q.p(new ButtonData(null, null, bVar, withText, cVar, null, baseTimePickerData.e(), 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            k30.c.WithText withText2 = new k30.c.WithText(baseTimePickerData.getConfirmButtonLabel(), null, 2, null);
            boolean zW = rVar.W(baseTimePickerData) | rVar.G(jqVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: n70.e
                    @Override // er.a
                    public final Object a() {
                        return f.h(baseTimePickerData, jqVar);
                    }
                };
                rVar.v(objE);
            }
            q.p(new ButtonData(null, null, bVar, withText2, cVar, null, (er.a) objE, 35, null), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(BaseTimePickerData baseTimePickerData, jq jqVar) {
        baseTimePickerData.f().b(new TimeResult(jqVar.j(), jqVar.h(), jqVar.getIs24hour()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(BaseTimePickerData baseTimePickerData, int i15, r rVar, int i16) {
        e(baseTimePickerData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
