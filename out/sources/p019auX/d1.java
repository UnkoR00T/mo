package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SmartAppService f14608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(SmartAppService smartAppService, e eVar) {
        super(eVar);
        this.f14608e = smartAppService;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f14607d = obj;
        this.f14609f |= PKIFailureInfo.systemUnavail;
        return this.f14608e.a((RequestType) null, (CertificateType) null, this);
    }
}
