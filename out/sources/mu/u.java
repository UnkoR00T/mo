package mu;

import ju.g2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"T", "Lmu/g;", "", "count", "a", "(Lmu/g;I)Lmu/g;", "Lkotlin/Function2;", "Ltq/e;", "", "", "predicate", "b", "(Lmu/g;Ler/p;)Lmu/g;", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/u$a", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f128382b;

        public a(g gVar, int i15) {
            this.f128381a = gVar;
            this.f128382b = i15;
        }

        @Override // mu.g
        public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            Object objA = this.f128381a.a(new b(new fr.n0(), this.f128382b, hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.n0 f128383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f128384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<T> f128385c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128386d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b<T> f128387e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128388f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128387e = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128386d = obj;
                this.f128388f |= PKIFailureInfo.systemUnavail;
                return this.f128387e.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(fr.n0 n0Var, int i15, h<? super T> hVar) {
            this.f128383a = n0Var;
            this.f128384b = i15;
            this.f128385c = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128388f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128388f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            } else {
                aVar = new a(this, eVar);
            }
            Object obj = aVar.f128386d;
            Object objE = uq.b.e();
            int i16 = aVar.f128388f;
            if (i16 == 0) {
                oq.u.b(obj);
                fr.n0 n0Var = this.f128383a;
                int i17 = n0Var.f66407a;
                if (i17 < this.f128384b) {
                    n0Var.f66407a = i17 + 1;
                    return oq.i0.f148189a;
                }
                h<T> hVar = this.f128385c;
                aVar.f128388f = 1;
                if (hVar.F(t15, aVar) == objE) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/u$c", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128390b;

        public c(g gVar, er.p pVar) {
            this.f128389a = gVar;
            this.f128390b = pVar;
        }

        @Override // mu.g
        public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) {
            Object objA = this.f128389a.a(new d(new fr.l0(), hVar, this.f128390b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fr.l0 f128391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h<T> f128392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.p<T, tq.e<? super Boolean>, Object> f128393c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128394d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f128395e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f128396f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d<T> f128397g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f128398h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128397g = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128396f = obj;
                this.f128398h |= PKIFailureInfo.systemUnavail;
                return this.f128397g.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(fr.l0 l0Var, h<? super T> hVar, er.p<? super T, ? super tq.e<? super Boolean>, ? extends Object> pVar) {
            this.f128391a = l0Var;
            this.f128392b = hVar;
            this.f128393c = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.F(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.F(r7, r0) == r1) goto L33;
         */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object F(T r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.u.d.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.u$d$a r0 = (mu.u.d.a) r0
                int r1 = r0.f128398h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128398h = r1
                goto L18
            L13:
                mu.u$d$a r0 = new mu.u$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f128396f
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128398h
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                oq.u.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f128395e
                java.lang.Object r2 = r0.f128394d
                mu.u$d r2 = (mu.u.d) r2
                oq.u.b(r8)
                goto L6c
            L41:
                oq.u.b(r8)
                goto L59
            L45:
                oq.u.b(r8)
                fr.l0 r8 = r6.f128391a
                boolean r8 = r8.f66404a
                if (r8 == 0) goto L5c
                mu.h<T> r8 = r6.f128392b
                r0.f128398h = r5
                java.lang.Object r7 = r8.F(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L5c:
                er.p<T, tq.e<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f128393c
                r0.f128394d = r6
                r0.f128395e = r7
                r0.f128398h = r4
                java.lang.Object r8 = r8.B(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                fr.l0 r8 = r2.f128391a
                r8.f66404a = r5
                mu.h<T> r8 = r2.f128392b
                r2 = 0
                r0.f128394d = r2
                r0.f128395e = r2
                r0.f128398h = r3
                java.lang.Object r7 = r8.F(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L8b:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.u.d.F(java.lang.Object, tq.e):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/u$e", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p f128400b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128401d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128402e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128404g;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128401d = obj;
                this.f128402e |= PKIFailureInfo.systemUnavail;
                return e.this.a(null, this);
            }
        }

        public e(g gVar, er.p pVar) {
            this.f128399a = gVar;
            this.f128400b = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.g
        public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            f fVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128402e;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128402e = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f128401d;
            Object objE = uq.b.e();
            int i16 = aVar.f128402e;
            if (i16 == 0) {
                oq.u.b(obj);
                g gVar = this.f128399a;
                f fVar2 = new f(this.f128400b, hVar);
                try {
                    aVar.f128404g = fVar2;
                    aVar.f128402e = 1;
                    if (gVar.a(fVar2, aVar) == objE) {
                        return objE;
                    }
                } catch (p086nu.a e15) {
                    e = e15;
                    fVar = fVar2;
                    p086nu.q.a(e, fVar);
                    g2.j(aVar.getContext());
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) aVar.f128404g;
                try {
                    oq.u.b(obj);
                } catch (p086nu.a e16) {
                    e = e16;
                    p086nu.q.a(e, fVar);
                    g2.j(aVar.getContext());
                }
            }
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/u$f", "Lmu/h;", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p f128405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f128406b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128407d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f128408e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128409f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128411h;

            public a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128408e = obj;
                this.f128409f |= PKIFailureInfo.systemUnavail;
                return f.this.F(null, this);
            }
        }

        public f(er.p pVar, h hVar) {
            this.f128405a = pVar;
            this.f128406b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.F(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object F(T r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof mu.u.f.a
                if (r0 == 0) goto L13
                r0 = r9
                mu.u$f$a r0 = (mu.u.f.a) r0
                int r1 = r0.f128409f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128409f = r1
                goto L18
            L13:
                mu.u$f$a r0 = new mu.u$f$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f128408e
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128409f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f128407d
                mu.u$f r8 = (mu.u.f) r8
                oq.u.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f128411h
                java.lang.Object r2 = r0.f128407d
                mu.u$f r2 = (mu.u.f) r2
                oq.u.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                oq.u.b(r9)
                er.p r9 = r7.f128405a
                r0.f128407d = r7
                r0.f128411h = r8
                r0.f128409f = r4
                r2 = 6
                fr.r.c(r2)
                java.lang.Object r9 = r9.B(r8, r0)
                r2 = 7
                fr.r.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                mu.h r2 = r8.f128406b
                r0.f128407d = r8
                r5 = 0
                r0.f128411h = r5
                r0.f128409f = r3
                java.lang.Object r9 = r2.F(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L81:
                nu.a r9 = new nu.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.u.f.F(java.lang.Object, tq.e):java.lang.Object");
        }
    }

    public static final <T> g<T> a(g<? extends T> gVar, int i15) {
        if (i15 >= 0) {
            return new a(gVar, i15);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i15).toString());
    }

    public static final <T> g<T> b(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super Boolean>, ? extends Object> pVar) {
        return new c(gVar, pVar);
    }

    public static final <T> g<T> c(g<? extends T> gVar, er.p<? super T, ? super tq.e<? super Boolean>, ? extends Object> pVar) {
        return new e(gVar, pVar);
    }
}
