package pg2;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq0.LandRegisterDocument;
import tq0.LandRegisterDocumentTypesFee;
import tq0.MyRegistry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lpg2/n;", "Ll00/g;", "Lpg2/b;", "Lpg2/a;", "Lpg2/c;", "", "Lyy/a;", "stateMachineFactory", "Lqg2/b;", "mapper", "Lac4/a;", "loaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lpg2/d;", "setupContract", "<init>", "(Lyy/a;Lqg2/b;Lac4/a;Lhb4/d;Lib4/c;Lpg2/d;)V", "state", "Lpg2/c$a;", "s9", "(Lpg2/b;)Lpg2/c$a;", "b", "Lqg2/b;", "c", "Lac4/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lpg2/d;", "Lpg2/b$b;", "g", "Lpg2/b$b;", "initialState", "Lxw/b;", "Lpg2/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<pg2.b, pg2.a> implements pg2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qg2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pg2.d setupContract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pg2.b.C3898b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pg2.a.InterfaceC3896a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<pg2.b, pg2.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<pg2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<pg2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f157492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f157493b;

        /* JADX INFO: renamed from: pg2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3901a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f157494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f157495b;

            /* JADX INFO: renamed from: pg2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3902a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f157496d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f157497e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f157498f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f157500h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f157501j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f157502k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f157503l;

                public C3902a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f157496d = obj;
                    this.f157497e |= PKIFailureInfo.systemUnavail;
                    return C3901a.this.F(null, this);
                }
            }

            public C3901a(mu.h hVar, n nVar) {
                this.f157494a = hVar;
                this.f157495b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3902a c3902a;
                if (eVar instanceof C3902a) {
                    c3902a = (C3902a) eVar;
                    int i15 = c3902a.f157497e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3902a.f157497e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3902a = new C3902a(eVar);
                    }
                } else {
                    c3902a = new C3902a(eVar);
                }
                Object obj2 = c3902a.f157496d;
                Object objE = uq.b.e();
                int i16 = c3902a.f157497e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f157494a;
                    pg2.c.a aVarS9 = this.f157495b.s9((pg2.b) obj);
                    c3902a.f157498f = vq.j.a(obj);
                    c3902a.f157500h = vq.j.a(c3902a);
                    c3902a.f157501j = vq.j.a(obj);
                    c3902a.f157502k = vq.j.a(hVar);
                    c3902a.f157503l = 0;
                    c3902a.f157497e = 1;
                    if (hVar.F(aVarS9, c3902a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f157492a = gVar;
            this.f157493b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super pg2.c.a> hVar, tq.e eVar) {
            Object objA = this.f157492a.a(new C3901a(hVar, this.f157493b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg2/a$a;", "action", "Lpg2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg2/a$a;Lpg2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<pg2.a.InterfaceC3896a, pg2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157505f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pg2.a.InterfaceC3896a interfaceC3896a = (pg2.a.InterfaceC3896a) this.f157505f;
            Object objE = uq.b.e();
            int i15 = this.f157504e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                this.f157505f = vq.j.a(interfaceC3896a);
                this.f157504e = 1;
                if (nVar.F(interfaceC3896a, this) == objE) {
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg2.a.InterfaceC3896a interfaceC3896a, pg2.b bVar, tq.e<? super i0> eVar) {
            b bVar2 = n.this.new b(eVar);
            bVar2.f157505f = interfaceC3896a;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpg2/a$c;", "<unused var>", "Lk10/c0;", "Lpg2/b;", "state", "Lk10/l;", "<anonymous>", "(Lpg2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<pg2.a.c, c0<pg2.b>, tq.e<? super k10.l<? extends pg2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157508f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lpg2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends pg2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f157510e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f157511f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<pg2.b> f157512g;

            /* JADX INFO: renamed from: pg2.n$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C3903a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f157513a;

                static {
                    int[] iArr = new int[MyRegistry.b.values().length];
                    try {
                        iArr[MyRegistry.b.Closed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f157513a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<pg2.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f157511f = nVar;
                this.f157512g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final pg2.b.Error Y(final n nVar, dx.b bVar, pg2.b bVar2) {
                return new pg2.b.Error(nVar.errorVMSFactory.a(nVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: pg2.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.c.a.Z(nVar, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(n nVar, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    nVar.d9(pg2.a.InterfaceC3896a.C3897a.f157459a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    nVar.d9(pg2.a.c.f157463a);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final pg2.b.Initialized a0(n nVar, LandRegisterDocumentTypesFee landRegisterDocumentTypesFee, pg2.b bVar) {
                MyRegistry.b bVarH0 = nVar.setupContract.h0();
                return new pg2.b.Initialized((bVarH0 == null ? -1 : C3903a.f157513a[bVarH0.ordinal()]) == 1 ? landRegisterDocumentTypesFee.a() : landRegisterDocumentTypesFee.b());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f157510e;
                if (i15 == 0) {
                    u.b(obj);
                    pg2.d dVar = this.f157511f.setupContract;
                    this.f157510e = 1;
                    obj = dVar.v0(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<pg2.b> c0Var = this.f157512g;
                final n nVar = this.f157511f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: pg2.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.c.a.Y(nVar, bVar, (b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final LandRegisterDocumentTypesFee landRegisterDocumentTypesFee = (LandRegisterDocumentTypesFee) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: pg2.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.a.a0(nVar, landRegisterDocumentTypesFee, (b) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f157511f, this.f157512g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends pg2.b>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f157508f;
            Object objE = uq.b.e();
            int i15 = this.f157507e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = n.this.loaderUseCase;
            a aVar2 = new a(n.this, c0Var, null);
            this.f157508f = vq.j.a(c0Var);
            this.f157507e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg2.a.c cVar, c0<pg2.b> c0Var, tq.e<? super k10.l<? extends pg2.b>> eVar) {
            c cVar2 = n.this.new c(eVar);
            cVar2.f157508f = c0Var;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpg2/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lpg2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<pg2.b.C3898b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157514e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f157514e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.d9(pg2.a.c.f157463a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(pg2.b.C3898b c3898b, tq.e<? super i0> eVar) {
            return ((d) v(c3898b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpg2/a$b;", "action", "Lpg2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpg2/a$b;Lpg2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<pg2.a.OnSelectedItem, pg2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f157517f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pg2.a.OnSelectedItem onSelectedItem = (pg2.a.OnSelectedItem) this.f157517f;
            uq.b.e();
            if (this.f157516e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.setupContract.a4(onSelectedItem.getDocument());
            if (onSelectedItem.getDocument().getType() == tq0.g.Extract) {
                n.this.d9(pg2.a.InterfaceC3896a.b.f157460a);
            } else {
                n.this.d9(pg2.a.InterfaceC3896a.c.f157461a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(pg2.a.OnSelectedItem onSelectedItem, pg2.b.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f157517f = onSelectedItem;
            return eVar2.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, qg2.b bVar, ac4.a aVar2, hb4.d dVar, ib4.c cVar, pg2.d dVar2) {
        this.mapper = bVar;
        this.loaderUseCase = aVar2;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.setupContract = dVar2;
        pg2.b.C3898b c3898b = pg2.b.C3898b.f157465a;
        this.initialState = c3898b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c3898b, new er.l() { // from class: pg2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.v9(this.f157482a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), s9(c3898b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pg2.c.a s9(pg2.b state) {
        return this.mapper.b(new qg2.b.Params(state, b9(pg2.a.InterfaceC3896a.C3897a.f157459a), new er.l() { // from class: pg2.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(this.f157478a, (LandRegisterDocument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(n nVar, LandRegisterDocument landRegisterDocument) {
        nVar.d9(new pg2.a.OnSelectedItem(landRegisterDocument));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final n nVar, v vVar) {
        vVar.c(q0.c(pg2.b.class), new er.l() { // from class: pg2.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f157479a, (z) obj);
            }
        });
        vVar.c(q0.c(pg2.b.C3898b.class), new er.l() { // from class: pg2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f157480a, (z) obj);
            }
        });
        vVar.c(q0.c(pg2.b.Initialized.class), new er.l() { // from class: pg2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f157481a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(pg2.a.InterfaceC3896a.class), oVar, bVar);
        zVar.v(q0.c(pg2.a.c.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(n nVar, z zVar) {
        zVar.C(nVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, z zVar) {
        e eVar = nVar.new e(null);
        zVar.x(q0.c(pg2.a.OnSelectedItem.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pg2.a.InterfaceC3896a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<pg2.b, pg2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<pg2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(pg2.a.InterfaceC3896a interfaceC3896a, tq.e<? super i0> eVar) {
        return super.F(interfaceC3896a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(pg2.d dVar) {
        super.P5(dVar);
    }
}
