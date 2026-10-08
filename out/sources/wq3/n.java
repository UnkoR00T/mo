package wq3;

import fr.q0;
import iq0.Announcements;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lwq3/n;", "Ll00/g;", "Lwq3/b;", "", "Lwq3/c;", "Lxq3/a;", "whatsNewScreenMapper", "Ltq3/c;", "getAnnouncementsToDisplayUseCase", "Ltq3/a;", "appendDisplayedAnnouncementsUseCase", "Lyy/a;", "stateMachineFactory", "<init>", "(Lxq3/a;Ltq3/c;Ltq3/a;Lyy/a;)V", "state", "Lwq3/c$a;", "n9", "(Lwq3/b;)Lwq3/c$a;", "b", "Lxq3/a;", "c", "Ltq3/c;", "d", "Ltq3/a;", "Lwq3/b$b;", "e", "Lwq3/b$b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lwq3/a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<wq3.b, Object> implements wq3.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xq3.a whatsNewScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tq3.c getAnnouncementsToDisplayUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tq3.a appendDisplayedAnnouncementsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wq3.b.C5689b initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<wq3.b, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<wq3.c.a> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wq3.a> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wq3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f214495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f214496b;

        /* JADX INFO: renamed from: wq3.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5691a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f214497a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f214498b;

            /* JADX INFO: renamed from: wq3.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5692a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f214499d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f214500e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f214501f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f214503h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f214504j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f214505k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f214506l;

                public C5692a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f214499d = obj;
                    this.f214500e |= PKIFailureInfo.systemUnavail;
                    return C5691a.this.F(null, this);
                }
            }

            public C5691a(mu.h hVar, n nVar) {
                this.f214497a = hVar;
                this.f214498b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5692a c5692a;
                if (eVar instanceof C5692a) {
                    c5692a = (C5692a) eVar;
                    int i15 = c5692a.f214500e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5692a.f214500e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5692a = new C5692a(eVar);
                    }
                } else {
                    c5692a = new C5692a(eVar);
                }
                Object obj2 = c5692a.f214499d;
                Object objE = uq.b.e();
                int i16 = c5692a.f214500e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f214497a;
                    wq3.c.a aVarN9 = this.f214498b.n9((wq3.b) obj);
                    c5692a.f214501f = vq.j.a(obj);
                    c5692a.f214503h = vq.j.a(c5692a);
                    c5692a.f214504j = vq.j.a(obj);
                    c5692a.f214505k = vq.j.a(hVar);
                    c5692a.f214506l = 0;
                    c5692a.f214500e = 1;
                    if (hVar.F(aVarN9, c5692a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f214495a = gVar;
            this.f214496b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wq3.c.a> hVar, tq.e eVar) {
            Object objA = this.f214495a.a(new C5691a(hVar, this.f214496b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwq3/a;", "action", "", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwq3/a;Ljava/lang/Object;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wq3.a, Object, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214508f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wq3.a aVar = (wq3.a) this.f214508f;
            Object objE = uq.b.e();
            int i15 = this.f214507e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<wq3.a> bVarY1 = n.this.Y1();
                this.f214508f = vq.j.a(aVar);
                this.f214507e = 1;
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
        public final Object w(wq3.a aVar, Object obj, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f214508f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lwq3/b$b;", "it", "Lk10/l;", "Lwq3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<wq3.b.C5689b>, tq.e<? super k10.l<? extends wq3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214511f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wq3.b.Initialized O(Announcements announcements, wq3.b.C5689b c5689b) {
            return new wq3.b.Initialized(announcements);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f214511f;
            Object objE = uq.b.e();
            int i15 = this.f214510e;
            if (i15 == 0) {
                u.b(obj);
                tq3.c cVar = n.this.getAnnouncementsToDisplayUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f214511f = c0Var;
                this.f214510e = 1;
                obj = cVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final Announcements announcements = (Announcements) obj;
            return c0Var.d(new er.l() { // from class: wq3.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(announcements, (b.C5689b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<wq3.b.C5689b> c0Var, tq.e<? super k10.l<? extends wq3.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f214511f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwq3/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lwq3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<wq3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214514f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wq3.b.Initialized initialized = (wq3.b.Initialized) this.f214514f;
            Object objE = uq.b.e();
            int i15 = this.f214513e;
            if (i15 == 0) {
                u.b(obj);
                tq3.a aVar = n.this.appendDisplayedAnnouncementsUseCase;
                Announcements announcements = initialized.getAnnouncements();
                this.f214514f = vq.j.a(initialized);
                this.f214513e = 1;
                if (aVar.d(announcements, this) == objE) {
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
        public final Object B(wq3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((d) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f214514f = obj;
            return dVar;
        }
    }

    public n(xq3.a aVar, tq3.c cVar, tq3.a aVar2, yy.a aVar3) {
        this.whatsNewScreenMapper = aVar;
        this.getAnnouncementsToDisplayUseCase = cVar;
        this.appendDisplayedAnnouncementsUseCase = aVar2;
        wq3.b.C5689b c5689b = wq3.b.C5689b.f214472a;
        this.initialState = c5689b;
        this.stateMachine = aVar3.a(c5689b, new er.l() { // from class: wq3.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f214484a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), wq3.c.a.C5690a.f214473a);
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wq3.c.a n9(wq3.b state) {
        return this.whatsNewScreenMapper.b(new xq3.a.Params(state, b9(wq3.a.C5688a.f214470a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(wq3.b.class), new er.l() { // from class: wq3.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f214485a, (z) obj);
            }
        });
        vVar.c(q0.c(wq3.b.C5689b.class), new er.l() { // from class: wq3.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f214486a, (z) obj);
            }
        });
        vVar.c(q0.c(wq3.b.Initialized.class), new er.l() { // from class: wq3.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f214487a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(wq3.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        zVar.A(nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, z zVar) {
        zVar.C(nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wq3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<wq3.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wq3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
