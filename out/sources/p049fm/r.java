package p049fm;

import androidx.compose.ui.platform.b;
import java.io.Closeable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lfm/r;", "", "Landroidx/compose/ui/platform/b;", "view", "Lfm/r$a;", "a", "(Landroidx/compose/ui/platform/b;)Lfm/r$a;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfm/r$a;", "Ljava/io/Closeable;", "Loq/i0;", "j", "()V", "close", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface a extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        default void close() {
            j();
        }

        void j();
    }

    a a(b view);
}
