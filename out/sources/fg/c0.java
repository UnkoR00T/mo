package fg;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class c0 extends a0 {
    c0(int i15, int i16, Bundle bundle) {
        super(i15, i16, bundle);
    }

    @Override // fg.a0
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // fg.a0
    final boolean b() {
        return false;
    }
}
