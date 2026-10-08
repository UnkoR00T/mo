package pm;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.b f160819a;

    public d(kl.b bVar) {
        this.f160819a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f160819a.get();
    }
}
