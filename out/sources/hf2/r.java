package hf2;

import f00.j0;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormData;
import st3.AddressTerytDetail;
import zi0.InternetAddressPoint;
import zi0.InternetAddressPoints;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001ABC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lhf2/r;", "Ll00/g;", "Lhf2/b;", "Lhf2/a;", "Lhf2/c;", "", "Lyy/a;", "stateMachineFactory", "Lif2/e;", "mapper", "Lif2/b;", "errorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lhj0/b;", "getAddressPointsUseCase", "Lhb4/d;", "errorVMSFactory", "Lhf2/d;", "setupContract", "<init>", "(Lyy/a;Lif2/e;Lif2/b;Lac4/a;Lhj0/b;Lhb4/d;Lhf2/d;)V", "state", "Lhf2/c$a;", "w9", "(Lhf2/b;)Lhf2/c$a;", "Ldx/b;", "domainError", "Ljb4/b;", "u9", "(Ldx/b;)Ljb4/b;", "b", "Lif2/e;", "c", "Lif2/b;", "d", "Lac4/a;", "e", "Lhj0/b;", "f", "Lhb4/d;", "g", "Lhf2/d;", "Lhf2/b$b;", "h", "Lhf2/b$b;", "initialState", "Lxw/b;", "Lhf2/a$f;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<hf2.b, hf2.a> implements hf2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final if2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final if2.b errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hj0.b getAddressPointsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hf2.d setupContract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hf2.b.C1941b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hf2.a.f> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hf2.b, hf2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<hf2.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhf2/r$a;", "Lf00/j0;", "Lhf2/d;", "Lhf2/r;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<hf2.d, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<hf2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f84200b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f84202b;

            /* JADX INFO: renamed from: hf2.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1944a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84203d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84204e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84205f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84207h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84208j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84209k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84210l;

                public C1944a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84203d = obj;
                    this.f84204e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f84201a = hVar;
                this.f84202b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1944a c1944a;
                if (eVar instanceof C1944a) {
                    c1944a = (C1944a) eVar;
                    int i15 = c1944a.f84204e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1944a.f84204e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1944a = new C1944a(eVar);
                    }
                } else {
                    c1944a = new C1944a(eVar);
                }
                Object obj2 = c1944a.f84203d;
                Object objE = uq.b.e();
                int i16 = c1944a.f84204e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84201a;
                    hf2.c.a aVarW9 = this.f84202b.w9((hf2.b) obj);
                    c1944a.f84205f = vq.j.a(obj);
                    c1944a.f84207h = vq.j.a(c1944a);
                    c1944a.f84208j = vq.j.a(obj);
                    c1944a.f84209k = vq.j.a(hVar);
                    c1944a.f84210l = 0;
                    c1944a.f84204e = 1;
                    if (hVar.F(aVarW9, c1944a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f84199a = gVar;
            this.f84200b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hf2.c.a> hVar, tq.e eVar) {
            Object objA = this.f84199a.a(new a(hVar, this.f84200b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhf2/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lhf2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<hf2.b.C1941b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f84212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f84213g;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84213g;
            if (i15 == 0) {
                oq.u.b(obj);
                InternetAddressPoint internetAddressPointR0 = r.this.setupContract.R0();
                if (internetAddressPointR0 != null) {
                    xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                    hf2.a.f.c cVar = hf2.a.f.c.f84160a;
                    this.f84211e = vq.j.a(internetAddressPointR0);
                    this.f84212f = 0;
                    this.f84213g = 1;
                    if (bVarY1.F(cVar, this) == objE) {
                        return objE;
                    }
                } else {
                    r.this.d9(hf2.a.e.f84157a);
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(hf2.b.C1941b c1941b, tq.e<? super i0> eVar) {
            return ((c) v(c1941b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhf2/a$e;", "<unused var>", "Lk10/c0;", "Lhf2/b$b;", "state", "Lk10/l;", "Lhf2/b;", "<anonymous>", "(Lhf2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hf2.a.e, c0<hf2.b.C1941b>, tq.e<? super k10.l<? extends hf2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84216f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhf2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hf2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f84218e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f84219f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f84220g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f84221h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f84222j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f84223k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f84224l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f84225m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ r f84226n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0<hf2.b.C1941b> f84227p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<hf2.b.C1941b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f84226n = rVar;
                this.f84227p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hf2.b.Error Z(r rVar, dx.b bVar, hf2.b.C1941b c1941b) {
                return new hf2.b.Error(rVar.errorVMSFactory.a(rVar.u9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hf2.b.Error a0(r rVar, hf2.b.C1941b c1941b) {
                return new hf2.b.Error(rVar.errorVMSFactory.a(rVar.u9(new dx.b.Generic(null, 1, null))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hf2.b.SelectingAlternativeAddress b0(InternetAddressPoints internetAddressPoints, hf2.b.C1941b c1941b) {
                return new hf2.b.SelectingAlternativeAddress(internetAddressPoints.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hf2.b.Error c0(r rVar, hf2.b.C1941b c1941b) {
                return new hf2.b.Error(rVar.errorVMSFactory.a(rVar.u9(new dx.b.Generic(null, 1, null))));
            }

            /* JADX WARN: Code duplicated, block: B:41:0x0127 A[RETURN] */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                AddressData addressDataO;
                final r rVar;
                c0<hf2.b.C1941b> c0Var;
                int i15;
                Object objD;
                c0<hf2.b.C1941b> c0Var2;
                Object objE = uq.b.e();
                int i16 = this.f84225m;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i15 = this.f84222j;
                        addressDataO = (AddressData) this.f84220g;
                        c0Var = (c0) this.f84219f;
                        rVar = (r) this.f84218e;
                        oq.u.b(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var2 = (c0) this.f84218e;
                        oq.u.b(obj);
                    }
                    objD = c0Var2.c();
                    if (objD != null) {
                        return objD;
                    }
                    c0<hf2.b.C1941b> c0Var3 = this.f84227p;
                    final r rVar2 = this.f84226n;
                    return c0Var3.d(new er.l() { // from class: hf2.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.c0(rVar2, (b.C1941b) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                addressDataO = this.f84226n.setupContract.o();
                if (addressDataO != null) {
                    rVar = this.f84226n;
                    c0<hf2.b.C1941b> c0Var4 = this.f84227p;
                    hj0.b bVar = rVar.getAddressPointsUseCase;
                    String strC = st3.c.c(addressDataO);
                    String id5 = addressDataO.getCity().getId();
                    String buildingNumber = addressDataO.getBuildingNumber();
                    AddressTerytDetail street = addressDataO.getStreet();
                    hj0.b.Params params = new hj0.b.Params(strC, id5, buildingNumber, street != null ? street.getId() : null, addressDataO.getApartmentNumber());
                    this.f84218e = rVar;
                    this.f84219f = c0Var4;
                    this.f84220g = vq.j.a(addressDataO);
                    this.f84222j = 0;
                    this.f84225m = 1;
                    Object objC = bVar.c(params, this);
                    if (objC != objE) {
                        c0Var = c0Var4;
                        obj = objC;
                        i15 = 0;
                    }
                    return objE;
                }
                c0<hf2.b.C1941b> c0Var5 = this.f84227p;
                final r rVar3 = this.f84226n;
                return c0Var5.d(new er.l() { // from class: hf2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.a.c0(rVar3, (b.C1941b) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    objD = c0Var.d(new er.l() { // from class: hf2.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.d.a.Z(rVar, bVar2, (b.C1941b) obj2);
                        }
                    });
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final InternetAddressPoints internetAddressPoints = (InternetAddressPoints) ((dx.i.Right) iVar).b();
                    if (internetAddressPoints.getExactMatch() && internetAddressPoints.a().size() > 1) {
                        objD = c0Var.d(new er.l() { // from class: hf2.t
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.d.a.a0(rVar, (b.C1941b) obj2);
                            }
                        });
                    } else {
                        if (internetAddressPoints.getExactMatch()) {
                            rVar.setupContract.d7((InternetAddressPoint) pq.v.l0(internetAddressPoints.a()));
                            xw.b<hf2.a.f> bVarY1 = rVar.Y1();
                            hf2.a.f.c cVar = hf2.a.f.c.f84160a;
                            this.f84218e = c0Var;
                            this.f84219f = vq.j.a(addressDataO);
                            this.f84220g = vq.j.a(iVar);
                            this.f84221h = vq.j.a(internetAddressPoints);
                            this.f84222j = i15;
                            this.f84223k = 0;
                            this.f84224l = 0;
                            this.f84225m = 2;
                            if (bVarY1.F(cVar, this) != objE) {
                                c0Var2 = c0Var;
                                objD = c0Var2.c();
                            }
                            return objE;
                        }
                        objD = c0Var.d(new er.l() { // from class: hf2.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return r.d.a.b0(internetAddressPoints, (b.C1941b) obj2);
                            }
                        });
                    }
                }
                if (objD != null) {
                    return objD;
                }
                c0<hf2.b.C1941b> c0Var6 = this.f84227p;
                final r rVar4 = this.f84226n;
                return c0Var6.d(new er.l() { // from class: hf2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.a.c0(rVar4, (b.C1941b) obj2);
                    }
                });
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f84226n, this.f84227p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hf2.b>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84216f;
            Object objE = uq.b.e();
            int i15 = this.f84215e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f84216f = vq.j.a(c0Var);
            this.f84215e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hf2.a.e eVar, c0<hf2.b.C1941b> c0Var, tq.e<? super k10.l<? extends hf2.b>> eVar2) {
            d dVar = r.this.new d(eVar2);
            dVar.f84216f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhf2/a$d;", "<unused var>", "Lhf2/b$c;", "Loq/i0;", "<anonymous>", "(Lhf2/a$d;Lhf2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hf2.a.d, hf2.b.SelectingAlternativeAddress, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84228e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84228e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                hf2.a.f.d dVar = hf2.a.f.d.f84161a;
                this.f84228e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(hf2.a.d dVar, hf2.b.SelectingAlternativeAddress selectingAlternativeAddress, tq.e<? super i0> eVar) {
            return r.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhf2/a$b;", "action", "Lhf2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhf2/a$b;Lhf2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<hf2.a.BackToEnterAddress, hf2.b.SelectingAlternativeAddress, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84231f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hf2.a.BackToEnterAddress backToEnterAddress = (hf2.a.BackToEnterAddress) this.f84231f;
            Object objE = uq.b.e();
            int i15 = this.f84230e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                hf2.a.f.BackToEnterAddress backToEnterAddress2 = new hf2.a.f.BackToEnterAddress(backToEnterAddress.getAddressForm());
                this.f84231f = vq.j.a(backToEnterAddress);
                this.f84230e = 1;
                if (bVarY1.F(backToEnterAddress2, this) == objE) {
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
        public final Object w(hf2.a.BackToEnterAddress backToEnterAddress, hf2.b.SelectingAlternativeAddress selectingAlternativeAddress, tq.e<? super i0> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f84231f = backToEnterAddress;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhf2/a$a;", "action", "Lhf2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhf2/a$a;Lhf2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<hf2.a.AddressPointSelected, hf2.b.SelectingAlternativeAddress, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84234f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hf2.a.AddressPointSelected addressPointSelected = (hf2.a.AddressPointSelected) this.f84234f;
            Object objE = uq.b.e();
            int i15 = this.f84233e;
            if (i15 == 0) {
                oq.u.b(obj);
                r.this.setupContract.d7(addressPointSelected.getAddressPoint());
                xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                hf2.a.f.e eVar = hf2.a.f.e.f84162a;
                this.f84234f = vq.j.a(addressPointSelected);
                this.f84233e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(hf2.a.AddressPointSelected addressPointSelected, hf2.b.SelectingAlternativeAddress selectingAlternativeAddress, tq.e<? super i0> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f84234f = addressPointSelected;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhf2/a$c;", "<unused var>", "Lhf2/b$a;", "Loq/i0;", "<anonymous>", "(Lhf2/a$c;Lhf2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<hf2.a.c, hf2.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84236e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84236e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                hf2.a.f.b bVar = hf2.a.f.b.f84159a;
                this.f84236e = 1;
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
        public final Object w(hf2.a.c cVar, hf2.b.Error error, tq.e<? super i0> eVar) {
            return r.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhf2/a$g;", "<unused var>", "Lk10/c0;", "Lhf2/b$a;", "state", "Lk10/l;", "Lhf2/b;", "<anonymous>", "(Lhf2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<hf2.a.g, c0<hf2.b.Error>, tq.e<? super k10.l<? extends hf2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84239f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hf2.b.C1941b O(hf2.b.Error error) {
            return hf2.b.C1941b.f84165a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f84239f;
            uq.b.e();
            if (this.f84238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hf2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.i.O((b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hf2.a.g gVar, c0<hf2.b.Error> c0Var, tq.e<? super k10.l<? extends hf2.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f84239f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhf2/a$b;", "action", "Lhf2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhf2/a$b;Lhf2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<hf2.a.BackToEnterAddress, hf2.b.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84241f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hf2.a.BackToEnterAddress backToEnterAddress = (hf2.a.BackToEnterAddress) this.f84241f;
            Object objE = uq.b.e();
            int i15 = this.f84240e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hf2.a.f> bVarY1 = r.this.Y1();
                hf2.a.f.BackToEnterAddress backToEnterAddress2 = new hf2.a.f.BackToEnterAddress(backToEnterAddress.getAddressForm());
                this.f84241f = vq.j.a(backToEnterAddress);
                this.f84240e = 1;
                if (bVarY1.F(backToEnterAddress2, this) == objE) {
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
        public final Object w(hf2.a.BackToEnterAddress backToEnterAddress, hf2.b.Error error, tq.e<? super i0> eVar) {
            j jVar = r.this.new j(eVar);
            jVar.f84241f = backToEnterAddress;
            return jVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, if2.e eVar, if2.b bVar, ac4.a aVar2, hj0.b bVar2, hb4.d dVar, hf2.d dVar2) {
        this.mapper = eVar;
        this.errorMapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getAddressPointsUseCase = bVar2;
        this.errorVMSFactory = dVar;
        this.setupContract = dVar2;
        hf2.b.C1941b c1941b = hf2.b.C1941b.f84165a;
        this.initialState = c1941b;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(c1941b, new er.l() { // from class: hf2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f84188a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(c1941b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(hf2.b.C1941b.class), new er.l() { // from class: hf2.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.B9(this.f84184a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hf2.b.SelectingAlternativeAddress.class), new er.l() { // from class: hf2.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.C9(this.f84185a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hf2.b.Error.class), new er.l() { // from class: hf2.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.D9(this.f84186a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(r rVar, k10.z zVar) {
        zVar.C(rVar.new c(null));
        d dVar = rVar.new d(null);
        zVar.v(q0.c(hf2.a.e.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(r rVar, k10.z zVar) {
        e eVar = rVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hf2.a.d.class), oVar, eVar);
        zVar.x(q0.c(hf2.a.BackToEnterAddress.class), oVar, rVar.new f(null));
        zVar.x(q0.c(hf2.a.AddressPointSelected.class), oVar, rVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(r rVar, k10.z zVar) {
        h hVar = rVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hf2.a.c.class), oVar, hVar);
        zVar.v(q0.c(hf2.a.g.class), oVar, new i(null));
        zVar.x(q0.c(hf2.a.BackToEnterAddress.class), oVar, rVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b u9(dx.b domainError) {
        return this.errorMapper.b(new if2.b.Params(domainError, b9(hf2.a.c.f84155a), b9(hf2.a.g.f84163a), new er.l() { // from class: hf2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f84187a, (AddressFormData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, AddressFormData addressFormData) {
        rVar.d9(new hf2.a.BackToEnterAddress(addressFormData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hf2.c.a w9(hf2.b state) {
        return this.mapper.b(new if2.e.Params(state, new er.l() { // from class: hf2.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f84182a, (AddressFormData) obj);
            }
        }, b9(hf2.a.d.f84156a), new er.l() { // from class: hf2.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f84183a, (InternetAddressPoint) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(r rVar, AddressFormData addressFormData) {
        rVar.d9(new hf2.a.BackToEnterAddress(addressFormData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, InternetAddressPoint internetAddressPoint) {
        rVar.d9(new hf2.a.AddressPointSelected(internetAddressPoint));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hf2.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hf2.b, hf2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hf2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(hf2.c.a aVar) {
        super.P5(aVar);
    }
}
