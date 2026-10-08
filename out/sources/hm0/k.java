package hm0;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import al0.BankRestrictionsSettings;
import al0.PhysicalIdCardRestrictions;
import dl0.BEBankRestrictionDrivingLicence;
import gm0.BankRestrictionDrivingLicenceResponse;
import gm0.BankRestrictionPassportDocumentRestrictionDto;
import gm0.BankRestrictionPassportDto;
import gm0.BankRestrictionsSettingsDto;
import gm0.PhysicalIdCardRestrictionsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\bH\u0096@¢\u0006\u0004\b\u0014\u0010\fJ\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\bH\u0096@¢\u0006\u0004\b\u0017\u0010\fJ$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0018\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001a\u0010\u0011J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\bH\u0096@¢\u0006\u0004\b\u001c\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lhm0/k;", "Lpm0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lal0/v0;", "d", "(Ltq/e;)Ljava/lang/Object;", "", "documentId", "Loq/i0;", "f", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "g", "Lal0/r;", "b", "", "Lal0/o;", "e", "passportId", "Lal0/p;", "h", "Ldl0/a;", "c", "a", "Lpl/gov/coi/common/network/g0;", "Lwl0/a;", "Loq/k;", "k", "()Lwl0/a;", "client", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements pm0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85455d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85457f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85455d = obj;
            this.f85457f |= PKIFailureInfo.systemUnavail;
            return k.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<BankRestrictionsSettingsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85458e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85458e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            this.f85458e = 1;
            Object objB = aVarK.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<BankRestrictionsSettingsDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85460d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85462f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85460d = obj;
            this.f85462f |= PKIFailureInfo.systemUnavail;
            return k.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<BankRestrictionDrivingLicenceResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85463e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85463e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            this.f85463e = 1;
            Object objC = aVarK.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<BankRestrictionDrivingLicenceResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85466e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85468g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85466e = obj;
            this.f85468g |= PKIFailureInfo.systemUnavail;
            return k.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/m;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<BankRestrictionPassportDocumentRestrictionDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85469e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f85471g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85469e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            String str = this.f85471g;
            this.f85469e = 1;
            Object objD = aVarK.d(str, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new f(this.f85471g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<BankRestrictionPassportDocumentRestrictionDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85472d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85474f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85472d = obj;
            this.f85474f |= PKIFailureInfo.systemUnavail;
            return k.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lgm0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super ge4.x<List<? extends BankRestrictionPassportDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85475e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85475e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            this.f85475e = 1;
            Object objE2 = aVarK.e(this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<List<BankRestrictionPassportDto>>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85477d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85479f;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85477d = obj;
            this.f85479f |= PKIFailureInfo.systemUnavail;
            return k.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/m6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardRestrictionsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85480e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85480e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            this.f85480e = 1;
            Object objA = aVarK.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardRestrictionsDto>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: hm0.k$k, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1991k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85483e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85485g;

        C1991k(tq.e<? super C1991k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85483e = obj;
            this.f85485g |= PKIFailureInfo.systemUnavail;
            return k.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85486e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85488g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f85488g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85486e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            String str = this.f85488g;
            this.f85486e = 1;
            Object objF = aVarK.f(str, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new l(this.f85488g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85490e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85492g;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85490e = obj;
            this.f85492g |= PKIFailureInfo.systemUnavail;
            return k.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85493e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f85495g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f85495g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85493e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.a aVarK = k.this.k();
            String str = this.f85495g;
            this.f85493e = 1;
            Object objG = aVarK.g(str, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new n(this.f85495g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    public k(final pl.gov.coi.common.network.w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: hm0.j
            @Override // er.a
            public final Object a() {
                return k.j(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.a j(pl.gov.coi.common.network.w wVar) {
        return (wl0.a) pl.gov.coi.common.network.w.b(wVar, null, wl0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.a k() {
        return (wl0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object b(tq.e<? super dx.i<? extends dx.b, BankRestrictionsSettings>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85457f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85457f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85455d;
        Object objE = uq.b.e();
        int i16 = aVar.f85457f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f85457f = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xl0.d.e((BankRestrictionsSettingsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object c(tq.e<? super dx.i<? extends dx.b, BEBankRestrictionDrivingLicence>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85462f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85462f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85460d;
        Object objE = uq.b.e();
        int i16 = cVar.f85462f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f85462f = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xl0.d.k((BankRestrictionDrivingLicenceResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object d(tq.e<? super dx.i<? extends dx.b, PhysicalIdCardRestrictions>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f85479f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f85479f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f85477d;
        Object objE = uq.b.e();
        int i16 = iVar.f85479f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(null);
            iVar.f85479f = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (iVar2 instanceof dx.i.Right) {
            return new dx.i.Right(xl0.d.j((PhysicalIdCardRestrictionsDto) ((dx.i.Right) iVar2).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<BankRestrictionPassport>>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f85474f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f85474f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f85472d;
        Object objE = uq.b.e();
        int i16 = gVar.f85474f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f85474f = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xl0.d.b((BankRestrictionPassportDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object f(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        C1991k c1991k;
        if (eVar instanceof C1991k) {
            c1991k = (C1991k) eVar;
            int i15 = c1991k.f85485g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1991k.f85485g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1991k = new C1991k(eVar);
            }
        } else {
            c1991k = new C1991k(eVar);
        }
        Object objB = c1991k.f85483e;
        Object objE = uq.b.e();
        int i16 = c1991k.f85485g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(str, null);
            c1991k.f85482d = vq.j.a(str);
            c1991k.f85485g = 1;
            objB = g0Var.b(lVar, c1991k);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object g(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f85492g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f85492g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f85490e;
        Object objE = uq.b.e();
        int i16 = mVar.f85492g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(str, null);
            mVar.f85489d = vq.j.a(str);
            mVar.f85492g = 1;
            objB = g0Var.b(nVar, mVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            return bVar instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.e
    public Object h(String str, tq.e<? super dx.i<? extends dx.b, BankRestrictionPassportDocumentRestriction>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f85468g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f85468g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f85466e;
        Object objE = uq.b.e();
        int i16 = eVar2.f85468g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f85465d = vq.j.a(str);
            eVar2.f85468g = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(xl0.d.c((BankRestrictionPassportDocumentRestrictionDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
