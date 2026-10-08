package w43;

import fr.k;
import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lw43/a;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "Lw43/a$a;", "Lw43/a$b;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: w43.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw43/a$a;", "Lw43/a;", "", "url", "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C5526a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String url;

        public C5526a(String str) {
            super(str, null);
            this.url = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw43/a$b;", "Lw43/a;", "", "url", "Liy/a0;", "postData", "<init>", "(Ljava/lang/String;Liy/a0;)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Liy/a0;", "a", "()Liy/a0;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f210206d = a0.f97720c;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a0 postData;

        public b(String str, a0 a0Var) {
            super(str, null);
            this.url = str;
            this.postData = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a0 getPostData() {
            return this.postData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ a(String str, k kVar) {
        this(str);
    }

    private a(String str) {
        this.url = str;
    }
}
