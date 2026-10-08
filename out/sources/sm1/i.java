package sm1;

import er.q;
import f00.j0;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u00014B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lsm1/i;", "Ll00/g;", "Lsm1/e;", "Lsm1/d;", "", "Lyy/a;", "stateMachineFactory", "Ltm1/b;", "exitDialogMapper", "Lsm1/a;", "contractFactory", "Lmm1/a;", "type", "<init>", "(Lyy/a;Ltm1/b;Lsm1/a;Lmm1/a;)V", "Lsm1/f;", "o9", "()Lsm1/f;", "Loq/i0;", "q9", "()V", "m9", "b", "Ltm1/b;", "c", "Lsm1/e;", "initialState", "Lsm1/b;", "d", "Lsm1/b;", "n9", "()Lsm1/b;", "contract", "Lxw/b;", "Lsm1/d$a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "a", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<e, sm1.d> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tm1.b exitDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sm1.b contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sm1.d.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, sm1.d> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsm1/i$a;", "", "Lmm1/a;", "Lsm1/i;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0 {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f182388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f182389b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f182390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f182391b;

            /* JADX INFO: renamed from: sm1.i$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4703a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f182392d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f182393e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f182394f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f182396h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f182397j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f182398k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f182399l;

                public C4703a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f182392d = obj;
                    this.f182393e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i iVar) {
                this.f182390a = hVar;
                this.f182391b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4703a c4703a;
                if (eVar instanceof C4703a) {
                    c4703a = (C4703a) eVar;
                    int i15 = c4703a.f182393e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4703a.f182393e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4703a = new C4703a(eVar);
                    }
                } else {
                    c4703a = new C4703a(eVar);
                }
                Object obj2 = c4703a.f182392d;
                Object objE = uq.b.e();
                int i16 = c4703a.f182393e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f182390a;
                    f fVarO9 = this.f182391b.o9();
                    c4703a.f182394f = vq.j.a(obj);
                    c4703a.f182396h = vq.j.a(c4703a);
                    c4703a.f182397j = vq.j.a(obj);
                    c4703a.f182398k = vq.j.a(hVar);
                    c4703a.f182399l = 0;
                    c4703a.f182393e = 1;
                    if (hVar.F(fVarO9, c4703a) == objE) {
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

        public b(mu.g gVar, i iVar) {
            this.f182388a = gVar;
            this.f182389b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f> hVar, tq.e eVar) {
            Object objA = this.f182388a.a(new a(hVar, this.f182389b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsm1/d$b;", "<unused var>", "Lsm1/e;", "Loq/i0;", "<anonymous>", "(Lsm1/d$b;Lsm1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<sm1.d.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182400e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f182400e;
            if (i15 == 0) {
                u.b(obj);
                i iVar = i.this;
                sm1.d.a.Dialog dialog = new sm1.d.a.Dialog(i.this.exitDialogMapper.b(new tm1.b.Params(i.this.b9(sm1.d.c.f182377a))));
                this.f182400e = 1;
                if (iVar.F(dialog, this) == objE) {
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
        public final Object w(sm1.d.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return i.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsm1/d$c;", "<unused var>", "Lsm1/e;", "Loq/i0;", "<anonymous>", "(Lsm1/d$c;Lsm1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<sm1.d.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f182402e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f182402e;
            if (i15 == 0) {
                u.b(obj);
                i iVar = i.this;
                sm1.d.a.b bVar = sm1.d.a.b.f182375a;
                this.f182402e = 1;
                if (iVar.F(bVar, this) == objE) {
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
        public final Object w(sm1.d.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return i.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public i(yy.a aVar, tm1.b bVar, sm1.a aVar2, mm1.a aVar3) {
        this.exitDialogMapper = bVar;
        e eVar = e.f182378a;
        this.initialState = eVar;
        this.contract = aVar2.a(aVar3);
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: sm1.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.r9(this.f182380a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), o9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f o9() {
        return f.f182379a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final i iVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: sm1.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.s9(this.f182381a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(i iVar, z zVar) {
        c cVar = iVar.new c(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sm1.d.b.class), oVar, cVar);
        zVar.x(q0.c(sm1.d.c.class), oVar, iVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<sm1.d.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, sm1.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sm1.d.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    public void m9() {
        d9(sm1.d.c.f182377a);
    }

    /* JADX INFO: renamed from: n9, reason: from getter */
    public sm1.b getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mm1.a aVar) {
        super.P5(aVar);
    }

    public void q9() {
        d9(sm1.d.b.f182376a);
    }
}
