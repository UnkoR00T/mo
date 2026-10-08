package ey1;

import er.q;
import f00.j0;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ley1/m;", "Ll00/g;", "Ley1/d;", "", "Ley1/e;", "Lyy/a;", "stateMachineFactory", "Lfy1/a;", "mapper", "Ljy1/a;", "faqScreenMapper", "Ley1/f;", "setupContract", "<init>", "(Lyy/a;Lfy1/a;Ljy1/a;Ley1/f;)V", "state", "Ley1/e$a;", "k9", "(Ley1/d;)Ley1/e$a;", "b", "Lfy1/a;", "c", "Ljy1/a;", "d", "Ley1/f;", "Lxw/b;", "Ley1/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fy1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jy1.a faqScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f setupContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ey1.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ley1/m$a;", "Lf00/j0;", "Ley1/f;", "Ley1/m;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<f, m> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f54055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f54056b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f54057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f54058b;

            /* JADX INFO: renamed from: ey1.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1276a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f54059d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f54060e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f54061f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f54063h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f54064j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f54065k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f54066l;

                public C1276a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f54059d = obj;
                    this.f54060e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f54057a = hVar;
                this.f54058b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1276a c1276a;
                if (eVar instanceof C1276a) {
                    c1276a = (C1276a) eVar;
                    int i15 = c1276a.f54060e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1276a.f54060e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1276a = new C1276a(eVar);
                    }
                } else {
                    c1276a = new C1276a(eVar);
                }
                Object obj2 = c1276a.f54059d;
                Object objE = uq.b.e();
                int i16 = c1276a.f54060e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f54057a;
                    e.Data dataK9 = this.f54058b.k9((State) obj);
                    c1276a.f54061f = vq.j.a(obj);
                    c1276a.f54063h = vq.j.a(c1276a);
                    c1276a.f54064j = vq.j.a(obj);
                    c1276a.f54065k = vq.j.a(hVar);
                    c1276a.f54066l = 0;
                    c1276a.f54060e = 1;
                    if (hVar.F(dataK9, c1276a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f54055a = gVar;
            this.f54056b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f54055a.a(new a(hVar, this.f54056b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ley1/a;", "<unused var>", "Ley1/d;", "Loq/i0;", "<anonymous>", "(Ley1/a;Ley1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ey1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54067e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54067e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ey1.c> bVarY1 = m.this.Y1();
                ey1.c.a aVar = ey1.c.a.f54034a;
                this.f54067e = 1;
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
        public final Object w(ey1.a aVar, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ley1/b;", "<unused var>", "Ley1/d;", "Loq/i0;", "<anonymous>", "(Ley1/b;Ley1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ey1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54069e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54069e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ey1.c> bVarY1 = m.this.Y1();
                ey1.c.GoToFaq goToFaq = new ey1.c.GoToFaq(m.this.faqScreenMapper.b(i0.f148189a));
                this.f54069e = 1;
                if (bVarY1.F(goToFaq, this) == objE) {
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
        public final Object w(ey1.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, fy1.a aVar2, jy1.a aVar3, f fVar) {
        this.mapper = aVar2;
        this.faqScreenMapper = aVar3;
        this.setupContract = fVar;
        this.stateMachine = aVar.a(new State(fVar.A0()), new er.l() { // from class: ey1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f54048a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), k9(new State(fVar.A0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(State state) {
        return this.mapper.b(new fy1.a.Params(state, b9(ey1.a.f54032a), b9(ey1.b.f54033a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ey1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f54047a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ey1.a.class), oVar, cVar);
        zVar.x(q0.c(ey1.b.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ey1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e.Data data) {
        super.P5(data);
    }
}
