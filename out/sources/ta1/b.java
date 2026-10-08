package ta1;

import b30.k;
import er.p;
import java.util.List;
import m30.i;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lta1/b;", "Lb30/k;", "", "Ln50/k;", "singleCardList", "<init>", "(Ljava/util/List;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<n50.k> singleCardList;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends n50.k> list) {
        this.singleCardList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-802026108);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-802026108, i16, -1, "pl.gov.coi.mobywatel.feature.company.presentation.details.content.DetailsCardListContent.Content (DetailsCardListContent.kt:12)");
            }
            i.d(new CardListData(this.singleCardList, null, false, null, null, 30, null), null, null, rVarH, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ta1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f189357a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
