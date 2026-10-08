package yb3;

import ga3.StageField;
import java.util.List;
import java.util.function.Predicate;
import p071kotlin.Metadata;
import z93.Place;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyb3/q;", "", "<init>", "()V", "", "Lga3/d;", "", "itemId", "Lkotlin/Function1;", "block", "i", "(Ljava/util/List;Ljava/lang/String;Ler/l;)Ljava/util/List;", "stages", "newItem", "e", "(Ljava/lang/String;Ljava/util/List;Lga3/d;)Ljava/util/List;", "", "f", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "Lfz/e$a;", "dateRange", "j", "(Ljava/lang/String;Lfz/e$a;Ljava/util/List;)Ljava/util/List;", "Lz93/c;", "place", "l", "(Ljava/lang/String;Lz93/c;Ljava/util/List;)Ljava/util/List;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(String str, StageField stageField) {
        return fr.t.c(stageField.getId(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(er.l lVar, Object obj) {
        return ((Boolean) lVar.b(obj)).booleanValue();
    }

    private final List<StageField> i(List<StageField> list, String str, er.l<? super StageField, StageField> lVar) {
        Integer numC = b.c(list, str);
        if (numC == null) {
            return list;
        }
        int iIntValue = numC.intValue();
        List<StageField> listI1 = pq.v.i1(list);
        listI1.set(iIntValue, lVar.b(listI1.get(iIntValue)));
        return listI1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StageField k(fz.e.LocalDate localDate, StageField stageField) {
        return StageField.b(stageField, null, stageField.c().a(localDate, hz.b.d.f86848c), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StageField m(Place place, StageField stageField) {
        return StageField.b(stageField, null, null, stageField.f().a(place, hz.b.d.f86848c), 3, null);
    }

    public final List<StageField> e(String itemId, List<StageField> stages, StageField newItem) {
        Integer numC = b.c(stages, itemId);
        if (numC == null) {
            return stages;
        }
        int iIntValue = numC.intValue();
        List<StageField> listI1 = pq.v.i1(stages);
        listI1.add(iIntValue + 1, newItem);
        return listI1;
    }

    public final List<StageField> f(final String itemId, List<StageField> stages) {
        List<StageField> listI1 = pq.v.i1(stages);
        final er.l lVar = new er.l() { // from class: yb3.n
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(q.g(itemId, (StageField) obj));
            }
        };
        listI1.removeIf(new Predicate() { // from class: yb3.o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return q.h(lVar, obj);
            }
        });
        return listI1;
    }

    public final List<StageField> j(String itemId, final fz.e.LocalDate dateRange, List<StageField> stages) {
        return i(stages, itemId, new er.l() { // from class: yb3.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.k(dateRange, (StageField) obj);
            }
        });
    }

    public final List<StageField> l(String itemId, final Place place, List<StageField> stages) {
        return i(stages, itemId, new er.l() { // from class: yb3.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.m(place, (StageField) obj);
            }
        });
    }
}
