package vb;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvb/f1;", "Lra/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "c", "Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 extends ra.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public f1(Context context) {
        super(9, 10);
        this.context = context;
    }

    @Override // ra.b
    public void b(za.c db5) {
        db5.E0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        dc.s.c(this.context, db5);
        dc.k.c(this.context, db5);
    }
}
