package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001d\u0010\u0018\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lr0/v0;", "E", "Lr0/j1;", "", "Lr0/u0;", "parent", "<init>", "(Lr0/u0;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Loq/i0;", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "b", "Lr0/u0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class v0<E> extends j1<E> implements Set<E>, gr.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u0<E> parent;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"r0/v0$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loq/i0;", "remove", "()V", "", "a", "I", "getCurrent", "()I", "(I)V", "current", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int current = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<E> iterator;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0<E> f169981c;

        /* JADX INFO: renamed from: r0.v0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Leu/j;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {1, 9, 0})
        static final class C4299a extends vq.i implements er.p<eu.j<? super E>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f169982c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f169983d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f169984e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f169985f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f169986g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f169987h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f169988j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            long f169989k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f169990l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private /* synthetic */ Object f169991m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ v0<E> f169992n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ a f169993p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4299a(v0<E> v0Var, a aVar, tq.e<? super C4299a> eVar) {
                super(2, eVar);
                this.f169992n = v0Var;
                this.f169993p = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x005f  */
            /* JADX WARN: Code duplicated, block: B:21:0x00aa A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005d -> B:23:0x00b3). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00a7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a4 -> B:20:0x00a7). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f169990l
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L36
                    if (r2 != r5) goto L2e
                    int r2 = r0.f169988j
                    int r6 = r0.f169987h
                    long r7 = r0.f169989k
                    int r9 = r0.f169986g
                    int r10 = r0.f169985f
                    java.lang.Object r11 = r0.f169984e
                    long[] r11 = (long[]) r11
                    java.lang.Object r12 = r0.f169983d
                    r0.v0 r12 = (r0.v0) r12
                    java.lang.Object r13 = r0.f169982c
                    r0.v0$a r13 = (r0.v0.a) r13
                    java.lang.Object r14 = r0.f169991m
                    eu.j r14 = (eu.j) r14
                    oq.u.b(r22)
                    goto La7
                L2e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L36:
                    oq.u.b(r22)
                    java.lang.Object r2 = r0.f169991m
                    eu.j r2 = (eu.j) r2
                    r0.v0<E> r6 = r0.f169992n
                    r0.u0 r6 = r0.v0.g(r6)
                    r0.v0$a r7 = r0.f169993p
                    r0.v0<E> r8 = r0.f169992n
                    long[] r6 = r6.metadata
                    int r9 = r6.length
                    int r9 = r9 + (-2)
                    if (r9 < 0) goto Lb8
                    r10 = 0
                L4f:
                    r11 = r6[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto Lb3
                    int r13 = r10 - r9
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r10
                    r10 = r9
                    r9 = r14
                    r14 = r2
                    r2 = 0
                    r19 = r11
                    r11 = r6
                    r12 = r8
                    r6 = r13
                    r13 = r7
                    r7 = r19
                L73:
                    if (r2 >= r6) goto Laa
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto La7
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r13.a(r15)
                    r0.u0 r3 = r0.v0.g(r12)
                    java.lang.Object[] r3 = r3.elements
                    r3 = r3[r15]
                    r0.f169991m = r14
                    r0.f169982c = r13
                    r0.f169983d = r12
                    r0.f169984e = r11
                    r0.f169985f = r10
                    r0.f169986g = r9
                    r0.f169989k = r7
                    r0.f169987h = r6
                    r0.f169988j = r2
                    r0.f169990l = r5
                    java.lang.Object r3 = r14.a(r3, r0)
                    if (r3 != r1) goto La7
                    return r1
                La7:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L73
                Laa:
                    if (r6 != r4) goto Lb8
                    r2 = r10
                    r10 = r9
                    r9 = r2
                    r6 = r11
                    r8 = r12
                    r7 = r13
                    r2 = r14
                Lb3:
                    if (r10 == r9) goto Lb8
                    int r10 = r10 + 1
                    goto L4f
                Lb8:
                    oq.i0 r1 = oq.i0.f148189a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: r0.v0.a.C4299a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public final Object B(eu.j<? super E> jVar, tq.e<? super oq.i0> eVar) {
                return ((C4299a) v(jVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C4299a c4299a = new C4299a(this.f169992n, this.f169993p, eVar);
                c4299a.f169991m = obj;
                return c4299a;
            }
        }

        a(v0<E> v0Var) {
            this.f169981c = v0Var;
            this.iterator = eu.k.a(new C4299a(v0Var, this, null));
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
                ((v0) this.f169981c).parent.B(this.current);
                this.current = -1;
            }
        }
    }

    public v0(u0<E> u0Var) {
        super(u0Var);
        this.parent = u0Var;
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public boolean add(E element) {
        return this.parent.i(element);
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        return this.parent.j(elements);
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.n();
    }

    @Override // r0.j1, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a(this);
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.parent.z(element);
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        return this.parent.A(elements);
    }

    @Override // r0.j1, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return this.parent.D(elements);
    }
}
