package n2;

import fr.j;
import fr.t;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0012FIB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u000fJ\u001b\u0010%\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0006H\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010*J\u0015\u00103\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b3\u00101J\u0015\u00104\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b4\u0010\u000fJ\u001b\u00105\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b5\u0010\u001eJ\u0015\u00106\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b=\u0010(J\u001b\u0010>\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b>\u0010\u001eJ \u0010?\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00112\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00028\u00000Aj\b\u0012\u0004\u0012\u00028\u0000`B¢\u0006\u0004\bD\u0010ER$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010#R\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Ln2/c;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "n", "()[Ljava/lang/Object;", "element", "", "d", "(Ljava/lang/Object;)Z", "index", "Loq/i0;", "c", "(ILjava/lang/Object;)V", "", "elements", "f", "(ILjava/util/List;)Z", "g", "(ILn2/c;)Z", "", "e", "(ILjava/util/Collection;)Z", "h", "(Ljava/util/Collection;)Z", "", "i", "()Ljava/util/List;", "j", "()V", "k", "l", "capacity", "x", "(I)V", "m", "()Ljava/lang/Object;", "", "message", "", "C", "(Ljava/lang/String;)Ljava/lang/Void;", "p", "(Ljava/lang/Object;)I", "q", "s", "t", "u", "v", "(I)Ljava/lang/Object;", "start", "end", "w", "(II)V", "newSize", "A", "y", "z", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "B", "(Ljava/util/Comparator;)V", "a", "[Ljava/lang/Object;", "getContent$annotations", "b", "Ljava/util/List;", "list", "value", "I", "o", "()I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f130721d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public T[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<T> list;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Ln2/c$a;", "T", "", "Ln2/c;", "vector", "<init>", "(Ln2/c;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loq/i0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ln2/c;", "e", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<T> implements List<T>, gr.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c<T> vector;

        public a(c<T> cVar) {
            this.vector = cVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.d(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.e(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.j();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.k(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            return this.vector.l(elements);
        }

        public int e() {
            return this.vector.getSize();
        }

        public T f(int index) {
            d.a(this, index);
            return this.vector.v(index);
        }

        @Override // java.util.List
        public T get(int index) {
            d.a(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.p(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C3245c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.s(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C3245c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i15) {
            return f(i15);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> elements) {
            return this.vector.u(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> elements) {
            return this.vector.y(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d.a(this, index);
            return this.vector.z(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d.b(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.c(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.h(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new C3245c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.t(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j.b(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Ln2/c$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loq/i0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "b", "I", "c", "e", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b<T> implements List<T>, gr.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int end;

        public b(List<T> list, int i15, int i16) {
            this.list = list;
            this.start = i15;
            this.end = i16;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i15 = this.end;
            this.end = i15 + 1;
            list.add(i15, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i15 = this.end - 1;
            int i16 = this.start;
            if (i16 <= i15) {
                while (true) {
                    this.list.remove(i15);
                    if (i15 == i16) {
                        break;
                    } else {
                        i15--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i15 = this.end;
            for (int i16 = this.start; i16 < i15; i16++) {
                if (t.c(this.list.get(i16), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int e() {
            return this.end - this.start;
        }

        public T f(int index) {
            d.a(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List
        public T get(int index) {
            d.a(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i15 = this.end;
            for (int i16 = this.start; i16 < i15; i16++) {
                if (t.c(this.list.get(i16), element)) {
                    return i16 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C3245c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i15 = this.end - 1;
            int i16 = this.start;
            if (i16 > i15) {
                return -1;
            }
            while (!t.c(this.list.get(i15), element)) {
                if (i15 == i16) {
                    return -1;
                }
                i15--;
            }
            return i15 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C3245c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i15) {
            return f(i15);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> elements) {
            int i15 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i15 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> elements) {
            int i15 = this.end;
            int i16 = i15 - 1;
            int i17 = this.start;
            if (i17 <= i16) {
                while (true) {
                    if (!elements.contains(this.list.get(i16))) {
                        this.list.remove(i16);
                        this.end--;
                    }
                    if (i16 == i17) {
                        break;
                    }
                    i16--;
                }
            }
            return i15 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d.a(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d.b(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new C3245c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i15 = this.end;
            for (int i16 = this.start; i16 < i15; i16++) {
                if (t.c(this.list.get(i16), element)) {
                    this.list.remove(i16);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: n2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln2/c$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loq/i0;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C3245c<T> implements ListIterator<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public C3245c(List<T> list, int i15) {
            this.list = list;
            this.index = i15;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i15 = this.index;
            this.index = i15 + 1;
            return list.get(i15);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i15 = this.index - 1;
            this.index = i15;
            return this.list.get(i15);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i15 = this.index - 1;
            this.index = i15;
            this.list.remove(i15);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    public c(T[] tArr, int i15) {
        this.content = tArr;
        this.size = i15;
    }

    public final void A(int newSize) {
        this.size = newSize;
    }

    public final void B(Comparator<T> comparator) {
        n.T(this.content, comparator, 0, this.size);
    }

    public final Void C(String message) {
        throw new NoSuchElementException(message);
    }

    public final void c(int index, T element) {
        int i15 = this.size + 1;
        if (this.content.length < i15) {
            x(i15);
        }
        T[] tArr = this.content;
        int i16 = this.size;
        if (index != i16) {
            System.arraycopy(tArr, index, tArr, index + 1, i16 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean d(T element) {
        int i15 = this.size + 1;
        if (this.content.length < i15) {
            x(i15);
        }
        T[] tArr = this.content;
        int i16 = this.size;
        tArr[i16] = element;
        this.size = i16 + 1;
        return true;
    }

    public final boolean e(int index, Collection<? extends T> elements) {
        int i15 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i16 = this.size + size;
        if (this.content.length < i16) {
            x(i16);
        }
        T[] tArr = this.content;
        int i17 = this.size;
        if (index != i17) {
            System.arraycopy(tArr, index, tArr, index + size, i17 - index);
        }
        for (T t15 : elements) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            tArr[i15 + index] = t15;
            i15 = i18;
        }
        this.size += size;
        return true;
    }

    public final boolean f(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i15 = this.size + size;
        if (this.content.length < i15) {
            x(i15);
        }
        T[] tArr = this.content;
        int i16 = this.size;
        if (index != i16) {
            System.arraycopy(tArr, index, tArr, index + size, i16 - index);
        }
        int size2 = elements.size();
        for (int i17 = 0; i17 < size2; i17++) {
            tArr[index + i17] = elements.get(i17);
        }
        this.size += size;
        return true;
    }

    public final boolean g(int index, c<T> elements) {
        int i15 = elements.size;
        if (i15 == 0) {
            return false;
        }
        int i16 = this.size + i15;
        if (this.content.length < i16) {
            x(i16);
        }
        T[] tArr = this.content;
        int i17 = this.size;
        if (index != i17) {
            System.arraycopy(tArr, index, tArr, index + i15, i17 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i15);
        this.size += i15;
        return true;
    }

    public final boolean h(Collection<? extends T> elements) {
        return e(this.size, elements);
    }

    public final List<T> i() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final void j() {
        T[] tArr = this.content;
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            tArr[i16] = null;
        }
        this.size = 0;
    }

    public final boolean k(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i15 = 0; !t.c(this.content[i15], element); i15++) {
                if (i15 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean l(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!k(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T m() {
        if (getSize() != 0) {
            return this.content[0];
        }
        C("MutableVector is empty.");
        throw new oq.g();
    }

    public final T[] n() {
        return this.content;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int p(T element) {
        T[] tArr = this.content;
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            if (t.c(element, tArr[i16])) {
                return i16;
            }
        }
        return -1;
    }

    public final T q() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        C("MutableVector is empty.");
        throw new oq.g();
    }

    public final int s(T element) {
        T[] tArr = this.content;
        for (int i15 = this.size - 1; i15 >= 0; i15--) {
            if (t.c(element, tArr[i15])) {
                return i15;
            }
        }
        return -1;
    }

    public final boolean t(T element) {
        int iP = p(element);
        if (iP < 0) {
            return false;
        }
        v(iP);
        return true;
    }

    public final boolean u(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i15 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        return i15 != this.size;
    }

    public final T v(int index) {
        T[] tArr = this.content;
        T t15 = tArr[index];
        if (index != getSize() - 1) {
            int i15 = index + 1;
            System.arraycopy(tArr, i15, tArr, index, this.size - i15);
        }
        int i16 = this.size - 1;
        this.size = i16;
        tArr[i16] = null;
        return t15;
    }

    public final void w(int start, int end) {
        if (end > start) {
            int i15 = this.size;
            if (end < i15) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i15 - end);
            }
            int i16 = this.size - (end - start);
            int size = getSize() - 1;
            if (i16 <= size) {
                int i17 = i16;
                while (true) {
                    this.content[i17] = null;
                    if (i17 == size) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.size = i16;
        }
    }

    public final void x(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean y(Collection<? extends T> elements) {
        int i15 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                v(size);
            }
        }
        return i15 != this.size;
    }

    public final T z(int index, T element) {
        T[] tArr = this.content;
        T t15 = tArr[index];
        tArr[index] = element;
        return t15;
    }
}
