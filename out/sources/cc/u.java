package cc;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcc/u;", "Lcc/p;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lcc/o;", "systemIdInfo", "Loq/i0;", "d", "(Lcc/o;)V", "", "workSpecId", "", "generation", "a", "(Ljava/lang/String;I)Lcc/o;", "", "b", "()Ljava/util/List;", "e", "(Ljava/lang/String;)V", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfSystemIdInfo", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<SystemIdInfo> __insertAdapterOfSystemIdInfo = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/u$a", "Loa/f;", "Lcc/o;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lcc/o;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends oa.f<SystemIdInfo> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, SystemIdInfo entity) {
            statement.S0(1, entity.workSpecId);
            statement.f0(2, entity.getGeneration());
            statement.f0(3, entity.systemId);
        }
    }

    /* JADX INFO: renamed from: cc.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc/u$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public u(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemIdInfo j(String str, String str2, int i15, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.f0(2, i15);
            return dVarE4.Y3() ? new SystemIdInfo(dVarE4.u3(ta.m.d(dVarE4, "work_spec_id")), (int) dVarE4.getLong(ta.m.d(dVarE4, "generation")), (int) dVarE4.getLong(ta.m.d(dVarE4, "system_id"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
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
    public static final oq.i0 l(u uVar, SystemIdInfo systemIdInfo, ya.b bVar) throws Exception {
        uVar.__insertAdapterOfSystemIdInfo.d(bVar, systemIdInfo);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    @Override // cc.p
    public SystemIdInfo a(final String workSpecId, final int generation) {
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.j(str, workSpecId, generation, (ya.b) obj);
            }
        });
    }

    @Override // cc.p
    public List<String> b() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.k(str, (ya.b) obj);
            }
        });
    }

    @Override // cc.p
    public void d(final SystemIdInfo systemIdInfo) {
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.l(this.f25115a, systemIdInfo, (ya.b) obj);
            }
        });
    }

    @Override // cc.p
    public void e(final String workSpecId) {
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.m(str, workSpecId, (ya.b) obj);
            }
        });
    }
}
