package dh3;

import aw0.d0;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import df3.VehicleDetailsData;
import eh3.SummaryContract;
import fr.q0;
import java.util.List;
import k10.z;
import ki3.ShowLocalizationModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import se3.InsuranceDetailsData;
import sv0.ProcessId;
import sv0.c0;
import ve3.PersonalDetailsData;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0082@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J&\u0010+\u001a\u00020!2\u0006\u0010(\u001a\u00020 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0)H\u0082@¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020-*\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010W\u001a\b\u0012\u0004\u0012\u00020-0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Ldh3/r;", "Ll00/g;", "Ldh3/b;", "Ldh3/a;", "Ldh3/c;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lae3/l;", "postReadyStatementUC", "Law0/d0;", "rejectStatementDataUC", "Lfh3/l;", "mapper", "Lib4/c;", "domainErrorMapper", "Lmx/c;", "labelProvider", "Lae3/i;", "getSavedCollisionDataUC", "Lde3/d;", "isWrongStateErrorUC", "Leh3/a;", "setupData", "<init>", "(Lyy/a;Lac4/a;Lae3/l;Law0/d0;Lfh3/l;Lib4/c;Lmx/c;Lae3/i;Lde3/d;Leh3/a;)V", "Lcb4/d;", "A9", "()Lcb4/d;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "N9", "(Ltq/e;)Ljava/lang/Object;", "Lsv0/c0;", "statementDetails", "M9", "(Lsv0/c0;Ltq/e;)Ljava/lang/Object;", "domainError", "Lkotlin/Function0;", "retryAction", "D9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Ldh3/c$a;", "F9", "(Ldh3/b;)Ldh3/c$a;", "b", "Lac4/a;", "c", "Lae3/l;", "d", "Law0/d0;", "e", "Lfh3/l;", "f", "Lib4/c;", "g", "Lmx/c;", "h", "Lae3/i;", "j", "Lde3/d;", "k", "Leh3/a;", "l", "Ldh3/b;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ldh3/a$g;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, dh3.a> implements dh3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.l postReadyStatementUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d0 rejectStatementDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fh3.l mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ae3.i getSavedCollisionDataUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SummaryContract setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, dh3.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dh3.a.g> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<dh3.c.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f42753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f42754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f42755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f42756h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f42757j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ c0 f42759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0 c0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f42759l = c0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            if (r1.D9(r2, r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f42757j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f42754f
                oq.i0 r0 = (oq.i0) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f42754f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r6.f42753e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto La1
            L2b:
                oq.u.b(r7)
                goto L48
            L2f:
                oq.u.b(r7)
                dh3.r r7 = dh3.r.this
                ae3.l r7 = dh3.r.t9(r7)
                ae3.l$a r1 = new ae3.l$a
                sv0.c0 r5 = r6.f42759l
                r1.<init>(r5)
                r6.f42757j = r4
                java.lang.Object r7 = r7.e(r1, r6)
                if (r7 != r0) goto L48
                goto La0
            L48:
                dx.i r7 = (dx.i) r7
                dh3.r r1 = dh3.r.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L79
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                dh3.a$k r4 = dh3.a.k.f42698a
                er.a r4 = dh3.r.r9(r1, r4)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f42753e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f42754f = r7
                r6.f42755g = r5
                r6.f42756h = r5
                r6.f42757j = r3
                java.lang.Object r7 = dh3.r.w9(r1, r2, r4, r6)
                if (r7 != r0) goto La1
                goto La0
            L79:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto La4
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                oq.i0 r3 = (oq.i0) r3
                dh3.a$g$d r4 = dh3.a.g.d.f42686a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f42753e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f42754f = r7
                r6.f42755g = r5
                r6.f42756h = r5
                r6.f42757j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto La1
            La0:
                return r0
            La1:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            La4:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dh3.r.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new a(this.f42759l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f42760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f42761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f42762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f42763h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f42764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f42765k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ProcessId f42767m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ProcessId processId, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f42767m = processId;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00da  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
        
            if (r8.F(r9, r11) == r0) goto L32;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dh3.r.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new b(this.f42767m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<dh3.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f42768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f42769b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f42770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f42771b;

            /* JADX INFO: renamed from: dh3.r$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0943a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f42772d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f42773e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f42774f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f42776h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f42777j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f42778k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f42779l;

                public C0943a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f42772d = obj;
                    this.f42773e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f42770a = hVar;
                this.f42771b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0943a c0943a;
                if (eVar instanceof C0943a) {
                    c0943a = (C0943a) eVar;
                    int i15 = c0943a.f42773e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0943a.f42773e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0943a = new C0943a(eVar);
                    }
                } else {
                    c0943a = new C0943a(eVar);
                }
                Object obj2 = c0943a.f42772d;
                Object objE = uq.b.e();
                int i16 = c0943a.f42773e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f42770a;
                    dh3.c.Data dataF9 = this.f42771b.F9((State) obj);
                    c0943a.f42774f = vq.j.a(obj);
                    c0943a.f42776h = vq.j.a(c0943a);
                    c0943a.f42777j = vq.j.a(obj);
                    c0943a.f42778k = vq.j.a(hVar);
                    c0943a.f42779l = 0;
                    c0943a.f42773e = 1;
                    if (hVar.F(dataF9, c0943a) == objE) {
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

        public c(mu.g gVar, r rVar) {
            this.f42768a = gVar;
            this.f42769b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super dh3.c.Data> hVar, tq.e eVar) {
            Object objA = this.f42768a.a(new a(hVar, this.f42769b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$e;", "action", "Ldh3/b;", "state", "Loq/i0;", "<anonymous>", "(Ldh3/a$e;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<dh3.a.GoToPhotosDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f42782g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.GoToPhotosDetails goToPhotosDetails = (dh3.a.GoToPhotosDetails) this.f42781f;
            State state = (State) this.f42782g;
            Object objE = uq.b.e();
            int i15 = this.f42780e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.GoToPhotosDetails goToPhotosDetails2 = new dh3.a.g.GoToPhotosDetails(new PhotosDetailsSetupData(state.getReadyToSignStatement().getProcessId(), state.getReadyToSignStatement().getImageConfiguration(), goToPhotosDetails.a(), PhotosDetailsSetupData.a.C6081b.f226675a));
                this.f42781f = vq.j.a(goToPhotosDetails);
                this.f42782g = vq.j.a(state);
                this.f42780e = 1;
                if (rVar.F(goToPhotosDetails2, this) == objE) {
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
        public final Object w(dh3.a.GoToPhotosDetails goToPhotosDetails, State state, tq.e<? super i0> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f42781f = goToPhotosDetails;
            dVar.f42782g = state;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldh3/a$i;", "<unused var>", "Ldh3/b;", "Loq/i0;", "<anonymous>", "(Ldh3/a$i;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<dh3.a.i, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42784e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42784e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f42784e = 1;
                if (rVar.N9(this) == objE) {
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
        public final Object w(dh3.a.i iVar, State state, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$g;", "action", "Ldh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh3/a$g;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<dh3.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42787f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.g gVar = (dh3.a.g) this.f42787f;
            Object objE = uq.b.e();
            int i15 = this.f42786e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f42787f = vq.j.a(gVar);
                this.f42786e = 1;
                if (rVar.F(gVar, this) == objE) {
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
        public final Object w(dh3.a.g gVar, State state, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f42787f = gVar;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldh3/a$a;", "<unused var>", "Ldh3/b;", "Loq/i0;", "<anonymous>", "(Ldh3/a$a;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<dh3.a.C0938a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42789e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42789e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.b bVar = dh3.a.g.b.f42684a;
                this.f42789e = 1;
                if (rVar.F(bVar, this) == objE) {
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
        public final Object w(dh3.a.C0938a c0938a, State state, tq.e<? super i0> eVar) {
            return r.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldh3/a$k;", "<unused var>", "Lk10/c0;", "Ldh3/b;", "state", "Lk10/l;", "<anonymous>", "(Ldh3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<dh3.a.k, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42792f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, true, false, new State.a.C0942b(), 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f42792f;
            Object objE = uq.b.e();
            int i15 = this.f42791e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (!((State) c0Var.a()).getCheckboxChecked()) {
                    return c0Var.b(new er.l() { // from class: dh3.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.h.O((State) obj2);
                        }
                    });
                }
                r rVar = r.this;
                c0 readyToSignStatement = ((State) c0Var.a()).getReadyToSignStatement();
                this.f42792f = c0Var;
                this.f42791e = 1;
                if (rVar.M9(readyToSignStatement, this) == objE) {
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
        public final Object w(dh3.a.k kVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f42792f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$b;", "action", "Ldh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh3/a$b;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<dh3.a.GoToInsuranceDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42795f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.GoToInsuranceDetails goToInsuranceDetails = (dh3.a.GoToInsuranceDetails) this.f42795f;
            Object objE = uq.b.e();
            int i15 = this.f42794e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.GoToInsuranceDetails goToInsuranceDetails2 = new dh3.a.g.GoToInsuranceDetails(goToInsuranceDetails.getInsuranceDetailsData());
                this.f42795f = vq.j.a(goToInsuranceDetails);
                this.f42794e = 1;
                if (rVar.F(goToInsuranceDetails2, this) == objE) {
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
        public final Object w(dh3.a.GoToInsuranceDetails goToInsuranceDetails, State state, tq.e<? super i0> eVar) {
            i iVar = r.this.new i(eVar);
            iVar.f42795f = goToInsuranceDetails;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$f;", "action", "Ldh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh3/a$f;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<dh3.a.GoToVehicleDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42798f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.GoToVehicleDetails goToVehicleDetails = (dh3.a.GoToVehicleDetails) this.f42798f;
            Object objE = uq.b.e();
            int i15 = this.f42797e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.GoToVehicleDetails goToVehicleDetails2 = new dh3.a.g.GoToVehicleDetails(goToVehicleDetails.getVehicleDetailsData());
                this.f42798f = vq.j.a(goToVehicleDetails);
                this.f42797e = 1;
                if (rVar.F(goToVehicleDetails2, this) == objE) {
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
        public final Object w(dh3.a.GoToVehicleDetails goToVehicleDetails, State state, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f42798f = goToVehicleDetails;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$d;", "action", "Ldh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh3/a$d;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dh3.a.GoToPersonalDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42801f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.GoToPersonalDetails goToPersonalDetails = (dh3.a.GoToPersonalDetails) this.f42801f;
            Object objE = uq.b.e();
            int i15 = this.f42800e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.GoToPersonalDetails goToPersonalDetails2 = new dh3.a.g.GoToPersonalDetails(goToPersonalDetails.getPersonalDetailsData());
                this.f42801f = vq.j.a(goToPersonalDetails);
                this.f42800e = 1;
                if (rVar.F(goToPersonalDetails2, this) == objE) {
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
        public final Object w(dh3.a.GoToPersonalDetails goToPersonalDetails, State state, tq.e<? super i0> eVar) {
            k kVar = r.this.new k(eVar);
            kVar.f42801f = goToPersonalDetails;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldh3/a$c;", "action", "Ldh3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldh3/a$c;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<dh3.a.GoToMapDetails, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42804f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh3.a.GoToMapDetails goToMapDetails = (dh3.a.GoToMapDetails) this.f42804f;
            Object objE = uq.b.e();
            int i15 = this.f42803e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.GoToMapDetails goToMapDetails2 = new dh3.a.g.GoToMapDetails(goToMapDetails.getLocalization());
                this.f42804f = vq.j.a(goToMapDetails);
                this.f42803e = 1;
                if (rVar.F(goToMapDetails2, this) == objE) {
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
        public final Object w(dh3.a.GoToMapDetails goToMapDetails, State state, tq.e<? super i0> eVar) {
            l lVar = r.this.new l(eVar);
            lVar.f42804f = goToMapDetails;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldh3/a$h;", "action", "Lk10/c0;", "Ldh3/b;", "state", "Lk10/l;", "<anonymous>", "(Ldh3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<dh3.a.OnCheckboxValueChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f42807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f42808g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(dh3.a.OnCheckboxValueChange onCheckboxValueChange, State state) {
            return State.b(state, null, false, onCheckboxValueChange.getIsChecked(), null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final dh3.a.OnCheckboxValueChange onCheckboxValueChange = (dh3.a.OnCheckboxValueChange) this.f42807f;
            k10.c0 c0Var = (k10.c0) this.f42808g;
            uq.b.e();
            if (this.f42806e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dh3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.m.O(onCheckboxValueChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dh3.a.OnCheckboxValueChange onCheckboxValueChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f42807f = onCheckboxValueChange;
            mVar.f42808g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldh3/a$j;", "<unused var>", "Ldh3/b;", "Loq/i0;", "<anonymous>", "(Ldh3/a$j;Ldh3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<dh3.a.j, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42809e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f42809e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                dh3.a.g.ShowNavigationDialog showNavigationDialog = new dh3.a.g.ShowNavigationDialog(r.this.A9());
                this.f42809e = 1;
                if (rVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(dh3.a.j jVar, State state, tq.e<? super i0> eVar) {
            return r.this.new n(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ac4.a aVar2, ae3.l lVar, d0 d0Var, fh3.l lVar2, ib4.c cVar, mx.c cVar2, ae3.i iVar, de3.d dVar, SummaryContract summaryContract) {
        this.callActionWithLoaderUseCase = aVar2;
        this.postReadyStatementUC = lVar;
        this.rejectStatementDataUC = d0Var;
        this.mapper = lVar2;
        this.domainErrorMapper = cVar;
        this.labelProvider = cVar2;
        this.getSavedCollisionDataUC = iVar;
        this.isWrongStateErrorUC = dVar;
        this.setupData = summaryContract;
        State state = new State(summaryContract.getReadyToSignStatement(), false, false, State.a.C0941a.f42703a);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dh3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.P9(this.f42739a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), F9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData A9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.D4), this.labelProvider.c(md3.b.C4), new DialogButtonTextData(this.labelProvider.c(md3.b.f125691c), null, b9(dh3.a.i.f42696a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.f125699d), null, new er.a() { // from class: dh3.o
            @Override // er.a
            public final Object a() {
                return r.B9();
            }
        }, 2, null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(final dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = F(new dh3.a.g.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: dh3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.E9(this.f42736a, bVar, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(r rVar, dx.b bVar, er.a aVar, ib4.c.b bVar2) {
        if (rVar.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            rVar.d9(dh3.a.C0938a.f42676a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            aVar.a();
        } else if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dh3.c.Data F9(State state) {
        return this.mapper.b(new fh3.l.Params(state, b9(dh3.a.k.f42698a), b9(dh3.a.j.f42697a), new er.l() { // from class: dh3.h
            @Override // er.l
            public final Object b(Object obj) {
                return r.G9(this.f42729a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: dh3.i
            @Override // er.l
            public final Object b(Object obj) {
                return r.H9(this.f42730a, (InsuranceDetailsData) obj);
            }
        }, new er.l() { // from class: dh3.j
            @Override // er.l
            public final Object b(Object obj) {
                return r.I9(this.f42731a, (VehicleDetailsData) obj);
            }
        }, new er.l() { // from class: dh3.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.J9(this.f42732a, (PersonalDetailsData) obj);
            }
        }, new er.l() { // from class: dh3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.K9(this.f42733a, (ShowLocalizationModel) obj);
            }
        }, new er.l() { // from class: dh3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.L9(this.f42734a, (List) obj);
            }
        }, b9(dh3.a.g.C0939a.f42683a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(r rVar, boolean z15) {
        rVar.d9(new dh3.a.OnCheckboxValueChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(r rVar, InsuranceDetailsData insuranceDetailsData) {
        rVar.d9(new dh3.a.GoToInsuranceDetails(insuranceDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(r rVar, VehicleDetailsData vehicleDetailsData) {
        rVar.d9(new dh3.a.GoToVehicleDetails(vehicleDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(r rVar, PersonalDetailsData personalDetailsData) {
        rVar.d9(new dh3.a.GoToPersonalDetails(personalDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(r rVar, ShowLocalizationModel showLocalizationModel) {
        rVar.d9(new dh3.a.GoToMapDetails(showLocalizationModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(r rVar, List list) {
        rVar.d9(new dh3.a.GoToPhotosDetails(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M9(c0 c0Var, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N9(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        ProcessId processIdA = this.setupData.getNewCollisionNavigation().X().d().a();
        if (processIdA == null) {
            return null;
        }
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new b(processIdA, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : (dx.i) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dh3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.Q9(this.f42735a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(r rVar, z zVar) {
        f fVar = rVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(dh3.a.g.class), oVar, fVar);
        zVar.x(q0.c(dh3.a.C0938a.class), oVar, rVar.new g(null));
        zVar.v(q0.c(dh3.a.k.class), oVar, rVar.new h(null));
        zVar.x(q0.c(dh3.a.GoToInsuranceDetails.class), oVar, rVar.new i(null));
        zVar.x(q0.c(dh3.a.GoToVehicleDetails.class), oVar, rVar.new j(null));
        zVar.x(q0.c(dh3.a.GoToPersonalDetails.class), oVar, rVar.new k(null));
        zVar.x(q0.c(dh3.a.GoToMapDetails.class), oVar, rVar.new l(null));
        zVar.v(q0.c(dh3.a.OnCheckboxValueChange.class), oVar, new m(null));
        zVar.x(q0.c(dh3.a.j.class), oVar, rVar.new n(null));
        zVar.x(q0.c(dh3.a.GoToPhotosDetails.class), oVar, rVar.new d(null));
        zVar.x(q0.c(dh3.a.i.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(dh3.a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SummaryContract summaryContract) {
        super.P5(summaryContract);
    }

    @Override // zx.b
    public xw.b<dh3.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, dh3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<dh3.c.Data> getState() {
        return this.state;
    }
}
