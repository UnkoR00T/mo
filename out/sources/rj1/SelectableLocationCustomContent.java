package rj1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h30.q;
import j70.h;
import mx.Label;
import n50.e;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import tj1.SelectableLocationData;

/* JADX INFO: renamed from: rj1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lrj1/b;", "Ln50/e;", "Ltj1/a;", "selectableLocationData", "<init>", "(Ltj1/a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltj1/a;", "getSelectableLocationData", "()Ltj1/a;", "e", "()Z", "isInCard", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectableLocationCustomContent implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelectableLocationData selectableLocationData;

    /* JADX INFO: renamed from: rj1.b$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f174620a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1228409028);
            if (t.k()) {
                t.o(-1228409028, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.components.SelectableLocationCustomContent.Content.<anonymous>.<anonymous> (SelectableLocationCustomContent.kt:85)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public SelectableLocationCustomContent(SelectableLocationData selectableLocationData) {
        this.selectableLocationData = selectableLocationData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(SelectableLocationCustomContent selectableLocationCustomContent, int i15, r rVar, int i16) {
        selectableLocationCustomContent.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        final SelectableLocationCustomContent selectableLocationCustomContent;
        float spacing100;
        m.Companion companion;
        int i17;
        r rVarH = rVar.h(1299268502);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1299268502, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.components.SelectableLocationCustomContent.Content (SelectableLocationCustomContent.kt:30)");
            }
            c.Companion companion2 = c.INSTANCE;
            c.InterfaceC1317c interfaceC1317cI = companion2.i();
            m.Companion companion3 = m.INSTANCE;
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion3);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            m mVarC = p3.c(q3.f39261a, companion3, 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label unitName = this.selectableLocationData.getUnitName();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            h.g(null, null, unitName, null, null, aVar.a(rVarH, i18).getNeutral().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(d.i(companion3, aVar.b(rVarH, i18).getSpacing100()), rVarH, 0);
            h.g(null, null, this.selectableLocationData.getUnitAddress(), null, null, aVar.a(rVarH, i18).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            boolean zE = e();
            if (zE) {
                rVarH.X(575560090);
                spacing100 = aVar.b(rVarH, i18).getSpacing200();
                rVarH.R();
            } else {
                if (zE) {
                    rVarH.X(575558298);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(575561818);
                spacing100 = aVar.b(rVarH, i18).getSpacing100();
                rVarH.R();
            }
            r3.a(d.i(companion3, spacing100), rVarH, 0);
            selectableLocationCustomContent = this;
            h.g(null, null, this.selectableLocationData.getDisplayedDateLabel(), null, null, aVar.a(rVarH, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).c(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            Label moreDatesAvailableLabel = selectableLocationCustomContent.selectableLocationData.getMoreDatesAvailableLabel();
            if (moreDatesAvailableLabel == null) {
                rVarH.X(662861081);
                rVarH.R();
            } else {
                rVarH.X(662861082);
                r3.a(d.i(companion3, aVar.b(rVarH, i18).getSpacing100()), rVarH, 0);
                h.g(null, null, moreDatesAvailableLabel, null, null, aVar.a(rVarH, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).c(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                i0 i0Var2 = i0.f148189a;
                rVarH.R();
            }
            if (selectableLocationCustomContent.selectableLocationData.getSignUpButtonData() == null) {
                rVarH.X(663216372);
                rVarH.R();
                companion = companion3;
                i17 = 0;
            } else {
                rVarH.X(663216373);
                companion = r39;
                i17 = 0;
                r3.a(d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                q.p(selectableLocationCustomContent.selectableLocationData.getSignUpButtonData(), false, null, rVarH, 0, 6);
                i0 i0Var3 = i0.f148189a;
                rVarH.R();
            }
            rVarH.x();
            if (selectableLocationCustomContent.e()) {
                rVarH.X(400452335);
                r3.a(d.y(companion, aVar.b(rVarH, i18).getSpacing100()), rVarH, i17);
                d40.h.f(null, new d40.b.C0864b(null, jz.a.V, d40.i.f.f39709e, a.f174620a, null, null, 33, null), false, rVarH, d40.b.C0864b.f39687h << 3, 5);
            } else {
                rVarH.X(397513256);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            selectableLocationCustomContent = this;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rj1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return SelectableLocationCustomContent.d(this.f174617a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ er.q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }

    public final boolean e() {
        return this.selectableLocationData.getSignUpButtonData() == null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SelectableLocationCustomContent) && fr.t.c(this.selectableLocationData, ((SelectableLocationCustomContent) other).selectableLocationData);
    }

    public int hashCode() {
        return this.selectableLocationData.hashCode();
    }

    public String toString() {
        return "SelectableLocationCustomContent(selectableLocationData=" + this.selectableLocationData + ')';
    }
}
