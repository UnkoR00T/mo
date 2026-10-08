package qu;

import ju.l0;
import ou.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqu/k;", "Lju/l0;", "<init>", "()V", "Ltq/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "K1", "(Ltq/i;Ljava/lang/Runnable;)V", "F1", "", "parallelism", "", "name", "S1", "(ILjava/lang/String;)Lju/l0;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f168941c = new k();

    private k() {
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        c.f168925j.j2(block, true, false);
    }

    @Override // ju.l0
    public void K1(tq.i context, Runnable block) {
        c.f168925j.j2(block, true, true);
    }

    @Override // ju.l0
    public l0 S1(int parallelism, String name) {
        m.a(parallelism);
        return parallelism >= j.f168938d ? m.b(this, name) : super.S1(parallelism, name);
    }

    @Override // ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }
}
