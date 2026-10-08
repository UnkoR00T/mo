package ai;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import vh.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> extends d<T, a<T>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ai.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a<T> f(l<T> lVar) {
        if (lVar.q()) {
            return new a<>(lVar.m(), Status.f29007f);
        }
        if (lVar.o()) {
            return new a<>(new Status(16, "The task has been canceled."));
        }
        Status status = this.f6374a;
        return status != null ? new a<>(status) : new a<>(Status.f29009h);
    }

    public a<T> h(int i15, Intent intent) {
        if (i15 != -1) {
            return i15 != 0 ? new a<>(null, Status.f29009h) : new a<>(null, Status.f29011k);
        }
        T tI = intent != null ? i(intent) : null;
        return tI != null ? new a<>(tI, Status.f29007f) : new a<>(null, Status.f29009h);
    }

    protected abstract T i(Intent intent);
}
