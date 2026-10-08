package sl2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lsl2/c;", "viewModel", "Loq/i0;", "k", "(Lsl2/c;Lm2/r;I)V", "Lsl2/c$a$a;", "data", "f", "(Lsl2/c$a$a;Lm2/r;I)V", "Lsl2/c$a;", "state", "nationalcourtregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a.Content f182253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f182254g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a.Content content, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f182253f = content;
            this.f182254g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f182252e;
            if (i15 == 0) {
                oq.u.b(obj);
                InputDateTimeData date = this.f182253f.getDate();
                if ((date != null ? date.getValidationState() : null) instanceof hz.b.Invalid) {
                    j1.a aVar = this.f182254g;
                    this.f182252e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f182253f, this.f182254g, eVar);
        }
    }

    private static final void f(final c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1759203463);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1759203463, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.NotificationsInitialized (NotificationsScreen.kt:45)");
            }
            cb4.i dialogVMSAdapter = content.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1239524850);
            } else {
                rVarH.X(-1622583313);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            q0.g(false, content.i(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), y2.m.d(-512117316, true, new er.p() { // from class: sl2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(content, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-639738956, true, new er.q() { // from class: sl2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.h(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sl2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a.Content content, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-512117316, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.NotificationsInitialized.<anonymous> (NotificationsScreen.kt:53)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(content.getNextButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.a.Content content, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-639738956, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.NotificationsInitialized.<anonymous> (NotificationsScreen.kt:60)");
            }
            Object objE = rVar.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVar.v(objE);
            }
            j1.a aVar = (j1.a) objE;
            InputDateTimeData date = content.getDate();
            hz.b validationState = date != null ? date.getValidationState() : null;
            boolean zG = rVar.G(content) | rVar.G(aVar);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(content, aVar, null);
                rVar.v(objE2);
            }
            Function0.d(validationState, (er.p) objE2, rVar, hz.b.f86845b);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label header = content.getHeader();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, content.getDescription(), null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            m30.i.d(content.getList(), null, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            final InputDateTimeData date2 = content.getDate();
            if (date2 == null) {
                rVar.X(1472710452);
                rVar.R();
            } else {
                rVar.X(1472710453);
                j70.h.g(null, null, content.getDurationDescription(), null, null, aVar2.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
                x30.c.c(j1.e.b(companion2, aVar), 0.0f, y2.m.d(1505399605, true, new er.p() { // from class: sl2.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.i(date2, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 2);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(InputDateTimeData inputDateTimeData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1505399605, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.NotificationsInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:99)");
            }
            v40.i.h(inputDateTimeData, rVar, InputDateTimeData.f203769m);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Content content, int i15, p076m2.r rVar, int i16) {
        f(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1717917168);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1717917168, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.notifications.NotificationsScreen (NotificationsScreen.kt:34)");
            }
            c.a aVarL = l(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof c.a.Error) {
                rVarH.X(-1650949992);
                ((c.a.Error) aVarL).getError().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof c.a.Content)) {
                    rVarH.X(-1650952445);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1650948171);
                f((c.a.Content) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: sl2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a l(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
