package ja;

import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.IndexedValue;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lja/c;", "", "T", "Lmu/g;", "Lja/f0;", "src", "Lju/p0;", "scope", "<init>", "(Lmu/g;Lju/p0;)V", "Loq/i0;", "f", "()V", "Lja/f0$b;", "g", "()Lja/f0$b;", "Lja/l;", "a", "Lja/l;", "pageController", "Lmu/a0;", "Lpq/p0;", "b", "Lmu/a0;", "mutableSharedSrc", "Lmu/f0;", "c", "Lmu/f0;", "sharedForDownstream", "Lju/d2;", "d", "Lju/d2;", "job", "e", "Lmu/g;", "h", "()Lmu/g;", "downstreamFlow", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<T> pageController = new l<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<IndexedValue<f0<T>>> mutableSharedSrc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mu.f0<IndexedValue<f0<T>>> sharedForDownstream;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d2 job;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mu.g<f0<T>> downstreamFlow;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lmu/h;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<mu.h<? super f0<T>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f100582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c<T> f100583g;

        /* JADX INFO: renamed from: ja.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lpq/p0;", "Lja/f0;", "it", "", "<anonymous>", "(Lpq/p0;)Z"}, k = 3, mv = {2, 0, 0})
        static final class C2364a extends vq.k implements er.p<IndexedValue<? extends f0<T>>, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f100584e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f100585f;

            C2364a(tq.e<? super C2364a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f100584e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return vq.b.a(((IndexedValue) this.f100585f) != null);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(IndexedValue<? extends f0<T>> indexedValue, tq.e<? super Boolean> eVar) {
                return ((C2364a) v(indexedValue, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C2364a c2364a = new C2364a(eVar);
                c2364a.f100585f = obj;
                return c2364a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fr.n0 f100586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ mu.h<f0<T>> f100587b;

            /* JADX INFO: renamed from: ja.c$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C2365a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f100588d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f100589e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ b<T> f100590f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f100591g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2365a(b<? super T> bVar, tq.e<? super C2365a> eVar) {
                    super(eVar);
                    this.f100590f = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100589e = obj;
                    this.f100591g |= PKIFailureInfo.systemUnavail;
                    return this.f100590f.F(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(fr.n0 n0Var, mu.h<? super f0<T>> hVar) {
                this.f100586a = n0Var;
                this.f100587b = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(IndexedValue<? extends f0<T>> indexedValue, tq.e<? super oq.i0> eVar) throws Throwable {
                C2365a c2365a;
                if (eVar instanceof C2365a) {
                    c2365a = (C2365a) eVar;
                    int i15 = c2365a.f100591g;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2365a.f100591g = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2365a = new C2365a(this, eVar);
                    }
                } else {
                    c2365a = new C2365a(this, eVar);
                }
                Object obj = c2365a.f100589e;
                Object objE = uq.b.e();
                int i16 = c2365a.f100591g;
                if (i16 == 0) {
                    oq.u.b(obj);
                    if (indexedValue.c() > this.f100586a.f66407a) {
                        mu.h<f0<T>> hVar = this.f100587b;
                        f0<T> f0VarD = indexedValue.d();
                        c2365a.f100588d = indexedValue;
                        c2365a.f100591g = 1;
                        if (hVar.F(f0VarD, c2365a) == objE) {
                            return objE;
                        }
                    }
                    return oq.i0.f148189a;
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                indexedValue = (IndexedValue) c2365a.f100588d;
                oq.u.b(obj);
                this.f100586a.f66407a = indexedValue.c();
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f100583g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100581e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.h hVar = (mu.h) this.f100582f;
                fr.n0 n0Var = new fr.n0();
                n0Var.f66407a = PKIFailureInfo.systemUnavail;
                mu.g gVarC0 = mu.i.c0(((c) this.f100583g).sharedForDownstream, new C2364a(null));
                b bVar = new b(n0Var, hVar);
                this.f100581e = 1;
                if (gVarC0.a(bVar, this) == objE) {
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
        public final Object B(mu.h<? super f0<T>> hVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f100583g, eVar);
            aVar.f100582f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ mu.g<f0<T>> f100593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c<T> f100594g;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<T> f100595a;

            /* JADX INFO: renamed from: ja.c$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C2366a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f100596d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f100597e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ a<T> f100598f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f100599g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2366a(a<? super T> aVar, tq.e<? super C2366a> eVar) {
                    super(eVar);
                    this.f100598f = aVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100597e = obj;
                    this.f100599g |= PKIFailureInfo.systemUnavail;
                    return this.f100598f.F(null, this);
                }
            }

            a(c<T> cVar) {
                this.f100595a = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            
                if (r7.c(r6, r0) == r1) goto L21;
             */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(pq.IndexedValue<? extends ja.f0<T>> r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ja.c.b.a.C2366a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ja.c$b$a$a r0 = (ja.c.b.a.C2366a) r0
                    int r1 = r0.f100599g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f100599g = r1
                    goto L18
                L13:
                    ja.c$b$a$a r0 = new ja.c$b$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.f100597e
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f100599g
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r7)
                    goto L62
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f100596d
                    pq.p0 r6 = (pq.IndexedValue) r6
                    oq.u.b(r7)
                    goto L50
                L3c:
                    oq.u.b(r7)
                    ja.c<T> r7 = r5.f100595a
                    mu.a0 r7 = ja.c.c(r7)
                    r0.f100596d = r6
                    r0.f100599g = r4
                    java.lang.Object r7 = r7.F(r6, r0)
                    if (r7 != r1) goto L50
                    goto L61
                L50:
                    ja.c<T> r7 = r5.f100595a
                    ja.l r7 = ja.c.d(r7)
                    r2 = 0
                    r0.f100596d = r2
                    r0.f100599g = r3
                    java.lang.Object r6 = r7.c(r6, r0)
                    if (r6 != r1) goto L62
                L61:
                    return r1
                L62:
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ja.c.b.a.F(pq.p0, tq.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(mu.g<? extends f0<T>> gVar, c<T> cVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f100593f = gVar;
            this.f100594g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f100592e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarE0 = mu.i.e0(this.f100593f);
                a aVar = new a(this.f100594g);
                this.f100592e = 1;
                if (gVarE0.a(aVar, this) == objE) {
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
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f100593f, this.f100594g, eVar);
        }
    }

    /* JADX INFO: renamed from: ja.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lmu/h;", "Lpq/p0;", "Lja/f0;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 0, 0})
    static final class C2367c extends vq.k implements er.p<mu.h<? super IndexedValue<? extends f0<T>>>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f100601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f100602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c<T> f100603h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2367c(c<T> cVar, tq.e<? super C2367c> eVar) {
            super(2, eVar);
            this.f100603h = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x0056->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        
            if (r5 == r0) goto L18;
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
                int r1 = r4.f100601f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r4.f100600e
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r4.f100602g
                mu.h r3 = (mu.h) r3
                oq.u.b(r5)
                goto L56
            L1a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L22:
                java.lang.Object r1 = r4.f100602g
                mu.h r1 = (mu.h) r1
                oq.u.b(r5)
                goto L43
            L2a:
                oq.u.b(r5)
                java.lang.Object r5 = r4.f100602g
                r1 = r5
                mu.h r1 = (mu.h) r1
                ja.c<T> r5 = r4.f100603h
                ja.l r5 = ja.c.d(r5)
                r4.f100602g = r1
                r4.f100601f = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L43
                goto L6e
            L43:
                java.util.List r5 = (java.util.List) r5
                ja.c<T> r3 = r4.f100603h
                ju.d2 r3 = ja.c.b(r3)
                r3.start()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
                r3 = r1
                r1 = r5
            L56:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6f
                java.lang.Object r5 = r1.next()
                pq.p0 r5 = (pq.IndexedValue) r5
                r4.f100602g = r3
                r4.f100600e = r1
                r4.f100601f = r2
                java.lang.Object r5 = r3.F(r5, r4)
                if (r5 != r0) goto L56
            L6e:
                return r0
            L6f:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.c.C2367c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super IndexedValue<? extends f0<T>>> hVar, tq.e<? super oq.i0> eVar) {
            return ((C2367c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            C2367c c2367c = new C2367c(this.f100603h, eVar);
            c2367c.f100602g = obj;
            return c2367c;
        }
    }

    public c(mu.g<? extends f0<T>> gVar, ju.p0 p0Var) {
        mu.a0<IndexedValue<f0<T>>> a0VarA = mu.h0.a(1, Integer.MAX_VALUE, lu.a.SUSPEND);
        this.mutableSharedSrc = a0VarA;
        this.sharedForDownstream = mu.i.V(a0VarA, new C2367c(this, null));
        d2 d2VarD = ju.k.d(p0Var, null, ju.r0.LAZY, new b(gVar, this, null), 1, null);
        d2VarD.C0(new er.l() { // from class: ja.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(this.f100571a, (Throwable) obj);
            }
        });
        this.job = d2VarD;
        this.downstreamFlow = mu.i.I(new a(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(c cVar, Throwable th4) {
        cVar.mutableSharedSrc.f(null);
        return oq.i0.f148189a;
    }

    public final void f() {
        d2.a.a(this.job, null, 1, null);
    }

    public final f0.b<T> g() {
        return this.pageController.a();
    }

    public final mu.g<f0<T>> h() {
        return this.downstreamFlow;
    }
}
