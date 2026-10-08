package tz2;

import d1.a3;
import d1.d3;
import d1.r3;
import g1.t0;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import uz2.QualifiedSignatureProviderData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Ltz2/k;", "viewModel", "Loq/i0;", "k", "(Ltz2/k;Lm2/r;I)V", "Ltz2/k$a$b;", "data", "n", "(Ltz2/k$a$b;Lm2/r;I)V", "Ltz2/k$a$a;", "h", "(Ltz2/k$a$a;Lm2/r;I)V", "Ltz2/k$a;", "state", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f192779a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(QualifiedSignatureProviderData qualifiedSignatureProviderData) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f192780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f192781b;

        public b(er.l lVar, List list) {
            this.f192780a = lVar;
            this.f192781b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f192780a.b(this.f192781b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<g1.v, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f192782a;

        public c(List list) {
            this.f192782a = list;
        }

        public final void c(g1.v vVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(vVar) ? 4 : 2) | i16;
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
            if (p076m2.t.k()) {
                p076m2.t.o(-1117249557, i17, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
            }
            QualifiedSignatureProviderData qualifiedSignatureProviderData = (QualifiedSignatureProviderData) this.f192782a.get(i15);
            rVar.X(-1632099558);
            uz2.f.e(qualifiedSignatureProviderData, null, 0.0f, rVar, 0, 6);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(g1.v vVar, Integer num, p076m2.r rVar, Integer num2) {
            c(vVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    private static final void h(final k.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-700084862);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-700084862, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.ProviderListErrorScreen (ProviderListScreen.kt:92)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: tz2.e
                    @Override // er.a
                    public final Object a() {
                        return h.i();
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: tz2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(k.a.Error error, int i15, p076m2.r rVar, int i16) {
        h(error, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(245141652);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(245141652, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.ProviderListScreen (ProviderListScreen.kt:32)");
            }
            k.a aVarL = l(m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof k.a.Error) {
                rVarH.X(-642067176);
                h((k.a.Error) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof k.a.Initialized)) {
                    rVarH.X(-642069313);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-642064326);
                n((k.a.Initialized) aVarL, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: tz2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a l(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(k kVar, int i15, p076m2.r rVar, int i16) {
        k(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final k.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-776018563);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-776018563, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.ProviderListScreenContent (ProviderListScreen.kt:44)");
            }
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1640448176, true, new er.q() { // from class: tz2.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.o(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: tz2.c
                    @Override // er.a
                    public final Object a() {
                        return h.q(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: tz2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.r(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final k.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1640448176, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.providerlist.ProviderListScreenContent.<anonymous> (ProviderListScreen.kt:48)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i18).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(null, null, initialized.getTitle(), null, null, aVar.a(rVar, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            if (initialized.getDescription() == null) {
                rVar2.X(-907662146);
                rVar2.R();
                i17 = i18;
            } else {
                rVar2.X(-907662145);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing100()), rVar2, 0);
                i17 = i18;
                j70.h.g(null, null, initialized.getDescription(), null, null, aVar.a(rVar2, i18).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.R();
            }
            g1.b.a aVar2 = new g1.b.a(2);
            f3.m mVarA = i0Var.a(companion, 1.0f, true);
            int i19 = i17;
            d3 d3VarG = a3.g(0.0f, aVar.b(rVar2, i19).getSpacing200(), 1, null);
            d1.i.f fVarR = iVar.r(aVar.b(rVar2, i19).getSpacing200());
            d1.i.f fVarR2 = iVar.r(aVar.b(rVar2, i19).getSpacing200());
            boolean zG = rVar2.G(initialized);
            Object objE = rVar2.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: tz2.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.p(initialized, (t0) obj);
                    }
                };
                rVar2.v(objE);
            }
            g1.i.c(aVar2, mVarA, null, d3VarG, false, fVarR, fVarR2, null, false, null, (er.l) objE, rVar2, 0, 0, 916);
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
    public static final i0 p(k.a.Initialized initialized, t0 t0Var) {
        List<QualifiedSignatureProviderData> listC = initialized.c();
        t0Var.g(listC.size(), null, null, new b(a.f192779a, listC), y2.m.b(-1117249557, true, new c(listC)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(k.a.Initialized initialized) {
        initialized.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(k.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        n(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
