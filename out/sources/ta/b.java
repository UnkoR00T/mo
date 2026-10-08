package ta;

import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class b {
    public static final void a(ya.b bVar) {
        List listC = v.c();
        ya.d dVarE4 = bVar.e4("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dVarE4.Y3()) {
            try {
                listC.add(dVarE4.u3(0));
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(dVarE4, th4);
                    throw th5;
                }
            }
        }
        i0 i0Var = i0.f148189a;
        cr.a.a(dVarE4, null);
        for (String str : v.a(listC)) {
            if (fu.r.V(str, "room_fts_content_sync_", false, 2, null)) {
                ya.a.a(bVar, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
