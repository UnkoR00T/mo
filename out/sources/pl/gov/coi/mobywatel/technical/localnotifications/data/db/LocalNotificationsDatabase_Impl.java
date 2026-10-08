package pl.gov.coi.mobywatel.technical.localnotifications.data.db;

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
import pl.gov.coi.mobywatel.technical.localnotifications.data.db.LocalNotificationsDatabase_Impl;
import pq.v;
import ta.r;
import w54.j;
import w54.u;
import ya.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010!\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase_Impl;", "Lpl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase;", "<init>", "()V", "Loa/a0;", "g0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Loq/k;", "Lw54/a;", "o", "Loq/k;", "_localDocumentsNotificationsDao", "Lw54/k;", "p", "_localVehiclesNotificationsDao", "Z", "()Lw54/a;", "documentsDao", "a0", "()Lw54/k;", "vehiclesDao", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocalNotificationsDatabase_Impl extends LocalNotificationsDatabase {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final k<w54.a> _localDocumentsNotificationsDao = l.a(new er.a() { // from class: u54.a
        @Override // er.a
        public final Object a() {
            return LocalNotificationsDatabase_Impl.d0(this.f195519a);
        }
    });

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k<w54.k> _localVehiclesNotificationsDao = l.a(new er.a() { // from class: u54.b
        @Override // er.a
        public final Object a() {
            return LocalNotificationsDatabase_Impl.e0(this.f195520a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/technical/localnotifications/data/db/LocalNotificationsDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(2, "c8bad3a7a496eca443e89e4621890112", "f828360901ed68cb421a533f8c62afe7");
        }

        @Override // oa.a0
        public void a(b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `LocalDocumentNotifications` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ConfigId` TEXT NOT NULL, `DocumentType` TEXT NOT NULL, `DocumentSubType` TEXT NOT NULL, `ExpirationDate` TEXT NOT NULL, `NotificationDate` TEXT NOT NULL, `Status` TEXT NOT NULL)");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_LocalDocumentNotifications_ConfigId` ON `LocalDocumentNotifications` (`ConfigId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `LocalVehicleNotifications` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ReminderId` TEXT NOT NULL, `ConfigId` TEXT NOT NULL, `DocumentType` TEXT NOT NULL, `RegisterNo` TEXT NOT NULL, `ExpirationDate` TEXT NOT NULL, `NotificationDate` TEXT NOT NULL, `Status` TEXT NOT NULL)");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_LocalVehicleNotifications_ReminderId` ON `LocalVehicleNotifications` (`ReminderId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c8bad3a7a496eca443e89e4621890112')");
        }

        @Override // oa.a0
        public void b(b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `LocalDocumentNotifications`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `LocalVehicleNotifications`");
        }

        @Override // oa.a0
        public void f(b connection) {
        }

        @Override // oa.a0
        public void g(b connection) {
            LocalNotificationsDatabase_Impl.this.M(connection);
        }

        @Override // oa.a0
        public void h(b connection) {
        }

        @Override // oa.a0
        public void i(b connection) {
            ta.a.a(connection);
        }

        @Override // oa.a0
        public a0.a j(b connection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap.put("ConfigId", new r.a("ConfigId", "TEXT", true, 0, null, 1));
            linkedHashMap.put("DocumentType", new r.a("DocumentType", "TEXT", true, 0, null, 1));
            linkedHashMap.put("DocumentSubType", new r.a("DocumentSubType", "TEXT", true, 0, null, 1));
            linkedHashMap.put("ExpirationDate", new r.a("ExpirationDate", "TEXT", true, 0, null, 1));
            linkedHashMap.put("NotificationDate", new r.a("NotificationDate", "TEXT", true, 0, null, 1));
            linkedHashMap.put("Status", new r.a("Status", "TEXT", true, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_LocalDocumentNotifications_ConfigId", true, v.e("ConfigId"), v.e("ASC")));
            r rVar = new r("LocalDocumentNotifications", linkedHashMap, linkedHashSet, linkedHashSet2);
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "LocalDocumentNotifications");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "LocalDocumentNotifications(pl.gov.coi.mobywatel.technical.localnotifications.data.model.LocalDocumentNotificationEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("ReminderId", new r.a("ReminderId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("ConfigId", new r.a("ConfigId", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("DocumentType", new r.a("DocumentType", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("RegisterNo", new r.a("RegisterNo", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("ExpirationDate", new r.a("ExpirationDate", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("NotificationDate", new r.a("NotificationDate", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("Status", new r.a("Status", "TEXT", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new r.d("index_LocalVehicleNotifications_ReminderId", true, v.e("ReminderId"), v.e("ASC")));
            r rVar2 = new r("LocalVehicleNotifications", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            r rVarA2 = companion.a(connection, "LocalVehicleNotifications");
            if (rVar2.equals(rVarA2)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "LocalVehicleNotifications(pl.gov.coi.mobywatel.technical.localnotifications.data.model.LocalVehicleNotificationEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j d0(LocalNotificationsDatabase_Impl localNotificationsDatabase_Impl) {
        return new j(localNotificationsDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e0(LocalNotificationsDatabase_Impl localNotificationsDatabase_Impl) {
        return new u(localNotificationsDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.technical.localnotifications.data.db.LocalNotificationsDatabase
    public w54.a Z() {
        return this._localDocumentsNotificationsDao.getValue();
    }

    @Override // pl.gov.coi.mobywatel.technical.localnotifications.data.db.LocalNotificationsDatabase
    public w54.k a0() {
        return this._localVehiclesNotificationsDao.getValue();
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
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "LocalDocumentNotifications", "LocalVehicleNotifications");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(w54.a.class), j.INSTANCE.a());
        linkedHashMap.put(q0.c(w54.k.class), u.INSTANCE.a());
        return linkedHashMap;
    }
}
