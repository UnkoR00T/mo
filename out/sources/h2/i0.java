package h2;

import p046f2.lr;
import p071kotlin.Metadata;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!¨\u0006#"}, d2 = {"Lh2/i0;", "Lf2/lr;", "", "initialIsVisible", "isPersistent", "Lw0/b2;", "mutatorMutex", "<init>", "(ZZLw0/b2;)V", "Lw0/z1;", "mutatePriority", "Loq/i0;", "b", "(Lw0/z1;Ltq/e;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "e", "()Z", "Lw0/b2;", "<set-?>", "c", "Lm2/a3;", "isVisible", "g", "(Z)V", "Lu0/d1;", "d", "Lu0/d1;", "()Lu0/d1;", "transition", "Lju/n;", "Lju/n;", "job", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i0 implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w0.b2 mutatorMutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isVisible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0.d1<Boolean> transition = new u0.d1<>(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ju.n<? super oq.i0> job;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79858e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w0.z1 f79860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super oq.i0>, Object> f79861h;

        /* JADX INFO: renamed from: h2.i0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C1824a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f79862e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ er.l<tq.e<? super oq.i0>, Object> f79863f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1824a(er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super C1824a> eVar) {
                super(2, eVar);
                this.f79863f = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f79862e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    er.l<tq.e<? super oq.i0>, Object> lVar = this.f79863f;
                    this.f79862e = 1;
                    if (lVar.b(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C1824a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C1824a(this.f79863f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(w0.z1 z1Var, er.l<? super tq.e<? super oq.i0>, ? extends Object> lVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f79860g = z1Var;
            this.f79861h = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            if (r6.b(r5) == r0) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f79858e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto Lf
                if (r1 != r3) goto L15
            Lf:
                oq.u.b(r6)     // Catch: java.lang.Throwable -> L13
                goto L4d
            L13:
                r6 = move-exception
                goto L55
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                oq.u.b(r6)
                h2.i0 r6 = h2.i0.this     // Catch: java.lang.Throwable -> L13
                boolean r6 = r6.getIsPersistent()     // Catch: java.lang.Throwable -> L13
                if (r6 != 0) goto L42
                w0.z1 r6 = r5.f79860g     // Catch: java.lang.Throwable -> L13
                w0.z1 r1 = w0.z1.UserInput     // Catch: java.lang.Throwable -> L13
                if (r6 != r1) goto L2f
                goto L42
            L2f:
                h2.i0$a$a r6 = new h2.i0$a$a     // Catch: java.lang.Throwable -> L13
                er.l<tq.e<? super oq.i0>, java.lang.Object> r1 = r5.f79861h     // Catch: java.lang.Throwable -> L13
                r4 = 0
                r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L13
                r5.f79858e = r3     // Catch: java.lang.Throwable -> L13
                r3 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = ju.g3.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L4d
                goto L4c
            L42:
                er.l<tq.e<? super oq.i0>, java.lang.Object> r6 = r5.f79861h     // Catch: java.lang.Throwable -> L13
                r5.f79858e = r4     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.b(r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L4d
            L4c:
                return r0
            L4d:
                h2.i0 r6 = h2.i0.this
                r6.g(r2)
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L55:
                h2.i0 r0 = h2.i0.this
                r0.g(r2)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.i0.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return i0.this.new a(this.f79860g, this.f79861h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f79864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f79865f;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f79865f;
            if (i15 == 0) {
                oq.u.b(obj);
                i0 i0Var = i0.this;
                this.f79864e = i0Var;
                this.f79865f = 1;
                ju.p pVar = new ju.p(uq.b.c(this), 1);
                pVar.D();
                i0Var.g(true);
                i0Var.job = pVar;
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    vq.g.c(this);
                }
                if (objX == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return i0.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public i0(boolean z15, boolean z16, w0.b2 b2Var) {
        this.isPersistent = z16;
        this.mutatorMutex = b2Var;
        this.isVisible = c6.e(Boolean.valueOf(z15), null, 2, null);
    }

    @Override // p046f2.lr
    public void a() {
        ju.n<? super oq.i0> nVar = this.job;
        if (nVar != null) {
            ju.n.a.a(nVar, null, 1, null);
        }
    }

    @Override // p046f2.lr
    public Object b(w0.z1 z1Var, tq.e<? super oq.i0> eVar) {
        Object objD = this.mutatorMutex.d(z1Var, new a(z1Var, new b(null), null), eVar);
        return objD == uq.b.e() ? objD : oq.i0.f148189a;
    }

    @Override // p046f2.lr
    public u0.d1<Boolean> c() {
        return this.transition;
    }

    @Override // p046f2.lr
    public void dismiss() {
        g(false);
    }

    @Override // p046f2.lr
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    public void g(boolean z15) {
        this.isVisible.setValue(Boolean.valueOf(z15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p046f2.lr
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }
}
