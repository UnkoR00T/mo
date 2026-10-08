package d60;

import er.p;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.b4;
import p076m2.c6;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "FIELD_INDEX", "Ld60/g;", "data", "Ld60/f;", "d", "(Ld60/g;Lm2/r;I)Ld60/f;", "Lm2/b4;", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalScrollController", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<f<?>> f40061a = d0.j(new er.a() { // from class: d60.h
        @Override // er.a
        public final Object a() {
            return i.b();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f40063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j<FIELD_INDEX> f40064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f<FIELD_INDEX> f40065h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a3<Boolean> a3Var, j<FIELD_INDEX> jVar, f<FIELD_INDEX> fVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f40063f = a3Var;
            this.f40064g = jVar;
            this.f40065h = fVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to d60.i$a for r3v1 'this'  tq.e
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
                int r1 = r3.f40062e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r4)
                goto L48
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                oq.u.b(r4)
                m2.a3<java.lang.Boolean> r4 = r3.f40063f
                java.lang.Object r4 = r4.getValue()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L35
                m2.a3<java.lang.Boolean> r4 = r3.f40063f
                r0 = 0
                java.lang.Boolean r0 = vq.b.a(r0)
                r4.setValue(r0)
                oq.i0 r4 = oq.i0.f148189a
                return r4
            L35:
                d60.j<FIELD_INDEX> r4 = r3.f40064g
                if (r4 == 0) goto L48
                d60.f<FIELD_INDEX> r1 = r3.f40065h
                java.lang.Object r4 = r4.a()
                r3.f40062e = r2
                java.lang.Object r4 = r1.c(r4, r3)
                if (r4 != r0) goto L48
                return r0
            L48:
                oq.i0 r4 = oq.i0.f148189a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d60.i.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f40063f, this.f40064g, this.f40065h, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b() {
        return null;
    }

    public static final b4<f<?>> c() {
        return f40061a;
    }

    public static final <FIELD_INDEX> f<FIELD_INDEX> d(ScrollControllerData<FIELD_INDEX> scrollControllerData, r rVar, int i15) {
        if (t.k()) {
            t.o(453241689, i15, -1, "pl.gov.coi.common.ui.focus.rememberScrollController (ScrollController.kt:35)");
        }
        if (scrollControllerData == null) {
            scrollControllerData = new ScrollControllerData<>(null, false, false, 6, null);
        }
        j<FIELD_INDEX> jVarC = scrollControllerData.c();
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = new f(scrollControllerData);
            rVar.v(objE);
        }
        f<FIELD_INDEX> fVar = (f) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = c6.e(Boolean.valueOf(scrollControllerData.getPreventsImmediateScroll()), null, 2, null);
            rVar.v(objE2);
        }
        a3 a3Var = (a3) objE2;
        boolean zW = rVar.W(jVarC) | rVar.G(fVar);
        Object objE3 = rVar.E();
        if (zW || objE3 == companion.a()) {
            objE3 = new a(a3Var, jVarC, fVar, null);
            rVar.v(objE3);
        }
        Function0.d(jVarC, (p) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return fVar;
    }
}
