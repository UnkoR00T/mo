package yb3;

import ga3.StageField;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u000b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lga3/d;", "", "itemId", "", "c", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Integer;", "T", "Lkotlin/Function1;", "", "predicate", "b", "(Ljava/util/List;Ler/l;)Ljava/lang/Integer;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final <T> Integer b(List<? extends T> list, er.l<? super T, Boolean> lVar) {
        Iterator<? extends T> it = list.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (lVar.b(it.next()).booleanValue()) {
                break;
            }
            i15++;
        }
        Integer numValueOf = Integer.valueOf(i15);
        if (numValueOf.intValue() != -1) {
            return numValueOf;
        }
        return null;
    }

    public static final Integer c(List<StageField> list, final String str) {
        return b(list, new er.l() { // from class: yb3.a
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(b.d(str, (StageField) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(String str, StageField stageField) {
        return fr.t.c(stageField.getId(), str);
    }
}
