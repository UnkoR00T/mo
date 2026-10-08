package ko0;

import eo0.OwTokens;
import fv.e0;
import ge4.x;
import iy.b0;
import iy.c0;
import jo0.SendSignedUpdRequestDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lko0/u;", "Lmo0/k;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;)V", "Leo0/g0;", "messageId", "Leo0/i0$a;", "owAccessToken", "Ldx/i;", "Ldx/b;", "Leo0/i;", "a", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/z0;", "cmsSignedUpd", "Loq/i0;", "b", "(Ljava/lang/String;Leo0/i0$a;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Liy/a;", "Lho0/i;", "c", "Loq/k;", "e", "()Lho0/i;", "updClient", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements mo0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k updClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112118f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112120h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112118f = obj;
            this.f112120h |= PKIFailureInfo.systemUnavail;
            return u.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112121e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112124h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, OwTokens.Access access, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112123g = str;
            this.f112124h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112121e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.i iVarE = u.this.e();
            String str = this.f112123g;
            String strB = this.f112124h.b();
            this.f112121e = 1;
            Object objB = iVarE.b(str, strB, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new b(this.f112123g, this.f112124h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112125e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112128h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f112129j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(OwTokens.Access access, String str, b0 b0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f112127g = access;
            this.f112128h = str;
            this.f112129j = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112125e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.i iVarE = u.this.e();
            String strB = this.f112127g.b();
            String str = this.f112128h;
            SendSignedUpdRequestDto sendSignedUpdRequestDto = new SendSignedUpdRequestDto(c0.e(this.f112129j));
            this.f112125e = 1;
            Object objA = iVarE.a(str, strB, sendSignedUpdRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return u.this.new c(this.f112127g, this.f112128h, this.f112129j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public u(final w wVar, g0 g0Var, iy.a aVar) {
        this.networkCallMediator = g0Var;
        this.base64Coder = aVar;
        this.updClient = oq.l.a(new er.a() { // from class: ko0.t
            @Override // er.a
            public final Object a() {
                return u.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.i e() {
        return (ho0.i) this.updClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.i f(w wVar) {
        return (ho0.i) w.b(wVar, null, ho0.i.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.k
    public Object a(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, eo0.i>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112120h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112120h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112118f;
        Object objE = uq.b.e();
        int i16 = aVar.f112120h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, access, null);
            aVar.f112116d = vq.j.a(str);
            aVar.f112117e = vq.j.a(access);
            aVar.f112120h = 1;
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
        return new dx.i.Right(eo0.i.a(eo0.i.b(c0.g(iy.a.e(this.base64Coder, ((e0) ((dx.i.Right) iVar).b()).h(), null, 2, null)))));
    }

    @Override // mo0.k
    public Object b(String str, OwTokens.Access access, b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new c(access, str, b0Var, null), eVar);
    }
}
