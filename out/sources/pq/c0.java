package pq;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\n\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0018\u001a!\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0018\u001a3\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"T", "", "", "elements", "", ip.a.f96138c, "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "", "E", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "F", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "", "Lkotlin/Function1;", "predicate", "I", "(Ljava/lang/Iterable;Ler/l;)Z", "O", "predicateResultToRemove", "G", "(Ljava/lang/Iterable;Ler/l;Z)Z", "", "K", "(Ljava/util/List;)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "M", "N", "J", "(Ljava/util/List;Ler/l;)Z", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/util/List;Ler/l;Z)Z", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class c0 extends b0 {
    public static <T> boolean D(Collection<? super T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z15 = true;
            }
        }
        return z15;
    }

    public static <T> boolean E(Collection<? super T> collection, T[] tArr) {
        return collection.addAll(q.f(tArr));
    }

    public static final <T> Collection<T> F(Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : g0.f1(iterable);
    }

    private static final <T> boolean G(Iterable<? extends T> iterable, er.l<? super T, Boolean> lVar, boolean z15) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z16 = false;
        while (it.hasNext()) {
            if (lVar.b(it.next()).booleanValue() == z15) {
                it.remove();
                z16 = true;
            }
        }
        return z16;
    }

    private static final <T> boolean H(List<T> list, er.l<? super T, Boolean> lVar, boolean z15) {
        int i15;
        if (!(list instanceof RandomAccess)) {
            return G(fr.w0.b(list), lVar, z15);
        }
        int iP = x.p(list);
        if (iP >= 0) {
            int i16 = 0;
            i15 = 0;
            while (true) {
                T t15 = list.get(i16);
                if (lVar.b(t15).booleanValue() != z15) {
                    if (i15 != i16) {
                        list.set(i15, t15);
                    }
                    i15++;
                }
                if (i16 == iP) {
                    break;
                }
                i16++;
            }
        } else {
            i15 = 0;
        }
        if (i15 >= list.size()) {
            return false;
        }
        int iP2 = x.p(list);
        if (i15 > iP2) {
            return true;
        }
        while (true) {
            list.remove(iP2);
            if (iP2 == i15) {
                return true;
            }
            iP2--;
        }
    }

    public static <T> boolean I(Iterable<? extends T> iterable, er.l<? super T, Boolean> lVar) {
        return G(iterable, lVar, true);
    }

    public static <T> boolean J(List<T> list, er.l<? super T, Boolean> lVar) {
        return H(list, lVar, true);
    }

    public static <T> T K(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T L(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T M(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(x.p(list));
    }

    public static <T> T N(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(x.p(list));
    }

    public static <T> boolean O(Iterable<? extends T> iterable, er.l<? super T, Boolean> lVar) {
        return G(iterable, lVar, false);
    }
}
