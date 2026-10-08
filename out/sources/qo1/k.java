package qo1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u50.v0;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u007f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lqo1/v;", "viewModel", "Loq/i0;", "h", "(Lqo1/v;Lm2/r;I)V", "Lqo1/c$a;", "displayedScreenData", "Lkotlin/Function0;", "onBackPressed", "onBiometricLogin", "onBiometricActivation", "onBiometricCheckRequirements", "onBiometricCheckType", "onChangeAuthenticationType", "Lkotlin/Function1;", "Liy/b0;", "onChangePassword", "k", "(Lqo1/c$a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Lm2/r;I)V", "Lqo1/c;", "biometricDeveloperScreenData", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, v.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, v.class, "biometricLogin", "biometricLogin()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).V2();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<i0> {
        c(Object obj) {
            super(0, obj, v.class, "biometricActivation", "biometricActivation()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).o1();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, v.class, "onBiometricCheckRequirements", "onBiometricCheckRequirements()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).w7();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.a<i0> {
        e(Object obj) {
            super(0, obj, v.class, "onBiometricCheckType", "onBiometricCheckType()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).u2();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.a<i0> {
        f(Object obj) {
            super(0, obj, v.class, "onChangeAuthenticationType", "onChangeAuthenticationType()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).W0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.l<b0, i0> {
        g(Object obj) {
            super(1, obj, v.class, "onChangePassword", "onChangePassword(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(b0 b0Var) {
            ((v) this.f66391b).w8(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            E(b0Var);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.a<i0> {
        h(Object obj) {
            super(0, obj, v.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((v) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void h(qo1.v r16, p076m2.r r17, int r18) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo1.k.h(qo1.v, m2.r, int):void");
    }

    private static final qo1.c i(f6<? extends qo1.c> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(v vVar, int i15, p076m2.r rVar, int i16) {
        h(vVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final qo1.c.DisplayedScreenData displayedScreenData, final er.a<i0> aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, final er.a<i0> aVar4, final er.a<i0> aVar5, final er.a<i0> aVar6, final er.l<? super b0, i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        er.a<i0> aVar7;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(925395022);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(displayedScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar7 = aVar2;
            i16 |= rVarH.G(aVar7) ? 256 : 128;
        } else {
            aVar7 = aVar2;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(aVar4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(aVar5) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(aVar6) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.G(lVar) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i16) != 4793490, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(925395022, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.biometric.BiometricDeveloperScreenContent (BiometricDeveloperScreen.kt:66)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            final er.a<i0> aVar8 = aVar7;
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), displayedScreenData.getTopBar(), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-783436357, true, new er.q() { // from class: qo1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.l(displayedScreenData, lVar, aVar3, context, aVar4, aVar5, aVar8, aVar6, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: qo1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.q(displayedScreenData, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final qo1.c.DisplayedScreenData displayedScreenData, final er.l lVar, final er.a aVar, final Context context, final er.a aVar2, er.a aVar3, er.a aVar4, final er.a aVar5, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-783436357, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.biometric.BiometricDeveloperScreenContent.<anonymous> (BiometricDeveloperScreen.kt:80)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            float top = d3Var2.getTop();
            k70.a aVar6 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(companion, aVar6.b(rVar, i17).getSpacing250(), top, aVar6.b(rVar, i17).getSpacing250(), 0.0f, 8, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing400()), rVar, 0);
            Label passwordInputLabel = displayedScreenData.getPasswordInputLabel();
            Label passwordInputHint = displayedScreenData.getPasswordInputHint();
            Label password = displayedScreenData.getPassword();
            boolean zW = rVar.W(lVar);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: qo1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.m(lVar, (String) obj);
                    }
                };
                rVar.v(objE);
            }
            v0.g(new v50.c.Password(null, passwordInputLabel, passwordInputHint, password, null, null, null, (er.l) objE, null, false, 0, null, false, null, false, 0, null, null, null, null, 1048433, null), null, rVar, v50.c.Password.O, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar7 = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(displayedScreenData.getActivateBiometricButton(), null, 2, null);
            boolean zW2 = rVar.W(displayedScreenData) | rVar.W(aVar) | rVar.G(context);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: qo1.g
                    @Override // er.a
                    public final Object a() {
                        return k.n(displayedScreenData, aVar, context);
                    }
                };
                rVar.v(objE2);
            }
            h30.q.p(new ButtonData(null, null, large, withText, aVar7, null, (er.a) objE2, 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
            k30.a.Large large2 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText2 = new k30.c.WithText(displayedScreenData.getCheckBiometricRequirementsButton(), null, 2, null);
            boolean zW3 = rVar.W(displayedScreenData) | rVar.W(aVar2) | rVar.G(context);
            Object objE3 = rVar.E();
            if (zW3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: qo1.h
                    @Override // er.a
                    public final Object a() {
                        return k.o(displayedScreenData, aVar2, context);
                    }
                };
                rVar.v(objE3);
            }
            h30.q.p(new ButtonData(null, null, large2, withText2, aVar7, null, (er.a) objE3, 35, null), false, null, rVar, 0, 6);
            j70.h.g(null, null, displayedScreenData.getBiometricRequirements(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(displayedScreenData.getBiometricTypeButton(), null, 2, null), aVar7, null, aVar3, 35, null), false, null, rVar, 0, 6);
            j70.h.g(null, null, displayedScreenData.getBiometricType(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(displayedScreenData.getLoginBiometricButton(), null, 2, null), aVar7, null, aVar4, 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
            k30.a.Large large3 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText3 = new k30.c.WithText(displayedScreenData.getChangeTypeButton(), null, 2, null);
            boolean zW4 = rVar.W(displayedScreenData) | rVar.W(aVar5) | rVar.G(context);
            Object objE4 = rVar.E();
            if (zW4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.a() { // from class: qo1.i
                    @Override // er.a
                    public final Object a() {
                        return k.p(displayedScreenData, aVar5, context);
                    }
                };
                rVar.v(objE4);
            }
            h30.q.p(new ButtonData(null, null, large3, withText3, aVar7, null, (er.a) objE4, 35, null), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar6.b(rVar, i17).getSpacing250()), rVar, 0);
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
    public static final i0 m(er.l lVar, String str) {
        lVar.b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(qo1.c.DisplayedScreenData displayedScreenData, er.a aVar, Context context) {
        if (!displayedScreenData.getIsUserLogged()) {
            t70.s.M(context, "Wpierw zaloguj się do aplikacji");
        } else if (displayedScreenData.getPassword().l()) {
            aVar.a();
            t70.s.M(context, "Aktywacja");
        } else {
            t70.s.M(context, "Wpierw podaj aktualne hasło");
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(qo1.c.DisplayedScreenData displayedScreenData, er.a aVar, Context context) {
        if (displayedScreenData.getIsUserLogged()) {
            aVar.a();
        } else {
            t70.s.M(context, "Wpierw zaloguj się do aplikacji");
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(qo1.c.DisplayedScreenData displayedScreenData, er.a aVar, Context context) {
        if (!displayedScreenData.getIsUserLogged()) {
            t70.s.M(context, "Wpierw zaloguj się do aplikacji");
        } else if (displayedScreenData.getPassword().l()) {
            aVar.a();
            t70.s.M(context, "Zmiana typu biometrii");
        } else {
            t70.s.M(context, "Wpierw podaj aktualne hasło");
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(qo1.c.DisplayedScreenData displayedScreenData, er.a aVar, er.a aVar2, er.a aVar3, er.a aVar4, er.a aVar5, er.a aVar6, er.l lVar, int i15, p076m2.r rVar, int i16) {
        k(displayedScreenData, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
