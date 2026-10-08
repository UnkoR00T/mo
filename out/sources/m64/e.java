package m64;

import java.util.ArrayList;
import java.util.List;
import n64.SearchEntryEntity;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001f"}, d2 = {"Lm64/e;", "Lm64/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Ln64/b;", "searchEntry", "Loq/i0;", "d", "(Ln64/b;Ltq/e;)Ljava/lang/Object;", "", "limit", "Lmu/g;", "", "c", "(I)Lmu/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "b", "Loa/f;", "__insertAdapterOfSearchEntryEntity", "Ll64/a;", "Ll64/a;", "__searchEntryTypeConverter", "Ll64/d;", "Ll64/d;", "__searchTagMainTypeConverter", "e", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements m64.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l64.a __searchEntryTypeConverter = new l64.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l64.d __searchTagMainTypeConverter = new l64.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<SearchEntryEntity> __insertAdapterOfSearchEntryEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"m64/e$a", "Loa/f;", "Ln64/b;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ln64/b;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<SearchEntryEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `search_entries` (`type`,`mainType`,`lastOpenTimestamp`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SearchEntryEntity entity) {
            statement.S0(1, e.this.__searchEntryTypeConverter.a(entity.getType()));
            statement.S0(2, e.this.__searchTagMainTypeConverter.a(entity.getMainType()));
            statement.f0(3, entity.getLastOpenTimestamp());
        }
    }

    /* JADX INFO: renamed from: m64.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm64/e$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    public e(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(e eVar, SearchEntryEntity searchEntryEntity, ya.b bVar) throws Exception {
        eVar.__insertAdapterOfSearchEntryEntity.d(bVar, searchEntryEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(String str, int i15, e eVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.f0(1, i15);
            int iD = ta.m.d(dVarE4, "type");
            int iD2 = ta.m.d(dVarE4, "mainType");
            int iD3 = ta.m.d(dVarE4, "lastOpenTimestamp");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(new SearchEntryEntity(eVar.__searchEntryTypeConverter.b(dVarE4.u3(iD)), eVar.__searchTagMainTypeConverter.b(dVarE4.u3(iD2)), dVarE4.getLong(iD3)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    @Override // m64.a
    public Object a(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM search_entries";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.i(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.a
    public mu.g<List<SearchEntryEntity>> c(final int limit) {
        final String str = "\n        SELECT *\n        FROM search_entries\n        ORDER BY lastOpenTimestamp DESC\n        LIMIT ?\n    ";
        return qa.k.a(this.__db, false, new String[]{"search_entries"}, new er.l() { // from class: m64.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.k(str, limit, this, (ya.b) obj);
            }
        });
    }

    @Override // m64.a
    public Object d(final SearchEntryEntity searchEntryEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.j(this.f123893a, searchEntryEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
