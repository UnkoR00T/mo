package p056h1;

import f3.m;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf3/m;", "Lh1/w;", "state", "Lh1/r;", "beyondBoundsInfo", "", "reverseLayout", "Lz0/a2;", "orientation", "b", "(Lf3/m;Lh1/w;Lh1/r;ZLz0/a2;)Lf3/m;", "", "c", "()Ljava/lang/Void;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    public static final m b(m mVar, w wVar, r rVar, boolean z15, a2 a2Var) {
        return mVar.u(new s(wVar, rVar, z15, a2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
