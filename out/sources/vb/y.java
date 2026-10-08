package vb;

import cc.WorkGenerationalId;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lvb/y;", "", "Lcc/w;", "id", "Lvb/x;", "f", "(Lcc/w;)Lvb/x;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lcc/w;)Z", "Lcc/i0;", "spec", "d", "(Lcc/i0;)Lvb/x;", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f205900a;

    /* JADX INFO: renamed from: vb.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvb/y$a;", "", "<init>", "()V", "", "synchronized", "Lvb/y;", "b", "(Z)Lvb/y;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f205900a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ y c(Companion companion, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = true;
            }
            return companion.b(z15);
        }

        public final y a() {
            return c(this, false, 1, null);
        }

        public final y b(boolean z15) {
            z zVar = new z();
            return z15 ? new a0(zVar) : zVar;
        }
    }

    static y a() {
        return INSTANCE.a();
    }

    static y b(boolean z15) {
        return INSTANCE.b(z15);
    }

    x c(WorkGenerationalId id5);

    default x d(cc.i0 spec) {
        return f(cc.r1.a(spec));
    }

    boolean e(WorkGenerationalId id5);

    x f(WorkGenerationalId id5);

    List<x> remove(String workSpecId);
}
