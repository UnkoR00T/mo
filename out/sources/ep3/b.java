package ep3;

import b30.k;
import co3.SingleCardData;
import er.p;
import java.util.ArrayList;
import java.util.List;
import m30.i;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lep3/b;", "Lb30/k;", "", "Lco3/m;", "items", "<init>", "(Ljava/util/List;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<SingleCardData> items;

    public b(List<SingleCardData> list) {
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        r rVarH = rVar.h(-1049450112);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(this) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1049450112, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.screens.verificationdetails.content.VerificationSubSectionAccordionContent.Content (VerificationSubSectionAccordionContent.kt:16)");
            }
            List<SingleCardData> list = this.items;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (SingleCardData singleCardData : list) {
                arrayList.add(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(singleCardData.getTitle(), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(singleCardData.getValue(), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
            }
            i.d(new CardListData(arrayList, null, false, null, null, 30, null), null, null, rVarH, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ep3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f52703a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
