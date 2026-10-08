package j93;

import d1.a3;
import d1.e0;
import d1.r3;
import h30.ButtonData;
import i93.SecurityAlertScreenModel;
import j60.BulletItemStyle;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f100469a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<SecurityAlertScreenModel.ContentData, p076m2.r, Integer, i0> f100470b = y2.m.b(381096043, false, new er.q() { // from class: j93.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.f((SecurityAlertScreenModel.ContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f100471c = y2.m.b(-606281897, false, new er.q() { // from class: j93.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return d.h((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(final SecurityAlertScreenModel.ContentData contentData, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(381096043, i15, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.ComposableSingletons$SecurityAlertScreenKt.lambda$381096043.<anonymous> (SecurityAlertScreen.kt:52)");
        }
        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
        x30.c.c(null, 0.0f, y2.m.d(77076876, true, new er.p() { // from class: j93.c
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return d.g(contentData, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(SecurityAlertScreenModel.ContentData contentData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(77076876, i15, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.ComposableSingletons$SecurityAlertScreenKt.lambda$381096043.<anonymous>.<anonymous> (SecurityAlertScreen.kt:54)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.p(companion, aVar.b(rVar, i16).getSpacing100(), 0.0f, 2, null), null, contentData.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030138);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            j60.c.b(contentData.a(), new BulletItemStyle(aVar.f(rVar, i16).b(), aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), null), a3.p(companion, aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null), rVar, BulletItemStyle.f99759c << 3, 0);
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
    public static final i0 h(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-606281897, i16, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.alert.ComposableSingletons$SecurityAlertScreenKt.lambda$-606281897.<anonymous> (SecurityAlertScreen.kt:73)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1406376485);
            } else {
                rVar.X(-1406376484);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150()), rVar, 0);
                h30.q.p(secondaryButtonData, false, null, rVar, 0, 6);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> d() {
        return f100471c;
    }

    public final er.q<SecurityAlertScreenModel.ContentData, p076m2.r, Integer, i0> e() {
        return f100470b;
    }
}
