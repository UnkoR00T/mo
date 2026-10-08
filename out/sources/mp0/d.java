package mp0;

import ay.j;
import dx.i;
import er.l;
import fp0.DeviceInfo;
import fp0.InstitutionData;
import fr.p0;
import fr.q0;
import ge4.x;
import iy.i0;
import java.security.cert.X509Certificate;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import lp0.AppInfoDto;
import lp0.CommonRequestDataInstitutionDataRequestDtoDto;
import lp0.CommonRequestInstitutionDataRequestDtoDto;
import lp0.HeaderDto;
import lp0.IdentityContextDto;
import lp0.InstitutionCardDto;
import lp0.InstitutionDataModel2Dto;
import lp0.InstitutionDataRequestDtoDto;
import lp0.InstitutionDataResponseDtoDto;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import px.f;
import ry.CertKeyPair;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJF\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lmp0/d;", "Lop0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Liy/j;", "cmsManager", "Liy/i0;", "x509CertificateDecoder", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;Lay/j;Liy/j;Liy/i0;)V", "", "ticket", "requestId", "", "cardId", "institutionId", "securityToken", "Llp0/f;", "c", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Llp0/f;", "e", "()Ljava/lang/String;", "Lry/c;", "certKeyPair", "Lfp0/b;", "deviceInfo", "Ldx/i;", "Ldx/b;", "Lfp0/g;", "a", "(Ljava/lang/String;Lry/c;Lfp0/b;IILtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "b", "Liy/a;", "Lay/j;", "d", "Liy/j;", "Liy/i0;", "Lip0/b;", "f", "Lip0/b;", "client", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements op0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ip0.b client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f127442h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f127443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f127444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f127445l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f127446m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f127447n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f127448p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f127449q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f127450r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f127451s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f127452t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f127453v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f127454w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f127455x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f127457z;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127455x = obj;
            this.f127457z |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, null, null, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llp0/b0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements l<e<? super x<InstitutionDataResponseDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127458e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f127460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p0<CommonRequestDataInstitutionDataRequestDtoDto> f127461h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f127462j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DeviceInfo deviceInfo, p0<CommonRequestDataInstitutionDataRequestDtoDto> p0Var, String str, e<? super b> eVar) {
            super(1, eVar);
            this.f127460g = deviceInfo;
            this.f127461h = p0Var;
            this.f127462j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127458e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ip0.b bVar = d.this.client;
            String deviceName = this.f127460g.getDeviceName();
            CommonRequestInstitutionDataRequestDtoDto commonRequestInstitutionDataRequestDtoDto = new CommonRequestInstitutionDataRequestDtoDto(new AppInfoDto(this.f127460g.getAppVersionName(), "", null, vq.b.e(this.f127460g.getAppVersionCode()), deviceName, null, null, null, AppInfoDto.EnumC2902a.ANDROID, null, 740, null), this.f127461h.f66410a, this.f127462j);
            this.f127458e = 1;
            Object objA = bVar.a(commonRequestInstitutionDataRequestDtoDto, this);
            return objA == objE ? objE : objA;
        }

        public final e<oq.i0> M(e<?> eVar) {
            return d.this.new b(this.f127460g, this.f127461h, this.f127462j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<InstitutionDataResponseDtoDto>> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public d(w wVar, g0 g0Var, iy.a aVar, j jVar, iy.j jVar2, i0 i0Var) {
        this.networkCallMediator = g0Var;
        this.base64Coder = aVar;
        this.jsonSerializer = jVar;
        this.cmsManager = jVar2;
        this.x509CertificateDecoder = i0Var;
        this.client = (ip0.b) wVar.a(new y.Backend(null, 1, null), ip0.b.class);
    }

    private final CommonRequestDataInstitutionDataRequestDtoDto c(String ticket, String requestId, int cardId, int institutionId, String securityToken) {
        return new CommonRequestDataInstitutionDataRequestDtoDto(new InstitutionDataRequestDtoDto(Boolean.TRUE, Integer.valueOf(cardId), Integer.valueOf(institutionId), null, null, null, null, 120, null), new HeaderDto(requestId, null, 2, null), new IdentityContextDto(null, null, null, null, null, securityToken, ticket, 31, null), null, 8, null);
    }

    static /* synthetic */ CommonRequestDataInstitutionDataRequestDtoDto d(d dVar, String str, String str2, int i15, int i16, String str3, int i17, Object obj) {
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        return dVar.c(str, str2, i15, i16, str3);
    }

    private final String e() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x019c  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #5 {Exception -> 0x005e, blocks: (B:13:0x0058, B:60:0x0196, B:82:0x025b, B:63:0x019e, B:65:0x01a2, B:69:0x022e, B:73:0x0239, B:77:0x0248, B:81:0x0253, B:83:0x0267, B:84:0x026c, B:94:0x027d, B:97:0x028b), top: B:114:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a2 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #5 {Exception -> 0x005e, blocks: (B:13:0x0058, B:60:0x0196, B:82:0x025b, B:63:0x019e, B:65:0x01a2, B:69:0x022e, B:73:0x0239, B:77:0x0248, B:81:0x0253, B:83:0x0267, B:84:0x026c, B:94:0x027d, B:97:0x028b), top: B:114:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0229  */
    /* JADX WARN: Code duplicated, block: B:68:0x022c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0234  */
    /* JADX WARN: Code duplicated, block: B:72:0x0237  */
    /* JADX WARN: Code duplicated, block: B:75:0x0243  */
    /* JADX WARN: Code duplicated, block: B:76:0x0246  */
    /* JADX WARN: Code duplicated, block: B:79:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0251  */
    /* JADX WARN: Code duplicated, block: B:83:0x0267 A[Catch: Exception -> 0x005e, c -> 0x0061, CancellationException -> 0x0064, TryCatch #5 {Exception -> 0x005e, blocks: (B:13:0x0058, B:60:0x0196, B:82:0x025b, B:63:0x019e, B:65:0x01a2, B:69:0x022e, B:73:0x0239, B:77:0x0248, B:81:0x0253, B:83:0x0267, B:84:0x026c, B:94:0x027d, B:97:0x028b), top: B:114:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [T, lp0.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, lp0.f] */
    @Override // op0.c
    public Object a(String str, CertKeyPair certKeyPair, DeviceInfo deviceInfo, int i15, int i16, e<? super i<? extends dx.b, InstitutionData>> eVar) throws Throwable {
        a aVar;
        ?? A;
        Object objB;
        i left;
        Object objB2;
        ex.b bVar;
        ex.b bVar2;
        Object right;
        String name;
        String str2;
        String url;
        String str3;
        String purpose;
        String str4;
        String purposeName;
        String str5;
        CertKeyPair certKeyPair2 = certKeyPair;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i17 = aVar.f127457z;
            A = -2147483648;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f127457z = i17 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar2 = aVar;
        Object objB3 = aVar2.f127455x;
        Object objE = uq.b.e();
        int i18 = aVar2.f127457z;
        try {
            try {
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) aVar2.f127446m;
                    bVar2 = (ex.b) aVar2.f127443j;
                    CertKeyPair certKeyPair3 = (CertKeyPair) aVar2.f127439e;
                    try {
                        u.b(objB3);
                        certKeyPair2 = certKeyPair3;
                        right = (i) objB3;
                        if (!(right instanceof i.Left)) {
                            if (right instanceof i.Right) {
                                throw new p();
                            }
                            InstitutionDataModel2Dto institutionDataModel2Dto = (InstitutionDataModel2Dto) this.jsonSerializer.a(this.cmsManager.a(this.cmsManager.b((byte[]) bVar2.a(iy.a.c(this.base64Coder, ((InstitutionDataResponseDtoDto) ((i.Right) right).b()).getInstitutionData(), null, 2, null)), certKeyPair2)), q0.n(InstitutionDataModel2Dto.class));
                            InstitutionCardDto institutionCardDto = (InstitutionCardDto) this.jsonSerializer.a(this.cmsManager.a((byte[]) bVar2.a(iy.a.c(this.base64Coder, institutionDataModel2Dto.getInstitutionSignedCard(), null, 2, null))), q0.n(InstitutionCardDto.class));
                            X509Certificate x509Certificate = (X509Certificate) bVar2.a(this.x509CertificateDecoder.decode((byte[]) bVar2.a(iy.a.c(this.base64Coder, institutionDataModel2Dto.getCertificateBase64(), null, 2, null))));
                            int cardId = institutionCardDto.getCardId();
                            int institutionId = institutionCardDto.getInstitutionId();
                            name = institutionCardDto.getName();
                            if (name == null) {
                                str2 = "";
                            } else {
                                str2 = name;
                            }
                            url = institutionCardDto.getUrl();
                            if (url == null) {
                                str3 = "";
                            } else {
                                str3 = url;
                            }
                            int scope = institutionCardDto.getScope();
                            purpose = institutionCardDto.getPurpose();
                            if (purpose == null) {
                                str4 = "";
                            } else {
                                str4 = purpose;
                            }
                            purposeName = institutionCardDto.getPurposeName();
                            if (purposeName == null) {
                                str5 = "";
                            } else {
                                str5 = purposeName;
                            }
                            right = new i.Right(new InstitutionData(cardId, institutionId, str2, str3, scope, str4, str5, x509Certificate));
                        }
                        return new i.Right((InstitutionData) bVar.a(right));
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                u.b(objB3);
                xw.c cVar = xw.c.f221622a;
                A = cVar.a();
                try {
                    ex.a aVar3 = new ex.a();
                    String strE = e();
                    p0 p0Var = new p0();
                    try {
                        try {
                            ?? D = d(this, str, strE, i15, i16, null, 16, null);
                            p0Var.f66410a = D;
                            dx.j<dx.b> jVarA = cVar.a();
                            try {
                                try {
                                    left = new i.Right(iy.a.e(this.base64Coder, (byte[]) new ex.a().a(this.cmsManager.c(this.jsonSerializer.b(D, q0.n(CommonRequestDataInstitutionDataRequestDtoDto.class)), certKeyPair2)), null, 2, null));
                                } catch (Exception e17) {
                                    f fVar = f.f163100a;
                                    String message = e17.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e17, px.c.a(jVarA));
                                    Object objA = jVarA.a(e17);
                                    if (objA instanceof i.Left) {
                                        objB2 = new dx.b.Generic((Exception) ((i.Left) objA).b());
                                    } else {
                                        if (!(objA instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objB2 = ((i.Right) objA).b();
                                    }
                                    left = new i.Left(objB2);
                                }
                            } catch (ex.c e18) {
                                left = new i.Left((dx.b) ex.d.a(e18));
                            } catch (CancellationException e19) {
                                throw e19;
                            }
                            String str6 = (String) aVar3.a(left);
                            p0Var.f66410a = new CommonRequestDataInstitutionDataRequestDtoDto(null, null, null, str6, 7, null);
                            g0 g0Var = this.networkCallMediator;
                            b bVar3 = new b(deviceInfo, p0Var, strE, null);
                            aVar2.f127438d = vq.j.a(str);
                            aVar2.f127439e = certKeyPair2;
                            aVar2.f127440f = vq.j.a(deviceInfo);
                            aVar2.f127441g = A;
                            aVar2.f127442h = vq.j.a(aVar3);
                            aVar2.f127443j = aVar3;
                            aVar2.f127444k = vq.j.a(strE);
                            aVar2.f127445l = vq.j.a(p0Var);
                            aVar2.f127446m = aVar3;
                            aVar2.f127447n = vq.j.a(str6);
                            aVar2.f127448p = i15;
                            aVar2.f127449q = i16;
                            aVar2.f127450r = 0;
                            aVar2.f127451s = 0;
                            aVar2.f127452t = 0;
                            aVar2.f127453v = 0;
                            aVar2.f127454w = 0;
                            aVar2.f127457z = 1;
                            objB3 = g0Var.b(bVar3, aVar2);
                            if (objB3 == objE) {
                                return objE;
                            }
                            bVar = aVar3;
                            bVar2 = bVar;
                            right = (i) objB3;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new p();
                                }
                                InstitutionDataModel2Dto institutionDataModel2Dto2 = (InstitutionDataModel2Dto) this.jsonSerializer.a(this.cmsManager.a(this.cmsManager.b((byte[]) bVar2.a(iy.a.c(this.base64Coder, ((InstitutionDataResponseDtoDto) ((i.Right) right).b()).getInstitutionData(), null, 2, null)), certKeyPair2)), q0.n(InstitutionDataModel2Dto.class));
                                InstitutionCardDto institutionCardDto2 = (InstitutionCardDto) this.jsonSerializer.a(this.cmsManager.a((byte[]) bVar2.a(iy.a.c(this.base64Coder, institutionDataModel2Dto2.getInstitutionSignedCard(), null, 2, null))), q0.n(InstitutionCardDto.class));
                                X509Certificate x509Certificate2 = (X509Certificate) bVar2.a(this.x509CertificateDecoder.decode((byte[]) bVar2.a(iy.a.c(this.base64Coder, institutionDataModel2Dto2.getCertificateBase64(), null, 2, null))));
                                int cardId2 = institutionCardDto2.getCardId();
                                int institutionId2 = institutionCardDto2.getInstitutionId();
                                name = institutionCardDto2.getName();
                                if (name == null) {
                                    str2 = "";
                                } else {
                                    str2 = name;
                                }
                                url = institutionCardDto2.getUrl();
                                if (url == null) {
                                    str3 = "";
                                } else {
                                    str3 = url;
                                }
                                int scope2 = institutionCardDto2.getScope();
                                purpose = institutionCardDto2.getPurpose();
                                if (purpose == null) {
                                    str4 = "";
                                } else {
                                    str4 = purpose;
                                }
                                purposeName = institutionCardDto2.getPurposeName();
                                if (purposeName == null) {
                                    str5 = "";
                                } else {
                                    str5 = purposeName;
                                }
                                right = new i.Right(new InstitutionData(cardId2, institutionId2, str2, str3, scope2, str4, str5, x509Certificate2));
                            }
                            return new i.Right((InstitutionData) bVar.a(right));
                        } catch (CancellationException e25) {
                            throw e25;
                        }
                    } catch (ex.c e26) {
                        e = e26;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        A = A;
                        f fVar2 = f.f163100a;
                        String message2 = e.getMessage();
                        fVar2.d(message2 != null ? message2 : "", e, px.c.a(A));
                        i iVarA = A.a(e);
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
                } catch (ex.c e29) {
                    e = e29;
                } catch (CancellationException e35) {
                    throw e35;
                } catch (Exception e36) {
                    e = e36;
                }
            } catch (Exception e37) {
                e = e37;
            }
        } catch (CancellationException e38) {
            throw e38;
        }
    }
}
