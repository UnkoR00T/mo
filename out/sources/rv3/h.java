package rv3;

import j44.Access;
import j44.Refresh;
import ov3.CentralTokens;
import ov3.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lov3/c$a;", "Lj44/c;", "d", "(Lov3/c$a;)Lj44/c;", "Lov3/g$a;", "Lj44/f;", "e", "(Lov3/g$a;)Lj44/f;", "Lov3/g$c;", "Lj44/g;", "f", "(Lov3/g$c;)Lj44/g;", "edorauth_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Access d(CentralTokens.Access access) {
        return new Access(access.getValue(), access.getExpiration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j44.Access e(OwTokens.Access access) {
        return new j44.Access(access.getValue(), access.getExpiration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Refresh f(OwTokens.Refresh refresh) {
        return new Refresh(refresh.getValue(), refresh.getExpiration());
    }
}
