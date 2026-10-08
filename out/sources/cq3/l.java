package cq3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcq3/l;", "Ll00/g;", "Lcq3/e;", "", "Lcq3/f;", "Lyy/a;", "stateMachineFactory", "Ldq3/a;", "screenMapper", "<init>", "(Lyy/a;Ldq3/a;)V", "Lcq3/f$a;", "j9", "()Lcq3/f$a;", "b", "Ldq3/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lcq3/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dq3.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state = a9(new a(e9().getState(), this), j9());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f37282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f37283b;

        /* JADX INFO: renamed from: cq3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0773a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f37284a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f37285b;

            /* JADX INFO: renamed from: cq3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0774a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37286d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f37287e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f37288f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f37290h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f37291j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f37292k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f37293l;

                public C0774a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f37286d = obj;
                    this.f37287e |= PKIFailureInfo.systemUnavail;
                    return C0773a.this.F(null, this);
                }
            }

            public C0773a(mu.h hVar, l lVar) {
                this.f37284a = hVar;
                this.f37285b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0774a c0774a;
                if (eVar instanceof C0774a) {
                    c0774a = (C0774a) eVar;
                    int i15 = c0774a.f37287e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0774a.f37287e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0774a = new C0774a(eVar);
                    }
                } else {
                    c0774a = new C0774a(eVar);
                }
                Object obj2 = c0774a.f37286d;
                Object objE = uq.b.e();
                int i16 = c0774a.f37287e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f37284a;
                    f.Data dataJ9 = this.f37285b.j9();
                    c0774a.f37288f = vq.j.a(obj);
                    c0774a.f37290h = vq.j.a(c0774a);
                    c0774a.f37291j = vq.j.a(obj);
                    c0774a.f37292k = vq.j.a(hVar);
                    c0774a.f37293l = 0;
                    c0774a.f37287e = 1;
                    if (hVar.F(dataJ9, c0774a) == objE) {
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
            this.f37282a = gVar;
            this.f37283b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f37282a.a(new C0773a(hVar, this.f37283b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcq3/c;", "<unused var>", "Lcq3/e;", "Loq/i0;", "<anonymous>", "(Lcq3/c;Lcq3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37294e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37294e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<d> bVarY1 = l.this.Y1();
                d.a aVar = d.a.f37266a;
                this.f37294e = 1;
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
        public final Object w(c cVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, dq3.a aVar2) {
        this.screenMapper = aVar2;
        this.stateMachine = aVar.a(e.f37267a, new er.l() { // from class: cq3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.l9(this.f37276a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data j9() {
        return this.screenMapper.b(new dq3.a.Params(b9(c.f37265a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final l lVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: cq3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f37277a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        zVar.x(q0.c(c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
