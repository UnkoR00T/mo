package g63;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xi0.ContactDetailsConfirmation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R,\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030@8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010DR \u0010N\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0O8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bT\u0010F\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lg63/q;", "Ll00/g;", "Lg63/c;", "Lg63/a;", "Lg63/d;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Ld74/b;", "getWKTokenForMIDUC", "Lf53/b;", "checkVerificationCodeUseCase", "Lfj0/a;", "confirmUpdateEmailContactDetailUseCase", "Lfj0/b;", "confirmUpdatePhoneContactDetailUseCase", "Lh63/b;", "codeContactDetailsMapper", "Ll63/b;", "contactDetailsNavigationDialogMapper", "Lib4/c;", "genericDomainErrorMapper", "Lg63/b;", "setupData", "<init>", "(Lyy/a;Lac4/a;Ld74/b;Lf53/b;Lfj0/a;Lfj0/b;Lh63/b;Ll63/b;Lib4/c;Lg63/b;)V", "state", "Lg63/d$a;", "y9", "(Lg63/c;)Lg63/d$a;", "Ldx/b;", "domainError", "", "code", "Li63/b;", "type", "Ljb4/b;", "w9", "(Ldx/b;Ljava/lang/String;Li63/b;)Ljb4/b;", "b", "Lac4/a;", "c", "Ld74/b;", "d", "Lf53/b;", "e", "Lfj0/a;", "f", "Lfj0/b;", "g", "Lh63/b;", "h", "Ll63/b;", "j", "Lib4/c;", "k", "Lg63/b;", "getSetupData", "()Lg63/b;", "l", "Lg63/c;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lg63/a$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, g63.a> implements g63.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d74.b getWKTokenForMIDUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f53.b checkVerificationCodeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fj0.a confirmUpdateEmailContactDetailUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final fj0.b confirmUpdatePhoneContactDetailUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h63.b codeContactDetailsMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l63.b contactDetailsNavigationDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, g63.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g63.a.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<g63.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g63.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f70990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f70991b;

        /* JADX INFO: renamed from: g63.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1610a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f70992a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f70993b;

            /* JADX INFO: renamed from: g63.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1611a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f70994d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f70995e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f70996f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f70998h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f70999j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f71000k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f71001l;

                public C1611a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f70994d = obj;
                    this.f70995e |= PKIFailureInfo.systemUnavail;
                    return C1610a.this.F(null, this);
                }
            }

            public C1610a(mu.h hVar, q qVar) {
                this.f70992a = hVar;
                this.f70993b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1611a c1611a;
                if (eVar instanceof C1611a) {
                    c1611a = (C1611a) eVar;
                    int i15 = c1611a.f70995e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1611a.f70995e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1611a = new C1611a(eVar);
                    }
                } else {
                    c1611a = new C1611a(eVar);
                }
                Object obj2 = c1611a.f70994d;
                Object objE = uq.b.e();
                int i16 = c1611a.f70995e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f70992a;
                    g63.d.Data dataY9 = this.f70993b.y9((State) obj);
                    c1611a.f70996f = vq.j.a(obj);
                    c1611a.f70998h = vq.j.a(c1611a);
                    c1611a.f70999j = vq.j.a(obj);
                    c1611a.f71000k = vq.j.a(hVar);
                    c1611a.f71001l = 0;
                    c1611a.f70995e = 1;
                    if (hVar.F(dataY9, c1611a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f70990a = gVar;
            this.f70991b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g63.d.Data> hVar, tq.e eVar) {
            Object objA = this.f70990a.a(new C1610a(hVar, this.f70991b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg63/a$c;", "action", "Lg63/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg63/a$c;Lg63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<g63.a.HandleError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71002e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71003f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g63.a.HandleError handleError = (g63.a.HandleError) this.f71003f;
            Object objE = uq.b.e();
            int i15 = this.f71002e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g63.a.e> bVarY1 = q.this.Y1();
                g63.a.e.Error error = new g63.a.e.Error(handleError.getErrorData());
                this.f71003f = vq.j.a(handleError);
                this.f71002e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(g63.a.HandleError handleError, State state, tq.e<? super i0> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f71003f = handleError;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg63/a$g;", "<unused var>", "Lg63/c;", "Loq/i0;", "<anonymous>", "(Lg63/a$g;Lg63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g63.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71005e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71005e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g63.a.e> bVarY1 = q.this.Y1();
                g63.a.e.C1608a c1608a = g63.a.e.C1608a.f70927a;
                this.f71005e = 1;
                if (bVarY1.F(c1608a, this) == objE) {
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
        public final Object w(g63.a.g gVar, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg63/a$b;", "action", "Lg63/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg63/a$b;Lg63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<g63.a.FinishProcessSuccessfully, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71008f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m63.b bVar;
            g63.a.FinishProcessSuccessfully finishProcessSuccessfully = (g63.a.FinishProcessSuccessfully) this.f71008f;
            Object objE = uq.b.e();
            int i15 = this.f71007e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g63.a.e> bVarY1 = q.this.Y1();
                i63.b type = finishProcessSuccessfully.getType();
                if (type instanceof i63.b.a) {
                    bVar = m63.b.a.f123885b;
                } else {
                    if (!(type instanceof i63.b.Phone)) {
                        throw new oq.p();
                    }
                    bVar = m63.b.c.f123887b;
                }
                g63.a.e.CloseWithSnackBarSuccessMessage closeWithSnackBarSuccessMessage = new g63.a.e.CloseWithSnackBarSuccessMessage(bVar);
                this.f71008f = vq.j.a(finishProcessSuccessfully);
                this.f71007e = 1;
                if (bVarY1.F(closeWithSnackBarSuccessMessage, this) == objE) {
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
        public final Object w(g63.a.FinishProcessSuccessfully finishProcessSuccessfully, State state, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f71008f = finishProcessSuccessfully;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg63/a$f;", "<unused var>", "Lg63/c;", "state", "Loq/i0;", "<anonymous>", "(Lg63/a$f;Lg63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<g63.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71011f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f71011f;
            Object objE = uq.b.e();
            int i15 = this.f71010e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (state.getSkipConfirmation()) {
                    q.this.d9(g63.a.g.f70934a);
                } else {
                    xw.b<g63.a.e> bVarY1 = q.this.Y1();
                    g63.a.e.ShowNavigationDialog showNavigationDialog = new g63.a.e.ShowNavigationDialog(q.this.contactDetailsNavigationDialogMapper.b(new l63.b.Params(m63.a.SAVE_TEMPORARY_DATA, q.this.b9(g63.a.g.f70934a), null, 4, null)));
                    this.f71011f = vq.j.a(state);
                    this.f71010e = 1;
                    if (bVarY1.F(showNavigationDialog, this) == objE) {
                        return objE;
                    }
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
        public final Object w(g63.a.f fVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f71011f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg63/a$d;", "action", "Lg63/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg63/a$d;Lg63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<g63.a.Lock, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71014f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g63.a.Lock lock = (g63.a.Lock) this.f71014f;
            Object objE = uq.b.e();
            int i15 = this.f71013e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<g63.a.e> bVarY1 = q.this.Y1();
                g63.a.e.CodeLockScreen codeLockScreen = new g63.a.e.CodeLockScreen(lock.getData());
                this.f71014f = vq.j.a(lock);
                this.f71013e = 1;
                if (bVarY1.F(codeLockScreen, this) == objE) {
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
        public final Object w(g63.a.Lock lock, State state, tq.e<? super i0> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f71014f = lock;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg63/a$a;", "action", "Lk10/c0;", "Lg63/c;", "state", "Lk10/l;", "<anonymous>", "(Lg63/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<g63.a.CodeChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f71018g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(g63.a.CodeChange codeChange, State state) {
            return State.b(state, false, null, null, codeChange.getCode(), hz.b.d.f86848c, false, 39, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g63.a.CodeChange codeChange = (g63.a.CodeChange) this.f71017f;
            c0 c0Var = (c0) this.f71018g;
            uq.b.e();
            if (this.f71016e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: g63.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O(codeChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g63.a.CodeChange codeChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f71017f = codeChange;
            gVar.f71018g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg63/a$h;", "action", "Lk10/c0;", "Lg63/c;", "state", "Lk10/l;", "<anonymous>", "(Lg63/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<g63.a.h, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f71020f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, null, null, null, null, false, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f71020f;
            uq.b.e();
            if (this.f71019e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: g63.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.h.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g63.a.h hVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar2 = new h(eVar);
            hVar2.f71020f = c0Var;
            return hVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg63/a$i;", "action", "Lk10/c0;", "Lg63/c;", "state", "Lk10/l;", "<anonymous>", "(Lg63/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<g63.a.VerifyCode, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f71021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f71022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f71023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f71024h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lg63/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f71026e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f71027f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f71028g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f71029h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f71030j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ q f71031k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ g63.a.VerifyCode f71032l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<State> f71033m;

            /* JADX INFO: renamed from: g63.q$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1612a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f71034a;

                static {
                    int[] iArr = new int[xi0.g.values().length];
                    try {
                        iArr[xi0.g.CONFIRMED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[xi0.g.INCORRECT_CONFIRMATION_CODE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[xi0.g.ATTEMPT_LIMIT_EXCEEDED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[xi0.g.EXPIRED_CODE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[xi0.g.NOTHING_TO_CONFIRM.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[xi0.g.UNKNOWN.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f71034a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, g63.a.VerifyCode verifyCode, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f71031k = qVar;
                this.f71032l = verifyCode;
                this.f71033m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State X(State state) {
                return State.b(state, false, null, null, null, hz.b.C2039b.f86846c, false, 47, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State Y(ContactDetailsConfirmation contactDetailsConfirmation, State state) {
                Label labelC;
                String message = contactDetailsConfirmation.getMessage();
                if (message == null || (labelC = mx.b.b(message, "incorrectConfirmationMessage")) == null) {
                    labelC = Label.INSTANCE.c();
                }
                return State.b(state, false, null, null, null, new hz.b.Invalid(labelC), false, 47, null);
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0101  */
            /* JADX WARN: Code duplicated, block: B:36:0x0122  */
            /* JADX WARN: Code duplicated, block: B:38:0x0126  */
            /* JADX WARN: Code duplicated, block: B:40:0x013d  */
            /* JADX WARN: Code duplicated, block: B:42:0x0143  */
            /* JADX WARN: Code duplicated, block: B:44:0x0148  */
            /* JADX WARN: Code duplicated, block: B:46:0x0162  */
            /* JADX WARN: Code duplicated, block: B:48:0x016c  */
            /* JADX WARN: Code duplicated, block: B:50:0x018c  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
            
                if (r2 == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00f2, code lost:
            
                if (r2 == r1) goto L30;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 430
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: g63.q.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f71031k, this.f71032l, this.f71033m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, g63.a.VerifyCode verifyCode, State state) {
            return State.b(state, false, null, null, verifyCode.getCode(), (hz.b.Invalid) bVar, true, 7, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
        
            if (r12 == r2) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f71023g
                g63.a$i r0 = (g63.a.VerifyCode) r0
                java.lang.Object r1 = r11.f71024h
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r11.f71022f
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L26
                if (r3 != r4) goto L1e
                java.lang.Object r0 = r11.f71021e
                hz.b r0 = (hz.b) r0
                oq.u.b(r12)
                goto L89
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L26:
                oq.u.b(r12)
                goto L49
            L2a:
                oq.u.b(r12)
                g63.q r12 = g63.q.this
                f53.b r12 = g63.q.q9(r12)
                f53.b$a r3 = new f53.b$a
                java.lang.String r6 = r0.getCode()
                r3.<init>(r6)
                r11.f71023g = r0
                r11.f71024h = r1
                r11.f71022f = r5
                java.lang.Object r12 = r12.f(r3, r11)
                if (r12 != r2) goto L49
                goto L88
            L49:
                hz.g r12 = (hz.g) r12
                hz.b r12 = r12.a()
                boolean r3 = r12 instanceof hz.b.Invalid
                if (r3 == 0) goto L5d
                g63.t r2 = new g63.t
                r2.<init>()
                k10.l r12 = r1.b(r2)
                return r12
            L5d:
                g63.q r3 = g63.q.this
                ac4.a r5 = g63.q.p9(r3)
                g63.q$i$a r7 = new g63.q$i$a
                g63.q r3 = g63.q.this
                r6 = 0
                r7.<init>(r3, r0, r1, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r11.f71023g = r0
                java.lang.Object r0 = vq.j.a(r1)
                r11.f71024h = r0
                java.lang.Object r12 = vq.j.a(r12)
                r11.f71021e = r12
                r11.f71022f = r4
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r2) goto L89
            L88:
                return r2
            L89:
                k10.l r12 = (k10.l) r12
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: g63.q.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g63.a.VerifyCode verifyCode, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f71023g = verifyCode;
            iVar.f71024h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ac4.a aVar2, d74.b bVar, f53.b bVar2, fj0.a aVar3, fj0.b bVar3, h63.b bVar4, l63.b bVar5, ib4.c cVar, SetupData setupData) {
        this.callActionWithLoaderUseCase = aVar2;
        this.getWKTokenForMIDUC = bVar;
        this.checkVerificationCodeUseCase = bVar2;
        this.confirmUpdateEmailContactDetailUseCase = aVar3;
        this.confirmUpdatePhoneContactDetailUseCase = bVar3;
        this.codeContactDetailsMapper = bVar4;
        this.contactDetailsNavigationDialogMapper = bVar5;
        this.genericDomainErrorMapper = cVar;
        this.setupData = setupData;
        State state = new State(setupData.getSkipConfirmation(), setupData.getCodeMode(), setupData.getType(), "", null, false, 48, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: g63.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f70976a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), y9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, String str, i63.b bVar) {
        qVar.d9(new g63.a.VerifyCode(str, bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: g63.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f70969a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: g63.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f70970a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(g63.a.HandleError.class), oVar, bVar);
        zVar.x(q0.c(g63.a.g.class), oVar, qVar.new c(null));
        zVar.x(q0.c(g63.a.FinishProcessSuccessfully.class), oVar, qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(q qVar, z zVar) {
        e eVar = qVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(g63.a.f.class), oVar, eVar);
        zVar.x(q0.c(g63.a.Lock.class), oVar, qVar.new f(null));
        zVar.v(q0.c(g63.a.CodeChange.class), oVar, new g(null));
        zVar.v(q0.c(g63.a.h.class), oVar, new h(null));
        zVar.v(q0.c(g63.a.VerifyCode.class), oVar, qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b w9(dx.b domainError, final String code, final i63.b type) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: g63.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f70973a, code, type, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, String str, i63.b bVar, ib4.c.b bVar2) {
        if ((bVar2 instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            qVar.d9(new g63.a.VerifyCode(str, bVar));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g63.d.Data y9(State state) {
        return this.codeContactDetailsMapper.b(new h63.b.Params(state, b9(g63.a.f.f70933a), new er.l() { // from class: g63.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f70971a, (String) obj);
            }
        }, b9(g63.a.h.f70935a), new er.p() { // from class: g63.n
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return q.A9(this.f70972a, (String) obj, (i63.b) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, String str) {
        qVar.d9(new g63.a.CodeChange(str));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<g63.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, g63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g63.d.Data> getState() {
        return this.state;
    }
}
