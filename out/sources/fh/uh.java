package fh;

/* JADX INFO: loaded from: classes3.dex */
public enum uh implements x1 {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7),
    PIXEL_AI(8);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63575a;

    uh(int i15) {
        this.f63575a = i15;
    }

    @Override // fh.x1
    public final int zza() {
        return this.f63575a;
    }
}
