package us;

/* JADX INFO: loaded from: classes4.dex */
public enum l implements bt.j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static bt.j.b<l> f200880f = new bt.j.b<l>() { // from class: us.l.a
        @Override // bt.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i15) {
            return l.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f200882a;

    l(int i15, int i16) {
        this.f200882a = i16;
    }

    public static l b(int i15) {
        if (i15 == 0) {
            return FINAL;
        }
        if (i15 == 1) {
            return OPEN;
        }
        if (i15 == 2) {
            return ABSTRACT;
        }
        if (i15 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // bt.j.a
    public final int h() {
        return this.f200882a;
    }
}
