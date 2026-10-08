package p00;

import fv.b0;
import fv.d0;
import fv.w;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lp00/i;", "Lfv/w;", "Lpx/d;", "remoteLogger", "<init>", "(Lpx/d;)V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Lpx/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    public i(px.d dVar) {
        this.remoteLogger = dVar;
    }

    @Override // fv.w
    public d0 a(w.a chain) throws Exception {
        b0 b0VarC = chain.C();
        try {
            d0 d0VarA = chain.a(b0VarC);
            if (d0VarA.isSuccessful()) {
                this.remoteLogger.F8("HTTP success: " + b0VarC.getUrl(), px.d.a.NETWORK);
                return d0VarA;
            }
            px.b.y5(this.remoteLogger, "HTTP error: " + b0VarC.getUrl() + " (" + d0VarA.getCode() + ')', null, px.c.a(this), 2, null);
            return d0VarA;
        } catch (Exception e15) {
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            this.remoteLogger.T6("HTTP error: " + b0VarC.getUrl() + ", message: " + e15.getMessage(), e15, px.c.a(this));
            throw new o00.c(b0VarC.getUrl().getUrl(), e15);
        }
    }
}
