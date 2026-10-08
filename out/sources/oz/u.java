package oz;

import android.content.Intent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Loz/u;", "Loz/t;", "Loz/s;", "<init>", "()V", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "a", "LCON/p;", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements t, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CON.p activity;

    @Override // oz.t
    public void a() {
        CON.p pVar = this.activity;
        if (pVar == null) {
            return;
        }
        Intent intent = new Intent(pVar, pVar.getClass());
        intent.addFlags(32768);
        pVar.startActivity(intent);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.activity = activity;
    }
}
