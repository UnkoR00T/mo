package l;

import h.g1;
import h.i1;
import h.p0;
import io.sentry.android.core.c2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR$\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ll/d;", "Lh/g1$a;", "Ll/j$b;", "", "requestsUntilActive", "<init>", "(J)V", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "result", "Loq/i0;", "K", "(Lh/i1;JLh/p0;)V", "a", "()V", "c", "d", "J", "Liu/d;", "b", "Liu/d;", "frameCount", "Ll/j;", "Ll/j;", "_graphLoop", "value", "j", "()Ll/j;", "k", "(Ll/j;)V", "graphLoop", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements g1.a, GraphLoop.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long requestsUntilActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iu.d frameCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private GraphLoop _graphLoop;

    public d(long j15) {
        this.requestsUntilActive = j15;
        if (j15 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.frameCount = iu.b.e(0L);
    }

    @Override // h.g1.a
    public void K(i1 requestMetadata, long frameNumber, p0 result) {
        long value;
        long j15;
        iu.d dVar = this.frameCount;
        do {
            value = dVar.getValue();
            j15 = value != -1 ? 1 + value : -1L;
        } while (!dVar.a(value, j15));
        if (j15 == this.requestsUntilActive) {
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Capture processing is now enabled for " + this._graphLoop + " after " + j15 + " frames.");
            }
            get_graphLoop().u0(true);
        }
    }

    @Override // l.GraphLoop.b
    public void a() {
    }

    @Override // l.GraphLoop.b
    public void c() {
        long value;
        iu.d dVar = this.frameCount;
        do {
            value = dVar.getValue();
        } while (!dVar.a(value, value != -1 ? 0L : -1L));
        get_graphLoop().u0(false);
        if (k.k.f107055a.d()) {
            c2.g("CXCP", "Capture processing has been disabled for " + get_graphLoop() + " until " + this.requestsUntilActive + " frames have been completed.");
        }
    }

    @Override // l.GraphLoop.b
    public void d() {
        this.frameCount.d(-1L);
        get_graphLoop().u0(false);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final GraphLoop get_graphLoop() {
        return this._graphLoop;
    }

    public final void k(GraphLoop graphLoop) {
        if (this._graphLoop != null) {
            throw new IllegalStateException("GraphLoop has already been set!");
        }
        this._graphLoop = graphLoop;
        graphLoop.u0(false);
        if (k.k.f107055a.d()) {
            c2.g("CXCP", "Capture processing has been disabled for " + graphLoop + " until " + this.requestsUntilActive + " frames have been completed.");
        }
    }
}
