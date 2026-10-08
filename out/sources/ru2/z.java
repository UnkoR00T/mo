package ru2;

import bu2.CompanyDetails;
import fr.q0;
import mu.p0;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vu2.PeselVerificationInputData;
import zt2.CompanyDataValidation;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010\u0013J\u001b\u0010)\u001a\u00020\u000f*\u00020\u001e2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u00020-*\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020D0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u00100\u001a\b\u0012\u0004\u0012\u0002010J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lru2/z;", "Ll00/g;", "Lru2/n;", "", "Lru2/o;", "Lyy/a;", "stateMachineFactory", "Lzt2/d;", "checkCompanyDataCorrectUseCase", "Lru2/m;", "setupContract", "Lru2/s;", "mapper", "<init>", "(Lyy/a;Lzt2/d;Lru2/m;Lru2/s;)V", "", "companyName", "Loq/i0;", "E9", "(Ljava/lang/String;)V", "companyCity", "C9", "postalCode", "F9", "companyStreet", "G9", "companyBuildingNumber", "B9", "companyApartmentNumber", "A9", "Lbu2/a;", "radioButtonId", "D9", "(Lbu2/a;)V", "nipNumber", "I9", "regonNumber", "J9", "krsNumber", "H9", "data", "y9", "(Lbu2/a;Lru2/n;)Ljava/lang/String;", "Lbu2/b;", "companyDetails", "Lmx/a;", "x9", "(Lbu2/a;Lbu2/b;)Lmx/a;", "state", "Lru2/o$a;", "z9", "(Lru2/n;)Lru2/o$a;", "b", "Lzt2/d;", "c", "Lru2/m;", "d", "Lru2/s;", "e", "Lru2/n;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lru2/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements ru2.o, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zt2.d checkCompanyDataCorrectUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ru2.m setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ru2.s mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ru2.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<ru2.o.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176266a;

        static {
            int[] iArr = new int[bu2.a.values().length];
            try {
                iArr[bu2.a.NIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bu2.a.REGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bu2.a.KRS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f176266a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<String, oq.i0> {
        b(Object obj) {
            super(1, obj, z.class, "onKrsNumberChanged", "onKrsNumberChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).H9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<String, oq.i0> {
        c(Object obj) {
            super(1, obj, z.class, "onCompanyNameChanged", "onCompanyNameChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).E9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<String, oq.i0> {
        d(Object obj) {
            super(1, obj, z.class, "onCompanyCityChanged", "onCompanyCityChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).C9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<String, oq.i0> {
        e(Object obj) {
            super(1, obj, z.class, "onCompanyPostalCodeChanged", "onCompanyPostalCodeChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).F9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.l<String, oq.i0> {
        f(Object obj) {
            super(1, obj, z.class, "onCompanyStreetChanged", "onCompanyStreetChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).G9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class g extends fr.q implements er.l<String, oq.i0> {
        g(Object obj) {
            super(1, obj, z.class, "onCompanyBuildingNumberChanged", "onCompanyBuildingNumberChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).B9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class h extends fr.q implements er.l<String, oq.i0> {
        h(Object obj) {
            super(1, obj, z.class, "onCompanyApartmentNumberChanged", "onCompanyApartmentNumberChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).A9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class i extends fr.q implements er.l<bu2.a, oq.i0> {
        i(Object obj) {
            super(1, obj, z.class, "onCompanyIdRadioButtonSelected", "onCompanyIdRadioButtonSelected(Lpl/gov/coi/mobywatel/feature/peselrestrictionverification/model/CompanyIdType;)V", 0);
        }

        public final void E(bu2.a aVar) {
            ((z) this.f66391b).D9(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(bu2.a aVar) {
            E(aVar);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class j extends fr.q implements er.l<String, oq.i0> {
        j(Object obj) {
            super(1, obj, z.class, "onNipNumberChanged", "onNipNumberChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).I9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class k extends fr.q implements er.l<String, oq.i0> {
        k(Object obj) {
            super(1, obj, z.class, "onRegonNumberChanged", "onRegonNumberChanged(Ljava/lang/String;)V", 0);
        }

        public final void E(String str) {
            ((z) this.f66391b).J9(str);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            E(str);
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class l implements mu.g<ru2.o.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f176267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f176268b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f176269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f176270b;

            /* JADX INFO: renamed from: ru2.z$l$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4496a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f176271d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f176272e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f176273f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f176275h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f176276j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f176277k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f176278l;

                public C4496a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f176271d = obj;
                    this.f176272e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f176269a = hVar;
                this.f176270b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4496a c4496a;
                if (eVar instanceof C4496a) {
                    c4496a = (C4496a) eVar;
                    int i15 = c4496a.f176272e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4496a.f176272e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4496a = new C4496a(eVar);
                    }
                } else {
                    c4496a = new C4496a(eVar);
                }
                Object obj2 = c4496a.f176271d;
                Object objE = uq.b.e();
                int i16 = c4496a.f176272e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f176269a;
                    ru2.o.Data dataZ9 = this.f176270b.z9((State) obj);
                    c4496a.f176273f = vq.j.a(obj);
                    c4496a.f176275h = vq.j.a(c4496a);
                    c4496a.f176276j = vq.j.a(obj);
                    c4496a.f176277k = vq.j.a(hVar);
                    c4496a.f176278l = 0;
                    c4496a.f176272e = 1;
                    if (hVar.F(dataZ9, c4496a) == objE) {
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

        public l(mu.g gVar, z zVar) {
            this.f176267a = gVar;
            this.f176268b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ru2.o.Data> hVar, tq.e eVar) {
            Object objA = this.f176267a.a(new a(hVar, this.f176268b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/k;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<OnNipNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176281g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnNipNumberChanged onNipNumberChanged, State state) {
            return State.b(state, null, null, null, null, null, null, new PeselVerificationInputData(mx.b.b(onNipNumberChanged.getNipNumber(), "nipNumber"), hz.b.C2039b.f86846c), null, null, null, 959, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnNipNumberChanged onNipNumberChanged = (OnNipNumberChanged) this.f176280f;
            k10.c0 c0Var = (k10.c0) this.f176281g;
            uq.b.e();
            if (this.f176279e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.m.O(onNipNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnNipNumberChanged onNipNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            m mVar = new m(eVar);
            mVar.f176280f = onNipNumberChanged;
            mVar.f176281g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/l;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<OnRegonNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176284g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnRegonNumberChanged onRegonNumberChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, new PeselVerificationInputData(mx.b.b(onRegonNumberChanged.getRegonNumber(), "regonNumber"), hz.b.C2039b.f86846c), null, null, 895, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnRegonNumberChanged onRegonNumberChanged = (OnRegonNumberChanged) this.f176283f;
            k10.c0 c0Var = (k10.c0) this.f176284g;
            uq.b.e();
            if (this.f176282e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O(onRegonNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnRegonNumberChanged onRegonNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            n nVar = new n(eVar);
            nVar.f176283f = onRegonNumberChanged;
            nVar.f176284g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/i;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OnKrsNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176287g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnKrsNumberChanged onKrsNumberChanged, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, new PeselVerificationInputData(mx.b.b(onKrsNumberChanged.getKrsNumber(), "krsNumber"), hz.b.C2039b.f86846c), null, 767, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnKrsNumberChanged onKrsNumberChanged = (OnKrsNumberChanged) this.f176286f;
            k10.c0 c0Var = (k10.c0) this.f176287g;
            uq.b.e();
            if (this.f176285e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O(onKrsNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnKrsNumberChanged onKrsNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            o oVar = new o(eVar);
            oVar.f176286f = onKrsNumberChanged;
            oVar.f176287g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176289f;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CompanyDetails companyDetails, z zVar, State state) {
            Label labelC;
            Label labelC2;
            Label labelC3;
            Label labelC4;
            Label labelC5;
            Label labelC6;
            bu2.a companyIdType;
            String apartmentNumber;
            String buildingNumber;
            String street;
            String postalCode;
            String city;
            String name;
            if (companyDetails == null || (name = companyDetails.getName()) == null || (labelC = mx.b.b(name, "name")) == null) {
                labelC = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData = new PeselVerificationInputData(labelC, null, 2, null);
            if (companyDetails == null || (city = companyDetails.getCity()) == null || (labelC2 = mx.b.b(city, "city")) == null) {
                labelC2 = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData2 = new PeselVerificationInputData(labelC2, null, 2, null);
            if (companyDetails == null || (postalCode = companyDetails.getPostalCode()) == null || (labelC3 = mx.b.b(postalCode, "postalCode")) == null) {
                labelC3 = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData3 = new PeselVerificationInputData(labelC3, null, 2, null);
            if (companyDetails == null || (street = companyDetails.getStreet()) == null || (labelC4 = mx.b.b(street, "street")) == null) {
                labelC4 = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData4 = new PeselVerificationInputData(labelC4, null, 2, null);
            if (companyDetails == null || (buildingNumber = companyDetails.getBuildingNumber()) == null || (labelC5 = mx.b.b(buildingNumber, "buildingNumber")) == null) {
                labelC5 = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData5 = new PeselVerificationInputData(labelC5, null, 2, null);
            if (companyDetails == null || (apartmentNumber = companyDetails.getApartmentNumber()) == null || (labelC6 = mx.b.b(apartmentNumber, "apartmentNumber")) == null) {
                labelC6 = Label.INSTANCE.c();
            }
            PeselVerificationInputData peselVerificationInputData6 = new PeselVerificationInputData(labelC6, null, 2, null);
            bu2.a aVar = bu2.a.NIP;
            return state.a(peselVerificationInputData, peselVerificationInputData2, peselVerificationInputData3, peselVerificationInputData4, peselVerificationInputData5, peselVerificationInputData6, new PeselVerificationInputData(zVar.x9(aVar, companyDetails), null, 2, null), new PeselVerificationInputData(zVar.x9(bu2.a.REGON, companyDetails), null, 2, null), new PeselVerificationInputData(zVar.x9(bu2.a.KRS, companyDetails), null, 2, null), (companyDetails == null || (companyIdType = companyDetails.getCompanyIdType()) == null) ? aVar : companyIdType);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f176289f;
            Object objE = uq.b.e();
            int i15 = this.f176288e;
            if (i15 == 0) {
                oq.u.b(obj);
                ru2.m mVar = z.this.setupContract;
                this.f176289f = c0Var;
                this.f176288e = 1;
                obj = mVar.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final z zVar = z.this;
            final CompanyDetails companyDetails = (CompanyDetails) obj;
            return c0Var.b(new er.l() { // from class: ru2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.p.O(companyDetails, zVar, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f176289f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/j;", "<unused var>", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ru2.j, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f176291e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f176292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176293g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, CompanyDataValidation companyDataValidation, State state) {
            return State.b(state, new PeselVerificationInputData(((State) c0Var.a()).getCompanyNameScreenData().getContent(), companyDataValidation.getCompanyNameValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getCompanyCityScreenData().getContent(), companyDataValidation.getCompanyCityValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getCompanyPostalCodeScreenData().getContent(), companyDataValidation.getCompanyPostalCodeValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getCompanyStreetScreenData().getContent(), companyDataValidation.getCompanyStreetValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getCompanyBuildingScreenData().getContent(), companyDataValidation.getCompanyBuildingNumberValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getCompanyApartmentScreenData().getContent(), companyDataValidation.getCompanyApartmentNumberValidation().a()), new PeselVerificationInputData(((State) c0Var.a()).getNipNumberData().getContent(), ((State) c0Var.a()).getSelectedRadioButtonId() == bu2.a.NIP ? companyDataValidation.getCompanyIdNumberValidation().a() : hz.b.C2039b.f86846c), new PeselVerificationInputData(((State) c0Var.a()).getRegonNumberData().getContent(), ((State) c0Var.a()).getSelectedRadioButtonId() == bu2.a.REGON ? companyDataValidation.getCompanyIdNumberValidation().a() : hz.b.C2039b.f86846c), new PeselVerificationInputData(((State) c0Var.a()).getKrsNumberData().getContent(), ((State) c0Var.a()).getSelectedRadioButtonId() == bu2.a.KRS ? companyDataValidation.getCompanyIdNumberValidation().a() : hz.b.C2039b.f86846c), null, 512, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x01ae, code lost:
        
            if (r4.F(r5, r17) == r2) goto L22;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru2.z.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ru2.j jVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f176293g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/f;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<OnCompanyNameChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176297g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyNameChanged onCompanyNameChanged, State state) {
            return State.b(state, new PeselVerificationInputData(mx.b.b(onCompanyNameChanged.getCompanyName(), "companyName"), hz.b.C2039b.f86846c), null, null, null, null, null, null, null, null, null, 1022, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyNameChanged onCompanyNameChanged = (OnCompanyNameChanged) this.f176296f;
            k10.c0 c0Var = (k10.c0) this.f176297g;
            uq.b.e();
            if (this.f176295e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.r.O(onCompanyNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyNameChanged onCompanyNameChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            r rVar = new r(eVar);
            rVar.f176296f = onCompanyNameChanged;
            rVar.f176297g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/d;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<OnCompanyCityChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176300g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyCityChanged onCompanyCityChanged, State state) {
            return State.b(state, null, new PeselVerificationInputData(mx.b.b(onCompanyCityChanged.getCompanyCity(), "companyCity"), hz.b.C2039b.f86846c), null, null, null, null, null, null, null, null, 1021, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyCityChanged onCompanyCityChanged = (OnCompanyCityChanged) this.f176299f;
            k10.c0 c0Var = (k10.c0) this.f176300g;
            uq.b.e();
            if (this.f176298e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.s.O(onCompanyCityChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyCityChanged onCompanyCityChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            s sVar = new s(eVar);
            sVar.f176299f = onCompanyCityChanged;
            sVar.f176300g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/g;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<OnCompanyPostalCodeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176303g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyPostalCodeChanged onCompanyPostalCodeChanged, State state) {
            return State.b(state, null, null, new PeselVerificationInputData(mx.b.b(onCompanyPostalCodeChanged.getPostalCode(), "postalCode"), hz.b.C2039b.f86846c), null, null, null, null, null, null, null, 1019, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyPostalCodeChanged onCompanyPostalCodeChanged = (OnCompanyPostalCodeChanged) this.f176302f;
            k10.c0 c0Var = (k10.c0) this.f176303g;
            uq.b.e();
            if (this.f176301e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.t.O(onCompanyPostalCodeChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyPostalCodeChanged onCompanyPostalCodeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            t tVar = new t(eVar);
            tVar.f176302f = onCompanyPostalCodeChanged;
            tVar.f176303g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/h;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<OnCompanyStreetChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176306g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyStreetChanged onCompanyStreetChanged, State state) {
            return State.b(state, null, null, null, new PeselVerificationInputData(mx.b.b(onCompanyStreetChanged.getCompanyStreet(), "companystreet"), hz.b.C2039b.f86846c), null, null, null, null, null, null, 1015, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyStreetChanged onCompanyStreetChanged = (OnCompanyStreetChanged) this.f176305f;
            k10.c0 c0Var = (k10.c0) this.f176306g;
            uq.b.e();
            if (this.f176304e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.u.O(onCompanyStreetChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyStreetChanged onCompanyStreetChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            u uVar = new u(eVar);
            uVar.f176305f = onCompanyStreetChanged;
            uVar.f176306g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/c;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<OnCompanyBuildingNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176309g;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyBuildingNumberChanged onCompanyBuildingNumberChanged, State state) {
            return State.b(state, null, null, null, null, new PeselVerificationInputData(mx.b.b(onCompanyBuildingNumberChanged.getCompanyBuildingNumber(), "companyBuildingNumber"), hz.b.C2039b.f86846c), null, null, null, null, null, 1007, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyBuildingNumberChanged onCompanyBuildingNumberChanged = (OnCompanyBuildingNumberChanged) this.f176308f;
            k10.c0 c0Var = (k10.c0) this.f176309g;
            uq.b.e();
            if (this.f176307e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.v.O(onCompanyBuildingNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyBuildingNumberChanged onCompanyBuildingNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            v vVar = new v(eVar);
            vVar.f176308f = onCompanyBuildingNumberChanged;
            vVar.f176309g = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/b;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<OnCompanyApartmentNumberChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176312g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyApartmentNumberChanged onCompanyApartmentNumberChanged, State state) {
            return State.b(state, null, null, null, null, null, new PeselVerificationInputData(mx.b.b(onCompanyApartmentNumberChanged.getCompanyApartmentNumber(), "companyApartmentNumber"), hz.b.C2039b.f86846c), null, null, null, null, 991, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyApartmentNumberChanged onCompanyApartmentNumberChanged = (OnCompanyApartmentNumberChanged) this.f176311f;
            k10.c0 c0Var = (k10.c0) this.f176312g;
            uq.b.e();
            if (this.f176310e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.w.O(onCompanyApartmentNumberChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyApartmentNumberChanged onCompanyApartmentNumberChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            w wVar = new w(eVar);
            wVar.f176311f = onCompanyApartmentNumberChanged;
            wVar.f176312g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru2/e;", "action", "Lk10/c0;", "Lru2/n;", "state", "Lk10/l;", "<anonymous>", "(Lru2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<OnCompanyIdRadioButtonSelected, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176315g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnCompanyIdRadioButtonSelected onCompanyIdRadioButtonSelected, State state) {
            return State.b(state, null, null, null, null, null, null, null, null, null, onCompanyIdRadioButtonSelected.getRadioButtonId(), 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCompanyIdRadioButtonSelected onCompanyIdRadioButtonSelected = (OnCompanyIdRadioButtonSelected) this.f176314f;
            k10.c0 c0Var = (k10.c0) this.f176315g;
            uq.b.e();
            if (this.f176313e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ru2.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.x.O(onCompanyIdRadioButtonSelected, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCompanyIdRadioButtonSelected onCompanyIdRadioButtonSelected, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            x xVar = new x(eVar);
            xVar.f176314f = onCompanyIdRadioButtonSelected;
            xVar.f176315g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, zt2.d dVar, ru2.m mVar, ru2.s sVar) {
        this.checkCompanyDataCorrectUseCase = dVar;
        this.setupContract = mVar;
        this.mapper = sVar;
        State state = new State(new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), new PeselVerificationInputData(null, null, 3, null), bu2.a.NIP);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ru2.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f176258a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new l(e9().getState(), this), z9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A9(String companyApartmentNumber) {
        d9(new OnCompanyApartmentNumberChanged(companyApartmentNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B9(String companyBuildingNumber) {
        d9(new OnCompanyBuildingNumberChanged(companyBuildingNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(String companyCity) {
        d9(new OnCompanyCityChanged(companyCity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D9(bu2.a radioButtonId) {
        d9(new OnCompanyIdRadioButtonSelected(radioButtonId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9(String companyName) {
        d9(new OnCompanyNameChanged(companyName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(String postalCode) {
        d9(new OnCompanyPostalCodeChanged(postalCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G9(String companyStreet) {
        d9(new OnCompanyStreetChanged(companyStreet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9(String krsNumber) {
        d9(new OnKrsNumberChanged(krsNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I9(String nipNumber) {
        d9(new OnNipNumberChanged(nipNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9(String regonNumber) {
        d9(new OnRegonNumberChanged(regonNumber));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ru2.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.M9(this.f176257a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new p(null));
        q qVar = zVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(ru2.j.class), oVar, qVar);
        zVar2.v(q0.c(OnCompanyNameChanged.class), oVar, new r(null));
        zVar2.v(q0.c(OnCompanyCityChanged.class), oVar, new s(null));
        zVar2.v(q0.c(OnCompanyPostalCodeChanged.class), oVar, new t(null));
        zVar2.v(q0.c(OnCompanyStreetChanged.class), oVar, new u(null));
        zVar2.v(q0.c(OnCompanyBuildingNumberChanged.class), oVar, new v(null));
        zVar2.v(q0.c(OnCompanyApartmentNumberChanged.class), oVar, new w(null));
        zVar2.v(q0.c(OnCompanyIdRadioButtonSelected.class), oVar, new x(null));
        zVar2.v(q0.c(OnNipNumberChanged.class), oVar, new m(null));
        zVar2.v(q0.c(OnRegonNumberChanged.class), oVar, new n(null));
        zVar2.v(q0.c(OnKrsNumberChanged.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Label x9(bu2.a aVar, CompanyDetails companyDetails) {
        return aVar == (companyDetails != null ? companyDetails.getCompanyIdType() : null) ? mx.b.b(companyDetails.getIdNumber(), "companyDetails") : Label.INSTANCE.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y9(bu2.a aVar, State state) {
        int i15 = a.f176266a[aVar.ordinal()];
        if (i15 == 1) {
            return state.getNipNumberData().getContent().getText();
        }
        if (i15 == 2) {
            return state.getRegonNumberData().getContent().getText();
        }
        if (i15 == 3) {
            return state.getKrsNumberData().getContent().getText();
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru2.o.Data z9(State state) {
        return this.mapper.b(new ru2.s.Params(state, b9(ru2.j.f176193a), new c(this), new d(this), new e(this), new f(this), new g(this), new h(this), new i(this), new j(this), new k(this), new b(this)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ru2.m mVar) {
        super.P5(mVar);
    }

    @Override // zx.b
    public xw.b<ru2.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ru2.o.Data> getState() {
        return this.state;
    }
}
