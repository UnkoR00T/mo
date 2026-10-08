package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\n\u001a\u00020\t2(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0012\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a]\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\u0006\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aQ\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\b\" \u0010#\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"T", "R", "Lmu/g;", "Lkotlin/Function2;", "Ltq/e;", "", "transform", "a", "(Lmu/g;Ler/p;)Lmu/g;", "", "concurrency", "b", "(Lmu/g;ILer/p;)Lmu/g;", "d", "(Lmu/g;)Lmu/g;", "", "g", "(Ljava/lang/Iterable;)Lmu/g;", "", "flows", "h", "([Lmu/g;)Lmu/g;", "e", "(Lmu/g;I)Lmu/g;", "Lkotlin/Function3;", "Lmu/h;", "Loq/i0;", "i", "(Lmu/g;Ler/q;)Lmu/g;", "f", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f128417a = ou.f0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements g<g<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128419b;

        /* JADX INFO: renamed from: mu.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C3176a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f128420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.p f128421b;

            /* JADX INFO: renamed from: mu.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3177a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128422d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128423e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f128424f;

                public C3177a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128422d = obj;
                    this.f128423e |= PKIFailureInfo.systemUnavail;
                    return C3176a.this.F(null, this);
                }
            }

            public C3176a(h hVar, er.p pVar) {
                this.f128420a = hVar;
                this.f128421b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
            
                if (r7.F(r8, r0) == r1) goto L22;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r7, tq.e r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof mu.v.a.C3176a.C3177a
                    if (r0 == 0) goto L13
                    r0 = r8
                    mu.v$a$a$a r0 = (mu.v.a.C3176a.C3177a) r0
                    int r1 = r0.f128423e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128423e = r1
                    goto L18
                L13:
                    mu.v$a$a$a r0 = new mu.v$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f128422d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f128423e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f128424f
                    mu.h r7 = (mu.h) r7
                    oq.u.b(r8)
                    goto L51
                L3c:
                    oq.u.b(r8)
                    mu.h r8 = r6.f128420a
                    er.p r2 = r6.f128421b
                    r0.f128424f = r8
                    r0.f128423e = r4
                    java.lang.Object r7 = r2.B(r7, r0)
                    if (r7 != r1) goto L4e
                    goto L5c
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f128424f = r2
                    r0.f128423e = r3
                    java.lang.Object r7 = r7.F(r8, r0)
                    if (r7 != r1) goto L5d
                L5c:
                    return r1
                L5d:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.v.a.C3176a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public a(g gVar, er.p pVar) {
            this.f128418a = gVar;
            this.f128419b = pVar;
        }

        @Override // mu.g
        public Object a(h hVar, tq.e eVar) {
            Object objA = this.f128418a.a(new C3176a(hVar, this.f128419b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<R> implements g<g<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128427b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f128428a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.p f128429b;

            /* JADX INFO: renamed from: mu.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C3178a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128430d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128431e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f128432f;

                public C3178a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128430d = obj;
                    this.f128431e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, er.p pVar) {
                this.f128428a = hVar;
                this.f128429b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
            
                if (r7.F(r8, r0) == r1) goto L22;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.lang.Object r7, tq.e r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof mu.v.b.a.C3178a
                    if (r0 == 0) goto L13
                    r0 = r8
                    mu.v$b$a$a r0 = (mu.v.b.a.C3178a) r0
                    int r1 = r0.f128431e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128431e = r1
                    goto L18
                L13:
                    mu.v$b$a$a r0 = new mu.v$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f128430d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f128431e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    oq.u.b(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f128432f
                    mu.h r7 = (mu.h) r7
                    oq.u.b(r8)
                    goto L51
                L3c:
                    oq.u.b(r8)
                    mu.h r8 = r6.f128428a
                    er.p r2 = r6.f128429b
                    r0.f128432f = r8
                    r0.f128431e = r4
                    java.lang.Object r7 = r2.B(r7, r0)
                    if (r7 != r1) goto L4e
                    goto L5c
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f128432f = r2
                    r0.f128431e = r3
                    java.lang.Object r7 = r7.F(r8, r0)
                    if (r7 != r1) goto L5d
                L5c:
                    return r1
                L5d:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.v.b.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        public b(g gVar, er.p pVar) {
            this.f128426a = gVar;
            this.f128427b = pVar;
        }

        @Override // mu.g
        public Object a(h hVar, tq.e eVar) {
            Object objA = this.f128426a.a(new a(hVar, this.f128427b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/v$c", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128434a;

        public c(g gVar) {
            this.f128434a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            Object objA = this.f128434a.a(new d(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h<T> f128435a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128436d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d<T> f128437e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128438f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128437e = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128436d = obj;
                this.f128438f |= PKIFailureInfo.systemUnavail;
                return this.f128437e.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(h<? super T> hVar) {
            this.f128435a = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object F(g<? extends T> gVar, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128438f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128438f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            } else {
                aVar = new a(this, eVar);
            }
            Object obj = aVar.f128436d;
            Object objE = uq.b.e();
            int i16 = aVar.f128438f;
            if (i16 == 0) {
                oq.u.b(obj);
                h<T> hVar = this.f128435a;
                aVar.f128438f = 1;
                if (i.u(hVar, gVar, aVar) == objE) {
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

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmu/h;", "it", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class e<R, T> extends vq.k implements er.q<h<? super R>, T, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f128440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super R>, Object> f128442h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f128442h = pVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to mu.v$e<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f128439e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f128440f
                mu.h r1 = (mu.h) r1
                oq.u.b(r6)
                goto L39
            L22:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f128440f
                r1 = r6
                mu.h r1 = (mu.h) r1
                java.lang.Object r6 = r5.f128441g
                er.p<T, tq.e<? super R>, java.lang.Object> r4 = r5.f128442h
                r5.f128440f = r1
                r5.f128439e = r3
                java.lang.Object r6 = r4.B(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f128440f = r3
                r5.f128439e = r2
                java.lang.Object r6 = r1.F(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.v.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h<? super R> hVar, T t15, tq.e<? super oq.i0> eVar) {
            e eVar2 = new e(this.f128442h, eVar);
            eVar2.f128440f = hVar;
            eVar2.f128441g = t15;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    public static final <T, R> g<R> a(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super g<? extends R>>, ? extends Object> pVar) {
        return i.G(new a(gVar, pVar));
    }

    public static final <T, R> g<R> b(g<? extends T> gVar, int i15, er.p<? super T, ? super tq.e<? super g<? extends R>>, ? extends Object> pVar) {
        return i.H(new b(gVar, pVar), i15);
    }

    public static /* synthetic */ g c(g gVar, int i15, er.p pVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = f128417a;
        }
        return i.E(gVar, i15, pVar);
    }

    public static final <T> g<T> d(g<? extends g<? extends T>> gVar) {
        return new c(gVar);
    }

    public static final <T> g<T> e(g<? extends g<? extends T>> gVar, int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i15).toString());
        }
        if (i15 == 1) {
            return i.G(gVar);
        }
        return new p086nu.g(gVar, i15, null, 0, null, 28, null);
    }

    public static final <T, R> g<R> f(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super R>, ? extends Object> pVar) {
        return i.d0(gVar, new e(pVar, null));
    }

    public static final <T> g<T> g(Iterable<? extends g<? extends T>> iterable) {
        return new p086nu.k(iterable, null, 0, null, 14, null);
    }

    public static final <T> g<T> h(g<? extends T>... gVarArr) {
        return i.P(pq.n.Z(gVarArr));
    }

    public static final <T, R> g<R> i(g<? extends T> gVar, er.q<? super h<? super R>, ? super T, ? super tq.e<? super oq.i0>, ? extends Object> qVar) {
        return new p086nu.j(qVar, gVar, null, 0, null, 28, null);
    }
}
