package pl.gov.coi.mobywatel.technical.containers.data.database;

import fr.q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l24.j;
import l24.n;
import oa.a0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.containers.data.database.ContainersDatabase_Impl;
import pq.v;
import ta.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001f¨\u0006&"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/database/ContainersDatabase_Impl;", "Lpl/gov/coi/mobywatel/technical/containers/data/database/ContainersDatabase;", "<init>", "()V", "Loa/a0;", "j0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Ll24/n;", "b0", "()Ll24/n;", "Ll24/a;", "a0", "()Ll24/a;", "Loq/k;", "q", "Loq/k;", "_documentsDao", "r", "_certificateDao", "Ll24/j;", "s", "_containerFilesDao", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContainersDatabase_Impl extends ContainersDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k<n> _documentsDao = l.a(new er.a() { // from class: l24.k
        @Override // er.a
        public final Object a() {
            return ContainersDatabase_Impl.h0(this.f115482a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k<l24.a> _certificateDao = l.a(new er.a() { // from class: l24.l
        @Override // er.a
        public final Object a() {
            return ContainersDatabase_Impl.f0(this.f115487a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<j> _containerFilesDao = l.a(new er.a() { // from class: l24.m
        @Override // er.a
        public final Object a() {
            return ContainersDatabase_Impl.g0(this.f115491a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/technical/containers/data/database/ContainersDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(1, "f6672759c903f09a9348b455e9bdce07", "c40acbb575d7652f0d1f52cccd87ec2e");
        }

        @Override // oa.a0
        public void a(ya.b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `documentEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `documentId` TEXT NOT NULL, `documentType` TEXT NOT NULL, `expirationDate` TEXT, `lastUpdateTimestamp` INTEGER NOT NULL, `status` TEXT NOT NULL, `parentDocumentId` TEXT, `parentCertificateId` INTEGER NOT NULL, FOREIGN KEY(`parentCertificateId`) REFERENCES `parentCertificate`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`parentDocumentId`) REFERENCES `documentEntity`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_documentEntity_documentId` ON `documentEntity` (`documentId`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_documentEntity_parentDocumentId` ON `documentEntity` (`parentDocumentId`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_documentEntity_parentCertificateId` ON `documentEntity` (`parentCertificateId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `document_scope` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `documentContainerId` TEXT NOT NULL, `scopeName` TEXT NOT NULL, `scopeData` BLOB NOT NULL, FOREIGN KEY(`documentContainerId`) REFERENCES `documentEntity`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_document_scope_documentContainerId` ON `document_scope` (`documentContainerId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `document_schema` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `documentContainerId` TEXT NOT NULL, `schema` BLOB NOT NULL, FOREIGN KEY(`documentContainerId`) REFERENCES `documentEntity`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_document_schema_documentContainerId` ON `document_schema` (`documentContainerId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `containerFilesEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ownerDocumentId` TEXT NOT NULL, `creationDate` TEXT NOT NULL, `fileName` TEXT NOT NULL, `fileExtension` TEXT NOT NULL, `sizeInBytes` REAL NOT NULL, `fileBytes` BLOB NOT NULL, FOREIGN KEY(`ownerDocumentId`) REFERENCES `documentEntity`(`documentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `parentCertificate` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `certificate` BLOB NOT NULL, `privateKey` BLOB NOT NULL, `status` TEXT NOT NULL, `type` TEXT NOT NULL, `ticket` TEXT NOT NULL)");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_parentCertificate_id` ON `parentCertificate` (`id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f6672759c903f09a9348b455e9bdce07')");
        }

        @Override // oa.a0
        public void b(ya.b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `documentEntity`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `document_scope`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `document_schema`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `containerFilesEntity`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `parentCertificate`");
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
            linkedHashMap.put("expirationDate", new r.a("expirationDate", "TEXT", false, 0, null, 1));
            linkedHashMap.put("lastUpdateTimestamp", new r.a("lastUpdateTimestamp", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("status", new r.a("status", "TEXT", true, 0, null, 1));
            linkedHashMap.put("parentDocumentId", new r.a("parentDocumentId", "TEXT", false, 0, null, 1));
            linkedHashMap.put("parentCertificateId", new r.a("parentCertificateId", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new r.c("parentCertificate", "NO ACTION", "NO ACTION", v.e("parentCertificateId"), v.e("id")));
            linkedHashSet.add(new r.c("documentEntity", "CASCADE", "NO ACTION", v.e("parentDocumentId"), v.e("documentId")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_documentEntity_documentId", true, v.e("documentId"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_documentEntity_parentDocumentId", false, v.e("parentDocumentId"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_documentEntity_parentCertificateId", false, v.e("parentCertificateId"), v.e("ASC")));
            r rVar = new r("documentEntity", linkedHashMap, linkedHashSet, linkedHashSet2);
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "documentEntity");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "documentEntity(pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("documentContainerId", new r.a("documentContainerId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("scopeName", new r.a("scopeName", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("scopeData", new r.a("scopeData", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            linkedHashSet3.add(new r.c("documentEntity", "CASCADE", "NO ACTION", v.e("documentContainerId"), v.e("documentId")));
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new r.d("index_document_scope_documentContainerId", false, v.e("documentContainerId"), v.e("ASC")));
            r rVar2 = new r("document_scope", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            r rVarA2 = companion.a(connection, "document_scope");
            if (!rVar2.equals(rVarA2)) {
                return new a0.a(false, "document_scope(pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentScopeEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap3.put("documentContainerId", new r.a("documentContainerId", "TEXT", true, 0, null, 1));
            linkedHashMap3.put("schema", new r.a("schema", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new r.c("documentEntity", "CASCADE", "NO ACTION", v.e("documentContainerId"), v.e("documentId")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new r.d("index_document_schema_documentContainerId", false, v.e("documentContainerId"), v.e("ASC")));
            r rVar3 = new r("document_schema", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            r rVarA3 = companion.a(connection, "document_schema");
            if (!rVar3.equals(rVarA3)) {
                return new a0.a(false, "document_schema(pl.gov.coi.mobywatel.technical.containers.data.database.entities.DocumentSchemaEntity).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap4.put("ownerDocumentId", new r.a("ownerDocumentId", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("creationDate", new r.a("creationDate", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("fileName", new r.a("fileName", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("fileExtension", new r.a("fileExtension", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("sizeInBytes", new r.a("sizeInBytes", "REAL", true, 0, null, 1));
            linkedHashMap4.put("fileBytes", new r.a("fileBytes", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new r.c("documentEntity", "CASCADE", "NO ACTION", v.e("ownerDocumentId"), v.e("documentId")));
            r rVar4 = new r("containerFilesEntity", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            r rVarA4 = companion.a(connection, "containerFilesEntity");
            if (!rVar4.equals(rVarA4)) {
                return new a0.a(false, "containerFilesEntity(pl.gov.coi.mobywatel.technical.containers.data.database.entities.ContainerFileEntity).\n Expected:\n" + rVar4 + "\n Found:\n" + rVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap5.put("certificate", new r.a("certificate", "BLOB", true, 0, null, 1));
            linkedHashMap5.put("privateKey", new r.a("privateKey", "BLOB", true, 0, null, 1));
            linkedHashMap5.put("status", new r.a("status", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("type", new r.a("type", "TEXT", true, 0, null, 1));
            linkedHashMap5.put("ticket", new r.a("ticket", "TEXT", true, 0, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new r.d("index_parentCertificate_id", true, v.e("id"), v.e("ASC")));
            r rVar5 = new r("parentCertificate", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            r rVarA5 = companion.a(connection, "parentCertificate");
            if (rVar5.equals(rVarA5)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "parentCertificate(pl.gov.coi.mobywatel.technical.containers.data.database.entities.CertificateEntity).\n Expected:\n" + rVar5 + "\n Found:\n" + rVarA5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mobywatel.technical.containers.data.database.a f0(ContainersDatabase_Impl containersDatabase_Impl) {
        return new pl.gov.coi.mobywatel.technical.containers.data.database.a(containersDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b g0(ContainersDatabase_Impl containersDatabase_Impl) {
        return new b(containersDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c h0(ContainersDatabase_Impl containersDatabase_Impl) {
        return new c(containersDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.technical.containers.data.database.ContainersDatabase
    public l24.a a0() {
        return this._certificateDao.getValue();
    }

    @Override // pl.gov.coi.mobywatel.technical.containers.data.database.ContainersDatabase
    public n b0() {
        return this._documentsDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<mr.c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "documentEntity", "document_scope", "document_schema", "containerFilesEntity", "parentCertificate");
    }

    @Override // oa.u
    public Set<mr.c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<mr.c<?>, List<mr.c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(n.class), c.INSTANCE.a());
        linkedHashMap.put(q0.c(l24.a.class), pl.gov.coi.mobywatel.technical.containers.data.database.a.INSTANCE.a());
        linkedHashMap.put(q0.c(j.class), b.INSTANCE.a());
        return linkedHashMap;
    }
}
