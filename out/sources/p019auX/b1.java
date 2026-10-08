package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RequestType f14602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CertificateType f14603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SmartAppService f14605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14606h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(SmartAppService smartAppService, e eVar) {
        super(eVar);
        this.f14605g = smartAppService;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f14604f = obj;
        this.f14606h |= PKIFailureInfo.systemUnavail;
        return this.f14605g.initProcess(null, null, this);
    }
}
