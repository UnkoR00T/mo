package uz;

import androidx.p016lifecycle.q;
import java.util.Arrays;
import m0.n;
import o.i;
import o.j2;
import o.s;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luz/a;", "", "Lm0/n;", "provider", "<init>", "(Lm0/n;)V", "Loq/i0;", "b", "()V", "Landroidx/lifecycle/q;", "lifecycleOwner", "Lo/s;", "cameraSelector", "Lvz/a;", "modeUseCase", "Lo/i;", "a", "(Landroidx/lifecycle/q;Lo/s;Lvz/a;)Lo/i;", "Lm0/n;", "getProvider", "()Lm0/n;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n provider;

    public a(n nVar) {
        this.provider = nVar;
    }

    public final i a(q lifecycleOwner, s cameraSelector, vz.a modeUseCase) {
        n nVar = this.provider;
        j2[] j2VarArr = (j2[]) modeUseCase.d().toArray(new j2[0]);
        return nVar.c(lifecycleOwner, cameraSelector, (j2[]) Arrays.copyOf(j2VarArr, j2VarArr.length));
    }

    public final void b() {
        this.provider.e();
    }
}
