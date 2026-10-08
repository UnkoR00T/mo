package ta;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lya/d;", "", "name", "", "a", "(Lya/d;Ljava/lang/String;)I", "b", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class o {
    public static final int a(ya.d dVar, String str) {
        int iB = m.b(dVar, str);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = m.b(dVar, '`' + str + '`');
        return iB2 >= 0 ? iB2 : b(dVar, str);
    }

    private static final int b(ya.d dVar, String str) {
        return -1;
    }
}
