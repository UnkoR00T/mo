package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lja/p1;", "previous", "Lja/y;", "loadType", "", "a", "(Lja/p1;Lja/p1;Lja/y;)Z", "paging-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {
    public static final boolean a(p1 p1Var, p1 p1Var2, y yVar) {
        if (p1Var2 == null) {
            return true;
        }
        if ((p1Var2 instanceof p1.b) && (p1Var instanceof p1.a)) {
            return true;
        }
        if ((p1Var instanceof p1.b) && (p1Var2 instanceof p1.a)) {
            return false;
        }
        return (p1Var.getOriginalPageOffsetFirst() == p1Var2.getOriginalPageOffsetFirst() && p1Var.getOriginalPageOffsetLast() == p1Var2.getOriginalPageOffsetLast() && p1Var2.e(yVar) <= p1Var.e(yVar)) ? false : true;
    }
}
