package y83;

import a14.w;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oo0.Topic;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Ly83/l;", "Ll00/g;", "Ly83/d;", "", "Ly83/e;", "Lyy/a;", "stateMachineFactory", "Lz83/a;", "reportInfoPageScreenMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Loo0/u;", "topic", "<init>", "(Lyy/a;Lz83/a;La14/w;Li70/e;Loo0/u;)V", "Ly83/e$a;", "n9", "()Ly83/e$a;", "b", "Lz83/a;", "c", "La14/w;", "d", "Li70/e;", "e", "Loo0/u;", "f", "Ly83/d;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Ly83/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z83.a reportInfoPageScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Topic topic;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y83.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f225342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f225343b;

        /* JADX INFO: renamed from: y83.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6037a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f225344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f225345b;

            /* JADX INFO: renamed from: y83.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6038a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f225346d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f225347e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f225348f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f225350h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f225351j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f225352k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f225353l;

                public C6038a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f225346d = obj;
                    this.f225347e |= PKIFailureInfo.systemUnavail;
                    return C6037a.this.F(null, this);
                }
            }

            public C6037a(mu.h hVar, l lVar) {
                this.f225344a = hVar;
                this.f225345b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6038a c6038a;
                if (eVar instanceof C6038a) {
                    c6038a = (C6038a) eVar;
                    int i15 = c6038a.f225347e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6038a.f225347e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6038a = new C6038a(eVar);
                    }
                } else {
                    c6038a = new C6038a(eVar);
                }
                Object obj2 = c6038a.f225346d;
                Object objE = uq.b.e();
                int i16 = c6038a.f225347e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f225344a;
                    e.Data dataN9 = this.f225345b.n9();
                    c6038a.f225348f = vq.j.a(obj);
                    c6038a.f225350h = vq.j.a(c6038a);
                    c6038a.f225351j = vq.j.a(obj);
                    c6038a.f225352k = vq.j.a(hVar);
                    c6038a.f225353l = 0;
                    c6038a.f225347e = 1;
                    if (hVar.F(dataN9, c6038a) == objE) {
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
            this.f225342a = gVar;
            this.f225343b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f225342a.a(new C6037a(hVar, this.f225343b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly83/a;", "<unused var>", "Ly83/d;", "Loq/i0;", "<anonymous>", "(Ly83/a;Ly83/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<y83.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225354e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f225354e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                y83.b.a aVar = y83.b.a.f225320a;
                this.f225354e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(y83.a aVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly83/c;", "action", "Ly83/d;", "state", "Loq/i0;", "<anonymous>", "(Ly83/c;Ly83/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OpenInfoLink, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f225357f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenInfoLink openInfoLink = (OpenInfoLink) this.f225357f;
            Object objE = uq.b.e();
            int i15 = this.f225356e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = l.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openInfoLink.getUrl(), false, 2, null);
                this.f225357f = vq.j.a(openInfoLink);
                this.f225356e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            l lVar = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenInfoLink openInfoLink, d dVar, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f225357f = openInfoLink;
            return cVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, z83.a aVar2, w wVar, i70.e eVar, Topic topic) {
        this.reportInfoPageScreenMapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.topic = topic;
        d dVar = d.f225322a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: y83.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f225333a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9());
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9() {
        return this.reportInfoPageScreenMapper.b(new z83.a.Params(this.topic, new er.l() { // from class: y83.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f225332a, (String) obj);
            }
        }, b9(y83.a.f225319a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, String str) {
        lVar.d9(new OpenInfoLink(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: y83.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.r9(this.f225331a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y83.a.class), oVar, bVar);
        zVar.x(q0.c(OpenInfoLink.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<y83.b> Y1() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(y83.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(Topic topic) {
        super.P5(topic);
    }
}
