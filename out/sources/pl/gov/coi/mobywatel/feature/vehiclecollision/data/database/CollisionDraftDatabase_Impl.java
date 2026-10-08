package pl.gov.coi.mobywatel.feature.vehiclecollision.data.database;

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
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.CollisionDraftDatabase_Impl;
import pq.v;
import ta.r;
import ya.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/database/CollisionDraftDatabase_Impl;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/database/CollisionDraftDatabase;", "<init>", "()V", "Loa/a0;", "e0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lod3/a;", "a0", "()Lod3/a;", "Loq/k;", "r", "Loq/k;", "_collisionDraftDataDao", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollisionDraftDatabase_Impl extends CollisionDraftDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k<od3.a> _collisionDraftDataDao = l.a(new er.a() { // from class: od3.f
        @Override // er.a
        public final Object a() {
            return CollisionDraftDatabase_Impl.c0(this.f144977a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/feature/vehiclecollision/data/database/CollisionDraftDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(1, "9f7d529ed2b81c376a6513edd55f4a95", "627597952a07cdceac46ac9584c8dd61");
        }

        @Override // oa.a0
        public void a(b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `collision_draft_data` (`processId` TEXT NOT NULL, `draftData` BLOB NOT NULL, PRIMARY KEY(`processId`))");
            ya.a.a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_collision_draft_data_processId` ON `collision_draft_data` (`processId`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9f7d529ed2b81c376a6513edd55f4a95')");
        }

        @Override // oa.a0
        public void b(b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `collision_draft_data`");
        }

        @Override // oa.a0
        public void f(b connection) {
        }

        @Override // oa.a0
        public void g(b connection) {
            CollisionDraftDatabase_Impl.this.M(connection);
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
            linkedHashMap.put("processId", new r.a("processId", "TEXT", true, 1, null, 1));
            linkedHashMap.put("draftData", new r.a("draftData", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_collision_draft_data_processId", true, v.e("processId"), v.e("ASC")));
            r rVar = new r("collision_draft_data", linkedHashMap, linkedHashSet, linkedHashSet2);
            r rVarA = r.INSTANCE.a(connection, "collision_draft_data");
            if (rVar.equals(rVarA)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "collision_draft_data(pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.entities.CollisionDraftDataEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a c0(CollisionDraftDatabase_Impl collisionDraftDatabase_Impl) {
        return new pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a(collisionDraftDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.CollisionDraftDatabase
    public od3.a a0() {
        return this._collisionDraftDataDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "collision_draft_data");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(od3.a.class), pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a.INSTANCE.a());
        return linkedHashMap;
    }
}
