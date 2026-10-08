package k;

import java.util.List;
import java.util.Objects;
import ju.p0;
import ju.w0;
import ju.z2;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 0*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001bBm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u00070\u0005\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lk/u;", "T", "", "", "capacity", "Lkotlin/Function1;", "", "Loq/i0;", "prune", "", "onUnprocessedElements", "Lkotlin/Function2;", "Ltq/e;", "process", "<init>", "(ILer/l;Ler/l;Ler/p;)V", "", "o", "(Ltq/e;)Ljava/lang/Object;", "", "cause", "n", "(Ljava/lang/Throwable;)V", "element", "", "p", "(Ljava/lang/Object;)Z", "a", "I", "getCapacity", "()I", "b", "Ler/l;", "c", "d", "Ler/p;", "Liu/a;", "e", "Liu/a;", "started", "Llu/g;", "f", "Llu/g;", "channel", "Lpq/m;", "g", "Lpq/m;", "queue", "h", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<List<T>, i0> prune;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.l<List<? extends T>, i0> onUnprocessedElements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.p<T, tq.e<? super i0>, Object> process;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iu.a started;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lu.g<T> channel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pq.m<T> queue;

    /* JADX INFO: renamed from: k.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk/u$a;", "", "<init>", "()V", "T", "Lk/u;", "Lju/p0;", "scope", "a", "(Lk/u;Lju/p0;)Lk/u;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: k.u$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C2550a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107093e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u<T> f107094f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2550a(u<T> uVar, tq.e<? super C2550a> eVar) {
                super(2, eVar);
                this.f107094f = uVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f107093e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    u<T> uVar = this.f107094f;
                    this.f107093e = 1;
                    if (uVar.o(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C2550a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2550a(this.f107094f, eVar);
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <T> u<T> a(u<T> uVar, p0 p0Var) {
            if (!((u) uVar).started.a(false, true)) {
                throw new IllegalStateException("PruningProcessingQueue cannot be re-started!");
            }
            if (ju.k.d(p0Var, null, null, new C2550a(uVar, null), 3, null).isCancelled()) {
                uVar.n(null);
            }
            return uVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f107095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f107096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f107097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ u<T> f107098h;

        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<T, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107099e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f107100f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u<T> f107101g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u<T> uVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f107101g = uVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f107099e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                ((u) this.f107101g).queue.add(this.f107100f);
                Object objK = ((u) this.f107101g).channel.k();
                while (lu.k.j(objK)) {
                    ((u) this.f107101g).queue.add(lu.k.g(objK));
                    objK = ((u) this.f107101g).channel.k();
                }
                k kVar = k.f107055a;
                u<T> uVar = this.f107101g;
                if (kVar.a()) {
                    Objects.toString(((u) uVar).queue);
                }
                ((u) this.f107101g).prune.b(((u) this.f107101g).queue);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(T t15, tq.e<? super i0> eVar) {
                return ((a) v(t15, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f107101g, eVar);
                aVar.f107100f = obj;
                return aVar;
            }
        }

        /* JADX INFO: renamed from: k.u$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loq/i0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 1, 0})
        static final class C2551b extends vq.k implements er.p<i0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107102e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ fr.p0<w0<i0>> f107103f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2551b(fr.p0<w0<i0>> p0Var, tq.e<? super C2551b> eVar) {
                super(2, eVar);
                this.f107103f = p0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f107102e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f107103f.f66410a = null;
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(i0 i0Var, tq.e<? super i0> eVar) {
                return ((C2551b) v(i0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2551b(this.f107103f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107104e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u<T> f107105f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ T f107106g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(u<T> uVar, T t15, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f107105f = uVar;
                this.f107106g = t15;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f107104e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    k kVar = k.f107055a;
                    T t15 = this.f107106g;
                    if (kVar.a()) {
                        Objects.toString(t15);
                    }
                    er.p pVar = ((u) this.f107105f).process;
                    T t16 = this.f107106g;
                    this.f107104e = 1;
                    if (pVar.B(t16, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((c) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new c(this.f107105f, this.f107106g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u<T> uVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f107098h = uVar;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0037 A[Catch: all -> 0x0018, CancellationException -> 0x00cb, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00cb, all -> 0x0018, blocks: (B:6:0x0014, B:15:0x0037, B:17:0x0058, B:18:0x0064), top: B:41:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0018, CancellationException -> 0x00cb, TryCatch #2 {CancellationException -> 0x00cb, all -> 0x0018, blocks: (B:6:0x0014, B:15:0x0037, B:17:0x0058, B:18:0x0064), top: B:41:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Type inference failed for: r5v3, types: [T, ju.d2, ju.w0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k.u.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f107098h, eVar);
            bVar.f107097g = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(int i15, er.l<? super List<T>, i0> lVar, er.l<? super List<? extends T>, i0> lVar2, er.p<? super T, ? super tq.e<? super i0>, ? extends Object> pVar) {
        this.capacity = i15;
        this.prune = lVar;
        this.onUnprocessedElements = lVar2;
        this.process = pVar;
        this.started = iu.b.a(false);
        this.channel = lu.j.b(i15, null, new er.l() { // from class: k.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.m(this.f107084a, obj);
            }
        }, 2, null);
        this.queue = new pq.m<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(u uVar, Object obj) {
        uVar.queue.add(obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Throwable cause) {
        if (this.channel.n(cause)) {
            Object objK = this.channel.k();
            while (lu.k.j(objK)) {
                this.queue.add((T) lu.k.g(objK));
                objK = this.channel.k();
            }
            if (this.queue.isEmpty()) {
                return;
            }
            this.onUnprocessedElements.b(pq.v.i1(this.queue));
            this.queue.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(tq.e eVar) {
        return z2.c(new b(this, null), eVar);
    }

    public final boolean p(T element) {
        return lu.k.j(this.channel.d(element));
    }

    public /* synthetic */ u(int i15, er.l lVar, er.l lVar2, er.p pVar, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? Integer.MAX_VALUE : i15, (i16 & 2) != 0 ? new er.l() { // from class: k.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.d((List) obj);
            }
        } : lVar, (i16 & 4) != 0 ? new er.l() { // from class: k.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.e((List) obj);
            }
        } : lVar2, pVar);
    }
}
