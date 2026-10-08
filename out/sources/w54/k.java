package w54;

import java.time.LocalDate;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y54.LocalVehicleNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\rH§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0018\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b!\u0010\u001c¨\u0006\"À\u0006\u0003"}, d2 = {"Lw54/k;", "", "Lmu/g;", "", "Ly54/c;", "h", "()Lmu/g;", "f", "(Ltq/e;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "date", "e", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "reminderId", "Lr54/e;", "status", "Loq/i0;", "g", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "registerNo", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "i", "notification", "", "j", "(Ly54/c;Ltq/e;)Ljava/lang/Object;", "expirationDate", "notificationDate", "c", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;Ltq/e;)Ljava/lang/Object;", "a", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f210504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f210505g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f210507j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210505g = obj;
            this.f210507j |= PKIFailureInfo.systemUnavail;
            return k.k(k.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r1.c(r2, r3, r4, r5, r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object k(w54.k r9, y54.LocalVehicleNotificationEntity r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof w54.k.a
            if (r0 == 0) goto L14
            r0 = r11
            w54.k$a r0 = (w54.k.a) r0
            int r1 = r0.f210507j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f210507j = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            w54.k$a r0 = new w54.k$a
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f210505g
            java.lang.Object r0 = uq.b.e()
            int r1 = r6.f210507j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r9 = r6.f210503e
            y54.c r9 = (y54.LocalVehicleNotificationEntity) r9
            java.lang.Object r9 = r6.f210502d
            w54.k r9 = (w54.k) r9
            oq.u.b(r11)
            goto L92
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r6.f210503e
            r10 = r9
            y54.c r10 = (y54.LocalVehicleNotificationEntity) r10
            java.lang.Object r9 = r6.f210502d
            w54.k r9 = (w54.k) r9
            oq.u.b(r11)
        L4a:
            r1 = r9
            goto L5c
        L4c:
            oq.u.b(r11)
            r6.f210502d = r9
            r6.f210503e = r10
            r6.f210507j = r3
            java.lang.Object r11 = r9.j(r10, r6)
            if (r11 != r0) goto L4a
            goto L91
        L5c:
            java.lang.Number r11 = (java.lang.Number) r11
            long r3 = r11.longValue()
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L95
            r9 = r2
            java.lang.String r2 = r10.getReminderId()
            r4 = r3
            java.time.LocalDate r3 = r10.getExpirationDate()
            r7 = r4
            java.time.LocalDate r4 = r10.getNotificationDate()
            r54.e r5 = r10.getStatus()
            java.lang.Object r11 = vq.j.a(r1)
            r6.f210502d = r11
            java.lang.Object r10 = vq.j.a(r10)
            r6.f210503e = r10
            r6.f210504f = r7
            r6.f210507j = r9
            java.lang.Object r9 = r1.c(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L92
        L91:
            return r0
        L92:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        L95:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w54.k.k(w54.k, y54.c, tq.e):java.lang.Object");
    }

    default Object a(LocalVehicleNotificationEntity localVehicleNotificationEntity, tq.e<? super i0> eVar) {
        return k(this, localVehicleNotificationEntity, eVar);
    }

    Object b(String str, tq.e<? super i0> eVar);

    Object c(String str, LocalDate localDate, LocalDate localDate2, r54.e eVar, tq.e<? super i0> eVar2);

    Object d(String str, tq.e<? super i0> eVar);

    Object e(LocalDate localDate, tq.e<? super List<LocalVehicleNotificationEntity>> eVar);

    Object f(tq.e<? super List<LocalVehicleNotificationEntity>> eVar);

    Object g(String str, r54.e eVar, tq.e<? super i0> eVar2);

    mu.g<List<LocalVehicleNotificationEntity>> h();

    Object i(tq.e<? super i0> eVar);

    Object j(LocalVehicleNotificationEntity localVehicleNotificationEntity, tq.e<? super Long> eVar);
}
