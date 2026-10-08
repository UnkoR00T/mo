package gi0;

import ay.j;
import ci0.BESendIdentityDataRequest;
import dx.i;
import er.l;
import fi0.AppInfoDto;
import fi0.SendIdentityRequest;
import fr.q0;
import fu.d;
import ge4.x;
import java.util.UUID;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.u;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import tq.e;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lgi0/a;", "Lii0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Liy/a;", "base64Coder", "Lpl/gov/coi/common/network/u;", "httpHeaderDeviceInfoProvider", "Lay/j;", "jsonSerializer", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Liy/a;Lpl/gov/coi/common/network/u;Lay/j;)V", "", "c", "()Ljava/lang/String;", "Lci0/a;", "request", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lci0/a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "getHttpServiceFactory", "()Lpl/gov/coi/common/network/w;", "b", "Lpl/gov/coi/common/network/g0;", "Liy/a;", "d", "Lpl/gov/coi/common/network/u;", "e", "Lay/j;", "backsystemservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ii0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u httpHeaderDeviceInfoProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: gi0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1676a extends k implements l<e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ei0.a f73231f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f73232g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BESendIdentityDataRequest f73233h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1676a(ei0.a aVar, a aVar2, BESendIdentityDataRequest bESendIdentityDataRequest, e<? super C1676a> eVar) {
            super(1, eVar);
            this.f73231f = aVar;
            this.f73232g = aVar2;
            this.f73233h = bESendIdentityDataRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f73230e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ei0.a aVar = this.f73231f;
            String string = UUID.randomUUID().toString();
            String strC = this.f73232g.c();
            SendIdentityRequest sendIdentityRequest = new SendIdentityRequest(this.f73233h.getCardId(), this.f73233h.getInstitutionId(), this.f73233h.getEncryptedData());
            this.f73230e = 1;
            Object objA = aVar.a(string, strC, sendIdentityRequest, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return new C1676a(this.f73231f, this.f73232g, this.f73233h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<i0>> eVar) {
            return ((C1676a) M(eVar)).J(i0.f148189a);
        }
    }

    public a(w wVar, g0 g0Var, iy.a aVar, u uVar, j jVar) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
        this.base64Coder = aVar;
        this.httpHeaderDeviceInfoProvider = uVar;
        this.jsonSerializer = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return iy.a.e(this.base64Coder, this.jsonSerializer.b(new AppInfoDto(this.httpHeaderDeviceInfoProvider.b().getVersionName(), this.httpHeaderDeviceInfoProvider.b().getVersionCode(), this.httpHeaderDeviceInfoProvider.a(), AppInfoDto.EnumC1427a.ANDROID), q0.n(AppInfoDto.class)).getBytes(d.UTF_8), null, 2, null);
    }

    @Override // ii0.a
    public Object a(BESendIdentityDataRequest bESendIdentityDataRequest, e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new C1676a((ei0.a) this.httpServiceFactory.a(new y.c(bESendIdentityDataRequest.getInstitutionUrl(), null, 2, null), ei0.a.class), this, bESendIdentityDataRequest, null), eVar);
    }
}
