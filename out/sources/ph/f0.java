package ph;

import p046f2.ad;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class f0 implements er.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ f0 f157560a = new f0();

    private /* synthetic */ f0() {
    }

    @Override // er.p
    public final /* synthetic */ Object B(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int i15 = iIntValue & 3;
        int i16 = iIntValue & 1;
        p076m2.r rVar = (p076m2.r) obj;
        int i17 = g0.f157563b;
        if (rVar.r(i15 != 2, i16)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1786896358, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.ComposableSingletons$LicenseListScreenKt.lambda$1786896358.<anonymous> (LicenseListScreen.kt:67)");
            }
            ad.e(c2.a.a(b2.a.f16132a), l4.f.a(oh.d.f145731a, rVar, 0), null, 0L, rVar, 0, 12);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
