package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lr0/s0;", "E", "Lr0/e1;", "", "Lr0/r0;", "parent", "<init>", "(Lr0/r0;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Loq/i0;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "b", "Lr0/r0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class s0<E> extends e1<E> implements Set<E>, gr.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0<E> parent;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"r0/s0$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loq/i0;", "remove", "()V", "", "a", "I", "getCurrent", "()I", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int current = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<E> iterator;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s0<E> f169952c;

        /* JADX INFO: renamed from: r0.s0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Leu/j;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {1, 9, 0})
        static final class C4298a extends vq.i implements er.p<eu.j<? super E>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f169953c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f169954d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f169955e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f169956f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f169957g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ Object f169958h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ s0<E> f169959j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ a f169960k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4298a(s0<E> s0Var, a aVar, tq.e<? super C4298a> eVar) {
                super(2, eVar);
                this.f169959j = s0Var;
                this.f169960k = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                s0<E> s0Var;
                int i15;
                a aVar;
                long[] jArr;
                eu.j jVar;
                Object objE = uq.b.e();
                int i16 = this.f169957g;
                if (i16 == 0) {
                    oq.u.b(obj);
                    eu.j jVar2 = (eu.j) this.f169958h;
                    r0 r0Var = ((s0) this.f169959j).parent;
                    a aVar2 = this.f169960k;
                    s0Var = this.f169959j;
                    long[] jArr2 = r0Var.nodes;
                    i15 = r0Var.tail;
                    aVar = aVar2;
                    jArr = jArr2;
                    jVar = jVar2;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = this.f169956f;
                    jArr = (long[]) this.f169955e;
                    s0Var = (s0) this.f169954d;
                    aVar = (a) this.f169953c;
                    jVar = (eu.j) this.f169958h;
                    oq.u.b(obj);
                }
                while (i15 != Integer.MAX_VALUE) {
                    int i17 = (int) ((jArr[i15] >> 31) & 2147483647L);
                    aVar.a(i15);
                    Object obj2 = ((s0) s0Var).parent.elements[i15];
                    this.f169958h = jVar;
                    this.f169953c = aVar;
                    this.f169954d = s0Var;
                    this.f169955e = jArr;
                    this.f169956f = i17;
                    this.f169957g = 1;
                    if (jVar.a(obj2, this) == objE) {
                        return objE;
                    }
                    i15 = i17;
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(eu.j<? super E> jVar, tq.e<? super oq.i0> eVar) {
                return ((C4298a) v(jVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C4298a c4298a = new C4298a(this.f169959j, this.f169960k, eVar);
                c4298a.f169958h = obj;
                return c4298a;
            }
        }

        a(s0<E> s0Var) {
            this.f169952c = s0Var;
            this.iterator = eu.k.a(new C4298a(s0Var, this, null));
        }

        public final void a(int i15) {
            this.current = i15;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                ((s0) this.f169952c).parent.z(this.current);
                this.current = -1;
            }
        }
    }

    public s0(r0<E> r0Var) {
        super(r0Var);
        this.parent = r0Var;
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public boolean add(E element) {
        return this.parent.g(element);
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        return this.parent.h(elements);
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.k();
    }

    @Override // r0.e1, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.parent.x(element);
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        return this.parent.y(elements);
    }

    @Override // r0.e1, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return this.parent.B(elements);
    }
}
