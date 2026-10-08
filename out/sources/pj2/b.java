package pj2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f157936a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, oq.i0> f157937b = y2.m.b(-2095007003, false, new er.p() { // from class: pj2.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return b.c((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2095007003, i15, -1, "pl.gov.coi.mobywatel.feature.legalinformation.presentation.screens.ComposableSingletons$LegalInformationBottomSheetContentKt.lambda$-2095007003.<anonymous> (LegalInformationBottomSheetContent.kt:73)");
            }
            int i16 = jz.a.Y;
            h60.g gVar = h60.g.MSmall;
            h60.a aVar = h60.a.Circle;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            h60.f.e(null, null, Integer.valueOf(i16), gVar, aVar2.a(rVar, i17).getNeutral().d(), 0.0f, aVar, h60.g.Medium, aVar2.a(rVar, i17).getNeutral().j(), 0.0f, 0.0f, "Close icon", rVar, 14158848, 48, 1571);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, oq.i0> b() {
        return f157937b;
    }
}
