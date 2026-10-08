package pl.gov.coi.mobywatel.technical.mobile.data.storage;

import fr.q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m64.e;
import m64.f;
import m64.j;
import m64.s;
import mr.c;
import oa.a0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase_Impl;
import pq.v;
import ta.r;
import ya.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase_Impl;", "Lpl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase;", "<init>", "()V", "Loa/a0;", "k0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lm64/f;", "b0", "()Lm64/f;", "Lm64/k;", "c0", "()Lm64/k;", "Lm64/a;", "a0", "()Lm64/a;", "Loq/k;", "q", "Loq/k;", "_searchSectionsDao", "r", "_searchTagsDao", "s", "_searchEntriesDao", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalSearchDatabase_Impl extends GlobalSearchDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k<f> _searchSectionsDao = l.a(new er.a() { // from class: k64.c
        @Override // er.a
        public final Object a() {
            return GlobalSearchDatabase_Impl.h0(this.f108732a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k<m64.k> _searchTagsDao = l.a(new er.a() { // from class: k64.d
        @Override // er.a
        public final Object a() {
            return GlobalSearchDatabase_Impl.i0(this.f108733a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<m64.a> _searchEntriesDao = l.a(new er.a() { // from class: k64.e
        @Override // er.a
        public final Object a() {
            return GlobalSearchDatabase_Impl.g0(this.f108734a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"pl/gov/coi/mobywatel/technical/mobile/data/storage/GlobalSearchDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(3, "6f91cac53157f678af25addfa49b994b", "1903c7cc53f3e8444db99095e7cc74d9");
        }

        @Override // oa.a0
        public void a(b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `checksum` (`value` TEXT NOT NULL, PRIMARY KEY(`value`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `search_tags` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tag` TEXT NOT NULL, `language` TEXT NOT NULL, `type` TEXT NOT NULL, `mainType` TEXT NOT NULL, `subType` TEXT)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_search_tags_tag` ON `search_tags` (`tag`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_search_tags_language` ON `search_tags` (`language`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_search_tags_type` ON `search_tags` (`type`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_search_tags_mainType` ON `search_tags` (`mainType`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `search_sections` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `order` INTEGER NOT NULL, `section` TEXT NOT NULL, `serviceType` TEXT, `documentType` TEXT, `subType` TEXT)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `search_entries` (`type` TEXT NOT NULL, `mainType` TEXT NOT NULL, `lastOpenTimestamp` INTEGER NOT NULL, PRIMARY KEY(`type`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6f91cac53157f678af25addfa49b994b')");
        }

        @Override // oa.a0
        public void b(b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `checksum`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `search_tags`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `search_sections`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `search_entries`");
        }

        @Override // oa.a0
        public void f(b connection) {
        }

        @Override // oa.a0
        public void g(b connection) {
            GlobalSearchDatabase_Impl.this.M(connection);
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
            linkedHashMap.put("value", new r.a("value", "TEXT", true, 1, null, 1));
            r rVar = new r("checksum", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "checksum");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "checksum(pl.gov.coi.mobywatel.technical.mobile.data.storage.entity.ChecksumEntity).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap2.put("tag", new r.a("tag", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("language", new r.a("language", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("type", new r.a("type", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("mainType", new r.a("mainType", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("subType", new r.a("subType", "TEXT", false, 0, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_search_tags_tag", false, v.e("tag"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_search_tags_language", false, v.e("language"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_search_tags_type", false, v.e("type"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_search_tags_mainType", false, v.e("mainType"), v.e("ASC")));
            r rVar2 = new r("search_tags", linkedHashMap2, linkedHashSet, linkedHashSet2);
            r rVarA2 = companion.a(connection, "search_tags");
            if (!rVar2.equals(rVarA2)) {
                return new a0.a(false, "search_tags(pl.gov.coi.mobywatel.technical.mobile.data.storage.entity.SearchTagEntity).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", new r.a("id", "INTEGER", true, 1, null, 1));
            linkedHashMap3.put("order", new r.a("order", "INTEGER", true, 0, null, 1));
            linkedHashMap3.put("section", new r.a("section", "TEXT", true, 0, null, 1));
            linkedHashMap3.put("serviceType", new r.a("serviceType", "TEXT", false, 0, null, 1));
            linkedHashMap3.put("documentType", new r.a("documentType", "TEXT", false, 0, null, 1));
            linkedHashMap3.put("subType", new r.a("subType", "TEXT", false, 0, null, 1));
            r rVar3 = new r("search_sections", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
            r rVarA3 = companion.a(connection, "search_sections");
            if (!rVar3.equals(rVarA3)) {
                return new a0.a(false, "search_sections(pl.gov.coi.mobywatel.technical.mobile.data.storage.entity.SearchSectionEntity).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("type", new r.a("type", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("mainType", new r.a("mainType", "TEXT", true, 0, null, 1));
            linkedHashMap4.put("lastOpenTimestamp", new r.a("lastOpenTimestamp", "INTEGER", true, 0, null, 1));
            r rVar4 = new r("search_entries", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
            r rVarA4 = companion.a(connection, "search_entries");
            if (rVar4.equals(rVarA4)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "search_entries(pl.gov.coi.mobywatel.technical.mobile.data.storage.entity.SearchEntryEntity).\n Expected:\n" + rVar4 + "\n Found:\n" + rVarA4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e g0(GlobalSearchDatabase_Impl globalSearchDatabase_Impl) {
        return new e(globalSearchDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j h0(GlobalSearchDatabase_Impl globalSearchDatabase_Impl) {
        return new j(globalSearchDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s i0(GlobalSearchDatabase_Impl globalSearchDatabase_Impl) {
        return new s(globalSearchDatabase_Impl);
    }

    @Override // pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase
    public m64.a a0() {
        return this._searchEntriesDao.getValue();
    }

    @Override // pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase
    public f b0() {
        return this._searchSectionsDao.getValue();
    }

    @Override // pl.gov.coi.mobywatel.technical.mobile.data.storage.GlobalSearchDatabase
    public m64.k c0() {
        return this._searchTagsDao.getValue();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k64.a());
        arrayList.add(new k64.b());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "checksum", "search_tags", "search_sections", "search_entries");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(q0.c(f.class), j.INSTANCE.a());
        linkedHashMap.put(q0.c(m64.k.class), s.INSTANCE.a());
        linkedHashMap.put(q0.c(m64.a.class), e.INSTANCE.a());
        return linkedHashMap;
    }
}
