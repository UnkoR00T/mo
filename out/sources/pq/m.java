package pq;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001KB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010%J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00028\u0000H\u0007¢\u0006\u0004\b-\u0010%J\u0011\u0010.\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b.\u0010%J\u000f\u0010/\u001a\u00028\u0000H\u0007¢\u0006\u0004\b/\u0010%J\u0017\u00100\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0017¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00102J\u001d\u00103\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0017¢\u0006\u0004\b3\u00104J%\u00103\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0017¢\u0006\u0004\b3\u00105J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b6\u00107J \u00108\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0097\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b:\u00101J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0017¢\u0006\u0004\b>\u00101J\u0017\u0010?\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0017¢\u0006\u0004\b?\u00107J\u001d\u0010@\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0017¢\u0006\u0004\b@\u00104J\u001d\u0010A\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0017¢\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u0007J)\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010D\"\u0004\b\u0001\u0010C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0DH\u0016¢\u0006\u0004\bF\u0010IJ\u001f\u0010J\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\bJ\u0010\u001bR\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010U\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lpq/m;", "E", "Lpq/h;", "", "initialCapacity", "<init>", "(I)V", "()V", "minCapacity", "Loq/i0;", "k", "newCapacity", "h", "index", "v", "(I)I", "t", "o", "i", "internalIndex", "", "elements", "g", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "B", "(II)V", "C", "internalFromIndex", "internalToIndex", "u", "w", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "n", "last", "s", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "A", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "f", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "a", "I", "head", "b", "[Ljava/lang/Object;", "elementData", "value", "c", "e", "()I", "size", "d", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m<E> extends h<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f161724e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] elementData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public m(int i15) {
        Object[] objArr;
        if (i15 == 0) {
            objArr = f161724e;
        } else {
            if (i15 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i15);
            }
            objArr = new Object[i15];
        }
        this.elementData = objArr;
    }

    private final void B(int fromIndex, int toIndex) {
        int iV = v(this.head + (fromIndex - 1));
        int iV2 = v(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i15 = iV + 1;
            int iMin = Math.min(fromIndex, Math.min(i15, iV2 + 1));
            Object[] objArr = this.elementData;
            int i16 = iV2 - iMin;
            int i17 = iV - iMin;
            q.n(objArr, objArr, i16 + 1, i17 + 1, i15);
            iV = t(i17);
            iV2 = t(i16);
            fromIndex -= iMin;
        }
    }

    private final void C(int fromIndex, int toIndex) {
        int iV = v(this.head + toIndex);
        int iV2 = v(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iV, objArr.length - iV2));
            Object[] objArr2 = this.elementData;
            int i15 = iV + toIndex;
            q.n(objArr2, objArr2, iV2, iV, i15);
            iV = v(i15);
            iV2 = v(iV2 + toIndex);
        }
    }

    private final void g(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i15 = this.head;
        for (int i16 = 0; i16 < i15 && it.hasNext(); i16++) {
            this.elementData[i16] = it.next();
        }
        this.size = size() + elements.size();
    }

    private final void h(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        q.n(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i15 = this.head;
        q.n(objArr3, objArr, length - i15, 0, i15);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int i(int index) {
        return index == 0 ? s.v0(this.elementData) : index - 1;
    }

    private final void k(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f161724e) {
            this.elementData = new Object[lr.m.e(minCapacity, 10)];
        } else {
            h(d.INSTANCE.e(objArr.length, minCapacity));
        }
    }

    private final int o(int index) {
        if (index == s.v0(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int t(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final void u(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            q.z(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        q.z(objArr, null, internalFromIndex, objArr.length);
        q.z(this.elementData, null, 0, internalToIndex);
    }

    private final int v(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void w() {
        ((AbstractList) this).modCount++;
    }

    public final E A() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        w();
        k(size() + elements.size());
        g(v(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        w();
        k(size() + 1);
        int i15 = i(this.head);
        this.head = i15;
        this.elementData[i15] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        w();
        k(size() + 1);
        this.elementData[v(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            w();
            u(this.head, v(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // pq.h
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // pq.h
    public E f(int index) {
        d.INSTANCE.b(index, size());
        if (index == x.p(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        w();
        int iV = v(this.head + index);
        E e15 = (E) this.elementData[iV];
        if (index < (size() >> 1)) {
            int i15 = this.head;
            if (iV >= i15) {
                Object[] objArr = this.elementData;
                q.n(objArr, objArr, i15 + 1, i15, iV);
            } else {
                Object[] objArr2 = this.elementData;
                q.n(objArr2, objArr2, 1, 0, iV);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i16 = this.head;
                q.n(objArr3, objArr3, i16 + 1, i16, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i17 = this.head;
            objArr4[i17] = null;
            this.head = o(i17);
        } else {
            int iV2 = v(this.head + x.p(this));
            if (iV <= iV2) {
                Object[] objArr5 = this.elementData;
                q.n(objArr5, objArr5, iV, iV + 1, iV2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                q.n(objArr6, objArr6, iV, iV + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                q.n(objArr7, objArr7, 0, 1, iV2 + 1);
            }
            this.elementData[iV2] = null;
        }
        this.size = size() - 1;
        return e15;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        d.INSTANCE.b(index, size());
        return (E) this.elementData[v(this.head + index)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i15;
        int iV = v(this.head + size());
        int length = this.head;
        if (length < iV) {
            while (length < iV) {
                if (fr.t.c(element, this.elementData[length])) {
                    i15 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.head) < iV) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (fr.t.c(element, this.elementData[length])) {
                i15 = this.head;
            } else {
                length++;
            }
        }
        for (int i16 = 0; i16 < iV; i16++) {
            if (fr.t.c(element, this.elementData[i16])) {
                length = i16 + this.elementData.length;
                i15 = this.head;
            }
        }
        return -1;
        return length - i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[v(this.head + x.p(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iV0;
        int i15;
        int iV = v(this.head + size());
        int i16 = this.head;
        if (i16 < iV) {
            iV0 = iV - 1;
            if (i16 <= iV0) {
                while (!fr.t.c(element, this.elementData[iV0])) {
                    if (iV0 != i16) {
                        iV0--;
                    }
                }
                i15 = this.head;
                return iV0 - i15;
            }
            return -1;
        }
        if (!isEmpty() && this.head >= iV) {
            for (int i17 = iV - 1; -1 < i17; i17--) {
                if (fr.t.c(element, this.elementData[i17])) {
                    iV0 = i17 + this.elementData.length;
                    i15 = this.head;
                    return iV0 - i15;
                }
            }
            iV0 = s.v0(this.elementData);
            int i18 = this.head;
            if (i18 <= iV0) {
                while (!fr.t.c(element, this.elementData[iV0])) {
                    if (iV0 != i18) {
                        iV0--;
                    }
                }
                i15 = this.head;
                return iV0 - i15;
            }
        }
        return -1;
    }

    public final E n() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        f(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iV;
        boolean z15 = false;
        z15 = false;
        z15 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iV2 = v(this.head + size());
            int i15 = this.head;
            if (i15 < iV2) {
                iV = i15;
                while (i15 < iV2) {
                    Object obj = this.elementData[i15];
                    if (elements.contains(obj)) {
                        z15 = true;
                    } else {
                        this.elementData[iV] = obj;
                        iV++;
                    }
                    i15++;
                }
                q.z(this.elementData, null, iV, iV2);
            } else {
                int length = this.elementData.length;
                boolean z16 = false;
                int i16 = i15;
                while (i15 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i15];
                    objArr[i15] = null;
                    if (elements.contains(obj2)) {
                        z16 = true;
                    } else {
                        this.elementData[i16] = obj2;
                        i16++;
                    }
                    i15++;
                }
                iV = v(i16);
                for (int i17 = 0; i17 < iV2; i17++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i17];
                    objArr2[i17] = null;
                    if (elements.contains(obj3)) {
                        z16 = true;
                    } else {
                        this.elementData[iV] = obj3;
                        iV = o(iV);
                    }
                }
                z15 = z16;
            }
            if (z15) {
                w();
                this.size = t(iV - this.head);
            }
        }
        return z15;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        Object[] objArr = this.elementData;
        int i15 = this.head;
        E e15 = (E) objArr[i15];
        objArr[i15] = null;
        this.head = o(i15);
        this.size = size() - 1;
        return e15;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        int iV = v(this.head + x.p(this));
        Object[] objArr = this.elementData;
        E e15 = (E) objArr[iV];
        objArr[iV] = null;
        this.size = size() - 1;
        return e15;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        d.INSTANCE.d(fromIndex, toIndex, size());
        int i15 = toIndex - fromIndex;
        if (i15 == 0) {
            return;
        }
        if (i15 == size()) {
            clear();
            return;
        }
        if (i15 == 1) {
            f(fromIndex);
            return;
        }
        w();
        if (fromIndex < size() - toIndex) {
            B(fromIndex, toIndex);
            int iV = v(this.head + i15);
            u(this.head, iV);
            this.head = iV;
        } else {
            C(fromIndex, toIndex);
            int iV2 = v(this.head + size());
            u(t(iV2 - i15), iV2);
        }
        this.size = size() - i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iV;
        boolean z15 = false;
        z15 = false;
        z15 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iV2 = v(this.head + size());
            int i15 = this.head;
            if (i15 < iV2) {
                iV = i15;
                while (i15 < iV2) {
                    Object obj = this.elementData[i15];
                    if (elements.contains(obj)) {
                        this.elementData[iV] = obj;
                        iV++;
                    } else {
                        z15 = true;
                    }
                    i15++;
                }
                q.z(this.elementData, null, iV, iV2);
            } else {
                int length = this.elementData.length;
                boolean z16 = false;
                int i16 = i15;
                while (i15 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i15];
                    objArr[i15] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i16] = obj2;
                        i16++;
                    } else {
                        z16 = true;
                    }
                    i15++;
                }
                iV = v(i16);
                for (int i17 = 0; i17 < iV2; i17++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i17];
                    objArr2[i17] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iV] = obj3;
                        iV = o(iV);
                    } else {
                        z16 = true;
                    }
                }
                z15 = z16;
            }
            if (z15) {
                w();
                this.size = t(iV - this.head);
            }
        }
        return z15;
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[v(this.head + x.p(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        d.INSTANCE.b(index, size());
        int iV = v(this.head + index);
        Object[] objArr = this.elementData;
        E e15 = (E) objArr[iV];
        objArr[iV] = element;
        return e15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        if (array.length < size()) {
            array = (T[]) o.a(array, size());
        }
        T[] tArr = array;
        int iV = v(this.head + size());
        int i15 = this.head;
        if (i15 < iV) {
            q.s(this.elementData, tArr, 0, i15, iV, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            q.n(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            q.n(objArr2, tArr, objArr2.length - this.head, 0, iV);
        }
        return (T[]) w.f(size(), tArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        d.INSTANCE.c(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        w();
        k(size() + 1);
        int iV = v(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int i15 = i(iV);
            int i16 = i(this.head);
            int i17 = this.head;
            if (i15 >= i17) {
                Object[] objArr = this.elementData;
                objArr[i16] = objArr[i17];
                q.n(objArr, objArr, i17, i17 + 1, i15 + 1);
            } else {
                Object[] objArr2 = this.elementData;
                q.n(objArr2, objArr2, i17 - 1, i17, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                q.n(objArr3, objArr3, 0, 1, i15 + 1);
            }
            this.elementData[i15] = element;
            this.head = i16;
        } else {
            int iV2 = v(this.head + size());
            if (iV < iV2) {
                Object[] objArr4 = this.elementData;
                q.n(objArr4, objArr4, iV + 1, iV, iV2);
            } else {
                Object[] objArr5 = this.elementData;
                q.n(objArr5, objArr5, 1, 0, iV2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                q.n(objArr6, objArr6, iV + 1, iV, objArr6.length - 1);
            }
            this.elementData[iV] = element;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        d.INSTANCE.c(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        w();
        k(size() + elements.size());
        int iV = v(this.head + size());
        int iV2 = v(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i15 = this.head;
            int length = i15 - size;
            if (iV2 < i15) {
                Object[] objArr = this.elementData;
                q.n(objArr, objArr, length, i15, objArr.length);
                if (size >= iV2) {
                    Object[] objArr2 = this.elementData;
                    q.n(objArr2, objArr2, objArr2.length - size, 0, iV2);
                } else {
                    Object[] objArr3 = this.elementData;
                    q.n(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    q.n(objArr4, objArr4, 0, size, iV2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                q.n(objArr5, objArr5, length, i15, iV2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i16 = iV2 - i15;
                int length2 = objArr6.length - length;
                if (length2 >= i16) {
                    q.n(objArr6, objArr6, length, i15, iV2);
                } else {
                    q.n(objArr6, objArr6, length, i15, i15 + length2);
                    Object[] objArr7 = this.elementData;
                    q.n(objArr7, objArr7, 0, this.head + length2, iV2);
                }
            }
            this.head = length;
            g(t(iV2 - size), elements);
        } else {
            int i17 = iV2 + size;
            if (iV2 < iV) {
                int i18 = size + iV;
                Object[] objArr8 = this.elementData;
                if (i18 <= objArr8.length) {
                    q.n(objArr8, objArr8, i17, iV2, iV);
                } else if (i17 >= objArr8.length) {
                    q.n(objArr8, objArr8, i17 - objArr8.length, iV2, iV);
                } else {
                    int length3 = iV - (i18 - objArr8.length);
                    q.n(objArr8, objArr8, 0, length3, iV);
                    Object[] objArr9 = this.elementData;
                    q.n(objArr9, objArr9, i17, iV2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                q.n(objArr10, objArr10, size, 0, iV);
                Object[] objArr11 = this.elementData;
                if (i17 >= objArr11.length) {
                    q.n(objArr11, objArr11, i17 - objArr11.length, iV2, objArr11.length);
                } else {
                    q.n(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    q.n(objArr12, objArr12, i17, iV2, objArr12.length - size);
                }
            }
            g(iV2, elements);
        }
        return true;
    }

    public m() {
        this.elementData = f161724e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
