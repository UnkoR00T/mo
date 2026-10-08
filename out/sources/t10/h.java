package t10;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lt10/h;", "Lcz/c;", "Landroid/content/Context;", "context", "Lt10/k;", "sharedPreferencesFactory", "Lxw/d;", "dispatcherProvider", "<init>", "(Landroid/content/Context;Lt10/k;Lxw/d;)V", "", "identifier", "Lcz/d;", "type", "Lcz/b;", "a", "(Ljava/lang/String;Lcz/d;)Lcz/b;", "Landroid/content/Context;", "b", "Lt10/k;", "c", "Lxw/d;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements cz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k sharedPreferencesFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    public h(Context context, k kVar, xw.d dVar) {
        this.context = context;
        this.sharedPreferencesFactory = kVar;
        this.dispatcherProvider = dVar;
    }

    @Override // cz.c
    public cz.b a(String identifier, cz.d type) {
        return new j(this.context, this.sharedPreferencesFactory, this.dispatcherProvider, type, identifier);
    }
}
