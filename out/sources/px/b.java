package px;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\tJ3\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lpx/b;", "", "", "message", "", "Lpx/a;", "tags", "Loq/i0;", "n7", "(Ljava/lang/String;Ljava/util/List;)V", "u6", "", "throwable", "T6", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void E7(b bVar, String str, List list, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i15 & 2) != 0) {
            list = v.n();
        }
        bVar.u6(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void y5(b bVar, String str, Throwable th4, List list, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i15 & 2) != 0) {
            th4 = null;
        }
        if ((i15 & 4) != 0) {
            list = v.n();
        }
        bVar.T6(str, th4, list);
    }

    void T6(String message, Throwable throwable, List<? extends a> tags);

    void n7(String message, List<? extends a> tags);

    void u6(String message, List<? extends a> tags);
}
