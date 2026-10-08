package cu;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class j<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f37885b;

    private static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f37886a = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f37886a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    private class c extends d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f37887b;

        public c() {
            super();
            this.f37887b = ((AbstractList) j.this).modCount;
        }

        @Override // cu.j.d
        protected void a() {
            if (((AbstractList) j.this).modCount == this.f37887b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) j.this).modCount + "; expected: " + this.f37887b);
        }

        @Override // cu.j.d
        protected E c() {
            return (E) j.this.f37885b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.this.clear();
        }
    }

    private static abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f37889a;

        private d() {
        }

        protected abstract void a();

        protected abstract T c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f37889a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f37889a) {
                throw new NoSuchElementException();
            }
            this.f37889a = true;
            a();
            return c();
        }
    }

    private static /* synthetic */ void e(int i15) {
        String str = (i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6 || i15 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6 || i15 == 7) ? 2 : 3];
        switch (i15) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i15 == 2 || i15 == 3) {
            objArr[1] = "iterator";
        } else if (i15 == 5 || i15 == 6 || i15 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i15) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 2 && i15 != 3 && i15 != 5 && i15 != 6 && i15 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e15) {
        int i15 = this.f37884a;
        if (i15 == 0) {
            this.f37885b = e15;
        } else if (i15 == 1) {
            this.f37885b = new Object[]{this.f37885b, e15};
        } else {
            Object[] objArr = (Object[]) this.f37885b;
            int length = objArr.length;
            if (i15 >= length) {
                int i16 = ((length * 3) / 2) + 1;
                int i17 = i15 + 1;
                if (i16 < i17) {
                    i16 = i17;
                }
                Object[] objArr2 = new Object[i16];
                this.f37885b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f37884a] = e15;
        }
        this.f37884a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f37885b = null;
        this.f37884a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i15) {
        int i16;
        if (i15 >= 0 && i15 < (i16 = this.f37884a)) {
            return i16 == 1 ? (E) this.f37885b : (E) ((Object[]) this.f37885b)[i15];
        }
        throw new IndexOutOfBoundsException("Index: " + i15 + ", Size: " + this.f37884a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i15 = this.f37884a;
        if (i15 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                e(2);
            }
            return bVarA;
        }
        if (i15 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            e(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i15) {
        int i16;
        E e15;
        if (i15 < 0 || i15 >= (i16 = this.f37884a)) {
            throw new IndexOutOfBoundsException("Index: " + i15 + ", Size: " + this.f37884a);
        }
        if (i16 == 1) {
            e15 = (E) this.f37885b;
            this.f37885b = null;
        } else {
            Object[] objArr = (Object[]) this.f37885b;
            Object obj = objArr[i15];
            if (i16 == 2) {
                this.f37885b = objArr[1 - i15];
            } else {
                int i17 = (i16 - i15) - 1;
                if (i17 > 0) {
                    System.arraycopy(objArr, i15 + 1, objArr, i15, i17);
                }
                objArr[this.f37884a - 1] = null;
            }
            e15 = (E) obj;
        }
        this.f37884a--;
        ((AbstractList) this).modCount++;
        return e15;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i15, E e15) {
        int i16;
        if (i15 < 0 || i15 >= (i16 = this.f37884a)) {
            throw new IndexOutOfBoundsException("Index: " + i15 + ", Size: " + this.f37884a);
        }
        if (i16 == 1) {
            E e16 = (E) this.f37885b;
            this.f37885b = e15;
            return e16;
        }
        Object[] objArr = (Object[]) this.f37885b;
        E e17 = (E) objArr[i15];
        objArr[i15] = e15;
        return e17;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37884a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i15 = this.f37884a;
        if (i15 >= 2) {
            Arrays.sort((Object[]) this.f37885b, 0, i15, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            e(4);
        }
        int length = tArr.length;
        int i15 = this.f37884a;
        if (i15 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f37885b;
                return tArr2;
            }
            tArr[0] = this.f37885b;
        } else {
            if (length < i15) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f37885b, i15, tArr.getClass());
                if (tArr3 == null) {
                    e(6);
                }
                return tArr3;
            }
            if (i15 != 0) {
                System.arraycopy(this.f37885b, 0, tArr, 0, i15);
            }
        }
        int i16 = this.f37884a;
        if (length > i16) {
            tArr[i16] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i15, E e15) {
        int i16;
        if (i15 >= 0 && i15 <= (i16 = this.f37884a)) {
            if (i16 == 0) {
                this.f37885b = e15;
            } else if (i16 == 1 && i15 == 0) {
                this.f37885b = new Object[]{e15, this.f37885b};
            } else {
                Object[] objArr = new Object[i16 + 1];
                if (i16 == 1) {
                    objArr[0] = this.f37885b;
                } else {
                    Object[] objArr2 = (Object[]) this.f37885b;
                    System.arraycopy(objArr2, 0, objArr, 0, i15);
                    System.arraycopy(objArr2, i15, objArr, i15 + 1, this.f37884a - i15);
                }
                objArr[i15] = e15;
                this.f37885b = objArr;
            }
            this.f37884a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i15 + ", Size: " + this.f37884a);
    }
}
