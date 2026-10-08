package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.IndexedValue;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a]\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012*\b\u0001\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "T", "Lmu/g;", "a", "(Lmu/g;)Lmu/g;", "Lpq/p0;", "d", "Lkotlin/Function2;", "Ltq/e;", "Loq/i0;", "action", "b", "(Lmu/g;Ler/p;)Lmu/g;", "R", "initial", "Lkotlin/Function3;", "operation", "c", "(Lmu/g;Ljava/lang/Object;Ler/q;)Lmu/g;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128489a;

        /* JADX INFO: renamed from: mu.y$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C3181a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f128490a;

            /* JADX INFO: renamed from: mu.y$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3182a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128491d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128492e;

                public C3182a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128491d = obj;
                    this.f128492e |= PKIFailureInfo.systemUnavail;
                    return C3181a.this.F(null, this);
                }
            }

            public C3181a(h hVar) {
                this.f128490a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
                C3182a c3182a;
                if (eVar instanceof C3182a) {
                    c3182a = (C3182a) eVar;
                    int i15 = c3182a.f128492e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3182a.f128492e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3182a = new C3182a(eVar);
                    }
                } else {
                    c3182a = new C3182a(eVar);
                }
                Object obj = c3182a.f128491d;
                Object objE = uq.b.e();
                int i16 = c3182a.f128492e;
                if (i16 == 0) {
                    oq.u.b(obj);
                    h hVar = this.f128490a;
                    if (t15 != null) {
                        c3182a.f128492e = 1;
                        if (hVar.F(t15, c3182a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }
        }

        public a(g gVar) {
            this.f128489a = gVar;
        }

        @Override // mu.g
        public Object a(h hVar, tq.e eVar) {
            Object objA = this.f128489a.a(new C3181a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128495b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f128496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.p f128497b;

            /* JADX INFO: renamed from: mu.y$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3183a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128498d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128499e;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f128501g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f128502h;

                public C3183a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128498d = obj;
                    this.f128499e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, er.p pVar) {
                this.f128496a = hVar;
                this.f128497b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.F(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(T r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof mu.y.b.a.C3183a
                    if (r0 == 0) goto L13
                    r0 = r7
                    mu.y$b$a$a r0 = (mu.y.b.a.C3183a) r0
                    int r1 = r0.f128499e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128499e = r1
                    goto L18
                L13:
                    mu.y$b$a$a r0 = new mu.y$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f128498d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f128499e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f128502h
                    mu.h r6 = (mu.h) r6
                    java.lang.Object r2 = r0.f128501g
                    oq.u.b(r7)
                    goto L5c
                L3e:
                    oq.u.b(r7)
                    mu.h r7 = r5.f128496a
                    er.p r2 = r5.f128497b
                    r0.f128501g = r6
                    r0.f128502h = r7
                    r0.f128499e = r4
                    r4 = 6
                    fr.r.c(r4)
                    java.lang.Object r2 = r2.B(r6, r0)
                    r4 = 7
                    fr.r.c(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f128501g = r7
                    r0.f128502h = r7
                    r0.f128499e = r3
                    java.lang.Object r6 = r6.F(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.y.b.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public b(g gVar, er.p pVar) {
            this.f128494a = gVar;
            this.f128495b = pVar;
        }

        @Override // mu.g
        public Object a(h hVar, tq.e eVar) {
            Object objA = this.f128494a.a(new a(hVar, this.f128495b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/y$c", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<R> implements g<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f128503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f128504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.q f128505c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128506d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128507e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128509g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128510h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f128511j;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128506d = obj;
                this.f128507e |= PKIFailureInfo.systemUnavail;
                return c.this.a(null, this);
            }
        }

        public c(Object obj, g gVar, er.q qVar) {
            this.f128503a = obj;
            this.f128504b = gVar;
            this.f128505c = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            if (r8.a(r5, r0) == r1) goto L22;
         */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // mu.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(mu.h<? super R> r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.y.c.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.y$c$a r0 = (mu.y.c.a) r0
                int r1 = r0.f128507e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128507e = r1
                goto L18
            L13:
                mu.y$c$a r0 = new mu.y$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f128506d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128507e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f128511j
                fr.p0 r7 = (fr.p0) r7
                java.lang.Object r2 = r0.f128510h
                mu.h r2 = (mu.h) r2
                java.lang.Object r4 = r0.f128509g
                mu.y$c r4 = (mu.y.c) r4
                oq.u.b(r8)
                goto L62
            L44:
                oq.u.b(r8)
                fr.p0 r8 = new fr.p0
                r8.<init>()
                java.lang.Object r2 = r6.f128503a
                r8.f66410a = r2
                r0.f128509g = r6
                r0.f128510h = r7
                r0.f128511j = r8
                r0.f128507e = r4
                java.lang.Object r2 = r7.F(r2, r0)
                if (r2 != r1) goto L5f
                goto L7a
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                mu.g r8 = r4.f128504b
                mu.y$d r5 = new mu.y$d
                er.q r4 = r4.f128505c
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f128509g = r7
                r0.f128510h = r7
                r0.f128511j = r7
                r0.f128507e = r3
                java.lang.Object r7 = r8.a(r5, r0)
                if (r7 != r1) goto L7b
            L7a:
                return r1
            L7b:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.y.c.a(mu.h, tq.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.p0<R> f128512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.q<R, T, tq.e<? super R>, Object> f128513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<R> f128514c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128515d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f128516e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f128517f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d<T> f128518g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f128519h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128518g = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128517f = obj;
                this.f128519h |= PKIFailureInfo.systemUnavail;
                return this.f128518g.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(fr.p0<R> p0Var, er.q<? super R, ? super T, ? super tq.e<? super R>, ? extends Object> qVar, h<? super R> hVar) {
            this.f128512a = p0Var;
            this.f128513b = qVar;
            this.f128514c = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r7.F((R) r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object F(T r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.y.d.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.y$d$a r0 = (mu.y.d.a) r0
                int r1 = r0.f128519h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128519h = r1
                goto L18
            L13:
                mu.y$d$a r0 = new mu.y$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f128517f
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128519h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r8)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f128516e
                fr.p0 r7 = (fr.p0) r7
                java.lang.Object r2 = r0.f128515d
                mu.y$d r2 = (mu.y.d) r2
                oq.u.b(r8)
                goto L5a
            L40:
                oq.u.b(r8)
                fr.p0<R> r8 = r6.f128512a
                er.q<R, T, tq.e<? super R>, java.lang.Object> r2 = r6.f128513b
                T r5 = r8.f66410a
                r0.f128515d = r6
                r0.f128516e = r8
                r0.f128519h = r4
                java.lang.Object r7 = r2.w(r5, r7, r0)
                if (r7 != r1) goto L56
                goto L6f
            L56:
                r2 = r8
                r8 = r7
                r7 = r2
                r2 = r6
            L5a:
                r7.f66410a = r8
                mu.h<R> r7 = r2.f128514c
                fr.p0<R> r8 = r2.f128512a
                T r8 = r8.f66410a
                r2 = 0
                r0.f128515d = r2
                r0.f128516e = r2
                r0.f128519h = r3
                java.lang.Object r7 = r7.F(r8, r0)
                if (r7 != r1) goto L70
            L6f:
                return r1
            L70:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.y.d.F(java.lang.Object, tq.e):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/y$e", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements g<IndexedValue<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128520a;

        public e(g gVar) {
            this.f128520a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super IndexedValue<? extends T>> hVar, tq.e<? super oq.i0> eVar) {
            Object objA = this.f128520a.a(new f(hVar, new fr.n0()), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h<IndexedValue<? extends T>> f128521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.n0 f128522b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128523d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f<T> f128524e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128525f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128524e = fVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128523d = obj;
                this.f128525f |= PKIFailureInfo.systemUnavail;
                return this.f128524e.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(h<? super IndexedValue<? extends T>> hVar, fr.n0 n0Var) {
            this.f128521a = hVar;
            this.f128522b = n0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128525f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128525f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            } else {
                aVar = new a(this, eVar);
            }
            Object obj = aVar.f128523d;
            Object objE = uq.b.e();
            int i16 = aVar.f128525f;
            if (i16 == 0) {
                oq.u.b(obj);
                h<IndexedValue<? extends T>> hVar = this.f128521a;
                fr.n0 n0Var = this.f128522b;
                int i17 = n0Var.f66407a;
                n0Var.f66407a = i17 + 1;
                if (i17 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                IndexedValue<? extends T> indexedValue = new IndexedValue<>(i17, t15);
                aVar.f128525f = 1;
                if (hVar.F(indexedValue, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }
    }

    public static final <T> g<T> a(g<? extends T> gVar) {
        return new a(gVar);
    }

    public static final <T> g<T> b(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super oq.i0>, ? extends Object> pVar) {
        return new b(gVar, pVar);
    }

    public static final <T, R> g<R> c(g<? extends T> gVar, R r15, er.q<? super R, ? super T, ? super tq.e<? super R>, ? extends Object> qVar) {
        return new c(r15, gVar, qVar);
    }

    public static final <T> g<IndexedValue<T>> d(g<? extends T> gVar) {
        return new e(gVar);
    }
}
