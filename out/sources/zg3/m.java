package zg3;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lzg3/m;", "Ll00/g;", "Lzg3/d;", "", "Lzg3/e;", "Lyy/a;", "stateMachineFactory", "Lah3/a;", "mapper", "Lae3/a;", "clearDraftNewCollisionDataUC", "Lsv0/y;", "processId", "<init>", "(Lyy/a;Lah3/a;Lae3/a;Lsv0/y;)V", "Lzg3/e$a;", "m9", "()Lzg3/e$a;", "b", "Lah3/a;", "c", "Lae3/a;", "d", "Lsv0/y;", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzg3/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<zg3.d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ah3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ae3.a clearDraftNewCollisionDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ProcessId processId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<zg3.d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zg3.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state = a9(new a(e9().getState(), this), m9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f235222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f235223b;

        /* JADX INFO: renamed from: zg3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6338a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f235224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f235225b;

            /* JADX INFO: renamed from: zg3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6339a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f235226d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f235227e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f235228f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f235230h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f235231j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f235232k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f235233l;

                public C6339a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f235226d = obj;
                    this.f235227e |= PKIFailureInfo.systemUnavail;
                    return C6338a.this.F(null, this);
                }
            }

            public C6338a(mu.h hVar, m mVar) {
                this.f235224a = hVar;
                this.f235225b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6339a c6339a;
                if (eVar instanceof C6339a) {
                    c6339a = (C6339a) eVar;
                    int i15 = c6339a.f235227e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6339a.f235227e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6339a = new C6339a(eVar);
                    }
                } else {
                    c6339a = new C6339a(eVar);
                }
                Object obj2 = c6339a.f235226d;
                Object objE = uq.b.e();
                int i16 = c6339a.f235227e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f235224a;
                    e.Data dataM9 = this.f235225b.m9();
                    c6339a.f235228f = vq.j.a(obj);
                    c6339a.f235230h = vq.j.a(c6339a);
                    c6339a.f235231j = vq.j.a(obj);
                    c6339a.f235232k = vq.j.a(hVar);
                    c6339a.f235233l = 0;
                    c6339a.f235227e = 1;
                    if (hVar.F(dataM9, c6339a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f235222a = gVar;
            this.f235223b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f235222a.a(new C6338a(hVar, this.f235223b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzg3/d;", "it", "Loq/i0;", "<anonymous>", "(Lzg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<zg3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235234e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235234e;
            if (i15 == 0) {
                u.b(obj);
                ae3.a aVar = m.this.clearDraftNewCollisionDataUC;
                ae3.a.Params params = new ae3.a.Params(m.this.processId);
                this.f235234e = 1;
                if (aVar.d(params, this) == objE) {
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
        public final Object B(zg3.d dVar, tq.e<? super i0> eVar) {
            return ((b) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg3/a;", "<unused var>", "Lzg3/d;", "Loq/i0;", "<anonymous>", "(Lzg3/a;Lzg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<zg3.a, zg3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235236e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235236e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                zg3.b.a aVar = zg3.b.a.f235198a;
                this.f235236e = 1;
                if (mVar.F(aVar, this) == objE) {
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
        public final Object w(zg3.a aVar, zg3.d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzg3/c;", "<unused var>", "Lzg3/d;", "Loq/i0;", "<anonymous>", "(Lzg3/c;Lzg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<zg3.c, zg3.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235238e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235238e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                zg3.b.C6337b c6337b = zg3.b.C6337b.f235199a;
                this.f235238e = 1;
                if (mVar.F(c6337b, this) == objE) {
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
        public final Object w(zg3.c cVar, zg3.d dVar, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ah3.a aVar2, ae3.a aVar3, ProcessId processId) {
        this.mapper = aVar2;
        this.clearDraftNewCollisionDataUC = aVar3;
        this.processId = processId;
        this.stateMachine = aVar.a(zg3.d.f235201a, new er.l() { // from class: zg3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f235215a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data m9() {
        return this.mapper.b(new ah3.a.Params(b9(zg3.a.f235197a), b9(zg3.c.f235200a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(zg3.d.class), new er.l() { // from class: zg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f235214a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        zVar.C(mVar.new b(null));
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(zg3.a.class), oVar, cVar);
        zVar.x(q0.c(zg3.c.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<zg3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<zg3.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(zg3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ProcessId processId) {
        super.P5(processId);
    }
}
