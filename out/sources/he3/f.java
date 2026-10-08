package he3;

import c5.w;
import er.p;
import j70.h;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.SpanStyle;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "testTag", "Lhe3/d$a;", "description", "Loq/i0;", "b", "(Ljava/lang/String;Lhe3/d$a;Lm2/r;I)V", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final String str, final d.Description description, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1481739754);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(str) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(description) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1481739754, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.components.DescriptionRow (VehicleCardCustomContent.kt:98)");
            }
            rVarH.X(1977243001);
            q4.e.b bVar = new q4.e.b(0, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            int iO = bVar.o(SpanStyle.b(aVar.f(rVarH, i17).b().P(), aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                bVar.f(description.getTitle() + ": ");
                i0 i0Var = i0.f148189a;
                bVar.l(iO);
                int iO2 = bVar.o(SpanStyle.b(aVar.f(rVarH, i17).m().P(), aVar.a(rVarH, i17).getNeutral().b(), w.g(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65532, null));
                try {
                    bVar.f(description.getText());
                    bVar.l(iO2);
                    int i18 = i16;
                    q4.e eVarP = bVar.p();
                    rVarH.R();
                    rVar2 = rVarH;
                    h.g(null, str, null, null, eVarP, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, (i18 << 3) & 112, 0, 0, 33554413);
                    if (t.k()) {
                        t.n();
                    }
                } catch (Throwable th4) {
                    bVar.l(iO2);
                    throw th4;
                }
            } catch (Throwable th5) {
                bVar.l(iO);
                throw th5;
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: he3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.c(str, description, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(String str, d.Description description, int i15, r rVar, int i16) {
        b(str, description, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
