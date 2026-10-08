package sz3;

import dx.b;
import dx.i;
import fr0.BEAsyncDocumentGenerationResult;
import iy.b0;
import java.util.Map;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import lz3.h;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00120\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H&¢\u0006\u0004\b\u0019\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u0018H¦@¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\u0012H¦@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001fH¦@¢\u0006\u0004\b(\u0010)J*\u0010,\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\b\u0010 \u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eH¦@¢\u0006\u0004\b.\u0010'J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u0002H¦@¢\u0006\u0004\b0\u0010\b¨\u00061À\u0006\u0003"}, d2 = {"Lsz3/a;", "", "", "taskId", "Ldx/i;", "Ldx/b;", "Lfr0/a;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "authToken", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "documentId", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lfr0/d;", "c", "()Lmu/g;", "a", "(Ljava/lang/String;)V", "Lrq0/b;", "m", "Llz3/e;", "status", "h", "(Llz3/e;Ltq/e;)Ljava/lang/Object;", "documentType", "Llz3/h;", "documentIID", "k", "(Lrq0/b;Llz3/h;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Llz3/f;", "n", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "i", "(Ltq/e;)Ljava/lang/Object;", "j", "(Llz3/h;Ltq/e;)Ljava/lang/Object;", "", "emitInfo", "l", "(Lrq0/b;ZLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "g", "task", "d", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(String taskId);

    Object b(String str, String str2, e<? super i<? extends b, i0>> eVar);

    g<Map<String, BEAsyncDocumentGenerationResult>> c();

    Object d(String str, e<? super i0> eVar);

    Object e(String str, e<? super i<? extends b, ? extends fr0.a>> eVar);

    Object f(String str, b0 b0Var, e<? super i<? extends b, ? extends fr0.a>> eVar);

    Object g(e<? super i0> eVar);

    Object h(DocumentDownloadSingleStatus documentDownloadSingleStatus, e<? super i0> eVar);

    Object i(e<? super Map<rq0.b, DocumentDownloadStatus>> eVar);

    Object j(h hVar, e<? super i0> eVar);

    Object k(rq0.b bVar, h hVar, String str, e<? super i0> eVar);

    Object l(rq0.b bVar, boolean z15, String str, e<? super i0> eVar);

    g<rq0.b> m();

    Object n(rq0.b bVar, e<? super DocumentDownloadStatus> eVar);
}
