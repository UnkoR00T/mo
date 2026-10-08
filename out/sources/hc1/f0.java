package hc1;

import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001/B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lhc1/f0;", "Ll00/g;", "Lhc1/l;", "", "Lhc1/m;", "Lyy/a;", "stateMachineFactory", "Ljc1/a;", "mapper", "Lpb1/a;", "validateContactInfoUC", "Lic1/a;", "contract", "<init>", "(Lyy/a;Ljc1/a;Lpb1/a;Lic1/a;)V", "state", "Lhc1/m$a;", "u9", "(Lhc1/l;)Lhc1/m$a;", "b", "Ljc1/a;", "c", "Lpb1/a;", "d", "Lic1/a;", "Lhc1/l$b;", "e", "Lhc1/l$b;", "initialState", "Lxw/b;", "Lhc1/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<hc1.l, Object> implements hc1.m, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jc1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pb1.a validateContactInfoUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ic1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hc1.l.FormDisplayed initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hc1.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hc1.l, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<hc1.m.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhc1/f0$a;", "Lf00/j0;", "Lic1/a;", "Lhc1/f0;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<ic1.a, f0> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<hc1.m.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f83139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f83140b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f83141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0 f83142b;

            /* JADX INFO: renamed from: hc1.f0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1914a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f83143d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f83144e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f83145f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f83147h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f83148j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f83149k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f83150l;

                public C1914a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f83143d = obj;
                    this.f83144e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f0 f0Var) {
                this.f83141a = hVar;
                this.f83142b = f0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1914a c1914a;
                if (eVar instanceof C1914a) {
                    c1914a = (C1914a) eVar;
                    int i15 = c1914a.f83144e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1914a.f83144e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1914a = new C1914a(eVar);
                    }
                } else {
                    c1914a = new C1914a(eVar);
                }
                Object obj2 = c1914a.f83143d;
                Object objE = uq.b.e();
                int i16 = c1914a.f83144e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f83141a;
                    hc1.m.a aVarU9 = this.f83142b.u9((hc1.l) obj);
                    c1914a.f83145f = vq.j.a(obj);
                    c1914a.f83147h = vq.j.a(c1914a);
                    c1914a.f83148j = vq.j.a(obj);
                    c1914a.f83149k = vq.j.a(hVar);
                    c1914a.f83150l = 0;
                    c1914a.f83144e = 1;
                    if (hVar.F(aVarU9, c1914a) == objE) {
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

        public b(mu.g gVar, f0 f0Var) {
            this.f83139a = gVar;
            this.f83140b = f0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super hc1.m.a> hVar, tq.e eVar) {
            Object objA = this.f83139a.a(new a(hVar, this.f83140b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhc1/a;", "<unused var>", "Lhc1/l;", "Loq/i0;", "<anonymous>", "(Lhc1/a;Lhc1/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hc1.a, hc1.l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83151e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f83151e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hc1.b> bVarY1 = f0.this.Y1();
                hc1.b.a aVar = hc1.b.a.f83122a;
                this.f83151e = 1;
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
        public final Object w(hc1.a aVar, hc1.l lVar, tq.e<? super oq.i0> eVar) {
            return f0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/c;", "<unused var>", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<hc1.c, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f83154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f83155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f83156h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(Map map, hc1.l.FormDisplayed formDisplayed) {
            hc1.l.Field<String> fieldE = formDisplayed.e();
            Object objJ = v0.j(map, t0.EMAIL);
            hz.b.Companion companion = hz.b.INSTANCE;
            return hc1.l.FormDisplayed.b(formDisplayed, false, hc1.l.Field.b(fieldE, companion.a((hz.g) objJ), null, 2, null), hc1.l.Field.b(formDisplayed.g(), companion.a((hz.g) v0.j(map, t0.PHONE_NUMBER)), null, 2, null), hc1.l.Field.b(formDisplayed.d(), companion.a((hz.g) v0.j(map, t0.COUNTRY_CODE)), null, 2, null), hc1.l.Field.b(formDisplayed.i(), companion.a((hz.g) v0.j(map, t0.WEBSITE)), null, 2, null), null, null, null, null, null, 993, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x01c3, code lost:
        
            if (r6.F(r7, r19) == r2) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [int] */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 459
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hc1.f0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hc1.c cVar, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            d dVar = f0.this.new d(eVar);
            dVar.f83156h = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhc1/l$b;", "it", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83159f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(ic1.b bVar, boolean z15, hc1.l.FormDisplayed formDisplayed) {
            String email = bVar.getEmail();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            hc1.l.Field field = new hc1.l.Field(c2039b, email);
            hc1.l.Field field2 = new hc1.l.Field(c2039b, bVar.getWebsiteUrl());
            hc1.l.Field field3 = new hc1.l.Field(c2039b, bVar.getPhoneNumber());
            String countryCode = bVar.getCountryCode();
            if (fu.r.t0(countryCode)) {
                countryCode = "+48";
            }
            hc1.l.Field field4 = new hc1.l.Field(c2039b, countryCode);
            hc1.l.Field field5 = new hc1.l.Field(c2039b, Boolean.valueOf(bVar.getCeidgConsent()));
            boolean z16 = false;
            hc1.l.Field field6 = new hc1.l.Field(c2039b, Boolean.valueOf((bVar.getPublishEmailConsent() || z15) && !fu.r.t0(bVar.getEmail())));
            hc1.l.Field field7 = new hc1.l.Field(c2039b, Boolean.valueOf((bVar.getPublishPhoneNumberConsent() || z15) && !fu.r.t0(bVar.getPhoneNumber())));
            if ((bVar.getPublishWebAddressConsent() || z15) && !fu.r.t0(bVar.getWebsiteUrl())) {
                z16 = true;
            }
            return hc1.l.FormDisplayed.b(formDisplayed, false, field, field3, field4, field2, field5, field6, field7, new hc1.l.Field(c2039b, Boolean.valueOf(z16)), null, 513, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83159f;
            uq.b.e();
            if (this.f83158e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final ic1.b bVarN0 = f0.this.contract.N0();
            if (bVarN0 == null) {
                return c0Var.c();
            }
            final boolean z15 = (!f0.this.contract.z4() || !bVarN0.getCeidgConsent() || bVarN0.getPublishEmailConsent() || bVarN0.getPublishPhoneNumberConsent() || bVarN0.getPublishWebAddressConsent()) ? false : true;
            return c0Var.b(new er.l() { // from class: hc1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.e.O(bVarN0, z15, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = f0.this.new e(eVar);
            eVar2.f83159f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/f;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OnEmailChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83163g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnEmailChanged onEmailChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, new hc1.l.Field(null, onEmailChanged.getEmail(), 1, null), null, null, null, null, hc1.l.Field.b(formDisplayed.f(), null, Boolean.valueOf(formDisplayed.f().d().booleanValue() && !fu.r.t0(onEmailChanged.getEmail())), 1, null), null, null, null, 957, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailChanged onEmailChanged = (OnEmailChanged) this.f83162f;
            k10.c0 c0Var = (k10.c0) this.f83163g;
            uq.b.e();
            if (this.f83161e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.f.O(onEmailChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailChanged onEmailChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            f fVar = new f(eVar);
            fVar.f83162f = onEmailChanged;
            fVar.f83163g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/j;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<OnWebsiteChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83166g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnWebsiteChanged onWebsiteChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, null, new hc1.l.Field(null, onWebsiteChanged.getWebsite(), 1, null), null, null, null, hc1.l.Field.b(formDisplayed.j(), null, Boolean.valueOf(formDisplayed.j().d().booleanValue() && !fu.r.t0(onWebsiteChanged.getWebsite())), 1, null), null, 751, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnWebsiteChanged onWebsiteChanged = (OnWebsiteChanged) this.f83165f;
            k10.c0 c0Var = (k10.c0) this.f83166g;
            uq.b.e();
            if (this.f83164e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.g.O(onWebsiteChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnWebsiteChanged onWebsiteChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            g gVar = new g(eVar);
            gVar.f83165f = onWebsiteChanged;
            gVar.f83166g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/h;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<OnPhoneChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83169g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnPhoneChanged onPhoneChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, new hc1.l.Field(null, onPhoneChanged.getPhone(), 1, null), null, null, null, null, hc1.l.Field.b(formDisplayed.h(), null, Boolean.valueOf(formDisplayed.h().d().booleanValue() && !fu.r.t0(onPhoneChanged.getPhone())), 1, null), null, null, 891, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneChanged onPhoneChanged = (OnPhoneChanged) this.f83168f;
            k10.c0 c0Var = (k10.c0) this.f83169g;
            uq.b.e();
            if (this.f83167e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.h.O(onPhoneChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneChanged onPhoneChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            h hVar = new h(eVar);
            hVar.f83168f = onPhoneChanged;
            hVar.f83169g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/e;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<OnCountryCodeChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83171f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83172g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnCountryCodeChanged onCountryCodeChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, new hc1.l.Field(null, onCountryCodeChanged.getCode(), 1, null), null, null, null, null, null, null, 1015, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCountryCodeChanged onCountryCodeChanged = (OnCountryCodeChanged) this.f83171f;
            k10.c0 c0Var = (k10.c0) this.f83172g;
            uq.b.e();
            if (this.f83170e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.i.O(onCountryCodeChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCountryCodeChanged onCountryCodeChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            i iVar = new i(eVar);
            iVar.f83171f = onCountryCodeChanged;
            iVar.f83172g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/d;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<OnCeidgConsentChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83175g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnCeidgConsentChanged onCeidgConsentChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, null, null, new hc1.l.Field(null, Boolean.valueOf(onCeidgConsentChanged.getConsent()), 1, null), null, null, null, null, 991, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnCeidgConsentChanged onCeidgConsentChanged = (OnCeidgConsentChanged) this.f83174f;
            k10.c0 c0Var = (k10.c0) this.f83175g;
            uq.b.e();
            if (this.f83173e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.j.O(onCeidgConsentChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnCeidgConsentChanged onCeidgConsentChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            j jVar = new j(eVar);
            jVar.f83174f = onCeidgConsentChanged;
            jVar.f83175g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/g;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<OnEmailConsentChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83178g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnEmailConsentChanged onEmailConsentChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, null, null, null, new hc1.l.Field(null, Boolean.valueOf(onEmailConsentChanged.getConsent()), 1, null), null, null, null, 959, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnEmailConsentChanged onEmailConsentChanged = (OnEmailConsentChanged) this.f83177f;
            k10.c0 c0Var = (k10.c0) this.f83178g;
            uq.b.e();
            if (this.f83176e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.k.O(onEmailConsentChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnEmailConsentChanged onEmailConsentChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            k kVar = new k(eVar);
            kVar.f83177f = onEmailConsentChanged;
            kVar.f83178g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/i;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OnPhoneConsentChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83181g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnPhoneConsentChanged onPhoneConsentChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, null, null, null, null, new hc1.l.Field(null, Boolean.valueOf(onPhoneConsentChanged.getConsent()), 1, null), null, null, 895, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnPhoneConsentChanged onPhoneConsentChanged = (OnPhoneConsentChanged) this.f83180f;
            k10.c0 c0Var = (k10.c0) this.f83181g;
            uq.b.e();
            if (this.f83179e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.l.O(onPhoneConsentChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnPhoneConsentChanged onPhoneConsentChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            l lVar = new l(eVar);
            lVar.f83180f = onPhoneConsentChanged;
            lVar.f83181g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhc1/k;", "action", "Lk10/c0;", "Lhc1/l$b;", "state", "Lk10/l;", "Lhc1/l;", "<anonymous>", "(Lhc1/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<OnWebsiteConsentChanged, k10.c0<hc1.l.FormDisplayed>, tq.e<? super k10.l<? extends hc1.l>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83184g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hc1.l.FormDisplayed O(OnWebsiteConsentChanged onWebsiteConsentChanged, hc1.l.FormDisplayed formDisplayed) {
            return hc1.l.FormDisplayed.b(formDisplayed, false, null, null, null, null, null, null, null, new hc1.l.Field(null, Boolean.valueOf(onWebsiteConsentChanged.getConsent()), 1, null), null, 767, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnWebsiteConsentChanged onWebsiteConsentChanged = (OnWebsiteConsentChanged) this.f83183f;
            k10.c0 c0Var = (k10.c0) this.f83184g;
            uq.b.e();
            if (this.f83182e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hc1.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.m.O(onWebsiteConsentChanged, (l.FormDisplayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnWebsiteConsentChanged onWebsiteConsentChanged, k10.c0<hc1.l.FormDisplayed> c0Var, tq.e<? super k10.l<? extends hc1.l>> eVar) {
            m mVar = new m(eVar);
            mVar.f83183f = onWebsiteConsentChanged;
            mVar.f83184g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    public f0(yy.a aVar, jc1.a aVar2, pb1.a aVar3, ic1.a aVar4) {
        this.mapper = aVar2;
        this.validateContactInfoUC = aVar3;
        this.contract = aVar4;
        boolean zZ4 = aVar4.z4();
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        hc1.l.Field field = new hc1.l.Field(c2039b, "");
        hc1.l.Field field2 = new hc1.l.Field(c2039b, "");
        hc1.l.Field field3 = new hc1.l.Field(c2039b, "");
        Boolean bool = Boolean.FALSE;
        hc1.l.FormDisplayed formDisplayed = new hc1.l.FormDisplayed(zZ4, field, field3, new hc1.l.Field(c2039b, "+48"), field2, new hc1.l.Field(c2039b, bool), new hc1.l.Field(c2039b, bool), new hc1.l.Field(c2039b, bool), new hc1.l.Field(c2039b, bool), null, 512, null);
        this.initialState = formDisplayed;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(formDisplayed, new er.l() { // from class: hc1.v
            @Override // er.l
            public final Object b(Object obj) {
                return f0.D9(this.f83252a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), u9(formDisplayed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(f0 f0Var, boolean z15) {
        f0Var.d9(new OnEmailConsentChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(f0 f0Var, boolean z15) {
        f0Var.d9(new OnPhoneConsentChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(f0 f0Var, boolean z15) {
        f0Var.d9(new OnWebsiteConsentChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(final f0 f0Var, k10.v vVar) {
        vVar.c(fr.q0.c(hc1.l.class), new er.l() { // from class: hc1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.E9(this.f83128a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hc1.l.FormDisplayed.class), new er.l() { // from class: hc1.e0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.F9(this.f83130a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(f0 f0Var, k10.z zVar) {
        c cVar = f0Var.new c(null);
        zVar.x(fr.q0.c(hc1.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(f0 f0Var, k10.z zVar) {
        zVar.A(f0Var.new e(null));
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(OnEmailChanged.class), oVar, fVar);
        zVar.v(fr.q0.c(OnWebsiteChanged.class), oVar, new g(null));
        zVar.v(fr.q0.c(OnPhoneChanged.class), oVar, new h(null));
        zVar.v(fr.q0.c(OnCountryCodeChanged.class), oVar, new i(null));
        zVar.v(fr.q0.c(OnCeidgConsentChanged.class), oVar, new j(null));
        zVar.v(fr.q0.c(OnEmailConsentChanged.class), oVar, new k(null));
        zVar.v(fr.q0.c(OnPhoneConsentChanged.class), oVar, new l(null));
        zVar.v(fr.q0.c(OnWebsiteConsentChanged.class), oVar, new m(null));
        zVar.v(fr.q0.c(hc1.c.class), oVar, f0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hc1.m.a u9(hc1.l state) {
        return this.mapper.b(new jc1.a.Params(state, new er.l() { // from class: hc1.u
            @Override // er.l
            public final Object b(Object obj) {
                return f0.v9(this.f83251a, (String) obj);
            }
        }, new er.l() { // from class: hc1.w
            @Override // er.l
            public final Object b(Object obj) {
                return f0.w9(this.f83253a, (String) obj);
            }
        }, new er.l() { // from class: hc1.x
            @Override // er.l
            public final Object b(Object obj) {
                return f0.x9(this.f83254a, (String) obj);
            }
        }, new er.l() { // from class: hc1.y
            @Override // er.l
            public final Object b(Object obj) {
                return f0.y9(this.f83255a, (String) obj);
            }
        }, new er.l() { // from class: hc1.z
            @Override // er.l
            public final Object b(Object obj) {
                return f0.z9(this.f83256a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: hc1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.A9(this.f83121a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: hc1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.B9(this.f83124a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: hc1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.C9(this.f83126a, ((Boolean) obj).booleanValue());
            }
        }, b9(hc1.c.f83125a), b9(hc1.a.f83120a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(f0 f0Var, String str) {
        f0Var.d9(new OnEmailChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(f0 f0Var, String str) {
        f0Var.d9(new OnWebsiteChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(f0 f0Var, String str) {
        f0Var.d9(new OnPhoneChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(f0 f0Var, String str) {
        f0Var.d9(new OnCountryCodeChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(f0 f0Var, boolean z15) {
        f0Var.d9(new OnCeidgConsentChanged(z15));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public /* bridge */ void P5(Object obj) {
        super.P5(obj);
    }

    @Override // zx.b
    public xw.b<hc1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hc1.l, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<hc1.m.a> getState() {
        return this.state;
    }
}
