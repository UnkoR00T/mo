package g4;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002=AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010,J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00105J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\u0004R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lg4/t;", "", "Lf3/m$c;", "<init>", "()V", "Lg4/o;", "n", "()J", "", "depth", "Loq/i0;", "x", "(I)V", "startDepth", "endDepth", "z", "(II)V", "", "s", "()Z", "e", "", "distanceFromEdge", "isInLayer", "v", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "t", "(Lf3/m$c;ZLer/a;)V", "A", "(Lf3/m$c;FZLer/a;)V", "element", "l", "(Lf3/m$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "o", "(I)Lf3/m$c;", "u", "(Lf3/m$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "w", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "Lr0/q0;", "", "a", "Lr0/q0;", "values", "Lr0/l0;", "b", "Lr0/l0;", "distanceFromEdgeAndFlags", "c", "I", "hitDepth", "q", "()I", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements List<f3.m.c>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private r0.q0<Object> values = new r0.q0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r0.l0 distanceFromEdgeAndFlags = new r0.l0(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006+"}, d2 = {"Lg4/t$b;", "", "Lf3/m$c;", "", "minIndex", "maxIndex", "<init>", "(Lg4/t;II)V", "element", "", "e", "(Lf3/m$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "f", "(I)Lf3/m$c;", "h", "(Lf3/m$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "i", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "I", "getMinIndex", "()I", "b", "getMaxIndex", "g", "size", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b implements List<f3.m.c>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public b(int i15, int i16) {
            this.minIndex = i15;
            this.maxIndex = i16;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i15, f3.m.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i15, Collection<? extends f3.m.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof f3.m.c) {
                return e((f3.m.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<?> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((f3.m.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean e(f3.m.c element) {
            return indexOf(element) != -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public f3.m.c get(int index) {
            return (f3.m.c) t.this.values.d(index + this.minIndex);
        }

        public int g() {
            return this.maxIndex - this.minIndex;
        }

        public int h(f3.m.c element) {
            int i15 = this.minIndex;
            int i16 = this.maxIndex;
            if (i15 > i16) {
                return -1;
            }
            while (!fr.t.c(t.this.values.d(i15), element)) {
                if (i15 == i16) {
                    return -1;
                }
                i15++;
            }
            return i15 - this.minIndex;
        }

        public int i(f3.m.c element) {
            int i15 = this.maxIndex;
            int i16 = this.minIndex;
            if (i16 > i15) {
                return -1;
            }
            while (!fr.t.c(t.this.values.d(i15), element)) {
                if (i15 == i16) {
                    return -1;
                }
                i15--;
            }
            return i15 - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof f3.m.c) {
                return h((f3.m.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<f3.m.c> iterator() {
            t tVar = t.this;
            int i15 = this.minIndex;
            return tVar.new a(i15, i15, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof f3.m.c) {
                return i((f3.m.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<f3.m.c> listIterator() {
            t tVar = t.this;
            int i15 = this.minIndex;
            return tVar.new a(i15, i15, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ f3.m.c remove(int i15) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<f3.m.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ f3.m.c set(int i15, f3.m.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return g();
        }

        @Override // java.util.List
        public void sort(Comparator<? super f3.m.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<f3.m.c> subList(int fromIndex, int toIndex) {
            t tVar = t.this;
            int i15 = this.minIndex;
            return tVar.new b(fromIndex + i15, i15 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return fr.j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends f3.m.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<f3.m.c> listIterator(int index) {
            t tVar = t.this;
            int i15 = this.minIndex;
            return tVar.new a(index + i15, i15, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) fr.j.b(this, tArr);
        }
    }

    private final long n() {
        long jB = u.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i15 = this.hitDepth + 1;
        int iP = pq.v.p(this);
        if (i15 <= iP) {
            while (true) {
                long jB2 = o.b(this.distanceFromEdgeAndFlags.a(i15));
                if (o.a(jB2, jB) < 0) {
                    jB = jB2;
                }
                if ((o.c(jB) < 0.0f && o.e(jB)) || i15 == iP) {
                    break;
                }
                i15++;
            }
        }
        return jB;
    }

    private final void x(int depth) {
        this.values.B(depth);
        this.distanceFromEdgeAndFlags.h(depth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.C(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.i(startDepth, endDepth);
    }

    public final void A(f3.m.c node, float distanceFromEdge, boolean isInLayer, er.a<oq.i0> childHitTest) {
        if (this.hitDepth == pq.v.p(this)) {
            int i15 = this.hitDepth;
            z(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(u.a(distanceFromEdge, isInLayer, false));
            childHitTest.a();
            this.hitDepth = i15;
            if (this.hitDepth + 1 == pq.v.p(this) || o.d(n())) {
                x(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jN = n();
        int i16 = this.hitDepth;
        this.hitDepth = pq.v.p(this);
        int i17 = this.hitDepth;
        z(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(u.a(distanceFromEdge, isInLayer, false));
        childHitTest.a();
        this.hitDepth = i17;
        long jN2 = n();
        if (this.hitDepth + 1 >= pq.v.p(this) || o.a(jN, jN2) <= 0) {
            z(this.hitDepth + 1, size());
        } else {
            z(i16 + 1, o.d(jN2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i16;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i15, f3.m.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i15, Collection<? extends f3.m.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.u();
        this.distanceFromEdgeAndFlags.f();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f3.m.c) {
            return l((f3.m.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((f3.m.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof f3.m.c) {
            return u((f3.m.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<f3.m.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean l(f3.m.c element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof f3.m.c) {
            return w((f3.m.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<f3.m.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f3.m.c get(int index) {
        return (f3.m.c) this.values.d(index);
    }

    public int q() {
        return this.values.get_size();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ f3.m.c remove(int i15) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<f3.m.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s() {
        long jN = n();
        return o.c(jN) < 0.0f && o.e(jN) && !o.d(jN);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ f3.m.c set(int i15, f3.m.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return q();
    }

    @Override // java.util.List
    public void sort(Comparator<? super f3.m.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<f3.m.c> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    public final void t(f3.m.c node, boolean isInLayer, er.a<oq.i0> childHitTest) {
        if (this.hitDepth == pq.v.p(this)) {
            int i15 = this.hitDepth;
            z(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(u.a(0.0f, isInLayer, true));
            childHitTest.a();
            this.hitDepth = i15;
            return;
        }
        long jN = n();
        int i16 = this.hitDepth;
        if (!o.d(jN)) {
            if (o.c(jN) > 0.0f) {
                int i17 = this.hitDepth;
                z(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.n(node);
                this.distanceFromEdgeAndFlags.d(u.a(0.0f, isInLayer, true));
                childHitTest.a();
                this.hitDepth = i17;
                return;
            }
            return;
        }
        this.hitDepth = pq.v.p(this);
        int i18 = this.hitDepth;
        z(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(u.a(0.0f, isInLayer, true));
        childHitTest.a();
        this.hitDepth = i18;
        if (o.c(n()) < 0.0f) {
            z(i16 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i16;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return fr.j.a(this);
    }

    public int u(f3.m.c element) {
        int iP = pq.v.p(this);
        if (iP < 0) {
            return -1;
        }
        int i15 = 0;
        while (!fr.t.c(this.values.d(i15), element)) {
            if (i15 == iP) {
                return -1;
            }
            i15++;
        }
        return i15;
    }

    public final boolean v(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == pq.v.p(this)) {
            return true;
        }
        return o.a(n(), u.b(distanceFromEdge, isInLayer, false, 4, null)) > 0;
    }

    public int w(f3.m.c element) {
        for (int iP = pq.v.p(this); -1 < iP; iP--) {
            if (fr.t.c(this.values.d(iP), element)) {
                return iP;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends f3.m.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<f3.m.c> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) fr.j.b(this, tArr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lg4/t$a;", "", "Lf3/m$c;", "", "index", "minIndex", "maxIndex", "<init>", "(Lg4/t;III)V", "", "hasNext", "()Z", "hasPrevious", "a", "()Lf3/m$c;", "nextIndex", "()I", "c", "previousIndex", "I", "getIndex", "setIndex", "(I)V", "b", "getMinIndex", "getMaxIndex", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements ListIterator<f3.m.c>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i15, int i16, int i17) {
            this.index = i15;
            this.minIndex = i16;
            this.maxIndex = i17;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f3.m.c next() {
            r0.q0 q0Var = t.this.values;
            int i15 = this.index;
            this.index = i15 + 1;
            return (f3.m.c) q0Var.d(i15);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(f3.m.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f3.m.c previous() {
            r0.q0 q0Var = t.this.values;
            int i15 = this.index - 1;
            this.index = i15;
            return (f3.m.c) q0Var.d(i15);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(f3.m.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(t tVar, int i15, int i16, int i17, int i18, fr.k kVar) {
            this((i18 & 1) != 0 ? 0 : i15, (i18 & 2) != 0 ? 0 : i16, (i18 & 4) != 0 ? tVar.size() : i17);
        }
    }
}
