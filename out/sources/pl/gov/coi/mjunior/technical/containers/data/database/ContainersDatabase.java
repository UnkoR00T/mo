package pl.gov.coi.mjunior.technical.containers.data.database;

import fr.k;
import gg0.l;
import oa.u;
import p071kotlin.Metadata;
import za.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase;", "Loa/u;", "<init>", "()V", "Lgg0/l;", "d0", "()Lgg0/l;", "Lgg0/a;", "c0", "()Lgg0/a;", "o", "c", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContainersDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f158581p = o10.b.b("containers_db");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ra.b f158582q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ra.b f158583r = new b();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase$a", "Lra/b;", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ra.b {
        a() {
            super(1, 2);
        }

        @Override // ra.b
        public void b(c db5) {
            db5.E0("ALTER TABLE container ADD COLUMN expirationDate TEXT");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase$b", "Lra/b;", "Lza/c;", "db", "Loq/i0;", "b", "(Lza/c;)V", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ra.b {
        b() {
            super(2, 3);
        }

        @Override // ra.b
        public void b(c db5) {
            db5.E0("CREATE TABLE IF NOT EXISTS `container_schema` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `containerId` TEXT NOT NULL, \n    `data` BLOB NOT NULL, \n    FOREIGN KEY(`containerId`) REFERENCES `container`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE \n)");
            db5.E0("CREATE INDEX IF NOT EXISTS `index_container_schema_containerId` ON `container_schema` (`containerId`)");
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase$c;", "", "<init>", "()V", "Lo10/b;", "DATABASE_NAME", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lra/b;", "MIGRATION_1_2", "Lra/b;", "b", "()Lra/b;", "MIGRATION_2_3", "c", "", "VERSION_1", "I", "VERSION_2", "VERSION_3", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final String a() {
            return ContainersDatabase.f158581p;
        }

        public final ra.b b() {
            return ContainersDatabase.f158582q;
        }

        public final ra.b c() {
            return ContainersDatabase.f158583r;
        }

        private Companion() {
        }
    }

    public abstract gg0.a c0();

    public abstract l d0();
}
