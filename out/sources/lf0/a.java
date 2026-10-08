package lf0;

import cf0.c;
import dx.b;
import dx.i;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JL\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0011J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0011¨\u0006\u0017À\u0006\u0003"}, d2 = {"Llf0/a;", "", "", "documentId", "parentDocumentId", "Lcf0/c;", "documentType", "documentScope", "documentSchema", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcf0/c;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "f", "h", "(Ltq/e;)Ljava/lang/Object;", "g", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object e(a aVar, String str, String str2, c cVar, String str3, String str4, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveDocument");
        }
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        if ((i15 & 16) != 0) {
            str4 = null;
        }
        return aVar.d(str, str2, cVar, str3, str4, eVar);
    }

    Object b(String str, e<? super i<? extends b, i0>> eVar);

    Object c(String str, String str2, e<? super i<? extends b, i0>> eVar);

    Object d(String str, String str2, c cVar, String str3, String str4, e<? super i<? extends b, i0>> eVar);

    Object f(String str, e<? super i<? extends b, Boolean>> eVar);

    Object g(String str, e<? super i<? extends b, String>> eVar);

    Object h(e<? super i<? extends b, i0>> eVar);
}
