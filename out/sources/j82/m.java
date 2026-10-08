package j82;

import fp0.ApplicantDetails;
import fr.q0;
import iy.b0;
import java.util.Iterator;
import java.util.Map;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;
import z72.RdkApplicantDetails;
import z72.UserDocumentData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lj82/m;", "Ll00/g;", "Lj82/b;", "Lj82/a;", "Lj82/c;", "", "Lyy/a;", "stateMachineFactory", "Le82/l;", "userDataUseCase", "Lf82/a;", "getRdkApplicantUC", "Ll82/e;", "applicantDetailsMapper", "Lf82/b;", "validateApplicantDetailsUC", "Lk82/a;", "contract", "<init>", "(Lyy/a;Le82/l;Lf82/a;Ll82/e;Lf82/b;Lk82/a;)V", "b", "Le82/l;", "c", "Lf82/a;", "d", "Ll82/e;", "e", "Lf82/b;", "f", "Lk82/a;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lj82/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lj82/c$a;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<j82.b, j82.a> implements j82.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e82.l userDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f82.a getRdkApplicantUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l82.e applicantDetailsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f82.b validateApplicantDetailsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k82.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<j82.b, j82.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j82.a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<j82.c.a> state = a9(new a(e9().getState(), this), j82.c.a.C2349a.f100201a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<j82.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f100238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f100239b;

        /* JADX INFO: renamed from: j82.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2351a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f100240a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f100241b;

            /* JADX INFO: renamed from: j82.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2352a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f100242d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f100243e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f100244f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f100246h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f100247j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f100248k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f100249l;

                public C2352a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f100242d = obj;
                    this.f100243e |= PKIFailureInfo.systemUnavail;
                    return C2351a.this.F(null, this);
                }
            }

            public C2351a(mu.h hVar, m mVar) {
                this.f100240a = hVar;
                this.f100241b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2352a c2352a;
                if (eVar instanceof C2352a) {
                    c2352a = (C2352a) eVar;
                    int i15 = c2352a.f100243e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2352a.f100243e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2352a = new C2352a(eVar);
                    }
                } else {
                    c2352a = new C2352a(eVar);
                }
                Object obj2 = c2352a.f100242d;
                Object objE = uq.b.e();
                int i16 = c2352a.f100243e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f100240a;
                    j82.c.a aVarB = this.f100241b.applicantDetailsMapper.b(new l82.e.Params((j82.b) obj, this.f100241b.new b(), this.f100241b.new c(), this.f100241b.new d(), this.f100241b.new e(), this.f100241b.b9(j82.a.h.f100188a), this.f100241b.b9(j82.a.c.f100179a)));
                    c2352a.f100244f = vq.j.a(obj);
                    c2352a.f100246h = vq.j.a(c2352a);
                    c2352a.f100247j = vq.j.a(obj);
                    c2352a.f100248k = vq.j.a(hVar);
                    c2352a.f100249l = 0;
                    c2352a.f100243e = 1;
                    if (hVar.F(aVarB, c2352a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f100238a = gVar;
            this.f100239b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j82.c.a> hVar, tq.e eVar) {
            Object objA = this.f100238a.a(new C2351a(hVar, this.f100239b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<b0, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new j82.a.OnFullNameChanged(b0Var));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<b0, i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new j82.a.OnAddressChanged(b0Var));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<b0, i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new j82.a.OnEmailChanged(b0Var));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<b0, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            m.this.d9(new j82.a.OnPhoneNumberChanged(b0Var));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj82/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lj82/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<j82.b.C2348b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100254e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f100254e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(j82.a.C2346a.f100177a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(j82.b.C2348b c2348b, tq.e<? super i0> eVar) {
            return ((f) v(c2348b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$a;", "<unused var>", "Lk10/c0;", "Lj82/b$b;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<j82.a.C2346a, c0<j82.b.C2348b>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100259h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f100260j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ z<j82.b.C2348b, j82.b, j82.a> f100262l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(z<j82.b.C2348b, j82.b, j82.a> zVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f100262l = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized V(ApplicantDetails applicantDetails, j82.b.C2348b c2348b) {
            return new j82.b.Initialized(applicantDetails.getFullName(), null, null, null, applicantDetails.getEmail(), null, applicantDetails.getPhoneNumber(), null, null, 430, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized X(UserDocumentData userDocumentData, RdkApplicantDetails rdkApplicantDetails, j82.b.C2348b c2348b) {
            b0 b0VarA;
            b0 b0VarA2;
            b0 b0VarA3 = z72.d.a(userDocumentData);
            if (rdkApplicantDetails == null || (b0VarA = rdkApplicantDetails.getEmail()) == null) {
                b0VarA = b0.INSTANCE.a();
            }
            b0 b0Var = b0VarA;
            if (rdkApplicantDetails == null || (b0VarA2 = rdkApplicantDetails.getPhoneNumber()) == null) {
                b0VarA2 = b0.INSTANCE.a();
            }
            return new j82.b.Initialized(b0VarA3, null, null, null, b0Var, null, b0VarA2, null, null, 430, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0084  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarD;
            final RdkApplicantDetails rdkApplicantDetails;
            z<j82.b.C2348b, j82.b, j82.a> zVar;
            c0 c0Var = (c0) this.f100260j;
            Object objE = uq.b.e();
            int i15 = this.f100259h;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rdkApplicantDetails = (RdkApplicantDetails) this.f100257f;
                    zVar = (z) this.f100256e;
                    oq.u.b(obj);
                }
                final UserDocumentData userDocumentData = (UserDocumentData) obj;
                if (rdkApplicantDetails == null) {
                    px.f.e(px.f.f163100a, "error, failed to retrieve data from Rejestr Danych Kontaktowych", null, px.c.a(zVar), 2, null);
                }
                return c0Var.d(new er.l() { // from class: j82.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.g.X(userDocumentData, rdkApplicantDetails, (b.C2348b) obj2);
                    }
                });
            }
            oq.u.b(obj);
            final ApplicantDetails applicantDetailsZ5 = m.this.contract.Z5();
            if (applicantDetailsZ5 != null && (lVarD = c0Var.d(new er.l() { // from class: j82.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.g.V(applicantDetailsZ5, (b.C2348b) obj2);
                }
            })) != null) {
                return lVarD;
            }
            f82.a aVar = m.this.getRdkApplicantUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            this.f100260j = c0Var;
            this.f100259h = 1;
            obj = aVar.a(c1792a, this);
            if (obj != objE) {
            }
            return objE;
            Object objA = ((dx.i) obj).a();
            m mVar = m.this;
            z<j82.b.C2348b, j82.b, j82.a> zVar2 = this.f100262l;
            RdkApplicantDetails rdkApplicantDetails2 = (RdkApplicantDetails) objA;
            e82.l lVar = mVar.userDataUseCase;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            this.f100260j = c0Var;
            this.f100256e = zVar2;
            this.f100257f = rdkApplicantDetails2;
            this.f100258g = 0;
            this.f100259h = 2;
            Object objA2 = lVar.a(c1792a2, this);
            if (objA2 != objE) {
                rdkApplicantDetails = rdkApplicantDetails2;
                obj = objA2;
                zVar = zVar2;
                final UserDocumentData userDocumentData2 = (UserDocumentData) obj;
                if (rdkApplicantDetails == null) {
                    px.f.e(px.f.f163100a, "error, failed to retrieve data from Rejestr Danych Kontaktowych", null, px.c.a(zVar), 2, null);
                }
                return c0Var.d(new er.l() { // from class: j82.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.g.X(userDocumentData2, rdkApplicantDetails, (b.C2348b) obj2);
                    }
                });
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.C2346a c2346a, c0<j82.b.C2348b> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            g gVar = m.this.new g(this.f100262l, eVar);
            gVar.f100260j = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj82/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lj82/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<j82.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100263e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f100263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ApplicantDetails applicantDetailsZ5 = m.this.contract.Z5();
            if (applicantDetailsZ5 != null) {
                m.this.d9(new j82.a.SetUpApplicantDetailsAction(applicantDetailsZ5));
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(j82.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((h) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$f;", "action", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<j82.a.OnFullNameChanged, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100267g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.a.OnFullNameChanged onFullNameChanged, j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, onFullNameChanged.getFullName(), hz.b.d.f86848c, null, null, null, null, null, null, null, 508, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j82.a.OnFullNameChanged onFullNameChanged = (j82.a.OnFullNameChanged) this.f100266f;
            c0 c0Var = (c0) this.f100267g;
            uq.b.e();
            if (this.f100265e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.i.O(onFullNameChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.OnFullNameChanged onFullNameChanged, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f100266f = onFullNameChanged;
            iVar.f100267g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$d;", "action", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<j82.a.OnAddressChanged, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100270g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.a.OnAddressChanged onAddressChanged, j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, null, null, onAddressChanged.getAddress(), hz.b.d.f86848c, null, null, null, null, null, 499, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j82.a.OnAddressChanged onAddressChanged = (j82.a.OnAddressChanged) this.f100269f;
            c0 c0Var = (c0) this.f100270g;
            uq.b.e();
            if (this.f100268e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.j.O(onAddressChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.OnAddressChanged onAddressChanged, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f100269f = onAddressChanged;
            jVar.f100270g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$e;", "action", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<j82.a.OnEmailChanged, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100272f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100273g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.a.OnEmailChanged onEmailChanged, j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, null, null, null, null, onEmailChanged.getEmail(), hz.b.d.f86848c, null, null, null, 463, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j82.a.OnEmailChanged onEmailChanged = (j82.a.OnEmailChanged) this.f100272f;
            c0 c0Var = (c0) this.f100273g;
            uq.b.e();
            if (this.f100271e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.k.O(onEmailChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.OnEmailChanged onEmailChanged, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f100272f = onEmailChanged;
            kVar.f100273g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$g;", "action", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<j82.a.OnPhoneNumberChanged, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100276g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.a.OnPhoneNumberChanged onPhoneNumberChanged, j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, null, null, null, null, null, null, onPhoneNumberChanged.getPhoneNumber(), hz.b.d.f86848c, null, 319, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j82.a.OnPhoneNumberChanged onPhoneNumberChanged = (j82.a.OnPhoneNumberChanged) this.f100275f;
            c0 c0Var = (c0) this.f100276g;
            uq.b.e();
            if (this.f100274e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.l.O(onPhoneNumberChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.OnPhoneNumberChanged onPhoneNumberChanged, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f100275f = onPhoneNumberChanged;
            lVar.f100276g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: j82.m$m, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$h;", "<unused var>", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C2353m extends vq.k implements er.q<j82.a.h, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100278f;

        C2353m(tq.e<? super C2353m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, null, null, null, null, null, null, null, null, null, GF2Field.MASK, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f100278f;
            uq.b.e();
            if (this.f100277e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.C2353m.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.h hVar, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            C2353m c2353m = new C2353m(eVar);
            c2353m.f100278f = c0Var;
            return c2353m.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$c;", "<unused var>", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<j82.a.c, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100279e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f100281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100282h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f100283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f100284k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f100285l;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(Map map, j82.b.Initialized initialized) {
            Object next;
            hz.b bVarA = ((hz.g) v0.j(map, z72.a.NAME_AND_SURNAME)).a();
            hz.b bVarA2 = ((hz.g) v0.j(map, z72.a.ADDRESS)).a();
            hz.b bVarA3 = ((hz.g) v0.j(map, z72.a.EMAIL)).a();
            hz.b bVarA4 = ((hz.g) v0.j(map, z72.a.PHONE_NUMBER)).a();
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Map.Entry) next).getValue() instanceof hz.g.Invalid));
            Map.Entry entry = (Map.Entry) next;
            return j82.b.Initialized.b(initialized, null, bVarA, null, bVarA2, null, bVarA3, null, bVarA4, entry != null ? (z72.a) entry.getKey() : null, 85, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f100285l;
            Object objE = uq.b.e();
            int i15 = this.f100284k;
            if (i15 == 0) {
                oq.u.b(obj);
                f82.b bVar = m.this.validateApplicantDetailsUC;
                j82.b.Initialized initialized = (j82.b.Initialized) c0Var.a();
                f82.b.Params params = new f82.b.Params(initialized.getFullName(), initialized.getAddress(), initialized.getEmail(), initialized.getPhoneNumber());
                this.f100285l = c0Var;
                this.f100284k = 1;
                obj = bVar.d(params, this);
                if (obj != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f100280f;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            m mVar = m.this;
            final Map map = (Map) obj;
            if (!map.isEmpty()) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() instanceof hz.g.Invalid) {
                        return c0Var.b(new er.l() { // from class: j82.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.n.O(map, (b.Initialized) obj2);
                            }
                        });
                    }
                }
            }
            k10.l lVarC = c0Var.c();
            k82.a aVar = mVar.contract;
            j82.b.Initialized initialized2 = (j82.b.Initialized) c0Var.a();
            aVar.d3(new ApplicantDetails(initialized2.getFullName(), initialized2.getAddress(), initialized2.getEmail(), initialized2.getPhoneNumber()));
            j82.a.b.C2347a c2347a = j82.a.b.C2347a.f100178a;
            this.f100285l = vq.j.a(c0Var);
            this.f100279e = vq.j.a(map);
            this.f100280f = lVarC;
            this.f100281g = vq.j.a(lVarC);
            this.f100282h = 0;
            this.f100283j = 0;
            this.f100284k = 2;
            return mVar.F(c2347a, this) == objE ? objE : lVarC;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.c cVar, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            n nVar = m.this.new n(eVar);
            nVar.f100285l = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj82/a$i;", "action", "Lk10/c0;", "Lj82/b$a;", "state", "Lk10/l;", "Lj82/b;", "<anonymous>", "(Lj82/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<j82.a.SetUpApplicantDetailsAction, c0<j82.b.Initialized>, tq.e<? super k10.l<? extends j82.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f100287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f100288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f100289g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j82.b.Initialized O(j82.a.SetUpApplicantDetailsAction setUpApplicantDetailsAction, j82.b.Initialized initialized) {
            return j82.b.Initialized.b(initialized, fu.r.t0(iy.c0.e(setUpApplicantDetailsAction.getApplicantDetails().getFullName())) ? initialized.getFullName() : setUpApplicantDetailsAction.getApplicantDetails().getFullName(), null, setUpApplicantDetailsAction.getApplicantDetails().getAddress(), null, setUpApplicantDetailsAction.getApplicantDetails().getEmail(), null, setUpApplicantDetailsAction.getApplicantDetails().getPhoneNumber(), null, null, 426, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final j82.a.SetUpApplicantDetailsAction setUpApplicantDetailsAction = (j82.a.SetUpApplicantDetailsAction) this.f100288f;
            c0 c0Var = (c0) this.f100289g;
            uq.b.e();
            if (this.f100287e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: j82.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.o.O(setUpApplicantDetailsAction, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(j82.a.SetUpApplicantDetailsAction setUpApplicantDetailsAction, c0<j82.b.Initialized> c0Var, tq.e<? super k10.l<? extends j82.b>> eVar) {
            o oVar = new o(eVar);
            oVar.f100288f = setUpApplicantDetailsAction;
            oVar.f100289g = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, e82.l lVar, f82.a aVar2, l82.e eVar, f82.b bVar, k82.a aVar3) {
        this.userDataUseCase = lVar;
        this.getRdkApplicantUC = aVar2;
        this.applicantDetailsMapper = eVar;
        this.validateApplicantDetailsUC = bVar;
        this.contract = aVar3;
        this.stateMachine = aVar.a(j82.b.C2348b.f100200a, new er.l() { // from class: j82.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f100229a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(j82.b.C2348b.class), new er.l() { // from class: j82.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f100227a, (z) obj);
            }
        });
        vVar.c(q0.c(j82.b.Initialized.class), new er.l() { // from class: j82.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.u9(this.f100228a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(m mVar, z zVar) {
        zVar.C(mVar.new f(null));
        g gVar = mVar.new g(zVar, null);
        zVar.v(q0.c(j82.a.C2346a.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(m mVar, z zVar) {
        zVar.C(mVar.new h(null));
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(j82.a.OnFullNameChanged.class), oVar, iVar);
        zVar.v(q0.c(j82.a.OnAddressChanged.class), oVar, new j(null));
        zVar.v(q0.c(j82.a.OnEmailChanged.class), oVar, new k(null));
        zVar.v(q0.c(j82.a.OnPhoneNumberChanged.class), oVar, new l(null));
        zVar.v(q0.c(j82.a.h.class), oVar, new C2353m(null));
        zVar.v(q0.c(j82.a.c.class), oVar, mVar.new n(null));
        zVar.v(q0.c(j82.a.SetUpApplicantDetailsAction.class), oVar, new o(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<j82.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<j82.b, j82.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j82.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(j82.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(k82.a aVar) {
        super.P5(aVar);
    }
}
