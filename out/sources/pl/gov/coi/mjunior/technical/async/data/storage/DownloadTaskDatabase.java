package pl.gov.coi.mjunior.technical.async.data.storage;

import fr.k;
import oa.u;
import p071kotlin.Metadata;
import za.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase;", "Loa/u;", "<init>", "()V", "Lff0/a;", "c0", "()Lff0/a;", "o", "c", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DownloadTaskDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f158240p = o10.b.b("async_download_task_db");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ra.b f158241q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ra.b f158242r = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase$a", "Lra/b;", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ra.b {
        a() {
            super(1, 2);
        }

        @Override // ra.b
        public void b(c db5) {
            db5.E0("ALTER TABLE included_documents ADD COLUMN previousDocumentId TEXT");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase$b", "Lra/b;", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ra.b {
        b() {
            super(2, 3);
        }

        @Override // ra.b
        public void b(c db5) {
            db5.E0("ALTER TABLE included_documents ADD COLUMN documentDownloadMethod TEXT");
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.data.storage.DownloadTaskDatabase$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase$c;", "", "<init>", "()V", "Lo10/b;", "DATABASE_NAME", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lra/b;", "MIGRATION_1_2", "Lra/b;", "b", "()Lra/b;", "MIGRATION_2_3", "c", "", "VERSION_1", "I", "VERSION_2", "VERSION_3", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a() {
            return DownloadTaskDatabase.f158240p;
        }

        public final ra.b b() {
            return DownloadTaskDatabase.f158241q;
        }

        public final ra.b c() {
            return DownloadTaskDatabase.f158242r;
        }

        private Companion() {
        }
    }

    public abstract ff0.a c0();
}
