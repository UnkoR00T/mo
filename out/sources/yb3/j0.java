package yb3;

import cc3.ScrollableField;
import ga3.Field;
import ga3.Stage;
import ga3.StageField;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob3.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import z93.Place;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BS\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d*\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d*\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001fJ(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b!\u0010\"J(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010$\u001a\b\u0012\u0004\u0012\u00020%0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lyb3/j0;", "Ll00/g;", "Lyb3/k;", "", "Lyb3/l;", "Lyy/a;", "stateMachineFactory", "Lbc3/e;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lha3/a;", "getOldestChildBirthDateUC", "Lyb3/q;", "listUpdater", "Lcx/a;", "eventThrottler", "Lha3/g;", "validateTripStagesUC", "Lez/a;", "currentTimeProvider", "Lac3/a;", "contract", "<init>", "(Lyy/a;Lbc3/e;Lac4/a;Lha3/a;Lyb3/q;Lcx/a;Lha3/g;Lez/a;Lac3/a;)V", "Lk10/c0;", "Lyb3/k$a;", "", "itemId", "Lk10/l;", "y9", "(Lk10/c0;Ljava/lang/String;)Lk10/l;", "H9", "D9", "(Lk10/c0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "F9", "state", "Lyb3/l$a;", "B9", "(Lyb3/k;)Lyb3/l$a;", "b", "Lbc3/e;", "c", "Lac4/a;", "d", "Lha3/a;", "e", "Lyb3/q;", "f", "Lcx/a;", "g", "Lha3/g;", "h", "Lez/a;", "Lyb3/k$b;", "j", "Lyb3/k$b;", "initialState", "Lxw/b;", "Lyb3/c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 extends l00.g<yb3.k, Object> implements l, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bc3.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ha3.a getOldestChildBirthDateUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q listUpdater;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ha3.g validateTripStagesUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yb3.k.b initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yb3.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<yb3.k, Object> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<l.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f226165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f226166h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f226167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f226168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f226169l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f226170m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f226171n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f226172p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f226174r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226172p = obj;
            this.f226174r |= PKIFailureInfo.systemUnavail;
            return j0.this.D9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f226178g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f226179h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226180j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f226181k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f226182l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f226184n;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226182l = obj;
            this.f226184n |= PKIFailureInfo.systemUnavail;
            return j0.this.F9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<l.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f226185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f226186b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f226187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0 f226188b;

            /* JADX INFO: renamed from: yb3.j0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6062a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f226189d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f226190e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f226191f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f226193h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f226194j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f226195k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f226196l;

                public C6062a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f226189d = obj;
                    this.f226190e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, j0 j0Var) {
                this.f226187a = hVar;
                this.f226188b = j0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6062a c6062a;
                if (eVar instanceof C6062a) {
                    c6062a = (C6062a) eVar;
                    int i15 = c6062a.f226190e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6062a.f226190e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6062a = new C6062a(eVar);
                    }
                } else {
                    c6062a = new C6062a(eVar);
                }
                Object obj2 = c6062a.f226189d;
                Object objE = uq.b.e();
                int i16 = c6062a.f226190e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f226187a;
                    l.a aVarB9 = this.f226188b.B9((yb3.k) obj);
                    c6062a.f226191f = vq.j.a(obj);
                    c6062a.f226193h = vq.j.a(c6062a);
                    c6062a.f226194j = vq.j.a(obj);
                    c6062a.f226195k = vq.j.a(hVar);
                    c6062a.f226196l = 0;
                    c6062a.f226190e = 1;
                    if (hVar.F(aVarB9, c6062a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public c(mu.g gVar, j0 j0Var) {
            this.f226185a = gVar;
            this.f226186b = j0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super l.a> hVar, tq.e eVar) {
            Object objA = this.f226185a.a(new a(hVar, this.f226186b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lyb3/k$b;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<yb3.k.b>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226198f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ac3.a f226200h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyb3/k$a;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yb3.k.Initialized>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f226201e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ j0 f226202f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ac3.a f226203g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<yb3.k.b> f226204h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j0 j0Var, ac3.a aVar, k10.c0<yb3.k.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f226202f = j0Var;
                this.f226203g = aVar;
                this.f226204h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final yb3.k.Initialized V(List list, LocalDate localDate, yb3.k.b bVar) {
                return new yb3.k.Initialized(list, localDate, null, 4, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f226201e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                final LocalDate localDateB = this.f226202f.getOldestChildBirthDateUC.b(new ha3.a.Params(this.f226203g.a().b()));
                List<Stage> listE = this.f226203g.e();
                List arrayList = new ArrayList(pq.v.y(listE, 10));
                for (Stage stage : listE) {
                    arrayList.add(new StageField(null, new Field(stage.getDateRange(), null, 2, null), new Field(stage.getPlace(), null, 2, null), 1, null));
                }
                if (arrayList.isEmpty()) {
                    arrayList = pq.v.e(new StageField(null, null, null, 7, null));
                }
                final List list = arrayList;
                return this.f226204h.d(new er.l() { // from class: yb3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j0.d.a.V(list, localDateB, (k.b) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f226202f, this.f226203g, this.f226204h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<yb3.k.Initialized>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ac3.a aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f226200h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f226198f;
            Object objE = uq.b.e();
            int i15 = this.f226197e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = j0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(j0.this, this.f226200h, c0Var, null);
            this.f226198f = vq.j.a(c0Var);
            this.f226197e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<yb3.k.b> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = j0.this.new d(this.f226200h, eVar);
            dVar.f226198f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb3/d;", "<unused var>", "Lyb3/k$a;", "Loq/i0;", "<anonymous>", "(Lyb3/d;Lyb3/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<yb3.d, yb3.k.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226205e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226205e;
            if (i15 == 0) {
                oq.u.b(obj);
                j0 j0Var = j0.this;
                yb3.c.a aVar = yb3.c.a.f226120a;
                this.f226205e = 1;
                if (j0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yb3.d dVar, yb3.k.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return j0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyb3/e;", "<unused var>", "Lyb3/k$a;", "Loq/i0;", "<anonymous>", "(Lyb3/e;Lyb3/k$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<yb3.e, yb3.k.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226207e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f226207e;
            if (i15 == 0) {
                oq.u.b(obj);
                j0 j0Var = j0.this;
                yb3.c.b bVar = yb3.c.b.f226121a;
                this.f226207e = 1;
                if (j0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yb3.e eVar, yb3.k.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            return j0.this.new f(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb3/j;", "action", "Lk10/c0;", "Lyb3/k$a;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lyb3/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnStageModified, k10.c0<yb3.k.Initialized>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226211g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lyb3/k;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends yb3.k>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f226213e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f226214f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ OnStageModified f226215g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ j0 f226216h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<yb3.k.Initialized> f226217j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(OnStageModified onStageModified, j0 j0Var, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f226215g = onStageModified;
                this.f226216h = j0Var;
                this.f226217j = c0Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
            
                if (r6 == r0) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
            
                if (r6 == r0) goto L29;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r5.f226214f
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r5.f226213e
                    cc3.b r0 = (cc3.b) r0
                    oq.u.b(r6)
                    goto L95
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    java.lang.Object r0 = r5.f226213e
                    cc3.b r0 = (cc3.b) r0
                    oq.u.b(r6)
                    goto L74
                L27:
                    oq.u.b(r6)
                    yb3.j r6 = r5.f226215g
                    cc3.b r6 = r6.getModification()
                    boolean r1 = r6 instanceof cc3.b.AddNextAfter
                    if (r1 == 0) goto L43
                    yb3.j0 r0 = r5.f226216h
                    k10.c0<yb3.k$a> r1 = r5.f226217j
                    cc3.b$a r6 = (cc3.b.AddNextAfter) r6
                    java.lang.String r6 = r6.getItemId()
                    k10.l r6 = yb3.j0.o9(r0, r1, r6)
                    return r6
                L43:
                    boolean r1 = r6 instanceof cc3.b.Delete
                    if (r1 == 0) goto L56
                    yb3.j0 r0 = r5.f226216h
                    k10.c0<yb3.k$a> r1 = r5.f226217j
                    cc3.b$b r6 = (cc3.b.Delete) r6
                    java.lang.String r6 = r6.getItemId()
                    k10.l r6 = yb3.j0.x9(r0, r1, r6)
                    return r6
                L56:
                    boolean r1 = r6 instanceof cc3.b.SelectDateRange
                    if (r1 == 0) goto L77
                    yb3.j0 r1 = r5.f226216h
                    k10.c0<yb3.k$a> r2 = r5.f226217j
                    r4 = r6
                    cc3.b$c r4 = (cc3.b.SelectDateRange) r4
                    java.lang.String r4 = r4.getItemId()
                    java.lang.Object r6 = vq.j.a(r6)
                    r5.f226213e = r6
                    r5.f226214f = r3
                    java.lang.Object r6 = yb3.j0.v9(r1, r2, r4, r5)
                    if (r6 != r0) goto L74
                    goto L94
                L74:
                    k10.l r6 = (k10.l) r6
                    return r6
                L77:
                    boolean r1 = r6 instanceof cc3.b.SelectPlace
                    if (r1 == 0) goto L98
                    yb3.j0 r1 = r5.f226216h
                    k10.c0<yb3.k$a> r3 = r5.f226217j
                    r4 = r6
                    cc3.b$d r4 = (cc3.b.SelectPlace) r4
                    java.lang.String r4 = r4.getItemId()
                    java.lang.Object r6 = vq.j.a(r6)
                    r5.f226213e = r6
                    r5.f226214f = r2
                    java.lang.Object r6 = yb3.j0.w9(r1, r3, r4, r5)
                    if (r6 != r0) goto L95
                L94:
                    return r0
                L95:
                    k10.l r6 = (k10.l) r6
                    return r6
                L98:
                    oq.p r6 = new oq.p
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: yb3.j0.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f226215g, this.f226216h, this.f226217j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends yb3.k>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnStageModified onStageModified = (OnStageModified) this.f226210f;
            k10.c0 c0Var = (k10.c0) this.f226211g;
            Object objE = uq.b.e();
            int i15 = this.f226209e;
            if (i15 == 0) {
                oq.u.b(obj);
                cx.a aVar = j0.this.eventThrottler;
                a aVar2 = new a(onStageModified, j0.this, c0Var, null);
                this.f226210f = vq.j.a(onStageModified);
                this.f226211g = c0Var;
                this.f226209e = 1;
                obj = cx.a.d(aVar, 0L, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (iVar instanceof dx.i.Right) {
                return ((dx.i.Right) iVar).b();
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnStageModified onStageModified, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            g gVar = j0.this.new g(eVar);
            gVar.f226210f = onStageModified;
            gVar.f226211g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb3/f;", "action", "Lk10/c0;", "Lyb3/k$a;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lyb3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnDateRangeChanged, k10.c0<yb3.k.Initialized>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226220g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb3.k.Initialized O(j0 j0Var, OnDateRangeChanged onDateRangeChanged, yb3.k.Initialized initialized) {
            return yb3.k.Initialized.b(initialized, j0Var.listUpdater.j(onDateRangeChanged.getItemId(), onDateRangeChanged.getDateRange(), initialized.g()), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnDateRangeChanged onDateRangeChanged = (OnDateRangeChanged) this.f226219f;
            k10.c0 c0Var = (k10.c0) this.f226220g;
            uq.b.e();
            if (this.f226218e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final j0 j0Var = j0.this;
            return c0Var.b(new er.l() { // from class: yb3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.h.O(j0Var, onDateRangeChanged, (k.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnDateRangeChanged onDateRangeChanged, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            h hVar = j0.this.new h(eVar);
            hVar.f226219f = onDateRangeChanged;
            hVar.f226220g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb3/h;", "action", "Lk10/c0;", "Lyb3/k$a;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lyb3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OnPlaceSelected, k10.c0<yb3.k.Initialized>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f226224g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb3.k.Initialized O(j0 j0Var, OnPlaceSelected onPlaceSelected, yb3.k.Initialized initialized) {
            return yb3.k.Initialized.b(initialized, j0Var.listUpdater.l(onPlaceSelected.getItemId(), onPlaceSelected.getPlace(), initialized.g()), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPlaceSelected onPlaceSelected = (OnPlaceSelected) this.f226223f;
            k10.c0 c0Var = (k10.c0) this.f226224g;
            uq.b.e();
            if (this.f226222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final j0 j0Var = j0.this;
            return c0Var.b(new er.l() { // from class: yb3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.i.O(j0Var, onPlaceSelected, (k.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPlaceSelected onPlaceSelected, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            i iVar = j0.this.new i(eVar);
            iVar.f226223f = onPlaceSelected;
            iVar.f226224g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb3/i;", "<unused var>", "Lk10/c0;", "Lyb3/k$a;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lyb3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<yb3.i, k10.c0<yb3.k.Initialized>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f226226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226227f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb3.k.Initialized O(yb3.k.Initialized initialized) {
            return yb3.k.Initialized.b(initialized, null, null, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f226227f;
            uq.b.e();
            if (this.f226226e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: yb3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.j.O((k.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yb3.i iVar, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            j jVar = new j(eVar);
            jVar.f226227f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyb3/g;", "<unused var>", "Lk10/c0;", "Lyb3/k$a;", "state", "Lk10/l;", "Lyb3/k;", "<anonymous>", "(Lyb3/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<yb3.g, k10.c0<yb3.k.Initialized>, tq.e<? super k10.l<? extends yb3.k>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f226230g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f226231h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f226233k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f226234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f226235m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ac3.a f226237p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ac3.a aVar, tq.e<? super k> eVar) {
            super(3, eVar);
            this.f226237p = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yb3.k.Initialized O(ha3.g.Result result, yb3.k.Initialized initialized) {
            List<StageField> listB = result.b();
            StageField firstInvalid = result.getFirstInvalid();
            return yb3.k.Initialized.b(initialized, listB, null, firstInvalid != null ? new ScrollableField(firstInvalid.getId(), firstInvalid.getFirstInvalidFieldType()) : null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<StageField> listG;
            k10.c0 c0Var = (k10.c0) this.f226235m;
            Object objE = uq.b.e();
            int i15 = this.f226234l;
            if (i15 == 0) {
                oq.u.b(obj);
                listG = ((yb3.k.Initialized) c0Var.a()).g();
                ha3.g gVar = j0.this.validateTripStagesUC;
                ha3.g.Params params = new ha3.g.Params(listG, ((yb3.k.Initialized) c0Var.a()).getOldestChildDateBirth());
                this.f226235m = c0Var;
                this.f226228e = listG;
                this.f226234l = 1;
                obj = gVar.d(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f226230g;
                oq.u.b(obj);
                return lVar;
            }
            listG = (List) this.f226228e;
            oq.u.b(obj);
            ac3.a aVar = this.f226237p;
            j0 j0Var = j0.this;
            final ha3.g.Result result = (ha3.g.Result) obj;
            k10.l lVarB = c0Var.b(new er.l() { // from class: yb3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.k.O(result, (k.Initialized) obj2);
                }
            });
            if (result.getFirstInvalid() == null) {
                List<StageField> list = listG;
                ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                for (StageField stageField : list) {
                    arrayList.add(new Stage(stageField.c().d(), stageField.f().d()));
                }
                aVar.f(arrayList);
                yb3.c.e eVar = yb3.c.e.f226126a;
                this.f226235m = vq.j.a(c0Var);
                this.f226228e = vq.j.a(listG);
                this.f226229f = vq.j.a(result);
                this.f226230g = lVarB;
                this.f226231h = vq.j.a(lVarB);
                this.f226232j = 0;
                this.f226233k = 0;
                this.f226234l = 2;
                if (j0Var.F(eVar, this) == objE) {
                    return objE;
                }
            }
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yb3.g gVar, k10.c0<yb3.k.Initialized> c0Var, tq.e<? super k10.l<? extends yb3.k>> eVar) {
            k kVar = j0.this.new k(this.f226237p, eVar);
            kVar.f226235m = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    public j0(yy.a aVar, bc3.e eVar, ac4.a aVar2, ha3.a aVar3, q qVar, cx.a aVar4, ha3.g gVar, ez.a aVar5, final ac3.a aVar6) {
        this.mapper = eVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getOldestChildBirthDateUC = aVar3;
        this.listUpdater = qVar;
        this.eventThrottler = aVar4;
        this.validateTripStagesUC = gVar;
        this.currentTimeProvider = aVar5;
        yb3.k.b bVar = yb3.k.b.f226243a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: yb3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.K9(this.f226148a, aVar6, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), B9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.a B9(yb3.k state) {
        return this.mapper.b(new bc3.e.Params(state, new er.l() { // from class: yb3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.C9(this.f226130a, (cc3.b) obj);
            }
        }, b9(yb3.i.f226147a), b9(yb3.d.f226129a), b9(yb3.e.f226131a), b9(yb3.g.f226139a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(j0 j0Var, cc3.b bVar) {
        j0Var.d9(new OnStageModified(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object D9(k10.c0<yb3.k.Initialized> c0Var, String str, tq.e<? super k10.l<? extends yb3.k>> eVar) throws Throwable {
        a aVar;
        LocalDate end;
        Field<fz.e.LocalDate> fieldC;
        fz.e.LocalDate localDateD;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f226174r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f226174r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f226172p;
        Object objE = uq.b.e();
        int i16 = aVar.f226174r;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) aVar.f226164f;
            oq.u.b(obj);
            return lVar;
        }
        oq.u.b(obj);
        Object objC = c0Var.c();
        List<StageField> listG = c0Var.a().g();
        Integer numC = yb3.b.c(listG, str);
        if (numC != null) {
            int iIntValue = numC.intValue();
            final StageField stageField = listG.get(iIntValue);
            fz.e.LocalDate localDateD2 = stageField.c().d();
            if (localDateD2 == null || (end = localDateD2.getStart()) == null) {
                StageField stageField2 = (StageField) pq.v.o0(listG, iIntValue - 1);
                end = (stageField2 == null || (fieldC = stageField2.c()) == null || (localDateD = fieldC.d()) == null) ? null : localDateD.getEnd();
            }
            Object dateRangePicker = new yb3.c.DateRangePicker(new uw.j.Range(null, stageField.c().d(), end != null ? new fz.b.YearMonth(YearMonth.from(end)) : null, new er.l() { // from class: yb3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.E9(this.f226140a, stageField, (fz.e.LocalDate) obj2);
                }
            }, this.currentTimeProvider.c().minus((TemporalAmount) fa3.a.a()).plusDays(1L), null, 33, null));
            aVar.f226162d = vq.j.a(c0Var);
            aVar.f226163e = vq.j.a(str);
            aVar.f226164f = objC;
            aVar.f226165g = vq.j.a(objC);
            aVar.f226166h = vq.j.a(listG);
            aVar.f226167j = vq.j.a(stageField);
            aVar.f226168k = vq.j.a(end);
            aVar.f226169l = 0;
            aVar.f226170m = iIntValue;
            aVar.f226171n = 0;
            aVar.f226174r = 1;
            if (F(dateRangePicker, aVar) == objE) {
                return objE;
            }
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(j0 j0Var, StageField stageField, fz.e.LocalDate localDate) {
        j0Var.d9(new OnDateRangeChanged(stageField.getId(), localDate));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F9(k10.c0<yb3.k.Initialized> c0Var, final String str, tq.e<? super k10.l<? extends yb3.k>> eVar) throws Throwable {
        b bVar;
        Object next;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f226184n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f226184n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f226182l;
        Object objE = uq.b.e();
        int i16 = bVar.f226184n;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) bVar.f226177f;
            oq.u.b(obj);
            return lVar;
        }
        oq.u.b(obj);
        Object objC = c0Var.c();
        Iterator<T> it = c0Var.a().g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((StageField) next).getId(), str));
        StageField stageField = (StageField) next;
        if (stageField != null) {
            Object map = new yb3.c.Map(new SetupData(stageField.f().d(), new er.l() { // from class: yb3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return j0.G9(this.f226145a, str, (Place) obj2);
                }
            }));
            bVar.f226175d = vq.j.a(c0Var);
            bVar.f226176e = vq.j.a(str);
            bVar.f226177f = objC;
            bVar.f226178g = vq.j.a(objC);
            bVar.f226179h = vq.j.a(stageField);
            bVar.f226180j = 0;
            bVar.f226181k = 0;
            bVar.f226184n = 1;
            if (F(map, bVar) == objE) {
                return objE;
            }
        }
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(j0 j0Var, String str, Place place) {
        j0Var.d9(new OnPlaceSelected(str, place));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<yb3.k.Initialized> H9(k10.c0<yb3.k.Initialized> c0Var, final String str) {
        return c0Var.b(new er.l() { // from class: yb3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.I9(this.f226137a, str, (k.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yb3.k.Initialized I9(j0 j0Var, String str, yb3.k.Initialized initialized) {
        return yb3.k.Initialized.b(initialized, j0Var.listUpdater.f(str, initialized.g()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(final j0 j0Var, final ac3.a aVar, k10.v vVar) {
        vVar.c(fr.q0.c(yb3.k.b.class), new er.l() { // from class: yb3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.L9(this.f226118a, aVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(yb3.k.Initialized.class), new er.l() { // from class: yb3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.M9(this.f226127a, aVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(j0 j0Var, ac3.a aVar, k10.z zVar) {
        zVar.A(j0Var.new d(aVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(j0 j0Var, ac3.a aVar, k10.z zVar) {
        e eVar = j0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(yb3.d.class), oVar, eVar);
        zVar.x(fr.q0.c(yb3.e.class), oVar, j0Var.new f(null));
        zVar.v(fr.q0.c(OnStageModified.class), oVar, j0Var.new g(null));
        zVar.v(fr.q0.c(OnDateRangeChanged.class), oVar, j0Var.new h(null));
        zVar.v(fr.q0.c(OnPlaceSelected.class), oVar, j0Var.new i(null));
        zVar.v(fr.q0.c(yb3.i.class), oVar, new j(null));
        zVar.v(fr.q0.c(yb3.g.class), oVar, j0Var.new k(aVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<yb3.k.Initialized> y9(k10.c0<yb3.k.Initialized> c0Var, final String str) {
        return c0Var.b(new er.l() { // from class: yb3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return j0.z9(this.f226132a, str, (k.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yb3.k.Initialized z9(j0 j0Var, String str, yb3.k.Initialized initialized) {
        StageField stageField = new StageField(null, null, null, 7, null);
        return yb3.k.Initialized.b(initialized, j0Var.listUpdater.e(str, initialized.g(), stageField), null, new ScrollableField(stageField.getId(), null), 2, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yb3.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ac3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<yb3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<yb3.k, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<l.a> getState() {
        return this.state;
    }
}
