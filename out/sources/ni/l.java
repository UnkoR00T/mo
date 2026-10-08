package ni;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import java.util.List;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ib.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f136425m;

    public l(FragmentManager fragmentManager, androidx.p016lifecycle.j jVar) {
        super(fragmentManager, jVar);
        this.f136425m = v.n();
    }

    @Override // ib.a
    public final o E(int i15) {
        int i16 = k.N0;
        c cVar = (c) this.f136425m.get(i15);
        int size = this.f136425m.size() - 1;
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putParcelable("page_data", cVar);
        bundle.putBoolean("has_previous", i15 > 0);
        bundle.putBoolean("has_next", i15 < size);
        kVar.F1(bundle);
        return kVar;
    }

    public final void W(List list) {
        this.f136425m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int g() {
        return this.f136425m.size();
    }
}
