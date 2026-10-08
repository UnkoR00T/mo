package ba;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lba/h;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "id", "", "c", "(I)Ljava/lang/String;", "a", "()Ljava/lang/Object;", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public h(Context context) {
        this.context = context;
    }

    public final Object a() {
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final String c(int id5) {
        try {
            return this.context.getResources().getResourceName(id5);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(id5);
        }
    }
}
