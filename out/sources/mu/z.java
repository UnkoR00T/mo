package mu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001ai\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001ak\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\f\u0010\n\u001a\u0087\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00140\u0013\"\u0004\b\u0000\u0010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T1", "T2", "R", "Lmu/g;", "flow", "Lkotlin/Function3;", "Ltq/e;", "", "transform", "d", "(Lmu/g;Lmu/g;Ler/q;)Lmu/g;", "flow2", "b", "T3", "flow3", "Lkotlin/Function4;", "c", "(Lmu/g;Lmu/g;Lmu/g;Ler/r;)Lmu/g;", "T", "Lkotlin/Function0;", "", "e", "()Ler/a;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class z {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements g<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g[] f128526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.r f128527b;

        /* JADX INFO: renamed from: mu.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lmu/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C3184a extends vq.k implements er.q<h<? super R>, Object[], tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128528e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f128529f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f128530g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.r f128531h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3184a(tq.e eVar, er.r rVar) {
                super(3, eVar);
                this.f128531h = rVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.F(r8, r7) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f128528e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r8)
                    goto L56
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    java.lang.Object r1 = r7.f128529f
                    mu.h r1 = (mu.h) r1
                    oq.u.b(r8)
                    goto L4a
                L22:
                    oq.u.b(r8)
                    java.lang.Object r8 = r7.f128529f
                    r1 = r8
                    mu.h r1 = (mu.h) r1
                    java.lang.Object r8 = r7.f128530g
                    java.lang.Object[] r8 = (java.lang.Object[]) r8
                    er.r r4 = r7.f128531h
                    r5 = 0
                    r5 = r8[r5]
                    r6 = r8[r3]
                    r8 = r8[r2]
                    r7.f128529f = r1
                    r7.f128528e = r3
                    r3 = 6
                    fr.r.c(r3)
                    java.lang.Object r8 = r4.g(r5, r6, r8, r7)
                    r3 = 7
                    fr.r.c(r3)
                    if (r8 != r0) goto L4a
                    goto L55
                L4a:
                    r3 = 0
                    r7.f128529f = r3
                    r7.f128528e = r2
                    java.lang.Object r8 = r1.F(r8, r7)
                    if (r8 != r0) goto L56
                L55:
                    return r0
                L56:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.z.a.C3184a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.q
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object w(h<? super R> hVar, Object[] objArr, tq.e<? super oq.i0> eVar) {
                C3184a c3184a = new C3184a(eVar, this.f128531h);
                c3184a.f128529f = hVar;
                c3184a.f128530g = objArr;
                return c3184a.J(oq.i0.f148189a);
            }
        }

        public a(g[] gVarArr, er.r rVar) {
            this.f128526a = gVarArr;
            this.f128527b = rVar;
        }

        @Override // mu.g
        public Object a(h hVar, tq.e eVar) {
            Object objA = p086nu.m.a(hVar, this.f128526a, z.e(), new C3184a(null, this.f128527b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/z$b", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<R> implements g<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f128533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.q f128534c;

        public b(g gVar, g gVar2, er.q qVar) {
            this.f128532a = gVar;
            this.f128533b = gVar2;
            this.f128534c = qVar;
        }

        @Override // mu.g
        public Object a(h<? super R> hVar, tq.e<? super oq.i0> eVar) {
            Object objA = p086nu.m.a(hVar, new g[]{this.f128532a, this.f128533b}, z.e(), new c(this.f128534c, null), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lmu/h;", "", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
    static final class c<R> extends vq.k implements er.q<h<? super R>, Object[], tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f128536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<T1, T2, tq.e<? super R>, Object> f128538h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.q<? super T1, ? super T2, ? super tq.e<? super R>, ? extends Object> qVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f128538h = qVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to mu.z$c<R> for r6v1 'this'  java.lang.Object
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
                int r1 = r6.f128535e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f128536f
                mu.h r1 = (mu.h) r1
                oq.u.b(r7)
                goto L40
            L22:
                oq.u.b(r7)
                java.lang.Object r7 = r6.f128536f
                r1 = r7
                mu.h r1 = (mu.h) r1
                java.lang.Object r7 = r6.f128537g
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                er.q<T1, T2, tq.e<? super R>, java.lang.Object> r4 = r6.f128538h
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f128536f = r1
                r6.f128535e = r3
                java.lang.Object r7 = r4.w(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f128536f = r3
                r6.f128535e = r2
                java.lang.Object r7 = r1.F(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.z.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h<? super R> hVar, Object[] objArr, tq.e<? super oq.i0> eVar) {
            c cVar = new c(this.f128538h, eVar);
            cVar.f128536f = hVar;
            cVar.f128537g = objArr;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements er.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f128539a = new d();

        d() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void a() {
            return null;
        }
    }

    public static final <T1, T2, R> g<R> b(g<? extends T1> gVar, g<? extends T2> gVar2, er.q<? super T1, ? super T2, ? super tq.e<? super R>, ? extends Object> qVar) {
        return i.J(gVar, gVar2, qVar);
    }

    public static final <T1, T2, T3, R> g<R> c(g<? extends T1> gVar, g<? extends T2> gVar2, g<? extends T3> gVar3, er.r<? super T1, ? super T2, ? super T3, ? super tq.e<? super R>, ? extends Object> rVar) {
        return new a(new g[]{gVar, gVar2, gVar3}, rVar);
    }

    public static final <T1, T2, R> g<R> d(g<? extends T1> gVar, g<? extends T2> gVar2, er.q<? super T1, ? super T2, ? super tq.e<? super R>, ? extends Object> qVar) {
        return new b(gVar, gVar2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> er.a<T[]> e() {
        return d.f128539a;
    }
}
