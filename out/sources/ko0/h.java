package ko0;

import eo0.CentralTokens;
import eo0.OwTokens;
import fr.q0;
import ge4.x;
import iy.b0;
import iy.c0;
import jo0.TokenCentralRequestDto;
import jo0.TokenCentralResponseDto;
import jo0.TokenOwRefreshRequestDto;
import jo0.TokenOwRequestDto;
import jo0.TokenOwResponseDto;
import jo0.TokenPayloadDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import oy.ParsedJwt;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lko0/h;", "Lmo0/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Loy/a;", "jwtParser", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Loy/a;)V", "Liy/b0;", "mobileIdentityToken", "Ldx/i;", "Ldx/b;", "Leo0/k;", "b", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "electronicDeliveryAddress", "Leo0/k$a;", "centralAccessToken", "Leo0/i0;", "a", "(Ljava/lang/String;Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$c;", "owRefreshToken", "c", "(Ljava/lang/String;Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Loy/a;", "Lho0/d;", "d", "Loq/k;", "g", "()Lho0/d;", "client", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements mo0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oy.a jwtParser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client = oq.l.a(new er.a() { // from class: ko0.g
        @Override // er.a
        public final Object a() {
            return h.f(this.f111868a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111877h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f111878j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f111880l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111878j = obj;
            this.f111880l |= PKIFailureInfo.systemUnavail;
            return h.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/w1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<TokenCentralResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111881e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f111883g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f111883g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111881e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.d dVarG = h.this.g();
            TokenCentralRequestDto tokenCentralRequestDto = new TokenCentralRequestDto(c0.e(this.f111883g));
            this.f111881e = 1;
            Object objA = dVarG.a(tokenCentralRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new b(this.f111883g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TokenCentralResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f111888h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111889j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f111890k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f111891l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111893n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111891l = obj;
            this.f111893n |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/z1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<TokenOwResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111894e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CentralTokens.Access f111896g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111897h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CentralTokens.Access access, String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f111896g = access;
            this.f111897h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111894e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.d dVarG = h.this.g();
            TokenOwRequestDto tokenOwRequestDto = new TokenOwRequestDto(this.f111896g.getValue(), this.f111897h);
            this.f111894e = 1;
            Object objC = dVarG.c(tokenOwRequestDto, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new d(this.f111896g, this.f111897h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TokenOwResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f111902h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111903j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f111904k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f111905l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f111907n;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111905l = obj;
            this.f111907n |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/z1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<TokenOwResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111908e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Refresh f111910g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111911h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(OwTokens.Refresh refresh, String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f111910g = refresh;
            this.f111911h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111908e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.d dVarG = h.this.g();
            TokenOwRefreshRequestDto tokenOwRefreshRequestDto = new TokenOwRefreshRequestDto(this.f111910g.getValue(), this.f111911h);
            this.f111908e = 1;
            Object objB = dVarG.b(tokenOwRefreshRequestDto, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return h.this.new f(this.f111910g, this.f111911h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TokenOwResponseDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public h(w wVar, g0 g0Var, oy.a aVar) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
        this.jwtParser = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.d f(h hVar) {
        return (ho0.d) w.b(hVar.httpServiceFactory, null, ho0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.d g() {
        return (ho0.d) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.d
    public Object a(String str, CentralTokens.Access access, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        c cVar;
        TokenOwResponseDto tokenOwResponseDto;
        int i15;
        dx.i iVar;
        String str2;
        CentralTokens.Access access2;
        int i16;
        TokenOwResponseDto tokenOwResponseDto2;
        dx.i iVar2;
        ParsedJwt parsedJwt;
        Object objA;
        ParsedJwt parsedJwt2;
        dx.i iVar3;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i17 = cVar.f111893n;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f111893n = i17 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f111891l;
        Object objE = uq.b.e();
        int i18 = cVar.f111893n;
        if (i18 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(access, str, null);
            cVar.f111884d = vq.j.a(str);
            cVar.f111885e = vq.j.a(access);
            cVar.f111893n = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            access = (CentralTokens.Access) cVar.f111885e;
            str = (String) cVar.f111884d;
            oq.u.b(objB);
        } else {
            if (i18 == 2) {
                i16 = cVar.f111890k;
                int i19 = cVar.f111889j;
                tokenOwResponseDto = (TokenOwResponseDto) cVar.f111887g;
                iVar = (dx.i) cVar.f111886f;
                access2 = (CentralTokens.Access) cVar.f111885e;
                str2 = (String) cVar.f111884d;
                oq.u.b(objB);
                i15 = i19;
                tokenOwResponseDto2 = tokenOwResponseDto;
                iVar2 = (dx.i) objB;
                if (iVar2 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                oy.a aVar = this.jwtParser;
                String refreshToken = tokenOwResponseDto2.getRefreshToken();
                mr.c cVarC = q0.c(TokenPayloadDto.class);
                cVar.f111884d = vq.j.a(str2);
                cVar.f111885e = vq.j.a(access2);
                cVar.f111886f = vq.j.a(iVar);
                cVar.f111887g = tokenOwResponseDto2;
                cVar.f111888h = parsedJwt;
                cVar.f111889j = i15;
                cVar.f111890k = i16;
                cVar.f111893n = 3;
                objA = aVar.a(refreshToken, cVarC, cVar);
                if (objA != objE) {
                    objB = objA;
                    parsedJwt2 = parsedJwt;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            parsedJwt2 = (ParsedJwt) cVar.f111888h;
            tokenOwResponseDto2 = (TokenOwResponseDto) cVar.f111887g;
            oq.u.b(objB);
        }
        iVar3 = (dx.i) objB;
        if (iVar3 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
        }
        if (iVar3 instanceof dx.i.Right) {
            throw new oq.p();
        }
        return new dx.i.Right(new OwTokens(new OwTokens.Refresh(tokenOwResponseDto2.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(tokenOwResponseDto2.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
        dx.i iVar4 = (dx.i) objB;
        if (iVar4 instanceof dx.i.Left) {
            return iVar4;
        }
        if (!(iVar4 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        tokenOwResponseDto = (TokenOwResponseDto) ((dx.i.Right) iVar4).b();
        oy.a aVar2 = this.jwtParser;
        String accessToken = tokenOwResponseDto.getAccessToken();
        mr.c cVarC2 = q0.c(TokenPayloadDto.class);
        cVar.f111884d = vq.j.a(str);
        cVar.f111885e = vq.j.a(access);
        cVar.f111886f = vq.j.a(iVar4);
        cVar.f111887g = tokenOwResponseDto;
        i15 = 0;
        cVar.f111889j = 0;
        cVar.f111890k = 0;
        cVar.f111893n = 2;
        Object objA2 = aVar2.a(accessToken, cVarC2, cVar);
        if (objA2 != objE) {
            iVar = iVar4;
            objB = objA2;
            str2 = str;
            access2 = access;
            i16 = 0;
            tokenOwResponseDto2 = tokenOwResponseDto;
            iVar2 = (dx.i) objB;
            if (iVar2 instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
            oy.a aVar3 = this.jwtParser;
            String refreshToken2 = tokenOwResponseDto2.getRefreshToken();
            mr.c cVarC3 = q0.c(TokenPayloadDto.class);
            cVar.f111884d = vq.j.a(str2);
            cVar.f111885e = vq.j.a(access2);
            cVar.f111886f = vq.j.a(iVar);
            cVar.f111887g = tokenOwResponseDto2;
            cVar.f111888h = parsedJwt;
            cVar.f111889j = i15;
            cVar.f111890k = i16;
            cVar.f111893n = 3;
            objA = aVar3.a(refreshToken2, cVarC3, cVar);
            if (objA != objE) {
                objB = objA;
                parsedJwt2 = parsedJwt;
                iVar3 = (dx.i) objB;
                if (iVar3 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
                }
                if (iVar3 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                return new dx.i.Right(new OwTokens(new OwTokens.Refresh(tokenOwResponseDto2.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(tokenOwResponseDto2.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.d
    public Object b(b0 b0Var, tq.e<? super dx.i<? extends dx.b, CentralTokens>> eVar) throws Throwable {
        a aVar;
        TokenCentralResponseDto tokenCentralResponseDto;
        dx.i right;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f111880l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f111880l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f111878j;
        Object objE = uq.b.e();
        int i16 = aVar.f111880l;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, null);
            aVar.f111873d = vq.j.a(b0Var);
            aVar.f111880l = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            b0Var = (b0) aVar.f111873d;
            oq.u.b(objB);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenCentralResponseDto = (TokenCentralResponseDto) aVar.f111875f;
            oq.u.b(objB);
        }
        right = (dx.i) objB;
        if (!(right instanceof dx.i.Left)) {
            if (right instanceof dx.i.Right) {
                throw new oq.p();
            }
            right = new dx.i.Right(vq.b.f(((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) right).b()).a()).getExp()));
        }
        if (right instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) right).b());
        }
        if (right instanceof dx.i.Right) {
            throw new oq.p();
        }
        return new dx.i.Right(new CentralTokens(new CentralTokens.Access(tokenCentralResponseDto.getAccessToken(), ((Number) ((dx.i.Right) right).b()).longValue())));
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        TokenCentralResponseDto tokenCentralResponseDto2 = (TokenCentralResponseDto) ((dx.i.Right) iVar).b();
        oy.a aVar2 = this.jwtParser;
        String accessToken = tokenCentralResponseDto2.getAccessToken();
        mr.c cVarC = q0.c(TokenPayloadDto.class);
        aVar.f111873d = vq.j.a(b0Var);
        aVar.f111874e = vq.j.a(iVar);
        aVar.f111875f = tokenCentralResponseDto2;
        aVar.f111876g = 0;
        aVar.f111877h = 0;
        aVar.f111880l = 2;
        objB = aVar2.a(accessToken, cVarC, aVar);
        if (objB != objE) {
            tokenCentralResponseDto = tokenCentralResponseDto2;
            right = (dx.i) objB;
            if (!(right instanceof dx.i.Left)) {
                if (right instanceof dx.i.Right) {
                    throw new oq.p();
                }
                right = new dx.i.Right(vq.b.f(((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) right).b()).a()).getExp()));
            }
            if (right instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) right).b());
            }
            if (right instanceof dx.i.Right) {
                throw new oq.p();
            }
            return new dx.i.Right(new CentralTokens(new CentralTokens.Access(tokenCentralResponseDto.getAccessToken(), ((Number) ((dx.i.Right) right).b()).longValue())));
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0134  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.d
    public Object c(String str, OwTokens.Refresh refresh, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar) throws Throwable {
        e eVar2;
        TokenOwResponseDto tokenOwResponseDto;
        int i15;
        dx.i iVar;
        String str2;
        OwTokens.Refresh refresh2;
        int i16;
        TokenOwResponseDto tokenOwResponseDto2;
        dx.i iVar2;
        ParsedJwt parsedJwt;
        Object objA;
        ParsedJwt parsedJwt2;
        dx.i iVar3;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i17 = eVar2.f111907n;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f111907n = i17 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f111905l;
        Object objE = uq.b.e();
        int i18 = eVar2.f111907n;
        if (i18 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(refresh, str, null);
            eVar2.f111898d = vq.j.a(str);
            eVar2.f111899e = vq.j.a(refresh);
            eVar2.f111907n = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            refresh = (OwTokens.Refresh) eVar2.f111899e;
            str = (String) eVar2.f111898d;
            oq.u.b(objB);
        } else {
            if (i18 == 2) {
                i16 = eVar2.f111904k;
                int i19 = eVar2.f111903j;
                tokenOwResponseDto = (TokenOwResponseDto) eVar2.f111901g;
                iVar = (dx.i) eVar2.f111900f;
                refresh2 = (OwTokens.Refresh) eVar2.f111899e;
                str2 = (String) eVar2.f111898d;
                oq.u.b(objB);
                i15 = i19;
                tokenOwResponseDto2 = tokenOwResponseDto;
                iVar2 = (dx.i) objB;
                if (iVar2 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
                oy.a aVar = this.jwtParser;
                String refreshToken = tokenOwResponseDto2.getRefreshToken();
                mr.c cVarC = q0.c(TokenPayloadDto.class);
                eVar2.f111898d = vq.j.a(str2);
                eVar2.f111899e = vq.j.a(refresh2);
                eVar2.f111900f = vq.j.a(iVar);
                eVar2.f111901g = tokenOwResponseDto2;
                eVar2.f111902h = parsedJwt;
                eVar2.f111903j = i15;
                eVar2.f111904k = i16;
                eVar2.f111907n = 3;
                objA = aVar.a(refreshToken, cVarC, eVar2);
                if (objA != objE) {
                    objB = objA;
                    parsedJwt2 = parsedJwt;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            parsedJwt2 = (ParsedJwt) eVar2.f111902h;
            tokenOwResponseDto2 = (TokenOwResponseDto) eVar2.f111901g;
            oq.u.b(objB);
        }
        iVar3 = (dx.i) objB;
        if (iVar3 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
        }
        if (iVar3 instanceof dx.i.Right) {
            throw new oq.p();
        }
        return new dx.i.Right(new OwTokens(new OwTokens.Refresh(tokenOwResponseDto2.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(tokenOwResponseDto2.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
        dx.i iVar4 = (dx.i) objB;
        if (iVar4 instanceof dx.i.Left) {
            return iVar4;
        }
        if (!(iVar4 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        tokenOwResponseDto = (TokenOwResponseDto) ((dx.i.Right) iVar4).b();
        oy.a aVar2 = this.jwtParser;
        String accessToken = tokenOwResponseDto.getAccessToken();
        mr.c cVarC2 = q0.c(TokenPayloadDto.class);
        eVar2.f111898d = vq.j.a(str);
        eVar2.f111899e = vq.j.a(refresh);
        eVar2.f111900f = vq.j.a(iVar4);
        eVar2.f111901g = tokenOwResponseDto;
        i15 = 0;
        eVar2.f111903j = 0;
        eVar2.f111904k = 0;
        eVar2.f111907n = 2;
        Object objA2 = aVar2.a(accessToken, cVarC2, eVar2);
        if (objA2 != objE) {
            iVar = iVar4;
            objB = objA2;
            str2 = str;
            refresh2 = refresh;
            i16 = 0;
            tokenOwResponseDto2 = tokenOwResponseDto;
            iVar2 = (dx.i) objB;
            if (iVar2 instanceof dx.i.Left) {
                return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            parsedJwt = (ParsedJwt) ((dx.i.Right) iVar2).b();
            oy.a aVar3 = this.jwtParser;
            String refreshToken2 = tokenOwResponseDto2.getRefreshToken();
            mr.c cVarC3 = q0.c(TokenPayloadDto.class);
            eVar2.f111898d = vq.j.a(str2);
            eVar2.f111899e = vq.j.a(refresh2);
            eVar2.f111900f = vq.j.a(iVar);
            eVar2.f111901g = tokenOwResponseDto2;
            eVar2.f111902h = parsedJwt;
            eVar2.f111903j = i15;
            eVar2.f111904k = i16;
            eVar2.f111907n = 3;
            objA = aVar3.a(refreshToken2, cVarC3, eVar2);
            if (objA != objE) {
                objB = objA;
                parsedJwt2 = parsedJwt;
                iVar3 = (dx.i) objB;
                if (iVar3 instanceof dx.i.Left) {
                    return new dx.i.Left((dx.b) ((dx.i.Left) iVar3).b());
                }
                if (iVar3 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                return new dx.i.Right(new OwTokens(new OwTokens.Refresh(tokenOwResponseDto2.getRefreshToken(), ((TokenPayloadDto) ((ParsedJwt) ((dx.i.Right) iVar3).b()).a()).getExp()), new OwTokens.Access(tokenOwResponseDto2.getAccessToken(), ((TokenPayloadDto) parsedJwt2.a()).getExp())));
            }
        }
        return objE;
    }
}
