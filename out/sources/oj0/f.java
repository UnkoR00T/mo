package oj0;

import ge4.x;
import iy.b0;
import iy.c0;
import nj0.ContactDetailDto;
import nj0.ContactDetailsConfirmationDto;
import nj0.ContactDetailsDto;
import nj0.EmailContactDetailRequestDto;
import nj0.EmailContactDetailsConfirmationRequestDto;
import nj0.PhoneContactDetailRequestDto;
import nj0.PhoneContactDetailsConfirmationRequestDto;
import nj0.WkAuthenticatedRequestDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import xi0.ContactDetail;
import xi0.ContactDetails;
import xi0.ContactDetailsConfirmation;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!0\u000eH\u0096@¢\u0006\u0004\b\"\u0010#J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b$\u0010\u0019J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Loj0/f;", "Lrj0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "code", "Liy/b0;", "email", "Lny/a;", "wkToken", "Ldx/i;", "Ldx/b;", "Lxi0/f;", "f", "(Ljava/lang/String;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "phoneNumber", "prefix", "c", "(Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lxi0/a;", "h", "(Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lxw/h;", "i", "(Lxw/h;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "Lxi0/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "g", "e", "Lpl/gov/coi/common/network/g0;", "Llj0/b;", "Loq/k;", "m", "()Llj0/b;", "client", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements rj0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f146118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146119g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f146121j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146119g = obj;
            this.f146121j |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<ContactDetailsConfirmationDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146122e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146125h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f146126j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, b0 b0Var, b0 b0Var2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f146124g = str;
            this.f146125h = b0Var;
            this.f146126j = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146122e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            EmailContactDetailsConfirmationRequestDto emailContactDetailsConfirmationRequestDto = new EmailContactDetailsConfirmationRequestDto(this.f146124g, c0.e(this.f146125h), c0.e(this.f146126j));
            this.f146122e = 1;
            Object objG = bVarM.g(emailContactDetailsConfirmationRequestDto, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(this.f146124g, this.f146125h, this.f146126j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailsConfirmationDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f146129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f146130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f146131h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f146133k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146131h = obj;
            this.f146133k |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<ContactDetailsConfirmationDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146134e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146137h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f146138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ b0 f146139k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f146136g = str;
            this.f146137h = b0Var;
            this.f146138j = b0Var2;
            this.f146139k = b0Var3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146134e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            PhoneContactDetailsConfirmationRequestDto phoneContactDetailsConfirmationRequestDto = new PhoneContactDetailsConfirmationRequestDto(this.f146136g, c0.e(this.f146137h), c0.e(this.f146138j), c0.e(this.f146139k));
            this.f146134e = 1;
            Object objF = bVarM.f(phoneContactDetailsConfirmationRequestDto, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f146136g, this.f146137h, this.f146138j, this.f146139k, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailsConfirmationDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146142f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146144h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146142f = obj;
            this.f146144h |= PKIFailureInfo.systemUnavail;
            return f.this.h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: oj0.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3635f extends vq.k implements er.l<tq.e<? super x<ContactDetailDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146145e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f146147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146148h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3635f(b0 b0Var, b0 b0Var2, tq.e<? super C3635f> eVar) {
            super(1, eVar);
            this.f146147g = b0Var;
            this.f146148h = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146145e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            EmailContactDetailRequestDto emailContactDetailRequestDto = new EmailContactDetailRequestDto(c0.e(this.f146147g), c0.e(this.f146148h));
            this.f146145e = 1;
            Object objH = bVarM.h(emailContactDetailRequestDto, this);
            return objH == objE ? objE : objH;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new C3635f(this.f146147g, this.f146148h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailDto>> eVar) {
            return ((C3635f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146151f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146153h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146151f = obj;
            this.f146153h |= PKIFailureInfo.systemUnavail;
            return f.this.i(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<ContactDetailDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146154e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PhoneNumber f146156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146157h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f146156g = phoneNumber;
            this.f146157h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146154e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            PhoneContactDetailRequestDto phoneContactDetailRequestDto = new PhoneContactDetailRequestDto(c0.e(this.f146156g.g()), c0.e(this.f146156g.h()), c0.e(this.f146157h));
            this.f146154e = 1;
            Object objI = bVarM.i(phoneContactDetailRequestDto, this);
            return objI == objE ? objE : objI;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new h(this.f146156g, this.f146157h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146158e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f146160g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b0 b0Var, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f146160g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146158e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            WkAuthenticatedRequestDto wkAuthenticatedRequestDtoH = mj0.e.h(this.f146160g);
            this.f146158e = 1;
            Object objE2 = bVarM.e(wkAuthenticatedRequestDtoH, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new i(this.f146160g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146161e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f146163g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(b0 b0Var, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f146163g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146161e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            WkAuthenticatedRequestDto wkAuthenticatedRequestDtoH = mj0.e.h(this.f146163g);
            this.f146161e = 1;
            Object objD = bVarM.d(wkAuthenticatedRequestDtoH, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new j(this.f146163g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146164d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146166f;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146164d = obj;
            this.f146166f |= PKIFailureInfo.systemUnavail;
            return f.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/m;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<ContactDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146167e;

        l(tq.e<? super l> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146167e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            this.f146167e = 1;
            Object objA = bVarM.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new l(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailsDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146171f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146173h;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146171f = obj;
            this.f146173h |= PKIFailureInfo.systemUnavail;
            return f.this.g(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<ContactDetailDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146174e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f146176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146177h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b0 b0Var, b0 b0Var2, tq.e<? super n> eVar) {
            super(1, eVar);
            this.f146176g = b0Var;
            this.f146177h = b0Var2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146174e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            EmailContactDetailRequestDto emailContactDetailRequestDto = new EmailContactDetailRequestDto(c0.e(this.f146176g), c0.e(this.f146177h));
            this.f146174e = 1;
            Object objC = bVarM.c(emailContactDetailRequestDto, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new n(this.f146176g, this.f146177h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailDto>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146180f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146182h;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146180f = obj;
            this.f146182h |= PKIFailureInfo.systemUnavail;
            return f.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super x<ContactDetailDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146183e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PhoneNumber f146185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146186h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super p> eVar) {
            super(1, eVar);
            this.f146185g = phoneNumber;
            this.f146186h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146183e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.b bVarM = f.this.m();
            PhoneContactDetailRequestDto phoneContactDetailRequestDto = new PhoneContactDetailRequestDto(c0.e(this.f146185g.g()), c0.e(this.f146185g.h()), c0.e(this.f146186h));
            this.f146183e = 1;
            Object objB = bVarM.b(phoneContactDetailRequestDto, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new p(this.f146185g, this.f146186h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ContactDetailDto>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: oj0.e
            @Override // er.a
            public final Object a() {
                return f.l(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj0.b l(w wVar) {
        return (lj0.b) w.b(wVar, null, lj0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lj0.b m() {
        return (lj0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object a(tq.e<? super dx.i<? extends dx.b, ContactDetails>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f146166f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f146166f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f146164d;
        Object objE = uq.b.e();
        int i16 = kVar.f146166f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(null);
            kVar.f146166f = 1;
            objB = g0Var.b(lVar, kVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.e((ContactDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // rj0.c
    public Object b(b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new j(b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // rj0.c
    public Object c(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super dx.i<? extends dx.b, ContactDetailsConfirmation>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f146133k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f146133k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object objB = cVar2.f146131h;
        Object objE = uq.b.e();
        int i16 = cVar2.f146133k;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, b0Var, b0Var2, b0Var3, null);
            cVar2.f146127d = vq.j.a(str);
            cVar2.f146128e = vq.j.a(b0Var);
            cVar2.f146129f = vq.j.a(b0Var2);
            cVar2.f146130g = vq.j.a(b0Var3);
            cVar2.f146133k = 1;
            objB = g0Var.b(dVar, cVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.f((ContactDetailsConfirmationDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // rj0.c
    public Object d(b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new i(b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object e(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super dx.i<? extends dx.b, ContactDetail>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f146182h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f146182h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f146180f;
        Object objE = uq.b.e();
        int i16 = oVar.f146182h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            p pVar = new p(phoneNumber, b0Var, null);
            oVar.f146178d = vq.j.a(phoneNumber);
            oVar.f146179e = vq.j.a(b0Var);
            oVar.f146182h = 1;
            objB = g0Var.b(pVar, oVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.a((ContactDetailDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object f(String str, b0 b0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, ContactDetailsConfirmation>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146121j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146121j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146119g;
        Object objE = uq.b.e();
        int i16 = aVar.f146121j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, b0Var, b0Var2, null);
            aVar.f146116d = vq.j.a(str);
            aVar.f146117e = vq.j.a(b0Var);
            aVar.f146118f = vq.j.a(b0Var2);
            aVar.f146121j = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.f((ContactDetailsConfirmationDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object g(b0 b0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, ContactDetail>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f146173h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f146173h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f146171f;
        Object objE = uq.b.e();
        int i16 = mVar.f146173h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(b0Var, b0Var2, null);
            mVar.f146169d = vq.j.a(b0Var);
            mVar.f146170e = vq.j.a(b0Var2);
            mVar.f146173h = 1;
            objB = g0Var.b(nVar, mVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.a((ContactDetailDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object h(b0 b0Var, b0 b0Var2, tq.e<? super dx.i<? extends dx.b, ContactDetail>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f146144h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f146144h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f146142f;
        Object objE = uq.b.e();
        int i16 = eVar2.f146144h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3635f c3635f = new C3635f(b0Var, b0Var2, null);
            eVar2.f146140d = vq.j.a(b0Var);
            eVar2.f146141e = vq.j.a(b0Var2);
            eVar2.f146144h = 1;
            objB = g0Var.b(c3635f, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.a((ContactDetailDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.c
    public Object i(PhoneNumber phoneNumber, b0 b0Var, tq.e<? super dx.i<? extends dx.b, ContactDetail>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f146153h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f146153h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f146151f;
        Object objE = uq.b.e();
        int i16 = gVar.f146153h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(phoneNumber, b0Var, null);
            gVar.f146149d = vq.j.a(phoneNumber);
            gVar.f146150e = vq.j.a(b0Var);
            gVar.f146153h = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.e.a((ContactDetailDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
