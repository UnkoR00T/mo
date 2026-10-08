package mg1;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0012078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u0010>¨\u0006@"}, d2 = {"Lmg1/u;", "Ll00/g;", "Lmg1/n;", "", "Lmg1/o;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Log1/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lma1/l;", "setupData", "<init>", "(Lyy/a;Log1/a;La14/w;Li70/n;Lma1/l;)V", "state", "Lmg1/o$a;", "o9", "(Lmg1/n;)Lmg1/o$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Log1/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lma1/l;", "Lxw/b;", "Lmg1/j;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmg1/n$b;", "g", "Lmg1/n$b;", "getInitialState", "()Lmg1/n$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<n, Object> implements o, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final og1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ma1.l setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<n, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<o.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f126397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f126398b;

        /* JADX INFO: renamed from: mg1.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3107a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f126399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f126400b;

            /* JADX INFO: renamed from: mg1.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3108a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f126401d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f126402e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f126403f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f126405h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f126406j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f126407k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f126408l;

                public C3108a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f126401d = obj;
                    this.f126402e |= PKIFailureInfo.systemUnavail;
                    return C3107a.this.F(null, this);
                }
            }

            public C3107a(mu.h hVar, u uVar) {
                this.f126399a = hVar;
                this.f126400b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3108a c3108a;
                if (eVar instanceof C3108a) {
                    c3108a = (C3108a) eVar;
                    int i15 = c3108a.f126402e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3108a.f126402e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3108a = new C3108a(eVar);
                    }
                } else {
                    c3108a = new C3108a(eVar);
                }
                Object obj2 = c3108a.f126401d;
                Object objE = uq.b.e();
                int i16 = c3108a.f126402e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f126399a;
                    o.a aVarO9 = this.f126400b.o9((n) obj);
                    c3108a.f126403f = vq.j.a(obj);
                    c3108a.f126405h = vq.j.a(c3108a);
                    c3108a.f126406j = vq.j.a(obj);
                    c3108a.f126407k = vq.j.a(hVar);
                    c3108a.f126408l = 0;
                    c3108a.f126402e = 1;
                    if (hVar.F(aVarO9, c3108a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f126397a = gVar;
            this.f126398b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o.a> hVar, tq.e eVar) {
            Object objA = this.f126397a.a(new C3107a(hVar, this.f126398b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmg1/n$b;", "state", "Lk10/l;", "Lmg1/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<n.b>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126410f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f126412a;

            static {
                int[] iArr = new int[ma1.l.values().length];
                try {
                    iArr[ma1.l.SUSPEND_COMPANY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ma1.l.RESUME_COMPANY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f126412a = iArr;
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.c O(n.b bVar) {
            return n.c.f126366a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f126410f;
            Object objE = uq.b.e();
            int i15 = this.f126409e;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f126412a[u.this.setupData.ordinal()];
                if (i16 == 1) {
                    return c0Var.d(new er.l() { // from class: mg1.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.b.O((n.b) obj2);
                        }
                    });
                }
                if (i16 != 2) {
                    throw new oq.p();
                }
                xw.b<j> bVarY1 = u.this.Y1();
                j.SubmitApplication submitApplication = new j.SubmitApplication(ma1.l.RESUME_COMPANY);
                this.f126410f = c0Var;
                this.f126409e = 1;
                if (bVarY1.F(submitApplication, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<n.b> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = u.this.new b(eVar);
            bVar.f126410f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmg1/i;", "<unused var>", "Lmg1/n$c;", "Loq/i0;", "<anonymous>", "(Lmg1/i;Lmg1/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<i, n.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126413e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126413e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j> bVarY1 = u.this.Y1();
                j.a aVar = j.a.f126359a;
                this.f126413e = 1;
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
        public final Object w(i iVar, n.c cVar, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmg1/m;", "<unused var>", "Lmg1/n$c;", "Loq/i0;", "<anonymous>", "(Lmg1/m;Lmg1/n$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<m, n.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126415e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f126415e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<j> bVarY1 = u.this.Y1();
                j.SubmitApplication submitApplication = new j.SubmitApplication(ma1.l.SUSPEND_COMPANY);
                this.f126415e = 1;
                if (bVarY1.F(submitApplication, this) == objE) {
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
        public final Object w(m mVar, n.c cVar, tq.e<? super i0> eVar) {
            return u.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmg1/k;", "<unused var>", "Lk10/c0;", "Lmg1/n$c;", "state", "Lk10/l;", "Lmg1/n;", "<anonymous>", "(Lmg1/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<k, c0<n.c>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126418f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.a O(n.c cVar) {
            return n.a.f126364a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f126418f;
            uq.b.e();
            if (this.f126417e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mg1.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O((n.c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k kVar, c0<n.c> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f126418f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmg1/i;", "<unused var>", "Lk10/c0;", "Lmg1/n$a;", "state", "Lk10/l;", "Lmg1/n;", "<anonymous>", "(Lmg1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<i, c0<n.a>, tq.e<? super k10.l<? extends n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126420f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n.c O(n.a aVar) {
            return n.c.f126366a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f126420f;
            uq.b.e();
            if (this.f126419e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mg1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O((n.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(i iVar, c0<n.a> c0Var, tq.e<? super k10.l<? extends n>> eVar) {
            f fVar = new f(eVar);
            fVar.f126420f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmg1/l;", "action", "Lmg1/n$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmg1/l;Lmg1/n$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OpenUrl, n.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126422f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f126422f;
            Object objE = uq.b.e();
            int i15 = this.f126421e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f126422f = vq.j.a(openUrl);
                this.f126421e = 1;
                obj = wVar.c(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                uVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
                new dx.i.Left(i0.f148189a);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, n.a aVar, tq.e<? super i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f126422f = openUrl;
            return gVar.J(i0.f148189a);
        }
    }

    public u(yy.a aVar, og1.a aVar2, a14.w wVar, i70.n nVar, ma1.l lVar) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = lVar;
        n.b bVar = n.b.f126365a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: mg1.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.r9(this.f126388a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o.a o9(n state) {
        return this.mapper.b(new og1.a.Params(state, b9(k.f126361a), b9(i.f126358a), new er.l() { // from class: mg1.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.p9(this.f126384a, (String) obj);
            }
        }, b9(m.f126363a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(u uVar, String str) {
        uVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(n.b.class), new er.l() { // from class: mg1.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.s9(this.f126385a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(n.c.class), new er.l() { // from class: mg1.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.t9(this.f126386a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(n.a.class), new er.l() { // from class: mg1.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.u9(this.f126387a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(u uVar, k10.z zVar) {
        zVar.A(uVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i.class), oVar, cVar);
        zVar.x(q0.c(m.class), oVar, uVar.new d(null));
        zVar.v(q0.c(k.class), oVar, new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(u uVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(i.class), oVar, fVar);
        zVar.x(q0.c(OpenUrl.class), oVar, uVar.new g(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<n, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ma1.l lVar) {
        super.P5(lVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
