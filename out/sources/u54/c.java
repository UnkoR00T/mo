package u54;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu54/c;", "Lra/b;", "<init>", "()V", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends ra.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f195521c = new c();

    private c() {
        super(1, 2);
    }

    @Override // ra.b
    public void b(za.c db5) {
        db5.E0("ALTER TABLE LocalDocumentNotifications ADD COLUMN DocumentSubType TEXT NOT NULL DEFAULT ''");
    }
}
