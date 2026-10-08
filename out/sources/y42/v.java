package y42;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030@8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u0010T¨\u0006V"}, d2 = {"Ly42/v;", "Ll00/g;", "Ly42/f;", "Ly42/d;", "Ly42/g;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lr44/b;", "downloadTransactionConfirmationUC", "Ld62/a;", "downloadConfirmationMapper", "Lz42/b;", "paymentResultMapper", "Lz42/a;", "paymentResultDialogMapper", "snackBarManagerStateHolder", "Lib4/c;", "genericErrorMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Ly42/e;", "setupData", "<init>", "(Lyy/a;Lr44/b;Ld62/a;Lz42/b;Lz42/a;Li70/n;Lib4/c;La14/m;Lcb4/j;Ly42/e;)V", "state", "Ly42/g$a;", "x9", "(Ly42/f;)Ly42/g$a;", "data", "Loq/i0;", "y9", "(Ly42/e;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lr44/b;", "c", "Ld62/a;", "d", "Lz42/b;", "e", "Lz42/a;", "f", "Li70/n;", "g", "Lib4/c;", "h", "La14/m;", "j", "Lcb4/j;", "k", "Ly42/e;", "Ly42/f$a;", "l", "Ly42/f$a;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ly42/d$h;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<y42.f, y42.d> implements y42.g, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r44.b downloadTransactionConfirmationUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d62.a downloadConfirmationMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z42.b paymentResultMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z42.a paymentResultDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private PaymentResultSetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final y42.f.a initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y42.f, y42.d> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y42.d.h> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<y42.g.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<y42.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f224112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f224113b;

        /* JADX INFO: renamed from: y42.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5999a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f224114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f224115b;

            /* JADX INFO: renamed from: y42.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6000a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f224116d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f224117e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f224118f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f224120h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f224121j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f224122k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f224123l;

                public C6000a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f224116d = obj;
                    this.f224117e |= PKIFailureInfo.systemUnavail;
                    return C5999a.this.F(null, this);
                }
            }

            public C5999a(mu.h hVar, v vVar) {
                this.f224114a = hVar;
                this.f224115b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6000a c6000a;
                if (eVar instanceof C6000a) {
                    c6000a = (C6000a) eVar;
                    int i15 = c6000a.f224117e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6000a.f224117e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6000a = new C6000a(eVar);
                    }
                } else {
                    c6000a = new C6000a(eVar);
                }
                Object obj2 = c6000a.f224116d;
                Object objE = uq.b.e();
                int i16 = c6000a.f224117e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f224114a;
                    y42.g.a aVarX9 = this.f224115b.x9((y42.f) obj);
                    c6000a.f224118f = vq.j.a(obj);
                    c6000a.f224120h = vq.j.a(c6000a);
                    c6000a.f224121j = vq.j.a(obj);
                    c6000a.f224122k = vq.j.a(hVar);
                    c6000a.f224123l = 0;
                    c6000a.f224117e = 1;
                    if (hVar.F(aVarX9, c6000a) == objE) {
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

        public a(mu.g gVar, v vVar) {
            this.f224112a = gVar;
            this.f224113b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super y42.g.a> hVar, tq.e eVar) {
            Object objA = this.f224112a.a(new C5999a(hVar, this.f224113b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly42/d$b;", "<unused var>", "Ly42/f;", "Loq/i0;", "<anonymous>", "(Ly42/d$b;Ly42/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<y42.d.b, y42.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224124e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224124e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y42.d.h> bVarY1 = v.this.Y1();
                y42.d.h.a aVar = y42.d.h.a.f224044a;
                this.f224124e = 1;
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
        public final Object w(y42.d.b bVar, y42.f fVar, tq.e<? super i0> eVar) {
            return v.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$f;", "action", "Ly42/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly42/d$f;Ly42/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<y42.d.HandleGenericError, y42.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224127f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(v vVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    vVar.d9(y42.d.l.f224050a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    vVar.d9(y42.d.b.f224038a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.d.HandleGenericError handleGenericError = (y42.d.HandleGenericError) this.f224127f;
            Object objE = uq.b.e();
            int i15 = this.f224126e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y42.d.h> bVarY1 = v.this.Y1();
                ib4.c cVar = v.this.genericErrorMapper;
                dx.b domainError = handleGenericError.getDomainError();
                final v vVar = v.this;
                y42.d.h.HandleGenericError handleGenericError2 = new y42.d.h.HandleGenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: y42.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.c.O(vVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f224127f = vq.j.a(handleGenericError);
                this.f224126e = 1;
                if (bVarY1.F(handleGenericError2, this) == objE) {
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
        public final Object w(y42.d.HandleGenericError handleGenericError, y42.f fVar, tq.e<? super i0> eVar) {
            c cVar = v.this.new c(eVar);
            cVar.f224127f = handleGenericError;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly42/d$i;", "<unused var>", "Ly42/f;", "Loq/i0;", "<anonymous>", "(Ly42/d$i;Ly42/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<y42.d.i, y42.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224129e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f224129e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.i iVar, y42.f fVar, tq.e<? super i0> eVar) {
            return v.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$a;", "<unused var>", "Ly42/f$b;", "state", "Loq/i0;", "<anonymous>", "(Ly42/d$a;Ly42/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<y42.d.a, y42.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224132f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.f.b bVar = (y42.f.b) this.f224132f;
            uq.b.e();
            if (this.f224131e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (bVar.getShouldBackToDetails()) {
                v.this.d9(y42.d.C5994d.f224040a);
            } else {
                v.this.d9(y42.d.b.f224038a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.a aVar, y42.f.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f224132f = bVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly42/d$m;", "action", "Lk10/c0;", "Ly42/f$a;", "state", "Lk10/l;", "Ly42/f;", "<anonymous>", "(Ly42/d$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<y42.d.Setup, k10.c0<y42.f.a>, tq.e<? super k10.l<? extends y42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224136g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y42.f.b O(y42.d.Setup setup, y42.f.a aVar) {
            return setup.getPaymentResultState();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final y42.d.Setup setup = (y42.d.Setup) this.f224135f;
            k10.c0 c0Var = (k10.c0) this.f224136g;
            uq.b.e();
            if (this.f224134e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: y42.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.f.O(setup, (f.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.Setup setup, k10.c0<y42.f.a> c0Var, tq.e<? super k10.l<? extends y42.f>> eVar) {
            f fVar = new f(eVar);
            fVar.f224135f = setup;
            fVar.f224136g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$k;", "<unused var>", "Ly42/f$b;", "state", "Loq/i0;", "<anonymous>", "(Ly42/d$k;Ly42/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<y42.d.k, y42.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224138f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.f.b bVar = (y42.f.b) this.f224138f;
            uq.b.e();
            if (this.f224137e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (bVar instanceof y42.f.b.Success) {
                v.this.d9(y42.d.c.f224039a);
            } else {
                if (!(bVar instanceof y42.f.b.Info) && !(bVar instanceof y42.f.b.a)) {
                    throw new oq.p();
                }
                v.this.d9(y42.d.C5994d.f224040a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.k kVar, y42.f.b bVar, tq.e<? super i0> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f224138f = bVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$n;", "action", "Ly42/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly42/d$n;Ly42/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<y42.d.ShowSnackBarNoIcon, y42.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224141f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.d.ShowSnackBarNoIcon showSnackBarNoIcon = (y42.d.ShowSnackBarNoIcon) this.f224141f;
            uq.b.e();
            if (this.f224140e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.ShowSnackBarNoIcon showSnackBarNoIcon, y42.f.b bVar, tq.e<? super i0> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f224141f = showSnackBarNoIcon;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$o;", "action", "Ly42/f$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly42/d$o;Ly42/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<y42.d.ShowSnackBarWithCloseIcon, y42.f.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224144f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.d.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (y42.d.ShowSnackBarWithCloseIcon) this.f224144f;
            uq.b.e();
            if (this.f224143e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, y42.f.b bVar, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f224144f = showSnackBarWithCloseIcon;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly42/d$c;", "<unused var>", "Lk10/c0;", "Ly42/f$b$c;", "state", "Lk10/l;", "Ly42/f;", "<anonymous>", "(Ly42/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<y42.d.c, k10.c0<y42.f.b.Success>, tq.e<? super k10.l<? extends y42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224147f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f224149a;

            static {
                int[] iArr = new int[r44.b.EnumC4371b.values().length];
                try {
                    iArr[r44.b.EnumC4371b.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[r44.b.EnumC4371b.FILE_NOT_SAVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f224149a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224147f;
            Object objE = uq.b.e();
            int i15 = this.f224146e;
            if (i15 == 0) {
                oq.u.b(obj);
                r44.b bVar = v.this.downloadTransactionConfirmationUC;
                r44.b.a.Payments payments = new r44.b.a.Payments(((y42.f.b.Success) c0Var.a()).getPaymentId());
                this.f224147f = c0Var;
                this.f224146e = 1;
                obj = bVar.c(payments, this);
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
            v vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                if (fr.t.c(bVar2, dx.b.g.e.f45078a) || fr.t.c(bVar2, dx.b.g.a.f45045a)) {
                    vVar.d9(new y42.d.ShowSnackBarWithCloseIcon(vVar.downloadConfirmationMapper.c()));
                    return c0Var.c();
                }
                vVar.d9(new y42.d.HandleGenericError(bVar2));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            r44.b.EnumC4371b enumC4371b = (r44.b.EnumC4371b) ((dx.i.Right) iVar).b();
            int i16 = a.f224149a[enumC4371b.ordinal()];
            if (i16 == 1) {
                vVar.d9(new y42.d.ShowSnackBarNoIcon(vVar.downloadConfirmationMapper.b(enumC4371b)));
                return c0Var.c();
            }
            if (i16 == 2 || i16 == 3) {
                vVar.d9(new y42.d.ShowSnackBarWithCloseIcon(vVar.downloadConfirmationMapper.b(enumC4371b)));
                return c0Var.c();
            }
            if (i16 != 4) {
                throw new oq.p();
            }
            vVar.d9(y42.d.j.f224048a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.c cVar, k10.c0<y42.f.b.Success> c0Var, tq.e<? super k10.l<? extends y42.f>> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f224147f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly42/d$j;", "<unused var>", "Lk10/c0;", "Ly42/f$b$c;", "state", "Lk10/l;", "Ly42/f;", "<anonymous>", "(Ly42/d$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<y42.d.j, k10.c0<y42.f.b.Success>, tq.e<? super k10.l<? extends y42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224151f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y42.f.b.Success O(v vVar, y42.f.b.Success success) {
            return y42.f.b.Success.h(success, null, null, null, false, vVar.dialogVMSFactory.a(vVar.paymentResultDialogMapper.b(new z42.a.Params(vVar.b9(y42.d.e.f224041a), vVar.b9(y42.d.g.f224043a)))), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224151f;
            uq.b.e();
            if (this.f224150e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.b(new er.l() { // from class: y42.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.k.O(vVar, (f.b.Success) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.j jVar, k10.c0<y42.f.b.Success> c0Var, tq.e<? super k10.l<? extends y42.f>> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f224151f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly42/d$e;", "<unused var>", "Ly42/f$b$c;", "Loq/i0;", "<anonymous>", "(Ly42/d$e;Ly42/f$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<y42.d.e, y42.f.b.Success, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224153e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f224153e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = v.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            v vVar = v.this;
            if (iVarA instanceof dx.i.Left) {
                vVar.d9(new y42.d.ShowSnackBarWithCloseIcon(vVar.downloadConfirmationMapper.a()));
            }
            v.this.d9(y42.d.g.f224043a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.e eVar, y42.f.b.Success success, tq.e<? super i0> eVar2) {
            return v.this.new l(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly42/d$g;", "<unused var>", "Lk10/c0;", "Ly42/f$b$c;", "state", "Lk10/l;", "Ly42/f;", "<anonymous>", "(Ly42/d$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<y42.d.g, k10.c0<y42.f.b.Success>, tq.e<? super k10.l<? extends y42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224156f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y42.f.b.Success O(y42.f.b.Success success) {
            return y42.f.b.Success.h(success, null, null, null, false, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f224156f;
            uq.b.e();
            if (this.f224155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: y42.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.m.O((f.b.Success) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.g gVar, k10.c0<y42.f.b.Success> c0Var, tq.e<? super k10.l<? extends y42.f>> eVar) {
            m mVar = new m(eVar);
            mVar.f224156f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly42/d$l;", "<unused var>", "Ly42/f$b$c;", "Loq/i0;", "<anonymous>", "(Ly42/d$l;Ly42/f$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<y42.d.l, y42.f.b.Success, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224157e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f224157e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(y42.d.c.f224039a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y42.d.l lVar, y42.f.b.Success success, tq.e<? super i0> eVar) {
            return v.this.new n(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$d;", "<unused var>", "Ly42/f$b$c;", "state", "Loq/i0;", "<anonymous>", "(Ly42/d$d;Ly42/f$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<y42.d.C5994d, y42.f.b.Success, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224160f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.f.b.Success success = (y42.f.b.Success) this.f224160f;
            Object objE = uq.b.e();
            int i15 = this.f224159e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y42.d.h> bVarY1 = v.this.Y1();
                y42.d.h.GoToDetailsAndRefresh goToDetailsAndRefresh = new y42.d.h.GoToDetailsAndRefresh(success.getPaymentId());
                this.f224160f = vq.j.a(success);
                this.f224159e = 1;
                if (bVarY1.F(goToDetailsAndRefresh, this) == objE) {
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
        public final Object w(y42.d.C5994d c5994d, y42.f.b.Success success, tq.e<? super i0> eVar) {
            o oVar = v.this.new o(eVar);
            oVar.f224160f = success;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$d;", "<unused var>", "Ly42/f$b$a;", "state", "Loq/i0;", "<anonymous>", "(Ly42/d$d;Ly42/f$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<y42.d.C5994d, y42.f.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224162e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224163f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.f.b.a aVar = (y42.f.b.a) this.f224163f;
            Object objE = uq.b.e();
            int i15 = this.f224162e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y42.d.h> bVarY1 = v.this.Y1();
                y42.d.h.GoToDetailsAndRefresh goToDetailsAndRefresh = new y42.d.h.GoToDetailsAndRefresh(aVar.getPaymentId());
                this.f224163f = vq.j.a(aVar);
                this.f224162e = 1;
                if (bVarY1.F(goToDetailsAndRefresh, this) == objE) {
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
        public final Object w(y42.d.C5994d c5994d, y42.f.b.a aVar, tq.e<? super i0> eVar) {
            p pVar = v.this.new p(eVar);
            pVar.f224163f = aVar;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly42/d$d;", "<unused var>", "Ly42/f$b$b;", "state", "Loq/i0;", "<anonymous>", "(Ly42/d$d;Ly42/f$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<y42.d.C5994d, y42.f.b.Info, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224166f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y42.f.b.Info info = (y42.f.b.Info) this.f224166f;
            Object objE = uq.b.e();
            int i15 = this.f224165e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y42.d.h> bVarY1 = v.this.Y1();
                y42.d.h.GoToDetailsAndRefresh goToDetailsAndRefresh = new y42.d.h.GoToDetailsAndRefresh(info.getPaymentId());
                this.f224166f = vq.j.a(info);
                this.f224165e = 1;
                if (bVarY1.F(goToDetailsAndRefresh, this) == objE) {
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
        public final Object w(y42.d.C5994d c5994d, y42.f.b.Info info, tq.e<? super i0> eVar) {
            q qVar = v.this.new q(eVar);
            qVar.f224166f = info;
            return qVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, r44.b bVar, d62.a aVar2, z42.b bVar2, z42.a aVar3, i70.n nVar, ib4.c cVar, a14.m mVar, cb4.j jVar, PaymentResultSetupData paymentResultSetupData) {
        this.downloadTransactionConfirmationUC = bVar;
        this.downloadConfirmationMapper = aVar2;
        this.paymentResultMapper = bVar2;
        this.paymentResultDialogMapper = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.genericErrorMapper = cVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.setupData = paymentResultSetupData;
        y42.f.a aVar4 = y42.f.a.f224055a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: y42.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f224098a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), x9(aVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(v vVar, k10.z zVar) {
        b bVar = vVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y42.d.b.class), oVar, bVar);
        zVar.x(q0.c(y42.d.HandleGenericError.class), oVar, vVar.new c(null));
        zVar.x(q0.c(y42.d.i.class), oVar, vVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(v vVar, k10.z zVar) {
        e eVar = vVar.new e(null);
        zVar.x(q0.c(y42.d.a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(k10.z zVar) {
        f fVar = new f(null);
        zVar.v(q0.c(y42.d.Setup.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(v vVar, k10.z zVar) {
        g gVar = vVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y42.d.k.class), oVar, gVar);
        zVar.x(q0.c(y42.d.ShowSnackBarNoIcon.class), oVar, vVar.new h(null));
        zVar.x(q0.c(y42.d.ShowSnackBarWithCloseIcon.class), oVar, vVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(v vVar, k10.z zVar) {
        j jVar = vVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(y42.d.c.class), oVar, jVar);
        zVar.v(q0.c(y42.d.j.class), oVar, vVar.new k(null));
        zVar.x(q0.c(y42.d.e.class), oVar, vVar.new l(null));
        zVar.v(q0.c(y42.d.g.class), oVar, new m(null));
        zVar.x(q0.c(y42.d.l.class), oVar, vVar.new n(null));
        zVar.x(q0.c(y42.d.C5994d.class), oVar, vVar.new o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(v vVar, k10.z zVar) {
        p pVar = vVar.new p(null);
        zVar.x(q0.c(y42.d.C5994d.class), k10.o.CANCEL_PREVIOUS, pVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(v vVar, k10.z zVar) {
        q qVar = vVar.new q(null);
        zVar.x(q0.c(y42.d.C5994d.class), k10.o.CANCEL_PREVIOUS, qVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y42.g.a x9(y42.f state) {
        return this.paymentResultMapper.b(new z42.b.Params(state, b9(y42.d.a.f224037a), b9(y42.d.k.f224049a), b9(y42.d.b.f224038a), b9(y42.d.i.f224047a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(y42.f.class), new er.l() { // from class: y42.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f224092a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.b.class), new er.l() { // from class: y42.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f224093a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.a.class), new er.l() { // from class: y42.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9((k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.b.class), new er.l() { // from class: y42.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f224094a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.b.Success.class), new er.l() { // from class: y42.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.E9(this.f224095a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.b.a.class), new er.l() { // from class: y42.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.F9(this.f224096a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(y42.f.b.Info.class), new er.l() { // from class: y42.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.G9(this.f224097a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<y42.d.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<y42.f, y42.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y42.g.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentResultSetupData data) {
        this.setupData = data;
        d9(new y42.d.Setup(data.getResult()));
    }
}
