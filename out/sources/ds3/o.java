package ds3;

import cj0.AccessibleZusEVisitDepartments;
import cj0.ZusEVisitDepartment;
import fr.q0;
import iy.b0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ps3.SetupData;
import ss3.SummaryData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010%J\u000f\u0010*\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010%J\u0017\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0002¢\u0006\u0004\b/\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R,\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010%\u001a\u0004\bB\u0010CR \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR&\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00160M8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010%\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lds3/o;", "Ll00/g;", "Lds3/b;", "Lds3/a;", "Lds3/c;", "", "Lyy/a;", "stateMachineFactory", "Lnr3/g;", "getAccessibleZusDepartmentsUseCase", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "Lmx/c;", "labelProvider", "Lib4/c;", "errorMapper", "Les3/c;", "screenMapper", "Lss3/b;", "setupData", "<init>", "(Lyy/a;Lnr3/g;Lj14/o;Lmx/c;Lib4/c;Les3/c;Lss3/b;)V", "Lds3/c$a;", "y9", "(Lds3/b;)Lds3/c$a;", "Liy/b0;", "postcode", "Lhz/g;", "L9", "(Liy/b0;)Lhz/g;", "Ldx/b;", "domainError", "Ljb4/b;", "z9", "(Ldx/b;)Ljb4/b;", "Loq/i0;", "d", "()V", "postalCode", "C9", "(Liy/b0;)V", "D9", "E9", "Lcj0/h;", "department", "F9", "(Lcj0/h;)V", "B9", "b", "Lnr3/g;", "c", "Lj14/o;", "Lmx/c;", "e", "Lib4/c;", "f", "Les3/c;", "g", "Lss3/b;", "Lds3/b$b;", "h", "Lds3/b$b;", "initialState", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lds3/a$e;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<ds3.b, ds3.a> implements ds3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.g getAccessibleZusDepartmentsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final es3.c screenMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SummaryData setupData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ds3.b.InitializedInput initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ds3.b, ds3.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ds3.a.e> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ds3.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, o.class, "onNextButtonClick", "onNextButtonClick()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).E9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<b0, i0> {
        b(Object obj) {
            super(1, obj, o.class, "onChangePostalCode", "onChangePostalCode(Lpl/gov/coi/common/domain/security/SensitiveCharArray;)V", 0);
        }

        public final void E(b0 b0Var) {
            ((o) this.f66391b).C9(b0Var);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            E(b0Var);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<ZusEVisitDepartment, i0> {
        c(Object obj) {
            super(1, obj, o.class, "onNextButtonToDateClick", "onNextButtonToDateClick(Lpl/gov/coi/mobywatel/be/citizenservice/contract/model/zus/ZusEVisitDepartment;)V", 0);
        }

        public final void E(ZusEVisitDepartment zusEVisitDepartment) {
            ((o) this.f66391b).F9(zusEVisitDepartment);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ZusEVisitDepartment zusEVisitDepartment) {
            E(zusEVisitDepartment);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, o.class, "onChangeDepartmentClick", "onChangeDepartmentClick()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).B9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.a<i0> {
        e(Object obj) {
            super(0, obj, o.class, "onEnterDepartmentSelect", "onEnterDepartmentSelect()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).D9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44411e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44411e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                ds3.a.e.C1003a c1003a = ds3.a.e.C1003a.f44366a;
                this.f44411e = 1;
                if (oVar.F(c1003a, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44413e;

        g(tq.e<? super g> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f44413e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.d9(ds3.a.c.f44364a);
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new g(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44415e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZusEVisitDepartment f44417g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ZusEVisitDepartment zusEVisitDepartment, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f44417g = zusEVisitDepartment;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44415e;
            if (i15 == 0) {
                oq.u.b(obj);
                o oVar = o.this;
                ds3.a.e.EnterDate enterDate = new ds3.a.e.EnterDate(this.f44417g);
                this.f44415e = 1;
                if (oVar.F(enterDate, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new h(this.f44417g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements mu.g<ds3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f44419b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f44421b;

            /* JADX INFO: renamed from: ds3.o$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1006a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44422d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44423e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44424f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44426h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44427j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44428k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44429l;

                public C1006a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44422d = obj;
                    this.f44423e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f44420a = hVar;
                this.f44421b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1006a c1006a;
                if (eVar instanceof C1006a) {
                    c1006a = (C1006a) eVar;
                    int i15 = c1006a.f44423e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1006a.f44423e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1006a = new C1006a(eVar);
                    }
                } else {
                    c1006a = new C1006a(eVar);
                }
                Object obj2 = c1006a.f44422d;
                Object objE = uq.b.e();
                int i16 = c1006a.f44423e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f44420a;
                    ds3.c.a aVarY9 = this.f44421b.y9((ds3.b) obj);
                    c1006a.f44424f = vq.j.a(obj);
                    c1006a.f44426h = vq.j.a(c1006a);
                    c1006a.f44427j = vq.j.a(obj);
                    c1006a.f44428k = vq.j.a(hVar);
                    c1006a.f44429l = 0;
                    c1006a.f44423e = 1;
                    if (hVar.F(aVarY9, c1006a) == objE) {
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

        public i(mu.g gVar, o oVar) {
            this.f44418a = gVar;
            this.f44419b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ds3.c.a> hVar, tq.e eVar) {
            Object objA = this.f44418a.a(new a(hVar, this.f44419b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lds3/b;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<ds3.b>, tq.e<? super k10.l<? extends ds3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44431f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput O(o oVar, ds3.b bVar) {
            b0 defaultPostcode = oVar.setupData.getDefaultPostcode();
            if (defaultPostcode == null) {
                defaultPostcode = b0.INSTANCE.a();
            }
            return new ds3.b.InitializedInput(defaultPostcode, null, oVar.setupData.getTopic(), 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f44431f;
            uq.b.e();
            if (this.f44430e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o oVar = o.this;
            k10.l lVarD = c0Var.d(new er.l() { // from class: ds3.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.j.O(oVar, (b) obj2);
                }
            });
            o oVar2 = o.this;
            b0 defaultPostcode = oVar2.setupData.getDefaultPostcode();
            if (defaultPostcode != null && fr.t.c(oVar2.L9(defaultPostcode), hz.g.b.f86853b)) {
                oVar2.d9(new ds3.a.FindDepartment(true));
            }
            return lVarD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ds3.b> c0Var, tq.e<? super k10.l<? extends ds3.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = o.this.new j(eVar);
            jVar.f44431f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lds3/a$f;", "event", "Lk10/c0;", "Lds3/b$b;", "state", "Lk10/l;", "Lds3/b;", "<anonymous>", "(Lds3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ds3.a.SetTopic, c0<ds3.b.InitializedInput>, tq.e<? super k10.l<? extends ds3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44435g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput O(ds3.a.SetTopic setTopic, ds3.b.InitializedInput initializedInput) {
            return ds3.b.InitializedInput.b(initializedInput, null, null, setTopic.getTopic(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ds3.a.SetTopic setTopic = (ds3.a.SetTopic) this.f44434f;
            c0 c0Var = (c0) this.f44435g;
            uq.b.e();
            if (this.f44433e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ds3.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.k.O(setTopic, (b.InitializedInput) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ds3.a.SetTopic setTopic, c0<ds3.b.InitializedInput> c0Var, tq.e<? super k10.l<? extends ds3.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f44434f = setTopic;
            kVar.f44435g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lds3/a$b;", "event", "Lk10/c0;", "Lds3/b$b;", "state", "Lk10/l;", "Lds3/b;", "<anonymous>", "(Lds3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ds3.a.ChangePostalCode, c0<ds3.b.InitializedInput>, tq.e<? super k10.l<? extends ds3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f44438g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput O(c0 c0Var, ds3.a.ChangePostalCode changePostalCode, ds3.b.InitializedInput initializedInput) {
            return ds3.b.InitializedInput.b((ds3.b.InitializedInput) c0Var.a(), changePostalCode.getPostCode(), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ds3.a.ChangePostalCode changePostalCode = (ds3.a.ChangePostalCode) this.f44437f;
            final c0 c0Var = (c0) this.f44438g;
            uq.b.e();
            if (this.f44436e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ds3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.l.O(c0Var, changePostalCode, (b.InitializedInput) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ds3.a.ChangePostalCode changePostalCode, c0<ds3.b.InitializedInput> c0Var, tq.e<? super k10.l<? extends ds3.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f44437f = changePostalCode;
            lVar.f44438g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lds3/a$d;", "event", "Lk10/c0;", "Lds3/b$b;", "state", "Lk10/l;", "Lds3/b;", "<anonymous>", "(Lds3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ds3.a.FindDepartment, c0<ds3.b.InitializedInput>, tq.e<? super k10.l<? extends ds3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f44439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f44440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f44441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f44442h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f44443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f44444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f44445l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f44446m;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44448a;

            static {
                int[] iArr = new int[AccessibleZusEVisitDepartments.EnumC0702a.values().length];
                try {
                    iArr[AccessibleZusEVisitDepartments.EnumC0702a.FOUND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND_VISIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AccessibleZusEVisitDepartments.EnumC0702a.OTHER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AccessibleZusEVisitDepartments.EnumC0702a.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f44448a = iArr;
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput Y(c0 c0Var, hz.g gVar, ds3.b.InitializedInput initializedInput) {
            return ds3.b.InitializedInput.b((ds3.b.InitializedInput) c0Var.a(), null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.FoundDepartment Z(AccessibleZusEVisitDepartments accessibleZusEVisitDepartments, ds3.a.FindDepartment findDepartment, c0 c0Var, ds3.b.InitializedInput initializedInput) {
            return new ds3.b.FoundDepartment(accessibleZusEVisitDepartments, findDepartment.getIsDefaultPostcode(), ((ds3.b.InitializedInput) c0Var.a()).getTopic());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput a0(c0 c0Var, o oVar, ds3.b.InitializedInput initializedInput) {
            return ds3.b.InitializedInput.b((ds3.b.InitializedInput) c0Var.a(), null, new hz.b.Invalid(oVar.labelProvider.c(ir3.a.f96798k1)), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.FoundDepartment b0(AccessibleZusEVisitDepartments accessibleZusEVisitDepartments, c0 c0Var, ds3.b.InitializedInput initializedInput) {
            return new ds3.b.FoundDepartment(accessibleZusEVisitDepartments, false, ((ds3.b.InitializedInput) c0Var.a()).getTopic(), 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
        
            if (r6.F(r7, r9) == r2) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ds3.o.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object w(ds3.a.FindDepartment findDepartment, c0<ds3.b.InitializedInput> c0Var, tq.e<? super k10.l<? extends ds3.b>> eVar) {
            m mVar = o.this.new m(eVar);
            mVar.f44445l = findDepartment;
            mVar.f44446m = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lds3/a$a;", "<unused var>", "Lk10/c0;", "Lds3/b$a;", "state", "Lk10/l;", "Lds3/b;", "<anonymous>", "(Lds3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ds3.a.C1002a, c0<ds3.b.FoundDepartment>, tq.e<? super k10.l<? extends ds3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44450f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ds3.b.InitializedInput O(c0 c0Var, ds3.b.FoundDepartment foundDepartment) {
            return new ds3.b.InitializedInput(null, null, ((ds3.b.FoundDepartment) c0Var.a()).getTopic(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f44450f;
            uq.b.e();
            if (this.f44449e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ds3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.n.O(c0Var, (b.FoundDepartment) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ds3.a.C1002a c1002a, c0<ds3.b.FoundDepartment> c0Var, tq.e<? super k10.l<? extends ds3.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f44450f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ds3.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lds3/a$c;", "<unused var>", "Lds3/b$a;", "state", "Loq/i0;", "<anonymous>", "(Lds3/a$c;Lds3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class C1007o extends vq.k implements er.q<ds3.a.c, ds3.b.FoundDepartment, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f44452f;

        C1007o(tq.e<? super C1007o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ds3.b.FoundDepartment foundDepartment = (ds3.b.FoundDepartment) this.f44452f;
            Object objE = uq.b.e();
            int i15 = this.f44451e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ds3.a.e> bVarY1 = o.this.Y1();
                ds3.a.e.EnterDepartmentSelect enterDepartmentSelect = new ds3.a.e.EnterDepartmentSelect(new SetupData(o.this.labelProvider.c(ir3.a.f96804m1), foundDepartment.getAccessibleDepartments().b(), ps3.c.GO_TO_CHOOSE_DATE));
                this.f44452f = vq.j.a(foundDepartment);
                this.f44451e = 1;
                if (bVarY1.F(enterDepartmentSelect, this) == objE) {
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
        public final Object w(ds3.a.c cVar, ds3.b.FoundDepartment foundDepartment, tq.e<? super i0> eVar) {
            C1007o c1007o = o.this.new C1007o(eVar);
            c1007o.f44452f = foundDepartment;
            return c1007o.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, nr3.g gVar, j14.o oVar, mx.c cVar, ib4.c cVar2, es3.c cVar3, SummaryData summaryData) {
        this.getAccessibleZusDepartmentsUseCase = gVar;
        this.checkPolishPostalCodeCorrectUC = oVar;
        this.labelProvider = cVar;
        this.errorMapper = cVar2;
        this.screenMapper = cVar3;
        this.setupData = summaryData;
        ds3.b.InitializedInput initializedInput = new ds3.b.InitializedInput(null, null, null, 7, null);
        this.initialState = initializedInput;
        this.stateMachine = aVar.a(initializedInput, new er.l() { // from class: ds3.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.H9(this.f44400a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new i(e9().getState(), this), y9(initializedInput));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(o oVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            oVar.E9();
        } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
            oVar.d();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B9() {
        d9(ds3.a.C1002a.f44361a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(b0 postalCode) {
        d9(new ds3.a.ChangePostalCode(postalCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D9() {
        i00.a.a(this, new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9() {
        d9(new ds3.a.FindDepartment(false, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F9(ZusEVisitDepartment department) {
        i00.a.a(this, new h(department, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final o oVar, k10.v vVar) {
        vVar.c(q0.c(ds3.b.class), new er.l() { // from class: ds3.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.I9(this.f44396a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ds3.b.InitializedInput.class), new er.l() { // from class: ds3.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.J9(this.f44397a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ds3.b.FoundDepartment.class), new er.l() { // from class: ds3.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.K9(this.f44398a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(o oVar, k10.z zVar) {
        zVar.A(oVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(o oVar, k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ds3.a.SetTopic.class), oVar2, kVar);
        zVar.v(q0.c(ds3.a.ChangePostalCode.class), oVar2, new l(null));
        zVar.v(q0.c(ds3.a.FindDepartment.class), oVar2, oVar.new m(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(o oVar, k10.z zVar) {
        n nVar = new n(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ds3.a.C1002a.class), oVar2, nVar);
        zVar.x(q0.c(ds3.a.c.class), oVar2, oVar.new C1007o(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.g L9(b0 postcode) {
        return this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(iy.c0.g(t04.a.b(iy.c0.e(postcode), 0, 1, null)), false, 2, null));
    }

    private final void d() {
        i00.a.a(this, new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ds3.c.a y9(ds3.b bVar) {
        return this.screenMapper.b(new es3.c.Params(bVar, new a(this), new b(this), new e(this), new c(this), new d(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b z9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ds3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.A9(this.f44399a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SummaryData summaryData) {
        super.P5(summaryData);
    }

    @Override // zx.b
    public xw.b<ds3.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ds3.b, ds3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ds3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ds3.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
