package pp2;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lpp2/n;", "Ll00/g;", "Lpp2/b;", "Lpp2/a;", "Lpp2/c;", "", "Lyy/a;", "stateMachineFactory", "Lqp2/b;", "mapper", "Lib4/c;", "genericErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lml0/j;", "getChildrenUseCase", "Lhb4/d;", "errorVMSFactory", "Lrp2/a;", "dataContract", "<init>", "(Lyy/a;Lqp2/b;Lib4/c;Lac4/a;Lml0/j;Lhb4/d;Lrp2/a;)V", "state", "Lpp2/c$a;", "u9", "(Lpp2/b;)Lpp2/c$a;", "b", "Lqp2/b;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lml0/j;", "f", "Lhb4/d;", "g", "Lrp2/a;", "Lpp2/b$b;", "h", "Lpp2/b$b;", "initialState", "Lxw/b;", "Lpp2/a$a;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<pp2.b, pp2.a> implements pp2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qp2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml0.j getChildrenUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final rp2.a dataContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pp2.b.C3984b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pp2.a.InterfaceC3982a> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<pp2.b, pp2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<pp2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<pp2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f161635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f161636b;

        /* JADX INFO: renamed from: pp2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3987a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f161637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f161638b;

            /* JADX INFO: renamed from: pp2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3988a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f161639d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f161640e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f161641f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f161643h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f161644j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f161645k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f161646l;

                public C3988a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f161639d = obj;
                    this.f161640e |= PKIFailureInfo.systemUnavail;
                    return C3987a.this.F(null, this);
                }
            }

            public C3987a(mu.h hVar, n nVar) {
                this.f161637a = hVar;
                this.f161638b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3988a c3988a;
                if (eVar instanceof C3988a) {
                    c3988a = (C3988a) eVar;
                    int i15 = c3988a.f161640e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3988a.f161640e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3988a = new C3988a(eVar);
                    }
                } else {
                    c3988a = new C3988a(eVar);
                }
                Object obj2 = c3988a.f161639d;
                Object objE = uq.b.e();
                int i16 = c3988a.f161640e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f161637a;
                    pp2.c.a aVarU9 = this.f161638b.u9((pp2.b) obj);
                    c3988a.f161641f = vq.j.a(obj);
                    c3988a.f161643h = vq.j.a(c3988a);
                    c3988a.f161644j = vq.j.a(obj);
                    c3988a.f161645k = vq.j.a(hVar);
                    c3988a.f161646l = 0;
                    c3988a.f161640e = 1;
                    if (hVar.F(aVarU9, c3988a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, n nVar) {
            this.f161635a = gVar;
            this.f161636b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super pp2.c.a> hVar, tq.e eVar) {
            Object objA = this.f161635a.a(new C3987a(hVar, this.f161636b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpp2/a$a;", "action", "Lpp2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpp2/a$a;Lpp2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<pp2.a.InterfaceC3982a, pp2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161648f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pp2.a.InterfaceC3982a interfaceC3982a = (pp2.a.InterfaceC3982a) this.f161648f;
            Object objE = uq.b.e();
            int i15 = this.f161647e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<pp2.a.InterfaceC3982a> bVarY1 = n.this.Y1();
                this.f161648f = vq.j.a(interfaceC3982a);
                this.f161647e = 1;
                if (bVarY1.F(interfaceC3982a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pp2.a.InterfaceC3982a interfaceC3982a, pp2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = n.this.new b(eVar);
            bVar2.f161648f = interfaceC3982a;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lpp2/b$b;", "state", "Lk10/l;", "Lpp2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<pp2.b.C3984b>, tq.e<? super k10.l<? extends pp2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161651f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lpp2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends pp2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f161653e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f161654f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<pp2.b.C3984b> f161655g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<pp2.b.C3984b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f161654f = nVar;
                this.f161655g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final pp2.b.Error Y(final n nVar, dx.b bVar, pp2.b.C3984b c3984b) {
                return new pp2.b.Error(nVar.errorVMSFactory.a(nVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: pp2.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.c.a.Z(nVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(n nVar, ib4.c.b bVar) {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                        nVar.d9(pp2.a.b.f161602a);
                    } else {
                        if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                            throw new oq.p();
                        }
                        nVar.d9(pp2.a.InterfaceC3982a.C3983a.f161597a);
                    }
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final pp2.b.Initialized a0(List list, pp2.b.C3984b c3984b) {
                return new pp2.b.Initialized(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f161653e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.j jVar = this.f161654f.getChildrenUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f161653e = 1;
                    obj = jVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<pp2.b.C3984b> c0Var = this.f161655g;
                final n nVar = this.f161654f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: pp2.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.Y(nVar, bVar, (b.C3984b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                if (!list.isEmpty()) {
                    return c0Var.d(new er.l() { // from class: pp2.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.a0(list, (b.C3984b) obj2);
                        }
                    });
                }
                nVar.d9(pp2.a.InterfaceC3982a.e.f161601a);
                return c0Var.c();
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f161654f, this.f161655g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends pp2.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f161651f;
            Object objE = uq.b.e();
            int i15 = this.f161650e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = n.this.callActionWithLoaderUseCase;
            a aVar2 = new a(n.this, c0Var, null);
            this.f161651f = vq.j.a(c0Var);
            this.f161650e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<pp2.b.C3984b> c0Var, tq.e<? super k10.l<? extends pp2.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f161651f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpp2/a$c;", "action", "Lpp2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpp2/a$c;Lpp2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<pp2.a.ToChildData, pp2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161657f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pp2.a.ToChildData toChildData = (pp2.a.ToChildData) this.f161657f;
            Object objE = uq.b.e();
            int i15 = this.f161656e;
            if (i15 == 0) {
                oq.u.b(obj);
                n.this.dataContract.a0(toChildData.getChildId());
                n nVar = n.this;
                pp2.a.InterfaceC3982a.c cVar = pp2.a.InterfaceC3982a.c.f161599a;
                this.f161657f = vq.j.a(toChildData);
                this.f161656e = 1;
                if (nVar.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pp2.a.ToChildData toChildData, pp2.b.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f161657f = toChildData;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpp2/a$d;", "<unused var>", "Lpp2/b$c;", "Loq/i0;", "<anonymous>", "(Lpp2/a$d;Lpp2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<pp2.a.d, pp2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161659e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161659e;
            if (i15 == 0) {
                oq.u.b(obj);
                n.this.dataContract.a0(null);
                n nVar = n.this;
                pp2.a.InterfaceC3982a.d dVar = pp2.a.InterfaceC3982a.d.f161600a;
                this.f161659e = 1;
                if (nVar.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pp2.a.d dVar, pp2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpp2/a$b;", "<unused var>", "Lk10/c0;", "Lpp2/b$a;", "state", "Lk10/l;", "Lpp2/b;", "<anonymous>", "(Lpp2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<pp2.a.b, c0<pp2.b.Error>, tq.e<? super k10.l<? extends pp2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161662f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pp2.b.C3984b O(pp2.b.Error error) {
            return pp2.b.C3984b.f161606a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f161662f;
            uq.b.e();
            if (this.f161661e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: pp2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(pp2.a.b bVar, c0<pp2.b.Error> c0Var, tq.e<? super k10.l<? extends pp2.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f161662f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, qp2.b bVar, ib4.c cVar, ac4.a aVar2, ml0.j jVar, hb4.d dVar, rp2.a aVar3) {
        this.mapper = bVar;
        this.genericErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getChildrenUseCase = jVar;
        this.errorVMSFactory = dVar;
        this.dataContract = aVar3;
        pp2.b.C3984b c3984b = pp2.b.C3984b.f161606a;
        this.initialState = c3984b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c3984b, new er.l() { // from class: pp2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f161624a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), u9(c3984b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(pp2.a.ToChildData.class), oVar, dVar);
        zVar.x(q0.c(pp2.a.d.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(pp2.a.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pp2.c.a u9(pp2.b state) {
        return this.mapper.b(new qp2.b.Params(state, new er.l() { // from class: pp2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f161623a, (String) obj);
            }
        }, b9(pp2.a.d.f161604a), b9(pp2.a.InterfaceC3982a.C3983a.f161597a), b9(pp2.a.InterfaceC3982a.b.f161598a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, String str) {
        nVar.d9(new pp2.a.ToChildData(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final n nVar, v vVar) {
        vVar.c(q0.c(pp2.b.class), new er.l() { // from class: pp2.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f161620a, (z) obj);
            }
        });
        vVar.c(q0.c(pp2.b.C3984b.class), new er.l() { // from class: pp2.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f161621a, (z) obj);
            }
        });
        vVar.c(q0.c(pp2.b.Initialized.class), new er.l() { // from class: pp2.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f161622a, (z) obj);
            }
        });
        vVar.c(q0.c(pp2.b.Error.class), new er.l() { // from class: pp2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(pp2.a.InterfaceC3982a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pp2.a.InterfaceC3982a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<pp2.b, pp2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<pp2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(pp2.a.InterfaceC3982a interfaceC3982a, tq.e<? super i0> eVar) {
        return super.F(interfaceC3982a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(rp2.a aVar) {
        super.P5(aVar);
    }
}
