package ki;

import androidx.annotation.RecentlyNonNull;
import er.l;
import ii.l0;
import ji.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "placeId", "", "utcTimeMillis", "Lkotlin/Function1;", "Lji/k$a;", "Loq/i0;", "actions", "Lji/k;", "b", "(Ljava/lang/String;Ljava/lang/Long;Ler/l;)Lji/k;", "Lii/l0;", "place", "a", "(Lii/l0;Ljava/lang/Long;Ler/l;)Lji/k;", "java.com.google.android.libraries.places.api.net.kotlin_kotlin_3p"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class b {
    public static final k a(@RecentlyNonNull l0 l0Var, Long l15, l<? super k.a, i0> lVar) {
        k.a aVarB = l15 == null ? k.b(l0Var) : k.c(l0Var, l15.longValue());
        if (lVar != null) {
            lVar.b(aVarB);
        }
        return aVarB.a();
    }

    public static final k b(@RecentlyNonNull String str, Long l15, l<? super k.a, i0> lVar) {
        k.a aVarD = l15 == null ? k.d(str) : k.e(str, l15.longValue());
        if (lVar != null) {
            lVar.b(aVarD);
        }
        return aVarD.a();
    }
}
