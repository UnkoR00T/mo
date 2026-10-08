package w54;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import y54.LocalDocumentNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u000bH\u0096@¢\u0006\u0004\b \u0010!J0\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u0006+"}, d2 = {"Lw54/j;", "Lw54/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Ly54/b;", "notification", "", "h", "(Ly54/b;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "f", "Lmu/g;", "", "b", "()Lmu/g;", "Ljava/time/LocalDate;", "date", "a", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "configId", "Lr54/e;", "status", "c", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "documentType", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentSubType", "e", "d", "(Ltq/e;)Ljava/lang/Object;", "reminderId", "expirationDate", "notificationDate", "i", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfLocalDocumentNotificationEntity", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements w54.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<LocalDocumentNotificationEntity> __insertAdapterOfLocalDocumentNotificationEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"w54/j$a", "Loa/f;", "Ly54/b;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ly54/b;)V", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<LocalDocumentNotificationEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR IGNORE INTO `LocalDocumentNotifications` (`id`,`ConfigId`,`DocumentType`,`DocumentSubType`,`ExpirationDate`,`NotificationDate`,`Status`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, LocalDocumentNotificationEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getConfigId());
            statement.S0(3, entity.getDocumentType());
            statement.S0(4, entity.getDocumentSubType());
            String strA = m10.b.a(entity.getExpirationDate());
            if (strA == null) {
                statement.i0(5);
            } else {
                statement.S0(5, strA);
            }
            String strA2 = m10.b.a(entity.getNotificationDate());
            if (strA2 == null) {
                statement.i0(6);
            } else {
                statement.S0(6, strA2);
            }
            String strA3 = v54.a.a(entity.getStatus());
            if (strA3 == null) {
                statement.i0(7);
            } else {
                statement.S0(7, strA3);
            }
        }
    }

    /* JADX INFO: renamed from: w54.j$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw54/j$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        int f210499e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalDocumentNotificationEntity f210501g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LocalDocumentNotificationEntity localDocumentNotificationEntity, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f210501g = localDocumentNotificationEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210499e;
            if (i15 == 0) {
                oq.u.b(obj);
                j jVar = j.this;
                LocalDocumentNotificationEntity localDocumentNotificationEntity = this.f210501g;
                this.f210499e = 1;
                if (j.super.f(localDocumentNotificationEntity, this) == objE) {
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
            return j.this.new c(this.f210501g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public j(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(String str, r54.e eVar, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            String strA = v54.a.a(eVar);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            dVarE4.S0(2, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(String str, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.S0(1, str2);
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "ConfigId");
            int iD3 = ta.m.d(dVarE4, "DocumentType");
            int iD4 = ta.m.d(dVarE4, "DocumentSubType");
            int iD5 = ta.m.d(dVarE4, "ExpirationDate");
            int iD6 = ta.m.d(dVarE4, "NotificationDate");
            int iD7 = ta.m.d(dVarE4, "Status");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                String strU6 = null;
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5));
                if (localDateB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                LocalDate localDateB2 = m10.b.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (localDateB2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                if (!dVarE4.isNull(iD7)) {
                    strU6 = dVarE4.u3(iD7);
                }
                r54.e eVarB = v54.a.b(strU6);
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.localnotifications.contract.model.NotificationsStatus', but it was NULL.");
                }
                arrayList.add(new LocalDocumentNotificationEntity(j15, strU3, strU4, strU5, localDateB, localDateB2, eVarB));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List x(String str, LocalDate localDate, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            String strA = m10.b.a(localDate);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "ConfigId");
            int iD3 = ta.m.d(dVarE4, "DocumentType");
            int iD4 = ta.m.d(dVarE4, "DocumentSubType");
            int iD5 = ta.m.d(dVarE4, "ExpirationDate");
            int iD6 = ta.m.d(dVarE4, "NotificationDate");
            int iD7 = ta.m.d(dVarE4, "Status");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                String strU6 = null;
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD5) ? null : dVarE4.u3(iD5));
                if (localDateB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                LocalDate localDateB2 = m10.b.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (localDateB2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                if (!dVarE4.isNull(iD7)) {
                    strU6 = dVarE4.u3(iD7);
                }
                r54.e eVarB = v54.a.b(strU6);
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.localnotifications.contract.model.NotificationsStatus', but it was NULL.");
                }
                arrayList.add(new LocalDocumentNotificationEntity(j15, strU3, strU4, strU5, localDateB, localDateB2, eVarB));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(j jVar, LocalDocumentNotificationEntity localDocumentNotificationEntity, ya.b bVar) {
        return jVar.__insertAdapterOfLocalDocumentNotificationEntity.e(bVar, localDocumentNotificationEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(String str, LocalDate localDate, LocalDate localDate2, r54.e eVar, String str2, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            String strA = m10.b.a(localDate);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            String strA2 = m10.b.a(localDate2);
            if (strA2 == null) {
                dVarE4.i0(2);
            } else {
                dVarE4.S0(2, strA2);
            }
            String strA3 = v54.a.a(eVar);
            if (strA3 == null) {
                dVarE4.i0(3);
            } else {
                dVarE4.S0(3, strA3);
            }
            dVarE4.S0(4, str2);
            String strA4 = m10.b.a(localDate);
            if (strA4 == null) {
                dVarE4.i0(5);
            } else {
                dVarE4.S0(5, strA4);
            }
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    @Override // w54.a
    public Object a(final LocalDate localDate, tq.e<? super List<LocalDocumentNotificationEntity>> eVar) {
        final String str = "SELECT * FROM LocalDocumentNotifications WHERE date(?) == date(NotificationDate) AND Status <> 'DISPLAYED'";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: w54.d
            @Override // er.l
            public final Object b(Object obj) {
                return j.x(str, localDate, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // w54.a
    public mu.g<List<LocalDocumentNotificationEntity>> b() {
        final String str = "SELECT * FROM LocalDocumentNotifications";
        return qa.k.a(this.__db, false, new String[]{"LocalDocumentNotifications"}, new er.l() { // from class: w54.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.w(str, (ya.b) obj);
            }
        });
    }

    @Override // w54.a
    public Object c(final String str, final r54.e eVar, tq.e<? super i0> eVar2) {
        final String str2 = "UPDATE LocalDocumentNotifications SET Status = ? WHERE ConfigId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.e
            @Override // er.l
            public final Object b(Object obj) {
                return j.A(str2, eVar, str, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.a
    public Object d(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM LocalDocumentNotifications";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.t(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.a
    public Object e(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM LocalDocumentNotifications WHERE DocumentSubType = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.b
            @Override // er.l
            public final Object b(Object obj) {
                return j.u(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.a
    public Object f(LocalDocumentNotificationEntity localDocumentNotificationEntity, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new c(localDocumentNotificationEntity, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // w54.a
    public Object h(final LocalDocumentNotificationEntity localDocumentNotificationEntity, tq.e<? super Long> eVar) {
        return ta.a.e(this.__db, false, true, new er.l() { // from class: w54.g
            @Override // er.l
            public final Object b(Object obj) {
                return Long.valueOf(j.y(this.f210492a, localDocumentNotificationEntity, (ya.b) obj));
            }
        }, eVar);
    }

    @Override // w54.a
    public Object i(final String str, final LocalDate localDate, final LocalDate localDate2, final r54.e eVar, tq.e<? super i0> eVar2) {
        final String str2 = "UPDATE LocalDocumentNotifications SET ExpirationDate = ?, NotificationDate = ?, Status = ? WHERE ConfigId = ? AND ExpirationDate != ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.f
            @Override // er.l
            public final Object b(Object obj) {
                return j.z(str2, localDate, localDate2, eVar, str, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.a
    public Object j(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM LocalDocumentNotifications WHERE DocumentType = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.c
            @Override // er.l
            public final Object b(Object obj) {
                return j.v(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
