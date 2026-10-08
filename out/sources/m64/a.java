package m64;

import java.util.List;
import n64.SearchEntryEntity;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lm64/a;", "", "", "limit", "Lmu/g;", "", "Ln64/b;", "c", "(I)Lmu/g;", "searchEntry", "Loq/i0;", "d", "(Ln64/b;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(tq.e<? super i0> eVar);

    mu.g<List<SearchEntryEntity>> c(int limit);

    Object d(SearchEntryEntity searchEntryEntity, tq.e<? super i0> eVar);
}
