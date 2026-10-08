package jf0;

import cf0.c;
import dx.b;
import dx.i;
import iy.b0;
import java.util.List;
import java.util.Map;
import kf0.AsyncDocumentGenerationResult;
import kf0.DocumentGenerationResponse;
import kf0.DocumentUpdateResponse;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c0\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010\u001f\u001a\u00020\u001aH¦@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Ljf0/a;", "", "", "taskId", "Liy/b0;", "authToken", "Ldx/i;", "Ldx/b;", "Lkf0/a;", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lkf0/b;", "c", "()Lmu/g;", "task", "Loq/i0;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;)V", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Lcf0/c;", "documentsToDownload", "Lkf0/d;", "g", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentsToUpdate", "Lkf0/h;", "e", "(Lcf0/c;Ltq/e;)Ljava/lang/Object;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(String taskId);

    Object b(String str, String str2, e<? super i<? extends b, i0>> eVar);

    g<Map<String, AsyncDocumentGenerationResult>> c();

    Object d(String str, e<? super i0> eVar);

    Object e(c cVar, e<? super i<? extends b, DocumentUpdateResponse>> eVar);

    Object f(String str, b0 b0Var, e<? super i<? extends b, ? extends kf0.a>> eVar);

    Object g(List<? extends c> list, e<? super i<? extends b, DocumentGenerationResponse>> eVar);
}
