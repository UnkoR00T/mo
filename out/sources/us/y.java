package us;

/* JADX INFO: loaded from: classes4.dex */
public enum y implements bt.j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static bt.j.b<y> f201178h = new bt.j.b<y>() { // from class: us.y.a
        @Override // bt.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(int i15) {
            return y.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f201180a;

    y(int i15, int i16) {
        this.f201180a = i16;
    }

    public static y b(int i15) {
        if (i15 == 0) {
            return INTERNAL;
        }
        if (i15 == 1) {
            return PRIVATE;
        }
        if (i15 == 2) {
            return PROTECTED;
        }
        if (i15 == 3) {
            return PUBLIC;
        }
        if (i15 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i15 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // bt.j.a
    public final int h() {
        return this.f201180a;
    }
}
