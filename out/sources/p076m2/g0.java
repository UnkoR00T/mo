package p076m2;

import e3.o;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lm2/g0;", "", "Le3/o;", "observer", "", "root", "Lm2/v;", "parent", "<init>", "(Le3/o;ZLm2/v;)V", "a", "()Le3/o;", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "b", "Lm2/v;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v parent;

    public g0(o oVar, boolean z15, v vVar) {
        this.root = z15;
        this.parent = vVar;
    }

    public final o a() {
        if (this.root) {
            return null;
        }
        this.parent.l();
        t.c(null, null);
        return null;
    }

    public /* synthetic */ g0(o oVar, boolean z15, v vVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : oVar, (i15 & 2) != 0 ? false : z15, vVar);
    }
}
