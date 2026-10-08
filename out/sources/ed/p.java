package ed;

import ad.Size;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Led/p;", "Led/n;", "", "allowHardware", "<init>", "(Z)V", "Lad/g;", "size", "b", "(Lad/g;)Z", "a", "()Z", "Z", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean allowHardware;

    public p(boolean z15) {
        this.allowHardware = z15;
    }

    @Override // ed.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getAllowHardware() {
        return this.allowHardware;
    }

    @Override // ed.n
    public boolean b(Size size) {
        return this.allowHardware;
    }
}
