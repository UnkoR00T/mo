package s50;

import d1.e0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import ju.p0;
import n4.CustomAccessibilityAction;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.b0;
import p036e4.c0;
import p036e4.l1;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Ls50/a$b;", "data", "Loq/i0;", "j", "(Ls50/a$b;Lm2/r;I)V", "Lc5/n;", "inputFieldCoordinates", "", "validationMessageShowed", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j1.a f178022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f178023g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j1.a aVar, a3<Boolean> a3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f178022f = aVar;
            this.f178023g = a3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178021e;
            if (i15 == 0) {
                oq.u.b(obj);
                j1.a aVar = this.f178022f;
                this.f178021e = 1;
                if (j1.a.a(aVar, null, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            v.o(this.f178023g, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f178022f, this.f178023g, eVar);
        }
    }

    public static final void j(final s50.a.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        Object obj;
        String str;
        String str2;
        String str3;
        p076m2.r rVarH = rVar.h(1241478609);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1241478609, i16, -1, "pl.gov.coi.common.ui.ds.switchcomponent.SwitchWithExtras (SwitchWithExtras.kt:54)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            final j1.a aVar = (j1.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                long j15 = 0;
                objE2 = c6.e(c5.n.c(c5.n.d((j15 & BodyPartID.bodyIdMax) | (j15 << 32))), null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var = (a3) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE3);
            }
            final p0 p0Var = (p0) objE3;
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE4);
            }
            final a3 a3Var2 = (a3) objE4;
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = b1.k.a();
                rVarH.v(objE5);
            }
            b1.l lVar = (b1.l) objE5;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarB = j1.e.b(androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), null, false, 3, null), aVar);
            int i17 = i16 & 14;
            boolean zG = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(bVar))) | rVarH.G(p0Var) | rVarH.G(aVar);
            Object objE6 = rVarH.E();
            if (zG || objE6 == companion.a()) {
                obj = new er.l() { // from class: s50.m
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.p(bVar, p0Var, a3Var, a3Var2, aVar, (b0) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                obj = objE6;
            }
            f3.m mVarA = l1.a(mVarB, (er.l) obj);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarA);
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
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarB2 = androidx.compose.foundation.layout.d.b(k3.f.a(t70.s.w(companion2, f6VarA, aVar2.b(rVarH, i18).getSpacing50(), 0.0f, 4, null), aVar2.e(rVarH, i18).getRadius50()), 0.0f, d.d(), 1, null);
            r1 r1VarE = t70.s.E(0.0f, rVarH, 0, 1);
            int iG = n4.l.INSTANCE.g();
            boolean checked = bVar.getChecked();
            n4.l lVarJ = n4.l.j(iG);
            boolean z15 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(bVar));
            Object objE7 = rVarH.E();
            if (z15 || objE7 == companion.a()) {
                objE7 = new er.l() { // from class: s50.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.q(bVar, ((Boolean) obj2).booleanValue());
                    }
                };
                rVarH.v(objE7);
            }
            f3.m mVarQ = t70.i.Q(k1.g.b(mVarB2, checked, lVar, r1VarE, false, lVarJ, (er.l) objE7, 8, null), bVar.getChecked(), bVar.getValidationState() instanceof hz.b.Invalid ? ((hz.b.Invalid) bVar.getValidationState()).getMessage().getText() : bVar.getAdditionalStateDescription(), rVarH, 0);
            boolean z16 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(bVar));
            Object objE8 = rVarH.E();
            if (z16 || objE8 == companion.a()) {
                objE8 = new er.l() { // from class: s50.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.r(bVar, (n4.i0) obj2);
                    }
                };
                rVarH.v(objE8);
            }
            f3.m mVarC = n4.v.c(mVarQ, true, (er.l) objE8);
            w0 w0VarB = m3.b(iVar.j(), companion3.i(), rVarH, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
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
            n6.i(rVarC2, w0VarB, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarC2 = p3.c(q3.f39261a, companion2, 1.0f, false, 2, null);
            String testTag = bVar.getTestTag();
            if (testTag != null) {
                str = testTag + "Text";
            } else {
                str = null;
            }
            int i19 = i16;
            j70.h.g(mVarC2, str, bVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), null, null, aVar2.a(rVarH, i18).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030104);
            rVarH = rVarH;
            Object objE9 = rVarH.E();
            if (objE9 == companion.a()) {
                objE9 = new er.l() { // from class: s50.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.u((n4.i0) obj2);
                    }
                };
                rVarH.v(objE9);
            }
            f3.m mVarA2 = n4.v.a(companion2, (er.l) objE9);
            Object objE10 = rVarH.E();
            if (objE10 == companion.a()) {
                objE10 = new er.l() { // from class: s50.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.v((n4.i0) obj2);
                    }
                };
                rVarH.v(objE10);
            }
            f3.m mVarC3 = n4.v.c(mVarA2, true, (er.l) objE10);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            d1.x xVar = d1.x.f39368a;
            String testTag2 = bVar.getTestTag();
            if (testTag2 != null) {
                str2 = testTag2 + "Switch";
            } else {
                str2 = null;
            }
            boolean checked2 = bVar.getChecked();
            boolean enabled = bVar.getEnabled();
            boolean z17 = i17 == 4 || ((i19 & 8) != 0 && rVarH.G(bVar));
            Object objE11 = rVarH.E();
            if (z17 || objE11 == companion.a()) {
                objE11 = new er.l() { // from class: s50.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.w(bVar, ((Boolean) obj2).booleanValue());
                    }
                };
                rVarH.v(objE11);
            }
            l.h(new s50.a.C4550a(str2, checked2, enabled, (er.l) objE11, bVar.getContentDescription(), null, bVar.getTestIndexTag(), true, 32, null), rVarH, 0);
            rVarH.x();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            b type = bVar.getType();
            if (type instanceof b.Link) {
                rVarH.X(526434515);
                x40.h.g(((b.Link) bVar.getType()).getData(), rVarH, 0);
                rVarH.R();
            } else {
                if (!(type instanceof b.TextButton)) {
                    rVarH.X(526433000);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(526437241);
                j30.f.e(null, ((b.TextButton) bVar.getType()).getData(), false, rVarH, 0, 5);
                rVarH.R();
            }
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            if (bVar.getValidationState() instanceof hz.b.Invalid) {
                rVarH.X(-860125673);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
                String testTag3 = bVar.getTestTag();
                if (testTag3 != null) {
                    str3 = testTag3 + "ErrorText";
                } else {
                    str3 = null;
                }
                l40.d.d(str3, ((hz.b.Invalid) bVar.getValidationState()).getMessage(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
            } else {
                rVarH.X(-867323749);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s50.s
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return v.l(bVar, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String k(s50.a.b bVar) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(bVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String().getText());
        sb5.append(' ');
        c70.a aVar = c70.a.f23835a;
        sb5.append(aVar.a().l().getText());
        sb5.append(' ');
        sb5.append(bVar.getChecked() ? aVar.a().a0().getText() : aVar.a().v().getText());
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(s50.a.b bVar, int i15, p076m2.r rVar, int i16) {
        j(bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(a3<c5.n> a3Var, long j15) {
        a3Var.setValue(c5.n.c(j15));
    }

    private static final boolean n(a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(s50.a.b bVar, p0 p0Var, a3 a3Var, a3 a3Var2, j1.a aVar, b0 b0Var) {
        m(a3Var, c5.n.d((((long) ((int) Float.intBitsToFloat((int) (c0.h(b0Var) >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (c0.h(b0Var) & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)));
        if ((bVar.getValidationState() instanceof hz.b.Invalid) && !n(a3Var2)) {
            ju.k.d(p0Var, null, null, new a(aVar, a3Var2, null), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(s50.a.b bVar, boolean z15) {
        er.l<Boolean, i0> lVarF = bVar.f();
        if (lVarF != null) {
            lVarF.b(Boolean.valueOf(!bVar.getChecked()));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final s50.a.b bVar, n4.i0 i0Var) {
        if (bVar.getValidationState() instanceof hz.b.Invalid) {
            f0.l0(i0Var, n4.i.INSTANCE.a());
        }
        f0.r0(i0Var, n4.l.INSTANCE.g());
        f0.G0(i0Var, p4.b.a(bVar.getChecked()));
        f0.e0(i0Var, pq.v.q(new CustomAccessibilityAction(bVar.getCustomActionContentDescription().getText(), new er.a() { // from class: s50.t
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.s(bVar));
            }
        }), new CustomAccessibilityAction(k(bVar), new er.a() { // from class: s50.u
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(v.t(bVar));
            }
        })));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(s50.a.b bVar) {
        b type = bVar.getType();
        if (type instanceof b.Link) {
            ((b.Link) bVar.getType()).getData().d().b(((b.Link) bVar.getType()).getData().getUrl());
            return true;
        }
        if (!(type instanceof b.TextButton)) {
            throw new oq.p();
        }
        ((b.TextButton) bVar.getType()).getData().d().a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(s50.a.b bVar) {
        er.l<Boolean, i0> lVarF = bVar.f();
        if (lVarF != null) {
            lVarF.b(Boolean.valueOf(!bVar.getChecked()));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(s50.a.b bVar, boolean z15) {
        er.l<Boolean, i0> lVarF = bVar.f();
        if (lVarF != null) {
            lVarF.b(Boolean.valueOf(z15));
        }
        return i0.f148189a;
    }
}
