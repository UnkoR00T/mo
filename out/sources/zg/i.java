package zg;

import android.location.Location;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class i implements vh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ vh.m f235082a;

    @Override // vh.c
    public final /* synthetic */ Object a(vh.l lVar) {
        hg.a aVar = g.f235074m;
        vh.m mVar = this.f235082a;
        if (lVar.q()) {
            mVar.e((Location) lVar.m());
            return null;
        }
        Exception excL = lVar.l();
        Objects.requireNonNull(excL);
        mVar.d(excL);
        return null;
    }
}
