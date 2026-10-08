package m64;

import java.util.ArrayList;
import java.util.List;
import n64.SearchSectionEntity;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lm64/j;", "Lm64/f;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "", "Ln64/c;", "sections", "Loq/i0;", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "c", "b", "(Ltq/e;)Ljava/lang/Object;", "a", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfSearchSectionEntity", "Ll64/b;", "Ll64/b;", "__searchSectionTypeConverter", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l64.b __searchSectionTypeConverter = new l64.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<SearchSectionEntity> __insertAdapterOfSearchSectionEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"m64/j$a", "Loa/f;", "Ln64/c;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ln64/c;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<SearchSectionEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `search_sections` (`id`,`order`,`section`,`serviceType`,`documentType`,`subType`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SearchSectionEntity entity) {
            statement.f0(1, entity.getId());
            statement.f0(2, entity.getOrder());
            String strA = j.this.__searchSectionTypeConverter.a(entity.getSection());
            if (strA == null) {
                statement.i0(3);
            } else {
                statement.S0(3, strA);
            }
            String serviceType = entity.getServiceType();
            if (serviceType == null) {
                statement.i0(4);
            } else {
                statement.S0(4, serviceType);
            }
            String documentType = entity.getDocumentType();
            if (documentType == null) {
                statement.i0(5);
            } else {
                statement.S0(5, documentType);
            }
            String subType = entity.getSubType();
            if (subType == null) {
                statement.i0(6);
            } else {
                statement.S0(6, subType);
            }
        }
    }

    /* JADX INFO: renamed from: m64.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm64/j$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123916e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<SearchSectionEntity> f123918g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<SearchSectionEntity> list, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f123918g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f123916e;
            if (i15 == 0) {
                oq.u.b(obj);
                j jVar = j.this;
                List<SearchSectionEntity> list = this.f123918g;
                this.f123916e = 1;
                if (j.super.c(list, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new c(this.f123918g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public j(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(String str, j jVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "order");
            int iD3 = ta.m.d(dVarE4, "section");
            int iD4 = ta.m.d(dVarE4, "serviceType");
            int iD5 = ta.m.d(dVarE4, "documentType");
            int iD6 = ta.m.d(dVarE4, "subType");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                int i15 = (int) dVarE4.getLong(iD2);
                o64.b bVarB = jVar.__searchSectionTypeConverter.b(dVarE4.isNull(iD3) ? null : dVarE4.u3(iD3));
                if (bVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.mobile.`data`.storage.model.SearchSectionEntityType', but it was NULL.");
                }
                arrayList.add(new SearchSectionEntity(j15, i15, bVarB, dVarE4.isNull(iD4) ? null : dVarE4.u3(iD4), dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5), dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6)));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(j jVar, List list, ya.b bVar) throws Exception {
        jVar.__insertAdapterOfSearchSectionEntity.c(bVar, list);
        return i0.f148189a;
    }

    @Override // m64.f
    public Object a(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM search_sections";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.k(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.f
    public Object b(tq.e<? super List<SearchSectionEntity>> eVar) {
        final String str = "\n        SELECT * \n        FROM search_sections\n        ORDER BY section, `order`\n    ";
        return ta.a.e(this.__db, true, true, new er.l() { // from class: m64.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.l(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // m64.f
    public Object c(List<SearchSectionEntity> list, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new c(list, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // m64.f
    public Object d(final List<SearchSectionEntity> list, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.m(this.f123907a, list, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
