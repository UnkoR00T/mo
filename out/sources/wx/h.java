package wx;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\u0006\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwx/h;", "", "Lwx/f;", "fileType", "<init>", "(Lwx/f;)V", "a", "Lwx/f;", "()Lwx/f;", "d", "c", "e", "b", "Lwx/h$a;", "Lwx/h$b;", "Lwx/h$c;", "Lwx/h$d;", "Lwx/h$e;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f fileType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/h$a;", "Lwx/h;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f215734b = new a();

        private a() {
            super(f.HEIC, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/h$b;", "Lwx/h;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f215735b = new b();

        private b() {
            super(f.HEIF, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/h$c;", "Lwx/h;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f215736b = new c();

        private c() {
            super(f.JPEG, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/h$d;", "Lwx/h;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f215737b = new d();

        private d() {
            super(f.JPG, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx/h$e;", "Lwx/h;", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f215738b = new e();

        private e() {
            super(f.PNG, null);
        }
    }

    public /* synthetic */ h(f fVar, fr.k kVar) {
        this(fVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getFileType() {
        return this.fileType;
    }

    private h(f fVar) {
        this.fileType = fVar;
    }
}
