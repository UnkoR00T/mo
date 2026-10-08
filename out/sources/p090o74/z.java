package p090o74;

import er.l;
import er.q;
import f00.j0;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import l00.g;
import mu.h;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;
import tq.e;
import vq.d;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lo74/z;", "Ll00/g;", "Lo74/c;", "", "Lo74/d;", "Lyy/a;", "stateMachineFactory", "Lp74/a;", "mapper", "Lo74/z$a$a;", "setupData", "<init>", "(Lyy/a;Lp74/a;Lo74/z$a$a;)V", "state", "Lo74/d$a;", "j9", "(Lo74/c;)Lo74/d$a;", "b", "Lp74/a;", "c", "Lo74/z$a$a;", "Lo74/c$a;", "d", "Lo74/c$a;", "initialState", "Lxw/b;", "Lo74/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends g<p090o74.c, Object> implements d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p74.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a.SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p090o74.c.DetailsDisplayed initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p090o74.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<p090o74.c, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.a> state;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lo74/z$a;", "Lf00/j0;", "Lo74/z$a$a;", "Lo74/z;", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<SetupData, z> {

        /* JADX INFO: renamed from: o74.z$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo74/z$a$a;", "", "Lr74/a;", "data", "<init>", "(Lr74/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr74/a;", "()Lr74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultNotificationDetailsData data;

            public SetupData(DefaultNotificationDetailsData defaultNotificationDetailsData) {
                this.data = defaultNotificationDetailsData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DefaultNotificationDetailsData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupData) && fr.t.c(this.data, ((SetupData) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "SetupData(data=" + this.data + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f142987b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f142988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f142989b;

            /* JADX INFO: renamed from: o74.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3542a extends d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142990d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142991e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142992f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142994h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142995j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142996k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142997l;

                public C3542a(e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142990d = obj;
                    this.f142991e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(h hVar, z zVar) {
                this.f142988a = hVar;
                this.f142989b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, e eVar) throws Throwable {
                C3542a c3542a;
                if (eVar instanceof C3542a) {
                    c3542a = (C3542a) eVar;
                    int i15 = c3542a.f142991e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3542a.f142991e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3542a = new C3542a(eVar);
                    }
                } else {
                    c3542a = new C3542a(eVar);
                }
                Object obj2 = c3542a.f142990d;
                Object objE = uq.b.e();
                int i16 = c3542a.f142991e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f142988a;
                    d.a aVarJ9 = this.f142989b.j9((p090o74.c) obj);
                    c3542a.f142992f = j.a(obj);
                    c3542a.f142994h = j.a(c3542a);
                    c3542a.f142995j = j.a(obj);
                    c3542a.f142996k = j.a(hVar);
                    c3542a.f142997l = 0;
                    c3542a.f142991e = 1;
                    if (hVar.F(aVarJ9, c3542a) == objE) {
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

        public b(mu.g gVar, z zVar) {
            this.f142986a = gVar;
            this.f142987b = zVar;
        }

        @Override // mu.g
        public Object a(h<? super d.a> hVar, e eVar) {
            Object objA = this.f142986a.a(new a(hVar, this.f142987b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo74/a;", "<unused var>", "Lo74/c;", "Loq/i0;", "<anonymous>", "(Lo74/a;Lo74/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<p090o74.a, p090o74.c, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142998e;

        c(e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142998e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<p090o74.b> bVarY1 = z.this.Y1();
                o74.b.a aVar = o74.b.a.f142938a;
                this.f142998e = 1;
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
        public final Object w(p090o74.a aVar, p090o74.c cVar, e<? super i0> eVar) {
            return z.this.new c(eVar).J(i0.f148189a);
        }
    }

    public z(yy.a aVar, p74.a aVar2, a.SetupData setupData) {
        this.mapper = aVar2;
        this.setupData = setupData;
        p090o74.c.DetailsDisplayed detailsDisplayed = new p090o74.c.DetailsDisplayed(setupData.getData());
        this.initialState = detailsDisplayed;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(detailsDisplayed, new l() { // from class: o74.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.l9(this.f142978a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), j9(detailsDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a j9(p090o74.c state) {
        return this.mapper.b(new p74.a.Params(state, b9(p090o74.a.f142937a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final z zVar, v vVar) {
        vVar.c(q0.c(p090o74.c.class), new l() { // from class: o74.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.m9(this.f142977a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(z zVar, k10.z zVar2) {
        c cVar = zVar.new c(null);
        zVar2.x(q0.c(p090o74.a.class), o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p090o74.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<p090o74.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
