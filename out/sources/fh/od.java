package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pd f63430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f63431b;

    public final od a(pd pdVar) {
        this.f63430a = pdVar;
        return this;
    }

    public final od b(Integer num) {
        this.f63431b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final rd d() {
        return new rd(this, null);
    }
}
