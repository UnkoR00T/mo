package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class w2 extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f92840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f92841c;

    w2() {
    }

    @Override // ii.b.a
    public final b.a b(String str) {
        this.f92840b = str;
        return this;
    }

    @Override // ii.b.a
    final b.a c(List list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.f92841c = list;
        return this;
    }

    @Override // ii.b.a
    final b d() {
        List list;
        String str = this.f92839a;
        if (str != null && (list = this.f92841c) != null) {
            return new k3(str, this.f92840b, list);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92839a == null) {
            sb5.append(" name");
        }
        if (this.f92841c == null) {
            sb5.append(" types");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }

    final b.a e(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f92839a = str;
        return this;
    }
}
