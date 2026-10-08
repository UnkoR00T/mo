package pl.gov.coi.mobywatel.technical.async.data.storage;

import dx.i;
import java.util.List;
import lz3.DownloadTaskData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\rH¦@¢\u0006\u0004\b\u0013\u0010\u0005¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "", "", "Llz3/i;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "id", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "taskData", "Loq/i0;", "b", "(Llz3/i;Ltq/e;)Ljava/lang/Object;", "g", "", "c", "f", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(tq.e<? super List<DownloadTaskData>> eVar);

    Object b(DownloadTaskData downloadTaskData, tq.e<? super i0> eVar);

    Object c(String str, tq.e<? super Boolean> eVar);

    Object e(String str, tq.e<? super i<? extends dx.b, DownloadTaskData>> eVar);

    Object f(tq.e<? super i0> eVar);

    Object g(String str, tq.e<? super i0> eVar);
}
