package c3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lc3/n;", "", "<init>", "()V", "Loq/i0;", "a", "b", "Lc3/n$a;", "Lc3/n$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc3/n$a;", "Lc3/n;", "Lc3/l;", "snapshot", "<init>", "(Lc3/l;)V", "Loq/i0;", "a", "()V", "Lc3/l;", "getSnapshot", "()Lc3/l;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l snapshot;

        public a(l lVar) {
            super(null);
            this.snapshot = lVar;
        }

        @Override // c3.n
        public void a() throws m {
            this.snapshot.d();
            throw new m(this.snapshot);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lc3/n$b;", "Lc3/n;", "<init>", "()V", "Loq/i0;", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22864a = new b();

        private b() {
            super(null);
        }

        @Override // c3.n
        public void a() {
        }
    }

    public /* synthetic */ n(fr.k kVar) {
        this();
    }

    public abstract void a();

    private n() {
    }
}
