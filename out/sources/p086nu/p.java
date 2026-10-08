package p086nu;

import er.q;
import ju.p0;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "", "block", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lmu/h;", "Loq/i0;", "Lmu/g;", "b", "(Ler/q;)Lmu/g;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/p$a", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements g<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f138782a;

        public a(q qVar) {
            this.f138782a = qVar;
        }

        @Override // mu.g
        public Object a(h<? super R> hVar, e<? super i0> eVar) {
            Object objA = p.a(new b(this.f138782a, hVar, null), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements er.p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f138783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f138784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p0, h<? super R>, e<? super i0>, Object> f138785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h<R> f138786h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super p0, ? super h<? super R>, ? super e<? super i0>, ? extends Object> qVar, h<? super R> hVar, e<? super b> eVar) {
            super(2, eVar);
            this.f138785g = qVar;
            this.f138786h = hVar;
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
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f138783e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f138784f;
                q<p0, h<? super R>, e<? super i0>, Object> qVar = this.f138785g;
                Object obj2 = this.f138786h;
                this.f138783e = 1;
                if (qVar.w(p0Var, obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            b bVar = new b(this.f138785g, this.f138786h, eVar);
            bVar.f138784f = obj;
            return bVar;
        }
    }

    public static final <R> Object a(er.p<? super p0, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        o oVar = new o(eVar.getContext(), eVar);
        Object objD = pu.b.d(oVar, oVar, pVar);
        if (objD == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objD;
    }

    public static final <R> g<R> b(q<? super p0, ? super h<? super R>, ? super e<? super i0>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
