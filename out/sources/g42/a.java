package g42;

import p071kotlin.Metadata;
import vr0.BERedirectRequestInfo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "heightPixels", "widthPixels", "Lvr0/k;", "a", "(II)Lvr0/k;", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final BERedirectRequestInfo a(int i15, int i16) {
        return new BERedirectRequestInfo("application/x-www-form-urlencoded", "chrome", true, "32", i15, i16);
    }
}
