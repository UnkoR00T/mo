package p046f2;

import er.l;
import er.p;
import ju.n;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import u0.d1;
import vq.g;
import vq.k;
import w0.b2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013¨\u0006\u001f"}, d2 = {"Lf2/mr;", "Lf2/lr;", "", "initialIsVisible", "isPersistent", "Lw0/b2;", "mutatorMutex", "<init>", "(ZZLw0/b2;)V", "Lw0/z1;", "mutatePriority", "Loq/i0;", "b", "(Lw0/z1;Ltq/e;)Ljava/lang/Object;", "dismiss", "()V", "a", "Z", "e", "()Z", "Lw0/b2;", "Lu0/d1;", "c", "Lu0/d1;", "()Lu0/d1;", "transition", "Lju/n;", "d", "Lju/n;", "job", "isVisible", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mr implements lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b2 mutatorMutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d1<Boolean> transition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n<? super i0> job;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements l<e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56948e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f56950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<e<? super i0>, Object> f56951h;

        /* JADX INFO: renamed from: f2.mr$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C1306a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f56952e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l<e<? super i0>, Object> f56953f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1306a(l<? super e<? super i0>, ? extends Object> lVar, e<? super C1306a> eVar) {
                super(2, eVar);
                this.f56953f = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f56952e;
                if (i15 == 0) {
                    u.b(obj);
                    l<e<? super i0>, Object> lVar = this.f56953f;
                    this.f56952e = 1;
                    if (lVar.b(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C1306a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C1306a(this.f56953f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1 z1Var, l<? super e<? super i0>, ? extends Object> lVar, e<? super a> eVar) {
            super(1, eVar);
            this.f56950g = z1Var;
            this.f56951h = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        
            if (r5.b(r4) == r0) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f56948e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto Le
                if (r1 != r2) goto L14
            Le:
                oq.u.b(r5)     // Catch: java.lang.Throwable -> L12
                goto L4c
            L12:
                r5 = move-exception
                goto L5a
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                oq.u.b(r5)
                f2.mr r5 = p046f2.mr.this     // Catch: java.lang.Throwable -> L12
                boolean r5 = r5.getIsPersistent()     // Catch: java.lang.Throwable -> L12
                if (r5 != 0) goto L41
                w0.z1 r5 = r4.f56950g     // Catch: java.lang.Throwable -> L12
                w0.z1 r1 = w0.z1.UserInput     // Catch: java.lang.Throwable -> L12
                if (r5 != r1) goto L2e
                goto L41
            L2e:
                f2.mr$a$a r5 = new f2.mr$a$a     // Catch: java.lang.Throwable -> L12
                er.l<tq.e<? super oq.i0>, java.lang.Object> r1 = r4.f56951h     // Catch: java.lang.Throwable -> L12
                r3 = 0
                r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L12
                r4.f56948e = r2     // Catch: java.lang.Throwable -> L12
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r5 = ju.g3.c(r1, r5, r4)     // Catch: java.lang.Throwable -> L12
                if (r5 != r0) goto L4c
                goto L4b
            L41:
                er.l<tq.e<? super oq.i0>, java.lang.Object> r5 = r4.f56951h     // Catch: java.lang.Throwable -> L12
                r4.f56948e = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r5 = r5.b(r4)     // Catch: java.lang.Throwable -> L12
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                w0.z1 r5 = r4.f56950g
                w0.z1 r0 = w0.z1.PreventUserInput
                if (r5 == r0) goto L57
                f2.mr r5 = p046f2.mr.this
                r5.dismiss()
            L57:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            L5a:
                w0.z1 r0 = r4.f56950g
                w0.z1 r1 = w0.z1.PreventUserInput
                if (r0 == r1) goto L65
                f2.mr r0 = p046f2.mr.this
                r0.dismiss()
            L65:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.mr.a.J(java.lang.Object):java.lang.Object");
        }

        public final e<i0> M(e<?> eVar) {
            return mr.this.new a(this.f56950g, this.f56951h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements l<e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f56954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f56955f;

        b(e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56955f;
            if (i15 == 0) {
                u.b(obj);
                mr mrVar = mr.this;
                this.f56954e = mrVar;
                this.f56955f = 1;
                ju.p pVar = new ju.p(uq.b.c(this), 1);
                pVar.D();
                mrVar.c().h(vq.b.a(true));
                mrVar.job = pVar;
                Object objX = pVar.x();
                if (objX == uq.b.e()) {
                    g.c(this);
                }
                if (objX == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final e<i0> M(e<?> eVar) {
            return mr.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public mr(boolean z15, boolean z16, b2 b2Var) {
        this.isPersistent = z16;
        this.mutatorMutex = b2Var;
        this.transition = new d1<>(Boolean.valueOf(z15));
    }

    @Override // p046f2.lr
    public void a() {
        n<? super i0> nVar = this.job;
        if (nVar != null) {
            n.a.a(nVar, null, 1, null);
        }
    }

    @Override // p046f2.lr
    public Object b(z1 z1Var, e<? super i0> eVar) {
        Object objD = this.mutatorMutex.d(z1Var, new a(z1Var, new b(null), null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // p046f2.lr
    public d1<Boolean> c() {
        return this.transition;
    }

    @Override // p046f2.lr
    public void dismiss() {
        n<? super i0> nVar;
        c().h(Boolean.FALSE);
        if (!getIsPersistent() || (nVar = this.job) == null) {
            return;
        }
        n.a.a(nVar, null, 1, null);
    }

    @Override // p046f2.lr
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // p046f2.lr
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return c().a().booleanValue() || c().b().booleanValue();
    }
}
