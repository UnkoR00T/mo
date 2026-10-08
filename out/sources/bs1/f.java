package bs1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i0;
import d1.r3;
import java.util.ArrayList;
import java.util.Iterator;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import u50.v0;
import vy.Address;
import w0.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lbs1/c;", "viewModel", "Loq/i0;", "e", "(Lbs1/c;Lm2/r;I)V", "Lbs1/c$a;", "state", "c", "(Lbs1/c$a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void c(final c.Data data, r rVar, final int i15) {
        r rVar2;
        r rVarH = rVar.h(114277976);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(data) ? 4 : 2) | i15 : i15;
        int i17 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(114277976, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.searchaddress.SearchAddressContent (SearchAddressScreen.kt:37)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i18).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            i0 i0Var = i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, 0);
            v50.c search = data.getSearch();
            int i19 = v50.c.f203957t;
            v0.g(search, null, rVarH, i19, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(data.getDistance(), null, rVarH, i19, 2);
            boolean z15 = true;
            f3.m mVarS = t70.i.S(companion, u2.b(0, rVarH, 0, 1), rVarH, 6, 0);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVarH.X(-1305568723);
            ArrayList arrayList = new ArrayList(v.y(data.b(), 10));
            for (Iterator it = r2.iterator(); it.hasNext(); it = it) {
                Address address = (Address) it.next();
                f3.m.Companion companion4 = f3.m.INSTANCE;
                w0 w0VarA3 = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, i17);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, i17));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, companion4);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarA3, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE3, companion5.e());
                i0 i0Var2 = i0.f39176a;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, i17);
                ArrayList arrayList2 = arrayList;
                r rVar3 = rVarH;
                j70.h.g(null, null, mx.b.b("postalCode: " + address.getPostalCode(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("locality: " + address.getLocality(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("adminArea: " + address.getAdminArea(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("countryName: " + address.getCountryName(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("thoroughfare: " + address.getThoroughfare(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("subThoroughfare: " + address.getSubThoroughfare(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("coordinates: " + address.getCoordinates(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("premises: " + address.getPremises(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("subAdminArea: " + address.getSubAdminArea(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("featureName: " + address.getFeatureName(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                j70.h.g(null, null, mx.b.b("extras: " + address.getExtras(), ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554427);
                rVarH = rVar3;
                vb.h(null, c5.h.n((float) 1), Color.INSTANCE.a(), rVarH, 432, 1);
                rVar3.x();
                arrayList2.add(oq.i0.f148189a);
                arrayList = arrayList2;
                z15 = true;
                i17 = i17;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bs1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.d(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(c.Data data, int i15, r rVar, int i16) {
        c(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void e(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1432298519);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1432298519, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.searchaddress.SearchAddressScreen (SearchAddressScreen.kt:28)");
            }
            c(f(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bs1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data f(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(c cVar, int i15, r rVar, int i16) {
        e(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
