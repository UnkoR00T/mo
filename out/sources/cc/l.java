package cc;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcc/l;", "Lcc/i;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lcc/h;", "preference", "Loq/i0;", "a", "(Lcc/h;)V", "", "key", "", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfPreference", "c", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<Preference> __insertAdapterOfPreference = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"cc/l$a", "Loa/f;", "Lcc/h;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lcc/h;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends oa.f<Preference> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, Preference entity) {
            statement.S0(1, entity.getKey());
            Long value = entity.getValue();
            if (value == null) {
                statement.i0(2);
            } else {
                statement.f0(2, value.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: cc.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcc/l$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public l(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long e(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            Long lValueOf = null;
            if (dVarE4.Y3() && !dVarE4.isNull(0)) {
                lValueOf = Long.valueOf(dVarE4.getLong(0));
            }
            return lValueOf;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(l lVar, Preference preference, ya.b bVar) throws Exception {
        lVar.__insertAdapterOfPreference.d(bVar, preference);
        return oq.i0.f148189a;
    }

    @Override // cc.i
    public void a(final Preference preference) {
        ta.a.c(this.__db, false, true, new er.l() { // from class: cc.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.f(this.f25077a, preference, (ya.b) obj);
            }
        });
    }

    @Override // cc.i
    public Long b(final String key) {
        final String str = "SELECT long_value FROM Preference where `key`=?";
        return (Long) ta.a.c(this.__db, true, false, new er.l() { // from class: cc.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.e(str, key, (ya.b) obj);
            }
        });
    }
}
