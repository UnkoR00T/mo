package es2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qv0.PenaltyPoints;
import qv0.Violation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001c\u001a\u00020\u0018*\u00020\u001bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00100\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Les2/s;", "Ll00/g;", "Les2/b;", "Les2/a;", "Les2/c;", "", "Lyy/a;", "stateMachineFactory", "Lyv0/a;", "getPenaltyPointsUseCase", "Lf01/b;", "launchNativeRatingUC", "Lfs2/b;", "penaltyPointsMapper", "Lib4/c;", "errorMapper", "<init>", "(Lyy/a;Lyv0/a;Lf01/b;Lfs2/b;Lib4/c;)V", "state", "Les2/c$a;", "u9", "(Les2/b;)Les2/c$a;", "Ly30/n$b$b;", "selectedType", "Loq/i0;", "w9", "(Ly30/n$b$b;)V", "Ldx/b;", "s9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lyv0/a;", "c", "Lf01/b;", "d", "Lfs2/b;", "e", "Lib4/c;", "Les2/b$b;", "f", "Les2/b$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Les2/a$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<es2.b, es2.a> implements es2.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yv0.a getPenaltyPointsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fs2.b penaltyPointsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final es2.b.C1255b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<es2.b, es2.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<es2.a.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<es2.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<y30.n.Switch.EnumC5973b, i0> {
        a(Object obj) {
            super(1, obj, s.class, "onStatusTabSelected", "onStatusTabSelected(Lpl/gov/coi/common/ui/ds/controllers/ControllersData$Switch$Type;)V", 0);
        }

        public final void E(y30.n.Switch.EnumC5973b enumC5973b) {
            ((s) this.f66391b).w9(enumC5973b);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(y30.n.Switch.EnumC5973b enumC5973b) {
            E(enumC5973b);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<es2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f53315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f53316b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f53317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f53318b;

            /* JADX INFO: renamed from: es2.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1258a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f53319d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f53320e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f53321f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f53323h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f53324j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f53325k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f53326l;

                public C1258a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f53319d = obj;
                    this.f53320e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f53317a = hVar;
                this.f53318b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1258a c1258a;
                if (eVar instanceof C1258a) {
                    c1258a = (C1258a) eVar;
                    int i15 = c1258a.f53320e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1258a.f53320e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1258a = new C1258a(eVar);
                    }
                } else {
                    c1258a = new C1258a(eVar);
                }
                Object obj2 = c1258a.f53319d;
                Object objE = uq.b.e();
                int i16 = c1258a.f53320e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f53317a;
                    es2.c.a aVarU9 = this.f53318b.u9((es2.b) obj);
                    c1258a.f53321f = vq.j.a(obj);
                    c1258a.f53323h = vq.j.a(c1258a);
                    c1258a.f53324j = vq.j.a(obj);
                    c1258a.f53325k = vq.j.a(hVar);
                    c1258a.f53326l = 0;
                    c1258a.f53320e = 1;
                    if (hVar.F(aVarU9, c1258a) == objE) {
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

        public b(mu.g gVar, s sVar) {
            this.f53315a = gVar;
            this.f53316b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super es2.c.a> hVar, tq.e eVar) {
            Object objA = this.f53315a.a(new a(hVar, this.f53316b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Les2/a$f;", "<unused var>", "Les2/b;", "Loq/i0;", "<anonymous>", "(Les2/a$f;Les2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<es2.a.f, es2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53327e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53327e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<es2.a.e> bVarY1 = s.this.Y1();
                es2.a.e.d dVar = es2.a.e.d.f53272a;
                this.f53327e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(es2.a.f fVar, es2.b bVar, tq.e<? super i0> eVar) {
            return s.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Les2/a$d;", "<unused var>", "Lk10/c0;", "Les2/b;", "state", "Lk10/l;", "<anonymous>", "(Les2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<es2.a.d, c0<es2.b>, tq.e<? super k10.l<? extends es2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f53329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f53330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f53331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f53332h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f53333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f53334k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f53335l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f53336m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f53337n;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final es2.b.DataSet O(PenaltyPoints penaltyPoints, es2.b bVar) {
            return new es2.b.DataSet(null, penaltyPoints, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f53337n;
            Object objE = uq.b.e();
            int i15 = this.f53336m;
            if (i15 == 0) {
                oq.u.b(obj);
                yv0.a aVar = s.this.getPenaltyPointsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f53337n = c0Var;
                this.f53336m = 1;
                obj = aVar.c(c1792a, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f53331g;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            s sVar = s.this;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PenaltyPoints penaltyPoints = (PenaltyPoints) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: es2.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.d.O(penaltyPoints, (b) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            k10.l lVarC = c0Var.c();
            this.f53337n = vq.j.a(c0Var);
            this.f53329e = vq.j.a(iVar);
            this.f53330f = vq.j.a(bVar);
            this.f53331g = lVarC;
            this.f53332h = vq.j.a(lVarC);
            this.f53333j = 0;
            this.f53334k = 0;
            this.f53335l = 0;
            this.f53336m = 2;
            return sVar.s9(bVar, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(es2.a.d dVar, c0<es2.b> c0Var, tq.e<? super k10.l<? extends es2.b>> eVar) {
            d dVar2 = s.this.new d(eVar);
            dVar2.f53337n = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Les2/b$b;", "it", "Loq/i0;", "<anonymous>", "(Les2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<es2.b.C1255b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53339e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f53339e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            s.this.d9(es2.a.d.f53268a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(es2.b.C1255b c1255b, tq.e<? super i0> eVar) {
            return ((e) v(c1255b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return s.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Les2/a$b;", "<unused var>", "Les2/b$b;", "Loq/i0;", "<anonymous>", "(Les2/a$b;Les2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<es2.a.b, es2.b.C1255b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53341e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53341e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<es2.a.e> bVarY1 = s.this.Y1();
                es2.a.e.C1254a c1254a = es2.a.e.C1254a.f53269a;
                this.f53341e = 1;
                if (bVarY1.F(c1254a, this) == objE) {
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
        public final Object w(es2.a.b bVar, es2.b.C1255b c1255b, tq.e<? super i0> eVar) {
            return s.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Les2/a$a;", "action", "Lk10/c0;", "Les2/b$a;", "state", "Lk10/l;", "Les2/b;", "<anonymous>", "(Les2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<es2.a.ChangeSelectedTab, c0<es2.b.DataSet>, tq.e<? super k10.l<? extends es2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f53345g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final es2.b.DataSet O(c0 c0Var, es2.a.ChangeSelectedTab changeSelectedTab, es2.b.DataSet dataSet) {
            return es2.b.DataSet.b((es2.b.DataSet) c0Var.a(), changeSelectedTab.getSelectedType(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final es2.a.ChangeSelectedTab changeSelectedTab = (es2.a.ChangeSelectedTab) this.f53344f;
            final c0 c0Var = (c0) this.f53345g;
            uq.b.e();
            if (this.f53343e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: es2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(c0Var, changeSelectedTab, (b.DataSet) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(es2.a.ChangeSelectedTab changeSelectedTab, c0<es2.b.DataSet> c0Var, tq.e<? super k10.l<? extends es2.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f53344f = changeSelectedTab;
            gVar.f53345g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Les2/a$c;", "action", "Les2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Les2/a$c;Les2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<es2.a.GoToDetails, es2.b.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53347f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            es2.a.GoToDetails goToDetails = (es2.a.GoToDetails) this.f53347f;
            Object objE = uq.b.e();
            int i15 = this.f53346e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<es2.a.e> bVarY1 = s.this.Y1();
                es2.a.e.GoToDetails goToDetails2 = new es2.a.e.GoToDetails(goToDetails.getViolation());
                this.f53347f = vq.j.a(goToDetails);
                this.f53346e = 1;
                if (bVarY1.F(goToDetails2, this) == objE) {
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
        public final Object w(es2.a.GoToDetails goToDetails, es2.b.DataSet dataSet, tq.e<? super i0> eVar) {
            h hVar = s.this.new h(eVar);
            hVar.f53347f = goToDetails;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Les2/a$b;", "<unused var>", "Les2/b$a;", "Loq/i0;", "<anonymous>", "(Les2/a$b;Les2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<es2.a.b, es2.b.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53349e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.c(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f53349e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                es2.s r5 = es2.s.this
                xw.b r5 = r5.Y1()
                es2.a$e$a r1 = es2.a.e.C1254a.f53269a
                r4.f53349e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                es2.s r5 = es2.s.this
                f01.b r5 = es2.s.o9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f53349e = r2
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: es2.s.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(es2.a.b bVar, es2.b.DataSet dataSet, tq.e<? super i0> eVar) {
            return s.this.new i(eVar).J(i0.f148189a);
        }
    }

    public s(yy.a aVar, yv0.a aVar2, f01.b bVar, fs2.b bVar2, ib4.c cVar) {
        this.getPenaltyPointsUseCase = aVar2;
        this.launchNativeRatingUC = bVar;
        this.penaltyPointsMapper = bVar2;
        this.errorMapper = cVar;
        es2.b.C1255b c1255b = es2.b.C1255b.f53276a;
        this.initialState = c1255b;
        this.stateMachine = aVar.a(c1255b, new er.l() { // from class: es2.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.y9(this.f53301a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), u9(c1255b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, z zVar) {
        zVar.C(sVar.new e(null));
        f fVar = sVar.new f(null);
        zVar.x(q0.c(es2.a.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(es2.a.ChangeSelectedTab.class), oVar, gVar);
        zVar.x(q0.c(es2.a.GoToDetails.class), oVar, sVar.new h(null));
        zVar.x(q0.c(es2.a.b.class), oVar, sVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new es2.a.e.ShowError(this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: es2.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f53306a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(s sVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            sVar.d9(es2.a.d.f53268a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            sVar.d9(es2.a.b.f53266a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final es2.c.a u9(es2.b state) {
        return this.penaltyPointsMapper.b(new fs2.b.Params(state, b9(es2.a.b.f53266a), b9(es2.a.f.f53273a), new er.l() { // from class: es2.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f53302a, (Violation) obj);
            }
        }, new a(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, Violation violation) {
        sVar.d9(new es2.a.GoToDetails(violation));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w9(y30.n.Switch.EnumC5973b selectedType) {
        d9(new es2.a.ChangeSelectedTab(selectedType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(es2.b.class), new er.l() { // from class: es2.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f53303a, (z) obj);
            }
        });
        vVar.c(q0.c(es2.b.C1255b.class), new er.l() { // from class: es2.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f53304a, (z) obj);
            }
        });
        vVar.c(q0.c(es2.b.DataSet.class), new er.l() { // from class: es2.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f53305a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(s sVar, z zVar) {
        c cVar = sVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(es2.a.f.class), oVar, cVar);
        zVar.v(q0.c(es2.a.d.class), oVar, sVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<es2.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<es2.b, es2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<es2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PenaltyPoints penaltyPoints) {
        super.P5(penaltyPoints);
    }
}
