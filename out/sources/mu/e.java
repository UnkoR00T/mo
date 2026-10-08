package mu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmu/e;", "T", "Lmu/g;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lmu/g;Ler/l;Ler/p;)V", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "b", "Ler/l;", "c", "Ler/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e<T> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g<T> upstream;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final er.l<T, Object> keySelector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final er.p<Object, Object, Boolean> areEquivalent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f128178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<Object> f128179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<T> f128180c;

        /* JADX INFO: renamed from: mu.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C3166a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128181d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<T> f128182e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f128183f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C3166a(a<? super T> aVar, tq.e<? super C3166a> eVar) {
                super(eVar);
                this.f128182e = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128181d = obj;
                this.f128183f |= PKIFailureInfo.systemUnavail;
                return this.f128182e.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(e<T> eVar, fr.p0<Object> p0Var, h<? super T> hVar) {
            this.f128178a = eVar;
            this.f128179b = p0Var;
            this.f128180c = hVar;
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
            C3166a c3166a;
            if (eVar instanceof C3166a) {
                c3166a = (C3166a) eVar;
                int i15 = c3166a.f128183f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3166a.f128183f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3166a = new C3166a(this, eVar);
                }
            } else {
                c3166a = new C3166a(this, eVar);
            }
            Object obj = c3166a.f128181d;
            Object objE = uq.b.e();
            int i16 = c3166a.f128183f;
            if (i16 == 0) {
                oq.u.b(obj);
                T t16 = (T) this.f128178a.keySelector.b(t15);
                Object obj2 = this.f128179b.f66410a;
                if (obj2 != p086nu.u.f138790a && this.f128178a.areEquivalent.B(obj2, t16).booleanValue()) {
                    return oq.i0.f148189a;
                }
                this.f128179b.f66410a = t16;
                h<T> hVar = this.f128180c;
                c3166a.f128183f = 1;
                if (hVar.F(t15, c3166a) == objE) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public e(g<? extends T> gVar, er.l<? super T, ? extends Object> lVar, er.p<Object, Object, Boolean> pVar) {
        this.upstream = gVar;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    @Override // mu.g
    public Object a(h<? super T> hVar, tq.e<? super oq.i0> eVar) {
        fr.p0 p0Var = new fr.p0();
        p0Var.f66410a = (T) p086nu.u.f138790a;
        Object objA = this.upstream.a(new a(this, p0Var, hVar), eVar);
        return objA == uq.b.e() ? objA : oq.i0.f148189a;
    }
}
