package ed;

import ad.Size;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Led/s;", "Led/n;", "Led/t;", "logger", "<init>", "(Led/t;)V", "Lad/g;", "size", "", "b", "(Lad/g;)Z", "a", "()Z", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements n {
    public s(t tVar) {
    }

    @Override // ed.n
    /* JADX INFO: renamed from: a */
    public boolean getAllowHardware() {
        return j.f49464a.b(null);
    }

    @Override // ed.n
    public boolean b(Size size) {
        ad.a width = size.getWidth();
        if ((width instanceof ad.a.C0109a ? ((ad.a.C0109a) width).getPx() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        ad.a height = size.getHeight();
        return (height instanceof ad.a.C0109a ? ((ad.a.C0109a) height).getPx() : Integer.MAX_VALUE) > 100;
    }
}
