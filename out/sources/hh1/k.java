package hh1;

import ch1.a0;
import ch1.b0;
import er.p;
import er.q;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R&\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lhh1/k;", "Ll00/g;", "Lhh1/f;", "Lhh1/e;", "Lhh1/g;", "", "Lyy/a;", "stateMachineFactory", "Lih1/b;", "mapper", "Lch1/a0;", "getExpiredIdentityTypeUseCase", "Lch1/b0;", "getRenewDocumentByIdentityTypeGlobalEventUC", "Lgx/d;", "globalEventManager", "Lkh1/g;", "logoutDialogMapper", "Lr34/b;", "getMaintenanceBreakDialogFromDocumentConfigUC", "<init>", "(Lyy/a;Lih1/b;Lch1/a0;Lch1/b0;Lgx/d;Lkh1/g;Lr34/b;)V", "Lrq0/b;", "documentType", "", "u9", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "state", "Lhh1/g$a;", "s9", "(Lhh1/f;)Lhh1/g$a;", "Loq/i0;", "d", "()V", "b", "Lih1/b;", "c", "Lch1/a0;", "Lch1/b0;", "e", "Lgx/d;", "f", "Lkh1/g;", "g", "Lr34/b;", "h", "Lhh1/f;", "initialState", "Lxw/b;", "Lhh1/e$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, hh1.e> implements hh1.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ih1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a0 getExpiredIdentityTypeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0 getRenewDocumentByIdentityTypeGlobalEventUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final kh1.g logoutDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r34.b getMaintenanceBreakDialogFromDocumentConfigUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hh1.e.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<State, hh1.e> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<hh1.g.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f84664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84666f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84668h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f84666f = obj;
            this.f84668h |= PKIFailureInfo.systemUnavail;
            return k.this.u9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<hh1.g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f84670b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84671a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f84672b;

            /* JADX INFO: renamed from: hh1.k$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1968a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84673d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84674e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84675f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84677h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84678j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84679k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84680l;

                public C1968a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84673d = obj;
                    this.f84674e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, k kVar) {
                this.f84671a = hVar;
                this.f84672b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1968a c1968a;
                if (eVar instanceof C1968a) {
                    c1968a = (C1968a) eVar;
                    int i15 = c1968a.f84674e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1968a.f84674e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1968a = new C1968a(eVar);
                    }
                } else {
                    c1968a = new C1968a(eVar);
                }
                Object obj2 = c1968a.f84673d;
                Object objE = uq.b.e();
                int i16 = c1968a.f84674e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f84671a;
                    hh1.g.Data dataS9 = this.f84672b.s9((State) obj);
                    c1968a.f84675f = vq.j.a(obj);
                    c1968a.f84677h = vq.j.a(c1968a);
                    c1968a.f84678j = vq.j.a(obj);
                    c1968a.f84679k = vq.j.a(hVar);
                    c1968a.f84680l = 0;
                    c1968a.f84674e = 1;
                    if (hVar.F(dataS9, c1968a) == objE) {
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

        public b(mu.g gVar, k kVar) {
            this.f84669a = gVar;
            this.f84670b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hh1.g.Data> hVar, tq.e eVar) {
            Object objA = this.f84669a.a(new a(hVar, this.f84670b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lhh1/f;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84682f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k34.u uVar, State state) {
            return state.a(uVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84682f;
            Object objE = uq.b.e();
            int i15 = this.f84681e;
            if (i15 == 0) {
                u.b(obj);
                a0 a0Var = k.this.getExpiredIdentityTypeUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f84682f = c0Var;
                this.f84681e = 1;
                obj = a0Var.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final k34.u uVar = (k34.u) obj;
            if (uVar != null) {
                return c0Var.b(new er.l() { // from class: hh1.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return k.c.O(uVar, (State) obj2);
                    }
                });
            }
            k.this.d9(hh1.e.C1967e.f84645a);
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f84682f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh1/e$a;", "<unused var>", "Lhh1/f;", "Loq/i0;", "<anonymous>", "(Lhh1/e$a;Lhh1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<hh1.e.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84684e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84684e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                hh1.e.c.ShowDialog showDialog = new hh1.e.c.ShowDialog(k.this.logoutDialogMapper.b(new kh1.g.Params(k.this.b9(hh1.e.b.f84640a))));
                this.f84684e = 1;
                if (kVar.F(showDialog, this) == objE) {
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
        public final Object w(hh1.e.a aVar, State state, tq.e<? super i0> eVar) {
            return k.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh1/e$b;", "<unused var>", "Lhh1/f;", "Loq/i0;", "<anonymous>", "(Lhh1/e$b;Lhh1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<hh1.e.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84686e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84686e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                hh1.e.c.b bVar = hh1.e.c.b.f84642a;
                this.f84686e = 1;
                if (kVar.F(bVar, this) == objE) {
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
        public final Object w(hh1.e.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhh1/e$e;", "<unused var>", "Lhh1/f;", "Loq/i0;", "<anonymous>", "(Lhh1/e$e;Lhh1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<hh1.e.C1967e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84688e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84688e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                hh1.e.c.a aVar = hh1.e.c.a.f84641a;
                this.f84688e = 1;
                if (kVar.F(aVar, this) == objE) {
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
        public final Object w(hh1.e.C1967e c1967e, State state, tq.e<? super i0> eVar) {
            return k.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhh1/e$d;", "<unused var>", "Lhh1/f;", "state", "Loq/i0;", "<anonymous>", "(Lhh1/e$d;Lhh1/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<hh1.e.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f84692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84693h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f84694j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84696a;

            static {
                int[] iArr = new int[k34.u.values().length];
                try {
                    iArr[k34.u.STUDENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f84696a = iArr;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k kVar;
            k kVar2;
            State state = (State) this.f84694j;
            Object objE = uq.b.e();
            int i15 = this.f84693h;
            if (i15 == 0) {
                u.b(obj);
                k34.u identityType = state.getIdentityType();
                if (identityType != null) {
                    kVar = k.this;
                    if (a.f84696a[state.getIdentityType().ordinal()] == 1) {
                        rq0.b.d dVar = rq0.b.d.STUDENT_CARD;
                        this.f84694j = state;
                        this.f84690e = kVar;
                        this.f84691f = vq.j.a(identityType);
                        this.f84692g = 0;
                        this.f84693h = 1;
                        obj = kVar.u9(dVar, this);
                        if (obj == objE) {
                            return objE;
                        }
                        kVar2 = kVar;
                    }
                    kVar.globalEventManager.c(kVar.getRenewDocumentByIdentityTypeGlobalEventUC.a(new b0.Params(state.getIdentityType(), true)));
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar2 = (k) this.f84690e;
            u.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return i0.f148189a;
            }
            kVar = kVar2;
            kVar.globalEventManager.c(kVar.getRenewDocumentByIdentityTypeGlobalEventUC.a(new b0.Params(state.getIdentityType(), true)));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hh1.e.d dVar, State state, tq.e<? super i0> eVar) {
            g gVar = k.this.new g(eVar);
            gVar.f84694j = state;
            return gVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, ih1.b bVar, a0 a0Var, b0 b0Var, gx.d dVar, kh1.g gVar, r34.b bVar2) {
        this.mapper = bVar;
        this.getExpiredIdentityTypeUseCase = a0Var;
        this.getRenewDocumentByIdentityTypeGlobalEventUC = b0Var;
        this.globalEventManager = dVar;
        this.logoutDialogMapper = gVar;
        this.getMaintenanceBreakDialogFromDocumentConfigUC = bVar2;
        State state = new State(null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: hh1.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.w9(this.f84652a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), s9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hh1.g.Data s9(State state) {
        return this.mapper.b(new ih1.b.Params(state, b9(hh1.e.d.f84644a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (F(r2, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u9(rq0.b r7, tq.e<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hh1.k.a
            if (r0 == 0) goto L13
            r0 = r8
            hh1.k$a r0 = (hh1.k.a) r0
            int r1 = r0.f84668h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84668h = r1
            goto L18
        L13:
            hh1.k$a r0 = new hh1.k$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f84666f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f84668h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f84665e
            dx.b$c$a r7 = (dx.b.Business.a) r7
            java.lang.Object r7 = r0.f84664d
            rq0.b r7 = (rq0.b) r7
            oq.u.b(r8)
            goto L97
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f84664d
            rq0.b r7 = (rq0.b) r7
            oq.u.b(r8)
            goto L62
        L44:
            oq.u.b(r8)
            r34.b r8 = r6.getMaintenanceBreakDialogFromDocumentConfigUC
            r34.b$a r2 = new r34.b$a
            hh1.j r5 = new hh1.j
            r5.<init>()
            r2.<init>(r7, r5)
            java.lang.Object r5 = vq.j.a(r7)
            r0.f84664d = r5
            r0.f84668h = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L62
            goto L96
        L62:
            r34.b$b r8 = (r34.b.Result) r8
            if (r8 == 0) goto L71
            dx.b$c r8 = r8.getError()
            if (r8 == 0) goto L71
            dx.b$c$a r8 = r8.getType()
            goto L72
        L71:
            r8 = 0
        L72:
            boolean r2 = r8 instanceof i34.DocumentMaintenanceBreakError
            if (r2 == 0) goto L9c
            hh1.e$c$c r2 = new hh1.e$c$c
            r5 = r8
            i34.a r5 = (i34.DocumentMaintenanceBreakError) r5
            cb4.d r5 = r5.getDialogData()
            r2.<init>(r5)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f84664d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f84665e = r7
            r0.f84668h = r3
            java.lang.Object r7 = r6.F(r2, r0)
            if (r7 != r1) goto L97
        L96:
            return r1
        L97:
            java.lang.Boolean r7 = vq.b.a(r4)
            return r7
        L9c:
            r7 = 0
            java.lang.Boolean r7 = vq.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hh1.k.u9(rq0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: hh1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.x9(this.f84653a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(k kVar, z zVar) {
        zVar.A(kVar.new c(null));
        d dVar = kVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hh1.e.a.class), oVar, dVar);
        zVar.x(q0.c(hh1.e.b.class), oVar, kVar.new e(null));
        zVar.x(q0.c(hh1.e.C1967e.class), oVar, kVar.new f(null));
        zVar.x(q0.c(hh1.e.d.class), oVar, kVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hh1.e.c> Y1() {
        return this.navAction;
    }

    @Override // hh1.g
    public void d() {
        d9(hh1.e.a.f84639a);
    }

    @Override // l00.g
    protected t<State, hh1.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hh1.g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hh1.e.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
