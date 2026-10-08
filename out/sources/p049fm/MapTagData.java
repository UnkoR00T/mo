package p049fm;

import android.content.ComponentCallbacks;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fm.g2, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lfm/g2;", "", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "Lfm/w1;", "lifecycleObserver", "<init>", "(Landroid/content/ComponentCallbacks;Lfm/w1;)V", "a", "()Landroid/content/ComponentCallbacks;", "b", "()Lfm/w1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/ComponentCallbacks;", "getComponentCallbacks", "Lfm/w1;", "getLifecycleObserver", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class MapTagData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComponentCallbacks componentCallbacks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final w1 lifecycleObserver;

    public MapTagData(ComponentCallbacks componentCallbacks, w1 w1Var) {
        this.componentCallbacks = componentCallbacks;
        this.lifecycleObserver = w1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w1 getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapTagData)) {
            return false;
        }
        MapTagData mapTagData = (MapTagData) other;
        return t.c(this.componentCallbacks, mapTagData.componentCallbacks) && t.c(this.lifecycleObserver, mapTagData.lifecycleObserver);
    }

    public int hashCode() {
        return (this.componentCallbacks.hashCode() * 31) + this.lifecycleObserver.hashCode();
    }

    public String toString() {
        return "MapTagData(componentCallbacks=" + this.componentCallbacks + ", lifecycleObserver=" + this.lifecycleObserver + ')';
    }
}
