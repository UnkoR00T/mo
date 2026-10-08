package ig1;

import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import v40.InputDateTimeData;
import v40.i;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lig1/b;", "Lb50/a;", "Lv40/a;", "dateInputData", "<init>", "(Lv40/a;)V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "Lv40/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f92308b = InputDateTimeData.f203769m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputDateTimeData dateInputData;

    public b(InputDateTimeData inputDateTimeData) {
        this.dateInputData = inputDateTimeData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(881484014, i15, -1, "pl.gov.coi.mobywatel.feature.companysuspension.presentation.steps.suspensionperiod.content.SuspensionPeriodRadioButtonContent.content.<anonymous> (SuspensionPeriodRadioButtonContent.kt:11)");
            }
            i.h(bVar.dateInputData, rVar, InputDateTimeData.f203769m);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // b50.a
    public p<r, Integer, i0> a() {
        return m.b(881484014, true, new p() { // from class: ig1.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f92307a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
