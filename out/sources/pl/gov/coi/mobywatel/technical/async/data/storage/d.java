package pl.gov.coi.mobywatel.technical.async.data.storage;

import java.util.Map;
import lz3.DocumentDownloadStatus;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/data/storage/d;", "", "Lrq0/b;", "documentType", "Llz3/f;", "documentDownloadStatus", "Loq/i0;", "i", "(Lrq0/b;Llz3/f;Ltq/e;)Ljava/lang/Object;", "h", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "", "j", "(Ltq/e;)Ljava/lang/Object;", "k", "g", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    Object g(tq.e<? super i0> eVar);

    Object h(rq0.b bVar, tq.e<? super DocumentDownloadStatus> eVar);

    Object i(rq0.b bVar, DocumentDownloadStatus documentDownloadStatus, tq.e<? super i0> eVar);

    Object j(tq.e<? super Map<rq0.b, DocumentDownloadStatus>> eVar);

    Object k(rq0.b bVar, tq.e<? super i0> eVar);
}
