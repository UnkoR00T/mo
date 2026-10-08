package vn2;

import cu0.IncidentId;
import cu0.OtherReport;
import cu0.ReportedIncidentReference;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import xl2.q5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b!\u0010\"J4\u0010'\u001a\u00020 2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0%\u0012\u0006\u0012\u0004\u0018\u00010\u00050#H\u0082@¢\u0006\u0004\b'\u0010(J \u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b*\u0010+J \u0010,\u001a\u00020 2\u0006\u0010)\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b,\u0010+J0\u00100\u001a\b\u0012\u0004\u0012\u00020/0-*\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030N8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0T8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lvn2/m;", "Ll00/g;", "Lvn2/b;", "Lvn2/a;", "Lvn2/c;", "", "Lyy/a;", "stateMachineFactory", "Lvn2/d;", "mapper", "Leu0/b;", "beGetIncidentIdUC", "Leu0/g;", "beSendOtherReportUC", "Leu0/c;", "beSendAttachmentUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericErrorMapper", "Lmx/c;", "labelProvider", "La00/b;", "pickedFileToAndroidMapper", "Lwn2/a;", "contract", "<init>", "(Lyy/a;Lvn2/d;Leu0/b;Leu0/g;Leu0/c;Lac4/a;Lib4/c;Lmx/c;La00/b;Lwn2/a;)V", "state", "Lvn2/c$a;", "w9", "(Lvn2/b;)Lvn2/c$a;", "Loq/i0;", "A9", "(Lvn2/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lcu0/e;", "Ltq/e;", "continueSendingReport", "v9", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "incidentId", "x9", "(Lcu0/e;Lvn2/b;Ltq/e;)Ljava/lang/Object;", "y9", "", "Lwx/i;", "Llm2/b;", "D9", "(Ljava/util/List;La00/b;Lmx/c;Ltq/e;)Ljava/lang/Object;", "b", "Lvn2/d;", "c", "Leu0/b;", "d", "Leu0/g;", "e", "Leu0/c;", "f", "Lac4/a;", "g", "Lib4/c;", "h", "Lmx/c;", "j", "La00/b;", "k", "Lwn2/a;", "l", "Lvn2/b;", "initialState", "Lxw/b;", "Lvn2/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, vn2.a> implements vn2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vn2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eu0.b beGetIncidentIdUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eu0.g beSendOtherReportUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final eu0.c beSendAttachmentUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wn2.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vn2.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t<State, vn2.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<vn2.c.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f207582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f207583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f207584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f207585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f207586h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f207587j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f207589l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207587j = obj;
            this.f207589l |= PKIFailureInfo.systemUnavail;
            return m.this.v9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f207590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f207591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f207592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f207593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f207594h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f207595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f207596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f207597l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f207598m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f207600p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207598m = obj;
            this.f207600p |= PKIFailureInfo.systemUnavail;
            return m.this.x9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f207601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f207602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207603f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f207605h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207603f = obj;
            this.f207605h |= PKIFailureInfo.systemUnavail;
            return m.this.y9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<vn2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f207606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f207607b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f207608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f207609b;

            /* JADX INFO: renamed from: vn2.m$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5450a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f207610d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f207611e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f207612f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f207614h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f207615j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f207616k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f207617l;

                public C5450a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f207610d = obj;
                    this.f207611e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f207608a = hVar;
                this.f207609b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5450a c5450a;
                if (eVar instanceof C5450a) {
                    c5450a = (C5450a) eVar;
                    int i15 = c5450a.f207611e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5450a.f207611e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5450a = new C5450a(eVar);
                    }
                } else {
                    c5450a = new C5450a(eVar);
                }
                Object obj2 = c5450a.f207610d;
                Object objE = uq.b.e();
                int i16 = c5450a.f207611e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f207608a;
                    vn2.c.Data dataW9 = this.f207609b.w9((State) obj);
                    c5450a.f207612f = vq.j.a(obj);
                    c5450a.f207614h = vq.j.a(c5450a);
                    c5450a.f207615j = vq.j.a(obj);
                    c5450a.f207616k = vq.j.a(hVar);
                    c5450a.f207617l = 0;
                    c5450a.f207611e = 1;
                    if (hVar.F(dataW9, c5450a) == objE) {
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

        public d(mu.g gVar, m mVar) {
            this.f207606a = gVar;
            this.f207607b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super vn2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f207606a.a(new a(hVar, this.f207607b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207618e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ State f207620g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcu0/e;", "incidentId", "Loq/i0;", "<anonymous>", "(Lcu0/e;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<IncidentId, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f207621e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f207622f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f207623g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ State f207624h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, State state, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f207623g = mVar;
                this.f207624h = state;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                IncidentId incidentId = (IncidentId) this.f207622f;
                Object objE = uq.b.e();
                int i15 = this.f207621e;
                if (i15 == 0) {
                    u.b(obj);
                    m mVar = this.f207623g;
                    State state = this.f207624h;
                    this.f207622f = vq.j.a(incidentId);
                    this.f207621e = 1;
                    if (mVar.x9(incidentId, state, this) == objE) {
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

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(IncidentId incidentId, tq.e<? super i0> eVar) {
                return ((a) v(incidentId, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f207623g, this.f207624h, eVar);
                aVar.f207622f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(State state, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f207620g = state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207618e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                a aVar = new a(mVar, this.f207620g, null);
                this.f207618e = 1;
                if (mVar.v9(aVar, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new e(this.f207620g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lvn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207626f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, null, null, null, list, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f207626f;
            Object objE = uq.b.e();
            int i15 = this.f207625e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                List<wx.i> listF = ((State) c0Var.a()).f();
                a00.b bVar = m.this.pickedFileToAndroidMapper;
                mx.c cVar = m.this.labelProvider;
                this.f207626f = c0Var;
                this.f207625e = 1;
                obj = mVar.D9(listF, bVar, cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final List list = (List) obj;
            return c0Var.b(new er.l() { // from class: vn2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.f.O(list, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f207626f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvn2/a$b;", "action", "Lvn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvn2/a$b;Lvn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<vn2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207629f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vn2.a.b bVar = (vn2.a.b) this.f207629f;
            Object objE = uq.b.e();
            int i15 = this.f207628e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f207629f = vq.j.a(bVar);
                this.f207628e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(vn2.a.b bVar, State state, tq.e<? super i0> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f207629f = bVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvn2/a$c;", "<unused var>", "Lvn2/b;", "state", "Loq/i0;", "<anonymous>", "(Lvn2/a$c;Lvn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<vn2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207632f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f207632f;
            Object objE = uq.b.e();
            int i15 = this.f207631e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f207632f = vq.j.a(state);
                this.f207631e = 1;
                if (mVar.A9(state, this) == objE) {
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
        public final Object w(vn2.a.c cVar, State state, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f207632f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvn2/a$a;", "action", "Lvn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvn2/a$a;Lvn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<vn2.a.HandleDomainError, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207635f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                mVar.d9(vn2.a.c.f207534a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vn2.a.HandleDomainError handleDomainError = (vn2.a.HandleDomainError) this.f207635f;
            Object objE = uq.b.e();
            int i15 = this.f207634e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<vn2.a.b> bVarY1 = m.this.Y1();
                ib4.c cVar = m.this.genericErrorMapper;
                dx.b domainError = handleDomainError.getDomainError();
                final m mVar = m.this;
                vn2.a.b.HandleGenericError handleGenericError = new vn2.a.b.HandleGenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: vn2.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.i.O(mVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f207635f = vq.j.a(handleDomainError);
                this.f207634e = 1;
                if (bVarY1.F(handleGenericError, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vn2.a.HandleDomainError handleDomainError, State state, tq.e<? super i0> eVar) {
            i iVar = m.this.new i(eVar);
            iVar.f207635f = handleDomainError;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvn2/a$e;", "action", "Lvn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvn2/a$e;Lvn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<vn2.a.Success, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207638f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vn2.a.Success success = (vn2.a.Success) this.f207638f;
            Object objE = uq.b.e();
            int i15 = this.f207637e;
            if (i15 == 0) {
                u.b(obj);
                m.this.contract.t();
                m mVar = m.this;
                vn2.a.b.ToSendSuccess toSendSuccess = new vn2.a.b.ToSendSuccess(success.getReportedIncidentReference());
                this.f207638f = vq.j.a(success);
                this.f207637e = 1;
                if (mVar.F(toSendSuccess, this) == objE) {
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
        public final Object w(vn2.a.Success success, State state, tq.e<? super i0> eVar) {
            j jVar = m.this.new j(eVar);
            jVar.f207638f = success;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvn2/a$d;", "action", "Lvn2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvn2/a$d;Lvn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<vn2.a.ShowAttachmentPreview, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207641f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            vn2.a.ShowAttachmentPreview showAttachmentPreview = (vn2.a.ShowAttachmentPreview) this.f207641f;
            Object objE = uq.b.e();
            int i15 = this.f207640e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                vn2.a.b.ShowAttachmentPreview showAttachmentPreview2 = new vn2.a.b.ShowAttachmentPreview(new dx3.a.Content(showAttachmentPreview.getTitle(), showAttachmentPreview.getFileContent()));
                this.f207641f = vq.j.a(showAttachmentPreview);
                this.f207640e = 1;
                if (mVar.F(showAttachmentPreview2, this) == objE) {
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
        public final Object w(vn2.a.ShowAttachmentPreview showAttachmentPreview, State state, tq.e<? super i0> eVar) {
            k kVar = m.this.new k(eVar);
            kVar.f207641f = showAttachmentPreview;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f207643d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f207644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f207645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f207646g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f207647h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f207648j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f207649k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f207650l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f207651m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f207652n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f207653p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f207654q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f207655r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f207656s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f207657t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f207658v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f207659w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f207661y;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f207659w = obj;
            this.f207661y |= PKIFailureInfo.systemUnavail;
            return m.this.D9(null, null, null, this);
        }
    }

    public m(yy.a aVar, vn2.d dVar, eu0.b bVar, eu0.g gVar, eu0.c cVar, ac4.a aVar2, ib4.c cVar2, mx.c cVar3, a00.b bVar2, wn2.a aVar3) {
        this.mapper = dVar;
        this.beGetIncidentIdUC = bVar;
        this.beSendOtherReportUC = gVar;
        this.beSendAttachmentUC = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericErrorMapper = cVar2;
        this.labelProvider = cVar3;
        this.pickedFileToAndroidMapper = bVar2;
        this.contract = aVar3;
        wn2.a.SummaryData summaryDataC = aVar3.c();
        State state = new State(summaryDataC.getDescription(), summaryDataC.getEmailAddress(), summaryDataC.c(), v.n());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: vn2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.B9(this.f207568a, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), w9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(State state, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new e(state, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: vn2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.C9(this.f207564a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(m mVar, z zVar) {
        zVar.A(mVar.new f(null));
        g gVar = mVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vn2.a.b.class), oVar, gVar);
        zVar.x(q0.c(vn2.a.c.class), oVar, mVar.new h(null));
        zVar.x(q0.c(vn2.a.HandleDomainError.class), oVar, mVar.new i(null));
        zVar.x(q0.c(vn2.a.Success.class), oVar, mVar.new j(null));
        zVar.x(q0.c(vn2.a.ShowAttachmentPreview.class), oVar, mVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0093  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00e8 -> B:21:0x00eb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object D9(java.util.List<? extends wx.i> r17, a00.b r18, mx.c r19, tq.e<? super java.util.List<? extends lm2.b>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.m.D9(java.util.List, a00.b, mx.c, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(m mVar, mx.c cVar, wx.i iVar) {
        mVar.d9(new vn2.a.ShowAttachmentPreview(cVar.c(q5.f219558m), iVar.getFileContent()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r6.B(r2, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v9(er.p<? super cu0.IncidentId, ? super tq.e<? super oq.i0>, ? extends java.lang.Object> r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vn2.m.a
            if (r0 == 0) goto L13
            r0 = r7
            vn2.m$a r0 = (vn2.m.a) r0
            int r1 = r0.f207589l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207589l = r1
            goto L18
        L13:
            vn2.m$a r0 = new vn2.m$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f207587j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f207589l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f207584f
            cu0.e r6 = (cu0.IncidentId) r6
            java.lang.Object r6 = r0.f207583e
            dx.i r6 = (dx.i) r6
            java.lang.Object r6 = r0.f207582d
            er.p r6 = (er.p) r6
            oq.u.b(r7)
            goto L9e
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f207582d
            er.p r6 = (er.p) r6
            oq.u.b(r7)
            goto L5a
        L48:
            oq.u.b(r7)
            eu0.b r7 = r5.beGetIncidentIdUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            r0.f207582d = r6
            r0.f207589l = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L5a
            goto L9d
        L5a:
            dx.i r7 = (dx.i) r7
            boolean r2 = r7 instanceof dx.i.Left
            if (r2 == 0) goto L71
            dx.i$b r7 = (dx.i.Left) r7
            java.lang.Object r6 = r7.b()
            dx.b r6 = (dx.b) r6
            vn2.a$a r7 = new vn2.a$a
            r7.<init>(r6)
            r5.d9(r7)
            goto L9e
        L71:
            boolean r2 = r7 instanceof dx.i.Right
            if (r2 == 0) goto La1
            r2 = r7
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            cu0.e r2 = (cu0.IncidentId) r2
            java.lang.Object r4 = vq.j.a(r6)
            r0.f207582d = r4
            java.lang.Object r7 = vq.j.a(r7)
            r0.f207583e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f207584f = r7
            r7 = 0
            r0.f207585g = r7
            r0.f207586h = r7
            r0.f207589l = r3
            java.lang.Object r6 = r6.B(r2, r0)
            if (r6 != r1) goto L9e
        L9d:
            return r1
        L9e:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        La1:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.m.v9(er.p, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vn2.c.Data w9(State state) {
        return this.mapper.b(new vn2.d.Params(state, b9(vn2.a.c.f207534a), b9(vn2.a.b.C5448a.f207529a), b9(vn2.a.b.C5449b.f207530a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        if (y9(r1, r20, r4) == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012f, code lost:
    
        if (x9(r1, r8, r4) == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x9(cu0.IncidentId r19, vn2.State r20, tq.e<? super oq.i0> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.m.x9(cu0.e, vn2.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(IncidentId incidentId, State state, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f207605h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f207605h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f207603f;
        Object objE = uq.b.e();
        int i16 = cVar.f207605h;
        if (i16 == 0) {
            u.b(objC);
            eu0.g gVar = this.beSendOtherReportUC;
            eu0.g.Params params = new eu0.g.Params(incidentId, new OtherReport(state.getDescription(), state.getEmailAddress()));
            cVar.f207601d = vq.j.a(incidentId);
            cVar.f207602e = vq.j.a(state);
            cVar.f207605h = 1;
            objC = gVar.c(params, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(new vn2.a.HandleDomainError((dx.b) ((dx.i.Left) iVar).b()));
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            d9(new vn2.a.Success((ReportedIncidentReference) ((dx.i.Right) iVar).b()));
        }
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<vn2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, vn2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<vn2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vn2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wn2.a aVar) {
        super.P5(aVar);
    }
}
