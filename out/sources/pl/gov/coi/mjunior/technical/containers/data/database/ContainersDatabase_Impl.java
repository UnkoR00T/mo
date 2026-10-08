package pl.gov.coi.mjunior.technical.containers.data.database;

import fr.q0;
import gg0.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mr.c;
import oa.a0;
import oq.k;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase_Impl;
import pq.v;
import ta.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase_Impl;", "Lpl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase;", "<init>", "()V", "Loa/a0;", "j0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lgg0/l;", "d0", "()Lgg0/l;", "Lgg0/a;", "c0", "()Lgg0/a;", "Loq/k;", "s", "Loq/k;", "_documentDao", "t", "_certificateDao", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContainersDatabase_Impl extends ContainersDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<l> _documentDao = oq.l.a(new er.a() { // from class: gg0.j
        @Override // er.a
        public final Object a() {
            return ContainersDatabase_Impl.h0(this.f72780a);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k<gg0.a> _certificateDao = oq.l.a(new er.a() { // from class: gg0.k
        @Override // er.a
        public final Object a() {
            return ContainersDatabase_Impl.g0(this.f72781a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mjunior/technical/containers/data/database/ContainersDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(3, "0c9ff89954d593e1b929d09bf4775ec6", "6eb073f04d6fdfebcae9c1824a6e8911");
        }

        @Override // oa.a0
        public void a(ya.b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `container` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `documentId` TEXT NOT NULL, `documentType` TEXT NOT NULL, `status` TEXT NOT NULL, `expirationDate` TEXT, `identityId` INTEGER, `parentId` TEXT, FOREIGN KEY(`identityId`) REFERENCES `identity`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_container_documentId` ON `container` (`documentId`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_container_identityId` ON `container` (`identityId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `container_scope` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `containerId` TEXT NOT NULL, `name` TEXT NOT NULL, `data` BLOB NOT NULL, FOREIGN KEY(`containerId`) REFERENCES `container`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_container_scope_containerId` ON `container_scope` (`containerId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `identity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `certificate` BLOB NOT NULL, `privatekey` BLOB NOT NULL, `status` TEXT NOT NULL, `termsAccepted` INTEGER NOT NULL)");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_identity_id` ON `identity` (`id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `container_schema` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `containerId` TEXT NOT NULL, `data` BLOB NOT NULL, FOREIGN KEY(`containerId`) REFERENCES `container`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_container_schema_containerId` ON `container_schema` (`containerId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0c9ff89954d593e1b929d09bf4775ec6')");
        }

        @Override // oa.a0
        public void b(ya.b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `container`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `container_scope`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `identity`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `container_schema`");
        }

        @Override // oa.a0
        public void f(ya.b connection) {
        }

        @Override // oa.a0
        public void g(ya.b connection) throws Exception {
            ya.a.a(connection, "PRAGMA foreign_keys = ON");
            ContainersDatabase_Impl.this.M(connection);
        }

        @Override // oa.a0
        public void h(ya.b connection) {
        }

        @Override // oa.a0
        public void i(ya.b connection) {
            ta.a.a(connection);
        }

        @Override // oa.a0
        public a0.a j(ya.b connection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("documentId", new r.a("documentId", "TEXT", true, 0, null, 1));
            linkedHashMap.put("documentType", new r.a("documentType", "TEXT", true, 0, null, 1));
            linkedHashMap.put("status", new r.a("status", "TEXT", true, 0, null, 1));
            linkedHashMap.put("expirationDate", new r.a("expirationDate", "TEXT", false, 0, null, 1));
            linkedHashMap.put("identityId", new r.a("identityId", "INTEGER", false, 0, null, 1));
            linkedHashMap.put("parentId", new r.a("parentId", "TEXT", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new r.c("identity", "NO ACTION", "NO ACTION", v.e("identityId"), v.e("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_container_documentId", true, v.e("documentId"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_container_identityId", false, v.e("identityId"), v.e("ASC")));
            r rVar = new r("container", linkedHashMap, linkedHashSet, linkedHashSet2);
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "container");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "container(pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("containerId", new r.a("containerId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("name", new r.a("name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("data", new r.a("data", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            linkedHashSet3.add(new r.c("container", "CASCADE", "NO ACTION", v.e("containerId"), v.e("documentId")));
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new r.d("index_container_scope_containerId", false, v.e("containerId"), v.e("ASC")));
            r rVar2 = new r("container_scope", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            r rVarA2 = companion.a(connection, "container_scope");
            if (!rVar2.equals(rVarA2)) {
                return new a0.a(false, "container_scope(pl.gov.coi.mjunior.technical.containers.data.database.entities.ScopeEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap3.put("certificate", new r.a("certificate", "BLOB", true, 0, null, 1));
            linkedHashMap3.put("privatekey", new r.a("privatekey", "BLOB", true, 0, null, 1));
            linkedHashMap3.put("status", new r.a("status", "TEXT", true, 0, null, 1));
            linkedHashMap3.put("termsAccepted", new r.a("termsAccepted", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new r.d("index_identity_id", true, v.e("id"), v.e("ASC")));
            r rVar3 = new r("identity", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            r rVarA3 = companion.a(connection, "identity");
            if (!rVar3.equals(rVarA3)) {
                return new a0.a(false, "identity(pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateEntity).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap4.put("containerId", new r.a("containerId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("data", new r.a("data", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new r.c("container", "CASCADE", "NO ACTION", v.e("containerId"), v.e("documentId")));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new r.d("index_container_schema_containerId", false, v.e("containerId"), v.e("ASC")));
            r rVar4 = new r("container_schema", linkedHashMap4, linkedHashSet7, linkedHashSet8);
            r rVarA4 = companion.a(connection, "container_schema");
            if (rVar4.equals(rVarA4)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "container_schema(pl.gov.coi.mjunior.technical.containers.data.database.entities.SchemaEntity).\n Expected:\n" + rVar4 + "\n Found:\n" + rVarA4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mjunior.technical.containers.data.database.a g0(ContainersDatabase_Impl containersDatabase_Impl) {
        return new pl.gov.coi.mjunior.technical.containers.data.database.a(containersDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b h0(ContainersDatabase_Impl containersDatabase_Impl) {
        return new b(containersDatabase_Impl);
    }

    @Override // pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase
    public gg0.a c0() {
        return this._certificateDao.getValue();
    }

    @Override // pl.gov.coi.mjunior.technical.containers.data.database.ContainersDatabase
    public l d0() {
        return this._documentDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "container", "container_scope", "identity", "container_schema");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(l.class), b.INSTANCE.a());
        linkedHashMap.put(q0.c(gg0.a.class), pl.gov.coi.mjunior.technical.containers.data.database.a.INSTANCE.a());
        return linkedHashMap;
    }
}
