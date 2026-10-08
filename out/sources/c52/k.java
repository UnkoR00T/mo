package c52;

import e52.CommitmentVariantAssistedData;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y52.StampDutyCommitmentVariantData;
import zr0.BEStampDutyAmount;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lc52/k;", "Ll00/g;", "Lc52/b;", "Lc52/a;", "Lc52/c;", "", "Lyy/a;", "stateMachineFactory", "Ld52/b;", "mapper", "Le52/a;", "commitmentVariantAssistedData", "<init>", "(Lyy/a;Ld52/b;Le52/a;)V", "state", "Lc52/c$a;", "m9", "(Lc52/b;)Lc52/c$a;", "b", "Ld52/b;", "c", "Le52/a;", "d", "Lc52/b;", "initialState", "Lxw/b;", "Lc52/a$c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, c52.a> implements c52.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d52.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CommitmentVariantAssistedData commitmentVariantAssistedData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c52.a.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, c52.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<c52.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c52.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f23648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f23649b;

        /* JADX INFO: renamed from: c52.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0629a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f23650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f23651b;

            /* JADX INFO: renamed from: c52.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0630a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f23652d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f23653e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f23654f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f23656h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f23657j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f23658k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f23659l;

                public C0630a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f23652d = obj;
                    this.f23653e |= PKIFailureInfo.systemUnavail;
                    return C0629a.this.F(null, this);
                }
            }

            public C0629a(mu.h hVar, k kVar) {
                this.f23650a = hVar;
                this.f23651b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0630a c0630a;
                if (eVar instanceof C0630a) {
                    c0630a = (C0630a) eVar;
                    int i15 = c0630a.f23653e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0630a.f23653e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0630a = new C0630a(eVar);
                    }
                } else {
                    c0630a = new C0630a(eVar);
                }
                Object obj2 = c0630a.f23652d;
                Object objE = uq.b.e();
                int i16 = c0630a.f23653e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f23650a;
                    c52.c.Data dataM9 = this.f23651b.m9((State) obj);
                    c0630a.f23654f = vq.j.a(obj);
                    c0630a.f23656h = vq.j.a(c0630a);
                    c0630a.f23657j = vq.j.a(obj);
                    c0630a.f23658k = vq.j.a(hVar);
                    c0630a.f23659l = 0;
                    c0630a.f23653e = 1;
                    if (hVar.F(dataM9, c0630a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f23648a = gVar;
            this.f23649b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c52.c.Data> hVar, tq.e eVar) {
            Object objA = this.f23648a.a(new C0629a(hVar, this.f23649b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc52/a$a;", "<unused var>", "Lc52/b;", "Loq/i0;", "<anonymous>", "(Lc52/a$a;Lc52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<c52.a.C0626a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23660e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23660e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c52.a.c> bVarY1 = k.this.Y1();
                c52.a.c.C0627a c0627a = c52.a.c.C0627a.f23623a;
                this.f23660e = 1;
                if (bVarY1.F(c0627a, this) == objE) {
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
        public final Object w(c52.a.C0626a c0626a, State state, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc52/a$b;", "<unused var>", "Lc52/b;", "Loq/i0;", "<anonymous>", "(Lc52/a$b;Lc52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<c52.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23662e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f23662e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c52.a.c> bVarY1 = k.this.Y1();
                c52.a.c.b bVar = c52.a.c.b.f23624a;
                this.f23662e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(c52.a.b bVar, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc52/a$e;", "action", "Lc52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lc52/a$e;Lc52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<c52.a.ToInstitutions, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23665f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c52.a.ToInstitutions toInstitutions = (c52.a.ToInstitutions) this.f23665f;
            Object objE = uq.b.e();
            int i15 = this.f23664e;
            if (i15 == 0) {
                u.b(obj);
                k.this.d9(new c52.a.SaveCommitmentVariants(toInstitutions.getStampDutyAmount()));
                xw.b<c52.a.c> bVarY1 = k.this.Y1();
                c52.a.c.C0628c c0628c = c52.a.c.C0628c.f23625a;
                this.f23665f = vq.j.a(toInstitutions);
                this.f23664e = 1;
                if (bVarY1.F(c0628c, this) == objE) {
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
        public final Object w(c52.a.ToInstitutions toInstitutions, State state, tq.e<? super i0> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f23665f = toInstitutions;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc52/a$d;", "action", "Lc52/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lc52/a$d;Lc52/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<c52.a.SaveCommitmentVariants, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f23667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23668f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c52.a.SaveCommitmentVariants saveCommitmentVariants = (c52.a.SaveCommitmentVariants) this.f23668f;
            uq.b.e();
            if (this.f23667e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.commitmentVariantAssistedData.getCommitmentVariantContract().H2(new StampDutyCommitmentVariantData(saveCommitmentVariants.getStampDutyCommitmentVariantData().getDescription(), saveCommitmentVariants.getStampDutyCommitmentVariantData().getAmount(), true));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c52.a.SaveCommitmentVariants saveCommitmentVariants, State state, tq.e<? super i0> eVar) {
            e eVar2 = k.this.new e(eVar);
            eVar2.f23668f = saveCommitmentVariants;
            return eVar2.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, d52.b bVar, CommitmentVariantAssistedData commitmentVariantAssistedData) {
        this.mapper = bVar;
        this.commitmentVariantAssistedData = commitmentVariantAssistedData;
        State state = new State(commitmentVariantAssistedData.getCommitmentVariantEntryData().a());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: c52.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f23641a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c52.c.Data m9(State state) {
        return this.mapper.b(new d52.b.Params(state, b9(c52.a.C0626a.f23621a), b9(c52.a.b.f23622a), new er.l() { // from class: c52.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f23640a, (BEStampDutyAmount) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, BEStampDutyAmount bEStampDutyAmount) {
        kVar.d9(new c52.a.ToInstitutions(bEStampDutyAmount));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: c52.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f23639a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c52.a.C0626a.class), oVar, bVar);
        zVar.x(q0.c(c52.a.b.class), oVar, kVar.new c(null));
        zVar.x(q0.c(c52.a.ToInstitutions.class), oVar, kVar.new d(null));
        zVar.x(q0.c(c52.a.SaveCommitmentVariants.class), oVar, kVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c52.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, c52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c52.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(CommitmentVariantAssistedData commitmentVariantAssistedData) {
        super.P5(commitmentVariantAssistedData);
    }
}
