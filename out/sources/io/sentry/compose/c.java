package io.sentry.compose;

import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import fr.k;
import io.sentry.util.p;
import io.sentry.z6;
import p071kotlin.Metadata;
import p136y9.e0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/sentry/compose/c;", "Landroidx/lifecycle/n;", "Ly9/e0;", "navController", "Ly9/e0$c;", "navListener", "<init>", "(Ly9/e0;Ly9/e0$c;)V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "a", "()V", "Ly9/e0;", "b", "Ly9/e0$c;", "c", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f94793c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94794d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e0 navController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0.c navListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/compose/c$a;", "", "<init>", "()V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        z6.d().b("maven:io.sentry:sentry-compose", "8.22.0");
    }

    public c(e0 e0Var, e0.c cVar) {
        this.navController = e0Var;
        this.navListener = cVar;
        p.a("ComposeNavigation");
    }

    public final void a() {
        this.navController.O(this.navListener);
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        if (event == j.a.ON_RESUME) {
            this.navController.i(this.navListener);
        } else if (event == j.a.ON_PAUSE) {
            this.navController.O(this.navListener);
        }
    }
}
