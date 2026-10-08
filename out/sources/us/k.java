package us;

/* JADX INFO: loaded from: classes4.dex */
public enum k implements bt.j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static bt.j.b<k> f200873f = new bt.j.b<k>() { // from class: us.k.a
        @Override // bt.j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(int i15) {
            return k.b(i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f200875a;

    k(int i15, int i16) {
        this.f200875a = i16;
    }

    public static k b(int i15) {
        if (i15 == 0) {
            return DECLARATION;
        }
        if (i15 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i15 == 2) {
            return DELEGATION;
        }
        if (i15 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // bt.j.a
    public final int h() {
        return this.f200875a;
    }
}
