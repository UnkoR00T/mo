package sq;

import er.l;
import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aG\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\r\"\b\b\u0000\u0010\u0000*\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "f", "(Ljava/lang/Object;Ljava/lang/Object;[Ler/l;)I", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "c", "([Ler/l;)Ljava/util/Comparator;", "", "comparator", "h", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class d {
    public static <T> Comparator<T> c(final l<? super T, ? extends Comparable<?>>... lVarArr) {
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: sq.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return d.d(lVarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(l[] lVarArr, Object obj, Object obj2) {
        return f(obj, obj2, lVarArr);
    }

    public static <T extends Comparable<?>> int e(T t15, T t16) {
        if (t15 == t16) {
            return 0;
        }
        if (t15 == null) {
            return -1;
        }
        if (t16 == null) {
            return 1;
        }
        return t15.compareTo(t16);
    }

    private static final <T> int f(T t15, T t16, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iE = e(lVar.b(t15), lVar.b(t16));
            if (iE != 0) {
                return iE;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> g() {
        return g.f183502a;
    }

    public static <T> Comparator<T> h(final Comparator<? super T> comparator) {
        return new Comparator() { // from class: sq.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.i(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }
}
