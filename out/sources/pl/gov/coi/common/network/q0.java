package pl.gov.coi.common.network;

import java.io.UnsupportedEncodingException;
import java.util.UUID;
import jx.BuildInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.data.AppInfo;
import pl.gov.coi.common.network.data.CommonRequest;
import pl.gov.coi.common.network.data.CommonRequestData;
import pl.gov.coi.common.network.data.HeaderDomain;
import pl.gov.coi.common.network.data.IdentityContext;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00162\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00028\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b$\u0010%Jo\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00028\u00010)\"\u0004\b\u0000\u0010\u0016\"\b\b\u0001\u0010\u000f*\u00020\u000e2\u0006\u0010\"\u001a\u00028\u00002\b\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010!\u001a\u0004\u0018\u00010\u00172\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105¨\u00066"}, d2 = {"Lpl/gov/coi/common/network/q0;", "Lpl/gov/coi/common/network/p0;", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Liy/j;", "cmsManager", "Lpl/gov/coi/common/network/u;", "httpHeaderDeviceInfoProvider", "Ldx/a;", "deactivateDomainErrorFactory", "<init>", "(Liy/a;Lay/j;Liy/j;Lpl/gov/coi/common/network/u;Ldx/a;)V", "", "U", "Lpl/gov/coi/common/network/data/CommonRequest;", "jsonObject", "Lmr/c;", "type", "i", "(Lpl/gov/coi/common/network/data/CommonRequest;Lmr/c;)Ljava/lang/Object;", "T", "", "requestId", "Lpl/gov/coi/common/network/data/CommonRequestData;", "requestData", "e", "(Ljava/lang/String;Lpl/gov/coi/common/network/data/CommonRequestData;)Lpl/gov/coi/common/network/data/CommonRequest;", "Lpl/gov/coi/common/network/data/AppInfo;", "d", "()Lpl/gov/coi/common/network/data/AppInfo;", "ticket", "documentId", "data", "securityToken", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lpl/gov/coi/common/network/data/CommonRequestData;", "Lpl/gov/coi/common/network/v0;", "signingType", "returnType", "Ldx/i;", "Ldx/b;", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/common/network/v0;Lmr/c;)Ldx/i;", "h", "()Ljava/lang/String;", "b", "Liy/a;", "Lay/j;", "c", "Liy/j;", "Lpl/gov/coi/common/network/u;", "Ldx/a;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.j cmsManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u httpHeaderDeviceInfoProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dx.a deactivateDomainErrorFactory;

    public q0(iy.a aVar, ay.j jVar, iy.j jVar2, u uVar, dx.a aVar2) {
        this.base64Coder = aVar;
        this.jsonSerializer = jVar;
        this.cmsManager = jVar2;
        this.httpHeaderDeviceInfoProvider = uVar;
        this.deactivateDomainErrorFactory = aVar2;
    }

    private final AppInfo d() {
        BuildInfo buildInfoB = this.httpHeaderDeviceInfoProvider.b();
        return new AppInfo(buildInfoB.getVersionName(), null, buildInfoB.getVersionCode(), this.httpHeaderDeviceInfoProvider.a(), null, null, null, null, null, null, 1010, null);
    }

    private final <T> CommonRequest<T> e(String requestId, CommonRequestData<T> requestData) {
        return new CommonRequest<>(requestId, d(), requestData);
    }

    private final <T> CommonRequestData<T> f(String ticket, String documentId, String requestId, T data, String securityToken) {
        return new CommonRequestData<>(data, new HeaderDomain(requestId, null, 2, null), new IdentityContext(null, ticket, null, securityToken, documentId, null, null, 101, null), null, 8, null);
    }

    static /* synthetic */ CommonRequestData g(q0 q0Var, String str, String str2, String str3, Object obj, String str4, int i15, Object obj2) {
        if ((i15 & 16) != 0) {
            str4 = null;
        }
        return q0Var.f(str, str2, str3, obj, str4);
    }

    private final <U> U i(CommonRequest<?> jsonObject, mr.c<U> type) {
        ay.j jVar = this.jsonSerializer;
        return (U) jVar.a(jVar.b(jsonObject, fr.q0.o(CommonRequest.class, mr.r.INSTANCE.c())), nr.e.c(type, null, false, null, 7, null));
    }

    @Override // pl.gov.coi.common.network.p0
    public <T, U> dx.i<dx.b, U> a(T data, String ticket, String documentId, v0<? super T, CommonRequestData<T>> signingType, mr.c<U> returnType) {
        dx.i<dx.b, U> left;
        CommonRequestData<T> commonRequestData;
        String strH = h();
        if (signingType instanceof v0.a) {
            commonRequestData = g(this, ticket, documentId, strH, data, null, 16, null);
        } else {
            if (!(signingType instanceof v0.Whole)) {
                throw new oq.p();
            }
            v0.Whole whole = (v0.Whole) signingType;
            CommonRequestData<T> commonRequestDataF = f(ticket, documentId, strH, data, whole.getSecurityToken());
            dx.i<dx.b, byte[]> iVarC = this.cmsManager.c(this.jsonSerializer.b(commonRequestDataF, nr.e.c(fr.q0.c(Object.class), null, false, null, 7, null)), whole.getCertKeyPair());
            if (iVarC instanceof dx.i.Left) {
                left = new dx.i.Left<>((dx.b) ((dx.i.Left) iVarC).b());
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                try {
                    left = new dx.i.Right<>(iy.a.e(this.base64Coder, (byte[]) ((dx.i.Right) iVarC).b(), null, 2, null));
                } catch (UnsupportedEncodingException unused) {
                    left = new dx.i.Left(this.deactivateDomainErrorFactory.b(false));
                }
            }
            if (left instanceof dx.i.Left) {
                return left;
            }
            if (!(left instanceof dx.i.Right)) {
                throw new oq.p();
            }
            commonRequestData = new CommonRequestData<>(null, null, null, (String) ((dx.i.Right) left).b(), 7, null);
        }
        return new dx.i.Right(i(e(strH, commonRequestData), returnType));
    }

    @Override // pl.gov.coi.common.network.p0
    public String b() {
        return iy.a.e(this.base64Coder, this.jsonSerializer.b(d(), fr.q0.n(AppInfo.class)).getBytes(fu.d.UTF_8), null, 2, null);
    }

    public String h() {
        return UUID.randomUUID().toString();
    }
}
