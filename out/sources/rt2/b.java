package rt2;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import j70.h;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lrt2/b;", "Lb50/a;", "Lv40/a;", "inputDateData", "inputTimeData", "Ll60/c;", "otherTimeZoneSection", "<init>", "(Lv40/a;Lv40/a;Ll60/c;)V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "Lv40/a;", "b", "c", "Ll60/c;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements b50.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f176094d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputDateTimeData inputDateData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputDateTimeData inputTimeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KeyValueData otherTimeZoneSection;

    static {
        int i15 = KeyValueData.f116329d;
        int i16 = InputDateTimeData.f203769m;
        f176094d = i15 | i16 | i16;
    }

    public b(InputDateTimeData inputDateTimeData, InputDateTimeData inputDateTimeData2, KeyValueData keyValueData) {
        this.inputDateData = inputDateTimeData;
        this.inputTimeData = inputDateTimeData2;
        this.otherTimeZoneSection = keyValueData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-257969091, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.unrestrict.content.UnrestrictRadioButtonContent.content.<anonymous> (UnrestrictRadioButtonContent.kt:21)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            InputDateTimeData inputDateTimeData = bVar.inputDateData;
            int i16 = InputDateTimeData.f203769m;
            v40.i.h(inputDateTimeData, rVar, i16);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            v40.i.h(bVar.inputTimeData, rVar, i16);
            KeyValueData keyValueData = bVar.otherTimeZoneSection;
            if (keyValueData == null) {
                rVar.X(-1204502923);
                rVar.R();
            } else {
                rVar.X(-1204502922);
                Label label = keyValueData.getLabel();
                Label description = keyValueData.getDescription();
                h.g(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 0.0f, 13, null), null, label, null, null, aVar.a(rVar, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                h.g(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing250(), 0.0f, 0.0f, 13, null), null, description, null, null, aVar.a(rVar, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                rVar.R();
            }
            rVar.x();
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
        return y2.m.b(-257969091, true, new p() { // from class: rt2.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(this.f176093a, (r) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
