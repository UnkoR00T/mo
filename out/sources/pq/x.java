package pq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\f\u001a%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001e\u001a\u00020\u001b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f\u001aE\u0010\"\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0 ¢\u0006\u0004\b\"\u0010#\u001a'\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020%H\u0001¢\u0006\u0004\b*\u0010)\"\u0019\u0010.\u001a\u00020+*\u0006\u0012\u0002\b\u00030\u00048F¢\u0006\u0006\u001a\u0004\b,\u0010-\"!\u00101\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"T", "", "", "isVarargs", "", "h", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "", "n", "()Ljava/util/List;", "elements", "q", "([Ljava/lang/Object;)Ljava/util/List;", "", "t", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "r", "(Ljava/lang/Object;)Ljava/util/List;", "s", "u", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "k", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Lkotlin/Function1;", "comparison", "j", "(Ljava/util/List;IILer/l;)I", "size", "Loq/i0;", "v", "(III)V", "x", "()V", "w", "Llr/i;", "o", "(Ljava/util/Collection;)Llr/i;", "indices", "p", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class x extends w {
    public static <T> ArrayList<T> g(T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(h(tArr, true));
    }

    public static final <T> Collection<T> h(T[] tArr, boolean z15) {
        return new l(tArr, z15);
    }

    public static /* synthetic */ Collection i(Object[] objArr, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return h(objArr, z15);
    }

    public static final <T> int j(List<? extends T> list, int i15, int i16, er.l<? super T, Integer> lVar) {
        v(list.size(), i15, i16);
        int i17 = i16 - 1;
        while (i15 <= i17) {
            int i18 = (i15 + i17) >>> 1;
            int iIntValue = lVar.b(list.get(i18)).intValue();
            if (iIntValue < 0) {
                i15 = i18 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i18;
                }
                i17 = i18 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final <T extends Comparable<? super T>> int k(List<? extends T> list, T t15, int i15, int i16) {
        v(list.size(), i15, i16);
        int i17 = i16 - 1;
        while (i15 <= i17) {
            int i18 = (i15 + i17) >>> 1;
            int iE = sq.a.e(list.get(i18), t15);
            if (iE < 0) {
                i15 = i18 + 1;
            } else {
                if (iE <= 0) {
                    return i18;
                }
                i17 = i18 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static /* synthetic */ int l(List list, int i15, int i16, er.l lVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = list.size();
        }
        return j(list, i15, i16, lVar);
    }

    public static /* synthetic */ int m(List list, Comparable comparable, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        if ((i17 & 4) != 0) {
            i16 = list.size();
        }
        return k(list, comparable, i15, i16);
    }

    public static <T> List<T> n() {
        return i0.f161704a;
    }

    public static lr.i o(Collection<?> collection) {
        return new lr.i(0, collection.size() - 1);
    }

    public static <T> int p(List<? extends T> list) {
        return list.size() - 1;
    }

    public static <T> List<T> q(T... tArr) {
        return tArr.length > 0 ? q.f(tArr) : n();
    }

    public static <T> List<T> r(T t15) {
        return t15 != null ? w.e(t15) : n();
    }

    public static <T> List<T> s(T... tArr) {
        return s.k0(tArr);
    }

    public static <T> List<T> t(T... tArr) {
        return tArr.length == 0 ? new ArrayList() : new ArrayList(h(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> u(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : w.e(list.get(0));
        }
        return n();
    }

    private static final void v(int i15, int i16, int i17) {
        if (i16 > i17) {
            throw new IllegalArgumentException("fromIndex (" + i16 + ") is greater than toIndex (" + i17 + ").");
        }
        if (i16 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i16 + ") is less than zero.");
        }
        if (i17 <= i15) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i17 + ") is greater than size (" + i15 + ").");
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
