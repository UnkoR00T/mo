package ob3;

import java.util.List;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import rb3.NativeResults;
import rb3.Results;
import rb3.TripStateData;
import vy.Coordinates;
import w04.LocationDetails;
import z93.Place;
import z93.PlaceSuggestion;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001eBk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u00020.*\u00020&H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020.*\u000203H\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010)\u001a\b\u0012\u0004\u0012\u00020*0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010c\u001a\u00020`*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006f"}, d2 = {"Lob3/y0;", "Ll00/g;", "Lob3/o;", "Lob3/g;", "Lob3/v;", "", "Lyy/a;", "stateMachineFactory", "Lqb3/f;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lha3/b;", "getPlaceDataUC", "Lox/a;", "loaderManager", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lea3/a;", "mapInteractor", "Lx93/c;", "placesInteractor", "Le14/d;", "getAddressUseCase", "Le14/b;", "findAddressesByNameUC", "Lob3/n;", "setupData", "<init>", "(Lyy/a;Lqb3/f;Lac4/a;Lha3/b;Lox/a;Lhb4/d;Lib4/c;Lea3/a;Lx93/c;Le14/d;Le14/b;Lob3/n;)V", "Ldx/b;", "Ljb4/f;", "Q9", "(Ldx/b;)Ljb4/f;", "Lvy/c;", "coordinates", "Lz93/c;", "R9", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "state", "Lob3/v$a;", "S9", "(Lob3/o;)Lob3/v$a;", "Lz93/f;", "Lrb3/b$b;", "ma", "(Lz93/f;)Lrb3/b$b;", "la", "(Lz93/c;)Lrb3/b$b;", "Lw04/c;", "ka", "(Lw04/c;)Lrb3/b$b;", "b", "Lqb3/f;", "c", "Lac4/a;", "d", "Lha3/b;", "e", "Lox/a;", "f", "Lhb4/d;", "g", "Lib4/c;", "h", "Lea3/a;", "j", "Lx93/c;", "k", "Le14/d;", "l", "Le14/b;", "Lob3/o$b$a;", "m", "Lob3/o$b$a;", "initialState", "Lxw/b;", "Lob3/g$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Ljb4/b;", "P9", "(Ldx/b;)Ljb4/b;", "errorData", "r", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 extends l00.g<ob3.o, ob3.g> implements ob3.v, zx.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f144391r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f144392s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f144393t;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qb3.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ha3.b getPlaceDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ox.a loaderManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ea3.a mapInteractor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x93.c placesInteractor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e14.d getAddressUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final e14.b findAddressesByNameUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ob3.o.b.Initialization initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ob3.g.a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ob3.o, ob3.g> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ob3.v.a> state;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lob3/y0$a;", "", "<init>", "()V", "Lgu/b;", "SEARCH_DEBOUNCE", "J", "a", "()J", "", "POLAND_COUNTRY_ISO", "Ljava/lang/String;", "", "QUERY_MIN_LENGTH", "I", "BUSINESS_GEOCODING_ERROR_CODE", "BUSINESS_PLACES_ERROR_CODE", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final long a() {
            return y0.f144393t;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f144409e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144411g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144409e = obj;
            this.f144411g |= PKIFailureInfo.systemUnavail;
            return y0.this.R9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ob3.v.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f144412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f144413b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f144414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0 f144415b;

            /* JADX INFO: renamed from: ob3.y0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3585a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f144416d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f144417e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f144418f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f144420h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f144421j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f144422k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f144423l;

                public C3585a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f144416d = obj;
                    this.f144417e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y0 y0Var) {
                this.f144414a = hVar;
                this.f144415b = y0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3585a c3585a;
                if (eVar instanceof C3585a) {
                    c3585a = (C3585a) eVar;
                    int i15 = c3585a.f144417e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3585a.f144417e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3585a = new C3585a(eVar);
                    }
                } else {
                    c3585a = new C3585a(eVar);
                }
                Object obj2 = c3585a.f144416d;
                Object objE = uq.b.e();
                int i16 = c3585a.f144417e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f144414a;
                    ob3.v.a aVarS9 = this.f144415b.S9((ob3.o) obj);
                    c3585a.f144418f = vq.j.a(obj);
                    c3585a.f144420h = vq.j.a(c3585a);
                    c3585a.f144421j = vq.j.a(obj);
                    c3585a.f144422k = vq.j.a(hVar);
                    c3585a.f144423l = 0;
                    c3585a.f144417e = 1;
                    if (hVar.F(aVarS9, c3585a) == objE) {
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

        public c(mu.g gVar, y0 y0Var) {
            this.f144412a = gVar;
            this.f144413b = y0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ob3.v.a> hVar, tq.e eVar) {
            Object objA = this.f144412a.a(new a(hVar, this.f144413b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lob3/g$c;", "<unused var>", "Lob3/o;", "Loq/i0;", "<anonymous>", "(Lob3/g$c;Lob3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ob3.g.c, ob3.o, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144424e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144424e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = y0.this;
                ob3.g.a.C3577a c3577a = ob3.g.a.C3577a.f144292a;
                this.f144424e = 1;
                if (y0Var.F(c3577a, this) == objE) {
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
        public final Object w(ob3.g.c cVar, ob3.o oVar, tq.e<? super oq.i0> eVar) {
            return y0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/b;", "<unused var>", "Lk10/c0;", "Lob3/s;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ob3.b, k10.c0<Error>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144427f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData(), error.getSessionToken(), error.getIsFetchingNative(), error.getHint(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144427f;
            uq.b.e();
            if (this.f144426e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f144427f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/a;", "<unused var>", "Lk10/c0;", "Lob3/s;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ob3.a, k10.c0<Error>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144429f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen O(Error error) {
            return new ob3.o.c.Screen(error.getData(), error.getSessionToken(), error.getIsFetchingNative(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144429f;
            uq.b.e();
            if (this.f144428e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            f fVar = new f(eVar);
            fVar.f144429f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lob3/o$b$a;", "it", "Loq/i0;", "<anonymous>", "(Lob3/o$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<ob3.o.b.Initialization, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144430e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144430e;
            if (i15 == 0) {
                oq.u.b(obj);
                ox.a aVar = y0.this.loaderManager;
                this.f144430e = 1;
                if (aVar.f(this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ob3.o.b.Initialization initialization, tq.e<? super oq.i0> eVar) {
            return ((g) v(initialization, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y0.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/d;", "<unused var>", "Lk10/c0;", "Lob3/o$b$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ob3.d, k10.c0<ob3.o.b.Initialization>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144433f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o O(ob3.o.b.Initialization initialization) {
            return initialization.getData().getSelectedPlaceType() != null ? new ob3.o.b.Screen(initialization.getData(), initialization.getIsFetchingNative()) : new ob3.o.c.Screen(initialization.getData(), null, initialization.getIsFetchingNative(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144433f;
            Object objE = uq.b.e();
            int i15 = this.f144432e;
            if (i15 == 0) {
                oq.u.b(obj);
                ox.a aVar = y0.this.loaderManager;
                this.f144433f = c0Var;
                this.f144432e = 1;
                if (aVar.d(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: ob3.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.h.O((o.b.Initialization) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.d dVar, k10.c0<ob3.o.b.Initialization> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            h hVar = y0.this.new h(eVar);
            hVar.f144433f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/c;", "action", "Lk10/c0;", "Lob3/o$b$b;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OnClick, k10.c0<ob3.o.b.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144437g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.b O(k10.c0 c0Var, OnClick onClick, ob3.o.b.Screen screen) {
            boolean isFetchingNative = ((ob3.o.b.Screen) c0Var.a()).getIsFetchingNative();
            if (isFetchingNative) {
                return new FetchingNative(screen.getData(), screen.getIsFetchingNative(), onClick.getCoordinates());
            }
            if (isFetchingNative) {
                throw new oq.p();
            }
            return new Fetching(screen.getData(), onClick.getCoordinates(), screen.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnClick onClick = (OnClick) this.f144436f;
            final k10.c0 c0Var = (k10.c0) this.f144437g;
            uq.b.e();
            if (this.f144435e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.i.O(c0Var, onClick, (o.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnClick onClick, k10.c0<ob3.o.b.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            i iVar = new i(eVar);
            iVar.f144436f = onClick;
            iVar.f144437g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/f;", "<unused var>", "Lk10/c0;", "Lob3/o$b$b;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ob3.f, k10.c0<ob3.o.b.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144439f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen O(ob3.o.b.Screen screen) {
            return new ob3.o.c.Screen(screen.getData(), null, screen.getIsFetchingNative(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144439f;
            uq.b.e();
            if (this.f144438e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.j.O((o.b.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.f fVar, k10.c0<ob3.o.b.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            j jVar = new j(eVar);
            jVar.f144439f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lob3/g$b;", "<unused var>", "Lob3/o$b$b;", "Loq/i0;", "<anonymous>", "(Lob3/g$b;Lob3/o$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ob3.g.b, ob3.o.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144440e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144440e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = y0.this;
                ob3.g.a.C3577a c3577a = ob3.g.a.C3577a.f144292a;
                this.f144440e = 1;
                if (y0Var.F(c3577a, this) == objE) {
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
        public final Object w(ob3.g.b bVar, ob3.o.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return y0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lob3/e;", "action", "Lob3/o$b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lob3/e;Lob3/o$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OnNext, ob3.o.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SetupData f144444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y0 f144445h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(SetupData setupData, y0 y0Var, tq.e<? super l> eVar) {
            super(3, eVar);
            this.f144444g = setupData;
            this.f144445h = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnNext onNext = (OnNext) this.f144443f;
            Object objE = uq.b.e();
            int i15 = this.f144442e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f144444g.a().b(onNext.getPlace());
                y0 y0Var = this.f144445h;
                ob3.g.a.C3577a c3577a = ob3.g.a.C3577a.f144292a;
                this.f144443f = vq.j.a(onNext);
                this.f144442e = 1;
                if (y0Var.F(c3577a, this) == objE) {
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
        public final Object w(OnNext onNext, ob3.o.b.Screen screen, tq.e<? super oq.i0> eVar) {
            l lVar = new l(this.f144444g, this.f144445h, eVar);
            lVar.f144443f = onNext;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lob3/q;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144447f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lob3/o$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ob3.o.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f144449e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f144450f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Fetching> f144451g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, k10.c0<Fetching> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144450f = y0Var;
                this.f144451g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FetchingNative Y(Fetching fetching) {
                return new FetchingNative(fetching.getData(), true, fetching.getCoordinates());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Z(y0 y0Var, dx.b bVar, Fetching fetching) {
                return new Error(y0Var.errorVMSFactory.a(y0Var.P9(bVar)), fetching.getData(), fetching.getIsFetchingNative(), fetching.getCoordinates());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ob3.o.b.Screen a0(y0 y0Var, z93.f fVar, Fetching fetching) {
                return new ob3.o.b.Screen(fetching.getData().a("", y0Var.ma(fVar), TripStateData.a.c.f172997a), fetching.getIsFetchingNative());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f144449e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    x93.c cVar = this.f144450f.placesInteractor;
                    Coordinates coordinates = this.f144451g.a().getCoordinates();
                    this.f144449e = 1;
                    obj = cVar.a(coordinates, this);
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
                final y0 y0Var = this.f144450f;
                k10.c0<Fetching> c0Var = this.f144451g;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    PayloadErrorData payloadErrorDataQ9 = y0Var.Q9(bVar);
                    return fr.t.c(payloadErrorDataQ9 != null ? payloadErrorDataQ9.getCode() : null, "GOOGLE_GEOCODE_COMMUNICATION") ? c0Var.d(new er.l() { // from class: ob3.e1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y0.m.a.Y((Fetching) obj2);
                        }
                    }) : c0Var.d(new er.l() { // from class: ob3.f1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y0.m.a.Z(y0Var, bVar, (Fetching) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final z93.f fVar = (z93.f) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ob3.g1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y0.m.a.a0(y0Var, fVar, (Fetching) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f144450f, this.f144451g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ob3.o.b>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144447f;
            Object objE = uq.b.e();
            int i15 = this.f144446e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y0.this, c0Var, null);
            this.f144447f = vq.j.a(c0Var);
            this.f144446e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            return ((m) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            m mVar = y0.this.new m(eVar);
            mVar.f144447f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lob3/r;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<FetchingNative>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144453f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lob3/o$b$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ob3.o.b.Screen>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f144455e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f144456f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<FetchingNative> f144457g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, k10.c0<FetchingNative> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144456f = y0Var;
                this.f144457g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ob3.o.b.Screen V(y0 y0Var, Place place, FetchingNative fetchingNative) {
                return new ob3.o.b.Screen(fetchingNative.getData().a("", y0Var.la(place), TripStateData.a.c.f172997a), fetchingNative.getIsFetchingNative());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f144455e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    y0 y0Var = this.f144456f;
                    Coordinates coordinates = this.f144457g.a().getCoordinates();
                    this.f144455e = 1;
                    obj = y0Var.R9(coordinates, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                final Place place = (Place) obj;
                k10.c0<FetchingNative> c0Var = this.f144457g;
                final y0 y0Var2 = this.f144456f;
                return c0Var.d(new er.l() { // from class: ob3.h1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y0.n.a.V(y0Var2, place, (FetchingNative) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f144456f, this.f144457g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<ob3.o.b.Screen>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144453f;
            Object objE = uq.b.e();
            int i15 = this.f144452e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y0.this, c0Var, null);
            this.f144453f = vq.j.a(c0Var);
            this.f144452e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<FetchingNative> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = y0.this.new n(eVar);
            nVar.f144453f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/b;", "<unused var>", "Lk10/c0;", "Lob3/p;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ob3.b, k10.c0<Error>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144459f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Error error) {
            return new Fetching(error.getData(), error.getCoordinates(), error.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144459f;
            uq.b.e();
            if (this.f144458e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.o.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            o oVar = new o(eVar);
            oVar.f144459f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/a;", "<unused var>", "Lk10/c0;", "Lob3/p;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ob3.a, k10.c0<Error>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144461f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.b.Screen O(Error error) {
            return new ob3.o.b.Screen(error.getData(), error.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144461f;
            uq.b.e();
            if (this.f144460e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.p.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            p pVar = new p(eVar);
            pVar.f144461f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/l;", "action", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<OnQueryChanged, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144464g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen O(OnQueryChanged onQueryChanged, ob3.o.c.Screen screen) {
            return ob3.o.c.Screen.c(screen, TripStateData.b(screen.getData(), onQueryChanged.getQuery(), null, TripStateData.a.C4413b.f172996a, 2, null), null, false, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnQueryChanged onQueryChanged = (OnQueryChanged) this.f144463f;
            k10.c0 c0Var = (k10.c0) this.f144464g;
            uq.b.e();
            if (this.f144462e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y0.this.d9(new FetchHints(onQueryChanged.getQuery()));
            return c0Var.b(new er.l() { // from class: ob3.k1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.q.O(onQueryChanged, (o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnQueryChanged onQueryChanged, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            q qVar = y0.this.new q(eVar);
            qVar.f144463f = onQueryChanged;
            qVar.f144464g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/h;", "action", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<FetchHints, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144468g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen Z(ob3.o.c.Screen screen) {
            return ob3.o.c.Screen.c(screen, TripStateData.b(screen.getData(), null, null, TripStateData.a.c.f172997a, 3, null), null, false, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen a0(ob3.o.c.Screen screen) {
            return new ob3.o.c.Screen(TripStateData.b(screen.getData(), null, null, TripStateData.a.C4412a.f172995a, 3, null), screen.getSessionToken(), screen.getIsFetchingNative(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen b0(List list, ob3.o.c.Screen screen) {
            return new ob3.o.c.Screen(TripStateData.b(screen.getData(), null, null, list.isEmpty() ? rb3.c.f173004a : new NativeResults(list), 3, null), screen.getSessionToken(), screen.getIsFetchingNative(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen c0(ob3.o.c.Screen screen) {
            return new ob3.o.c.Screen(TripStateData.b(screen.getData(), null, null, TripStateData.a.C4412a.f172995a, 3, null), screen.getSessionToken(), true, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen d0(List list, ob3.o.c.Screen screen) {
            return new ob3.o.c.Screen(TripStateData.b(screen.getData(), null, null, list.isEmpty() ? rb3.c.f173004a : new Results(list), 3, null), screen.getSessionToken(), screen.getIsFetchingNative(), null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        
            if (r10 == r2) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
        
            if (r10 == r2) goto L45;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ob3.y0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object w(FetchHints fetchHints, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            r rVar = y0.this.new r(eVar);
            rVar.f144467f = fetchHints;
            rVar.f144468g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/m;", "<unused var>", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ob3.m, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144471f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.c.Screen O(ob3.o.c.Screen screen) {
            return ob3.o.c.Screen.c(screen, TripStateData.b(screen.getData(), "", null, null, 6, null), null, false, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144471f;
            uq.b.e();
            if (this.f144470e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y0.this.d9(new FetchHints(""));
            return c0Var.b(new er.l() { // from class: ob3.q1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.s.O((o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.m mVar, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            s sVar = y0.this.new s(eVar);
            sVar.f144471f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/k;", "action", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<Places, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144475g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fetching O(Places places, ob3.o.c.Screen screen) {
            return new Fetching(screen.getData(), screen.getSessionToken(), screen.getIsFetchingNative(), places.getHint(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Places places = (Places) this.f144474f;
            k10.c0 c0Var = (k10.c0) this.f144475g;
            uq.b.e();
            if (this.f144473e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.r1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.t.O(places, (o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Places places, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            t tVar = new t(eVar);
            tVar.f144474f = places;
            tVar.f144475g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/j;", "action", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<Native, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144478g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.b.Screen O(y0 y0Var, Native r15, ob3.o.c.Screen screen) {
            return new ob3.o.b.Screen(TripStateData.b(screen.getData(), null, y0Var.ka(r15.getNativePlace()), null, 5, null), screen.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Native r15 = (Native) this.f144477f;
            k10.c0 c0Var = (k10.c0) this.f144478g;
            uq.b.e();
            if (this.f144476e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y0 y0Var = y0.this;
            return c0Var.d(new er.l() { // from class: ob3.s1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.u.O(y0Var, r15, (o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Native r15, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            u uVar = y0.this.new u(eVar);
            uVar.f144477f = r15;
            uVar.f144478g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/i;", "<unused var>", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<ob3.i, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144481f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.b.Screen O(ob3.o.c.Screen screen) {
            return new ob3.o.b.Screen(screen.getData(), screen.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144481f;
            uq.b.e();
            if (this.f144480e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.t1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.v.O((o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.i iVar, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            v vVar = new v(eVar);
            vVar.f144481f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lob3/g$b;", "<unused var>", "Lk10/c0;", "Lob3/o$c$a;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lob3/g$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<ob3.g.b, k10.c0<ob3.o.c.Screen>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144483f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ob3.o.b.Screen O(ob3.o.c.Screen screen) {
            return new ob3.o.b.Screen(screen.getData(), screen.getIsFetchingNative());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144483f;
            uq.b.e();
            if (this.f144482e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ob3.u1
                @Override // er.l
                public final Object b(Object obj2) {
                    return y0.w.O((o.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ob3.g.b bVar, k10.c0<ob3.o.c.Screen> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            w wVar = new w(eVar);
            wVar.f144483f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lob3/t;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.p<k10.c0<Fetching>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144485f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lob3/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ob3.o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f144487e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f144488f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Fetching> f144489g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, k10.c0<Fetching> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144488f = y0Var;
                this.f144489g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FetchingNative Y(Fetching fetching) {
                return new FetchingNative(fetching.getData(), fetching.getSessionToken(), true, fetching.getHint(), null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Z(y0 y0Var, dx.b bVar, Fetching fetching) {
                return new Error(y0Var.errorVMSFactory.a(y0Var.P9(bVar)), fetching.getData(), fetching.getSessionToken(), fetching.getIsFetchingNative(), fetching.getHint(), null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ob3.o.b.Screen a0(y0 y0Var, Place place, Fetching fetching) {
                return new ob3.o.b.Screen(TripStateData.b(fetching.getData(), null, y0Var.la(place), null, 5, null), fetching.getIsFetchingNative());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f144487e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ha3.b bVar = this.f144488f.getPlaceDataUC;
                    ha3.b.Params params = new ha3.b.Params(this.f144489g.a().getHint().getPlaceId(), this.f144489g.a().getSessionToken(), null);
                    this.f144487e = 1;
                    obj = bVar.d(params, this);
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
                final y0 y0Var = this.f144488f;
                k10.c0<Fetching> c0Var = this.f144489g;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    PayloadErrorData payloadErrorDataQ9 = y0Var.Q9(bVar2);
                    return fr.t.c(payloadErrorDataQ9 != null ? payloadErrorDataQ9.getCode() : null, "GOOGLE_PLACES_COMMUNICATION") ? c0Var.d(new er.l() { // from class: ob3.v1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y0.x.a.Y((Fetching) obj2);
                        }
                    }) : c0Var.d(new er.l() { // from class: ob3.w1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y0.x.a.Z(y0Var, bVar2, (Fetching) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final Place place = (Place) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ob3.x1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y0.x.a.a0(y0Var, place, (Fetching) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f144488f, this.f144489g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ob3.o>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        x(tq.e<? super x> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144485f;
            Object objE = uq.b.e();
            int i15 = this.f144484e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y0.this, c0Var, null);
            this.f144485f = vq.j.a(c0Var);
            this.f144484e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Fetching> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            return ((x) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            x xVar = y0.this.new x(eVar);
            xVar.f144485f = obj;
            return xVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lob3/u;", "state", "Lk10/l;", "Lob3/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<k10.c0<FetchingNative>, tq.e<? super k10.l<? extends ob3.o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144491f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lob3/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ob3.o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f144493e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y0 f144494f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<FetchingNative> f144495g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, k10.c0<FetchingNative> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f144494f = y0Var;
                this.f144495g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(y0 y0Var, dx.b bVar, FetchingNative fetchingNative) {
                return new Error(y0Var.errorVMSFactory.a(y0Var.P9(bVar)), fetchingNative.getData(), fetchingNative.getSessionToken(), fetchingNative.getIsFetchingNative(), fetchingNative.getHint(), null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ob3.o.b.Screen Y(y0 y0Var, LocationDetails locationDetails, FetchingNative fetchingNative) {
                return new ob3.o.b.Screen(TripStateData.b(fetchingNative.getData(), null, y0Var.ka(locationDetails), null, 5, null), fetchingNative.getIsFetchingNative());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f144493e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    e14.b bVar = this.f144494f.findAddressesByNameUC;
                    e14.b.Params params = new e14.b.Params(this.f144495g.a().getHint().getFullAddress());
                    this.f144493e = 1;
                    obj = bVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                Object right = (dx.i) obj;
                if (!(right instanceof dx.i.Left)) {
                    if (!(right instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    LocationDetails locationDetails = (LocationDetails) pq.v.n0((List) ((dx.i.Right) right).b());
                    right = locationDetails != null ? new dx.i.Right(locationDetails) : new dx.i.Left(new dx.b.Generic(null, 1, null));
                }
                k10.c0<FetchingNative> c0Var = this.f144495g;
                final y0 y0Var = this.f144494f;
                if (right instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) right).b();
                    return c0Var.d(new er.l() { // from class: ob3.y1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y0.y.a.X(y0Var, bVar2, (FetchingNative) obj2);
                        }
                    });
                }
                if (!(right instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final LocationDetails locationDetails2 = (LocationDetails) ((dx.i.Right) right).b();
                return c0Var.d(new er.l() { // from class: ob3.z1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y0.y.a.Y(y0Var, locationDetails2, (FetchingNative) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f144494f, this.f144495g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ob3.o>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f144491f;
            Object objE = uq.b.e();
            int i15 = this.f144490e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y0.this, c0Var, null);
            this.f144491f = vq.j.a(c0Var);
            this.f144490e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<FetchingNative> c0Var, tq.e<? super k10.l<? extends ob3.o>> eVar) {
            return ((y) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = y0.this.new y(eVar);
            yVar.f144491f = obj;
            return yVar;
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f144393t = gu.d.q(400, gu.e.MILLISECONDS);
    }

    public y0(yy.a aVar, qb3.f fVar, ac4.a aVar2, ha3.b bVar, ox.a aVar3, hb4.d dVar, ib4.c cVar, ea3.a aVar4, x93.c cVar2, e14.d dVar2, e14.b bVar2, final SetupData setupData) {
        this.mapper = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getPlaceDataUC = bVar;
        this.loaderManager = aVar3;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.mapInteractor = aVar4;
        this.placesInteractor = cVar2;
        this.getAddressUseCase = dVar2;
        this.findAddressesByNameUC = bVar2;
        Place selectedPlace = setupData.getSelectedPlace();
        ob3.o.b.Initialization initialization = new ob3.o.b.Initialization(new TripStateData("", selectedPlace != null ? la(selectedPlace) : null, TripStateData.a.c.f172997a), aVar4.a());
        this.initialState = initialization;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialization, new er.l() { // from class: ob3.o0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.Z9(this.f144322a, setupData, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), S9(initialization));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b P9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ob3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.x9(this.f144313a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData Q9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R9(Coordinates coordinates, tq.e<? super Place> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f144411g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f144411g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f144409e;
        Object objE = uq.b.e();
        int i16 = bVar.f144411g;
        if (i16 == 0) {
            oq.u.b(objB);
            e14.d dVar = this.getAddressUseCase;
            e14.d.Params params = new e14.d.Params(coordinates, pq.v.n());
            bVar.f144408d = vq.j.a(coordinates);
            bVar.f144411g = 1;
            objB = dVar.b(params, bVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        return fa3.b.a((LocationDetails) objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ob3.v.a S9(ob3.o state) {
        return this.mapper.b(new qb3.f.Params(state, b9(ob3.d.f144278a), b9(ob3.f.f144287a), new er.l() { // from class: ob3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.T9(this.f144298a, (Coordinates) obj);
            }
        }, new er.l() { // from class: ob3.p0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.U9(this.f144328a, (Place) obj);
            }
        }, b9(ob3.i.f144301a), new er.l() { // from class: ob3.q0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.V9(this.f144334a, (String) obj);
            }
        }, b9(ob3.m.f144309a), new er.l() { // from class: ob3.r0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.W9(this.f144339a, (PlaceSuggestion) obj);
            }
        }, new er.l() { // from class: ob3.s0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.X9(this.f144346a, (LocationDetails) obj);
            }
        }, b9(ob3.g.b.f144293a), b9(ob3.g.c.f144294a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(y0 y0Var, Coordinates coordinates) {
        y0Var.d9(new OnClick(coordinates));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(y0 y0Var, Place place) {
        y0Var.d9(new OnNext(place));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(y0 y0Var, String str) {
        y0Var.d9(new OnQueryChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(y0 y0Var, PlaceSuggestion placeSuggestion) {
        y0Var.d9(new Places(placeSuggestion));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(y0 y0Var, LocationDetails locationDetails) {
        y0Var.d9(new Native(locationDetails));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(final y0 y0Var, final SetupData setupData, k10.v vVar) {
        vVar.c(fr.q0.c(ob3.o.class), new er.l() { // from class: ob3.t0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.aa(this.f144353a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ob3.o.b.Initialization.class), new er.l() { // from class: ob3.u0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ba(this.f144358a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ob3.o.b.Screen.class), new er.l() { // from class: ob3.v0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ca(this.f144376a, setupData, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: ob3.w0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.da(this.f144380a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(FetchingNative.class), new er.l() { // from class: ob3.x0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ea(this.f144387a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ob3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.fa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ob3.o.c.Screen.class), new er.l() { // from class: ob3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ga(this.f144303a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Fetching.class), new er.l() { // from class: ob3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ha(this.f144305a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(FetchingNative.class), new er.l() { // from class: ob3.l0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ia(this.f144308a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: ob3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.ja((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(y0 y0Var, k10.z zVar) {
        d dVar = y0Var.new d(null);
        zVar.x(fr.q0.c(ob3.g.c.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(y0 y0Var, k10.z zVar) {
        zVar.C(y0Var.new g(null));
        h hVar = y0Var.new h(null);
        zVar.v(fr.q0.c(ob3.d.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(y0 y0Var, SetupData setupData, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(OnClick.class), oVar, iVar);
        zVar.v(fr.q0.c(ob3.f.class), oVar, new j(null));
        zVar.x(fr.q0.c(ob3.g.b.class), oVar, y0Var.new k(null));
        zVar.x(fr.q0.c(OnNext.class), oVar, new l(setupData, y0Var, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(y0 y0Var, k10.z zVar) {
        zVar.A(y0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(y0 y0Var, k10.z zVar) {
        zVar.A(y0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ob3.b.class), oVar2, oVar);
        zVar.v(fr.q0.c(ob3.a.class), oVar2, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(y0 y0Var, k10.z zVar) {
        q qVar = y0Var.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(OnQueryChanged.class), oVar, qVar);
        zVar.v(fr.q0.c(FetchHints.class), oVar, y0Var.new r(null));
        zVar.v(fr.q0.c(ob3.m.class), oVar, y0Var.new s(null));
        zVar.v(fr.q0.c(Places.class), oVar, new t(null));
        zVar.v(fr.q0.c(Native.class), oVar, y0Var.new u(null));
        zVar.v(fr.q0.c(ob3.i.class), oVar, new v(null));
        zVar.v(fr.q0.c(ob3.g.b.class), oVar, new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(y0 y0Var, k10.z zVar) {
        zVar.A(y0Var.new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(y0 y0Var, k10.z zVar) {
        zVar.A(y0Var.new y(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ob3.b.class), oVar, eVar);
        zVar.v(fr.q0.c(ob3.a.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TripStateData.InterfaceC4414b ka(LocationDetails locationDetails) {
        String countryCode = locationDetails.getCountryCode();
        if (fr.t.c(countryCode, "PL")) {
            return new TripStateData.InterfaceC4414b.a.PlaceInPoland(locationDetails.getCoordinates());
        }
        return fr.t.c(countryCode, "") ? new TripStateData.InterfaceC4414b.a.Unknown(locationDetails.getCoordinates()) : new TripStateData.InterfaceC4414b.Supported(fa3.b.a(locationDetails));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TripStateData.InterfaceC4414b la(Place place) {
        String countryIso = place.getCountryIso();
        if (fr.t.c(countryIso, "PL")) {
            return new TripStateData.InterfaceC4414b.a.PlaceInPoland(place.getCoordinates());
        }
        return (countryIso == null || fr.t.c(countryIso, "")) ? new TripStateData.InterfaceC4414b.a.Unknown(place.getCoordinates()) : new TripStateData.InterfaceC4414b.Supported(place);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TripStateData.InterfaceC4414b ma(z93.f fVar) {
        if (fVar instanceof z93.f.Found) {
            z93.f.Found found = (z93.f.Found) fVar;
            return fr.t.c(found.getDetails().getCountryIso(), "PL") ? new TripStateData.InterfaceC4414b.a.PlaceInPoland(found.getDetails().getCoordinates()) : new TripStateData.InterfaceC4414b.Supported(fa3.b.b(found.getDetails()));
        }
        if (fVar instanceof z93.f.NotFound) {
            return new TripStateData.InterfaceC4414b.a.Unknown(((z93.f.NotFound) fVar).getCoordinates());
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(y0 y0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            y0Var.d9(ob3.a.f144261a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            y0Var.d9(ob3.b.f144264a);
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: O9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ob3.g.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    public xw.b<ob3.g.a> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // l00.g
    protected k10.t<ob3.o, ob3.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ob3.v.a> getState() {
        return this.state;
    }
}
