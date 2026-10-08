package pl.gov.coi.mobywatel.feature.history.data.database;

import ba2.c;
import ca2.InstitutionHistoryEntity;
import er.l;
import fr.k;
import java.util.ArrayList;
import java.util.List;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import ta.m;
import tq.e;
import ya.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/database/a;", "Lba2/c;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lca2/a;", "history", "Loq/i0;", "c", "(Lca2/a;Ltq/e;)Ljava/lang/Object;", "", "b", "(Ltq/e;)Ljava/lang/Object;", "a", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfInstitutionHistoryEntity", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f158741d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<InstitutionHistoryEntity> __insertAdapterOfInstitutionHistoryEntity = new C3937a();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.history.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/history/data/database/a$a", "Loa/f;", "Lca2/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lca2/a;)V", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3937a extends f<InstitutionHistoryEntity> {
        C3937a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `institution_history` (`id`,`timestamp`,`scope`,`institutionName`,`purposeName`,`documentType`,`url`,`cardId`,`institutionId`,`institutionCertificateDn`,`institutionCertificateSn`,`institutionCertificateIssuer`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, InstitutionHistoryEntity entity) {
            statement.f0(1, entity.getId());
            statement.f0(2, entity.getTimestamp());
            statement.f0(3, entity.getScope());
            statement.S0(4, entity.getInstitutionName());
            statement.S0(5, entity.getPurposeName());
            statement.S0(6, entity.getDocumentType());
            statement.S0(7, entity.getUrl());
            statement.f0(8, entity.getCardId());
            statement.f0(9, entity.getInstitutionId());
            statement.S0(10, entity.getInstitutionCertificateDn());
            statement.S0(11, entity.getInstitutionCertificateSn());
            statement.S0(12, entity.getInstitutionCertificateIssuer());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.history.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/history/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(String str, ya.b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "timestamp");
            int iD3 = m.d(dVarE4, "scope");
            int iD4 = m.d(dVarE4, "institutionName");
            int iD5 = m.d(dVarE4, "purposeName");
            int iD6 = m.d(dVarE4, "documentType");
            int iD7 = m.d(dVarE4, "url");
            int iD8 = m.d(dVarE4, "cardId");
            int iD9 = m.d(dVarE4, "institutionId");
            int iD10 = m.d(dVarE4, "institutionCertificateDn");
            int iD11 = m.d(dVarE4, "institutionCertificateSn");
            int iD12 = m.d(dVarE4, "institutionCertificateIssuer");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                int i15 = iD2;
                int i16 = iD3;
                arrayList.add(new InstitutionHistoryEntity((int) dVarE4.getLong(iD), dVarE4.getLong(iD2), (int) dVarE4.getLong(iD3), dVarE4.u3(iD4), dVarE4.u3(iD5), dVarE4.u3(iD6), dVarE4.u3(iD7), (int) dVarE4.getLong(iD8), (int) dVarE4.getLong(iD9), dVarE4.u3(iD10), dVarE4.u3(iD11), dVarE4.u3(iD12)));
                iD2 = i15;
                iD3 = i16;
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, InstitutionHistoryEntity institutionHistoryEntity, ya.b bVar) throws Exception {
        aVar.__insertAdapterOfInstitutionHistoryEntity.d(bVar, institutionHistoryEntity);
        return i0.f148189a;
    }

    @Override // ba2.c
    public Object b(e<? super List<InstitutionHistoryEntity>> eVar) {
        final String str = "SELECT * FROM institution_history";
        return ta.a.e(this.__db, true, false, new l() { // from class: ba2.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.history.data.database.a.e(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // ba2.c
    public Object c(final InstitutionHistoryEntity institutionHistoryEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: ba2.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.history.data.database.a.f(this.f17859a, institutionHistoryEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
