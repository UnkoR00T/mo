package oz;

import android.os.Bundle;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Loz/f;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "onCreate", "(Landroid/os/Bundle;)V", "onRestoreInstanceState", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f extends androidx.appcompat.app.c {
    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState == null || g.INSTANCE.a()) {
            super.onCreate(savedInstanceState);
        } else {
            super.onCreate(null);
        }
        g.INSTANCE.b(true);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        if (g.INSTANCE.a()) {
            super.onRestoreInstanceState(savedInstanceState);
        }
    }
}
