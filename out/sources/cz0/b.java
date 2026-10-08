package cz0;

import b30.k;
import er.p;
import m30.i;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcz0/b;", "Lb30/k;", "Ln30/b;", "otherParametersCardListData", "<init>", "(Ln30/b;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Ln30/b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CardListData otherParametersCardListData;

    public b(CardListData cardListData) {
        this.otherParametersCardListData = cardListData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-318551931);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-318551931, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.content.OtherParametersAccordionContent.Content (OtherParametersAccordionContent.kt:11)");
            }
            i.d(this.otherParametersCardListData, null, null, rVarH, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: cz0.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f38773a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
