package h71;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lh71/n;", "Ll00/g;", "Lh71/b;", "Lh71/a;", "Lh71/c;", "", "Lyy/a;", "stateMachineFactory", "Li71/b;", "mapper", "Lib4/c;", "genericErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lol0/g;", "getChildrenUseCase", "Lhb4/d;", "errorVMSFactory", "Lj71/a;", "dataContract", "<init>", "(Lyy/a;Li71/b;Lib4/c;Lac4/a;Lol0/g;Lhb4/d;Lj71/a;)V", "state", "Lh71/c$a;", "u9", "(Lh71/b;)Lh71/c$a;", "b", "Li71/b;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lol0/g;", "f", "Lhb4/d;", "g", "Lj71/a;", "Lh71/b$b;", "h", "Lh71/b$b;", "initialState", "Lxw/b;", "Lh71/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<h71.b, h71.a> implements h71.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i71.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ol0.g getChildrenUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j71.a dataContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h71.b.C1880b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h71.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h71.b, h71.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<h71.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h71.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f81379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f81380b;

        /* JADX INFO: renamed from: h71.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1883a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f81381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f81382b;

            /* JADX INFO: renamed from: h71.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1884a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f81383d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f81384e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f81385f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f81387h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f81388j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f81389k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f81390l;

                public C1884a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f81383d = obj;
                    this.f81384e |= PKIFailureInfo.systemUnavail;
                    return C1883a.this.F(null, this);
                }
            }

            public C1883a(mu.h hVar, n nVar) {
                this.f81381a = hVar;
                this.f81382b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1884a c1884a;
                if (eVar instanceof C1884a) {
                    c1884a = (C1884a) eVar;
                    int i15 = c1884a.f81384e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1884a.f81384e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1884a = new C1884a(eVar);
                    }
                } else {
                    c1884a = new C1884a(eVar);
                }
                Object obj2 = c1884a.f81383d;
                Object objE = uq.b.e();
                int i16 = c1884a.f81384e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f81381a;
                    h71.c.a aVarU9 = this.f81382b.u9((h71.b) obj);
                    c1884a.f81385f = vq.j.a(obj);
                    c1884a.f81387h = vq.j.a(c1884a);
                    c1884a.f81388j = vq.j.a(obj);
                    c1884a.f81389k = vq.j.a(hVar);
                    c1884a.f81390l = 0;
                    c1884a.f81384e = 1;
                    if (hVar.F(aVarU9, c1884a) == objE) {
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
            this.f81379a = gVar;
            this.f81380b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h71.c.a> hVar, tq.e eVar) {
            Object objA = this.f81379a.a(new C1883a(hVar, this.f81380b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh71/a$a;", "<unused var>", "Lh71/b;", "Loq/i0;", "<anonymous>", "(Lh71/a$a;Lh71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<h71.a.C1877a, h71.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81391e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81391e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                h71.a.c.C1878a c1878a = h71.a.c.C1878a.f81341a;
                this.f81391e = 1;
                if (nVar.F(c1878a, this) == objE) {
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
        public final Object w(h71.a.C1877a c1877a, h71.b bVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh71/a$b;", "<unused var>", "Lh71/b;", "Loq/i0;", "<anonymous>", "(Lh71/a$b;Lh71/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<h71.a.b, h71.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81393e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81393e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<h71.a.c> bVarY1 = n.this.Y1();
                h71.a.c.b bVar = h71.a.c.b.f81342a;
                this.f81393e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(h71.a.b bVar, h71.b bVar2, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lh71/b$b;", "state", "Lk10/l;", "Lh71/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<h71.b.C1880b>, tq.e<? super k10.l<? extends h71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81396f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh71/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends h71.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f81398e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f81399f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<h71.b.C1880b> f81400g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<h71.b.C1880b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f81399f = nVar;
                this.f81400g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h71.b.Error Y(final n nVar, dx.b bVar, h71.b.C1880b c1880b) {
                return new h71.b.Error(nVar.errorVMSFactory.a(nVar.genericErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: h71.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.d.a.Z(nVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(n nVar, ib4.c.b bVar) {
                if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                        nVar.d9(h71.a.d.f81346a);
                    } else {
                        if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                            throw new oq.p();
                        }
                        nVar.d9(h71.a.C1877a.f81339a);
                    }
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h71.b.Initialized a0(List list, h71.b.C1880b c1880b) {
                return new h71.b.Initialized(list);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f81398e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.g gVar = this.f81399f.getChildrenUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f81398e = 1;
                    obj = gVar.c(c1792a, this);
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
                c0<h71.b.C1880b> c0Var = this.f81400g;
                final n nVar = this.f81399f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: h71.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.d.a.Y(nVar, bVar, (b.C1880b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                if (!list.isEmpty()) {
                    return c0Var.d(new er.l() { // from class: h71.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.d.a.a0(list, (b.C1880b) obj2);
                        }
                    });
                }
                nVar.d9(h71.a.f.f81348a);
                return c0Var.c();
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f81399f, this.f81400g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends h71.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f81396f;
            Object objE = uq.b.e();
            int i15 = this.f81395e;
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
            this.f81396f = vq.j.a(c0Var);
            this.f81395e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<h71.b.C1880b> c0Var, tq.e<? super k10.l<? extends h71.b>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f81396f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh71/a$f;", "<unused var>", "Lh71/b$b;", "Loq/i0;", "<anonymous>", "(Lh71/a$f;Lh71/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<h71.a.f, h71.b.C1880b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81401e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81401e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                h71.a.c.e eVar = h71.a.c.e.f81345a;
                this.f81401e = 1;
                if (nVar.F(eVar, this) == objE) {
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
        public final Object w(h71.a.f fVar, h71.b.C1880b c1880b, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh71/a$e;", "action", "Lh71/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh71/a$e;Lh71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h71.a.ToChildData, h71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81404f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h71.a.ToChildData toChildData = (h71.a.ToChildData) this.f81404f;
            Object objE = uq.b.e();
            int i15 = this.f81403e;
            if (i15 == 0) {
                oq.u.b(obj);
                n.this.dataContract.a0(toChildData.getChildId());
                n nVar = n.this;
                h71.a.c.C1879c c1879c = h71.a.c.C1879c.f81343a;
                this.f81404f = vq.j.a(toChildData);
                this.f81403e = 1;
                if (nVar.F(c1879c, this) == objE) {
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
        public final Object w(h71.a.ToChildData toChildData, h71.b.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f81404f = toChildData;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh71/a$f;", "<unused var>", "Lh71/b$c;", "Loq/i0;", "<anonymous>", "(Lh71/a$f;Lh71/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h71.a.f, h71.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81406e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f81406e;
            if (i15 == 0) {
                oq.u.b(obj);
                n nVar = n.this;
                h71.a.c.d dVar = h71.a.c.d.f81344a;
                this.f81406e = 1;
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
        public final Object w(h71.a.f fVar, h71.b.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh71/a$d;", "<unused var>", "Lk10/c0;", "Lh71/b$a;", "state", "Lk10/l;", "Lh71/b;", "<anonymous>", "(Lh71/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<h71.a.d, c0<h71.b.Error>, tq.e<? super k10.l<? extends h71.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f81408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f81409f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h71.b.C1880b O(h71.b.Error error) {
            return h71.b.C1880b.f81350a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f81409f;
            uq.b.e();
            if (this.f81408e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: h71.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.h.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h71.a.d dVar, c0<h71.b.Error> c0Var, tq.e<? super k10.l<? extends h71.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f81409f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, i71.b bVar, ib4.c cVar, ac4.a aVar2, ol0.g gVar, hb4.d dVar, j71.a aVar3) {
        this.mapper = bVar;
        this.genericErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getChildrenUseCase = gVar;
        this.errorVMSFactory = dVar;
        this.dataContract = aVar3;
        h71.b.C1880b c1880b = h71.b.C1880b.f81350a;
        this.initialState = c1880b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c1880b, new er.l() { // from class: h71.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f81368a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), u9(c1880b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        f fVar = nVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h71.a.ToChildData.class), oVar, fVar);
        zVar.x(q0.c(h71.a.f.class), oVar, nVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(h71.a.d.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h71.c.a u9(h71.b state) {
        return this.mapper.b(new i71.b.Params(state, new er.l() { // from class: h71.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f81364a, (String) obj);
            }
        }, b9(h71.a.f.f81348a), b9(h71.a.C1877a.f81339a), b9(h71.a.b.f81340a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(n nVar, String str) {
        nVar.d9(new h71.a.ToChildData(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final n nVar, v vVar) {
        vVar.c(q0.c(h71.b.class), new er.l() { // from class: h71.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f81365a, (z) obj);
            }
        });
        vVar.c(q0.c(h71.b.C1880b.class), new er.l() { // from class: h71.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f81366a, (z) obj);
            }
        });
        vVar.c(q0.c(h71.b.Initialized.class), new er.l() { // from class: h71.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f81367a, (z) obj);
            }
        });
        vVar.c(q0.c(h71.b.Error.class), new er.l() { // from class: h71.l
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
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h71.a.C1877a.class), oVar, bVar);
        zVar.x(q0.c(h71.a.b.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(n nVar, z zVar) {
        zVar.A(nVar.new d(null));
        e eVar = nVar.new e(null);
        zVar.x(q0.c(h71.a.f.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<h71.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h71.b, h71.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h71.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(h71.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(j71.a aVar) {
        super.P5(aVar);
    }
}
