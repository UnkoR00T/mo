package bh;

/* JADX INFO: loaded from: classes3.dex */
final class c0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f19418d;

    c0() {
    }

    @Override // bh.h0
    public final h0 a(boolean z15) {
        this.f19416b = true;
        this.f19418d = (byte) (1 | this.f19418d);
        return this;
    }

    @Override // bh.h0
    public final h0 b(int i15) {
        this.f19417c = 1;
        this.f19418d = (byte) (this.f19418d | 2);
        return this;
    }

    @Override // bh.h0
    public final i0 c() {
        String str;
        if (this.f19418d == 3 && (str = this.f19415a) != null) {
            return new e0(str, this.f19416b, this.f19417c, null);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f19415a == null) {
            sb5.append(" libraryName");
        }
        if ((this.f19418d & 1) == 0) {
            sb5.append(" enableFirelog");
        }
        if ((this.f19418d & 2) == 0) {
            sb5.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    public final h0 d(String str) {
        this.f19415a = "common";
        return this;
    }
}
