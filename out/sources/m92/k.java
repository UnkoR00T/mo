package m92;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lm92/f;", "viewModel", "Loq/i0;", "h", "(Lm92/f;Lm2/r;I)V", "Lm92/f$a;", "data", "k", "(Lm92/f$a;Lm2/r;I)V", "Lm92/f$a$a;", "formData", "Lj1/a;", "bringIntoViewRequester", "e", "(Lm92/f$a$a;Lj1/a;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f.Data f124798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f124799g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.Data data, j1.a aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f124798f = data;
            this.f124799g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124797e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f124798f.getScrollToField()) {
                    j1.a aVar = this.f124799g;
                    this.f124797e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f124798f.c().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f124798f, this.f124799g, eVar);
        }
    }

    public static final void e(final f.Data.FormData formData, final j1.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1460401607);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(formData) : rVarH.G(formData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1460401607, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationtypeentryfield.EnterViolationTypeForm (ViolationTypeEntryFieldScreen.kt:92)");
            }
            x30.c.c(j1.e.b(f3.m.INSTANCE, aVar), 0.0f, y2.m.d(-1754350394, true, new er.p() { // from class: m92.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(formData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m92.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(formData, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f.Data.FormData formData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1754350394, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationtypeentryfield.EnterViolationTypeForm.<anonymous> (ViolationTypeEntryFieldScreen.kt:94)");
            }
            v0.g(formData.getViolationTextInputData(), null, rVar, v50.c.f203957t, 2);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f.Data.FormData formData, j1.a aVar, int i15, p076m2.r rVar, int i16) {
        e(formData, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1029318324);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1029318324, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationtypeentryfield.ViolationTypeEntryFieldScreen (ViolationTypeEntryFieldScreen.kt:34)");
            }
            k(i(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, v50.c.f203957t);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m92.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data i(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f fVar, int i15, p076m2.r rVar, int i16) {
        h(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final f.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2002587825);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2002587825, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationtypeentryfield.ViolationTypeEntryFieldScreenContent (ViolationTypeEntryFieldScreen.kt:42)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            j1.a aVar = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(data.getScrollToField());
            boolean zG = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(aVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(data, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, 0);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar2.a(rVarH, i17).getBase().a(), null, 2, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR2 = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            rVar2 = rVarH;
            j70.h.g(null, null, data.getSubtitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i17).getSpacing200()), rVar2, 0);
            e(data.getFormData(), aVar, rVar2, v50.c.f203957t);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i17).getSpacing200()), rVar2, 0);
            h30.q.p(data.getNextButton(), false, null, rVar2, 0, 6);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m92.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f.Data data, int i15, p076m2.r rVar, int i16) {
        k(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
