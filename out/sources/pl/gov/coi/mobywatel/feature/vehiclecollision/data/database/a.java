package pl.gov.coi.mobywatel.feature.vehiclecollision.data.database;

import er.l;
import fr.k;
import java.util.ArrayList;
import java.util.List;
import mr.c;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pd3.CollisionDraftDataEntity;
import pq.v;
import ta.m;
import tq.e;
import ya.b;
import ya.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/database/a;", "Lod3/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Lpd3/a;", "collisionDraft", "Loq/i0;", "p", "(Lpd3/a;Ltq/e;)Ljava/lang/Object;", "", "processId", "m", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "n", "(Ltq/e;)Ljava/lang/Object;", "o", "a", "Loa/u;", "Loa/f;", "b", "Loa/f;", "__insertAdapterOfCollisionDraftDataEntity", "c", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements od3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f158862d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<CollisionDraftDataEntity> __insertAdapterOfCollisionDraftDataEntity = new C3941a();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/vehiclecollision/data/database/a$a", "Loa/f;", "Lpd3/a;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lpd3/a;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3941a extends f<CollisionDraftDataEntity> {
        C3941a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `collision_draft_data` (`processId`,`draftData`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(d statement, CollisionDraftDataEntity entity) {
            statement.S0(1, entity.getProcessId());
            statement.g0(2, entity.getDraftData());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/database/a$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(String str, String str2, b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(String str, b bVar) {
        d dVarE4 = bVar.e4(str);
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
    public static final CollisionDraftDataEntity g(String str, String str2, b bVar) {
        d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            return dVarE4.Y3() ? new CollisionDraftDataEntity(dVarE4.u3(m.d(dVarE4, "processId")), dVarE4.getBlob(m.d(dVarE4, "draftData"))) : null;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a aVar, CollisionDraftDataEntity collisionDraftDataEntity, b bVar) throws Exception {
        aVar.__insertAdapterOfCollisionDraftDataEntity.d(bVar, collisionDraftDataEntity);
        return i0.f148189a;
    }

    @Override // od3.a
    public Object m(final String str, e<? super CollisionDraftDataEntity> eVar) {
        final String str2 = "SELECT * FROM collision_draft_data WHERE processId = ?";
        return ta.a.e(this.__db, true, false, new l() { // from class: od3.e
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a.g(str2, str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // od3.a
    public Object n(e<? super List<String>> eVar) {
        final String str = "SELECT processId FROM collision_draft_data";
        return ta.a.e(this.__db, true, false, new l() { // from class: od3.d
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a.f(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // od3.a
    public Object o(final String str, e<? super i0> eVar) {
        final String str2 = "DELETE FROM collision_draft_data WHERE processId = ?";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: od3.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a.e(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // od3.a
    public Object p(final CollisionDraftDataEntity collisionDraftDataEntity, e<? super i0> eVar) {
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: od3.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.vehiclecollision.data.database.a.h(this.f144970a, collisionDraftDataEntity, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
