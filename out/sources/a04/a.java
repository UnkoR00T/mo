package a04;

import c04.c;
import c04.g;
import dx.i;
import er.p;
import ju.g1;
import ju.p0;
import k34.u;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"La04/a;", "", "Lc04/g;", "idCardCertShouldRenewInternalUC", "Lc04/c;", "certShouldAutoRenewUC", "Lwz3/b;", "certGenerateAndSaveNewUC", "Lzz3/a;", "authenticationContainersInteractor", "<init>", "(Lc04/g;Lc04/c;Lwz3/b;Lzz3/a;)V", "", "g", "(Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "f", "a", "Lc04/g;", "b", "Lc04/c;", "c", "Lwz3/b;", "d", "Lzz3/a;", "Lsu/a;", "e", "Lsu/a;", "mutex", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g idCardCertShouldRenewInternalUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c certShouldAutoRenewUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.b certGenerateAndSaveNewUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = su.g.b(false, 1, null);

    /* JADX INFO: renamed from: a04.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class C0009a extends k implements p<p0, e<? super i<? extends dx.b, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1159h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f1160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f1161k;

        /* JADX INFO: renamed from: a04.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0010a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1163a;

            static {
                int[] iArr = new int[u.values().length];
                try {
                    iArr[u.MOBYWATEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u.DIIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u.STUDENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1163a = iArr;
            }
        }

        C0009a(e<? super C0009a> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00bd A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:45:0x00df  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e0 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00e4 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00f6 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x00fa A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0107 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x010d A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0110 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x011d A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x0132 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0136 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:70:0x015e  */
        /* JADX WARN: Code duplicated, block: B:73:0x0165  */
        /* JADX WARN: Code duplicated, block: B:74:0x0166 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:9:0x001e, B:71:0x015f, B:74:0x0166, B:76:0x016a, B:80:0x0180, B:81:0x0185), top: B:92:0x001e }] */
        /* JADX WARN: Code duplicated, block: B:76:0x016a A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:9:0x001e, B:71:0x015f, B:74:0x0166, B:76:0x016a, B:80:0x0180, B:81:0x0185), top: B:92:0x001e }] */
        /* JADX WARN: Code duplicated, block: B:80:0x0180 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #1 {all -> 0x0023, blocks: (B:9:0x001e, B:71:0x015f, B:74:0x0166, B:76:0x016a, B:80:0x0180, B:81:0x0185), top: B:92:0x001e }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0186 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x018c A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:43:0x00d9, B:60:0x0118, B:62:0x011d, B:65:0x0132, B:67:0x0136, B:82:0x0186, B:83:0x018b, B:46:0x00e0, B:48:0x00e4, B:52:0x00fa, B:55:0x0107, B:56:0x010c, B:57:0x010d, B:59:0x0112, B:58:0x0110, B:84:0x018c, B:85:0x0191, B:21:0x0054, B:34:0x00a8, B:36:0x00b0, B:39:0x00bd), top: B:95:0x0054 }] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            int i15;
            su.a aVar3;
            Throwable th4;
            su.a aVar4;
            int i16;
            a aVar5;
            int i17;
            boolean zBooleanValue;
            Object objF;
            boolean z15;
            a aVar6;
            i right;
            int i18;
            rq0.b.d dVar;
            i right2;
            Object objE = uq.b.e();
            int i19 = this.f1161k;
            try {
                if (i19 == 0) {
                    oq.u.b(obj);
                    aVar = a.this.mutex;
                    aVar2 = a.this;
                    this.f1156e = aVar;
                    this.f1157f = aVar2;
                    this.f1158g = 0;
                    this.f1161k = 1;
                    if (aVar.h(null, this) != objE) {
                        i15 = 0;
                    }
                    return objE;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        int i25 = this.f1159h;
                        int i26 = this.f1158g;
                        a aVar7 = (a) this.f1157f;
                        aVar4 = (su.a) this.f1156e;
                        try {
                            oq.u.b(obj);
                            i17 = i25;
                            aVar5 = aVar7;
                            i16 = i26;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            if (!zBooleanValue) {
                                i.Right right3 = new i.Right(vq.b.a(false));
                                aVar4.r(null);
                                return right3;
                            }
                            zz3.a aVar8 = aVar5.authenticationContainersInteractor;
                            this.f1156e = aVar4;
                            this.f1157f = aVar5;
                            this.f1158g = i16;
                            this.f1159h = i17;
                            this.f1160j = zBooleanValue;
                            this.f1161k = 3;
                            objF = zz3.a.f(aVar8, false, this, 1, null);
                            if (objF == objE) {
                                a aVar9 = aVar5;
                                z15 = zBooleanValue;
                                obj = objF;
                                aVar6 = aVar9;
                                right = (i) obj;
                                if (!(right instanceof i.Left)) {
                                    if (!(right instanceof i.Right)) {
                                        throw new oq.p();
                                    }
                                    i18 = C0010a.f1163a[((u) ((i.Right) right).b()).ordinal()];
                                    if (i18 == 1) {
                                        dVar = rq0.b.d.ID_CARD;
                                    } else {
                                        if (i18 != 2) {
                                            if (i18 != 3) {
                                                throw new oq.p();
                                            }
                                            i.Right right4 = new i.Right(vq.b.a(false));
                                            aVar4.r(null);
                                            return right4;
                                        }
                                        dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                    }
                                    right = new i.Right(dVar);
                                }
                                if (right instanceof i.Left) {
                                    i.Right right5 = new i.Right(vq.b.a(false));
                                    aVar4.r(null);
                                    return right5;
                                }
                                if (!(right instanceof i.Right)) {
                                    throw new oq.p();
                                }
                                rq0.b.d dVar2 = (rq0.b.d) ((i.Right) right).b();
                                wz3.b bVar = aVar6.certGenerateAndSaveNewUC;
                                wz3.b.Params params = new wz3.b.Params(dVar2);
                                this.f1156e = aVar4;
                                this.f1157f = j.a(dVar2);
                                this.f1158g = i16;
                                this.f1159h = i17;
                                this.f1160j = z15;
                                this.f1161k = 4;
                                obj = bVar.c(params, this);
                                if (obj != objE) {
                                    aVar3 = aVar4;
                                    right2 = (i) obj;
                                    if (!(right2 instanceof i.Left)) {
                                        if (right2 instanceof i.Right) {
                                            throw new oq.p();
                                        }
                                        right2 = new i.Right(vq.b.a(true));
                                    }
                                    aVar3.r(null);
                                    return right2;
                                }
                            }
                            return objE;
                        } catch (Throwable th5) {
                            th4 = th5;
                            aVar3 = aVar4;
                        }
                    } else if (i19 == 3) {
                        z15 = this.f1160j;
                        i17 = this.f1159h;
                        i16 = this.f1158g;
                        a aVar10 = (a) this.f1157f;
                        su.a aVar11 = (su.a) this.f1156e;
                        try {
                            oq.u.b(obj);
                            aVar6 = aVar10;
                            aVar4 = aVar11;
                            right = (i) obj;
                            if (!(right instanceof i.Left)) {
                                if (!(right instanceof i.Right)) {
                                    throw new oq.p();
                                }
                                i18 = C0010a.f1163a[((u) ((i.Right) right).b()).ordinal()];
                                if (i18 == 1) {
                                    dVar = rq0.b.d.ID_CARD;
                                } else {
                                    if (i18 != 2) {
                                        if (i18 != 3) {
                                            throw new oq.p();
                                        }
                                        i.Right right6 = new i.Right(vq.b.a(false));
                                        aVar4.r(null);
                                        return right6;
                                    }
                                    dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                                }
                                right = new i.Right(dVar);
                            }
                            if (right instanceof i.Left) {
                                i.Right right7 = new i.Right(vq.b.a(false));
                                aVar4.r(null);
                                return right7;
                            }
                            if (!(right instanceof i.Right)) {
                                throw new oq.p();
                            }
                            rq0.b.d dVar3 = (rq0.b.d) ((i.Right) right).b();
                            wz3.b bVar2 = aVar6.certGenerateAndSaveNewUC;
                            wz3.b.Params params2 = new wz3.b.Params(dVar3);
                            this.f1156e = aVar4;
                            this.f1157f = j.a(dVar3);
                            this.f1158g = i16;
                            this.f1159h = i17;
                            this.f1160j = z15;
                            this.f1161k = 4;
                            obj = bVar2.c(params2, this);
                            if (obj != objE) {
                                aVar3 = aVar4;
                                right2 = (i) obj;
                                if (!(right2 instanceof i.Left)) {
                                    if (right2 instanceof i.Right) {
                                        throw new oq.p();
                                    }
                                    right2 = new i.Right(vq.b.a(true));
                                }
                                aVar3.r(null);
                                return right2;
                            }
                            return objE;
                        } catch (Throwable th6) {
                            th4 = th6;
                            aVar3 = aVar11;
                        }
                    } else {
                        if (i19 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (su.a) this.f1156e;
                        try {
                            oq.u.b(obj);
                            right2 = (i) obj;
                            if (!(right2 instanceof i.Left)) {
                                if (right2 instanceof i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new i.Right(vq.b.a(true));
                            }
                            aVar3.r(null);
                            return right2;
                        } catch (Throwable th7) {
                            th4 = th7;
                        }
                    }
                    aVar3.r(null);
                    throw th4;
                }
                i15 = this.f1158g;
                aVar2 = (a) this.f1157f;
                su.a aVar12 = (su.a) this.f1156e;
                oq.u.b(obj);
                aVar = aVar12;
                c cVar = aVar2.certShouldAutoRenewUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f1156e = aVar;
                this.f1157f = aVar2;
                this.f1158g = i15;
                this.f1159h = 0;
                this.f1161k = 2;
                Object objA = cVar.a(c1792a, this);
                if (objA != objE) {
                    aVar4 = aVar;
                    obj = objA;
                    i16 = i15;
                    aVar5 = aVar2;
                    i17 = 0;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        i.Right right8 = new i.Right(vq.b.a(false));
                        aVar4.r(null);
                        return right8;
                    }
                    zz3.a aVar13 = aVar5.authenticationContainersInteractor;
                    this.f1156e = aVar4;
                    this.f1157f = aVar5;
                    this.f1158g = i16;
                    this.f1159h = i17;
                    this.f1160j = zBooleanValue;
                    this.f1161k = 3;
                    objF = zz3.a.f(aVar13, false, this, 1, null);
                    if (objF == objE) {
                        a aVar14 = aVar5;
                        z15 = zBooleanValue;
                        obj = objF;
                        aVar6 = aVar14;
                        right = (i) obj;
                        if (!(right instanceof i.Left)) {
                            if (!(right instanceof i.Right)) {
                                throw new oq.p();
                            }
                            i18 = C0010a.f1163a[((u) ((i.Right) right).b()).ordinal()];
                            if (i18 == 1) {
                                dVar = rq0.b.d.ID_CARD;
                            } else {
                                if (i18 != 2) {
                                    if (i18 != 3) {
                                        throw new oq.p();
                                    }
                                    i.Right right9 = new i.Right(vq.b.a(false));
                                    aVar4.r(null);
                                    return right9;
                                }
                                dVar = rq0.b.d.DIIA_REFUGEE_CARD;
                            }
                            right = new i.Right(dVar);
                        }
                        if (right instanceof i.Left) {
                            i.Right right10 = new i.Right(vq.b.a(false));
                            aVar4.r(null);
                            return right10;
                        }
                        if (!(right instanceof i.Right)) {
                            throw new oq.p();
                        }
                        rq0.b.d dVar4 = (rq0.b.d) ((i.Right) right).b();
                        wz3.b bVar3 = aVar6.certGenerateAndSaveNewUC;
                        wz3.b.Params params3 = new wz3.b.Params(dVar4);
                        this.f1156e = aVar4;
                        this.f1157f = j.a(dVar4);
                        this.f1158g = i16;
                        this.f1159h = i17;
                        this.f1160j = z15;
                        this.f1161k = 4;
                        obj = bVar3.c(params3, this);
                        if (obj != objE) {
                            aVar3 = aVar4;
                            right2 = (i) obj;
                            if (!(right2 instanceof i.Left)) {
                                if (right2 instanceof i.Right) {
                                    throw new oq.p();
                                }
                                right2 = new i.Right(vq.b.a(true));
                            }
                            aVar3.r(null);
                            return right2;
                        }
                    }
                }
                return objE;
            } catch (Throwable th8) {
                aVar3 = aVar;
                th4 = th8;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i<? extends dx.b, Boolean>> eVar) {
            return ((C0009a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return a.this.new C0009a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1166g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1167h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f1168j;

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            a aVar2;
            int i15;
            su.a aVar3;
            Throwable th4;
            Object objE = uq.b.e();
            int i16 = this.f1168j;
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    aVar = a.this.mutex;
                    a aVar4 = a.this;
                    this.f1164e = aVar;
                    this.f1165f = aVar4;
                    this.f1166g = 0;
                    this.f1168j = 1;
                    if (aVar.h(null, this) != objE) {
                        aVar2 = aVar4;
                        i15 = 0;
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (su.a) this.f1164e;
                    try {
                        oq.u.b(obj);
                        Boolean boolA = vq.b.a(((Boolean) obj).booleanValue());
                        aVar3.r(null);
                        return boolA;
                    } catch (Throwable th5) {
                        th4 = th5;
                        aVar3.r(null);
                        throw th4;
                    }
                }
                i15 = this.f1166g;
                aVar2 = (a) this.f1165f;
                su.a aVar5 = (su.a) this.f1164e;
                oq.u.b(obj);
                aVar = aVar5;
                g gVar = aVar2.idCardCertShouldRenewInternalUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f1164e = aVar;
                this.f1165f = null;
                this.f1166g = i15;
                this.f1167h = 0;
                this.f1168j = 2;
                Object objA = gVar.a(c1792a, this);
                if (objA != objE) {
                    aVar3 = aVar;
                    obj = objA;
                    Boolean boolA2 = vq.b.a(((Boolean) obj).booleanValue());
                    aVar3.r(null);
                    return boolA2;
                }
                return objE;
            } catch (Throwable th6) {
                aVar3 = aVar;
                th4 = th6;
                aVar3.r(null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super Boolean> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return a.this.new b(eVar);
        }
    }

    public a(g gVar, c cVar, wz3.b bVar, zz3.a aVar) {
        this.idCardCertShouldRenewInternalUC = gVar;
        this.certShouldAutoRenewUC = cVar;
        this.certGenerateAndSaveNewUC = bVar;
        this.authenticationContainersInteractor = aVar;
    }

    public final Object f(e<? super i<? extends dx.b, Boolean>> eVar) {
        return ju.i.g(g1.b(), new C0009a(null), eVar);
    }

    public final Object g(e<? super Boolean> eVar) {
        return ju.i.g(g1.b(), new b(null), eVar);
    }
}
