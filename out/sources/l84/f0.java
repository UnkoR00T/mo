package l84;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import h30.ButtonData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018²\u0006\f\u0010\u0006\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Ll84/f;", "viewModel", "Loq/i0;", "u", "(Ll84/f;Lm2/r;I)V", "Ll84/f$a$a;", "data", "y", "(Ll84/f$a$a;Lm2/r;I)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "n", "(Lmx/a;Lm2/r;I)V", "Li50/a;", "scaffoldData", "Lq40/g;", "Lh30/a;", "emptyStateData", "p", "(Li50/a;Lq40/g;Lm2/r;I)V", "Ll84/f$a$c;", "s", "(Ll84/f$a$c;Lm2/r;I)V", "Ll84/f$a;", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f117077a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(531023977);
            if (p076m2.t.k()) {
                p076m2.t.o(531023977, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryLoadingState.<anonymous>.<anonymous> (NotificationsHistoryScreen.kt:163)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f117078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f1.y0 f117079f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f1.y0 y0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f117079f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f117078e;
            if (i15 == 0) {
                oq.u.b(obj);
                f1.y0 y0Var = this.f117079f;
                this.f117078e = 1;
                if (f1.y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f117079f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(f.a.DataLoaded dataLoaded, f1.q0 q0Var) {
        for (final n84.a aVar : dataLoaded.c()) {
            if (aVar instanceof n84.a.Header) {
                f1.q0.c(q0Var, null, null, y2.m.b(-615012381, true, new er.q() { // from class: l84.d0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return f0.B(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
            } else {
                if (!(aVar instanceof n84.a.Message)) {
                    throw new oq.p();
                }
                f1.q0.c(q0Var, null, null, y2.m.b(1957031578, true, new er.q() { // from class: l84.e0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return f0.C(aVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(n84.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-615012381, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsHistoryScreen.kt:97)");
            }
            n(((n84.a.Header) aVar).getLabel(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(n84.a aVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1957031578, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationsHistoryScreen.kt:100)");
            }
            n50.h0.v(((n84.a.Message) aVar).getSingleCardData(), null, rVar, 0, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(f.a.DataLoaded dataLoaded, ju.p0 p0Var, f1.y0 y0Var) {
        dataLoaded.d().a();
        ju.k.d(p0Var, null, null, new b(y0Var, null), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(f.a.DataLoaded dataLoaded) {
        dataLoaded.a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(f.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        y(dataLoaded, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-356910205);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-356910205, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryDateHeader (NotificationsHistoryScreen.kt:124)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(a3.r(f3.m.INSTANCE, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 5, null), null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).h(), null, null, false, false, null, rVar2, (i16 << 6) & 896, 0, 0, 33030138);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l84.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.o(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(Label label, int i15, p076m2.r rVar, int i16) {
        n(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final BaseScaffoldData baseScaffoldData, final IconPageData<ButtonData, ButtonData> iconPageData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(216315749);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(216315749, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryEmptyState (NotificationsHistoryScreen.kt:139)");
            }
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(671543000, true, new er.q() { // from class: l84.z
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.q(iconPageData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l84.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.r(baseScaffoldData, iconPageData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(IconPageData iconPageData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(671543000, i15, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryEmptyState.<anonymous> (NotificationsHistoryScreen.kt:141)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            c cVar = c.f117024a;
            q40.i.b(iconPageData, cVar.c(), cVar.d(), rVar, IconPageData.f164667h | 432, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(BaseScaffoldData baseScaffoldData, IconPageData iconPageData, int i15, p076m2.r rVar, int i16) {
        p(baseScaffoldData, iconPageData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final f.a.LoadingState loadingState, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-279009744);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(loadingState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-279009744, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryLoadingState (NotificationsHistoryScreen.kt:154)");
            }
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            p70.n.g(null, null, loadingState.getTitle(), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f117077a, null, c70.a.f23835a.a().R(), loadingState.a(), 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l84.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.t(loadingState, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f.a.LoadingState loadingState, int i15, p076m2.r rVar, int i16) {
        s(loadingState, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1228093212);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1228093212, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryScreen (NotificationsHistoryScreen.kt:48)");
            }
            final f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
            f.a aVarV = v(f6VarC);
            if (aVarV instanceof f.a.LoadingState) {
                rVarH.X(918439122);
                s((f.a.LoadingState) aVarV, rVarH, 0);
                rVarH.R();
            } else if (aVarV instanceof f.a.DataLoaded) {
                rVarH.X(918442643);
                y((f.a.DataLoaded) aVarV, rVarH, 0);
                rVarH.R();
            } else if (aVarV instanceof f.a.b.NoData) {
                rVarH.X(918446509);
                f.a.b.NoData noData = (f.a.b.NoData) aVarV;
                p(noData.getScaffoldData(), noData.b(), rVarH, BaseScaffoldData.f89350g | (IconPageData.f164667h << 3));
                rVarH.R();
            } else {
                if (!(aVarV instanceof f.a.b.NoNotificationPermissions)) {
                    rVarH.X(918435022);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(918453773);
                f.a.b.NoNotificationPermissions noNotificationPermissions = (f.a.b.NoNotificationPermissions) aVarV;
                p(noNotificationPermissions.getScaffoldData(), noNotificationPermissions.b(), rVarH, BaseScaffoldData.f89350g | (IconPageData.f164667h << 3));
                rVarH.R();
            }
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: l84.u
                    @Override // er.a
                    public final Object a() {
                        return f0.w(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            oz.l.b(fVar.getLifecycleConnector(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l84.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.x(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a v(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(f6 f6Var) {
        v(f6Var).a().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f fVar, int i15, p076m2.r rVar, int i16) {
        u(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final f.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1755229510);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataLoaded) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1755229510, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryScreenContent (NotificationsHistoryScreen.kt:76)");
            }
            final f1.y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final ju.p0 p0Var = (ju.p0) objE;
            i50.s.r(dataLoaded.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-804508999, true, new er.q() { // from class: l84.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f0.z(dataLoaded, y0VarC, p0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(dataLoaded);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: l84.x
                    @Override // er.a
                    public final Object a() {
                        return f0.E(dataLoaded);
                    }
                };
                rVarH.v(objE2);
            }
            p088nul.q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l84.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.F(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final f.a.DataLoaded dataLoaded, final f1.y0 y0Var, final ju.p0 p0Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-804508999, i16, -1, "pl.gov.coi.shared.feature.notificationshistory.presentation.NotificationsHistoryScreenContent.<anonymous> (NotificationsHistoryScreen.kt:81)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.b alertData = dataLoaded.getAlertData();
            if (alertData == null) {
                rVar.X(17309062);
            } else {
                rVar.X(17309063);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
            }
            rVar.R();
            f3.m mVarB = d1.h0.b(i0Var, companion, 1.0f, false, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i17).getSpacing100());
            d3 d3VarI = a3.i(0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null);
            boolean zG = rVar.G(dataLoaded);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: l84.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f0.A(dataLoaded, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarB, y0Var, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 488);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar2 = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(dataLoaded.getRefreshButtonLabel(), null, 2, null);
            boolean zG2 = rVar.G(dataLoaded) | rVar.G(p0Var) | rVar.W(y0Var);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: l84.c0
                    @Override // er.a
                    public final Object a() {
                        return f0.D(dataLoaded, p0Var, y0Var);
                    }
                };
                rVar.v(objE2);
            }
            h30.q.p(new ButtonData(null, null, large, withText, aVar2, null, (er.a) objE2, 35, null), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
