package ig;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class m1 implements hg.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f92229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f92230b;

    m1(v vVar, BasePendingResult basePendingResult) {
        this.f92229a = basePendingResult;
        Objects.requireNonNull(vVar);
        this.f92230b = vVar;
    }

    @Override // hg.h.a
    public final void a(Status status) {
        this.f92230b.f().remove(this.f92229a);
    }
}
