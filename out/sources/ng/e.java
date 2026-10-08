package ng;

import android.os.Parcelable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ e f135908a = new e();

    private /* synthetic */ e() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        gg.c cVar = (gg.c) obj2;
        gg.c cVar2 = (gg.c) obj;
        Parcelable.Creator<a> creator = a.CREATOR;
        return !cVar2.m().equals(cVar.m()) ? cVar2.m().compareTo(cVar.m()) : Long.compare(cVar2.p(), cVar.p());
    }
}
