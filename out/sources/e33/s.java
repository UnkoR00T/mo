package e33;

import fr.q0;
import k23.ReportLocationDescription;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0014028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Le33/s;", "Ll00/g;", "Le33/c;", "Le33/a;", "Le33/d;", "", "Lyy/a;", "stateMachineFactory", "Lg33/d;", "mapper", "Lm23/e;", "validateLocationNameUC", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Le33/e;", "contract", "<init>", "(Lyy/a;Lg33/d;Lm23/e;Lcb4/j;Lp23/b;Le33/e;)V", "Le33/d$a;", "u9", "(Le33/c;)Le33/d$a;", "b", "Lg33/d;", "c", "Lm23/e;", "d", "Lcb4/j;", "e", "Lp23/b;", "f", "Le33/e;", "Le33/c$c;", "g", "Le33/c$c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le33/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<e33.c, e33.a> implements e33.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g33.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m23.e validateLocationNameUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e33.e contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e33.c.Screen initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<e33.c, e33.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e33.a.b> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<e33.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e33.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f47124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f47125b;

        /* JADX INFO: renamed from: e33.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1080a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f47126a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f47127b;

            /* JADX INFO: renamed from: e33.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1081a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47128d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47129e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47130f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47132h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f47133j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f47134k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f47135l;

                public C1081a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47128d = obj;
                    this.f47129e |= PKIFailureInfo.systemUnavail;
                    return C1080a.this.F(null, this);
                }
            }

            public C1080a(mu.h hVar, s sVar) {
                this.f47126a = hVar;
                this.f47127b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1081a c1081a;
                if (eVar instanceof C1081a) {
                    c1081a = (C1081a) eVar;
                    int i15 = c1081a.f47129e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1081a.f47129e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1081a = new C1081a(eVar);
                    }
                } else {
                    c1081a = new C1081a(eVar);
                }
                Object obj2 = c1081a.f47128d;
                Object objE = uq.b.e();
                int i16 = c1081a.f47129e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f47126a;
                    e33.d.Data dataU9 = this.f47127b.u9((e33.c) obj);
                    c1081a.f47130f = vq.j.a(obj);
                    c1081a.f47132h = vq.j.a(c1081a);
                    c1081a.f47133j = vq.j.a(obj);
                    c1081a.f47134k = vq.j.a(hVar);
                    c1081a.f47135l = 0;
                    c1081a.f47129e = 1;
                    if (hVar.F(dataU9, c1081a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f47124a = gVar;
            this.f47125b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e33.d.Data> hVar, tq.e eVar) {
            Object objA = this.f47124a.a(new C1080a(hVar, this.f47125b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le33/a$b;", "action", "Le33/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le33/a$b;Le33/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e33.a.b, e33.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47137f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e33.a.b bVar = (e33.a.b) this.f47137f;
            Object objE = uq.b.e();
            int i15 = this.f47136e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<e33.a.b> bVarY1 = s.this.Y1();
                this.f47137f = vq.j.a(bVar);
                this.f47136e = 1;
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
        public final Object w(e33.a.b bVar, e33.c cVar, tq.e<? super i0> eVar) {
            b bVar2 = s.this.new b(eVar);
            bVar2.f47137f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$f;", "action", "Lk10/c0;", "Le33/c$c;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e33.a.OnSelectLocationType, k10.c0<e33.c.Screen>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f47141g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen O(e33.a.OnSelectLocationType onSelectLocationType, e33.c.Screen screen) {
            return screen.b(Form.b(screen.getForm(), onSelectLocationType.getLocationType(), null, null, hz.b.C2039b.f86846c, null, 6, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e33.a.OnSelectLocationType onSelectLocationType = (e33.a.OnSelectLocationType) this.f47140f;
            k10.c0 c0Var = (k10.c0) this.f47141g;
            uq.b.e();
            if (this.f47139e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e33.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.c.O(onSelectLocationType, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.OnSelectLocationType onSelectLocationType, k10.c0<e33.c.Screen> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            c cVar = new c(eVar);
            cVar.f47140f = onSelectLocationType;
            cVar.f47141g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$e;", "action", "Lk10/c0;", "Le33/c$c;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e33.a.OnLocationPropertyChanged, k10.c0<e33.c.Screen>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f47144g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen O(e33.a.OnLocationPropertyChanged onLocationPropertyChanged, e33.c.Screen screen) {
            return screen.b(Form.b(screen.getForm(), null, onLocationPropertyChanged.getName(), null, hz.b.C2039b.f86846c, null, 5, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e33.a.OnLocationPropertyChanged onLocationPropertyChanged = (e33.a.OnLocationPropertyChanged) this.f47143f;
            k10.c0 c0Var = (k10.c0) this.f47144g;
            uq.b.e();
            if (this.f47142e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e33.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(onLocationPropertyChanged, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.OnLocationPropertyChanged onLocationPropertyChanged, k10.c0<e33.c.Screen> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f47143f = onLocationPropertyChanged;
            dVar.f47144g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$d;", "action", "Lk10/c0;", "Le33/c$c;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<e33.a.OnLocationCarriageChanged, k10.c0<e33.c.Screen>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f47147g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen O(e33.a.OnLocationCarriageChanged onLocationCarriageChanged, e33.c.Screen screen) {
            return screen.b(Form.b(screen.getForm(), null, null, onLocationCarriageChanged.getName(), hz.b.C2039b.f86846c, null, 3, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final e33.a.OnLocationCarriageChanged onLocationCarriageChanged = (e33.a.OnLocationCarriageChanged) this.f47146f;
            k10.c0 c0Var = (k10.c0) this.f47147g;
            uq.b.e();
            if (this.f47145e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: e33.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O(onLocationCarriageChanged, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.OnLocationCarriageChanged onLocationCarriageChanged, k10.c0<e33.c.Screen> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f47146f = onLocationCarriageChanged;
            eVar2.f47147g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$c;", "<unused var>", "Lk10/c0;", "Le33/c$c;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<e33.a.c, k10.c0<e33.c.Screen>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f47148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f47149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f47150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f47151h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f47152j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47154a;

            static {
                int[] iArr = new int[k23.m.values().length];
                try {
                    iArr[k23.m.PROPERTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k23.m.CARRIAGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f47154a = iArr;
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen V(Form form, hz.b bVar, e33.c.Screen screen) {
            return screen.b(Form.b(form, null, null, null, bVar, new d60.j(e33.c.b.f47092a), 7, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen X(Form form, e33.c.Screen screen) {
            return screen.b(form);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String locationNameProperty;
            final Form form;
            hz.b.Companion companion;
            k10.c0 c0Var = (k10.c0) this.f47152j;
            Object objE = uq.b.e();
            int i15 = this.f47151h;
            if (i15 == 0) {
                oq.u.b(obj);
                Form formB = Form.b(((e33.c.Screen) c0Var.a()).getForm(), null, dz.e.e(((e33.c.Screen) c0Var.a()).getForm().getLocationNameProperty()), dz.e.e(((e33.c.Screen) c0Var.a()).getForm().getLocationNameCarriage()), null, null, 25, null);
                int i16 = a.f47154a[formB.getSelectedLocationType().ordinal()];
                if (i16 == 1) {
                    locationNameProperty = formB.getLocationNameProperty();
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    locationNameProperty = formB.getLocationNameCarriage();
                }
                hz.b.Companion companion2 = hz.b.INSTANCE;
                m23.e eVar = s.this.validateLocationNameUC;
                m23.e.Params params = new m23.e.Params(locationNameProperty, formB.getSelectedLocationType());
                this.f47152j = c0Var;
                this.f47148e = formB;
                this.f47149f = locationNameProperty;
                this.f47150g = companion2;
                this.f47151h = 1;
                Object objD = eVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                form = formB;
                obj = objD;
                companion = companion2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (hz.b.Companion) this.f47150g;
                locationNameProperty = (String) this.f47149f;
                form = (Form) this.f47148e;
                oq.u.b(obj);
            }
            final hz.b bVarA = companion.a((hz.g) obj);
            if (bVarA instanceof hz.b.Invalid) {
                return c0Var.b(new er.l() { // from class: e33.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.f.V(form, bVarA, (c.Screen) obj2);
                    }
                });
            }
            s.this.contract.Z3(new ReportLocationDescription(form.getSelectedLocationType(), locationNameProperty));
            s.this.d9(e33.a.b.c.f47077a);
            return c0Var.b(new er.l() { // from class: e33.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.f.X(form, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.c cVar, k10.c0<e33.c.Screen> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f47152j = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$g;", "<unused var>", "Lk10/c0;", "Le33/c$c;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<e33.a.g, k10.c0<e33.c.Screen>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47156f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Dialog O(s sVar, e33.c.Screen screen) {
            return new e33.c.Dialog(screen.getForm(), sVar.dialogVMSFactory.a(sVar.newReportExitDialogMapper.b(new p23.b.Params(sVar.b9(e33.a.b.C1078b.f47076a), sVar.b9(e33.a.C1076a.f47074a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f47156f;
            uq.b.e();
            if (this.f47155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final s sVar = s.this;
            return c0Var.d(new er.l() { // from class: e33.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O(sVar, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.g gVar, k10.c0<e33.c.Screen> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            g gVar2 = s.this.new g(eVar);
            gVar2.f47156f = c0Var;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le33/a$a;", "<unused var>", "Lk10/c0;", "Le33/c$a;", "state", "Lk10/l;", "Le33/c;", "<anonymous>", "(Le33/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<e33.a.C1076a, k10.c0<e33.c.Dialog>, tq.e<? super k10.l<? extends e33.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47159f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e33.c.Screen O(e33.c.Dialog dialog) {
            return new e33.c.Screen(dialog.getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f47159f;
            uq.b.e();
            if (this.f47158e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: e33.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.h.O((c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(e33.a.C1076a c1076a, k10.c0<e33.c.Dialog> c0Var, tq.e<? super k10.l<? extends e33.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f47159f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, g33.d dVar, m23.e eVar, cb4.j jVar, p23.b bVar, e33.e eVar2) {
        e33.c.Screen screen;
        this.mapper = dVar;
        this.validateLocationNameUC = eVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        this.contract = eVar2;
        ReportLocationDescription reportLocationDescriptionI = eVar2.I();
        if (reportLocationDescriptionI == null) {
            screen = new e33.c.Screen(new Form(null, null, null, null, null, 31, null));
        } else {
            k23.m type = reportLocationDescriptionI.getType();
            String name = reportLocationDescriptionI.getType() != k23.m.PROPERTY ? null : reportLocationDescriptionI.getName();
            String str = name == null ? "" : name;
            String name2 = reportLocationDescriptionI.getType() == k23.m.CARRIAGE ? reportLocationDescriptionI.getName() : null;
            screen = new e33.c.Screen(new Form(type, str, name2 == null ? "" : name2, null, null, 24, null));
        }
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: e33.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.z9(this.f47114a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(s sVar, k10.z zVar) {
        b bVar = sVar.new b(null);
        zVar.x(q0.c(e33.a.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, k10.z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(e33.a.OnSelectLocationType.class), oVar, cVar);
        zVar.v(q0.c(e33.a.OnLocationPropertyChanged.class), oVar, new d(null));
        zVar.v(q0.c(e33.a.OnLocationCarriageChanged.class), oVar, new e(null));
        zVar.v(q0.c(e33.a.c.class), oVar, sVar.new f(null));
        zVar.v(q0.c(e33.a.g.class), oVar, sVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(e33.a.C1076a.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e33.d.Data u9(e33.c cVar) {
        return this.mapper.b(new g33.d.Params(cVar, b9(e33.a.c.f47078a), new er.l() { // from class: e33.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9(this.f47111a, (k23.m) obj);
            }
        }, new er.l() { // from class: e33.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.w9(this.f47112a, (String) obj);
            }
        }, new er.l() { // from class: e33.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.x9(this.f47113a, (String) obj);
            }
        }, b9(e33.a.b.C1077a.f47075a), b9(e33.a.g.f47082a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(s sVar, k23.m mVar) {
        sVar.d9(new e33.a.OnSelectLocationType(mVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(s sVar, String str) {
        sVar.d9(new e33.a.OnLocationPropertyChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(s sVar, String str) {
        sVar.d9(new e33.a.OnLocationCarriageChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(e33.c.class), new er.l() { // from class: e33.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.A9(this.f47109a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(e33.c.Screen.class), new er.l() { // from class: e33.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f47110a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(e33.c.Dialog.class), new er.l() { // from class: e33.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<e33.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<e33.c, e33.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e33.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e33.e eVar) {
        super.P5(eVar);
    }
}
