package ii;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class l7 extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f92639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f92640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f92641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f92642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f92643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f92644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f92645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f92646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f92647i;

    l7() {
    }

    @Override // ii.h.a
    public final h.a b(Integer num) {
        this.f92640b = num;
        return this;
    }

    @Override // ii.h.a
    public final h.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null fullText");
        }
        this.f92642d = str;
        return this;
    }

    @Override // ii.h.a
    public final h.a d(String str) {
        if (str == null) {
            throw new NullPointerException("Null primaryText");
        }
        this.f92643e = str;
        return this;
    }

    @Override // ii.h.a
    public final h.a e(String str) {
        if (str == null) {
            throw new NullPointerException("Null secondaryText");
        }
        this.f92644f = str;
        return this;
    }

    @Override // ii.h.a
    public final h.a f(List<String> list) {
        if (list == null) {
            throw new NullPointerException("Null types");
        }
        this.f92641c = list;
        return this;
    }

    @Override // ii.h.a
    final h.a g(String str) {
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.f92639a = str;
        return this;
    }

    @Override // ii.h.a
    public final h.a h(List list) {
        if (list == null) {
            throw new NullPointerException("Null fullTextMatchedSubstrings");
        }
        this.f92645g = list;
        return this;
    }

    @Override // ii.h.a
    public final h.a i(List list) {
        if (list == null) {
            throw new NullPointerException("Null primaryTextMatchedSubstrings");
        }
        this.f92646h = list;
        return this;
    }

    @Override // ii.h.a
    public final h.a j(List list) {
        if (list == null) {
            throw new NullPointerException("Null secondaryTextMatchedSubstrings");
        }
        this.f92647i = list;
        return this;
    }

    @Override // ii.h.a
    final h k() {
        List list;
        String str;
        String str2;
        String str3;
        List list2;
        List list3;
        List list4;
        String str4 = this.f92639a;
        if (str4 != null && (list = this.f92641c) != null && (str = this.f92642d) != null && (str2 = this.f92643e) != null && (str3 = this.f92644f) != null && (list2 = this.f92645g) != null && (list3 = this.f92646h) != null && (list4 = this.f92647i) != null) {
            return new x3(str4, this.f92640b, list, str, str2, str3, list2, list3, list4);
        }
        StringBuilder sb5 = new StringBuilder();
        if (this.f92639a == null) {
            sb5.append(" placeId");
        }
        if (this.f92641c == null) {
            sb5.append(" types");
        }
        if (this.f92642d == null) {
            sb5.append(" fullText");
        }
        if (this.f92643e == null) {
            sb5.append(" primaryText");
        }
        if (this.f92644f == null) {
            sb5.append(" secondaryText");
        }
        if (this.f92645g == null) {
            sb5.append(" fullTextMatchedSubstrings");
        }
        if (this.f92646h == null) {
            sb5.append(" primaryTextMatchedSubstrings");
        }
        if (this.f92647i == null) {
            sb5.append(" secondaryTextMatchedSubstrings");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb5.toString()));
    }
}
