package sd1;

import f00.j0;
import fr.q0;
import java.util.Map;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import rd1.CreatePublicAddressData;
import rd1.EdorAddressData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u00013B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lsd1/z;", "Ll00/g;", "Lsd1/i;", "", "Lsd1/j;", "Lyy/a;", "stateMachineFactory", "Ltd1/b;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lqd1/a;", "validateCreateAddressDataUC", "Lod1/a;", "contract", "<init>", "(Lyy/a;Ltd1/b;La14/w;Lqd1/a;Lod1/a;)V", "state", "Lsd1/j$a;", "r9", "(Lsd1/i;)Lsd1/j$a;", "b", "Ltd1/b;", "c", "La14/w;", "d", "Lqd1/a;", "e", "Lod1/a;", "Lsd1/i$b;", "f", "Lsd1/i$b;", "initialState", "Lxw/b;", "Lsd1/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<sd1.i, Object> implements sd1.j, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final td1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qd1.a validateCreateAddressDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final od1.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sd1.i.FormDisplayed initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sd1.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sd1.i, Object> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<sd1.j.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsd1/z$a;", "Lf00/j0;", "Lod1/a;", "Lsd1/z;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<od1.a, z> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sd1.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f180349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f180350b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f180351a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f180352b;

            /* JADX INFO: renamed from: sd1.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4646a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f180353d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f180354e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f180355f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f180357h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f180358j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f180359k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f180360l;

                public C4646a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f180353d = obj;
                    this.f180354e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f180351a = hVar;
                this.f180352b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4646a c4646a;
                if (eVar instanceof C4646a) {
                    c4646a = (C4646a) eVar;
                    int i15 = c4646a.f180354e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4646a.f180354e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4646a = new C4646a(eVar);
                    }
                } else {
                    c4646a = new C4646a(eVar);
                }
                Object obj2 = c4646a.f180353d;
                Object objE = uq.b.e();
                int i16 = c4646a.f180354e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f180351a;
                    sd1.j.a aVarR9 = this.f180352b.r9((sd1.i) obj);
                    c4646a.f180355f = vq.j.a(obj);
                    c4646a.f180357h = vq.j.a(c4646a);
                    c4646a.f180358j = vq.j.a(obj);
                    c4646a.f180359k = vq.j.a(hVar);
                    c4646a.f180360l = 0;
                    c4646a.f180354e = 1;
                    if (hVar.F(aVarR9, c4646a) == objE) {
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

        public b(mu.g gVar, z zVar) {
            this.f180349a = gVar;
            this.f180350b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sd1.j.a> hVar, tq.e eVar) {
            Object objA = this.f180349a.a(new a(hVar, this.f180350b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsd1/a;", "<unused var>", "Lsd1/i;", "Loq/i0;", "<anonymous>", "(Lsd1/a;Lsd1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sd1.a, sd1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180361e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f180361e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sd1.c> bVarY1 = z.this.Y1();
                sd1.c.a aVar = sd1.c.a.f180286a;
                this.f180361e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(sd1.a aVar, sd1.i iVar, tq.e<? super oq.i0> eVar) {
            return z.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsd1/b;", "<unused var>", "Lsd1/i;", "Loq/i0;", "<anonymous>", "(Lsd1/b;Lsd1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sd1.b, sd1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180363e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f180363e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sd1.c> bVarY1 = z.this.Y1();
                sd1.c.b bVar = sd1.c.b.f180287a;
                this.f180363e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(sd1.b bVar, sd1.i iVar, tq.e<? super oq.i0> eVar) {
            return z.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsd1/i$b;", "it", "Lk10/l;", "Lsd1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<sd1.i.FormDisplayed>, tq.e<? super k10.l<? extends sd1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180366f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sd1.i.FormDisplayed O(z zVar, sd1.i.FormDisplayed formDisplayed) {
            String email;
            CreatePublicAddressData createPublicAddressData;
            String email2;
            CreatePublicAddressData createPublicAddressData2;
            EdorAddressData edorAddressDataE1 = zVar.contract.E1();
            String str = "";
            if (edorAddressDataE1 == null || (createPublicAddressData2 = edorAddressDataE1.getCreatePublicAddressData()) == null || (email = createPublicAddressData2.getEmail()) == null) {
                email = "";
            }
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            sd1.i.Field field = new sd1.i.Field(c2039b, email);
            EdorAddressData edorAddressDataE2 = zVar.contract.E1();
            if (edorAddressDataE2 != null && (createPublicAddressData = edorAddressDataE2.getCreatePublicAddressData()) != null && (email2 = createPublicAddressData.getEmail()) != null) {
                str = email2;
            }
            return new sd1.i.FormDisplayed(new sd1.i.Field(c2039b, str), field, new sd1.i.Field(c2039b, Boolean.FALSE));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f180366f;
            uq.b.e();
            if (this.f180365e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final z zVar = z.this;
            return c0Var.b(new er.l() { // from class: sd1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(zVar, (i.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sd1.i.FormDisplayed> c0Var, tq.e<? super k10.l<? extends sd1.i>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f180366f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsd1/h;", "action", "Lsd1/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsd1/h;Lsd1/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnLinkClicked, sd1.i.FormDisplayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180369f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnLinkClicked onLinkClicked = (OnLinkClicked) this.f180369f;
            Object objE = uq.b.e();
            int i15 = this.f180368e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = z.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(onLinkClicked.getUrl(), false, 2, null);
                this.f180369f = vq.j.a(onLinkClicked);
                this.f180368e = 1;
                if (wVar.c(params, this) == objE) {
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
        public final Object w(OnLinkClicked onLinkClicked, sd1.i.FormDisplayed formDisplayed, tq.e<? super oq.i0> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f180369f = onLinkClicked;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsd1/f;", "action", "Lk10/c0;", "Lsd1/i$b;", "state", "Lk10/l;", "Lsd1/i;", "<anonymous>", "(Lsd1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnEmailChanged, k10.c0<sd1.i.FormDisplayed>, tq.e<? super k10.l<? extends sd1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f180373g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sd1.i.FormDisplayed O(OnEmailChanged onEmailChanged, sd1.i.FormDisplayed formDisplayed) {
            return sd1.i.FormDisplayed.b(formDisplayed, new sd1.i.Field(null, onEmailChanged.getEmail(), 1, null), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChanged onEmailChanged = (OnEmailChanged) this.f180372f;
            k10.c0 c0Var = (k10.c0) this.f180373g;
            uq.b.e();
            if (this.f180371e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sd1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(onEmailChanged, (i.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChanged onEmailChanged, k10.c0<sd1.i.FormDisplayed> c0Var, tq.e<? super k10.l<? extends sd1.i>> eVar) {
            g gVar = new g(eVar);
            gVar.f180372f = onEmailChanged;
            gVar.f180373g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsd1/g;", "action", "Lk10/c0;", "Lsd1/i$b;", "state", "Lk10/l;", "Lsd1/i;", "<anonymous>", "(Lsd1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnEmailRepeatedChanged, k10.c0<sd1.i.FormDisplayed>, tq.e<? super k10.l<? extends sd1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f180376g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sd1.i.FormDisplayed O(OnEmailRepeatedChanged onEmailRepeatedChanged, sd1.i.FormDisplayed formDisplayed) {
            return sd1.i.FormDisplayed.b(formDisplayed, null, new sd1.i.Field(null, onEmailRepeatedChanged.getEmail(), 1, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailRepeatedChanged onEmailRepeatedChanged = (OnEmailRepeatedChanged) this.f180375f;
            k10.c0 c0Var = (k10.c0) this.f180376g;
            uq.b.e();
            if (this.f180374e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sd1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.O(onEmailRepeatedChanged, (i.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailRepeatedChanged onEmailRepeatedChanged, k10.c0<sd1.i.FormDisplayed> c0Var, tq.e<? super k10.l<? extends sd1.i>> eVar) {
            h hVar = new h(eVar);
            hVar.f180375f = onEmailRepeatedChanged;
            hVar.f180376g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsd1/e;", "action", "Lk10/c0;", "Lsd1/i$b;", "state", "Lk10/l;", "Lsd1/i;", "<anonymous>", "(Lsd1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OnConsentChanged, k10.c0<sd1.i.FormDisplayed>, tq.e<? super k10.l<? extends sd1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f180377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f180378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f180379g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sd1.i.FormDisplayed O(OnConsentChanged onConsentChanged, sd1.i.FormDisplayed formDisplayed) {
            return sd1.i.FormDisplayed.b(formDisplayed, null, null, new sd1.i.Field(null, Boolean.valueOf(onConsentChanged.getConsent()), 1, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnConsentChanged onConsentChanged = (OnConsentChanged) this.f180378f;
            k10.c0 c0Var = (k10.c0) this.f180379g;
            uq.b.e();
            if (this.f180377e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sd1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O(onConsentChanged, (i.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnConsentChanged onConsentChanged, k10.c0<sd1.i.FormDisplayed> c0Var, tq.e<? super k10.l<? extends sd1.i>> eVar) {
            i iVar = new i(eVar);
            iVar.f180378f = onConsentChanged;
            iVar.f180379g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsd1/d;", "<unused var>", "Lk10/c0;", "Lsd1/i$b;", "state", "Lk10/l;", "Lsd1/i;", "<anonymous>", "(Lsd1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sd1.d, k10.c0<sd1.i.FormDisplayed>, tq.e<? super k10.l<? extends sd1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f180380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f180381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f180382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f180383h;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sd1.i.FormDisplayed O(Map map, sd1.i.FormDisplayed formDisplayed) {
            sd1.i.Field<String> fieldD = formDisplayed.d();
            Object objJ = v0.j(map, i0.EMAIL);
            hz.b.Companion companion = hz.b.INSTANCE;
            return formDisplayed.a(sd1.i.Field.b(fieldD, companion.a((hz.g) objJ), null, 2, null), sd1.i.Field.b(formDisplayed.e(), companion.a((hz.g) v0.j(map, i0.EMAIL_REPEATED)), null, 2, null), sd1.i.Field.b(formDisplayed.c(), companion.a((hz.g) v0.j(map, i0.CONSENT)), null, 2, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
        
            if (r2.F(r4, r11) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.z.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sd1.d dVar, k10.c0<sd1.i.FormDisplayed> c0Var, tq.e<? super k10.l<? extends sd1.i>> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f180383h = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, td1.b bVar, a14.w wVar, qd1.a aVar2, od1.a aVar3) {
        this.mapper = bVar;
        this.openUrlIntentUseCase = wVar;
        this.validateCreateAddressDataUC = aVar2;
        this.contract = aVar3;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        sd1.i.FormDisplayed formDisplayed = new sd1.i.FormDisplayed(new sd1.i.Field(c2039b, ""), new sd1.i.Field(c2039b, ""), new sd1.i.Field(c2039b, Boolean.FALSE));
        this.initialState = formDisplayed;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(formDisplayed, new er.l() { // from class: sd1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.w9(this.f180340a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(formDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sd1.j.a r9(sd1.i state) {
        return this.mapper.b(new td1.b.Params(state, new er.l() { // from class: sd1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.s9(this.f180334a, (String) obj);
            }
        }, new er.l() { // from class: sd1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.t9(this.f180335a, (String) obj);
            }
        }, new er.l() { // from class: sd1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.u9(this.f180336a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: sd1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.v9(this.f180337a, (String) obj);
            }
        }, b9(sd1.d.f180290a), b9(sd1.a.f180282a), b9(sd1.b.f180284a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s9(z zVar, String str) {
        zVar.d9(new OnEmailChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t9(z zVar, String str) {
        zVar.d9(new OnEmailRepeatedChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(z zVar, boolean z15) {
        zVar.d9(new OnConsentChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(z zVar, String str) {
        zVar.d9(new OnLinkClicked(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(sd1.i.class), new er.l() { // from class: sd1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.x9(this.f180338a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sd1.i.FormDisplayed.class), new er.l() { // from class: sd1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.y9(this.f180339a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(z zVar, k10.z zVar2) {
        c cVar = zVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(sd1.a.class), oVar, cVar);
        zVar2.x(q0.c(sd1.b.class), oVar, zVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(z zVar, k10.z zVar2) {
        zVar2.A(zVar.new e(null));
        f fVar = zVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(OnLinkClicked.class), oVar, fVar);
        zVar2.v(q0.c(OnEmailChanged.class), oVar, new g(null));
        zVar2.v(q0.c(OnEmailRepeatedChanged.class), oVar, new h(null));
        zVar2.v(q0.c(OnConsentChanged.class), oVar, new i(null));
        zVar2.v(q0.c(sd1.d.class), oVar, zVar.new j(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<sd1.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sd1.i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sd1.j.a> getState() {
        return this.state;
    }
}
