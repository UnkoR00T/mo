package l93;

import b30.AccordionData;
import d1.e0;
import d1.r3;
import h30.ButtonData;
import i93.SecurityMalwareDetectedScreenModel;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import q40.IconPageBottomContentData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f117303a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.q<SecurityMalwareDetectedScreenModel.ContentData, p076m2.r, Integer, i0> f117304b = y2.m.b(1201554374, false, new er.q() { // from class: l93.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.e((SecurityMalwareDetectedScreenModel.ContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.q<IconPageBottomContentData, p076m2.r, Integer, i0> f117305c = y2.m.b(-1039214158, false, new er.q() { // from class: l93.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return c.f((IconPageBottomContentData) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(SecurityMalwareDetectedScreenModel.ContentData contentData, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= (i15 & 8) == 0 ? rVar.W(contentData) : rVar.G(contentData) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1201554374, i15, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.malware.ComposableSingletons$SecurityMalwareDetectedScreenKt.lambda$1201554374.<anonymous> (SecurityMalwareDetectedScreen.kt:50)");
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
            b30.j.g(contentData.getAccordionData(), rVar, AccordionData.f16343b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            c30.e.c(null, contentData.getAlertData(), rVar, c30.b.f22944i << 3, 1);
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
    public static final i0 f(IconPageBottomContentData iconPageBottomContentData, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVar.W(iconPageBottomContentData) : rVar.G(iconPageBottomContentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1039214158, i16, -1, "pl.gov.coi.mobywatel.feature.threatdetection.securityaltert.presentation.screens.malware.ComposableSingletons$SecurityMalwareDetectedScreenKt.lambda$-1039214158.<anonymous> (SecurityMalwareDetectedScreen.kt:57)");
            }
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar.X(-1104574048);
            } else {
                rVar.X(-1104574047);
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

    public final er.q<IconPageBottomContentData, p076m2.r, Integer, i0> c() {
        return f117305c;
    }

    public final er.q<SecurityMalwareDetectedScreenModel.ContentData, p076m2.r, Integer, i0> d() {
        return f117304b;
    }
}
