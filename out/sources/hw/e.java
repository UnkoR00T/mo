package hw;

import fr.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\fJ&\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0013\u0010\bJ\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b \u0010\"J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b#\u0010\bJ\u001e\u0010$\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0001¢\u0006\u0004\b$\u0010\u0011J\u0018\u0010%\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b%\u0010\u0016J\u001e\u0010&\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0001¢\u0006\u0004\b&\u0010\u0011J \u0010'\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b'\u0010(J&\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u00101R\u0014\u00104\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u00103¨\u00065"}, d2 = {"Lhw/e;", "E", "", "<init>", "()V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "index", "Loq/i0;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "e", "push", "(Ljava/lang/Object;)V", "pop", "()Ljava/lang/Object;", "peek", "()I", "size", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class e<E> implements List<E>, gr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ArrayList<E> f86730a = new ArrayList<>();

    @Override // java.util.List
    public void add(int index, E element) {
        this.f86730a.add(index, element);
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        return this.f86730a.addAll(index, elements);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f86730a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return this.f86730a.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.f86730a.containsAll(elements);
    }

    public int e() {
        return this.f86730a.size();
    }

    public E f(int index) {
        return this.f86730a.remove(index);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.f86730a.get(index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return this.f86730a.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f86730a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f86730a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return this.f86730a.lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f86730a.listIterator();
    }

    public final E peek() {
        return (E) v.x0(this);
    }

    public final E pop() {
        E e15 = (E) v.x0(this);
        remove(size() - 1);
        return e15;
    }

    public final void push(E e15) {
        add(e15);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        return this.f86730a.remove(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        return this.f86730a.removeAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return this.f86730a.retainAll(elements);
    }

    @Override // java.util.List
    public E set(int index, E element) {
        return this.f86730a.set(index, element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        return this.f86730a.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E element) {
        return this.f86730a.add(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        return this.f86730a.addAll(elements);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return this.f86730a.listIterator(index);
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i15) {
        return f(i15);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) j.b(this, tArr);
    }
}
