package cc;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcc/g;", "Lcc/b;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lcc/a;", "dependency", "Loq/i0;", "c", "(Lcc/a;)V", "", "id", "", "b", "(Ljava/lang/String;)Z", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "d", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfDependency", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<cc.a> __insertAdapterOfDependency = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/g$a", "Loa/f;", "Lcc/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lcc/a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends oa.f<cc.a> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, cc.a entity) {
            statement.S0(1, entity.getWorkSpecId());
            statement.S0(2, entity.getPrerequisiteId());
        }
    }

    /* JADX INFO: renamed from: cc.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc/g$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return pq.v.n();
        }

        private Companion() {
        }
    }

    public g(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(dVarE4.u3(0));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            boolean z15 = false;
            if (dVarE4.Y3()) {
                z15 = ((int) dVarE4.getLong(0)) != 0;
            }
            return z15;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            boolean z15 = false;
            if (dVarE4.Y3()) {
                z15 = ((int) dVarE4.getLong(0)) != 0;
            }
            return z15;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(g gVar, cc.a aVar, ya.b bVar) throws Exception {
        gVar.__insertAdapterOfDependency.d(bVar, aVar);
        return oq.i0.f148189a;
    }

    @Override // cc.b
    public List<String> a(final String id5) {
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.e
            @Override // er.l
            public final Object b(Object obj) {
                return g.i(str, id5, (ya.b) obj);
            }
        });
    }

    @Override // cc.b
    public boolean b(final String id5) {
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.f
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(g.j(str, id5, (ya.b) obj));
            }
        })).booleanValue();
    }

    @Override // cc.b
    public void c(final cc.a dependency) {
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.c
            @Override // er.l
            public final Object b(Object obj) {
                return g.l(this.f24997a, dependency, (ya.b) obj);
            }
        });
    }

    @Override // cc.b
    public boolean d(final String id5) {
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.d
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(g.k(str, id5, (ya.b) obj));
            }
        })).booleanValue();
    }
}
