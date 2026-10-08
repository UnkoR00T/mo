package e20;

import er.l;
import er.p;
import oq.i0;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.a0;
import p114t0.c0;
import p114t0.v;
import u0.j0;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "visible", "Lkotlin/Function0;", "Loq/i0;", "content", "e", "(ZLer/p;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-335327017);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-335327017, i16, -1, "pl.gov.coi.common.ui.animation.BottomBarCollapsibleContent (BottomBarCollapsibleContent.kt:11)");
            }
            Boolean boolValueOf = Boolean.valueOf(z15);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: e20.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.f((p114t0.h) obj);
                    }
                };
                rVarH.v(objE);
            }
            p114t0.d.a(boolValueOf, null, (l) objE, null, null, null, m.d(1799795930, true, new er.r() { // from class: e20.g
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return j.h(pVar, (p114t0.f) obj, ((Boolean) obj2).booleanValue(), (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, (i16 & 14) | 1573248, 58);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e20.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(z15, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v f(p114t0.h hVar) {
        return new v(c0.INSTANCE.a(), a0.q(u0.m.l(500, 0, null, 6, null), 0.0f, 2, null), 0.0f, p114t0.d.c(false, new p() { // from class: e20.i
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return j.g((c5.r) obj, (c5.r) obj2);
            }
        }), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 g(c5.r rVar, c5.r rVar2) {
        return u0.m.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(p pVar, p114t0.f fVar, boolean z15, r rVar, int i15) {
        if (t.k()) {
            t.o(1799795930, i15, -1, "pl.gov.coi.common.ui.animation.BottomBarCollapsibleContent.<anonymous> (BottomBarCollapsibleContent.kt:36)");
        }
        if (z15) {
            rVar.X(-651138191);
            pVar.B(rVar, 0);
        } else {
            rVar.X(-652241016);
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(boolean z15, p pVar, int i15, r rVar, int i16) {
        e(z15, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
