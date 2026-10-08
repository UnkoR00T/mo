package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ub.p0;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerInitializer implements db.a<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13764a = w.i("WrkMgrInitializer");

    @Override // db.a
    public List<Class<? extends db.a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // db.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 b(Context context) {
        w.e().a(f13764a, "Initializing WorkManager with default configuration.");
        p0.j(context, new a.C0293a().a());
        return p0.g(context);
    }
}
