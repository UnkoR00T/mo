package v90;

import cf0.AsyncDocumentToGenerate;
import cf0.DownloadTaskData;
import cf0.WorkerInfo;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import x80.StartActivationResponse;
import z70.ActivationChallengeWithKeysResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B£\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0001\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010c\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR \u00102\u001a\b\u0012\u0004\u0012\u0002030j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006o"}, d2 = {"Lv90/z;", "Ll00/g;", "Lv90/b;", "Lv90/a;", "Lv90/c;", "", "Lyy/a;", "stateMachineFactory", "Lw90/e;", "mapper", "Ly80/c;", "startJuniorActivationUC", "La80/d;", "generateActivationChallengeUC", "Ls90/a;", "activateApplicationUC", "Ldf0/f;", "initDownloadTaskWorkUC", "Ldf0/i;", "observeAsyncDownloadWorkersUC", "Leg0/w;", "saveUserCertUC", "Leg0/o;", "isDocumentAddedByIDUC", "Ldf0/d;", "getMainDocumentActiveTaskDataUC", "Ldf0/o;", "restartDownloadTaskWorkUC", "Ldf0/l;", "observeDownloadTaskDataUC", "Ldf0/g;", "interruptDownloadTaskWorkUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lw90/d;", "activationErrorMapper", "Lsc0/c;", "resetLoginLockCountsUC", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lv90/o;", "setupData", "<init>", "(Lyy/a;Lw90/e;Ly80/c;La80/d;Ls90/a;Ldf0/f;Ldf0/i;Leg0/w;Leg0/o;Ldf0/d;Ldf0/o;Ldf0/l;Ldf0/g;Lac4/a;Lw90/d;Lsc0/c;Lhb4/d;Lcb4/j;Lv90/o;)V", "Ldx/b;", "Ljb4/b;", "J9", "(Ldx/b;)Ljb4/b;", "state", "Lv90/c$a;", "I9", "(Lv90/b;)Lv90/c$a;", "b", "Lw90/e;", "c", "Ly80/c;", "d", "La80/d;", "e", "Ls90/a;", "f", "Ldf0/f;", "g", "Ldf0/i;", "h", "Leg0/w;", "j", "Leg0/o;", "k", "Ldf0/d;", "l", "Ldf0/o;", "m", "Ldf0/l;", "n", "Ldf0/g;", "p", "Lac4/a;", "q", "Lw90/d;", "r", "Lsc0/c;", "s", "Lhb4/d;", "t", "Lcb4/j;", "v", "Lv90/o;", "w", "Lv90/b;", "initState", "Lxw/b;", "Lv90/a$d;", "x", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "y", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "z", "Lmu/p0;", "getState", "()Lmu/p0;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<v90.b, v90.a> implements v90.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w90.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y80.c startJuniorActivationUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a80.d generateActivationChallengeUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final s90.a activateApplicationUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final df0.f initDownloadTaskWorkUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final df0.i observeAsyncDownloadWorkersUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final eg0.w saveUserCertUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final eg0.o isDocumentAddedByIDUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final df0.d getMainDocumentActiveTaskDataUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final df0.o restartDownloadTaskWorkUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final df0.l observeDownloadTaskDataUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final df0.g interruptDownloadTaskWorkUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final w90.d activationErrorMapper;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final sc0.c resetLoginLockCountsUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final v90.o setupData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final v90.b initState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v90.a.d> navAction;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v90.b, v90.a> stateMachine;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<v90.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v90.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f205401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f205402b;

        /* JADX INFO: renamed from: v90.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5356a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f205403a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f205404b;

            /* JADX INFO: renamed from: v90.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5357a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f205405d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f205406e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f205407f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f205409h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f205410j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f205411k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f205412l;

                public C5357a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f205405d = obj;
                    this.f205406e |= PKIFailureInfo.systemUnavail;
                    return C5356a.this.F(null, this);
                }
            }

            public C5356a(mu.h hVar, z zVar) {
                this.f205403a = hVar;
                this.f205404b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5357a c5357a;
                if (eVar instanceof C5357a) {
                    c5357a = (C5357a) eVar;
                    int i15 = c5357a.f205406e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5357a.f205406e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5357a = new C5357a(eVar);
                    }
                } else {
                    c5357a = new C5357a(eVar);
                }
                Object obj2 = c5357a.f205405d;
                Object objE = uq.b.e();
                int i16 = c5357a.f205406e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f205403a;
                    v90.c.a aVarI9 = this.f205404b.I9((v90.b) obj);
                    c5357a.f205407f = vq.j.a(obj);
                    c5357a.f205409h = vq.j.a(c5357a);
                    c5357a.f205410j = vq.j.a(obj);
                    c5357a.f205411k = vq.j.a(hVar);
                    c5357a.f205412l = 0;
                    c5357a.f205406e = 1;
                    if (hVar.F(aVarI9, c5357a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f205401a = gVar;
            this.f205402b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v90.c.a> hVar, tq.e eVar) {
            Object objA = this.f205401a.a(new C5356a(hVar, this.f205402b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv90/a$c;", "<unused var>", "Lk10/c0;", "Lv90/b;", "state", "Lk10/l;", "<anonymous>", "(Lv90/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v90.a.c, k10.c0<v90.b>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205414f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.a O(v90.b bVar) {
            return v90.b.a.f205311a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f205414f;
            uq.b.e();
            if (this.f205413e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v90.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.b.O((b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.c cVar, k10.c0<v90.b> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f205414f = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv90/a$e;", "<unused var>", "Lv90/b;", "Loq/i0;", "<anonymous>", "(Lv90/a$e;Lv90/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v90.a.e, v90.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205415e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f205415e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v90.a.d> bVarY1 = z.this.Y1();
                v90.a.d.C5352a c5352a = v90.a.d.C5352a.f205304a;
                this.f205415e = 1;
                if (bVarY1.F(c5352a, this) == objE) {
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
        public final Object w(v90.a.e eVar, v90.b bVar, tq.e<? super oq.i0> eVar2) {
            return z.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv90/a$f;", "<unused var>", "Lv90/b;", "Loq/i0;", "<anonymous>", "(Lv90/a$f;Lv90/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v90.a.f, v90.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205417e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f205417e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v90.a.d> bVarY1 = z.this.Y1();
                v90.a.d.b bVar = v90.a.d.b.f205305a;
                this.f205417e = 1;
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

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.f fVar, v90.b bVar, tq.e<? super oq.i0> eVar) {
            return z.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv90/b$h;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<v90.b.StartActivation>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205420f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error V(z zVar, dx.b bVar, v90.b.StartActivation startActivation) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.GetActivationChallenge X(StartActivationResponse startActivationResponse, v90.b.StartActivation startActivation) {
            return new v90.b.GetActivationChallenge(startActivationResponse.getAuthenticationToken());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f205420f;
            Object objE = uq.b.e();
            int i15 = this.f205419e;
            if (i15 == 0) {
                oq.u.b(obj);
                y80.c cVar = z.this.startJuniorActivationUC;
                y80.c.Params params = new y80.c.Params(((v90.b.StartActivation) c0Var.a()).getQrCode());
                this.f205420f = c0Var;
                this.f205419e = 1;
                obj = cVar.c(params, this);
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
            final z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: v90.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.e.V(zVar, bVar, (b.StartActivation) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final StartActivationResponse startActivationResponse = (StartActivationResponse) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: v90.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.X(startActivationResponse, (b.StartActivation) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v90.b.StartActivation> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f205420f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv90/b$c;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<v90.b.GetActivationChallenge>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f205423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f205424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f205425h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f205426j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f205427k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f205428l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f205429m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f205430n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ k10.z<v90.b.GetActivationChallenge, v90.b, v90.a> f205432q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k10.z<v90.b.GetActivationChallenge, v90.b, v90.a> zVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f205432q = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error V(z zVar, dx.b bVar, v90.b.GetActivationChallenge getActivationChallenge) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.InitActivation X(ActivationChallengeWithKeysResponse activationChallengeWithKeysResponse, v90.b.GetActivationChallenge getActivationChallenge) {
            return new v90.b.InitActivation(activationChallengeWithKeysResponse.getActivationChallenge());
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d4 A[RETURN] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ActivationChallengeWithKeysResponse activationChallengeWithKeysResponse;
            ActivationChallengeWithKeysResponse activationChallengeWithKeysResponse2;
            k10.l lVarC;
            k10.c0 c0Var = (k10.c0) this.f205430n;
            Object objE = uq.b.e();
            int i15 = this.f205429m;
            if (i15 == 0) {
                oq.u.b(obj);
                a80.d dVar = z.this.generateActivationChallengeUC;
                a80.d.Params params = new a80.d.Params(((v90.b.GetActivationChallenge) c0Var.a()).getAuthenticationToken());
                this.f205430n = c0Var;
                this.f205429m = 1;
                obj = dVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activationChallengeWithKeysResponse2 = (ActivationChallengeWithKeysResponse) this.f205424g;
                oq.u.b(obj);
            }
            lVarC = c0Var.c();
            if (lVarC == null) {
                return lVarC;
            }
            activationChallengeWithKeysResponse = activationChallengeWithKeysResponse2;
            return c0Var.d(new er.l() { // from class: v90.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.X(activationChallengeWithKeysResponse, (b.GetActivationChallenge) obj2);
                }
            });
            dx.i iVar = (dx.i) obj;
            final z zVar = z.this;
            k10.z<v90.b.GetActivationChallenge, v90.b, v90.a> zVar2 = this.f205432q;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: v90.d0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.f.V(zVar, bVar, (b.GetActivationChallenge) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            activationChallengeWithKeysResponse = (ActivationChallengeWithKeysResponse) ((dx.i.Right) iVar).b();
            String activeDeviceName = activationChallengeWithKeysResponse.getActiveDeviceName();
            if (activeDeviceName != null) {
                xw.b<v90.a.d> bVarY1 = zVar.Y1();
                v90.a.d.ShowDialog showDialog = new v90.a.d.ShowDialog(zVar.mapper.e(zVar.b9(new v90.a.DeactivateOtherDevice(activationChallengeWithKeysResponse.getActivationChallenge())), zVar.b9(v90.a.e.f205307a)));
                this.f205430n = c0Var;
                this.f205422e = vq.j.a(iVar);
                this.f205423f = zVar2;
                this.f205424g = activationChallengeWithKeysResponse;
                this.f205425h = vq.j.a(activeDeviceName);
                this.f205426j = 0;
                this.f205427k = 0;
                this.f205428l = 0;
                this.f205429m = 2;
                if (bVarY1.F(showDialog, this) != objE) {
                    activationChallengeWithKeysResponse2 = activationChallengeWithKeysResponse;
                    lVarC = c0Var.c();
                    if (lVarC == null) {
                        return lVarC;
                    }
                    activationChallengeWithKeysResponse = activationChallengeWithKeysResponse2;
                }
                return objE;
            }
            return c0Var.d(new er.l() { // from class: v90.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.f.X(activationChallengeWithKeysResponse, (b.GetActivationChallenge) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v90.b.GetActivationChallenge> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = z.this.new f(this.f205432q, eVar);
            fVar.f205430n = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv90/a$b;", "action", "Lk10/c0;", "Lv90/b$c;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lv90/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<v90.a.DeactivateOtherDevice, k10.c0<v90.b.GetActivationChallenge>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f205435g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.InitActivation O(v90.a.DeactivateOtherDevice deactivateOtherDevice, v90.b.GetActivationChallenge getActivationChallenge) {
            return new v90.b.InitActivation(deactivateOtherDevice.getAuthenticationChallenge());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v90.a.DeactivateOtherDevice deactivateOtherDevice = (v90.a.DeactivateOtherDevice) this.f205434f;
            k10.c0 c0Var = (k10.c0) this.f205435g;
            uq.b.e();
            if (this.f205433e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v90.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(deactivateOtherDevice, (b.GetActivationChallenge) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.DeactivateOtherDevice deactivateOtherDevice, k10.c0<v90.b.GetActivationChallenge> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f205434f = deactivateOtherDevice;
            gVar.f205435g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv90/b$d;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<v90.b.InitActivation>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f205437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f205438g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f205439h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f205440j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f205441k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f205442l;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error X(z zVar, dx.b bVar, v90.b.InitActivation initActivation) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error Y(z zVar, dx.b bVar, v90.b.InitActivation initActivation) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.InitAsyncDataDownload Z(s90.a.Result result, v90.b.InitActivation initActivation) {
            return new v90.b.InitAsyncDataDownload(result.getResponse().getDocumentToGenerate(), result.getResponse().getSourceDocumentAccessToken());
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0122  */
        /* JADX WARN: Code duplicated, block: B:31:0x0129  */
        /* JADX WARN: Code duplicated, block: B:33:0x013b  */
        /* JADX WARN: Code duplicated, block: B:35:0x013f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0151  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objD;
            dx.i iVar;
            final z zVar;
            s90.a.Result result;
            int i15;
            int i16;
            Object objC;
            final s90.a.Result result2;
            dx.i iVar2;
            k10.c0 c0Var = (k10.c0) this.f205442l;
            Object objE = uq.b.e();
            int i17 = this.f205441k;
            if (i17 == 0) {
                oq.u.b(obj);
                s90.a aVar = z.this.activateApplicationUC;
                s90.a.Params params = new s90.a.Params(((v90.b.InitActivation) c0Var.a()).getActivationChallenge(), null, 2, null);
                this.f205442l = c0Var;
                this.f205441k = 1;
                objD = aVar.d(params, this);
                if (objD != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
                objD = obj;
            } else {
                if (i17 == 2) {
                    int i18 = this.f205440j;
                    int i19 = this.f205439h;
                    s90.a.Result result3 = (s90.a.Result) this.f205438g;
                    z zVar2 = (z) this.f205437f;
                    iVar = (dx.i) this.f205436e;
                    oq.u.b(obj);
                    i16 = i19;
                    result = result3;
                    i15 = i18;
                    zVar = zVar2;
                    eg0.w wVar = zVar.saveUserCertUC;
                    eg0.w.Params params2 = new eg0.w.Params(result.getResponse().getUserCertificateWithKeys().getCertPKCS12Base64(), result.getResponse().getUserCertificateWithKeys().getCertPKCS12AESSecretKeyBase64(), result.getResponse().getUserCertificateWithKeys().getPublicCertBase64(), result.getResponse().getUserCertificateWithKeys().getPasswordPKCS12Base64(), result.getResponse().getPeselTicket(), result.getKeyPair().getPrivate());
                    this.f205442l = c0Var;
                    this.f205436e = vq.j.a(iVar);
                    this.f205437f = zVar;
                    this.f205438g = result;
                    this.f205439h = i16;
                    this.f205440j = i15;
                    this.f205441k = 3;
                    objC = wVar.c(params2, this);
                    if (objC != objE) {
                        result2 = result;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result2 = (s90.a.Result) this.f205438g;
                zVar = (z) this.f205437f;
                oq.u.b(obj);
                objC = obj;
            }
            iVar2 = (dx.i) objC;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: v90.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.h.Y(zVar, bVar, (b.InitActivation) obj2);
                    }
                });
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: v90.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.Z(result2, (b.InitActivation) obj2);
                }
            });
            iVar = (dx.i) objD;
            zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: v90.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.h.X(zVar, bVar2, (b.InitActivation) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            result = (s90.a.Result) ((dx.i.Right) iVar).b();
            sc0.c cVar = zVar.resetLoginLockCountsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f205442l = c0Var;
            this.f205436e = vq.j.a(iVar);
            this.f205437f = zVar;
            this.f205438g = result;
            i15 = 0;
            this.f205439h = 0;
            this.f205440j = 0;
            this.f205441k = 2;
            if (cVar.c(c1792a, this) != objE) {
                i16 = 0;
                eg0.w wVar2 = zVar.saveUserCertUC;
                eg0.w.Params params3 = new eg0.w.Params(result.getResponse().getUserCertificateWithKeys().getCertPKCS12Base64(), result.getResponse().getUserCertificateWithKeys().getCertPKCS12AESSecretKeyBase64(), result.getResponse().getUserCertificateWithKeys().getPublicCertBase64(), result.getResponse().getUserCertificateWithKeys().getPasswordPKCS12Base64(), result.getResponse().getPeselTicket(), result.getKeyPair().getPrivate());
                this.f205442l = c0Var;
                this.f205436e = vq.j.a(iVar);
                this.f205437f = zVar;
                this.f205438g = result;
                this.f205439h = i16;
                this.f205440j = i15;
                this.f205441k = 3;
                objC = wVar2.c(params3, this);
                if (objC != objE) {
                    result2 = result;
                    iVar2 = (dx.i) objC;
                    if (iVar2 instanceof dx.i.Left) {
                        final dx.b bVar3 = (dx.b) ((dx.i.Left) iVar2).b();
                        return c0Var.d(new er.l() { // from class: v90.h0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return z.h.Y(zVar, bVar3, (b.InitActivation) obj2);
                            }
                        });
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return c0Var.d(new er.l() { // from class: v90.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.h.Z(result2, (b.InitActivation) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v90.b.InitActivation> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f205442l = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv90/b$e;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<v90.b.InitAsyncDataDownload>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205445f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error V(z zVar, dx.b bVar, v90.b.InitAsyncDataDownload initAsyncDataDownload) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload X(k10.c0 c0Var, v90.b.InitAsyncDataDownload initAsyncDataDownload) {
            return new v90.b.ObserveAsyncDataDownload(((v90.b.InitAsyncDataDownload) c0Var.a()).getDocumentToGenerate().getDocumentId(), ((v90.b.InitAsyncDataDownload) c0Var.a()).getDocumentToGenerate().getTaskId(), ((v90.b.InitAsyncDataDownload) c0Var.a()).getSourceDocumentAccessToken(), false, false, null, 56, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objC;
            final k10.c0 c0Var = (k10.c0) this.f205445f;
            Object objE = uq.b.e();
            int i15 = this.f205444e;
            if (i15 == 0) {
                oq.u.b(obj);
                df0.f fVar = z.this.initDownloadTaskWorkUC;
                String taskId = ((v90.b.InitAsyncDataDownload) c0Var.a()).getDocumentToGenerate().getTaskId();
                cf0.c cVar = cf0.c.JUNIOR_STUDENT_CARD;
                String documentId = ((v90.b.InitAsyncDataDownload) c0Var.a()).getDocumentToGenerate().getDocumentId();
                long asyncDownloadTerminationInterval = ((v90.b.InitAsyncDataDownload) c0Var.a()).getDocumentToGenerate().getAsyncDownloadTerminationInterval();
                cf0.e eVar = cf0.e.FIRST_DOWNLOAD;
                df0.f.Params params = new df0.f.Params(taskId, eVar, pq.v0.f(oq.y.a(cVar, new AsyncDocumentToGenerate(documentId, cVar, asyncDownloadTerminationInterval, false, null, null, null, eVar, 112, null))), iy.c0.g(((v90.b.InitAsyncDataDownload) c0Var.a()).getSourceDocumentAccessToken()));
                this.f205445f = c0Var;
                this.f205444e = 1;
                objC = fVar.c(params, this);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                objC = obj;
            }
            dx.i iVar = (dx.i) objC;
            final z zVar = z.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: v90.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.i.V(zVar, bVar, (b.InitAsyncDataDownload) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: v90.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.X(c0Var, (b.InitAsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v90.b.InitAsyncDataDownload> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f205445f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcf0/h;", "value", "Lv90/b$f;", "state", "Loq/i0;", "<anonymous>", "(Ljava/util/List;Lv90/b$f;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<List<? extends WorkerInfo>, v90.b.ObserveAsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f205448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f205449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f205450h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0096  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:39:0x00df A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        
            if (r9.F(r5, r8) == r2) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v90.z.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<WorkerInfo> list, v90.b.ObserveAsyncDataDownload observeAsyncDataDownload, tq.e<? super oq.i0> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f205449g = list;
            jVar.f205450h = observeAsyncDataDownload;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcf0/f;", "value", "Lk10/c0;", "Lv90/b$f;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lcf0/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<DownloadTaskData, k10.c0<v90.b.ObserveAsyncDataDownload>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f205454g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f205455a;

            static {
                int[] iArr = new int[cf0.a.values().length];
                try {
                    iArr[cf0.a.TAKES_TOO_LONG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f205455a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload O(v90.b.ObserveAsyncDataDownload observeAsyncDataDownload) {
            return v90.b.ObserveAsyncDataDownload.b(observeAsyncDataDownload, null, null, null, true, false, null, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Map<cf0.c, AsyncDocumentToGenerate> mapB;
            DownloadTaskData downloadTaskData = (DownloadTaskData) this.f205453f;
            k10.c0 c0Var = (k10.c0) this.f205454g;
            uq.b.e();
            if (this.f205452e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            AsyncDocumentToGenerate asyncDocumentToGenerate = (downloadTaskData == null || (mapB = downloadTaskData.b()) == null) ? null : mapB.get(cf0.c.JUNIOR_STUDENT_CARD);
            cf0.a status = asyncDocumentToGenerate != null ? asyncDocumentToGenerate.getStatus() : null;
            return (status == null ? -1 : a.f205455a[status.ordinal()]) == 1 ? c0Var.b(new er.l() { // from class: v90.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O((b.ObserveAsyncDataDownload) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DownloadTaskData downloadTaskData, k10.c0<v90.b.ObserveAsyncDataDownload> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f205453f = downloadTaskData;
            kVar.f205454g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv90/a$h;", "<unused var>", "Lk10/c0;", "Lv90/b$f;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lv90/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<v90.a.h, k10.c0<v90.b.ObserveAsyncDataDownload>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205457f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f205459e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f205460f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f205461g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f205462h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f205463j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ z f205464k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<v90.b.ObserveAsyncDataDownload> f205465l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<v90.b.ObserveAsyncDataDownload> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f205464k = zVar;
                this.f205465l = c0Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
            
                if (r1.F(r4, r7) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
            
                if (r1.F(r4, r7) == r0) goto L25;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f205463j
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L2b
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r7.f205460f
                    oq.i0 r0 = (oq.i0) r0
                    goto L22
                L16:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1e:
                    java.lang.Object r0 = r7.f205460f
                    dx.b r0 = (dx.b) r0
                L22:
                    java.lang.Object r0 = r7.f205459e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto Lbb
                L2b:
                    oq.u.b(r8)
                    goto L5e
                L2f:
                    oq.u.b(r8)
                    v90.z r8 = r7.f205464k
                    df0.g r8 = v90.z.z9(r8)
                    df0.g$a r1 = new df0.g$a
                    k10.c0<v90.b$f> r5 = r7.f205465l
                    java.lang.Object r5 = r5.a()
                    v90.b$f r5 = (v90.b.ObserveAsyncDataDownload) r5
                    java.lang.String r5 = r5.getTaskId()
                    k10.c0<v90.b$f> r6 = r7.f205465l
                    java.lang.Object r6 = r6.a()
                    v90.b$f r6 = (v90.b.ObserveAsyncDataDownload) r6
                    java.lang.String r6 = r6.getAuthToken()
                    r1.<init>(r5, r6)
                    r7.f205463j = r4
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L5e
                    goto Lba
                L5e:
                    dx.i r8 = (dx.i) r8
                    v90.z r1 = r7.f205464k
                    boolean r4 = r8 instanceof dx.i.Left
                    r5 = 0
                    if (r4 == 0) goto L8f
                    r2 = r8
                    dx.i$b r2 = (dx.i.Left) r2
                    java.lang.Object r2 = r2.b()
                    dx.b r2 = (dx.b) r2
                    xw.b r1 = r1.Y1()
                    v90.a$d$a r4 = v90.a.d.C5352a.f205304a
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f205459e = r8
                    java.lang.Object r8 = vq.j.a(r2)
                    r7.f205460f = r8
                    r7.f205461g = r5
                    r7.f205462h = r5
                    r7.f205463j = r3
                    java.lang.Object r8 = r1.F(r4, r7)
                    if (r8 != r0) goto Lbb
                    goto Lba
                L8f:
                    boolean r3 = r8 instanceof dx.i.Right
                    if (r3 == 0) goto Lbe
                    r3 = r8
                    dx.i$c r3 = (dx.i.Right) r3
                    java.lang.Object r3 = r3.b()
                    oq.i0 r3 = (oq.i0) r3
                    xw.b r1 = r1.Y1()
                    v90.a$d$a r4 = v90.a.d.C5352a.f205304a
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f205459e = r8
                    java.lang.Object r8 = vq.j.a(r3)
                    r7.f205460f = r8
                    r7.f205461g = r5
                    r7.f205462h = r5
                    r7.f205463j = r2
                    java.lang.Object r8 = r1.F(r4, r7)
                    if (r8 != r0) goto Lbb
                Lba:
                    return r0
                Lbb:
                    oq.i0 r8 = oq.i0.f148189a
                    return r8
                Lbe:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: v90.z.l.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f205464k, this.f205465l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload O(v90.b.ObserveAsyncDataDownload observeAsyncDataDownload) {
            return v90.b.ObserveAsyncDataDownload.b(observeAsyncDataDownload, null, null, null, false, true, null, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f205457f;
            Object objE = uq.b.e();
            int i15 = this.f205456e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = z.this.callActionWithLoaderUseCase;
                a aVar2 = new a(z.this, c0Var, null);
                this.f205457f = c0Var;
                this.f205456e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: v90.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.l.O((b.ObserveAsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.h hVar, k10.c0<v90.b.ObserveAsyncDataDownload> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f205457f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv90/a$g;", "<unused var>", "Lk10/c0;", "Lv90/b$f;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lv90/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<v90.a.g, k10.c0<v90.b.ObserveAsyncDataDownload>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205467f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload O(z zVar, v90.b.ObserveAsyncDataDownload observeAsyncDataDownload) {
            return v90.b.ObserveAsyncDataDownload.b(observeAsyncDataDownload, null, null, null, false, false, zVar.dialogVMSFactory.a(zVar.mapper.f(zVar.b9(v90.a.h.f205310a), zVar.b9(v90.a.C5351a.f205301a))), 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f205467f;
            uq.b.e();
            if (this.f205466e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.b(new er.l() { // from class: v90.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.m.O(zVar, (b.ObserveAsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.g gVar, k10.c0<v90.b.ObserveAsyncDataDownload> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f205467f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv90/a$a;", "<unused var>", "Lk10/c0;", "Lv90/b$f;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lv90/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<v90.a.C5351a, k10.c0<v90.b.ObserveAsyncDataDownload>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f205469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f205470f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload O(v90.b.ObserveAsyncDataDownload observeAsyncDataDownload) {
            return v90.b.ObserveAsyncDataDownload.b(observeAsyncDataDownload, null, null, null, false, false, null, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f205470f;
            uq.b.e();
            if (this.f205469e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v90.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O((b.ObserveAsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v90.a.C5351a c5351a, k10.c0<v90.b.ObserveAsyncDataDownload> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f205470f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv90/b$g;", "state", "Lk10/l;", "Lv90/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<k10.c0<v90.b.g>, tq.e<? super k10.l<? extends v90.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f205471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f205472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f205473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f205474h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f205475j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f205476k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f205477l;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.a X(v90.b.g gVar) {
            return v90.b.a.f205311a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.Error Y(z zVar, dx.b bVar, v90.b.g gVar) {
            return new v90.b.Error(zVar.errorVMSFactory.a(zVar.J9(bVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v90.b.ObserveAsyncDataDownload Z(DownloadTaskData downloadTaskData, v90.b.g gVar) {
            return new v90.b.ObserveAsyncDataDownload(downloadTaskData.b().get(cf0.c.JUNIOR_STUDENT_CARD).getDocumentId(), downloadTaskData.getTaskId(), iy.c0.e(downloadTaskData.getMainDocumentAuthToken()), false, false, null, 56, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0099  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:29:0x00af  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final z zVar;
            final DownloadTaskData downloadTaskData;
            dx.i iVar;
            k10.c0 c0Var = (k10.c0) this.f205477l;
            Object objE = uq.b.e();
            int i15 = this.f205476k;
            if (i15 == 0) {
                oq.u.b(obj);
                df0.d dVar = z.this.getMainDocumentActiveTaskDataUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f205477l = c0Var;
                this.f205476k = 1;
                obj = dVar.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                downloadTaskData = (DownloadTaskData) this.f205473g;
                zVar = (z) this.f205472f;
                oq.u.b(obj);
            }
            iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: v90.q0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.o.Y(zVar, bVar, (b.g) obj2);
                    }
                });
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            return c0Var.d(new er.l() { // from class: v90.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.Z(downloadTaskData, (b.g) obj2);
                }
            });
            dx.i iVar2 = (dx.i) obj;
            zVar = z.this;
            if (iVar2 instanceof dx.i.Left) {
                return c0Var.d(new er.l() { // from class: v90.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.o.X((b.g) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            DownloadTaskData downloadTaskData2 = (DownloadTaskData) ((dx.i.Right) iVar2).b();
            df0.o oVar = zVar.restartDownloadTaskWorkUC;
            df0.o.Params params = new df0.o.Params(downloadTaskData2.getTaskId());
            this.f205477l = c0Var;
            this.f205471e = vq.j.a(iVar2);
            this.f205472f = zVar;
            this.f205473g = downloadTaskData2;
            this.f205474h = 0;
            this.f205475j = 0;
            this.f205476k = 2;
            obj = oVar.c(params, this);
            if (obj != objE) {
                downloadTaskData = downloadTaskData2;
                iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: v90.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.o.Y(zVar, bVar2, (b.g) obj2);
                        }
                    });
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                return c0Var.d(new er.l() { // from class: v90.r0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.o.Z(downloadTaskData, (b.g) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v90.b.g> c0Var, tq.e<? super k10.l<? extends v90.b>> eVar) {
            return ((o) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f205477l = obj;
            return oVar;
        }
    }

    public z(yy.a aVar, w90.e eVar, y80.c cVar, a80.d dVar, s90.a aVar2, df0.f fVar, df0.i iVar, eg0.w wVar, eg0.o oVar, df0.d dVar2, df0.o oVar2, df0.l lVar, df0.g gVar, ac4.a aVar3, w90.d dVar3, sc0.c cVar2, hb4.d dVar4, cb4.j jVar, v90.o oVar3) {
        v90.b startActivation;
        this.mapper = eVar;
        this.startJuniorActivationUC = cVar;
        this.generateActivationChallengeUC = dVar;
        this.activateApplicationUC = aVar2;
        this.initDownloadTaskWorkUC = fVar;
        this.observeAsyncDownloadWorkersUC = iVar;
        this.saveUserCertUC = wVar;
        this.isDocumentAddedByIDUC = oVar;
        this.getMainDocumentActiveTaskDataUC = dVar2;
        this.restartDownloadTaskWorkUC = oVar2;
        this.observeDownloadTaskDataUC = lVar;
        this.interruptDownloadTaskWorkUC = gVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.activationErrorMapper = dVar3;
        this.resetLoginLockCountsUC = cVar2;
        this.errorVMSFactory = dVar4;
        this.dialogVMSFactory = jVar;
        this.setupData = oVar3;
        if (fr.t.c(oVar3, v90.o.a.f205361a)) {
            startActivation = v90.b.g.f205323a;
        } else {
            if (!(oVar3 instanceof v90.o.QrCode)) {
                throw new oq.p();
            }
            startActivation = new v90.b.StartActivation(((v90.o.QrCode) oVar3).getCode());
        }
        this.initState = startActivation;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(startActivation, new er.l() { // from class: v90.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f205378a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), I9(startActivation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v90.c.a I9(v90.b state) {
        return this.mapper.b(new w90.e.Params(state, b9(v90.a.e.f205307a), b9(v90.a.f.f205308a), b9(v90.a.g.f205309a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b J9(dx.b bVar) {
        return this.activationErrorMapper.b(new w90.d.Params(bVar, b9(v90.a.e.f205307a), b9(v90.a.f.f205308a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final z zVar, k10.v vVar) {
        vVar.c(fr.q0.c(v90.b.class), new er.l() { // from class: v90.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9(this.f205363a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.Error.class), new er.l() { // from class: v90.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.StartActivation.class), new er.l() { // from class: v90.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.O9(this.f205366a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.GetActivationChallenge.class), new er.l() { // from class: v90.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f205368a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.InitActivation.class), new er.l() { // from class: v90.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f205369a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.InitAsyncDataDownload.class), new er.l() { // from class: v90.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.R9(this.f205371a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.ObserveAsyncDataDownload.class), new er.l() { // from class: v90.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.S9(this.f205373a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v90.b.g.class), new er.l() { // from class: v90.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.U9(this.f205374a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(z zVar, k10.z zVar2) {
        b bVar = new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(fr.q0.c(v90.a.c.class), oVar, bVar);
        zVar2.x(fr.q0.c(v90.a.e.class), oVar, zVar.new c(null));
        zVar2.x(fr.q0.c(v90.a.f.class), oVar, zVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(k10.z zVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new f(zVar2, null));
        g gVar = new g(null);
        zVar2.v(fr.q0.c(v90.a.DeactivateOtherDevice.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(final z zVar, k10.z zVar2) {
        k10.k.s(zVar2, (mu.g) zVar.observeAsyncDownloadWorkersUC.a(gz.b.a.C1792a.f78542a), null, zVar.new j(null), 2, null);
        k10.k.l(zVar2, new er.l() { // from class: v90.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.T9(this.f205377a, (b.ObserveAsyncDataDownload) obj);
            }
        }, null, new k(null), 2, null);
        l lVar = zVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(fr.q0.c(v90.a.h.class), oVar, lVar);
        zVar2.v(fr.q0.c(v90.a.g.class), oVar, zVar.new m(null));
        zVar2.v(fr.q0.c(v90.a.C5351a.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g T9(z zVar, v90.b.ObserveAsyncDataDownload observeAsyncDataDownload) {
        return (mu.g) zVar.observeDownloadTaskDataUC.a(new df0.l.Params(observeAsyncDataDownload.getTaskId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new o(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v90.o oVar) {
        super.P5(oVar);
    }

    @Override // zx.b
    public xw.b<v90.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v90.b, v90.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<v90.c.a> getState() {
        return this.state;
    }
}
