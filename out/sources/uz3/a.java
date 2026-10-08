package uz3;

import java.util.List;
import lz3.WorkerInfo;
import mu.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006¨\u0006\rÀ\u0006\u0003"}, d2 = {"Luz3/a;", "", "", "taskId", "Loq/i0;", "c", "(Ljava/lang/String;)V", "Lmu/g;", "", "Llz3/l;", "b", "()Lmu/g;", "a", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(String taskId);

    g<List<WorkerInfo>> b();

    void c(String taskId);
}
