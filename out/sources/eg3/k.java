package eg3;

import er.q;
import fr.q0;
import gg3.DescriptionPreparationWaitingModel;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Leg3/k;", "Ll00/g;", "Leg3/c;", "", "Leg3/d;", "Lyy/a;", "stateMachineFactory", "Lfg3/a;", "mapper", "Lgg3/a;", "setupData", "<init>", "(Lyy/a;Lfg3/a;Lgg3/a;)V", "k9", "(Lgg3/a;)Leg3/c;", "Leg3/d$a;", "m9", "(Leg3/c;)Leg3/d$a;", "data", "Loq/i0;", "n9", "(Lgg3/a;)V", "b", "Lfg3/a;", "c", "Lgg3/a;", "d", "Leg3/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Leg3/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<eg3.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fg3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DescriptionPreparationWaitingModel setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final eg3.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<eg3.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<eg3.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f50198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f50199b;

        /* JADX INFO: renamed from: eg3.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1208a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f50200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f50201b;

            /* JADX INFO: renamed from: eg3.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1209a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f50202d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f50203e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f50204f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f50206h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f50207j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f50208k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f50209l;

                public C1209a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f50202d = obj;
                    this.f50203e |= PKIFailureInfo.systemUnavail;
                    return C1208a.this.F(null, this);
                }
            }

            public C1208a(mu.h hVar, k kVar) {
                this.f50200a = hVar;
                this.f50201b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1209a c1209a;
                if (eVar instanceof C1209a) {
                    c1209a = (C1209a) eVar;
                    int i15 = c1209a.f50203e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1209a.f50203e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1209a = new C1209a(eVar);
                    }
                } else {
                    c1209a = new C1209a(eVar);
                }
                Object obj2 = c1209a.f50202d;
                Object objE = uq.b.e();
                int i16 = c1209a.f50203e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f50200a;
                    d.Data dataM9 = this.f50201b.m9((eg3.c) obj);
                    c1209a.f50204f = vq.j.a(obj);
                    c1209a.f50206h = vq.j.a(c1209a);
                    c1209a.f50207j = vq.j.a(obj);
                    c1209a.f50208k = vq.j.a(hVar);
                    c1209a.f50209l = 0;
                    c1209a.f50203e = 1;
                    if (hVar.F(dataM9, c1209a) == objE) {
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
            this.f50198a = gVar;
            this.f50199b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f50198a.a(new C1208a(hVar, this.f50199b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leg3/a;", "action", "Leg3/c;", "state", "Loq/i0;", "<anonymous>", "(Leg3/a;Leg3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<eg3.a, eg3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50211f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eg3.a aVar = (eg3.a) this.f50211f;
            Object objE = uq.b.e();
            int i15 = this.f50210e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                this.f50211f = vq.j.a(aVar);
                this.f50210e = 1;
                if (kVar.F(aVar, this) == objE) {
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
        public final Object w(eg3.a aVar, eg3.c cVar, tq.e<? super i0> eVar) {
            b bVar = k.this.new b(eVar);
            bVar.f50211f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leg3/b;", "action", "Lk10/c0;", "Leg3/c;", "state", "Lk10/l;", "<anonymous>", "(Leg3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<Setup, c0<eg3.c>, tq.e<? super k10.l<? extends eg3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f50214f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f50215g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eg3.c O(k kVar, Setup setup, eg3.c cVar) {
            return kVar.k9(setup.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f50214f;
            c0 c0Var = (c0) this.f50215g;
            Object objE = uq.b.e();
            int i15 = this.f50213e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                eg3.a.StartListeningForDescription startListeningForDescription = new eg3.a.StartListeningForDescription(setup.getData().getProcessId());
                this.f50214f = setup;
                this.f50215g = c0Var;
                this.f50213e = 1;
                if (kVar.F(startListeningForDescription, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final k kVar2 = k.this;
            return c0Var.d(new er.l() { // from class: eg3.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.c.O(kVar2, setup, (c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<eg3.c> c0Var, tq.e<? super k10.l<? extends eg3.c>> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f50214f = setup;
            cVar.f50215g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, fg3.a aVar2, DescriptionPreparationWaitingModel descriptionPreparationWaitingModel) {
        this.mapper = aVar2;
        this.setupData = descriptionPreparationWaitingModel;
        eg3.c cVarK9 = k9(descriptionPreparationWaitingModel);
        this.initialState = cVarK9;
        this.stateMachine = aVar.a(cVarK9, new er.l() { // from class: eg3.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.o9(this.f50191a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(cVarK9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eg3.c k9(DescriptionPreparationWaitingModel descriptionPreparationWaitingModel) {
        if (descriptionPreparationWaitingModel == null || !descriptionPreparationWaitingModel.getRejection()) {
            return (descriptionPreparationWaitingModel != null ? descriptionPreparationWaitingModel.getAuthor() : null) == sv0.o.OTHER ? eg3.c.b.f50178a : eg3.c.a.f50177a;
        }
        return eg3.c.C1207c.f50179a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data m9(eg3.c cVar) {
        return this.mapper.b(new fg3.a.Params(cVar, b9(eg3.a.C1206a.f50174a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final k kVar, v vVar) {
        vVar.c(q0.c(eg3.c.class), new er.l() { // from class: eg3.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f50190a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(eg3.a.class), oVar, bVar);
        zVar.v(q0.c(Setup.class), oVar, kVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<eg3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<eg3.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(eg3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public void P5(DescriptionPreparationWaitingModel data) {
        d9(new Setup(data));
    }
}
