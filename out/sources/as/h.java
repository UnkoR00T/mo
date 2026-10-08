package as;

import fu.r;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(zs.b bVar) {
        String strO = r.O(bVar.g().a(), '.', '$', false, 4, null);
        if (bVar.f().c()) {
            return strO;
        }
        return bVar.f() + '.' + strO;
    }
}
