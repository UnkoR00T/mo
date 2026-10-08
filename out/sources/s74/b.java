package s74;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Ls74/b;", "", "", "id", "Ls74/c;", "group", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ls74/c;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ls74/c;", "g", "()Ls74/c;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    MAIN_GENERAL_CHANNEL("mobywatel_main_general_channel_id", null, 2, null);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ wq.a f178888e = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c group;

    b(String str, c cVar) {
        this.id = str;
        this.group = cVar;
    }

    public static wq.a<b> e() {
        return f178888e;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
    }

    /* synthetic */ b(String str, c cVar, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? null : cVar);
    }
}
