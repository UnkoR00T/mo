package q7;

import androidx.p016lifecycle.y0;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lq7/b;", "", "<init>", "()V", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "Lm2/c4;", "d", "(Landroidx/lifecycle/y0;)Lm2/c4;", "Lm2/b4;", "b", "Lm2/b4;", "LocalViewModelStoreOwner", "c", "(Lm2/r;I)Landroidx/lifecycle/y0;", "current", "lifecycle-viewmodel-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f165175a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b4<y0> LocalViewModelStoreOwner = d0.h(null, new er.a() { // from class: q7.a
        @Override // er.a
        public final Object a() {
            return b.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165177c = 0;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 b() {
        return null;
    }

    public final y0 c(r rVar, int i15) {
        if (t.k()) {
            t.o(-584162872, i15, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:35)");
        }
        y0 y0VarA = (y0) rVar.N(LocalViewModelStoreOwner);
        if (y0VarA == null) {
            rVar.X(1260197608);
            y0VarA = c.a(rVar, 0);
        } else {
            rVar.X(1260196492);
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return y0VarA;
    }

    public final c4<y0> d(y0 viewModelStoreOwner) {
        return LocalViewModelStoreOwner.d(viewModelStoreOwner);
    }
}
