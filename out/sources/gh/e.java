package gh;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import hg.f;
import jg.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h<b> {
    public e(Context context, Looper looper, jg.e eVar, f.a aVar, f.b bVar) {
        super(context, looper, 51, eVar, aVar, bVar);
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 11925000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new c(iBinder);
    }
}
