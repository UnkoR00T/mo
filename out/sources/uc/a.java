package uc;

import java.util.Map;
import kc.n;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\"\u0010\"\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!¨\u0006&"}, d2 = {"Luc/a;", "Luc/i;", "Luc/j;", "weakMemoryCache", "<init>", "(Luc/j;)V", "Luc/d$b;", "key", "Luc/d$c;", "a", "(Luc/d$b;)Luc/d$c;", "Lkc/n;", "image", "", "", "", "extras", "", "size", "Loq/i0;", "d", "(Luc/d$b;Lkc/n;Ljava/util/Map;J)V", "", "f", "(Luc/d$b;)Z", "e", "(J)V", "clear", "()V", "Luc/j;", "b", "J", "getMaxSize", "()J", "maxSize", "getSize", "c", "initialMaxSize", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    public a(j jVar) {
        this.weakMemoryCache = jVar;
    }

    @Override // uc.i
    public d.Value a(d.Key key) {
        return null;
    }

    @Override // uc.i
    public void b(long j15) {
        this.maxSize = j15;
    }

    @Override // uc.i
    /* JADX INFO: renamed from: c */
    public long getInitialMaxSize() {
        return 0L;
    }

    @Override // uc.i
    public void clear() {
    }

    @Override // uc.i
    public void d(d.Key key, n image, Map<String, ? extends Object> extras, long size) {
        this.weakMemoryCache.d(key, image, extras, size);
    }

    @Override // uc.i
    public void e(long size) {
    }

    @Override // uc.i
    public boolean f(d.Key key) {
        return false;
    }

    @Override // uc.i
    public long getSize() {
        return 0L;
    }
}
