package bb1;

import f00.j0;
import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lbb1/o;", "Ll00/g;", "Lbb1/c;", "", "Lbb1/d;", "Lyy/a;", "stateMachineFactory", "Lbb1/o$a$a;", "setupData", "Lcb1/a;", "companyServiceUnavailableScreenMapper", "<init>", "(Lyy/a;Lbb1/o$a$a;Lcb1/a;)V", "state", "Lbb1/d$a;", "k9", "(Lbb1/c;)Lbb1/d$a;", "b", "Lbb1/o$a$a;", "c", "Lcb1/a;", "d", "Lbb1/c;", "initialState", "Lxw/b;", "Lbb1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<bb1.c, Object> implements bb1.d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb1.a companyServiceUnavailableScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bb1.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bb1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bb1.c, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<bb1.d.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lbb1/o$a;", "Lf00/j0;", "Lbb1/o$a$a;", "Lbb1/o;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, o> {

        /* JADX INFO: renamed from: bb1.o$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbb1/o$a$a;", "", "Lbb1/c;", "state", "<init>", "(Lbb1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbb1/c;", "()Lbb1/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final bb1.c state;

            public SetupData(bb1.c cVar) {
                this.state = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final bb1.c getState() {
                return this.state;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.state, ((SetupData) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "SetupData(state=" + this.state + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<bb1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f18039b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f18041b;

            /* JADX INFO: renamed from: bb1.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0448a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18042d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18043e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18044f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18046h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18047j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18048k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18049l;

                public C0448a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18042d = obj;
                    this.f18043e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f18040a = hVar;
                this.f18041b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0448a c0448a;
                if (eVar instanceof C0448a) {
                    c0448a = (C0448a) eVar;
                    int i15 = c0448a.f18043e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0448a.f18043e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0448a = new C0448a(eVar);
                    }
                } else {
                    c0448a = new C0448a(eVar);
                }
                Object obj2 = c0448a.f18042d;
                Object objE = uq.b.e();
                int i16 = c0448a.f18043e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f18040a;
                    bb1.d.a aVarK9 = this.f18041b.k9((bb1.c) obj);
                    c0448a.f18044f = vq.j.a(obj);
                    c0448a.f18046h = vq.j.a(c0448a);
                    c0448a.f18047j = vq.j.a(obj);
                    c0448a.f18048k = vq.j.a(hVar);
                    c0448a.f18049l = 0;
                    c0448a.f18043e = 1;
                    if (hVar.F(aVarK9, c0448a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f18038a = gVar;
            this.f18039b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bb1.d.a> hVar, tq.e eVar) {
            Object objA = this.f18038a.a(new a(hVar, this.f18039b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbb1/a;", "<unused var>", "Lbb1/c$a;", "Loq/i0;", "<anonymous>", "(Lbb1/a;Lbb1/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bb1.a, bb1.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18050e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18050e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bb1.b> bVarY1 = o.this.Y1();
                bb1.b.C0445b c0445b = bb1.b.C0445b.f18009a;
                this.f18050e = 1;
                if (bVarY1.F(c0445b, this) == objE) {
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
        public final Object w(bb1.a aVar, bb1.c.a aVar2, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbb1/a;", "<unused var>", "Lbb1/c$b;", "Loq/i0;", "<anonymous>", "(Lbb1/a;Lbb1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bb1.a, bb1.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18052e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18052e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bb1.b> bVarY1 = o.this.Y1();
                bb1.b.a aVar = bb1.b.a.f18008a;
                this.f18052e = 1;
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
        public final Object w(bb1.a aVar, bb1.c.b bVar, tq.e<? super i0> eVar) {
            return o.this.new d(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, a.SetupData setupData, cb1.a aVar2) {
        this.setupData = setupData;
        this.companyServiceUnavailableScreenMapper = aVar2;
        bb1.c state = setupData.getState();
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: bb1.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f18030a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bb1.d.a k9(bb1.c state) {
        return this.companyServiceUnavailableScreenMapper.b(new cb1.a.Params(state, b9(bb1.a.f18007a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final o oVar, v vVar) {
        vVar.c(q0.c(bb1.c.a.class), new er.l() { // from class: bb1.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f18028a, (z) obj);
            }
        });
        vVar.c(q0.c(bb1.c.b.class), new er.l() { // from class: bb1.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f18029a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        zVar.x(q0.c(bb1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(o oVar, z zVar) {
        d dVar = oVar.new d(null);
        zVar.x(q0.c(bb1.a.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bb1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bb1.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bb1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
