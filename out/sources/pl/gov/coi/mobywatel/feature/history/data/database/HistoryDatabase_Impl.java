package pl.gov.coi.mobywatel.feature.history.data.database;

import ba2.c;
import ba2.f;
import fr.q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oa.a0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.history.data.database.HistoryDatabase_Impl;
import ta.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/database/HistoryDatabase_Impl;", "Lpl/gov/coi/mobywatel/feature/history/data/database/HistoryDatabase;", "<init>", "()V", "Loa/a0;", "h0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lba2/f;", "b0", "()Lba2/f;", "Lba2/c;", "a0", "()Lba2/c;", "Loq/k;", "r", "Loq/k;", "_verificationHistoryDao", "s", "_institutionHistoryDao", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HistoryDatabase_Impl extends HistoryDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k<f> _verificationHistoryDao = l.a(new er.a() { // from class: ba2.a
        @Override // er.a
        public final Object a() {
            return HistoryDatabase_Impl.f0(this.f17857a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<c> _institutionHistoryDao = l.a(new er.a() { // from class: ba2.b
        @Override // er.a
        public final Object a() {
            return HistoryDatabase_Impl.e0(this.f17858a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/feature/history/data/database/HistoryDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(1, "236568a5ead4fbd5ad82a911608ec509", "498edd8f602b3180e4c23b77f5177aee");
        }

        @Override // oa.a0
        public void a(ya.b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `verification_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `documentType` TEXT NOT NULL, `isAccepted` INTEGER NOT NULL, `workCertId` TEXT NOT NULL, `verifierId` TEXT NOT NULL, `purpose` TEXT NOT NULL, `type` TEXT NOT NULL, `connectionError` INTEGER NOT NULL)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `institution_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `scope` INTEGER NOT NULL, `institutionName` TEXT NOT NULL, `purposeName` TEXT NOT NULL, `documentType` TEXT NOT NULL, `url` TEXT NOT NULL, `cardId` INTEGER NOT NULL, `institutionId` INTEGER NOT NULL, `institutionCertificateDn` TEXT NOT NULL, `institutionCertificateSn` TEXT NOT NULL, `institutionCertificateIssuer` TEXT NOT NULL)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '236568a5ead4fbd5ad82a911608ec509')");
        }

        @Override // oa.a0
        public void b(ya.b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `verification_history`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `institution_history`");
        }

        @Override // oa.a0
        public void f(ya.b connection) {
        }

        @Override // oa.a0
        public void g(ya.b connection) {
            HistoryDatabase_Impl.this.M(connection);
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
            linkedHashMap.put("timestamp", new r.a("timestamp", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("documentType", new r.a("documentType", "TEXT", true, 0, null, 1));
            linkedHashMap.put("isAccepted", new r.a("isAccepted", "INTEGER", true, 0, null, 1));
            linkedHashMap.put("workCertId", new r.a("workCertId", "TEXT", true, 0, null, 1));
            linkedHashMap.put("verifierId", new r.a("verifierId", "TEXT", true, 0, null, 1));
            linkedHashMap.put("purpose", new r.a("purpose", "TEXT", true, 0, null, 1));
            linkedHashMap.put("type", new r.a("type", "TEXT", true, 0, null, 1));
            linkedHashMap.put("connectionError", new r.a("connectionError", "INTEGER", true, 0, null, 1));
            r rVar = new r("verification_history", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "verification_history");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "verification_history(pl.gov.coi.mobywatel.feature.history.data.database.entities.VerificationHistoryEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("timestamp", new r.a("timestamp", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("scope", new r.a("scope", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("institutionName", new r.a("institutionName", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("purposeName", new r.a("purposeName", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("documentType", new r.a("documentType", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("url", new r.a("url", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("cardId", new r.a("cardId", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("institutionId", new r.a("institutionId", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("institutionCertificateDn", new r.a("institutionCertificateDn", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("institutionCertificateSn", new r.a("institutionCertificateSn", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("institutionCertificateIssuer", new r.a("institutionCertificateIssuer", "TEXT", true, 0, null, 1));
            r rVar2 = new r("institution_history", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
            r rVarA2 = companion.a(connection, "institution_history");
            if (rVar2.equals(rVarA2)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "institution_history(pl.gov.coi.mobywatel.feature.history.data.database.entities.InstitutionHistoryEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl.gov.coi.mobywatel.feature.history.data.database.a e0(HistoryDatabase_Impl historyDatabase_Impl) {
        return new pl.gov.coi.mobywatel.feature.history.data.database.a(historyDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f0(HistoryDatabase_Impl historyDatabase_Impl) {
        return new b(historyDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.feature.history.data.database.HistoryDatabase
    public c a0() {
        return this._institutionHistoryDao.getValue();
    }

    @Override // pl.gov.coi.mobywatel.feature.history.data.database.HistoryDatabase
    public f b0() {
        return this._verificationHistoryDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    public List<ra.b> k(Map<mr.c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "verification_history", "institution_history");
    }

    @Override // oa.u
    public Set<mr.c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<mr.c<?>, List<mr.c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(f.class), b.INSTANCE.a());
        linkedHashMap.put(q0.c(c.class), pl.gov.coi.mobywatel.feature.history.data.database.a.INSTANCE.a());
        return linkedHashMap;
    }
}
