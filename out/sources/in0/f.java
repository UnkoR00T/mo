package in0;

import dn0.StartVerificationSession;
import dn0.VerificationSession;
import dx.i;
import er.l;
import ge4.x;
import hn0.GetVerificationSessionByCodeResponseDto;
import hn0.PublicKeyDto;
import hn0.StartVerificationSessionRequestDto;
import hn0.StartVerificationSessionResponseDto;
import java.security.KeyPair;
import java.util.UUID;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lin0/f;", "Lkn0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;)V", "", "g", "()Ljava/lang/String;", "code", "Ldx/i;", "Ldx/b;", "Ldn0/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/security/KeyPair;", "keyPair", "Ldn0/b;", "a", "(Ljava/security/KeyPair;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Liy/a;", "Lfn0/c;", "c", "Loq/k;", "h", "()Lfn0/c;", "client", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements kn0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f93543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f93544e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f93546g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f93544e = obj;
            this.f93546g |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lhn0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<GetVerificationSessionByCodeResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93547e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f93549g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f93549g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93547e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            fn0.c cVarH = f.this.h();
            String str = this.f93549g;
            this.f93547e = 1;
            Object objB = cVarH.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(this.f93549g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GetVerificationSessionByCodeResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f93550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93552f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f93554h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f93552f = obj;
            this.f93554h |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lhn0/j;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<StartVerificationSessionResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ KeyPair f93557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f93558h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(KeyPair keyPair, String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f93557g = keyPair;
            this.f93558h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93555e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            fn0.c cVarH = f.this.h();
            StartVerificationSessionRequestDto startVerificationSessionRequestDto = new StartVerificationSessionRequestDto(new PublicKeyDto(this.f93557g.getPublic().getAlgorithm(), iy.a.e(f.this.base64Coder, this.f93557g.getPublic().getEncoded(), null, 2, null)), this.f93558h);
            this.f93555e = 1;
            Object objC = cVarH.c(startVerificationSessionRequestDto, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f93557g, this.f93558h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartVerificationSessionResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var, iy.a aVar) {
        this.networkCallMediator = g0Var;
        this.base64Coder = aVar;
        this.client = oq.l.a(new er.a() { // from class: in0.e
            @Override // er.a
            public final Object a() {
                return f.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fn0.c f(w wVar) {
        return (fn0.c) wVar.a(new y.Backend(null, 1, null), fn0.c.class);
    }

    private final String g() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fn0.c h() {
        return (fn0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kn0.c
    public Object a(KeyPair keyPair, tq.e<? super i<? extends dx.b, StartVerificationSession>> eVar) throws Throwable {
        c cVar;
        KeyPair keyPair2;
        String str;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f93554h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f93554h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f93552f;
        Object objE = uq.b.e();
        int i16 = cVar.f93554h;
        if (i16 == 0) {
            u.b(obj);
            String strG = g();
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(keyPair, strG, null);
            cVar.f93550d = keyPair;
            cVar.f93551e = strG;
            cVar.f93554h = 1;
            Object objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
            keyPair2 = keyPair;
            str = strG;
            obj = objB;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f93551e;
            keyPair2 = (KeyPair) cVar.f93550d;
            u.b(obj);
        }
        i iVar = (i) obj;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(gn0.c.a((StartVerificationSessionResponseDto) ((i.Right) iVar).b(), str, keyPair2));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kn0.c
    public Object b(String str, tq.e<? super i<? extends dx.b, VerificationSession>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f93546g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f93546g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f93544e;
        Object objE = uq.b.e();
        int i16 = aVar.f93546g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f93543d = j.a(str);
            aVar.f93546g = 1;
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
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(gn0.c.b((GetVerificationSessionByCodeResponseDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
