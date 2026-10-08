package ud1;

import f00.j0;
import fr.q0;
import java.util.List;
import java.util.Map;
import ld1.SearchModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pd1.NonPublicSupplier;
import pq.v0;
import rd1.EdorAddressData;
import rd1.NotPublicAddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001ABC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lud1/v;", "Ll00/g;", "Lud1/e;", "Lud1/b;", "Lud1/f;", "", "Lyy/a;", "stateMachineFactory", "Lvd1/c;", "mapper", "Lqd1/b;", "validateExistingAddressDataUC", "Lla1/a;", "interactor", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lod1/a;", "contract", "<init>", "(Lyy/a;Lvd1/c;Lqd1/b;Lla1/a;Lac4/a;Lib4/c;Lod1/a;)V", "state", "Lud1/f$a;", "x9", "(Lud1/e;)Lud1/f$a;", "Ldx/b;", "domainError", "Ljb4/b;", "v9", "(Ldx/b;)Ljb4/b;", "b", "Lvd1/c;", "c", "Lqd1/b;", "d", "Lla1/a;", "e", "Lac4/a;", "f", "Lib4/c;", "g", "Lod1/a;", "Lud1/e$a;", "h", "Lud1/e$a;", "initialState", "Lxw/b;", "Lud1/b$e;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<ud1.e, ud1.b> implements ud1.f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vd1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qd1.b validateExistingAddressDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final od1.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ud1.e.FormDisplayed initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ud1.b.e> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ud1.e, ud1.b> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<ud1.f.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lud1/v$a;", "Lf00/j0;", "Lod1/a;", "Lud1/v;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<od1.a, v> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ud1.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f197675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f197676b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f197677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f197678b;

            /* JADX INFO: renamed from: ud1.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5137a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f197679d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f197680e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f197681f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f197683h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f197684j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f197685k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f197686l;

                public C5137a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f197679d = obj;
                    this.f197680e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f197677a = hVar;
                this.f197678b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5137a c5137a;
                if (eVar instanceof C5137a) {
                    c5137a = (C5137a) eVar;
                    int i15 = c5137a.f197680e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5137a.f197680e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5137a = new C5137a(eVar);
                    }
                } else {
                    c5137a = new C5137a(eVar);
                }
                Object obj2 = c5137a.f197679d;
                Object objE = uq.b.e();
                int i16 = c5137a.f197680e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f197677a;
                    ud1.f.a aVarX9 = this.f197678b.x9((ud1.e) obj);
                    c5137a.f197681f = vq.j.a(obj);
                    c5137a.f197683h = vq.j.a(c5137a);
                    c5137a.f197684j = vq.j.a(obj);
                    c5137a.f197685k = vq.j.a(hVar);
                    c5137a.f197686l = 0;
                    c5137a.f197680e = 1;
                    if (hVar.F(aVarX9, c5137a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f197675a = gVar;
            this.f197676b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ud1.f.a> hVar, tq.e eVar) {
            Object objA = this.f197675a.a(new a(hVar, this.f197676b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lud1/b$a;", "<unused var>", "Lud1/e;", "Loq/i0;", "<anonymous>", "(Lud1/b$a;Lud1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ud1.b.a, ud1.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197687e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f197687e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ud1.b.e> bVarY1 = v.this.Y1();
                ud1.b.e.a aVar = ud1.b.e.a.f197619a;
                this.f197687e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ud1.b.a aVar, ud1.e eVar, tq.e<? super i0> eVar2) {
            return v.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lud1/b$b;", "<unused var>", "Lud1/e;", "Loq/i0;", "<anonymous>", "(Lud1/b$b;Lud1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ud1.b.C5133b, ud1.e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197689e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f197689e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ud1.b.e> bVarY1 = v.this.Y1();
                ud1.b.e.C5134b c5134b = ud1.b.e.C5134b.f197620a;
                this.f197689e = 1;
                if (bVarY1.F(c5134b, this) == objE) {
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
        public final Object w(ud1.b.C5133b c5133b, ud1.e eVar, tq.e<? super i0> eVar2) {
            return v.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lud1/e$a;", "it", "Loq/i0;", "<anonymous>", "(Lud1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<ud1.e.FormDisplayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197691e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f197691e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(ud1.b.c.f197617a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ud1.e.FormDisplayed formDisplayed, tq.e<? super i0> eVar) {
            return ((e) v(formDisplayed, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lud1/b$c;", "<unused var>", "Lk10/c0;", "Lud1/e$a;", "state", "Lk10/l;", "Lud1/e;", "<anonymous>", "(Lud1/b$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ud1.b.c, k10.c0<ud1.e.FormDisplayed>, tq.e<? super k10.l<? extends ud1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197694f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lud1/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ud1.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f197696e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f197697f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f197698g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f197699h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f197700j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f197701k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ v f197702l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<ud1.e.FormDisplayed> f197703m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<ud1.e.FormDisplayed> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f197702l = vVar;
                this.f197703m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ud1.e.FormDisplayed V(v vVar, List list, ud1.e.FormDisplayed formDisplayed) {
                String address;
                NotPublicAddressData notPublicAddressData;
                NotPublicAddressData notPublicAddressData2;
                String providerShortcut;
                EdorAddressData edorAddressDataE1 = vVar.contract.E1();
                NonPublicSupplier nonPublicSupplier = (edorAddressDataE1 == null || (notPublicAddressData2 = edorAddressDataE1.getNotPublicAddressData()) == null || (providerShortcut = notPublicAddressData2.getProviderShortcut()) == null) ? null : new NonPublicSupplier(providerShortcut);
                hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
                DropDown dropDown = new DropDown(c2039b, list, nonPublicSupplier);
                EdorAddressData edorAddressDataE2 = vVar.contract.E1();
                if (edorAddressDataE2 == null || (notPublicAddressData = edorAddressDataE2.getNotPublicAddressData()) == null || (address = notPublicAddressData.getAddress()) == null) {
                    address = "";
                }
                return new ud1.e.FormDisplayed(new Regular(c2039b, address), dropDown);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<ud1.e.FormDisplayed> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f197701k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.a aVar = this.f197702l.interactor;
                    this.f197701k = 1;
                    obj = aVar.c(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f197697f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final v vVar = this.f197702l;
                k10.c0<ud1.e.FormDisplayed> c0Var2 = this.f197703m;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final List list = (List) ((dx.i.Right) iVar).b();
                    return c0Var2.b(new er.l() { // from class: ud1.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.f.a.V(vVar, list, (e.FormDisplayed) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<ud1.b.e> bVarY1 = vVar.Y1();
                ud1.b.e.Error error = new ud1.b.e.Error(vVar.v9(bVar));
                this.f197696e = vq.j.a(iVar);
                this.f197697f = c0Var2;
                this.f197698g = vq.j.a(bVar);
                this.f197699h = 0;
                this.f197700j = 0;
                this.f197701k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f197702l, this.f197703m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ud1.e>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f197694f;
            Object objE = uq.b.e();
            int i15 = this.f197693e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f197694f = vq.j.a(c0Var);
            this.f197693e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ud1.b.c cVar, k10.c0<ud1.e.FormDisplayed> c0Var, tq.e<? super k10.l<? extends ud1.e>> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f197694f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lud1/b$g;", "action", "Lk10/c0;", "Lud1/e$a;", "state", "Lk10/l;", "Lud1/e;", "<anonymous>", "(Lud1/b$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ud1.b.OnAddressChanged, k10.c0<ud1.e.FormDisplayed>, tq.e<? super k10.l<? extends ud1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197706g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ud1.e.FormDisplayed O(ud1.b.OnAddressChanged onAddressChanged, ud1.e.FormDisplayed formDisplayed) {
            return ud1.e.FormDisplayed.b(formDisplayed, new Regular(null, onAddressChanged.getAddress(), 1, null), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ud1.b.OnAddressChanged onAddressChanged = (ud1.b.OnAddressChanged) this.f197705f;
            k10.c0 c0Var = (k10.c0) this.f197706g;
            uq.b.e();
            if (this.f197704e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ud1.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.g.O(onAddressChanged, (e.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ud1.b.OnAddressChanged onAddressChanged, k10.c0<ud1.e.FormDisplayed> c0Var, tq.e<? super k10.l<? extends ud1.e>> eVar) {
            g gVar = new g(eVar);
            gVar.f197705f = onAddressChanged;
            gVar.f197706g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lud1/b$h;", "action", "Lk10/c0;", "Lud1/e$a;", "state", "Lk10/l;", "Lud1/e;", "<anonymous>", "(Lud1/b$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ud1.b.OnProviderChanged, k10.c0<ud1.e.FormDisplayed>, tq.e<? super k10.l<? extends ud1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197709g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ud1.e.FormDisplayed O(ud1.b.OnProviderChanged onProviderChanged, ud1.e.FormDisplayed formDisplayed) {
            return ud1.e.FormDisplayed.b(formDisplayed, null, DropDown.b(formDisplayed.getProvider(), hz.b.C2039b.f86846c, null, onProviderChanged.getProvider(), 2, null), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ud1.b.OnProviderChanged onProviderChanged = (ud1.b.OnProviderChanged) this.f197708f;
            k10.c0 c0Var = (k10.c0) this.f197709g;
            uq.b.e();
            if (this.f197707e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ud1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.h.O(onProviderChanged, (e.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ud1.b.OnProviderChanged onProviderChanged, k10.c0<ud1.e.FormDisplayed> c0Var, tq.e<? super k10.l<? extends ud1.e>> eVar) {
            h hVar = new h(eVar);
            hVar.f197708f = onProviderChanged;
            hVar.f197709g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lud1/b$d;", "action", "Lud1/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lud1/b$d;Lud1/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ud1.b.GoToSearch, ud1.e.FormDisplayed, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197711f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ud1.b.GoToSearch goToSearch = (ud1.b.GoToSearch) this.f197711f;
            Object objE = uq.b.e();
            int i15 = this.f197710e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ud1.b.e.GoToSearch goToSearch2 = new ud1.b.e.GoToSearch(goToSearch.getModel());
                this.f197711f = vq.j.a(goToSearch);
                this.f197710e = 1;
                if (vVar.F(goToSearch2, this) == objE) {
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
        public final Object w(ud1.b.GoToSearch goToSearch, ud1.e.FormDisplayed formDisplayed, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f197711f = goToSearch;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lud1/b$f;", "action", "Lk10/c0;", "Lud1/e$a;", "state", "Lk10/l;", "Lud1/e;", "<anonymous>", "(Lud1/b$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ud1.b.f, k10.c0<ud1.e.FormDisplayed>, tq.e<? super k10.l<? extends ud1.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f197713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f197715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f197716h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ud1.e.FormDisplayed O(Map map, ud1.e.FormDisplayed formDisplayed) {
            Regular address = formDisplayed.getAddress();
            Object objJ = v0.j(map, ud1.a.ADDRESS);
            hz.b.Companion companion = hz.b.INSTANCE;
            return formDisplayed.a(Regular.b(address, companion.a((hz.g) objJ), null, 2, null), DropDown.b(formDisplayed.getProvider(), companion.a((hz.g) v0.j(map, ud1.a.PROVIDER)), null, null, 6, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
        
            if (r2.F(r4, r11) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ud1.v.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ud1.b.f fVar, k10.c0<ud1.e.FormDisplayed> c0Var, tq.e<? super k10.l<? extends ud1.e>> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f197716h = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, vd1.c cVar, qd1.b bVar, la1.a aVar2, ac4.a aVar3, ib4.c cVar2, od1.a aVar4) {
        this.mapper = cVar;
        this.validateExistingAddressDataUC = bVar;
        this.interactor = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.genericDomainErrorMapper = cVar2;
        this.contract = aVar4;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        ud1.e.FormDisplayed formDisplayed = new ud1.e.FormDisplayed(new Regular(c2039b, ""), new DropDown(c2039b, null, null, 2, null));
        this.initialState = formDisplayed;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(formDisplayed, new er.l() { // from class: ud1.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f197664a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), x9(formDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(v vVar, SearchModel searchModel) {
        vVar.d9(new ud1.b.GoToSearch(searchModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(ud1.e.class), new er.l() { // from class: ud1.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f197658a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(ud1.e.FormDisplayed.class), new er.l() { // from class: ud1.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f197659a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(v vVar, k10.z zVar) {
        c cVar = vVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ud1.b.a.class), oVar, cVar);
        zVar.x(q0.c(ud1.b.C5133b.class), oVar, vVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(v vVar, k10.z zVar) {
        zVar.C(vVar.new e(null));
        f fVar = vVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ud1.b.c.class), oVar, fVar);
        zVar.v(q0.c(ud1.b.OnAddressChanged.class), oVar, new g(null));
        zVar.v(q0.c(ud1.b.OnProviderChanged.class), oVar, new h(null));
        zVar.x(q0.c(ud1.b.GoToSearch.class), oVar, vVar.new i(null));
        zVar.v(q0.c(ud1.b.f.class), oVar, vVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b v9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ud1.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.w9(this.f197663a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(v vVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            vVar.d9(ud1.b.a.f197615a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            vVar.d9(ud1.b.c.f197617a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ud1.f.a x9(ud1.e state) {
        return this.mapper.b(new vd1.c.Params(state, new er.l() { // from class: ud1.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.y9(this.f197660a, (String) obj);
            }
        }, new er.l() { // from class: ud1.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.z9(this.f197661a, (NonPublicSupplier) obj);
            }
        }, new er.l() { // from class: ud1.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f197662a, (SearchModel) obj);
            }
        }, b9(ud1.b.f.f197624a), b9(ud1.b.a.f197615a), b9(ud1.b.C5133b.f197616a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(v vVar, String str) {
        vVar.d9(new ud1.b.OnAddressChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(v vVar, NonPublicSupplier nonPublicSupplier) {
        vVar.d9(new ud1.b.OnProviderChanged(nonPublicSupplier));
        return i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<ud1.b.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ud1.e, ud1.b> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ud1.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ud1.b.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
