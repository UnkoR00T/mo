package on0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lon0/p0;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "I", "K", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum p0 {
    APPLE("APPLE"),
    ATOM("ATOM"),
    BACTERIA("BACTERIA"),
    BALANCE("BALANCE"),
    BALL("BALL"),
    BELL("BELL"),
    BLOCKS("BLOCKS"),
    BRIEFCASE("BRIEFCASE"),
    BUILDING("BUILDING"),
    CHART("CHART"),
    COLUMN("COLUMN"),
    COMPUTER("COMPUTER"),
    FOLDER("FOLDER"),
    GLASSES("GLASSES"),
    GLOBE("GLOBE"),
    GROUP("GROUP"),
    HAND_GESTURE("HAND_GESTURE"),
    HOURGLASS("HOURGLASS"),
    LANGUAGE("LANGUAGE"),
    LEAF("LEAF"),
    MAGNET("MAGNET"),
    MUSIC_NOTE("MUSIC_NOTE"),
    NOTEBOOK("NOTEBOOK"),
    PALETTE("PALETTE"),
    PEN("PEN"),
    POOL("POOL"),
    PUZZLE("PUZZLE"),
    RULER("RULER"),
    SCISSORS("SCISSORS"),
    SECURITY("SECURITY"),
    SUPPORT("SUPPORT"),
    UNKNOWN("UNKNOWN");

    private static final /* synthetic */ wq.a P = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    p0(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
