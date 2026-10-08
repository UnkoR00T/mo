package pl.gov.coi.mobywatel.feature.history.data.database;

import ba2.f;
import ca2.VerificationHistoryEntity;
import er.l;
import fr.k;
import java.util.ArrayList;
import java.util.List;
import mr.c;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import ta.m;
import tq.e;
import ya.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/database/b;", "Lba2/f;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lca2/b;", "history", "Loq/i0;", "a", "(Lca2/b;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfVerificationHistoryEntity", "c", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f158745d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<VerificationHistoryEntity> __insertAdapterOfVerificationHistoryEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/history/data/database/b$a", "Loa/f;", "Lca2/b;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lca2/b;)V", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<VerificationHistoryEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `verification_history` (`id`,`timestamp`,`documentType`,`isAccepted`,`workCertId`,`verifierId`,`purpose`,`type`,`connectionError`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, VerificationHistoryEntity entity) {
            statement.f0(1, entity.getId());
            statement.f0(2, entity.getTimestamp());
            statement.S0(3, entity.getDocumentType());
            statement.f0(4, entity.getIsAccepted() ? 1L : 0L);
            statement.S0(5, entity.getWorkCertId());
            statement.S0(6, entity.getVerifierId());
            statement.S0(7, entity.getPurpose());
            statement.S0(8, entity.getType());
            statement.f0(9, entity.getConnectionError() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.history.data.database.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/database/b$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    public b(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "timestamp");
            int iD3 = m.d(dVarE4, "documentType");
            int iD4 = m.d(dVarE4, "isAccepted");
            int iD5 = m.d(dVarE4, "workCertId");
            int iD6 = m.d(dVarE4, "verifierId");
            int iD7 = m.d(dVarE4, "purpose");
            int iD8 = m.d(dVarE4, "type");
            int iD9 = m.d(dVarE4, "connectionError");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                arrayList.add(new VerificationHistoryEntity((int) dVarE4.getLong(iD), dVarE4.getLong(iD2), dVarE4.u3(iD3), ((int) dVarE4.getLong(iD4)) != 0, dVarE4.u3(iD5), dVarE4.u3(iD6), dVarE4.u3(iD7), dVarE4.u3(iD8), ((int) dVarE4.getLong(iD9)) != 0));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(b bVar, VerificationHistoryEntity verificationHistoryEntity, ya.b bVar2) throws Exception {
        bVar.__insertAdapterOfVerificationHistoryEntity.d(bVar2, verificationHistoryEntity);
        return i0.f148189a;
    }

    @Override // ba2.f
    public Object a(final VerificationHistoryEntity verificationHistoryEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ba2.g
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.history.data.database.b.f(this.f17862a, verificationHistoryEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // ba2.f
    public Object b(e<? super List<VerificationHistoryEntity>> eVar) {
        final String str = "SELECT * FROM verification_history";
        return ta.a.e(this.__db, true, false, new l() { // from class: ba2.h
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.history.data.database.b.e(str, (ya.b) obj);
            }
        }, eVar);
    }
}
