package o61;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import ju.p0;
import n40.FilePickerData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u30.CheckBoxGroupData;
import w0.f3;
import w0.u2;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lo61/d;", "viewModel", "Loq/i0;", "g", "(Lo61/d;Lm2/r;I)V", "Lo61/d$a$b;", "data", "j", "(Lo61/d$a$b;Lm2/r;I)V", "Lo61/d$a;", "screenData", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.a.Presenting f142616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f142617g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.a.Presenting presenting, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f142616f = presenting;
            this.f142617g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142615e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f142616f.getScrollToImageSection()) {
                    j1.a aVar = this.f142617g;
                    this.f142615e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f142616f.h().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f142616f, this.f142617g, eVar);
        }
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1434744504);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1434744504, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphoto.ChildPassportApplicationAddPhotoScreen (ChildPassportApplicationAddPhotoScreen.kt:39)");
            }
            d.a aVarH = h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof d.a.Presenting) {
                rVarH.X(104975314);
                j((d.a.Presenting) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof d.a.Error)) {
                    rVarH.X(104972119);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(104979648);
                ((d.a.Error) aVarH).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: o61.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a h(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void j(final d.a.Presenting presenting, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1991320046);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(presenting) : rVarH.G(presenting) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1991320046, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphoto.ChildPassportApplicationAddPhotoScreenContent (ChildPassportApplicationAddPhotoScreen.kt:51)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(presenting.getScrollToImageSection());
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(presenting))) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(presenting, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            i50.s.r(presenting.getScaffoldData(), y2.m.d(1281667965, true, new er.p() { // from class: o61.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(presenting, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1599165307, true, new er.q() { // from class: o61.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.m(f3VarB, presenting, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            q0.g(false, presenting.g(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o61.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.o(presenting, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d.a.Presenting presenting, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1281667965, i15, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphoto.ChildPassportApplicationAddPhotoScreenContent.<anonymous> (ChildPassportApplicationAddPhotoScreen.kt:65)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: o61.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.l((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarN = a3.n(n4.v.d(companion, false, (er.l) objE, 1, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(presenting.getButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 l(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f3 f3Var, d.a.Presenting presenting, j1.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1599165307, i16, -1, "pl.gov.coi.mobywatel.feature.childpassportapplication.presentation.addphoto.ChildPassportApplicationAddPhotoScreenContent.<anonymous> (ChildPassportApplicationAddPhotoScreen.kt:74)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: o61.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.n((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarS = t70.i.S(a3.l(androidx.compose.foundation.layout.d.d(n4.v.d(companion, false, (er.l) objE, 1, null), 0.0f, 1, null), d3Var), f3Var, rVar, 0, 0);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.p(mVarS, aVar2.b(rVar, i17).getSpacing200(), 0.0f, 2, null), 0.0f, aVar2.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            j70.h.g(null, null, presenting.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).m(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, presenting.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            x40.h.g(presenting.getPhotoRequirementsLinkData(), rVar, LinkData.f216731g);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            m40.c.c(j1.e.b(companion, aVar), presenting.getImagePickerData(), rVar, FilePickerData.f131319k << 3, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, presenting.getAdditionalAttachmentsTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, presenting.getAdditionalAttachmentsDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            t30.e.e(presenting.getCheckBoxData(), rVar, CheckBoxGroupData.f194954g);
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
    public static final oq.i0 n(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.a.Presenting presenting, int i15, p076m2.r rVar, int i16) {
        j(presenting, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
