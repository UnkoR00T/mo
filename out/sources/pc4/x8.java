package pc4;

import al0.PassportVisualization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.GroupedPassports;
import uc3.PassportDiplomaticData;
import uc3.PassportRevocationData;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b'\u0010(J/\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00109\u001a\u0002082\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lpc4/x8;", "", "<init>", "()V", "Lal0/a0;", "Luc3/a;", "e", "(Lal0/a0;)Luc3/a;", "Lal0/t0;", "Luc3/h;", "l", "(Lal0/t0;)Luc3/h;", "Lal0/n0;", "Luc3/c;", "g", "(Lal0/n0;)Luc3/c;", "Lal0/p0;", "Luc3/d;", "h", "(Lal0/p0;)Luc3/d;", "Lal0/m0;", "Luc3/b;", "f", "(Lal0/m0;)Luc3/b;", "Lal0/s0;", "Luc3/g;", "k", "(Lal0/s0;)Luc3/g;", "Lal0/r0;", "Luc3/f;", "j", "(Lal0/r0;)Luc3/f;", "Lal0/q0;", "Luc3/e;", "i", "(Lal0/q0;)Luc3/e;", "Lml0/a;", "beFetchPassportsUC", "Ltc3/a;", "b", "(Lml0/a;)Ltc3/a;", "Lp34/a;", "documentsRepository", "Lp34/b;", "updateDocumentWithTimerDataSource", "Lq34/a2;", "updateDocumentTimerDataSourceUC", "Lc54/b;", "isFeatureEnabledUseCase", "Ltc3/b;", "c", "(Lp34/a;Lp34/b;Lq34/a2;Lc54/b;)Ltc3/b;", "Ls64/p;", "isRegisteredAddressFeatureFlagActiveUC", "Ls64/n;", "isPassportDataFeatureFlagActiveUseCase", "Ltc3/c;", "d", "(Ls64/p;Ls64/n;)Ltc3/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x8 f156692a = new x8();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f156694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f156695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f156696d;

        static {
            int[] iArr = new int[al0.m0.values().length];
            try {
                iArr[al0.m0.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al0.m0.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f156693a = iArr;
            int[] iArr2 = new int[al0.s0.values().length];
            try {
                iArr2[al0.s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[al0.s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[al0.s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[al0.s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[al0.s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f156694b = iArr2;
            int[] iArr3 = new int[al0.r0.values().length];
            try {
                iArr3[al0.r0.ISSUED_TO_CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[al0.r0.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[al0.r0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f156695c = iArr3;
            int[] iArr4 = new int[al0.q0.values().length];
            try {
                iArr4[al0.q0.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[al0.q0.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[al0.q0.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[al0.q0.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[al0.q0.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[al0.q0.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[al0.q0.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[al0.q0.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[al0.q0.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[al0.q0.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[al0.q0.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[al0.q0.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[al0.q0.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[al0.q0.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[al0.q0.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[al0.q0.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[al0.q0.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[al0.q0.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[al0.q0.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[al0.q0.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[al0.q0.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[al0.q0.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[al0.q0.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused33) {
            }
            f156696d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pc4/x8$b", "Ltc3/a;", "Ldx/i;", "Ldx/b;", "Luc3/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements tc3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ml0.a f156697a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f156698d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156700f;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156698d = obj;
                this.f156700f |= PKIFailureInfo.systemUnavail;
                return b.this.a(this);
            }
        }

        b(ml0.a aVar) {
            this.f156697a = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // tc3.a
        public Object a(tq.e<? super dx.i<? extends dx.b, GroupedPassports>> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f156700f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f156700f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objC = aVar.f156698d;
            Object objE = uq.b.e();
            int i16 = aVar.f156700f;
            if (i16 == 0) {
                oq.u.b(objC);
                ml0.a aVar2 = this.f156697a;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                aVar.f156700f = 1;
                objC = aVar2.c(c1792a, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return new dx.i.Right(x8.f156692a.e((al0.GroupedPassports) ((dx.i.Right) iVar).b()));
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005H\u0096@¢\u0006\u0004\b\u000f\u0010\tJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005H\u0096@¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"pc4/x8$c", "Ltc3/b;", "", "a", "()Z", "Ldx/i;", "Ldx/b;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "passportsData", "Loq/i0;", "f", "([BLtq/e;)Ljava/lang/Object;", "", "d", "c", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements tc3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f156701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p34.a f156702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p34.b f156703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q34.a2 f156704d;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156705d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156706e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156707f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156708g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156709h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156710j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156711k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156712l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f156713m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156715p;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156713m = obj;
                this.f156715p |= PKIFailureInfo.systemUnavail;
                return c.this.d(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156716d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156717e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156718f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156719g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156720h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156721j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156722k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156723l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f156724m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f156725n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f156727q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156725n = obj;
                this.f156727q |= PKIFailureInfo.systemUnavail;
                return c.this.b(this);
            }
        }

        /* JADX INFO: renamed from: pc4.x8$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3883c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f156728d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f156729e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f156730f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f156731g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f156732h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f156733j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f156734k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f156735l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f156736m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f156737n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f156738p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f156740r;

            C3883c(tq.e<? super C3883c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156738p = obj;
                this.f156740r |= PKIFailureInfo.systemUnavail;
                return c.this.f(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f156741d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f156742e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f156743f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f156744g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f156745h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f156746j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f156747k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f156748l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f156749m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f156751p;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f156749m = obj;
                this.f156751p |= PKIFailureInfo.systemUnavail;
                return c.this.c(this);
            }
        }

        c(c54.b bVar, p34.a aVar, p34.b bVar2, q34.a2 a2Var) {
            this.f156701a = bVar;
            this.f156702b = aVar;
            this.f156703c = bVar2;
            this.f156704d = a2Var;
        }

        @Override // tc3.b
        public boolean a() {
            return this.f156701a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0097 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #4 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x008d, B:31:0x0097, B:32:0x009e, B:33:0x00b2, B:42:0x00d1, B:45:0x00df), top: B:60:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #4 {Exception -> 0x0039, blocks: (B:12:0x0035, B:29:0x008d, B:31:0x0097, B:32:0x009e, B:33:0x00b2, B:42:0x00d1, B:45:0x00df), top: B:60:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.x8$c$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4, types: [p34.a] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // tc3.b
        public Object b(tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
            ?? bVar;
            Object objB;
            ex.b bVar2;
            ex.b bVar3;
            byte[] bArr;
            if (eVar instanceof b) {
                b bVar4 = (b) eVar;
                int i15 = bVar4.f156727q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar4.f156727q = i15 - PKIFailureInfo.systemUnavail;
                    bVar = bVar4;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objU = bVar.f156725n;
            Object objE = uq.b.e();
            int i16 = bVar.f156727q;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) bVar.f156724m;
                        bVar3 = (ex.b) bVar.f156723l;
                        try {
                            oq.u.b(objU);
                            bArr = (byte[]) bVar2.a((dx.i) objU);
                            if (bArr != null) {
                                return new dx.i.Right(bArr);
                            }
                            bVar3.b(new dx.b.Generic(new NoSuchElementException("No passports data found in file")));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objU);
                    c54.b bVar5 = this.f156701a;
                    ?? r15 = this.f156702b;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        if (bVar5.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                            aVar.b(new dx.b.Generic(new UnsupportedOperationException("Wrong getting passports data method")));
                            throw new oq.g();
                        }
                        bVar.f156721j = jVarA;
                        bVar.f156722k = vq.j.a(aVar);
                        bVar.f156723l = aVar;
                        bVar.f156724m = aVar;
                        bVar.f156716d = 0;
                        bVar.f156717e = 0;
                        bVar.f156718f = 0;
                        bVar.f156719g = 0;
                        bVar.f156720h = 0;
                        bVar.f156727q = 1;
                        objU = r15.u(bVar);
                        if (objU == objE) {
                            return objE;
                        }
                        bVar2 = aVar;
                        bVar3 = bVar2;
                        bArr = (byte[]) bVar2.a((dx.i) objU);
                        if (bArr != null) {
                            return new dx.i.Right(bArr);
                        }
                        bVar3.b(new dx.b.Generic(new NoSuchElementException("No passports data found in file")));
                        throw new oq.g();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
                        bVar = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        dx.i iVarA = bVar.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.x8$c$d, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // tc3.b
        public Object c(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? dVar;
            Object objB;
            if (eVar instanceof d) {
                d dVar2 = (d) eVar;
                int i15 = dVar2.f156751p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar2.f156751p = i15 - PKIFailureInfo.systemUnavail;
                    dVar = dVar2;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object obj = dVar.f156749m;
            Object objE = uq.b.e();
            int i16 = dVar.f156751p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(obj);
                        q34.a2 a2Var = this.f156704d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.a2.Params params = new q34.a2.Params("PASSPORTS_DATA");
                            dVar.f156746j = jVarA;
                            dVar.f156747k = vq.j.a(aVar);
                            dVar.f156748l = vq.j.a(aVar);
                            dVar.f156741d = 0;
                            dVar.f156742e = 0;
                            dVar.f156743f = 0;
                            dVar.f156744g = 0;
                            dVar.f156745h = 0;
                            dVar.f156751p = 1;
                            if (a2Var.c(params, dVar) == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            dVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(dVar));
                            dx.i iVarA = dVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(obj);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.x8$c$a, tq.e] */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r8v11, types: [p34.b] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // tc3.b
        public Object d(tq.e<? super dx.i<? extends dx.b, Long>> eVar) throws Throwable {
            ?? aVar;
            Object objB;
            if (eVar instanceof a) {
                a aVar2 = (a) eVar;
                int i15 = aVar2.f156715p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar2.f156715p = i15 - PKIFailureInfo.systemUnavail;
                    aVar = aVar2;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object objB2 = aVar.f156713m;
            Object objE = uq.b.e();
            int i16 = aVar.f156715p;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objB2);
                        ?? r15 = this.f156703c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar3 = new ex.a();
                            aVar.f156710j = jVarA;
                            aVar.f156711k = vq.j.a(aVar3);
                            aVar.f156712l = vq.j.a(aVar3);
                            aVar.f156705d = 0;
                            aVar.f156706e = 0;
                            aVar.f156707f = 0;
                            aVar.f156708g = 0;
                            aVar.f156709h = 0;
                            aVar.f156715p = 1;
                            objB2 = r15.b("PASSPORTS_DATA", aVar);
                            if (objB2 == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            aVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(aVar));
                            dx.i iVarA = aVar.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objB2);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right(vq.b.f(((Number) objB2).longValue()));
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // tc3.b
        public Object f(byte[] bArr, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            C3883c c3883c;
            Object objB;
            ex.b bVar;
            if (eVar instanceof C3883c) {
                c3883c = (C3883c) eVar;
                int i15 = c3883c.f156740r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3883c.f156740r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3883c = new C3883c(eVar);
                }
            } else {
                c3883c = new C3883c(eVar);
            }
            Object objF = c3883c.f156738p;
            ?? E = uq.b.e();
            int i16 = c3883c.f156740r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objF);
                        c54.b bVar2 = this.f156701a;
                        p34.a aVar = this.f156702b;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            if (bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                                aVar2.b(new dx.b.Generic(new UnsupportedOperationException("Wrong saving passports data method")));
                                throw new oq.g();
                            }
                            c3883c.f156728d = vq.j.a(bArr);
                            c3883c.f156729e = jVarA;
                            c3883c.f156730f = vq.j.a(aVar2);
                            c3883c.f156731g = vq.j.a(aVar2);
                            c3883c.f156732h = aVar2;
                            c3883c.f156733j = 0;
                            c3883c.f156734k = 0;
                            c3883c.f156735l = 0;
                            c3883c.f156736m = 0;
                            c3883c.f156737n = 0;
                            c3883c.f156740r = 1;
                            objF = aVar.f(bArr, c3883c);
                            if (objF == E) {
                                return E;
                            }
                            bVar = aVar2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) c3883c.f156732h;
                        try {
                            oq.u.b(objF);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    bVar.a((dx.i) objF);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/x8$d", "Ltc3/c;", "", "a", "()Z", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements tc3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s64.n f156752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s64.p f156753b;

        d(s64.n nVar, s64.p pVar) {
            this.f156752a = nVar;
            this.f156753b = pVar;
        }

        @Override // tc3.c
        public boolean a() {
            return this.f156752a.a(gz.b.a.C1792a.f78542a).booleanValue();
        }
    }

    private x8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupedPassports e(al0.GroupedPassports groupedPassports) {
        List<PassportVisualization> listB = groupedPassports.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(f156692a.l((PassportVisualization) it.next()));
        }
        List<PassportVisualization> listA = groupedPassports.a();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f156692a.l((PassportVisualization) it4.next()));
        }
        return new GroupedPassports(arrayList, arrayList2);
    }

    private final uc3.b f(al0.m0 m0Var) {
        int i15 = a.f156693a[m0Var.ordinal()];
        if (i15 == 1) {
            return uc3.b.POL;
        }
        if (i15 == 2) {
            return uc3.b.UNKNOWN;
        }
        throw new oq.p();
    }

    private final PassportDiplomaticData g(al0.PassportDiplomaticData passportDiplomaticData) {
        return new PassportDiplomaticData(passportDiplomaticData.getTitle(), passportDiplomaticData.getBody(), passportDiplomaticData.getNumber(), passportDiplomaticData.getPersonalizationDate(), passportDiplomaticData.getCityAndDate());
    }

    private final PassportRevocationData h(al0.PassportRevocationData passportRevocationData) {
        fz.b.OffsetDateTime revocationDate = passportRevocationData.getRevocationDate();
        al0.q0 revocationReason = passportRevocationData.getRevocationReason();
        return new PassportRevocationData(revocationDate, revocationReason != null ? i(revocationReason) : null);
    }

    private final uc3.e i(al0.q0 q0Var) {
        switch (a.f156696d[q0Var.ordinal()]) {
            case 1:
                return uc3.e.PERSONALIZATION_ERROR;
            case 2:
                return uc3.e.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return uc3.e.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return uc3.e.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return uc3.e.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return uc3.e.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return uc3.e.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return uc3.e.CITIZEN_REQUEST;
            case 9:
                return uc3.e.OFFICE_REQUEST;
            case 10:
                return uc3.e.INVALID_DATA;
            case 11:
                return uc3.e.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return uc3.e.COMPLIANT;
            case 13:
                return uc3.e.EXPIRED;
            case 14:
                return uc3.e.DAMAGE;
            case 15:
                return uc3.e.LOSS;
            case 16:
                return uc3.e.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return uc3.e.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return uc3.e.TECHNICAL_FAULTS;
            case 19:
                return uc3.e.ISSUING_NEW_PASSPORT;
            case 20:
                return uc3.e.DIED;
            case 21:
                return uc3.e.DATA_CHANGED;
            case 22:
                return uc3.e.DATA_MIGRATION;
            case 23:
                return uc3.e.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    private final uc3.f j(al0.r0 r0Var) {
        int i15 = a.f156695c[r0Var.ordinal()];
        if (i15 == 1) {
            return uc3.f.ISSUED_TO_CITIZEN;
        }
        if (i15 == 2) {
            return uc3.f.REVOKED;
        }
        if (i15 == 3) {
            return uc3.f.UNKNOWN;
        }
        throw new oq.p();
    }

    private final uc3.g k(al0.s0 s0Var) {
        int i15 = a.f156694b[s0Var.ordinal()];
        if (i15 == 1) {
            return uc3.g.BIOMETRIC;
        }
        if (i15 == 2) {
            return uc3.g.TEMPORARY;
        }
        if (i15 == 3) {
            return uc3.g.BUSINESS;
        }
        if (i15 == 4) {
            return uc3.g.DIPLOMATIC;
        }
        if (i15 == 5) {
            return uc3.g.UNKNOWN;
        }
        throw new oq.p();
    }

    private final uc3.PassportVisualization l(PassportVisualization passportVisualization) {
        fz.b.LocalDate birthDate = passportVisualization.getBirthDate();
        String birthPlaceFirstLine = passportVisualization.getBirthPlaceFirstLine();
        String citizenship = passportVisualization.getCitizenship();
        uc3.b bVarF = f(passportVisualization.getCountryCode());
        fz.b.OffsetDateTime executionDate = passportVisualization.getExecutionDate();
        fz.b.LocalDate expiryDate = passportVisualization.getExpiryDate();
        xw.e gender = passportVisualization.getGender();
        iy.b0 id5 = passportVisualization.getId();
        fz.b.OffsetDateTime issueDate = passportVisualization.getIssueDate();
        String issuerNameFirstLine = passportVisualization.getIssuerNameFirstLine();
        iy.b0 nameFirstLine = passportVisualization.getNameFirstLine();
        iy.b0 number = passportVisualization.getNumber();
        iy.b0 pesel = passportVisualization.getPesel();
        uc3.f fVarJ = j(passportVisualization.getStatus());
        iy.b0 surnameFirstLine = passportVisualization.getSurnameFirstLine();
        uc3.g gVarK = k(passportVisualization.getType());
        String birthPlaceSecondLine = passportVisualization.getBirthPlaceSecondLine();
        String issuerNameSecondLine = passportVisualization.getIssuerNameSecondLine();
        iy.b0 nameSecondLine = passportVisualization.getNameSecondLine();
        iy.b0 surnameSecondLine = passportVisualization.getSurnameSecondLine();
        List<al0.PassportDiplomaticData> listF = passportVisualization.f();
        ArrayList arrayList = new ArrayList(pq.v.y(listF, 10));
        for (Iterator it = listF.iterator(); it.hasNext(); it = it) {
            arrayList.add(f156692a.g((al0.PassportDiplomaticData) it.next()));
        }
        al0.PassportRevocationData revocationData = passportVisualization.getRevocationData();
        return new uc3.PassportVisualization(birthDate, birthPlaceFirstLine, citizenship, bVarF, executionDate, expiryDate, gender, id5, issueDate, issuerNameFirstLine, nameFirstLine, number, pesel, fVarJ, surnameFirstLine, gVarK, birthPlaceSecondLine, issuerNameSecondLine, nameSecondLine, surnameSecondLine, arrayList, revocationData != null ? h(revocationData) : null);
    }

    public final tc3.a b(ml0.a beFetchPassportsUC) {
        return new b(beFetchPassportsUC);
    }

    public final tc3.b c(p34.a documentsRepository, p34.b updateDocumentWithTimerDataSource, q34.a2 updateDocumentTimerDataSourceUC, c54.b isFeatureEnabledUseCase) {
        return new c(isFeatureEnabledUseCase, documentsRepository, updateDocumentWithTimerDataSource, updateDocumentTimerDataSourceUC);
    }

    public final tc3.c d(s64.p isRegisteredAddressFeatureFlagActiveUC, s64.n isPassportDataFeatureFlagActiveUseCase) {
        return new d(isPassportDataFeatureFlagActiveUseCase, isRegisteredAddressFeatureFlagActiveUC);
    }
}
