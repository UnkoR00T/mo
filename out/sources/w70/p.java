package w70;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lw70/p;", "Lw70/o;", "", "h", "()Z", "b", "g", "", "e", "()I", "c", "", "d", "()Ljava/lang/String;", "Lw70/p$a;", "j", "()Lw70/p$a;", "i", "a", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw70/p$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        ONLY_LOAD_FIRST_PAGE,
        ONLY_LOAD_IF_NEW_PAGE,
        ALLOW_REFRESH;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f210871e = wq.b.a(b());
    }

    default boolean b() {
        return false;
    }

    default int c() {
        return -1;
    }

    default String d() {
        return null;
    }

    default int e() {
        return 1;
    }

    default boolean g() {
        return false;
    }

    default boolean h() {
        return false;
    }

    default boolean i() {
        return true;
    }

    default a j() {
        return a.ALLOW_REFRESH;
    }
}
