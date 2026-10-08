package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003>?;B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00032\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0001¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b*\u0010\rJ\u001b\u0010+\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010,\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b,\u0010!J\u0017\u0010-\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u00032\b\b\u0001\u00100\u001a\u00020\u0003¢\u0006\u0004\b1\u00102J\u001b\u0010\u0001\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0001\u00103J\"\u00104\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b6\u00107J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008¢\u0006\u0004\b9\u00107R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lr0/q0;", "E", "Lr0/a1;", "", "initialCapacity", "<init>", "(I)V", "index", "Loq/i0;", "G", "element", "", "n", "(Ljava/lang/Object;)Z", "m", "(ILjava/lang/Object;)V", "", "elements", "o", "(ILjava/util/Collection;)Z", "r", "(Lr0/a1;)Z", "", "q", "(Ljava/util/List;)Z", "", "p", "(Ljava/lang/Iterable;)Z", "y", "(Lr0/a1;)V", "x", "(Ljava/util/List;)V", "w", "(Ljava/lang/Iterable;)V", "u", "()V", "capacity", "", "", "oldContent", ip.a.f96138c, "(I[Ljava/lang/Object;)V", "z", "A", "v", "B", "(I)Ljava/lang/Object;", "start", "end", "C", "(II)V", "(Ljava/util/Collection;)Z", "F", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "()Ljava/util/List;", "", "t", "Lr0/q0$b;", "c", "Lr0/q0$b;", "list", "a", "b", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q0<E> extends a1<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b<E> list;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lr0/q0$a;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loq/i0;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "prevIndex", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a<T> implements ListIterator<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int prevIndex;

        public a(List<T> list, int i15) {
            this.list = list;
            this.prevIndex = i15 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            List<T> list = this.list;
            int i15 = this.prevIndex + 1;
            this.prevIndex = i15;
            list.add(i15, element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i15 = this.prevIndex + 1;
            this.prevIndex = i15;
            return list.get(i15);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i15 = this.prevIndex;
            this.prevIndex = i15 - 1;
            return list.get(i15);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lr0/q0$b;", "T", "", "Lr0/q0;", "objectList", "<init>", "(Lr0/q0;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loq/i0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Lr0/q0;", "e", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b<T> implements List<T>, gr.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q0<T> objectList;

        public b(q0<T> q0Var) {
            this.objectList = q0Var;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.objectList.n(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.objectList.o(index, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.u();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.a(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            return this.objectList.b(elements);
        }

        public int e() {
            return this.objectList.get_size();
        }

        public T f(int index) {
            b1.d(this, index);
            return this.objectList.B(index);
        }

        @Override // java.util.List
        public T get(int index) {
            b1.d(this, index);
            return this.objectList.d(index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.f(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.g();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.k(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i15) {
            return f(i15);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            return this.objectList.A(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            return this.objectList.E(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            b1.d(this, index);
            return this.objectList.F(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            b1.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return fr.j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.objectList.m(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.objectList.p(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.z(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fr.j.b(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lr0/q0$c;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loq/i0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "b", "I", "c", "e", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c<T> implements List<T>, gr.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int end;

        public c(List<T> list, int i15, int i16) {
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
            this.end += elements.size();
            return elements.size() > 0;
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
                if (fr.t.c(this.list.get(i16), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
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
            b1.d(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List
        public T get(int index) {
            b1.d(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i15 = this.end;
            for (int i16 = this.start; i16 < i15; i16++) {
                if (fr.t.c(this.list.get(i16), element)) {
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
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i15 = this.end - 1;
            int i16 = this.start;
            if (i16 > i15) {
                return -1;
            }
            while (!fr.t.c(this.list.get(i15), element)) {
                if (i15 == i16) {
                    return -1;
                }
                i15--;
            }
            return i15 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i15) {
            return f(i15);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            int i15 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i15 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
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
            b1.d(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            b1.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return fr.j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i15 = this.end;
            for (int i16 = this.start; i16 < i15; i16++) {
                if (fr.t.c(this.list.get(i16), element)) {
                    this.list.remove(i16);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fr.j.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public q0() {
        this(0, 1, null);
    }

    private final void G(int index) {
        s0.d.c("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean A(Iterable<? extends E> elements) {
        int i15 = this._size;
        v(elements);
        return i15 != this._size;
    }

    public final E B(int index) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        Object[] objArr = this.content;
        E e15 = (E) objArr[index];
        int i15 = this._size;
        if (index != i15 - 1) {
            pq.n.n(objArr, objArr, index, index + 1, i15);
        }
        int i16 = this._size - 1;
        this._size = i16;
        objArr[i16] = null;
        return e15;
    }

    public final void C(int start, int end) {
        int i15;
        if (start < 0 || start > (i15 = this._size) || end < 0 || end > i15) {
            s0.d.c("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
        }
        if (end < start) {
            s0.d.a("Start (" + start + ") is more than end (" + end + ')');
        }
        if (end != start) {
            int i16 = this._size;
            if (end < i16) {
                Object[] objArr = this.content;
                pq.n.n(objArr, objArr, start, end, i16);
            }
            int i17 = this._size;
            int i18 = i17 - (end - start);
            pq.n.z(this.content, null, i18, i17);
            this._size = i18;
        }
    }

    public final void D(int capacity, Object[] oldContent) {
        int length = oldContent.length;
        this.content = pq.n.n(oldContent, new Object[Math.max(capacity, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean E(Collection<? extends E> elements) {
        int i15 = this._size;
        Object[] objArr = this.content;
        for (int i16 = i15 - 1; -1 < i16; i16--) {
            if (!elements.contains(objArr[i16])) {
                B(i16);
            }
        }
        return i15 != this._size;
    }

    public final E F(int index, E element) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        Object[] objArr = this.content;
        E e15 = (E) objArr[index];
        objArr[index] = element;
        return e15;
    }

    public final void m(int index, E element) {
        if (index < 0 || index > this._size) {
            G(index);
        }
        int i15 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i15) {
            D(i15, objArr);
        }
        Object[] objArr2 = this.content;
        int i16 = this._size;
        if (index != i16) {
            pq.n.n(objArr2, objArr2, index + 1, index, i16);
        }
        objArr2[index] = element;
        this._size++;
    }

    public final boolean n(E element) {
        int i15 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i15) {
            D(i15, objArr);
        }
        Object[] objArr2 = this.content;
        int i16 = this._size;
        objArr2[i16] = element;
        this._size = i16 + 1;
        return true;
    }

    public final boolean o(int index, Collection<? extends E> elements) {
        if (index < 0 || index > this._size) {
            G(index);
        }
        int i15 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            D(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (index != this._size) {
            pq.n.n(objArr2, objArr2, elements.size() + index, index, this._size);
        }
        for (Object obj : elements) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            objArr2[i15 + index] = obj;
            i15 = i16;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean p(Iterable<? extends E> elements) {
        int i15 = this._size;
        w(elements);
        return i15 != this._size;
    }

    public final boolean q(List<? extends E> elements) {
        int i15 = this._size;
        x(elements);
        return i15 != this._size;
    }

    public final boolean r(a1<E> elements) {
        int i15 = this._size;
        y(elements);
        return i15 != this._size;
    }

    public List<E> s() {
        return t();
    }

    public final List<E> t() {
        b<E> bVar = this.list;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.list = bVar2;
        return bVar2;
    }

    public final void u() {
        pq.n.z(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void v(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            z(it.next());
        }
    }

    public final void w(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            n(it.next());
        }
    }

    public final void x(List<? extends E> elements) {
        if (elements.isEmpty()) {
            return;
        }
        int i15 = this._size;
        int size = elements.size() + i15;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            D(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = elements.size();
        for (int i16 = 0; i16 < size2; i16++) {
            objArr2[i16 + i15] = elements.get(i16);
        }
        this._size += elements.size();
    }

    public final void y(a1<E> elements) {
        if (elements.g()) {
            return;
        }
        int i15 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i15) {
            D(i15, objArr);
        }
        pq.n.n(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean z(E element) {
        int iF = f(element);
        if (iF < 0) {
            return false;
        }
        B(iF);
        return true;
    }

    public q0(int i15) {
        super(i15, null);
    }

    public /* synthetic */ q0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 16 : i15);
    }
}
