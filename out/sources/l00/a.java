package l00;

import androidx.p016lifecycle.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b!\u0010\u001aJ&\u0010%\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096\u0001¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096\u0001¢\u0006\u0004\b'\u0010&J0\u0010*\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010(2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096\u0001¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\n008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Ll00/a;", "Landroidx/lifecycle/t0;", "Lf00/b;", "Lpx/d;", "destinationDataHolder", "remoteLogger", "<init>", "(Lf00/b;Lpx/d;)V", "", "T", "Lzx/a;", "destination", "value", "Loq/i0;", "I5", "(Lzx/a;Ljava/lang/Object;)V", "c5", "(Lzx/a;)Ljava/lang/Object;", "Y8", "()V", "e5", "(Lzx/a;)V", "", "host", "environment", "g7", "(Ljava/lang/String;Ljava/lang/String;)V", "message", "Lpx/d$a;", "category", "F8", "(Ljava/lang/String;Lpx/d$a;)V", "key", "p", "", "Lpx/a;", "tags", "n7", "(Ljava/lang/String;Ljava/util/List;)V", "u6", "", "throwable", "T6", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "b", "Lf00/b;", "c", "Lpx/d;", "", "d", "Ljava/util/Set;", "storedDestinations", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 implements f00.b, px.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f00.b destinationDataHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<zx.a> storedDestinations = new LinkedHashSet();

    public a(f00.b bVar, px.d dVar) {
        this.destinationDataHolder = bVar;
        this.remoteLogger = dVar;
    }

    @Override // px.d
    public void F8(String message, px.d.a category) {
        this.remoteLogger.F8(message, category);
    }

    @Override // f00.b
    public <T> void I5(zx.a destination, T value) {
        this.storedDestinations.add(destination);
        this.destinationDataHolder.I5(destination, value);
    }

    @Override // px.b
    public void T6(String message, Throwable throwable, List<? extends px.a> tags) {
        this.remoteLogger.T6(message, throwable, tags);
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        super.Y8();
        Iterator<T> it = this.storedDestinations.iterator();
        while (it.hasNext()) {
            this.destinationDataHolder.e5((zx.a) it.next());
        }
        this.storedDestinations.clear();
    }

    @Override // f00.d
    public <T> T c5(zx.a destination) {
        T t15 = (T) this.destinationDataHolder.c5(destination);
        if (t15 == null) {
            return null;
        }
        if (destination.e()) {
            this.destinationDataHolder.e5(destination);
            this.storedDestinations.remove(destination);
        }
        return t15;
    }

    @Override // f00.b
    public void e5(zx.a destination) {
        this.destinationDataHolder.e5(destination);
    }

    @Override // px.d
    public void g7(String host, String environment) {
        this.remoteLogger.g7(host, environment);
    }

    @Override // px.b
    public void n7(String message, List<? extends px.a> tags) {
        this.remoteLogger.n7(message, tags);
    }

    @Override // px.d
    public void p(String key, String value) {
        this.remoteLogger.p(key, value);
    }

    @Override // px.b
    public void u6(String message, List<? extends px.a> tags) {
        this.remoteLogger.u6(message, tags);
    }
}
