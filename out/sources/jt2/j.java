package jt2;

import d1.a3;
import d1.d3;
import d1.r3;
import er.r;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import i50.s;
import java.util.List;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ljt2/e;", "viewModel", "Loq/i0;", "i", "(Ljt2/e;Lm2/r;I)V", "Ljt2/e$a;", "screenData", "e", "(Ljt2/e$a;Lm2/r;I)V", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f105405a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(KeyValueData keyValueData) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f105406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f105407b;

        public b(er.l lVar, List list) {
            this.f105406a = lVar;
            this.f105407b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f105406a.b(this.f105407b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f105408a;

        public c(List list) {
            this.f105408a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            KeyValueData keyValueData = (KeyValueData) this.f105408a.get(i15);
            rVar.X(-51887079);
            Label labelD = keyValueData.d();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(null, null, labelD, null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing200()), rVar, 0);
            j70.h.g(null, null, keyValueData.c(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing300()), rVar, 0);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    public static final void e(final e.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1383213714);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1383213714, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.moreinfo.PeselRestrictionMoreInfoContent (PeselRestrictionMoreInfoScreen.kt:36)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(590198405, true, new er.q() { // from class: jt2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.f(y0VarC, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jt2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(y0 y0Var, final e.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(590198405, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.moreinfo.PeselRestrictionMoreInfoContent.<anonymous> (PeselRestrictionMoreInfoScreen.kt:42)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarL = a3.l(a3.p(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), d3Var);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: jt2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.g(data, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarL, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 504);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e.Data data, q0 q0Var) {
        List<KeyValueData> listB = data.b();
        q0Var.j(listB.size(), null, new b(a.f105405a, listB), y2.m.b(802480018, true, new c(listB)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(e.Data data, int i15, p076m2.r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1625582687);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1625582687, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.moreinfo.PeselRestrictionMoreInfoScreen (PeselRestrictionMoreInfoScreen.kt:26)");
            }
            e(j(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jt2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data j(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e eVar, int i15, p076m2.r rVar, int i16) {
        i(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
