package p076m2;

import er.p;
import java.util.Arrays;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u00062(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "Lm2/z3;", "Ltq/e;", "Loq/i0;", "", "producer", "Lm2/f6;", "a", "(Ljava/lang/Object;Ler/p;Lm2/r;I)Lm2/f6;", "key1", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ler/p;Lm2/r;I)Lm2/f6;", "", "keys", "c", "(Ljava/lang/Object;[Ljava/lang/Object;Ler/p;Lm2/r;I)Lm2/f6;", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class z5 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f123267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<z3<T>, e<? super i0>, Object> f123268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<T> f123269h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, a3<T> a3Var, e<? super a> eVar) {
            super(2, eVar);
            this.f123268g = pVar;
            this.f123269h = a3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to m2.z5$a for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f123266e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f123267f
                ju.p0 r6 = (ju.p0) r6
                er.p<m2.z3<T>, tq.e<? super oq.i0>, java.lang.Object> r1 = r5.f123268g
                m2.a4 r3 = new m2.a4
                m2.a3<T> r4 = r5.f123269h
                tq.i r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f123266e = r2
                java.lang.Object r6 = r1.B(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.z5.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f123268g, this.f123269h, eVar);
            aVar.f123267f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f123271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<z3<T>, e<? super i0>, Object> f123272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<T> f123273h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, a3<T> a3Var, e<? super b> eVar) {
            super(2, eVar);
            this.f123272g = pVar;
            this.f123273h = a3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to m2.z5$b for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f123270e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f123271f
                ju.p0 r6 = (ju.p0) r6
                er.p<m2.z3<T>, tq.e<? super oq.i0>, java.lang.Object> r1 = r5.f123272g
                m2.a4 r3 = new m2.a4
                m2.a3<T> r4 = r5.f123273h
                tq.i r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f123270e = r2
                java.lang.Object r6 = r1.B(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.z5.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f123272g, this.f123273h, eVar);
            bVar.f123271f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f123275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<z3<T>, e<? super i0>, Object> f123276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a3<T> f123277h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, a3<T> a3Var, e<? super c> eVar) {
            super(2, eVar);
            this.f123276g = pVar;
            this.f123277h = a3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to m2.z5$c for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f123274e
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oq.u.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f123275f
                ju.p0 r6 = (ju.p0) r6
                er.p<m2.z3<T>, tq.e<? super oq.i0>, java.lang.Object> r1 = r5.f123276g
                m2.a4 r3 = new m2.a4
                m2.a3<T> r4 = r5.f123277h
                tq.i r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f123274e = r2
                java.lang.Object r6 = r1.B(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.z5.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            c cVar = new c(this.f123276g, this.f123277h, eVar);
            cVar.f123275f = obj;
            return cVar;
        }
    }

    public static final <T> f6<T> a(T t15, p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(10454275, i15, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(t15, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(pVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new a(pVar, a3Var, null);
            rVar.v(objE2);
        }
        Function0.d(i0Var, (p) objE2, rVar, 6);
        if (t.k()) {
            t.n();
        }
        return a3Var;
    }

    public static final <T> f6<T> b(T t15, Object obj, Object obj2, p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1703169085, i15, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(t15, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        boolean zG = rVar.G(pVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new b(pVar, a3Var, null);
            rVar.v(objE2);
        }
        Function0.e(obj, obj2, (p) objE2, rVar, (i15 >> 3) & 126);
        if (t.k()) {
            t.n();
        }
        return a3Var;
    }

    public static final <T> f6<T> c(T t15, Object[] objArr, p<? super z3<T>, ? super e<? super i0>, ? extends Object> pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(490154582, i15, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(t15, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zG = rVar.G(pVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new c(pVar, a3Var, null);
            rVar.v(objE2);
        }
        Function0.f(objArrCopyOf, (p) objE2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return a3Var;
    }
}
