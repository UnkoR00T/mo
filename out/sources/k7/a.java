package k7;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import ub.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, nq.a<b<? extends androidx.work.c>>> f108863a;

    a(Map<String, nq.a<b<? extends androidx.work.c>>> map) {
        this.f108863a = map;
    }

    @Override // ub.u0
    public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        nq.a<b<? extends androidx.work.c>> aVar = this.f108863a.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.get().a(context, workerParameters);
    }
}
