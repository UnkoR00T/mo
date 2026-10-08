package c80;

import er.l;
import et3.GenerateCertResponse;
import et3.GenerateCertificateSignedRequest;
import et3.RevokeUserCertificateMobileApiRequest;
import et3.RevokeUserCertificateMobileApiSignedRequest;
import et3.RevokedCertificateMobileApiDto;
import fr.q0;
import ge4.x;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ry.CertKeyPair;
import z70.Challenge;
import z70.UpdatedCertificate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lc80/j;", "Le80/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/j;", "cmsManager", "Lay/j;", "jsonSerializer", "Liy/a;", "base64Coder", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/j;Lay/j;Liy/a;)V", "Lz70/d;", "challenge", "Lry/c;", "certKeyPairToRevoke", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lz70/d;Lry/c;Ltq/e;)Ljava/lang/Object;", "certKeyPair", "Lz70/j;", "b", "Lpl/gov/coi/common/network/g0;", "Liy/j;", "c", "Lay/j;", "d", "Liy/a;", "Ldt3/e;", "e", "Loq/k;", "()Ldt3/e;", "httpService", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements e80.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f24520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f24521h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f24522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f24523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f24524l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f24525m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f24526n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f24527p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f24528q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f24530s;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24528q = obj;
            this.f24530s |= PKIFailureInfo.systemUnavail;
            return j.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let3/h;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<GenerateCertResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24531e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f24533g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f24533g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24531e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.e eVarE = j.this.e();
            GenerateCertificateSignedRequest generateCertificateSignedRequest = new GenerateCertificateSignedRequest(this.f24533g);
            this.f24531e = 1;
            Object objA = eVarE.a(generateCertificateSignedRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new b(this.f24533g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GenerateCertResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f24534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f24537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f24538h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f24539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f24540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f24541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f24542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f24543n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f24544p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f24545q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f24547s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f24545q = obj;
            this.f24547s |= PKIFailureInfo.systemUnavail;
            return j.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let3/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<RevokedCertificateMobileApiDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24548e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f24550g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f24550g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24548e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            dt3.e eVarE = j.this.e();
            RevokeUserCertificateMobileApiSignedRequest revokeUserCertificateMobileApiSignedRequest = new RevokeUserCertificateMobileApiSignedRequest(this.f24550g);
            this.f24548e = 1;
            Object objB = eVarE.b(revokeUserCertificateMobileApiSignedRequest, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new d(this.f24550g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RevokedCertificateMobileApiDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public j(final w wVar, g0 g0Var, iy.j jVar, ay.j jVar2, iy.a aVar) {
        this.networkCallMediator = g0Var;
        this.cmsManager = jVar;
        this.jsonSerializer = jVar2;
        this.base64Coder = aVar;
        this.httpService = oq.l.a(new er.a() { // from class: c80.i
            @Override // er.a
            public final Object a() {
                return j.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dt3.e e() {
        return (dt3.e) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dt3.e f(w wVar) {
        return (dt3.e) w.b(wVar, null, dt3.e.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00f1, B:36:0x00f8, B:38:0x00fc, B:40:0x010c, B:41:0x0111, B:50:0x0121, B:53:0x012f), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00f1, B:36:0x00f8, B:38:0x00fc, B:40:0x010c, B:41:0x0111, B:50:0x0121, B:53:0x012f), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00f1, B:36:0x00f8, B:38:0x00fc, B:40:0x010c, B:41:0x0111, B:50:0x0121, B:53:0x012f), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, z70.d] */
    /* JADX WARN: Type inference failed for: r12v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // e80.e
    public Object a(Challenge challenge, CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        dx.i iVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f24547s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f24547s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f24545q;
        Object objE = uq.b.e();
        int i16 = cVar.f24547s;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            return iVar;
                        }
                        if (iVar instanceof dx.i.Right) {
                            throw new p();
                        }
                        return new dx.i.Right(i0.f148189a);
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    dx.i<dx.b, byte[]> iVarC = this.cmsManager.c(this.jsonSerializer.b(new RevokeUserCertificateMobileApiRequest(c0.e(challenge.getChallenge()), certKeyPair.getCertificate().getSerialNumber().toString(16)), q0.n(RevokeUserCertificateMobileApiRequest.class)), certKeyPair);
                    if (!(iVarC instanceof dx.i.Left)) {
                        if (!(iVarC instanceof dx.i.Right)) {
                            throw new p();
                        }
                        iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                    }
                    String str = (String) aVar.a(iVarC);
                    g0 g0Var = this.networkCallMediator;
                    d dVar = new d(str, null);
                    cVar.f24534d = vq.j.a(challenge);
                    cVar.f24535e = vq.j.a(certKeyPair);
                    cVar.f24536f = jVarA;
                    cVar.f24537g = vq.j.a(aVar);
                    cVar.f24538h = vq.j.a(aVar);
                    cVar.f24539j = vq.j.a(str);
                    cVar.f24540k = 0;
                    cVar.f24541l = 0;
                    cVar.f24542m = 0;
                    cVar.f24543n = 0;
                    cVar.f24544p = 0;
                    cVar.f24547s = 1;
                    Object objB2 = g0Var.b(dVar, cVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new p();
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    challenge = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(challenge));
                    dx.i iVarA = challenge.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new p();
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

    /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00d2, B:36:0x00d9, B:38:0x00dd, B:40:0x00ef, B:41:0x00f4, B:50:0x0104, B:53:0x0112), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00d2, B:36:0x00d9, B:38:0x00dd, B:40:0x00ef, B:41:0x00f4, B:50:0x0104, B:53:0x0112), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef A[Catch: Exception -> 0x0042, c -> 0x0045, CancellationException -> 0x0048, TryCatch #6 {Exception -> 0x0042, blocks: (B:12:0x003d, B:33:0x00d2, B:36:0x00d9, B:38:0x00dd, B:40:0x00ef, B:41:0x00f4, B:50:0x0104, B:53:0x0112), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, z70.d] */
    /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // e80.e
    public Object b(Challenge challenge, CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, UpdatedCertificate>> eVar) throws Throwable {
        a aVar;
        Object objB;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f24530s;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f24530s = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f24528q;
        Object objE = uq.b.e();
        int i16 = aVar.f24530s;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        iVar = (dx.i) obj;
                        if (iVar instanceof dx.i.Left) {
                            return iVar;
                        }
                        if (iVar instanceof dx.i.Right) {
                            return new dx.i.Right(b80.a.g((GenerateCertResponse) ((dx.i.Right) iVar).b()));
                        }
                        throw new p();
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar2 = new ex.a();
                    dx.i<dx.b, byte[]> iVarC = this.cmsManager.c(c0.e(challenge.getChallenge()), certKeyPair);
                    if (!(iVarC instanceof dx.i.Left)) {
                        if (!(iVarC instanceof dx.i.Right)) {
                            throw new p();
                        }
                        iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                    }
                    String str = (String) aVar2.a(iVarC);
                    g0 g0Var = this.networkCallMediator;
                    b bVar = new b(str, null);
                    aVar.f24517d = vq.j.a(challenge);
                    aVar.f24518e = vq.j.a(certKeyPair);
                    aVar.f24519f = jVarA;
                    aVar.f24520g = vq.j.a(aVar2);
                    aVar.f24521h = vq.j.a(aVar2);
                    aVar.f24522j = vq.j.a(str);
                    aVar.f24523k = 0;
                    aVar.f24524l = 0;
                    aVar.f24525m = 0;
                    aVar.f24526n = 0;
                    aVar.f24527p = 0;
                    aVar.f24530s = 1;
                    Object objB2 = g0Var.b(bVar, aVar);
                    if (objB2 == objE) {
                        return objE;
                    }
                    obj = objB2;
                    iVar = (dx.i) obj;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        return new dx.i.Right(b80.a.g((GenerateCertResponse) ((dx.i.Right) iVar).b()));
                    }
                    throw new p();
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    challenge = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(challenge));
                    dx.i iVarA = challenge.a(e);
                    if (iVarA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof dx.i.Right)) {
                            throw new p();
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
}
