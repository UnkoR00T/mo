package ai;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import yh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b<i> {
    @Override // p087nuL.b0
    public final /* bridge */ /* synthetic */ Object c(int i15, Intent intent) {
        return h(i15, intent);
    }

    @Override // ai.b
    public a<i> h(int i15, Intent intent) {
        if (i15 != 1) {
            return super.h(i15, intent);
        }
        Status statusA = yh.a.a(intent);
        if (statusA == null) {
            statusA = Status.f29009h;
        }
        return new a<>(statusA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ai.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i i(Intent intent) {
        return i.h(intent);
    }
}
