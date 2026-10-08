package lu;

import ju.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "Llu/z;", "element", "Llu/k;", "Loq/i0;", "a", "(Llu/z;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Llu/k;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Llu/k;"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super k<? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f120470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f120471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z<E> f120472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ E f120473h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z<? super E> zVar, E e15, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f120472g = zVar;
            this.f120473h = e15;
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
            Object objB;
            Object objE = uq.b.e();
            int i15 = this.f120470e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    z<E> zVar = this.f120472g;
                    E e15 = this.f120473h;
                    oq.t.Companion companion = oq.t.INSTANCE;
                    this.f120470e = 1;
                    if (zVar.l(e15, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                objB = oq.t.b(i0.f148189a);
            } catch (Throwable th4) {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th4));
            }
            return k.b(oq.t.g(objB) ? k.INSTANCE.c(i0.f148189a) : k.INSTANCE.a(oq.t.d(objB)));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super k<i0>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f120472g, this.f120473h, eVar);
            aVar.f120471f = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(z<? super E> zVar, E e15) {
        Object objD = zVar.d(e15);
        if (objD instanceof k.c) {
            return ((k) ju.j.b(null, new a(zVar, e15, null), 1, null)).getHolder();
        }
        return k.INSTANCE.c(i0.f148189a);
    }
}
