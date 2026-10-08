package c73;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R,\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0B8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u00109\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lc73/p;", "Ll00/g;", "Lc73/c;", "Lc73/a;", "Lc73/d;", "", "Ld73/d;", "changePhoneNumberScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Ll63/b;", "contactDetailsNavigationDialogMapper", "Lj14/n;", "checkPhoneNumberCorrectUC", "Lyy/a;", "stateMachineFactory", "Lfj0/i;", "updatePhoneContactDetailUseCase", "Lfj0/f;", "deletePhoneContactDetailUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Ld74/b;", "getWKTokenForMIDUC", "Lc73/b;", "setupData", "<init>", "(Ld73/d;Lib4/c;Ll63/b;Lj14/n;Lyy/a;Lfj0/i;Lfj0/f;Lac4/a;Ld74/b;Lc73/b;)V", "state", "Lc73/d$a;", "u9", "(Lc73/c;)Lc73/d$a;", "Ldx/b;", "error", "Liy/b0;", "phoneNumber", "prefix", "Ljb4/b;", "r9", "(Ldx/b;Liy/b0;Liy/b0;)Ljb4/b;", "b", "Ld73/d;", "c", "Lib4/c;", "d", "Ll63/b;", "e", "Lj14/n;", "f", "Lc73/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lc73/a$d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, c73.a> implements c73.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d73.d changePhoneNumberScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l63.b contactDetailsNavigationDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.n checkPhoneNumberCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, c73.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c73.a.d> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<c73.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c73.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f24021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f24022b;

        /* JADX INFO: renamed from: c73.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0643a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f24023a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f24024b;

            /* JADX INFO: renamed from: c73.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0644a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f24025d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f24026e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f24027f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f24029h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f24030j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f24031k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f24032l;

                public C0644a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f24025d = obj;
                    this.f24026e |= PKIFailureInfo.systemUnavail;
                    return C0643a.this.F(null, this);
                }
            }

            public C0643a(mu.h hVar, p pVar) {
                this.f24023a = hVar;
                this.f24024b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0644a c0644a;
                if (eVar instanceof C0644a) {
                    c0644a = (C0644a) eVar;
                    int i15 = c0644a.f24026e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0644a.f24026e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0644a = new C0644a(eVar);
                    }
                } else {
                    c0644a = new C0644a(eVar);
                }
                Object obj2 = c0644a.f24025d;
                Object objE = uq.b.e();
                int i16 = c0644a.f24026e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f24023a;
                    c73.d.Data dataU9 = this.f24024b.u9((State) obj);
                    c0644a.f24027f = vq.j.a(obj);
                    c0644a.f24029h = vq.j.a(c0644a);
                    c0644a.f24030j = vq.j.a(obj);
                    c0644a.f24031k = vq.j.a(hVar);
                    c0644a.f24032l = 0;
                    c0644a.f24026e = 1;
                    if (hVar.F(dataU9, c0644a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f24021a = gVar;
            this.f24022b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c73.d.Data> hVar, tq.e eVar) {
            Object objA = this.f24021a.a(new C0643a(hVar, this.f24022b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc73/a$e;", "<unused var>", "Lc73/c;", "Loq/i0;", "<anonymous>", "(Lc73/a$e;Lc73/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c73.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24033e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24033e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c73.a.d> bVarY1 = p.this.Y1();
                c73.a.d.C0641a c0641a = c73.a.d.C0641a.f23949a;
                this.f24033e = 1;
                if (bVarY1.F(c0641a, this) == objE) {
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
        public final Object w(c73.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return p.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc73/a$g;", "action", "Lk10/c0;", "Lc73/c;", "state", "Lk10/l;", "<anonymous>", "(Lc73/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<c73.a.OnChangePrefix, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24037g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c73.a.OnChangePrefix onChangePrefix, State state) {
            return State.b(state, hz.b.d.f86848c, null, onChangePrefix.getPrefix(), null, null, null, false, false, 250, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c73.a.OnChangePrefix onChangePrefix = (c73.a.OnChangePrefix) this.f24036f;
            c0 c0Var = (c0) this.f24037g;
            uq.b.e();
            if (this.f24035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c73.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(onChangePrefix, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c73.a.OnChangePrefix onChangePrefix, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f24036f = onChangePrefix;
            cVar.f24037g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc73/a$f;", "action", "Lk10/c0;", "Lc73/c;", "state", "Lk10/l;", "<anonymous>", "(Lc73/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<c73.a.OnChangeNumber, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f24040g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c73.a.OnChangeNumber onChangeNumber, State state) {
            return State.b(state, null, hz.b.d.f86848c, null, onChangeNumber.getPhoneNumber(), null, null, false, false, 245, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c73.a.OnChangeNumber onChangeNumber = (c73.a.OnChangeNumber) this.f24039f;
            c0 c0Var = (c0) this.f24040g;
            uq.b.e();
            if (this.f24038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c73.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(onChangeNumber, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c73.a.OnChangeNumber onChangeNumber, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f24039f = onChangeNumber;
            dVar.f24040g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc73/a$h;", "action", "Lk10/c0;", "Lc73/c;", "state", "Lk10/l;", "<anonymous>", "(Lc73/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<c73.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24042f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, null, null, null, false, false, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f24042f;
            uq.b.e();
            if (this.f24041e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: c73.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c73.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f24042f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc73/a$c;", "action", "Lk10/c0;", "Lc73/c;", "state", "Lk10/l;", "<anonymous>", "(Lc73/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<c73.a.EditPhoneNumber, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f24045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f24046h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f24047j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ac4.a f24049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d74.b f24050m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ fj0.i f24051n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc73/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f24052e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f24053f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f24054g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24055h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f24056j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d74.b f24057k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ c0<State> f24058l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.i f24059m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c73.a.EditPhoneNumber f24060n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p f24061p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, c0<State> c0Var, fj0.i iVar, c73.a.EditPhoneNumber editPhoneNumber, p pVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f24057k = bVar;
                this.f24058l = c0Var;
                this.f24059m = iVar;
                this.f24060n = editPhoneNumber;
                this.f24061p = pVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(State state) {
                return State.b(state, null, null, null, null, null, null, false, false, 191, null);
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:32:0x0106  */
            /* JADX WARN: Code duplicated, block: B:34:0x010a  */
            /* JADX WARN: Code duplicated, block: B:39:0x0162  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
            
                if (r2 == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
            
                if (r8.F(r9, r19) == r1) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0153, code lost:
            
                if (r5.F(r9, r19) == r1) goto L36;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 366
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c73.p.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f24057k, this.f24058l, this.f24059m, this.f24060n, this.f24061p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ac4.a aVar, d74.b bVar, fj0.i iVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f24049l = aVar;
            this.f24050m = bVar;
            this.f24051n = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(c73.a.EditPhoneNumber editPhoneNumber, hz.b bVar, hz.b bVar2, State state) {
            return State.b(state, bVar, bVar2, editPhoneNumber.getPrefix(), editPhoneNumber.getPhoneNumber(), null, null, false, true, 112, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, null, null, null, null, true, false, 191, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
        
            if (r12 == r0) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c73.p.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(c73.a.EditPhoneNumber editPhoneNumber, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = p.this.new f(this.f24049l, this.f24050m, this.f24051n, eVar);
            fVar.f24046h = editPhoneNumber;
            fVar.f24047j = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc73/a$b;", "<unused var>", "Lc73/c;", "Loq/i0;", "<anonymous>", "(Lc73/a$b;Lc73/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<c73.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24062e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24062e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<c73.a.d> bVarY1 = p.this.Y1();
                c73.a.d.ShowNavigationDialog showNavigationDialog = new c73.a.d.ShowNavigationDialog(p.this.contactDetailsNavigationDialogMapper.b(new l63.b.Params(m63.a.DELETE_PHONE_NUMBER, p.this.b9(c73.a.C0640a.f23944a), null, 4, null)));
                this.f24062e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(c73.a.b bVar, State state, tq.e<? super i0> eVar) {
            return p.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc73/a$a;", "<unused var>", "Lk10/c0;", "Lc73/c;", "state", "Lk10/l;", "<anonymous>", "(Lc73/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<c73.a.C0640a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ac4.a f24066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d74.b f24067h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ fj0.f f24068j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p f24069k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc73/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f24070e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f24071f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f24072g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f24073h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f24074j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f24075k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d74.b f24076l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.f f24077m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ p f24078n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0<State> f24079p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, fj0.f fVar, p pVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f24076l = bVar;
                this.f24077m = fVar;
                this.f24078n = pVar;
                this.f24079p = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:31:0x00de  */
            /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:39:0x0112  */
            /* JADX WARN: Code duplicated, block: B:42:0x0118  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
            
                if (r14 == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c73.p.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f24076l, this.f24077m, this.f24078n, this.f24079p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ac4.a aVar, d74.b bVar, fj0.f fVar, p pVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f24066g = aVar;
            this.f24067h = bVar;
            this.f24068j = fVar;
            this.f24069k = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f24065f;
            Object objE = uq.b.e();
            int i15 = this.f24064e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = this.f24066g;
            a aVar2 = new a(this.f24067h, this.f24068j, this.f24069k, c0Var, null);
            this.f24065f = vq.j.a(c0Var);
            this.f24064e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c73.a.C0640a c0640a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(this.f24066g, this.f24067h, this.f24068j, this.f24069k, eVar);
            hVar.f24065f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public p(d73.d dVar, ib4.c cVar, l63.b bVar, j14.n nVar, yy.a aVar, final fj0.i iVar, final fj0.f fVar, final ac4.a aVar2, final d74.b bVar2, SetupData setupData) {
        this.changePhoneNumberScreenMapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.contactDetailsNavigationDialogMapper = bVar;
        this.checkPhoneNumberCorrectUC = nVar;
        State state = new State(null, null, iy.c0.g('+' + iy.c0.e(setupData.getPrefix())), setupData.getPhoneNumber(), iy.c0.g('+' + iy.c0.e(setupData.getPrefix())), setupData.getPhoneNumber(), false, false, 195, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: c73.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f24008a, aVar2, bVar2, iVar, fVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, ac4.a aVar, d74.b bVar, fj0.i iVar, fj0.f fVar, z zVar) {
        b bVar2 = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c73.a.e.class), oVar, bVar2);
        zVar.v(q0.c(c73.a.OnChangePrefix.class), oVar, new c(null));
        zVar.v(q0.c(c73.a.OnChangeNumber.class), oVar, new d(null));
        zVar.v(q0.c(c73.a.h.class), oVar, new e(null));
        zVar.v(q0.c(c73.a.EditPhoneNumber.class), oVar, pVar.new f(aVar, bVar, iVar, null));
        zVar.x(q0.c(c73.a.b.class), oVar, pVar.new g(null));
        zVar.v(q0.c(c73.a.C0640a.class), oVar, new h(aVar, bVar, fVar, pVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b r9(dx.b error, final b0 phoneNumber, final b0 prefix) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: c73.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(phoneNumber, prefix, this, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    static /* synthetic */ jb4.b s9(p pVar, dx.b bVar, b0 b0Var, b0 b0Var2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            b0Var = null;
        }
        if ((i15 & 4) != 0) {
            b0Var2 = null;
        }
        return pVar.r9(bVar, b0Var, b0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(b0 b0Var, b0 b0Var2, p pVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            if (b0Var == null || b0Var2 == null) {
                pVar.d9(c73.a.b.f23945a);
            } else {
                pVar.d9(new c73.a.EditPhoneNumber(b0Var, b0Var2));
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c73.d.Data u9(State state) {
        return this.changePhoneNumberScreenMapper.b(new d73.d.Params(state, b9(c73.a.e.f23957a), new er.l() { // from class: c73.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.v9(this.f24002a, (b0) obj);
            }
        }, new er.l() { // from class: c73.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f24003a, (b0) obj);
            }
        }, b9(c73.a.b.f23945a), b9(c73.a.h.f23962a), new er.p() { // from class: c73.m
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.x9(this.f24004a, (b0) obj, (b0) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(p pVar, b0 b0Var) {
        pVar.d9(new c73.a.OnChangePrefix(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, b0 b0Var) {
        pVar.d9(new c73.a.OnChangeNumber(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, b0 b0Var, b0 b0Var2) {
        pVar.d9(new c73.a.EditPhoneNumber(b0Var2, b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, final ac4.a aVar, final d74.b bVar, final fj0.i iVar, final fj0.f fVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: c73.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f23997a, aVar, bVar, iVar, fVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c73.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, c73.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c73.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
