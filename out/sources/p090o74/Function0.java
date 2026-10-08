package p090o74;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import er.a;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.d;
import r74.DefaultNotificationDetailsData;
import xw.b;
import y2.m;

/* JADX INFO: renamed from: o74.l, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "f", "(Ler/a;Lm2/r;I)V", "notifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void f(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1917847378);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1917847378, i16, -1, "pl.gov.coi.shared.feature.defaultnotificationdetails.presentation.NotificationDetailsNavContent (NotificationDetailsNavContent.kt:12)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            e eVar = e.f142950a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: o74.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(sVarJ, aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, eVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: o74.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final s sVar, final a aVar, d1 d1Var) {
        f00.r.u(d1Var, e.f142950a, null, m.b(-1965707921, true, new er.r() { // from class: o74.g
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1965707921, i15, -1, "pl.gov.coi.shared.feature.defaultnotificationdetails.presentation.NotificationDetailsNavContent.<anonymous>.<anonymous>.<anonymous> (NotificationDetailsNavContent.kt:19)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: o74.h
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i(sVar, (z.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (l) objE);
        z zVar = (z) d.c(q0.c(z.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        b<b> bVarY1 = zVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: o74.i
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j(aVar, (b) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (l) objE2, rVar, b.f221619c);
        w.e(zVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z i(s sVar, z.a aVar) {
        return aVar.a(new z.a.SetupData((DefaultNotificationDetailsData) sVar.g(f.f142952a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a aVar, b bVar) {
        if (!fr.t.c(bVar, b.a.f142938a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(a aVar, int i15, r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
