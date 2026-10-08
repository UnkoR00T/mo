package ak1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.time.OffsetDateTime;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp0.DefenceTrainingDay;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030M8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010#\u001a\b\u0012\u0004\u0012\u00020$0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010Z¨\u0006\\"}, d2 = {"Lak1/t;", "Ll00/g;", "Lak1/e;", "Lak1/c;", "Lak1/f;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lbk1/a;", "mapper", "La14/o;", "goToMapIntentUC", "snackBarManagerStateHolder", "Lwi1/h;", "unregisterForDefenceTrainingUC", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lmx/c;", "labelProvider", "La14/a;", "addEventToCalendarUseCase", "Lac4/a;", "loaderUseCase", "Lak1/d;", "setupData", "<init>", "(Lyy/a;Lbk1/a;La14/o;Li70/n;Lwi1/h;Lib4/c;Lhb4/d;Lmx/c;La14/a;Lac4/a;Lak1/d;)V", "", "trainingId", "Lcb4/d;", "x9", "(I)Lcb4/d;", "state", "Lak1/f$a;", "C9", "(Lak1/e;)Lak1/f$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lbk1/a;", "c", "La14/o;", "d", "Li70/n;", "e", "Lwi1/h;", "f", "Lib4/c;", "g", "Lhb4/d;", "h", "Lmx/c;", "j", "La14/a;", "k", "Lac4/a;", "l", "Lak1/d;", "Lak1/e$a;", "m", "Lak1/e$a;", "initialState", "Lxw/b;", "Lak1/c$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<ak1.e, ak1.c> implements ak1.f, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bk1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.o goToMapIntentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wi1.h unregisterForDefenceTrainingUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.a addEventToCalendarUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ak1.e.Content initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ak1.c.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ak1.e, ak1.c> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<ak1.f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ak1.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f7096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f7097b;

        /* JADX INFO: renamed from: ak1.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0154a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f7098a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f7099b;

            /* JADX INFO: renamed from: ak1.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0155a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7100d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f7101e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f7102f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f7104h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f7105j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f7106k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f7107l;

                public C0155a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f7100d = obj;
                    this.f7101e |= PKIFailureInfo.systemUnavail;
                    return C0154a.this.F(null, this);
                }
            }

            public C0154a(mu.h hVar, t tVar) {
                this.f7098a = hVar;
                this.f7099b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0155a c0155a;
                if (eVar instanceof C0155a) {
                    c0155a = (C0155a) eVar;
                    int i15 = c0155a.f7101e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0155a.f7101e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0155a = new C0155a(eVar);
                    }
                } else {
                    c0155a = new C0155a(eVar);
                }
                Object obj2 = c0155a.f7100d;
                Object objE = uq.b.e();
                int i16 = c0155a.f7101e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f7098a;
                    ak1.f.a aVarC9 = this.f7099b.C9((ak1.e) obj);
                    c0155a.f7102f = vq.j.a(obj);
                    c0155a.f7104h = vq.j.a(c0155a);
                    c0155a.f7105j = vq.j.a(obj);
                    c0155a.f7106k = vq.j.a(hVar);
                    c0155a.f7107l = 0;
                    c0155a.f7101e = 1;
                    if (hVar.F(aVarC9, c0155a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f7096a = gVar;
            this.f7097b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ak1.f.a> hVar, tq.e eVar) {
            Object objA = this.f7096a.a(new C0154a(hVar, this.f7097b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak1/c$b;", "<unused var>", "Lak1/e;", "Loq/i0;", "<anonymous>", "(Lak1/c$b;Lak1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ak1.c.b, ak1.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7108e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7108e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ak1.c.e.a aVar = ak1.c.e.a.f7049a;
                this.f7108e = 1;
                if (tVar.F(aVar, this) == objE) {
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
        public final Object w(ak1.c.b bVar, ak1.e eVar, tq.e<? super i0> eVar2) {
            return t.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lak1/c$g;", "action", "Lk10/c0;", "Lak1/e;", "state", "Lk10/l;", "<anonymous>", "(Lak1/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ak1.c.SendGiveUp, c0<ak1.e>, tq.e<? super k10.l<? extends ak1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f7112g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lak1/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ak1.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7114e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f7115f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ak1.c.SendGiveUp f7116g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<ak1.e> f7117h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, ak1.c.SendGiveUp sendGiveUp, c0<ak1.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f7115f = tVar;
                this.f7116g = sendGiveUp;
                this.f7117h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ak1.e.Error Y(final t tVar, dx.b bVar, final ak1.c.SendGiveUp sendGiveUp, ak1.e eVar) {
                return new ak1.e.Error(tVar.errorVMSFactory.a(tVar.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ak1.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.c.a.Z(tVar, sendGiveUp, (ib4.c.b) obj);
                    }
                }, 2, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Z(t tVar, ak1.c.SendGiveUp sendGiveUp, ib4.c.b bVar) {
                tVar.d9(new ak1.c.HandleErrorAction(bVar, sendGiveUp));
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ak1.e.c a0(ak1.e eVar) {
                return ak1.e.c.f7058a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f7114e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    wi1.h hVar = this.f7115f.unregisterForDefenceTrainingUC;
                    wi1.h.Params params = new wi1.h.Params(this.f7116g.getTrainingId());
                    this.f7114e = 1;
                    obj = hVar.e(params, this);
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
                c0<ak1.e> c0Var = this.f7117h;
                final t tVar = this.f7115f;
                final ak1.c.SendGiveUp sendGiveUp = this.f7116g;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ak1.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.a.Y(tVar, bVar, sendGiveUp, (e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: ak1.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.a.a0((e) obj2);
                    }
                });
            }

            public final tq.e<i0> V(tq.e<?> eVar) {
                return new a(this.f7115f, this.f7116g, this.f7117h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ak1.e>> eVar) {
                return ((a) V(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ak1.c.SendGiveUp sendGiveUp = (ak1.c.SendGiveUp) this.f7111f;
            c0 c0Var = (c0) this.f7112g;
            Object objE = uq.b.e();
            int i15 = this.f7110e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.loaderUseCase;
            a aVar2 = new a(t.this, sendGiveUp, c0Var, null);
            this.f7111f = vq.j.a(sendGiveUp);
            this.f7112g = vq.j.a(c0Var);
            this.f7110e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ak1.c.SendGiveUp sendGiveUp, c0<ak1.e> c0Var, tq.e<? super k10.l<? extends ak1.e>> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f7111f = sendGiveUp;
            cVar.f7112g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lak1/c$c;", "<unused var>", "Lak1/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lak1/c$c;Lak1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ak1.c.C0151c, ak1.e.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7119f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ak1.e.Content content = (ak1.e.Content) this.f7119f;
            Object objE = uq.b.e();
            int i15 = this.f7118e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ak1.c.e.ShowDialog showDialog = new ak1.c.e.ShowDialog(t.this.x9(content.getTraining().getTraining().getId()));
                this.f7119f = vq.j.a(content);
                this.f7118e = 1;
                if (tVar.F(showDialog, this) == objE) {
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
        public final Object w(ak1.c.C0151c c0151c, ak1.e.Content content, tq.e<? super i0> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f7119f = content;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lak1/c$f;", "<unused var>", "Lak1/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lak1/c$f;Lak1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ak1.c.f, ak1.e.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7122f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ak1.e.Content content = (ak1.e.Content) this.f7122f;
            Object objE = uq.b.e();
            int i15 = this.f7121e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.o oVar = t.this.goToMapIntentUC;
                a14.o.a.ByCoordinates byCoordinates = new a14.o.a.ByCoordinates(content.getTraining().getUnit().getCoordinates(), content.getTraining().getUnit().getName());
                this.f7122f = vq.j.a(content);
                this.f7121e = 1;
                obj = oVar.c(byCoordinates, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ak1.c.f fVar, ak1.e.Content content, tq.e<? super i0> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f7122f = content;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lak1/c$a;", "<unused var>", "Lak1/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lak1/c$a;Lak1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ak1.c.a, ak1.e.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7125f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fz.b.OffsetDateTime endDate;
            OffsetDateTime date;
            fz.b.OffsetDateTime startDate;
            OffsetDateTime date2;
            ak1.e.Content content = (ak1.e.Content) this.f7125f;
            Object objE = uq.b.e();
            int i15 = this.f7124e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.a aVar = t.this.addEventToCalendarUseCase;
                String name = content.getTraining().getTraining().getName();
                DefenceTrainingDay defenceTrainingDay = (DefenceTrainingDay) pq.v.n0(content.getTraining().getTraining().a());
                long jK = (defenceTrainingDay == null || (startDate = defenceTrainingDay.getStartDate()) == null || (date2 = startDate.getDate()) == null) ? 0L : ez.d.k(date2);
                DefenceTrainingDay defenceTrainingDay2 = (DefenceTrainingDay) pq.v.z0(content.getTraining().getTraining().a());
                a14.a.Params params = new a14.a.Params(name, jK, (defenceTrainingDay2 == null || (endDate = defenceTrainingDay2.getEndDate()) == null || (date = endDate.getDate()) == null) ? null : vq.b.f(ez.d.k(date)), false, null, content.getTraining().getUnit().getAddress(), 16, null);
                this.f7125f = vq.j.a(content);
                this.f7124e = 1;
                obj = aVar.c(params, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ak1.c.a aVar, ak1.e.Content content, tq.e<? super i0> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f7125f = content;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak1/c$h;", "<unused var>", "Lak1/e$a;", "Loq/i0;", "<anonymous>", "(Lak1/c$h;Lak1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ak1.c.h, ak1.e.Content, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7127e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7127e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ak1.c.e.C0152c c0152c = ak1.c.e.C0152c.f7051a;
                this.f7127e = 1;
                if (tVar.F(c0152c, this) == objE) {
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
        public final Object w(ak1.c.h hVar, ak1.e.Content content, tq.e<? super i0> eVar) {
            return t.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lak1/c$d;", "action", "Lk10/c0;", "Lak1/e$b;", "state", "Lk10/l;", "Lak1/e;", "<anonymous>", "(Lak1/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ak1.c.HandleErrorAction, c0<ak1.e.Error>, tq.e<? super k10.l<? extends ak1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f7131g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ak1.e.Content O(t tVar, ak1.e.Error error) {
            return new ak1.e.Content(tVar.setupData.getTraining());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ak1.c.HandleErrorAction handleErrorAction = (ak1.c.HandleErrorAction) this.f7130f;
            c0 c0Var = (c0) this.f7131g;
            uq.b.e();
            if (this.f7129e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(handleErrorAction.getAction(), ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                t.this.d9(handleErrorAction.getRetryAction());
                return c0Var.c();
            }
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: ak1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(tVar, (e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ak1.c.HandleErrorAction handleErrorAction, c0<ak1.e.Error> c0Var, tq.e<? super k10.l<? extends ak1.e>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f7130f = handleErrorAction;
            hVar.f7131g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, bk1.a aVar2, a14.o oVar, i70.n nVar, wi1.h hVar, ib4.c cVar, hb4.d dVar, mx.c cVar2, a14.a aVar3, ac4.a aVar4, SetupData setupData) {
        this.mapper = aVar2;
        this.goToMapIntentUC = oVar;
        this.snackBarManagerStateHolder = nVar;
        this.unregisterForDefenceTrainingUC = hVar;
        this.genericDomainErrorMapper = cVar;
        this.errorVMSFactory = dVar;
        this.labelProvider = cVar2;
        this.addEventToCalendarUseCase = aVar3;
        this.loaderUseCase = aVar4;
        this.setupData = setupData;
        ak1.e.Content content = new ak1.e.Content(setupData.getTraining());
        this.initialState = content;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(content, new er.l() { // from class: ak1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f7081a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), C9(content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ak1.f.a C9(ak1.e state) {
        return this.mapper.b(new bk1.a.Params(state, b9(ak1.c.b.f7045a), b9(ak1.c.C0151c.f7046a), b9(ak1.c.f.f7052a), b9(ak1.c.a.f7044a), b9(ak1.c.h.f7054a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(ak1.e.class), new er.l() { // from class: ak1.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(this.f7076a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ak1.e.Content.class), new er.l() { // from class: ak1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f7077a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ak1.e.Error.class), new er.l() { // from class: ak1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f7078a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ak1.c.b.class), oVar, bVar);
        zVar.v(q0.c(ak1.c.SendGiveUp.class), oVar, tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, k10.z zVar) {
        d dVar = tVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ak1.c.C0151c.class), oVar, dVar);
        zVar.x(q0.c(ak1.c.f.class), oVar, tVar.new e(null));
        zVar.x(q0.c(ak1.c.a.class), oVar, tVar.new f(null));
        zVar.x(q0.c(ak1.c.h.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, k10.z zVar) {
        h hVar = tVar.new h(null);
        zVar.v(q0.c(ak1.c.HandleErrorAction.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData x9(final int trainingId) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(ri1.b.f174391m1), this.labelProvider.c(ri1.b.f174388l1), new DialogButtonTextData(this.labelProvider.c(ri1.b.f174385k1), cb4.a.C0668a.f24967a, new er.a() { // from class: ak1.p
            @Override // er.a
            public final Object a() {
                return t.y9(this.f7079a, trainingId);
            }
        }), new DialogButtonTextData(this.labelProvider.c(ri1.b.f174362e), null, new er.a() { // from class: ak1.q
            @Override // er.a
            public final Object a() {
                return t.z9();
            }
        }, 2, null), null, new er.a() { // from class: ak1.r
            @Override // er.a
            public final Object a() {
                return t.A9();
            }
        }, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, int i15) {
        tVar.d9(new ak1.c.SendGiveUp(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9() {
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ak1.c.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<ak1.c.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ak1.e, ak1.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ak1.f.a> getState() {
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
}
