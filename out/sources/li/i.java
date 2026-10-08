package li;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.y41;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f118322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f118323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f118324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y41 f118325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f118326j;

    public i(k kVar, y41 y41Var, int i15) {
        super(new h(null));
        this.f118324h = true;
        this.f118322f = kVar;
        this.f118325i = y41Var;
        this.f118326j = i15;
    }

    @Override // androidx.recyclerview.widget.m
    public final void E(List list) throws Throwable {
        try {
            int size = 0;
            this.f118324h = (this.f118323g != 0 || list == null || list.isEmpty()) ? false : true;
            if (list != null) {
                size = list.size();
            }
            this.f118323g = size;
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
    public final l t(ViewGroup viewGroup, int i15) {
        try {
            return new l(this.f118322f, LayoutInflater.from(viewGroup.getContext()).cloneInContext(new ContextThemeWrapper(viewGroup.getContext(), this.f118326j)).inflate(fi.f.f64081c, viewGroup, false), this.f118325i);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void r(l lVar, int i15) {
        try {
            lVar.O((ii.h) C(i15), this.f118324h);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }
}
