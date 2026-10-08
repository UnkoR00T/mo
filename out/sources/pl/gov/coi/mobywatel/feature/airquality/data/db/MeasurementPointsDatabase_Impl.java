package pl.gov.coi.mobywatel.feature.airquality.data.db;

import dy0.f;
import dy0.g;
import dy0.h;
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
import pl.gov.coi.mobywatel.feature.airquality.data.db.MeasurementPointsDatabase_Impl;
import ta.r;
import ya.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase_Impl;", "Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase;", "<init>", "()V", "Loa/a0;", "d0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Loq/k;", "Ldy0/a;", "q", "Loq/k;", "_measurementPointsDao", "Z", "()Ldy0/a;", "dao", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MeasurementPointsDatabase_Impl extends MeasurementPointsDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k<dy0.a> _measurementPointsDao = l.a(new er.a() { // from class: dy0.i
        @Override // er.a
        public final Object a() {
            return MeasurementPointsDatabase_Impl.b0(this.f45496a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(4, "2b588b8e3f66652f828e121f715941d6", "5d4412990c655460a2d39bae3631be7f");
        }

        @Override // oa.a0
        public void a(b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `MeasurementPointEntity` (`id` TEXT NOT NULL, `timestamp` TEXT NOT NULL DEFAULT '', `expirationTimestamp` TEXT NOT NULL DEFAULT '', `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `name` TEXT NOT NULL, `street` TEXT, `postcode` TEXT NOT NULL, `city` TEXT NOT NULL, `rate` TEXT NOT NULL, `humidity` REAL, `pressure` REAL, `temperature` REAL, `pm10value` REAL, `pm25value` REAL, PRIMARY KEY(`id`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2b588b8e3f66652f828e121f715941d6')");
        }

        @Override // oa.a0
        public void b(b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `MeasurementPointEntity`");
        }

        @Override // oa.a0
        public void f(b connection) {
        }

        @Override // oa.a0
        public void g(b connection) {
            MeasurementPointsDatabase_Impl.this.M(connection);
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
            linkedHashMap.put("id", new r.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("timestamp", new r.a("timestamp", "TEXT", true, 0, "''", 1));
            linkedHashMap.put("expirationTimestamp", new r.a("expirationTimestamp", "TEXT", true, 0, "''", 1));
            linkedHashMap.put("latitude", new r.a("latitude", "REAL", true, 0, null, 1));
            linkedHashMap.put("longitude", new r.a("longitude", "REAL", true, 0, null, 1));
            linkedHashMap.put("name", new r.a("name", "TEXT", true, 0, null, 1));
            linkedHashMap.put("street", new r.a("street", "TEXT", false, 0, null, 1));
            linkedHashMap.put("postcode", new r.a("postcode", "TEXT", true, 0, null, 1));
            linkedHashMap.put("city", new r.a("city", "TEXT", true, 0, null, 1));
            linkedHashMap.put("rate", new r.a("rate", "TEXT", true, 0, null, 1));
            linkedHashMap.put("humidity", new r.a("humidity", "REAL", false, 0, null, 1));
            linkedHashMap.put("pressure", new r.a("pressure", "REAL", false, 0, null, 1));
            linkedHashMap.put("temperature", new r.a("temperature", "REAL", false, 0, null, 1));
            linkedHashMap.put("pm10value", new r.a("pm10value", "REAL", false, 0, null, 1));
            linkedHashMap.put("pm25value", new r.a("pm25value", "REAL", false, 0, null, 1));
            r rVar = new r("MeasurementPointEntity", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            r rVarA = r.INSTANCE.a(connection, "MeasurementPointEntity");
            if (rVar.equals(rVarA)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "MeasurementPointEntity(pl.gov.coi.mobywatel.feature.airquality.data.db.model.MeasurementPointEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mobywatel.feature.airquality.data.db.a b0(MeasurementPointsDatabase_Impl measurementPointsDatabase_Impl) {
        return new pl.gov.coi.mobywatel.feature.airquality.data.db.a(measurementPointsDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.feature.airquality.data.db.MeasurementPointsDatabase
    public dy0.a Z() {
        return this._measurementPointsDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        return arrayList;
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "MeasurementPointEntity");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(dy0.a.class), pl.gov.coi.mobywatel.feature.airquality.data.db.a.INSTANCE.a());
        return linkedHashMap;
    }
}
