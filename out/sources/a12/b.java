package a12;

import er.p;
import er.q;
import f3.m;
import j30.ButtonTextData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"La12/b;", "Ln50/e;", "La12/e;", "data", "<init>", "(La12/e;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "La12/e;", "getData", "()La12/e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements n50.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1256b = ButtonTextData.f99099f | r50.a.f171863f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SearchResultSingleCardData data;

    public b(SearchResultSingleCardData searchResultSingleCardData) {
        this.data = searchResultSingleCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(915295253);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(915295253, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.custom.singlecard.SearchResultSingleCardCustomContent.Content (SearchResultSingleCardCustomContent.kt:27)");
            }
            d.b(this.data, rVarH, r50.a.f171863f | ButtonTextData.f99099f);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a12.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f1254a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
