package f20;

import er.p;
import er.q;
import n3.o1;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.a0;
import p114t0.k;
import p114t0.l;
import w0.i;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "visible", "Lkotlin/Function0;", "Loq/i0;", "onClick", "d", "(ZLer/a;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(boolean z15, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        final boolean z16;
        r rVarH = rVar.h(-1340771812);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                Object objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: f20.a
                        @Override // er.a
                        public final Object a() {
                            return d.e();
                        }
                    };
                    rVarH.v(objE);
                }
                aVar = (er.a) objE;
            }
            if (t.k()) {
                t.o(-1340771812, i17, -1, "pl.gov.coi.common.ui.background.SemiTransparentBackground (SemiTransparentBackground.kt:16)");
            }
            z16 = z15;
            k.g(z16, null, a0.o(null, 0.0f, 3, null), a0.q(null, 0.0f, 3, null), null, m.d(-141979580, true, new q() { // from class: f20.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.f(aVar, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | 200064, 18);
            if (t.k()) {
                t.n();
            }
        } else {
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f20.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(z16, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(er.a aVar, l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-141979580, i15, -1, "pl.gov.coi.common.ui.background.SemiTransparentBackground.<anonymous> (SemiTransparentBackground.kt:22)");
        }
        f3.m mVarD = i.d(f3.m.INSTANCE, o1.d(2282754839L), null, 2, null);
        Object objE = rVar.E();
        if (objE == r.INSTANCE.a()) {
            objE = b1.k.a();
            rVar.v(objE);
        }
        d1.r.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.b.l(mVarD, (b1.l) objE, null, true, null, null, aVar, 24, null), 0.0f, 1, null), rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(boolean z15, er.a aVar, int i15, int i16, r rVar, int i17) {
        d(z15, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
