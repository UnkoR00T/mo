package z9;

import androidx.p016lifecycle.t0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lz9/a;", "Landroidx/lifecycle/t0;", "Landroidx/lifecycle/i0;", "handle", "<init>", "(Landroidx/lifecycle/i0;)V", "Loq/i0;", "Y8", "()V", "", "b", "Ljava/lang/String;", "IdKey", "c", "Z8", "()Ljava/lang/String;", "id", "Laa/c;", "Lb3/i;", "d", "Laa/c;", "a9", "()Laa/c;", "b9", "(Laa/c;)V", "saveableStateHolderRef", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public aa.c<b3.i> saveableStateHolderRef;

    public a(androidx.p016lifecycle.i0 i0Var) {
        String strD = (String) i0Var.a("SaveableStateHolder_BackStackEntryKey");
        if (strD == null) {
            strD = aa.b.d();
            i0Var.c("SaveableStateHolder_BackStackEntryKey", strD);
        }
        this.id = strD;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        super.Y8();
        b3.i iVarB = a9().b();
        if (iVarB != null) {
            iVarB.a(this.id);
        }
        a9().a();
    }

    /* JADX INFO: renamed from: Z8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final aa.c<b3.i> a9() {
        aa.c<b3.i> cVar = this.saveableStateHolderRef;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final void b9(aa.c<b3.i> cVar) {
        this.saveableStateHolderRef = cVar;
    }
}
