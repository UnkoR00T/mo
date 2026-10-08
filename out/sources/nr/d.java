package nr;

import java.util.ArrayList;
import java.util.Collection;
import mr.n;
import p071kotlin.Metadata;
import pr.c0;
import pr.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\">\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u001c\u0010\u000e\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001c\u0010\u0010\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"", "T", "Lmr/c;", "", "Lmr/n;", "a", "(Lmr/c;)Ljava/util/Collection;", "getMemberProperties$annotations", "(Lmr/c;)V", "memberProperties", "Lpr/c0;", "", "b", "(Lpr/c0;)Z", "isExtension", "c", "isNotExtension", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final <T> Collection<n<T, ?>> a(mr.c<T> cVar) {
        Collection<c0<?>> collectionJ = ((f0) cVar).U().getValue().J();
        ArrayList arrayList = new ArrayList();
        for (T t15 : collectionJ) {
            c0 c0Var = (c0) t15;
            if (c(c0Var) && (c0Var instanceof n)) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }

    private static final boolean b(c0<?> c0Var) {
        return c0Var.d0().R() != null;
    }

    private static final boolean c(c0<?> c0Var) {
        return !b(c0Var);
    }
}
