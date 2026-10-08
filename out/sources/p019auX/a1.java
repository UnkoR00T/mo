package p019auX;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SmartAppService f14600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(SmartAppService smartAppService, e eVar) {
        super(eVar);
        this.f14600f = smartAppService;
    }

    @Override // vq.a
    public final Object J(Object obj) {
        this.f14599e = obj;
        this.f14601g |= PKIFailureInfo.systemUnavail;
        return this.f14600f.a(this);
    }
}
