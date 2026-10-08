package ee3;

import dx.i;
import mu.g;
import mu.h;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.c0;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lee3/b;", "Lee3/a;", "Lwd3/c;", "manager", "<init>", "(Lwd3/c;)V", "Lee3/a$a;", "params", "Lmu/g;", "Ldx/i;", "Ldx/b;", "Lee3/a$b;", "b", "(Lee3/a$a;)Lmu/g;", "a", "Lwd3/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ee3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wd3.c manager;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements g<i<? extends dx.b, ? extends ee3.a.Result>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f49673a;

        /* JADX INFO: renamed from: ee3.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1180a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f49674a;

            /* JADX INFO: renamed from: ee3.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1181a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49675d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49676e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49677f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49679h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49680j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49681k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49682l;

                public C1181a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49675d = obj;
                    this.f49676e |= PKIFailureInfo.systemUnavail;
                    return C1180a.this.F(null, this);
                }
            }

            public C1180a(h hVar) {
                this.f49674a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
            public final Object F(Object obj, e eVar) throws Throwable {
                C1181a c1181a;
                if (eVar instanceof C1181a) {
                    c1181a = (C1181a) eVar;
                    int i15 = c1181a.f49676e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1181a.f49676e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1181a = new C1181a(eVar);
                    }
                } else {
                    c1181a = new C1181a(eVar);
                }
                Object obj2 = c1181a.f49675d;
                Object objE = uq.b.e();
                int i16 = c1181a.f49676e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f49674a;
                    Object right = (i) obj;
                    if (!(right instanceof i.Left)) {
                        if (!(right instanceof i.Right)) {
                            throw new p();
                        }
                        right = new i.Right(new ee3.a.Result((c0) ((i.Right) right).b()));
                    }
                    c1181a.f49677f = j.a(obj);
                    c1181a.f49679h = j.a(c1181a);
                    c1181a.f49680j = j.a(obj);
                    c1181a.f49681k = j.a(hVar);
                    c1181a.f49682l = 0;
                    c1181a.f49676e = 1;
                    if (hVar.F(right, c1181a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(g gVar) {
            this.f49673a = gVar;
        }

        @Override // mu.g
        public Object a(h<? super i<? extends dx.b, ? extends ee3.a.Result>> hVar, e eVar) {
            Object objA = this.f49673a.a(new C1180a(hVar), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public b(wd3.c cVar) {
        this.manager = cVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<i<dx.b, ee3.a.Result>> a(ee3.a.Params params) {
        return new a(this.manager.b(params.getProcessId()));
    }
}
