package k;

import java.util.List;
import ju.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0019BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR6\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lk/q;", "T", "", "", "capacity", "Lkotlin/Function1;", "", "Loq/i0;", "onUnprocessedElements", "Lkotlin/Function2;", "", "Ltq/e;", "process", "<init>", "(ILer/l;Ler/p;)V", "h", "(Ltq/e;)Ljava/lang/Object;", "", "cause", "i", "(Ljava/lang/Throwable;)V", "element", "", "j", "(Ljava/lang/Object;)Z", "a", "I", "getCapacity", "()I", "b", "Ler/l;", "c", "Ler/p;", "Liu/a;", "d", "Liu/a;", "started", "Llu/g;", "e", "Llu/g;", "channel", "Lpq/m;", "f", "Lpq/m;", "queue", "g", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<List<? extends T>, i0> onUnprocessedElements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.p<List<T>, tq.e<? super i0>, Object> process;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iu.a started;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lu.g<T> channel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pq.m<T> queue;

    /* JADX INFO: renamed from: k.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk/q$a;", "", "<init>", "()V", "T", "Lk/q;", "Lju/p0;", "scope", "a", "(Lk/q;Lju/p0;)Lk/q;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: k.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C2549a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f107078e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q<T> f107079f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2549a(q<T> qVar, tq.e<? super C2549a> eVar) {
                super(2, eVar);
                this.f107079f = qVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f107078e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    q<T> qVar = this.f107079f;
                    this.f107078e = 1;
                    if (qVar.h(this) == objE) {
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
                return ((C2549a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2549a(this.f107079f, eVar);
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <T> q<T> a(q<T> qVar, p0 p0Var) {
            if (!((q) qVar).started.a(false, true)) {
                throw new IllegalStateException("ProcessingQueue cannot be re-started!");
            }
            if (ju.k.d(p0Var, null, null, new C2549a(qVar, null), 3, null).isCancelled()) {
                qVar.i(null);
            }
            return qVar;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f107080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f107081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T> f107082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f107083g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q<T> qVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f107082f = qVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f107081e = obj;
            this.f107083g |= PKIFailureInfo.systemUnavail;
            return this.f107082f.h(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(int i15, er.l<? super List<? extends T>, i0> lVar, er.p<? super List<T>, ? super tq.e<? super i0>, ? extends Object> pVar) {
        this.capacity = i15;
        this.onUnprocessedElements = lVar;
        this.process = pVar;
        this.started = iu.b.a(false);
        this.channel = lu.j.b(i15, null, new er.l() { // from class: k.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.g(this.f107070a, obj);
            }
        }, 2, null);
        this.queue = new pq.m<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(q qVar, Object obj) {
        qVar.queue.add(obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x003f A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:35:0x0088, B:26:0x004f, B:28:0x0057, B:29:0x005d, B:31:0x0063, B:32:0x0073, B:22:0x003f, B:25:0x004a, B:19:0x0038), top: B:40:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:35:0x0088, B:26:0x004f, B:28:0x0057, B:29:0x005d, B:31:0x0063, B:32:0x0073, B:22:0x003f, B:25:0x004a, B:19:0x0038), top: B:40:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0057 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:35:0x0088, B:26:0x004f, B:28:0x0057, B:29:0x005d, B:31:0x0063, B:32:0x0073, B:22:0x003f, B:25:0x004a, B:19:0x0038), top: B:40:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[Catch: all -> 0x002e, LOOP:0: B:29:0x005d->B:31:0x0063, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:35:0x0088, B:26:0x004f, B:28:0x0057, B:29:0x005d, B:31:0x0063, B:32:0x0073, B:22:0x003f, B:25:0x004a, B:19:0x0038), top: B:40:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0085 -> B:35:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(tq.e<? super oq.i0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof k.q.b
            if (r0 == 0) goto L13
            r0 = r7
            k.q$b r0 = (k.q.b) r0
            int r1 = r0.f107083g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107083g = r1
            goto L18
        L13:
            k.q$b r0 = new k.q$b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f107081e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f107083g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r2 = r0.f107080d
            oq.u.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L88
        L2e:
            r7 = move-exception
            goto L91
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            oq.u.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L4a
        L3c:
            oq.u.b(r7)
        L3f:
            lu.g<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L2e
            r0.f107083g = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L4a
            goto L87
        L4a:
            pq.m<T> r2 = r6.queue     // Catch: java.lang.Throwable -> L2e
            r2.add(r7)     // Catch: java.lang.Throwable -> L2e
        L4f:
            pq.m<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2e
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L3f
            lu.g<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.k()     // Catch: java.lang.Throwable -> L2e
        L5d:
            boolean r2 = lu.k.j(r7)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L73
            pq.m<T> r2 = r6.queue     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = lu.k.g(r7)     // Catch: java.lang.Throwable -> L2e
            r2.add(r7)     // Catch: java.lang.Throwable -> L2e
            lu.g<T> r7 = r6.channel     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.k()     // Catch: java.lang.Throwable -> L2e
            goto L5d
        L73:
            pq.m<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L2e
            er.p<java.util.List<T>, tq.e<? super oq.i0>, java.lang.Object> r7 = r6.process     // Catch: java.lang.Throwable -> L2e
            pq.m<T> r5 = r6.queue     // Catch: java.lang.Throwable -> L2e
            r0.f107080d = r2     // Catch: java.lang.Throwable -> L2e
            r0.f107083g = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r7.B(r5, r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            pq.m<T> r7 = r6.queue     // Catch: java.lang.Throwable -> L2e
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L2e
            if (r2 != r7) goto L4f
            goto L3f
        L91:
            r6.i(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.q.h(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Throwable cause) {
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

    public final boolean j(T element) {
        return lu.k.j(this.channel.d(element));
    }

    public /* synthetic */ q(int i15, er.l lVar, er.p pVar, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? Integer.MAX_VALUE : i15, (i16 & 2) != 0 ? new er.l() { // from class: k.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.c((List) obj);
            }
        } : lVar, pVar);
    }
}
