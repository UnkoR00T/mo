package fd4;

import jx.BuildInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.u;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lfd4/a;", "Lpl/gov/coi/common/network/u;", "Ljx/d;", "deviceInfo", "<init>", "(Ljx/d;)V", "Ljx/c;", "b", "()Ljx/c;", "", "a", "()Ljava/lang/String;", "Ljx/d;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    public a(jx.d dVar) {
        this.deviceInfo = dVar;
    }

    @Override // pl.gov.coi.common.network.u
    public String a() {
        return this.deviceInfo.c();
    }

    @Override // pl.gov.coi.common.network.u
    public BuildInfo b() {
        return new BuildInfo("4.91.0 (6578)", 56568);
    }
}
