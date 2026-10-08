package p056h1;

import f3.m;
import g4.q1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lh1/g3;", "Lf3/m$c;", "Lg4/q1;", "Lh1/l1;", "prefetchState", "<init>", "(Lh1/l1;)V", "r", "Lh1/l1;", "n3", "()Lh1/l1;", "p3", "", "s", "Ljava/lang/String;", "o3", "()Ljava/lang/String;", "traverseKey", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g3 extends m.c implements q1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l1 prefetchState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public g3(l1 l1Var) {
        this.prefetchState = l1Var;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final l1 getPrefetchState() {
        return this.prefetchState;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: o3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public final void p3(l1 l1Var) {
        this.prefetchState = l1Var;
    }
}
