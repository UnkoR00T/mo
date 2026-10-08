package nq1;

import j40.DropDownButtonData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f137731a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, oq.i0> f137732b = y2.m.b(36316128, false, new er.p() { // from class: nq1.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return c.d((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(36316128, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.radiobutton.ComposableSingletons$DeveloperRadioButtonScreenMapperKt.lambda$36316128.<anonymous> (DeveloperRadioButtonScreenMapper.kt:160)");
            }
            Label labelB = mx.b.b("Test", "");
            List listQ = pq.v.q(mx.b.b("Option 1", ""), mx.b.b("Option 2", ""), mx.b.b("Option 3", ""));
            Label labelB2 = mx.b.b("Choose", "");
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: nq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.e((DropDownButtonData) obj);
                    }
                };
                rVar.v(objE);
            }
            j40.l.m(new DropDownButtonData(labelB, listQ, null, null, labelB2, false, null, (er.l) objE, 108, null), rVar, DropDownButtonData.f99359i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(DropDownButtonData dropDownButtonData) {
        return oq.i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, oq.i0> c() {
        return f137732b;
    }
}
