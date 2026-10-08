package pl.gov.coi.mjunior.technical.async.data.storage;

import fr.q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mr.c;
import oa.a0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.async.data.storage.DownloadTaskDatabase_Impl;
import pq.v;
import ta.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase_Impl;", "Lpl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase;", "<init>", "()V", "Loa/a0;", "g0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lff0/a;", "c0", "()Lff0/a;", "Loq/k;", "s", "Loq/k;", "_downloadTaskDao", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DownloadTaskDatabase_Impl extends DownloadTaskDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<ff0.a> _downloadTaskDao = l.a(new er.a() { // from class: ff0.r
        @Override // er.a
        public final Object a() {
            return DownloadTaskDatabase_Impl.e0(this.f62167a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mjunior/technical/async/data/storage/DownloadTaskDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(3, "bc33c3a76760c338976328aeb3f4aadd", "a28b2e361a9d6524d8966a19873f1ad6");
        }

        @Override // oa.a0
        public void a(ya.b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `download_task_data` (`taskId` TEXT NOT NULL, `documentDownloadMethod` TEXT NOT NULL, `startTimestamp` INTEGER NOT NULL, `taskCompleted` INTEGER NOT NULL, `mainDocumentAuthToken` TEXT, PRIMARY KEY(`taskId`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `included_documents` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `taskOwnerId` TEXT NOT NULL, `documentId` TEXT NOT NULL, `documentType` TEXT NOT NULL, `asyncDownloadTerminationInterval` INTEGER, `multiDocument` INTEGER NOT NULL, `documentStatus` TEXT NOT NULL, `previousDocumentId` TEXT, `documentDownloadMethod` TEXT, `error_businessCode` TEXT, `error_message` TEXT, `error_technicalCode` TEXT, `error_title` TEXT, `error_traceId` TEXT, FOREIGN KEY(`taskOwnerId`) REFERENCES `download_task_data`(`taskId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bc33c3a76760c338976328aeb3f4aadd')");
        }

        @Override // oa.a0
        public void b(ya.b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `download_task_data`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `included_documents`");
        }

        @Override // oa.a0
        public void f(ya.b connection) {
        }

        @Override // oa.a0
        public void g(ya.b connection) throws Exception {
            ya.a.a(connection, "PRAGMA foreign_keys = ON");
            DownloadTaskDatabase_Impl.this.M(connection);
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
            linkedHashMap.put("taskId", new r.a("taskId", "TEXT", true, 1, null, 1));
            linkedHashMap.put("documentDownloadMethod", new r.a("documentDownloadMethod", "TEXT", true, 0, null, 1));
            linkedHashMap.put("startTimestamp", new r.a("startTimestamp", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("taskCompleted", new r.a("taskCompleted", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("mainDocumentAuthToken", new r.a("mainDocumentAuthToken", "TEXT", false, 0, null, 1));
            r rVar = new r("download_task_data", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "download_task_data");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "download_task_data(pl.gov.coi.mjunior.technical.async.data.storage.entity.DownloadTaskDataEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("taskOwnerId", new r.a("taskOwnerId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("documentId", new r.a("documentId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("documentType", new r.a("documentType", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("asyncDownloadTerminationInterval", new r.a("asyncDownloadTerminationInterval", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("multiDocument", new r.a("multiDocument", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("documentStatus", new r.a("documentStatus", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("previousDocumentId", new r.a("previousDocumentId", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("documentDownloadMethod", new r.a("documentDownloadMethod", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("error_businessCode", new r.a("error_businessCode", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("error_message", new r.a("error_message", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("error_technicalCode", new r.a("error_technicalCode", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("error_title", new r.a("error_title", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("error_traceId", new r.a("error_traceId", "TEXT", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new r.c("download_task_data", "CASCADE", "NO ACTION", v.e("taskOwnerId"), v.e("taskId")));
            r rVar2 = new r("included_documents", linkedHashMap2, linkedHashSet, new LinkedHashSet());
            r rVarA2 = companion.a(connection, "included_documents");
            if (rVar2.equals(rVarA2)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "included_documents(pl.gov.coi.mjunior.technical.async.data.storage.entity.DocumentToGenerateEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mjunior.technical.async.data.storage.a e0(DownloadTaskDatabase_Impl downloadTaskDatabase_Impl) {
        return new pl.gov.coi.mjunior.technical.async.data.storage.a(downloadTaskDatabase_Impl);
    }

    @Override // pl.gov.coi.mjunior.technical.async.data.storage.DownloadTaskDatabase
    public ff0.a c0() {
        return this._downloadTaskDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "download_task_data", "included_documents");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(ff0.a.class), pl.gov.coi.mjunior.technical.async.data.storage.a.INSTANCE.a());
        return linkedHashMap;
    }
}
