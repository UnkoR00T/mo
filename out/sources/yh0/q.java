package yh0;

import ge4.x;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ry.CertKeyPair;
import th0.Jwt;
import th0.JwtRequest;
import xh0.JwtDtoDto;
import xh0.JwtRequestDtoDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lyh0/q;", "Lai0/h;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/j;", "cmsManager", "Liy/a;", "base64Coder", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/j;Liy/a;)V", "Lth0/o;", "request", "Lry/c;", "certKeyPair", "Ldx/i;", "Ldx/b;", "Lth0/n;", "a", "(Lth0/o;Lry/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "b", "Liy/j;", "c", "Liy/a;", "Lvh0/h;", "d", "Loq/k;", "e", "()Lvh0/h;", "client", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements ai0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f227011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f227012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f227013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f227014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f227015h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f227016j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f227017k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f227018l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f227019m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f227020n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f227021p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f227022q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f227023r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f227025t;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f227023r = obj;
            this.f227025t |= PKIFailureInfo.systemUnavail;
            return q.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxh0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<JwtDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227026e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ JwtRequestDtoDto f227028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JwtRequestDtoDto jwtRequestDtoDto, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f227028g = jwtRequestDtoDto;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227026e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            vh0.h hVarE = q.this.e();
            JwtRequestDtoDto jwtRequestDtoDto = this.f227028g;
            this.f227026e = 1;
            Object objA = hVarE.a(jwtRequestDtoDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new b(this.f227028g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<JwtDtoDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public q(final w wVar, g0 g0Var, iy.j jVar, iy.a aVar) {
        this.networkCallMediator = g0Var;
        this.cmsManager = jVar;
        this.base64Coder = aVar;
        this.client = oq.l.a(new er.a() { // from class: yh0.p
            @Override // er.a
            public final Object a() {
                return q.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vh0.h d(w wVar) {
        return (vh0.h) w.b(wVar, null, vh0.h.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vh0.h e() {
        return (vh0.h) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8 A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00e1, B:36:0x00e8, B:38:0x00ec, B:40:0x0100, B:41:0x0105, B:50:0x0115, B:53:0x0123), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00e1, B:36:0x00e8, B:38:0x00ec, B:40:0x0100, B:41:0x0105, B:50:0x0115, B:53:0x0123), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0100 A[Catch: Exception -> 0x0046, c -> 0x0049, CancellationException -> 0x004c, TryCatch #6 {Exception -> 0x0046, blocks: (B:12:0x0041, B:33:0x00e1, B:36:0x00e8, B:38:0x00ec, B:40:0x0100, B:41:0x0105, B:50:0x0115, B:53:0x0123), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, th0.o] */
    /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // ai0.h
    public Object a(JwtRequest jwtRequest, CertKeyPair certKeyPair, tq.e<? super dx.i<? extends dx.b, Jwt>> eVar) throws Throwable {
        a aVar;
        Object objB;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f227025t;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f227025t = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f227023r;
        Object objE = uq.b.e();
        int i16 = aVar.f227025t;
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
                        return new dx.i.Right(wh0.a.f213304a.k((JwtDtoDto) ((dx.i.Right) iVar).b()));
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
                    ex.a aVar2 = new ex.a();
                    dx.i<dx.b, byte[]> iVarC = this.cmsManager.c(c0.e(jwtRequest.getSignedChallenge()), certKeyPair);
                    if (!(iVarC instanceof dx.i.Left)) {
                        if (!(iVarC instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        iVarC = new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                    }
                    String str = (String) aVar2.a(iVarC);
                    JwtRequestDtoDto jwtRequestDtoDto = new JwtRequestDtoDto(str);
                    g0 g0Var = this.networkCallMediator;
                    b bVar = new b(jwtRequestDtoDto, null);
                    aVar.f227011d = vq.j.a(jwtRequest);
                    aVar.f227012e = vq.j.a(certKeyPair);
                    aVar.f227013f = jVarA;
                    aVar.f227014g = vq.j.a(aVar2);
                    aVar.f227015h = vq.j.a(aVar2);
                    aVar.f227016j = vq.j.a(jwtRequestDtoDto);
                    aVar.f227017k = vq.j.a(str);
                    aVar.f227018l = 0;
                    aVar.f227019m = 0;
                    aVar.f227020n = 0;
                    aVar.f227021p = 0;
                    aVar.f227022q = 0;
                    aVar.f227025t = 1;
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
                        throw new oq.p();
                    }
                    return new dx.i.Right(wh0.a.f213304a.k((JwtDtoDto) ((dx.i.Right) iVar).b()));
                } catch (ex.c e17) {
                    e = e17;
                    return new dx.i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    e = e19;
                    jwtRequest = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(jwtRequest));
                    dx.i iVarA = jwtRequest.a(e);
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
}
