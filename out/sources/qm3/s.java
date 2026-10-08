package qm3;

import fr.q0;
import k10.c0;
import kk3.Dictionary;
import kk3.DictionaryResponse;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001@BC\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lqm3/s;", "Ll00/g;", "Lqm3/f;", "", "Lqm3/g;", "Lyy/a;", "stateMachineFactory", "Lsm3/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljk3/b;", "interactor", "Lrm3/a;", "contract", "<init>", "(Lyy/a;Lsm3/b;Lhb4/d;Lib4/c;Lac4/a;Ljk3/b;Lrm3/a;)V", "Ldx/b;", "Lhb4/c;", "B9", "(Ldx/b;)Lhb4/c;", "state", "Lqm3/g$a;", "t9", "(Lqm3/f;)Lqm3/g$a;", "b", "Lsm3/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Ljk3/b;", "g", "Lrm3/a;", "Lqm3/f$b;", "h", "Lqm3/f$b;", "initialState", "Lxw/b;", "Lqm3/c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "m", "a", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<qm3.f, Object> implements qm3.g, zx.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final a f167370m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f167371n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sm3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final jk3.b interactor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final rm3.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qm3.f.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qm3.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qm3.f, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<qm3.g.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm3/s$a;", "", "<init>", "()V", "", "DICTIONARY_ID", "Ljava/lang/String;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<qm3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f167382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f167383b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f167384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f167385b;

            /* JADX INFO: renamed from: qm3.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4216a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f167386d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f167387e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f167388f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f167390h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f167391j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f167392k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f167393l;

                public C4216a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f167386d = obj;
                    this.f167387e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f167384a = hVar;
                this.f167385b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4216a c4216a;
                if (eVar instanceof C4216a) {
                    c4216a = (C4216a) eVar;
                    int i15 = c4216a.f167387e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4216a.f167387e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4216a = new C4216a(eVar);
                    }
                } else {
                    c4216a = new C4216a(eVar);
                }
                Object obj2 = c4216a.f167386d;
                Object objE = uq.b.e();
                int i16 = c4216a.f167387e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f167384a;
                    qm3.g.a aVarT9 = this.f167385b.t9((qm3.f) obj);
                    c4216a.f167388f = vq.j.a(obj);
                    c4216a.f167390h = vq.j.a(c4216a);
                    c4216a.f167391j = vq.j.a(obj);
                    c4216a.f167392k = vq.j.a(hVar);
                    c4216a.f167393l = 0;
                    c4216a.f167387e = 1;
                    if (hVar.F(aVarT9, c4216a) == objE) {
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

        public b(mu.g gVar, s sVar) {
            this.f167382a = gVar;
            this.f167383b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qm3.g.a> hVar, tq.e eVar) {
            Object objA = this.f167382a.a(new a(hVar, this.f167383b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqm3/d;", "<unused var>", "Lqm3/f;", "Loq/i0;", "<anonymous>", "(Lqm3/d;Lqm3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qm3.d, qm3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167394e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167394e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                qm3.c.a aVar = qm3.c.a.f167346a;
                this.f167394e = 1;
                if (sVar.F(aVar, this) == objE) {
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
        public final Object w(qm3.d dVar, qm3.f fVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqm3/f$b;", "state", "Lk10/l;", "Lqm3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<qm3.f.b>, tq.e<? super k10.l<? extends qm3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167397f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqm3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qm3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f167399e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f167400f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<qm3.f.b> f167401g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, c0<qm3.f.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f167400f = sVar;
                this.f167401g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qm3.f.Error X(s sVar, dx.b bVar, qm3.f.b bVar2) {
                return new qm3.f.Error(sVar.B9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qm3.f.Initialized Y(DictionaryResponse dictionaryResponse, qm3.f.b bVar) {
                return new qm3.f.Initialized(dictionaryResponse.a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f167399e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    jk3.b bVar = this.f167400f.interactor;
                    this.f167399e = 1;
                    obj = bVar.a("DICT_651", this);
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
                c0<qm3.f.b> c0Var = this.f167401g;
                final s sVar = this.f167400f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: qm3.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.d.a.X(sVar, bVar2, (f.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final DictionaryResponse dictionaryResponse = (DictionaryResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: qm3.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.d.a.Y(dictionaryResponse, (f.b) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f167400f, this.f167401g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qm3.f>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167397f;
            Object objE = uq.b.e();
            int i15 = this.f167396e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = s.this.callActionWithLoaderUseCase;
            a aVar2 = new a(s.this, c0Var, null);
            this.f167397f = vq.j.a(c0Var);
            this.f167396e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qm3.f.b> c0Var, tq.e<? super k10.l<? extends qm3.f>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f167397f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqm3/b;", "<unused var>", "Lk10/c0;", "Lqm3/f$a;", "state", "Lk10/l;", "Lqm3/f;", "<anonymous>", "(Lqm3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qm3.b, c0<qm3.f.Error>, tq.e<? super k10.l<? extends qm3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f167403f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qm3.f.b O(qm3.f.Error error) {
            return qm3.f.b.f167351a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f167403f;
            uq.b.e();
            if (this.f167402e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: qm3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O((f.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qm3.b bVar, c0<qm3.f.Error> c0Var, tq.e<? super k10.l<? extends qm3.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f167403f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqm3/a;", "<unused var>", "Lqm3/f$a;", "Loq/i0;", "<anonymous>", "(Lqm3/a;Lqm3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qm3.a, qm3.f.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f167404e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f167404e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                qm3.c.a aVar = qm3.c.a.f167346a;
                this.f167404e = 1;
                if (sVar.F(aVar, this) == objE) {
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
        public final Object w(qm3.a aVar, qm3.f.Error error, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqm3/e;", "action", "Lk10/c0;", "Lqm3/f$c;", "state", "Lk10/l;", "Lqm3/f;", "<anonymous>", "(Lqm3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnCardClick, c0<qm3.f.Initialized>, tq.e<? super k10.l<? extends qm3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f167406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f167407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f167408g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f167409h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f167410j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final qm3.f.Error O(s sVar, qm3.f.Initialized initialized) {
            return new qm3.f.Error(sVar.B9(new dx.b.Generic(null, 1, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnCardClick onCardClick = (OnCardClick) this.f167409h;
            c0 c0Var = (c0) this.f167410j;
            Object objE = uq.b.e();
            int i15 = this.f167408g;
            if (i15 == 0) {
                oq.u.b(obj);
                nk3.a aVarA = nk3.a.INSTANCE.a(onCardClick.getDictionary().getCode());
                if (aVarA != null) {
                    s sVar = s.this;
                    sVar.contract.f(aVarA);
                    qm3.c.Next next = new qm3.c.Next(aVarA);
                    this.f167409h = vq.j.a(onCardClick);
                    this.f167410j = c0Var;
                    this.f167406e = vq.j.a(aVarA);
                    this.f167407f = 0;
                    this.f167408g = 1;
                    if (sVar.F(next, this) == objE) {
                        return objE;
                    }
                }
                final s sVar2 = s.this;
                return c0Var.d(new er.l() { // from class: qm3.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.g.O(sVar2, (f.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
            final s sVar3 = s.this;
            return c0Var.d(new er.l() { // from class: qm3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(sVar3, (f.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCardClick onCardClick, c0<qm3.f.Initialized> c0Var, tq.e<? super k10.l<? extends qm3.f>> eVar) {
            g gVar = s.this.new g(eVar);
            gVar.f167409h = onCardClick;
            gVar.f167410j = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, sm3.b bVar, hb4.d dVar, ib4.c cVar, ac4.a aVar2, jk3.b bVar2, rm3.a aVar3) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = bVar2;
        this.contract = aVar3;
        qm3.f.b bVar3 = qm3.f.b.f167351a;
        this.initialState = bVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: qm3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f167369a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), t9(bVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, k10.z zVar) {
        g gVar = sVar.new g(null);
        zVar.v(q0.c(OnCardClick.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c B9(dx.b bVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: qm3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(this.f167368a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(s sVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            sVar.d9(qm3.b.f167345a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            sVar.d9(qm3.a.f167344a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qm3.g.a t9(qm3.f state) {
        return this.mapper.b(new sm3.b.Params(state, b9(qm3.d.f167348a), new er.l() { // from class: qm3.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f167363a, (Dictionary) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, Dictionary dictionary) {
        sVar.d9(new OnCardClick(dictionary));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(qm3.f.class), new er.l() { // from class: qm3.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f167364a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qm3.f.b.class), new er.l() { // from class: qm3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f167365a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qm3.f.Error.class), new er.l() { // from class: qm3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f167366a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(qm3.f.Initialized.class), new er.l() { // from class: qm3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f167367a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, k10.z zVar) {
        c cVar = sVar.new c(null);
        zVar.x(q0.c(qm3.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(s sVar, k10.z zVar) {
        zVar.A(sVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qm3.b.class), oVar, eVar);
        zVar.x(q0.c(qm3.a.class), oVar, sVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qm3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<qm3.f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qm3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(qm3.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(rm3.a aVar) {
        super.P5(aVar);
    }
}
