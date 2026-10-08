package p079n1;

import android.R;
import android.os.Build;
import fr.k;
import p071kotlin.Metadata;
import w0.s2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Ln1/i1;", "", "", "value", "a", "(I)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n1.i1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, d2 = {"Ln1/i1$a;", "", "<init>", "()V", "Ln1/i1;", "c", "()I", "Cut", "b", "Copy", "d", "Paste", "e", "SelectAll", "a", "Autofill", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a() {
            return i1.a(Build.VERSION.SDK_INT <= 26 ? s2.f209061a : R.string.autofill);
        }

        public final int b() {
            return i1.a(R.string.copy);
        }

        public final int c() {
            return i1.a(R.string.cut);
        }

        public final int d() {
            return i1.a(R.string.paste);
        }

        public final int e() {
            return i1.a(R.string.selectAll);
        }

        private Companion() {
        }
    }

    public static int a(int i15) {
        return i15;
    }
}
