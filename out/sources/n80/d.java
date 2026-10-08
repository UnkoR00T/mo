package n80;

import ay.j;
import dx.i;
import er.l;
import fr.q0;
import ge4.x;
import ht3.GetVerificationCertificateResponseDto;
import ht3.GetVerificationSessionByCodeResponseDto;
import ht3.GetVerificationSessionStatusResponseDto;
import ht3.SendVerificationDataRequestDto;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import k80.GetVerificationSessionStatusResponse;
import k80.QrCode;
import k80.SendVerificationDataRequest;
import k80.UserDataRequest;
import k80.VerificationCertificate;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.mjunior.backend.documentverificationservice.data.model.UserDataRequestDto;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0012J<\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0\u000e2\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Ln80/d;", "Lp80/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/j;", "jsonSerializer", "Liy/j;", "cmsManager", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lay/j;Liy/j;)V", "", "sessionId", "Ldx/i;", "Ldx/b;", "Lk80/j;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "code", "Lk80/c;", "b", "sessionUuid", "Lk80/i;", "dataRequest", "Ljava/security/cert/X509Certificate;", "certificate", "Lry/c;", "certKeyPair", "Loq/i0;", "d", "(Ljava/lang/String;Lk80/i;Ljava/security/cert/X509Certificate;Lry/c;Ltq/e;)Ljava/lang/Object;", "Lk80/b;", "a", "Lpl/gov/coi/common/network/g0;", "Lay/j;", "Liy/j;", "Lgt3/a;", "Loq/k;", "k", "()Lgt3/a;", "httpService", "Lgt3/b;", "e", "l", "()Lgt3/b;", "httpServiceVerificationData", "Lgt3/c;", "f", "m", "()Lgt3/c;", "httpServiceVerificationSession", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements p80.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k httpServiceVerificationData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k httpServiceVerificationSession;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f133511e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133513g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133511e = obj;
            this.f133513g |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lht3/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<GetVerificationCertificateResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133514e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f133516g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f133516g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133514e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gt3.a aVarK = d.this.k();
            String str = this.f133516g;
            this.f133514e = 1;
            Object objC = aVarK.c(str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f133516g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetVerificationCertificateResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f133518e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133520g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133518e = obj;
            this.f133520g |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: n80.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lht3/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C3301d extends vq.k implements l<tq.e<? super x<GetVerificationSessionByCodeResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133521e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f133523g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3301d(String str, tq.e<? super C3301d> eVar) {
            super(1, eVar);
            this.f133523g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133521e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gt3.c cVarM = d.this.m();
            String str = this.f133523g;
            this.f133521e = 1;
            Object objB = cVarM.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C3301d(this.f133523g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetVerificationSessionByCodeResponseDto>> eVar) {
            return ((C3301d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f133525e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133527g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133525e = obj;
            this.f133527g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lht3/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<GetVerificationSessionStatusResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133528e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f133530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f133530g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133528e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gt3.b bVarL = d.this.l();
            String str = this.f133530g;
            this.f133528e = 1;
            Object objA = bVarL.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f133530g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetVerificationSessionStatusResponseDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f133533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f133534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f133535h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f133536j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f133537k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f133538l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f133539m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f133540n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f133541p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f133542q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f133543r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f133544s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f133545t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f133547w;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133545t = obj;
            this.f133547w |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133548e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f133550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SendVerificationDataRequest f133551h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, SendVerificationDataRequest sendVerificationDataRequest, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f133550g = str;
            this.f133551h = sendVerificationDataRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133548e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            gt3.b bVarL = d.this.l();
            String str = this.f133550g;
            SendVerificationDataRequestDto sendVerificationDataRequestDtoF = m80.a.f(this.f133551h);
            this.f133548e = 1;
            Object objB = bVarL.b(str, sendVerificationDataRequestDtoF, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f133550g, this.f133551h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var, j jVar, iy.j jVar2) {
        this.networkCallMediator = g0Var;
        this.jsonSerializer = jVar;
        this.cmsManager = jVar2;
        this.httpService = oq.l.a(new er.a() { // from class: n80.a
            @Override // er.a
            public final Object a() {
                return d.p(wVar);
            }
        });
        this.httpServiceVerificationData = oq.l.a(new er.a() { // from class: n80.b
            @Override // er.a
            public final Object a() {
                return d.n(wVar);
            }
        });
        this.httpServiceVerificationSession = oq.l.a(new er.a() { // from class: n80.c
            @Override // er.a
            public final Object a() {
                return d.o(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt3.a k() {
        return (gt3.a) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt3.b l() {
        return (gt3.b) this.httpServiceVerificationData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt3.c m() {
        return (gt3.c) this.httpServiceVerificationSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt3.b n(w wVar) {
        return (gt3.b) w.b(wVar, null, gt3.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt3.c o(w wVar) {
        return (gt3.c) w.b(wVar, null, gt3.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt3.a p(w wVar) {
        return (gt3.a) w.b(wVar, null, gt3.a.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p80.a
    public Object a(String str, tq.e<? super i<? extends dx.b, GetVerificationSessionStatusResponse>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f133527g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f133527g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f133525e;
        Object objE = uq.b.e();
        int i16 = eVar2.f133527g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f133524d = vq.j.a(str);
            eVar2.f133527g = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(m80.a.b((GetVerificationSessionStatusResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p80.a
    public Object b(String str, tq.e<? super i<? extends dx.b, QrCode>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f133520g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f133520g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f133518e;
        Object objE = uq.b.e();
        int i16 = cVar.f133520g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C3301d c3301d = new C3301d(str, null);
            cVar.f133517d = vq.j.a(str);
            cVar.f133520g = 1;
            objB = g0Var.b(c3301d, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (iVar instanceof i.Right) {
            return new i.Right(m80.a.c((GetVerificationSessionByCodeResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p80.a
    public Object c(String str, tq.e<? super i<? extends dx.b, VerificationCertificate>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f133513g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f133513g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f133511e;
        Object objE = uq.b.e();
        int i16 = aVar.f133513g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f133510d = vq.j.a(str);
            aVar.f133513g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return new i.Left((dx.b) ((i.Left) iVar).b());
        }
        if (iVar instanceof i.Right) {
            return new i.Right(m80.a.d((GetVerificationCertificateResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // p80.a
    public Object d(String str, UserDataRequest userDataRequest, X509Certificate x509Certificate, CertKeyPair certKeyPair, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        g gVar;
        Object objB;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f133547w;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f133547w = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f133545t;
        Object objE = uq.b.e();
        int i16 = gVar.f133547w;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        byte[] bArr = (byte[]) aVar.a(this.cmsManager.c(this.jsonSerializer.b(m80.a.h(userDataRequest), q0.n(UserDataRequestDto.class)), certKeyPair));
                        SendVerificationDataRequest sendVerificationDataRequest = new SendVerificationDataRequest(this.cmsManager.d(bArr, x509Certificate));
                        g0 g0Var = this.networkCallMediator;
                        h hVar = new h(str, sendVerificationDataRequest, null);
                        gVar.f133531d = vq.j.a(str);
                        gVar.f133532e = vq.j.a(userDataRequest);
                        gVar.f133533f = vq.j.a(x509Certificate);
                        gVar.f133534g = vq.j.a(certKeyPair);
                        gVar.f133535h = jVarA;
                        gVar.f133536j = vq.j.a(aVar);
                        gVar.f133537k = vq.j.a(aVar);
                        gVar.f133538l = vq.j.a(sendVerificationDataRequest);
                        gVar.f133539m = vq.j.a(bArr);
                        gVar.f133540n = 0;
                        gVar.f133541p = 0;
                        gVar.f133542q = 0;
                        gVar.f133543r = 0;
                        gVar.f133544s = 0;
                        gVar.f133547w = 1;
                        Object objB2 = g0Var.b(hVar, gVar);
                        return objB2 == objE ? objE : objB2;
                    } catch (ex.c e15) {
                        e = e15;
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        i iVarA = str.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        return obj;
                    } catch (ex.c e18) {
                        e = e18;
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                return new i.Left((dx.b) ex.d.a(e));
            } catch (Exception e25) {
                e = e25;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
