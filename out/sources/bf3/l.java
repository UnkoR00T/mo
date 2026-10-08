package bf3;

import df3.VehicleDetailsData;
import er.p;
import er.q;
import fr.q0;
import iy.b0;
import iy.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lbf3/l;", "Ll00/g;", "Lbf3/c;", "", "Lbf3/d;", "Lyy/a;", "stateMachineFactory", "Lcf3/d;", "mapper", "La14/d;", "copyToClipboardUseCase", "Ldf3/a;", "setupData", "<init>", "(Lyy/a;Lcf3/d;La14/d;Ldf3/a;)V", "Lbf3/d$a;", "l9", "(Lbf3/c;)Lbf3/d$a;", "b", "Lcf3/d;", "c", "La14/d;", "d", "Ldf3/a;", "e", "Lbf3/c;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbf3/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cf3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final VehicleDetailsData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bf3.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19258b;

        /* JADX INFO: renamed from: bf3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0489a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f19260b;

            /* JADX INFO: renamed from: bf3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0490a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19261d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19262e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19263f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19265h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19266j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19267k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19268l;

                public C0490a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19261d = obj;
                    this.f19262e |= PKIFailureInfo.systemUnavail;
                    return C0489a.this.F(null, this);
                }
            }

            public C0489a(mu.h hVar, l lVar) {
                this.f19259a = hVar;
                this.f19260b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0490a c0490a;
                if (eVar instanceof C0490a) {
                    c0490a = (C0490a) eVar;
                    int i15 = c0490a.f19262e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0490a.f19262e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0490a = new C0490a(eVar);
                    }
                } else {
                    c0490a = new C0490a(eVar);
                }
                Object obj2 = c0490a.f19261d;
                Object objE = uq.b.e();
                int i16 = c0490a.f19262e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f19259a;
                    d.Data dataL9 = this.f19260b.l9((State) obj);
                    c0490a.f19263f = vq.j.a(obj);
                    c0490a.f19265h = vq.j.a(c0490a);
                    c0490a.f19266j = vq.j.a(obj);
                    c0490a.f19267k = vq.j.a(hVar);
                    c0490a.f19268l = 0;
                    c0490a.f19262e = 1;
                    if (hVar.F(dataL9, c0490a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f19257a = gVar;
            this.f19258b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f19257a.a(new C0489a(hVar, this.f19258b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbf3/a;", "action", "Lbf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbf3/a;Lbf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<bf3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19270f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bf3.a aVar = (bf3.a) this.f19270f;
            Object objE = uq.b.e();
            int i15 = this.f19269e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bf3.a> bVarY1 = l.this.Y1();
                this.f19270f = vq.j.a(aVar);
                this.f19269e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(bf3.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f19270f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbf3/b;", "action", "Lbf3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbf3/b;Lbf3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OnCopyToClipboard, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19273f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnCopyToClipboard onCopyToClipboard = (OnCopyToClipboard) this.f19273f;
            Object objE = uq.b.e();
            int i15 = this.f19272e;
            if (i15 == 0) {
                u.b(obj);
                a14.d dVar = l.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(onCopyToClipboard.getValue(), onCopyToClipboard.getLabel());
                this.f19273f = vq.j.a(onCopyToClipboard);
                this.f19272e = 1;
                if (dVar.c(params, this) == objE) {
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
        public final Object w(OnCopyToClipboard onCopyToClipboard, State state, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f19273f = onCopyToClipboard;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, cf3.d dVar, a14.d dVar2, VehicleDetailsData vehicleDetailsData) {
        this.mapper = dVar;
        this.copyToClipboardUseCase = dVar2;
        this.setupData = vehicleDetailsData;
        State state = new State(vehicleDetailsData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: bf3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f19249a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new cf3.d.Params(state, b9(bf3.a.C0488a.f19234a), new p() { // from class: bf3.j
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return l.m9(this.f19248a, (b0) obj, (Label) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, b0 b0Var, Label label) {
        lVar.d9(new OnCopyToClipboard(c0.e(b0Var), label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bf3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f19247a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bf3.a.class), oVar, bVar);
        zVar.x(q0.c(OnCopyToClipboard.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bf3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(VehicleDetailsData vehicleDetailsData) {
        super.P5(vehicleDetailsData);
    }
}
