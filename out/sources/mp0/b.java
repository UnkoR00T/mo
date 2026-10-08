package mp0;

import dx.i;
import er.l;
import fp0.GetPackageResponse;
import fr.q0;
import ge4.x;
import iy.b0;
import iy.c0;
import lp0.CommonRequestGetPackageRequestDto;
import lp0.CommonRequestInstitutionAndCertDataRequestDto;
import lp0.CommonRequestSetPackageDownloadedRequestDto;
import lp0.GetPackageRequestDto;
import lp0.GetPackageResponseDto;
import lp0.InstitutionAndCertDataResponseDto;
import lp0.SetPackageDownloadedRequestDto;
import lp0.SetPackageDownloadedResponseDto;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.p0;
import pl.gov.coi.common.network.v0;
import pl.gov.coi.common.network.w;
import ry.CertKeyPair;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lmp0/b;", "Lop0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Ljp0/a;", "requestFactory", "Lhp0/e;", "institutionAndCertDataParser", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Ljp0/a;Lhp0/e;)V", "Liy/b0;", "token", "Lfp0/e;", "institution", "Ldx/i;", "Ldx/b;", "Lfp0/c;", "c", "(Liy/b0;Lfp0/e;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "certKeyPair", "Lfp0/d;", "identity", "Loq/i0;", "b", "(Liy/b0;Lry/c;Lfp0/d;Ltq/e;)Ljava/lang/Object;", "Lfp0/f;", "a", "(Lry/c;Lfp0/d;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Ljp0/a;", "Lhp0/e;", "Lip0/b;", "d", "Loq/k;", "g", "()Lip0/b;", "client", "e", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements op0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f127362e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jp0.a requestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hp0.e institutionAndCertDataParser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmp0/b$a;", "", "<init>", "()V", "", "INSTITUTION_AND_CARD_REQUEST_TYPE_ID", "I", "INSTITUTION_AND_CARD_REQUEST_INSTITUTION_TYPE_ID", "", "INSTITUTION_AND_CARD_REQUEST_INTERNAL_ID", "Ljava/lang/String;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: mp0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3147b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f127371h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f127372j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f127373k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f127374l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f127375m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127376n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f127377p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f127379r;

        C3147b(tq.e<? super C3147b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127377p = obj;
            this.f127379r |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llp0/w;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super x<InstitutionAndCertDataResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127380e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CommonRequestInstitutionAndCertDataRequestDto f127382g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CommonRequestInstitutionAndCertDataRequestDto commonRequestInstitutionAndCertDataRequestDto, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f127382g = commonRequestInstitutionAndCertDataRequestDto;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127380e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ip0.b bVarG = b.this.g();
            CommonRequestInstitutionAndCertDataRequestDto commonRequestInstitutionAndCertDataRequestDto = this.f127382g;
            this.f127380e = 1;
            Object objC = bVarG.c(commonRequestInstitutionAndCertDataRequestDto, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new c(this.f127382g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<InstitutionAndCertDataResponseDto>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127387h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f127389k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f127391m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127389k = obj;
            this.f127391m |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llp0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements l<tq.e<? super x<GetPackageResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127392e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CommonRequestGetPackageRequestDto f127394g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CommonRequestGetPackageRequestDto commonRequestGetPackageRequestDto, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f127394g = commonRequestGetPackageRequestDto;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127392e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ip0.b bVarG = b.this.g();
            CommonRequestGetPackageRequestDto commonRequestGetPackageRequestDto = this.f127394g;
            this.f127392e = 1;
            Object objB = bVarG.b(commonRequestGetPackageRequestDto, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new e(this.f127394g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetPackageResponseDto>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f127399h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f127401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f127402l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127404n;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127402l = obj;
            this.f127404n |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llp0/k0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements l<tq.e<? super x<SetPackageDownloadedResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127405e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CommonRequestSetPackageDownloadedRequestDto f127407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(CommonRequestSetPackageDownloadedRequestDto commonRequestSetPackageDownloadedRequestDto, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f127407g = commonRequestSetPackageDownloadedRequestDto;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127405e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ip0.b bVarG = b.this.g();
            CommonRequestSetPackageDownloadedRequestDto commonRequestSetPackageDownloadedRequestDto = this.f127407g;
            this.f127405e = 1;
            Object objD = bVarG.d(commonRequestSetPackageDownloadedRequestDto, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new g(this.f127407g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SetPackageDownloadedResponseDto>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var, jp0.a aVar, hp0.e eVar) {
        this.networkCallMediator = g0Var;
        this.requestFactory = aVar;
        this.institutionAndCertDataParser = eVar;
        this.client = oq.l.a(new er.a() { // from class: mp0.a
            @Override // er.a
            public final Object a() {
                return b.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ip0.b f(w wVar) {
        return (ip0.b) w.b(wVar, null, ip0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ip0.b g() {
        return (ip0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0165, code lost:
    
        if (r3 == r5) goto L50;
     */
    @Override // op0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ry.CertKeyPair r22, fp0.d r23, tq.e<? super dx.i<? extends dx.b, fp0.InstitutionCardAndCertData>> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.b.a(ry.c, fp0.d, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // op0.a
    public Object b(b0 b0Var, CertKeyPair certKeyPair, fp0.d dVar, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        f fVar;
        b0 value;
        b0 value2;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f127404n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f127404n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f127402l;
        Object objE = uq.b.e();
        int i16 = fVar.f127404n;
        if (i16 == 0) {
            u.b(objB);
            jp0.a aVar = this.requestFactory;
            SetPackageDownloadedRequestDto setPackageDownloadedRequestDto = new SetPackageDownloadedRequestDto(c0.e(b0Var), null, null, null, null, 30, null);
            mr.c cVarC = q0.c(CommonRequestSetPackageDownloadedRequestDto.class);
            p0 requestFactory = aVar.getRequestFactory();
            fp0.d.Ticket ticket = dVar instanceof fp0.d.Ticket ? (fp0.d.Ticket) dVar : null;
            String strE = (ticket == null || (value2 = ticket.getValue()) == null) ? null : c0.e(value2);
            v0.Whole whole = new v0.Whole(certKeyPair, null, 2, null);
            fp0.d.DocumentIdHash documentIdHash = dVar instanceof fp0.d.DocumentIdHash ? (fp0.d.DocumentIdHash) dVar : null;
            i iVarA = requestFactory.a(setPackageDownloadedRequestDto, strE, (documentIdHash == null || (value = documentIdHash.getValue()) == null) ? null : c0.e(value), whole, cVarC);
            if (iVarA instanceof i.Left) {
                return iVarA;
            }
            if (!(iVarA instanceof i.Right)) {
                throw new p();
            }
            CommonRequestSetPackageDownloadedRequestDto commonRequestSetPackageDownloadedRequestDto = (CommonRequestSetPackageDownloadedRequestDto) ((i.Right) iVarA).b();
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(commonRequestSetPackageDownloadedRequestDto, null);
            fVar.f127395d = j.a(b0Var);
            fVar.f127396e = j.a(certKeyPair);
            fVar.f127397f = j.a(dVar);
            fVar.f127398g = j.a(iVarA);
            fVar.f127399h = j.a(commonRequestSetPackageDownloadedRequestDto);
            fVar.f127400j = 0;
            fVar.f127401k = 0;
            fVar.f127404n = 1;
            objB = g0Var.b(gVar, fVar);
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
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // op0.a
    public Object c(b0 b0Var, fp0.e eVar, tq.e<? super i<? extends dx.b, GetPackageResponse>> eVar2) throws Throwable {
        d dVar;
        if (eVar2 instanceof d) {
            dVar = (d) eVar2;
            int i15 = dVar.f127391m;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f127391m = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar2);
            }
        } else {
            dVar = new d(eVar2);
        }
        Object objB = dVar.f127389k;
        Object objE = uq.b.e();
        int i16 = dVar.f127391m;
        if (i16 == 0) {
            u.b(objB);
            jp0.a aVar = this.requestFactory;
            i iVarC = p0.c(aVar.getRequestFactory(), new GetPackageRequestDto(eVar.getId(), c0.e(b0Var), null, null, null, null, 60, null), null, null, new v0.a(), q0.c(CommonRequestGetPackageRequestDto.class), 6, null);
            if (iVarC instanceof i.Left) {
                return iVarC;
            }
            if (!(iVarC instanceof i.Right)) {
                throw new p();
            }
            CommonRequestGetPackageRequestDto commonRequestGetPackageRequestDto = (CommonRequestGetPackageRequestDto) ((i.Right) iVarC).b();
            g0 g0Var = this.networkCallMediator;
            e eVar3 = new e(commonRequestGetPackageRequestDto, null);
            dVar.f127383d = j.a(b0Var);
            dVar.f127384e = j.a(eVar);
            dVar.f127385f = j.a(iVarC);
            dVar.f127386g = j.a(commonRequestGetPackageRequestDto);
            dVar.f127387h = 0;
            dVar.f127388j = 0;
            dVar.f127391m = 1;
            objB = g0Var.b(eVar3, dVar);
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
            return new i.Right(kp0.a.d((GetPackageResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
