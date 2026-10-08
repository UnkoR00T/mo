package j4;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f99355a;

    private a(AutofillId autofillId) {
        this.f99355a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f99355a;
    }
}
