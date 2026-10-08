package ww3;

import fr.q0;
import fx.Rectangle;
import jw3.MaskDefinition;
import k10.c0;
import k10.z;
import lw3.SetupData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lww3/s;", "Ll00/g;", "Lww3/g;", "", "Lww3/h;", "Lyy/a;", "stateMachineFactory", "Lxw3/a;", "mapper", "Lww3/f;", "data", "<init>", "(Lyy/a;Lxw3/a;Lww3/f;)V", "state", "Lww3/h$a;", "o9", "(Lww3/g;)Lww3/h$a;", "b", "Lxw3/a;", "c", "Lww3/f;", "Lww3/g$b;", "d", "Lww3/g$b;", "initialState", "Lxw/b;", "Lww3/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<g, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g.Measuring initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ww3.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<g, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f215617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f215618b;

        /* JADX INFO: renamed from: ww3.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5730a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f215619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f215620b;

            /* JADX INFO: renamed from: ww3.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5731a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f215621d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f215622e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f215623f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f215625h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f215626j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f215627k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f215628l;

                public C5731a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f215621d = obj;
                    this.f215622e |= PKIFailureInfo.systemUnavail;
                    return C5730a.this.F(null, this);
                }
            }

            public C5730a(mu.h hVar, s sVar) {
                this.f215619a = hVar;
                this.f215620b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5731a c5731a;
                if (eVar instanceof C5731a) {
                    c5731a = (C5731a) eVar;
                    int i15 = c5731a.f215622e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5731a.f215622e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5731a = new C5731a(eVar);
                    }
                } else {
                    c5731a = new C5731a(eVar);
                }
                Object obj2 = c5731a.f215621d;
                Object objE = uq.b.e();
                int i16 = c5731a.f215622e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f215619a;
                    h.Data dataO9 = this.f215620b.o9((g) obj);
                    c5731a.f215623f = vq.j.a(obj);
                    c5731a.f215625h = vq.j.a(c5731a);
                    c5731a.f215626j = vq.j.a(obj);
                    c5731a.f215627k = vq.j.a(hVar);
                    c5731a.f215628l = 0;
                    c5731a.f215622e = 1;
                    if (hVar.F(dataO9, c5731a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f215617a = gVar;
            this.f215618b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f215617a.a(new C5730a(hVar, this.f215618b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lww3/d;", "<unused var>", "Lww3/g;", "Loq/i0;", "<anonymous>", "(Lww3/d;Lww3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ww3.d, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215629e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215629e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ww3.a.b bVar = ww3.a.b.f215573a;
                this.f215629e = 1;
                if (sVar.F(bVar, this) == objE) {
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
        public final Object w(ww3.d dVar, g gVar, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lww3/b;", "<unused var>", "Lww3/g;", "state", "Loq/i0;", "<anonymous>", "(Lww3/b;Lww3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ww3.b, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215632f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g gVar = (g) this.f215632f;
            Object objE = uq.b.e();
            int i15 = this.f215631e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ww3.a.AdjustPhoto adjustPhoto = new ww3.a.AdjustPhoto(new SetupData(s.this.data.getPhoto(), gVar.getMaskType(), s.this.data.getRequirements(), s.this.data.getIsUnderGuardianship()));
                this.f215632f = vq.j.a(gVar);
                this.f215631e = 1;
                if (sVar.F(adjustPhoto, this) == objE) {
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
        public final Object w(ww3.b bVar, g gVar, tq.e<? super i0> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f215632f = gVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lww3/e;", "action", "Lk10/c0;", "Lww3/g$b;", "state", "Lk10/l;", "Lww3/g;", "<anonymous>", "(Lww3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnContainerChanged, c0<g.Measuring>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f215636g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Initialized O(s sVar, OnContainerChanged onContainerChanged, c0 c0Var, g.Measuring measuring) {
            return new g.Initialized(((g.Measuring) c0Var.a()).getIsAdjustmentEnabled(), sVar.data.getPhoto(), sVar.data.getScaleType(), new MaskDefinition(onContainerChanged.getContainer(), ((g.Measuring) c0Var.a()).getMaskType()), false, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnContainerChanged onContainerChanged = (OnContainerChanged) this.f215635f;
            final c0 c0Var = (c0) this.f215636g;
            uq.b.e();
            if (this.f215634e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s sVar = s.this;
            return c0Var.d(new er.l() { // from class: ww3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(sVar, onContainerChanged, c0Var, (g.Measuring) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnContainerChanged onContainerChanged, c0<g.Measuring> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            d dVar = s.this.new d(eVar);
            dVar.f215635f = onContainerChanged;
            dVar.f215636g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lww3/e;", "action", "Lk10/c0;", "Lww3/g$a;", "state", "Lk10/l;", "Lww3/g;", "<anonymous>", "(Lww3/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<OnContainerChanged, c0<g.Initialized>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f215640g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Initialized O(OnContainerChanged onContainerChanged, g.Initialized initialized) {
            return g.Initialized.d(initialized, false, null, null, MaskDefinition.b(initialized.getMaskDefinition(), onContainerChanged.getContainer(), null, 2, null), false, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnContainerChanged onContainerChanged = (OnContainerChanged) this.f215639f;
            c0 c0Var = (c0) this.f215640g;
            uq.b.e();
            if (this.f215638e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(onContainerChanged.getContainer(), ((g.Initialized) c0Var.a()).getMaskDefinition().getContainer()) ? c0Var.c() : c0Var.b(new er.l() { // from class: ww3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(onContainerChanged, (g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnContainerChanged onContainerChanged, c0<g.Initialized> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f215639f = onContainerChanged;
            eVar2.f215640g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lww3/c;", "<unused var>", "Lk10/c0;", "Lww3/g$a;", "state", "Lk10/l;", "Lww3/g;", "<anonymous>", "(Lww3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ww3.c, c0<g.Initialized>, tq.e<? super k10.l<? extends g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215642f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.Initialized O(c0 c0Var, g.Initialized initialized) {
            return g.Initialized.d(initialized, false, null, null, null, !((g.Initialized) c0Var.a()).getIsMaskVisible(), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f215642f;
            uq.b.e();
            if (this.f215641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ww3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.f.O(c0Var, (g.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ww3.c cVar, c0<g.Initialized> c0Var, tq.e<? super k10.l<? extends g>> eVar) {
            f fVar = new f(eVar);
            fVar.f215642f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, xw3.a aVar2, SetupData setupData) {
        this.mapper = aVar2;
        this.data = setupData;
        g.Measuring measuring = new g.Measuring(setupData.getMaskType(), setupData.getIsAdjustmentEnabled());
        this.initialState = measuring;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(measuring, new er.l() { // from class: ww3.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9(this.f215610a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(measuring));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data o9(g state) {
        return this.mapper.b(new xw3.a.Params(state, new er.l() { // from class: ww3.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.p9(this.f215607a, (Rectangle) obj);
            }
        }, b9(ww3.c.f215575a), b9(ww3.d.f215576a), b9(ww3.b.f215574a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(s sVar, Rectangle rectangle) {
        sVar.d9(new OnContainerChanged(rectangle));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(g.class), new er.l() { // from class: ww3.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.s9(this.f215608a, (z) obj);
            }
        });
        vVar.c(q0.c(g.Measuring.class), new er.l() { // from class: ww3.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f215609a, (z) obj);
            }
        });
        vVar.c(q0.c(g.Initialized.class), new er.l() { // from class: ww3.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ww3.d.class), oVar, bVar);
        zVar.x(q0.c(ww3.b.class), oVar, sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(s sVar, z zVar) {
        d dVar = sVar.new d(null);
        zVar.v(q0.c(OnContainerChanged.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnContainerChanged.class), oVar, eVar);
        zVar.v(q0.c(ww3.c.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ww3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ww3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
