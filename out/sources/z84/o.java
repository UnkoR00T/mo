package z84;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s84.SemesterAttendanceSummary;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lz84/o;", "Ll00/g;", "Lz84/b;", "Lz84/a;", "Lz84/c;", "", "Lyy/a;", "stateMachineFactory", "Lb94/a;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "La94/a;", "contract", "<init>", "(Lyy/a;Lb94/a;Lhb4/d;Lib4/c;La94/a;)V", "state", "Lz84/c$a;", "q9", "(Lz84/b;)Lz84/c$a;", "b", "Lb94/a;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "La94/a;", "f", "Lz84/b;", "initialState", "Lxw/b;", "Lz84/a$a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<z84.b, z84.a> implements z84.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b94.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a94.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z84.b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<z84.a.InterfaceC6280a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<z84.b, z84.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<z84.c.a> state;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lz84/o$a;", "", "La94/a;", "data", "Lz84/o;", "a", "(La94/a;)Lz84/o;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        o a(a94.a data);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<z84.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f233415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f233416b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f233417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f233418b;

            /* JADX INFO: renamed from: z84.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6285a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233419d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233420e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233421f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233423h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233424j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233425k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233426l;

                public C6285a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233419d = obj;
                    this.f233420e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f233417a = hVar;
                this.f233418b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6285a c6285a;
                if (eVar instanceof C6285a) {
                    c6285a = (C6285a) eVar;
                    int i15 = c6285a.f233420e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6285a.f233420e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6285a = new C6285a(eVar);
                    }
                } else {
                    c6285a = new C6285a(eVar);
                }
                Object obj2 = c6285a.f233419d;
                Object objE = uq.b.e();
                int i16 = c6285a.f233420e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f233417a;
                    z84.c.a aVarQ9 = this.f233418b.q9((z84.b) obj);
                    c6285a.f233421f = vq.j.a(obj);
                    c6285a.f233423h = vq.j.a(c6285a);
                    c6285a.f233424j = vq.j.a(obj);
                    c6285a.f233425k = vq.j.a(hVar);
                    c6285a.f233426l = 0;
                    c6285a.f233420e = 1;
                    if (hVar.F(aVarQ9, c6285a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f233415a = gVar;
            this.f233416b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super z84.c.a> hVar, tq.e eVar) {
            Object objA = this.f233415a.a(new a(hVar, this.f233416b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lz84/b$c;", "state", "Lk10/l;", "Lz84/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<z84.b.c>, tq.e<? super k10.l<? extends z84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233428f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z84.b V(final o oVar, z84.b.c cVar) {
            SemesterAttendanceSummary semesterAttendanceSummaryE3 = oVar.contract.E3();
            return semesterAttendanceSummaryE3 != null ? new z84.b.Displaying(semesterAttendanceSummaryE3, oVar.contract.c6()) : new z84.b.Error(oVar.errorVMSFactory.a(oVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: z84.q
                @Override // er.l
                public final Object b(Object obj) {
                    return o.c.X(oVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(o oVar, ib4.c.b bVar) {
            oVar.d9(z84.a.b.f233381a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f233428f;
            uq.b.e();
            if (this.f233427e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o oVar = o.this;
            return c0Var.d(new er.l() { // from class: z84.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.V(oVar, (b.c) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<z84.b.c> c0Var, tq.e<? super k10.l<? extends z84.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f233428f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz84/a$b;", "<unused var>", "Lz84/b$a;", "Loq/i0;", "<anonymous>", "(Lz84/a$b;Lz84/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<z84.a.b, z84.b.Displaying, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233430e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f233430e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                z84.a.InterfaceC6280a.C6281a c6281a = z84.a.InterfaceC6280a.C6281a.f233380a;
                this.f233430e = 1;
                if (oVar.F(c6281a, this) == objE) {
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
        public final Object w(z84.a.b bVar, z84.b.Displaying displaying, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz84/a$c;", "<unused var>", "Lk10/c0;", "Lz84/b$b;", "state", "Lk10/l;", "Lz84/b;", "<anonymous>", "(Lz84/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<z84.a.c, c0<z84.b.Error>, tq.e<? super k10.l<? extends z84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233433f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z84.b.c O(z84.b.Error error) {
            return z84.b.c.f233386a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f233433f;
            uq.b.e();
            if (this.f233432e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: z84.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.e.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z84.a.c cVar, c0<z84.b.Error> c0Var, tq.e<? super k10.l<? extends z84.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f233433f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz84/a$b;", "<unused var>", "Lz84/b$b;", "Loq/i0;", "<anonymous>", "(Lz84/a$b;Lz84/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<z84.a.b, z84.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233434e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f233434e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                z84.a.InterfaceC6280a.C6281a c6281a = z84.a.InterfaceC6280a.C6281a.f233380a;
                this.f233434e = 1;
                if (oVar.F(c6281a, this) == objE) {
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
        public final Object w(z84.a.b bVar, z84.b.Error error, tq.e<? super i0> eVar) {
            return o.this.new f(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, b94.a aVar2, hb4.d dVar, ib4.c cVar, a94.a aVar3) {
        this.mapper = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.contract = aVar3;
        z84.b.c cVar2 = z84.b.c.f233386a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: z84.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f233403a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z84.c.a q9(z84.b state) {
        return this.mapper.b(new b94.a.Params(state, b9(z84.a.b.f233381a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(z84.b.c.class), new er.l() { // from class: z84.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f233404a, (z) obj);
            }
        });
        vVar.c(q0.c(z84.b.Displaying.class), new er.l() { // from class: z84.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f233405a, (z) obj);
            }
        });
        vVar.c(q0.c(z84.b.Error.class), new er.l() { // from class: z84.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f233406a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        zVar.A(oVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(o oVar, z zVar) {
        d dVar = oVar.new d(null);
        zVar.x(q0.c(z84.a.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(z84.a.c.class), oVar2, eVar);
        zVar.x(q0.c(z84.a.b.class), oVar2, oVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<z84.a.InterfaceC6280a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<z84.b, z84.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z84.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(z84.a.InterfaceC6280a interfaceC6280a, tq.e<? super i0> eVar) {
        return super.F(interfaceC6280a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
