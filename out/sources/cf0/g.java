package cf0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\u0005j\u0002\b\f¨\u0006\r"}, d2 = {"Lcf0/g;", "", "<init>", "(Ljava/lang/String;I)V", "", "e", "()Z", "isFinished", "a", "b", "c", "d", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum g {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f25624h = wq.b.a(b());

    public final boolean e() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
