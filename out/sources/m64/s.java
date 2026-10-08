package m64;

import g64.GlobalSearchDocumentResult;
import iq0.a0;
import java.util.ArrayList;
import java.util.List;
import n64.ChecksumEntity;
import n64.SearchTagEntity;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010 \u001a\u00020\bH\u0096@¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\bH\u0096@¢\u0006\u0004\b!\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,¨\u0006."}, d2 = {"Lm64/s;", "Lm64/k;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Ln64/a;", "checksum", "Loq/i0;", "j", "(Ln64/a;Ltq/e;)Ljava/lang/Object;", "", "Ln64/d;", "tags", "f", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "l", "(Ln64/a;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "d", "query", "Liq0/a0;", "language", "Lo64/c;", "mainType", "Lg64/a;", "k", "(Ljava/lang/String;Liq0/a0;Lo64/c;Ltq/e;)Ljava/lang/Object;", "", "b", "e", "h", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfChecksumEntity", "c", "__insertAdapterOfSearchTagEntity", "Ll64/c;", "Ll64/c;", "__searchTagLanguageConverter", "Ll64/d;", "Ll64/d;", "__searchTagMainTypeConverter", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l64.c __searchTagLanguageConverter = new l64.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l64.d __searchTagMainTypeConverter = new l64.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<ChecksumEntity> __insertAdapterOfChecksumEntity = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oa.f<SearchTagEntity> __insertAdapterOfSearchTagEntity = new b();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"m64/s$a", "Loa/f;", "Ln64/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ln64/a;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<ChecksumEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `checksum` (`value`) VALUES (?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, ChecksumEntity entity) {
            statement.S0(1, entity.getValue());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"m64/s$b", "Loa/f;", "Ln64/d;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ln64/d;)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends oa.f<SearchTagEntity> {
        b() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `search_tags` (`id`,`tag`,`language`,`type`,`mainType`,`subType`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SearchTagEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getTag());
            statement.S0(3, s.this.__searchTagLanguageConverter.a(entity.getLanguage()));
            statement.S0(4, entity.getType());
            statement.S0(5, s.this.__searchTagMainTypeConverter.a(entity.getMainType()));
            String subType = entity.getSubType();
            if (subType == null) {
                statement.i0(6);
            } else {
                statement.S0(6, subType);
            }
        }
    }

    /* JADX INFO: renamed from: m64.s$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm64/s$c;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    static final class d extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123949e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f123949e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                this.f123949e = 1;
                if (s.super.a(this) == objE) {
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
            return s.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123951e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ChecksumEntity f123953g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<SearchTagEntity> f123954h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ChecksumEntity checksumEntity, List<SearchTagEntity> list, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f123953g = checksumEntity;
            this.f123954h = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f123951e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ChecksumEntity checksumEntity = this.f123953g;
                List<SearchTagEntity> list = this.f123954h;
                this.f123951e = 1;
                if (s.super.l(checksumEntity, list, this) == objE) {
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
            return s.this.new e(this.f123953g, this.f123954h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    public s(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            boolean z15 = false;
            if (dVarE4.Y3() && ((int) dVarE4.getLong(0)) != 0) {
                z15 = true;
            }
            return z15;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(s sVar, ChecksumEntity checksumEntity, ya.b bVar) throws Exception {
        sVar.__insertAdapterOfChecksumEntity.d(bVar, checksumEntity);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(s sVar, List list, ya.b bVar) throws Exception {
        sVar.__insertAdapterOfSearchTagEntity.c(bVar, list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            String strU3 = null;
            if (dVarE4.Y3() && !dVarE4.isNull(0)) {
                strU3 = dVarE4.u3(0);
            }
            return strU3;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z(String str, String str2, s sVar, a0 a0Var, o64.c cVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.S0(2, sVar.__searchTagLanguageConverter.a(a0Var));
            dVarE4.S0(3, sVar.__searchTagMainTypeConverter.a(cVar));
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(new GlobalSearchDocumentResult(dVarE4.u3(0), dVarE4.isNull(1) ? null : dVarE4.u3(1)));
            }
            return arrayList;
        } finally {
            dVarE4.close();
        }
    }

    @Override // m64.k
    public Object a(tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new d(null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // m64.k
    public Object b(tq.e<? super Boolean> eVar) {
        final String str = "SELECT EXISTS(SELECT 1 FROM search_tags LIMIT 1)";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: m64.q
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(s.A(str, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // m64.k
    public Object d(tq.e<? super String> eVar) {
        final String str = "SELECT value FROM checksum LIMIT 1";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: m64.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.y(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // m64.k
    public Object e(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM checksum";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.w(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.k
    public Object f(final List<SearchTagEntity> list, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.C(this.f123936a, list, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.k
    public Object h(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM search_tags";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.x(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.k
    public Object j(final ChecksumEntity checksumEntity, tq.e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: m64.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.B(this.f123938a, checksumEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // m64.k
    public Object k(final String str, final a0 a0Var, final o64.c cVar, tq.e<? super List<GlobalSearchDocumentResult>> eVar) {
        final String str2 = "\n        SELECT DISTINCT type, subType FROM search_tags\n        WHERE tag LIKE ? || '%'\n          AND language = ?\n          AND mainType = ?\n    ";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: m64.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.z(str2, str, this, a0Var, cVar, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // m64.k
    public Object l(ChecksumEntity checksumEntity, List<SearchTagEntity> list, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new e(checksumEntity, list, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }
}
