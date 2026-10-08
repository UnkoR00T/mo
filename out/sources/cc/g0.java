package cc;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcc/g0;", "Lcc/d0;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "", "workSpecId", "Loq/i0;", "a", "(Ljava/lang/String;)V", "b", "()V", "Loa/u;", "Loa/f;", "Lcc/c0;", "Loa/f;", "__insertAdapterOfWorkProgress", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<c0> __insertAdapterOfWorkProgress = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/g0$a", "Loa/f;", "Lcc/c0;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lcc/c0;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends oa.f<c0> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, c0 entity) {
            statement.S0(1, entity.getWorkSpecId());
            statement.g0(2, androidx.work.b.INSTANCE.e(entity.getProgress()));
        }
    }

    /* JADX INFO: renamed from: cc.g0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc/g0$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public g0(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return oq.i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    @Override // cc.d0
    public void a(final String workSpecId) {
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.e(str, workSpecId, (ya.b) obj);
            }
        });
    }

    @Override // cc.d0
    public void b() {
        final String str = "DELETE FROM WorkProgress";
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.f(str, (ya.b) obj);
            }
        });
    }
}
