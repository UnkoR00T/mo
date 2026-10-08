package he3;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import j70.h;
import n4.f0;
import n4.g0;
import n4.v;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i1;

/* JADX INFO: renamed from: he3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhe3/c;", "Ln50/e;", "Lhe3/d;", "data", "<init>", "(Lhe3/d;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhe3/d;", "getData", "()Lhe3/d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCardCustomContent implements n50.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d data;

    /* JADX INFO: renamed from: he3.c$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84046a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1852137681);
            if (t.k()) {
                t.o(1852137681, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.components.VehicleCardCustomContent.Content.<anonymous>.<anonymous> (VehicleCardCustomContent.kt:86)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public VehicleCardCustomContent(d dVar) {
        this.data = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(VehicleCardCustomContent vehicleCardCustomContent, n4.i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, vehicleCardCustomContent.data.getTestTag() + "VehicleIcon");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(VehicleCardCustomContent vehicleCardCustomContent, int i15, r rVar, int i16) {
        vehicleCardCustomContent.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        final VehicleCardCustomContent vehicleCardCustomContent;
        r rVar2;
        r rVarH = rVar.h(-1768389946);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1768389946, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.components.VehicleCardCustomContent.Content (VehicleCardCustomContent.kt:40)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            m.Companion companion2 = m.INSTANCE;
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            m mVarT = androidx.compose.foundation.layout.d.t(companion2, d40.i.C0865i.f39712e.getDimension());
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: he3.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return VehicleCardCustomContent.e(this.f84042a, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            i1.c(l4.c.c(this.data.getVehicleIcon(), rVarH, 0), null, v.d(mVarT, false, (l) objE, 1, null), null, null, 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            m mVarC = p3.c(q3Var, androidx.compose.foundation.layout.d.h(a3.r(companion2, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2 = rVarH;
            h.g(null, this.data.getTestTag() + "Title", mx.b.b(this.data.getTitle(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVar2, 0, 0, 0, 33030137);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            StringBuilder sb5 = new StringBuilder();
            vehicleCardCustomContent = this;
            sb5.append(vehicleCardCustomContent.data.getTestTag());
            sb5.append("DescriptionRegistrationNumber");
            f.b(sb5.toString(), vehicleCardCustomContent.data.getDescriptionRegistrationNumber(), rVar2, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            f.b(vehicleCardCustomContent.data.getTestTag() + "DescriptionVin", vehicleCardCustomContent.data.getDescriptionVin(), rVar2, 0);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            d40.h.f(null, new d40.b.C0864b(null, jz.a.V, d40.i.f.f39709e, a.f84046a, null, null, 33, null), false, rVar2, d40.b.C0864b.f39687h << 3, 5);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            vehicleCardCustomContent = this;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: he3.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return VehicleCardCustomContent.f(this.f84043a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VehicleCardCustomContent) && fr.t.c(this.data, ((VehicleCardCustomContent) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "VehicleCardCustomContent(data=" + this.data + ')';
    }
}
