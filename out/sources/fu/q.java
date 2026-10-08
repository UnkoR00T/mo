package fu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lfu/q;", "", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "a", "I", "e", "()I", "b", "getMask", "c", "d", "f", "g", "h", "j", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum q {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(32, 0, 2, null),
    CANON_EQ(128, 0, 2, null);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ wq.a f67100l = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    q(int i15, int i16) {
        this.value = i15;
        this.mask = i16;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int getValue() {
        return this.value;
    }

    /* synthetic */ q(int i15, int i16, int i17, fr.k kVar) {
        this(i15, (i17 & 2) != 0 ? i15 : i16);
    }
}
