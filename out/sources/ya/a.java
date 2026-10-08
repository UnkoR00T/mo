package ya;

import android.database.SQLException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lya/b;", "", "sql", "Loq/i0;", "a", "(Lya/b;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "b", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(b bVar, String str) throws Exception {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            cr.a.a(dVarE4, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public static final Void b(int i15, String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Error code: " + i15);
        if (str != null) {
            sb5.append(", message: " + str);
        }
        throw new SQLException(sb5.toString());
    }
}
