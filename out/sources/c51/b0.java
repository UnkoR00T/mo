package c51;

import bl0.BEChildBirthRegistrationInitial;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001f0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lc51/b0;", "Ll00/g;", "Lc51/c;", "Lc51/a;", "Lc51/d;", "", "Lyy/a;", "stateMachineFactory", "Le51/g;", "mapper", "Lq31/c;", "exitDialogMapper", "Lac4/a;", "withLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lo31/g;", "validateNameUC", "Lnl0/b;", "bEGetChildBirthRegistrationInitialDataUseCase", "Ld51/a;", "contract", "<init>", "(Lyy/a;Le51/g;Lq31/c;Lac4/a;Lib4/c;Lo31/g;Lnl0/b;Ld51/a;)V", "Lk10/c0;", "state", "Ldx/b;", "domainError", "Lk10/l;", "A9", "(Lk10/c0;Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lc51/d$a;", "D9", "(Lc51/c;)Lc51/d$a;", "b", "Le51/g;", "c", "Lq31/c;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Lo31/g;", "g", "Lnl0/b;", "h", "Ld51/a;", "Lc51/c$c;", "j", "Lc51/c$c;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lc51/a$c;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<c51.c, c51.a> implements c51.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e51.g mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a withLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o31.g validateNameUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nl0.b bEGetChildBirthRegistrationInitialDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d51.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final c51.c.C0624c initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<c51.c, c51.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c51.a.c> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<c51.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f23481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23482g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f23484j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f23482g = obj;
            this.f23484j |= PKIFailureInfo.systemUnavail;
            return b0.this.A9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<c51.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f23485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f23486b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f23487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f23488b;

            /* JADX INFO: renamed from: c51.b0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0623a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f23489d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f23490e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f23491f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f23493h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f23494j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f23495k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f23496l;

                public C0623a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f23489d = obj;
                    this.f23490e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f23487a = hVar;
                this.f23488b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0623a c0623a;
                if (eVar instanceof C0623a) {
                    c0623a = (C0623a) eVar;
                    int i15 = c0623a.f23490e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0623a.f23490e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0623a = new C0623a(eVar);
                    }
                } else {
                    c0623a = new C0623a(eVar);
                }
                Object obj2 = c0623a.f23489d;
                Object objE = uq.b.e();
                int i16 = c0623a.f23490e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f23487a;
                    c51.d.a aVarD9 = this.f23488b.D9((c51.c) obj);
                    c0623a.f23491f = vq.j.a(obj);
                    c0623a.f23493h = vq.j.a(c0623a);
                    c0623a.f23494j = vq.j.a(obj);
                    c0623a.f23495k = vq.j.a(hVar);
                    c0623a.f23496l = 0;
                    c0623a.f23490e = 1;
                    if (hVar.F(aVarD9, c0623a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, b0 b0Var) {
            this.f23485a = gVar;
            this.f23486b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super c51.d.a> hVar, tq.e eVar) {
            Object objA = this.f23485a.a(new a(hVar, this.f23486b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc51/a$m;", "<unused var>", "Lc51/c;", "Loq/i0;", "<anonymous>", "(Lc51/a$m;Lc51/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<c51.a.m, c51.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23497e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f23499e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f23500f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f23500f = b0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f23499e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    xw.b<c51.a.c> bVarY1 = this.f23500f.Y1();
                    c51.a.c.b bVar = c51.a.c.b.f23446a;
                    this.f23499e = 1;
                    if (bVarY1.F(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f23500f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(b0 b0Var) {
            i00.a.a(b0Var, new a(b0Var, null));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23497e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c51.a.c> bVarY1 = b0.this.Y1();
                q31.c cVar = b0.this.exitDialogMapper;
                final b0 b0Var = b0.this;
                c51.a.c.ShowDialog showDialog = new c51.a.c.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: c51.c0
                    @Override // er.a
                    public final Object a() {
                        return b0.c.O(b0Var);
                    }
                })));
                this.f23497e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.m mVar, c51.c cVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc51/a$a;", "<unused var>", "Lc51/c$a;", "Loq/i0;", "<anonymous>", "(Lc51/a$a;Lc51/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<c51.a.C0620a, c51.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23501e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23501e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c51.a.c> bVarY1 = b0.this.Y1();
                c51.a.c.C0621a c0621a = c51.a.c.C0621a.f23445a;
                this.f23501e = 1;
                if (bVarY1.F(c0621a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.C0620a c0620a, c51.c.a aVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc51/c$c;", "it", "Loq/i0;", "<anonymous>", "(Lc51/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<c51.c.C0624c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23503e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f23503e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            b0.this.d9(c51.a.l.f23460a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c51.c.C0624c c0624c, tq.e<? super oq.i0> eVar) {
            return ((e) v(c0624c, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc51/a$a;", "<unused var>", "Lc51/c$c;", "Loq/i0;", "<anonymous>", "(Lc51/a$a;Lc51/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<c51.a.C0620a, c51.c.C0624c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23505e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23505e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c51.a.c> bVarY1 = b0.this.Y1();
                c51.a.c.C0621a c0621a = c51.a.c.C0621a.f23445a;
                this.f23505e = 1;
                if (bVarY1.F(c0621a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.C0620a c0620a, c51.c.C0624c c0624c, tq.e<? super oq.i0> eVar) {
            return b0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$l;", "<unused var>", "Lk10/c0;", "Lc51/c$c;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<c51.a.l, k10.c0<c51.c.C0624c>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23508f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc51/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends c51.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f23510e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f23511f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f23512g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f23513h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f23514j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ b0 f23515k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<c51.c.C0624c> f23516l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<c51.c.C0624c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f23515k = b0Var;
                this.f23516l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c51.c.Initialized V(BEChildBirthRegistrationInitial bEChildBirthRegistrationInitial, c51.c.C0624c c0624c) {
                return new c51.c.Initialized(bEChildBirthRegistrationInitial, bEChildBirthRegistrationInitial.getSecondName() == null, false, false, null, null, null, null, false, null, null, 2044, null);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
            
                if (r6 == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r5.f23514j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r5.f23511f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r5.f23510e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r6)
                    goto L67
                L1a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L22:
                    oq.u.b(r6)
                    goto L3a
                L26:
                    oq.u.b(r6)
                    c51.b0 r6 = r5.f23515k
                    nl0.b r6 = c51.b0.s9(r6)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r5.f23514j = r3
                    java.lang.Object r6 = r6.c(r1, r5)
                    if (r6 != r0) goto L3a
                    goto L66
                L3a:
                    dx.i r6 = (dx.i) r6
                    c51.b0 r1 = r5.f23515k
                    k10.c0<c51.c$c> r3 = r5.f23516l
                    boolean r4 = r6 instanceof dx.i.Left
                    if (r4 == 0) goto L6a
                    r4 = r6
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    java.lang.Object r6 = vq.j.a(r6)
                    r5.f23510e = r6
                    java.lang.Object r6 = vq.j.a(r4)
                    r5.f23511f = r6
                    r6 = 0
                    r5.f23512g = r6
                    r5.f23513h = r6
                    r5.f23514j = r2
                    java.lang.Object r6 = c51.b0.x9(r1, r3, r4, r5)
                    if (r6 != r0) goto L67
                L66:
                    return r0
                L67:
                    k10.l r6 = (k10.l) r6
                    return r6
                L6a:
                    boolean r0 = r6 instanceof dx.i.Right
                    if (r0 == 0) goto L80
                    dx.i$c r6 = (dx.i.Right) r6
                    java.lang.Object r6 = r6.b()
                    bl0.n r6 = (bl0.BEChildBirthRegistrationInitial) r6
                    c51.d0 r0 = new c51.d0
                    r0.<init>()
                    k10.l r6 = r3.d(r0)
                    return r6
                L80:
                    oq.p r6 = new oq.p
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: c51.b0.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f23515k, this.f23516l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends c51.c>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23508f;
            Object objE = uq.b.e();
            int i15 = this.f23507e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.withLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f23508f = vq.j.a(c0Var);
            this.f23507e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.l lVar, k10.c0<c51.c.C0624c> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            g gVar = b0.this.new g(eVar);
            gVar.f23508f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$i;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<c51.a.i, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23518f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, null, null, null, null, false, null, null, 1791, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23518f;
            uq.b.e();
            if (this.f23517e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.h.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.i iVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f23518f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$b;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<c51.a.b, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23520f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, true, null, null, null, null, true, null, null, 1783, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f23520f;
            Object objE = uq.b.e();
            int i15 = this.f23519e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!((c51.c.Initialized) c0Var.a()).getIsStatementCheckBoxChecked()) {
                    return c0Var.b(new er.l() { // from class: c51.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.i.O((c.Initialized) obj2);
                        }
                    });
                }
                b0.this.contract.B7(((c51.c.Initialized) c0Var.a()).getPersonalData());
                xw.b<c51.a.c> bVarY1 = b0.this.Y1();
                c51.a.c.C0622c c0622c = c51.a.c.C0622c.f23447a;
                this.f23520f = c0Var;
                this.f23519e = 1;
                if (bVarY1.F(c0622c, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.b bVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            i iVar = b0.this.new i(eVar);
            iVar.f23520f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc51/a$a;", "<unused var>", "Lc51/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lc51/a$a;Lc51/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<c51.a.C0620a, c51.c.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23523f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c51.c.Initialized initialized = (c51.c.Initialized) this.f23523f;
            Object objE = uq.b.e();
            int i15 = this.f23522e;
            if (i15 == 0) {
                oq.u.b(obj);
                g30.v bottomSheetValue = initialized.getBottomSheetValue();
                g30.v vVar = g30.v.HIDDEN;
                if (bottomSheetValue == vVar) {
                    xw.b<c51.a.c> bVarY1 = b0.this.Y1();
                    c51.a.c.C0621a c0621a = c51.a.c.C0621a.f23445a;
                    this.f23523f = vq.j.a(initialized);
                    this.f23522e = 1;
                    if (bVarY1.F(c0621a, this) == objE) {
                        return objE;
                    }
                } else {
                    b0.this.d9(new c51.a.UpdateBottomSheetState(vVar));
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.C0620a c0620a, c51.c.Initialized initialized, tq.e<? super oq.i0> eVar) {
            j jVar = b0.this.new j(eVar);
            jVar.f23523f = initialized;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$h;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<c51.a.h, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23526f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(k10.c0 c0Var, c51.c.Initialized initialized) {
            g30.v vVar = g30.v.EXPANDED;
            c51.b bVar = c51.b.SECOND_NAME;
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            iy.b0 secondName = ((c51.c.Initialized) c0Var.a()).getPersonalData().getSecondName();
            if (secondName == null) {
                secondName = iy.b0.INSTANCE.a();
            }
            return c51.c.Initialized.b(initialized, null, false, false, false, secondName, c2039b, null, null, false, vVar, bVar, 463, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f23526f;
            uq.b.e();
            if (this.f23525e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.k.O(c0Var, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.h hVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f23526f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$g;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<c51.a.g, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23528f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(k10.c0 c0Var, c51.c.Initialized initialized) {
            g30.v vVar = g30.v.EXPANDED;
            c51.b bVar = c51.b.NEXT_NAME;
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            iy.b0 nextNames = ((c51.c.Initialized) c0Var.a()).getPersonalData().getNextNames();
            if (nextNames == null) {
                nextNames = iy.b0.INSTANCE.a();
            }
            return c51.c.Initialized.b(initialized, null, false, false, false, null, null, nextNames, c2039b, false, vVar, bVar, 319, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f23528f;
            uq.b.e();
            if (this.f23527e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.l.O(c0Var, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.g gVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f23528f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$n;", "action", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<c51.a.UpdateBottomSheetState, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23531g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.a.UpdateBottomSheetState updateBottomSheetState, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, null, null, null, null, false, updateBottomSheetState.getValue(), null, 1535, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c51.a.UpdateBottomSheetState updateBottomSheetState = (c51.a.UpdateBottomSheetState) this.f23530f;
            k10.c0 c0Var = (k10.c0) this.f23531g;
            uq.b.e();
            if (this.f23529e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.m.O(updateBottomSheetState, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.UpdateBottomSheetState updateBottomSheetState, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            m mVar = new m(eVar);
            mVar.f23530f = updateBottomSheetState;
            mVar.f23531g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$e;", "action", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<c51.a.OnAddSecondNameInputValueChanged, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23534g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.a.OnAddSecondNameInputValueChanged onAddSecondNameInputValueChanged, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, onAddSecondNameInputValueChanged.getSecondName(), hz.b.C2039b.f86846c, null, null, false, null, null, 1999, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c51.a.OnAddSecondNameInputValueChanged onAddSecondNameInputValueChanged = (c51.a.OnAddSecondNameInputValueChanged) this.f23533f;
            k10.c0 c0Var = (k10.c0) this.f23534g;
            uq.b.e();
            if (this.f23532e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.O(onAddSecondNameInputValueChanged, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.OnAddSecondNameInputValueChanged onAddSecondNameInputValueChanged, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f23533f = onAddSecondNameInputValueChanged;
            nVar.f23534g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$d;", "action", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<c51.a.OnAddNextNameInputValueChanged, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23537g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.a.OnAddNextNameInputValueChanged onAddNextNameInputValueChanged, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, null, null, onAddNextNameInputValueChanged.getNextName(), hz.b.C2039b.f86846c, false, null, null, 1855, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c51.a.OnAddNextNameInputValueChanged onAddNextNameInputValueChanged = (c51.a.OnAddNextNameInputValueChanged) this.f23536f;
            k10.c0 c0Var = (k10.c0) this.f23537g;
            uq.b.e();
            if (this.f23535e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O(onAddNextNameInputValueChanged, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.OnAddNextNameInputValueChanged onAddNextNameInputValueChanged, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f23536f = onAddNextNameInputValueChanged;
            oVar.f23537g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$k;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<c51.a.k, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23540g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized V(hz.b bVar, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, null, bVar, null, null, false, null, null, 2015, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized X(c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, BEChildBirthRegistrationInitial.b(initialized.getPersonalData(), null, null, null, null, null, null, null, null, null, initialized.getAddSecondNameInputValue(), null, null, null, 7679, null), false, false, false, null, null, null, null, false, g30.v.HIDDEN, null, 1534, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            k10.c0 c0Var = (k10.c0) this.f23540g;
            Object objE = uq.b.e();
            int i15 = this.f23539f;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b.Companion companion2 = hz.b.INSTANCE;
                o31.g gVar = b0.this.validateNameUC;
                o31.g.Params params = new o31.g.Params(((c51.c.Initialized) c0Var.a()).getAddSecondNameInputValue(), false, o31.g.a.NAME);
                this.f23540g = c0Var;
                this.f23538e = companion2;
                this.f23539f = 1;
                Object objE2 = gVar.e(params, this);
                if (objE2 == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objE2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f23538e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            return !bVarA.a() ? c0Var.b(new er.l() { // from class: c51.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.p.V(bVarA, (c.Initialized) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: c51.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.p.X((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.k kVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            p pVar = b0.this.new p(eVar);
            pVar.f23540g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$j;", "<unused var>", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<c51.a.j, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f23543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23544g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized V(hz.b bVar, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, false, false, null, null, null, bVar, false, null, null, 1919, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized X(c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, BEChildBirthRegistrationInitial.b(initialized.getPersonalData(), null, null, null, null, null, null, initialized.getAddNextNameInputValue(), null, null, null, null, null, null, 8127, null), false, false, false, null, null, null, null, false, g30.v.HIDDEN, null, 1534, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hz.b.Companion companion;
            k10.c0 c0Var = (k10.c0) this.f23544g;
            Object objE = uq.b.e();
            int i15 = this.f23543f;
            if (i15 == 0) {
                oq.u.b(obj);
                hz.b.Companion companion2 = hz.b.INSTANCE;
                o31.g gVar = b0.this.validateNameUC;
                o31.g.Params params = new o31.g.Params(((c51.c.Initialized) c0Var.a()).getAddNextNameInputValue(), false, o31.g.a.NEXT_NAMES);
                this.f23544g = c0Var;
                this.f23542e = companion2;
                this.f23543f = 1;
                Object objE2 = gVar.e(params, this);
                if (objE2 == objE) {
                    return objE;
                }
                companion = companion2;
                obj = objE2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f23542e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            return !bVarA.a() ? c0Var.b(new er.l() { // from class: c51.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.q.V(bVarA, (c.Initialized) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: c51.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.q.X((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.j jVar, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            q qVar = b0.this.new q(eVar);
            qVar.f23544g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc51/a$f;", "action", "Lk10/c0;", "Lc51/c$b;", "state", "Lk10/l;", "Lc51/c;", "<anonymous>", "(Lc51/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<c51.a.OnCheckBoxChanged, k10.c0<c51.c.Initialized>, tq.e<? super k10.l<? extends c51.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f23548g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c51.c.Initialized O(c51.a.OnCheckBoxChanged onCheckBoxChanged, c51.c.Initialized initialized) {
            return c51.c.Initialized.b(initialized, null, false, onCheckBoxChanged.getIsChecked(), false, null, null, null, null, false, null, null, 2035, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c51.a.OnCheckBoxChanged onCheckBoxChanged = (c51.a.OnCheckBoxChanged) this.f23547f;
            k10.c0 c0Var = (k10.c0) this.f23548g;
            uq.b.e();
            if (this.f23546e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c51.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.r.O(onCheckBoxChanged, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c51.a.OnCheckBoxChanged onCheckBoxChanged, k10.c0<c51.c.Initialized> c0Var, tq.e<? super k10.l<? extends c51.c>> eVar) {
            r rVar = new r(eVar);
            rVar.f23547f = onCheckBoxChanged;
            rVar.f23548g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar, e51.g gVar, q31.c cVar, ac4.a aVar2, ib4.c cVar2, o31.g gVar2, nl0.b bVar, d51.a aVar3) {
        this.mapper = gVar;
        this.exitDialogMapper = cVar;
        this.withLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar2;
        this.validateNameUC = gVar2;
        this.bEGetChildBirthRegistrationInitialDataUseCase = bVar;
        this.contract = aVar3;
        c51.c.C0624c c0624c = c51.c.C0624c.f23561a;
        this.initialState = c0624c;
        this.stateMachine = aVar.a(c0624c, new er.l() { // from class: c51.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.J9(this.f23611a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), D9(c0624c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A9(k10.c0<?> c0Var, dx.b bVar, tq.e<? super k10.l<? extends c51.c>> eVar) throws Throwable {
        a aVar;
        PayloadErrorData payloadErrorData;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f23484j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f23484j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f23482g;
        Object objE = uq.b.e();
        int i16 = aVar.f23484j;
        if (i16 == 0) {
            oq.u.b(obj);
            String code = null;
            dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
            if (http != null && (payloadErrorData = (PayloadErrorData) http.b()) != null) {
                code = payloadErrorData.getCode();
            }
            boolean zC = fr.t.c(code, "CHILD_BIRTH_REGISTRATION_INITIAL_DATA_NOT_ADULT");
            if (zC) {
                return c0Var.d(new er.l() { // from class: c51.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.B9(obj2);
                    }
                });
            }
            Object showError = new c51.a.c.ShowError(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: c51.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.C9(this.f23463a, (ib4.c.b) obj2);
                }
            }, 2, null)));
            aVar.f23479d = c0Var;
            aVar.f23480e = vq.j.a(bVar);
            aVar.f23481f = zC;
            aVar.f23484j = 1;
            if (F(showError, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) aVar.f23479d;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c51.c.a B9(Object obj) {
        return c51.c.a.f23549a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(b0 b0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        b0Var.d9(c51.a.C0620a.f23443a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c51.d.a D9(c51.c cVar) {
        e51.g gVar = this.mapper;
        er.a<oq.i0> aVarB9 = b9(c51.a.b.f23444a);
        er.a<oq.i0> aVarB10 = b9(c51.a.C0620a.f23443a);
        er.a<oq.i0> aVarB11 = b9(c51.a.m.f23461a);
        er.a<oq.i0> aVarB12 = b9(c51.a.k.f23459a);
        return gVar.b(new e51.g.Params(cVar, aVarB9, aVarB10, aVarB11, new er.l() { // from class: c51.q
            @Override // er.l
            public final Object b(Object obj) {
                return b0.E9(this.f23610a, ((Boolean) obj).booleanValue());
            }
        }, b9(c51.a.i.f23457a), new er.l() { // from class: c51.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.F9(this.f23613a, (g30.v) obj);
            }
        }, new er.l() { // from class: c51.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.G9(this.f23615a, (iy.b0) obj);
            }
        }, aVarB12, b9(c51.a.h.f23456a), new er.l() { // from class: c51.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.H9(this.f23616a, (iy.b0) obj);
            }
        }, b9(c51.a.j.f23458a), b9(c51.a.g.f23455a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(b0 b0Var, boolean z15) {
        b0Var.d9(new c51.a.OnCheckBoxChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(b0 b0Var, g30.v vVar) {
        b0Var.d9(new c51.a.UpdateBottomSheetState(vVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(b0 b0Var, iy.b0 b0Var2) {
        b0Var.d9(new c51.a.OnAddSecondNameInputValueChanged(b0Var2));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(b0 b0Var, iy.b0 b0Var2) {
        b0Var.d9(new c51.a.OnAddNextNameInputValueChanged(b0Var2));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(final b0 b0Var, k10.v vVar) {
        vVar.c(fr.q0.c(c51.c.class), new er.l() { // from class: c51.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.K9(this.f23617a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(c51.c.a.class), new er.l() { // from class: c51.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.L9(this.f23618a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(c51.c.C0624c.class), new er.l() { // from class: c51.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f23619a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(c51.c.Initialized.class), new er.l() { // from class: c51.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.N9(this.f23620a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(b0 b0Var, k10.z zVar) {
        c cVar = b0Var.new c(null);
        zVar.x(fr.q0.c(c51.a.m.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(b0 b0Var, k10.z zVar) {
        d dVar = b0Var.new d(null);
        zVar.x(fr.q0.c(c51.a.C0620a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new e(null));
        f fVar = b0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(c51.a.C0620a.class), oVar, fVar);
        zVar.v(fr.q0.c(c51.a.l.class), oVar, b0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(b0 b0Var, k10.z zVar) {
        j jVar = b0Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(c51.a.C0620a.class), oVar, jVar);
        zVar.v(fr.q0.c(c51.a.h.class), oVar, new k(null));
        zVar.v(fr.q0.c(c51.a.g.class), oVar, new l(null));
        zVar.v(fr.q0.c(c51.a.UpdateBottomSheetState.class), oVar, new m(null));
        zVar.v(fr.q0.c(c51.a.OnAddSecondNameInputValueChanged.class), oVar, new n(null));
        zVar.v(fr.q0.c(c51.a.OnAddNextNameInputValueChanged.class), oVar, new o(null));
        zVar.v(fr.q0.c(c51.a.k.class), oVar, b0Var.new p(null));
        zVar.v(fr.q0.c(c51.a.j.class), oVar, b0Var.new q(null));
        zVar.v(fr.q0.c(c51.a.OnCheckBoxChanged.class), oVar, new r(null));
        zVar.v(fr.q0.c(c51.a.i.class), oVar, new h(null));
        zVar.v(fr.q0.c(c51.a.b.class), oVar, b0Var.new i(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(d51.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<c51.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<c51.c, c51.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<c51.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(c51.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
