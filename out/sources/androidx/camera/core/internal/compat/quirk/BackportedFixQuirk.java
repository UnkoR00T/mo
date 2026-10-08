package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import t5.c;
import v.c3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk;", "Lv/c3;", "<init>", "()V", "Lt5/c;", "f", "()Lt5/c;", "", "g", "()Z", "b", "a", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public abstract class BackportedFixQuirk implements c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k<t5.a> f9264c = l.a(new er.a() { // from class: d0.a
        @Override // er.a
        public final Object a() {
            return BackportedFixQuirk.e();
        }
    });

    /* JADX INFO: renamed from: androidx.camera.core.internal.compat.quirk.BackportedFixQuirk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/BackportedFixQuirk$a;", "", "<init>", "()V", "Lt5/a;", "backportedFixManager$delegate", "Loq/k;", "a", "()Lt5/a;", "backportedFixManager", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final t5.a a() {
            return (t5.a) BackportedFixQuirk.f9264c.getValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t5.a e() {
        return new t5.a();
    }

    public abstract c f();

    public final boolean g() {
        return !INSTANCE.a().b(f());
    }
}
