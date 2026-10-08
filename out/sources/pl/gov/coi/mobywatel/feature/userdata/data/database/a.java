package pl.gov.coi.mobywatel.feature.userdata.data.database;

import er.l;
import fr.k;
import java.util.List;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pc3.PassportsDataEntity;
import pq.v;
import ta.m;
import tq.e;
import uq.b;
import ya.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/database/a;", "Loc3/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lpc3/a;", "passport", "Loq/i0;", "g", "(Lpc3/a;Ltq/e;)Ljava/lang/Object;", "f", "b", "(Ltq/e;)Ljava/lang/Object;", "", "c", "d", "a", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfPassportsDataEntity", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements oc3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f158849d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<PassportsDataEntity> __insertAdapterOfPassportsDataEntity = new C3940a();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.userdata.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/userdata/data/database/a$a", "Loa/f;", "Lpc3/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lpc3/a;)V", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3940a extends f<PassportsDataEntity> {
        C3940a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `passports_data` (`id`,`lastUpdateTimestamp`,`passportData`) VALUES (nullif(?, 0),?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, PassportsDataEntity entity) {
            statement.f0(1, entity.getId());
            statement.f0(2, entity.getLastUpdateTimestamp());
            statement.g0(3, entity.getPassportData());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.userdata.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<mr.c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158852e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PassportsDataEntity f158854g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PassportsDataEntity passportsDataEntity, e<? super c> eVar) {
            super(1, eVar);
            this.f158854g = passportsDataEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = b.e();
            int i15 = this.f158852e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = a.this;
                PassportsDataEntity passportsDataEntity = this.f158854g;
                this.f158852e = 1;
                if (a.super.f(passportsDataEntity, this) == objE) {
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

        public final e<i0> M(e<?> eVar) {
            return a.this.new c(this.f158854g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long m(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
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
    public static final PassportsDataEntity n(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            return dVarE4.Y3() ? new PassportsDataEntity((int) dVarE4.getLong(m.d(dVarE4, "id")), dVarE4.getLong(m.d(dVarE4, "lastUpdateTimestamp")), dVarE4.getBlob(m.d(dVarE4, "passportData"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a aVar, PassportsDataEntity passportsDataEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfPassportsDataEntity.d(bVar, passportsDataEntity);
        return i0.f148189a;
    }

    @Override // oc3.a
    public Object b(e<? super PassportsDataEntity> eVar) {
        final String str = "SELECT * FROM passports_data LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: oc3.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.userdata.data.database.a.n(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // oc3.a
    public Object c(e<? super Long> eVar) {
        final String str = "SELECT lastUpdateTimestamp FROM passports_data LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: oc3.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.userdata.data.database.a.m(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // oc3.a
    public Object d(e<? super i0> eVar) {
        final String str = "DELETE FROM passports_data";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: oc3.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.userdata.data.database.a.l(str, (ya.b) obj);
            }
        }, eVar);
        return objE == b.e() ? objE : i0.f148189a;
    }

    @Override // oc3.a
    public Object f(PassportsDataEntity passportsDataEntity, e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new c(passportsDataEntity, null), eVar);
        return objD == b.e() ? objD : i0.f148189a;
    }

    @Override // oc3.a
    public Object g(final PassportsDataEntity passportsDataEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: oc3.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.userdata.data.database.a.o(this.f144646a, passportsDataEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == b.e() ? objE : i0.f148189a;
    }
}
