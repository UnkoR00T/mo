package vj;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class j extends wj.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ vh.m f207108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f207109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, vh.m mVar2, vh.m mVar3) {
        super(mVar2);
        this.f207108b = mVar3;
        this.f207109c = mVar;
    }

    @Override // wj.j
    protected final void a() {
        try {
            wj.f fVar = (wj.f) this.f207109c.f207114a.e();
            String str = this.f207109c.f207115b;
            Bundle bundle = new Bundle();
            Map mapA = n.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            m mVar = this.f207109c;
            fVar.Q2(str, bundle, new l(mVar, this.f207108b, mVar.f207115b));
        } catch (RemoteException e15) {
            m.f207113c.b(e15, "error requesting in-app review for %s", this.f207109c.f207115b);
            this.f207108b.d(new RuntimeException(e15));
        }
    }
}
