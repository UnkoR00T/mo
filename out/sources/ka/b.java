package ka;

import er.p;
import ja.LoadStates;
import ja.n0;
import ja.w;
import ju.p0;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.t;
import tq.e;
import tq.i;
import tq.j;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"", "T", "Lmu/g;", "Lja/n0;", "Ltq/i;", "context", "Lka/a;", "b", "(Lmu/g;Ltq/i;Lm2/r;II)Lka/a;", "Lja/w$c;", "a", "Lja/w$c;", "IncompleteLoadState", "Lja/x;", "Lja/x;", "InitialLoadStates", "paging-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w.NotLoading f109321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final LoadStates f109322b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f109324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ka.a<T> f109325g;

        /* JADX INFO: renamed from: ka.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class C2608a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f109326e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ka.a<T> f109327f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2608a(ka.a<T> aVar, e<? super C2608a> eVar) {
                super(2, eVar);
                this.f109327f = aVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to ka.b$a$a for r3v1 'this'  tq.e
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r3.f109326e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r4)
                    goto L25
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    oq.u.b(r4)
                    ka.a<T> r4 = r3.f109327f
                    r3.f109326e = r2
                    java.lang.Object r4 = r4.e(r3)
                    if (r4 != r0) goto L25
                    return r0
                L25:
                    oq.i0 r4 = oq.i0.f148189a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: ka.b.a.C2608a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C2608a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C2608a(this.f109327f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, ka.a<T> aVar, e<? super a> eVar) {
            super(2, eVar);
            this.f109324f = iVar;
            this.f109325g = aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to ka.b$a for r5v1 'this'  tq.e
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f109323e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                goto L46
            L1b:
                oq.u.b(r6)
                tq.i r6 = r5.f109324f
                tq.j r1 = tq.j.f191408a
                boolean r6 = fr.t.c(r6, r1)
                if (r6 == 0) goto L33
                ka.a<T> r6 = r5.f109325g
                r5.f109323e = r3
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L46
                goto L45
            L33:
                tq.i r6 = r5.f109324f
                ka.b$a$a r1 = new ka.b$a$a
                ka.a<T> r3 = r5.f109325g
                r4 = 0
                r1.<init>(r3, r4)
                r5.f109323e = r2
                java.lang.Object r6 = ju.i.g(r6, r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.b.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f109324f, this.f109325g, eVar);
        }
    }

    /* JADX INFO: renamed from: ka.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class C2609b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i f109329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ka.a<T> f109330g;

        /* JADX INFO: renamed from: ka.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f109331e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ka.a<T> f109332f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ka.a<T> aVar, e<? super a> eVar) {
                super(2, eVar);
                this.f109332f = aVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to ka.b$b$a for r3v1 'this'  tq.e
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r3.f109331e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r4)
                    goto L25
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    oq.u.b(r4)
                    ka.a<T> r4 = r3.f109332f
                    r3.f109331e = r2
                    java.lang.Object r4 = r4.d(r3)
                    if (r4 != r0) goto L25
                    return r0
                L25:
                    oq.i0 r4 = oq.i0.f148189a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: ka.b.C2609b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new a(this.f109332f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2609b(i iVar, ka.a<T> aVar, e<? super C2609b> eVar) {
            super(2, eVar);
            this.f109329f = iVar;
            this.f109330g = aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to ka.b$b for r5v1 'this'  tq.e
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f109328e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                goto L46
            L1b:
                oq.u.b(r6)
                tq.i r6 = r5.f109329f
                tq.j r1 = tq.j.f191408a
                boolean r6 = fr.t.c(r6, r1)
                if (r6 == 0) goto L33
                ka.a<T> r6 = r5.f109330g
                r5.f109328e = r3
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r0) goto L46
                goto L45
            L33:
                tq.i r6 = r5.f109329f
                ka.b$b$a r1 = new ka.b$b$a
                ka.a<T> r3 = r5.f109330g
                r4 = 0
                r1.<init>(r3, r4)
                r5.f109328e = r2
                java.lang.Object r6 = ju.i.g(r6, r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.b.C2609b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((C2609b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new C2609b(this.f109329f, this.f109330g, eVar);
        }
    }

    static {
        w.NotLoading notLoading = new w.NotLoading(false);
        f109321a = notLoading;
        f109322b = new LoadStates(w.Loading.f101205b, notLoading, notLoading);
    }

    public static final <T> ka.a<T> b(g<n0<T>> gVar, i iVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            iVar = j.f191408a;
        }
        if (t.k()) {
            t.o(388053246, i15, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:187)");
        }
        boolean zW = rVar.W(gVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new ka.a(gVar);
            rVar.v(objE);
        }
        ka.a<T> aVar = (ka.a) objE;
        boolean zG = rVar.G(iVar) | rVar.G(aVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == r.INSTANCE.a()) {
            objE2 = new a(iVar, aVar, null);
            rVar.v(objE2);
        }
        Function0.d(aVar, (p) objE2, rVar, 0);
        boolean zG2 = rVar.G(iVar) | rVar.G(aVar);
        Object objE3 = rVar.E();
        if (zG2 || objE3 == r.INSTANCE.a()) {
            objE3 = new C2609b(iVar, aVar, null);
            rVar.v(objE3);
        }
        Function0.d(aVar, (p) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return aVar;
    }
}
