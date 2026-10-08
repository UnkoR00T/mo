package ja;

import java.util.concurrent.CancellationException;
import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0003\u000f\u0012\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lja/j1;", "", "", "cancelPreviousInEqualPriority", "<init>", "(Z)V", "", "priority", "Lkotlin/Function1;", "Ltq/e;", "Loq/i0;", "block", "b", "(ILer/l;Ltq/e;)Ljava/lang/Object;", "Lja/j1$c;", "a", "Lja/j1$c;", "holder", "c", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c holder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lja/j1$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lja/j1;", "runner", "<init>", "(Lja/j1;)V", "a", "Lja/j1;", "()Lja/j1;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a extends CancellationException {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j1 runner;

        public a(j1 j1Var) {
            super("Cancelled isolated runner");
            this.runner = j1Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final j1 getRunner() {
            return this.runner;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lja/j1$c;", "", "Lja/j1;", "singleRunner", "", "cancelPreviousInEqualPriority", "<init>", "(Lja/j1;Z)V", "", "priority", "Lju/d2;", "job", "b", "(ILju/d2;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "(Lju/d2;Ltq/e;)Ljava/lang/Object;", "Lja/j1;", "Z", "Lsu/a;", "c", "Lsu/a;", "mutex", "d", "Lju/d2;", "previous", "e", "I", "previousPriority", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j1 singleRunner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean cancelPreviousInEqualPriority;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final su.a mutex = su.g.b(false, 1, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private d2 previous;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int previousPriority;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f100980d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f100981e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f100982f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f100984h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f100982f = obj;
                this.f100984h |= PKIFailureInfo.systemUnavail;
                return c.this.a(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f100985d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f100986e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f100987f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f100988g;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f100990j;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f100988g = obj;
                this.f100990j |= PKIFailureInfo.systemUnavail;
                return c.this.b(0, null, this);
            }
        }

        public c(j1 j1Var, boolean z15) {
            this.singleRunner = j1Var;
            this.cancelPreviousInEqualPriority = z15;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(d2 d2Var, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            su.a aVar2;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f100984h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f100984h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f100982f;
            Object objE = uq.b.e();
            int i16 = aVar.f100984h;
            if (i16 == 0) {
                oq.u.b(obj);
                aVar2 = this.mutex;
                aVar.f100980d = d2Var;
                aVar.f100981e = aVar2;
                aVar.f100984h = 1;
                if (aVar2.h(null, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                su.a aVar3 = (su.a) aVar.f100981e;
                d2 d2Var2 = (d2) aVar.f100980d;
                oq.u.b(obj);
                aVar2 = aVar3;
                d2Var = d2Var2;
            }
            try {
                if (d2Var == this.previous) {
                    this.previous = null;
                }
                oq.i0 i0Var = oq.i0.f148189a;
                return oq.i0.f148189a;
            } finally {
                aVar2.r(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ju.d2] */
        /* JADX WARN: Type inference failed for: r10v1, types: [su.a] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v4, types: [su.a] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v4, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final Object b(int i15, d2 d2Var, tq.e<? super Boolean> eVar) throws Throwable {
            b bVar;
            ?? r15;
            su.a aVar;
            ?? r16;
            int i16;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i17 = bVar.f100990j;
                if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f100990j = i17 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f100988g;
            Object objE = uq.b.e();
            int i18 = bVar.f100990j;
            boolean z15 = true;
            try {
                if (i18 == 0) {
                    oq.u.b(obj);
                    su.a aVar2 = this.mutex;
                    bVar.f100986e = d2Var;
                    bVar.f100987f = aVar2;
                    bVar.f100985d = i15;
                    bVar.f100990j = 1;
                    if (aVar2.h(null, bVar) != objE) {
                        r15 = d2Var;
                        aVar = aVar2;
                    }
                    return objE;
                }
                if (i18 == 1) {
                    i15 = bVar.f100985d;
                    su.a aVar3 = (su.a) bVar.f100987f;
                    d2 d2Var2 = (d2) bVar.f100986e;
                    oq.u.b(obj);
                    r15 = d2Var2;
                    aVar = aVar3;
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = bVar.f100985d;
                    su.a aVar4 = (su.a) bVar.f100987f;
                    d2 d2Var3 = (d2) bVar.f100986e;
                    oq.u.b(obj);
                    r16 = d2Var3;
                    aVar = aVar4;
                }
                r15 = r16;
                this.previous = r15;
                this.previousPriority = i15;
                d2Var = aVar;
                Boolean boolA = vq.b.a(z15);
                d2Var.r(null);
                return boolA;
                d2 d2Var4 = this.previous;
                if (d2Var4 == null || !d2Var4.h() || (i16 = this.previousPriority) < i15 || (i16 == i15 && this.cancelPreviousInEqualPriority)) {
                    if (d2Var4 != null) {
                        d2Var4.u(new a(this.singleRunner));
                    }
                    if (d2Var4 != null) {
                        bVar.f100986e = r15;
                        bVar.f100987f = aVar;
                        bVar.f100985d = i15;
                        bVar.f100990j = 2;
                        if (d2Var4.T0(bVar) != objE) {
                            r16 = r15;
                            aVar = aVar;
                            r15 = r16;
                        }
                        return objE;
                    }
                    this.previous = r15;
                    this.previousPriority = i15;
                    d2Var = aVar;
                } else {
                    z15 = false;
                    d2Var = aVar;
                }
                Boolean boolA2 = vq.b.a(z15);
                d2Var.r(null);
                return boolA2;
            } catch (Throwable th4) {
                d2Var.r(null);
                throw th4;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f100991d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f100993f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f100991d = obj;
            this.f100993f |= PKIFailureInfo.systemUnavail;
            return j1.this.b(0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100995f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f100997h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super oq.i0>, Object> f100998j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i15, er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f100997h = i15;
            this.f100998j = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (r9.a(r1, r8) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r3v2, types: [ja.j1$c] */
        /* JADX WARN: Type inference failed for: r9v15, types: [ja.j1$c] */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f100994e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3c
                if (r1 == r5) goto L34
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L25
                if (r1 == r2) goto L1c
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r0 = r8.f100995f
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                oq.u.b(r9)
                goto La0
            L25:
                oq.u.b(r9)
                goto La1
            L2a:
                java.lang.Object r1 = r8.f100995f
                ju.d2 r1 = (ju.d2) r1
                oq.u.b(r9)     // Catch: java.lang.Throwable -> L32
                goto L7c
            L32:
                r9 = move-exception
                goto L8e
            L34:
                java.lang.Object r1 = r8.f100995f
                ju.d2 r1 = (ju.d2) r1
                oq.u.b(r9)
                goto L67
            L3c:
                oq.u.b(r9)
                java.lang.Object r9 = r8.f100995f
                ju.p0 r9 = (ju.p0) r9
                tq.i r9 = r9.getCoroutineContext()
                ju.d2$b r1 = ju.d2.INSTANCE
                tq.i$b r9 = r9.m(r1)
                if (r9 == 0) goto La4
                ju.d2 r9 = (ju.d2) r9
                ja.j1 r1 = ja.j1.this
                ja.j1$c r1 = ja.j1.a(r1)
                int r6 = r8.f100997h
                r8.f100995f = r9
                r8.f100994e = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L64
                goto L9e
            L64:
                r7 = r1
                r1 = r9
                r9 = r7
            L67:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La1
                er.l<tq.e<? super oq.i0>, java.lang.Object> r9 = r8.f100998j     // Catch: java.lang.Throwable -> L32
                r8.f100995f = r1     // Catch: java.lang.Throwable -> L32
                r8.f100994e = r4     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.b(r8)     // Catch: java.lang.Throwable -> L32
                if (r9 != r0) goto L7c
                goto L9e
            L7c:
                ja.j1 r9 = ja.j1.this
                ja.j1$c r9 = ja.j1.a(r9)
                r2 = 0
                r8.f100995f = r2
                r8.f100994e = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto La1
                goto L9e
            L8e:
                ja.j1 r3 = ja.j1.this
                ja.j1$c r3 = ja.j1.a(r3)
                r8.f100995f = r9
                r8.f100994e = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L9f
            L9e:
                return r0
            L9f:
                r0 = r9
            La0:
                throw r0
            La1:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            La4:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.j1.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = j1.this.new e(this.f100997h, this.f100998j, eVar);
            eVar2.f100995f = obj;
            return eVar2;
        }
    }

    public j1(boolean z15) {
        this.holder = new c(this, z15);
    }

    public static /* synthetic */ Object c(j1 j1Var, int i15, er.l lVar, tq.e eVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 0;
        }
        return j1Var.b(i15, lVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i15, er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i16 = dVar.f100993f;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f100993f = i16 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f100991d;
        Object objE = uq.b.e();
        int i17 = dVar.f100993f;
        try {
            if (i17 == 0) {
                oq.u.b(obj);
                e eVar2 = new e(i15, lVar, null);
                dVar.f100993f = 1;
                if (ju.q0.e(eVar2, dVar) == objE) {
                    return objE;
                }
            } else {
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
        } catch (a e15) {
            if (e15.getRunner() != this) {
                throw e15;
            }
        }
        return oq.i0.f148189a;
    }

    public /* synthetic */ j1(boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? true : z15);
    }
}
