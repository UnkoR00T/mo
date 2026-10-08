package u2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\f\b\u0001\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lu2/l;", "E", "Lt2/c;", "Lu2/c;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", "n", "(I)[Ljava/lang/Object;", "element", "Lt2/e;", "add", "(Ljava/lang/Object;)Lt2/e;", "", "elements", "addAll", "(Ljava/util/Collection;)Lt2/e;", "Lkotlin/Function1;", "", "predicate", "P2", "(Ler/l;)Lt2/e;", "index", "(ILjava/lang/Object;)Lt2/e;", "T0", "(I)Lt2/e;", "Lt2/e$a;", "builder", "()Lt2/e$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "f", "()I", "c", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l<E> extends c<E> implements t2.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f194415d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l f194416e = new l(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] buffer;

    /* JADX INFO: renamed from: u2.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu2/l$a;", "", "<init>", "()V", "Lu2/l;", "", "EMPTY", "Lu2/l;", "a", "()Lu2/l;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final l a() {
            return l.f194416e;
        }

        private Companion() {
        }
    }

    public l(Object[] objArr) {
        this.buffer = objArr;
        x2.a.a(objArr.length <= 32);
    }

    private final Object[] n(int size) {
        return new Object[size];
    }

    @Override // t2.e
    public t2.e<E> P2(er.l<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size2; i15++) {
            Object obj = this.buffer[i15];
            if (predicate.b(obj).booleanValue()) {
                if (!z15) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z15 = true;
                    size = i15;
                }
            } else if (z15) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f194416e : new l(pq.n.v(objArrCopyOf, 0, size));
    }

    @Override // t2.e
    public t2.e<E> T0(int index) {
        x2.d.a(index, size());
        if (size() == 1) {
            return f194416e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        pq.n.n(this.buffer, objArrCopyOf, index, index + 1, size());
        return new l(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, t2.e
    public t2.e<E> add(E element) {
        if (size() >= 32) {
            return new f(this.buffer, n.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        objArrCopyOf[size()] = element;
        return new l(objArrCopyOf);
    }

    @Override // u2.c, java.util.Collection, java.util.List, t2.e
    public t2.e<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() > 32) {
            t2.e.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(elements);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new l(objArrCopyOf);
    }

    @Override // t2.e
    public t2.e.a<E> builder() {
        return new h(this, null, this.buffer, 0);
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f */
    public int getSize() {
        return this.buffer.length;
    }

    @Override // pq.d, java.util.List
    public E get(int index) {
        x2.d.a(index, size());
        return (E) this.buffer[index];
    }

    @Override // pq.d, java.util.List
    public int indexOf(Object element) {
        return pq.n.D0(this.buffer, element);
    }

    @Override // pq.d, java.util.List
    public int lastIndexOf(Object element) {
        return pq.n.O0(this.buffer, element);
    }

    @Override // pq.d, java.util.List
    public ListIterator<E> listIterator(int index) {
        x2.d.b(index, size());
        return new d(this.buffer, index, size());
    }

    @Override // pq.d, java.util.List
    public t2.e<E> set(int index, E element) {
        x2.d.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[index] = element;
        return new l(objArrCopyOf);
    }

    @Override // java.util.List, t2.e
    public t2.e<E> add(int index, E element) {
        x2.d.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        if (size() < 32) {
            Object[] objArrN = n(size() + 1);
            pq.n.s(this.buffer, objArrN, 0, 0, index, 6, null);
            pq.n.n(this.buffer, objArrN, index + 1, index, size());
            objArrN[index] = element;
            return new l(objArrN);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        pq.n.n(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new f(objArrCopyOf, n.c(this.buffer[31]), size() + 1, 0);
    }
}
