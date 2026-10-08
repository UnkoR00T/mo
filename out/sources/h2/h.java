package h2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "Lm2/f6;", "n", "(ZZZLm2/r;II)Lm2/f6;", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/j$a;", "Loq/i0;", "handleEvent", "Lkotlin/Function0;", "onDispose", "h", "(Landroidx/lifecycle/q;Ler/l;Ler/a;Lm2/r;II)V", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h2/h$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a f79797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f79798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f79799c;

        public a(er.a aVar, androidx.p016lifecycle.q qVar, androidx.p016lifecycle.n nVar) {
            this.f79797a = aVar;
            this.f79798b = qVar;
            this.f79799c = nVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f79797a.a();
            this.f79798b.getLifecycleRegistry().d(this.f79799c);
        }
    }

    private static final void h(final androidx.p016lifecycle.q qVar, final er.l<? super androidx.lifecycle.j.a, oq.i0> lVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1868327245);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                Object objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: h2.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h.i((androidx.lifecycle.j.a) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                lVar = (er.l) objE;
            }
            if (i19 != 0) {
                Object objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: h2.d
                        @Override // er.a
                        public final Object a() {
                            return h.j();
                        }
                    };
                    rVarH.v(objE2);
                }
                aVar = (er.a) objE2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1868327245, i17, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean zG = ((i17 & 112) == 32) | rVarH.G(qVar) | ((i17 & 896) == 256);
            Object objE3 = rVarH.E();
            if (zG || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: h2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.k(qVar, lVar, aVar, (p076m2.s0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            Function0.a(qVar, (er.l) objE3, rVarH, i17 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        final er.l<? super androidx.lifecycle.j.a, oq.i0> lVar2 = lVar;
        final er.a<oq.i0> aVar2 = aVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(qVar, lVar2, aVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(androidx.lifecycle.j.a aVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 k(androidx.p016lifecycle.q qVar, final er.l lVar, er.a aVar, p076m2.s0 s0Var) {
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: h2.g
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar2, androidx.lifecycle.j.a aVar2) {
                h.l(lVar, qVar2, aVar2);
            }
        };
        qVar.getLifecycleRegistry().a(nVar);
        return new a(aVar, qVar, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(er.l lVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        lVar.b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(androidx.p016lifecycle.q qVar, er.l lVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        h(qVar, lVar, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final f6<Boolean> n(boolean z15, boolean z16, boolean z17, p076m2.r rVar, int i15, int i16) {
        boolean z18 = true;
        if ((i16 & 1) != 0) {
            z15 = true;
        }
        if ((i16 & 2) != 0) {
            z16 = true;
        }
        if ((i16 & 4) != 0) {
            z17 = true;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(432241692, i15, -1, "androidx.compose.material3.internal.rememberAccessibilityServiceState (AccessibilityServiceStateProvider.android.kt:46)");
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) rVar.N(AndroidCompositionLocals_androidKt.c())).getSystemService("accessibility");
        boolean z19 = ((((i15 & 14) ^ 6) > 4 && rVar.a(z15)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.a(z16)) || (i15 & 48) == 32);
        if ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !rVar.a(z17)) && (i15 & MLKEMEngine.KyberPolyBytes) != 256) {
            z18 = false;
        }
        boolean z25 = z19 | z18;
        Object objE = rVar.E();
        if (z25 || objE == p076m2.r.INSTANCE.a()) {
            objE = new m1(z15, z16, z17);
            rVar.v(objE);
        }
        final m1 m1Var = (m1) objE;
        androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVar.N(m7.n.c());
        boolean zW = rVar.W(m1Var) | rVar.G(accessibilityManager);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: h2.a
                @Override // er.l
                public final Object b(Object obj) {
                    return h.o(m1Var, accessibilityManager, (androidx.lifecycle.j.a) obj);
                }
            };
            rVar.v(objE2);
        }
        er.l lVar = (er.l) objE2;
        boolean zW2 = rVar.W(m1Var) | rVar.G(accessibilityManager);
        Object objE3 = rVar.E();
        if (zW2 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: h2.b
                @Override // er.a
                public final Object a() {
                    return h.p(m1Var, accessibilityManager);
                }
            };
            rVar.v(objE3);
        }
        h(qVar, lVar, (er.a) objE3, rVar, 0, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(m1 m1Var, AccessibilityManager accessibilityManager, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_RESUME) {
            m1Var.B(accessibilityManager);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(m1 m1Var, AccessibilityManager accessibilityManager) {
        m1Var.D(accessibilityManager);
        return oq.i0.f148189a;
    }
}
