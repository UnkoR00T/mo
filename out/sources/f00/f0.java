package f00;

import ju.p0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"EVENT", "Lmu/g;", "navEvent", "Lkotlin/Function1;", "Loq/i0;", "navEventHandler", "b", "(Lmu/g;Ler/l;Lm2/r;I)V", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f54513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ mu.g<EVENT> f54514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<EVENT, oq.i0> f54515h;

        /* JADX INFO: renamed from: f00.f0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C1286a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f54516e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ mu.g<EVENT> f54517f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l<EVENT, oq.i0> f54518g;

            /* JADX INFO: renamed from: f00.f0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C1287a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ er.l<EVENT, oq.i0> f54519a;

                /* JADX WARN: Multi-variable type inference failed */
                C1287a(er.l<? super EVENT, oq.i0> lVar) {
                    this.f54519a = lVar;
                }

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
                public final Object F(EVENT event, tq.e<? super oq.i0> eVar) {
                    this.f54519a.b(event);
                    return oq.i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1286a(mu.g<? extends EVENT> gVar, er.l<? super EVENT, oq.i0> lVar, tq.e<? super C1286a> eVar) {
                super(2, eVar);
                this.f54517f = gVar;
                this.f54518g = lVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to f00.f0$a$a for r4v1 'this'  tq.e
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r4.f54516e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r5)
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    oq.u.b(r5)
                    mu.g<EVENT> r5 = r4.f54517f
                    f00.f0$a$a$a r1 = new f00.f0$a$a$a
                    er.l<EVENT, oq.i0> r3 = r4.f54518g
                    r1.<init>(r3)
                    r4.f54516e = r2
                    java.lang.Object r5 = r5.a(r1, r4)
                    if (r5 != r0) goto L2c
                    return r0
                L2c:
                    oq.i0 r5 = oq.i0.f148189a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: f00.f0.a.C1286a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C1286a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C1286a(this.f54517f, this.f54518g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.p016lifecycle.q qVar, mu.g<? extends EVENT> gVar, er.l<? super EVENT, oq.i0> lVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f54513f = qVar;
            this.f54514g = gVar;
            this.f54515h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54512e;
            if (i15 == 0) {
                oq.u.b(obj);
                androidx.p016lifecycle.q qVar = this.f54513f;
                androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.STARTED;
                C1286a c1286a = new C1286a(this.f54514g, this.f54515h, null);
                this.f54512e = 1;
                if (androidx.p016lifecycle.g0.b(qVar, bVar, c1286a, this) == objE) {
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
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f54513f, this.f54514g, this.f54515h, eVar);
        }
    }

    public static final <EVENT> void b(final mu.g<? extends EVENT> gVar, final er.l<? super EVENT, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-381112884);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-381112884, i16, -1, "pl.gov.coi.common.navigation.NavEvent (Navigation.kt:13)");
            }
            androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVarH.N(m7.n.c());
            boolean zG = rVarH.G(qVar) | rVarH.G(gVar) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(qVar, gVar, lVar, null);
                rVarH.v(objE);
            }
            Function0.d(gVar, (er.p) objE, rVarH, i16 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f00.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f0.c(gVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(mu.g gVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        b(gVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
