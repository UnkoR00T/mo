package rk3;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lrk3/r;", "Ll00/g;", "Lrk3/f;", "Lrk3/a;", "Lrk3/g;", "", "Lyy/a;", "stateMachineFactory", "Ltk3/c;", "mapper", "Lhb4/d;", "errorVmsFactory", "Lac4/a;", "callActionWithLoaderUC", "Ltk3/b;", "errorMapper", "Ljk3/a;", "beInteractor", "Lsk3/a;", "contract", "<init>", "(Lyy/a;Ltk3/c;Lhb4/d;Lac4/a;Ltk3/b;Ljk3/a;Lsk3/a;)V", "Ldx/b;", "Ltk3/b$a$a;", "E9", "(Ldx/b;)Ltk3/b$a$a;", "state", "Lrk3/g$a;", "w9", "(Lrk3/f;)Lrk3/g$a;", "b", "Ltk3/c;", "c", "Lhb4/d;", "d", "Lac4/a;", "e", "Ltk3/b;", "f", "Ljk3/a;", "g", "Lsk3/a;", "Lrk3/f$a;", "h", "Lrk3/f$a;", "initialState", "Lxw/b;", "Lrk3/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<rk3.f, rk3.a> implements rk3.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tk3.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final tk3.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jk3.a beInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sk3.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final rk3.f.a initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rk3.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<rk3.f, rk3.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<rk3.g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<rk3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f174736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f174737b;

        /* JADX INFO: renamed from: rk3.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4460a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f174738a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f174739b;

            /* JADX INFO: renamed from: rk3.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4461a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f174740d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f174741e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f174742f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f174744h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f174745j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f174746k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f174747l;

                public C4461a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f174740d = obj;
                    this.f174741e |= PKIFailureInfo.systemUnavail;
                    return C4460a.this.F(null, this);
                }
            }

            public C4460a(mu.h hVar, r rVar) {
                this.f174738a = hVar;
                this.f174739b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4461a c4461a;
                if (eVar instanceof C4461a) {
                    c4461a = (C4461a) eVar;
                    int i15 = c4461a.f174741e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4461a.f174741e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4461a = new C4461a(eVar);
                    }
                } else {
                    c4461a = new C4461a(eVar);
                }
                Object obj2 = c4461a.f174740d;
                Object objE = uq.b.e();
                int i16 = c4461a.f174741e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f174738a;
                    rk3.g.a aVarW9 = this.f174739b.w9((rk3.f) obj);
                    c4461a.f174742f = vq.j.a(obj);
                    c4461a.f174744h = vq.j.a(c4461a);
                    c4461a.f174745j = vq.j.a(obj);
                    c4461a.f174746k = vq.j.a(hVar);
                    c4461a.f174747l = 0;
                    c4461a.f174741e = 1;
                    if (hVar.F(aVarW9, c4461a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f174736a = gVar;
            this.f174737b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super rk3.g.a> hVar, tq.e eVar) {
            Object objA = this.f174736a.a(new C4460a(hVar, this.f174737b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrk3/a$c;", "<unused var>", "Lrk3/f;", "Loq/i0;", "<anonymous>", "(Lrk3/a$c;Lrk3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rk3.a.c, rk3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174748e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f174748e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                rk3.a.b.C4457a c4457a = rk3.a.b.C4457a.f174699a;
                this.f174748e = 1;
                if (rVar.F(c4457a, this) == objE) {
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
        public final Object w(rk3.a.c cVar, rk3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrk3/a$d;", "<unused var>", "Lk10/c0;", "Lrk3/f$a;", "state", "Lk10/l;", "Lrk3/f;", "<anonymous>", "(Lrk3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<rk3.a.d, c0<rk3.f.a>, tq.e<? super k10.l<? extends rk3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174751f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final rk3.e O(rk3.f.a aVar) {
            return rk3.e.f174711a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f174751f;
            uq.b.e();
            if (this.f174750e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: rk3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c.O((f.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rk3.a.d dVar, c0<rk3.f.a> c0Var, tq.e<? super k10.l<? extends rk3.f>> eVar) {
            c cVar = new c(eVar);
            cVar.f174751f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lrk3/e;", "state", "Lk10/l;", "Lrk3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<rk3.e>, tq.e<? super k10.l<? extends rk3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174753f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lrk3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends rk3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f174755e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f174756f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<rk3.e> f174757g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<rk3.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f174756f = rVar;
                this.f174757g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(r rVar, dx.b bVar, rk3.e eVar) {
                return new Error(rVar.errorVmsFactory.a(rVar.errorMapper.b(rVar.E9(bVar))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final rk3.f.b Z(rk3.e eVar) {
                return rk3.f.b.f174713a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error a0(r rVar, rk3.e eVar) {
                return new Error(rVar.errorVmsFactory.a(rVar.errorMapper.b(new tk3.b.a.MissingTrustedProfile(rVar.b9(rk3.b.f174707a)))));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f174755e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jk3.a aVar = this.f174756f.beInteractor;
                    this.f174755e = 1;
                    obj = aVar.a(this);
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
                c0<rk3.e> c0Var = this.f174757g;
                final r rVar = this.f174756f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: rk3.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.Y(rVar, bVar, (e) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    return ((Boolean) ((dx.i.Right) iVar).b()).booleanValue() ? c0Var.d(new er.l() { // from class: rk3.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.Z((e) obj2);
                        }
                    }) : c0Var.d(new er.l() { // from class: rk3.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.a0(rVar, (e) obj2);
                        }
                    });
                }
                throw new oq.p();
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f174756f, this.f174757g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends rk3.f>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f174753f;
            Object objE = uq.b.e();
            int i15 = this.f174752e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUC;
            a aVar2 = new a(r.this, c0Var, null);
            this.f174753f = vq.j.a(c0Var);
            this.f174752e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<rk3.e> c0Var, tq.e<? super k10.l<? extends rk3.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f174753f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrk3/b;", "<unused var>", "Lk10/c0;", "Lrk3/d;", "state", "Lk10/l;", "Lrk3/f;", "<anonymous>", "(Lrk3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<rk3.b, c0<Error>, tq.e<? super k10.l<? extends rk3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174759f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final rk3.f.a O(Error error) {
            return rk3.f.a.f174712a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f174759f;
            uq.b.e();
            if (this.f174758e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: rk3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rk3.b bVar, c0<Error> c0Var, tq.e<? super k10.l<? extends rk3.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f174759f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lrk3/c;", "<unused var>", "Lk10/c0;", "Lrk3/d;", "state", "Lk10/l;", "Lrk3/f;", "<anonymous>", "(Lrk3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<rk3.c, c0<Error>, tq.e<? super k10.l<? extends rk3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174761f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final rk3.e O(Error error) {
            return rk3.e.f174711a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f174761f;
            uq.b.e();
            if (this.f174760e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: rk3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rk3.c cVar, c0<Error> c0Var, tq.e<? super k10.l<? extends rk3.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f174761f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrk3/f$b;", "it", "Loq/i0;", "<anonymous>", "(Lrk3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<rk3.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174762e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f174762e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            iy.b0 b0VarL = r.this.beInteractor.l();
            if (b0VarL != null) {
                r.this.d9(new rk3.a.OnNext(b0VarL));
            } else {
                r.this.d9(rk3.a.C4456a.f174698a);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(rk3.f.b bVar, tq.e<? super i0> eVar) {
            return ((g) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrk3/a$a;", "<unused var>", "Lrk3/f$b;", "Loq/i0;", "<anonymous>", "(Lrk3/a$a;Lrk3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<rk3.a.C4456a, rk3.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174764e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, iy.b0 b0Var) {
            rVar.d9(new rk3.a.OnNext(b0Var));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f174764e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                final r rVar2 = r.this;
                rk3.a.b.EdorAuth edorAuth = new rk3.a.b.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: rk3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.h.O(rVar2, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f174764e = 1;
                if (rVar.F(edorAuth, this) == objE) {
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
        public final Object w(rk3.a.C4456a c4456a, rk3.f.b bVar, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrk3/a$e;", "action", "Lrk3/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrk3/a$e;Lrk3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<rk3.a.OnNext, rk3.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174766e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174767f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rk3.a.OnNext onNext = (rk3.a.OnNext) this.f174767f;
            Object objE = uq.b.e();
            int i15 = this.f174766e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.contract.U(onNext.getEdorAddress());
                r rVar = r.this;
                rk3.a.b.c cVar = rk3.a.b.c.f174701a;
                this.f174767f = vq.j.a(onNext);
                this.f174766e = 1;
                if (rVar.F(cVar, this) == objE) {
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
        public final Object w(rk3.a.OnNext onNext, rk3.f.b bVar, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f174767f = onNext;
            return iVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, tk3.c cVar, hb4.d dVar, ac4.a aVar2, tk3.b bVar, jk3.a aVar3, sk3.a aVar4) {
        this.mapper = cVar;
        this.errorVmsFactory = dVar;
        this.callActionWithLoaderUC = aVar2;
        this.errorMapper = bVar;
        this.beInteractor = aVar3;
        this.contract = aVar4;
        rk3.f.a aVar5 = rk3.f.a.f174712a;
        this.initialState = aVar5;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: rk3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f174725a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), w9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(k10.z zVar) {
        c cVar = new c(null);
        zVar.v(q0.c(rk3.a.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, k10.z zVar) {
        zVar.A(rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(rk3.b.class), oVar, eVar);
        zVar.v(q0.c(rk3.c.class), oVar, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, k10.z zVar) {
        zVar.C(rVar.new g(null));
        h hVar = rVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rk3.a.C4456a.class), oVar, hVar);
        zVar.x(q0.c(rk3.a.OnNext.class), oVar, rVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tk3.b.a.Generic E9(dx.b bVar) {
        return new tk3.b.a.Generic(bVar, b9(rk3.c.f174709a), b9(rk3.b.f174707a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rk3.g.a w9(rk3.f state) {
        return this.mapper.b(new tk3.c.Params(state, b9(rk3.a.c.f174702a), b9(rk3.a.d.f174703a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(rk3.f.class), new er.l() { // from class: rk3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f174722a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(rk3.f.a.class), new er.l() { // from class: rk3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9((k10.z) obj);
            }
        });
        vVar.c(q0.c(rk3.e.class), new er.l() { // from class: rk3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f174723a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: rk3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9((k10.z) obj);
            }
        });
        vVar.c(q0.c(rk3.f.b.class), new er.l() { // from class: rk3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f174724a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, k10.z zVar) {
        b bVar = rVar.new b(null);
        zVar.x(q0.c(rk3.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<rk3.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<rk3.f, rk3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<rk3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rk3.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(sk3.a aVar) {
        super.P5(aVar);
    }
}
