package lh;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mh.s0;

/* JADX INFO: loaded from: classes3.dex */
final class q extends rg.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f118234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f118235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected rg.e f118236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final GoogleMapOptions f118237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f118238i = new ArrayList();

    q(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f118234e = viewGroup;
        this.f118235f = context;
        this.f118237h = googleMapOptions;
    }

    @Override // rg.a
    protected final void a(rg.e eVar) {
        this.f118236g = eVar;
        r();
    }

    public final void q(h hVar) {
        if (b() != null) {
            ((p) b()).a(hVar);
        } else {
            this.f118238i.add(hVar);
        }
    }

    public final void r() {
        if (this.f118236g == null || b() != null) {
            return;
        }
        try {
            Context context = this.f118235f;
            g.a(context);
            mh.d dVarH = s0.a(context, null).H(rg.d.o3(context), this.f118237h);
            if (dVarH == null) {
                return;
            }
            this.f118236g.a(new p(this.f118234e, dVarH));
            List list = this.f118238i;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((p) b()).a((h) it.next());
            }
            list.clear();
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        } catch (gg.f unused) {
        }
    }
}
