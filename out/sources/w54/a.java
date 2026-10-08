package w54;

import java.time.LocalDate;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import y54.LocalDocumentNotificationEntity;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b\"\u0010\u001c¨\u0006#À\u0006\u0003"}, d2 = {"Lw54/a;", "", "Lmu/g;", "", "Ly54/b;", "b", "()Lmu/g;", "Ljava/time/LocalDate;", "date", "a", "(Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "configId", "Lr54/e;", "status", "Loq/i0;", "c", "(Ljava/lang/String;Lr54/e;Ltq/e;)Ljava/lang/Object;", "documentType", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentSubType", "e", "d", "(Ltq/e;)Ljava/lang/Object;", "notification", "", "h", "(Ly54/b;Ltq/e;)Ljava/lang/Object;", "reminderId", "expirationDate", "notificationDate", "i", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Lr54/e;Ltq/e;)Ljava/lang/Object;", "f", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: w54.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5530a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f210472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f210473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f210474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f210475g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f210477j;

        C5530a(tq.e<? super C5530a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f210475g = obj;
            this.f210477j |= PKIFailureInfo.systemUnavail;
            return a.g(a.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r1.i(r2, r3, r4, r5, r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object g(w54.a r9, y54.LocalDocumentNotificationEntity r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof w54.a.C5530a
            if (r0 == 0) goto L14
            r0 = r11
            w54.a$a r0 = (w54.a.C5530a) r0
            int r1 = r0.f210477j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f210477j = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            w54.a$a r0 = new w54.a$a
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f210475g
            java.lang.Object r0 = uq.b.e()
            int r1 = r6.f210477j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4c
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r9 = r6.f210473e
            y54.b r9 = (y54.LocalDocumentNotificationEntity) r9
            java.lang.Object r9 = r6.f210472d
            w54.a r9 = (w54.a) r9
            oq.u.b(r11)
            goto L92
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r6.f210473e
            r10 = r9
            y54.b r10 = (y54.LocalDocumentNotificationEntity) r10
            java.lang.Object r9 = r6.f210472d
            w54.a r9 = (w54.a) r9
            oq.u.b(r11)
        L4a:
            r1 = r9
            goto L5c
        L4c:
            oq.u.b(r11)
            r6.f210472d = r9
            r6.f210473e = r10
            r6.f210477j = r3
            java.lang.Object r11 = r9.h(r10, r6)
            if (r11 != r0) goto L4a
            goto L91
        L5c:
            java.lang.Number r11 = (java.lang.Number) r11
            long r3 = r11.longValue()
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 != 0) goto L95
            r9 = r2
            java.lang.String r2 = r10.getConfigId()
            r4 = r3
            java.time.LocalDate r3 = r10.getExpirationDate()
            r7 = r4
            java.time.LocalDate r4 = r10.getNotificationDate()
            r54.e r5 = r10.getStatus()
            java.lang.Object r11 = vq.j.a(r1)
            r6.f210472d = r11
            java.lang.Object r10 = vq.j.a(r10)
            r6.f210473e = r10
            r6.f210474f = r7
            r6.f210477j = r9
            java.lang.Object r9 = r1.i(r2, r3, r4, r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: w54.a.g(w54.a, y54.b, tq.e):java.lang.Object");
    }

    Object a(LocalDate localDate, tq.e<? super List<LocalDocumentNotificationEntity>> eVar);

    mu.g<List<LocalDocumentNotificationEntity>> b();

    Object c(String str, r54.e eVar, tq.e<? super i0> eVar2);

    Object d(tq.e<? super i0> eVar);

    Object e(String str, tq.e<? super i0> eVar);

    default Object f(LocalDocumentNotificationEntity localDocumentNotificationEntity, tq.e<? super i0> eVar) {
        return g(this, localDocumentNotificationEntity, eVar);
    }

    Object h(LocalDocumentNotificationEntity localDocumentNotificationEntity, tq.e<? super Long> eVar);

    Object i(String str, LocalDate localDate, LocalDate localDate2, r54.e eVar, tq.e<? super i0> eVar2);

    Object j(String str, tq.e<? super i0> eVar);
}
