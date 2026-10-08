package xg3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lxg3/m;", "Ll00/g;", "Lxg3/d;", "", "Lxg3/e;", "Lyy/a;", "stateMachineFactory", "Lyg3/a;", "mapper", "<init>", "(Lyy/a;Lyg3/a;)V", "Lxg3/e$a;", "k9", "()Lxg3/e$a;", "b", "Lyg3/a;", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxg3/b;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yg3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xg3.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state = a9(new a(e9().getState(), this), k9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f218562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f218563b;

        /* JADX INFO: renamed from: xg3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5842a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f218564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f218565b;

            /* JADX INFO: renamed from: xg3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5843a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f218566d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f218567e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f218568f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f218570h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f218571j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f218572k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f218573l;

                public C5843a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f218566d = obj;
                    this.f218567e |= PKIFailureInfo.systemUnavail;
                    return C5842a.this.F(null, this);
                }
            }

            public C5842a(mu.h hVar, m mVar) {
                this.f218564a = hVar;
                this.f218565b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5843a c5843a;
                if (eVar instanceof C5843a) {
                    c5843a = (C5843a) eVar;
                    int i15 = c5843a.f218567e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5843a.f218567e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5843a = new C5843a(eVar);
                    }
                } else {
                    c5843a = new C5843a(eVar);
                }
                Object obj2 = c5843a.f218566d;
                Object objE = uq.b.e();
                int i16 = c5843a.f218567e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f218564a;
                    e.Data dataK9 = this.f218565b.k9();
                    c5843a.f218568f = vq.j.a(obj);
                    c5843a.f218570h = vq.j.a(c5843a);
                    c5843a.f218571j = vq.j.a(obj);
                    c5843a.f218572k = vq.j.a(hVar);
                    c5843a.f218573l = 0;
                    c5843a.f218567e = 1;
                    if (hVar.F(dataK9, c5843a) == objE) {
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
            this.f218562a = gVar;
            this.f218563b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f218562a.a(new C5842a(hVar, this.f218563b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxg3/a;", "<unused var>", "Lxg3/d;", "Loq/i0;", "<anonymous>", "(Lxg3/a;Lxg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<xg3.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218574e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218574e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                xg3.b.a aVar = xg3.b.a.f218540a;
                this.f218574e = 1;
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
        public final Object w(xg3.a aVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxg3/c;", "<unused var>", "Lxg3/d;", "Loq/i0;", "<anonymous>", "(Lxg3/c;Lxg3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<xg3.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218576e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218576e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                xg3.b.C5841b c5841b = xg3.b.C5841b.f218541a;
                this.f218576e = 1;
                if (mVar.F(c5841b, this) == objE) {
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
        public final Object w(xg3.c cVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, yg3.a aVar2) {
        this.mapper = aVar2;
        this.stateMachine = aVar.a(d.f218543a, new er.l() { // from class: xg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f218556a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9() {
        return this.mapper.b(new yg3.a.Params(b9(xg3.a.f218539a), b9(xg3.c.f218542a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: xg3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f218557a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xg3.a.class), oVar, bVar);
        zVar.x(q0.c(xg3.c.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xg3.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xg3.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
