package g40;

import androidx.compose.ui.graphics.Color;
import java.time.LocalDate;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.ColorScheme;
import p046f2.a5;
import p046f2.pi;
import p046f2.w4;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lg40/j;", "data", "Loq/i0;", "k", "(Lg40/j;Lm2/r;I)V", "Lkotlin/Function0;", "content", "n", "(Ler/p;Lm2/r;I)V", "g", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"g40/i$a", "Lf2/pi;", "", "utcTimeMillis", "", "b", "(J)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements pi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f70444a;

        a(j jVar) {
            this.f70444a = jVar;
        }

        @Override // p046f2.pi
        public /* bridge */ boolean a(int i15) {
            return super.a(i15);
        }

        @Override // p046f2.pi
        public boolean b(long utcTimeMillis) {
            return this.f70444a.getDatePickerDataVMS().a(utcTimeMillis);
        }
    }

    private static final void g(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-114109077);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-114109077, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerContent (DatePickerDialogComponent.kt:38)");
            }
            int i17 = i16;
            a5 a5Var = a5.f55133a;
            long jH = Color.INSTANCE.h();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            w4 w4VarJ = a5Var.j(jH, aVar.a(rVarH, i18).getNeutral().b(), aVar.a(rVarH, i18).getNeutral().i(), aVar.a(rVarH, i18).getNeutral().b(), aVar.a(rVarH, i18).getNeutral().b(), aVar.a(rVarH, i18).getNeutral().b(), aVar.a(rVarH, i18).getNeutral().b(), 0L, aVar.a(rVarH, i18).getBase().c(), aVar.a(rVarH, i18).getNeutral().c(), 0L, aVar.a(rVarH, i18).getBase().c(), 0L, aVar.a(rVarH, i18).getNeutral().b(), aVar.a(rVarH, i18).getNeutral().k(), aVar.a(rVarH, i18).getNeutral().c(), 0L, aVar.a(rVarH, i18).getBase().c(), 0L, aVar.a(rVarH, i18).getBase().c(), aVar.a(rVarH, i18).getBase().c(), aVar.a(rVarH, i18).getBase().c(), aVar.a(rVarH, i18).getBase().b(), aVar.a(rVarH, i18).getNeutral().g(), null, rVarH, 6, 0, 196608, 17110144);
            rVarH = rVarH;
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new a(jVar);
                rVarH.v(objE);
            }
            a aVar2 = (a) objE;
            if (jVar instanceof j.Single) {
                rVarH.X(-2102673700);
                j.Single single = (j.Single) jVar;
                Label title = single.getTitle();
                LocalDate initialDate = single.getInitialDate();
                er.a<i0> aVarB = single.b();
                if ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(jVar))) {
                    z15 = true;
                }
                Object objE2 = rVarH.E();
                if (z15 || objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: g40.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.h(jVar, (LocalDate) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                w.f(title, initialDate, aVar2, w4VarJ, (er.l) objE2, aVarB, rVarH, MLKEMEngine.KyberPolyBytes);
                rVarH.R();
            } else {
                if (!(jVar instanceof j.Range)) {
                    rVarH.X(2010380644);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2010392234);
                j.Range range = (j.Range) jVar;
                Label title2 = range.getTitle();
                fz.e.LocalDate initialRange = range.getInitialRange();
                fz.b.YearMonth initialDisplayedYearMonth = range.getInitialDisplayedYearMonth();
                h40.k headlineFormatter = range.getHeadlineFormatter();
                if ((i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(jVar))) {
                    z15 = true;
                }
                Object objE3 = rVarH.E();
                if (z15 || objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: g40.g
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.i(jVar, (fz.e.LocalDate) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                h40.j.n(title2, initialRange, initialDisplayedYearMonth, aVar2, w4VarJ, headlineFormatter, (er.l) objE3, range.b(), rVarH, (fz.b.YearMonth.f68872b << 6) | (fz.e.LocalDate.f68899c << 3) | 3072);
                rVarH = rVarH;
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
            d5VarM.a(new er.p() { // from class: g40.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(j jVar, LocalDate localDate) {
        j.Single single = (j.Single) jVar;
        single.d().b(localDate);
        single.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(j jVar, fz.e.LocalDate localDate) {
        j.Range range = (j.Range) jVar;
        range.f().b(localDate);
        range.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(j jVar, int i15, p076m2.r rVar, int i16) {
        g(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1432721871);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1432721871, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialogComponent (DatePickerDialogComponent.kt:18)");
            }
            n(y2.m.d(-832173732, true, new er.p() { // from class: g40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(jVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(j jVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-832173732, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialogComponent.<anonymous> (DatePickerDialogComponent.kt:20)");
            }
            g(jVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(j jVar, int i15, p076m2.r rVar, int i16) {
        k(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void n(final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(771609431);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(771609431, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialogMaterialTheme (DatePickerDialogComponent.kt:27)");
            }
            androidx.compose.material3.e.i(ColorScheme.b(androidx.compose.material3.d.f9816a.a(rVarH, androidx.compose.material3.d.f9817b), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, k70.a.f108864a.a(rVarH, k70.a.f108865b).getSurface().a(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65534, null), null, null, pVar, rVarH, (i16 << 9) & 7168, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g40.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(er.p pVar, int i15, p076m2.r rVar, int i16) {
        n(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
