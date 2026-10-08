package yn3;

import ay.j;
import co3.QrCodeData;
import co3.SecondDocument;
import co3.VerificationDecryptedData;
import dn0.VerificationResponse;
import fr.q0;
import iy.g;
import iy.h;
import iy.i;
import iy.r;
import java.security.PrivateKey;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.verification.data.model.UserDataRequest;
import pl.gov.coi.mobywatel.feature.verification.data.model.VerificationDecryptedDataDto;
import pq.v;
import y00.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lyn3/f;", "Lfo3/b;", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "<init>", "(Lpy/a;Liy/a;Lay/j;Ly00/h0;Liy/i;Liy/g;)V", "Ldn0/d;", "verificationResponse", "Ldx/i;", "Ldx/b;", "Lco3/r;", "c", "(Ldn0/d;Ltq/e;)Ljava/lang/Object;", "", "Lrq0/b;", "a", "()Ljava/util/List;", "Lco3/e;", "qrCodeData", "", "mainDocument", "", "mainScope", "expireDateTime", "Lco3/j;", "secondDocument", "schemaId", "b", "(Lco3/e;Ljava/lang/String;ILjava/lang/String;Lco3/j;Ljava/lang/String;)Ljava/lang/String;", "Lpy/a;", "Liy/a;", "Lay/j;", "d", "Ly00/h0;", "e", "Liy/i;", "f", "Liy/g;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements fo3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i cipherRsa;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g cipherAes;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f228276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f228277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f228278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f228279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f228280h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f228281j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f228282k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f228283l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f228284m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f228285n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f228286p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f228287q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f228288r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f228289s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f228290t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f228292w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f228290t = obj;
            this.f228292w |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(py.a aVar, iy.a aVar2, j jVar, h0 h0Var, i iVar, g gVar) {
        this.aesKeyDecoder = aVar;
        this.base64Coder = aVar2;
        this.jsonSerializer = jVar;
        this.securityProviderFactory = h0Var;
        this.cipherRsa = iVar;
        this.cipherAes = gVar;
    }

    @Override // fo3.b
    public List<rq0.b> a() {
        return v.q(rq0.b.d.ID_CARD, rq0.b.d.DRIVING_LICENCE, rq0.b.d.DIIA_REFUGEE_CARD, rq0.b.d.DIIA_REFUGEE_CHILD_CARD, rq0.b.d.PENSIONER_CARD, rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE, rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE, rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE, rq0.b.e.RASKA_SENIOR_LICENCE, rq0.b.e.OLAWA_RESIDENT_LICENCE, rq0.b.e.OLAWA_FAMILY_LICENCE, rq0.b.e.OLAWA_SENIOR_LICENCE, rq0.b.e.SUCHY_LAS_FAMILY_LICENCE, rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE, rq0.b.e.CHELM_FAMILY_LICENCE, rq0.b.e.CHELM_SENIOR_LICENCE, rq0.b.e.CHELM_RESIDENT_LICENCE, rq0.b.e.LODZ_SENIOR_LICENCE, rq0.b.e.LODZ_FAMILY_LICENCE, rq0.b.d.FAMILY_CARD, rq0.b.d.ADVOCATE_CARD, rq0.b.d.STUDENT_CARD, rq0.b.e.SENATOR_CARD, rq0.b.e.PZPN_LICENCE, rq0.b.e.GIZYCKA_RESIDENT_LICENCE, rq0.b.e.RACIBORSKA_RESIDENT_LICENCE, rq0.b.e.RACIBORSKA_SENIOR_LICENCE, rq0.b.e.RACIBORSKA_FAMILY_LICENCE, rq0.b.d.RAILWAY_CARD, rq0.b.d.DEPUTY_CARD, rq0.b.d.NURSE_CARD, rq0.b.d.MIDWIFE_CARD, rq0.b.e.WROCLAWSKA_SENIOR_LICENCE, rq0.b.e.KOBYLKA_RESIDENT_LICENCE, rq0.b.e.MIEKINIA_SENIOR_LICENCE, rq0.b.e.MIEKINIA_FAMILY_LICENCE, rq0.b.e.TOPR_LICENCE, rq0.b.e.MAZOVIA_LICENCE, rq0.b.e.OLECKO_RESIDENT_LICENCE, rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE, rq0.b.e.WODZISLAW_FAMILY_LICENCE, rq0.b.e.MICHALOWICE_RESIDENT_LICENCE, rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE, rq0.b.e.WISLA_RESIDENT_LICENCE, rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE, rq0.b.e.FIREFIGHTER_OSP_LICENCE, rq0.b.e.GENERAL_COUNSEL_LICENCE, rq0.b.EnumC4479b.DOCTOR, rq0.b.EnumC4479b.DENTIST, rq0.b.EnumC4479b.ATTORNEY_AT_LAW, rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW, rq0.b.EnumC4479b.CIVIL_ENGINEER, rq0.b.EnumC4479b.TAX_ADVISOR, rq0.b.EnumC4479b.AUDITOR, rq0.b.EnumC4479b.SOLIDARITY_CARD, rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP, rq0.b.EnumC4479b.PHD_STUDENT, rq0.b.EnumC4479b.PHYSIOTHERAPIST, rq0.b.EnumC4479b.PHARMACIST, rq0.b.EnumC4479b.SHOOTING_LICENCE, rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE, rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE, rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE, rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING, rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING, rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE, rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD, rq0.b.c.TEACHER, rq0.b.c.BAILIFF_CARD, rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION, rq0.b.c.ELECTRONIC_DIPLOMA_PHD, rq0.b.c.ELECTRONIC_DIPLOMA_DSC, rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN, rq0.b.EnumC4479b.PENSIONER_MSWIA);
    }

    @Override // fo3.b
    public String b(QrCodeData qrCodeData, String mainDocument, int mainScope, String expireDateTime, SecondDocument secondDocument, String schemaId) {
        return this.jsonSerializer.b(new UserDataRequest(qrCodeData.getServiceType() + b.c(qrCodeData.getQrType()), mainScope, 1, mainDocument, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), Long.parseLong(expireDateTime), secondDocument != null ? b.b(secondDocument) : null, schemaId), q0.n(UserDataRequest.class));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0201  */
    /* JADX WARN: Code duplicated, block: B:62:0x0212  */
    /* JADX WARN: Code duplicated, block: B:63:0x0220  */
    /* JADX WARN: Code duplicated, block: B:65:0x0224  */
    /* JADX WARN: Code duplicated, block: B:68:0x0231  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // fo3.b
    public Object c(VerificationResponse verificationResponse, tq.e<? super dx.i<? extends dx.b, VerificationDecryptedData>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        byte[] bArr;
        String name;
        VerificationResponse verificationResponse2;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[] bArr2;
        SecretKeySpec secretKeySpec;
        g gVar;
        ex.b bVar3;
        String str;
        byte[] bArr3;
        byte[] bArr4;
        VerificationResponse verificationResponse3;
        ex.b bVar4;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f228292w;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f228292w = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f228290t;
        Object objE = uq.b.e();
        ?? r15 = aVar.f228292w;
        try {
            try {
                try {
                    try {
                        if (r15 != 0) {
                            if (r15 == 1) {
                                int i26 = aVar.f228289s;
                                int i27 = aVar.f228288r;
                                i17 = aVar.f228287q;
                                i18 = aVar.f228286p;
                                i19 = aVar.f228285n;
                                aVar2 = (ex.b) aVar.f228282k;
                                name = (String) aVar.f228281j;
                                bArr = (byte[]) aVar.f228280h;
                                bVar2 = (ex.b) aVar.f228279g;
                                bVar = (ex.b) aVar.f228278f;
                                dx.j jVar = (dx.j) aVar.f228277e;
                                verificationResponse2 = (VerificationResponse) aVar.f228276d;
                                try {
                                    u.b(objC);
                                    i15 = i26;
                                    r15 = jVar;
                                    i16 = i27;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r15 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } else {
                                if (r15 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar4 = (ex.b) aVar.f228282k;
                                dx.j jVar2 = (dx.j) aVar.f228277e;
                                verificationResponse3 = (VerificationResponse) aVar.f228276d;
                                u.b(objC);
                                r15 = jVar2;
                            }
                            return new dx.i.Right(b.a((VerificationDecryptedDataDto) this.jsonSerializer.a(new String((byte[]) bVar4.a((dx.i) objC), fu.d.UTF_8), q0.n(VerificationDecryptedDataDto.class)), verificationResponse3.getVerificationDateTime()));
                        }
                        u.b(objC);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        aVar2 = new ex.a();
                        bArr = (byte[]) aVar2.a(iy.a.c(this.base64Coder, verificationResponse.getEncryptedEncryptionKey(), null, 2, null));
                        name = this.securityProviderFactory.b().getName();
                        this.cipherRsa.a(name);
                        this.cipherAes.a(name);
                        i iVar = this.cipherRsa;
                        PrivateKey privateKey = verificationResponse.getPrivateKey();
                        h.c keyEncryptionAlgorithm = verificationResponse.getKeyEncryptionAlgorithm();
                        aVar.f228276d = verificationResponse;
                        aVar.f228277e = jVarA;
                        aVar.f228278f = vq.j.a(aVar2);
                        aVar.f228279g = aVar2;
                        aVar.f228280h = vq.j.a(bArr);
                        aVar.f228281j = vq.j.a(name);
                        aVar.f228282k = aVar2;
                        aVar.f228285n = 0;
                        aVar.f228286p = 0;
                        aVar.f228287q = 0;
                        aVar.f228288r = 0;
                        aVar.f228289s = 0;
                        aVar.f228292w = 1;
                        objC = iVar.c(bArr, privateKey, keyEncryptionAlgorithm, aVar);
                        if (objC == objE) {
                            return objE;
                        }
                        verificationResponse2 = verificationResponse;
                        bVar = aVar2;
                        bVar2 = bVar;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        r15 = jVarA;
                        h.a.C2298a c2298a = new h.a.C2298a(new r.b((byte[]) bVar2.a(iy.a.c(this.base64Coder, verificationResponse2.getDataEncryptionIv(), null, 2, null))), 0);
                        aVar.f228276d = verificationResponse2;
                        aVar.f228277e = r15;
                        aVar.f228278f = vq.j.a(bVar3);
                        aVar.f228279g = vq.j.a(bVar2);
                        aVar.f228280h = vq.j.a(bArr3);
                        aVar.f228281j = vq.j.a(str);
                        aVar.f228282k = bVar2;
                        aVar.f228283l = vq.j.a(bArr2);
                        aVar.f228284m = vq.j.a(secretKeySpec);
                        aVar.f228285n = i19;
                        aVar.f228286p = i18;
                        aVar.f228287q = i17;
                        aVar.f228288r = i16;
                        aVar.f228289s = i15;
                        aVar.f228292w = 2;
                        objC = gVar.d(bArr4, secretKeySpec, c2298a, aVar);
                        if (objC == objE) {
                            return objE;
                        }
                        verificationResponse3 = verificationResponse2;
                        bVar4 = bVar2;
                        r15 = r15;
                        return new dx.i.Right(b.a((VerificationDecryptedDataDto) this.jsonSerializer.a(new String((byte[]) bVar4.a((dx.i) objC), fu.d.UTF_8), q0.n(VerificationDecryptedDataDto.class)), verificationResponse3.getVerificationDateTime()));
                    } catch (ex.c e18) {
                        e = e18;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                    bArr2 = (byte[]) aVar2.a((dx.i) objC);
                    secretKeySpec = (SecretKeySpec) bVar2.a(this.aesKeyDecoder.a(bArr2));
                    gVar = this.cipherAes;
                    bVar3 = bVar;
                    str = name;
                    bArr3 = bArr;
                    bArr4 = (byte[]) bVar2.a(iy.a.c(this.base64Coder, verificationResponse2.getEncryptedData(), null, 2, null));
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
