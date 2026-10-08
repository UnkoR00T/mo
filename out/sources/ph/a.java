package ph;

import p046f2.ad;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class a implements er.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ a f157538a = new a();

    private /* synthetic */ a() {
    }

    @Override // er.p
    public final /* synthetic */ Object B(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        int i15 = iIntValue & 3;
        int i16 = iIntValue & 1;
        p076m2.r rVar = (p076m2.r) obj;
        int i17 = x.f157634b;
        if (rVar.r(i15 != 2, i16)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1776608877, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.ComposableSingletons$LicenseDetailScreenKt.lambda$-1776608877.<anonymous> (LicenseDetailScreen.kt:77)");
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
