package y33;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt0.BEReportSubCategory;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00120,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Ly33/q;", "Ll00/g;", "Ly33/b;", "Ly33/a;", "Ly33/c;", "", "Lyy/a;", "stateMachineFactory", "Lz33/b;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Ly33/d;", "contract", "<init>", "(Lyy/a;Lz33/b;Lcb4/j;Lp23/b;Ly33/d;)V", "Ly33/c$a;", "q9", "(Ly33/b;)Ly33/c$a;", "b", "Lz33/b;", "c", "Lcb4/j;", "d", "Lp23/b;", "Ly33/b$b;", "e", "Ly33/b$b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ly33/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<y33.b, y33.a> implements y33.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z33.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y33.b.Screen initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y33.b, y33.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y33.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<y33.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<y33.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f223749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f223750b;

        /* JADX INFO: renamed from: y33.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5979a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f223751a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f223752b;

            /* JADX INFO: renamed from: y33.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5980a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f223753d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f223754e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f223755f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f223757h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f223758j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f223759k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f223760l;

                public C5980a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f223753d = obj;
                    this.f223754e |= PKIFailureInfo.systemUnavail;
                    return C5979a.this.F(null, this);
                }
            }

            public C5979a(mu.h hVar, q qVar) {
                this.f223751a = hVar;
                this.f223752b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5980a c5980a;
                if (eVar instanceof C5980a) {
                    c5980a = (C5980a) eVar;
                    int i15 = c5980a.f223754e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5980a.f223754e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5980a = new C5980a(eVar);
                    }
                } else {
                    c5980a = new C5980a(eVar);
                }
                Object obj2 = c5980a.f223753d;
                Object objE = uq.b.e();
                int i16 = c5980a.f223754e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f223751a;
                    y33.c.Data dataQ9 = this.f223752b.q9((y33.b) obj);
                    c5980a.f223755f = vq.j.a(obj);
                    c5980a.f223757h = vq.j.a(c5980a);
                    c5980a.f223758j = vq.j.a(obj);
                    c5980a.f223759k = vq.j.a(hVar);
                    c5980a.f223760l = 0;
                    c5980a.f223754e = 1;
                    if (hVar.F(dataQ9, c5980a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f223749a = gVar;
            this.f223750b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super y33.c.Data> hVar, tq.e eVar) {
            Object objA = this.f223749a.a(new C5979a(hVar, this.f223750b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly33/a$b;", "action", "Ly33/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly33/a$b;Ly33/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<y33.a.b, y33.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223762f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y33.a.b bVar = (y33.a.b) this.f223762f;
            Object objE = uq.b.e();
            int i15 = this.f223761e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y33.a.b> bVarY1 = q.this.Y1();
                this.f223762f = vq.j.a(bVar);
                this.f223761e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(y33.a.b bVar, y33.b bVar2, tq.e<? super i0> eVar) {
            b bVar3 = q.this.new b(eVar);
            bVar3.f223762f = bVar;
            return bVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly33/a$c;", "action", "Ly33/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly33/a$c;Ly33/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<y33.a.SelectSubType, y33.b.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y33.d f223766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f223767h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y33.d dVar, q qVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f223766g = dVar;
            this.f223767h = qVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y33.a.SelectSubType selectSubType = (y33.a.SelectSubType) this.f223765f;
            uq.b.e();
            if (this.f223764e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f223766g.s3(selectSubType.getSubType());
            this.f223767h.d9(new y33.a.b.GoToNextScreen(this.f223766g.S()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y33.a.SelectSubType selectSubType, y33.b.Screen screen, tq.e<? super i0> eVar) {
            c cVar = new c(this.f223766g, this.f223767h, eVar);
            cVar.f223765f = selectSubType;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly33/a$d;", "<unused var>", "Lk10/c0;", "Ly33/b$b;", "state", "Lk10/l;", "Ly33/b;", "<anonymous>", "(Ly33/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<y33.a.d, c0<y33.b.Screen>, tq.e<? super k10.l<? extends y33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223769f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y33.b.Dialog O(q qVar, y33.b.Screen screen) {
            return new y33.b.Dialog(screen.getSelectedCategory(), qVar.dialogVMSFactory.a(qVar.newReportExitDialogMapper.b(new p23.b.Params(qVar.b9(y33.a.b.C5977b.f223715a), qVar.b9(y33.a.C5975a.f223713a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f223769f;
            uq.b.e();
            if (this.f223768e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: y33.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(qVar, (b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y33.a.d dVar, c0<y33.b.Screen> c0Var, tq.e<? super k10.l<? extends y33.b>> eVar) {
            d dVar2 = q.this.new d(eVar);
            dVar2.f223769f = c0Var;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly33/a$a;", "<unused var>", "Lk10/c0;", "Ly33/b$a;", "state", "Lk10/l;", "Ly33/b;", "<anonymous>", "(Ly33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<y33.a.C5975a, c0<y33.b.Dialog>, tq.e<? super k10.l<? extends y33.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f223771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f223772f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y33.b.Screen O(y33.b.Dialog dialog) {
            return new y33.b.Screen(dialog.getSelectedCategory());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f223772f;
            uq.b.e();
            if (this.f223771e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: y33.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O((b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(y33.a.C5975a c5975a, c0<y33.b.Dialog> c0Var, tq.e<? super k10.l<? extends y33.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f223772f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, z33.b bVar, cb4.j jVar, p23.b bVar2, final y33.d dVar) {
        this.mapper = bVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar2;
        y33.b.Screen screen = new y33.b.Screen(dVar.S());
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: y33.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f223740a, dVar, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y33.c.Data q9(y33.b bVar) {
        return this.mapper.b(new z33.b.Params(bVar, new er.l() { // from class: y33.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f223739a, (BEReportSubCategory) obj);
            }
        }, b9(y33.a.b.C5976a.f223714a), b9(y33.a.d.f223718a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, BEReportSubCategory bEReportSubCategory) {
        qVar.d9(new y33.a.SelectSubType(bEReportSubCategory));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final q qVar, final y33.d dVar, k10.v vVar) {
        vVar.c(q0.c(y33.b.class), new er.l() { // from class: y33.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f223736a, (z) obj);
            }
        });
        vVar.c(q0.c(y33.b.Screen.class), new er.l() { // from class: y33.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(dVar, qVar, (z) obj);
            }
        });
        vVar.c(q0.c(y33.b.Dialog.class), new er.l() { // from class: y33.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(y33.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(y33.d dVar, q qVar, z zVar) {
        c cVar = new c(dVar, qVar, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y33.a.SelectSubType.class), oVar, cVar);
        zVar.v(q0.c(y33.a.d.class), oVar, qVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(y33.a.C5975a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<y33.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<y33.b, y33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y33.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(y33.d dVar) {
        super.P5(dVar);
    }
}
