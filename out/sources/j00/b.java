package j00;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.o;
import er.p;
import j6.z0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj00/b;", "Landroidx/fragment/app/o;", "<init>", "()V", "Loq/i0;", "S1", "(Lm2/r;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "B0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "W0", "(Landroid/view/View;Landroid/os/Bundle;)V", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b extends o {
    public static final int F0 = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T1(b bVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-252078547, i15, -1, "pl.gov.coi.common.navigation.fragments.NavContentContainerFragment.onCreateView.<anonymous>.<anonymous> (NavContentContainerFragment.kt:27)");
            }
            bVar.S1(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // androidx.fragment.app.o
    public View B0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(z1(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(b3.c.f10417b);
        composeView.setContent(m.b(-252078547, true, new p() { // from class: j00.a
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return b.T1(this.f98440a, (r) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    public abstract void S1(r rVar, int i15);

    @Override // androidx.fragment.app.o
    public void W0(View view, Bundle savedInstanceState) {
        super.W0(view, savedInstanceState);
        z0.b(x1().getWindow(), false);
    }
}
