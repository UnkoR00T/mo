package w54;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import y54.LocalVehicleNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b!\u0010\u0012J0\u0010$\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(¨\u0006*"}, d2 = {"Lw54/u;", "Lw54/k;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Ly54/c;", "notification", "", "j", "(Ly54/c;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "a", "Lmu/g;", "", "h", "()Lmu/g;", "f", "(Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "e", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "reminderId", "Lr54/e;", "status", "g", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "registerNo", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "i", "expirationDate", "notificationDate", "c", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;Ltq/e;)Ljava/lang/Object;", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfLocalVehicleNotificationEntity", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oa.u __db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa.f<LocalVehicleNotificationEntity> __insertAdapterOfLocalVehicleNotificationEntity = new a();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"w54/u$a", "Loa/f;", "Ly54/c;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Ly54/c;)V", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends oa.f<LocalVehicleNotificationEntity> {
        a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR IGNORE INTO `LocalVehicleNotifications` (`id`,`ReminderId`,`ConfigId`,`DocumentType`,`RegisterNo`,`ExpirationDate`,`NotificationDate`,`Status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, LocalVehicleNotificationEntity entity) {
            statement.f0(1, entity.getId());
            statement.S0(2, entity.getReminderId());
            statement.S0(3, entity.getConfigId());
            statement.S0(4, entity.getDocumentType());
            statement.S0(5, entity.getRegisterNo());
            String strA = m10.b.a(entity.getExpirationDate());
            if (strA == null) {
                statement.i0(6);
            } else {
                statement.S0(6, strA);
            }
            String strA2 = m10.b.a(entity.getNotificationDate());
            if (strA2 == null) {
                statement.i0(7);
            } else {
                statement.S0(7, strA2);
            }
            String strA3 = v54.a.a(entity.getStatus());
            if (strA3 == null) {
                statement.i0(8);
            } else {
                statement.S0(8, strA3);
            }
        }
    }

    /* JADX INFO: renamed from: w54.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw54/u$b;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        int f210530e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalVehicleNotificationEntity f210532g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(LocalVehicleNotificationEntity localVehicleNotificationEntity, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f210532g = localVehicleNotificationEntity;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f210530e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                LocalVehicleNotificationEntity localVehicleNotificationEntity = this.f210532g;
                this.f210530e = 1;
                if (u.super.a(localVehicleNotificationEntity, this) == objE) {
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
            return u.this.new c(this.f210532g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public u(oa.u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List A(String str, LocalDate localDate, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            String strA = m10.b.a(localDate);
            if (strA == null) {
                dVarE4.i0(1);
            } else {
                dVarE4.S0(1, strA);
            }
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "ReminderId");
            int iD3 = ta.m.d(dVarE4, "ConfigId");
            int iD4 = ta.m.d(dVarE4, "DocumentType");
            int iD5 = ta.m.d(dVarE4, "RegisterNo");
            int iD6 = ta.m.d(dVarE4, "ExpirationDate");
            int iD7 = ta.m.d(dVarE4, "NotificationDate");
            int iD8 = ta.m.d(dVarE4, "Status");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                String strU6 = dVarE4.u3(iD5);
                String strU7 = null;
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (localDateB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                LocalDate localDateB2 = m10.b.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (localDateB2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                if (!dVarE4.isNull(iD8)) {
                    strU7 = dVarE4.u3(iD8);
                }
                r54.e eVarB = v54.a.b(strU7);
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.localnotifications.contract.model.NotificationsStatus', but it was NULL.");
                }
                arrayList.add(new LocalVehicleNotificationEntity(j15, strU3, strU4, strU5, strU6, localDateB, localDateB2, eVarB));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long B(u uVar, LocalVehicleNotificationEntity localVehicleNotificationEntity, ya.b bVar) {
        return uVar.__insertAdapterOfLocalVehicleNotificationEntity.e(bVar, localVehicleNotificationEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(String str, LocalDate localDate, LocalDate localDate2, r54.e eVar, String str2, ya.b bVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(String str, r54.e eVar, String str2, ya.b bVar) {
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
    public static final i0 v(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(String str, String str2, ya.b bVar) {
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
    public static final i0 x(String str, String str2, ya.b bVar) {
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
    public static final List y(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "ReminderId");
            int iD3 = ta.m.d(dVarE4, "ConfigId");
            int iD4 = ta.m.d(dVarE4, "DocumentType");
            int iD5 = ta.m.d(dVarE4, "RegisterNo");
            int iD6 = ta.m.d(dVarE4, "ExpirationDate");
            int iD7 = ta.m.d(dVarE4, "NotificationDate");
            int iD8 = ta.m.d(dVarE4, "Status");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                String strU6 = dVarE4.u3(iD5);
                String strU7 = null;
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (localDateB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                LocalDate localDateB2 = m10.b.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (localDateB2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                if (!dVarE4.isNull(iD8)) {
                    strU7 = dVarE4.u3(iD8);
                }
                r54.e eVarB = v54.a.b(strU7);
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.localnotifications.contract.model.NotificationsStatus', but it was NULL.");
                }
                arrayList.add(new LocalVehicleNotificationEntity(j15, strU3, strU4, strU5, strU6, localDateB, localDateB2, eVarB));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = ta.m.d(dVarE4, "id");
            int iD2 = ta.m.d(dVarE4, "ReminderId");
            int iD3 = ta.m.d(dVarE4, "ConfigId");
            int iD4 = ta.m.d(dVarE4, "DocumentType");
            int iD5 = ta.m.d(dVarE4, "RegisterNo");
            int iD6 = ta.m.d(dVarE4, "ExpirationDate");
            int iD7 = ta.m.d(dVarE4, "NotificationDate");
            int iD8 = ta.m.d(dVarE4, "Status");
            ArrayList arrayList = new ArrayList();
            while (dVarE4.Y3()) {
                long j15 = dVarE4.getLong(iD);
                String strU3 = dVarE4.u3(iD2);
                String strU4 = dVarE4.u3(iD3);
                String strU5 = dVarE4.u3(iD4);
                String strU6 = dVarE4.u3(iD5);
                String strU7 = null;
                LocalDate localDateB = m10.b.b(dVarE4.isNull(iD6) ? null : dVarE4.u3(iD6));
                if (localDateB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                LocalDate localDateB2 = m10.b.b(dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7));
                if (localDateB2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDate', but it was NULL.");
                }
                if (!dVarE4.isNull(iD8)) {
                    strU7 = dVarE4.u3(iD8);
                }
                r54.e eVarB = v54.a.b(strU7);
                if (eVarB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'pl.gov.coi.mobywatel.technical.localnotifications.contract.model.NotificationsStatus', but it was NULL.");
                }
                arrayList.add(new LocalVehicleNotificationEntity(j15, strU3, strU4, strU5, strU6, localDateB, localDateB2, eVarB));
            }
            dVarE4.close();
            return arrayList;
        } catch (Throwable th4) {
            dVarE4.close();
            throw th4;
        }
    }

    @Override // w54.k
    public Object a(LocalVehicleNotificationEntity localVehicleNotificationEntity, tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new c(localVehicleNotificationEntity, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // w54.k
    public Object b(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM LocalVehicleNotifications WHERE ReminderId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.w(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.k
    public Object c(final String str, final LocalDate localDate, final LocalDate localDate2, final r54.e eVar, tq.e<? super i0> eVar2) {
        final String str2 = "UPDATE LocalVehicleNotifications SET ExpirationDate = ?, NotificationDate = ?, Status = ? WHERE ReminderId = ? AND ExpirationDate != ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.C(str2, localDate, localDate2, eVar, str, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.k
    public Object d(final String str, tq.e<? super i0> eVar) {
        final String str2 = "DELETE FROM LocalVehicleNotifications WHERE RegisterNo = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.x(str2, str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.k
    public Object e(final LocalDate localDate, tq.e<? super List<LocalVehicleNotificationEntity>> eVar) {
        final String str = "SELECT * FROM LocalVehicleNotifications WHERE date(?) == date(NotificationDate) AND Status <> 'DISPLAYED'";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: w54.l
            @Override // er.l
            public final Object b(Object obj) {
                return u.A(str, localDate, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // w54.k
    public Object f(tq.e<? super List<LocalVehicleNotificationEntity>> eVar) {
        final String str = "SELECT * FROM LocalVehicleNotifications";
        return ta.a.e(this.__db, true, false, new er.l() { // from class: w54.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.y(str, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // w54.k
    public Object g(final String str, final r54.e eVar, tq.e<? super i0> eVar2) {
        final String str2 = "UPDATE LocalVehicleNotifications SET Status = ? WHERE ReminderId = ?";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.D(str2, eVar, str, (ya.b) obj);
            }
        }, eVar2);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.k
    public mu.g<List<LocalVehicleNotificationEntity>> h() {
        final String str = "SELECT * FROM LocalVehicleNotifications";
        return qa.k.a(this.__db, false, new String[]{"LocalVehicleNotifications"}, new er.l() { // from class: w54.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.z(str, (ya.b) obj);
            }
        });
    }

    @Override // w54.k
    public Object i(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM LocalVehicleNotifications";
        Object objE = ta.a.e(this.__db, false, true, new er.l() { // from class: w54.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.v(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // w54.k
    public Object j(final LocalVehicleNotificationEntity localVehicleNotificationEntity, tq.e<? super Long> eVar) {
        return ta.a.e(this.__db, false, true, new er.l() { // from class: w54.r
            @Override // er.l
            public final Object b(Object obj) {
                return Long.valueOf(u.B(this.f210522a, localVehicleNotificationEntity, (ya.b) obj));
            }
        }, eVar);
    }
}
