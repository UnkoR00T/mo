package p012a2;

import er.p;
import er.q;
import er.r;
import f3.m;
import fr.m0;
import ju.d2;
import ju.p0;
import ju.q0;
import ju.r0;
import mu.g;
import mu.h;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x5;
import p143z0.Function1;
import p143z0.a2;
import pq.v0;
import tq.e;
import u0.e2;
import u0.l;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0081@¢\u0006\u0004\b\u0019\u0010\u001a\u001aH\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001eH\u0082@¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b$\u0010%\u001a[\u0010*\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2*\u0010)\u001a&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000(0\u001eH\u0001¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "T", "Lkotlin/Function1;", "La2/s1;", "Loq/i0;", "builder", "La2/r1;", "a", "(Ler/l;)La2/r1;", "Lf3/m;", "La2/i;", "state", "Lz0/a2;", "orientation", "", "enabled", "reverseDirection", "Lb1/l;", "interactionSource", "startDragImmediately", "d", "(Lf3/m;La2/i;Lz0/a2;ZZLb1/l;Z)Lf3/m;", "targetValue", "", "velocity", "f", "(La2/i;Ljava/lang/Object;FLtq/e;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Ltq/e;", "block", "j", "(Ler/a;Ler/p;Ltq/e;)Ljava/lang/Object;", "La2/l2;", "i", "()La2/l2;", "Lc5/r;", "Lc5/b;", "Loq/r;", "anchors", "h", "(Lf3/m;La2/i;Lz0/a2;Ler/p;)Lf3/m;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "velocity", "Loq/i0;", "<anonymous>", "(Lju/p0;F)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements q<p0, Float, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1448e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f1449f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ float f1450g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i<T> f1451h;

        /* JADX INFO: renamed from: a2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class C0020a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1452e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i<T> f1453f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f1454g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0020a(i<T> iVar, float f15, e<? super C0020a> eVar) {
                super(2, eVar);
                this.f1453f = iVar;
                this.f1454g = f15;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
                int i15 = this.f1452e;
                if (i15 == 0) {
                    u.b(obj);
                    i<T> iVar = this.f1453f;
                    float f15 = this.f1454g;
                    this.f1452e = 1;
                    if (iVar.I(f15, this) == objE) {
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
                return ((C0020a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C0020a(this.f1453f, this.f1454g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<T> iVar, e<? super a> eVar) {
            super(3, eVar);
            this.f1451h = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f1448e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            ju.k.d((p0) this.f1449f, null, null, new C0020a(this.f1451h, this.f1450g, null), 3, null);
            return i0.f148189a;
        }

        public final Object M(p0 p0Var, float f15, e<? super i0> eVar) {
            a aVar = new a(this.f1451h, eVar);
            aVar.f1449f = p0Var;
            aVar.f1450g = f15;
            return aVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(p0 p0Var, Float f15, e<? super i0> eVar) {
            return M(p0Var, f15.floatValue(), eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "La2/b;", "La2/r1;", "anchors", "latestTarget", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class b<T> extends k implements r<p012a2.b, r1<T>, T, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f1456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f1457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f1458h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i<T> f1459j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f1460k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i<T> iVar, float f15, e<? super b> eVar) {
            super(4, eVar);
            this.f1459j = iVar;
            this.f1460k = f15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p012a2.b bVar, m0 m0Var, float f15, float f16) {
            bVar.a(f15, f16);
            m0Var.f66406a = f15;
            return i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1455e;
            if (i15 == 0) {
                u.b(obj);
                final p012a2.b bVar = (p012a2.b) this.f1456f;
                float fC = ((r1) this.f1457g).c(this.f1458h);
                if (!Float.isNaN(fC)) {
                    final m0 m0Var = new m0();
                    float fX = Float.isNaN(this.f1459j.x()) ? 0.0f : this.f1459j.x();
                    m0Var.f66406a = fX;
                    float f15 = this.f1460k;
                    l<Float> lVarQ = this.f1459j.q();
                    p pVar = new p() { // from class: a2.d
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return c.b.O(bVar, m0Var, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    this.f1456f = null;
                    this.f1457g = null;
                    this.f1455e = 1;
                    if (e2.j(fX, fC, f15, lVarQ, pVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.r
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object g(p012a2.b bVar, r1<T> r1Var, T t15, e<? super i0> eVar) {
            b bVar2 = new b(this.f1459j, this.f1460k, eVar);
            bVar2.f1456f = bVar;
            bVar2.f1457g = r1Var;
            bVar2.f1458h = t15;
            return bVar2.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: a2.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C0021c<I> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1462e;

        C0021c(e<? super C0021c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1461d = obj;
            this.f1462e |= PKIFailureInfo.systemUnavail;
            return c.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f1464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<I> f1465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<I, e<? super i0>, Object> f1466h;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fr.p0<d2> f1467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f1468b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<I, e<? super i0>, Object> f1469c;

            /* JADX INFO: renamed from: a2.c$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
            static final class C0022a extends k implements p<p0, e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f1470e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ p<I, e<? super i0>, Object> f1471f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ I f1472g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ p0 f1473h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0022a(p<? super I, ? super e<? super i0>, ? extends Object> pVar, I i15, p0 p0Var, e<? super C0022a> eVar) {
                    super(2, eVar);
                    this.f1471f = pVar;
                    this.f1472g = i15;
                    this.f1473h = p0Var;
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
                    int i15 = this.f1470e;
                    if (i15 == 0) {
                        u.b(obj);
                        p<I, e<? super i0>, Object> pVar = this.f1471f;
                        I i16 = this.f1472g;
                        this.f1470e = 1;
                        if (pVar.B(i16, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    q0.c(this.f1473h, new p012a2.a());
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, e<? super i0> eVar) {
                    return ((C0022a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final e<i0> v(Object obj, e<?> eVar) {
                    return new C0022a(this.f1471f, this.f1472g, this.f1473h, eVar);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class b extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f1474d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f1475e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f1476f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ a<T> f1477g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f1478h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, e<? super b> eVar) {
                    super(eVar);
                    this.f1477g = aVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f1476f = obj;
                    this.f1478h |= PKIFailureInfo.systemUnavail;
                    return this.f1477g.F(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(fr.p0<d2> p0Var, p0 p0Var2, p<? super I, ? super e<? super i0>, ? extends Object> pVar) {
                this.f1467a = p0Var;
                this.f1468b = p0Var2;
                this.f1469c = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(I i15, e<? super i0> eVar) throws Throwable {
                b bVar;
                Object obj;
                if (eVar instanceof b) {
                    bVar = (b) eVar;
                    int i16 = bVar.f1478h;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        bVar.f1478h = i16 - PKIFailureInfo.systemUnavail;
                    } else {
                        bVar = new b(this, eVar);
                    }
                } else {
                    bVar = new b(this, eVar);
                }
                Object obj2 = bVar.f1476f;
                Object objE = uq.b.e();
                int i17 = bVar.f1478h;
                if (i17 == 0) {
                    u.b(obj2);
                    d2 d2Var = this.f1467a.f66410a;
                    if (d2Var != null) {
                        d2Var.u(new p012a2.a());
                        bVar.f1474d = i15;
                        bVar.f1475e = d2Var;
                        bVar.f1478h = 1;
                        if (d2Var.T0(bVar) == objE) {
                            obj = i15;
                            obj = i15;
                            return objE;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = bVar.f1474d;
                    u.b(obj2);
                    obj = obj3;
                }
                obj = i15;
                obj = i15;
                obj = i15;
                fr.p0<d2> p0Var = this.f1467a;
                p0 p0Var2 = this.f1468b;
                p0Var.f66410a = (T) ju.k.d(p0Var2, null, r0.UNDISPATCHED, new C0022a(this.f1469c, obj, p0Var2, null), 1, null);
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(er.a<? extends I> aVar, p<? super I, ? super e<? super i0>, ? extends Object> pVar, e<? super d> eVar) {
            super(2, eVar);
            this.f1465g = aVar;
            this.f1466h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1463e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = (p0) this.f1464f;
                fr.p0 p0Var2 = new fr.p0();
                g gVarQ = x5.q(this.f1465g);
                a aVar = new a(p0Var2, p0Var, this.f1466h);
                this.f1463e = 1;
                if (gVarQ.a(aVar, this) == objE) {
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
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            d dVar = new d(this.f1465g, this.f1466h, eVar);
            dVar.f1464f = obj;
            return dVar;
        }
    }

    public static final <T> r1<T> a(er.l<? super s1<T>, i0> lVar) {
        s1 s1Var = new s1();
        lVar.b(s1Var);
        return new MapDraggableAnchors(s1Var.b());
    }

    public static final <T> m d(m mVar, i<T> iVar, a2 a2Var, boolean z15, boolean z16, b1.l lVar, boolean z17) {
        return Function1.g(mVar, iVar.getDraggableState(), a2Var, z15, lVar, z17, null, new a(iVar, null), z16, 32, null);
    }

    public static /* synthetic */ m e(m mVar, i iVar, a2 a2Var, boolean z15, boolean z16, b1.l lVar, boolean z17, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        boolean z18 = z15;
        if ((i15 & 8) != 0) {
            z16 = false;
        }
        boolean z19 = z16;
        if ((i15 & 16) != 0) {
            lVar = null;
        }
        b1.l lVar2 = lVar;
        if ((i15 & 32) != 0) {
            z17 = iVar.z();
        }
        return d(mVar, iVar, a2Var, z18, z19, lVar2, z17);
    }

    public static final <T> Object f(i<T> iVar, T t15, float f15, e<? super i0> eVar) {
        Object objK = i.k(iVar, t15, null, new b(iVar, f15, null), eVar, 2, null);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }

    public static /* synthetic */ Object g(i iVar, Object obj, float f15, e eVar, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            f15 = iVar.w();
        }
        return f(iVar, obj, f15, eVar);
    }

    public static final <T> m h(m mVar, i<T> iVar, a2 a2Var, p<? super c5.r, ? super c5.b, ? extends oq.r<? extends r1<T>, ? extends T>> pVar) {
        return mVar.u(new t1(iVar, pVar, a2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> i() {
        return new MapDraggableAnchors<>(v0.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <I> Object j(er.a<? extends I> aVar, p<? super I, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) throws Throwable {
        C0021c c0021c;
        if (eVar instanceof C0021c) {
            c0021c = (C0021c) eVar;
            int i15 = c0021c.f1462e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0021c.f1462e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0021c = new C0021c(eVar);
            }
        } else {
            c0021c = new C0021c(eVar);
        }
        Object obj = c0021c.f1461d;
        Object objE = uq.b.e();
        int i16 = c0021c.f1462e;
        try {
            if (i16 == 0) {
                u.b(obj);
                d dVar = new d(aVar, pVar, null);
                c0021c.f1462e = 1;
                if (q0.e(dVar, c0021c) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
        } catch (p012a2.a unused) {
        }
        return i0.f148189a;
    }
}
