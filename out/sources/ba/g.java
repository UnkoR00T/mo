package ba;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p071kotlin.Metadata;
import p136y9.j0;
import p136y9.y0;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u001aB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0013\u0010\f\u001a\u00060\bj\u0002`\tH\u0000¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\"\u0010\u0012\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u001a\u0010\rR\u001e\u0010%\u001a\u00060\bj\u0002`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lba/g;", "", "Ly9/w;", "entry", "", "destId", "<init>", "(Ly9/w;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "state", "(Landroid/os/Bundle;)V", "e", "()Landroid/os/Bundle;", "Lba/h;", "context", "Ly9/y0;", "destination", "args", "Landroidx/lifecycle/j$b;", "hostLifecycleState", "Ly9/j0;", "viewModel", "d", "(Lba/h;Ly9/y0;Landroid/os/Bundle;Landroidx/lifecycle/j$b;Ly9/j0;)Ly9/w;", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "b", "I", "()I", "destinationId", "Landroid/os/Bundle;", "getSavedState$navigation_runtime_release", "savedState", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    public g(p136y9.w wVar, int i15) {
        oq.r[] rVarArr;
        this.id = wVar.getId();
        this.destinationId = i15;
        this.args = wVar.c();
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new oq.r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
        }
        Bundle bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        this.savedState = bundleA;
        wVar.p(bundleA);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final p136y9.w d(h context, y0 destination, Bundle args, androidx.lifecycle.j.b hostLifecycleState, j0 viewModel) {
        return p136y9.w.INSTANCE.a(context, destination, args, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    public final Bundle e() {
        oq.r[] rVarArr;
        oq.r[] rVarArr2;
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new oq.r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
        }
        Bundle bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        Bundle bundleA2 = ua.k.a(bundleA);
        ua.k.p(bundleA2, "nav-entry-state:id", this.id);
        ua.k.g(bundleA2, "nav-entry-state:destination-id", this.destinationId);
        Bundle bundleA3 = this.args;
        if (bundleA3 == null) {
            Map mapI2 = v0.i();
            if (mapI2.isEmpty()) {
                rVarArr2 = new oq.r[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapI2.size());
                for (Map.Entry entry2 : mapI2.entrySet()) {
                    arrayList2.add(oq.y.a((String) entry2.getKey(), entry2.getValue()));
                }
                rVarArr2 = (oq.r[]) arrayList2.toArray(new oq.r[0]);
            }
            bundleA3 = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr2, rVarArr2.length));
            ua.k.a(bundleA3);
        }
        ua.k.n(bundleA2, "nav-entry-state:args", bundleA3);
        ua.k.n(bundleA2, "nav-entry-state:saved-state", this.savedState);
        return bundleA;
    }

    public g(Bundle bundle) {
        this.id = ua.c.r(ua.c.a(bundle), "nav-entry-state:id");
        this.destinationId = ua.c.j(ua.c.a(bundle), "nav-entry-state:destination-id");
        this.args = ua.c.o(ua.c.a(bundle), "nav-entry-state:args");
        this.savedState = ua.c.o(ua.c.a(bundle), "nav-entry-state:saved-state");
    }
}
