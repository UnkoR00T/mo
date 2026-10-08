package pf2;

import d1.r3;
import j40.DropDownButtonData;
import p071kotlin.Metadata;
import rf2.InternetSpeedConfigData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpf2/s0;", "Lb50/a;", "Lrf2/a;", "data", "<init>", "(Lrf2/a;)V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "Lrf2/a;", "getData", "()Lrf2/a;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 implements b50.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f157294b = DropDownButtonData.f99359i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternetSpeedConfigData data;

    public s0(InternetSpeedConfigData internetSpeedConfigData) {
        this.data = internetSpeedConfigData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(s0 s0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1036076143, i15, -1, "pl.gov.coi.mobywatel.feature.internetaccess.presentation.parameters.InternetSpeedConfigContent.content.<anonymous> (InternetParametersScreen.kt:121)");
            }
            DropDownButtonData downlink = s0Var.data.getDownlink();
            int i16 = DropDownButtonData.f99359i;
            j40.l.m(downlink, rVar, i16);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            j40.l.m(s0Var.data.getUplink(), rVar, i16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    @Override // b50.a
    public er.p<p076m2.r, Integer, oq.i0> a() {
        return y2.m.b(1036076143, true, new er.p() { // from class: pf2.r0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return s0.c(this.f157293a, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
