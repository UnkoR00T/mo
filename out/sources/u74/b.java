package u74;

import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import y74.NotificationRegistrationData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu74/b;", "Lz74/a;", "Lcz/c;", "storageFactory", "<init>", "(Lcz/c;)V", "Ly74/a;", "c", "(Ltq/e;)Ljava/lang/Object;", "data", "Loq/i0;", "b", "(Ly74/a;Ltq/e;)Ljava/lang/Object;", "a", "Lcz/c;", "Lcz/b;", "Loq/k;", "e", "()Lcz/b;", "storage", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements z74.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f196232c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f196233d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f196234e = cz.b.a.b("STORAGE_NOTIFICATIONS_LANGUAGE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f196235f = cz.b.a.b("STORAGE_NOTIFICATIONS_APP_VERSION");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f196236g = cz.b.a.b("STORAGE_NOTIFICATIONS_TOKEN");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f196237h = cz.b.a.b("STORAGE_NOTIFICATIONS_KEY");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f196238i = cz.b.a.b("STORAGE_NOTIFICATIONS_SETTINGS_PERMISSION");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cz.c storageFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k storage = l.a(new er.a() { // from class: u74.a
        @Override // er.a
        public final Object a() {
            return b.f(this.f196231a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu74/b$a;", "", "<init>", "()V", "", "STORAGE_FILE_NAME", "Ljava/lang/String;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: u74.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5106b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f196241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f196242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f196243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f196244g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f196245h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f196246j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f196247k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f196249m;

        C5106b(tq.e<? super C5106b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f196247k = obj;
            this.f196249m |= PKIFailureInfo.systemUnavail;
            return b.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f196250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f196251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f196252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f196253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f196254h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f196255j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f196257l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f196255j = obj;
            this.f196257l |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    public b(cz.c cVar) {
        this.storageFactory = cVar;
    }

    private final cz.b e() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b f(b bVar) {
        return bVar.storageFactory.a("storage_push_notifications", cz.d.ENCRYPTED);
    }

    @Override // z74.a
    public Object a(tq.e<? super i0> eVar) {
        Object objA = e().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152 A[PHI: r2 r5 r13
      0x0152: PHI (r2v12 cz.b) = (r2v10 cz.b), (r2v13 cz.b) binds: [B:47:0x012c, B:52:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r5v5 y74.a) = (r5v3 y74.a), (r5v9 y74.a) binds: [B:47:0x012c, B:52:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0152: PHI (r13v9 int) = (r13v7 int), (r13v10 int) binds: [B:47:0x012c, B:52:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016f, code lost:
    
        if (r14 == r1) goto L55;
     */
    @Override // z74.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(y74.NotificationRegistrationData r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u74.b.b(y74.a, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z74.a
    public Object c(tq.e<? super NotificationRegistrationData> eVar) throws Throwable {
        C5106b c5106b;
        cz.b bVar;
        int i15;
        String str;
        String str2;
        Object objJ;
        String str3;
        String str4;
        Object objJ2;
        String str5;
        int i16;
        String str6;
        Object objH;
        String str7;
        String str8;
        String str9;
        String str10;
        if (eVar instanceof C5106b) {
            c5106b = (C5106b) eVar;
            int i17 = c5106b.f196249m;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                c5106b.f196249m = i17 - PKIFailureInfo.systemUnavail;
            } else {
                c5106b = new C5106b(eVar);
            }
        } else {
            c5106b = new C5106b(eVar);
        }
        Object obj = c5106b.f196247k;
        Object objE = uq.b.e();
        int i18 = c5106b.f196249m;
        if (i18 == 0) {
            u.b(obj);
            cz.b bVarE = e();
            String str11 = f196234e;
            c5106b.f196241d = bVarE;
            c5106b.f196246j = 0;
            c5106b.f196249m = 1;
            Object objJ3 = bVarE.j(str11, c5106b);
            if (objJ3 != objE) {
                bVar = bVarE;
                obj = objJ3;
                i15 = 0;
            }
            return objE;
        }
        if (i18 == 1) {
            i15 = c5106b.f196246j;
            bVar = (cz.b) c5106b.f196241d;
            u.b(obj);
        } else {
            if (i18 == 2) {
                i15 = c5106b.f196246j;
                str = (String) c5106b.f196242e;
                bVar = (cz.b) c5106b.f196241d;
                u.b(obj);
                str2 = (String) obj;
                String str12 = f196236g;
                c5106b.f196241d = bVar;
                c5106b.f196242e = str;
                c5106b.f196243f = str2;
                c5106b.f196246j = i15;
                c5106b.f196249m = 3;
                objJ = bVar.j(str12, c5106b);
                if (objJ != objE) {
                    str3 = str2;
                    obj = objJ;
                    str4 = (String) obj;
                    String str13 = f196237h;
                    c5106b.f196241d = bVar;
                    c5106b.f196242e = str;
                    c5106b.f196243f = str3;
                    c5106b.f196244g = str4;
                    c5106b.f196246j = i15;
                    c5106b.f196249m = 4;
                    objJ2 = bVar.j(str13, c5106b);
                    if (objJ2 != objE) {
                        int i19 = i15;
                        str5 = str4;
                        obj = objJ2;
                        i16 = i19;
                        str6 = (String) obj;
                        String str14 = f196238i;
                        c5106b.f196241d = j.a(bVar);
                        c5106b.f196242e = str;
                        c5106b.f196243f = str3;
                        c5106b.f196244g = str5;
                        c5106b.f196245h = str6;
                        c5106b.f196246j = i16;
                        c5106b.f196249m = 5;
                        objH = bVar.h(str14, false, c5106b);
                        if (objH != objE) {
                            str7 = str6;
                            obj = objH;
                            str8 = str5;
                            str9 = str3;
                            str10 = str;
                        }
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                i15 = c5106b.f196246j;
                str3 = (String) c5106b.f196243f;
                str = (String) c5106b.f196242e;
                bVar = (cz.b) c5106b.f196241d;
                u.b(obj);
                str4 = (String) obj;
                String str15 = f196237h;
                c5106b.f196241d = bVar;
                c5106b.f196242e = str;
                c5106b.f196243f = str3;
                c5106b.f196244g = str4;
                c5106b.f196246j = i15;
                c5106b.f196249m = 4;
                objJ2 = bVar.j(str15, c5106b);
                if (objJ2 != objE) {
                    int i110 = i15;
                    str5 = str4;
                    obj = objJ2;
                    i16 = i110;
                    str6 = (String) obj;
                    String str16 = f196238i;
                    c5106b.f196241d = j.a(bVar);
                    c5106b.f196242e = str;
                    c5106b.f196243f = str3;
                    c5106b.f196244g = str5;
                    c5106b.f196245h = str6;
                    c5106b.f196246j = i16;
                    c5106b.f196249m = 5;
                    objH = bVar.h(str16, false, c5106b);
                    if (objH != objE) {
                        str7 = str6;
                        obj = objH;
                        str8 = str5;
                        str9 = str3;
                        str10 = str;
                    }
                }
                return objE;
            }
            if (i18 == 4) {
                int i25 = c5106b.f196246j;
                String str17 = (String) c5106b.f196244g;
                str3 = (String) c5106b.f196243f;
                str = (String) c5106b.f196242e;
                bVar = (cz.b) c5106b.f196241d;
                u.b(obj);
                i16 = i25;
                str5 = str17;
                str6 = (String) obj;
                String str18 = f196238i;
                c5106b.f196241d = j.a(bVar);
                c5106b.f196242e = str;
                c5106b.f196243f = str3;
                c5106b.f196244g = str5;
                c5106b.f196245h = str6;
                c5106b.f196246j = i16;
                c5106b.f196249m = 5;
                objH = bVar.h(str18, false, c5106b);
                if (objH != objE) {
                    str7 = str6;
                    obj = objH;
                    str8 = str5;
                    str9 = str3;
                    str10 = str;
                }
                return objE;
            }
            if (i18 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str19 = (String) c5106b.f196245h;
            String str20 = (String) c5106b.f196244g;
            String str21 = (String) c5106b.f196243f;
            String str22 = (String) c5106b.f196242e;
            u.b(obj);
            str7 = str19;
            str10 = str22;
            str8 = str20;
            str9 = str21;
        }
        return new NotificationRegistrationData(str10, str9, str8, str7, ((Boolean) obj).booleanValue());
        String str23 = (String) obj;
        String str24 = f196235f;
        c5106b.f196241d = bVar;
        c5106b.f196242e = str23;
        c5106b.f196246j = i15;
        c5106b.f196249m = 2;
        Object objJ4 = bVar.j(str24, c5106b);
        if (objJ4 != objE) {
            str = str23;
            obj = objJ4;
            str2 = (String) obj;
            String str110 = f196236g;
            c5106b.f196241d = bVar;
            c5106b.f196242e = str;
            c5106b.f196243f = str2;
            c5106b.f196246j = i15;
            c5106b.f196249m = 3;
            objJ = bVar.j(str110, c5106b);
            if (objJ != objE) {
                str3 = str2;
                obj = objJ;
                str4 = (String) obj;
                String str111 = f196237h;
                c5106b.f196241d = bVar;
                c5106b.f196242e = str;
                c5106b.f196243f = str3;
                c5106b.f196244g = str4;
                c5106b.f196246j = i15;
                c5106b.f196249m = 4;
                objJ2 = bVar.j(str111, c5106b);
                if (objJ2 != objE) {
                    int i111 = i15;
                    str5 = str4;
                    obj = objJ2;
                    i16 = i111;
                    str6 = (String) obj;
                    String str112 = f196238i;
                    c5106b.f196241d = j.a(bVar);
                    c5106b.f196242e = str;
                    c5106b.f196243f = str3;
                    c5106b.f196244g = str5;
                    c5106b.f196245h = str6;
                    c5106b.f196246j = i16;
                    c5106b.f196249m = 5;
                    objH = bVar.h(str112, false, c5106b);
                    if (objH != objE) {
                        str7 = str6;
                        obj = objH;
                        str8 = str5;
                        str9 = str3;
                        str10 = str;
                        return new NotificationRegistrationData(str10, str9, str8, str7, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        return objE;
    }
}
