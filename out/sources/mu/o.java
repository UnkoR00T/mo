package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lmu/g;", "", "timeoutMillis", "b", "(Lmu/g;J)Lmu/g;", "Lkotlin/Function1;", "timeoutMillisSelector", "d", "(Lmu/g;Ler/l;)Lmu/g;", "periodMillis", "f", "Lju/p0;", "delayMillis", "Llu/y;", "Loq/i0;", "e", "(Lju/p0;J)Llu/y;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lju/p0;", "Lmu/h;", "downstream", "Loq/i0;", "<anonymous>", "(Lju/p0;Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class a<T> extends vq.k implements er.q<ju.p0, h<? super T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128250g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f128251h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128252j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.l<T, Long> f128253k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g<T> f128254l;

        /* JADX INFO: renamed from: mu.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        static final class C3170a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128255e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h<T> f128256f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<Object> f128257g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C3170a(h<? super T> hVar, fr.p0<Object> p0Var, tq.e<? super C3170a> eVar) {
                super(1, eVar);
                this.f128256f = hVar;
                this.f128257g = p0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f128255e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    h<T> hVar = this.f128256f;
                    ou.e0 e0Var = p086nu.u.f138790a;
                    T t15 = this.f128257g.f66410a;
                    if (t15 == e0Var) {
                        t15 = null;
                    }
                    this.f128255e = 1;
                    if (hVar.F(t15, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                this.f128257g.f66410a = null;
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new C3170a(this.f128256f, this.f128257g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((C3170a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/k;", "", "value", "Loq/i0;", "<anonymous>", "(Llu/k;)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<lu.k<? extends Object>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f128258e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128259f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f128260g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ fr.p0<Object> f128261h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ h<T> f128262j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(fr.p0<Object> p0Var, h<? super T> hVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f128261h = p0Var;
                this.f128262j = hVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(lu.k<? extends Object> kVar, tq.e<? super oq.i0> eVar) {
                return M(kVar.getHolder(), eVar);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, ou.e0] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to mu.o$a$b for r6v1 'this'  tq.e
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f128259f
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f128258e
                    fr.p0 r0 = (fr.p0) r0
                    oq.u.b(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    oq.u.b(r7)
                    java.lang.Object r7 = r6.f128260g
                    lu.k r7 = (lu.k) r7
                    java.lang.Object r7 = r7.getHolder()
                    fr.p0<java.lang.Object> r1 = r6.f128261h
                    boolean r3 = r7 instanceof lu.k.c
                    if (r3 != 0) goto L2e
                    r1.f66410a = r7
                L2e:
                    mu.h<T> r4 = r6.f128262j
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = lu.k.e(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f66410a
                    if (r3 == 0) goto L50
                    ou.e0 r5 = p086nu.u.f138790a
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f128260g = r7
                    r6.f128258e = r1
                    r6.f128259f = r2
                    java.lang.Object r7 = r4.F(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    ou.e0 r7 = p086nu.u.f138792c
                    r1.f66410a = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.o.a.b.J(java.lang.Object):java.lang.Object");
            }

            public final Object M(Object obj, tq.e<? super oq.i0> eVar) {
                return ((b) v(lu.k.b(obj), eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                b bVar = new b(this.f128261h, this.f128262j, eVar);
                bVar.f128260g = obj;
                return bVar;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
        static final class c extends vq.k implements er.p<lu.w<? super Object>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128263e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f128264f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ g<T> f128265g;

            /* JADX INFO: renamed from: mu.o$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class C3171a<T> implements h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ lu.w<Object> f128266a;

                /* JADX INFO: renamed from: mu.o$a$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class C3172a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f128267d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ C3171a<T> f128268e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    int f128269f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C3172a(C3171a<? super T> c3171a, tq.e<? super C3172a> eVar) {
                        super(eVar);
                        this.f128268e = c3171a;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f128267d = obj;
                        this.f128269f |= PKIFailureInfo.systemUnavail;
                        return this.f128268e.F(null, this);
                    }
                }

                C3171a(lu.w<Object> wVar) {
                    this.f128266a = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // mu.h
                public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
                    C3172a c3172a;
                    if (eVar instanceof C3172a) {
                        c3172a = (C3172a) eVar;
                        int i15 = c3172a.f128269f;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c3172a.f128269f = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c3172a = new C3172a(this, eVar);
                        }
                    } else {
                        c3172a = new C3172a(this, eVar);
                    }
                    Object obj = c3172a.f128267d;
                    Object objE = uq.b.e();
                    int i16 = c3172a.f128269f;
                    if (i16 == 0) {
                        oq.u.b(obj);
                        lu.w<Object> wVar = this.f128266a;
                        if (t15 == null) {
                            t15 = (T) p086nu.u.f138790a;
                        }
                        c3172a.f128269f = 1;
                        if (wVar.l(t15, c3172a) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(g<? extends T> gVar, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f128265g = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f128263e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    lu.w wVar = (lu.w) this.f128264f;
                    g<T> gVar = this.f128265g;
                    C3171a c3171a = new C3171a(wVar);
                    this.f128263e = 1;
                    if (gVar.a(c3171a, this) == objE) {
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
            public final Object B(lu.w<Object> wVar, tq.e<? super oq.i0> eVar) {
                return ((c) v(wVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                c cVar = new c(this.f128265g, eVar);
                cVar.f128264f = obj;
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super T, Long> lVar, g<? extends T> gVar, tq.e<? super a> eVar) {
            super(3, eVar);
            this.f128253k = lVar;
            this.f128254l = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
        /* JADX WARN: Code duplicated, block: B:16:0x006f  */
        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0090  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[PHI: r1 r5 r6 r7
          0x00a4: PHI (r1v3 fr.o0) = (r1v5 fr.o0), (r1v7 fr.o0), (r1v7 fr.o0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r5v3 fr.p0) = (r5v5 fr.p0), (r5v6 fr.p0), (r5v6 fr.p0) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r6v2 lu.y) = (r6v4 lu.y), (r6v5 lu.y), (r6v5 lu.y) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]
          0x00a4: PHI (r7v2 mu.h) = (r7v4 mu.h), (r7v5 mu.h), (r7v5 mu.h) binds: [B:29:0x00a2, B:15:0x006d, B:22:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00be  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (r7.F(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
        
            if (r7.p(r14) == r0) goto L38;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.o.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ju.p0 p0Var, h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            a aVar = new a(this.f128253k, this.f128254l, eVar);
            aVar.f128251h = p0Var;
            aVar.f128252j = hVar;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llu/w;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<lu.w<? super oq.i0>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f128271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f128272g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f128272g = j15;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003f A[PHI: r1
          0x003f: PHI (r1v3 lu.w) = (r1v2 lu.w), (r1v4 lu.w), (r1v6 lu.w) binds: [B:13:0x003c, B:19:0x005a, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r1
          0x0050: PHI (r1v4 lu.w) = (r1v3 lu.w), (r1v8 lu.w) binds: [B:16:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f128270e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f128271f
                lu.w r1 = (lu.w) r1
                oq.u.b(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f128271f
                lu.w r1 = (lu.w) r1
                oq.u.b(r8)
                goto L3f
            L2a:
                oq.u.b(r8)
                java.lang.Object r8 = r7.f128271f
                r1 = r8
                lu.w r1 = (lu.w) r1
                long r5 = r7.f128272g
                r7.f128271f = r1
                r7.f128270e = r4
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r0) goto L3f
                goto L5c
            L3f:
                lu.z r8 = r1.H()
                oq.i0 r4 = oq.i0.f148189a
                r7.f128271f = r1
                r7.f128270e = r3
                java.lang.Object r8 = r8.l(r4, r7)
                if (r8 != r0) goto L50
                goto L5c
            L50:
                long r4 = r7.f128272g
                r7.f128271f = r1
                r7.f128270e = r2
                java.lang.Object r8 = ju.z0.b(r4, r7)
                if (r8 != r0) goto L3f
            L5c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.o.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(lu.w<? super oq.i0> wVar, tq.e<? super oq.i0> eVar) {
            return ((b) v(wVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f128272g, eVar);
            bVar.f128271f = obj;
            return bVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lju/p0;", "Lmu/h;", "downstream", "Loq/i0;", "<anonymous>", "(Lju/p0;Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends vq.k implements er.q<ju.p0, h<? super T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f128273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f128274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f128275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f128276h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f128277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f128278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g<T> f128279l;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/k;", "", "result", "Loq/i0;", "<anonymous>", "(Llu/k;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<lu.k<? extends Object>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128280e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f128281f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<Object> f128282g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ lu.y<oq.i0> f128283h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(fr.p0<Object> p0Var, lu.y<oq.i0> yVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f128282g = p0Var;
                this.f128283h = yVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(lu.k<? extends Object> kVar, tq.e<? super oq.i0> eVar) {
                return M(kVar.getHolder(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f128280e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                T t15 = (T) ((lu.k) this.f128281f).getHolder();
                fr.p0<Object> p0Var = this.f128282g;
                boolean z15 = t15 instanceof lu.k.c;
                if (!z15) {
                    p0Var.f66410a = t15;
                }
                lu.y<oq.i0> yVar = this.f128283h;
                if (z15) {
                    Throwable thE = lu.k.e(t15);
                    if (thE != null) {
                        throw thE;
                    }
                    yVar.u(new p086nu.l());
                    p0Var.f66410a = (T) p086nu.u.f138792c;
                }
                return oq.i0.f148189a;
            }

            public final Object M(Object obj, tq.e<? super oq.i0> eVar) {
                return ((a) v(lu.k.b(obj), eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f128282g, this.f128283h, eVar);
                aVar.f128281f = obj;
                return aVar;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loq/i0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<oq.i0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128284e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ fr.p0<Object> f128285f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h<T> f128286g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(fr.p0<Object> p0Var, h<? super T> hVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f128285f = p0Var;
                this.f128286g = hVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to mu.o$c$b for r5v1 'this'  tq.e
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
                    int r1 = r5.f128284e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r6)
                    goto L36
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    oq.u.b(r6)
                    fr.p0<java.lang.Object> r6 = r5.f128285f
                    T r1 = r6.f66410a
                    if (r1 != 0) goto L23
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                L23:
                    r3 = 0
                    r6.f66410a = r3
                    mu.h<T> r6 = r5.f128286g
                    ou.e0 r4 = p086nu.u.f138790a
                    if (r1 != r4) goto L2d
                    r1 = r3
                L2d:
                    r5.f128284e = r2
                    java.lang.Object r6 = r6.F(r1, r5)
                    if (r6 != r0) goto L36
                    return r0
                L36:
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.o.c.b.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(oq.i0 i0Var, tq.e<? super oq.i0> eVar) {
                return ((b) v(i0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f128285f, this.f128286g, eVar);
            }
        }

        /* JADX INFO: renamed from: mu.o$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/w;", "", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 1, 0})
        static final class C3173c extends vq.k implements er.p<lu.w<? super Object>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128287e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f128288f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ g<T> f128289g;

            /* JADX INFO: renamed from: mu.o$c$c$a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a<T> implements h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ lu.w<Object> f128290a;

                /* JADX INFO: renamed from: mu.o$c$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class C3174a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f128291d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ a<T> f128292e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    int f128293f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C3174a(a<? super T> aVar, tq.e<? super C3174a> eVar) {
                        super(eVar);
                        this.f128292e = aVar;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f128291d = obj;
                        this.f128293f |= PKIFailureInfo.systemUnavail;
                        return this.f128292e.F(null, this);
                    }
                }

                a(lu.w<Object> wVar) {
                    this.f128290a = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // mu.h
                public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
                    C3174a c3174a;
                    if (eVar instanceof C3174a) {
                        c3174a = (C3174a) eVar;
                        int i15 = c3174a.f128293f;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c3174a.f128293f = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c3174a = new C3174a(this, eVar);
                        }
                    } else {
                        c3174a = new C3174a(this, eVar);
                    }
                    Object obj = c3174a.f128291d;
                    Object objE = uq.b.e();
                    int i16 = c3174a.f128293f;
                    if (i16 == 0) {
                        oq.u.b(obj);
                        lu.w<Object> wVar = this.f128290a;
                        if (t15 == null) {
                            t15 = (T) p086nu.u.f138790a;
                        }
                        c3174a.f128293f = 1;
                        if (wVar.l(t15, c3174a) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C3173c(g<? extends T> gVar, tq.e<? super C3173c> eVar) {
                super(2, eVar);
                this.f128289g = gVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f128287e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    lu.w wVar = (lu.w) this.f128288f;
                    g<T> gVar = this.f128289g;
                    a aVar = new a(wVar);
                    this.f128287e = 1;
                    if (gVar.a(aVar, this) == objE) {
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
            public final Object B(lu.w<Object> wVar, tq.e<? super oq.i0> eVar) {
                return ((C3173c) v(wVar, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C3173c c3173c = new C3173c(this.f128289g, eVar);
                c3173c.f128288f = obj;
                return c3173c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j15, g<? extends T> gVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f128278k = j15;
            this.f128279l = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lu.y yVar;
            lu.y<oq.i0> yVarC;
            fr.p0 p0Var;
            h hVar;
            Object objE = uq.b.e();
            int i15 = this.f128275g;
            if (i15 == 0) {
                oq.u.b(obj);
                ju.p0 p0Var2 = (ju.p0) this.f128276h;
                h hVar2 = (h) this.f128277j;
                lu.y yVarG = lu.u.g(p0Var2, null, -1, new C3173c(this.f128279l, null), 1, null);
                fr.p0 p0Var3 = new fr.p0();
                yVar = yVarG;
                yVarC = i.C(p0Var2, this.f128278k);
                p0Var = p0Var3;
                hVar = hVar2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVarC = (lu.y) this.f128274f;
                p0Var = (fr.p0) this.f128273e;
                yVar = (lu.y) this.f128277j;
                hVar = (h) this.f128276h;
                oq.u.b(obj);
            }
            while (p0Var.f66410a != p086nu.u.f138792c) {
                ru.j jVar = new ru.j(getContext());
                jVar.d(yVar.j(), new a(p0Var, yVarC, null));
                jVar.d(yVarC.f(), new b(p0Var, hVar, null));
                this.f128276h = hVar;
                this.f128277j = yVar;
                this.f128273e = p0Var;
                this.f128274f = yVarC;
                this.f128275g = 1;
                if (jVar.p(this) == objE) {
                    return objE;
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ju.p0 p0Var, h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            c cVar = new c(this.f128278k, this.f128279l, eVar);
            cVar.f128276h = p0Var;
            cVar.f128277j = hVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> b(g<? extends T> gVar, final long j15) {
        if (j15 >= 0) {
            return j15 == 0 ? gVar : d(gVar, new er.l() { // from class: mu.n
                @Override // er.l
                public final Object b(Object obj) {
                    return Long.valueOf(o.c(j15, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(long j15, Object obj) {
        return j15;
    }

    private static final <T> g<T> d(g<? extends T> gVar, er.l<? super T, Long> lVar) {
        return p086nu.p.b(new a(lVar, gVar, null));
    }

    public static final lu.y<oq.i0> e(ju.p0 p0Var, long j15) {
        return lu.u.g(p0Var, null, 0, new b(j15, null), 1, null);
    }

    public static final <T> g<T> f(g<? extends T> gVar, long j15) {
        if (j15 > 0) {
            return p086nu.p.b(new c(j15, gVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }
}
