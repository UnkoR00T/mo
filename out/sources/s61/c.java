package s61;

import java.util.ArrayList;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls61/a;", "Lmx/c;", "labelProvider", "Lkotlin/Function0;", "Loq/i0;", "closeBottomSheet", "Ls61/d$a;", "b", "(Ls61/a;Lmx/c;Ler/a;)Ls61/d$a;", "childpassportapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final d.File b(final a aVar, mx.c cVar, final er.a<i0> aVar2) {
        if (!(aVar instanceof a.SelectOption)) {
            throw new p();
        }
        wq.a<e> aVarE = e.e();
        ArrayList arrayList = new ArrayList(v.y(aVarE, 10));
        for (final e eVar : aVarE) {
            arrayList.add(f.a(eVar, cVar, new er.a() { // from class: s61.b
                @Override // er.a
                public final Object a() {
                    return c.c(aVar, eVar, aVar2);
                }
            }));
        }
        return new d.File(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(a aVar, e eVar, er.a aVar2) {
        ((a.SelectOption) aVar).a().b(eVar);
        aVar2.a();
        return i0.f148189a;
    }
}
