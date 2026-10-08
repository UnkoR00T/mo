package rj;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f174578a;

    /* synthetic */ f(e eVar) {
    }

    public final d a() {
        l lVar = this.f174578a;
        if (lVar != null) {
            return new x(lVar, null);
        }
        throw new IllegalStateException(String.valueOf(l.class.getCanonicalName()).concat(" must be set"));
    }

    public final f b(l lVar) {
        this.f174578a = lVar;
        return this;
    }
}
