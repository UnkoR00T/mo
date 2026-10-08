package fg;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class z extends a0 {
    z(int i15, int i16, Bundle bundle) {
        super(i15, i16, bundle);
    }

    @Override // fg.a0
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new b0(4, "Invalid response to one way request", null));
        }
    }

    @Override // fg.a0
    final boolean b() {
        return true;
    }
}
