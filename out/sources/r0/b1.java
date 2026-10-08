package r0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "", "index", "Loq/i0;", "d", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "e", "(Ljava/util/List;II)V", "E", "Lr0/a1;", "f", "()Lr0/a1;", "element1", "i", "(Ljava/lang/Object;)Lr0/a1;", "Lr0/q0;", "g", "(Ljava/lang/Object;)Lr0/q0;", "element2", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Lr0/q0;", "", "", "a", "[Ljava/lang/Object;", "EmptyArray", "b", "Lr0/a1;", "EmptyObjectList", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f169808a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a1<Object> f169809b = new q0(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i15) {
        int size = list.size();
        if (i15 < 0 || i15 >= size) {
            s0.d.c("Index " + i15 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i15, int i16) {
        int size = list.size();
        if (i15 > i16) {
            s0.d.a("Indices are out of order. fromIndex (" + i15 + ") is greater than toIndex (" + i16 + ").");
        }
        if (i15 < 0) {
            s0.d.c("fromIndex (" + i15 + ") is less than 0.");
        }
        if (i16 > size) {
            s0.d.c("toIndex (" + i16 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> a1<E> f() {
        return (a1<E>) f169809b;
    }

    public static final <E> q0<E> g(E e15) {
        q0<E> q0Var = new q0<>(1);
        q0Var.n(e15);
        return q0Var;
    }

    public static final <E> q0<E> h(E e15, E e16) {
        q0<E> q0Var = new q0<>(2);
        q0Var.n(e15);
        q0Var.n(e16);
        return q0Var;
    }

    public static final <E> a1<E> i(E e15) {
        return g(e15);
    }
}
