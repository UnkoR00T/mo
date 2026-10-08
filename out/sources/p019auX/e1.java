package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SmartAppService f14611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f14612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SmartAppService f14613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(SmartAppService smartAppService, e eVar) {
        super(eVar);
        this.f14613g = smartAppService;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f14612f = obj;
        this.f14614h |= PKIFailureInfo.systemUnavail;
        return this.f14613g.tagDetected(this);
    }
}
