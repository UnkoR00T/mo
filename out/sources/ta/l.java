package ta;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lya/b;", "connection", "", "a", "(Lya/b;)J", "", "b", "(Lya/b;)I", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final long a(ya.b bVar) throws Exception {
        if (b(bVar) == 0) {
            return -1L;
        }
        ya.d dVarE4 = bVar.e4("SELECT last_insert_rowid()");
        try {
            dVarE4.Y3();
            long j15 = dVarE4.getLong(0);
            cr.a.a(dVarE4, null);
            return j15;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public static final int b(ya.b bVar) throws Exception {
        ya.d dVarE4 = bVar.e4("SELECT changes()");
        try {
            dVarE4.Y3();
            int i15 = (int) dVarE4.getLong(0);
            cr.a.a(dVarE4, null);
            return i15;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }
}
