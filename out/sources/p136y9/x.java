package p136y9;

import android.content.Context;
import android.os.Bundle;
import androidx.p016lifecycle.j;
import ba.g;
import ba.h;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0011\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u0016\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0019\u0010\u0016\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000b¨\u0006%"}, d2 = {"Ly9/x;", "", "Ly9/w;", "entry", "<init>", "(Ly9/w;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "state", "(Landroid/os/Bundle;)V", "f", "()Landroid/os/Bundle;", "Lba/h;", "context", "Ly9/y0;", "destination", "Landroidx/lifecycle/j$b;", "hostLifecycleState", "Ly9/j0;", "viewModel", "d", "(Lba/h;Ly9/y0;Landroidx/lifecycle/j$b;Ly9/j0;)Ly9/w;", "args", "e", "(Landroid/os/Bundle;Lba/h;)Landroid/os/Bundle;", "Lba/g;", "a", "Lba/g;", "impl", "", "c", "()Ljava/lang/String;", "id", "", "b", "()I", "destinationId", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g impl;

    public x(w wVar) {
        this.impl = new g(wVar, wVar.getDestination().o());
    }

    public final Bundle a() {
        return this.impl.getArgs();
    }

    public final int b() {
        return this.impl.getDestinationId();
    }

    public final String c() {
        return this.impl.getId();
    }

    public final w d(h context, y0 destination, j.b hostLifecycleState, j0 viewModel) {
        Bundle bundleA = a();
        return this.impl.d(context, destination, bundleA != null ? e(bundleA, context) : null, hostLifecycleState, viewModel);
    }

    public final Bundle e(Bundle args, h context) {
        Context context2 = context.getContext();
        args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        return args;
    }

    public final Bundle f() {
        return this.impl.e();
    }

    public x(Bundle bundle) {
        bundle.setClassLoader(x.class.getClassLoader());
        this.impl = new g(bundle);
    }
}
