package g00;

import er.p;
import ju.p0;
import mu.b0;
import mu.g;
import mu.h;
import mu.r0;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lmu/g;", "initialState", "Lju/p0;", "scope", "Lmu/p0;", "a", "(Lmu/g;Ljava/lang/Object;Lju/p0;)Lmu/p0;", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g<T> f69175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0<T> f69176g;

        /* JADX INFO: renamed from: g00.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C1550a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0<T> f69177a;

            C1550a(b0<T> b0Var) {
                this.f69177a = b0Var;
            }

            @Override // mu.h
            public final Object F(T t15, e<? super i0> eVar) {
                this.f69177a.setValue(t15);
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g<? extends T> gVar, b0<T> b0Var, e<? super a> eVar) {
            super(2, eVar);
            this.f69175f = gVar;
            this.f69176g = b0Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to g00.b$a for r4v1 'this'  tq.e
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
                int r1 = r4.f69174e
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
                mu.g<T> r5 = r4.f69175f
                g00.b$a$a r1 = new g00.b$a$a
                mu.b0<T> r3 = r4.f69176g
                r1.<init>(r3)
                r4.f69174e = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g00.b.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f69175f, this.f69176g, eVar);
        }
    }

    public static final <T> mu.p0<T> a(g<? extends T> gVar, T t15, p0 p0Var) {
        b0 b0VarA = r0.a(t15);
        ju.k.d(p0Var, null, null, new a(gVar, b0VarA, null), 3, null);
        return b0VarA;
    }
}
