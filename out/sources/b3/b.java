package b3;

import fr.w0;
import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Lb3/b0;", "", "save", "Lkotlin/Function1;", "restore", "Lb3/x;", "", "b", "(Ler/p;Ler/l;)Lb3/x;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final <Original, Saveable> x<Original, Object> b(final er.p<? super b0, ? super Original, ? extends List<? extends Saveable>> pVar, er.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        return a0.e(new er.p() { // from class: b3.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.c(pVar, (b0) obj, obj2);
            }
        }, (er.l) w0.g(lVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(er.p pVar, b0 b0Var, Object obj) {
        List list = (List) pVar.B(b0Var, obj);
        List list2 = list;
        int size = list2.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj2 = list.get(i15);
            if (obj2 != null && !b0Var.b(obj2)) {
                throw new IllegalArgumentException(("item at index " + i15 + " can't be saved: " + obj2).toString());
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
