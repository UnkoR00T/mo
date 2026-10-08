package androidx.p016lifecycle;

import android.app.Application;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/t0;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "T", "Z8", "()Landroid/app/Application;", "b", "Landroid/app/Application;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    public a(Application application) {
        this.application = application;
    }

    public <T extends Application> T Z8() {
        return (T) this.application;
    }
}
