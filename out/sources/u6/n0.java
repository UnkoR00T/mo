package u6;

import ju.d2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lu6/n0;", "T", "", "Lju/p0;", "scope", "Lkotlin/Function1;", "", "Loq/i0;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Ltq/e;", "consumeMessage", "<init>", "(Lju/p0;Ler/l;Ler/p;Ler/p;)V", "msg", "g", "(Ljava/lang/Object;)V", "a", "Lju/p0;", "b", "Ler/p;", "Llu/g;", "c", "Llu/g;", "messageQueue", "Lu6/b;", "d", "Lu6/b;", "remainingMessages", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.p<T, tq.e<? super oq.i0>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lu.g<T> messageQueue = lu.j.b(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b remainingMessages = new b(0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195572e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0<T> f195574g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<T> n0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f195574g = n0Var;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 er.p) = (r1v2 er.p), (r1v4 er.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.B(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f195573f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f195572e
                er.p r1 = (er.p) r1
                oq.u.b(r6)
                goto L51
            L22:
                oq.u.b(r6)
                u6.n0<T> r6 = r5.f195574g
                u6.b r6 = u6.n0.e(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                u6.n0<T> r6 = r5.f195574g
                ju.p0 r6 = u6.n0.f(r6)
                ju.q0.f(r6)
                u6.n0<T> r6 = r5.f195574g
                er.p r1 = u6.n0.c(r6)
                u6.n0<T> r6 = r5.f195574g
                lu.g r6 = u6.n0.d(r6)
                r5.f195572e = r1
                r5.f195573f = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f195572e = r4
                r5.f195573f = r2
                java.lang.Object r6 = r1.B(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                u6.n0<T> r6 = r5.f195574g
                u6.b r6 = u6.n0.e(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.n0.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f195574g, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(ju.p0 p0Var, final er.l<? super Throwable, oq.i0> lVar, final er.p<? super T, ? super Throwable, oq.i0> pVar, er.p<? super T, ? super tq.e<? super oq.i0>, ? extends Object> pVar2) {
        this.scope = p0Var;
        this.consumeMessage = pVar2;
        d2 d2Var = (d2) p0Var.getCoroutineContext().m(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.C0(new er.l() { // from class: u6.m0
                @Override // er.l
                public final Object b(Object obj) {
                    return n0.b(lVar, this, pVar, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b(er.l lVar, n0 n0Var, er.p pVar, Throwable th4) {
        lVar.b(th4);
        n0Var.messageQueue.n(th4);
        while (true) {
            Object objF = lu.k.f(n0Var.messageQueue.k());
            if (objF == null) {
                return oq.i0.f148189a;
            }
            pVar.B(objF, th4);
        }
    }

    public final void g(T msg) throws Throwable {
        Object objD = this.messageQueue.d(msg);
        if (objD instanceof lu.k.Closed) {
            Throwable thE = lu.k.e(objD);
            if (thE != null) {
                throw thE;
            }
            throw new lu.r("Channel was closed normally");
        }
        if (!lu.k.j(objD)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            ju.k.d(this.scope, null, null, new a(this, null), 3, null);
        }
    }
}
