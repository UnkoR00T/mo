package sv1;

import er.p;
import er.q;
import f3.m;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsv1/b;", "Ln50/e;", "Lsv1/c;", "data", "<init>", "(Lsv1/c;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lsv1/c;", "getData", "()Lsv1/c;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements n50.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DynamicDocumentsListCustomContentData data;

    public b(DynamicDocumentsListCustomContentData dynamicDocumentsListCustomContentData) {
        this.data = dynamicDocumentsListCustomContentData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1380642908);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1380642908, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.common.component.DynamicDocumentsListCustomContent.Content (DynamicDocumentsListCustomContent.kt:48)");
            }
            f.c(this.data, rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: sv1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f184703a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<n50.e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
