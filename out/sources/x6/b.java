package x6;

import android.content.Context;
import er.l;
import java.util.List;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "name", "Lv6/b;", "Ly6/h;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lu6/g;", "produceMigrations", "Lju/p0;", "scope", "Lir/d;", "Lu6/i;", "b", "(Ljava/lang/String;Lv6/b;Ler/l;Lju/p0;)Lir/d;", "datastore-preferences"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final ir.d<Context, u6.i<y6.h>> b(String str, v6.b<y6.h> bVar, l<? super Context, ? extends List<? extends u6.g<y6.h>>> lVar, p0 p0Var) {
        return new e(str, bVar, lVar, p0Var);
    }

    public static /* synthetic */ ir.d c(String str, v6.b bVar, l lVar, p0 p0Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        if ((i15 & 4) != 0) {
            lVar = new l() { // from class: x6.a
                @Override // er.l
                public final Object b(Object obj2) {
                    return b.d((Context) obj2);
                }
            };
        }
        if ((i15 & 8) != 0) {
            p0Var = q0.a(g1.b().n0(z2.b(null, 1, null)));
        }
        return b(str, bVar, lVar, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Context context) {
        return v.n();
    }
}
