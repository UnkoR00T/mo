package li;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.google.android.libraries.places.internal.n41;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f118313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f118314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f118315h;

    public d(e eVar) {
        super(new c(null));
        this.f118315h = true;
        this.f118313f = eVar;
    }

    @Override // androidx.recyclerview.widget.m
    public final void E(List list) throws Throwable {
        try {
            int size = 0;
            this.f118315h = (this.f118314g != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                size = list.size();
            }
            this.f118314g = size;
            super.E(list);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final g t(ViewGroup viewGroup, int i15) {
        try {
            return new g(this.f118313f, LayoutInflater.from(viewGroup.getContext()).inflate(fi.f.f64089k, viewGroup, false));
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void r(g gVar, int i15) {
        try {
            gVar.O((ii.h) C(i15), this.f118315h);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }
}
