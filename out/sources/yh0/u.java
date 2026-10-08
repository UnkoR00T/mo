package yh0;

import fr.q0;
import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import ry.CertKeyPair;
import th0.GenerateCertResponse;
import th0.GenerateCertificateSignedRequest;
import th0.RevokeUserCertificateMobileApiRequest;
import th0.RevokeUserCertificateMobileApiResponse;
import th0.UserCertificateMobileApi;
import xh0.GenerateCertResponseDto;
import xh0.GenerateCertificateSignedRequestDto;
import xh0.RevokeUserCertificateMobileApiRequestDto;
import xh0.RevokeUserCertificateMobileApiSignedRequestDto;
import xh0.RevokedCertificateMobileApiDtoDto;
import xh0.UserCertificateMobileApiDtoDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lyh0/u;", "Lai0/j;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/j;Liy/a;Lay/j;)V", "Ldx/i;", "Ldx/b;", "", "Lth0/t;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lth0/j;", "request", "Lth0/i;", "d", "(Lth0/j;Ltq/e;)Ljava/lang/Object;", "c", "Lth0/r;", "Lry/c;", "certKeyPair", "Lth0/s;", "b", "(Lth0/r;Lry/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Liy/j;", "Liy/a;", "Lay/j;", "Lvh0/k;", "e", "Loq/k;", "h", "()Lvh0/k;", "client", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements ai0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f227044e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f227046g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227044e = obj;
            this.f227046g |= PKIFailureInfo.systemUnavail;
            return u.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<GenerateCertResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227047e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GenerateCertificateSignedRequest f227049g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f227049g = generateCertificateSignedRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227047e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.k kVarH = u.this.h();
            GenerateCertificateSignedRequestDto generateCertificateSignedRequestDtoW = wh0.a.f213304a.w(this.f227049g);
            this.f227047e = 1;
            Object objC = kVarH.c(generateCertificateSignedRequestDtoW, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new b(this.f227049g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateCertResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f227051e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f227053g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227051e = obj;
            this.f227053g |= PKIFailureInfo.systemUnavail;
            return u.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<GenerateCertResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ GenerateCertificateSignedRequest f227056g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f227056g = generateCertificateSignedRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227054e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.k kVarH = u.this.h();
            GenerateCertificateSignedRequestDto generateCertificateSignedRequestDtoW = wh0.a.f213304a.w(this.f227056g);
            this.f227054e = 1;
            Object objA = kVarH.a(generateCertificateSignedRequestDtoW, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new d(this.f227056g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateCertResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f227057d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f227059f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227057d = obj;
            this.f227059f |= PKIFailureInfo.systemUnavail;
            return u.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lxh0/a0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<List<? extends UserCertificateMobileApiDtoDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227060e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227060e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.k kVarH = u.this.h();
            this.f227060e = 1;
            Object objB = kVarH.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<UserCertificateMobileApiDtoDto>>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f227063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f227064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f227065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f227066h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f227067j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f227068k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f227069l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f227070m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f227071n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f227072p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f227073q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f227074r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f227076t;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227074r = obj;
            this.f227076t |= PKIFailureInfo.systemUnavail;
            return u.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/y;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<RevokedCertificateMobileApiDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227077e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ RevokeUserCertificateMobileApiSignedRequestDto f227079g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(RevokeUserCertificateMobileApiSignedRequestDto revokeUserCertificateMobileApiSignedRequestDto, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f227079g = revokeUserCertificateMobileApiSignedRequestDto;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227077e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.k kVarH = u.this.h();
            RevokeUserCertificateMobileApiSignedRequestDto revokeUserCertificateMobileApiSignedRequestDto = this.f227079g;
            this.f227077e = 1;
            Object objD = kVarH.d(revokeUserCertificateMobileApiSignedRequestDto, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new h(this.f227079g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RevokedCertificateMobileApiDtoDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public u(final w wVar, g0 g0Var, iy.j jVar, iy.a aVar, ay.j jVar2) {
        this.networkCallMediator = g0Var;
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.jsonSerializer = jVar2;
        this.client = oq.l.a(new er.a() { // from class: yh0.t
            @Override // er.a
            public final Object a() {
                return u.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.k g(w wVar) {
        return (vh0.k) w.b(wVar, null, vh0.k.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.k h() {
        return (vh0.k) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.j
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<UserCertificateMobileApi>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f227059f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f227059f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f227057d;
        Object objE = uq.b.e();
        int i16 = eVar2.f227059f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(null);
            eVar2.f227059f = 1;
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
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wh0.a.f213304a.r((UserCertificateMobileApiDtoDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2 A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #4 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00eb, B:36:0x00f2, B:38:0x00f6, B:40:0x010a, B:41:0x010f, B:50:0x011f, B:53:0x012d), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #4 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00eb, B:36:0x00f2, B:38:0x00f6, B:40:0x010a, B:41:0x010f, B:50:0x011f, B:53:0x012d), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x010a A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #4 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00eb, B:36:0x00f2, B:38:0x00f6, B:40:0x010a, B:41:0x010f, B:50:0x011f, B:53:0x012d), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, th0.r] */
    /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // ai0.j
    public Object b(RevokeUserCertificateMobileApiRequest revokeUserCertificateMobileApiRequest, CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, RevokeUserCertificateMobileApiResponse>> eVar) throws Throwable {
        g gVar;
        Object objB;
        dx.i iVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f227076t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f227076t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f227074r;
        Object objE = uq.b.e();
        int i16 = gVar.f227076t;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(obj);
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            return iVar;
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        return new dx.i.Right(wh0.a.f213304a.o((RevokedCertificateMobileApiDtoDto) ((dx.i.Right) iVar).b()));
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                oq.u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarC = this.cmsManager.c(this.jsonSerializer.b(wh0.a.f213304a.y(revokeUserCertificateMobileApiRequest), q0.n(RevokeUserCertificateMobileApiRequestDto.class)), certKeyPair);
                    if (!(iVarC instanceof dx.i.Left)) {
                        if (!(iVarC instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                    }
                    String str = (String) aVar.a(iVarC);
                    RevokeUserCertificateMobileApiSignedRequestDto revokeUserCertificateMobileApiSignedRequestDto = new RevokeUserCertificateMobileApiSignedRequestDto(str);
                    g0 g0Var = this.networkCallMediator;
                    h hVar = new h(revokeUserCertificateMobileApiSignedRequestDto, null);
                    gVar.f227062d = vq.j.a(revokeUserCertificateMobileApiRequest);
                    gVar.f227063e = vq.j.a(certKeyPair);
                    gVar.f227064f = jVarA;
                    gVar.f227065g = vq.j.a(aVar);
                    gVar.f227066h = vq.j.a(aVar);
                    gVar.f227067j = vq.j.a(revokeUserCertificateMobileApiSignedRequestDto);
                    gVar.f227068k = vq.j.a(str);
                    gVar.f227069l = 0;
                    gVar.f227070m = 0;
                    gVar.f227071n = 0;
                    gVar.f227072p = 0;
                    gVar.f227073q = 0;
                    gVar.f227076t = 1;
                    Object objB2 = g0Var.b(hVar, gVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return new dx.i.Right(wh0.a.f213304a.o((RevokedCertificateMobileApiDtoDto) ((dx.i.Right) iVar).b()));
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    revokeUserCertificateMobileApiRequest = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(revokeUserCertificateMobileApiRequest));
                    dx.i iVarA = revokeUserCertificateMobileApiRequest.a(e);
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
    @Override // ai0.j
    public Object c(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super dx.i<? extends dx.b, GenerateCertResponse>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f227053g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f227053g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f227051e;
        Object objE = uq.b.e();
        int i16 = cVar.f227053g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(generateCertificateSignedRequest, null);
            cVar.f227050d = vq.j.a(generateCertificateSignedRequest);
            cVar.f227053g = 1;
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
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(wh0.a.f213304a.h((GenerateCertResponseDto) ((dx.i.Right) iVar).b()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ai0.j
    public Object d(GenerateCertificateSignedRequest generateCertificateSignedRequest, tq.e<? super dx.i<? extends dx.b, GenerateCertResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f227046g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f227046g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f227044e;
        Object objE = uq.b.e();
        int i16 = aVar.f227046g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(generateCertificateSignedRequest, null);
            aVar.f227043d = vq.j.a(generateCertificateSignedRequest);
            aVar.f227046g = 1;
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
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(wh0.a.f213304a.h((GenerateCertResponseDto) ((dx.i.Right) iVar).b()));
    }
}
