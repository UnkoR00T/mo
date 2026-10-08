package kp2;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lkp2/n;", "Ll00/g;", "Lkp2/d;", "Lkp2/c;", "Lkp2/e;", "", "Lyy/a;", "stateMachineFactory", "Llp2/a;", "mapper", "Lib4/c;", "genericErrorMapper", "Ljj0/b;", "hasTrustedProfileUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Ll44/e;", "getUserEdorAddressUC", "<init>", "(Lyy/a;Llp2/a;Lib4/c;Ljj0/b;Lac4/a;Lhb4/d;Ll44/e;)V", "state", "Lkp2/e$a;", "r9", "(Lkp2/d;)Lkp2/e$a;", "b", "Llp2/a;", "c", "Lib4/c;", "d", "Ljj0/b;", "e", "Lac4/a;", "f", "Lhb4/d;", "g", "Ll44/e;", "Lkp2/d$b;", "h", "Lkp2/d$b;", "initialState", "Lxw/b;", "Lkp2/c$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<kp2.d, kp2.c> implements kp2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lp2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kp2.d.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kp2.c.InterfaceC2709c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kp2.d, kp2.c> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<kp2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<kp2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f112211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f112212b;

        /* JADX INFO: renamed from: kp2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2712a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f112213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f112214b;

            /* JADX INFO: renamed from: kp2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2713a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f112215d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f112216e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f112217f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f112219h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f112220j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f112221k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f112222l;

                public C2713a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f112215d = obj;
                    this.f112216e |= PKIFailureInfo.systemUnavail;
                    return C2712a.this.F(null, this);
                }
            }

            public C2712a(mu.h hVar, n nVar) {
                this.f112213a = hVar;
                this.f112214b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2713a c2713a;
                if (eVar instanceof C2713a) {
                    c2713a = (C2713a) eVar;
                    int i15 = c2713a.f112216e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2713a.f112216e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2713a = new C2713a(eVar);
                    }
                } else {
                    c2713a = new C2713a(eVar);
                }
                Object obj2 = c2713a.f112215d;
                Object objE = uq.b.e();
                int i16 = c2713a.f112216e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f112213a;
                    kp2.e.a aVarR9 = this.f112214b.r9((kp2.d) obj);
                    c2713a.f112217f = vq.j.a(obj);
                    c2713a.f112219h = vq.j.a(c2713a);
                    c2713a.f112220j = vq.j.a(obj);
                    c2713a.f112221k = vq.j.a(hVar);
                    c2713a.f112222l = 0;
                    c2713a.f112216e = 1;
                    if (hVar.F(aVarR9, c2713a) == objE) {
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
            this.f112211a = gVar;
            this.f112212b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kp2.e.a> hVar, tq.e eVar) {
            Object objA = this.f112211a.a(new C2712a(hVar, this.f112212b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkp2/c$a;", "<unused var>", "Lkp2/d;", "Loq/i0;", "<anonymous>", "(Lkp2/c$a;Lkp2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<kp2.c.a, kp2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112223e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112223e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kp2.c.InterfaceC2709c> bVarY1 = n.this.Y1();
                kp2.c.InterfaceC2709c.a aVar = kp2.c.InterfaceC2709c.a.f112178a;
                this.f112223e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(kp2.c.a aVar, kp2.d dVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkp2/d$b;", "state", "Lk10/l;", "Lkp2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<kp2.d.b>, tq.e<? super k10.l<? extends kp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112226f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkp2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends kp2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f112228e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f112229f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<kp2.d.b> f112230g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<kp2.d.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f112229f = nVar;
                this.f112230g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kp2.d.Error Y(final n nVar, dx.b bVar, kp2.d.b bVar2) {
                return new kp2.d.Error(nVar.errorVMSFactory.a(nVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: kp2.q
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
                        nVar.d9(kp2.c.d.f112181a);
                    } else {
                        if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                            throw new oq.p();
                        }
                        nVar.d9(kp2.c.a.f112176a);
                    }
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kp2.d.c a0(kp2.d.b bVar) {
                return kp2.d.c.f112186a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f112228e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jj0.b bVar = this.f112229f.hasTrustedProfileUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f112228e = 1;
                    obj = bVar.c(c1792a, this);
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
                c0<kp2.d.b> c0Var = this.f112230g;
                final n nVar = this.f112229f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: kp2.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.Y(nVar, bVar2, (d.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                if (!((Boolean) ((dx.i.Right) iVar).b()).booleanValue()) {
                    return c0Var.d(new er.l() { // from class: kp2.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.a0((d.b) obj2);
                        }
                    });
                }
                nVar.d9(kp2.c.b.f112177a);
                return c0Var.c();
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f112229f, this.f112230g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends kp2.d>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f112226f;
            Object objE = uq.b.e();
            int i15 = this.f112225e;
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
            this.f112226f = vq.j.a(c0Var);
            this.f112225e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<kp2.d.b> c0Var, tq.e<? super k10.l<? extends kp2.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f112226f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkp2/c$b;", "<unused var>", "Lkp2/d$b;", "Loq/i0;", "<anonymous>", "(Lkp2/c$b;Lkp2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<kp2.c.b, kp2.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112231e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f112233e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f112234f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f112234f = nVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f112233e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                if (this.f112234f.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a) != null) {
                    this.f112234f.d9(kp2.c.f.f112183a);
                } else {
                    this.f112234f.d9(kp2.c.e.f112182a);
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f112234f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112231e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = n.this.callActionWithLoaderUseCase;
                a aVar2 = new a(n.this, null);
                this.f112231e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(kp2.c.b bVar, kp2.d.b bVar2, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkp2/c$e;", "<unused var>", "Lkp2/d$b;", "Loq/i0;", "<anonymous>", "(Lkp2/c$e;Lkp2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kp2.c.e, kp2.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112235e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(n nVar, b0 b0Var) {
            nVar.d9(kp2.c.f.f112183a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112235e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kp2.c.InterfaceC2709c> bVarY1 = n.this.Y1();
                final n nVar = n.this;
                kp2.c.InterfaceC2709c.ToEdorAuth toEdorAuth = new kp2.c.InterfaceC2709c.ToEdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: kp2.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.e.O(nVar, (b0) obj2);
                    }
                }, null, 2, null));
                this.f112235e = 1;
                if (bVarY1.F(toEdorAuth, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kp2.c.e eVar, kp2.d.b bVar, tq.e<? super i0> eVar2) {
            return n.this.new e(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkp2/c$f;", "<unused var>", "Lkp2/d$b;", "Loq/i0;", "<anonymous>", "(Lkp2/c$f;Lkp2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kp2.c.f, kp2.d.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112237e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112237e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kp2.c.InterfaceC2709c> bVarY1 = n.this.Y1();
                kp2.c.InterfaceC2709c.d dVar = kp2.c.InterfaceC2709c.d.f112180a;
                this.f112237e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(kp2.c.f fVar, kp2.d.b bVar, tq.e<? super i0> eVar) {
            return n.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkp2/c$d;", "<unused var>", "Lk10/c0;", "Lkp2/d$a;", "state", "Lk10/l;", "Lkp2/d;", "<anonymous>", "(Lkp2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kp2.c.d, c0<kp2.d.Error>, tq.e<? super k10.l<? extends kp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112240f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kp2.d.b O(kp2.d.Error error) {
            return kp2.d.b.f112185a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f112240f;
            uq.b.e();
            if (this.f112239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: kp2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.g.O((d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kp2.c.d dVar, c0<kp2.d.Error> c0Var, tq.e<? super k10.l<? extends kp2.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f112240f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, lp2.a aVar2, ib4.c cVar, jj0.b bVar, ac4.a aVar3, hb4.d dVar, l44.e eVar) {
        this.mapper = aVar2;
        this.genericErrorMapper = cVar;
        this.hasTrustedProfileUseCase = bVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorVMSFactory = dVar;
        this.getUserEdorAddressUC = eVar;
        kp2.d.b bVar2 = kp2.d.b.f112185a;
        this.initialState = bVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: kp2.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(this.f112198a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kp2.e.a r9(kp2.d state) {
        return this.mapper.b(new lp2.a.Params(state, b9(kp2.c.a.f112176a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final n nVar, k10.v vVar) {
        vVar.c(q0.c(kp2.d.class), new er.l() { // from class: kp2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f112199a, (z) obj);
            }
        });
        vVar.c(q0.c(kp2.d.b.class), new er.l() { // from class: kp2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f112200a, (z) obj);
            }
        });
        vVar.c(q0.c(kp2.d.Error.class), new er.l() { // from class: kp2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(kp2.c.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(kp2.c.b.class), oVar, dVar);
        zVar.x(q0.c(kp2.c.e.class), oVar, nVar.new e(null));
        zVar.x(q0.c(kp2.c.f.class), oVar, nVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(kp2.c.d.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kp2.c.InterfaceC2709c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<kp2.d, kp2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kp2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
