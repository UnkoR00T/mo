package sf0;

import a80.f;
import dx.i;
import eg0.l;
import eg0.p;
import fr.t;
import iy.c0;
import iy.j;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;
import z70.Jwt;
import z70.JwtRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lsf0/b;", "", "Lsf0/b$a;", "Lz70/f;", "La80/f;", "generateJwtRequestUC", "Leg0/p;", "isUserCertActiveUC", "Leg0/l;", "getUserCertUC", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "Ldx/a;", "deactivateDomainErrorFactory", "<init>", "(La80/f;Leg0/p;Leg0/l;Liy/j;Liy/a;Ldx/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lsf0/b$a;Ltq/e;)Ljava/lang/Object;", "a", "La80/f;", "b", "Leg0/p;", "c", "Leg0/l;", "Liy/j;", "e", "Liy/a;", "f", "Ldx/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f generateJwtRequestUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p isUserCertActiveUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l getUserCertUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j cmsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dx.a deactivateDomainErrorFactory;

    /* JADX INFO: renamed from: sf0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsf0/b$a;", "Lgz/b$a;", "Lz70/g;", "jwtRequest", "<init>", "(Lz70/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz70/g;", "()Lz70/g;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final JwtRequest jwtRequest;

        public Params(JwtRequest jwtRequest) {
            this.jwtRequest = jwtRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final JwtRequest getJwtRequest() {
            return this.jwtRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.jwtRequest, ((Params) other).jwtRequest);
        }

        public int hashCode() {
            return this.jwtRequest.hashCode();
        }

        public String toString() {
            return "Params(jwtRequest=" + this.jwtRequest + ')';
        }
    }

    /* JADX INFO: renamed from: sf0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4654b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f181091h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f181092j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f181093k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f181094l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f181095m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f181096n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f181097p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f181098q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f181099r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f181101t;

        C4654b(e<? super C4654b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181099r = obj;
            this.f181101t |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(f fVar, p pVar, l lVar, j jVar, iy.a aVar, dx.a aVar2) {
        this.generateJwtRequestUC = fVar;
        this.isUserCertActiveUC = pVar;
        this.getUserCertUC = lVar;
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.deactivateDomainErrorFactory = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x016f A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:63:0x01d8, B:70:0x0203, B:73:0x0211, B:53:0x014e, B:59:0x0189, B:56:0x016f, B:58:0x0173, B:64:0x01e6, B:65:0x01eb, B:41:0x00fe, B:43:0x0106, B:47:0x011d, B:49:0x0125, B:66:0x01ec, B:67:0x01fc, B:44:0x0113, B:46:0x0117, B:68:0x01fd, B:69:0x0202, B:37:0x00ca), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0173 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:63:0x01d8, B:70:0x0203, B:73:0x0211, B:53:0x014e, B:59:0x0189, B:56:0x016f, B:58:0x0173, B:64:0x01e6, B:65:0x01eb, B:41:0x00fe, B:43:0x0106, B:47:0x011d, B:49:0x0125, B:66:0x01ec, B:67:0x01fc, B:44:0x0113, B:46:0x0117, B:68:0x01fd, B:69:0x0202, B:37:0x00ca), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e6 A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #6 {Exception -> 0x0051, blocks: (B:14:0x004c, B:63:0x01d8, B:70:0x0203, B:73:0x0211, B:53:0x014e, B:59:0x0189, B:56:0x016f, B:58:0x0173, B:64:0x01e6, B:65:0x01eb, B:41:0x00fe, B:43:0x0106, B:47:0x011d, B:49:0x0125, B:66:0x01ec, B:67:0x01fc, B:44:0x0113, B:46:0x0117, B:68:0x01fd, B:69:0x0202, B:37:0x00ca), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x008d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:28:0x008d */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0091: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:30:0x0091 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0095: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:32:0x0095 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public Object d(Params params, e<? super i<? extends dx.b, Jwt>> eVar) throws Throwable {
        C4654b c4654b;
        Object objB;
        Object obj;
        int i15;
        int i16;
        Params params2;
        ex.b bVar;
        int i17;
        int i18;
        int i19;
        dx.j<dx.b> jVarA;
        ex.b bVar2;
        ex.b bVar3;
        ex.b bVar4;
        int i25;
        int i26;
        i<dx.b, byte[]> iVarC;
        Object objB2;
        if (eVar instanceof C4654b) {
            c4654b = (C4654b) eVar;
            int i27 = c4654b.f181101t;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                c4654b.f181101t = i27 - PKIFailureInfo.systemUnavail;
            } else {
                c4654b = new C4654b(eVar);
            }
        } else {
            c4654b = new C4654b(eVar);
        }
        Object objC = c4654b.f181099r;
        Object objE = uq.b.e();
        ?? r15 = c4654b.f181101t;
        try {
            try {
                if (r15 == 0) {
                    u.b(objC);
                    jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    p pVar = this.isUserCertActiveUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    c4654b.f181087d = params;
                    c4654b.f181088e = jVarA;
                    c4654b.f181089f = vq.j.a(aVar);
                    c4654b.f181090g = aVar;
                    c4654b.f181094l = 0;
                    c4654b.f181095m = 0;
                    c4654b.f181096n = 0;
                    c4654b.f181097p = 0;
                    c4654b.f181098q = 0;
                    c4654b.f181101t = 1;
                    Object objC2 = pVar.c(c1792a, c4654b);
                    if (objC2 != objE) {
                        bVar3 = aVar;
                        bVar2 = bVar3;
                        objC = objC2;
                        i19 = 0;
                        i18 = 0;
                        i26 = 0;
                        i25 = 0;
                        params2 = params;
                        i17 = 0;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                int i28 = c4654b.f181098q;
                                int i29 = c4654b.f181097p;
                                i15 = c4654b.f181096n;
                                int i35 = c4654b.f181095m;
                                i16 = c4654b.f181094l;
                                ex.b bVar5 = (ex.b) c4654b.f181091h;
                                ex.b bVar6 = (ex.b) c4654b.f181090g;
                                ex.b bVar7 = (ex.b) c4654b.f181089f;
                                dx.j<dx.b> jVar = (dx.j) c4654b.f181088e;
                                params2 = (Params) c4654b.f181087d;
                                u.b(objC);
                                bVar = bVar5;
                                i17 = i35;
                                i18 = i29;
                                i19 = i28;
                                jVarA = jVar;
                                bVar2 = bVar7;
                                bVar3 = bVar6;
                                CertKeyPair certKeyPair = (CertKeyPair) bVar.a((i) objC);
                                iVarC = this.cmsManager.c(c0.e(params2.getJwtRequest().getSignedChallenge()), certKeyPair);
                                if (!(iVarC instanceof i.Left)) {
                                    if (iVarC instanceof i.Right) {
                                        throw new oq.p();
                                    }
                                    iVarC = new i.Right<>(iy.a.e(this.base64Coder, (byte[]) ((i.Right) iVarC).b(), null, 2, null));
                                }
                                String str = (String) bVar3.a(iVarC);
                                f fVar = this.generateJwtRequestUC;
                                f.Params params3 = new f.Params(new JwtRequest(c0.g(str)));
                                c4654b.f181087d = vq.j.a(params2);
                                c4654b.f181088e = jVarA;
                                c4654b.f181089f = vq.j.a(bVar2);
                                c4654b.f181090g = vq.j.a(bVar3);
                                c4654b.f181091h = vq.j.a(certKeyPair);
                                c4654b.f181092j = vq.j.a(str);
                                c4654b.f181093k = bVar3;
                                c4654b.f181094l = i16;
                                c4654b.f181095m = i17;
                                c4654b.f181096n = i15;
                                c4654b.f181097p = i18;
                                c4654b.f181098q = i19;
                                c4654b.f181101t = 3;
                                objC = fVar.c(params3, c4654b);
                                if (objC != objE) {
                                    bVar4 = bVar3;
                                }
                                return objE;
                            }
                            if (r15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) c4654b.f181093k;
                            u.b(objC);
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    } else {
                        int i36 = c4654b.f181098q;
                        int i37 = c4654b.f181097p;
                        int i38 = c4654b.f181096n;
                        int i39 = c4654b.f181095m;
                        int i45 = c4654b.f181094l;
                        ex.b bVar8 = (ex.b) c4654b.f181090g;
                        ex.b bVar9 = (ex.b) c4654b.f181089f;
                        dx.j<dx.b> jVar2 = (dx.j) c4654b.f181088e;
                        params2 = (Params) c4654b.f181087d;
                        u.b(objC);
                        i19 = i36;
                        jVarA = jVar2;
                        bVar2 = bVar9;
                        bVar3 = bVar8;
                        i25 = i45;
                        i17 = i39;
                        i26 = i38;
                        i18 = i37;
                    }
                    return new i.Right((Jwt) bVar4.a((i) objC));
                } catch (ex.c e16) {
                    e = e16;
                    return new i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e17) {
                    throw e17;
                } catch (Exception e18) {
                    e = e18;
                    r15 = obj;
                    px.f fVar2 = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    i iVarA = r15.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
                i iVar = (i) objC;
                if (iVar instanceof i.Left) {
                    objB2 = vq.b.a(false);
                } else {
                    if (!(iVar instanceof i.Right)) {
                        throw new oq.p();
                    }
                    objB2 = ((i.Right) iVar).b();
                }
                if (!((Boolean) objB2).booleanValue()) {
                    bVar3.b(this.deactivateDomainErrorFactory.b(false));
                    throw new g();
                }
                l lVar = this.getUserCertUC;
                gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
                c4654b.f181087d = params2;
                c4654b.f181088e = jVarA;
                c4654b.f181089f = vq.j.a(bVar2);
                c4654b.f181090g = bVar3;
                c4654b.f181091h = bVar3;
                c4654b.f181094l = i25;
                c4654b.f181095m = i17;
                c4654b.f181096n = i26;
                c4654b.f181097p = i18;
                c4654b.f181098q = i19;
                c4654b.f181101t = 2;
                objC = lVar.c(c1792a2, c4654b);
                if (objC != objE) {
                    i15 = i26;
                    i16 = i25;
                    bVar = bVar3;
                    CertKeyPair certKeyPair2 = (CertKeyPair) bVar.a((i) objC);
                    iVarC = this.cmsManager.c(c0.e(params2.getJwtRequest().getSignedChallenge()), certKeyPair2);
                    if (!(iVarC instanceof i.Left)) {
                        if (iVarC instanceof i.Right) {
                            throw new oq.p();
                        }
                        iVarC = new i.Right<>(iy.a.e(this.base64Coder, (byte[]) ((i.Right) iVarC).b(), null, 2, null));
                    }
                    String str2 = (String) bVar3.a(iVarC);
                    f fVar3 = this.generateJwtRequestUC;
                    f.Params params4 = new f.Params(new JwtRequest(c0.g(str2)));
                    c4654b.f181087d = vq.j.a(params2);
                    c4654b.f181088e = jVarA;
                    c4654b.f181089f = vq.j.a(bVar2);
                    c4654b.f181090g = vq.j.a(bVar3);
                    c4654b.f181091h = vq.j.a(certKeyPair2);
                    c4654b.f181092j = vq.j.a(str2);
                    c4654b.f181093k = bVar3;
                    c4654b.f181094l = i16;
                    c4654b.f181095m = i17;
                    c4654b.f181096n = i15;
                    c4654b.f181097p = i18;
                    c4654b.f181098q = i19;
                    c4654b.f181101t = 3;
                    objC = fVar3.c(params4, c4654b);
                    if (objC != objE) {
                        bVar4 = bVar3;
                        return new i.Right((Jwt) bVar4.a((i) objC));
                    }
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
