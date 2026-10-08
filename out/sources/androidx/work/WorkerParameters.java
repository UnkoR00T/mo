package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import tq.i;
import ub.h0;
import ub.l;
import ub.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f13765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f13766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f13767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f13768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f13770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f13771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ec.b f13772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u0 f13773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h0 f13774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f13775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13776l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f13777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<Uri> f13778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f13779c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f13777a = list;
            this.f13778b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i15, int i16, Executor executor, i iVar, ec.b bVar2, u0 u0Var, h0 h0Var, l lVar) {
        this.f13765a = uuid;
        this.f13766b = bVar;
        this.f13767c = new HashSet(collection);
        this.f13768d = aVar;
        this.f13769e = i15;
        this.f13776l = i16;
        this.f13770f = executor;
        this.f13771g = iVar;
        this.f13772h = bVar2;
        this.f13773i = u0Var;
        this.f13774j = h0Var;
        this.f13775k = lVar;
    }

    public Executor a() {
        return this.f13770f;
    }

    public l b() {
        return this.f13775k;
    }

    public UUID c() {
        return this.f13765a;
    }

    public i d() {
        return this.f13771g;
    }
}
