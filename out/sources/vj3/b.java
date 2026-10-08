package vj3;

import er.p;
import er.q;
import f3.m;
import m70.TimelineData;
import m70.f;
import n50.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lvj3/b;", "Ln50/e;", "Lm70/a;", "data", "<init>", "(Lm70/a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lm70/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f207127b = TimelineData.f124016b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TimelineData data;

    public b(TimelineData timelineData) {
        this.data = timelineData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-391012880);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-391012880, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.timeline.content.VehicleHistoryTimelineContent.Content (VehicleHistoryTimelineContent.kt:11)");
            }
            f.g(this.data, rVarH, TimelineData.f124016b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: vj3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f207125a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
