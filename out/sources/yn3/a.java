package yn3;

import co3.InstitutionDataModel;
import co3.QrCodeData;
import co3.i;
import fr.q0;
import iy.j;
import java.util.concurrent.CancellationException;
import k34.u;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.verification.data.model.InstitutionCertificateDto;
import pl.gov.coi.mobywatel.feature.verification.data.model.UserDataDto;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lyn3/a;", "Lao3/a;", "Liy/j;", "cmsManager", "Lco3/i;", "scopeMapper", "Lay/j;", "jsonSerializer", "Lez/a;", "currentTimeProvider", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Liy/j;Lco3/i;Lay/j;Lez/a;Lbo3/a;)V", "Lco3/c;", "institutionData", "Lk34/u;", "identityType", "Lco3/e;", "qrCodeData", "", "scopeDataForVerification", "Ldx/i;", "Ldx/b;", "a", "(Lco3/c;Lk34/u;Lco3/e;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liy/j;", "b", "Lco3/i;", "c", "Lay/j;", "d", "Lez/a;", "e", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ao3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j cmsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i scopeMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: yn3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6129a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f228237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f228238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f228239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f228240g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f228241h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f228242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f228243k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f228244l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f228245m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f228246n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f228247p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f228248q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f228249r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f228250s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f228251t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f228252v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f228254x;

        C6129a(tq.e<? super C6129a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f228252v = obj;
            this.f228254x |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, null, null, this);
        }
    }

    public a(j jVar, i iVar, ay.j jVar2, ez.a aVar, bo3.a aVar2) {
        this.cmsManager = jVar;
        this.scopeMapper = iVar;
        this.jsonSerializer = jVar2;
        this.currentTimeProvider = aVar;
        this.verificationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01a7: INVOKE (r4 I:java.util.List) = (r6 I:java.lang.Object) STATIC call: px.c.a(java.lang.Object):java.util.List A[MD:(java.lang.Object):java.util.List<px.a$a> (m)], block:B:43:0x01a7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [dx.j, java.lang.Object] */
    @Override // ao3.a
    public Object a(InstitutionDataModel institutionDataModel, u uVar, QrCodeData qrCodeData, String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        C6129a c6129a;
        ?? A;
        Object objB;
        ex.b bVar;
        UserDataDto userDataDto;
        InstitutionDataModel institutionDataModel2;
        ex.b bVar2;
        if (eVar instanceof C6129a) {
            c6129a = (C6129a) eVar;
            int i15 = c6129a.f228254x;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6129a.f228254x = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6129a = new C6129a(eVar);
            }
        } else {
            c6129a = new C6129a(eVar);
        }
        Object obj = c6129a.f228252v;
        Object objE = uq.b.e();
        int i16 = c6129a.f228254x;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    long epochSecond = this.currentTimeProvider.d().getEpochSecond();
                    String str2 = qrCodeData.getServiceType() + b.c(qrCodeData.getQrType());
                    int cardId = institutionDataModel.getCardId();
                    int institutionId = institutionDataModel.getInstitutionId();
                    String strValueOf = String.valueOf(institutionDataModel.getPurpose());
                    String purposeName = institutionDataModel.getPurposeName();
                    int iB = this.scopeMapper.b(institutionDataModel.getScope());
                    int iD = b.d(institutionDataModel.getScope());
                    long j15 = ((long) 300) + epochSecond;
                    InstitutionCertificateDto institutionCertificateDto = new InstitutionCertificateDto(institutionDataModel.getCertificate().getIssuerDN().getName(), institutionDataModel.getCertificate().getSerialNumber().toString(16), institutionDataModel.getCertificate().getSubjectDN().getName());
                    String recipientID = qrCodeData.getRecipientID();
                    co3.f qrType = qrCodeData.getQrType();
                    co3.f fVar = co3.f.DYNAMIC;
                    UserDataDto userDataDto2 = new UserDataDto(str2, iB, iD, epochSecond, j15, strValueOf, purposeName, cardId, institutionId, str, institutionCertificateDto, recipientID, qrType == fVar ? qrCodeData.getSecurityToken() : null, qrCodeData.getQrType() == fVar ? qrCodeData.getValidTime() : null);
                    bo3.a aVar2 = this.verificationContainersInteractor;
                    c6129a.f228237d = institutionDataModel;
                    c6129a.f228238e = vq.j.a(uVar);
                    c6129a.f228239f = vq.j.a(qrCodeData);
                    c6129a.f228240g = vq.j.a(str);
                    c6129a.f228241h = jVarA;
                    c6129a.f228242j = vq.j.a(aVar);
                    c6129a.f228243k = aVar;
                    c6129a.f228244l = userDataDto2;
                    c6129a.f228245m = aVar;
                    c6129a.f228246n = 0;
                    c6129a.f228247p = 0;
                    c6129a.f228248q = 0;
                    c6129a.f228249r = 0;
                    c6129a.f228250s = 0;
                    c6129a.f228251t = epochSecond;
                    c6129a.f228254x = 1;
                    Object objB2 = aVar2.b(uVar, c6129a);
                    if (objB2 == objE) {
                        return objE;
                    }
                    bVar = aVar;
                    userDataDto = userDataDto2;
                    obj = objB2;
                    institutionDataModel2 = institutionDataModel;
                    bVar2 = bVar;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) c6129a.f228245m;
                    userDataDto = (UserDataDto) c6129a.f228244l;
                    bVar2 = (ex.b) c6129a.f228243k;
                    institutionDataModel2 = (InstitutionDataModel) c6129a.f228237d;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                return new dx.i.Right(this.cmsManager.d((byte[]) bVar2.a(this.cmsManager.c(this.jsonSerializer.b(userDataDto, q0.n(UserDataDto.class)), (CertKeyPair) bVar.a((dx.i) obj))), institutionDataModel2.getCertificate()));
            } catch (Exception e16) {
                px.f fVar2 = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar2.d(message, e16, px.c.a(A));
                dx.i iVarA = A.a(e16);
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
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
